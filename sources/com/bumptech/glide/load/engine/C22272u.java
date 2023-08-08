package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.util.C22629j;
import com.bumptech.glide.util.C22635o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.bumptech.glide.load.engine.u */
public final class C22272u implements C22108c {

    /* renamed from: k */
    public static final C22629j<Class<?>, byte[]> f57257k = new C22629j<>(50);

    /* renamed from: c */
    public final C22157b f57258c;

    /* renamed from: d */
    public final C22108c f57259d;

    /* renamed from: e */
    public final C22108c f57260e;

    /* renamed from: f */
    public final int f57261f;

    /* renamed from: g */
    public final int f57262g;

    /* renamed from: h */
    public final Class<?> f57263h;

    /* renamed from: i */
    public final C22277f f57264i;

    /* renamed from: j */
    public final C22280i<?> f57265j;

    public C22272u(C22157b bVar, C22108c cVar, C22108c cVar2, int i, int i2, C22280i<?> iVar, Class<?> cls, C22277f fVar) {
        this.f57258c = bVar;
        this.f57259d = cVar;
        this.f57260e = cVar2;
        this.f57261f = i;
        this.f57262g = i2;
        this.f57265j = iVar;
        this.f57263h = cls;
        this.f57264i = fVar;
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f57258c.mo65933d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f57261f).putInt(this.f57262g).array();
        this.f57260e.mo65773b(messageDigest);
        this.f57259d.mo65773b(messageDigest);
        messageDigest.update(bArr);
        C22280i<?> iVar = this.f57265j;
        if (iVar != null) {
            iVar.mo65773b(messageDigest);
        }
        this.f57264i.mo65773b(messageDigest);
        messageDigest.update(mo66222c());
        this.f57258c.mo65934e(bArr);
    }

    /* renamed from: c */
    public final byte[] mo66222c() {
        C22629j<Class<?>, byte[]> jVar = f57257k;
        byte[] k = jVar.mo66994k(this.f57263h);
        if (k != null) {
            return k;
        }
        byte[] bytes = this.f57263h.getName().getBytes(C22108c.f56791b);
        jVar.mo66996o(this.f57263h, bytes);
        return bytes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22272u)) {
            return false;
        }
        C22272u uVar = (C22272u) obj;
        if (this.f57262g != uVar.f57262g || this.f57261f != uVar.f57261f || !C22635o.m102629d(this.f57265j, uVar.f57265j) || !this.f57263h.equals(uVar.f57263h) || !this.f57259d.equals(uVar.f57259d) || !this.f57260e.equals(uVar.f57260e) || !this.f57264i.equals(uVar.f57264i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f57259d.hashCode() * 31) + this.f57260e.hashCode()) * 31) + this.f57261f) * 31) + this.f57262g;
        C22280i<?> iVar = this.f57265j;
        if (iVar != null) {
            hashCode = (hashCode * 31) + iVar.hashCode();
        }
        return (((hashCode * 31) + this.f57263h.hashCode()) * 31) + this.f57264i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f57259d + ", signature=" + this.f57260e + ", width=" + this.f57261f + ", height=" + this.f57262g + ", decodedResourceClass=" + this.f57263h + ", transformation='" + this.f57265j + '\'' + ", options=" + this.f57264i + C12361b.f30259j;
    }
}
