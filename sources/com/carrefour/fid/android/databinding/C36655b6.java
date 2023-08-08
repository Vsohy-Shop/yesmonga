package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.b6 */
public final class C36655b6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayoutCompat f90614a;

    public C36655b6(@C0359n0 LinearLayoutCompat linearLayoutCompat) {
        this.f90614a = linearLayoutCompat;
    }

    @C0359n0
    /* renamed from: a */
    public static C36655b6 m150349a(@C0359n0 View view) {
        if (view != null) {
            return new C36655b6((LinearLayoutCompat) view);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36655b6 m150350c(@C0359n0 LayoutInflater layoutInflater) {
        return m150351d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36655b6 m150351d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_accessibility_information, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150349a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayoutCompat getRoot() {
        return this.f90614a;
    }
}
