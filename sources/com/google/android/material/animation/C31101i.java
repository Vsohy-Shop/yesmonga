package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.android.material.animation.i */
public class C31101i {

    /* renamed from: a */
    public long f74441a;

    /* renamed from: b */
    public long f74442b;
    @C0363p0

    /* renamed from: c */
    public TimeInterpolator f74443c;

    /* renamed from: d */
    public int f74444d;

    /* renamed from: e */
    public int f74445e;

    public C31101i(long j, long j2) {
        this.f74443c = null;
        this.f74444d = 0;
        this.f74445e = 1;
        this.f74441a = j;
        this.f74442b = j2;
    }

    @C0359n0
    /* renamed from: b */
    public static C31101i m124673b(@C0359n0 ValueAnimator valueAnimator) {
        C31101i iVar = new C31101i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m124674f(valueAnimator));
        iVar.f74444d = valueAnimator.getRepeatCount();
        iVar.f74445e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    public static TimeInterpolator m124674f(@C0359n0 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C31093a.f74426b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C31093a.f74427c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C31093a.f74428d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public void mo87867a(@C0359n0 Animator animator) {
        animator.setStartDelay(mo87868c());
        animator.setDuration(mo87869d());
        animator.setInterpolator(mo87870e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo87872g());
            valueAnimator.setRepeatMode(mo87873h());
        }
    }

    /* renamed from: c */
    public long mo87868c() {
        return this.f74441a;
    }

    /* renamed from: d */
    public long mo87869d() {
        return this.f74442b;
    }

    @C0363p0
    /* renamed from: e */
    public TimeInterpolator mo87870e() {
        TimeInterpolator timeInterpolator = this.f74443c;
        return timeInterpolator != null ? timeInterpolator : C31093a.f74426b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31101i)) {
            return false;
        }
        C31101i iVar = (C31101i) obj;
        if (mo87868c() == iVar.mo87868c() && mo87869d() == iVar.mo87869d() && mo87872g() == iVar.mo87872g() && mo87873h() == iVar.mo87873h()) {
            return mo87870e().getClass().equals(iVar.mo87870e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo87872g() {
        return this.f74444d;
    }

    /* renamed from: h */
    public int mo87873h() {
        return this.f74445e;
    }

    public int hashCode() {
        return (((((((((int) (mo87868c() ^ (mo87868c() >>> 32))) * 31) + ((int) (mo87869d() ^ (mo87869d() >>> 32)))) * 31) + mo87870e().getClass().hashCode()) * 31) + mo87872g()) * 31) + mo87873h();
    }

    @C0359n0
    public String toString() {
        return 10 + getClass().getName() + C12361b.f30258i + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo87868c() + " duration: " + mo87869d() + " interpolator: " + mo87870e().getClass() + " repeatCount: " + mo87872g() + " repeatMode: " + mo87873h() + "}\n";
    }

    public C31101i(long j, long j2, @C0359n0 TimeInterpolator timeInterpolator) {
        this.f74444d = 0;
        this.f74445e = 1;
        this.f74441a = j;
        this.f74442b = j2;
        this.f74443c = timeInterpolator;
    }
}
