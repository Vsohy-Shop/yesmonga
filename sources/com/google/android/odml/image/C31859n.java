package com.google.android.odml.image;

import android.graphics.Bitmap;

/* renamed from: com.google.android.odml.image.n */
public final class C31859n implements C31861p {

    /* renamed from: a */
    public final Bitmap f77706a;

    /* renamed from: b */
    public final C31847e f77707b;

    public C31859n(Bitmap bitmap) {
        int i;
        this.f77706a = bitmap;
        C31856k kVar = new C31856k();
        int i2 = C31858m.f77705a[bitmap.getConfig().ordinal()];
        if (i2 == 1) {
            i = 8;
        } else if (i2 != 2) {
            i = 0;
        } else {
            i = 1;
        }
        kVar.mo92369a(i);
        kVar.mo92370b(1);
        this.f77707b = kVar.mo92371c();
    }

    /* renamed from: a */
    public final Bitmap mo92375a() {
        return this.f77706a;
    }

    /* renamed from: d */
    public final void mo92376d() {
        this.f77706a.recycle();
    }

    public final C31847e zzb() {
        return this.f77707b;
    }
}
