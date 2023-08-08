package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.CheckboxComponent;

/* renamed from: com.carrefour.fid.android.design.components.databinding.x */
public final class C37085x implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92841a;
    @C0359n0

    /* renamed from: b */
    public final CheckboxComponent f92842b;
    @C0359n0

    /* renamed from: c */
    public final AppCompatImageView f92843c;

    public C37085x(@C0359n0 View view, @C0359n0 CheckboxComponent checkboxComponent, @C0359n0 AppCompatImageView appCompatImageView) {
        this.f92841a = view;
        this.f92842b = checkboxComponent;
        this.f92843c = appCompatImageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37085x m152079a(@C0359n0 View view) {
        int i = C36896b.C36906j.item_checkbox;
        CheckboxComponent checkboxComponent = (CheckboxComponent) C20753c.m96463a(view, i);
        if (checkboxComponent != null) {
            i = C36896b.C36906j.item_delete;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, i);
            if (appCompatImageView != null) {
                return new C37085x(view, checkboxComponent, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37085x m152080b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_list_item_memo_checkbox, viewGroup);
            return m152079a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92841a;
    }
}
