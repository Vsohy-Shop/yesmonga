package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.util.C22635o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a0 */
public final class C22393a0 extends C22413i {

    /* renamed from: g */
    public static final String f57475g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* renamed from: h */
    public static final byte[] f57476h = f57475g.getBytes(C22108c.f56791b);

    /* renamed from: c */
    public final float f57477c;

    /* renamed from: d */
    public final float f57478d;

    /* renamed from: e */
    public final float f57479e;

    /* renamed from: f */
    public final float f57480f;

    public C22393a0(float f, float f2, float f3, float f4) {
        this.f57477c = f;
        this.f57478d = f2;
        this.f57479e = f3;
        this.f57480f = f4;
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(f57476h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f57477c).putFloat(this.f57478d).putFloat(this.f57479e).putFloat(this.f57480f).array());
    }

    /* renamed from: c */
    public Bitmap mo66400c(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        return C22419k0.m101809p(eVar, bitmap, this.f57477c, this.f57478d, this.f57479e, this.f57480f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22393a0)) {
            return false;
        }
        C22393a0 a0Var = (C22393a0) obj;
        if (this.f57477c == a0Var.f57477c && this.f57478d == a0Var.f57478d && this.f57479e == a0Var.f57479e && this.f57480f == a0Var.f57480f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C22635o.m102639n(this.f57480f, C22635o.m102639n(this.f57479e, C22635o.m102639n(this.f57478d, C22635o.m102641p(-2013597734, C22635o.m102638m(this.f57477c)))));
    }
}
