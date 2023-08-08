package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.animatable.C21550h;

public class Mask {

    /* renamed from: a */
    public final MaskMode f55625a;

    /* renamed from: b */
    public final C21550h f55626b;

    /* renamed from: c */
    public final C21546d f55627c;

    /* renamed from: d */
    public final boolean f55628d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, C21550h hVar, C21546d dVar, boolean z) {
        this.f55625a = maskMode;
        this.f55626b = hVar;
        this.f55627c = dVar;
        this.f55628d = z;
    }

    /* renamed from: a */
    public MaskMode mo64327a() {
        return this.f55625a;
    }

    /* renamed from: b */
    public C21550h mo64328b() {
        return this.f55626b;
    }

    /* renamed from: c */
    public C21546d mo64329c() {
        return this.f55627c;
    }

    /* renamed from: d */
    public boolean mo64330d() {
        return this.f55628d;
    }
}
