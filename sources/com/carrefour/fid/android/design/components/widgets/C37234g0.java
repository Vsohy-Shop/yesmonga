package com.carrefour.fid.android.design.components.widgets;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C31624d;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.design.components.widgets.g0 */
public final class C37234g0 {
    /* renamed from: b */
    public static final void m152858b(@C12579k TabLayout tabLayout, @C12580l ViewPager2 viewPager2, int i) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(tabLayout, "<this>");
        boolean z = false;
        if (!(viewPager2 == null || (adapter = viewPager2.getAdapter()) == null || i != adapter.getItemCount())) {
            z = true;
        }
        if (z) {
            new C31624d(tabLayout, viewPager2, new C37222f0()).mo91446a();
            return;
        }
        throw new Exception("The size of list and the tab count should be equal!");
    }

    /* renamed from: c */
    public static final void m152859c(TabLayout.C31615i iVar, int i) {
        Intrinsics.checkNotNullParameter(iVar, "<anonymous parameter 0>");
    }
}
