package com.google.firebase.encoders.proto;

import androidx.annotation.C0359n0;
import java.io.OutputStream;

/* renamed from: com.google.firebase.encoders.proto.b */
public final class C33020b extends OutputStream {

    /* renamed from: a */
    public long f80120a = 0;

    /* renamed from: a */
    public long mo95673a() {
        return this.f80120a;
    }

    public void write(int i) {
        this.f80120a++;
    }

    public void write(byte[] bArr) {
        this.f80120a += (long) bArr.length;
    }

    public void write(@C0359n0 byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f80120a += (long) i2;
    }
}
