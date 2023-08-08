package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.HubProductComponent;

/* renamed from: com.carrefour.fid.android.databinding.e5 */
public final class C36684e5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90765a;
    @C0359n0

    /* renamed from: b */
    public final HubProductComponent f90766b;

    public C36684e5(@C0359n0 LinearLayout linearLayout, @C0359n0 HubProductComponent hubProductComponent) {
        this.f90765a = linearLayout;
        this.f90766b = hubProductComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36684e5 m150465a(@C0359n0 View view) {
        HubProductComponent hubProductComponent = (HubProductComponent) C20753c.m96463a(view, R.id.hub_original_order_products);
        if (hubProductComponent != null) {
            return new C36684e5((LinearLayout) view, hubProductComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.hub_original_order_products)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36684e5 m150466c(@C0359n0 LayoutInflater layoutInflater) {
        return m150467d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36684e5 m150467d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_original_order_product_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150465a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90765a;
    }
}
