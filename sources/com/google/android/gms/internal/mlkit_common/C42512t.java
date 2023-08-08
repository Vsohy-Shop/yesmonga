package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.C0359n0;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.mlkit_common.t */
public final class C42512t extends OutputStream {

    /* renamed from: a */
    public long f107358a = 0;

    /* renamed from: a */
    public final long mo137798a() {
        return this.f107358a;
    }

    public final void write(int i) {
        this.f107358a++;
    }

    public final void write(byte[] bArr) {
        this.f107358a += (long) bArr.length;
    }

    public final void write(@C0359n0 byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f107358a += (long) i2;
    }
}
