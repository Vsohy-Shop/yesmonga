package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.q5 */
public final class C36804q5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f91541a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91542b;

    public C36804q5(@C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91541a = textView;
        this.f91542b = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36804q5 m150941a(@C0359n0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C36804q5(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36804q5 m150942c(@C0359n0 LayoutInflater layoutInflater) {
        return m150943d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36804q5 m150943d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_product_list_filters_sort, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150941a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f91541a;
    }
}
