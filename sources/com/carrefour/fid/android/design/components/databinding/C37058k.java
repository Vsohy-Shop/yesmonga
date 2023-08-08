package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.k */
public final class C37058k implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92702a;
    @C0359n0

    /* renamed from: b */
    public final CheckedTextView f92703b;
    @C0359n0

    /* renamed from: c */
    public final CheckedTextView f92704c;

    public C37058k(@C0359n0 View view, @C0359n0 CheckedTextView checkedTextView, @C0359n0 CheckedTextView checkedTextView2) {
        this.f92702a = view;
        this.f92703b = checkedTextView;
        this.f92704c = checkedTextView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37058k m152009a(@C0359n0 View view) {
        int i = C36896b.C36906j.switch_first_option;
        CheckedTextView checkedTextView = (CheckedTextView) C20753c.m96463a(view, i);
        if (checkedTextView != null) {
            i = C36896b.C36906j.switch_second_option;
            CheckedTextView checkedTextView2 = (CheckedTextView) C20753c.m96463a(view, i);
            if (checkedTextView2 != null) {
                return new C37058k(view, checkedTextView, checkedTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37058k m152010b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_delivery_switch, viewGroup);
            return m152009a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92702a;
    }
}
