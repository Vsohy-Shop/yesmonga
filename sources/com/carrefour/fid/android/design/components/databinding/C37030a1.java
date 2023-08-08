package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotComponent;

/* renamed from: com.carrefour.fid.android.design.components.databinding.a1 */
public final class C37030a1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ServiceSlotComponent f92561a;
    @C0359n0

    /* renamed from: b */
    public final ServiceSlotComponent f92562b;

    public C37030a1(@C0359n0 ServiceSlotComponent serviceSlotComponent, @C0359n0 ServiceSlotComponent serviceSlotComponent2) {
        this.f92561a = serviceSlotComponent;
        this.f92562b = serviceSlotComponent2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37030a1 m151931a(@C0359n0 View view) {
        if (view != null) {
            ServiceSlotComponent serviceSlotComponent = (ServiceSlotComponent) view;
            return new C37030a1(serviceSlotComponent, serviceSlotComponent);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37030a1 m151932c(@C0359n0 LayoutInflater layoutInflater) {
        return m151933d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37030a1 m151933d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_component_service_time_slot_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151931a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ServiceSlotComponent getRoot() {
        return this.f92561a;
    }
}
