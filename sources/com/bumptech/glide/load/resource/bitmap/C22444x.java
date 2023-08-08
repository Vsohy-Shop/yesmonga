package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.x */
public class C22444x implements C22280i<Drawable> {

    /* renamed from: c */
    public final C22280i<Bitmap> f57585c;

    /* renamed from: d */
    public final boolean f57586d;

    public C22444x(C22280i<Bitmap> iVar, boolean z) {
        this.f57585c = iVar;
        this.f57586d = z;
    }

    @C0359n0
    /* renamed from: a */
    public C22270s<Drawable> mo65776a(@C0359n0 Context context, @C0359n0 C22270s<Drawable> sVar, int i, int i2) {
        C22162e h = C22038b.m100356e(context).mo65480h();
        Drawable drawable = sVar.get();
        C22270s<Bitmap> a = C22442w.m101875a(h, drawable, i, i2);
        if (a != null) {
            C22270s<Bitmap> a2 = this.f57585c.mo65776a(context, a, i, i2);
            if (!a2.equals(a)) {
                return mo66465d(context, a2);
            }
            a2.mo66175a();
            return sVar;
        } else if (!this.f57586d) {
            return sVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    /* renamed from: b */
    public void mo65773b(@C0359n0 MessageDigest messageDigest) {
        this.f57585c.mo65773b(messageDigest);
    }

    /* renamed from: c */
    public C22280i<BitmapDrawable> mo66464c() {
        return this;
    }

    /* renamed from: d */
    public final C22270s<Drawable> mo66465d(Context context, C22270s<Bitmap> sVar) {
        return C22406e0.m101741e(context.getResources(), sVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22444x) {
            return this.f57585c.equals(((C22444x) obj).f57585c);
        }
        return false;
    }

    public int hashCode() {
        return this.f57585c.hashCode();
    }
}
