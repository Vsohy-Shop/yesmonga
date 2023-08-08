package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.load.engine.C22258o;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.util.C22633m;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e0 */
public final class C22406e0 implements C22270s<BitmapDrawable>, C22258o {

    /* renamed from: a */
    public final Resources f57523a;

    /* renamed from: b */
    public final C22270s<Bitmap> f57524b;

    public C22406e0(@C0359n0 Resources resources, @C0359n0 C22270s<Bitmap> sVar) {
        this.f57523a = (Resources) C22633m.m102624d(resources);
        this.f57524b = (C22270s) C22633m.m102624d(sVar);
    }

    @C0363p0
    /* renamed from: e */
    public static C22270s<BitmapDrawable> m101741e(@C0359n0 Resources resources, @C0363p0 C22270s<Bitmap> sVar) {
        if (sVar == null) {
            return null;
        }
        return new C22406e0(resources, sVar);
    }

    @Deprecated
    /* renamed from: f */
    public static C22406e0 m101742f(Context context, Bitmap bitmap) {
        return (C22406e0) m101741e(context.getResources(), C22411h.m101762e(bitmap, C22038b.m100356e(context).mo65480h()));
    }

    @Deprecated
    /* renamed from: g */
    public static C22406e0 m101743g(Resources resources, C22162e eVar, Bitmap bitmap) {
        return (C22406e0) m101741e(resources, C22411h.m101762e(bitmap, eVar));
    }

    /* renamed from: a */
    public void mo66175a() {
        this.f57524b.mo66175a();
    }

    /* renamed from: b */
    public void mo66184b() {
        C22270s<Bitmap> sVar = this.f57524b;
        if (sVar instanceof C22258o) {
            ((C22258o) sVar).mo66184b();
        }
    }

    @C0359n0
    /* renamed from: c */
    public Class<BitmapDrawable> mo66177c() {
        return BitmapDrawable.class;
    }

    @C0359n0
    /* renamed from: d */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f57523a, this.f57524b.get());
    }

    public int getSize() {
        return this.f57524b.getSize();
    }
}
