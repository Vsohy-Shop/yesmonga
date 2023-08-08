package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.v7 */
public final class C36856v7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91812a;

    public C36856v7(@C0359n0 LinearLayout linearLayout) {
        this.f91812a = linearLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36856v7 m151141a(@C0359n0 View view) {
        if (view != null) {
            return new C36856v7((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36856v7 m151142c(@C0359n0 LayoutInflater layoutInflater) {
        return m151143d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36856v7 m151143d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.shimmer_orders_offline_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151141a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91812a;
    }
}
