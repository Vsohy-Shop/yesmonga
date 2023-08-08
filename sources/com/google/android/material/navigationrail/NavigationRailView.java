package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0722h1;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31422p;
import com.google.android.material.internal.C31432x;
import com.google.android.material.navigation.NavigationBarView;

public class NavigationRailView extends NavigationBarView {

    /* renamed from: I0 */
    public static final int f76107I0 = 49;

    /* renamed from: J0 */
    public static final int f76108J0 = 7;

    /* renamed from: K0 */
    public static final int f76109K0 = 49;

    /* renamed from: L0 */
    public static final int f76110L0 = -1;

    /* renamed from: E0 */
    public final int f76111E0;
    @C0363p0

    /* renamed from: F0 */
    public View f76112F0;
    @C0363p0

    /* renamed from: G0 */
    public Boolean f76113G0;
    @C0363p0

    /* renamed from: H0 */
    public Boolean f76114H0;

    /* renamed from: com.google.android.material.navigationrail.NavigationRailView$a */
    public class C31459a implements C31432x.C31437e {
        public C31459a() {
        }

        @C0359n0
        /* renamed from: a */
        public C18436z4 mo88352a(View view, @C0359n0 C18436z4 z4Var, @C0359n0 C31432x.C31438f fVar) {
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.mo90463t(navigationRailView.f76113G0)) {
                fVar.f75982b += z4Var.mo53136f(C18436z4.C18449m.m83510i()).f45996b;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.mo90463t(navigationRailView2.f76114H0)) {
                fVar.f75984d += z4Var.mo53136f(C18436z4.C18449m.m83510i()).f45998d;
            }
            boolean z = true;
            if (C18196h2.m82553Z(view) != 1) {
                z = false;
            }
            int p = z4Var.mo53147p();
            int q = z4Var.mo53148q();
            int i = fVar.f75981a;
            if (z) {
                p = q;
            }
            fVar.f75981a = i + p;
            fVar.mo90199a(view);
            return z4Var;
        }
    }

    public NavigationRailView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    @C0363p0
    public View getHeaderView() {
        return this.f76112F0;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* renamed from: m */
    public void mo90452m(@C0347i0 int i) {
        mo90453n(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    /* renamed from: n */
    public void mo90453n(@C0359n0 View view) {
        mo90460s();
        this.f76112F0 = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f76111E0;
        addView(view, 0, layoutParams);
    }

    /* renamed from: o */
    public final void mo90454o() {
        C31432x.m127009d(this, new C31459a());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (mo90458q()) {
            int bottom = this.f76112F0.getBottom() + this.f76111E0;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.mo90444t()) {
            i5 = this.f76111E0;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public void onMeasure(int i, int i2) {
        int r = mo90459r(i);
        super.onMeasure(r, i2);
        if (mo90458q()) {
            measureChild(getNavigationRailMenuView(), r, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f76112F0.getMeasuredHeight()) - this.f76111E0, Integer.MIN_VALUE));
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: p */
    public NavigationRailMenuView mo88385d(@C0359n0 Context context) {
        return new NavigationRailMenuView(context);
    }

    /* renamed from: q */
    public final boolean mo90458q() {
        View view = this.f76112F0;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: r */
    public final int mo90459r(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* renamed from: s */
    public void mo90460s() {
        View view = this.f76112F0;
        if (view != null) {
            removeView(view);
            this.f76112F0 = null;
        }
    }

    public void setItemMinimumHeight(@C0372t0 int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    /* renamed from: t */
    public final boolean mo90463t(Boolean bool) {
        return bool != null ? bool.booleanValue() : C18196h2.m82538U(this);
    }

    public NavigationRailView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.navigationRailStyle);
    }

    public NavigationRailView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C31076a.C31090n.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f76113G0 = null;
        this.f76114H0 = null;
        this.f76111E0 = getResources().getDimensionPixelSize(C31076a.C31082f.mtrl_navigation_rail_margin);
        C0722h1 k = C31422p.m126971k(getContext(), attributeSet, C31076a.C31091o.NavigationRailView, i, i2, new int[0]);
        int u = k.mo3479u(C31076a.C31091o.NavigationRailView_headerLayout, 0);
        if (u != 0) {
            mo90452m(u);
        }
        setMenuGravity(k.mo3473o(C31076a.C31091o.NavigationRailView_menuGravity, 49));
        int i3 = C31076a.C31091o.NavigationRailView_itemMinHeight;
        if (k.mo3455C(i3)) {
            setItemMinimumHeight(k.mo3465g(i3, -1));
        }
        int i4 = C31076a.C31091o.NavigationRailView_paddingTopSystemWindowInsets;
        if (k.mo3455C(i4)) {
            this.f76113G0 = Boolean.valueOf(k.mo3459a(i4, false));
        }
        int i5 = C31076a.C31091o.NavigationRailView_paddingBottomSystemWindowInsets;
        if (k.mo3455C(i5)) {
            this.f76114H0 = Boolean.valueOf(k.mo3459a(i5, false));
        }
        k.mo3458I();
        mo90454o();
    }
}
