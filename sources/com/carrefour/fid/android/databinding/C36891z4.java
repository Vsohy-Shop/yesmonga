package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.z4 */
public final class C36891z4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92022a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92023b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92024c;

    public C36891z4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f92022a = constraintLayout;
        this.f92023b = textView;
        this.f92024c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36891z4 m151277a(@C0359n0 View view) {
        int i = R.id.promo_amount_text;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.promo_amount_text);
        if (textView != null) {
            i = R.id.promo_code_text;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.promo_code_text);
            if (textView2 != null) {
                return new C36891z4((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36891z4 m151278c(@C0359n0 LayoutInflater layoutInflater) {
        return m151279d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36891z4 m151279d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_offline_promo_code_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151277a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92022a;
    }
}
