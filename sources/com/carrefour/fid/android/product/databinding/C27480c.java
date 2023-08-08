package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.ProductNotificationView;

/* renamed from: com.carrefour.fid.android.product.databinding.c */
public final class C27480c implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66621a;
    @C0359n0

    /* renamed from: b */
    public final C27507t f66622b;
    @C0359n0

    /* renamed from: c */
    public final ProductNotificationView f66623c;
    @C0359n0

    /* renamed from: d */
    public final C27485e0 f66624d;
    @C0359n0

    /* renamed from: e */
    public final ViewStub f66625e;
    @C0359n0

    /* renamed from: f */
    public final C27487f0 f66626f;

    public C27480c(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 C27507t tVar, @C0359n0 ProductNotificationView productNotificationView, @C0359n0 C27485e0 e0Var, @C0359n0 ViewStub viewStub, @C0359n0 C27487f0 f0Var) {
        this.f66621a = constraintLayout;
        this.f66622b = tVar;
        this.f66623c = productNotificationView;
        this.f66624d = e0Var;
        this.f66625e = viewStub;
        this.f66626f = f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = com.carrefour.fid.android.product.C27609f.C27619j.product_details_bottom_sheet;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = com.carrefour.fid.android.product.C27609f.C27619j.toolbar_pdp;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.product.databinding.C27480c m115645a(@androidx.annotation.C0359n0 android.view.View r9) {
        /*
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.include_pdp_details
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r1 == 0) goto L_0x0044
            com.carrefour.fid.android.product.databinding.t r4 = com.carrefour.fid.android.product.databinding.C27507t.m115747a(r1)
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.notification_offer_details_product
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r5 = r1
            com.carrefour.fid.android.product.presentation.ui.details.views.ProductNotificationView r5 = (com.carrefour.fid.android.product.presentation.p039ui.details.views.ProductNotificationView) r5
            if (r5 == 0) goto L_0x0044
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.product_details_bottom_sheet
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r1 == 0) goto L_0x0044
            com.carrefour.fid.android.product.databinding.e0 r6 = com.carrefour.fid.android.product.databinding.C27485e0.m115665a(r1)
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.stub_offer_details_error
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r7 = r1
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            if (r7 == 0) goto L_0x0044
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.toolbar_pdp
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r1 == 0) goto L_0x0044
            com.carrefour.fid.android.product.databinding.f0 r8 = com.carrefour.fid.android.product.databinding.C27487f0.m115673a(r1)
            com.carrefour.fid.android.product.databinding.c r0 = new com.carrefour.fid.android.product.databinding.c
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0044:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.databinding.C27480c.m115645a(android.view.View):com.carrefour.fid.android.product.databinding.c");
    }

    @C0359n0
    /* renamed from: c */
    public static C27480c m115646c(@C0359n0 LayoutInflater layoutInflater) {
        return m115647d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27480c m115647d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.fragment_offer_product_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115645a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66621a;
    }
}
