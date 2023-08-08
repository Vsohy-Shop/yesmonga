package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.menu.C0585n;
import androidx.core.graphics.C17616m0;
import androidx.core.view.C18196h2;
import androidx.core.view.C18373t1;
import androidx.core.view.C18384u1;
import androidx.core.view.C18393v1;
import androidx.core.view.C18400w1;
import androidx.core.view.C18436z4;

@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements C0704c0, C18393v1, C18373t1, C18384u1 {

    /* renamed from: X0 */
    public static final String f1765X0 = "ActionBarOverlayLayout";

    /* renamed from: Y0 */
    public static final int f1766Y0 = 600;

    /* renamed from: Z0 */
    public static final int[] f1767Z0 = {C0387a.C0389b.actionBarSize, 16842841};

    /* renamed from: E0 */
    public int f1768E0;

    /* renamed from: F0 */
    public final Rect f1769F0;

    /* renamed from: G0 */
    public final Rect f1770G0;

    /* renamed from: H0 */
    public final Rect f1771H0;

    /* renamed from: I0 */
    public final Rect f1772I0;

    /* renamed from: J0 */
    public final Rect f1773J0;

    /* renamed from: K0 */
    public final Rect f1774K0;

    /* renamed from: L0 */
    public final Rect f1775L0;
    @C0359n0

    /* renamed from: M0 */
    public C18436z4 f1776M0;
    @C0359n0

    /* renamed from: N0 */
    public C18436z4 f1777N0;
    @C0359n0

    /* renamed from: O0 */
    public C18436z4 f1778O0;
    @C0359n0

    /* renamed from: P0 */
    public C18436z4 f1779P0;

    /* renamed from: Q0 */
    public C0601d f1780Q0;

    /* renamed from: R0 */
    public OverScroller f1781R0;

    /* renamed from: S0 */
    public ViewPropertyAnimator f1782S0;

    /* renamed from: T0 */
    public final AnimatorListenerAdapter f1783T0;

    /* renamed from: U0 */
    public final Runnable f1784U0;

    /* renamed from: V0 */
    public final Runnable f1785V0;

    /* renamed from: W0 */
    public final C18400w1 f1786W0;

    /* renamed from: a */
    public int f1787a;

    /* renamed from: b */
    public int f1788b;

    /* renamed from: c */
    public ContentFrameLayout f1789c;

    /* renamed from: d */
    public ActionBarContainer f1790d;

    /* renamed from: e */
    public C0707d0 f1791e;

    /* renamed from: f */
    public Drawable f1792f;

    /* renamed from: g */
    public boolean f1793g;

    /* renamed from: v */
    public boolean f1794v;

    /* renamed from: w */
    public boolean f1795w;

    /* renamed from: x */
    public boolean f1796x;

    /* renamed from: y */
    public boolean f1797y;

    /* renamed from: z */
    public int f1798z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0598a extends AnimatorListenerAdapter {
        public C0598a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1782S0 = null;
            actionBarOverlayLayout.f1797y = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1782S0 = null;
            actionBarOverlayLayout.f1797y = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0599b implements Runnable {
        public C0599b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo2428w();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1782S0 = actionBarOverlayLayout.f1790d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1783T0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0600c implements Runnable {
        public C0600c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo2428w();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1782S0 = actionBarOverlayLayout.f1790d.animate().translationY((float) (-ActionBarOverlayLayout.this.f1790d.getHeight())).setListener(ActionBarOverlayLayout.this.f1783T0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0601d {
        /* renamed from: a */
        void mo1445a();

        /* renamed from: b */
        void mo1446b(int i);

        /* renamed from: c */
        void mo1447c();

        /* renamed from: d */
        void mo1448d(boolean z);

        /* renamed from: e */
        void mo1449e();

        /* renamed from: f */
        void mo1450f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0602e extends ViewGroup.MarginLayoutParams {
        public C0602e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0602e(int i, int i2) {
            super(i, i2);
        }

        public C0602e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0602e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final void mo2363A() {
        mo2428w();
        postDelayed(this.f1785V0, 600);
    }

    /* renamed from: B */
    public final void mo2364B() {
        mo2428w();
        postDelayed(this.f1784U0, 600);
    }

    /* renamed from: C */
    public void mo2365C() {
        if (this.f1789c == null) {
            this.f1789c = (ContentFrameLayout) findViewById(C0387a.C0394g.action_bar_activity_content);
            this.f1790d = (ActionBarContainer) findViewById(C0387a.C0394g.action_bar_container);
            this.f1791e = mo2427v(findViewById(C0387a.C0394g.action_bar));
        }
    }

    /* renamed from: D */
    public final void mo2366D() {
        mo2428w();
        this.f1784U0.run();
    }

    /* renamed from: E */
    public final boolean mo2367E(float f) {
        this.f1781R0.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1781R0.getFinalY() > this.f1790d.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2368a() {
        mo2428w();
        this.f1785V0.run();
    }

    /* renamed from: b */
    public final boolean mo2369b(@C0359n0 View view, @C0359n0 Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0602e eVar = (C0602e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: c */
    public boolean mo2370c() {
        mo2365C();
        return this.f1791e.mo3364c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0602e;
    }

    /* renamed from: d */
    public boolean mo2372d() {
        mo2365C();
        return this.f1791e.mo3366d();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1792f != null && !this.f1793g) {
            if (this.f1790d.getVisibility() == 0) {
                i = (int) (((float) this.f1790d.getBottom()) + this.f1790d.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f1792f.setBounds(0, i, getWidth(), this.f1792f.getIntrinsicHeight() + i);
            this.f1792f.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo2374e() {
        mo2365C();
        return this.f1791e.mo3367e();
    }

    /* renamed from: f */
    public boolean mo2375f() {
        mo2365C();
        return this.f1791e.mo3368f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public boolean mo2377g() {
        mo2365C();
        return this.f1791e.mo3369g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1790d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1786W0.mo53039a();
    }

    public CharSequence getTitle() {
        mo2365C();
        return this.f1791e.getTitle();
    }

    /* renamed from: h */
    public boolean mo2384h() {
        mo2365C();
        return this.f1791e.mo3374h();
    }

    /* renamed from: i */
    public boolean mo2385i() {
        mo2365C();
        return this.f1791e.mo3375i();
    }

    /* renamed from: j */
    public void mo2386j(SparseArray<Parcelable> sparseArray) {
        mo2365C();
        this.f1791e.mo3350F(sparseArray);
    }

    /* renamed from: k */
    public void mo2387k(int i) {
        mo2365C();
        if (i == 2) {
            this.f1791e.mo3398w();
        } else if (i == 5) {
            this.f1791e.mo3360P();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: l */
    public void mo2388l() {
        mo2365C();
        this.f1791e.mo3345A();
    }

    /* renamed from: m */
    public void mo2389m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: n */
    public void mo2390n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: o */
    public void mo2391o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @C0376v0(21)
    public WindowInsets onApplyWindowInsets(@C0359n0 WindowInsets windowInsets) {
        mo2365C();
        C18436z4 L = C18436z4.m83375L(windowInsets, this);
        boolean b = mo2369b(this.f1790d, new Rect(L.mo53147p(), L.mo53149r(), L.mo53148q(), L.mo53146o()), true, true, false, true);
        C18196h2.m82612o(this, L, this.f1769F0);
        Rect rect = this.f1769F0;
        C18436z4 x = L.mo53155x(rect.left, rect.top, rect.right, rect.bottom);
        this.f1776M0 = x;
        boolean z = true;
        if (!this.f1777N0.equals(x)) {
            this.f1777N0 = this.f1776M0;
            b = true;
        }
        if (!this.f1770G0.equals(this.f1769F0)) {
            this.f1770G0.set(this.f1769F0);
        } else {
            z = b;
        }
        if (z) {
            requestLayout();
        }
        return L.mo53130a().mo53132c().mo53131b().mo53129J();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo2429x(getContext());
        C18196h2.m82642v1(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2428w();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0602e eVar = (C0602e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        mo2365C();
        measureChildWithMargins(this.f1790d, i, 0, i2, 0);
        C0602e eVar = (C0602e) this.f1790d.getLayoutParams();
        int max = Math.max(0, this.f1790d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f1790d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1790d.getMeasuredState());
        if ((C18196h2.m82477C0(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.f1787a;
            if (this.f1795w && this.f1790d.getTabContainer() != null) {
                i3 += this.f1787a;
            }
        } else {
            i3 = this.f1790d.getVisibility() != 8 ? this.f1790d.getMeasuredHeight() : 0;
        }
        this.f1771H0.set(this.f1769F0);
        C18436z4 z4Var = this.f1776M0;
        this.f1778O0 = z4Var;
        if (this.f1794v || z) {
            this.f1778O0 = new C18436z4.C18438b(this.f1778O0).mo53164h(C17616m0.m80697d(z4Var.mo53147p(), this.f1778O0.mo53149r() + i3, this.f1778O0.mo53148q(), this.f1778O0.mo53146o() + 0)).mo53157a();
        } else {
            Rect rect = this.f1771H0;
            rect.top += i3;
            rect.bottom += 0;
            this.f1778O0 = z4Var.mo53155x(0, i3, 0, 0);
        }
        mo2369b(this.f1789c, this.f1771H0, true, true, true, true);
        if (!this.f1779P0.equals(this.f1778O0)) {
            C18436z4 z4Var2 = this.f1778O0;
            this.f1779P0 = z4Var2;
            C18196h2.m82616p(this.f1789c, z4Var2);
        }
        measureChildWithMargins(this.f1789c, i, 0, i2, 0);
        C0602e eVar2 = (C0602e) this.f1789c.getLayoutParams();
        int max3 = Math.max(max, this.f1789c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f1789c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1789c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1796x || !z) {
            return false;
        }
        if (mo2367E(f2)) {
            mo2368a();
        } else {
            mo2366D();
        }
        this.f1797y = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1798z + i2;
        this.f1798z = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1786W0.mo53040b(view, view2, i);
        this.f1798z = getActionBarHideOffset();
        mo2428w();
        C0601d dVar = this.f1780Q0;
        if (dVar != null) {
            dVar.mo1450f();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1790d.getVisibility() != 0) {
            return false;
        }
        return this.f1796x;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1796x && !this.f1797y) {
            if (this.f1798z <= this.f1790d.getHeight()) {
                mo2364B();
            } else {
                mo2363A();
            }
        }
        C0601d dVar = this.f1780Q0;
        if (dVar != null) {
            dVar.mo1447c();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        mo2365C();
        int i2 = this.f1768E0 ^ i;
        this.f1768E0 = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        C0601d dVar = this.f1780Q0;
        if (dVar != null) {
            dVar.mo1448d(!z2);
            if (z || !z2) {
                this.f1780Q0.mo1445a();
            } else {
                this.f1780Q0.mo1449e();
            }
        }
        if ((i2 & 256) != 0 && this.f1780Q0 != null) {
            C18196h2.m82642v1(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1788b = i;
        C0601d dVar = this.f1780Q0;
        if (dVar != null) {
            dVar.mo1446b(i);
        }
    }

    /* renamed from: p */
    public void mo2406p(SparseArray<Parcelable> sparseArray) {
        mo2365C();
        this.f1791e.mo3356L(sparseArray);
    }

    /* renamed from: q */
    public void mo2407q(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo2408r(view, i, i2, i3, i4, i5);
    }

    /* renamed from: r */
    public void mo2408r(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: s */
    public boolean mo2409s(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void setActionBarHideOffset(int i) {
        mo2428w();
        this.f1790d.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1790d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0601d dVar) {
        this.f1780Q0 = dVar;
        if (getWindowToken() != null) {
            this.f1780Q0.mo1446b(this.f1788b);
            int i = this.f1768E0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C18196h2.m82642v1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1795w = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1796x) {
            this.f1796x = z;
            if (!z) {
                mo2428w();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo2365C();
        this.f1791e.setIcon(i);
    }

    public void setLogo(int i) {
        mo2365C();
        this.f1791e.setLogo(i);
    }

    public void setMenu(Menu menu, C0585n.C0586a aVar) {
        mo2365C();
        this.f1791e.setMenu(menu, aVar);
    }

    public void setMenuPrepared() {
        mo2365C();
        this.f1791e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f1794v = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f1793g = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo2365C();
        this.f1791e.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo2365C();
        this.f1791e.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public C0602e generateDefaultLayoutParams() {
        return new C0602e(-1, -1);
    }

    /* renamed from: u */
    public C0602e generateLayoutParams(AttributeSet attributeSet) {
        return new C0602e(getContext(), attributeSet);
    }

    /* renamed from: v */
    public final C0707d0 mo2427v(View view) {
        if (view instanceof C0707d0) {
            return (C0707d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: w */
    public void mo2428w() {
        removeCallbacks(this.f1784U0);
        removeCallbacks(this.f1785V0);
        ViewPropertyAnimator viewPropertyAnimator = this.f1782S0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: x */
    public final void mo2429x(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1767Z0);
        boolean z2 = false;
        this.f1787a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1792f = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f1793g = z2;
        this.f1781R0 = new OverScroller(context);
    }

    /* renamed from: y */
    public boolean mo2430y() {
        return this.f1796x;
    }

    /* renamed from: z */
    public boolean mo2431z() {
        return this.f1794v;
    }

    public ActionBarOverlayLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1788b = 0;
        this.f1769F0 = new Rect();
        this.f1770G0 = new Rect();
        this.f1771H0 = new Rect();
        this.f1772I0 = new Rect();
        this.f1773J0 = new Rect();
        this.f1774K0 = new Rect();
        this.f1775L0 = new Rect();
        C18436z4 z4Var = C18436z4.f47103c;
        this.f1776M0 = z4Var;
        this.f1777N0 = z4Var;
        this.f1778O0 = z4Var;
        this.f1779P0 = z4Var;
        this.f1783T0 = new C0598a();
        this.f1784U0 = new C0599b();
        this.f1785V0 = new C0600c();
        mo2429x(context);
        this.f1786W0 = new C18400w1(this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0602e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo2365C();
        this.f1791e.setIcon(drawable);
    }
}
