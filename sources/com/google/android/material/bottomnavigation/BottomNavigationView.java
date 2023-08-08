package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0722h1;
import androidx.core.content.C17318d;
import androidx.core.view.C18196h2;
import androidx.core.view.C18436z4;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31422p;
import com.google.android.material.internal.C31432x;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationView extends NavigationBarView {

    /* renamed from: E0 */
    public static final int f74762E0 = 5;

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public class C31162a implements C31432x.C31437e {
        public C31162a() {
        }

        @C0359n0
        /* renamed from: a */
        public C18436z4 mo88352a(View view, @C0359n0 C18436z4 z4Var, @C0359n0 C31432x.C31438f fVar) {
            int i;
            fVar.f75984d += z4Var.mo53146o();
            boolean z = true;
            if (C18196h2.m82553Z(view) != 1) {
                z = false;
            }
            int p = z4Var.mo53147p();
            int q = z4Var.mo53148q();
            int i2 = fVar.f75981a;
            if (z) {
                i = q;
            } else {
                i = p;
            }
            fVar.f75981a = i2 + i;
            int i3 = fVar.f75983c;
            if (!z) {
                p = q;
            }
            fVar.f75983c = i3 + p;
            fVar.mo90199a(view);
            return z4Var;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface C31163b extends NavigationBarView.C31452c {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C31164c extends NavigationBarView.C31453d {
    }

    public BottomNavigationView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public NavigationBarMenuView mo88385d(@C0359n0 Context context) {
        return new BottomNavigationMenuView(context);
    }

    public int getMaxItemCount() {
        return 5;
    }

    /* renamed from: j */
    public final void mo88387j(@C0359n0 Context context) {
        View view = new View(context);
        view.setBackgroundColor(C17318d.m79723f(context, C31076a.C31081e.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C31076a.C31082f.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: k */
    public final void mo88388k() {
        C31432x.m127009d(this, new C31162a());
    }

    /* renamed from: l */
    public boolean mo88389l() {
        return ((BottomNavigationMenuView) getMenuView()).mo88384t();
    }

    /* renamed from: m */
    public final int mo88390m(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    /* renamed from: n */
    public final boolean mo88391n() {
        return false;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, mo88390m(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.mo88384t() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo1943j(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@C0363p0 C31163b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@C0363p0 C31164c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C31076a.C31079c.bottomNavigationStyle);
    }

    public BottomNavigationView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C31076a.C31090n.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        C0722h1 k = C31422p.m126971k(context2, attributeSet, C31076a.C31091o.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(k.mo3459a(C31076a.C31091o.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i3 = C31076a.C31091o.BottomNavigationView_android_minHeight;
        if (k.mo3455C(i3)) {
            setMinimumHeight(k.mo3465g(i3, 0));
        }
        k.mo3458I();
        if (mo88391n()) {
            mo88387j(context2);
        }
        mo88388k();
    }
}
