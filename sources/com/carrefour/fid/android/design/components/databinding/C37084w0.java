package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDateComponent;

/* renamed from: com.carrefour.fid.android.design.components.databinding.w0 */
public final class C37084w0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ServiceSlotDateComponent f92839a;
    @C0359n0

    /* renamed from: b */
    public final ServiceSlotDateComponent f92840b;

    public C37084w0(@C0359n0 ServiceSlotDateComponent serviceSlotDateComponent, @C0359n0 ServiceSlotDateComponent serviceSlotDateComponent2) {
        this.f92839a = serviceSlotDateComponent;
        this.f92840b = serviceSlotDateComponent2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37084w0 m152075a(@C0359n0 View view) {
        if (view != null) {
            ServiceSlotDateComponent serviceSlotDateComponent = (ServiceSlotDateComponent) view;
            return new C37084w0(serviceSlotDateComponent, serviceSlotDateComponent);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37084w0 m152076c(@C0359n0 LayoutInflater layoutInflater) {
        return m152077d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37084w0 m152077d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_service_slot_date_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152075a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ServiceSlotDateComponent getRoot() {
        return this.f92839a;
    }
}
