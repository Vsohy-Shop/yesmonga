package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.w4 */
public final class C36863w4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91850a;
    @C0359n0

    /* renamed from: b */
    public final Button f91851b;
    @C0359n0

    /* renamed from: c */
    public final Button f91852c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91853d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91854e;
    @C0359n0

    /* renamed from: f */
    public final View f91855f;

    public C36863w4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 Button button2, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 View view) {
        this.f91850a = constraintLayout;
        this.f91851b = button;
        this.f91852c = button2;
        this.f91853d = textView;
        this.f91854e = textView2;
        this.f91855f = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36863w4 m151169a(@C0359n0 View view) {
        int i = R.id.text_download_bank_receipt;
        Button button = (Button) C20753c.m96463a(view, R.id.text_download_bank_receipt);
        if (button != null) {
            i = R.id.text_download_bill_receipt;
            Button button2 = (Button) C20753c.m96463a(view, R.id.text_download_bill_receipt);
            if (button2 != null) {
                i = R.id.text_holder_order_offline_details_header_amount;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_header_amount);
                if (textView != null) {
                    i = R.id.text_holder_order_offline_details_header_store_name;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_header_store_name);
                    if (textView2 != null) {
                        i = R.id.view_holder_order_offline_details_divider;
                        View a = C20753c.m96463a(view, R.id.view_holder_order_offline_details_divider);
                        if (a != null) {
                            return new C36863w4((ConstraintLayout) view, button, button2, textView, textView2, a);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36863w4 m151170c(@C0359n0 LayoutInflater layoutInflater) {
        return m151171d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36863w4 m151171d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_offline_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151169a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91850a;
    }
}
