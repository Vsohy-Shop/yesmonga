package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.bitmap.C22411h;
import com.bumptech.glide.load.resource.gif.C22477c;

/* renamed from: com.bumptech.glide.load.resource.transcode.c */
public final class C22497c implements C22499e<Drawable, byte[]> {

    /* renamed from: a */
    public final C22162e f57682a;

    /* renamed from: b */
    public final C22499e<Bitmap, byte[]> f57683b;

    /* renamed from: c */
    public final C22499e<C22477c, byte[]> f57684c;

    public C22497c(@C0359n0 C22162e eVar, @C0359n0 C22499e<Bitmap, byte[]> eVar2, @C0359n0 C22499e<C22477c, byte[]> eVar3) {
        this.f57682a = eVar;
        this.f57683b = eVar2;
        this.f57684c = eVar3;
    }

    @C0359n0
    /* renamed from: b */
    public static C22270s<C22477c> m102052b(@C0359n0 C22270s<Drawable> sVar) {
        return sVar;
    }

    @C0363p0
    /* renamed from: a */
    public C22270s<byte[]> mo66566a(@C0359n0 C22270s<Drawable> sVar, @C0359n0 C22277f fVar) {
        Drawable drawable = sVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f57683b.mo66566a(C22411h.m101762e(((BitmapDrawable) drawable).getBitmap(), this.f57682a), fVar);
        }
        if (drawable instanceof C22477c) {
            return this.f57684c.mo66566a(m102052b(sVar), fVar);
        }
        return null;
    }
}
