package com.bumptech.glide.signature;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.util.C22633m;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.signature.e */
public final class C22613e implements C22108c {

    /* renamed from: c */
    public final Object f57991c;

    public C22613e(@C0359n0 Object obj) {
        this.f57991c = C22633m.m102624d(obj);
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(this.f57991c.toString().getBytes(C22108c.f56791b));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22613e) {
            return this.f57991c.equals(((C22613e) obj).f57991c);
        }
        return false;
    }

    public int hashCode() {
        return this.f57991c.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f57991c + C12361b.f30259j;
    }
}
