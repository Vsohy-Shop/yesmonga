package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0568g;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* renamed from: Y0 */
    public final int f74756Y0;

    /* renamed from: Z0 */
    public final int f74757Z0;

    /* renamed from: a1 */
    public final int f74758a1;

    /* renamed from: b1 */
    public final int f74759b1;

    /* renamed from: c1 */
    public boolean f74760c1;

    /* renamed from: d1 */
    public int[] f74761d1 = new int[5];

    public BottomNavigationMenuView(@C0359n0 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f74756Y0 = resources.getDimensionPixelSize(C31076a.C31082f.design_bottom_navigation_item_max_width);
        this.f74757Z0 = resources.getDimensionPixelSize(C31076a.C31082f.design_bottom_navigation_item_min_width);
        this.f74758a1 = resources.getDimensionPixelSize(C31076a.C31082f.design_bottom_navigation_active_item_max_width);
        this.f74759b1 = resources.getDimensionPixelSize(C31076a.C31082f.design_bottom_navigation_active_item_min_width);
    }

    @C0359n0
    /* renamed from: g */
    public NavigationBarItemView mo88380g(@C0359n0 Context context) {
        return new BottomNavigationItemView(context);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C18196h2.m82553Z(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        C0568g menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.mo2020H().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i6 = 1;
        if (!mo90276l(getLabelVisibilityMode(), size2) || !mo88384t()) {
            if (size2 != 0) {
                i6 = size2;
            }
            int min = Math.min(size / i6, this.f74758a1);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.f74761d1;
                    iArr[i8] = min;
                    if (i7 > 0) {
                        iArr[i8] = min + 1;
                        i7--;
                    }
                } else {
                    this.f74761d1[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i9 = this.f74759b1;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f74758a1, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i10 = size2 - i3;
            int min2 = Math.min(size - (this.f74757Z0 * i10), Math.min(i9, this.f74758a1));
            int i11 = size - min2;
            if (i10 == 0) {
                i4 = 1;
            } else {
                i4 = i10;
            }
            int min3 = Math.min(i11 / i4, this.f74756Y0);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.f74761d1;
                    if (i13 == getSelectedItemPosition()) {
                        i5 = min2;
                    } else {
                        i5 = min3;
                    }
                    iArr2[i13] = i5;
                    if (i12 > 0) {
                        int[] iArr3 = this.f74761d1;
                        iArr3[i13] = iArr3[i13] + 1;
                        i12--;
                    }
                } else {
                    this.f74761d1[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f74761d1[i15], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, View.MeasureSpec.makeMeasureSpec(i14, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f74760c1 = z;
    }

    /* renamed from: t */
    public boolean mo88384t() {
        return this.f74760c1;
    }
}
