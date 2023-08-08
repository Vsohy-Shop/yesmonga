package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.l0 */
public final class C27499l0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f66714a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f66715b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f66716c;
    @C0359n0

    /* renamed from: d */
    public final ProgressBar f66717d;
    @C0359n0

    /* renamed from: e */
    public final TextView f66718e;
    @C0359n0

    /* renamed from: f */
    public final TextView f66719f;
    @C0359n0

    /* renamed from: g */
    public final TextView f66720g;
    @C0359n0

    /* renamed from: h */
    public final View f66721h;

    public C27499l0(@C0359n0 View view, @C0359n0 ImageButton imageButton, @C0359n0 ImageButton imageButton2, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 View view2) {
        this.f66714a = view;
        this.f66715b = imageButton;
        this.f66716c = imageButton2;
        this.f66717d = progressBar;
        this.f66718e = textView;
        this.f66719f = textView2;
        this.f66720g = textView3;
        this.f66721h = view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = com.carrefour.fid.android.product.C27609f.C27619j.view_product_quantity_background;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.product.databinding.C27499l0 m115717a(@androidx.annotation.C0359n0 android.view.View r11) {
        /*
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.button_product_quantity_add
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r11, r0)
            r4 = r1
            android.widget.ImageButton r4 = (android.widget.ImageButton) r4
            if (r4 == 0) goto L_0x0052
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.button_product_quantity_remove
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r11, r0)
            r5 = r1
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            if (r5 == 0) goto L_0x0052
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.progress_product_quantity
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r11, r0)
            r6 = r1
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            if (r6 == 0) goto L_0x0052
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.text_product_quantity_discount
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r11, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0052
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.text_product_quantity_max
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r11, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0052
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.text_product_quantity_value
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r11, r0)
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0052
            int r0 = com.carrefour.fid.android.product.C27609f.C27619j.view_product_quantity_background
            android.view.View r10 = androidx.viewbinding.C20753c.m96463a(r11, r0)
            if (r10 == 0) goto L_0x0052
            com.carrefour.fid.android.product.databinding.l0 r0 = new com.carrefour.fid.android.product.databinding.l0
            r2 = r0
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0052:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.databinding.C27499l0.m115717a(android.view.View):com.carrefour.fid.android.product.databinding.l0");
    }

    @C0359n0
    /* renamed from: b */
    public static C27499l0 m115718b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C27609f.C27622m.view_product_quantity, viewGroup);
            return m115717a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f66714a;
    }
}
