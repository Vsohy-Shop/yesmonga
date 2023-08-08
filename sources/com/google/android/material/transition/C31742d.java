package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;

/* renamed from: com.google.android.material.transition.d */
public final class C31742d implements C31842v {

    /* renamed from: a */
    public float f77294a = 1.0f;

    /* renamed from: com.google.android.material.transition.d$a */
    public class C31743a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f77295a;

        /* renamed from: b */
        public final /* synthetic */ float f77296b;

        /* renamed from: c */
        public final /* synthetic */ float f77297c;

        /* renamed from: d */
        public final /* synthetic */ float f77298d;

        /* renamed from: e */
        public final /* synthetic */ float f77299e;

        public C31743a(View view, float f, float f2, float f3, float f4) {
            this.f77295a = view;
            this.f77296b = f;
            this.f77297c = f2;
            this.f77298d = f3;
            this.f77299e = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f77295a.setAlpha(C31837u.m129196l(this.f77296b, this.f77297c, this.f77298d, this.f77299e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.d$b */
    public class C31744b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77300a;

        /* renamed from: b */
        public final /* synthetic */ float f77301b;

        public C31744b(View view, float f) {
            this.f77300a = view;
            this.f77301b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77300a.setAlpha(this.f77301b);
        }
    }

    /* renamed from: c */
    public static Animator m128722c(View view, float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C31743a(view, f, f2, f3, f4));
        ofFloat.addListener(new C31744b(view, f5));
        return ofFloat;
    }

    @C0363p0
    /* renamed from: a */
    public Animator mo92080a(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        float f;
        if (view.getAlpha() == 0.0f) {
            f = 1.0f;
        } else {
            f = view.getAlpha();
        }
        float f2 = f;
        return m128722c(view, f2, 0.0f, 0.0f, 1.0f, f2);
    }

    @C0363p0
    /* renamed from: b */
    public Animator mo92081b(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        float f;
        if (view.getAlpha() == 0.0f) {
            f = 1.0f;
        } else {
            f = view.getAlpha();
        }
        float f2 = f;
        return m128722c(view, 0.0f, f2, 0.0f, this.f77294a, f2);
    }

    /* renamed from: d */
    public float mo92082d() {
        return this.f77294a;
    }

    /* renamed from: e */
    public void mo92083e(float f) {
        this.f77294a = f;
    }
}
