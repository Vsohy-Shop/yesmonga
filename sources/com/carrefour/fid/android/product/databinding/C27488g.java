package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.g */
public final class C27488g implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f66669a;
    @C0359n0

    /* renamed from: b */
    public final TextView f66670b;

    public C27488g(@C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f66669a = textView;
        this.f66670b = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27488g m115677a(@C0359n0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C27488g(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C27488g m115678c(@C0359n0 LayoutInflater layoutInflater) {
        return m115679d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27488g m115679d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_butterfly_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115677a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f66669a;
    }
}
