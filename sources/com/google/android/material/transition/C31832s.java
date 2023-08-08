package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.material.transition.s */
public final class C31832s implements C31842v {

    /* renamed from: c */
    public static final int f77651c = -1;

    /* renamed from: a */
    public int f77652a;
    @C0372t0

    /* renamed from: b */
    public int f77653b = -1;

    /* renamed from: com.google.android.material.transition.s$a */
    public class C31833a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77654a;

        /* renamed from: b */
        public final /* synthetic */ float f77655b;

        public C31833a(View view, float f) {
            this.f77654a = view;
            this.f77655b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77654a.setTranslationX(this.f77655b);
        }
    }

    /* renamed from: com.google.android.material.transition.s$b */
    public class C31834b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77656a;

        /* renamed from: b */
        public final /* synthetic */ float f77657b;

        public C31834b(View view, float f) {
            this.f77656a = view;
            this.f77657b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77656a.setTranslationY(this.f77657b);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.s$c */
    public @interface C31835c {
    }

    public C31832s(int i) {
        this.f77652a = i;
    }

    /* renamed from: c */
    public static Animator m129168c(View view, View view2, int i, @C0372t0 int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m129170e(view2, ((float) i2) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return m129170e(view2, translationX - ((float) i2), translationX, translationX);
        }
        if (i == 48) {
            return m129171f(view2, translationY - ((float) i2), translationY, translationY);
        }
        if (i == 80) {
            return m129171f(view2, ((float) i2) + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            if (m129172j(view)) {
                f = ((float) i2) + translationX;
            } else {
                f = translationX - ((float) i2);
            }
            return m129170e(view2, f, translationX, translationX);
        } else if (i == 8388613) {
            if (m129172j(view)) {
                f2 = translationX - ((float) i2);
            } else {
                f2 = ((float) i2) + translationX;
            }
            return m129170e(view2, f2, translationX, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: d */
    public static Animator m129169d(View view, View view2, int i, @C0372t0 int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m129170e(view2, translationX, translationX - ((float) i2), translationX);
        }
        if (i == 5) {
            return m129170e(view2, translationX, ((float) i2) + translationX, translationX);
        }
        if (i == 48) {
            return m129171f(view2, translationY, ((float) i2) + translationY, translationY);
        }
        if (i == 80) {
            return m129171f(view2, translationY, translationY - ((float) i2), translationY);
        }
        if (i == 8388611) {
            if (m129172j(view)) {
                f = translationX - ((float) i2);
            } else {
                f = ((float) i2) + translationX;
            }
            return m129170e(view2, translationX, f, translationX);
        } else if (i == 8388613) {
            if (m129172j(view)) {
                f2 = ((float) i2) + translationX;
            } else {
                f2 = translationX - ((float) i2);
            }
            return m129170e(view2, translationX, f2, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: e */
    public static Animator m129170e(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C31833a(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: f */
    public static Animator m129171f(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C31834b(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: j */
    public static boolean m129172j(View view) {
        return C18196h2.m82553Z(view) == 1;
    }

    @C0363p0
    /* renamed from: a */
    public Animator mo92080a(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        return m129169d(viewGroup, view, this.f77652a, mo92345h(view.getContext()));
    }

    @C0363p0
    /* renamed from: b */
    public Animator mo92081b(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        return m129168c(viewGroup, view, this.f77652a, mo92345h(view.getContext()));
    }

    @C0372t0
    /* renamed from: g */
    public int mo92344g() {
        return this.f77653b;
    }

    /* renamed from: h */
    public final int mo92345h(Context context) {
        int i = this.f77653b;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_transition_shared_axis_slide_distance);
    }

    /* renamed from: i */
    public int mo92346i() {
        return this.f77652a;
    }

    /* renamed from: k */
    public void mo92347k(@C0372t0 int i) {
        if (i >= 0) {
            this.f77653b = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    /* renamed from: l */
    public void mo92348l(int i) {
        this.f77652a = i;
    }
}
