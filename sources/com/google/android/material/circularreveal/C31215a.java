package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.C0359n0;
import com.google.android.material.circularreveal.C31220c;

/* renamed from: com.google.android.material.circularreveal.a */
public final class C31215a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    public class C31216a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C31220c f75113a;

        public C31216a(C31220c cVar) {
            this.f75113a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f75113a.mo89126b();
        }

        public void onAnimationStart(Animator animator) {
            this.f75113a.mo89125a();
        }
    }

    @C0359n0
    /* renamed from: a */
    public static Animator m125752a(@C0359n0 C31220c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C31220c.C31223c.f75131a, C31220c.C31222b.f75129b, new C31220c.C31225e[]{new C31220c.C31225e(f, f2, f3)});
        C31220c.C31225e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.f75136c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    @C0359n0
    /* renamed from: b */
    public static Animator m125753b(C31220c cVar, float f, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C31220c.C31223c.f75131a, C31220c.C31222b.f75129b, new C31220c.C31225e[]{new C31220c.C31225e(f, f2, f3), new C31220c.C31225e(f, f2, f4)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
        return animatorSet;
    }

    @C0359n0
    /* renamed from: c */
    public static Animator.AnimatorListener m125754c(@C0359n0 C31220c cVar) {
        return new C31216a(cVar);
    }
}
