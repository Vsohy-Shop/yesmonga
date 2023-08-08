package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.e1 */
public final class C37042e1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92619a;
    @C0359n0

    /* renamed from: b */
    public final SwitchCompat f92620b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayoutCompat f92621c;
    @C0359n0

    /* renamed from: d */
    public final AppCompatTextView f92622d;

    public C37042e1(@C0359n0 View view, @C0359n0 SwitchCompat switchCompat, @C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 AppCompatTextView appCompatTextView) {
        this.f92619a = view;
        this.f92620b = switchCompat;
        this.f92621c = linearLayoutCompat;
        this.f92622d = appCompatTextView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37042e1 m151961a(@C0359n0 View view) {
        int i = C36896b.C36906j.item_switch;
        SwitchCompat switchCompat = (SwitchCompat) C20753c.m96463a(view, i);
        if (switchCompat != null) {
            i = C36896b.C36906j.layout_component_switch;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C20753c.m96463a(view, i);
            if (linearLayoutCompat != null) {
                i = C36896b.C36906j.switch_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, i);
                if (appCompatTextView != null) {
                    return new C37042e1(view, switchCompat, linearLayoutCompat, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37042e1 m151962b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_switch, viewGroup);
            return m151961a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92619a;
    }
}
