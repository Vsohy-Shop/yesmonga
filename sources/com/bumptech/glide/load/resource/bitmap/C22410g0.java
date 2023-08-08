package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.drawable.C22466l;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g0 */
public class C22410g0 implements C22278g<Uri, Bitmap> {

    /* renamed from: a */
    public final C22466l f57529a;

    /* renamed from: b */
    public final C22162e f57530b;

    public C22410g0(C22466l lVar, C22162e eVar) {
        this.f57529a = lVar;
        this.f57530b = eVar;
    }

    @C0363p0
    /* renamed from: c */
    public C22270s<Bitmap> mo66237b(@C0359n0 Uri uri, int i, int i2, @C0359n0 C22277f fVar) {
        C22270s<Drawable> c = this.f57529a.mo66237b(uri, i, i2, fVar);
        if (c == null) {
            return null;
        }
        return C22442w.m101875a(this.f57530b, c.get(), i, i2);
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 Uri uri, @C0359n0 C22277f fVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
