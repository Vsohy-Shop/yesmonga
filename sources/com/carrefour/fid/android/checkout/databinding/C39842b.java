package com.carrefour.fid.android.checkout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.checkout.C39805b;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDateListComponent;
import com.carrefour.fid.android.design.components.widgets.ServiceSlotDayTimeComponent;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.checkout.databinding.b */
public final class C39842b implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f101613a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f101614b;
    @C0359n0

    /* renamed from: c */
    public final ShimmerFrameLayout f101615c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f101616d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f101617e;
    @C0359n0

    /* renamed from: f */
    public final ServiceSlotDateListComponent f101618f;
    @C0359n0

    /* renamed from: g */
    public final ServiceSlotDayTimeComponent f101619g;
    @C0359n0

    /* renamed from: h */
    public final Group f101620h;
    @C0359n0

    /* renamed from: i */
    public final ComposeView f101621i;
    @C0359n0

    /* renamed from: j */
    public final LinearLayout f101622j;
    @C0359n0

    /* renamed from: k */
    public final ViewStub f101623k;
    @C0359n0

    /* renamed from: l */
    public final FrameLayout f101624l;

    public C39842b(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ComposeView composeView, @C0359n0 RecyclerView recyclerView, @C0359n0 ServiceSlotDateListComponent serviceSlotDateListComponent, @C0359n0 ServiceSlotDayTimeComponent serviceSlotDayTimeComponent, @C0359n0 Group group, @C0359n0 ComposeView composeView2, @C0359n0 LinearLayout linearLayout, @C0359n0 ViewStub viewStub, @C0359n0 FrameLayout frameLayout) {
        this.f101613a = constraintLayout;
        this.f101614b = materialButton;
        this.f101615c = shimmerFrameLayout;
        this.f101616d = composeView;
        this.f101617e = recyclerView;
        this.f101618f = serviceSlotDateListComponent;
        this.f101619g = serviceSlotDayTimeComponent;
        this.f101620h = group;
        this.f101621i = composeView2;
        this.f101622j = linearLayout;
        this.f101623k = viewStub;
        this.f101624l = frameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C39842b m162433a(@C0359n0 View view) {
        int i = C39805b.C39815j.button_book_slot;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
        if (materialButton != null) {
            i = C39805b.C39815j.loading_layout;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, i);
            if (shimmerFrameLayout != null) {
                i = C39805b.C39815j.omr_banner;
                ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
                if (composeView != null) {
                    i = C39805b.C39815j.service_slot_content_list;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
                    if (recyclerView != null) {
                        i = C39805b.C39815j.service_slot_date_list;
                        ServiceSlotDateListComponent serviceSlotDateListComponent = (ServiceSlotDateListComponent) C20753c.m96463a(view, i);
                        if (serviceSlotDateListComponent != null) {
                            i = C39805b.C39815j.service_slot_day_time;
                            ServiceSlotDayTimeComponent serviceSlotDayTimeComponent = (ServiceSlotDayTimeComponent) C20753c.m96463a(view, i);
                            if (serviceSlotDayTimeComponent != null) {
                                i = C39805b.C39815j.service_slot_group;
                                Group group = (Group) C20753c.m96463a(view, i);
                                if (group != null) {
                                    i = C39805b.C39815j.service_slot_header;
                                    ComposeView composeView2 = (ComposeView) C20753c.m96463a(view, i);
                                    if (composeView2 != null) {
                                        i = C39805b.C39815j.service_slot_header_layout;
                                        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
                                        if (linearLayout != null) {
                                            i = C39805b.C39815j.stub_service_slot_error;
                                            ViewStub viewStub = (ViewStub) C20753c.m96463a(view, i);
                                            if (viewStub != null) {
                                                i = C39805b.C39815j.view_bottom_slot_button;
                                                FrameLayout frameLayout = (FrameLayout) C20753c.m96463a(view, i);
                                                if (frameLayout != null) {
                                                    return new C39842b((ConstraintLayout) view, materialButton, shimmerFrameLayout, composeView, recyclerView, serviceSlotDateListComponent, serviceSlotDayTimeComponent, group, composeView2, linearLayout, viewStub, frameLayout);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39842b m162434c(@C0359n0 LayoutInflater layoutInflater) {
        return m162435d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39842b m162435d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39805b.C39818m.fragment_service_slot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m162433a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f101613a;
    }
}
