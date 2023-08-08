package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.l */
public final class C31413l {

    /* renamed from: a */
    public final ArrayList<C31415b> f75943a = new ArrayList<>();
    @C0363p0

    /* renamed from: b */
    public C31415b f75944b = null;
    @C0363p0

    /* renamed from: c */
    public ValueAnimator f75945c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f75946d = new C31414a();

    /* renamed from: com.google.android.material.internal.l$a */
    public class C31414a extends AnimatorListenerAdapter {
        public C31414a() {
        }

        public void onAnimationEnd(Animator animator) {
            C31413l lVar = C31413l.this;
            if (lVar.f75945c == animator) {
                lVar.f75945c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.l$b */
    public static class C31415b {

        /* renamed from: a */
        public final int[] f75948a;

        /* renamed from: b */
        public final ValueAnimator f75949b;

        public C31415b(int[] iArr, ValueAnimator valueAnimator) {
            this.f75948a = iArr;
            this.f75949b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void mo90156a(int[] iArr, ValueAnimator valueAnimator) {
        C31415b bVar = new C31415b(iArr, valueAnimator);
        valueAnimator.addListener(this.f75946d);
        this.f75943a.add(bVar);
    }

    /* renamed from: b */
    public final void mo90157b() {
        ValueAnimator valueAnimator = this.f75945c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f75945c = null;
        }
    }

    /* renamed from: c */
    public void mo90158c() {
        ValueAnimator valueAnimator = this.f75945c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f75945c = null;
        }
    }

    /* renamed from: d */
    public void mo90159d(int[] iArr) {
        C31415b bVar;
        int size = this.f75943a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f75943a.get(i);
            if (StateSet.stateSetMatches(bVar.f75948a, iArr)) {
                break;
            }
            i++;
        }
        C31415b bVar2 = this.f75944b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                mo90157b();
            }
            this.f75944b = bVar;
            if (bVar != null) {
                mo90160e(bVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo90160e(@C0359n0 C31415b bVar) {
        ValueAnimator valueAnimator = bVar.f75949b;
        this.f75945c = valueAnimator;
        valueAnimator.start();
    }
}
