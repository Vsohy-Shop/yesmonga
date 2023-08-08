package com.airbnb.lottie.value;

/* renamed from: com.airbnb.lottie.value.k */
public class C21703k {

    /* renamed from: a */
    public float f56125a;

    /* renamed from: b */
    public float f56126b;

    public C21703k(float f, float f2) {
        this.f56125a = f;
        this.f56126b = f2;
    }

    /* renamed from: a */
    public boolean mo64751a(float f, float f2) {
        return this.f56125a == f && this.f56126b == f2;
    }

    /* renamed from: b */
    public float mo64752b() {
        return this.f56125a;
    }

    /* renamed from: c */
    public float mo64753c() {
        return this.f56126b;
    }

    /* renamed from: d */
    public void mo64754d(float f, float f2) {
        this.f56125a = f;
        this.f56126b = f2;
    }

    public String toString() {
        return mo64752b() + "x" + mo64753c();
    }

    public C21703k() {
        this(1.0f, 1.0f);
    }
}
