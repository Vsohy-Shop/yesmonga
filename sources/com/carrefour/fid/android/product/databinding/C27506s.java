package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.s */
public final class C27506s implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f66738a;
    @C0359n0

    /* renamed from: b */
    public final TextView f66739b;
    @C0359n0

    /* renamed from: c */
    public final View f66740c;

    public C27506s(@C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView, @C0359n0 View view) {
        this.f66738a = linearLayout;
        this.f66739b = textView;
        this.f66740c = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = com.carrefour.fid.android.product.C27609f.C27619j.view_pdp_allergen_separator;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.product.databinding.C27506s m115743a(@androidx.annotation.C0359n0 android.view.View r3) {
        /*
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.text_pdp_allergen_title
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r3, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x001a
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.view_pdp_allergen_separator
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r3, r0)
            if (r2 == 0) goto L_0x001a
            com.carrefour.fid.android.product.databinding.s r0 = new com.carrefour.fid.android.product.databinding.s
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0.<init>(r3, r1, r2)
            return r0
        L_0x001a:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.databinding.C27506s.m115743a(android.view.View):com.carrefour.fid.android.product.databinding.s");
    }

    @C0359n0
    /* renamed from: c */
    public static C27506s m115744c(@C0359n0 LayoutInflater layoutInflater) {
        return m115745d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27506s m115745d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_pdp_allergen, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115743a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f66738a;
    }
}
