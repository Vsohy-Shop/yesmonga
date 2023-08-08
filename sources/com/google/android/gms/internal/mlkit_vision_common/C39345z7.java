package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.C0359n0;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.z7 */
public final class C39345z7 extends OutputStream {

    /* renamed from: a */
    public long f100453a = 0;

    /* renamed from: a */
    public final long mo123369a() {
        return this.f100453a;
    }

    public final void write(int i) {
        this.f100453a++;
    }

    public final void write(byte[] bArr) {
        this.f100453a += (long) bArr.length;
    }

    public final void write(@C0359n0 byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f100453a += (long) i2;
    }
}
