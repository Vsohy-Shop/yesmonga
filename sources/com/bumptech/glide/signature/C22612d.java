package com.bumptech.glide.signature;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.signature.d */
public class C22612d implements C22108c {
    @C0359n0

    /* renamed from: c */
    public final String f57988c;

    /* renamed from: d */
    public final long f57989d;

    /* renamed from: e */
    public final int f57990e;

    public C22612d(@C0363p0 String str, long j, int i) {
        this.f57988c = str == null ? "" : str;
        this.f57989d = j;
        this.f57990e = i;
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f57989d).putInt(this.f57990e).array());
        messageDigest.update(this.f57988c.getBytes(C22108c.f56791b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C22612d dVar = (C22612d) obj;
        if (this.f57989d == dVar.f57989d && this.f57990e == dVar.f57990e && this.f57988c.equals(dVar.f57988c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f57989d;
        return (((this.f57988c.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f57990e;
    }
}
