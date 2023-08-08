package com.carrefour.fid.android.design.components.widgets.swipetorefresh;

import android.animation.ValueAnimator;

/* renamed from: com.carrefour.fid.android.design.components.widgets.swipetorefresh.a */
public final /* synthetic */ class C37407a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BasePullToRefreshLayout f94009a;

    /* renamed from: b */
    public final /* synthetic */ int f94010b;

    /* renamed from: c */
    public final /* synthetic */ float f94011c;

    /* renamed from: d */
    public final /* synthetic */ ValueAnimator f94012d;

    public /* synthetic */ C37407a(BasePullToRefreshLayout basePullToRefreshLayout, int i, float f, ValueAnimator valueAnimator) {
        this.f94009a = basePullToRefreshLayout;
        this.f94010b = i;
        this.f94011c = f;
        this.f94012d = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        BasePullToRefreshLayout.m153600t(this.f94009a, this.f94010b, this.f94011c, this.f94012d, valueAnimator);
    }
}
