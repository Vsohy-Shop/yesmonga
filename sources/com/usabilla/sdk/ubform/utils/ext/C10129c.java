package com.usabilla.sdk.ubform.utils.ext;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.core.view.animation.C18117b;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.c */
public final class C10129c {

    /* renamed from: a */
    public static final long f27866a = 200;

    /* renamed from: b */
    public static final float f27867b = 0.4f;

    @C12579k
    /* renamed from: a */
    public static final Animation m38329a(float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(C18117b.m82265b(0.4f, 0.0f, 1.0f, 1.0f));
        alphaAnimation.setDuration(200);
        return alphaAnimation;
    }

    @C12579k
    /* renamed from: b */
    public static final Animation m38330b(float f, float f2, long j) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f, 1, f2);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(200);
        translateAnimation.setStartOffset(j);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f);
        alphaAnimation.setInterpolator(C18117b.m82265b(0.0f, 0.0f, 0.4f, 1.0f));
        alphaAnimation.setDuration(200);
        alphaAnimation.setStartOffset(j);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }
}
