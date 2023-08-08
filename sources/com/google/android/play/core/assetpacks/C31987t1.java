package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Base64;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.google.android.play.core.assetpacks.model.C31958b;
import com.google.android.play.core.internal.C32028a0;
import com.google.android.play.core.internal.C32029a1;
import com.google.android.play.core.splitcompat.C32150r;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipException;
import org.joda.time.DateTimeFieldType;

/* renamed from: com.google.android.play.core.assetpacks.t1 */
public final class C31987t1 {

    /* renamed from: a */
    public static C31925g f78116a;

    /* renamed from: a */
    public static String m129666a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    C32029a1.m129765a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    @Nullable
    /* renamed from: b */
    public static C31894a m129667b(String str, String str2) throws IOException {
        Long l;
        String str3 = str;
        String str4 = str2;
        C32028a0.m129763c(str3 != null, "Attempted to get file location from a null apk path.");
        C32028a0.m129763c(str4 != null, String.format("Attempted to get file location in apk %s with a null file path.", new Object[]{str3}));
        RandomAccessFile randomAccessFile = new RandomAccessFile(str3, C28515a1.f68703k);
        byte[] bArr = new byte[22];
        randomAccessFile.seek(randomAccessFile.length() - 22);
        randomAccessFile.readFully(bArr);
        C31946k0 k = m129668c(bArr, 0) == 1347093766 ? m129676k(bArr) : null;
        byte b = 5;
        if (k == null) {
            long length = randomAccessFile.length() - 22;
            long j = -65536 + length;
            if (j < 0) {
                j = 0;
            }
            int min = (int) Math.min(1024, randomAccessFile.length());
            byte[] bArr2 = new byte[min];
            byte[] bArr3 = new byte[22];
            loop0:
            while (true) {
                long max = Math.max(3 + (length - ((long) min)), j);
                randomAccessFile.seek(max);
                randomAccessFile.readFully(bArr2);
                for (int i = min - 4; i >= 0; i -= 4) {
                    byte b2 = bArr2[i];
                    int i2 = b2 != b ? b2 != 6 ? b2 != 75 ? b2 != 80 ? -1 : 0 : 1 : 3 : 2;
                    if (i2 >= 0 && i >= i2 && m129668c(bArr2, i - i2) == 1347093766) {
                        randomAccessFile.seek((max + ((long) i)) - ((long) i2));
                        randomAccessFile.readFully(bArr3);
                        k = m129676k(bArr3);
                        break loop0;
                    }
                    b = 5;
                }
                if (max != j) {
                    length = max;
                } else {
                    throw new ZipException(String.format("End Of Central Directory signature not found in APK %s", new Object[]{str3}));
                }
            }
        }
        long j2 = k.f77943a;
        byte[] bytes = str4.getBytes("UTF-8");
        byte[] bArr4 = new byte[46];
        byte[] bArr5 = new byte[str2.length()];
        int i3 = 0;
        while (true) {
            if (i3 >= k.f77944b) {
                l = null;
                break;
            }
            randomAccessFile.seek(j2);
            randomAccessFile.readFully(bArr4);
            int c = m129668c(bArr4, 0);
            if (c == 1347092738) {
                randomAccessFile.seek(j2 + 28);
                int e = m129670e(bArr4, 28);
                if (e == str2.length()) {
                    randomAccessFile.seek(46 + j2);
                    randomAccessFile.read(bArr5);
                    if (Arrays.equals(bArr5, bytes)) {
                        l = Long.valueOf(m129669d(bArr4, 42));
                        break;
                    }
                }
                j2 += (long) (e + 46 + m129670e(bArr4, 30) + m129670e(bArr4, 32));
                i3++;
            } else {
                throw new ZipException(String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", new Object[]{str4, str3, Integer.valueOf(i3), Integer.valueOf(k.f77944b), Integer.valueOf(c), 1347092738}));
            }
        }
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        byte[] bArr6 = new byte[8];
        randomAccessFile.seek(22 + longValue);
        randomAccessFile.readFully(bArr6);
        return C31894a.m129392a(str3, longValue + 30 + ((long) m129670e(bArr6, 4)) + ((long) m129670e(bArr6, 6)), m129669d(bArr6, 0));
    }

    /* renamed from: c */
    public static int m129668c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << DateTimeFieldType.f30603E0) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: d */
    public static long m129669d(byte[] bArr, int i) {
        return ((long) ((m129670e(bArr, i + 2) << 16) | m129670e(bArr, i))) & 4294967295L;
    }

    /* renamed from: e */
    public static int m129670e(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: f */
    public static boolean m129671f(@C31958b int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: g */
    public static boolean m129672g(@C31958b int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: h */
    public static boolean m129673h(@C31958b int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: i */
    public static boolean m129674i(@C31958b int i, @C31958b int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: j */
    public static synchronized C31925g m129675j(Context context) {
        C31925g gVar;
        synchronized (C31987t1.class) {
            if (f78116a == null) {
                C31970p0 p0Var = new C31970p0((byte[]) null);
                p0Var.mo92662b(new C31996v2(C32150r.m130103c(context)));
                f78116a = p0Var.mo92661a();
            }
            gVar = f78116a;
        }
        return gVar;
    }

    /* renamed from: k */
    public static C31946k0 m129676k(byte[] bArr) {
        int e = m129670e(bArr, 10);
        m129669d(bArr, 12);
        return new C31946k0(m129669d(bArr, 16), e);
    }
}
