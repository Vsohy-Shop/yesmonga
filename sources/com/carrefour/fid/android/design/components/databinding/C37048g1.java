package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.g1 */
public final class C37048g1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f92660a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92661b;

    public C37048g1(@C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f92660a = textView;
        this.f92661b = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37048g1 m151977a(@C0359n0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C37048g1(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37048g1 m151978c(@C0359n0 LayoutInflater layoutInflater) {
        return m151979d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37048g1 m151979d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_tagline_custom_view_primary_background_on, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151977a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f92660a;
    }
}
