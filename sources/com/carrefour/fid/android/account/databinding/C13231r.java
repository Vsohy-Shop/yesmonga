package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.account.C13144b;

/* renamed from: com.carrefour.fid.android.account.databinding.r */
public final class C13231r implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32554a;
    @C0359n0

    /* renamed from: b */
    public final View f32555b;
    @C0359n0

    /* renamed from: c */
    public final View f32556c;
    @C0359n0

    /* renamed from: d */
    public final View f32557d;
    @C0359n0

    /* renamed from: e */
    public final View f32558e;

    public C13231r(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4) {
        this.f32554a = constraintLayout;
        this.f32555b = view;
        this.f32556c = view2;
        this.f32557d = view3;
        this.f32558e = view4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_product_name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_product_name_rest;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_product_quantity;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.account.databinding.C13231r m57331a(@androidx.annotation.C0359n0 android.view.View r7) {
        /*
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_product_amount
            android.view.View r3 = androidx.viewbinding.C20753c.m96463a(r7, r0)
            if (r3 == 0) goto L_0x002a
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_product_name
            android.view.View r4 = androidx.viewbinding.C20753c.m96463a(r7, r0)
            if (r4 == 0) goto L_0x002a
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_product_name_rest
            android.view.View r5 = androidx.viewbinding.C20753c.m96463a(r7, r0)
            if (r5 == 0) goto L_0x002a
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_product_quantity
            android.view.View r6 = androidx.viewbinding.C20753c.m96463a(r7, r0)
            if (r6 == 0) goto L_0x002a
            com.carrefour.fid.android.account.databinding.r r0 = new com.carrefour.fid.android.account.databinding.r
            r2 = r7
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x002a:
            android.content.res.Resources r7 = r7.getResources()
            java.lang.String r7 = r7.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.databinding.C13231r.m57331a(android.view.View):com.carrefour.fid.android.account.databinding.r");
    }

    @C0359n0
    /* renamed from: c */
    public static C13231r m57332c(@C0359n0 LayoutInflater layoutInflater) {
        return m57333d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13231r m57333d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.shimmer_update_user_address_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57331a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32554a;
    }
}
