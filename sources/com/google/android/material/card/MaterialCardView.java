package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0375v;
import androidx.annotation.C0379x;
import androidx.appcompat.content.res.C0507a;
import androidx.cardview.widget.CardView;
import com.google.android.material.C31076a;
import com.google.android.material.shape.C31530k;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MaterialCardView extends CardView implements Checkable, C31553s {

    /* renamed from: G0 */
    public static final int[] f74948G0 = {16842911};

    /* renamed from: H0 */
    public static final int[] f74949H0 = {16842912};

    /* renamed from: I0 */
    public static final int[] f74950I0 = {C31076a.C31079c.state_dragged};

    /* renamed from: J0 */
    public static final int f74951J0 = C31076a.C31090n.Widget_MaterialComponents_CardView;

    /* renamed from: K0 */
    public static final String f74952K0 = "MaterialCardView";

    /* renamed from: L0 */
    public static final String f74953L0 = "androidx.cardview.widget.CardView";

    /* renamed from: M0 */
    public static final int f74954M0 = 8388659;

    /* renamed from: N0 */
    public static final int f74955N0 = 8388691;

    /* renamed from: O0 */
    public static final int f74956O0 = 8388661;

    /* renamed from: P0 */
    public static final int f74957P0 = 8388693;

    /* renamed from: E0 */
    public boolean f74958E0;

    /* renamed from: F0 */
    public C31200b f74959F0;
    @C0359n0

    /* renamed from: x */
    public final C31201a f74960x;

    /* renamed from: y */
    public boolean f74961y;

    /* renamed from: z */
    public boolean f74962z;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public @interface C31199a {
    }

    /* renamed from: com.google.android.material.card.MaterialCardView$b */
    public interface C31200b {
        /* renamed from: a */
        void mo88682a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f74960x.mo88726j().getBounds());
        return rectF;
    }

    @C0359n0
    public ColorStateList getCardBackgroundColor() {
        return this.f74960x.mo88727k();
    }

    @C0359n0
    public ColorStateList getCardForegroundColor() {
        return this.f74960x.mo88728l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @C0363p0
    public Drawable getCheckedIcon() {
        return this.f74960x.mo88729m();
    }

    public int getCheckedIconGravity() {
        return this.f74960x.mo88730n();
    }

    @C0366r
    public int getCheckedIconMargin() {
        return this.f74960x.mo88731o();
    }

    @C0366r
    public int getCheckedIconSize() {
        return this.f74960x.mo88732p();
    }

    @C0363p0
    public ColorStateList getCheckedIconTint() {
        return this.f74960x.mo88733q();
    }

    public int getContentPaddingBottom() {
        return this.f74960x.mo88683A().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f74960x.mo88683A().left;
    }

    public int getContentPaddingRight() {
        return this.f74960x.mo88683A().right;
    }

    public int getContentPaddingTop() {
        return this.f74960x.mo88683A().top;
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    public float getProgress() {
        return this.f74960x.mo88737u();
    }

    public float getRadius() {
        return this.f74960x.mo88735s();
    }

    public ColorStateList getRippleColor() {
        return this.f74960x.mo88738v();
    }

    @C0359n0
    public C31534o getShapeAppearanceModel() {
        return this.f74960x.mo88739w();
    }

    @C0354l
    @Deprecated
    public int getStrokeColor() {
        return this.f74960x.mo88740x();
    }

    @C0363p0
    public ColorStateList getStrokeColorStateList() {
        return this.f74960x.mo88741y();
    }

    @C0366r
    public int getStrokeWidth() {
        return this.f74960x.mo88742z();
    }

    /* renamed from: i */
    public final void mo88649i() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f74960x.mo88725i();
        }
    }

    public boolean isChecked() {
        return this.f74962z;
    }

    /* renamed from: j */
    public boolean mo88651j() {
        C31201a aVar = this.f74960x;
        return aVar != null && aVar.mo88686D();
    }

    /* renamed from: k */
    public boolean mo88652k() {
        return this.f74958E0;
    }

    /* renamed from: l */
    public void mo88653l(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31530k.m127555f(this, this.f74960x.mo88726j());
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo88651j()) {
            View.mergeDrawableStates(onCreateDrawableState, f74948G0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f74949H0);
        }
        if (mo88652k()) {
            View.mergeDrawableStates(onCreateDrawableState, f74950I0);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@C0359n0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f74953L0);
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f74953L0);
        accessibilityNodeInfo.setCheckable(mo88651j());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f74960x.mo88690H(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f74961y) {
            if (!this.f74960x.mo88685C()) {
                this.f74960x.mo88691I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(@C0354l int i) {
        this.f74960x.mo88692J(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f74960x.mo88716d0();
    }

    public void setCardForegroundColor(@C0363p0 ColorStateList colorStateList) {
        this.f74960x.mo88693K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f74960x.mo88694L(z);
    }

    public void setChecked(boolean z) {
        if (this.f74962z != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@C0363p0 Drawable drawable) {
        this.f74960x.mo88696N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f74960x.mo88730n() != i) {
            this.f74960x.mo88697O(i);
        }
    }

    public void setCheckedIconMargin(@C0366r int i) {
        this.f74960x.mo88698P(i);
    }

    public void setCheckedIconMarginResource(@C0364q int i) {
        if (i != -1) {
            this.f74960x.mo88698P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(@C0375v int i) {
        this.f74960x.mo88696N(C0507a.m2346b(getContext(), i));
    }

    public void setCheckedIconSize(@C0366r int i) {
        this.f74960x.mo88699Q(i);
    }

    public void setCheckedIconSizeResource(@C0364q int i) {
        if (i != 0) {
            this.f74960x.mo88699Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(@C0363p0 ColorStateList colorStateList) {
        this.f74960x.mo88700R(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C31201a aVar = this.f74960x;
        if (aVar != null) {
            aVar.mo88712b0();
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f74960x.mo88707Y(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f74958E0 != z) {
            this.f74958E0 = z;
            refreshDrawableState();
            mo88649i();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f74960x.mo88720f0();
    }

    public void setOnCheckedChangeListener(@C0363p0 C31200b bVar) {
        this.f74959F0 = bVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f74960x.mo88720f0();
        this.f74960x.mo88714c0();
    }

    public void setProgress(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        this.f74960x.mo88702T(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f74960x.mo88701S(f);
    }

    public void setRippleColor(@C0363p0 ColorStateList colorStateList) {
        this.f74960x.mo88703U(colorStateList);
    }

    public void setRippleColorResource(@C0358n int i) {
        this.f74960x.mo88703U(C0507a.m2345a(getContext(), i));
    }

    public void setShapeAppearanceModel(@C0359n0 C31534o oVar) {
        setClipToOutline(oVar.mo90821u(getBoundsAsRectF()));
        this.f74960x.mo88704V(oVar);
    }

    public void setStrokeColor(@C0354l int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@C0366r int i) {
        this.f74960x.mo88706X(i);
        invalidate();
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f74960x.mo88720f0();
        this.f74960x.mo88714c0();
    }

    public void toggle() {
        if (mo88651j() && isEnabled()) {
            this.f74962z = !this.f74962z;
            refreshDrawableState();
            mo88649i();
            this.f74960x.mo88695M(this.f74962z);
            C31200b bVar = this.f74959F0;
            if (bVar != null) {
                bVar.mo88682a(this, this.f74962z);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.materialCardViewStyle);
    }

    public void setCardBackgroundColor(@C0363p0 ColorStateList colorStateList) {
        this.f74960x.mo88692J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f74960x.mo88705W(colorStateList);
        invalidate();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f74951J0
            android.content.Context r8 = com.google.android.material.theme.overlay.C31683a.m128455c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f74962z = r8
            r7.f74958E0 = r8
            r0 = 1
            r7.f74961y = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f74960x = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.mo88692J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.mo88707Y(r9, r10, r1, r2)
            r0.mo88689G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
