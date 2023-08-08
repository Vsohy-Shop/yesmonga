package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.load.C22280i;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.util.C22635o;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
public abstract class C22413i implements C22280i<Bitmap> {
    @C0359n0
    /* renamed from: a */
    public final C22270s<Bitmap> mo65776a(@C0359n0 Context context, @C0359n0 C22270s<Bitmap> sVar, int i, int i2) {
        if (C22635o.m102648w(i, i2)) {
            C22162e h = C22038b.m100356e(context).mo65480h();
            Bitmap bitmap = sVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = mo66400c(h, bitmap, i, i2);
            if (bitmap.equals(c)) {
                return sVar;
            }
            return C22411h.m101762e(c, h);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* renamed from: c */
    public abstract Bitmap mo66400c(@C0359n0 C22162e eVar, @C0359n0 Bitmap bitmap, int i, int i2);
}
