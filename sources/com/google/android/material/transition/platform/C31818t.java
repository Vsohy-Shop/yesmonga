package com.google.android.material.transition.platform;

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
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.t */
public final class C31818t implements C31828w {

    /* renamed from: c */
    public static final int f77621c = -1;

    /* renamed from: a */
    public int f77622a;
    @C0372t0

    /* renamed from: b */
    public int f77623b = -1;

    /* renamed from: com.google.android.material.transition.platform.t$a */
    public class C31819a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77624a;

        /* renamed from: b */
        public final /* synthetic */ float f77625b;

        public C31819a(View view, float f) {
            this.f77624a = view;
            this.f77625b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77624a.setTranslationX(this.f77625b);
        }
    }

    /* renamed from: com.google.android.material.transition.platform.t$b */
    public class C31820b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f77626a;

        /* renamed from: b */
        public final /* synthetic */ float f77627b;

        public C31820b(View view, float f) {
            this.f77626a = view;
            this.f77627b = f;
        }

        public void onAnimationEnd(Animator animator) {
            this.f77626a.setTranslationY(this.f77627b);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.transition.platform.t$c */
    public @interface C31821c {
    }

    public C31818t(int i) {
        this.f77622a = i;
    }

    /* renamed from: c */
    public static Animator m129097c(View view, View view2, int i, @C0372t0 int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m129099e(view2, ((float) i2) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return m129099e(view2, translationX - ((float) i2), translationX, translationX);
        }
        if (i == 48) {
            return m129100f(view2, translationY - ((float) i2), translationY, translationY);
        }
        if (i == 80) {
            return m129100f(view2, ((float) i2) + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            if (m129101j(view)) {
                f = ((float) i2) + translationX;
            } else {
                f = translationX - ((float) i2);
            }
            return m129099e(view2, f, translationX, translationX);
        } else if (i == 8388613) {
            if (m129101j(view)) {
                f2 = translationX - ((float) i2);
            } else {
                f2 = ((float) i2) + translationX;
            }
            return m129099e(view2, f2, translationX, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: d */
    public static Animator m129098d(View view, View view2, int i, @C0372t0 int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m129099e(view2, translationX, translationX - ((float) i2), translationX);
        }
        if (i == 5) {
            return m129099e(view2, translationX, ((float) i2) + translationX, translationX);
        }
        if (i == 48) {
            return m129100f(view2, translationY, ((float) i2) + translationY, translationY);
        }
        if (i == 80) {
            return m129100f(view2, translationY, translationY - ((float) i2), translationY);
        }
        if (i == 8388611) {
            if (m129101j(view)) {
                f = translationX - ((float) i2);
            } else {
                f = ((float) i2) + translationX;
            }
            return m129099e(view2, translationX, f, translationX);
        } else if (i == 8388613) {
            if (m129101j(view)) {
                f2 = ((float) i2) + translationX;
            } else {
                f2 = translationX - ((float) i2);
            }
            return m129099e(view2, translationX, f2, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: e */
    public static Animator m129099e(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C31819a(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: f */
    public static Animator m129100f(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new C31820b(view, f3));
        return ofPropertyValuesHolder;
    }

    /* renamed from: j */
    public static boolean m129101j(View view) {
        return C18196h2.m82553Z(view) == 1;
    }

    @C0363p0
    /* renamed from: a */
    public Animator mo92179a(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        return m129098d(viewGroup, view, this.f77622a, mo92319h(view.getContext()));
    }

    @C0363p0
    /* renamed from: b */
    public Animator mo92180b(@C0359n0 ViewGroup viewGroup, @C0359n0 View view) {
        return m129097c(viewGroup, view, this.f77622a, mo92319h(view.getContext()));
    }

    @C0372t0
    /* renamed from: g */
    public int mo92318g() {
        return this.f77623b;
    }

    /* renamed from: h */
    public final int mo92319h(Context context) {
        int i = this.f77623b;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_transition_shared_axis_slide_distance);
    }

    /* renamed from: i */
    public int mo92320i() {
        return this.f77622a;
    }

    /* renamed from: k */
    public void mo92321k(@C0372t0 int i) {
        if (i >= 0) {
            this.f77623b = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    /* renamed from: l */
    public void mo92322l(int i) {
        this.f77622a = i;
    }
}
