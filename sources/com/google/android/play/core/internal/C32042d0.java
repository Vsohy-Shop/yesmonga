package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.internal.d0 */
public final class C32042d0 implements C32034b1 {

    /* renamed from: a */
    public final ByteBuffer f78251a;

    public C32042d0(ByteBuffer byteBuffer) {
        this.f78251a = byteBuffer.slice();
    }

    /* renamed from: a */
    public final long mo92731a() {
        return (long) this.f78251a.capacity();
    }

    /* renamed from: b */
    public final void mo92732b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f78251a) {
            int i2 = (int) j;
            this.f78251a.position(i2);
            this.f78251a.limit(i2 + i);
            slice = this.f78251a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }
}
