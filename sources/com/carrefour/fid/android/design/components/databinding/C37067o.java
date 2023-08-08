package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.CheckboxComponent;

/* renamed from: com.carrefour.fid.android.design.components.databinding.o */
public final class C37067o implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92756a;
    @C0359n0

    /* renamed from: b */
    public final CheckboxComponent f92757b;

    public C37067o(@C0359n0 View view, @C0359n0 CheckboxComponent checkboxComponent) {
        this.f92756a = view;
        this.f92757b = checkboxComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C37067o m152031a(@C0359n0 View view) {
        int i = C36896b.C36906j.item_checkbox;
        CheckboxComponent checkboxComponent = (CheckboxComponent) C20753c.m96463a(view, i);
        if (checkboxComponent != null) {
            return new C37067o(view, checkboxComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37067o m152032b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_filter_item_checkbox, viewGroup);
            return m152031a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92756a;
    }
}
