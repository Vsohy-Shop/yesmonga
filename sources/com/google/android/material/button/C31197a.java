package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.C0352k;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31432x;
import com.google.android.material.resources.C31500c;
import com.google.android.material.ripple.C31508a;
import com.google.android.material.ripple.C31511b;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.button.a */
public class C31197a {
    @C0352k(api = 21)

    /* renamed from: t */
    public static final boolean f74927t = true;

    /* renamed from: u */
    public static final boolean f74928u = false;

    /* renamed from: a */
    public final MaterialButton f74929a;
    @C0359n0

    /* renamed from: b */
    public C31534o f74930b;

    /* renamed from: c */
    public int f74931c;

    /* renamed from: d */
    public int f74932d;

    /* renamed from: e */
    public int f74933e;

    /* renamed from: f */
    public int f74934f;

    /* renamed from: g */
    public int f74935g;

    /* renamed from: h */
    public int f74936h;
    @C0363p0

    /* renamed from: i */
    public PorterDuff.Mode f74937i;
    @C0363p0

    /* renamed from: j */
    public ColorStateList f74938j;
    @C0363p0

    /* renamed from: k */
    public ColorStateList f74939k;
    @C0363p0

    /* renamed from: l */
    public ColorStateList f74940l;
    @C0363p0

    /* renamed from: m */
    public Drawable f74941m;

    /* renamed from: n */
    public boolean f74942n = false;

    /* renamed from: o */
    public boolean f74943o = false;

    /* renamed from: p */
    public boolean f74944p = false;

    /* renamed from: q */
    public boolean f74945q;

    /* renamed from: r */
    public LayerDrawable f74946r;

    /* renamed from: s */
    public int f74947s;

    public C31197a(MaterialButton materialButton, @C0359n0 C31534o oVar) {
        this.f74929a = materialButton;
        this.f74930b = oVar;
    }

    /* renamed from: A */
    public void mo88601A(@C0363p0 ColorStateList colorStateList) {
        if (this.f74939k != colorStateList) {
            this.f74939k = colorStateList;
            mo88609I();
        }
    }

    /* renamed from: B */
    public void mo88602B(int i) {
        if (this.f74936h != i) {
            this.f74936h = i;
            mo88609I();
        }
    }

    /* renamed from: C */
    public void mo88603C(@C0363p0 ColorStateList colorStateList) {
        if (this.f74938j != colorStateList) {
            this.f74938j = colorStateList;
            if (mo88616f() != null) {
                C17549d.m80453o(mo88616f(), this.f74938j);
            }
        }
    }

    /* renamed from: D */
    public void mo88604D(@C0363p0 PorterDuff.Mode mode) {
        if (this.f74937i != mode) {
            this.f74937i = mode;
            if (mo88616f() != null && this.f74937i != null) {
                C17549d.m80454p(mo88616f(), this.f74937i);
            }
        }
    }

    /* renamed from: E */
    public final void mo88605E(@C0366r int i, @C0366r int i2) {
        int k0 = C18196h2.m82597k0(this.f74929a);
        int paddingTop = this.f74929a.getPaddingTop();
        int j0 = C18196h2.m82593j0(this.f74929a);
        int paddingBottom = this.f74929a.getPaddingBottom();
        int i3 = this.f74933e;
        int i4 = this.f74934f;
        this.f74934f = i2;
        this.f74933e = i;
        if (!this.f74943o) {
            mo88606F();
        }
        C18196h2.m82571d2(this.f74929a, k0, (paddingTop + i) - i3, j0, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    public final void mo88606F() {
        this.f74929a.setInternalBackground(mo88611a());
        C31525j f = mo88616f();
        if (f != null) {
            f.mo90775n0((float) this.f74947s);
        }
    }

    /* renamed from: G */
    public final void mo88607G(@C0359n0 C31534o oVar) {
        if (!f74928u || this.f74943o) {
            if (mo88616f() != null) {
                mo88616f().setShapeAppearanceModel(oVar);
            }
            if (mo88624n() != null) {
                mo88624n().setShapeAppearanceModel(oVar);
            }
            if (mo88615e() != null) {
                mo88615e().setShapeAppearanceModel(oVar);
                return;
            }
            return;
        }
        int k0 = C18196h2.m82597k0(this.f74929a);
        int paddingTop = this.f74929a.getPaddingTop();
        int j0 = C18196h2.m82593j0(this.f74929a);
        int paddingBottom = this.f74929a.getPaddingBottom();
        mo88606F();
        C18196h2.m82571d2(this.f74929a, k0, paddingTop, j0, paddingBottom);
    }

    /* renamed from: H */
    public void mo88608H(int i, int i2) {
        Drawable drawable = this.f74941m;
        if (drawable != null) {
            drawable.setBounds(this.f74931c, this.f74933e, i2 - this.f74932d, i - this.f74934f);
        }
    }

    /* renamed from: I */
    public final void mo88609I() {
        int i;
        C31525j f = mo88616f();
        C31525j n = mo88624n();
        if (f != null) {
            f.mo90719E0((float) this.f74936h, this.f74939k);
            if (n != null) {
                float f2 = (float) this.f74936h;
                if (this.f74942n) {
                    i = C31266s.m125953d(this.f74929a, C31076a.C31079c.colorSurface);
                } else {
                    i = 0;
                }
                n.mo90717D0(f2, i);
            }
        }
    }

    @C0359n0
    /* renamed from: J */
    public final InsetDrawable mo88610J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f74931c, this.f74933e, this.f74932d, this.f74934f);
    }

    /* renamed from: a */
    public final Drawable mo88611a() {
        int i;
        C31525j jVar = new C31525j(this.f74930b);
        jVar.mo90750Z(this.f74929a.getContext());
        C17549d.m80453o(jVar, this.f74938j);
        PorterDuff.Mode mode = this.f74937i;
        if (mode != null) {
            C17549d.m80454p(jVar, mode);
        }
        jVar.mo90719E0((float) this.f74936h, this.f74939k);
        C31525j jVar2 = new C31525j(this.f74930b);
        jVar2.setTint(0);
        float f = (float) this.f74936h;
        if (this.f74942n) {
            i = C31266s.m125953d(this.f74929a, C31076a.C31079c.colorSurface);
        } else {
            i = 0;
        }
        jVar2.mo90717D0(f, i);
        if (f74927t) {
            C31525j jVar3 = new C31525j(this.f74930b);
            this.f74941m = jVar3;
            C17549d.m80452n(jVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C31511b.m127405d(this.f74940l), mo88610J(new LayerDrawable(new Drawable[]{jVar2, jVar})), this.f74941m);
            this.f74946r = rippleDrawable;
            return rippleDrawable;
        }
        C31508a aVar = new C31508a(this.f74930b);
        this.f74941m = aVar;
        C17549d.m80453o(aVar, C31511b.m127405d(this.f74940l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar, this.f74941m});
        this.f74946r = layerDrawable;
        return mo88610J(layerDrawable);
    }

    /* renamed from: b */
    public int mo88612b() {
        return this.f74935g;
    }

    /* renamed from: c */
    public int mo88613c() {
        return this.f74934f;
    }

    /* renamed from: d */
    public int mo88614d() {
        return this.f74933e;
    }

    @C0363p0
    /* renamed from: e */
    public C31553s mo88615e() {
        LayerDrawable layerDrawable = this.f74946r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f74946r.getNumberOfLayers() > 2) {
            return (C31553s) this.f74946r.getDrawable(2);
        }
        return (C31553s) this.f74946r.getDrawable(1);
    }

    @C0363p0
    /* renamed from: f */
    public C31525j mo88616f() {
        return mo88617g(false);
    }

    @C0363p0
    /* renamed from: g */
    public final C31525j mo88617g(boolean z) {
        LayerDrawable layerDrawable = this.f74946r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f74927t) {
            return (C31525j) ((LayerDrawable) ((InsetDrawable) this.f74946r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C31525j) this.f74946r.getDrawable(z ^ true ? 1 : 0);
    }

    @C0363p0
    /* renamed from: h */
    public ColorStateList mo88618h() {
        return this.f74940l;
    }

    @C0359n0
    /* renamed from: i */
    public C31534o mo88619i() {
        return this.f74930b;
    }

    @C0363p0
    /* renamed from: j */
    public ColorStateList mo88620j() {
        return this.f74939k;
    }

    /* renamed from: k */
    public int mo88621k() {
        return this.f74936h;
    }

    /* renamed from: l */
    public ColorStateList mo88622l() {
        return this.f74938j;
    }

    /* renamed from: m */
    public PorterDuff.Mode mo88623m() {
        return this.f74937i;
    }

    @C0363p0
    /* renamed from: n */
    public final C31525j mo88624n() {
        return mo88617g(true);
    }

    /* renamed from: o */
    public boolean mo88625o() {
        return this.f74943o;
    }

    /* renamed from: p */
    public boolean mo88626p() {
        return this.f74945q;
    }

    /* renamed from: q */
    public void mo88627q(@C0359n0 TypedArray typedArray) {
        this.f74931c = typedArray.getDimensionPixelOffset(C31076a.C31091o.MaterialButton_android_insetLeft, 0);
        this.f74932d = typedArray.getDimensionPixelOffset(C31076a.C31091o.MaterialButton_android_insetRight, 0);
        this.f74933e = typedArray.getDimensionPixelOffset(C31076a.C31091o.MaterialButton_android_insetTop, 0);
        this.f74934f = typedArray.getDimensionPixelOffset(C31076a.C31091o.MaterialButton_android_insetBottom, 0);
        int i = C31076a.C31091o.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f74935g = dimensionPixelSize;
            mo88635y(this.f74930b.mo90823w((float) dimensionPixelSize));
            this.f74944p = true;
        }
        this.f74936h = typedArray.getDimensionPixelSize(C31076a.C31091o.MaterialButton_strokeWidth, 0);
        this.f74937i = C31432x.m127017l(typedArray.getInt(C31076a.C31091o.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f74938j = C31500c.m127363a(this.f74929a.getContext(), typedArray, C31076a.C31091o.MaterialButton_backgroundTint);
        this.f74939k = C31500c.m127363a(this.f74929a.getContext(), typedArray, C31076a.C31091o.MaterialButton_strokeColor);
        this.f74940l = C31500c.m127363a(this.f74929a.getContext(), typedArray, C31076a.C31091o.MaterialButton_rippleColor);
        this.f74945q = typedArray.getBoolean(C31076a.C31091o.MaterialButton_android_checkable, false);
        this.f74947s = typedArray.getDimensionPixelSize(C31076a.C31091o.MaterialButton_elevation, 0);
        int k0 = C18196h2.m82597k0(this.f74929a);
        int paddingTop = this.f74929a.getPaddingTop();
        int j0 = C18196h2.m82593j0(this.f74929a);
        int paddingBottom = this.f74929a.getPaddingBottom();
        if (typedArray.hasValue(C31076a.C31091o.MaterialButton_android_background)) {
            mo88629s();
        } else {
            mo88606F();
        }
        C18196h2.m82571d2(this.f74929a, k0 + this.f74931c, paddingTop + this.f74933e, j0 + this.f74932d, paddingBottom + this.f74934f);
    }

    /* renamed from: r */
    public void mo88628r(int i) {
        if (mo88616f() != null) {
            mo88616f().setTint(i);
        }
    }

    /* renamed from: s */
    public void mo88629s() {
        this.f74943o = true;
        this.f74929a.setSupportBackgroundTintList(this.f74938j);
        this.f74929a.setSupportBackgroundTintMode(this.f74937i);
    }

    /* renamed from: t */
    public void mo88630t(boolean z) {
        this.f74945q = z;
    }

    /* renamed from: u */
    public void mo88631u(int i) {
        if (!this.f74944p || this.f74935g != i) {
            this.f74935g = i;
            this.f74944p = true;
            mo88635y(this.f74930b.mo90823w((float) i));
        }
    }

    /* renamed from: v */
    public void mo88632v(@C0366r int i) {
        mo88605E(this.f74933e, i);
    }

    /* renamed from: w */
    public void mo88633w(@C0366r int i) {
        mo88605E(i, this.f74934f);
    }

    /* renamed from: x */
    public void mo88634x(@C0363p0 ColorStateList colorStateList) {
        if (this.f74940l != colorStateList) {
            this.f74940l = colorStateList;
            boolean z = f74927t;
            if (z && (this.f74929a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f74929a.getBackground()).setColor(C31511b.m127405d(colorStateList));
            } else if (!z && (this.f74929a.getBackground() instanceof C31508a)) {
                ((C31508a) this.f74929a.getBackground()).setTintList(C31511b.m127405d(colorStateList));
            }
        }
    }

    /* renamed from: y */
    public void mo88635y(@C0359n0 C31534o oVar) {
        this.f74930b = oVar;
        mo88607G(oVar);
    }

    /* renamed from: z */
    public void mo88636z(boolean z) {
        this.f74942n = z;
        mo88609I();
    }
}
