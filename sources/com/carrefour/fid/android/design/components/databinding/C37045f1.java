package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.f1 */
public final class C37045f1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f92646a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92647b;

    public C37045f1(@C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f92646a = textView;
        this.f92647b = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37045f1 m151967a(@C0359n0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C37045f1(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37045f1 m151968c(@C0359n0 LayoutInflater layoutInflater) {
        return m151969d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37045f1 m151969d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_tagline_custom_view_primary_background_off, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151967a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f92646a;
    }
}
