package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.core.C16986a;
import androidx.core.view.C18019a;
import androidx.core.view.C18145d2;
import androidx.core.view.C18196h2;
import androidx.core.view.C18346q1;
import androidx.core.view.C18363s1;
import androidx.core.view.C18384u1;
import androidx.core.view.C18400w1;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.view.accessibility.C18094v0;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements C18384u1, C18346q1, C18145d2 {

    /* renamed from: T0 */
    public static final int f47156T0 = 250;

    /* renamed from: U0 */
    public static final float f47157U0 = 0.5f;

    /* renamed from: V0 */
    public static final String f47158V0 = "NestedScrollView";

    /* renamed from: W0 */
    public static final int f47159W0 = 250;

    /* renamed from: X0 */
    public static final float f47160X0 = 0.015f;

    /* renamed from: Y0 */
    public static final float f47161Y0 = 0.35f;

    /* renamed from: Z0 */
    public static final float f47162Z0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: a1 */
    public static final float f47163a1 = 4.0f;

    /* renamed from: b1 */
    public static final int f47164b1 = -1;

    /* renamed from: c1 */
    public static final C18454a f47165c1 = new C18454a();

    /* renamed from: d1 */
    public static final int[] f47166d1 = {16843130};

    /* renamed from: E0 */
    public boolean f47167E0;

    /* renamed from: F0 */
    public boolean f47168F0;

    /* renamed from: G0 */
    public int f47169G0;

    /* renamed from: H0 */
    public int f47170H0;

    /* renamed from: I0 */
    public int f47171I0;

    /* renamed from: J0 */
    public int f47172J0;

    /* renamed from: K0 */
    public final int[] f47173K0;

    /* renamed from: L0 */
    public final int[] f47174L0;

    /* renamed from: M0 */
    public int f47175M0;

    /* renamed from: N0 */
    public int f47176N0;

    /* renamed from: O0 */
    public SavedState f47177O0;

    /* renamed from: P0 */
    public final C18400w1 f47178P0;

    /* renamed from: Q0 */
    public final C18363s1 f47179Q0;

    /* renamed from: R0 */
    public float f47180R0;

    /* renamed from: S0 */
    public C18456c f47181S0;

    /* renamed from: a */
    public final float f47182a;

    /* renamed from: b */
    public long f47183b;

    /* renamed from: c */
    public final Rect f47184c;

    /* renamed from: d */
    public OverScroller f47185d;
    @C0344h1
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: e */
    public EdgeEffect f47186e;
    @C0344h1
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: f */
    public EdgeEffect f47187f;

    /* renamed from: g */
    public int f47188g;

    /* renamed from: v */
    public boolean f47189v;

    /* renamed from: w */
    public boolean f47190w;

    /* renamed from: x */
    public View f47191x;

    /* renamed from: y */
    public boolean f47192y;

    /* renamed from: z */
    public VelocityTracker f47193z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C18453a();

        /* renamed from: a */
        public int f47194a;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        public class C18453a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @C0359n0
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f47194a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f47194a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f47194a = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C18454a extends C18019a {
        /* renamed from: f */
        public void mo52492f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.mo52492f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C18094v0.m82146N(accessibilityEvent, nestedScrollView.getScrollX());
            C18094v0.m82147P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            int scrollRange;
            super.mo19938g(view, l0Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            l0Var.mo52592Z0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                l0Var.mo52542I1(true);
                if (nestedScrollView.getScrollY() > 0) {
                    l0Var.mo52598b(C18065l0.C18066a.f46682s);
                    l0Var.mo52598b(C18065l0.C18066a.f46649D);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    l0Var.mo52598b(C18065l0.C18066a.f46681r);
                    l0Var.mo52598b(C18065l0.C18066a.f46651F);
                }
            }
        }

        /* renamed from: j */
        public boolean mo19939j(View view, int i, Bundle bundle) {
            if (super.mo19939j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo53240b0(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo53240b0(0, min, true);
            return true;
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C18455b {
        @C0373u
        /* renamed from: a */
        public static boolean m83586a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public interface C18456c {
        /* renamed from: a */
        void mo1055a(@C0359n0 NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public static boolean m83526I(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m83526I((View) parent, view2)) {
            return false;
        }
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f47180R0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f47180R0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f47180R0;
    }

    /* renamed from: k */
    public static int m83527k(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: A */
    public final float mo53210A(int i) {
        double log = Math.log((double) ((((float) Math.abs(i)) * 0.35f) / (this.f47182a * 0.015f)));
        float f = f47162Z0;
        return (float) (((double) (this.f47182a * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * log));
    }

    /* renamed from: B */
    public final boolean mo53211B(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final void mo53212C() {
        VelocityTracker velocityTracker = this.f47193z;
        if (velocityTracker == null) {
            this.f47193z = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: D */
    public final void mo53213D() {
        this.f47185d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f47169G0 = viewConfiguration.getScaledTouchSlop();
        this.f47170H0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f47171I0 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: E */
    public final void mo53214E() {
        if (this.f47193z == null) {
            this.f47193z = VelocityTracker.obtain();
        }
    }

    /* renamed from: F */
    public boolean mo53215F() {
        return this.f47167E0;
    }

    /* renamed from: G */
    public final boolean mo53216G(View view) {
        return !mo53218J(view, 0, getHeight());
    }

    /* renamed from: H */
    public boolean mo53217H() {
        return this.f47168F0;
    }

    /* renamed from: J */
    public final boolean mo53218J(View view, int i, int i2) {
        view.getDrawingRect(this.f47184c);
        offsetDescendantRectToMyCoords(view, this.f47184c);
        if (this.f47184c.bottom + i < getScrollY() || this.f47184c.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final void mo53219K(int i, int i2, @C0363p0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f47179Q0.mo53013e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: L */
    public final void mo53220L(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f47172J0) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f47188g = (int) motionEvent.getY(i);
            this.f47172J0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f47193z;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: M */
    public boolean mo53221M(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z3)) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i11 = i3 + i;
        if (!z4) {
            i9 = 0;
        } else {
            i9 = i7;
        }
        int i12 = i4 + i2;
        if (!z5) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        int i13 = -i9;
        int i14 = i9 + i5;
        int i15 = -i10;
        int i16 = i10 + i6;
        if (i11 > i14) {
            i11 = i14;
            z6 = true;
        } else if (i11 < i13) {
            z6 = true;
            i11 = i13;
        } else {
            z6 = false;
        }
        if (i12 > i16) {
            i12 = i16;
            z7 = true;
        } else if (i12 < i15) {
            z7 = true;
            i12 = i15;
        } else {
            z7 = false;
        }
        if (z7 && !mo52992b(1)) {
            this.f47185d.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i11, i12, z6, z7);
        if (z6 || z7) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public boolean mo53222N(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.f47184c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f47184c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f47184c.top = getScrollY() - height;
            Rect rect2 = this.f47184c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f47184c;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return mo53226R(i, i2, i3);
    }

    /* renamed from: O */
    public final void mo53223O() {
        VelocityTracker velocityTracker = this.f47193z;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f47193z = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo53224P(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f47186e
            float r0 = androidx.core.widget.C18480i.m83656d(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f47186e
            float r4 = -r4
            float r4 = androidx.core.widget.C18480i.m83658j(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f47186e
            float r5 = androidx.core.widget.C18480i.m83656d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f47186e
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f47187f
            float r0 = androidx.core.widget.C18480i.m83656d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f47187f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C18480i.m83658j(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f47187f
            float r5 = androidx.core.widget.C18480i.m83656d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f47187f
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0063
            r3.invalidate()
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo53224P(int, float):int");
    }

    /* renamed from: Q */
    public final void mo53225Q(boolean z) {
        if (z) {
            mo52993d(2, 1);
        } else {
            mo52996g(1);
        }
        this.f47176N0 = getScrollY();
        C18196h2.m82610n1(this);
    }

    /* renamed from: R */
    public final boolean mo53226R(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View x = mo53282x(z, i2, i3);
        if (x == null) {
            x = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            mo53278t(i4);
            z2 = true;
        }
        if (x != findFocus()) {
            x.requestFocus(i);
        }
        return z2;
    }

    /* renamed from: S */
    public final void mo53227S(View view) {
        view.getDrawingRect(this.f47184c);
        offsetDescendantRectToMyCoords(view, this.f47184c);
        int l = mo53253l(this.f47184c);
        if (l != 0) {
            scrollBy(0, l);
        }
    }

    /* renamed from: T */
    public final boolean mo53228T(Rect rect, boolean z) {
        boolean z2;
        int l = mo53253l(rect);
        if (l != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, l);
            } else {
                mo53230V(0, l);
            }
        }
        return z2;
    }

    /* renamed from: U */
    public final boolean mo53229U(@C0359n0 EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        if (mo53210A(-i) < C18480i.m83656d(edgeEffect) * ((float) getHeight())) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final void mo53230V(int i, int i2) {
        mo53232X(i, i2, 250, false);
    }

    /* renamed from: W */
    public final void mo53231W(int i, int i2, int i3) {
        mo53232X(i, i2, i3, false);
    }

    /* renamed from: X */
    public final void mo53232X(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f47183b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f47185d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                mo53225Q(z);
            } else {
                if (!this.f47185d.isFinished()) {
                    mo53241c();
                }
                scrollBy(i, i2);
            }
            this.f47183b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: Y */
    public final void mo53233Y(int i, int i2) {
        mo53235a0(i, i2, 250, false);
    }

    /* renamed from: Z */
    public final void mo53234Z(int i, int i2, int i3) {
        mo53235a0(i, i2, i3, false);
    }

    /* renamed from: a */
    public void mo52998a(int i, int i2, int i3, int i4, @C0363p0 int[] iArr, int i5, @C0359n0 int[] iArr2) {
        this.f47179Q0.mo53013e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a0 */
    public void mo53235a0(int i, int i2, int i3, boolean z) {
        mo53232X(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    public void addView(@C0359n0 View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo52992b(int i) {
        return this.f47179Q0.mo53020l(i);
    }

    /* renamed from: b0 */
    public void mo53240b0(int i, int i2, boolean z) {
        mo53235a0(i, i2, 250, z);
    }

    /* renamed from: c */
    public final void mo53241c() {
        this.f47185d.abortAnimation();
        mo52996g(1);
    }

    /* renamed from: c0 */
    public final boolean mo53242c0(MotionEvent motionEvent) {
        boolean z;
        if (C18480i.m83656d(this.f47186e) != 0.0f) {
            C18480i.m83658j(this.f47186e, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (C18480i.m83656d(this.f47187f) == 0.0f) {
            return z;
        }
        C18480i.m83658j(this.f47187f, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f47185d.isFinished()) {
            this.f47185d.computeScrollOffset();
            int currY = this.f47185d.getCurrY();
            int p = mo53268p(currY - this.f47176N0);
            this.f47176N0 = currY;
            int[] iArr = this.f47174L0;
            boolean z = false;
            iArr[1] = 0;
            mo52995f(0, p, iArr, (int[]) null, 1);
            int i = p - this.f47174L0[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                mo53221M(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i2 = i - scrollY2;
                int[] iArr2 = this.f47174L0;
                iArr2[1] = 0;
                mo52998a(0, scrollY2, 0, i2, this.f47173K0, 1, iArr2);
                i = i2 - this.f47174L0[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i < 0) {
                        if (this.f47186e.isFinished()) {
                            this.f47186e.onAbsorb((int) this.f47185d.getCurrVelocity());
                        }
                    } else if (this.f47187f.isFinished()) {
                        this.f47187f.onAbsorb((int) this.f47185d.getCurrVelocity());
                    }
                }
                mo53241c();
            }
            if (!this.f47185d.isFinished()) {
                C18196h2.m82610n1(this);
            } else {
                mo52996g(1);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* renamed from: d */
    public boolean mo52993d(int i, int i2) {
        return this.f47179Q0.mo53027s(i, i2);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo53281w(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f47179Q0.mo53009a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f47179Q0.mo53010b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, @C0363p0 int[] iArr, @C0363p0 int[] iArr2) {
        return mo52995f(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @C0363p0 int[] iArr) {
        return this.f47179Q0.mo53014f(i, i2, i3, i4, iArr);
    }

    public void draw(@C0359n0 Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f47186e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C18455b.m83586a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C18455b.m83586a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f47186e.setSize(width, height);
            if (this.f47186e.draw(canvas)) {
                C18196h2.m82610n1(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f47187f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C18455b.m83586a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (C18455b.m83586a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f47187f.setSize(width2, height2);
            if (this.f47187f.draw(canvas)) {
                C18196h2.m82610n1(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public boolean mo52994e(int i, int i2, int i3, int i4, @C0363p0 int[] iArr, int i5) {
        return this.f47179Q0.mo53015g(i, i2, i3, i4, iArr, i5);
    }

    /* renamed from: f */
    public boolean mo52995f(int i, int i2, @C0363p0 int[] iArr, @C0363p0 int[] iArr2, int i3) {
        return this.f47179Q0.mo53012d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: g */
    public void mo52996g(int i) {
        this.f47179Q0.mo53029u(i);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f47178P0.mo53039a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean mo53250h(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo53218J(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo53278t(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f47184c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f47184c);
            mo53278t(mo53253l(this.f47184c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !mo53216G(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public boolean hasNestedScrollingParent() {
        return mo52992b(0);
    }

    /* renamed from: i */
    public final boolean mo53251i() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f47179Q0.mo53021m();
    }

    /* renamed from: j */
    public final boolean mo53252j() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public int mo53253l(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i5 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    /* renamed from: m */
    public void mo2389m(@C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        this.f47178P0.mo53041c(view, view2, i, i2);
        mo52993d(2, i2);
    }

    public void measureChild(@C0359n0 View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo2390n(@C0359n0 View view, int i) {
        this.f47178P0.mo53043e(view, i);
        mo52996g(i);
    }

    /* renamed from: o */
    public void mo2391o(@C0359n0 View view, int i, int i2, @C0359n0 int[] iArr, int i3) {
        mo52995f(i, i2, iArr, (int[]) null, i3);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47190w = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(@androidx.annotation.C0359n0 android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L_0x00aa
            boolean r0 = r8.f47192y
            if (r0 != 0) goto L_0x00aa
            r0 = 2
            boolean r0 = androidx.core.view.C18327o1.m83041l(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = androidx.core.view.C18327o1.m83041l(r9, r0)
            if (r0 == 0) goto L_0x002b
            r0 = 26
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00aa
            float r1 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x0071
            boolean r1 = r8.mo53251i()
            if (r1 == 0) goto L_0x0055
            boolean r9 = androidx.core.view.C18327o1.m83041l(r9, r5)
            if (r9 != 0) goto L_0x0055
            r9 = r6
            goto L_0x0056
        L_0x0055:
            r9 = r2
        L_0x0056:
            if (r9 == 0) goto L_0x006f
            android.widget.EdgeEffect r9 = r8.f47186e
            float r0 = (float) r0
            float r0 = -r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.C18480i.m83658j(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f47186e
            r9.onRelease()
            r8.invalidate()
            r9 = r6
            goto L_0x009f
        L_0x006f:
            r9 = r2
            goto L_0x009f
        L_0x0071:
            if (r0 <= r1) goto L_0x009d
            boolean r7 = r8.mo53251i()
            if (r7 == 0) goto L_0x0081
            boolean r9 = androidx.core.view.C18327o1.m83041l(r9, r5)
            if (r9 != 0) goto L_0x0081
            r9 = r6
            goto L_0x0082
        L_0x0081:
            r9 = r2
        L_0x0082:
            if (r9 == 0) goto L_0x009a
            android.widget.EdgeEffect r9 = r8.f47187f
            int r0 = r0 - r1
            float r0 = (float) r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.C18480i.m83658j(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f47187f
            r9.onRelease()
            r8.invalidate()
            r2 = r6
        L_0x009a:
            r9 = r2
            r2 = r1
            goto L_0x009f
        L_0x009d:
            r9 = r2
            r2 = r0
        L_0x009f:
            if (r2 == r3) goto L_0x00a9
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r2)
            return r6
        L_0x00a9:
            return r9
        L_0x00aa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(@C0359n0 MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f47192y) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f47172J0;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f47188g) > this.f47169G0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f47192y = true;
                                this.f47188g = y;
                                mo53214E();
                                this.f47193z.addMovement(motionEvent);
                                this.f47175M0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        mo53220L(motionEvent);
                    }
                }
            }
            this.f47192y = false;
            this.f47172J0 = -1;
            mo53223O();
            if (this.f47185d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C18196h2.m82610n1(this);
            }
            mo52996g(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!mo53211B((int) motionEvent.getX(), y2)) {
                if (!mo53242c0(motionEvent) && this.f47185d.isFinished()) {
                    z = false;
                }
                this.f47192y = z;
                mo53223O();
            } else {
                this.f47188g = y2;
                this.f47172J0 = motionEvent.getPointerId(0);
                mo53212C();
                this.f47193z.addMovement(motionEvent);
                this.f47185d.computeScrollOffset();
                if (!mo53242c0(motionEvent) && this.f47185d.isFinished()) {
                    z = false;
                }
                this.f47192y = z;
                mo52993d(2, 0);
            }
        }
        return this.f47192y;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f47189v = false;
        View view = this.f47191x;
        if (view != null && m83526I(view, this)) {
            mo53227S(this.f47191x);
        }
        this.f47191x = null;
        if (!this.f47190w) {
            if (this.f47177O0 != null) {
                scrollTo(getScrollX(), this.f47177O0.f47194a);
                this.f47177O0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int k = m83527k(scrollY, paddingTop, i5);
            if (k != scrollY) {
                scrollTo(getScrollX(), k);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f47190w = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f47167E0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(@C0359n0 View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo53283y((int) f2);
        return true;
    }

    public boolean onNestedPreFling(@C0359n0 View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(@C0359n0 View view, int i, int i2, @C0359n0 int[] iArr) {
        mo2391o(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(@C0359n0 View view, int i, int i2, int i3, int i4) {
        mo53219K(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(@C0359n0 View view, @C0359n0 View view2, int i) {
        mo2389m(view, view2, i, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !mo53216G(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f47177O0 = savedState;
        requestLayout();
    }

    @C0359n0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f47194a = getScrollY();
        return savedState;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C18456c cVar = this.f47181S0;
        if (cVar != null) {
            cVar.mo1055a(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo53218J(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f47184c);
            offsetDescendantRectToMyCoords(findFocus, this.f47184c);
            mo53278t(mo53253l(this.f47184c));
        }
    }

    public boolean onStartNestedScroll(@C0359n0 View view, @C0359n0 View view2, int i) {
        return mo2409s(view, view2, i, 0);
    }

    public void onStopNestedScroll(@C0359n0 View view) {
        mo2390n(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@androidx.annotation.C0359n0 android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.mo53214E()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f47175M0 = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f47175M0
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0225
            r3 = -1
            if (r0 == r14) goto L_0x01d4
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0254
        L_0x002f:
            r23.mo53220L(r24)
            int r0 = r10.f47172J0
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f47188g = r0
            goto L_0x0254
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f47188g = r1
            int r0 = r11.getPointerId(r0)
            r10.f47172J0 = r0
            goto L_0x0254
        L_0x0054:
            boolean r0 = r10.f47192y
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f47185d
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            androidx.core.view.C18196h2.m82610n1(r23)
        L_0x007b:
            r10.f47172J0 = r3
            r23.mo53280v()
            goto L_0x0254
        L_0x0082:
            int r0 = r10.f47172J0
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f47172J0
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            goto L_0x0254
        L_0x00a0:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f47188g
            int r0 = r0 - r6
            float r1 = r11.getX(r15)
            int r1 = r10.mo53224P(r0, r1)
            int r0 = r0 - r1
            boolean r1 = r10.f47192y
            if (r1 != 0) goto L_0x00d1
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f47169G0
            if (r1 <= r2) goto L_0x00d1
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00c6
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00c6:
            r10.f47192y = r14
            if (r0 <= 0) goto L_0x00ce
            int r1 = r10.f47169G0
            int r0 = r0 - r1
            goto L_0x00d1
        L_0x00ce:
            int r1 = r10.f47169G0
            int r0 = r0 + r1
        L_0x00d1:
            r7 = r0
            boolean r0 = r10.f47192y
            if (r0 == 0) goto L_0x0254
            r1 = 0
            int[] r3 = r10.f47174L0
            int[] r4 = r10.f47173K0
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo52995f(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00f3
            int[] r0 = r10.f47174L0
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f47175M0
            int[] r1 = r10.f47173K0
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f47175M0 = r0
        L_0x00f3:
            r16 = r7
            int[] r0 = r10.f47173K0
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f47188g = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0112
            if (r0 != r14) goto L_0x010f
            if (r9 <= 0) goto L_0x010f
            goto L_0x0112
        L_0x010f:
            r18 = r12
            goto L_0x0114
        L_0x0112:
            r18 = r14
        L_0x0114:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo53221M(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0136
            boolean r0 = r10.mo52992b(r12)
            if (r0 != 0) goto L_0x0136
            r8 = r14
            goto L_0x0137
        L_0x0136:
            r8 = r12
        L_0x0137:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f47174L0
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f47173K0
            r6 = 0
            r0 = r23
            r0.mo52998a(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f47188g
            int[] r1 = r10.f47173K0
            r1 = r1[r14]
            int r0 = r0 - r1
            r10.f47188g = r0
            int r0 = r10.f47175M0
            int r0 = r0 + r1
            r10.f47175M0 = r0
            if (r18 == 0) goto L_0x01ca
            int[] r0 = r10.f47174L0
            r0 = r0[r14]
            int r0 = r16 - r0
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x018c
            android.widget.EdgeEffect r1 = r10.f47186e
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C18480i.m83658j(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f47187f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b6
            android.widget.EdgeEffect r0 = r10.f47187f
            r0.onRelease()
            goto L_0x01b6
        L_0x018c:
            r2 = r22
            if (r1 <= r2) goto L_0x01b6
            android.widget.EdgeEffect r1 = r10.f47187f
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r2
            androidx.core.widget.C18480i.m83658j(r1, r0, r3)
            android.widget.EdgeEffect r0 = r10.f47186e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b6
            android.widget.EdgeEffect r0 = r10.f47186e
            r0.onRelease()
        L_0x01b6:
            android.widget.EdgeEffect r0 = r10.f47186e
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01c6
            android.widget.EdgeEffect r0 = r10.f47187f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ca
        L_0x01c6:
            androidx.core.view.C18196h2.m82610n1(r23)
            goto L_0x01cb
        L_0x01ca:
            r12 = r8
        L_0x01cb:
            if (r12 == 0) goto L_0x0254
            android.view.VelocityTracker r0 = r10.f47193z
            r0.clear()
            goto L_0x0254
        L_0x01d4:
            android.view.VelocityTracker r0 = r10.f47193z
            int r1 = r10.f47171I0
            float r1 = (float) r1
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4, r1)
            int r1 = r10.f47172J0
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f47170H0
            if (r1 < r4) goto L_0x0202
            boolean r1 = r10.mo53279u(r0)
            if (r1 != 0) goto L_0x021f
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x021f
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo53283y(r0)
            goto L_0x021f
        L_0x0202:
            android.widget.OverScroller r15 = r10.f47185d
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x021f
            androidx.core.view.C18196h2.m82610n1(r23)
        L_0x021f:
            r10.f47172J0 = r3
            r23.mo53280v()
            goto L_0x0254
        L_0x0225:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x022c
            return r12
        L_0x022c:
            boolean r0 = r10.f47192y
            if (r0 == 0) goto L_0x0239
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0239
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0239:
            android.widget.OverScroller r0 = r10.f47185d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0244
            r23.mo53241c()
        L_0x0244:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f47188g = r0
            int r0 = r11.getPointerId(r12)
            r10.f47172J0 = r0
            r10.mo52993d(r1, r12)
        L_0x0254:
            android.view.VelocityTracker r0 = r10.f47193z
            if (r0 == 0) goto L_0x025b
            r0.addMovement(r13)
        L_0x025b:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public int mo53268p(int i) {
        int height = getHeight();
        if (i > 0 && C18480i.m83656d(this.f47186e) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * C18480i.m83658j(this.f47186e, (((float) (-i)) * 4.0f) / ((float) height), 0.5f));
            if (round != i) {
                this.f47186e.finish();
            }
            return i - round;
        } else if (i >= 0 || C18480i.m83656d(this.f47187f) == 0.0f) {
            return i;
        } else {
            float f = (float) height;
            int round2 = Math.round((f / 4.0f) * C18480i.m83658j(this.f47187f, (((float) i) * 4.0f) / f, 0.5f));
            if (round2 != i) {
                this.f47187f.finish();
            }
            return i - round2;
        }
    }

    /* renamed from: q */
    public void mo2407q(@C0359n0 View view, int i, int i2, int i3, int i4, int i5, @C0359n0 int[] iArr) {
        mo53219K(i4, i5, iArr);
    }

    /* renamed from: r */
    public void mo2408r(@C0359n0 View view, int i, int i2, int i3, int i4, int i5) {
        mo53219K(i4, i5, (int[]) null);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f47189v) {
            mo53227S(view2);
        } else {
            this.f47191x = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(@C0359n0 View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return mo53228T(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            mo53223O();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f47189v = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public boolean mo2409s(@C0359n0 View view, @C0359n0 View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int k = m83527k(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int k2 = m83527k(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (k != getScrollX() || k2 != getScrollY()) {
                super.scrollTo(k, k2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f47167E0) {
            this.f47167E0 = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f47179Q0.mo53024p(z);
    }

    public void setOnScrollChangeListener(@C0363p0 C18456c cVar) {
        this.f47181S0 = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f47168F0 = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo52993d(i, 0);
    }

    public void stopNestedScroll() {
        mo52996g(0);
    }

    /* renamed from: t */
    public final void mo53278t(int i) {
        if (i == 0) {
            return;
        }
        if (this.f47168F0) {
            mo53230V(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: u */
    public final boolean mo53279u(int i) {
        if (C18480i.m83656d(this.f47186e) != 0.0f) {
            if (mo53229U(this.f47186e, i)) {
                this.f47186e.onAbsorb(i);
            } else {
                mo53283y(-i);
            }
        } else if (C18480i.m83656d(this.f47187f) == 0.0f) {
            return false;
        } else {
            int i2 = -i;
            if (mo53229U(this.f47187f, i2)) {
                this.f47187f.onAbsorb(i2);
            } else {
                mo53283y(i2);
            }
        }
        return true;
    }

    /* renamed from: v */
    public final void mo53280v() {
        this.f47192y = false;
        mo53223O();
        mo52996g(0);
        this.f47186e.onRelease();
        this.f47187f.onRelease();
    }

    /* renamed from: w */
    public boolean mo53281w(@C0359n0 KeyEvent keyEvent) {
        this.f47184c.setEmpty();
        int i = 130;
        if (!mo53252j()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    mo53222N(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return mo53250h(130);
                } else {
                    return mo53284z(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return mo53250h(33);
            } else {
                return mo53284z(33);
            }
        }
    }

    /* renamed from: x */
    public final View mo53282x(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i >= top || bottom >= i2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else if (!z3) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: y */
    public void mo53283y(int i) {
        if (getChildCount() > 0) {
            this.f47185d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            mo53225Q(true);
        }
    }

    /* renamed from: z */
    public boolean mo53284z(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.f47184c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f47184c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f47184c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f47184c;
        return mo53226R(i, rect3.top, rect3.bottom);
    }

    public NestedScrollView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C16986a.C16987a.nestedScrollViewStyle);
    }

    public NestedScrollView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47184c = new Rect();
        this.f47189v = true;
        this.f47190w = false;
        this.f47191x = null;
        this.f47192y = false;
        this.f47168F0 = true;
        this.f47172J0 = -1;
        this.f47173K0 = new int[2];
        this.f47174L0 = new int[2];
        this.f47186e = C18480i.m83655a(context, attributeSet);
        this.f47187f = C18480i.m83655a(context, attributeSet);
        this.f47182a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        mo53213D();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f47166d1, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f47178P0 = new C18400w1(this);
        this.f47179Q0 = new C18363s1(this);
        setNestedScrollingEnabled(true);
        C18196h2.m82474B1(this, f47165c1);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
