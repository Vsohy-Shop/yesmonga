package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
public class C22433p extends C22413i {

    /* renamed from: c */
    public static final int f57563c = 1;

    /* renamed from: d */
    public static final String f57564d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    /* renamed from: e */
    public static final byte[] f57565e = f57564d.getBytes(C22108c.f56791b);

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(f57565e);
    }

    /* renamed from: c */
    public Bitmap mo66400c(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        return C22419k0.m101797d(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C22433p;
    }

    public int hashCode() {
        return 1101716364;
    }
}
