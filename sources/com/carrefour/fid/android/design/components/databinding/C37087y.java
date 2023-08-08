package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.y */
public final class C37087y implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92848a;
    @C0359n0

    /* renamed from: b */
    public final AppCompatTextView f92849b;

    public C37087y(@C0359n0 View view, @C0359n0 AppCompatTextView appCompatTextView) {
        this.f92848a = view;
        this.f92849b = appCompatTextView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37087y m152083a(@C0359n0 View view) {
        int i = C36896b.C36906j.item_message_description;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, i);
        if (appCompatTextView != null) {
            return new C37087y(view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37087y m152084b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_list_item_message, viewGroup);
            return m152083a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92848a;
    }
}
