package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.service.CustomerServiceCardView;

/* renamed from: com.carrefour.fid.android.databinding.n5 */
public final class C36774n5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f91369a;
    @C0359n0

    /* renamed from: b */
    public final CustomerServiceCardView f91370b;

    public C36774n5(@C0359n0 FrameLayout frameLayout, @C0359n0 CustomerServiceCardView customerServiceCardView) {
        this.f91369a = frameLayout;
        this.f91370b = customerServiceCardView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36774n5 m150823a(@C0359n0 View view) {
        CustomerServiceCardView customerServiceCardView = (CustomerServiceCardView) C20753c.m96463a(view, R.id.customerServiceCard);
        if (customerServiceCardView != null) {
            return new C36774n5((FrameLayout) view, customerServiceCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.customerServiceCard)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36774n5 m150824c(@C0359n0 LayoutInflater layoutInflater) {
        return m150825d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36774n5 m150825d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_orders_customer_service, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150823a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f91369a;
    }
}
