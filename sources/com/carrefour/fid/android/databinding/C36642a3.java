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

/* renamed from: com.carrefour.fid.android.databinding.a3 */
public final class C36642a3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90552a;
    @C0359n0

    /* renamed from: b */
    public final TextView f90553b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90554c;

    public C36642a3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f90552a = constraintLayout;
        this.f90553b = textView;
        this.f90554c = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36642a3 m150297a(@C0359n0 View view) {
        int i = R.id.textView13;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.textView13);
        if (textView != null) {
            i = R.id.textView14;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.textView14);
            if (textView2 != null) {
                return new C36642a3((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36642a3 m150298c(@C0359n0 LayoutInflater layoutInflater) {
        return m150299d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36642a3 m150299d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_pass_card_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150297a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90552a;
    }
}
