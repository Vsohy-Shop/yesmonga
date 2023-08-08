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

/* renamed from: com.carrefour.fid.android.databinding.s4 */
public final class C36823s4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91633a;
    @C0359n0

    /* renamed from: b */
    public final HubProductComponent f91634b;

    public C36823s4(@C0359n0 LinearLayout linearLayout, @C0359n0 HubProductComponent hubProductComponent) {
        this.f91633a = linearLayout;
        this.f91634b = hubProductComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36823s4 m151013a(@C0359n0 View view) {
        HubProductComponent hubProductComponent = (HubProductComponent) C20753c.m96463a(view, R.id.hub_missing_products);
        if (hubProductComponent != null) {
            return new C36823s4((LinearLayout) view, hubProductComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.hub_missing_products)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36823s4 m151014c(@C0359n0 LayoutInflater layoutInflater) {
        return m151015d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36823s4 m151015d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_missing_product_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151013a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91633a;
    }
}
