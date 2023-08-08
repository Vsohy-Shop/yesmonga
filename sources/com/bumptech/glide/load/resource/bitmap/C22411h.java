package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.C22258o;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.C22635o;

/* renamed from: com.bumptech.glide.load.resource.bitmap.h */
public class C22411h implements C22270s<Bitmap>, C22258o {

    /* renamed from: a */
    public final Bitmap f57531a;

    /* renamed from: b */
    public final C22162e f57532b;

    public C22411h(@C0359n0 Bitmap bitmap, @C0359n0 C22162e eVar) {
        this.f57531a = (Bitmap) C22633m.m102625e(bitmap, "Bitmap must not be null");
        this.f57532b = (C22162e) C22633m.m102625e(eVar, "BitmapPool must not be null");
    }

    @C0363p0
    /* renamed from: e */
    public static C22411h m101762e(@C0363p0 Bitmap bitmap, @C0359n0 C22162e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new C22411h(bitmap, eVar);
    }

    /* renamed from: a */
    public void mo66175a() {
        this.f57532b.mo65956d(this.f57531a);
    }

    /* renamed from: b */
    public void mo66184b() {
        this.f57531a.prepareToDraw();
    }

    @C0359n0
    /* renamed from: c */
    public Class<Bitmap> mo66177c() {
        return Bitmap.class;
    }

    @C0359n0
    /* renamed from: d */
    public Bitmap get() {
        return this.f57531a;
    }

    public int getSize() {
        return C22635o.m102633h(this.f57531a);
    }
}
