package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.util.C22633m;
import java.security.MessageDigest;

@Deprecated
/* renamed from: com.bumptech.glide.load.resource.bitmap.d */
public class C22403d implements C22280i<BitmapDrawable> {

    /* renamed from: c */
    public final C22280i<Drawable> f57517c;

    public C22403d(C22280i<Bitmap> iVar) {
        this.f57517c = (C22280i) C22633m.m102624d(new C22444x(iVar, false));
    }

    /* renamed from: c */
    public static C22270s<BitmapDrawable> m101729c(C22270s<Drawable> sVar) {
        if (sVar.get() instanceof BitmapDrawable) {
            return sVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + sVar.get());
    }

    /* renamed from: d */
    public static C22270s<Drawable> m101730d(C22270s<BitmapDrawable> sVar) {
        return sVar;
    }

    @C0359n0
    /* renamed from: a */
    public C22270s<BitmapDrawable> mo65776a(@C0359n0 Context context, @C0359n0 C22270s<BitmapDrawable> sVar, int i, int i2) {
        return m101729c(this.f57517c.mo65776a(context, m101730d(sVar), i, i2));
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        this.f57517c.mo65773b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22403d) {
            return this.f57517c.equals(((C22403d) obj).f57517c);
        }
        return false;
    }

    public int hashCode() {
        return this.f57517c.hashCode();
    }
}
