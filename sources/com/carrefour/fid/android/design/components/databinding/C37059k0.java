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

/* renamed from: com.carrefour.fid.android.design.components.databinding.k0 */
public final class C37059k0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92705a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92706b;

    public C37059k0(@C0359n0 View view, @C0359n0 TextView textView) {
        this.f92705a = view;
        this.f92706b = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37059k0 m152011a(@C0359n0 View view) {
        int i = C36896b.C36906j.title;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            return new C37059k0(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37059k0 m152012b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_product_card_list_item_title, viewGroup);
            return m152011a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92705a;
    }
}
