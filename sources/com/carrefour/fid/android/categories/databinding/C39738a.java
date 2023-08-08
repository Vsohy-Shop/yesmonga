package com.carrefour.fid.android.categories.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.categories.C39711b;
import com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView;
import com.carrefour.fid.android.shared.databinding.C28654e;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.categories.databinding.a */
public final class C39738a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f101385a;
    @C0359n0

    /* renamed from: b */
    public final C28654e f101386b;
    @C0359n0

    /* renamed from: c */
    public final ListItemRecyclerView f101387c;
    @C0359n0

    /* renamed from: d */
    public final ShimmerFrameLayout f101388d;
    @C0359n0

    /* renamed from: e */
    public final C39740c f101389e;

    public C39738a(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 C28654e eVar, @C0359n0 ListItemRecyclerView listItemRecyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 C39740c cVar) {
        this.f101385a = coordinatorLayout;
        this.f101386b = eVar;
        this.f101387c = listItemRecyclerView;
        this.f101388d = shimmerFrameLayout;
        this.f101389e = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = com.carrefour.fid.android.categories.C39711b.C39721j.shimmer_department_loading;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.categories.databinding.C39738a m162171a(@androidx.annotation.C0359n0 android.view.View r8) {
        /*
            int r0 = com.carrefour.fid.android.categories.C39711b.C39721j.department_error_view
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            if (r1 == 0) goto L_0x0038
            com.carrefour.fid.android.shared.databinding.e r4 = com.carrefour.fid.android.shared.databinding.C28654e.m118636a(r1)
            int r0 = com.carrefour.fid.android.categories.C39711b.C39721j.department_list
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            r5 = r1
            com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView r5 = (com.carrefour.fid.android.design.components.widgets.list.ListItemRecyclerView) r5
            if (r5 == 0) goto L_0x0038
            int r0 = com.carrefour.fid.android.categories.C39711b.C39721j.department_loading_view
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            r6 = r1
            com.facebook.shimmer.ShimmerFrameLayout r6 = (com.facebook.shimmer.ShimmerFrameLayout) r6
            if (r6 == 0) goto L_0x0038
            int r0 = com.carrefour.fid.android.categories.C39711b.C39721j.shimmer_department_loading
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r8, r0)
            if (r1 == 0) goto L_0x0038
            com.carrefour.fid.android.categories.databinding.c r7 = com.carrefour.fid.android.categories.databinding.C39740c.m162179a(r1)
            com.carrefour.fid.android.categories.databinding.a r0 = new com.carrefour.fid.android.categories.databinding.a
            r3 = r8
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0038:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.categories.databinding.C39738a.m162171a(android.view.View):com.carrefour.fid.android.categories.databinding.a");
    }

    @C0359n0
    /* renamed from: c */
    public static C39738a m162172c(@C0359n0 LayoutInflater layoutInflater) {
        return m162173d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39738a m162173d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39711b.C39724m.content_departement, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m162171a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f101385a;
    }
}
