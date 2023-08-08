package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.C0379x;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C17586h0;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31416m;
import com.google.android.material.internal.C31422p;
import com.google.android.material.resources.C31500c;
import com.google.android.material.resources.C31501d;
import com.google.android.material.shape.C31521g;
import com.google.android.material.shape.C31524i;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31531l;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.tooltip.a */
public class C31725a extends C31525j implements C31416m.C31418b {
    @C0327c1

    /* renamed from: k1 */
    public static final int f77228k1 = C31076a.C31090n.Widget_MaterialComponents_Tooltip;
    @C0336f

    /* renamed from: l1 */
    public static final int f77229l1 = C31076a.C31079c.tooltipStyle;
    @C0363p0

    /* renamed from: T0 */
    public CharSequence f77230T0;
    @C0359n0

    /* renamed from: U0 */
    public final Context f77231U0;
    @C0363p0

    /* renamed from: V0 */
    public final Paint.FontMetrics f77232V0 = new Paint.FontMetrics();
    @C0359n0

    /* renamed from: W0 */
    public final C31416m f77233W0;
    @C0359n0

    /* renamed from: X0 */
    public final View.OnLayoutChangeListener f77234X0;
    @C0359n0

    /* renamed from: Y0 */
    public final Rect f77235Y0;

    /* renamed from: Z0 */
    public int f77236Z0;

    /* renamed from: a1 */
    public int f77237a1;

    /* renamed from: b1 */
    public int f77238b1;

    /* renamed from: c1 */
    public int f77239c1;

    /* renamed from: d1 */
    public int f77240d1;

    /* renamed from: e1 */
    public int f77241e1;

    /* renamed from: f1 */
    public float f77242f1;

    /* renamed from: g1 */
    public float f77243g1;

    /* renamed from: h1 */
    public final float f77244h1;

    /* renamed from: i1 */
    public float f77245i1;

    /* renamed from: j1 */
    public float f77246j1;

    /* renamed from: com.google.android.material.tooltip.a$a */
    public class C31726a implements View.OnLayoutChangeListener {
        public C31726a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C31725a.this.mo92039r1(view);
        }
    }

    public C31725a(@C0359n0 Context context, AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        super(context, attributeSet, i, i2);
        C31416m mVar = new C31416m(this);
        this.f77233W0 = mVar;
        this.f77234X0 = new C31726a();
        this.f77235Y0 = new Rect();
        this.f77242f1 = 1.0f;
        this.f77243g1 = 1.0f;
        this.f77244h1 = 0.5f;
        this.f77245i1 = 0.5f;
        this.f77246j1 = 1.0f;
        this.f77231U0 = context;
        mVar.mo90164e().density = context.getResources().getDisplayMetrics().density;
        mVar.mo90164e().setTextAlign(Paint.Align.CENTER);
    }

    @C0359n0
    /* renamed from: T0 */
    public static C31725a m128642T0(@C0359n0 Context context) {
        return m128644V0(context, (AttributeSet) null, f77229l1, f77228k1);
    }

    @C0359n0
    /* renamed from: U0 */
    public static C31725a m128643U0(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        return m128644V0(context, attributeSet, f77229l1, f77228k1);
    }

    @C0359n0
    /* renamed from: V0 */
    public static C31725a m128644V0(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        C31725a aVar = new C31725a(context, attributeSet, i, i2);
        aVar.mo92026g1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: Q0 */
    public final float mo92013Q0() {
        int i;
        if (((this.f77235Y0.right - getBounds().right) - this.f77241e1) - this.f77239c1 < 0) {
            i = ((this.f77235Y0.right - getBounds().right) - this.f77241e1) - this.f77239c1;
        } else if (((this.f77235Y0.left - getBounds().left) - this.f77241e1) + this.f77239c1 <= 0) {
            return 0.0f;
        } else {
            i = ((this.f77235Y0.left - getBounds().left) - this.f77241e1) + this.f77239c1;
        }
        return (float) i;
    }

    /* renamed from: R0 */
    public final float mo92014R0() {
        this.f77233W0.mo90164e().getFontMetrics(this.f77232V0);
        Paint.FontMetrics fontMetrics = this.f77232V0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: S0 */
    public final float mo92015S0(@C0359n0 Rect rect) {
        return ((float) rect.centerY()) - mo92014R0();
    }

    /* renamed from: W0 */
    public final C31521g mo92016W0() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.f77240d1) * Math.sqrt(2.0d)))) / 2.0f;
        return new C31531l(new C31524i((float) this.f77240d1), Math.min(Math.max(-mo92013Q0(), -width), width));
    }

    /* renamed from: X0 */
    public void mo92017X0(@C0363p0 View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f77234X0);
        }
    }

    /* renamed from: Y0 */
    public final void mo92018Y0(@C0359n0 Canvas canvas) {
        if (this.f77230T0 != null) {
            Rect bounds = getBounds();
            int S0 = (int) mo92015S0(bounds);
            if (this.f77233W0.mo90163d() != null) {
                this.f77233W0.mo90164e().drawableState = getState();
                this.f77233W0.mo90170k(this.f77231U0);
                this.f77233W0.mo90164e().setAlpha((int) (this.f77246j1 * 255.0f));
            }
            CharSequence charSequence = this.f77230T0;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) S0, this.f77233W0.mo90164e());
        }
    }

    /* renamed from: Z0 */
    public int mo92019Z0() {
        return this.f77239c1;
    }

    /* renamed from: a */
    public void mo88225a() {
        invalidateSelf();
    }

    /* renamed from: a1 */
    public int mo92020a1() {
        return this.f77238b1;
    }

    /* renamed from: b1 */
    public int mo92021b1() {
        return this.f77237a1;
    }

    @C0363p0
    /* renamed from: c1 */
    public CharSequence mo92022c1() {
        return this.f77230T0;
    }

    @C0363p0
    /* renamed from: d1 */
    public C31501d mo92023d1() {
        return this.f77233W0.mo90163d();
    }

    public void draw(@C0359n0 Canvas canvas) {
        canvas.save();
        canvas.scale(this.f77242f1, this.f77243g1, ((float) getBounds().left) + (((float) getBounds().width()) * 0.5f), ((float) getBounds().top) + (((float) getBounds().height()) * this.f77245i1));
        canvas.translate(mo92013Q0(), (float) (-((((double) this.f77240d1) * Math.sqrt(2.0d)) - ((double) this.f77240d1))));
        super.draw(canvas);
        mo92018Y0(canvas);
        canvas.restore();
    }

    /* renamed from: e1 */
    public int mo92024e1() {
        return this.f77236Z0;
    }

    /* renamed from: f1 */
    public final float mo92025f1() {
        CharSequence charSequence = this.f77230T0;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f77233W0.mo90165f(charSequence.toString());
    }

    /* renamed from: g1 */
    public final void mo92026g1(@C0363p0 AttributeSet attributeSet, @C0336f int i, @C0327c1 int i2) {
        TypedArray j = C31422p.m126970j(this.f77231U0, attributeSet, C31076a.C31091o.Tooltip, i, i2, new int[0]);
        this.f77240d1 = this.f77231U0.getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().mo90822v().mo90849t(mo92016W0()).mo90843m());
        mo92034m1(j.getText(C31076a.C31091o.Tooltip_android_text));
        C31501d g = C31500c.m127369g(this.f77231U0, j, C31076a.C31091o.Tooltip_android_textAppearance);
        if (g != null) {
            int i3 = C31076a.C31091o.Tooltip_android_textColor;
            if (j.hasValue(i3)) {
                g.mo90651k(C31500c.m127363a(this.f77231U0, j, i3));
            }
        }
        mo92035n1(g);
        Class<C31725a> cls = C31725a.class;
        mo90777o0(ColorStateList.valueOf(j.getColor(C31076a.C31091o.Tooltip_backgroundTint, C31266s.m125961l(C17586h0.m80563B(C31266s.m125952c(this.f77231U0, 16842801, cls.getCanonicalName()), 229), C17586h0.m80563B(C31266s.m125952c(this.f77231U0, C31076a.C31079c.colorOnBackground, cls.getCanonicalName()), 153)))));
        mo90721F0(ColorStateList.valueOf(C31266s.m125952c(this.f77231U0, C31076a.C31079c.colorSurface, cls.getCanonicalName())));
        this.f77236Z0 = j.getDimensionPixelSize(C31076a.C31091o.Tooltip_android_padding, 0);
        this.f77237a1 = j.getDimensionPixelSize(C31076a.C31091o.Tooltip_android_minWidth, 0);
        this.f77238b1 = j.getDimensionPixelSize(C31076a.C31091o.Tooltip_android_minHeight, 0);
        this.f77239c1 = j.getDimensionPixelSize(C31076a.C31091o.Tooltip_android_layout_margin, 0);
        j.recycle();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f77233W0.mo90164e().getTextSize(), (float) this.f77238b1);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f77236Z0 * 2)) + mo92025f1(), (float) this.f77237a1);
    }

    /* renamed from: h1 */
    public void mo92029h1(@C0372t0 int i) {
        this.f77239c1 = i;
        invalidateSelf();
    }

    /* renamed from: i1 */
    public void mo92030i1(@C0372t0 int i) {
        this.f77238b1 = i;
        invalidateSelf();
    }

    /* renamed from: j1 */
    public void mo92031j1(@C0372t0 int i) {
        this.f77237a1 = i;
        invalidateSelf();
    }

    /* renamed from: k1 */
    public void mo92032k1(@C0363p0 View view) {
        if (view != null) {
            mo92039r1(view);
            view.addOnLayoutChangeListener(this.f77234X0);
        }
    }

    /* renamed from: l1 */
    public void mo92033l1(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f77245i1 = 1.2f;
        this.f77242f1 = f;
        this.f77243g1 = f;
        this.f77246j1 = C31093a.m124648b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    /* renamed from: m1 */
    public void mo92034m1(@C0363p0 CharSequence charSequence) {
        if (!TextUtils.equals(this.f77230T0, charSequence)) {
            this.f77230T0 = charSequence;
            this.f77233W0.mo90169j(true);
            invalidateSelf();
        }
    }

    /* renamed from: n1 */
    public void mo92035n1(@C0363p0 C31501d dVar) {
        this.f77233W0.mo90168i(dVar, this.f77231U0);
    }

    /* renamed from: o1 */
    public void mo92036o1(@C0327c1 int i) {
        mo92035n1(new C31501d(this.f77231U0, i));
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().mo90822v().mo90849t(mo92016W0()).mo90843m());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: p1 */
    public void mo92037p1(@C0372t0 int i) {
        this.f77236Z0 = i;
        invalidateSelf();
    }

    /* renamed from: q1 */
    public void mo92038q1(@C0324b1 int i) {
        mo92034m1(this.f77231U0.getResources().getString(i));
    }

    /* renamed from: r1 */
    public final void mo92039r1(@C0359n0 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f77241e1 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f77235Y0);
    }
}
