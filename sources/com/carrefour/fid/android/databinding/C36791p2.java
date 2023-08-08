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
import com.carrefour.fid.android.presentation.components.loyalty.BarCodeCardView;

/* renamed from: com.carrefour.fid.android.databinding.p2 */
public final class C36791p2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91479a;
    @C0359n0

    /* renamed from: b */
    public final BarCodeCardView f91480b;

    public C36791p2(@C0359n0 LinearLayout linearLayout, @C0359n0 BarCodeCardView barCodeCardView) {
        this.f91479a = linearLayout;
        this.f91480b = barCodeCardView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36791p2 m150891a(@C0359n0 View view) {
        BarCodeCardView barCodeCardView = (BarCodeCardView) C20753c.m96463a(view, R.id.barcodeCard);
        if (barCodeCardView != null) {
            return new C36791p2((LinearLayout) view, barCodeCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.barcodeCard)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36791p2 m150892c(@C0359n0 LayoutInflater layoutInflater) {
        return m150893d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36791p2 m150893d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_loyalty_my_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150891a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91479a;
    }
}
