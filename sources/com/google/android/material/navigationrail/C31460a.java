package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0364q;
import androidx.annotation.RestrictTo;
import com.google.android.material.C31076a;
import com.google.android.material.navigation.NavigationBarItemView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.navigationrail.a */
public final class C31460a extends NavigationBarItemView {
    public C31460a(@C0359n0 Context context) {
        super(context);
    }

    @C0364q
    public int getItemDefaultMarginResId() {
        return C31076a.C31082f.mtrl_navigation_rail_icon_margin;
    }

    @C0347i0
    public int getItemLayoutResId() {
        return C31076a.C31087k.mtrl_navigation_rail_item;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}
