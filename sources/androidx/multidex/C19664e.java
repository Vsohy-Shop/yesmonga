package androidx.multidex;

import android.support.p002v4.media.session.PlaybackStateCompat;
import com.carrefour.fid.android.shared.constant.C28515a1;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: androidx.multidex.e */
public final class C19664e {

    /* renamed from: a */
    public static final int f50318a = 22;

    /* renamed from: b */
    public static final int f50319b = 101010256;

    /* renamed from: c */
    public static final int f50320c = 16384;

    /* renamed from: androidx.multidex.e$a */
    public static class C19665a {

        /* renamed from: a */
        public long f50321a;

        /* renamed from: b */
        public long f50322b;
    }

    /* renamed from: a */
    public static long m91317a(RandomAccessFile randomAccessFile, C19665a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = aVar.f50322b;
        randomAccessFile.seek(aVar.f50321a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    public static C19665a m91318b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - PlaybackStateCompat.f476R0;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(f50319b);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C19665a aVar = new C19665a();
                    aVar.f50322b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f50321a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: c */
    public static long m91319c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, C28515a1.f68703k);
        try {
            return m91317a(randomAccessFile, m91318b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
