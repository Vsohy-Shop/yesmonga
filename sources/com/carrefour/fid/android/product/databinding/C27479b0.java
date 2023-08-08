package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.b0 */
public final class C27479b0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f66619a;
    @C0359n0

    /* renamed from: b */
    public final TextView f66620b;

    public C27479b0(@C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f66619a = textView;
        this.f66620b = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27479b0 m115641a(@C0359n0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C27479b0(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C27479b0 m115642c(@C0359n0 LayoutInflater layoutInflater) {
        return m115643d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27479b0 m115643d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.plp_department_tag, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115641a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f66619a;
    }
}
