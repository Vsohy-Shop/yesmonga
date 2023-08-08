package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import com.bumptech.glide.gifdecoder.C22068a;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.bitmap.C22411h;

/* renamed from: com.bumptech.glide.load.resource.gif.h */
public final class C22487h implements C22278g<C22068a, Bitmap> {

    /* renamed from: a */
    public final C22162e f57661a;

    public C22487h(C22162e eVar) {
        this.f57661a = eVar;
    }

    /* renamed from: c */
    public C22270s<Bitmap> mo66237b(@C0359n0 C22068a aVar, int i, int i2, @C0359n0 C22277f fVar) {
        return C22411h.m101762e(aVar.mo65607b(), this.f57661a);
    }

    /* renamed from: d */
    public boolean mo66236a(@C0359n0 C22068a aVar, @C0359n0 C22277f fVar) {
        return true;
    }
}
