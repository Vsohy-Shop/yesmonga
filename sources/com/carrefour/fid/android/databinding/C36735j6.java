package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.j6 */
public final class C36735j6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CardView f91075a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91076b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91077c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91078d;

    public C36735j6(@C0359n0 CardView cardView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f91075a = cardView;
        this.f91076b = textView;
        this.f91077c = textView2;
        this.f91078d = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36735j6 m150667a(@C0359n0 View view) {
        int i = R.id.loyalty_date;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.loyalty_date);
        if (textView != null) {
            i = R.id.text_locality;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_locality);
            if (textView2 != null) {
                i = R.id.text_paiment;
                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_paiment);
                if (textView3 != null) {
                    return new C36735j6((CardView) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36735j6 m150668c(@C0359n0 LayoutInflater layoutInflater) {
        return m150669d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36735j6 m150669d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_loyalty_amount_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150667a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CardView getRoot() {
        return this.f91075a;
    }
}
