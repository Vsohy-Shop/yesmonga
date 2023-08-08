package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
public class C31128c<V extends View> extends CoordinatorLayout.C16977c<V> {

    /* renamed from: a */
    public C31129d f74585a;

    /* renamed from: b */
    public int f74586b = 0;

    /* renamed from: c */
    public int f74587c = 0;

    public C31128c() {
    }

    /* renamed from: G */
    public int mo87990G() {
        C31129d dVar = this.f74585a;
        if (dVar != null) {
            return dVar.mo88146d();
        }
        return 0;
    }

    /* renamed from: H */
    public int mo87991H() {
        C31129d dVar = this.f74585a;
        if (dVar != null) {
            return dVar.mo88147e();
        }
        return 0;
    }

    /* renamed from: I */
    public boolean mo87992I() {
        C31129d dVar = this.f74585a;
        return dVar != null && dVar.mo88148f();
    }

    /* renamed from: J */
    public boolean mo87993J() {
        C31129d dVar = this.f74585a;
        return dVar != null && dVar.mo88149g();
    }

    /* renamed from: K */
    public void mo88137K(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i) {
        coordinatorLayout.mo51012N(v, i);
    }

    /* renamed from: L */
    public void mo87994L(boolean z) {
        C31129d dVar = this.f74585a;
        if (dVar != null) {
            dVar.mo88151i(z);
        }
    }

    /* renamed from: M */
    public boolean mo87995M(int i) {
        C31129d dVar = this.f74585a;
        if (dVar != null) {
            return dVar.mo88152j(i);
        }
        this.f74587c = i;
        return false;
    }

    /* renamed from: N */
    public boolean mo87996N(int i) {
        C31129d dVar = this.f74585a;
        if (dVar != null) {
            return dVar.mo88153k(i);
        }
        this.f74586b = i;
        return false;
    }

    /* renamed from: O */
    public void mo87997O(boolean z) {
        C31129d dVar = this.f74585a;
        if (dVar != null) {
            dVar.mo88154l(z);
        }
    }

    /* renamed from: m */
    public boolean mo51089m(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 V v, int i) {
        mo88137K(coordinatorLayout, v, i);
        if (this.f74585a == null) {
            this.f74585a = new C31129d(v);
        }
        this.f74585a.mo88150h();
        this.f74585a.mo88143a();
        int i2 = this.f74586b;
        if (i2 != 0) {
            this.f74585a.mo88153k(i2);
            this.f74586b = 0;
        }
        int i3 = this.f74587c;
        if (i3 == 0) {
            return true;
        }
        this.f74585a.mo88152j(i3);
        this.f74587c = 0;
        return true;
    }

    public C31128c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
