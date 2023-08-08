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

/* renamed from: com.carrefour.fid.android.design.components.databinding.x0 */
public final class C37086x0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92844a;
    @C0359n0

    /* renamed from: b */
    public final CheckedTextView f92845b;
    @C0359n0

    /* renamed from: c */
    public final CheckedTextView f92846c;
    @C0359n0

    /* renamed from: d */
    public final CheckedTextView f92847d;

    public C37086x0(@C0359n0 View view, @C0359n0 CheckedTextView checkedTextView, @C0359n0 CheckedTextView checkedTextView2, @C0359n0 CheckedTextView checkedTextView3) {
        this.f92844a = view;
        this.f92845b = checkedTextView;
        this.f92846c = checkedTextView2;
        this.f92847d = checkedTextView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C37086x0 m152081a(@C0359n0 View view) {
        int i = C36896b.C36906j.switch_first_option;
        CheckedTextView checkedTextView = (CheckedTextView) C20753c.m96463a(view, i);
        if (checkedTextView != null) {
            i = C36896b.C36906j.switch_second_option;
            CheckedTextView checkedTextView2 = (CheckedTextView) C20753c.m96463a(view, i);
            if (checkedTextView2 != null) {
                i = C36896b.C36906j.switch_third_option;
                CheckedTextView checkedTextView3 = (CheckedTextView) C20753c.m96463a(view, i);
                if (checkedTextView3 != null) {
                    return new C37086x0(view, checkedTextView, checkedTextView2, checkedTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37086x0 m152082b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_service_slot_day_time, viewGroup);
            return m152081a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92844a;
    }
}
