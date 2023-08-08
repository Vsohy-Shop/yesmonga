package com.carrefour.fid.android.checkout.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
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

/* renamed from: com.carrefour.fid.android.checkout.databinding.c */
public final class C39843c implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f101625a;
    @C0359n0

    /* renamed from: b */
    public final MaterialButton f101626b;
    @C0359n0

    /* renamed from: c */
    public final ShimmerFrameLayout f101627c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f101628d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f101629e;
    @C0359n0

    /* renamed from: f */
    public final ServiceSlotDateListComponent f101630f;
    @C0359n0

    /* renamed from: g */
    public final ServiceSlotDayTimeComponent f101631g;
    @C0359n0

    /* renamed from: h */
    public final Group f101632h;
    @C0359n0

    /* renamed from: i */
    public final ComposeView f101633i;
    @C0359n0

    /* renamed from: j */
    public final LinearLayout f101634j;
    @C0359n0

    /* renamed from: k */
    public final ViewStub f101635k;
    @C0359n0

    /* renamed from: l */
    public final LinearLayout f101636l;

    public C39843c(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ComposeView composeView, @C0359n0 RecyclerView recyclerView, @C0359n0 ServiceSlotDateListComponent serviceSlotDateListComponent, @C0359n0 ServiceSlotDayTimeComponent serviceSlotDayTimeComponent, @C0359n0 Group group, @C0359n0 ComposeView composeView2, @C0359n0 LinearLayout linearLayout, @C0359n0 ViewStub viewStub, @C0359n0 LinearLayout linearLayout2) {
        this.f101625a = constraintLayout;
        this.f101626b = materialButton;
        this.f101627c = shimmerFrameLayout;
        this.f101628d = composeView;
        this.f101629e = recyclerView;
        this.f101630f = serviceSlotDateListComponent;
        this.f101631g = serviceSlotDayTimeComponent;
        this.f101632h = group;
        this.f101633i = composeView2;
        this.f101634j = linearLayout;
        this.f101635k = viewStub;
        this.f101636l = linearLayout2;
    }

    @C0359n0
    /* renamed from: a */
    public static C39843c m162437a(@C0359n0 View view) {
        int i = C39805b.C39815j.button_book_slot;
        MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
        if (materialButton != null) {
            i = C39805b.C39815j.loading_layout;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, i);
            if (shimmerFrameLayout != null) {
                i = C39805b.C39815j.omr_other_slots_banner;
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
                                    i = C39805b.C39815j.service_slot_omr_header;
                                    ComposeView composeView2 = (ComposeView) C20753c.m96463a(view, i);
                                    if (composeView2 != null) {
                                        i = C39805b.C39815j.service_slot_omr_header_layout;
                                        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
                                        if (linearLayout != null) {
                                            i = C39805b.C39815j.stub_service_slot_error;
                                            ViewStub viewStub = (ViewStub) C20753c.m96463a(view, i);
                                            if (viewStub != null) {
                                                i = C39805b.C39815j.view_bottom_slot_button;
                                                LinearLayout linearLayout2 = (LinearLayout) C20753c.m96463a(view, i);
                                                if (linearLayout2 != null) {
                                                    return new C39843c((ConstraintLayout) view, materialButton, shimmerFrameLayout, composeView, recyclerView, serviceSlotDateListComponent, serviceSlotDayTimeComponent, group, composeView2, linearLayout, viewStub, linearLayout2);
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
    public static C39843c m162438c(@C0359n0 LayoutInflater layoutInflater) {
        return m162439d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39843c m162439d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39805b.C39818m.fragment_service_slot_omr, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m162437a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f101625a;
    }
}
