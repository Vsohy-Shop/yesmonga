package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31422p;

@C0376v0(21)
/* renamed from: com.google.android.material.appbar.e */
public class C31130e {

    /* renamed from: a */
    public static final int[] f74595a = {16843848};

    /* renamed from: a */
    public static void m124915a(@C0359n0 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    public static void m124916b(@C0359n0 View view, float f) {
        int integer = view.getResources().getInteger(C31076a.C31085i.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, C31076a.C31079c.state_liftable, -C31076a.C31079c.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    public static void m124917c(@C0359n0 View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray j = C31422p.m126970j(context, attributeSet, f74595a, i, i2, new int[0]);
        try {
            if (j.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, j.getResourceId(0, 0)));
            }
        } finally {
            j.recycle();
        }
    }
}
