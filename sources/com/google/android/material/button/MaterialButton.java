package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.C0354l;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.annotation.C0366r;
import androidx.annotation.C0372t0;
import androidx.annotation.C0375v;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.widget.C18496q;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C31076a;
import com.google.android.material.shape.C31530k;
import com.google.android.material.shape.C31534o;
import com.google.android.material.shape.C31553s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, C31553s {

    /* renamed from: I0 */
    public static final int[] f74883I0 = {16842911};

    /* renamed from: J0 */
    public static final int[] f74884J0 = {16842912};

    /* renamed from: K0 */
    public static final int f74885K0 = 1;

    /* renamed from: L0 */
    public static final int f74886L0 = 2;

    /* renamed from: M0 */
    public static final int f74887M0 = 3;

    /* renamed from: N0 */
    public static final int f74888N0 = 4;

    /* renamed from: O0 */
    public static final int f74889O0 = 16;

    /* renamed from: P0 */
    public static final int f74890P0 = 32;

    /* renamed from: Q0 */
    public static final String f74891Q0 = "MaterialButton";

    /* renamed from: R0 */
    public static final int f74892R0 = C31076a.C31090n.Widget_MaterialComponents_Button;
    @C0372t0

    /* renamed from: E0 */
    public int f74893E0;

    /* renamed from: F0 */
    public boolean f74894F0;

    /* renamed from: G0 */
    public boolean f74895G0;

    /* renamed from: H0 */
    public int f74896H0;
    @C0359n0

    /* renamed from: d */
    public final C31197a f74897d;
    @C0359n0

    /* renamed from: e */
    public final LinkedHashSet<C31190b> f74898e;
    @C0363p0

    /* renamed from: f */
    public C31191c f74899f;
    @C0363p0

    /* renamed from: g */
    public PorterDuff.Mode f74900g;
    @C0363p0

    /* renamed from: v */
    public ColorStateList f74901v;
    @C0363p0

    /* renamed from: w */
    public Drawable f74902w;
    @C0372t0

    /* renamed from: x */
    public int f74903x;
    @C0372t0

    /* renamed from: y */
    public int f74904y;
    @C0372t0

    /* renamed from: z */
    public int f74905z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C31188a();

        /* renamed from: c */
        public boolean f74906c;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        public class C31188a implements Parcelable.ClassLoaderCreator<SavedState> {
            @C0359n0
            /* renamed from: a */
            public SavedState createFromParcel(@C0359n0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @C0359n0
            /* renamed from: b */
            public SavedState createFromParcel(@C0359n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @C0359n0
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void mo88555b(@C0359n0 Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f74906c = z;
        }

        public void writeToParcel(@C0359n0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f74906c ? 1 : 0);
        }

        public SavedState(@C0359n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            mo88555b(parcel);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public @interface C31189a {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C31190b {
        /* renamed from: a */
        void mo88562a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public interface C31191c {
        /* renamed from: a */
        void mo88563a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    private String getA11yClassName() {
        return (mo88492d() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & C18306m0.f46962d;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: i */
    private boolean m125362i() {
        return C18196h2.m82553Z(this) == 1;
    }

    /* renamed from: a */
    public void mo88490a(@C0359n0 C31190b bVar) {
        this.f74898e.add(bVar);
    }

    /* renamed from: c */
    public void mo88491c() {
        this.f74898e.clear();
    }

    /* renamed from: d */
    public boolean mo88492d() {
        C31197a aVar = this.f74897d;
        return aVar != null && aVar.mo88626p();
    }

    /* renamed from: f */
    public final boolean mo88493f() {
        int i = this.f74896H0;
        return i == 3 || i == 4;
    }

    /* renamed from: g */
    public final boolean mo88494g() {
        int i = this.f74896H0;
        return i == 1 || i == 2;
    }

    @C0363p0
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @C0363p0
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @C0372t0
    public int getCornerRadius() {
        if (mo88512j()) {
            return this.f74897d.mo88612b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f74902w;
    }

    public int getIconGravity() {
        return this.f74896H0;
    }

    @C0372t0
    public int getIconPadding() {
        return this.f74893E0;
    }

    @C0372t0
    public int getIconSize() {
        return this.f74903x;
    }

    public ColorStateList getIconTint() {
        return this.f74901v;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f74900g;
    }

    @C0366r
    public int getInsetBottom() {
        return this.f74897d.mo88613c();
    }

    @C0366r
    public int getInsetTop() {
        return this.f74897d.mo88614d();
    }

    @C0363p0
    public ColorStateList getRippleColor() {
        if (mo88512j()) {
            return this.f74897d.mo88618h();
        }
        return null;
    }

    @C0359n0
    public C31534o getShapeAppearanceModel() {
        if (mo88512j()) {
            return this.f74897d.mo88619i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo88512j()) {
            return this.f74897d.mo88620j();
        }
        return null;
    }

    @C0372t0
    public int getStrokeWidth() {
        if (mo88512j()) {
            return this.f74897d.mo88621k();
        }
        return 0;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (mo88512j()) {
            return this.f74897d.mo88622l();
        }
        return super.getSupportBackgroundTintList();
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (mo88512j()) {
            return this.f74897d.mo88623m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final boolean mo88510h() {
        int i = this.f74896H0;
        return i == 16 || i == 32;
    }

    public boolean isChecked() {
        return this.f74894F0;
    }

    /* renamed from: j */
    public final boolean mo88512j() {
        C31197a aVar = this.f74897d;
        return aVar != null && !aVar.mo88625o();
    }

    /* renamed from: k */
    public void mo88513k(@C0359n0 C31190b bVar) {
        this.f74898e.remove(bVar);
    }

    /* renamed from: l */
    public final void mo88514l() {
        if (mo88494g()) {
            C18496q.m83749w(this, this.f74902w, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (mo88493f()) {
            C18496q.m83749w(this, (Drawable) null, (Drawable) null, this.f74902w, (Drawable) null);
        } else if (mo88510h()) {
            C18496q.m83749w(this, (Drawable) null, this.f74902w, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: m */
    public final void mo88515m(boolean z) {
        Drawable drawable = this.f74902w;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = C17549d.m80456r(drawable).mutate();
            this.f74902w = mutate;
            C17549d.m80453o(mutate, this.f74901v);
            PorterDuff.Mode mode = this.f74900g;
            if (mode != null) {
                C17549d.m80454p(this.f74902w, mode);
            }
            int i = this.f74903x;
            if (i == 0) {
                i = this.f74902w.getIntrinsicWidth();
            }
            int i2 = this.f74903x;
            if (i2 == 0) {
                i2 = this.f74902w.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f74902w;
            int i3 = this.f74904y;
            int i4 = this.f74905z;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f74902w.setVisible(true, z);
        }
        if (z) {
            mo88514l();
            return;
        }
        Drawable[] h = C18496q.m83734h(this);
        Drawable drawable3 = h[0];
        Drawable drawable4 = h[1];
        Drawable drawable5 = h[2];
        if ((!mo88494g() || drawable3 == this.f74902w) && ((!mo88493f() || drawable5 == this.f74902w) && (!mo88510h() || drawable4 == this.f74902w))) {
            z2 = false;
        }
        if (z2) {
            mo88514l();
        }
    }

    /* renamed from: n */
    public final void mo88516n(int i, int i2) {
        if (this.f74902w != null && getLayout() != null) {
            if (mo88494g() || mo88493f()) {
                this.f74905z = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i3 = this.f74896H0;
                boolean z = true;
                if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f74904y = 0;
                    mo88515m(false);
                    return;
                }
                int i4 = this.f74903x;
                if (i4 == 0) {
                    i4 = this.f74902w.getIntrinsicWidth();
                }
                int textWidth = ((((i - getTextWidth()) - C18196h2.m82593j0(this)) - i4) - this.f74893E0) - C18196h2.m82597k0(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textWidth /= 2;
                }
                boolean i5 = m125362i();
                if (this.f74896H0 != 4) {
                    z = false;
                }
                if (i5 != z) {
                    textWidth = -textWidth;
                }
                if (this.f74904y != textWidth) {
                    this.f74904y = textWidth;
                    mo88515m(false);
                }
            } else if (mo88510h()) {
                this.f74904y = 0;
                if (this.f74896H0 == 16) {
                    this.f74905z = 0;
                    mo88515m(false);
                    return;
                }
                int i6 = this.f74903x;
                if (i6 == 0) {
                    i6 = this.f74902w.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i6) - this.f74893E0) - getPaddingBottom()) / 2;
                if (this.f74905z != textHeight) {
                    this.f74905z = textHeight;
                    mo88515m(false);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo88512j()) {
            C31530k.m127555f(this, this.f74897d.mo88616f());
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo88492d()) {
            View.mergeDrawableStates(onCreateDrawableState, f74883I0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f74884J0);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@C0359n0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@C0359n0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo88492d());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo88516n(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(@C0363p0 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo53419a());
        setChecked(savedState.f74906c);
    }

    @C0359n0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f74906c = this.f74894F0;
        return savedState;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo88516n(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f74902w != null) {
            if (this.f74902w.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(@C0359n0 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(@C0354l int i) {
        if (mo88512j()) {
            this.f74897d.mo88628r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(@C0359n0 Drawable drawable) {
        if (!mo88512j()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            this.f74897d.mo88629s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(@C0375v int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0507a.m2346b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo88512j()) {
            this.f74897d.mo88630t(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo88492d() && isEnabled() && this.f74894F0 != z) {
            this.f74894F0 = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).mo88587p(this, this.f74894F0);
            }
            if (!this.f74895G0) {
                this.f74895G0 = true;
                Iterator<C31190b> it = this.f74898e.iterator();
                while (it.hasNext()) {
                    it.next().mo88562a(this, this.f74894F0);
                }
                this.f74895G0 = false;
            }
        }
    }

    public void setCornerRadius(@C0372t0 int i) {
        if (mo88512j()) {
            this.f74897d.mo88631u(i);
        }
    }

    public void setCornerRadiusResource(@C0364q int i) {
        if (mo88512j()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @C0376v0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (mo88512j()) {
            this.f74897d.mo88616f().mo90775n0(f);
        }
    }

    public void setIcon(@C0363p0 Drawable drawable) {
        if (this.f74902w != drawable) {
            this.f74902w = drawable;
            mo88515m(true);
            mo88516n(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f74896H0 != i) {
            this.f74896H0 = i;
            mo88516n(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@C0372t0 int i) {
        if (this.f74893E0 != i) {
            this.f74893E0 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@C0375v int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0507a.m2346b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(@C0372t0 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f74903x != i) {
            this.f74903x = i;
            mo88515m(true);
        }
    }

    public void setIconTint(@C0363p0 ColorStateList colorStateList) {
        if (this.f74901v != colorStateList) {
            this.f74901v = colorStateList;
            mo88515m(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f74900g != mode) {
            this.f74900g = mode;
            mo88515m(false);
        }
    }

    public void setIconTintResource(@C0358n int i) {
        setIconTint(C0507a.m2345a(getContext(), i));
    }

    public void setInsetBottom(@C0366r int i) {
        this.f74897d.mo88632v(i);
    }

    public void setInsetTop(@C0366r int i) {
        this.f74897d.mo88633w(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@C0363p0 C31191c cVar) {
        this.f74899f = cVar;
    }

    public void setPressed(boolean z) {
        C31191c cVar = this.f74899f;
        if (cVar != null) {
            cVar.mo88563a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@C0363p0 ColorStateList colorStateList) {
        if (mo88512j()) {
            this.f74897d.mo88634x(colorStateList);
        }
    }

    public void setRippleColorResource(@C0358n int i) {
        if (mo88512j()) {
            setRippleColor(C0507a.m2345a(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(@C0359n0 C31534o oVar) {
        if (mo88512j()) {
            this.f74897d.mo88635y(oVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo88512j()) {
            this.f74897d.mo88636z(z);
        }
    }

    public void setStrokeColor(@C0363p0 ColorStateList colorStateList) {
        if (mo88512j()) {
            this.f74897d.mo88601A(colorStateList);
        }
    }

    public void setStrokeColorResource(@C0358n int i) {
        if (mo88512j()) {
            setStrokeColor(C0507a.m2345a(getContext(), i));
        }
    }

    public void setStrokeWidth(@C0372t0 int i) {
        if (mo88512j()) {
            this.f74897d.mo88602B(i);
        }
    }

    public void setStrokeWidthResource(@C0364q int i) {
        if (mo88512j()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@C0363p0 ColorStateList colorStateList) {
        if (mo88512j()) {
            this.f74897d.mo88603C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@C0363p0 PorterDuff.Mode mode) {
        if (mo88512j()) {
            this.f74897d.mo88604D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @C0376v0(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        mo88516n(getMeasuredWidth(), getMeasuredHeight());
    }

    public void toggle() {
        setChecked(!this.f74894F0);
    }

    public MaterialButton(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(@androidx.annotation.C0359n0 android.content.Context r9, @androidx.annotation.C0363p0 android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f74892R0
            android.content.Context r9 = com.google.android.material.theme.overlay.C31683a.m128455c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f74898e = r9
            r9 = 0
            r8.f74894F0 = r9
            r8.f74895G0 = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = com.google.android.material.C31076a.C31091o.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C31422p.m126970j(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C31076a.C31091o.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f74893E0 = r1
            int r1 = com.google.android.material.C31076a.C31091o.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C31432x.m127017l(r1, r2)
            r8.f74900g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.C31076a.C31091o.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.C31500c.m127363a(r1, r0, r2)
            r8.f74901v = r1
            android.content.Context r1 = r8.getContext()
            int r2 = com.google.android.material.C31076a.C31091o.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.C31500c.m127367e(r1, r0, r2)
            r8.f74902w = r1
            int r1 = com.google.android.material.C31076a.C31091o.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f74896H0 = r1
            int r1 = com.google.android.material.C31076a.C31091o.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f74903x = r1
            com.google.android.material.shape.o$b r10 = com.google.android.material.shape.C31534o.m127565e(r7, r10, r11, r6)
            com.google.android.material.shape.o r10 = r10.mo90843m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f74897d = r11
            r11.mo88627q(r0)
            r0.recycle()
            int r10 = r8.f74893E0
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f74902w
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.mo88515m(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
