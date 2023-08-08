package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.util.C22633m;
import java.security.MessageDigest;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.l */
public class C22254l implements C22108c {

    /* renamed from: c */
    public final Object f57189c;

    /* renamed from: d */
    public final int f57190d;

    /* renamed from: e */
    public final int f57191e;

    /* renamed from: f */
    public final Class<?> f57192f;

    /* renamed from: g */
    public final Class<?> f57193g;

    /* renamed from: h */
    public final C22108c f57194h;

    /* renamed from: i */
    public final Map<Class<?>, C22280i<?>> f57195i;

    /* renamed from: j */
    public final C22277f f57196j;

    /* renamed from: k */
    public int f57197k;

    public C22254l(Object obj, C22108c cVar, int i, int i2, Map<Class<?>, C22280i<?>> map, Class<?> cls, Class<?> cls2, C22277f fVar) {
        this.f57189c = C22633m.m102624d(obj);
        this.f57194h = (C22108c) C22633m.m102625e(cVar, "Signature must not be null");
        this.f57190d = i;
        this.f57191e = i2;
        this.f57195i = (Map) C22633m.m102624d(map);
        this.f57192f = (Class) C22633m.m102625e(cls, "Resource class must not be null");
        this.f57193g = (Class) C22633m.m102625e(cls2, "Transcode class must not be null");
        this.f57196j = (C22277f) C22633m.m102624d(fVar);
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22254l)) {
            return false;
        }
        C22254l lVar = (C22254l) obj;
        if (!this.f57189c.equals(lVar.f57189c) || !this.f57194h.equals(lVar.f57194h) || this.f57191e != lVar.f57191e || this.f57190d != lVar.f57190d || !this.f57195i.equals(lVar.f57195i) || !this.f57192f.equals(lVar.f57192f) || !this.f57193g.equals(lVar.f57193g) || !this.f57196j.equals(lVar.f57196j)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f57197k == 0) {
            int hashCode = this.f57189c.hashCode();
            this.f57197k = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f57194h.hashCode()) * 31) + this.f57190d) * 31) + this.f57191e;
            this.f57197k = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f57195i.hashCode();
            this.f57197k = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f57192f.hashCode();
            this.f57197k = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f57193g.hashCode();
            this.f57197k = hashCode5;
            this.f57197k = (hashCode5 * 31) + this.f57196j.hashCode();
        }
        return this.f57197k;
    }

    public String toString() {
        return "EngineKey{model=" + this.f57189c + ", width=" + this.f57190d + ", height=" + this.f57191e + ", resourceClass=" + this.f57192f + ", transcodeClass=" + this.f57193g + ", signature=" + this.f57194h + ", hashCode=" + this.f57197k + ", transformations=" + this.f57195i + ", options=" + this.f57196j + C12361b.f30259j;
    }
}
