package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.v0 */
public final class C37082v0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92835a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f92836b;

    public C37082v0(@C0359n0 View view, @C0359n0 RecyclerView recyclerView) {
        this.f92835a = view;
        this.f92836b = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37082v0 m152071a(@C0359n0 View view) {
        int i = C36896b.C36906j.slot_date_list;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
        if (recyclerView != null) {
            return new C37082v0(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37082v0 m152072b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_service_slot_date_list, viewGroup);
            return m152071a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92835a;
    }
}
