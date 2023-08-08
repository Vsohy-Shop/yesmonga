package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.b5 */
public final class C36654b5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90606a;
    @C0359n0

    /* renamed from: b */
    public final Guideline f90607b;
    @C0359n0

    /* renamed from: c */
    public final Guideline f90608c;
    @C0359n0

    /* renamed from: d */
    public final Guideline f90609d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90610e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90611f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90612g;
    @C0359n0

    /* renamed from: h */
    public final View f90613h;

    public C36654b5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Guideline guideline, @C0359n0 Guideline guideline2, @C0359n0 Guideline guideline3, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 View view) {
        this.f90606a = constraintLayout;
        this.f90607b = guideline;
        this.f90608c = guideline2;
        this.f90609d = guideline3;
        this.f90610e = textView;
        this.f90611f = textView2;
        this.f90612g = textView3;
        this.f90613h = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36654b5 m150345a(@C0359n0 View view) {
        int i = R.id.guidelineBottom;
        Guideline guideline = (Guideline) C20753c.m96463a(view, R.id.guidelineBottom);
        if (guideline != null) {
            i = R.id.guidelineEnd;
            Guideline guideline2 = (Guideline) C20753c.m96463a(view, R.id.guidelineEnd);
            if (guideline2 != null) {
                i = R.id.guidelineTop;
                Guideline guideline3 = (Guideline) C20753c.m96463a(view, R.id.guidelineTop);
                if (guideline3 != null) {
                    i = R.id.text_holder_order_offline_details_vat_amount;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_vat_amount);
                    if (textView != null) {
                        i = R.id.text_holder_order_offline_details_vat_amount_tax;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_vat_amount_tax);
                        if (textView2 != null) {
                            i = R.id.text_holder_order_offline_details_vat_percentage;
                            TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_vat_percentage);
                            if (textView3 != null) {
                                i = R.id.view_holder_order_offline_details_vat_divider_end;
                                View a = C20753c.m96463a(view, R.id.view_holder_order_offline_details_vat_divider_end);
                                if (a != null) {
                                    return new C36654b5((ConstraintLayout) view, guideline, guideline2, guideline3, textView, textView2, textView3, a);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36654b5 m150346c(@C0359n0 LayoutInflater layoutInflater) {
        return m150347d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36654b5 m150347d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_offline_vat_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150345a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90606a;
    }
}
