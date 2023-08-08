package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.j */
public final class C27494j implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66696a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f66697b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66698c;
    @C0359n0

    /* renamed from: d */
    public final View f66699d;

    public C27494j(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 View view) {
        this.f66696a = constraintLayout;
        this.f66697b = imageView;
        this.f66698c = textView;
        this.f66699d = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = com.carrefour.fid.android.product.C27609f.C27619j.view_sep;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.product.databinding.C27494j m115699a(@androidx.annotation.C0359n0 android.view.View r4) {
        /*
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.holder_image_arrow
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r4, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r1 == 0) goto L_0x0024
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.holder_text_title
            android.view.View r2 = androidx.viewbinding.C20753c.m96463a(r4, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0024
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.view_sep
            android.view.View r3 = androidx.viewbinding.C20753c.m96463a(r4, r0)
            if (r3 == 0) goto L_0x0024
            com.carrefour.fid.android.product.databinding.j r0 = new com.carrefour.fid.android.product.databinding.j
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0.<init>(r4, r1, r2, r3)
            return r0
        L_0x0024:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.databinding.C27494j.m115699a(android.view.View):com.carrefour.fid.android.product.databinding.j");
    }

    @C0359n0
    /* renamed from: c */
    public static C27494j m115700c(@C0359n0 LayoutInflater layoutInflater) {
        return m115701d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27494j m115701d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_component_parent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115699a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66696a;
    }
}
