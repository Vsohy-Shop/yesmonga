package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.y */
public final class C27512y implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66778a;
    @C0359n0

    /* renamed from: b */
    public final TextView f66779b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66780c;
    @C0359n0

    /* renamed from: d */
    public final TextView f66781d;
    @C0359n0

    /* renamed from: e */
    public final TextView f66782e;
    @C0359n0

    /* renamed from: f */
    public final View f66783f;

    public C27512y(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 View view) {
        this.f66778a = constraintLayout;
        this.f66779b = textView;
        this.f66780c = textView2;
        this.f66781d = textView3;
        this.f66782e = textView4;
        this.f66783f = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = com.carrefour.fid.android.product.C27609f.C27619j.viewSeparator;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.product.databinding.C27512y m115767a(@androidx.annotation.C0359n0 android.view.View r9) {
        /*
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.txtPdNutriDescLabel
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x003e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.txtPdNutriDescValue
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x003e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.txtPdNutriLabel
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x003e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.txtPdNutriValue
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x003e
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.viewSeparator
            android.view.View r8 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r8 == 0) goto L_0x003e
            com.carrefour.fid.android.product.databinding.y r0 = new com.carrefour.fid.android.product.databinding.y
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x003e:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.databinding.C27512y.m115767a(android.view.View):com.carrefour.fid.android.product.databinding.y");
    }

    @C0359n0
    /* renamed from: c */
    public static C27512y m115768c(@C0359n0 LayoutInflater layoutInflater) {
        return m115769d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27512y m115769d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.pdp_cell_nutritional, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115767a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66778a;
    }
}
