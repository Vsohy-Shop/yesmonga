package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: com.carrefour.fid.android.product.databinding.e */
public final class C27484e implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66642a;
    @C0359n0

    /* renamed from: b */
    public final CollapsingToolbarLayout f66643b;
    @C0359n0

    /* renamed from: c */
    public final CoordinatorLayout f66644c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f66645d;
    @C0359n0

    /* renamed from: e */
    public final ViewStub f66646e;
    @C0359n0

    /* renamed from: f */
    public final ViewStub f66647f;
    @C0359n0

    /* renamed from: g */
    public final ComposeView f66648g;
    @C0359n0

    /* renamed from: h */
    public final LinearLayout f66649h;
    @C0359n0

    /* renamed from: i */
    public final ShimmerFrameLayout f66650i;
    @C0359n0

    /* renamed from: j */
    public final C27483d0 f66651j;

    public C27484e(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 CollapsingToolbarLayout collapsingToolbarLayout, @C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 C27483d0 d0Var) {
        this.f66642a = constraintLayout;
        this.f66643b = collapsingToolbarLayout;
        this.f66644c = coordinatorLayout;
        this.f66645d = recyclerView;
        this.f66646e = viewStub;
        this.f66647f = viewStub2;
        this.f66648g = composeView;
        this.f66649h = linearLayout;
        this.f66650i = shimmerFrameLayout;
        this.f66651j = d0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = com.carrefour.fid.android.product.C27609f.C27619j.sub_header;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.product.databinding.C27484e m115661a(@androidx.annotation.C0359n0 android.view.View r13) {
        /*
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.collapsing_toolbar_plp
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r4 = r1
            com.google.android.material.appbar.CollapsingToolbarLayout r4 = (com.google.android.material.appbar.CollapsingToolbarLayout) r4
            if (r4 == 0) goto L_0x006e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.coordinator_layout
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r5 = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r5
            if (r5 == 0) goto L_0x006e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.product_list
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x006e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.product_list_empty
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r7 = r1
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            if (r7 == 0) goto L_0x006e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.product_list_error
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r8 = r1
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            if (r8 == 0) goto L_0x006e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.product_list_header
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r9 = r1
            androidx.compose.ui.platform.ComposeView r9 = (androidx.compose.p004ui.platform.ComposeView) r9
            if (r9 == 0) goto L_0x006e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.product_list_header_layout
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r10 = r1
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x006e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.product_list_loading
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r11 = r1
            com.facebook.shimmer.ShimmerFrameLayout r11 = (com.facebook.shimmer.ShimmerFrameLayout) r11
            if (r11 == 0) goto L_0x006e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.sub_header
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            if (r1 == 0) goto L_0x006e
            com.carrefour.fid.android.product.databinding.d0 r12 = com.carrefour.fid.android.product.databinding.C27483d0.m115657a(r1)
            com.carrefour.fid.android.product.databinding.e r0 = new com.carrefour.fid.android.product.databinding.e
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006e:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.databinding.C27484e.m115661a(android.view.View):com.carrefour.fid.android.product.databinding.e");
    }

    @C0359n0
    /* renamed from: c */
    public static C27484e m115662c(@C0359n0 LayoutInflater layoutInflater) {
        return m115663d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27484e m115663d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.fragment_product_list2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115661a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66642a;
    }
}
