package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@C40473a
@C40858y
@Deprecated
/* renamed from: com.google.android.gms.common.util.q */
public final class C40991q {
    @C40473a
    /* renamed from: a */
    public static void m166663a(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @C40473a
    /* renamed from: b */
    public static void m166664b(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @C40473a
    @Deprecated
    /* renamed from: c */
    public static long m166665c(@C0359n0 InputStream inputStream, @C0359n0 OutputStream outputStream) throws IOException {
        return m166666d(inputStream, outputStream, false, 1024);
    }

    @C40473a
    @Deprecated
    /* renamed from: d */
    public static long m166666d(@C0359n0 InputStream inputStream, @C0359n0 OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m166664b(inputStream);
                    m166664b(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m166664b(inputStream);
            m166664b(outputStream);
        }
        return j;
    }

    @C40473a
    /* renamed from: e */
    public static boolean m166667e(@C0359n0 byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: f */
    public static byte[] m166668f(@C0359n0 InputStream inputStream) throws IOException {
        return m166669g(inputStream, true);
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: g */
    public static byte[] m166669g(@C0359n0 InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m166666d(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }

    @C40473a
    @C0359n0
    @Deprecated
    /* renamed from: h */
    public static byte[] m166670h(@C0359n0 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C40843u.m166202l(inputStream);
        C40843u.m166202l(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
