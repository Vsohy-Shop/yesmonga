package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.C0322b;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0342h;
import androidx.annotation.C0351j1;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.appcompat.content.res.C0507a;
import androidx.core.graphics.C17586h0;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.graphics.drawable.C17567r;
import androidx.core.internal.view.C17673a;
import androidx.core.text.C17897a;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31100h;
import com.google.android.material.canvas.C31198a;
import com.google.android.material.color.C31266s;
import com.google.android.material.drawable.C31332a;
import com.google.android.material.internal.C31416m;
import com.google.android.material.internal.C31422p;
import com.google.android.material.internal.C31432x;
import com.google.android.material.resources.C31500c;
import com.google.android.material.resources.C31501d;
import com.google.android.material.ripple.C31511b;
import com.google.android.material.shape.C31525j;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.google.android.material.chip.a */
public class C31213a extends C31525j implements C17567r, Drawable.Callback, C31416m.C31418b {

    /* renamed from: d2 */
    public static final boolean f75042d2 = false;

    /* renamed from: e2 */
    public static final int[] f75043e2 = {16842910};

    /* renamed from: f2 */
    public static final String f75044f2 = "http://schemas.android.com/apk/res-auto";

    /* renamed from: g2 */
    public static final int f75045g2 = 24;

    /* renamed from: h2 */
    public static final ShapeDrawable f75046h2 = new ShapeDrawable(new OvalShape());
    @C0359n0

    /* renamed from: A1 */
    public final Context f75047A1;

    /* renamed from: B1 */
    public final Paint f75048B1 = new Paint(1);
    @C0363p0

    /* renamed from: C1 */
    public final Paint f75049C1;

    /* renamed from: D1 */
    public final Paint.FontMetrics f75050D1 = new Paint.FontMetrics();

    /* renamed from: E1 */
    public final RectF f75051E1 = new RectF();

    /* renamed from: F1 */
    public final PointF f75052F1 = new PointF();

    /* renamed from: G1 */
    public final Path f75053G1 = new Path();
    @C0359n0

    /* renamed from: H1 */
    public final C31416m f75054H1;
    @C0354l

    /* renamed from: I1 */
    public int f75055I1;
    @C0354l

    /* renamed from: J1 */
    public int f75056J1;
    @C0354l

    /* renamed from: K1 */
    public int f75057K1;
    @C0354l

    /* renamed from: L1 */
    public int f75058L1;
    @C0354l

    /* renamed from: M1 */
    public int f75059M1;
    @C0354l

    /* renamed from: N1 */
    public int f75060N1;

    /* renamed from: O1 */
    public boolean f75061O1;
    @C0354l

    /* renamed from: P1 */
    public int f75062P1;

    /* renamed from: Q1 */
    public int f75063Q1 = 255;
    @C0363p0

    /* renamed from: R1 */
    public ColorFilter f75064R1;
    @C0363p0

    /* renamed from: S1 */
    public PorterDuffColorFilter f75065S1;
    @C0363p0

    /* renamed from: T0 */
    public ColorStateList f75066T0;
    @C0363p0

    /* renamed from: T1 */
    public ColorStateList f75067T1;
    @C0363p0

    /* renamed from: U0 */
    public ColorStateList f75068U0;
    @C0363p0

    /* renamed from: U1 */
    public PorterDuff.Mode f75069U1 = PorterDuff.Mode.SRC_IN;

    /* renamed from: V0 */
    public float f75070V0;

    /* renamed from: V1 */
    public int[] f75071V1;

    /* renamed from: W0 */
    public float f75072W0 = -1.0f;

    /* renamed from: W1 */
    public boolean f75073W1;
    @C0363p0

    /* renamed from: X0 */
    public ColorStateList f75074X0;
    @C0363p0

    /* renamed from: X1 */
    public ColorStateList f75075X1;

    /* renamed from: Y0 */
    public float f75076Y0;
    @C0359n0

    /* renamed from: Y1 */
    public WeakReference<C31214a> f75077Y1 = new WeakReference<>((Object) null);
    @C0363p0

    /* renamed from: Z0 */
    public ColorStateList f75078Z0;

    /* renamed from: Z1 */
    public TextUtils.TruncateAt f75079Z1;
    @C0363p0

    /* renamed from: a1 */
    public CharSequence f75080a1;

    /* renamed from: a2 */
    public boolean f75081a2;

    /* renamed from: b1 */
    public boolean f75082b1;

    /* renamed from: b2 */
    public int f75083b2;
    @C0363p0

    /* renamed from: c1 */
    public Drawable f75084c1;

    /* renamed from: c2 */
    public boolean f75085c2;
    @C0363p0

    /* renamed from: d1 */
    public ColorStateList f75086d1;

    /* renamed from: e1 */
    public float f75087e1;

    /* renamed from: f1 */
    public boolean f75088f1;

    /* renamed from: g1 */
    public boolean f75089g1;
    @C0363p0

    /* renamed from: h1 */
    public Drawable f75090h1;
    @C0363p0

    /* renamed from: i1 */
    public Drawable f75091i1;
    @C0363p0

    /* renamed from: j1 */
    public ColorStateList f75092j1;

    /* renamed from: k1 */
    public float f75093k1;
    @C0363p0

    /* renamed from: l1 */
    public CharSequence f75094l1;

    /* renamed from: m1 */
    public boolean f75095m1;

    /* renamed from: n1 */
    public boolean f75096n1;
    @C0363p0

    /* renamed from: o1 */
    public Drawable f75097o1;
    @C0363p0

    /* renamed from: p1 */
    public ColorStateList f75098p1;
    @C0363p0

    /* renamed from: q1 */
    public C31100h f75099q1;
    @C0363p0

    /* renamed from: r1 */
    public C31100h f75100r1;

    /* renamed from: s1 */
    public float f75101s1;

    /* renamed from: t1 */
    public float f75102t1;

    /* renamed from: u1 */
    public float f75103u1;

    /* renamed from: v1 */
    public float f75104v1;

    /* renamed from: w1 */
    public float f75105w1;

    /* renamed from: x1 */
    public float f75106x1;

    /* renamed from: y1 */
    public float f75107y1;

    /* renamed from: z1 */
    public float f75108z1;

    /* renamed from: com.google.android.material.chip.a$a */
    public interface C31214a {
        /* renamed from: a */
        void mo88762a();
    }

    public C31213a(@C0359n0 Context context, AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        super(context, attributeSet, i, i2);
        mo90750Z(context);
        this.f75047A1 = context;
        C31416m mVar = new C31416m(this);
        this.f75054H1 = mVar;
        this.f75080a1 = "";
        mVar.mo90164e().density = context.getResources().getDisplayMetrics().density;
        this.f75049C1 = null;
        int[] iArr = f75043e2;
        setState(iArr);
        mo89051f3(iArr);
        this.f75081a2 = true;
        if (C31511b.f76296a) {
            f75046h2.setTint(-1);
        }
    }

    /* renamed from: V1 */
    public static boolean m125576V1(@C0363p0 int[] iArr, @C0336f int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @C0359n0
    /* renamed from: a1 */
    public static C31213a m125577a1(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        C31213a aVar = new C31213a(context, attributeSet, i, i2);
        aVar.mo89063i2(attributeSet, i, i2);
        return aVar;
    }

    @C0359n0
    /* renamed from: b1 */
    public static C31213a m125578b1(@C0359n0 Context context, @C0351j1 int i) {
        AttributeSet a = C31332a.m126388a(context, i, "chip");
        int styleAttribute = a.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = C31076a.C31090n.Widget_MaterialComponents_Chip_Entry;
        }
        return m125577a1(context, a, C31076a.C31079c.chipStandaloneStyle, styleAttribute);
    }

    /* renamed from: f2 */
    public static boolean m125579f2(@C0363p0 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: g2 */
    public static boolean m125580g2(@C0363p0 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: h2 */
    public static boolean m125581h2(@C0363p0 C31501d dVar) {
        if (dVar == null || dVar.mo90649i() == null || !dVar.mo90649i().isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: A1 */
    public float mo88957A1() {
        return this.f75107y1;
    }

    /* renamed from: A2 */
    public void mo88958A2(@C0364q int i) {
        mo89123z2(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: A3 */
    public void mo88959A3(@C0327c1 int i) {
        mo89124z3(new C31501d(this.f75047A1, i));
    }

    /* renamed from: B1 */
    public float mo88960B1() {
        return this.f75093k1;
    }

    /* renamed from: B2 */
    public void mo88961B2(@C0363p0 Drawable drawable) {
        Drawable drawable2;
        Drawable q1 = mo89090q1();
        if (q1 != drawable) {
            float R0 = mo89010R0();
            if (drawable != null) {
                drawable2 = C17549d.m80456r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f75084c1 = drawable2;
            float R02 = mo89010R0();
            mo89001O3(q1);
            if (mo88995M3()) {
                mo89002P0(this.f75084c1);
            }
            invalidateSelf();
            if (R0 != R02) {
                mo89068j2();
            }
        }
    }

    /* renamed from: B3 */
    public void mo88962B3(@C0354l int i) {
        mo88965C3(ColorStateList.valueOf(i));
    }

    /* renamed from: C1 */
    public float mo88963C1() {
        return this.f75106x1;
    }

    @Deprecated
    /* renamed from: C2 */
    public void mo88964C2(boolean z) {
        mo88988K2(z);
    }

    /* renamed from: C3 */
    public void mo88965C3(@C0363p0 ColorStateList colorStateList) {
        C31501d Q1 = mo89007Q1();
        if (Q1 != null) {
            Q1.mo90651k(colorStateList);
            invalidateSelf();
        }
    }

    @C0359n0
    /* renamed from: D1 */
    public int[] mo88966D1() {
        return this.f75071V1;
    }

    @Deprecated
    /* renamed from: D2 */
    public void mo88967D2(@C0342h int i) {
        mo88985J2(i);
    }

    /* renamed from: D3 */
    public void mo88968D3(float f) {
        if (this.f75105w1 != f) {
            this.f75105w1 = f;
            invalidateSelf();
            mo89068j2();
        }
    }

    @C0363p0
    /* renamed from: E1 */
    public ColorStateList mo88969E1() {
        return this.f75092j1;
    }

    /* renamed from: E2 */
    public void mo88970E2(@C0375v int i) {
        mo88961B2(C0507a.m2346b(this.f75047A1, i));
    }

    /* renamed from: E3 */
    public void mo88971E3(@C0364q int i) {
        mo88968D3(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: F1 */
    public void mo88972F1(@C0359n0 RectF rectF) {
        mo89019U0(getBounds(), rectF);
    }

    /* renamed from: F2 */
    public void mo88973F2(float f) {
        if (this.f75087e1 != f) {
            float R0 = mo89010R0();
            this.f75087e1 = f;
            float R02 = mo89010R0();
            invalidateSelf();
            if (R0 != R02) {
                mo89068j2();
            }
        }
    }

    /* renamed from: F3 */
    public void mo88974F3(@C0324b1 int i) {
        mo89121y3(this.f75047A1.getResources().getString(i));
    }

    /* renamed from: G1 */
    public final float mo88975G1() {
        Drawable drawable;
        if (this.f75061O1) {
            drawable = this.f75097o1;
        } else {
            drawable = this.f75084c1;
        }
        float f = this.f75087e1;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil((double) C31432x.m127010e(this.f75047A1, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: G2 */
    public void mo88976G2(@C0364q int i) {
        mo88973F2(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: G3 */
    public void mo88977G3(@C0366r float f) {
        C31501d Q1 = mo89007Q1();
        if (Q1 != null) {
            Q1.mo90652l(f);
            this.f75054H1.mo90164e().setTextSize(f);
            mo88225a();
        }
    }

    /* renamed from: H1 */
    public final float mo88978H1() {
        Drawable drawable;
        if (this.f75061O1) {
            drawable = this.f75097o1;
        } else {
            drawable = this.f75084c1;
        }
        float f = this.f75087e1;
        if (f > 0.0f || drawable == null) {
            return f;
        }
        return (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: H2 */
    public void mo88979H2(@C0363p0 ColorStateList colorStateList) {
        this.f75088f1 = true;
        if (this.f75086d1 != colorStateList) {
            this.f75086d1 = colorStateList;
            if (mo88995M3()) {
                C17549d.m80453o(this.f75084c1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: H3 */
    public void mo88980H3(float f) {
        if (this.f75104v1 != f) {
            this.f75104v1 = f;
            invalidateSelf();
            mo89068j2();
        }
    }

    /* renamed from: I1 */
    public TextUtils.TruncateAt mo88981I1() {
        return this.f75079Z1;
    }

    /* renamed from: I2 */
    public void mo88982I2(@C0358n int i) {
        mo88979H2(C0507a.m2345a(this.f75047A1, i));
    }

    /* renamed from: I3 */
    public void mo88983I3(@C0364q int i) {
        mo88980H3(this.f75047A1.getResources().getDimension(i));
    }

    @C0363p0
    /* renamed from: J1 */
    public C31100h mo88984J1() {
        return this.f75100r1;
    }

    /* renamed from: J2 */
    public void mo88985J2(@C0342h int i) {
        mo88988K2(this.f75047A1.getResources().getBoolean(i));
    }

    /* renamed from: J3 */
    public void mo88986J3(boolean z) {
        if (this.f75073W1 != z) {
            this.f75073W1 = z;
            mo89005P3();
            onStateChange(getState());
        }
    }

    /* renamed from: K1 */
    public float mo88987K1() {
        return this.f75103u1;
    }

    /* renamed from: K2 */
    public void mo88988K2(boolean z) {
        boolean z2;
        if (this.f75082b1 != z) {
            boolean M3 = mo88995M3();
            this.f75082b1 = z;
            boolean M32 = mo88995M3();
            if (M3 != M32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (M32) {
                    mo89002P0(this.f75084c1);
                } else {
                    mo89001O3(this.f75084c1);
                }
                invalidateSelf();
                mo89068j2();
            }
        }
    }

    /* renamed from: K3 */
    public boolean mo88989K3() {
        return this.f75081a2;
    }

    /* renamed from: L1 */
    public float mo88990L1() {
        return this.f75102t1;
    }

    /* renamed from: L2 */
    public void mo88991L2(float f) {
        if (this.f75070V0 != f) {
            this.f75070V0 = f;
            invalidateSelf();
            mo89068j2();
        }
    }

    /* renamed from: L3 */
    public final boolean mo88992L3() {
        return this.f75096n1 && this.f75097o1 != null && this.f75061O1;
    }

    @C0372t0
    /* renamed from: M1 */
    public int mo88993M1() {
        return this.f75083b2;
    }

    /* renamed from: M2 */
    public void mo88994M2(@C0364q int i) {
        mo88991L2(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: M3 */
    public final boolean mo88995M3() {
        return this.f75082b1 && this.f75084c1 != null;
    }

    @C0363p0
    /* renamed from: N1 */
    public ColorStateList mo88996N1() {
        return this.f75078Z0;
    }

    /* renamed from: N2 */
    public void mo88997N2(float f) {
        if (this.f75101s1 != f) {
            this.f75101s1 = f;
            invalidateSelf();
            mo89068j2();
        }
    }

    /* renamed from: N3 */
    public final boolean mo88998N3() {
        return this.f75089g1 && this.f75090h1 != null;
    }

    @C0363p0
    /* renamed from: O1 */
    public C31100h mo88999O1() {
        return this.f75099q1;
    }

    /* renamed from: O2 */
    public void mo89000O2(@C0364q int i) {
        mo88997N2(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: O3 */
    public final void mo89001O3(@C0363p0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: P0 */
    public final void mo89002P0(@C0363p0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C17549d.m80451m(drawable, C17549d.m80444f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f75090h1) {
                if (drawable.isStateful()) {
                    drawable.setState(mo88966D1());
                }
                C17549d.m80453o(drawable, this.f75092j1);
                return;
            }
            Drawable drawable2 = this.f75084c1;
            if (drawable == drawable2 && this.f75088f1) {
                C17549d.m80453o(drawable2, this.f75086d1);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    @C0363p0
    /* renamed from: P1 */
    public CharSequence mo89003P1() {
        return this.f75080a1;
    }

    /* renamed from: P2 */
    public void mo89004P2(@C0363p0 ColorStateList colorStateList) {
        if (this.f75074X0 != colorStateList) {
            this.f75074X0 = colorStateList;
            if (this.f75085c2) {
                mo90721F0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: P3 */
    public final void mo89005P3() {
        this.f75075X1 = this.f75073W1 ? C31511b.m127405d(this.f75078Z0) : null;
    }

    /* renamed from: Q0 */
    public final void mo89006Q0(@C0359n0 Rect rect, @C0359n0 RectF rectF) {
        rectF.setEmpty();
        if (mo88995M3() || mo88992L3()) {
            float f = this.f75101s1 + this.f75102t1;
            float H1 = mo88978H1();
            if (C17549d.m80444f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + H1;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - H1;
            }
            float G1 = mo88975G1();
            float exactCenterY = rect.exactCenterY() - (G1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + G1;
        }
    }

    @C0363p0
    /* renamed from: Q1 */
    public C31501d mo89007Q1() {
        return this.f75054H1.mo90163d();
    }

    /* renamed from: Q2 */
    public void mo89008Q2(@C0358n int i) {
        mo89004P2(C0507a.m2345a(this.f75047A1, i));
    }

    @TargetApi(21)
    /* renamed from: Q3 */
    public final void mo89009Q3() {
        this.f75091i1 = new RippleDrawable(C31511b.m127405d(mo88996N1()), this.f75090h1, f75046h2);
    }

    /* renamed from: R0 */
    public float mo89010R0() {
        if (mo88995M3() || mo88992L3()) {
            return this.f75102t1 + mo88978H1() + this.f75103u1;
        }
        return 0.0f;
    }

    /* renamed from: R1 */
    public float mo89011R1() {
        return this.f75105w1;
    }

    /* renamed from: R2 */
    public void mo89012R2(float f) {
        if (this.f75076Y0 != f) {
            this.f75076Y0 = f;
            this.f75048B1.setStrokeWidth(f);
            if (this.f75085c2) {
                super.mo90727I0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: S0 */
    public final void mo89013S0(@C0359n0 Rect rect, @C0359n0 RectF rectF) {
        rectF.set(rect);
        if (mo88998N3()) {
            float f = this.f75108z1 + this.f75107y1 + this.f75093k1 + this.f75106x1 + this.f75105w1;
            if (C17549d.m80444f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: S1 */
    public float mo89014S1() {
        return this.f75104v1;
    }

    /* renamed from: S2 */
    public void mo89015S2(@C0364q int i) {
        mo89012R2(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: T0 */
    public final void mo89016T0(@C0359n0 Rect rect, @C0359n0 RectF rectF) {
        rectF.setEmpty();
        if (mo88998N3()) {
            float f = this.f75108z1 + this.f75107y1;
            if (C17549d.m80444f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f75093k1;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f75093k1;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f75093k1;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    @C0363p0
    /* renamed from: T1 */
    public final ColorFilter mo89017T1() {
        ColorFilter colorFilter = this.f75064R1;
        return colorFilter != null ? colorFilter : this.f75065S1;
    }

    /* renamed from: T2 */
    public final void mo89018T2(@C0363p0 ColorStateList colorStateList) {
        if (this.f75066T0 != colorStateList) {
            this.f75066T0 = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: U0 */
    public final void mo89019U0(@C0359n0 Rect rect, @C0359n0 RectF rectF) {
        rectF.setEmpty();
        if (mo88998N3()) {
            float f = this.f75108z1 + this.f75107y1 + this.f75093k1 + this.f75106x1 + this.f75105w1;
            if (C17549d.m80444f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: U1 */
    public boolean mo89020U1() {
        return this.f75073W1;
    }

    /* renamed from: U2 */
    public void mo89021U2(@C0363p0 Drawable drawable) {
        Drawable drawable2;
        Drawable y1 = mo89119y1();
        if (y1 != drawable) {
            float V0 = mo89022V0();
            if (drawable != null) {
                drawable2 = C17549d.m80456r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f75090h1 = drawable2;
            if (C31511b.f76296a) {
                mo89009Q3();
            }
            float V02 = mo89022V0();
            mo89001O3(y1);
            if (mo88998N3()) {
                mo89002P0(this.f75090h1);
            }
            invalidateSelf();
            if (V0 != V02) {
                mo89068j2();
            }
        }
    }

    /* renamed from: V0 */
    public float mo89022V0() {
        if (mo88998N3()) {
            return this.f75106x1 + this.f75093k1 + this.f75107y1;
        }
        return 0.0f;
    }

    /* renamed from: V2 */
    public void mo89023V2(@C0363p0 CharSequence charSequence) {
        if (this.f75094l1 != charSequence) {
            this.f75094l1 = C17897a.m81419c().mo52311m(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: W0 */
    public final void mo89024W0(@C0359n0 Rect rect, @C0359n0 RectF rectF) {
        rectF.setEmpty();
        if (this.f75080a1 != null) {
            float R0 = this.f75101s1 + mo89010R0() + this.f75104v1;
            float V0 = this.f75108z1 + mo89022V0() + this.f75105w1;
            if (C17549d.m80444f(this) == 0) {
                rectF.left = ((float) rect.left) + R0;
                rectF.right = ((float) rect.right) - V0;
            } else {
                rectF.left = ((float) rect.left) + V0;
                rectF.right = ((float) rect.right) - R0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: W1 */
    public boolean mo89025W1() {
        return this.f75095m1;
    }

    @Deprecated
    /* renamed from: W2 */
    public void mo89026W2(boolean z) {
        mo89069j3(z);
    }

    /* renamed from: X0 */
    public final float mo89027X0() {
        this.f75054H1.mo90164e().getFontMetrics(this.f75050D1);
        Paint.FontMetrics fontMetrics = this.f75050D1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @Deprecated
    /* renamed from: X1 */
    public boolean mo89028X1() {
        return mo89031Y1();
    }

    @Deprecated
    /* renamed from: X2 */
    public void mo89029X2(@C0342h int i) {
        mo89064i3(i);
    }

    @C0359n0
    /* renamed from: Y0 */
    public Paint.Align mo89030Y0(@C0359n0 Rect rect, @C0359n0 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f75080a1 != null) {
            float R0 = this.f75101s1 + mo89010R0() + this.f75104v1;
            if (C17549d.m80444f(this) == 0) {
                pointF.x = ((float) rect.left) + R0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - R0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - mo89027X0();
        }
        return align;
    }

    /* renamed from: Y1 */
    public boolean mo89031Y1() {
        return this.f75096n1;
    }

    /* renamed from: Y2 */
    public void mo89032Y2(float f) {
        if (this.f75107y1 != f) {
            this.f75107y1 = f;
            invalidateSelf();
            if (mo88998N3()) {
                mo89068j2();
            }
        }
    }

    /* renamed from: Z0 */
    public final boolean mo89033Z0() {
        return this.f75096n1 && this.f75097o1 != null && this.f75095m1;
    }

    @Deprecated
    /* renamed from: Z1 */
    public boolean mo89034Z1() {
        return mo89036a2();
    }

    /* renamed from: Z2 */
    public void mo89035Z2(@C0364q int i) {
        mo89032Y2(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: a */
    public void mo88225a() {
        mo89068j2();
        invalidateSelf();
    }

    /* renamed from: a2 */
    public boolean mo89036a2() {
        return this.f75082b1;
    }

    /* renamed from: a3 */
    public void mo89037a3(@C0375v int i) {
        mo89021U2(C0507a.m2346b(this.f75047A1, i));
    }

    @Deprecated
    /* renamed from: b2 */
    public boolean mo89038b2() {
        return mo89044d2();
    }

    /* renamed from: b3 */
    public void mo89039b3(float f) {
        if (this.f75093k1 != f) {
            this.f75093k1 = f;
            invalidateSelf();
            if (mo88998N3()) {
                mo89068j2();
            }
        }
    }

    /* renamed from: c1 */
    public final void mo89040c1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        if (mo88992L3()) {
            mo89006Q0(rect, this.f75051E1);
            RectF rectF = this.f75051E1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f75097o1.setBounds(0, 0, (int) this.f75051E1.width(), (int) this.f75051E1.height());
            this.f75097o1.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: c2 */
    public boolean mo89041c2() {
        return m125580g2(this.f75090h1);
    }

    /* renamed from: c3 */
    public void mo89042c3(@C0364q int i) {
        mo89039b3(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: d1 */
    public final void mo89043d1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        if (!this.f75085c2) {
            this.f75048B1.setColor(this.f75056J1);
            this.f75048B1.setStyle(Paint.Style.FILL);
            this.f75048B1.setColorFilter(mo89017T1());
            this.f75051E1.set(rect);
            canvas.drawRoundRect(this.f75051E1, mo89082o1(), mo89082o1(), this.f75048B1);
        }
    }

    /* renamed from: d2 */
    public boolean mo89044d2() {
        return this.f75089g1;
    }

    /* renamed from: d3 */
    public void mo89045d3(float f) {
        if (this.f75106x1 != f) {
            this.f75106x1 = f;
            invalidateSelf();
            if (mo88998N3()) {
                mo89068j2();
            }
        }
    }

    public void draw(@C0359n0 Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.f75063Q1;
            if (i2 < 255) {
                i = C31198a.m125450a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            } else {
                i = 0;
            }
            mo89052g1(canvas, bounds);
            mo89043d1(canvas, bounds);
            if (this.f75085c2) {
                super.draw(canvas);
            }
            mo89050f1(canvas, bounds);
            mo89062i1(canvas, bounds);
            mo89047e1(canvas, bounds);
            mo89040c1(canvas, bounds);
            if (this.f75081a2) {
                mo89070k1(canvas, bounds);
            }
            mo89060h1(canvas, bounds);
            mo89067j1(canvas, bounds);
            if (this.f75063Q1 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public final void mo89047e1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        if (mo88995M3()) {
            mo89006Q0(rect, this.f75051E1);
            RectF rectF = this.f75051E1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f75084c1.setBounds(0, 0, (int) this.f75051E1.width(), (int) this.f75051E1.height());
            this.f75084c1.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: e2 */
    public boolean mo89048e2() {
        return this.f75085c2;
    }

    /* renamed from: e3 */
    public void mo89049e3(@C0364q int i) {
        mo89045d3(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: f1 */
    public final void mo89050f1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        if (this.f75076Y0 > 0.0f && !this.f75085c2) {
            this.f75048B1.setColor(this.f75058L1);
            this.f75048B1.setStyle(Paint.Style.STROKE);
            if (!this.f75085c2) {
                this.f75048B1.setColorFilter(mo89017T1());
            }
            RectF rectF = this.f75051E1;
            float f = this.f75076Y0;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f75072W0 - (this.f75076Y0 / 2.0f);
            canvas.drawRoundRect(this.f75051E1, f2, f2, this.f75048B1);
        }
    }

    /* renamed from: f3 */
    public boolean mo89051f3(@C0359n0 int[] iArr) {
        if (Arrays.equals(this.f75071V1, iArr)) {
            return false;
        }
        this.f75071V1 = iArr;
        if (mo88998N3()) {
            return mo89071k2(getState(), iArr);
        }
        return false;
    }

    /* renamed from: g1 */
    public final void mo89052g1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        if (!this.f75085c2) {
            this.f75048B1.setColor(this.f75055I1);
            this.f75048B1.setStyle(Paint.Style.FILL);
            this.f75051E1.set(rect);
            canvas.drawRoundRect(this.f75051E1, mo89082o1(), mo89082o1(), this.f75048B1);
        }
    }

    /* renamed from: g3 */
    public void mo89053g3(@C0363p0 ColorStateList colorStateList) {
        if (this.f75092j1 != colorStateList) {
            this.f75092j1 = colorStateList;
            if (mo88998N3()) {
                C17549d.m80453o(this.f75090h1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f75063Q1;
    }

    @C0363p0
    public ColorFilter getColorFilter() {
        return this.f75064R1;
    }

    public int getIntrinsicHeight() {
        return (int) this.f75070V0;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f75101s1 + mo89010R0() + this.f75104v1 + this.f75054H1.mo90165f(mo89003P1().toString()) + this.f75105w1 + mo89022V0() + this.f75108z1), this.f75083b2);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(@C0359n0 Outline outline) {
        if (this.f75085c2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f75072W0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f75072W0);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public final void mo89060h1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        if (mo88998N3()) {
            mo89016T0(rect, this.f75051E1);
            RectF rectF = this.f75051E1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f75090h1.setBounds(0, 0, (int) this.f75051E1.width(), (int) this.f75051E1.height());
            if (C31511b.f76296a) {
                this.f75091i1.setBounds(this.f75090h1.getBounds());
                this.f75091i1.jumpToCurrentState();
                this.f75091i1.draw(canvas);
            } else {
                this.f75090h1.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: h3 */
    public void mo89061h3(@C0358n int i) {
        mo89053g3(C0507a.m2345a(this.f75047A1, i));
    }

    /* renamed from: i1 */
    public final void mo89062i1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        this.f75048B1.setColor(this.f75059M1);
        this.f75048B1.setStyle(Paint.Style.FILL);
        this.f75051E1.set(rect);
        if (!this.f75085c2) {
            canvas.drawRoundRect(this.f75051E1, mo89082o1(), mo89082o1(), this.f75048B1);
            return;
        }
        mo90763h(new RectF(rect), this.f75053G1);
        super.mo90781q(canvas, this.f75048B1, this.f75053G1, mo90791v());
    }

    /* renamed from: i2 */
    public final void mo89063i2(@C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        TypedArray j = C31422p.m126970j(this.f75047A1, attributeSet, C31076a.C31091o.Chip, i, i2, new int[0]);
        this.f75085c2 = j.hasValue(C31076a.C31091o.Chip_shapeAppearance);
        mo89018T2(C31500c.m127363a(this.f75047A1, j, C31076a.C31091o.Chip_chipSurfaceColor));
        mo89111v2(C31500c.m127363a(this.f75047A1, j, C31076a.C31091o.Chip_chipBackgroundColor));
        mo88991L2(j.getDimension(C31076a.C31091o.Chip_chipMinHeight, 0.0f));
        int i3 = C31076a.C31091o.Chip_chipCornerRadius;
        if (j.hasValue(i3)) {
            mo89117x2(j.getDimension(i3, 0.0f));
        }
        mo89004P2(C31500c.m127363a(this.f75047A1, j, C31076a.C31091o.Chip_chipStrokeColor));
        mo89012R2(j.getDimension(C31076a.C31091o.Chip_chipStrokeWidth, 0.0f));
        mo89105t3(C31500c.m127363a(this.f75047A1, j, C31076a.C31091o.Chip_rippleColor));
        mo89121y3(j.getText(C31076a.C31091o.Chip_android_text));
        C31501d g = C31500c.m127369g(this.f75047A1, j, C31076a.C31091o.Chip_android_textAppearance);
        g.mo90652l(j.getDimension(C31076a.C31091o.Chip_android_textSize, g.mo90650j()));
        mo89124z3(g);
        int i4 = j.getInt(C31076a.C31091o.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            mo89075l3(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            mo89075l3(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            mo89075l3(TextUtils.TruncateAt.END);
        }
        mo88988K2(j.getBoolean(C31076a.C31091o.Chip_chipIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(f75044f2, "chipIconEnabled") == null || attributeSet.getAttributeValue(f75044f2, "chipIconVisible") != null)) {
            mo88988K2(j.getBoolean(C31076a.C31091o.Chip_chipIconEnabled, false));
        }
        mo88961B2(C31500c.m127367e(this.f75047A1, j, C31076a.C31091o.Chip_chipIcon));
        int i5 = C31076a.C31091o.Chip_chipIconTint;
        if (j.hasValue(i5)) {
            mo88979H2(C31500c.m127363a(this.f75047A1, j, i5));
        }
        mo88973F2(j.getDimension(C31076a.C31091o.Chip_chipIconSize, -1.0f));
        mo89069j3(j.getBoolean(C31076a.C31091o.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(f75044f2, "closeIconEnabled") == null || attributeSet.getAttributeValue(f75044f2, "closeIconVisible") != null)) {
            mo89069j3(j.getBoolean(C31076a.C31091o.Chip_closeIconEnabled, false));
        }
        mo89021U2(C31500c.m127367e(this.f75047A1, j, C31076a.C31091o.Chip_closeIcon));
        mo89053g3(C31500c.m127363a(this.f75047A1, j, C31076a.C31091o.Chip_closeIconTint));
        mo89039b3(j.getDimension(C31076a.C31091o.Chip_closeIconSize, 0.0f));
        mo89074l2(j.getBoolean(C31076a.C31091o.Chip_android_checkable, false));
        mo89107u2(j.getBoolean(C31076a.C31091o.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(f75044f2, "checkedIconEnabled") == null || attributeSet.getAttributeValue(f75044f2, "checkedIconVisible") != null)) {
            mo89107u2(j.getBoolean(C31076a.C31091o.Chip_checkedIconEnabled, false));
        }
        mo89080n2(C31500c.m127367e(this.f75047A1, j, C31076a.C31091o.Chip_checkedIcon));
        int i6 = C31076a.C31091o.Chip_checkedIconTint;
        if (j.hasValue(i6)) {
            mo89094r2(C31500c.m127363a(this.f75047A1, j, i6));
        }
        mo89115w3(C31100h.m124661c(this.f75047A1, j, C31076a.C31091o.Chip_showMotionSpec));
        mo89078m3(C31100h.m124661c(this.f75047A1, j, C31076a.C31091o.Chip_hideMotionSpec));
        mo88997N2(j.getDimension(C31076a.C31091o.Chip_chipStartPadding, 0.0f));
        mo89092q3(j.getDimension(C31076a.C31091o.Chip_iconStartPadding, 0.0f));
        mo89084o3(j.getDimension(C31076a.C31091o.Chip_iconEndPadding, 0.0f));
        mo88980H3(j.getDimension(C31076a.C31091o.Chip_textStartPadding, 0.0f));
        mo88968D3(j.getDimension(C31076a.C31091o.Chip_textEndPadding, 0.0f));
        mo89045d3(j.getDimension(C31076a.C31091o.Chip_closeIconStartPadding, 0.0f));
        mo89032Y2(j.getDimension(C31076a.C31091o.Chip_closeIconEndPadding, 0.0f));
        mo89123z2(j.getDimension(C31076a.C31091o.Chip_chipEndPadding, 0.0f));
        mo89098s3(j.getDimensionPixelSize(C31076a.C31091o.Chip_android_maxWidth, Integer.MAX_VALUE));
        j.recycle();
    }

    /* renamed from: i3 */
    public void mo89064i3(@C0342h int i) {
        mo89069j3(this.f75047A1.getResources().getBoolean(i));
    }

    public void invalidateDrawable(@C0359n0 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        if (m125579f2(this.f75066T0) || m125579f2(this.f75068U0) || m125579f2(this.f75074X0) || ((this.f75073W1 && m125579f2(this.f75075X1)) || m125581h2(this.f75054H1.mo90163d()) || mo89033Z0() || m125580g2(this.f75084c1) || m125580g2(this.f75097o1) || m125579f2(this.f75067T1))) {
            return true;
        }
        return false;
    }

    /* renamed from: j1 */
    public final void mo89067j1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        Paint paint = this.f75049C1;
        if (paint != null) {
            paint.setColor(C17586h0.m80563B(-16777216, 127));
            canvas.drawRect(rect, this.f75049C1);
            if (mo88995M3() || mo88992L3()) {
                mo89006Q0(rect, this.f75051E1);
                canvas.drawRect(this.f75051E1, this.f75049C1);
            }
            if (this.f75080a1 != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f75049C1);
            }
            if (mo88998N3()) {
                mo89016T0(rect, this.f75051E1);
                canvas.drawRect(this.f75051E1, this.f75049C1);
            }
            this.f75049C1.setColor(C17586h0.m80563B(C17673a.f46025c, 127));
            mo89013S0(rect, this.f75051E1);
            canvas.drawRect(this.f75051E1, this.f75049C1);
            this.f75049C1.setColor(C17586h0.m80563B(-16711936, 127));
            mo89019U0(rect, this.f75051E1);
            canvas.drawRect(this.f75051E1, this.f75049C1);
        }
    }

    /* renamed from: j2 */
    public void mo89068j2() {
        C31214a aVar = this.f75077Y1.get();
        if (aVar != null) {
            aVar.mo88762a();
        }
    }

    /* renamed from: j3 */
    public void mo89069j3(boolean z) {
        boolean z2;
        if (this.f75089g1 != z) {
            boolean N3 = mo88998N3();
            this.f75089g1 = z;
            boolean N32 = mo88998N3();
            if (N3 != N32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (N32) {
                    mo89002P0(this.f75090h1);
                } else {
                    mo89001O3(this.f75090h1);
                }
                invalidateSelf();
                mo89068j2();
            }
        }
    }

    /* renamed from: k1 */
    public final void mo89070k1(@C0359n0 Canvas canvas, @C0359n0 Rect rect) {
        boolean z;
        if (this.f75080a1 != null) {
            Paint.Align Y0 = mo89030Y0(rect, this.f75052F1);
            mo89024W0(rect, this.f75051E1);
            if (this.f75054H1.mo90163d() != null) {
                this.f75054H1.mo90164e().drawableState = getState();
                this.f75054H1.mo90170k(this.f75047A1);
            }
            this.f75054H1.mo90164e().setTextAlign(Y0);
            int i = 0;
            if (Math.round(this.f75054H1.mo90165f(mo89003P1().toString())) > Math.round(this.f75051E1.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f75051E1);
            }
            CharSequence charSequence = this.f75080a1;
            if (z && this.f75079Z1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f75054H1.mo90164e(), this.f75051E1.width(), this.f75079Z1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f75052F1;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f75054H1.mo90164e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: k2 */
    public final boolean mo89071k2(@C0359n0 int[] iArr, @C0359n0 int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f75066T0;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, this.f75055I1);
        } else {
            i = 0;
        }
        int l = mo90771l(i);
        boolean z5 = true;
        if (this.f75055I1 != l) {
            this.f75055I1 = l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f75068U0;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(iArr, this.f75056J1);
        } else {
            i2 = 0;
        }
        int l2 = mo90771l(i2);
        if (this.f75056J1 != l2) {
            this.f75056J1 = l2;
            onStateChange = true;
        }
        int l3 = C31266s.m125961l(l, l2);
        if (this.f75057K1 != l3) {
            z = true;
        } else {
            z = false;
        }
        if (mo90797y() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            this.f75057K1 = l3;
            mo90777o0(ColorStateList.valueOf(l3));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f75074X0;
        if (colorStateList3 != null) {
            i3 = colorStateList3.getColorForState(iArr, this.f75058L1);
        } else {
            i3 = 0;
        }
        if (this.f75058L1 != i3) {
            this.f75058L1 = i3;
            onStateChange = true;
        }
        if (this.f75075X1 == null || !C31511b.m127406e(iArr)) {
            i4 = 0;
        } else {
            i4 = this.f75075X1.getColorForState(iArr, this.f75059M1);
        }
        if (this.f75059M1 != i4) {
            this.f75059M1 = i4;
            if (this.f75073W1) {
                onStateChange = true;
            }
        }
        if (this.f75054H1.mo90163d() == null || this.f75054H1.mo90163d().mo90649i() == null) {
            i5 = 0;
        } else {
            i5 = this.f75054H1.mo90163d().mo90649i().getColorForState(iArr, this.f75060N1);
        }
        if (this.f75060N1 != i5) {
            this.f75060N1 = i5;
            onStateChange = true;
        }
        if (!m125576V1(getState(), 16842912) || !this.f75095m1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f75061O1 == z3 || this.f75097o1 == null) {
            z4 = false;
        } else {
            float R0 = mo89010R0();
            this.f75061O1 = z3;
            if (R0 != mo89010R0()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f75067T1;
        if (colorStateList4 != null) {
            i6 = colorStateList4.getColorForState(iArr, this.f75062P1);
        } else {
            i6 = 0;
        }
        if (this.f75062P1 != i6) {
            this.f75062P1 = i6;
            this.f75065S1 = C31332a.m126390c(this, this.f75067T1, this.f75069U1);
        } else {
            z5 = onStateChange;
        }
        if (m125580g2(this.f75084c1)) {
            z5 |= this.f75084c1.setState(iArr);
        }
        if (m125580g2(this.f75097o1)) {
            z5 |= this.f75097o1.setState(iArr);
        }
        if (m125580g2(this.f75090h1)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.f75090h1.setState(iArr3);
        }
        if (C31511b.f76296a && m125580g2(this.f75091i1)) {
            z5 |= this.f75091i1.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            mo89068j2();
        }
        return z5;
    }

    /* renamed from: k3 */
    public void mo89072k3(@C0363p0 C31214a aVar) {
        this.f75077Y1 = new WeakReference<>(aVar);
    }

    @C0363p0
    /* renamed from: l1 */
    public Drawable mo89073l1() {
        return this.f75097o1;
    }

    /* renamed from: l2 */
    public void mo89074l2(boolean z) {
        if (this.f75095m1 != z) {
            this.f75095m1 = z;
            float R0 = mo89010R0();
            if (!z && this.f75061O1) {
                this.f75061O1 = false;
            }
            float R02 = mo89010R0();
            invalidateSelf();
            if (R0 != R02) {
                mo89068j2();
            }
        }
    }

    /* renamed from: l3 */
    public void mo89075l3(@C0363p0 TextUtils.TruncateAt truncateAt) {
        this.f75079Z1 = truncateAt;
    }

    @C0363p0
    /* renamed from: m1 */
    public ColorStateList mo89076m1() {
        return this.f75098p1;
    }

    /* renamed from: m2 */
    public void mo89077m2(@C0342h int i) {
        mo89074l2(this.f75047A1.getResources().getBoolean(i));
    }

    /* renamed from: m3 */
    public void mo89078m3(@C0363p0 C31100h hVar) {
        this.f75100r1 = hVar;
    }

    @C0363p0
    /* renamed from: n1 */
    public ColorStateList mo89079n1() {
        return this.f75068U0;
    }

    /* renamed from: n2 */
    public void mo89080n2(@C0363p0 Drawable drawable) {
        if (this.f75097o1 != drawable) {
            float R0 = mo89010R0();
            this.f75097o1 = drawable;
            float R02 = mo89010R0();
            mo89001O3(this.f75097o1);
            mo89002P0(this.f75097o1);
            invalidateSelf();
            if (R0 != R02) {
                mo89068j2();
            }
        }
    }

    /* renamed from: n3 */
    public void mo89081n3(@C0322b int i) {
        mo89078m3(C31100h.m124662d(this.f75047A1, i));
    }

    /* renamed from: o1 */
    public float mo89082o1() {
        return this.f75085c2 ? mo90743S() : this.f75072W0;
    }

    @Deprecated
    /* renamed from: o2 */
    public void mo89083o2(boolean z) {
        mo89107u2(z);
    }

    /* renamed from: o3 */
    public void mo89084o3(float f) {
        if (this.f75103u1 != f) {
            float R0 = mo89010R0();
            this.f75103u1 = f;
            float R02 = mo89010R0();
            invalidateSelf();
            if (R0 != R02) {
                mo89068j2();
            }
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (mo88995M3()) {
            onLayoutDirectionChanged |= C17549d.m80451m(this.f75084c1, i);
        }
        if (mo88992L3()) {
            onLayoutDirectionChanged |= C17549d.m80451m(this.f75097o1, i);
        }
        if (mo88998N3()) {
            onLayoutDirectionChanged |= C17549d.m80451m(this.f75090h1, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (mo88995M3()) {
            onLevelChange |= this.f75084c1.setLevel(i);
        }
        if (mo88992L3()) {
            onLevelChange |= this.f75097o1.setLevel(i);
        }
        if (mo88998N3()) {
            onLevelChange |= this.f75090h1.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(@C0359n0 int[] iArr) {
        if (this.f75085c2) {
            super.onStateChange(iArr);
        }
        return mo89071k2(iArr, mo88966D1());
    }

    /* renamed from: p1 */
    public float mo89087p1() {
        return this.f75108z1;
    }

    @Deprecated
    /* renamed from: p2 */
    public void mo89088p2(@C0342h int i) {
        mo89107u2(this.f75047A1.getResources().getBoolean(i));
    }

    /* renamed from: p3 */
    public void mo89089p3(@C0364q int i) {
        mo89084o3(this.f75047A1.getResources().getDimension(i));
    }

    @C0363p0
    /* renamed from: q1 */
    public Drawable mo89090q1() {
        Drawable drawable = this.f75084c1;
        if (drawable != null) {
            return C17549d.m80455q(drawable);
        }
        return null;
    }

    /* renamed from: q2 */
    public void mo89091q2(@C0375v int i) {
        mo89080n2(C0507a.m2346b(this.f75047A1, i));
    }

    /* renamed from: q3 */
    public void mo89092q3(float f) {
        if (this.f75102t1 != f) {
            float R0 = mo89010R0();
            this.f75102t1 = f;
            float R02 = mo89010R0();
            invalidateSelf();
            if (R0 != R02) {
                mo89068j2();
            }
        }
    }

    /* renamed from: r1 */
    public float mo89093r1() {
        return this.f75087e1;
    }

    /* renamed from: r2 */
    public void mo89094r2(@C0363p0 ColorStateList colorStateList) {
        if (this.f75098p1 != colorStateList) {
            this.f75098p1 = colorStateList;
            if (mo89033Z0()) {
                C17549d.m80453o(this.f75097o1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: r3 */
    public void mo89095r3(@C0364q int i) {
        mo89092q3(this.f75047A1.getResources().getDimension(i));
    }

    @C0363p0
    /* renamed from: s1 */
    public ColorStateList mo89096s1() {
        return this.f75086d1;
    }

    /* renamed from: s2 */
    public void mo89097s2(@C0358n int i) {
        mo89094r2(C0507a.m2345a(this.f75047A1, i));
    }

    /* renamed from: s3 */
    public void mo89098s3(@C0372t0 int i) {
        this.f75083b2 = i;
    }

    public void scheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f75063Q1 != i) {
            this.f75063Q1 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(@C0363p0 ColorFilter colorFilter) {
        if (this.f75064R1 != colorFilter) {
            this.f75064R1 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(@C0363p0 ColorStateList colorStateList) {
        if (this.f75067T1 != colorStateList) {
            this.f75067T1 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(@C0359n0 PorterDuff.Mode mode) {
        if (this.f75069U1 != mode) {
            this.f75069U1 = mode;
            this.f75065S1 = C31332a.m126390c(this, this.f75067T1, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (mo88995M3()) {
            visible |= this.f75084c1.setVisible(z, z2);
        }
        if (mo88992L3()) {
            visible |= this.f75097o1.setVisible(z, z2);
        }
        if (mo88998N3()) {
            visible |= this.f75090h1.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public float mo89103t1() {
        return this.f75070V0;
    }

    /* renamed from: t2 */
    public void mo89104t2(@C0342h int i) {
        mo89107u2(this.f75047A1.getResources().getBoolean(i));
    }

    /* renamed from: t3 */
    public void mo89105t3(@C0363p0 ColorStateList colorStateList) {
        if (this.f75078Z0 != colorStateList) {
            this.f75078Z0 = colorStateList;
            mo89005P3();
            onStateChange(getState());
        }
    }

    /* renamed from: u1 */
    public float mo89106u1() {
        return this.f75101s1;
    }

    /* renamed from: u2 */
    public void mo89107u2(boolean z) {
        boolean z2;
        if (this.f75096n1 != z) {
            boolean L3 = mo88992L3();
            this.f75096n1 = z;
            boolean L32 = mo88992L3();
            if (L3 != L32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (L32) {
                    mo89002P0(this.f75097o1);
                } else {
                    mo89001O3(this.f75097o1);
                }
                invalidateSelf();
                mo89068j2();
            }
        }
    }

    /* renamed from: u3 */
    public void mo89108u3(@C0358n int i) {
        mo89105t3(C0507a.m2345a(this.f75047A1, i));
    }

    public void unscheduleDrawable(@C0359n0 Drawable drawable, @C0359n0 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @C0363p0
    /* renamed from: v1 */
    public ColorStateList mo89110v1() {
        return this.f75074X0;
    }

    /* renamed from: v2 */
    public void mo89111v2(@C0363p0 ColorStateList colorStateList) {
        if (this.f75068U0 != colorStateList) {
            this.f75068U0 = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: v3 */
    public void mo89112v3(boolean z) {
        this.f75081a2 = z;
    }

    /* renamed from: w1 */
    public float mo89113w1() {
        return this.f75076Y0;
    }

    /* renamed from: w2 */
    public void mo89114w2(@C0358n int i) {
        mo89111v2(C0507a.m2345a(this.f75047A1, i));
    }

    /* renamed from: w3 */
    public void mo89115w3(@C0363p0 C31100h hVar) {
        this.f75099q1 = hVar;
    }

    /* renamed from: x1 */
    public void mo89116x1(@C0359n0 RectF rectF) {
        mo89013S0(getBounds(), rectF);
    }

    @Deprecated
    /* renamed from: x2 */
    public void mo89117x2(float f) {
        if (this.f75072W0 != f) {
            this.f75072W0 = f;
            setShapeAppearanceModel(getShapeAppearanceModel().mo90823w(f));
        }
    }

    /* renamed from: x3 */
    public void mo89118x3(@C0322b int i) {
        mo89115w3(C31100h.m124662d(this.f75047A1, i));
    }

    @C0363p0
    /* renamed from: y1 */
    public Drawable mo89119y1() {
        Drawable drawable = this.f75090h1;
        if (drawable != null) {
            return C17549d.m80455q(drawable);
        }
        return null;
    }

    @Deprecated
    /* renamed from: y2 */
    public void mo89120y2(@C0364q int i) {
        mo89117x2(this.f75047A1.getResources().getDimension(i));
    }

    /* renamed from: y3 */
    public void mo89121y3(@C0363p0 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f75080a1, charSequence)) {
            this.f75080a1 = charSequence;
            this.f75054H1.mo90169j(true);
            invalidateSelf();
            mo89068j2();
        }
    }

    @C0363p0
    /* renamed from: z1 */
    public CharSequence mo89122z1() {
        return this.f75094l1;
    }

    /* renamed from: z2 */
    public void mo89123z2(float f) {
        if (this.f75108z1 != f) {
            this.f75108z1 = f;
            invalidateSelf();
            mo89068j2();
        }
    }

    /* renamed from: z3 */
    public void mo89124z3(@C0363p0 C31501d dVar) {
        this.f75054H1.mo90168i(dVar, this.f75047A1);
    }
}
