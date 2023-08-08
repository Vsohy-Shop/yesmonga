package com.airbnb.lottie.utils;

/* renamed from: com.airbnb.lottie.utils.h */
public class C21684h {

    /* renamed from: a */
    public float f56078a;

    /* renamed from: b */
    public int f56079b;

    /* renamed from: a */
    public void mo64704a(float f) {
        float f2 = this.f56078a + f;
        this.f56078a = f2;
        int i = this.f56079b + 1;
        this.f56079b = i;
        if (i == Integer.MAX_VALUE) {
            this.f56078a = f2 / 2.0f;
            this.f56079b = i / 2;
        }
    }

    /* renamed from: b */
    public float mo64705b() {
        int i = this.f56079b;
        if (i == 0) {
            return 0.0f;
        }
        return this.f56078a / ((float) i);
    }
}
