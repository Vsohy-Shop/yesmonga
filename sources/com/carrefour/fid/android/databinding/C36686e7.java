package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.e7 */
public final class C36686e7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90772a;

    public C36686e7(@C0359n0 LinearLayout linearLayout) {
        this.f90772a = linearLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C36686e7 m150473a(@C0359n0 View view) {
        if (view != null) {
            return new C36686e7((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36686e7 m150474c(@C0359n0 LayoutInflater layoutInflater) {
        return m150475d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36686e7 m150475d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.prime_pass_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150473a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90772a;
    }
}
