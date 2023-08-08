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

/* renamed from: com.carrefour.fid.android.design.components.databinding.w */
public final class C37083w implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92837a;
    @C0359n0

    /* renamed from: b */
    public final TextView f92838b;

    public C37083w(@C0359n0 View view, @C0359n0 TextView textView) {
        this.f92837a = view;
        this.f92838b = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37083w m152073a(@C0359n0 View view) {
        int i = C36896b.C36906j.item_link_text;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            return new C37083w(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37083w m152074b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_list_item_link, viewGroup);
            return m152073a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92837a;
    }
}
