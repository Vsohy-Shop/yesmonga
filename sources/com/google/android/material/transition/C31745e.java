package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;

/* renamed from: com.google.android.material.transition.e */
public final class C31745e implements C31842v {

    /* renamed from: b */
    public static final float f77302b = 0.35f;

    /* renamed from: a */
    public float f77303a = 0.35f;

    /* renamed from: com.google.android.material.transition.e$a */
    public class C31746a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f77304a;

        /* renamed from: b */
        public final /* synthetic */ float f77305b;

        /* renamed from: c */
        public final /* synthetic */ float f77306c;

        /* renamed from: d */
        public final /* synthetic */ float f77307d;

        /* renamed from: e */
        public final /* synthetic */ float f77308e;

        public C31746a(View view, float f, float f2, float f3, float f4) {
            this.f77304a = view;
            this.f77305b = f;
            this.f77306c = f2;
            this.f77307d = f3;
            this.f77308e = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f77304a.setAlpha(C31837u.m129196l(this.f77305b, this.f77306c, this.f77307d, this.f77308e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.e$b */
    public class C31747b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77309a;

        /* renamed from: b */
        public final /* synthetic */ float f77310b;

        public C31747b(View view, float f) {
            this.f77309a = view;
            this.f77310b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77309a.setAlpha(this.f77310b);
        }
    }

    /* renamed from: c */
    public static Animator m128727c(View view, float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C31746a(view, f, f2, f3, f4));
        ofFloat.addListener(new C31747b(view, f5));
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
        return m128727c(view, f2, 0.0f, 0.0f, this.f77303a, f2);
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
        return m128727c(view, 0.0f, f2, this.f77303a, 1.0f, f2);
    }

    /* renamed from: d */
    public float mo92086d() {
        return this.f77303a;
    }

    /* renamed from: e */
    public void mo92087e(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f77303a = f;
    }
}
