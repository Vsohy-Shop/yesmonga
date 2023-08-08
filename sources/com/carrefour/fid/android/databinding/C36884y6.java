package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.y6 */
public final class C36884y6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91986a;

    public C36884y6(@C0359n0 LinearLayout linearLayout) {
        this.f91986a = linearLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36884y6 m151249a(@C0359n0 View view) {
        if (view != null) {
            return new C36884y6((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36884y6 m151250c(@C0359n0 LayoutInflater layoutInflater) {
        return m151251d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36884y6 m151251d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.petrol_info_row_placeholder_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151249a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91986a;
    }
}
