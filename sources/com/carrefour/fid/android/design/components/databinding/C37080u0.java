package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.u0 */
public final class C37080u0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92829a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92830b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92831c;
    @C0359n0

    /* renamed from: d */
    public final TextView f92832d;

    public C37080u0(@C0359n0 View view, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f92829a = view;
        this.f92830b = textView;
        this.f92831c = textView2;
        this.f92832d = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C37080u0 m152067a(@C0359n0 View view) {
        int i = C36896b.C36906j.day_of_week_title;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            i = C36896b.C36906j.day_title;
            TextView textView2 = (TextView) C20753c.m96463a(view, i);
            if (textView2 != null) {
                i = C36896b.C36906j.month_title;
                TextView textView3 = (TextView) C20753c.m96463a(view, i);
                if (textView3 != null) {
                    return new C37080u0(view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37080u0 m152068b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_service_slot_date, viewGroup);
            return m152067a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92829a;
    }
}
