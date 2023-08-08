package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0329d0;
import androidx.annotation.C0359n0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.expandable.c */
public final class C31336c {
    @C0359n0

    /* renamed from: a */
    public final View f75541a;

    /* renamed from: b */
    public boolean f75542b = false;
    @C0329d0

    /* renamed from: c */
    public int f75543c = 0;

    public C31336c(C31335b bVar) {
        this.f75541a = (View) bVar;
    }

    /* renamed from: a */
    public final void mo89562a() {
        ViewParent parent = this.f75541a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo51037j(this.f75541a);
        }
    }

    @C0329d0
    /* renamed from: b */
    public int mo89563b() {
        return this.f75543c;
    }

    /* renamed from: c */
    public boolean mo89564c() {
        return this.f75542b;
    }

    /* renamed from: d */
    public void mo89565d(@C0359n0 Bundle bundle) {
        this.f75542b = bundle.getBoolean("expanded", false);
        this.f75543c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f75542b) {
            mo89562a();
        }
    }

    @C0359n0
    /* renamed from: e */
    public Bundle mo89566e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f75542b);
        bundle.putInt("expandedComponentIdHint", this.f75543c);
        return bundle;
    }

    /* renamed from: f */
    public boolean mo89567f(boolean z) {
        if (this.f75542b == z) {
            return false;
        }
        this.f75542b = z;
        mo89562a();
        return true;
    }

    /* renamed from: g */
    public void mo89568g(@C0329d0 int i) {
        this.f75543c = i;
    }
}
