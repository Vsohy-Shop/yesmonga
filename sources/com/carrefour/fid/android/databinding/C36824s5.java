package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.s5 */
public final class C36824s5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f91635a;

    public C36824s5(@C0359n0 TextView textView) {
        this.f91635a = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36824s5 m151017a(@C0359n0 View view) {
        if (view != null) {
            return new C36824s5((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36824s5 m151018c(@C0359n0 LayoutInflater layoutInflater) {
        return m151019d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36824s5 m151019d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_product_search_suggestion, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151017a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f91635a;
    }
}
