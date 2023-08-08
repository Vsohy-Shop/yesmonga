package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0372t0;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {
    @C0372t0

    /* renamed from: Y0 */
    public int f76105Y0 = -1;

    /* renamed from: Z0 */
    public final FrameLayout.LayoutParams f76106Z0;

    public NavigationRailMenuView(@C0359n0 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f76106Z0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @C0359n0
    /* renamed from: g */
    public NavigationBarItemView mo88380g(@C0359n0 Context context) {
        return new C31460a(context);
    }

    @C0372t0
    public int getItemMinimumHeight() {
        return this.f76105Y0;
    }

    public int getMenuGravity() {
        return this.f76106Z0.gravity;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().mo2020H().size();
        if (size2 <= 1 || !mo90276l(getLabelVisibilityMode(), size2)) {
            i3 = mo90447w(i, size, size2, (View) null);
        } else {
            i3 = mo90448x(i, size, size2);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(i3, i2, 0));
    }

    public void setItemMinimumHeight(@C0372t0 int i) {
        if (this.f76105Y0 != i) {
            this.f76105Y0 = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.f76106Z0;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: t */
    public boolean mo90444t() {
        return (this.f76106Z0.gravity & 112) == 48;
    }

    /* renamed from: u */
    public final int mo90445u(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.f76105Y0;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    /* renamed from: v */
    public final int mo90446v(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    /* renamed from: w */
    public final int mo90447w(int i, int i2, int i3, View view) {
        int i4;
        mo90445u(i, i2, i3);
        if (view == null) {
            i4 = mo90445u(i, i2, i3);
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                i5 += mo90446v(childAt, i, i4);
            }
        }
        return i5;
    }

    /* renamed from: x */
    public final int mo90448x(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = mo90446v(childAt, i, mo90445u(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + mo90447w(i, i2, i3, childAt);
    }
}
