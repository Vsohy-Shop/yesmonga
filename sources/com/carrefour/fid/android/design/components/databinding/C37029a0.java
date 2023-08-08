package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.flexbox.FlexboxLayout;

/* renamed from: com.carrefour.fid.android.design.components.databinding.a0 */
public final class C37029a0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92559a;
    @C0359n0

    /* renamed from: b */
    public final FlexboxLayout f92560b;

    public C37029a0(@C0359n0 View view, @C0359n0 FlexboxLayout flexboxLayout) {
        this.f92559a = view;
        this.f92560b = flexboxLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C37029a0 m151929a(@C0359n0 View view) {
        int i = C36896b.C36906j.lozenge_list;
        FlexboxLayout flexboxLayout = (FlexboxLayout) C20753c.m96463a(view, i);
        if (flexboxLayout != null) {
            return new C37029a0(view, flexboxLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37029a0 m151930b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_lozenge_list, viewGroup);
            return m151929a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92559a;
    }
}
