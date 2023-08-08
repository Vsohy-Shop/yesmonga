package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.i0 */
public final class C37053i0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92686a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f92687b;

    public C37053i0(@C0359n0 View view, @C0359n0 MaterialButton materialButton) {
        this.f92686a = view;
        this.f92687b = materialButton;
    }

    @C0359n0
    /* renamed from: a */
    public static C37053i0 m151993a(@C0359n0 View view) {
        int i = C36896b.C36906j.button;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
        if (materialButton != null) {
            return new C37053i0(view, materialButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37053i0 m151994b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_product_card_list_item_button, viewGroup);
            return m151993a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92686a;
    }
}
