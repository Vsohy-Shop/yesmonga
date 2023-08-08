package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.h7 */
public final class C36716h7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90979a;
    @C0359n0

    /* renamed from: b */
    public final Button f90980b;

    public C36716h7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button) {
        this.f90979a = constraintLayout;
        this.f90980b = button;
    }

    @C0359n0
    /* renamed from: a */
    public static C36716h7 m150591a(@C0359n0 View view) {
        Button button = (Button) C20753c.m96463a(view, R.id.service_scan_cb);
        if (button != null) {
            return new C36716h7((ConstraintLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.service_scan_cb)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36716h7 m150592c(@C0359n0 LayoutInflater layoutInflater) {
        return m150593d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36716h7 m150593d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.service_fid_bloc, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150591a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90979a;
    }
}
