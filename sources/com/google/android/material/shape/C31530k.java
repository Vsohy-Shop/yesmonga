package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0359n0;
import com.google.android.material.internal.C31432x;

/* renamed from: com.google.android.material.shape.k */
public class C31530k {
    @C0359n0
    /* renamed from: a */
    public static C31519e m127550a(int i) {
        if (i == 0) {
            return new C31533n();
        }
        if (i != 1) {
            return m127551b();
        }
        return new C31520f();
    }

    @C0359n0
    /* renamed from: b */
    public static C31519e m127551b() {
        return new C31533n();
    }

    @C0359n0
    /* renamed from: c */
    public static C31521g m127552c() {
        return new C31521g();
    }

    /* renamed from: d */
    public static void m127553d(@C0359n0 View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C31525j) {
            ((C31525j) background).mo90775n0(f);
        }
    }

    /* renamed from: e */
    public static void m127554e(@C0359n0 View view) {
        Drawable background = view.getBackground();
        if (background instanceof C31525j) {
            m127555f(view, (C31525j) background);
        }
    }

    /* renamed from: f */
    public static void m127555f(@C0359n0 View view, @C0359n0 C31525j jVar) {
        if (jVar.mo90752b0()) {
            jVar.mo90786s0(C31432x.m127015j(view));
        }
    }
}
