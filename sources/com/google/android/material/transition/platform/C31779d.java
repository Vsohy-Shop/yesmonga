package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.d */
public final class C31779d implements C31828w {

    /* renamed from: a */
    public float f77449a = 1.0f;

    /* renamed from: com.google.android.material.transition.platform.d$a */
    public class C31780a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f77450a;

        /* renamed from: b */
        public final /* synthetic */ float f77451b;

        /* renamed from: c */
        public final /* synthetic */ float f77452c;

        /* renamed from: d */
        public final /* synthetic */ float f77453d;

        /* renamed from: e */
        public final /* synthetic */ float f77454e;

        public C31780a(View view, float f, float f2, float f3, float f4) {
            this.f77450a = view;
            this.f77451b = f;
            this.f77452c = f2;
            this.f77453d = f3;
            this.f77454e = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f77450a.setAlpha(C31823v.m129120l(this.f77451b, this.f77452c, this.f77453d, this.f77454e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.d$b */
    public class C31781b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77455a;

        /* renamed from: b */
        public final /* synthetic */ float f77456b;

        public C31781b(View view, float f) {
            this.f77455a = view;
            this.f77456b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77455a.setAlpha(this.f77456b);
        }
    }

    /* renamed from: c */
    public static Animator m128900c(View view, float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C31780a(view, f, f2, f3, f4));
        ofFloat.addListener(new C31781b(view, f5));
        return ofFloat;
    }

    @C0363p0
    /* renamed from: a */
    public Animator mo92179a(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        float f;
        if (view.getAlpha() == 0.0f) {
            f = 1.0f;
        } else {
            f = view.getAlpha();
        }
        float f2 = f;
        return m128900c(view, f2, 0.0f, 0.0f, 1.0f, f2);
    }

    @C0363p0
    /* renamed from: b */
    public Animator mo92180b(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        float f;
        if (view.getAlpha() == 0.0f) {
            f = 1.0f;
        } else {
            f = view.getAlpha();
        }
        float f2 = f;
        return m128900c(view, 0.0f, f2, 0.0f, this.f77449a, f2);
    }

    /* renamed from: d */
    public float mo92181d() {
        return this.f77449a;
    }

    /* renamed from: e */
    public void mo92182e(float f) {
        this.f77449a = f;
    }
}
