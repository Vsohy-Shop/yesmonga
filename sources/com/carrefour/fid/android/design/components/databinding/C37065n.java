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

/* renamed from: com.carrefour.fid.android.design.components.databinding.n */
public final class C37065n implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92743a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f92744b;

    public C37065n(@C0359n0 View view, @C0359n0 MaterialButton materialButton) {
        this.f92743a = view;
        this.f92744b = materialButton;
    }

    @C0359n0
    /* renamed from: a */
    public static C37065n m152027a(@C0359n0 View view) {
        int i = C36896b.C36906j.item_button;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
        if (materialButton != null) {
            return new C37065n(view, materialButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37065n m152028b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_filter_item_button, viewGroup);
            return m152027a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92743a;
    }
}
