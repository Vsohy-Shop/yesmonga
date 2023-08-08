package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.j4 */
public final class C36733j4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91067a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91068b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91069c;

    public C36733j4(@C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91067a = linearLayout;
        this.f91068b = textView;
        this.f91069c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36733j4 m150659a(@C0359n0 View view) {
        int i = R.id.text_offer_department_count;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.text_offer_department_count);
        if (textView != null) {
            i = R.id.text_offer_department_label;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_offer_department_label);
            if (textView2 != null) {
                return new C36733j4((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36733j4 m150660c(@C0359n0 LayoutInflater layoutInflater) {
        return m150661d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36733j4 m150661d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_department, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150659a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91067a;
    }
}
