package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.account.C13144b;

/* renamed from: com.carrefour.fid.android.account.databinding.q */
public final class C13230q implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32547a;
    @C0359n0

    /* renamed from: b */
    public final View f32548b;
    @C0359n0

    /* renamed from: c */
    public final View f32549c;
    @C0359n0

    /* renamed from: d */
    public final View f32550d;
    @C0359n0

    /* renamed from: e */
    public final View f32551e;
    @C0359n0

    /* renamed from: f */
    public final View f32552f;
    @C0359n0

    /* renamed from: g */
    public final View f32553g;

    public C13230q(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3, @C0359n0 View view4, @C0359n0 View view5, @C0359n0 View view6) {
        this.f32547a = constraintLayout;
        this.f32548b = view;
        this.f32549c = view2;
        this.f32550d = view3;
        this.f32551e = view4;
        this.f32552f = view5;
        this.f32553g = view6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_type_name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_status;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_store_address;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_store_name;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_type_icon;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.account.databinding.C13230q m57327a(@androidx.annotation.C0359n0 android.view.View r9) {
        /*
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_separator
            android.view.View r3 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r3 == 0) goto L_0x003a
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_status
            android.view.View r4 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r4 == 0) goto L_0x003a
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_store_address
            android.view.View r5 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r5 == 0) goto L_0x003a
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_store_name
            android.view.View r6 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r6 == 0) goto L_0x003a
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_type_icon
            android.view.View r7 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r7 == 0) goto L_0x003a
            int r0 = com.carrefour.fid.android.account.C13144b.C13154j.view_shimmer_orders_details_type_name
            android.view.View r8 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r8 == 0) goto L_0x003a
            com.carrefour.fid.android.account.databinding.q r0 = new com.carrefour.fid.android.account.databinding.q
            r2 = r9
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x003a:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.account.databinding.C13230q.m57327a(android.view.View):com.carrefour.fid.android.account.databinding.q");
    }

    @C0359n0
    /* renamed from: c */
    public static C13230q m57328c(@C0359n0 LayoutInflater layoutInflater) {
        return m57329d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13230q m57329d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.shimmer_update_user_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57327a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32547a;
    }
}
