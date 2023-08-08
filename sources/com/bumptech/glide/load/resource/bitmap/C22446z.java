package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.z */
public class C22446z extends C22413i {

    /* renamed from: c */
    public static final String f57587c = "com.bumptech.glide.load.resource.bitmap.FitCenter";

    /* renamed from: d */
    public static final byte[] f57588d = f57587c.getBytes(C22108c.f56791b);

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        messageDigest.update(f57588d);
    }

    /* renamed from: c */
    public Bitmap mo66400c(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2) {
        return C22419k0.m101799f(eVar, bitmap, i, i2);
    }

    public boolean equals(Object obj) {
        return obj instanceof C22446z;
    }

    public int hashCode() {
        return 1572326941;
    }
}
