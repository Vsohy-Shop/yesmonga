package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.o0 */
public final class C37068o0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92758a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92759b;
    @C0359n0

    /* renamed from: c */
    public final Flow f92760c;
    @C0359n0

    /* renamed from: d */
    public final TextView f92761d;

    public C37068o0(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 Flow flow, @C0359n0 TextView textView2) {
        this.f92758a = view;
        this.f92759b = textView;
        this.f92760c = flow;
        this.f92761d = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37068o0 m152033a(@C0359n0 View view) {
        int i = C36896b.C36906j.first_delivery_mode;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.flow;
            Flow flow = (Flow) C20753c.m96463a(view, i);
            if (flow != null) {
                i = C36896b.C36906j.second_delivery_mode;
                TextView textView2 = (TextView) C20753c.m96463a(view, i);
                if (textView2 != null) {
                    return new C37068o0(view, textView, flow, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37068o0 m152034b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_product_delivery_mode, viewGroup);
            return m152033a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92758a;
    }
}
