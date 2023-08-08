package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.material.transition.r */
public final class C31830r implements C31842v {

    /* renamed from: a */
    public float f77642a;

    /* renamed from: b */
    public float f77643b;

    /* renamed from: c */
    public float f77644c;

    /* renamed from: d */
    public float f77645d;

    /* renamed from: e */
    public boolean f77646e;

    /* renamed from: f */
    public boolean f77647f;

    /* renamed from: com.google.android.material.transition.r$a */
    public class C31831a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77648a;

        /* renamed from: b */
        public final /* synthetic */ float f77649b;

        /* renamed from: c */
        public final /* synthetic */ float f77650c;

        public C31831a(View view, float f, float f2) {
            this.f77648a = view;
            this.f77649b = f;
            this.f77650c = f2;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77648a.setScaleX(this.f77649b);
            this.f77648a.setScaleY(this.f77650c);
        }
    }

    public C31830r() {
        this(true);
    }

    /* renamed from: c */
    public static Animator m129153c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new C31831a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @C0363p0
    /* renamed from: a */
    public Animator mo92080a(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        if (!this.f77647f) {
            return null;
        }
        if (this.f77646e) {
            return m129153c(view, this.f77642a, this.f77643b);
        }
        return m129153c(view, this.f77645d, this.f77644c);
    }

    @C0363p0
    /* renamed from: b */
    public Animator mo92081b(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        if (this.f77646e) {
            return m129153c(view, this.f77644c, this.f77645d);
        }
        return m129153c(view, this.f77643b, this.f77642a);
    }

    /* renamed from: d */
    public float mo92331d() {
        return this.f77645d;
    }

    /* renamed from: e */
    public float mo92332e() {
        return this.f77644c;
    }

    /* renamed from: f */
    public float mo92333f() {
        return this.f77643b;
    }

    /* renamed from: g */
    public float mo92334g() {
        return this.f77642a;
    }

    /* renamed from: h */
    public boolean mo92335h() {
        return this.f77646e;
    }

    /* renamed from: i */
    public boolean mo92336i() {
        return this.f77647f;
    }

    /* renamed from: j */
    public void mo92337j(boolean z) {
        this.f77646e = z;
    }

    /* renamed from: k */
    public void mo92338k(float f) {
        this.f77645d = f;
    }

    /* renamed from: l */
    public void mo92339l(float f) {
        this.f77644c = f;
    }

    /* renamed from: m */
    public void mo92340m(float f) {
        this.f77643b = f;
    }

    /* renamed from: n */
    public void mo92341n(float f) {
        this.f77642a = f;
    }

    /* renamed from: o */
    public void mo92342o(boolean z) {
        this.f77647f = z;
    }

    public C31830r(boolean z) {
        this.f77642a = 1.0f;
        this.f77643b = 1.1f;
        this.f77644c = 0.8f;
        this.f77645d = 1.0f;
        this.f77647f = true;
        this.f77646e = z;
    }
}
