package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.p5 */
public final class C36794p5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f91490a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91491b;

    public C36794p5(@C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91490a = textView;
        this.f91491b = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36794p5 m150903a(@C0359n0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C36794p5(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36794p5 m150904c(@C0359n0 LayoutInflater layoutInflater) {
        return m150905d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36794p5 m150905d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_product_list_filters_facet_term, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150903a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f91490a;
    }
}
