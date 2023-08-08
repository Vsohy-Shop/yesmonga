package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.utils.c */
public abstract class C21679c extends ValueAnimator {

    /* renamed from: a */
    public final Set<ValueAnimator.AnimatorUpdateListener> f56065a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public final Set<Animator.AnimatorListener> f56066b = new CopyOnWriteArraySet();

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f56066b.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f56065a.add(animatorUpdateListener);
    }

    /* renamed from: b */
    public void mo64661b() {
        for (Animator.AnimatorListener onAnimationCancel : this.f56066b) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    /* renamed from: c */
    public void mo64662c(boolean z) {
        for (Animator.AnimatorListener next : this.f56066b) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: e */
    public void mo64663e() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f56066b) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* renamed from: f */
    public void mo64664f(boolean z) {
        for (Animator.AnimatorListener next : this.f56066b) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, z);
            } else {
                next.onAnimationStart(this);
            }
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* renamed from: h */
    public void mo64666h() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f56065a) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public void removeAllListeners() {
        this.f56066b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f56065a.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f56066b.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f56065a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
