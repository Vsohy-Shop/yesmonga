package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.h1 */
public final class C37051h1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final TextView f92682a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92683b;

    public C37051h1(@C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f92682a = textView;
        this.f92683b = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37051h1 m151987a(@C0359n0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C37051h1(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37051h1 m151988c(@C0359n0 LayoutInflater layoutInflater) {
        return m151989d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37051h1 m151989d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_tagline_custom_view_secondary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151987a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public TextView getRoot() {
        return this.f92682a;
    }
}
