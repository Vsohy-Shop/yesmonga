package com.google.android.odml.image;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;

@C0376v0(19)
/* renamed from: com.google.android.odml.image.g */
public class C31849g {

    /* renamed from: a */
    public final Image f77678a;

    /* renamed from: b */
    public int f77679b = 0;

    /* renamed from: c */
    public Rect f77680c;

    public C31849g(@C0359n0 Image image) {
        this.f77678a = image;
        this.f77680c = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    @C0359n0
    /* renamed from: a */
    public C31850h mo92358a() {
        return new C31850h(new C31863r(this.f77678a), this.f77679b, this.f77680c, 0, this.f77678a.getWidth(), this.f77678a.getHeight());
    }

    @C0359n0
    /* renamed from: b */
    public C31849g mo92359b(int i) {
        C31850h.m129227g(i);
        this.f77679b = i;
        return this;
    }
}
