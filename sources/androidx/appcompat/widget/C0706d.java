package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.core.view.C18196h2;

/* renamed from: androidx.appcompat.widget.d */
public class C0706d {
    @C0359n0

    /* renamed from: a */
    public final View f2347a;

    /* renamed from: b */
    public final C0716g f2348b;

    /* renamed from: c */
    public int f2349c = -1;

    /* renamed from: d */
    public C0715f1 f2350d;

    /* renamed from: e */
    public C0715f1 f2351e;

    /* renamed from: f */
    public C0715f1 f2352f;

    public C0706d(@C0359n0 View view) {
        this.f2347a = view;
        this.f2348b = C0716g.m3506b();
    }

    /* renamed from: a */
    public final boolean mo3334a(@C0359n0 Drawable drawable) {
        if (this.f2352f == null) {
            this.f2352f = new C0715f1();
        }
        C0715f1 f1Var = this.f2352f;
        f1Var.mo3426a();
        ColorStateList N = C18196h2.m82517N(this.f2347a);
        if (N != null) {
            f1Var.f2375d = true;
            f1Var.f2372a = N;
        }
        PorterDuff.Mode O = C18196h2.m82520O(this.f2347a);
        if (O != null) {
            f1Var.f2374c = true;
            f1Var.f2373b = O;
        }
        if (!f1Var.f2375d && !f1Var.f2374c) {
            return false;
        }
        C0716g.m3509j(drawable, f1Var, this.f2347a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void mo3335b() {
        Drawable background = this.f2347a.getBackground();
        if (background == null) {
            return;
        }
        if (!mo3344k() || !mo3334a(background)) {
            C0715f1 f1Var = this.f2351e;
            if (f1Var != null) {
                C0716g.m3509j(background, f1Var, this.f2347a.getDrawableState());
                return;
            }
            C0715f1 f1Var2 = this.f2350d;
            if (f1Var2 != null) {
                C0716g.m3509j(background, f1Var2, this.f2347a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList mo3336c() {
        C0715f1 f1Var = this.f2351e;
        if (f1Var != null) {
            return f1Var.f2372a;
        }
        return null;
    }

    /* renamed from: d */
    public PorterDuff.Mode mo3337d() {
        C0715f1 f1Var = this.f2351e;
        if (f1Var != null) {
            return f1Var.f2373b;
        }
        return null;
    }

    /* renamed from: e */
    public void mo3338e(@C0363p0 AttributeSet attributeSet, int i) {
        Context context = this.f2347a.getContext();
        int[] iArr = C0387a.C0400m.ViewBackgroundHelper;
        C0722h1 G = C0722h1.m3539G(context, attributeSet, iArr, i, 0);
        View view = this.f2347a;
        C18196h2.m82658z1(view, view.getContext(), iArr, attributeSet, G.mo3454B(), i, 0);
        try {
            int i2 = C0387a.C0400m.ViewBackgroundHelper_android_background;
            if (G.mo3455C(i2)) {
                this.f2349c = G.mo3479u(i2, -1);
                ColorStateList f = this.f2348b.mo3429f(this.f2347a.getContext(), this.f2349c);
                if (f != null) {
                    mo3341h(f);
                }
            }
            int i3 = C0387a.C0400m.ViewBackgroundHelper_backgroundTint;
            if (G.mo3455C(i3)) {
                C18196h2.m82506J1(this.f2347a, G.mo3462d(i3));
            }
            int i4 = C0387a.C0400m.ViewBackgroundHelper_backgroundTintMode;
            if (G.mo3455C(i4)) {
                C18196h2.m82510K1(this.f2347a, C0725i0.m3584e(G.mo3473o(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            G.mo3458I();
        }
    }

    /* renamed from: f */
    public void mo3339f(Drawable drawable) {
        this.f2349c = -1;
        mo3341h((ColorStateList) null);
        mo3335b();
    }

    /* renamed from: g */
    public void mo3340g(int i) {
        ColorStateList colorStateList;
        this.f2349c = i;
        C0716g gVar = this.f2348b;
        if (gVar != null) {
            colorStateList = gVar.mo3429f(this.f2347a.getContext(), i);
        } else {
            colorStateList = null;
        }
        mo3341h(colorStateList);
        mo3335b();
    }

    /* renamed from: h */
    public void mo3341h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2350d == null) {
                this.f2350d = new C0715f1();
            }
            C0715f1 f1Var = this.f2350d;
            f1Var.f2372a = colorStateList;
            f1Var.f2375d = true;
        } else {
            this.f2350d = null;
        }
        mo3335b();
    }

    /* renamed from: i */
    public void mo3342i(ColorStateList colorStateList) {
        if (this.f2351e == null) {
            this.f2351e = new C0715f1();
        }
        C0715f1 f1Var = this.f2351e;
        f1Var.f2372a = colorStateList;
        f1Var.f2375d = true;
        mo3335b();
    }

    /* renamed from: j */
    public void mo3343j(PorterDuff.Mode mode) {
        if (this.f2351e == null) {
            this.f2351e = new C0715f1();
        }
        C0715f1 f1Var = this.f2351e;
        f1Var.f2373b = mode;
        f1Var.f2374c = true;
        mo3335b();
    }

    /* renamed from: k */
    public final boolean mo3344k() {
        return this.f2350d != null;
    }
}
