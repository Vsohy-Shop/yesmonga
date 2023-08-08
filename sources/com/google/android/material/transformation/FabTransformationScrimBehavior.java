package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.C31094b;
import com.google.android.material.animation.C31101i;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: h */
    public static final long f77277h = 75;

    /* renamed from: i */
    public static final long f77278i = 150;

    /* renamed from: j */
    public static final long f77279j = 0;

    /* renamed from: k */
    public static final long f77280k = 150;

    /* renamed from: f */
    public final C31101i f77281f = new C31101i(75, 150);

    /* renamed from: g */
    public final C31101i f77282g = new C31101i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C31734a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f77283a;

        /* renamed from: b */
        public final /* synthetic */ View f77284b;

        public C31734a(boolean z, View view) {
            this.f77283a = z;
            this.f77284b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f77283a) {
                this.f77284b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f77283a) {
                this.f77284b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: E */
    public boolean mo51077E(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 View view, @C0359n0 MotionEvent motionEvent) {
        return super.mo51077E(coordinatorLayout, view, motionEvent);
    }

    @C0359n0
    /* renamed from: M */
    public AnimatorSet mo92045M(@C0359n0 View view, @C0359n0 View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        mo92075N(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C31094b.m124650a(animatorSet, arrayList);
        animatorSet.addListener(new C31734a(z, view2));
        return animatorSet;
    }

    /* renamed from: N */
    public final void mo92075N(@C0359n0 View view, boolean z, boolean z2, @C0359n0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        C31101i iVar;
        ObjectAnimator objectAnimator;
        if (z) {
            iVar = this.f77281f;
        } else {
            iVar = this.f77282g;
        }
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo87867a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: f */
    public boolean mo51082f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
