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
/* renamed from: com.google.android.material.transition.platform.e */
public final class C31782e implements C31828w {

    /* renamed from: b */
    public static final float f77457b = 0.35f;

    /* renamed from: a */
    public float f77458a = 0.35f;

    /* renamed from: com.google.android.material.transition.platform.e$a */
    public class C31783a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f77459a;

        /* renamed from: b */
        public final /* synthetic */ float f77460b;

        /* renamed from: c */
        public final /* synthetic */ float f77461c;

        /* renamed from: d */
        public final /* synthetic */ float f77462d;

        /* renamed from: e */
        public final /* synthetic */ float f77463e;

        public C31783a(View view, float f, float f2, float f3, float f4) {
            this.f77459a = view;
            this.f77460b = f;
            this.f77461c = f2;
            this.f77462d = f3;
            this.f77463e = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f77459a.setAlpha(C31823v.m129120l(this.f77460b, this.f77461c, this.f77462d, this.f77463e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.e$b */
    public class C31784b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77464a;

        /* renamed from: b */
        public final /* synthetic */ float f77465b;

        public C31784b(View view, float f) {
            this.f77464a = view;
            this.f77465b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77464a.setAlpha(this.f77465b);
        }
    }

    /* renamed from: c */
    public static Animator m128905c(View view, float f, float f2, @C0379x(from = 0.0d, mo1016to = 1.0d) float f3, @C0379x(from = 0.0d, mo1016to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C31783a(view, f, f2, f3, f4));
        ofFloat.addListener(new C31784b(view, f5));
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
        return m128905c(view, f2, 0.0f, 0.0f, this.f77458a, f2);
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
        return m128905c(view, 0.0f, f2, this.f77458a, 1.0f, f2);
    }

    /* renamed from: d */
    public float mo92185d() {
        return this.f77458a;
    }

    /* renamed from: e */
    public void mo92186e(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f77458a = f;
    }
}
