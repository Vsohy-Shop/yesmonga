package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.util.C22635o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h0 */
public class C22412h0 extends C22413i {

    /* renamed from: d */
    public static final String f57533d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* renamed from: e */
    public static final byte[] f57534e = f57533d.getBytes(C22108c.f56791b);

    /* renamed from: c */
    public final int f57535c;

    public C22412h0(int i) {
        this.f57535c = i;
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(f57534e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f57535c).array());
    }

    /* renamed from: c */
    public Bitmap mo66400c(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        return C22419k0.m101807n(bitmap, this.f57535c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22412h0) || this.f57535c != ((C22412h0) obj).f57535c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C22635o.m102641p(-950519196, C22635o.m102640o(this.f57535c));
    }
}
