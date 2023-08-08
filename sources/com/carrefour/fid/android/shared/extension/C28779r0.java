package com.carrefour.fid.android.shared.extension;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.C11289a;

/* renamed from: com.carrefour.fid.android.shared.extension.r0 */
public final /* synthetic */ class C28779r0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ AppBarLayout f70443a;

    /* renamed from: b */
    public final /* synthetic */ C11289a f70444b;

    public /* synthetic */ C28779r0(AppBarLayout appBarLayout, C11289a aVar) {
        this.f70443a = appBarLayout;
        this.f70444b = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewKt$collapseView$1.m119019h(this.f70443a, this.f70444b, valueAnimator);
    }
}
