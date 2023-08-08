package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.f2 */
public final class C36691f2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90797a;
    @C0359n0

    /* renamed from: b */
    public final TextView f90798b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90799c;

    public C36691f2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f90797a = constraintLayout;
        this.f90798b = textView;
        this.f90799c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36691f2 m150491a(@C0359n0 View view) {
        int i = R.id.textView13;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.textView13);
        if (textView != null) {
            i = R.id.textView14;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.textView14);
            if (textView2 != null) {
                return new C36691f2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36691f2 m150492c(@C0359n0 LayoutInflater layoutInflater) {
        return m150493d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36691f2 m150493d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fid_card_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150491a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90797a;
    }
}
