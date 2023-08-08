package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.c */
public final class C22184c implements C22108c {

    /* renamed from: c */
    public final C22108c f57003c;

    /* renamed from: d */
    public final C22108c f57004d;

    public C22184c(C22108c cVar, C22108c cVar2) {
        this.f57003c = cVar;
        this.f57004d = cVar2;
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        this.f57003c.mo65773b(messageDigest);
        this.f57004d.mo65773b(messageDigest);
    }

    /* renamed from: c */
    public C22108c mo66020c() {
        return this.f57003c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22184c)) {
            return false;
        }
        C22184c cVar = (C22184c) obj;
        if (!this.f57003c.equals(cVar.f57003c) || !this.f57004d.equals(cVar.f57004d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f57003c.hashCode() * 31) + this.f57004d.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f57003c + ", signature=" + this.f57004d + C12361b.f30259j;
    }
}
