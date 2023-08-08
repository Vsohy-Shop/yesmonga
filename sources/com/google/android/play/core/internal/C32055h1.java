package com.google.android.play.core.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.play.core.internal.h1 */
public final class C32055h1 implements C32034b1 {

    /* renamed from: a */
    public final FileChannel f78261a;

    /* renamed from: b */
    public final long f78262b;

    /* renamed from: c */
    public final long f78263c;

    public C32055h1(FileChannel fileChannel, long j, long j2) {
        this.f78261a = fileChannel;
        this.f78262b = j;
        this.f78263c = j2;
    }

    /* renamed from: a */
    public final long mo92731a() {
        return this.f78263c;
    }

    /* renamed from: b */
    public final void mo92732b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f78261a.map(FileChannel.MapMode.READ_ONLY, this.f78262b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }
}
