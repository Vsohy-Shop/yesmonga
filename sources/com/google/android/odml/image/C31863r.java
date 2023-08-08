package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.C0376v0;

@C0376v0(19)
/* renamed from: com.google.android.odml.image.r */
public final class C31863r implements C31861p {

    /* renamed from: a */
    public final Image f77710a;

    /* renamed from: b */
    public final C31847e f77711b;

    public C31863r(Image image) {
        int i;
        this.f77710a = image;
        C31856k kVar = new C31856k();
        kVar.mo92370b(3);
        int format = image.getFormat();
        if (format == 42) {
            i = 1;
        } else if (format == 41) {
            i = 2;
        } else if (format == 35) {
            i = 7;
        } else if (format != 256) {
            i = 0;
        } else {
            i = 9;
        }
        kVar.mo92369a(i);
        this.f77711b = kVar.mo92371c();
    }

    /* renamed from: a */
    public final Image mo92379a() {
        return this.f77710a;
    }

    /* renamed from: d */
    public final void mo92376d() {
        this.f77710a.close();
    }

    public final C31847e zzb() {
        return this.f77711b;
    }
}
