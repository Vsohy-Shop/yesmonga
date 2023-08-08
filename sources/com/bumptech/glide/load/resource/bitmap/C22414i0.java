package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.C22635o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i0 */
public final class C22414i0 extends C22413i {

    /* renamed from: d */
    public static final String f57536d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* renamed from: e */
    public static final byte[] f57537e = f57536d.getBytes(C22108c.f56791b);

    /* renamed from: c */
    public final int f57538c;

    public C22414i0(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C22633m.m102621a(z, "roundingRadius must be greater than 0.");
        this.f57538c = i;
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(f57537e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f57538c).array());
    }

    /* renamed from: c */
    public Bitmap mo66400c(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        return C22419k0.m101810q(eVar, bitmap, this.f57538c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C22414i0) || this.f57538c != ((C22414i0) obj).f57538c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C22635o.m102641p(-569625254, C22635o.m102640o(this.f57538c));
    }
}
