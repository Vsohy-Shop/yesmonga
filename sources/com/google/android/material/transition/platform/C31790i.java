package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;

@C0376v0(21)
/* renamed from: com.google.android.material.transition.platform.i */
public final class C31790i extends Visibility {
    @C0359n0
    public Animator onAppear(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0363p0 TransitionValues transitionValues, @C0363p0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }

    @C0359n0
    public Animator onDisappear(@C0359n0 ViewGroup viewGroup, @C0359n0 View view, @C0363p0 TransitionValues transitionValues, @C0363p0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }
}
