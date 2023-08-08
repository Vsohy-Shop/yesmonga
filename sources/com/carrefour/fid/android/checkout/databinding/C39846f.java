package com.carrefour.fid.android.checkout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.design.components.widgets.ServiceTimeSlotListComponent;

/* renamed from: com.carrefour.fid.android.checkout.databinding.f */
public final class C39846f implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f101640a;
    @C0359n0

    /* renamed from: b */
    public final ServiceTimeSlotListComponent f101641b;

    public C39846f(@C0359n0 FrameLayout frameLayout, @C0359n0 ServiceTimeSlotListComponent serviceTimeSlotListComponent) {
        this.f101640a = frameLayout;
        this.f101641b = serviceTimeSlotListComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C39846f m162449a(@C0359n0 View view) {
        int i = C39805b.C39815j.holder_service_slot_list;
        ServiceTimeSlotListComponent serviceTimeSlotListComponent = (ServiceTimeSlotListComponent) C20753c.m96463a(view, i);
        if (serviceTimeSlotListComponent != null) {
            return new C39846f((FrameLayout) view, serviceTimeSlotListComponent);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39846f m162450c(@C0359n0 LayoutInflater layoutInflater) {
        return m162451d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39846f m162451d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39805b.C39818m.holder_service_slot_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m162449a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f101640a;
    }
}
