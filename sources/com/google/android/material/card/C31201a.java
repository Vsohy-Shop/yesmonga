package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.C0327c1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0366r;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.color.C31266s;
import com.google.android.material.resources.C31500c;
import com.google.android.material.ripple.C31511b;
import com.google.android.material.shape.C31519e;
import com.google.android.material.shape.C31520f;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31533n;
import com.google.android.material.shape.C31534o;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.card.a */
public class C31201a {

    /* renamed from: u */
    public static final int f74963u = -1;

    /* renamed from: v */
    public static final double f74964v = Math.cos(Math.toRadians(45.0d));

    /* renamed from: w */
    public static final float f74965w = 1.5f;

    /* renamed from: x */
    public static final int f74966x = 2;

    /* renamed from: y */
    public static final Drawable f74967y;
    @C0359n0

    /* renamed from: a */
    public final MaterialCardView f74968a;
    @C0359n0

    /* renamed from: b */
    public final Rect f74969b = new Rect();
    @C0359n0

    /* renamed from: c */
    public final C31525j f74970c;
    @C0359n0

    /* renamed from: d */
    public final C31525j f74971d;
    @C0366r

    /* renamed from: e */
    public int f74972e;
    @C0366r

    /* renamed from: f */
    public int f74973f;

    /* renamed from: g */
    public int f74974g;
    @C0366r

    /* renamed from: h */
    public int f74975h;
    @C0363p0

    /* renamed from: i */
    public Drawable f74976i;
    @C0363p0

    /* renamed from: j */
    public Drawable f74977j;
    @C0363p0

    /* renamed from: k */
    public ColorStateList f74978k;
    @C0363p0

    /* renamed from: l */
    public ColorStateList f74979l;
    @C0363p0

    /* renamed from: m */
    public C31534o f74980m;
    @C0363p0

    /* renamed from: n */
    public ColorStateList f74981n;
    @C0363p0

    /* renamed from: o */
    public Drawable f74982o;
    @C0363p0

    /* renamed from: p */
    public LayerDrawable f74983p;
    @C0363p0

    /* renamed from: q */
    public C31525j f74984q;
    @C0363p0

    /* renamed from: r */
    public C31525j f74985r;

    /* renamed from: s */
    public boolean f74986s = false;

    /* renamed from: t */
    public boolean f74987t;

    /* renamed from: com.google.android.material.card.a$a */
    public class C31202a extends InsetDrawable {
        public C31202a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f74967y = colorDrawable;
    }

    public C31201a(@C0359n0 MaterialCardView materialCardView, AttributeSet attributeSet, int i, @C0327c1 int i2) {
        this.f74968a = materialCardView;
        C31525j jVar = new C31525j(materialCardView.getContext(), attributeSet, i, i2);
        this.f74970c = jVar;
        jVar.mo90750Z(materialCardView.getContext());
        jVar.mo90792v0(-12303292);
        C31534o.C31536b v = jVar.getShapeAppearanceModel().mo90822v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C31076a.C31091o.CardView, i, C31076a.C31090n.CardView);
        int i3 = C31076a.C31091o.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.mo90844o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f74971d = new C31525j();
        mo88704V(v.mo90843m());
        obtainStyledAttributes.recycle();
    }

    @C0359n0
    /* renamed from: A */
    public Rect mo88683A() {
        return this.f74969b;
    }

    @C0359n0
    /* renamed from: B */
    public final Drawable mo88684B(Drawable drawable) {
        int i;
        int i2;
        if (this.f74968a.getUseCompatPadding()) {
            i = (int) Math.ceil((double) mo88715d());
            i2 = (int) Math.ceil((double) mo88713c());
        } else {
            i2 = 0;
            i = 0;
        }
        return new C31202a(drawable, i2, i, i2, i);
    }

    /* renamed from: C */
    public boolean mo88685C() {
        return this.f74986s;
    }

    /* renamed from: D */
    public boolean mo88686D() {
        return this.f74987t;
    }

    /* renamed from: E */
    public final boolean mo88687E() {
        return (this.f74974g & 80) == 80;
    }

    /* renamed from: F */
    public final boolean mo88688F() {
        return (this.f74974g & 8388613) == 8388613;
    }

    /* renamed from: G */
    public void mo88689G(@C0359n0 TypedArray typedArray) {
        Drawable drawable;
        ColorStateList a = C31500c.m127363a(this.f74968a.getContext(), typedArray, C31076a.C31091o.MaterialCardView_strokeColor);
        this.f74981n = a;
        if (a == null) {
            this.f74981n = ColorStateList.valueOf(-1);
        }
        this.f74975h = typedArray.getDimensionPixelSize(C31076a.C31091o.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C31076a.C31091o.MaterialCardView_android_checkable, false);
        this.f74987t = z;
        this.f74968a.setLongClickable(z);
        this.f74979l = C31500c.m127363a(this.f74968a.getContext(), typedArray, C31076a.C31091o.MaterialCardView_checkedIconTint);
        mo88696N(C31500c.m127367e(this.f74968a.getContext(), typedArray, C31076a.C31091o.MaterialCardView_checkedIcon));
        mo88699Q(typedArray.getDimensionPixelSize(C31076a.C31091o.MaterialCardView_checkedIconSize, 0));
        mo88698P(typedArray.getDimensionPixelSize(C31076a.C31091o.MaterialCardView_checkedIconMargin, 0));
        this.f74974g = typedArray.getInteger(C31076a.C31091o.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList a2 = C31500c.m127363a(this.f74968a.getContext(), typedArray, C31076a.C31091o.MaterialCardView_rippleColor);
        this.f74978k = a2;
        if (a2 == null) {
            this.f74978k = ColorStateList.valueOf(C31266s.m125953d(this.f74968a, C31076a.C31079c.colorControlHighlight));
        }
        mo88693K(C31500c.m127363a(this.f74968a.getContext(), typedArray, C31076a.C31091o.MaterialCardView_cardForegroundColor));
        mo88722g0();
        mo88716d0();
        mo88724h0();
        this.f74968a.setBackgroundInternal(mo88684B(this.f74970c));
        if (this.f74968a.isClickable()) {
            drawable = mo88734r();
        } else {
            drawable = this.f74971d;
        }
        this.f74976i = drawable;
        this.f74968a.setForeground(mo88684B(drawable));
    }

    /* renamed from: H */
    public void mo88690H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f74983p != null) {
            if (this.f74968a.getUseCompatPadding()) {
                i4 = (int) Math.ceil((double) (mo88715d() * 2.0f));
                i3 = (int) Math.ceil((double) (mo88713c() * 2.0f));
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (mo88688F()) {
                i5 = ((i - this.f74972e) - this.f74973f) - i3;
            } else {
                i5 = this.f74972e;
            }
            if (mo88687E()) {
                i6 = this.f74972e;
            } else {
                i6 = ((i2 - this.f74972e) - this.f74973f) - i4;
            }
            int i11 = i6;
            if (mo88688F()) {
                i7 = this.f74972e;
            } else {
                i7 = ((i - this.f74972e) - this.f74973f) - i3;
            }
            if (mo88687E()) {
                i8 = ((i2 - this.f74972e) - this.f74973f) - i4;
            } else {
                i8 = this.f74972e;
            }
            int i12 = i8;
            if (C18196h2.m82553Z(this.f74968a) == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.f74983p.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    /* renamed from: I */
    public void mo88691I(boolean z) {
        this.f74986s = z;
    }

    /* renamed from: J */
    public void mo88692J(ColorStateList colorStateList) {
        this.f74970c.mo90777o0(colorStateList);
    }

    /* renamed from: K */
    public void mo88693K(@C0363p0 ColorStateList colorStateList) {
        C31525j jVar = this.f74971d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.mo90777o0(colorStateList);
    }

    /* renamed from: L */
    public void mo88694L(boolean z) {
        this.f74987t = z;
    }

    /* renamed from: M */
    public void mo88695M(boolean z) {
        int i;
        Drawable drawable = this.f74977j;
        if (drawable != null) {
            if (z) {
                i = 255;
            } else {
                i = 0;
            }
            drawable.setAlpha(i);
        }
    }

    /* renamed from: N */
    public void mo88696N(@C0363p0 Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = C17549d.m80456r(drawable).mutate();
            this.f74977j = mutate;
            C17549d.m80453o(mutate, this.f74979l);
            mo88695M(this.f74968a.isChecked());
        } else {
            this.f74977j = f74967y;
        }
        LayerDrawable layerDrawable = this.f74983p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C31076a.C31084h.mtrl_card_checked_layer_id, this.f74977j);
        }
    }

    /* renamed from: O */
    public void mo88697O(int i) {
        this.f74974g = i;
        mo88690H(this.f74968a.getMeasuredWidth(), this.f74968a.getMeasuredHeight());
    }

    /* renamed from: P */
    public void mo88698P(@C0366r int i) {
        this.f74972e = i;
    }

    /* renamed from: Q */
    public void mo88699Q(@C0366r int i) {
        this.f74973f = i;
    }

    /* renamed from: R */
    public void mo88700R(@C0363p0 ColorStateList colorStateList) {
        this.f74979l = colorStateList;
        Drawable drawable = this.f74977j;
        if (drawable != null) {
            C17549d.m80453o(drawable, colorStateList);
        }
    }

    /* renamed from: S */
    public void mo88701S(float f) {
        mo88704V(this.f74980m.mo90823w(f));
        this.f74976i.invalidateSelf();
        if (mo88710a0() || mo88708Z()) {
            mo88714c0();
        }
        if (mo88710a0()) {
            mo88720f0();
        }
    }

    /* renamed from: T */
    public void mo88702T(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f74970c.mo90780p0(f);
        C31525j jVar = this.f74971d;
        if (jVar != null) {
            jVar.mo90780p0(f);
        }
        C31525j jVar2 = this.f74985r;
        if (jVar2 != null) {
            jVar2.mo90780p0(f);
        }
    }

    /* renamed from: U */
    public void mo88703U(@C0363p0 ColorStateList colorStateList) {
        this.f74978k = colorStateList;
        mo88722g0();
    }

    /* renamed from: V */
    public void mo88704V(@C0359n0 C31534o oVar) {
        this.f74980m = oVar;
        this.f74970c.setShapeAppearanceModel(oVar);
        C31525j jVar = this.f74970c;
        jVar.mo90790u0(!jVar.mo90755e0());
        C31525j jVar2 = this.f74971d;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(oVar);
        }
        C31525j jVar3 = this.f74985r;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(oVar);
        }
        C31525j jVar4 = this.f74984q;
        if (jVar4 != null) {
            jVar4.setShapeAppearanceModel(oVar);
        }
    }

    /* renamed from: W */
    public void mo88705W(ColorStateList colorStateList) {
        if (this.f74981n != colorStateList) {
            this.f74981n = colorStateList;
            mo88724h0();
        }
    }

    /* renamed from: X */
    public void mo88706X(@C0366r int i) {
        if (i != this.f74975h) {
            this.f74975h = i;
            mo88724h0();
        }
    }

    /* renamed from: Y */
    public void mo88707Y(int i, int i2, int i3, int i4) {
        this.f74969b.set(i, i2, i3, i4);
        mo88714c0();
    }

    /* renamed from: Z */
    public final boolean mo88708Z() {
        return this.f74968a.getPreventCornerOverlap() && !mo88717e();
    }

    /* renamed from: a */
    public final float mo88709a() {
        return Math.max(Math.max(mo88711b(this.f74980m.mo90817q(), this.f74970c.mo90743S()), mo88711b(this.f74980m.mo90819s(), this.f74970c.mo90744T())), Math.max(mo88711b(this.f74980m.mo90812k(), this.f74970c.mo90789u()), mo88711b(this.f74980m.mo90810i(), this.f74970c.mo90787t())));
    }

    /* renamed from: a0 */
    public final boolean mo88710a0() {
        if (!this.f74968a.getPreventCornerOverlap() || !mo88717e() || !this.f74968a.getUseCompatPadding()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final float mo88711b(C31519e eVar, float f) {
        if (eVar instanceof C31533n) {
            return (float) ((1.0d - f74964v) * ((double) f));
        }
        if (eVar instanceof C31520f) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: b0 */
    public void mo88712b0() {
        Drawable drawable;
        Drawable drawable2 = this.f74976i;
        if (this.f74968a.isClickable()) {
            drawable = mo88734r();
        } else {
            drawable = this.f74971d;
        }
        this.f74976i = drawable;
        if (drawable2 != drawable) {
            mo88718e0(drawable);
        }
    }

    /* renamed from: c */
    public final float mo88713c() {
        float f;
        float maxCardElevation = this.f74968a.getMaxCardElevation();
        if (mo88710a0()) {
            f = mo88709a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: c0 */
    public void mo88714c0() {
        boolean z;
        float f;
        if (mo88708Z() || mo88710a0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = mo88709a();
        } else {
            f = 0.0f;
        }
        int t = (int) (f - mo88736t());
        MaterialCardView materialCardView = this.f74968a;
        Rect rect = this.f74969b;
        materialCardView.mo88653l(rect.left + t, rect.top + t, rect.right + t, rect.bottom + t);
    }

    /* renamed from: d */
    public final float mo88715d() {
        float f;
        float maxCardElevation = this.f74968a.getMaxCardElevation() * 1.5f;
        if (mo88710a0()) {
            f = mo88709a();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    /* renamed from: d0 */
    public void mo88716d0() {
        this.f74970c.mo90775n0(this.f74968a.getCardElevation());
    }

    /* renamed from: e */
    public final boolean mo88717e() {
        return this.f74970c.mo90755e0();
    }

    /* renamed from: e0 */
    public final void mo88718e0(Drawable drawable) {
        if (this.f74968a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f74968a.getForeground()).setDrawable(drawable);
        } else {
            this.f74968a.setForeground(mo88684B(drawable));
        }
    }

    @C0359n0
    /* renamed from: f */
    public final Drawable mo88719f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C31525j h = mo88723h();
        this.f74984q = h;
        h.mo90777o0(this.f74978k);
        stateListDrawable.addState(new int[]{16842919}, this.f74984q);
        return stateListDrawable;
    }

    /* renamed from: f0 */
    public void mo88720f0() {
        if (!mo88685C()) {
            this.f74968a.setBackgroundInternal(mo88684B(this.f74970c));
        }
        this.f74968a.setForeground(mo88684B(this.f74976i));
    }

    @C0359n0
    /* renamed from: g */
    public final Drawable mo88721g() {
        if (!C31511b.f76296a) {
            return mo88719f();
        }
        this.f74985r = mo88723h();
        return new RippleDrawable(this.f74978k, (Drawable) null, this.f74985r);
    }

    /* renamed from: g0 */
    public final void mo88722g0() {
        Drawable drawable;
        if (!C31511b.f76296a || (drawable = this.f74982o) == null) {
            C31525j jVar = this.f74984q;
            if (jVar != null) {
                jVar.mo90777o0(this.f74978k);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f74978k);
    }

    @C0359n0
    /* renamed from: h */
    public final C31525j mo88723h() {
        return new C31525j(this.f74980m);
    }

    /* renamed from: h0 */
    public void mo88724h0() {
        this.f74971d.mo90719E0((float) this.f74975h, this.f74981n);
    }

    @C0376v0(api = 23)
    /* renamed from: i */
    public void mo88725i() {
        Drawable drawable = this.f74982o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f74982o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f74982o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @C0359n0
    /* renamed from: j */
    public C31525j mo88726j() {
        return this.f74970c;
    }

    /* renamed from: k */
    public ColorStateList mo88727k() {
        return this.f74970c.mo90797y();
    }

    /* renamed from: l */
    public ColorStateList mo88728l() {
        return this.f74971d.mo90797y();
    }

    @C0363p0
    /* renamed from: m */
    public Drawable mo88729m() {
        return this.f74977j;
    }

    /* renamed from: n */
    public int mo88730n() {
        return this.f74974g;
    }

    @C0366r
    /* renamed from: o */
    public int mo88731o() {
        return this.f74972e;
    }

    @C0366r
    /* renamed from: p */
    public int mo88732p() {
        return this.f74973f;
    }

    @C0363p0
    /* renamed from: q */
    public ColorStateList mo88733q() {
        return this.f74979l;
    }

    @C0359n0
    /* renamed from: r */
    public final Drawable mo88734r() {
        if (this.f74982o == null) {
            this.f74982o = mo88721g();
        }
        if (this.f74983p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f74982o, this.f74971d, this.f74977j});
            this.f74983p = layerDrawable;
            layerDrawable.setId(2, C31076a.C31084h.mtrl_card_checked_layer_id);
        }
        return this.f74983p;
    }

    /* renamed from: s */
    public float mo88735s() {
        return this.f74970c.mo90743S();
    }

    /* renamed from: t */
    public final float mo88736t() {
        if (!this.f74968a.getPreventCornerOverlap() || !this.f74968a.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - f74964v) * ((double) this.f74968a.getCardViewRadius()));
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: u */
    public float mo88737u() {
        return this.f74970c.mo90799z();
    }

    @C0363p0
    /* renamed from: v */
    public ColorStateList mo88738v() {
        return this.f74978k;
    }

    /* renamed from: w */
    public C31534o mo88739w() {
        return this.f74980m;
    }

    @C0354l
    /* renamed from: x */
    public int mo88740x() {
        ColorStateList colorStateList = this.f74981n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @C0363p0
    /* renamed from: y */
    public ColorStateList mo88741y() {
        return this.f74981n;
    }

    @C0366r
    /* renamed from: z */
    public int mo88742z() {
        return this.f74975h;
    }
}
