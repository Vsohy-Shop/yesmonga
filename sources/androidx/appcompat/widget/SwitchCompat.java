package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.C0379x;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.text.C0533a;
import androidx.core.graphics.drawable.C17549d;
import androidx.core.view.C18196h2;
import androidx.core.widget.C18496q;
import androidx.emoji2.text.C19019f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class SwitchCompat extends CompoundButton implements C0752n0 {

    /* renamed from: k1 */
    public static final int f2130k1 = 250;

    /* renamed from: l1 */
    public static final int f2131l1 = 0;

    /* renamed from: m1 */
    public static final int f2132m1 = 1;

    /* renamed from: n1 */
    public static final int f2133n1 = 2;

    /* renamed from: o1 */
    public static final String f2134o1 = "android.widget.Switch";

    /* renamed from: p1 */
    public static final int f2135p1 = 1;

    /* renamed from: q1 */
    public static final int f2136q1 = 2;

    /* renamed from: r1 */
    public static final int f2137r1 = 3;

    /* renamed from: s1 */
    public static final Property<SwitchCompat, Float> f2138s1 = new C0670a(Float.class, "thumbPos");

    /* renamed from: t1 */
    public static final int[] f2139t1 = {16842912};

    /* renamed from: E0 */
    public int f2140E0;

    /* renamed from: F0 */
    public boolean f2141F0;

    /* renamed from: G0 */
    public CharSequence f2142G0;

    /* renamed from: H0 */
    public CharSequence f2143H0;

    /* renamed from: I0 */
    public CharSequence f2144I0;

    /* renamed from: J0 */
    public CharSequence f2145J0;

    /* renamed from: K0 */
    public boolean f2146K0;

    /* renamed from: L0 */
    public int f2147L0;

    /* renamed from: M0 */
    public int f2148M0;

    /* renamed from: N0 */
    public float f2149N0;

    /* renamed from: O0 */
    public float f2150O0;

    /* renamed from: P0 */
    public VelocityTracker f2151P0;

    /* renamed from: Q0 */
    public int f2152Q0;

    /* renamed from: R0 */
    public float f2153R0;

    /* renamed from: S0 */
    public int f2154S0;

    /* renamed from: T0 */
    public int f2155T0;

    /* renamed from: U0 */
    public int f2156U0;

    /* renamed from: V0 */
    public int f2157V0;

    /* renamed from: W0 */
    public int f2158W0;

    /* renamed from: X0 */
    public int f2159X0;

    /* renamed from: Y0 */
    public int f2160Y0;

    /* renamed from: Z0 */
    public boolean f2161Z0;

    /* renamed from: a */
    public Drawable f2162a;

    /* renamed from: a1 */
    public final TextPaint f2163a1;

    /* renamed from: b */
    public ColorStateList f2164b;

    /* renamed from: b1 */
    public ColorStateList f2165b1;

    /* renamed from: c */
    public PorterDuff.Mode f2166c;

    /* renamed from: c1 */
    public Layout f2167c1;

    /* renamed from: d */
    public boolean f2168d;

    /* renamed from: d1 */
    public Layout f2169d1;

    /* renamed from: e */
    public boolean f2170e;
    @C0363p0

    /* renamed from: e1 */
    public TransformationMethod f2171e1;

    /* renamed from: f */
    public Drawable f2172f;

    /* renamed from: f1 */
    public ObjectAnimator f2173f1;

    /* renamed from: g */
    public ColorStateList f2174g;

    /* renamed from: g1 */
    public final C0784t f2175g1;
    @C0359n0

    /* renamed from: h1 */
    public C0724i f2176h1;
    @C0363p0

    /* renamed from: i1 */
    public C0672c f2177i1;

    /* renamed from: j1 */
    public final Rect f2178j1;

    /* renamed from: v */
    public PorterDuff.Mode f2179v;

    /* renamed from: w */
    public boolean f2180w;

    /* renamed from: x */
    public boolean f2181x;

    /* renamed from: y */
    public int f2182y;

    /* renamed from: z */
    public int f2183z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C0670a extends Property<SwitchCompat, Float> {
        public C0670a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f2153R0);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    @C0376v0(18)
    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    public static class C0671b {
        @C0373u
        /* renamed from: a */
        public static void m3255a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    public static class C0672c extends C19019f.C19027g {

        /* renamed from: a */
        public final Reference<SwitchCompat> f2184a;

        public C0672c(SwitchCompat switchCompat) {
            this.f2184a = new WeakReference(switchCompat);
        }

        /* renamed from: a */
        public void mo3108a(@C0363p0 Throwable th) {
            SwitchCompat switchCompat = this.f2184a.get();
            if (switchCompat != null) {
                switchCompat.mo3064k();
            }
        }

        /* renamed from: b */
        public void mo3109b() {
            SwitchCompat switchCompat = this.f2184a.get();
            if (switchCompat != null) {
                switchCompat.mo3064k();
            }
        }
    }

    public SwitchCompat(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public static float m3237g(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    @C0359n0
    private C0724i getEmojiTextViewHelper() {
        if (this.f2176h1 == null) {
            this.f2176h1 = new C0724i(this);
        }
        return this.f2176h1;
    }

    private boolean getTargetCheckedState() {
        return this.f2153R0 > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0796u1.m3859b(this)) {
            f = 1.0f - this.f2153R0;
        } else {
            f = this.f2153R0;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f2172f;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f2178j1;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f2162a;
        if (drawable2 != null) {
            rect = C0725i0.m3583d(drawable2);
        } else {
            rect = C0725i0.f2397c;
        }
        return ((((this.f2154S0 - this.f2156U0) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f2144I0 = charSequence;
        this.f2145J0 = mo3060h(charSequence);
        this.f2169d1 = null;
        if (this.f2146K0) {
            mo3068o();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f2142G0 = charSequence;
        this.f2143H0 = mo3060h(charSequence);
        this.f2167c1 = null;
        if (this.f2146K0) {
            mo3068o();
        }
    }

    /* renamed from: a */
    public final void mo3035a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f2138s1, new float[]{f});
        this.f2173f1 = ofFloat;
        ofFloat.setDuration(250);
        C0671b.m3255a(this.f2173f1, true);
        this.f2173f1.start();
    }

    /* renamed from: b */
    public boolean mo2545b() {
        return getEmojiTextViewHelper().mo3486b();
    }

    /* renamed from: c */
    public final void mo3036c() {
        Drawable drawable = this.f2162a;
        if (drawable == null) {
            return;
        }
        if (this.f2168d || this.f2170e) {
            Drawable mutate = C17549d.m80456r(drawable).mutate();
            this.f2162a = mutate;
            if (this.f2168d) {
                C17549d.m80453o(mutate, this.f2164b);
            }
            if (this.f2170e) {
                C17549d.m80454p(this.f2162a, this.f2166c);
            }
            if (this.f2162a.isStateful()) {
                this.f2162a.setState(getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public final void mo3037d() {
        Drawable drawable = this.f2172f;
        if (drawable == null) {
            return;
        }
        if (this.f2180w || this.f2181x) {
            Drawable mutate = C17549d.m80456r(drawable).mutate();
            this.f2172f = mutate;
            if (this.f2180w) {
                C17549d.m80453o(mutate, this.f2174g);
            }
            if (this.f2181x) {
                C17549d.m80454p(this.f2172f, this.f2179v);
            }
            if (this.f2172f.isStateful()) {
                this.f2172f.setState(getDrawableState());
            }
        }
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f2178j1;
        int i3 = this.f2157V0;
        int i4 = this.f2158W0;
        int i5 = this.f2159X0;
        int i6 = this.f2160Y0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f2162a;
        if (drawable != null) {
            rect = C0725i0.m3583d(drawable);
        } else {
            rect = C0725i0.f2397c;
        }
        Drawable drawable2 = this.f2172f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f2172f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f2172f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f2162a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f2156U0 + rect2.right;
            this.f2162a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C17549d.m80450l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f2162a;
        if (drawable != null) {
            C17549d.m80449k(drawable, f, f2);
        }
        Drawable drawable2 = this.f2172f;
        if (drawable2 != null) {
            C17549d.m80449k(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2162a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f2172f;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo3041e() {
        ObjectAnimator objectAnimator = this.f2173f1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: f */
    public final void mo3042f(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public int getCompoundPaddingLeft() {
        if (!C0796u1.m3859b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2154S0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f2140E0;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0796u1.m3859b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2154S0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f2140E0;
        }
        return compoundPaddingRight;
    }

    @C0363p0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C18496q.m83725G(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f2146K0;
    }

    public boolean getSplitTrack() {
        return this.f2141F0;
    }

    public int getSwitchMinWidth() {
        return this.f2183z;
    }

    public int getSwitchPadding() {
        return this.f2140E0;
    }

    public CharSequence getTextOff() {
        return this.f2144I0;
    }

    public CharSequence getTextOn() {
        return this.f2142G0;
    }

    public Drawable getThumbDrawable() {
        return this.f2162a;
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    public final float getThumbPosition() {
        return this.f2153R0;
    }

    public int getThumbTextPadding() {
        return this.f2182y;
    }

    @C0363p0
    public ColorStateList getThumbTintList() {
        return this.f2164b;
    }

    @C0363p0
    public PorterDuff.Mode getThumbTintMode() {
        return this.f2166c;
    }

    public Drawable getTrackDrawable() {
        return this.f2172f;
    }

    @C0363p0
    public ColorStateList getTrackTintList() {
        return this.f2174g;
    }

    @C0363p0
    public PorterDuff.Mode getTrackTintMode() {
        return this.f2179v;
    }

    @C0363p0
    /* renamed from: h */
    public final CharSequence mo3060h(@C0363p0 CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().mo3490f(this.f2171e1);
        if (f != null) {
            return f.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    /* renamed from: i */
    public final boolean mo3061i(float f, float f2) {
        if (this.f2162a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f2162a.getPadding(this.f2178j1);
        int i = this.f2158W0;
        int i2 = this.f2148M0;
        int i3 = i - i2;
        int i4 = (this.f2157V0 + thumbOffset) - i2;
        Rect rect = this.f2178j1;
        int i5 = this.f2156U0 + i4 + rect.left + rect.right + i2;
        int i6 = this.f2160Y0 + i2;
        if (f <= ((float) i4) || f >= ((float) i5) || f2 <= ((float) i3) || f2 >= ((float) i6)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final Layout mo3062j(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.f2163a1;
        if (charSequence != null) {
            i = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2162a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2172f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f2173f1;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f2173f1.end();
            this.f2173f1 = null;
        }
    }

    /* renamed from: k */
    public void mo3064k() {
        setTextOnInternal(this.f2142G0);
        setTextOffInternal(this.f2144I0);
        requestLayout();
    }

    /* renamed from: l */
    public final void mo3065l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f2144I0;
            if (charSequence == null) {
                charSequence = getResources().getString(C0387a.C0398k.abc_capital_off);
            }
            C18196h2.m82623q2(this, charSequence);
        }
    }

    /* renamed from: m */
    public final void mo3066m() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f2142G0;
            if (charSequence == null) {
                charSequence = getResources().getString(C0387a.C0398k.abc_capital_on);
            }
            C18196h2.m82623q2(this, charSequence);
        }
    }

    /* renamed from: n */
    public final void mo3067n(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i != 3) {
            typeface = null;
        } else {
            typeface = Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i2);
    }

    /* renamed from: o */
    public final void mo3068o() {
        if (this.f2177i1 == null && this.f2176h1.mo3486b() && C19019f.m88870q()) {
            C19019f c = C19019f.m88864c();
            int i = c.mo55965i();
            if (i == 3 || i == 0) {
                C0672c cVar = new C0672c(this);
                this.f2177i1 = cVar;
                c.mo55957B(cVar);
            }
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2139t1);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        Layout layout;
        int i;
        super.onDraw(canvas);
        Rect rect = this.f2178j1;
        Drawable drawable = this.f2172f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f2158W0;
        int i3 = this.f2160Y0;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f2162a;
        if (drawable != null) {
            if (!this.f2141F0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0725i0.m3583d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f2167c1;
        } else {
            layout = this.f2169d1;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f2165b1;
            if (colorStateList != null) {
                this.f2163a1.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f2163a1.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f2134o1);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f2134o1);
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f2142G0;
            } else {
                charSequence = this.f2144I0;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f2162a != null) {
            Rect rect = this.f2178j1;
            Drawable drawable = this.f2172f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0725i0.m3583d(this.f2162a);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0796u1.m3859b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f2154S0 + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f2154S0) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f2155T0;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f2155T0;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f2155T0;
            this.f2157V0 = i7;
            this.f2158W0 = i9;
            this.f2160Y0 = i8;
            this.f2159X0 = i6;
        }
        i8 = i10 + i9;
        this.f2157V0 = i7;
        this.f2158W0 = i9;
        this.f2160Y0 = i8;
        this.f2159X0 = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f2146K0) {
            if (this.f2167c1 == null) {
                this.f2167c1 = mo3062j(this.f2143H0);
            }
            if (this.f2169d1 == null) {
                this.f2169d1 = mo3062j(this.f2145J0);
            }
        }
        Rect rect = this.f2178j1;
        Drawable drawable = this.f2162a;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f2162a.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f2162a.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f2146K0) {
            i5 = Math.max(this.f2167c1.getWidth(), this.f2169d1.getWidth()) + (this.f2182y * 2);
        } else {
            i5 = 0;
        }
        this.f2156U0 = Math.max(i5, i4);
        Drawable drawable2 = this.f2172f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f2172f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f2162a;
        if (drawable3 != null) {
            Rect d = C0725i0.m3583d(drawable3);
            i8 = Math.max(i8, d.left);
            i9 = Math.max(i9, d.right);
        }
        if (this.f2161Z0) {
            i6 = Math.max(this.f2183z, (this.f2156U0 * 2) + i8 + i9);
        } else {
            i6 = this.f2183z;
        }
        int max = Math.max(i7, i3);
        this.f2154S0 = i6;
        this.f2155T0 = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f2142G0;
        } else {
            charSequence = this.f2144I0;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f2151P0
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009d
            r2 = 2
            if (r0 == r1) goto L_0x0089
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x0089
            goto L_0x00b7
        L_0x0016:
            int r0 = r6.f2147L0
            if (r0 == r1) goto L_0x0055
            if (r0 == r2) goto L_0x001e
            goto L_0x00b7
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f2149N0
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003b
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            r2 = r3
            goto L_0x003b
        L_0x0038:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L_0x003b:
            boolean r0 = androidx.appcompat.widget.C0796u1.m3859b(r6)
            if (r0 == 0) goto L_0x0042
            float r2 = -r2
        L_0x0042:
            float r0 = r6.f2153R0
            float r0 = r0 + r2
            float r0 = m3237g(r0, r4, r3)
            float r2 = r6.f2153R0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0054
            r6.f2149N0 = r7
            r6.setThumbPosition(r0)
        L_0x0054:
            return r1
        L_0x0055:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f2149N0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f2148M0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007b
            float r4 = r6.f2150O0
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f2148M0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
        L_0x007b:
            r6.f2147L0 = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f2149N0 = r0
            r6.f2150O0 = r3
            return r1
        L_0x0089:
            int r0 = r6.f2147L0
            if (r0 != r2) goto L_0x0094
            r6.mo3077p(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0094:
            r0 = 0
            r6.f2147L0 = r0
            android.view.VelocityTracker r0 = r6.f2151P0
            r0.clear()
            goto L_0x00b7
        L_0x009d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b7
            boolean r3 = r6.mo3061i(r0, r2)
            if (r3 == 0) goto L_0x00b7
            r6.f2147L0 = r1
            r6.f2149N0 = r0
            r6.f2150O0 = r2
        L_0x00b7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo3077p(MotionEvent motionEvent) {
        boolean z;
        this.f2147L0 = 0;
        boolean z2 = true;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z = false;
        } else {
            z = true;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.f2151P0.computeCurrentVelocity(1000);
            float xVelocity = this.f2151P0.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f2152Q0)) {
                z2 = getTargetCheckedState();
            } else if (!C0796u1.m3859b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z2 = false;
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        mo3042f(motionEvent);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo3488d(z);
    }

    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            mo3066m();
        } else {
            mo3065l();
        }
        if (getWindowToken() == null || !C18196h2.m82539U0(this)) {
            mo3041e();
            if (isChecked) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            setThumbPosition(f);
            return;
        }
        mo3035a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(@C0363p0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C18496q.m83726H(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo3489e(z);
        setTextOnInternal(this.f2142G0);
        setTextOffInternal(this.f2144I0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f2161Z0 = z;
        invalidate();
    }

    public void setFilters(@C0359n0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo3485a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f2146K0 != z) {
            this.f2146K0 = z;
            requestLayout();
            if (z) {
                mo3068o();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f2141F0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f2183z = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f2140E0 = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        C0722h1 E = C0722h1.m3537E(context, i, C0387a.C0400m.TextAppearance);
        ColorStateList d = E.mo3462d(C0387a.C0400m.TextAppearance_android_textColor);
        if (d != null) {
            this.f2165b1 = d;
        } else {
            this.f2165b1 = getTextColors();
        }
        int g = E.mo3465g(C0387a.C0400m.TextAppearance_android_textSize, 0);
        if (g != 0) {
            float f = (float) g;
            if (f != this.f2163a1.getTextSize()) {
                this.f2163a1.setTextSize(f);
                requestLayout();
            }
        }
        mo3067n(E.mo3473o(C0387a.C0400m.TextAppearance_android_typeface, -1), E.mo3473o(C0387a.C0400m.TextAppearance_android_textStyle, -1));
        if (E.mo3459a(C0387a.C0400m.TextAppearance_textAllCaps, false)) {
            this.f2171e1 = new C0533a(getContext());
        } else {
            this.f2171e1 = null;
        }
        setTextOnInternal(this.f2142G0);
        setTextOffInternal(this.f2144I0);
        E.mo3458I();
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.f2163a1;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f2163a1;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f2163a1.setFakeBoldText(false);
        this.f2163a1.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            mo3065l();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            mo3066m();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2162a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2162a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f2153R0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0507a.m2346b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f2182y = i;
        requestLayout();
    }

    public void setThumbTintList(@C0363p0 ColorStateList colorStateList) {
        this.f2164b = colorStateList;
        this.f2168d = true;
        mo3036c();
    }

    public void setThumbTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f2166c = mode;
        this.f2170e = true;
        mo3036c();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2172f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2172f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0507a.m2346b(getContext(), i));
    }

    public void setTrackTintList(@C0363p0 ColorStateList colorStateList) {
        this.f2174g = colorStateList;
        this.f2180w = true;
        mo3037d();
    }

    public void setTrackTintMode(@C0363p0 PorterDuff.Mode mode) {
        this.f2179v = mode;
        this.f2181x = true;
        mo3037d();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2162a || drawable == this.f2172f;
    }

    public SwitchCompat(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C0387a.C0389b.switchStyle);
    }

    public SwitchCompat(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2164b = null;
        this.f2166c = null;
        this.f2168d = false;
        this.f2170e = false;
        this.f2174g = null;
        this.f2179v = null;
        this.f2180w = false;
        this.f2181x = false;
        this.f2151P0 = VelocityTracker.obtain();
        this.f2161Z0 = true;
        this.f2178j1 = new Rect();
        C0705c1.m3421a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f2163a1 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C0387a.C0400m.SwitchCompat;
        C0722h1 G = C0722h1.m3539G(context, attributeSet, iArr, i, 0);
        C18196h2.m82658z1(this, context, iArr, attributeSet, G.mo3454B(), i, 0);
        Drawable h = G.mo3466h(C0387a.C0400m.SwitchCompat_android_thumb);
        this.f2162a = h;
        if (h != null) {
            h.setCallback(this);
        }
        Drawable h2 = G.mo3466h(C0387a.C0400m.SwitchCompat_track);
        this.f2172f = h2;
        if (h2 != null) {
            h2.setCallback(this);
        }
        setTextOnInternal(G.mo3482x(C0387a.C0400m.SwitchCompat_android_textOn));
        setTextOffInternal(G.mo3482x(C0387a.C0400m.SwitchCompat_android_textOff));
        this.f2146K0 = G.mo3459a(C0387a.C0400m.SwitchCompat_showText, true);
        this.f2182y = G.mo3465g(C0387a.C0400m.SwitchCompat_thumbTextPadding, 0);
        this.f2183z = G.mo3465g(C0387a.C0400m.SwitchCompat_switchMinWidth, 0);
        this.f2140E0 = G.mo3465g(C0387a.C0400m.SwitchCompat_switchPadding, 0);
        this.f2141F0 = G.mo3459a(C0387a.C0400m.SwitchCompat_splitTrack, false);
        ColorStateList d = G.mo3462d(C0387a.C0400m.SwitchCompat_thumbTint);
        if (d != null) {
            this.f2164b = d;
            this.f2168d = true;
        }
        PorterDuff.Mode e = C0725i0.m3584e(G.mo3473o(C0387a.C0400m.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f2166c != e) {
            this.f2166c = e;
            this.f2170e = true;
        }
        if (this.f2168d || this.f2170e) {
            mo3036c();
        }
        ColorStateList d2 = G.mo3462d(C0387a.C0400m.SwitchCompat_trackTint);
        if (d2 != null) {
            this.f2174g = d2;
            this.f2180w = true;
        }
        PorterDuff.Mode e2 = C0725i0.m3584e(G.mo3473o(C0387a.C0400m.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f2179v != e2) {
            this.f2179v = e2;
            this.f2181x = true;
        }
        if (this.f2180w || this.f2181x) {
            mo3037d();
        }
        int u = G.mo3479u(C0387a.C0400m.SwitchCompat_switchTextAppearance, 0);
        if (u != 0) {
            setSwitchTextAppearance(context, u);
        }
        C0784t tVar = new C0784t(this);
        this.f2175g1 = tVar;
        tVar.mo3662m(attributeSet, i);
        G.mo3458I();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2148M0 = viewConfiguration.getScaledTouchSlop();
        this.f2152Q0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().mo3487c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f2163a1.getTypeface() != null && !this.f2163a1.getTypeface().equals(typeface)) || (this.f2163a1.getTypeface() == null && typeface != null)) {
            this.f2163a1.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }
}
