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

/* renamed from: com.carrefour.fid.android.databinding.z6 */
public final class C36893z6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92037a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92038b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92039c;
    @C0359n0

    /* renamed from: d */
    public final View f92040d;
    @C0359n0

    /* renamed from: e */
    public final C36646a7 f92041e;
    @C0359n0

    /* renamed from: f */
    public final C36646a7 f92042f;

    public C36893z6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 View view, @C0359n0 C36646a7 a7Var, @C0359n0 C36646a7 a7Var2) {
        this.f92037a = constraintLayout;
        this.f92038b = textView;
        this.f92039c = textView2;
        this.f92040d = view;
        this.f92041e = a7Var;
        this.f92042f = a7Var2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36893z6 m151285a(@C0359n0 View view) {
        int i = R.id.R2TitlePlaceholder;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.R2TitlePlaceholder);
        if (textView != null) {
            i = R.id.R3TitlePlaceholder;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.R3TitlePlaceholder);
            if (textView2 != null) {
                i = R.id.header_cell_view;
                View a = C20753c.m96463a(view, R.id.header_cell_view);
                if (a != null) {
                    i = R.id.plp_cell_placeholder1;
                    View a2 = C20753c.m96463a(view, R.id.plp_cell_placeholder1);
                    if (a2 != null) {
                        C36646a7 a3 = C36646a7.m150313a(a2);
                        i = R.id.plp_cell_placeholder2;
                        View a4 = C20753c.m96463a(view, R.id.plp_cell_placeholder2);
                        if (a4 != null) {
                            return new C36893z6((ConstraintLayout) view, textView, textView2, a, a3, C36646a7.m150313a(a4));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36893z6 m151286c(@C0359n0 LayoutInflater layoutInflater) {
        return m151287d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36893z6 m151287d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.plp_cell_header_placeholder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151285a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92037a;
    }
}
