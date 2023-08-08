package com.carrefour.fid.android.shared.extension;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.carrefour.fid.android.shared.extension.s0 */
public final /* synthetic */ class C28781s0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f70445a;

    public /* synthetic */ C28781s0(View view) {
        this.f70445a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewKt$verticalSlideView$1.m119027h(this.f70445a, valueAnimator);
    }
}
