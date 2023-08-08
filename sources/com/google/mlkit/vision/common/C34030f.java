package com.google.mlkit.vision.common;

import android.media.Image;
import androidx.annotation.C0376v0;

/* renamed from: com.google.mlkit.vision.common.f */
public final class C34030f {

    /* renamed from: a */
    public final Image f82658a;

    public C34030f(Image image) {
        this.f82658a = image;
    }

    /* renamed from: a */
    public final Image mo98970a() {
        return this.f82658a;
    }

    @C0376v0(19)
    /* renamed from: b */
    public final Image.Plane[] mo98971b() {
        return this.f82658a.getPlanes();
    }
}
