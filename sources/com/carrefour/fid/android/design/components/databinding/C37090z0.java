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

/* renamed from: com.carrefour.fid.android.design.components.databinding.z0 */
public final class C37090z0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92863a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f92864b;

    public C37090z0(@C0359n0 View view, @C0359n0 RecyclerView recyclerView) {
        this.f92863a = view;
        this.f92864b = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37090z0 m152089a(@C0359n0 View view) {
        int i = C36896b.C36906j.slot_list;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
        if (recyclerView != null) {
            return new C37090z0(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37090z0 m152090b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_service_time_slot_list, viewGroup);
            return m152089a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92863a;
    }
}
