package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.C31093a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C16977c<V> {

    /* renamed from: e */
    public static final int f74655e = 225;

    /* renamed from: f */
    public static final int f74656f = 175;

    /* renamed from: g */
    public static final int f74657g = 1;

    /* renamed from: h */
    public static final int f74658h = 2;

    /* renamed from: a */
    public int f74659a = 0;

    /* renamed from: b */
    public int f74660b = 2;

    /* renamed from: c */
    public int f74661c = 0;
    @C0363p0

    /* renamed from: d */
    public ViewPropertyAnimator f74662d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C31141a extends AnimatorListenerAdapter {
        public C31141a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f74662d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: B */
    public boolean mo51074B(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: H */
    public final void mo88269H(@C0359n0 V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f74662d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C31141a());
    }

    /* renamed from: I */
    public boolean mo88270I() {
        return this.f74660b == 1;
    }

    /* renamed from: J */
    public boolean mo88271J() {
        return this.f74660b == 2;
    }

    /* renamed from: K */
    public void mo88272K(@C0359n0 V v, @C0366r int i) {
        this.f74661c = i;
        if (this.f74660b == 1) {
            v.setTranslationY((float) (this.f74659a + i));
        }
    }

    /* renamed from: L */
    public void mo88273L(@C0359n0 V v) {
        mo88274M(v, true);
    }

    /* renamed from: M */
    public void mo88274M(@C0359n0 V v, boolean z) {
        if (!mo88270I()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f74662d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f74660b = 1;
            int i = this.f74659a + this.f74661c;
            if (z) {
                mo88269H(v, i, 175, C31093a.f74427c);
                return;
            }
            v.setTranslationY((float) i);
        }
    }

    /* renamed from: N */
    public void mo88275N(@C0359n0 V v) {
        mo88276O(v, true);
    }

    /* renamed from: O */
    public void mo88276O(@C0359n0 V v, boolean z) {
        if (!mo88271J()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f74662d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f74660b = 2;
            if (z) {
                mo88269H(v, 0, 225, C31093a.f74428d);
                return;
            }
            v.setTranslationY((float) 0);
        }
    }

    /* renamed from: m */
    public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i) {
        this.f74659a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo51089m(coordinatorLayout, v, i);
    }

    /* renamed from: u */
    public void mo51097u(CoordinatorLayout coordinatorLayout, @C0359n0 V v, @C0359n0 View view, int i, int i2, int i3, int i4, int i5, @C0359n0 int[] iArr) {
        if (i2 > 0) {
            mo88273L(v);
        } else if (i2 < 0) {
            mo88275N(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
