package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.C22270s;

/* renamed from: com.bumptech.glide.load.resource.drawable.k */
public final class C22465k extends C22463i<Drawable> {
    public C22465k(Drawable drawable) {
        super(drawable);
    }

    @C0363p0
    /* renamed from: e */
    public static C22270s<Drawable> m101938e(@C0363p0 Drawable drawable) {
        if (drawable != null) {
            return new C22465k(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public void mo66175a() {
    }

    @C0359n0
    /* renamed from: c */
    public Class<Drawable> mo66177c() {
        return this.f57598a.getClass();
    }

    public int getSize() {
        return Math.max(1, this.f57598a.getIntrinsicWidth() * this.f57598a.getIntrinsicHeight() * 4);
    }
}
