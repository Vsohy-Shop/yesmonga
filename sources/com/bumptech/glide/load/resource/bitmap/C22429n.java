package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
public class C22429n extends C22413i {

    /* renamed from: c */
    public static final String f57559c = "com.bumptech.glide.load.resource.bitmap.CenterCrop";

    /* renamed from: d */
    public static final byte[] f57560d = f57559c.getBytes(C22108c.f56791b);

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(f57560d);
    }

    /* renamed from: c */
    public Bitmap mo66400c(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        return C22419k0.m101795b(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C22429n;
    }

    public int hashCode() {
        return -599754482;
    }
}
