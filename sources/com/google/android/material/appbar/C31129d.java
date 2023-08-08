package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C18196h2;

/* renamed from: com.google.android.material.appbar.d */
public class C31129d {

    /* renamed from: a */
    public final View f74588a;

    /* renamed from: b */
    public int f74589b;

    /* renamed from: c */
    public int f74590c;

    /* renamed from: d */
    public int f74591d;

    /* renamed from: e */
    public int f74592e;

    /* renamed from: f */
    public boolean f74593f = true;

    /* renamed from: g */
    public boolean f74594g = true;

    public C31129d(View view) {
        this.f74588a = view;
    }

    /* renamed from: a */
    public void mo88143a() {
        View view = this.f74588a;
        C18196h2.m82578f1(view, this.f74591d - (view.getTop() - this.f74589b));
        View view2 = this.f74588a;
        C18196h2.m82574e1(view2, this.f74592e - (view2.getLeft() - this.f74590c));
    }

    /* renamed from: b */
    public int mo88144b() {
        return this.f74590c;
    }

    /* renamed from: c */
    public int mo88145c() {
        return this.f74589b;
    }

    /* renamed from: d */
    public int mo88146d() {
        return this.f74592e;
    }

    /* renamed from: e */
    public int mo88147e() {
        return this.f74591d;
    }

    /* renamed from: f */
    public boolean mo88148f() {
        return this.f74594g;
    }

    /* renamed from: g */
    public boolean mo88149g() {
        return this.f74593f;
    }

    /* renamed from: h */
    public void mo88150h() {
        this.f74589b = this.f74588a.getTop();
        this.f74590c = this.f74588a.getLeft();
    }

    /* renamed from: i */
    public void mo88151i(boolean z) {
        this.f74594g = z;
    }

    /* renamed from: j */
    public boolean mo88152j(int i) {
        if (!this.f74594g || this.f74592e == i) {
            return false;
        }
        this.f74592e = i;
        mo88143a();
        return true;
    }

    /* renamed from: k */
    public boolean mo88153k(int i) {
        if (!this.f74593f || this.f74591d == i) {
            return false;
        }
        this.f74591d = i;
        mo88143a();
        return true;
    }

    /* renamed from: l */
    public void mo88154l(boolean z) {
        this.f74593f = z;
    }
}
