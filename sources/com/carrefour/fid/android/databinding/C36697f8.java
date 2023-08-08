package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.f8 */
public final class C36697f8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90849a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayout f90850b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f90851c;

    public C36697f8(@C0359n0 LinearLayout linearLayout, @C0359n0 LinearLayout linearLayout2, @C0359n0 LinearLayout linearLayout3) {
        this.f90849a = linearLayout;
        this.f90850b = linearLayout2;
        this.f90851c = linearLayout3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36697f8 m150515a(@C0359n0 View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        LinearLayout linearLayout2 = (LinearLayout) C20753c.m96463a(view, R.id.openingContainer);
        if (linearLayout2 != null) {
            return new C36697f8(linearLayout, linearLayout, linearLayout2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.openingContainer)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36697f8 m150516c(@C0359n0 LayoutInflater layoutInflater) {
        return m150517d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36697f8 m150517d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.store_exceptional_opening_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150515a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90849a;
    }
}
