package com.google.android.material.bottomnavigation;

import android.content.Context;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0364q;
import androidx.annotation.RestrictTo;
import com.google.android.material.C31076a;
import com.google.android.material.navigation.NavigationBarItemView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(@C0359n0 Context context) {
        super(context);
    }

    @C0364q
    public int getItemDefaultMarginResId() {
        return C31076a.C31082f.design_bottom_navigation_margin;
    }

    @C0347i0
    public int getItemLayoutResId() {
        return C31076a.C31087k.design_bottom_navigation_item;
    }
}
