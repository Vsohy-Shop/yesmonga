package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.h0 */
public final class C27491h0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66688a;
    @C0359n0

    /* renamed from: b */
    public final TextView f66689b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66690c;

    public C27491h0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f66688a = constraintLayout;
        this.f66689b = textView;
        this.f66690c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27491h0 m115689a(@C0359n0 View view) {
        int i = C27609f.C27619j.holder_text_freshness_label;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C27609f.C27619j.holder_text_freshness_value;
            TextView textView2 = (TextView) C20753c.m96463a(view, i);
            if (textView2 != null) {
                return new C27491h0((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27491h0 m115690c(@C0359n0 LayoutInflater layoutInflater) {
        return m115691d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27491h0 m115691d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.view_freshness_guaranteed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115689a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66688a;
    }
}
