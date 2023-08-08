package com.google.android.play.core.assetpacks;

import android.support.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: com.google.android.play.core.assetpacks.u1 */
public final class C31991u1 extends InputStream {

    /* renamed from: a */
    public final Enumeration<File> f78137a;
    @Nullable

    /* renamed from: b */
    public InputStream f78138b;

    public C31991u1(Enumeration<File> enumeration) throws IOException {
        this.f78137a = enumeration;
        mo92686a();
    }

    /* renamed from: a */
    public final void mo92686a() throws IOException {
        InputStream inputStream = this.f78138b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f78138b = this.f78137a.hasMoreElements() ? new FileInputStream(this.f78137a.nextElement()) : null;
    }

    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f78138b;
        if (inputStream != null) {
            inputStream.close();
            this.f78138b = null;
        }
    }

    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f78138b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo92686a();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f78138b == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f78138b.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo92686a();
            } while (this.f78138b != null);
            return -1;
        }
    }
}
