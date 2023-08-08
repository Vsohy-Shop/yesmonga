package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.C0322b;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0342h;
import androidx.annotation.C0346i;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.app.C17075f2;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18065l0;
import androidx.customview.widget.C18544a;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31100h;
import com.google.android.material.chip.C31213a;
import com.google.android.material.internal.C31396h;
import com.google.android.material.internal.C31422p;
import com.google.android.material.internal.C31432x;
import com.google.android.material.resources.C31501d;
import com.google.android.material.resources.C31505f;
import com.google.android.material.ripple.C31511b;
import com.google.android.material.shape.C31530k;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;
import com.urbanairship.push.notifications.C9530r;
import java.util.List;

public class Chip extends AppCompatCheckBox implements C31213a.C31214a, C31553s, C31396h<Chip> {

    /* renamed from: P0 */
    public static final String f74994P0 = "Chip";

    /* renamed from: Q0 */
    public static final int f74995Q0 = C31076a.C31090n.Widget_MaterialComponents_Chip_Action;

    /* renamed from: R0 */
    public static final int f74996R0 = 0;

    /* renamed from: S0 */
    public static final int f74997S0 = 1;

    /* renamed from: T0 */
    public static final Rect f74998T0 = new Rect();

    /* renamed from: U0 */
    public static final int[] f74999U0 = {16842913};

    /* renamed from: V0 */
    public static final int[] f75000V0 = {16842911};

    /* renamed from: W0 */
    public static final String f75001W0 = "http://schemas.android.com/apk/res/android";

    /* renamed from: X0 */
    public static final int f75002X0 = 48;

    /* renamed from: Y0 */
    public static final String f75003Y0 = "android.widget.Button";

    /* renamed from: Z0 */
    public static final String f75004Z0 = "android.widget.CompoundButton";

    /* renamed from: a1 */
    public static final String f75005a1 = "android.widget.RadioButton";

    /* renamed from: b1 */
    public static final String f75006b1 = "android.view.View";

    /* renamed from: E0 */
    public boolean f75007E0;

    /* renamed from: F0 */
    public boolean f75008F0;

    /* renamed from: G0 */
    public boolean f75009G0;

    /* renamed from: H0 */
    public int f75010H0;
    @C0366r(unit = 1)

    /* renamed from: I0 */
    public int f75011I0;
    @C0363p0

    /* renamed from: J0 */
    public CharSequence f75012J0;
    @C0359n0

    /* renamed from: K0 */
    public final C31206d f75013K0;

    /* renamed from: L0 */
    public boolean f75014L0;

    /* renamed from: M0 */
    public final Rect f75015M0;

    /* renamed from: N0 */
    public final RectF f75016N0;

    /* renamed from: O0 */
    public final C31505f f75017O0;
    @C0363p0

    /* renamed from: e */
    public C31213a f75018e;
    @C0363p0

    /* renamed from: f */
    public InsetDrawable f75019f;
    @C0363p0

    /* renamed from: g */
    public RippleDrawable f75020g;
    @C0363p0

    /* renamed from: v */
    public View.OnClickListener f75021v;
    @C0363p0

    /* renamed from: w */
    public CompoundButton.OnCheckedChangeListener f75022w;
    @C0363p0

    /* renamed from: x */
    public C31396h.C31397a<Chip> f75023x;

    /* renamed from: y */
    public boolean f75024y;

    /* renamed from: z */
    public boolean f75025z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C31203a extends C31505f {
        public C31203a() {
        }

        /* renamed from: a */
        public void mo88913a(int i) {
        }

        /* renamed from: b */
        public void mo88914b(@C0359n0 Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            if (chip.f75018e.mo88989K3()) {
                charSequence = Chip.this.f75018e.mo89003P1();
            } else {
                charSequence = Chip.this.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C31204b implements CompoundButton.OnCheckedChangeListener {
        public C31204b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (Chip.this.f75023x != null) {
                Chip.this.f75023x.mo90006a(Chip.this, z);
            }
            if (Chip.this.f75022w != null) {
                Chip.this.f75022w.onCheckedChanged(compoundButton, z);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    public class C31205c extends ViewOutlineProvider {
        public C31205c() {
        }

        @TargetApi(21)
        public void getOutline(View view, @C0359n0 Outline outline) {
            if (Chip.this.f75018e != null) {
                Chip.this.f75018e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$d */
    public class C31206d extends C18544a {
        public C31206d(Chip chip) {
            super(chip);
        }

        /* renamed from: C */
        public int mo53429C(float f, float f2) {
            return (!Chip.this.mo88808p() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* renamed from: D */
        public void mo53430D(@C0359n0 List<Integer> list) {
            list.add(0);
            if (Chip.this.mo88808p() && Chip.this.mo88912z() && Chip.this.f75021v != null) {
                list.add(1);
            }
        }

        /* renamed from: N */
        public boolean mo53438N(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo88752A();
            }
            return false;
        }

        /* renamed from: Q */
        public void mo53441Q(@C0359n0 C18065l0 l0Var) {
            l0Var.mo52586X0(Chip.this.mo88906t());
            l0Var.mo52596a1(Chip.this.isClickable());
            l0Var.mo52592Z0(Chip.this.getAccessibilityClassName());
            l0Var.mo52560O1(Chip.this.getText());
        }

        /* renamed from: R */
        public void mo53442R(int i, @C0359n0 C18065l0 l0Var) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    l0Var.mo52607d1(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C31076a.C31089m.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    l0Var.mo52607d1(context.getString(i2, objArr).trim());
                }
                l0Var.mo52577U0(Chip.this.getCloseIconTouchBoundsInt());
                l0Var.mo52598b(C18065l0.C18066a.f46673j);
                l0Var.mo52627j1(Chip.this.isEnabled());
                return;
            }
            l0Var.mo52607d1(charSequence);
            l0Var.mo52577U0(Chip.f74998T0);
        }

        /* renamed from: S */
        public void mo53443S(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f75008F0 = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    @C0359n0
    public RectF getCloseIconTouchBounds() {
        this.f75016N0.setEmpty();
        if (mo88808p() && this.f75021v != null) {
            this.f75018e.mo88972F1(this.f75016N0);
        }
        return this.f75016N0;
    }

    /* access modifiers changed from: private */
    @C0359n0
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f75015M0.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f75015M0;
    }

    @C0363p0
    private C31501d getTextAppearance() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89007Q1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f75007E0 != z) {
            this.f75007E0 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f75025z != z) {
            this.f75025z = z;
            refreshDrawableState();
        }
    }

    @C0346i
    /* renamed from: A */
    public boolean mo88752A() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f75021v;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f75014L0) {
            this.f75013K0.mo53449Y(1, 1);
        }
        return z;
    }

    /* renamed from: B */
    public final void mo88753B() {
        if (this.f75019f != null) {
            this.f75019f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            mo88757F();
        }
    }

    /* renamed from: C */
    public boolean mo88754C() {
        return this.f75009G0;
    }

    /* renamed from: D */
    public final void mo88755D(@C0363p0 C31213a aVar) {
        if (aVar != null) {
            aVar.mo89072k3((C31213a.C31214a) null);
        }
    }

    /* renamed from: E */
    public final void mo88756E() {
        if (!mo88808p() || !mo88912z() || this.f75021v == null) {
            C18196h2.m82474B1(this, (C18019a) null);
            this.f75014L0 = false;
            return;
        }
        C18196h2.m82474B1(this, this.f75013K0);
        this.f75014L0 = true;
    }

    /* renamed from: F */
    public final void mo88757F() {
        if (C31511b.f76296a) {
            mo88758G();
            return;
        }
        this.f75018e.mo88986J3(true);
        C18196h2.m82502I1(this, getBackgroundDrawable());
        mo88759H();
        mo88799o();
    }

    /* renamed from: G */
    public final void mo88758G() {
        this.f75020g = new RippleDrawable(C31511b.m127405d(this.f75018e.mo88996N1()), getBackgroundDrawable(), (Drawable) null);
        this.f75018e.mo88986J3(false);
        C18196h2.m82502I1(this, this.f75020g);
        mo88759H();
    }

    /* renamed from: H */
    public final void mo88759H() {
        C31213a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f75018e) != null) {
            int p1 = (int) (aVar.mo89087p1() + this.f75018e.mo89011R1() + this.f75018e.mo89022V0());
            int u1 = (int) (this.f75018e.mo89106u1() + this.f75018e.mo89014S1() + this.f75018e.mo89010R0());
            if (this.f75019f != null) {
                Rect rect = new Rect();
                this.f75019f.getPadding(rect);
                u1 += rect.left;
                p1 += rect.right;
            }
            C18196h2.m82571d2(this, u1, getPaddingTop(), p1, getPaddingBottom());
        }
    }

    /* renamed from: I */
    public final void mo88760I() {
        TextPaint paint = getPaint();
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C31501d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo90654n(getContext(), paint, this.f75017O0);
        }
    }

    /* renamed from: J */
    public final void mo88761J(@C0363p0 AttributeSet attributeSet) {
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", C9530r.f26051j, 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", C17075f2.C17106r.f45311I, 8388627);
            } else {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
        }
    }

    /* renamed from: a */
    public void mo88762a() {
        mo88798n(this.f75011I0);
        requestLayout();
        invalidateOutline();
    }

    public boolean dispatchHoverEvent(@C0359n0 MotionEvent motionEvent) {
        if (!this.f75014L0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.f75013K0.mo53459v(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f75014L0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f75013K0.mo53460w(keyEvent) || this.f75013K0.mo53428B() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        C31213a aVar = this.f75018e;
        if (aVar == null || !aVar.mo89041c2()) {
            z = false;
        } else {
            z = this.f75018e.mo89051f3(mo88797m());
        }
        if (z) {
            invalidate();
        }
    }

    @C0359n0
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f75012J0)) {
            return this.f75012J0;
        }
        if (mo88906t()) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).mo88930k()) {
                return f75004Z0;
            }
            return f75005a1;
        } else if (isClickable()) {
            return f75003Y0;
        } else {
            return "android.view.View";
        }
    }

    @C0363p0
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f75019f;
        if (insetDrawable == null) {
            return this.f75018e;
        }
        return insetDrawable;
    }

    @C0363p0
    public Drawable getCheckedIcon() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89073l1();
        }
        return null;
    }

    @C0363p0
    public ColorStateList getCheckedIconTint() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89076m1();
        }
        return null;
    }

    @C0363p0
    public ColorStateList getChipBackgroundColor() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89079n1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo89082o1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f75018e;
    }

    public float getChipEndPadding() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89087p1();
        }
        return 0.0f;
    }

    @C0363p0
    public Drawable getChipIcon() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89090q1();
        }
        return null;
    }

    public float getChipIconSize() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89093r1();
        }
        return 0.0f;
    }

    @C0363p0
    public ColorStateList getChipIconTint() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89096s1();
        }
        return null;
    }

    public float getChipMinHeight() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89103t1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89106u1();
        }
        return 0.0f;
    }

    @C0363p0
    public ColorStateList getChipStrokeColor() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89110v1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89113w1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @C0363p0
    public Drawable getCloseIcon() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89119y1();
        }
        return null;
    }

    @C0363p0
    public CharSequence getCloseIconContentDescription() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89122z1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88957A1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88960B1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88963C1();
        }
        return 0.0f;
    }

    @C0363p0
    public ColorStateList getCloseIconTint() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88969E1();
        }
        return null;
    }

    @C0363p0
    public TextUtils.TruncateAt getEllipsize() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88981I1();
        }
        return null;
    }

    public void getFocusedRect(@C0359n0 Rect rect) {
        if (!this.f75014L0 || !(this.f75013K0.mo53428B() == 1 || this.f75013K0.mo53461x() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    @C0363p0
    public C31100h getHideMotionSpec() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88984J1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88987K1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88990L1();
        }
        return 0.0f;
    }

    @C0363p0
    public ColorStateList getRippleColor() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88996N1();
        }
        return null;
    }

    @C0359n0
    public C31534o getShapeAppearanceModel() {
        return this.f75018e.getShapeAppearanceModel();
    }

    @C0363p0
    public C31100h getShowMotionSpec() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo88999O1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89011R1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            return aVar.mo89014S1();
        }
        return 0.0f;
    }

    /* renamed from: l */
    public final void mo88796l(@C0359n0 C31213a aVar) {
        aVar.mo89072k3(this);
    }

    @C0359n0
    /* renamed from: m */
    public final int[] mo88797m() {
        int isEnabled = isEnabled();
        if (this.f75008F0) {
            isEnabled++;
        }
        if (this.f75007E0) {
            isEnabled++;
        }
        if (this.f75025z) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f75008F0) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f75007E0) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f75025z) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: n */
    public boolean mo88798n(@C0366r int i) {
        int i2;
        this.f75011I0 = i;
        int i3 = 0;
        if (!mo88754C()) {
            if (this.f75019f != null) {
                mo88753B();
            } else {
                mo88757F();
            }
            return false;
        }
        int max = Math.max(0, i - this.f75018e.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f75018e.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            if (max2 > 0) {
                i2 = max2 / 2;
            } else {
                i2 = 0;
            }
            if (max > 0) {
                i3 = max / 2;
            }
            if (this.f75019f != null) {
                Rect rect = new Rect();
                this.f75019f.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                    mo88757F();
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            mo88811s(i2, i3, i2, i3);
            mo88757F();
            return true;
        }
        if (this.f75019f != null) {
            mo88753B();
        } else {
            mo88757F();
        }
        return false;
    }

    /* renamed from: o */
    public final void mo88799o() {
        if (getBackgroundDrawable() == this.f75019f && this.f75018e.getCallback() == null) {
            this.f75018e.setCallback(this.f75019f);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C31530k.m127555f(this, this.f75018e);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f74999U0);
        }
        if (mo88906t()) {
            View.mergeDrawableStates(onCreateDrawableState, f75000V0);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f75014L0) {
            this.f75013K0.mo53437M(z, i, rect);
        }
    }

    public boolean onHoverEvent(@C0359n0 MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(mo88906t());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C18065l0 c2 = C18065l0.m81936c2(accessibilityNodeInfo);
            if (chipGroup.mo88917c()) {
                i = chipGroup.mo88928i(this);
            } else {
                i = -1;
            }
            c2.mo52604c1(C18065l0.C18069d.m82106h(chipGroup.mo89918b(this), 1, i, 1, false, isChecked()));
        }
    }

    @C0363p0
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@C0359n0 MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f75010H0 != i) {
            this.f75010H0 = i;
            mo88759H();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@androidx.annotation.C0359n0 android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f75025z
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r3)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f75025z
            if (r0 == 0) goto L_0x0034
            r5.mo88752A()
            r0 = r2
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            r5.setCloseIconPressed(r3)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r2)
        L_0x003e:
            r0 = r2
            goto L_0x0041
        L_0x0040:
            r0 = r3
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean mo88808p() {
        C31213a aVar = this.f75018e;
        return (aVar == null || aVar.mo89119y1() == null) ? false : true;
    }

    /* renamed from: q */
    public final void mo88809q(Context context, @C0363p0 AttributeSet attributeSet, int i) {
        TypedArray j = C31422p.m126970j(context, attributeSet, C31076a.C31091o.Chip, i, f74995Q0, new int[0]);
        this.f75009G0 = j.getBoolean(C31076a.C31091o.Chip_ensureMinTouchTargetSize, false);
        this.f75011I0 = (int) Math.ceil((double) j.getDimension(C31076a.C31091o.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) C31432x.m127010e(getContext(), 48))));
        j.recycle();
    }

    /* renamed from: r */
    public final void mo88810r() {
        setOutlineProvider(new C31205c());
    }

    /* renamed from: s */
    public final void mo88811s(int i, int i2, int i3, int i4) {
        this.f75019f = new InsetDrawable(this.f75018e, i, i2, i3, i4);
    }

    public void setAccessibilityClassName(@C0363p0 CharSequence charSequence) {
        this.f75012J0 = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f75020g) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f75020g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89074l2(z);
        }
    }

    public void setCheckableResource(@C0342h int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89077m2(i);
        }
    }

    public void setChecked(boolean z) {
        C31213a aVar = this.f75018e;
        if (aVar == null) {
            this.f75024y = z;
        } else if (aVar.mo89025W1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@C0363p0 Drawable drawable) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89080n2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@C0342h int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@C0375v int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89091q2(i);
        }
    }

    public void setCheckedIconTint(@C0363p0 ColorStateList colorStateList) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89094r2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@C0358n int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89097s2(i);
        }
    }

    public void setCheckedIconVisible(@C0342h int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89104t2(i);
        }
    }

    public void setChipBackgroundColor(@C0363p0 ColorStateList colorStateList) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89111v2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@C0358n int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89114w2(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89117x2(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89120y2(i);
        }
    }

    public void setChipDrawable(@C0359n0 C31213a aVar) {
        C31213a aVar2 = this.f75018e;
        if (aVar2 != aVar) {
            mo88755D(aVar2);
            this.f75018e = aVar;
            aVar.mo89112v3(false);
            mo88796l(this.f75018e);
            mo88798n(this.f75011I0);
        }
    }

    public void setChipEndPadding(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89123z2(f);
        }
    }

    public void setChipEndPaddingResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88958A2(i);
        }
    }

    public void setChipIcon(@C0363p0 Drawable drawable) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88961B2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@C0342h int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@C0375v int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88970E2(i);
        }
    }

    public void setChipIconSize(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88973F2(f);
        }
    }

    public void setChipIconSizeResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88976G2(i);
        }
    }

    public void setChipIconTint(@C0363p0 ColorStateList colorStateList) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88979H2(colorStateList);
        }
    }

    public void setChipIconTintResource(@C0358n int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88982I2(i);
        }
    }

    public void setChipIconVisible(@C0342h int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88985J2(i);
        }
    }

    public void setChipMinHeight(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88991L2(f);
        }
    }

    public void setChipMinHeightResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88994M2(i);
        }
    }

    public void setChipStartPadding(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88997N2(f);
        }
    }

    public void setChipStartPaddingResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89000O2(i);
        }
    }

    public void setChipStrokeColor(@C0363p0 ColorStateList colorStateList) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89004P2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@C0358n int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89008Q2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89012R2(f);
        }
    }

    public void setChipStrokeWidthResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89015S2(i);
        }
    }

    @Deprecated
    public void setChipText(@C0363p0 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@C0324b1 int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@C0363p0 Drawable drawable) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89021U2(drawable);
        }
        mo88756E();
    }

    public void setCloseIconContentDescription(@C0363p0 CharSequence charSequence) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89023V2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@C0342h int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89032Y2(f);
        }
    }

    public void setCloseIconEndPaddingResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89035Z2(i);
        }
    }

    public void setCloseIconResource(@C0375v int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89037a3(i);
        }
        mo88756E();
    }

    public void setCloseIconSize(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89039b3(f);
        }
    }

    public void setCloseIconSizeResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89042c3(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89045d3(f);
        }
    }

    public void setCloseIconStartPaddingResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89049e3(i);
        }
    }

    public void setCloseIconTint(@C0363p0 ColorStateList colorStateList) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89053g3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@C0358n int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89061h3(i);
        }
    }

    public void setCloseIconVisible(@C0342h int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @C0376v0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo90775n0(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f75018e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C31213a aVar = this.f75018e;
                if (aVar != null) {
                    aVar.mo89075l3(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f75009G0 = z;
        mo88798n(this.f75011I0);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@C0363p0 C31100h hVar) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89078m3(hVar);
        }
    }

    public void setHideMotionSpecResource(@C0322b int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89081n3(i);
        }
    }

    public void setIconEndPadding(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89084o3(f);
        }
    }

    public void setIconEndPaddingResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89089p3(i);
        }
    }

    public void setIconStartPadding(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89092q3(f);
        }
    }

    public void setIconStartPaddingResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89095r3(i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@C0363p0 C31396h.C31397a<Chip> aVar) {
        this.f75023x = aVar;
    }

    public void setLayoutDirection(int i) {
        if (this.f75018e != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(@C0372t0 int i) {
        super.setMaxWidth(i);
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89098s3(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(@C0363p0 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f75022w = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f75021v = onClickListener;
        mo88756E();
    }

    public void setRippleColor(@C0363p0 ColorStateList colorStateList) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89105t3(colorStateList);
        }
        if (!this.f75018e.mo89020U1()) {
            mo88758G();
        }
    }

    public void setRippleColorResource(@C0358n int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89108u3(i);
            if (!this.f75018e.mo89020U1()) {
                mo88758G();
            }
        }
    }

    public void setShapeAppearanceModel(@C0359n0 C31534o oVar) {
        this.f75018e.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(@C0363p0 C31100h hVar) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89115w3(hVar);
        }
    }

    public void setShowMotionSpecResource(@C0322b int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89118x3(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.mo88989K3()) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            C31213a aVar2 = this.f75018e;
            if (aVar2 != null) {
                aVar2.mo89121y3(charSequence);
            }
        }
    }

    public void setTextAppearance(@C0363p0 C31501d dVar) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89124z3(dVar);
        }
        mo88760I();
    }

    public void setTextAppearanceResource(@C0327c1 int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88968D3(f);
        }
    }

    public void setTextEndPaddingResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88971E3(i);
        }
    }

    public void setTextStartPadding(float f) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88980H3(f);
        }
    }

    public void setTextStartPaddingResource(@C0364q int i) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88983I3(i);
        }
    }

    /* renamed from: t */
    public boolean mo88906t() {
        C31213a aVar = this.f75018e;
        return aVar != null && aVar.mo89025W1();
    }

    @Deprecated
    /* renamed from: u */
    public boolean mo88907u() {
        return mo88908v();
    }

    /* renamed from: v */
    public boolean mo88908v() {
        C31213a aVar = this.f75018e;
        return aVar != null && aVar.mo89031Y1();
    }

    @Deprecated
    /* renamed from: w */
    public boolean mo88909w() {
        return mo88910x();
    }

    /* renamed from: x */
    public boolean mo88910x() {
        C31213a aVar = this.f75018e;
        return aVar != null && aVar.mo89036a2();
    }

    @Deprecated
    /* renamed from: y */
    public boolean mo88911y() {
        return mo88912z();
    }

    /* renamed from: z */
    public boolean mo88912z() {
        C31213a aVar = this.f75018e;
        return aVar != null && aVar.mo89044d2();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89069j3(z);
        }
        mo88756E();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f74995Q0
            android.content.Context r7 = com.google.android.material.theme.overlay.C31683a.m128455c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f75015M0 = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f75016N0 = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f75017O0 = r7
            android.content.Context r0 = r6.getContext()
            r6.mo88761J(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.C31213a.m125577a1(r0, r8, r9, r4)
            r6.mo88809q(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.C18196h2.m82529R(r6)
            r7.mo90775n0(r1)
            int[] r2 = com.google.android.material.C31076a.C31091o.Chip
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C31076a.C31091o.Chip_shapeAppearance
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$d r8 = new com.google.android.material.chip.Chip$d
            r8.<init>(r6)
            r6.f75013K0 = r8
            r6.mo88756E()
            if (r9 != 0) goto L_0x0059
            r6.mo88810r()
        L_0x0059:
            boolean r8 = r6.f75024y
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.mo89003P1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.mo88981I1()
            r6.setEllipsize(r7)
            r6.mo88760I()
            com.google.android.material.chip.a r7 = r6.f75018e
            boolean r7 = r7.mo88989K3()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.mo88759H()
            boolean r7 = r6.mo88754C()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f75011I0
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = androidx.core.view.C18196h2.m82553Z(r6)
            r6.f75010H0 = r7
            com.google.android.material.chip.Chip$b r7 = new com.google.android.material.chip.Chip$b
            r7.<init>()
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo89107u2(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88988K2(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@C0363p0 Drawable drawable, @C0363p0 Drawable drawable2, @C0363p0 Drawable drawable3, @C0363p0 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88959A3(i);
        }
        mo88760I();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C31213a aVar = this.f75018e;
        if (aVar != null) {
            aVar.mo88959A3(i);
        }
        mo88760I();
    }
}
