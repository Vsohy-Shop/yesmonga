package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.s */
public final class C31816s implements C31828w {

    /* renamed from: a */
    public float f77612a;

    /* renamed from: b */
    public float f77613b;

    /* renamed from: c */
    public float f77614c;

    /* renamed from: d */
    public float f77615d;

    /* renamed from: e */
    public boolean f77616e;

    /* renamed from: f */
    public boolean f77617f;

    /* renamed from: com.google.android.material.transition.platform.s$a */
    public class C31817a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77618a;

        /* renamed from: b */
        public final /* synthetic */ float f77619b;

        /* renamed from: c */
        public final /* synthetic */ float f77620c;

        public C31817a(View view, float f, float f2) {
            this.f77618a = view;
            this.f77619b = f;
            this.f77620c = f2;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77618a.setScaleX(this.f77619b);
            this.f77618a.setScaleY(this.f77620c);
        }
    }

    public C31816s() {
        this(true);
    }

    /* renamed from: c */
    public static Animator m129082c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new C31817a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @C0363p0
    /* renamed from: a */
    public Animator mo92179a(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        if (!this.f77617f) {
            return null;
        }
        if (this.f77616e) {
            return m129082c(view, this.f77612a, this.f77613b);
        }
        return m129082c(view, this.f77615d, this.f77614c);
    }

    @C0363p0
    /* renamed from: b */
    public Animator mo92180b(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        if (this.f77616e) {
            return m129082c(view, this.f77614c, this.f77615d);
        }
        return m129082c(view, this.f77613b, this.f77612a);
    }

    /* renamed from: d */
    public float mo92305d() {
        return this.f77615d;
    }

    /* renamed from: e */
    public float mo92306e() {
        return this.f77614c;
    }

    /* renamed from: f */
    public float mo92307f() {
        return this.f77613b;
    }

    /* renamed from: g */
    public float mo92308g() {
        return this.f77612a;
    }

    /* renamed from: h */
    public boolean mo92309h() {
        return this.f77616e;
    }

    /* renamed from: i */
    public boolean mo92310i() {
        return this.f77617f;
    }

    /* renamed from: j */
    public void mo92311j(boolean z) {
        this.f77616e = z;
    }

    /* renamed from: k */
    public void mo92312k(float f) {
        this.f77615d = f;
    }

    /* renamed from: l */
    public void mo92313l(float f) {
        this.f77614c = f;
    }

    /* renamed from: m */
    public void mo92314m(float f) {
        this.f77613b = f;
    }

    /* renamed from: n */
    public void mo92315n(float f) {
        this.f77612a = f;
    }

    /* renamed from: o */
    public void mo92316o(boolean z) {
        this.f77617f = z;
    }

    public C31816s(boolean z) {
        this.f77612a = 1.0f;
        this.f77613b = 1.1f;
        this.f77614c = 0.8f;
        this.f77615d = 1.0f;
        this.f77617f = true;
        this.f77616e = z;
    }
}
