package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.core.view.C18196h2;
import androidx.core.widget.C18483j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.k */
public class C0732k {
    @C0359n0

    /* renamed from: a */
    public final ImageView f2406a;

    /* renamed from: b */
    public C0715f1 f2407b;

    /* renamed from: c */
    public C0715f1 f2408c;

    /* renamed from: d */
    public C0715f1 f2409d;

    /* renamed from: e */
    public int f2410e = 0;

    public C0732k(@C0359n0 ImageView imageView) {
        this.f2406a = imageView;
    }

    /* renamed from: a */
    public final boolean mo3493a(@C0359n0 Drawable drawable) {
        if (this.f2409d == null) {
            this.f2409d = new C0715f1();
        }
        C0715f1 f1Var = this.f2409d;
        f1Var.mo3426a();
        ColorStateList a = C18483j.m83671a(this.f2406a);
        if (a != null) {
            f1Var.f2375d = true;
            f1Var.f2372a = a;
        }
        PorterDuff.Mode b = C18483j.m83672b(this.f2406a);
        if (b != null) {
            f1Var.f2374c = true;
            f1Var.f2373b = b;
        }
        if (!f1Var.f2375d && !f1Var.f2374c) {
            return false;
        }
        C0716g.m3509j(drawable, f1Var, this.f2406a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void mo3494b() {
        if (this.f2406a.getDrawable() != null) {
            this.f2406a.getDrawable().setLevel(this.f2410e);
        }
    }

    /* renamed from: c */
    public void mo3495c() {
        Drawable drawable = this.f2406a.getDrawable();
        if (drawable != null) {
            C0725i0.m3581b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!mo3505m() || !mo3493a(drawable)) {
            C0715f1 f1Var = this.f2408c;
            if (f1Var != null) {
                C0716g.m3509j(drawable, f1Var, this.f2406a.getDrawableState());
                return;
            }
            C0715f1 f1Var2 = this.f2407b;
            if (f1Var2 != null) {
                C0716g.m3509j(drawable, f1Var2, this.f2406a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList mo3496d() {
        C0715f1 f1Var = this.f2408c;
        if (f1Var != null) {
            return f1Var.f2372a;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode mo3497e() {
        C0715f1 f1Var = this.f2408c;
        if (f1Var != null) {
            return f1Var.f2373b;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo3498f() {
        if (this.f2406a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo3499g(AttributeSet attributeSet, int i) {
        int u;
        Context context = this.f2406a.getContext();
        int[] iArr = C0387a.C0400m.AppCompatImageView;
        C0722h1 G = C0722h1.m3539G(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f2406a;
        C18196h2.m82658z1(imageView, imageView.getContext(), iArr, attributeSet, G.mo3454B(), i, 0);
        try {
            Drawable drawable = this.f2406a.getDrawable();
            if (!(drawable != null || (u = G.mo3479u(C0387a.C0400m.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C0507a.m2346b(this.f2406a.getContext(), u)) == null)) {
                this.f2406a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0725i0.m3581b(drawable);
            }
            int i2 = C0387a.C0400m.AppCompatImageView_tint;
            if (G.mo3455C(i2)) {
                C18483j.m83673c(this.f2406a, G.mo3462d(i2));
            }
            int i3 = C0387a.C0400m.AppCompatImageView_tintMode;
            if (G.mo3455C(i3)) {
                C18483j.m83674d(this.f2406a, C0725i0.m3584e(G.mo3473o(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            G.mo3458I();
        }
    }

    /* renamed from: h */
    public void mo3500h(@C0359n0 Drawable drawable) {
        this.f2410e = drawable.getLevel();
    }

    /* renamed from: i */
    public void mo3501i(int i) {
        if (i != 0) {
            Drawable b = C0507a.m2346b(this.f2406a.getContext(), i);
            if (b != null) {
                C0725i0.m3581b(b);
            }
            this.f2406a.setImageDrawable(b);
        } else {
            this.f2406a.setImageDrawable((Drawable) null);
        }
        mo3495c();
    }

    /* renamed from: j */
    public void mo3502j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2407b == null) {
                this.f2407b = new C0715f1();
            }
            C0715f1 f1Var = this.f2407b;
            f1Var.f2372a = colorStateList;
            f1Var.f2375d = true;
        } else {
            this.f2407b = null;
        }
        mo3495c();
    }

    /* renamed from: k */
    public void mo3503k(ColorStateList colorStateList) {
        if (this.f2408c == null) {
            this.f2408c = new C0715f1();
        }
        C0715f1 f1Var = this.f2408c;
        f1Var.f2372a = colorStateList;
        f1Var.f2375d = true;
        mo3495c();
    }

    /* renamed from: l */
    public void mo3504l(PorterDuff.Mode mode) {
        if (this.f2408c == null) {
            this.f2408c = new C0715f1();
        }
        C0715f1 f1Var = this.f2408c;
        f1Var.f2373b = mode;
        f1Var.f2374c = true;
        mo3495c();
    }

    /* renamed from: m */
    public final boolean mo3505m() {
        return this.f2407b != null;
    }
}
