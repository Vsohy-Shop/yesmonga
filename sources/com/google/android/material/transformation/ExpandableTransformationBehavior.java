package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @C0363p0

    /* renamed from: e */
    public AnimatorSet f77256e;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C31728a extends AnimatorListenerAdapter {
        public C31728a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f77256e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @C0346i
    /* renamed from: K */
    public boolean mo92043K(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.f77256e;
        if (animatorSet != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet M = mo92045M(view, view2, z, z3);
        this.f77256e = M;
        M.addListener(new C31728a());
        this.f77256e.start();
        if (!z2) {
            this.f77256e.end();
        }
        return true;
    }

    @C0359n0
    /* renamed from: M */
    public abstract AnimatorSet mo92045M(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
