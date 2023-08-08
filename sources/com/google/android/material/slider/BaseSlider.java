package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0375v;
import androidx.appcompat.content.res.C0507a;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.math.C17760a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.customview.widget.C18544a;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.drawable.C31332a;
import com.google.android.material.internal.C31392d;
import com.google.android.material.internal.C31422p;
import com.google.android.material.internal.C31431w;
import com.google.android.material.internal.C31432x;
import com.google.android.material.resources.C31500c;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.C31568a;
import com.google.android.material.slider.C31569b;
import com.google.android.material.theme.overlay.C31683a;
import com.google.android.material.tooltip.C31725a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends C31568a<S>, T extends C31569b<S>> extends View {

    /* renamed from: A1 */
    public static final String f76502A1 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";

    /* renamed from: B1 */
    public static final String f76503B1 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";

    /* renamed from: C1 */
    public static final String f76504C1 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";

    /* renamed from: D1 */
    public static final int f76505D1 = 200;

    /* renamed from: E1 */
    public static final int f76506E1 = 63;

    /* renamed from: F1 */
    public static final double f76507F1 = 1.0E-4d;

    /* renamed from: G1 */
    public static final int f76508G1 = C31076a.C31090n.Widget_MaterialComponents_Slider;

    /* renamed from: H1 */
    public static final int f76509H1 = 1;

    /* renamed from: I1 */
    public static final int f76510I1 = 0;

    /* renamed from: J1 */
    public static final long f76511J1 = 83;

    /* renamed from: K1 */
    public static final long f76512K1 = 117;

    /* renamed from: t1 */
    public static final String f76513t1 = "BaseSlider";

    /* renamed from: u1 */
    public static final String f76514u1 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";

    /* renamed from: v1 */
    public static final String f76515v1 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";

    /* renamed from: w1 */
    public static final String f76516w1 = "valueFrom(%s) must be smaller than valueTo(%s)";

    /* renamed from: x1 */
    public static final String f76517x1 = "valueTo(%s) must be greater than valueFrom(%s)";

    /* renamed from: y1 */
    public static final String f76518y1 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";

    /* renamed from: z1 */
    public static final String f76519z1 = "minSeparation(%s) must be greater or equal to 0";
    @C0359n0

    /* renamed from: E0 */
    public final List<T> f76520E0;

    /* renamed from: F0 */
    public boolean f76521F0;

    /* renamed from: G0 */
    public ValueAnimator f76522G0;

    /* renamed from: H0 */
    public ValueAnimator f76523H0;

    /* renamed from: I0 */
    public final int f76524I0;

    /* renamed from: J0 */
    public int f76525J0;

    /* renamed from: K0 */
    public int f76526K0;

    /* renamed from: L0 */
    public int f76527L0;

    /* renamed from: M0 */
    public int f76528M0;

    /* renamed from: N0 */
    public int f76529N0;

    /* renamed from: O0 */
    public int f76530O0;

    /* renamed from: P0 */
    public int f76531P0;

    /* renamed from: Q0 */
    public int f76532Q0;

    /* renamed from: R0 */
    public int f76533R0;

    /* renamed from: S0 */
    public int f76534S0;

    /* renamed from: T0 */
    public float f76535T0;

    /* renamed from: U0 */
    public MotionEvent f76536U0;

    /* renamed from: V0 */
    public C31571d f76537V0;

    /* renamed from: W0 */
    public boolean f76538W0;

    /* renamed from: X0 */
    public float f76539X0;

    /* renamed from: Y0 */
    public float f76540Y0;

    /* renamed from: Z0 */
    public ArrayList<Float> f76541Z0;
    @C0359n0

    /* renamed from: a */
    public final Paint f76542a;

    /* renamed from: a1 */
    public int f76543a1;
    @C0359n0

    /* renamed from: b */
    public final Paint f76544b;

    /* renamed from: b1 */
    public int f76545b1;
    @C0359n0

    /* renamed from: c */
    public final Paint f76546c;

    /* renamed from: c1 */
    public float f76547c1;
    @C0359n0

    /* renamed from: d */
    public final Paint f76548d;

    /* renamed from: d1 */
    public float[] f76549d1;
    @C0359n0

    /* renamed from: e */
    public final Paint f76550e;

    /* renamed from: e1 */
    public boolean f76551e1;
    @C0359n0

    /* renamed from: f */
    public final Paint f76552f;

    /* renamed from: f1 */
    public int f76553f1;
    @C0359n0

    /* renamed from: g */
    public final C31560e f76554g;

    /* renamed from: g1 */
    public boolean f76555g1;

    /* renamed from: h1 */
    public boolean f76556h1;

    /* renamed from: i1 */
    public boolean f76557i1;
    @C0359n0

    /* renamed from: j1 */
    public ColorStateList f76558j1;
    @C0359n0

    /* renamed from: k1 */
    public ColorStateList f76559k1;
    @C0359n0

    /* renamed from: l1 */
    public ColorStateList f76560l1;
    @C0359n0

    /* renamed from: m1 */
    public ColorStateList f76561m1;
    @C0359n0

    /* renamed from: n1 */
    public ColorStateList f76562n1;
    @C0359n0

    /* renamed from: o1 */
    public final C31525j f76563o1;
    @C0363p0

    /* renamed from: p1 */
    public Drawable f76564p1;
    @C0359n0

    /* renamed from: q1 */
    public List<Drawable> f76565q1;

    /* renamed from: r1 */
    public float f76566r1;

    /* renamed from: s1 */
    public int f76567s1;

    /* renamed from: v */
    public final AccessibilityManager f76568v;

    /* renamed from: w */
    public BaseSlider<S, L, T>.d f76569w;
    @C0359n0

    /* renamed from: x */
    public final C31561f f76570x;
    @C0359n0

    /* renamed from: y */
    public final List<C31725a> f76571y;
    @C0359n0

    /* renamed from: z */
    public final List<L> f76572z;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C31555a();

        /* renamed from: a */
        public float f76573a;

        /* renamed from: b */
        public float f76574b;

        /* renamed from: c */
        public ArrayList<Float> f76575c;

        /* renamed from: d */
        public float f76576d;

        /* renamed from: e */
        public boolean f76577e;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        public class C31555a implements Parcelable.Creator<SliderState> {
            @C0359n0
            /* renamed from: a */
            public SliderState createFromParcel(@C0359n0 Parcel parcel) {
                return new SliderState(parcel, (C31556a) null);
            }

            @C0359n0
            /* renamed from: b */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, C31556a aVar) {
            this(parcel);
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f76573a);
            parcel.writeFloat(this.f76574b);
            parcel.writeList(this.f76575c);
            parcel.writeFloat(this.f76576d);
            parcel.writeBooleanArray(new boolean[]{this.f76577e});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public SliderState(@C0359n0 Parcel parcel) {
            super(parcel);
            this.f76573a = parcel.readFloat();
            this.f76574b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f76575c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f76576d = parcel.readFloat();
            this.f76577e = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    public class C31556a implements C31561f {

        /* renamed from: a */
        public final /* synthetic */ AttributeSet f76578a;

        /* renamed from: b */
        public final /* synthetic */ int f76579b;

        public C31556a(AttributeSet attributeSet, int i) {
            this.f76578a = attributeSet;
            this.f76579b = i;
        }

        /* renamed from: a */
        public C31725a mo91094a() {
            TypedArray j = C31422p.m126970j(BaseSlider.this.getContext(), this.f76578a, C31076a.C31091o.Slider, this.f76579b, BaseSlider.f76508G1, new int[0]);
            C31725a a = BaseSlider.m127748e0(BaseSlider.this.getContext(), j);
            j.recycle();
            return a;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    public class C31557b implements ValueAnimator.AnimatorUpdateListener {
        public C31557b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (C31725a l1 : BaseSlider.this.f76571y) {
                l1.mo92033l1(floatValue);
            }
            C18196h2.m82610n1(BaseSlider.this);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    public class C31558c extends AnimatorListenerAdapter {
        public C31558c() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (C31725a b : BaseSlider.this.f76571y) {
                C31432x.m127013h(BaseSlider.this).mo90181b(b);
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$e */
    public static class C31560e extends C18544a {

        /* renamed from: t */
        public final BaseSlider<?, ?, ?> f76585t;

        /* renamed from: u */
        public final Rect f76586u = new Rect();

        public C31560e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f76585t = baseSlider;
        }

        /* renamed from: C */
        public int mo53429C(float f, float f2) {
            for (int i = 0; i < this.f76585t.getValues().size(); i++) {
                this.f76585t.mo91076t0(i, this.f76586u);
                if (this.f76586u.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: D */
        public void mo53430D(List<Integer> list) {
            for (int i = 0; i < this.f76585t.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* renamed from: N */
        public boolean mo53438N(int i, int i2, Bundle bundle) {
            if (!this.f76585t.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float g = this.f76585t.mo91017n(20);
                if (i2 == 8192) {
                    g = -g;
                }
                if (this.f76585t.mo90962R()) {
                    g = -g;
                }
                if (!this.f76585t.mo91037r0(i, C17760a.m81101d(this.f76585t.getValues().get(i).floatValue() + g, this.f76585t.getValueFrom(), this.f76585t.getValueTo()))) {
                    return false;
                }
                this.f76585t.mo91078u0();
                this.f76585t.postInvalidate();
                mo53432G(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey(C18065l0.f46604X)) {
                if (this.f76585t.mo91037r0(i, bundle.getFloat(C18065l0.f46604X))) {
                    this.f76585t.mo91078u0();
                    this.f76585t.postInvalidate();
                    mo53432G(i);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: R */
        public void mo53442R(int i, C18065l0 l0Var) {
            l0Var.mo52598b(C18065l0.C18066a.f46658M);
            List<Float> values = this.f76585t.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f76585t.getValueFrom();
            float valueTo = this.f76585t.getValueTo();
            if (this.f76585t.isEnabled()) {
                if (floatValue > valueFrom) {
                    l0Var.mo52594a(8192);
                }
                if (floatValue < valueTo) {
                    l0Var.mo52594a(4096);
                }
            }
            l0Var.mo52536F1(C18065l0.C18070e.m82113e(1, valueFrom, valueTo, floatValue));
            l0Var.mo52592Z0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f76585t.getContentDescription() != null) {
                sb.append(this.f76585t.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(mo91099a0(i));
                sb.append(this.f76585t.mo90951F(floatValue));
            }
            l0Var.mo52607d1(sb.toString());
            this.f76585t.mo91076t0(i, this.f76586u);
            l0Var.mo52577U0(this.f76586u);
        }

        @C0359n0
        /* renamed from: a0 */
        public final String mo91099a0(int i) {
            if (i == this.f76585t.getValues().size() - 1) {
                return this.f76585t.getContext().getString(C31076a.C31089m.material_slider_range_end);
            }
            if (i == 0) {
                return this.f76585t.getContext().getString(C31076a.C31089m.material_slider_range_start);
            }
            return "";
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$f */
    public interface C31561f {
        /* renamed from: a */
        C31725a mo91094a();
    }

    public BaseSlider(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: H */
    public static float m127742H(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    @C0359n0
    /* renamed from: e0 */
    public static C31725a m127748e0(@C0359n0 Context context, @C0359n0 TypedArray typedArray) {
        return C31725a.m128644V0(context, (AttributeSet) null, 0, typedArray.getResourceId(C31076a.C31091o.Slider_labelStyle, C31076a.C31090n.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: g0 */
    public static int m127751g0(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    /* renamed from: A */
    public final void mo90941A(@C0359n0 Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.f76541Z0.size(); i3++) {
            float floatValue = this.f76541Z0.get(i3).floatValue();
            Drawable drawable = this.f76564p1;
            if (drawable != null) {
                mo91087z(canvas, i, i2, floatValue, drawable);
            } else if (i3 < this.f76565q1.size()) {
                mo91087z(canvas, i, i2, floatValue, this.f76565q1.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(((float) this.f76530O0) + (mo90971a0(floatValue) * ((float) i)), (float) i2, (float) this.f76532Q0, this.f76546c);
                }
                mo91087z(canvas, i, i2, floatValue, this.f76563o1);
            }
        }
    }

    /* renamed from: A0 */
    public final void mo90942A0() {
        if (this.f76540Y0 <= this.f76539X0) {
            throw new IllegalStateException(String.format(f76517x1, new Object[]{Float.valueOf(this.f76540Y0), Float.valueOf(this.f76539X0)}));
        }
    }

    /* renamed from: B */
    public final void mo90943B() {
        if (this.f76528M0 != 2) {
            if (!this.f76521F0) {
                this.f76521F0 = true;
                ValueAnimator r = mo91036r(true);
                this.f76522G0 = r;
                this.f76523H0 = null;
                r.start();
            }
            Iterator<C31725a> it = this.f76571y.iterator();
            for (int i = 0; i < this.f76541Z0.size() && it.hasNext(); i++) {
                if (i != this.f76545b1) {
                    mo91014l0(it.next(), this.f76541Z0.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                mo91014l0(it.next(), this.f76541Z0.get(this.f76545b1).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f76571y.size()), Integer.valueOf(this.f76541Z0.size())}));
            }
        }
    }

    /* renamed from: B0 */
    public final void mo90944B0() {
        Iterator<Float> it = this.f76541Z0.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f76539X0 || next.floatValue() > this.f76540Y0) {
                throw new IllegalStateException(String.format(f76514u1, new Object[]{next, Float.valueOf(this.f76539X0), Float.valueOf(this.f76540Y0)}));
            } else if (this.f76547c1 > 0.0f && !mo90946C0(next.floatValue())) {
                throw new IllegalStateException(String.format(f76515v1, new Object[]{next, Float.valueOf(this.f76539X0), Float.valueOf(this.f76547c1), Float.valueOf(this.f76547c1)}));
            }
        }
    }

    /* renamed from: C */
    public final void mo90945C() {
        if (this.f76521F0) {
            this.f76521F0 = false;
            ValueAnimator r = mo91036r(false);
            this.f76523H0 = r;
            this.f76522G0 = null;
            r.addListener(new C31558c());
            this.f76523H0.start();
        }
    }

    /* renamed from: C0 */
    public final boolean mo90946C0(float f) {
        return mo90961Q(f - this.f76539X0);
    }

    /* renamed from: D */
    public final void mo90947D(int i) {
        if (i == 1) {
            mo90969Y(Integer.MAX_VALUE);
        } else if (i == 2) {
            mo90969Y(Integer.MIN_VALUE);
        } else if (i == 17) {
            mo90970Z(Integer.MAX_VALUE);
        } else if (i == 66) {
            mo90970Z(Integer.MIN_VALUE);
        }
    }

    /* renamed from: D0 */
    public final float mo90948D0(float f) {
        return (mo90971a0(f) * ((float) this.f76553f1)) + ((float) this.f76530O0);
    }

    @C0344h1
    /* renamed from: E */
    public void mo90949E(boolean z) {
        this.f76555g1 = z;
    }

    /* renamed from: E0 */
    public final void mo90950E0() {
        float f = this.f76547c1;
        if (f != 0.0f) {
            if (((float) ((int) f)) != f) {
                String.format(f76504C1, new Object[]{"stepSize", Float.valueOf(f)});
            }
            float f2 = this.f76539X0;
            if (((float) ((int) f2)) != f2) {
                String.format(f76504C1, new Object[]{"valueFrom", Float.valueOf(f2)});
            }
            float f3 = this.f76540Y0;
            if (((float) ((int) f3)) != f3) {
                String.format(f76504C1, new Object[]{"valueTo", Float.valueOf(f3)});
            }
        }
    }

    /* renamed from: F */
    public final String mo90951F(float f) {
        String str;
        if (mo90957M()) {
            return this.f76537V0.mo91118a(f);
        }
        if (((float) ((int) f)) == f) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, new Object[]{Float.valueOf(f)});
    }

    /* renamed from: G */
    public final float[] mo90952G() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f76541Z0.size() == 1) {
            floatValue2 = this.f76539X0;
        }
        float a0 = mo90971a0(floatValue2);
        float a02 = mo90971a0(floatValue);
        if (mo90962R()) {
            return new float[]{a02, a0};
        }
        return new float[]{a0, a02};
    }

    /* renamed from: I */
    public final float mo90953I(int i, float f) {
        float f2;
        float f3;
        float minSeparation = getMinSeparation();
        if (this.f76567s1 == 0) {
            minSeparation = mo91077u(minSeparation);
        }
        if (mo90962R()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        if (i2 >= this.f76541Z0.size()) {
            f2 = this.f76540Y0;
        } else {
            f2 = this.f76541Z0.get(i2).floatValue() - minSeparation;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            f3 = this.f76539X0;
        } else {
            f3 = this.f76541Z0.get(i3).floatValue() + minSeparation;
        }
        return C17760a.m81101d(f, f3, f2);
    }

    @C0354l
    /* renamed from: J */
    public final int mo90954J(@C0359n0 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: K */
    public final float mo90955K() {
        double q0 = mo91035q0(this.f76566r1);
        if (mo90962R()) {
            q0 = 1.0d - q0;
        }
        float f = this.f76540Y0;
        float f2 = this.f76539X0;
        return (float) ((q0 * ((double) (f - f2))) + ((double) f2));
    }

    /* renamed from: L */
    public final float mo90956L() {
        float f = this.f76566r1;
        if (mo90962R()) {
            f = 1.0f - f;
        }
        float f2 = this.f76540Y0;
        float f3 = this.f76539X0;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: M */
    public boolean mo90957M() {
        return this.f76537V0 != null;
    }

    /* renamed from: N */
    public final Drawable mo90958N(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        mo91009j(newDrawable);
        return newDrawable;
    }

    /* renamed from: O */
    public final void mo90959O() {
        this.f76542a.setStrokeWidth((float) this.f76529N0);
        this.f76544b.setStrokeWidth((float) this.f76529N0);
        this.f76550e.setStrokeWidth(((float) this.f76529N0) / 2.0f);
        this.f76552f.setStrokeWidth(((float) this.f76529N0) / 2.0f);
    }

    /* renamed from: P */
    public final boolean mo90960P() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: Q */
    public final boolean mo90961Q(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f76547c1)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public final boolean mo90962R() {
        return C18196h2.m82553Z(this) == 1;
    }

    /* renamed from: S */
    public boolean mo90963S() {
        return this.f76551e1;
    }

    /* renamed from: T */
    public final void mo90964T(@C0359n0 Resources resources) {
        this.f76527L0 = resources.getDimensionPixelSize(C31076a.C31082f.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_slider_track_side_padding);
        this.f76525J0 = dimensionPixelOffset;
        this.f76530O0 = dimensionPixelOffset;
        this.f76526K0 = resources.getDimensionPixelSize(C31076a.C31082f.mtrl_slider_thumb_radius);
        this.f76531P0 = resources.getDimensionPixelOffset(C31076a.C31082f.mtrl_slider_track_top);
        this.f76534S0 = resources.getDimensionPixelSize(C31076a.C31082f.mtrl_slider_label_padding);
    }

    /* renamed from: U */
    public final void mo90965U() {
        if (this.f76547c1 > 0.0f) {
            mo91082w0();
            int min = Math.min((int) (((this.f76540Y0 - this.f76539X0) / this.f76547c1) + 1.0f), (this.f76553f1 / (this.f76529N0 * 2)) + 1);
            float[] fArr = this.f76549d1;
            if (fArr == null || fArr.length != min * 2) {
                this.f76549d1 = new float[(min * 2)];
            }
            float f = ((float) this.f76553f1) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.f76549d1;
                fArr2[i] = ((float) this.f76530O0) + (((float) (i / 2)) * f);
                fArr2[i + 1] = (float) mo91019o();
            }
        }
    }

    /* renamed from: V */
    public final void mo90966V(@C0359n0 Canvas canvas, int i, int i2) {
        if (mo91020o0()) {
            int a0 = (int) (((float) this.f76530O0) + (mo90971a0(this.f76541Z0.get(this.f76545b1).floatValue()) * ((float) i)));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f76533R0;
                canvas.clipRect((float) (a0 - i3), (float) (i2 - i3), (float) (a0 + i3), (float) (i3 + i2), Region.Op.UNION);
            }
            canvas.drawCircle((float) a0, (float) i2, (float) this.f76533R0, this.f76548d);
        }
    }

    /* renamed from: W */
    public final void mo90967W(@C0359n0 Canvas canvas) {
        if (this.f76551e1 && this.f76547c1 > 0.0f) {
            float[] G = mo90952G();
            int g0 = m127751g0(this.f76549d1, G[0]);
            int g02 = m127751g0(this.f76549d1, G[1]);
            int i = g0 * 2;
            canvas.drawPoints(this.f76549d1, 0, i, this.f76550e);
            int i2 = g02 * 2;
            canvas.drawPoints(this.f76549d1, i, i2 - i, this.f76552f);
            float[] fArr = this.f76549d1;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f76550e);
        }
    }

    /* renamed from: X */
    public final void mo90968X() {
        this.f76530O0 = this.f76525J0 + Math.max(this.f76532Q0 - this.f76526K0, 0);
        if (C18196h2.m82539U0(this)) {
            mo91080v0(getWidth());
        }
    }

    /* renamed from: Y */
    public final boolean mo90969Y(int i) {
        int i2 = this.f76545b1;
        int f = (int) C17760a.m81103f(((long) i2) + ((long) i), 0, (long) (this.f76541Z0.size() - 1));
        this.f76545b1 = f;
        if (f == i2) {
            return false;
        }
        if (this.f76543a1 != -1) {
            this.f76543a1 = f;
        }
        mo91078u0();
        postInvalidate();
        return true;
    }

    /* renamed from: Z */
    public final boolean mo90970Z(int i) {
        if (mo90962R()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return mo90969Y(i);
    }

    /* renamed from: a0 */
    public final float mo90971a0(float f) {
        float f2 = this.f76539X0;
        float f3 = (f - f2) / (this.f76540Y0 - f2);
        if (mo90962R()) {
            return 1.0f - f3;
        }
        return f3;
    }

    /* renamed from: b0 */
    public final Boolean mo90972b0(int i, @C0359n0 KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i == 69) {
                        mo90969Y(-1);
                        return Boolean.TRUE;
                    } else if (i != 70) {
                        switch (i) {
                            case 21:
                                mo90970Z(-1);
                                return Boolean.TRUE;
                            case 22:
                                mo90970Z(1);
                                return Boolean.TRUE;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                mo90969Y(1);
                return Boolean.TRUE;
            }
            this.f76543a1 = this.f76545b1;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(mo90969Y(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(mo90969Y(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: c0 */
    public final void mo90973c0() {
        for (T c : this.f76520E0) {
            c.mo91116c(this);
        }
    }

    /* renamed from: d0 */
    public final void mo90974d0() {
        for (T f : this.f76520E0) {
            f.mo91117f(this);
        }
    }

    public boolean dispatchHoverEvent(@C0359n0 MotionEvent motionEvent) {
        return this.f76554g.mo53459v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(@C0359n0 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f76542a.setColor(mo90954J(this.f76562n1));
        this.f76544b.setColor(mo90954J(this.f76561m1));
        this.f76550e.setColor(mo90954J(this.f76560l1));
        this.f76552f.setColor(mo90954J(this.f76559k1));
        for (C31725a next : this.f76571y) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.f76563o1.isStateful()) {
            this.f76563o1.setState(getDrawableState());
        }
        this.f76548d.setColor(mo90954J(this.f76558j1));
        this.f76548d.setAlpha(63);
    }

    /* renamed from: f0 */
    public boolean mo90978f0() {
        boolean z;
        if (this.f76543a1 != -1) {
            return true;
        }
        float L = mo90956L();
        float D0 = mo90948D0(L);
        this.f76543a1 = 0;
        float abs = Math.abs(this.f76541Z0.get(0).floatValue() - L);
        for (int i = 1; i < this.f76541Z0.size(); i++) {
            float abs2 = Math.abs(this.f76541Z0.get(i).floatValue() - L);
            float D02 = mo90948D0(this.f76541Z0.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            if (!mo90962R() ? D02 - D0 >= 0.0f : D02 - D0 <= 0.0f) {
                z = false;
            } else {
                z = true;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.f76543a1 = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(D02 - D0) < ((float) this.f76524I0)) {
                    this.f76543a1 = -1;
                    return false;
                } else if (z) {
                    this.f76543a1 = i;
                }
            }
            abs = abs2;
        }
        if (this.f76543a1 != -1) {
            return true;
        }
        return false;
    }

    @C0359n0
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @C0344h1
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f76554g.mo53461x();
    }

    public int getActiveThumbIndex() {
        return this.f76543a1;
    }

    public int getFocusedThumbIndex() {
        return this.f76545b1;
    }

    @C0366r
    public int getHaloRadius() {
        return this.f76533R0;
    }

    @C0359n0
    public ColorStateList getHaloTintList() {
        return this.f76558j1;
    }

    public int getLabelBehavior() {
        return this.f76528M0;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f76547c1;
    }

    public float getThumbElevation() {
        return this.f76563o1.mo90795x();
    }

    @C0366r
    public int getThumbRadius() {
        return this.f76532Q0;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f76563o1.mo90736N();
    }

    public float getThumbStrokeWidth() {
        return this.f76563o1.mo90741Q();
    }

    @C0359n0
    public ColorStateList getThumbTintList() {
        return this.f76563o1.mo90797y();
    }

    @C0359n0
    public ColorStateList getTickActiveTintList() {
        return this.f76559k1;
    }

    @C0359n0
    public ColorStateList getTickInactiveTintList() {
        return this.f76560l1;
    }

    @C0359n0
    public ColorStateList getTickTintList() {
        if (this.f76560l1.equals(this.f76559k1)) {
            return this.f76559k1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @C0359n0
    public ColorStateList getTrackActiveTintList() {
        return this.f76561m1;
    }

    @C0366r
    public int getTrackHeight() {
        return this.f76529N0;
    }

    @C0359n0
    public ColorStateList getTrackInactiveTintList() {
        return this.f76562n1;
    }

    @C0366r
    public int getTrackSidePadding() {
        return this.f76530O0;
    }

    @C0359n0
    public ColorStateList getTrackTintList() {
        if (this.f76562n1.equals(this.f76561m1)) {
            return this.f76561m1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @C0366r
    public int getTrackWidth() {
        return this.f76553f1;
    }

    public float getValueFrom() {
        return this.f76539X0;
    }

    public float getValueTo() {
        return this.f76540Y0;
    }

    @C0359n0
    public List<Float> getValues() {
        return new ArrayList(this.f76541Z0);
    }

    /* renamed from: h */
    public void mo91005h(@C0359n0 L l) {
        this.f76572z.add(l);
    }

    /* renamed from: h0 */
    public final void mo91006h0(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.Slider, i, f76508G1, new int[0]);
        this.f76539X0 = j.getFloat(C31076a.C31091o.Slider_android_valueFrom, 0.0f);
        this.f76540Y0 = j.getFloat(C31076a.C31091o.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f76539X0));
        this.f76547c1 = j.getFloat(C31076a.C31091o.Slider_android_stepSize, 0.0f);
        int i4 = C31076a.C31091o.Slider_trackColor;
        boolean hasValue = j.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = C31076a.C31091o.Slider_trackColorInactive;
        }
        if (!hasValue) {
            i4 = C31076a.C31091o.Slider_trackColorActive;
        }
        ColorStateList a = C31500c.m127363a(context, j, i2);
        if (a == null) {
            a = C0507a.m2345a(context, C31076a.C31081e.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a);
        ColorStateList a2 = C31500c.m127363a(context, j, i4);
        if (a2 == null) {
            a2 = C0507a.m2345a(context, C31076a.C31081e.material_slider_active_track_color);
        }
        setTrackActiveTintList(a2);
        this.f76563o1.mo90777o0(C31500c.m127363a(context, j, C31076a.C31091o.Slider_thumbColor));
        int i5 = C31076a.C31091o.Slider_thumbStrokeColor;
        if (j.hasValue(i5)) {
            setThumbStrokeColor(C31500c.m127363a(context, j, i5));
        }
        setThumbStrokeWidth(j.getDimension(C31076a.C31091o.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList a3 = C31500c.m127363a(context, j, C31076a.C31091o.Slider_haloColor);
        if (a3 == null) {
            a3 = C0507a.m2345a(context, C31076a.C31081e.material_slider_halo_color);
        }
        setHaloTintList(a3);
        this.f76551e1 = j.getBoolean(C31076a.C31091o.Slider_tickVisible, true);
        int i6 = C31076a.C31091o.Slider_tickColor;
        boolean hasValue2 = j.hasValue(i6);
        if (hasValue2) {
            i3 = i6;
        } else {
            i3 = C31076a.C31091o.Slider_tickColorInactive;
        }
        if (!hasValue2) {
            i6 = C31076a.C31091o.Slider_tickColorActive;
        }
        ColorStateList a4 = C31500c.m127363a(context, j, i3);
        if (a4 == null) {
            a4 = C0507a.m2345a(context, C31076a.C31081e.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a4);
        ColorStateList a5 = C31500c.m127363a(context, j, i6);
        if (a5 == null) {
            a5 = C0507a.m2345a(context, C31076a.C31081e.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a5);
        setThumbRadius(j.getDimensionPixelSize(C31076a.C31091o.Slider_thumbRadius, 0));
        setHaloRadius(j.getDimensionPixelSize(C31076a.C31091o.Slider_haloRadius, 0));
        setThumbElevation(j.getDimension(C31076a.C31091o.Slider_thumbElevation, 0.0f));
        setTrackHeight(j.getDimensionPixelSize(C31076a.C31091o.Slider_trackHeight, 0));
        setLabelBehavior(j.getInt(C31076a.C31091o.Slider_labelBehavior, 0));
        if (!j.getBoolean(C31076a.C31091o.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        j.recycle();
    }

    /* renamed from: i */
    public void mo91007i(@C0359n0 T t) {
        this.f76520E0.add(t);
    }

    /* renamed from: i0 */
    public void mo91008i0(@C0359n0 L l) {
        this.f76572z.remove(l);
    }

    /* renamed from: j */
    public final void mo91009j(Drawable drawable) {
        int i = this.f76532Q0 * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = ((float) i) / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        drawable.setBounds(0, 0, (int) (((float) intrinsicWidth) * max), (int) (((float) intrinsicHeight) * max));
    }

    /* renamed from: j0 */
    public void mo91010j0(@C0359n0 T t) {
        this.f76520E0.remove(t);
    }

    /* renamed from: k */
    public final void mo91011k(C31725a aVar) {
        aVar.mo92032k1(C31432x.m127012g(this));
    }

    /* renamed from: k0 */
    public final void mo91012k0(int i) {
        BaseSlider<S, L, T>.d dVar = this.f76569w;
        if (dVar == null) {
            this.f76569w = new C31559d(this, (C31556a) null);
        } else {
            removeCallbacks(dVar);
        }
        this.f76569w.mo91097a(i);
        postDelayed(this.f76569w, 200);
    }

    /* renamed from: l */
    public final Float mo91013l(int i) {
        float f;
        if (this.f76556h1) {
            f = mo91017n(20);
        } else {
            f = mo91015m();
        }
        if (i == 21) {
            if (!mo90962R()) {
                f = -f;
            }
            return Float.valueOf(f);
        } else if (i == 22) {
            if (mo90962R()) {
                f = -f;
            }
            return Float.valueOf(f);
        } else if (i == 69) {
            return Float.valueOf(-f);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(f);
            }
            return null;
        }
    }

    /* renamed from: l0 */
    public final void mo91014l0(C31725a aVar, float f) {
        aVar.mo92034m1(mo90951F(f));
        int a0 = (this.f76530O0 + ((int) (mo90971a0(f) * ((float) this.f76553f1)))) - (aVar.getIntrinsicWidth() / 2);
        int o = mo91019o() - (this.f76534S0 + this.f76532Q0);
        aVar.setBounds(a0, o - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + a0, o);
        Rect rect = new Rect(aVar.getBounds());
        C31392d.m126857c(C31432x.m127012g(this), this, rect);
        aVar.setBounds(rect);
        C31432x.m127013h(this).mo90180a(aVar);
    }

    /* renamed from: m */
    public final float mo91015m() {
        float f = this.f76547c1;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: m0 */
    public final void mo91016m0(@C0359n0 ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f76541Z0.size() != arrayList.size() || !this.f76541Z0.equals(arrayList)) {
                this.f76541Z0 = arrayList;
                this.f76557i1 = true;
                this.f76545b1 = 0;
                mo91078u0();
                mo91038s();
                mo91081w();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: n */
    public final float mo91017n(int i) {
        float m = mo91015m();
        float f = (this.f76540Y0 - this.f76539X0) / m;
        float f2 = (float) i;
        if (f <= f2) {
            return m;
        }
        return ((float) Math.round(f / f2)) * m;
    }

    /* renamed from: n0 */
    public final boolean mo91018n0() {
        return this.f76528M0 == 3;
    }

    /* renamed from: o */
    public final int mo91019o() {
        int i = this.f76531P0;
        int i2 = 0;
        if (this.f76528M0 == 1 || mo91018n0()) {
            i2 = this.f76571y.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: o0 */
    public final boolean mo91020o0() {
        if (this.f76555g1 || !(getBackground() instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (C31725a k : this.f76571y) {
            mo91011k(k);
        }
    }

    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f76569w;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f76521F0 = false;
        for (C31725a t : this.f76571y) {
            mo91075t(t);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(@C0359n0 Canvas canvas) {
        if (this.f76557i1) {
            mo91082w0();
            mo90965U();
        }
        super.onDraw(canvas);
        int o = mo91019o();
        mo91085y(canvas, this.f76553f1, o);
        if (((Float) Collections.max(getValues())).floatValue() > this.f76539X0) {
            mo91083x(canvas, this.f76553f1, o);
        }
        mo90967W(canvas);
        if ((this.f76538W0 || isFocused() || mo91018n0()) && isEnabled()) {
            mo90966V(canvas, this.f76553f1, o);
            if (this.f76543a1 != -1 || mo91018n0()) {
                mo90943B();
            } else {
                mo90945C();
            }
        } else {
            mo90945C();
        }
        mo90941A(canvas, this.f76553f1, o);
    }

    public void onFocusChanged(boolean z, int i, @C0363p0 Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f76543a1 = -1;
            this.f76554g.mo53452o(this.f76545b1);
            return;
        }
        mo90947D(i);
        this.f76554g.mo53448X(this.f76545b1);
    }

    public boolean onKeyDown(int i, @C0359n0 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f76541Z0.size() == 1) {
            this.f76543a1 = 0;
        }
        if (this.f76543a1 == -1) {
            Boolean b0 = mo90972b0(i, keyEvent);
            if (b0 != null) {
                return b0.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.f76556h1 |= keyEvent.isLongPress();
        Float l = mo91013l(i);
        if (l != null) {
            if (mo91033p0(this.f76541Z0.get(this.f76543a1).floatValue() + l.floatValue())) {
                mo91078u0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return mo90969Y(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return mo90969Y(-1);
                }
                return false;
            }
        }
        this.f76543a1 = -1;
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i, @C0359n0 KeyEvent keyEvent) {
        this.f76556h1 = false;
        return super.onKeyUp(i, keyEvent);
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f76527L0;
        int i4 = 0;
        if (this.f76528M0 == 1 || mo91018n0()) {
            i4 = this.f76571y.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f76539X0 = sliderState.f76573a;
        this.f76540Y0 = sliderState.f76574b;
        mo91016m0(sliderState.f76575c);
        this.f76547c1 = sliderState.f76576d;
        if (sliderState.f76577e) {
            requestFocus();
        }
    }

    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f76573a = this.f76539X0;
        sliderState.f76574b = this.f76540Y0;
        sliderState.f76575c = new ArrayList<>(this.f76541Z0);
        sliderState.f76576d = this.f76547c1;
        sliderState.f76577e = hasFocus();
        return sliderState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo91080v0(i);
        mo91078u0();
    }

    public boolean onTouchEvent(@C0359n0 MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.f76530O0)) / ((float) this.f76553f1);
        this.f76566r1 = f;
        float max = Math.max(0.0f, f);
        this.f76566r1 = max;
        this.f76566r1 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f76535T0 = x;
            if (!mo90960P()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo90978f0()) {
                    requestFocus();
                    this.f76538W0 = true;
                    mo91039s0();
                    mo91078u0();
                    invalidate();
                    mo90973c0();
                }
            }
        } else if (actionMasked == 1) {
            this.f76538W0 = false;
            MotionEvent motionEvent2 = this.f76536U0;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f76536U0.getX() - motionEvent.getX()) <= ((float) this.f76524I0) && Math.abs(this.f76536U0.getY() - motionEvent.getY()) <= ((float) this.f76524I0) && mo90978f0()) {
                mo90973c0();
            }
            if (this.f76543a1 != -1) {
                mo91039s0();
                this.f76543a1 = -1;
                mo90974d0();
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f76538W0) {
                if (mo90960P() && Math.abs(x - this.f76535T0) < ((float) this.f76524I0)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                mo90973c0();
            }
            if (mo90978f0()) {
                this.f76538W0 = true;
                mo91039s0();
                mo91078u0();
                invalidate();
            }
        }
        setPressed(this.f76538W0);
        this.f76536U0 = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* renamed from: p */
    public void mo91032p() {
        this.f76572z.clear();
    }

    /* renamed from: p0 */
    public final boolean mo91033p0(float f) {
        return mo91037r0(this.f76543a1, f);
    }

    /* renamed from: q */
    public void mo91034q() {
        this.f76520E0.clear();
    }

    /* renamed from: q0 */
    public final double mo91035q0(float f) {
        float f2 = this.f76547c1;
        if (f2 <= 0.0f) {
            return (double) f;
        }
        int i = (int) ((this.f76540Y0 - this.f76539X0) / f2);
        return ((double) Math.round(f * ((float) i))) / ((double) i);
    }

    /* renamed from: r */
    public final ValueAnimator mo91036r(boolean z) {
        float f;
        ValueAnimator valueAnimator;
        long j;
        TimeInterpolator timeInterpolator;
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z) {
            valueAnimator = this.f76523H0;
        } else {
            valueAnimator = this.f76522G0;
        }
        float H = m127742H(valueAnimator, f);
        if (z) {
            f2 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{H, f2});
        if (z) {
            j = 83;
        } else {
            j = 117;
        }
        ofFloat.setDuration(j);
        if (z) {
            timeInterpolator = C31093a.f74429e;
        } else {
            timeInterpolator = C31093a.f74427c;
        }
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.addUpdateListener(new C31557b());
        return ofFloat;
    }

    /* renamed from: r0 */
    public final boolean mo91037r0(int i, float f) {
        this.f76545b1 = i;
        if (((double) Math.abs(f - this.f76541Z0.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.f76541Z0.set(i, Float.valueOf(mo90953I(i, f)));
        mo91079v(i);
        return true;
    }

    /* renamed from: s */
    public final void mo91038s() {
        if (this.f76571y.size() > this.f76541Z0.size()) {
            List<C31725a> subList = this.f76571y.subList(this.f76541Z0.size(), this.f76571y.size());
            for (C31725a next : subList) {
                if (C18196h2.m82521O0(this)) {
                    mo91075t(next);
                }
            }
            subList.clear();
        }
        while (this.f76571y.size() < this.f76541Z0.size()) {
            C31725a a = this.f76570x.mo91094a();
            this.f76571y.add(a);
            if (C18196h2.m82521O0(this)) {
                mo91011k(a);
            }
        }
        int i = 1;
        if (this.f76571y.size() == 1) {
            i = 0;
        }
        for (C31725a I0 : this.f76571y) {
            I0.mo90727I0((float) i);
        }
    }

    /* renamed from: s0 */
    public final boolean mo91039s0() {
        return mo91033p0(mo90955K());
    }

    public void setActiveThumbIndex(int i) {
        this.f76543a1 = i;
    }

    public void setCustomThumbDrawable(@C0375v int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(@C0375v @C0359n0 int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, (Paint) null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f76541Z0.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f76545b1 = i;
        this.f76554g.mo53448X(i);
        postInvalidate();
    }

    public void setHaloRadius(@C0366r @C0337f0(from = 0) int i) {
        if (i != this.f76533R0) {
            this.f76533R0 = i;
            Drawable background = getBackground();
            if (mo91020o0() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                C31332a.m126389b((RippleDrawable) background, this.f76533R0);
            }
        }
    }

    public void setHaloRadiusResource(@C0364q int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@C0359n0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f76558j1)) {
            this.f76558j1 = colorStateList;
            Drawable background = getBackground();
            if (mo91020o0() || !(background instanceof RippleDrawable)) {
                this.f76548d.setColor(mo90954J(colorStateList));
                this.f76548d.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.f76528M0 != i) {
            this.f76528M0 = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(@C0363p0 C31571d dVar) {
        this.f76537V0 = dVar;
    }

    public void setSeparationUnit(int i) {
        this.f76567s1 = i;
        this.f76557i1 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format(f76518y1, new Object[]{Float.valueOf(f), Float.valueOf(this.f76539X0), Float.valueOf(this.f76540Y0)}));
        } else if (this.f76547c1 != f) {
            this.f76547c1 = f;
            this.f76557i1 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f76563o1.mo90775n0(f);
    }

    public void setThumbElevationResource(@C0364q int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@C0366r @C0337f0(from = 0) int i) {
        if (i != this.f76532Q0) {
            this.f76532Q0 = i;
            mo90968X();
            this.f76563o1.setShapeAppearanceModel(C31534o.m127561a().mo90846q(0, (float) this.f76532Q0).mo90843m());
            C31525j jVar = this.f76563o1;
            int i2 = this.f76532Q0;
            jVar.setBounds(0, 0, i2 * 2, i2 * 2);
            Drawable drawable = this.f76564p1;
            if (drawable != null) {
                mo91009j(drawable);
            }
            for (Drawable j : this.f76565q1) {
                mo91009j(j);
            }
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(@C0364q int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@C0363p0 ColorStateList colorStateList) {
        this.f76563o1.mo90721F0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@C0358n int i) {
        if (i != 0) {
            setThumbStrokeColor(C0507a.m2345a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f76563o1.mo90727I0(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@C0364q int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@C0359n0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f76563o1.mo90797y())) {
            this.f76563o1.mo90777o0(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(@C0359n0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f76559k1)) {
            this.f76559k1 = colorStateList;
            this.f76552f.setColor(mo90954J(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(@C0359n0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f76560l1)) {
            this.f76560l1 = colorStateList;
            this.f76550e.setColor(mo90954J(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(@C0359n0 ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f76551e1 != z) {
            this.f76551e1 = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@C0359n0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f76561m1)) {
            this.f76561m1 = colorStateList;
            this.f76544b.setColor(mo90954J(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(@C0366r @C0337f0(from = 0) int i) {
        if (this.f76529N0 != i) {
            this.f76529N0 = i;
            mo90959O();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(@C0359n0 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f76562n1)) {
            this.f76562n1 = colorStateList;
            this.f76542a.setColor(mo90954J(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(@C0359n0 ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f76539X0 = f;
        this.f76557i1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f76540Y0 = f;
        this.f76557i1 = true;
        postInvalidate();
    }

    public void setValues(@C0359n0 Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        mo91016m0(arrayList);
    }

    /* renamed from: t */
    public final void mo91075t(C31725a aVar) {
        C31431w h = C31432x.m127013h(this);
        if (h != null) {
            h.mo90181b(aVar);
            aVar.mo92017X0(C31432x.m127012g(this));
        }
    }

    /* renamed from: t0 */
    public void mo91076t0(int i, Rect rect) {
        int a0 = this.f76530O0 + ((int) (mo90971a0(getValues().get(i).floatValue()) * ((float) this.f76553f1)));
        int o = mo91019o();
        int i2 = this.f76532Q0;
        rect.set(a0 - i2, o - i2, a0 + i2, o + i2);
    }

    /* renamed from: u */
    public final float mo91077u(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - ((float) this.f76530O0)) / ((float) this.f76553f1);
        float f3 = this.f76539X0;
        return (f2 * (f3 - this.f76540Y0)) + f3;
    }

    /* renamed from: u0 */
    public final void mo91078u0() {
        if (!mo91020o0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int a0 = (int) ((mo90971a0(this.f76541Z0.get(this.f76545b1).floatValue()) * ((float) this.f76553f1)) + ((float) this.f76530O0));
                int o = mo91019o();
                int i = this.f76533R0;
                C17549d.m80450l(background, a0 - i, o - i, a0 + i, o + i);
            }
        }
    }

    /* renamed from: v */
    public final void mo91079v(int i) {
        for (L b : this.f76572z) {
            b.mo91115b(this, this.f76541Z0.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f76568v;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            mo91012k0(i);
        }
    }

    /* renamed from: v0 */
    public final void mo91080v0(int i) {
        this.f76553f1 = Math.max(i - (this.f76530O0 * 2), 0);
        mo90965U();
    }

    /* renamed from: w */
    public final void mo91081w() {
        for (L l : this.f76572z) {
            Iterator<Float> it = this.f76541Z0.iterator();
            while (it.hasNext()) {
                l.mo91115b(this, it.next().floatValue(), false);
            }
        }
    }

    /* renamed from: w0 */
    public final void mo91082w0() {
        if (this.f76557i1) {
            mo91088z0();
            mo90942A0();
            mo91086y0();
            mo90944B0();
            mo91084x0();
            mo90950E0();
            this.f76557i1 = false;
        }
    }

    /* renamed from: x */
    public final void mo91083x(@C0359n0 Canvas canvas, int i, int i2) {
        float[] G = mo90952G();
        int i3 = this.f76530O0;
        float f = (float) i;
        float f2 = (float) i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) + (G[0] * f), f2, ((float) i3) + (G[1] * f), f2, this.f76544b);
    }

    /* renamed from: x0 */
    public final void mo91084x0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f = this.f76547c1;
            if (f > 0.0f && minSeparation > 0.0f) {
                if (this.f76567s1 != 1) {
                    throw new IllegalStateException(String.format(f76502A1, new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f76547c1)}));
                } else if (minSeparation < f || !mo90961Q(minSeparation)) {
                    throw new IllegalStateException(String.format(f76503B1, new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f76547c1), Float.valueOf(this.f76547c1)}));
                }
            }
        } else {
            throw new IllegalStateException(String.format(f76519z1, new Object[]{Float.valueOf(minSeparation)}));
        }
    }

    /* renamed from: y */
    public final void mo91085y(@C0359n0 Canvas canvas, int i, int i2) {
        float[] G = mo90952G();
        int i3 = this.f76530O0;
        float f = (float) i;
        float f2 = ((float) i3) + (G[1] * f);
        if (f2 < ((float) (i3 + i))) {
            float f3 = (float) i2;
            canvas.drawLine(f2, f3, (float) (i3 + i), f3, this.f76542a);
        }
        int i4 = this.f76530O0;
        float f4 = ((float) i4) + (G[0] * f);
        if (f4 > ((float) i4)) {
            float f5 = (float) i2;
            canvas.drawLine((float) i4, f5, f4, f5, this.f76542a);
        }
    }

    /* renamed from: y0 */
    public final void mo91086y0() {
        if (this.f76547c1 > 0.0f && !mo90946C0(this.f76540Y0)) {
            throw new IllegalStateException(String.format(f76518y1, new Object[]{Float.valueOf(this.f76547c1), Float.valueOf(this.f76539X0), Float.valueOf(this.f76540Y0)}));
        }
    }

    /* renamed from: z */
    public final void mo91087z(@C0359n0 Canvas canvas, int i, int i2, float f, @C0359n0 Drawable drawable) {
        canvas.save();
        canvas.translate(((float) (this.f76530O0 + ((int) (mo90971a0(f) * ((float) i))))) - (((float) drawable.getBounds().width()) / 2.0f), ((float) i2) - (((float) drawable.getBounds().height()) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* renamed from: z0 */
    public final void mo91088z0() {
        if (this.f76539X0 >= this.f76540Y0) {
            throw new IllegalStateException(String.format(f76516w1, new Object[]{Float.valueOf(this.f76539X0), Float.valueOf(this.f76540Y0)}));
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    public class C31559d implements Runnable {

        /* renamed from: a */
        public int f76583a;

        public C31559d() {
            this.f76583a = -1;
        }

        /* renamed from: a */
        public void mo91097a(int i) {
            this.f76583a = i;
        }

        public void run() {
            BaseSlider.this.f76554g.mo53449Y(this.f76583a, 4);
        }

        public /* synthetic */ C31559d(BaseSlider baseSlider, C31556a aVar) {
            this();
        }
    }

    public BaseSlider(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.sliderStyle);
    }

    public void setCustomThumbDrawable(@C0359n0 Drawable drawable) {
        this.f76564p1 = mo90958N(drawable);
        this.f76565q1.clear();
        postInvalidate();
    }

    public BaseSlider(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(C31683a.m128455c(context, attributeSet, i, f76508G1), attributeSet, i);
        this.f76571y = new ArrayList();
        this.f76572z = new ArrayList();
        this.f76520E0 = new ArrayList();
        this.f76521F0 = false;
        this.f76538W0 = false;
        this.f76541Z0 = new ArrayList<>();
        this.f76543a1 = -1;
        this.f76545b1 = -1;
        this.f76547c1 = 0.0f;
        this.f76551e1 = true;
        this.f76556h1 = false;
        C31525j jVar = new C31525j();
        this.f76563o1 = jVar;
        this.f76565q1 = Collections.emptyList();
        this.f76567s1 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f76542a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f76544b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f76546c = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f76548d = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f76550e = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f76552f = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        mo90964T(context2.getResources());
        this.f76570x = new C31556a(attributeSet, i);
        mo91006h0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        jVar.mo90796x0(2);
        this.f76524I0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        C31560e eVar = new C31560e(this);
        this.f76554g = eVar;
        C18196h2.m82474B1(this, eVar);
        this.f76568v = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(@C0359n0 List<Float> list) {
        mo91016m0(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(@C0359n0 Drawable... drawableArr) {
        this.f76564p1 = null;
        this.f76565q1 = new ArrayList();
        for (Drawable N : drawableArr) {
            this.f76565q1.add(mo90958N(N));
        }
        postInvalidate();
    }
}
