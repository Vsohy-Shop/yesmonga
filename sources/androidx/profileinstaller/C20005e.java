package androidx.profileinstaller;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

@C0376v0(19)
/* renamed from: androidx.profileinstaller.e */
public class C20005e {

    /* renamed from: a */
    public static final int f51208a = 8;

    /* renamed from: b */
    public static final int f51209b = 1;

    /* renamed from: c */
    public static final int f51210c = 2;

    /* renamed from: d */
    public static final int f51211d = 4;

    /* renamed from: a */
    public static int m92972a(int i) {
        return (((i + 8) - 1) & -8) / 8;
    }

    /* renamed from: b */
    public static byte[] m92973b(@C0359n0 byte[] bArr) throws IOException {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    @C0359n0
    /* renamed from: c */
    public static RuntimeException m92974c(@C0363p0 String str) {
        return new IllegalStateException(str);
    }

    @C0359n0
    /* renamed from: d */
    public static byte[] m92975d(@C0359n0 InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw m92974c("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    @C0359n0
    /* renamed from: e */
    public static byte[] m92976e(@C0359n0 InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw m92974c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw m92974c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw m92974c("Inflater did not finish");
            }
        } catch (DataFormatException e) {
            throw m92974c(e.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    @C0359n0
    /* renamed from: f */
    public static String m92977f(InputStream inputStream, int i) throws IOException {
        return new String(m92975d(inputStream, i), StandardCharsets.UTF_8);
    }

    /* renamed from: g */
    public static long m92978g(@C0359n0 InputStream inputStream, int i) throws IOException {
        byte[] d = m92975d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (d[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: h */
    public static int m92979h(@C0359n0 InputStream inputStream) throws IOException {
        return (int) m92978g(inputStream, 2);
    }

    /* renamed from: i */
    public static long m92980i(@C0359n0 InputStream inputStream) throws IOException {
        return m92978g(inputStream, 4);
    }

    /* renamed from: j */
    public static int m92981j(@C0359n0 InputStream inputStream) throws IOException {
        return (int) m92978g(inputStream, 1);
    }

    /* renamed from: k */
    public static int m92982k(@C0359n0 String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* renamed from: l */
    public static void m92983l(@C0359n0 InputStream inputStream, @C0359n0 OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    public static void m92984m(@C0359n0 OutputStream outputStream, byte[] bArr) throws IOException {
        m92988q(outputStream, (long) bArr.length);
        byte[] b = m92973b(bArr);
        m92988q(outputStream, (long) b.length);
        outputStream.write(b);
    }

    /* renamed from: n */
    public static void m92985n(@C0359n0 OutputStream outputStream, @C0359n0 String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: o */
    public static void m92986o(@C0359n0 OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    /* renamed from: p */
    public static void m92987p(@C0359n0 OutputStream outputStream, int i) throws IOException {
        m92986o(outputStream, (long) i, 2);
    }

    /* renamed from: q */
    public static void m92988q(@C0359n0 OutputStream outputStream, long j) throws IOException {
        m92986o(outputStream, j, 4);
    }

    /* renamed from: r */
    public static void m92989r(@C0359n0 OutputStream outputStream, int i) throws IOException {
        m92986o(outputStream, (long) i, 1);
    }
}
