package com.bumptech.glide.load;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1866a;
import com.bumptech.glide.util.C22617b;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.f */
public final class C22277f implements C22108c {

    /* renamed from: c */
    public final C1866a<C22139e<?>, Object> f57279c = new C22617b();

    /* renamed from: f */
    public static <T> void m101340f(@C0359n0 C22139e<T> eVar, @C0359n0 Object obj, @C0359n0 MessageDigest messageDigest) {
        eVar.mo65842h(obj, messageDigest);
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        for (int i = 0; i < this.f57279c.size(); i++) {
            m101340f(this.f57279c.mo6334j(i), this.f57279c.mo6338o(i), messageDigest);
        }
    }

    @C0363p0
    /* renamed from: c */
    public <T> T mo66232c(@C0359n0 C22139e<T> eVar) {
        return this.f57279c.containsKey(eVar) ? this.f57279c.get(eVar) : eVar.mo65839d();
    }

    /* renamed from: d */
    public void mo66233d(@C0359n0 C22277f fVar) {
        this.f57279c.mo6335l(fVar.f57279c);
    }

    @C0359n0
    /* renamed from: e */
    public <T> C22277f mo66234e(@C0359n0 C22139e<T> eVar, @C0359n0 T t) {
        this.f57279c.put(eVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22277f) {
            return this.f57279c.equals(((C22277f) obj).f57279c);
        }
        return false;
    }

    public int hashCode() {
        return this.f57279c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f57279c + C12361b.f30259j;
    }
}
