package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0573j;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.view.menu.C0587o;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ActionMenuView extends LinearLayoutCompat implements C0568g.C0570b, C0587o {

    /* renamed from: f1 */
    public static final String f1833f1 = "ActionMenuView";

    /* renamed from: g1 */
    public static final int f1834g1 = 56;

    /* renamed from: h1 */
    public static final int f1835h1 = 4;

    /* renamed from: T0 */
    public C0568g f1836T0;

    /* renamed from: U0 */
    public Context f1837U0;

    /* renamed from: V0 */
    public int f1838V0;

    /* renamed from: W0 */
    public boolean f1839W0;

    /* renamed from: X0 */
    public ActionMenuPresenter f1840X0;

    /* renamed from: Y0 */
    public C0585n.C0586a f1841Y0;

    /* renamed from: Z0 */
    public C0568g.C0569a f1842Z0;

    /* renamed from: a1 */
    public boolean f1843a1;

    /* renamed from: b1 */
    public int f1844b1;

    /* renamed from: c1 */
    public int f1845c1;

    /* renamed from: d1 */
    public int f1846d1;

    /* renamed from: e1 */
    public C0615e f1847e1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0611a {
        /* renamed from: a */
        boolean mo1830a();

        /* renamed from: c */
        boolean mo1831c();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0612b implements C0585n.C0586a {
        /* renamed from: b */
        public void mo1207b(@C0359n0 C0568g gVar, boolean z) {
        }

        /* renamed from: c */
        public boolean mo1208c(@C0359n0 C0568g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0613c extends LinearLayoutCompat.C0642b {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1848a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1849b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1850c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1851d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1852e;

        /* renamed from: f */
        public boolean f1853f;

        public C0613c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0613c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0613c(C0613c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f1848a = cVar.f1848a;
        }

        public C0613c(int i, int i2) {
            super(i, i2);
            this.f1848a = false;
        }

        public C0613c(int i, int i2, boolean z) {
            super(i, i2);
            this.f1848a = z;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0614d implements C0568g.C0569a {
        public C0614d() {
        }

        /* renamed from: a */
        public boolean mo1111a(@C0359n0 C0568g gVar, @C0359n0 MenuItem menuItem) {
            C0615e eVar = ActionMenuView.this.f1847e1;
            if (eVar == null || !eVar.onMenuItemClick(menuItem)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo1114b(@C0359n0 C0568g gVar) {
            C0568g.C0569a aVar = ActionMenuView.this.f1842Z0;
            if (aVar != null) {
                aVar.mo1114b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0615e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: O */
    public static int m2984O(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        int i5;
        C0613c cVar = (C0613c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.mo1851t()) {
            z = false;
        } else {
            z = true;
        }
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
                if (cVar.f1848a || !z) {
                    z2 = false;
                }
                cVar.f1851d = z2;
                cVar.f1849b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        z2 = false;
        cVar.f1851d = z2;
        cVar.f1849b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: E */
    public void mo2463E() {
        ActionMenuPresenter actionMenuPresenter = this.f1840X0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo2436B();
        }
    }

    /* renamed from: F */
    public C0613c mo2484n() {
        C0613c cVar = new C0613c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: G */
    public C0613c mo2485o(AttributeSet attributeSet) {
        return new C0613c(getContext(), attributeSet);
    }

    /* renamed from: H */
    public C0613c mo2490p(ViewGroup.LayoutParams layoutParams) {
        C0613c cVar;
        if (layoutParams == null) {
            return mo2484n();
        }
        if (layoutParams instanceof C0613c) {
            cVar = new C0613c((C0613c) layoutParams);
        } else {
            cVar = new C0613c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: I */
    public C0613c mo2467I() {
        C0613c F = mo2484n();
        F.f1848a = true;
        return F;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: J */
    public boolean mo2468J(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0611a)) {
            z = false | ((C0611a) childAt).mo1830a();
        }
        if (i <= 0 || !(childAt2 instanceof C0611a)) {
            return z;
        }
        return z | ((C0611a) childAt2).mo1831c();
    }

    /* renamed from: K */
    public boolean mo2469K() {
        ActionMenuPresenter actionMenuPresenter = this.f1840X0;
        return actionMenuPresenter != null && actionMenuPresenter.mo2439E();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: L */
    public boolean mo2470L() {
        ActionMenuPresenter actionMenuPresenter = this.f1840X0;
        return actionMenuPresenter != null && actionMenuPresenter.mo2441G();
    }

    /* renamed from: M */
    public boolean mo2471M() {
        ActionMenuPresenter actionMenuPresenter = this.f1840X0;
        return actionMenuPresenter != null && actionMenuPresenter.mo2442H();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: N */
    public boolean mo2472N() {
        return this.f1839W0;
    }

    /* renamed from: P */
    public final void mo2473P(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        int i10;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.f1845c1;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int i16 = 0;
        int i17 = 0;
        boolean z8 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        long j = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            int i21 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i22 = i18 + 1;
                if (z9) {
                    int i23 = this.f1846d1;
                    i9 = i22;
                    z6 = false;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i9 = i22;
                    z6 = false;
                }
                C0613c cVar = (C0613c) childAt.getLayoutParams();
                cVar.f1853f = z6;
                cVar.f1850c = z6 ? 1 : 0;
                cVar.f1849b = z6;
                cVar.f1851d = z6;
                cVar.leftMargin = z6;
                cVar.rightMargin = z6;
                if (!z9 || !((ActionMenuItemView) childAt).mo1851t()) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                cVar.f1852e = z7;
                if (cVar.f1848a) {
                    i10 = 1;
                } else {
                    i10 = i13;
                }
                int O = m2984O(childAt, i15, i10, childMeasureSpec, paddingTop);
                i19 = Math.max(i19, O);
                if (cVar.f1851d) {
                    i20++;
                }
                if (cVar.f1848a) {
                    z8 = true;
                }
                i13 -= O;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (O == 1) {
                    j |= (long) (1 << i17);
                    i16 = i16;
                } else {
                    int i24 = i16;
                }
                i18 = i9;
            }
            i17++;
            size2 = i21;
        }
        int i25 = size2;
        if (!z8 || i18 != 2) {
            z = false;
        } else {
            z = true;
        }
        boolean z10 = false;
        while (true) {
            if (i20 <= 0 || i13 <= 0) {
                i5 = mode;
                i3 = i11;
                z2 = z10;
                i4 = i16;
            } else {
                int i26 = Integer.MAX_VALUE;
                int i27 = 0;
                int i28 = 0;
                long j2 = 0;
                while (i28 < childCount) {
                    boolean z11 = z10;
                    C0613c cVar2 = (C0613c) getChildAt(i28).getLayoutParams();
                    int i29 = i16;
                    if (cVar2.f1851d) {
                        int i30 = cVar2.f1849b;
                        if (i30 < i26) {
                            j2 = 1 << i28;
                            i26 = i30;
                            i27 = 1;
                        } else if (i30 == i26) {
                            i27++;
                            j2 |= 1 << i28;
                        }
                    }
                    i28++;
                    i16 = i29;
                    z10 = z11;
                }
                z2 = z10;
                i4 = i16;
                j |= j2;
                if (i27 > i13) {
                    i5 = mode;
                    i3 = i11;
                    break;
                }
                int i31 = i26 + 1;
                int i32 = 0;
                while (i32 < childCount) {
                    View childAt2 = getChildAt(i32);
                    C0613c cVar3 = (C0613c) childAt2.getLayoutParams();
                    int i33 = i11;
                    int i34 = mode;
                    long j3 = (long) (1 << i32);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f1849b == i31) {
                            j |= j3;
                        }
                        z5 = z;
                    } else {
                        if (!z || !cVar3.f1852e || i13 != 1) {
                            z5 = z;
                        } else {
                            int i35 = this.f1846d1;
                            z5 = z;
                            childAt2.setPadding(i35 + i15, 0, i35, 0);
                        }
                        cVar3.f1849b++;
                        cVar3.f1853f = true;
                        i13--;
                    }
                    i32++;
                    mode = i34;
                    i11 = i33;
                    z = z5;
                }
                i16 = i4;
                z10 = true;
            }
        }
        if (z8 || i18 != 1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i13 <= 0 || j == 0 || (i13 >= i18 - 1 && !z3 && i19 <= 1)) {
            i6 = 0;
            z4 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z3) {
                i6 = 0;
                if ((j & 1) != 0 && !((C0613c) getChildAt(0).getLayoutParams()).f1852e) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j & ((long) (1 << i36))) != 0 && !((C0613c) getChildAt(i36).getLayoutParams()).f1852e) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            if (bitCount > 0.0f) {
                i8 = (int) (((float) (i13 * i15)) / bitCount);
            } else {
                i8 = i6;
            }
            z4 = z2;
            for (int i37 = i6; i37 < childCount; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    C0613c cVar4 = (C0613c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1850c = i8;
                        cVar4.f1853f = true;
                        if (i37 == 0 && !cVar4.f1852e) {
                            cVar4.leftMargin = (-i8) / 2;
                        }
                        z4 = true;
                    } else if (cVar4.f1848a) {
                        cVar4.f1850c = i8;
                        cVar4.f1853f = true;
                        cVar4.rightMargin = (-i8) / 2;
                        z4 = true;
                    } else {
                        if (i37 != 0) {
                            cVar4.leftMargin = i8 / 2;
                        }
                        if (i37 != childCount - 1) {
                            cVar4.rightMargin = i8 / 2;
                        }
                    }
                }
            }
        }
        if (z4) {
            for (int i38 = i6; i38 < childCount; i38++) {
                View childAt4 = getChildAt(i38);
                C0613c cVar5 = (C0613c) childAt4.getLayoutParams();
                if (cVar5.f1853f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1849b * i15) + cVar5.f1850c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i5 != 1073741824) {
            i7 = i4;
        } else {
            i7 = i25;
        }
        setMeasuredDimension(i3, i7);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: Q */
    public C0568g mo2474Q() {
        return this.f1836T0;
    }

    /* renamed from: R */
    public boolean mo2475R() {
        ActionMenuPresenter actionMenuPresenter = this.f1840X0;
        return actionMenuPresenter != null && actionMenuPresenter.mo2451Q();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public boolean mo1857b(C0573j jVar) {
        return this.f1836T0.mo2027O(jVar, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public void mo1858c(C0568g gVar) {
        this.f1836T0 = gVar;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0613c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1836T0 == null) {
            Context context = getContext();
            C0568g gVar = new C0568g(context);
            this.f1836T0 = gVar;
            gVar.mo2036X(new C0614d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1840X0 = actionMenuPresenter;
            actionMenuPresenter.mo2449O(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f1840X0;
            C0585n.C0586a aVar = this.f1841Y0;
            if (aVar == null) {
                aVar = new C0612b();
            }
            actionMenuPresenter2.mo1939e(aVar);
            this.f1836T0.mo2052c(this.f1840X0, this.f1837U0);
            this.f1840X0.mo2447M(this);
        }
        return this.f1836T0;
    }

    @C0363p0
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1840X0.mo2438D();
    }

    public int getPopupTheme() {
        return this.f1838V0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1840X0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1943j(false);
            if (this.f1840X0.mo2442H()) {
                this.f1840X0.mo2439E();
                this.f1840X0.mo2451Q();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo2463E();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (!this.f1843a1) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0796u1.m3859b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0613c cVar = (C0613c) childAt.getLayoutParams();
                if (cVar.f1848a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo2468J(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i6 = getPaddingLeft() + cVar.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo2468J(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0613c cVar2 = (C0613c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1848a) {
                    int i18 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0613c cVar3 = (C0613c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1848a) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        C0568g gVar;
        boolean z2 = this.f1843a1;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f1843a1 = z;
        if (z2 != z) {
            this.f1844b1 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1843a1 || (gVar = this.f1836T0) == null || size == this.f1844b1)) {
            this.f1844b1 = size;
            gVar.mo2026N(true);
        }
        int childCount = getChildCount();
        if (!this.f1843a1 || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0613c cVar = (C0613c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        mo2473P(i, i2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1840X0.mo2445K(z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(C0585n.C0586a aVar, C0568g.C0569a aVar2) {
        this.f1841Y0 = aVar;
        this.f1842Z0 = aVar2;
    }

    public void setOnMenuItemClickListener(C0615e eVar) {
        this.f1847e1 = eVar;
    }

    public void setOverflowIcon(@C0363p0 Drawable drawable) {
        getMenu();
        this.f1840X0.mo2448N(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.f1839W0 = z;
    }

    public void setPopupTheme(@C0327c1 int i) {
        if (this.f1838V0 != i) {
            this.f1838V0 = i;
            if (i == 0) {
                this.f1837U0 = getContext();
            } else {
                this.f1837U0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1840X0 = actionMenuPresenter;
        actionMenuPresenter.mo2447M(this);
    }

    public ActionMenuView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1845c1 = (int) (56.0f * f);
        this.f1846d1 = (int) (f * 4.0f);
        this.f1837U0 = context;
        this.f1838V0 = 0;
    }
}
