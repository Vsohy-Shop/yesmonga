package com.bumptech.glide.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.util.l */
public class C22632l {

    /* renamed from: a */
    public Class<?> f58026a;

    /* renamed from: b */
    public Class<?> f58027b;

    /* renamed from: c */
    public Class<?> f58028c;

    public C22632l() {
    }

    /* renamed from: a */
    public void mo67007a(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2) {
        mo67008b(cls, cls2, (Class<?>) null);
    }

    /* renamed from: b */
    public void mo67008b(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2, @C0363p0 Class<?> cls3) {
        this.f58026a = cls;
        this.f58027b = cls2;
        this.f58028c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C22632l lVar = (C22632l) obj;
        if (this.f58026a.equals(lVar.f58026a) && this.f58027b.equals(lVar.f58027b) && C22635o.m102629d(this.f58028c, lVar.f58028c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f58026a.hashCode() * 31) + this.f58027b.hashCode()) * 31;
        Class<?> cls = this.f58028c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f58026a + ", second=" + this.f58027b + C12361b.f30259j;
    }

    public C22632l(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2) {
        mo67007a(cls, cls2);
    }

    public C22632l(@C0359n0 Class<?> cls, @C0359n0 Class<?> cls2, @C0363p0 Class<?> cls3) {
        mo67008b(cls, cls2, cls3);
    }
}
