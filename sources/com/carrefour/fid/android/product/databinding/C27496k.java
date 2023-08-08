package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.k */
public final class C27496k implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f66705a;
    @C0359n0

    /* renamed from: b */
    public final TextView f66706b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66707c;

    public C27496k(@C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f66705a = linearLayout;
        this.f66706b = textView;
        this.f66707c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27496k m115705a(@C0359n0 View view) {
        int i = C27609f.C27619j.holder_regular_description;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C27609f.C27619j.holder_regular_title;
            TextView textView2 = (TextView) C20753c.m96463a(view, i);
            if (textView2 != null) {
                return new C27496k((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27496k m115706c(@C0359n0 LayoutInflater layoutInflater) {
        return m115707d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27496k m115707d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.holder_component_regular_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115705a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f66705a;
    }
}
