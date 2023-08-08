package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.C0363p0;

/* renamed from: com.google.android.material.floatingactionbutton.a */
public class C31354a {
    @C0363p0

    /* renamed from: a */
    public Animator f75618a;

    /* renamed from: a */
    public void mo89759a() {
        Animator animator = this.f75618a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void mo89760b() {
        this.f75618a = null;
    }

    /* renamed from: c */
    public void mo89761c(Animator animator) {
        mo89759a();
        this.f75618a = animator;
    }
}
