package com.carrefour.fid.android.service.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.service.C28330R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;

public final class FragmentDeliveryServiceSelectionBinding implements C20752b {
    @C0359n0
    public final MaterialButton changeAddressButton;
    @C0359n0
    public final ComposeView deliveryServiceSelectionHeader;
    @C0359n0
    public final LinearLayout deliveryServiceSelectionHeaderLayout;
    @C0359n0
    public final ShimmerFrameLayout loadingLayout;
    @C0359n0
    public final MaterialButton moveToDriveButton;
    @C0359n0
    private final ConstraintLayout rootView;
    @C0359n0
    public final View service1;
    @C0359n0
    public final View service2;
    @C0359n0
    public final RecyclerView serviceInfoList;
    @C0359n0
    public final ViewStub stubDeliveryServiceSelectionError;

    private FragmentDeliveryServiceSelectionBinding(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 MaterialButton materialButton, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 MaterialButton materialButton2, @C0359n0 View view, @C0359n0 View view2, @C0359n0 RecyclerView recyclerView, @C0359n0 ViewStub viewStub) {
        this.rootView = constraintLayout;
        this.changeAddressButton = materialButton;
        this.deliveryServiceSelectionHeader = composeView;
        this.deliveryServiceSelectionHeaderLayout = linearLayout;
        this.loadingLayout = shimmerFrameLayout;
        this.moveToDriveButton = materialButton2;
        this.service1 = view;
        this.service2 = view2;
        this.serviceInfoList = recyclerView;
        this.stubDeliveryServiceSelectionError = viewStub;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = com.carrefour.fid.android.service.C28330R.C28334id.service_1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r0 = com.carrefour.fid.android.service.C28330R.C28334id.service_2;
     */
    @androidx.annotation.C0359n0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.service.databinding.FragmentDeliveryServiceSelectionBinding bind(@androidx.annotation.C0359n0 android.view.View r13) {
        /*
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.change_address_button
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.delivery_service_selection_header
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r5 = r1
            androidx.compose.ui.platform.ComposeView r5 = (androidx.compose.p004ui.platform.ComposeView) r5
            if (r5 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.delivery_service_selection_header_layout
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.loading_layout
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r7 = r1
            com.facebook.shimmer.ShimmerFrameLayout r7 = (com.facebook.shimmer.ShimmerFrameLayout) r7
            if (r7 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.move_to_drive_button
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r8 = r1
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            if (r8 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.service_1
            android.view.View r9 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            if (r9 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.service_2
            android.view.View r10 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            if (r10 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.service_info_list
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r11 = r1
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            if (r11 == 0) goto L_0x0067
            int r0 = com.carrefour.fid.android.service.C28330R.C28334id.stub_delivery_service_selection_error
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r13, r0)
            r12 = r1
            android.view.ViewStub r12 = (android.view.ViewStub) r12
            if (r12 == 0) goto L_0x0067
            com.carrefour.fid.android.service.databinding.FragmentDeliveryServiceSelectionBinding r0 = new com.carrefour.fid.android.service.databinding.FragmentDeliveryServiceSelectionBinding
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0067:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.databinding.FragmentDeliveryServiceSelectionBinding.bind(android.view.View):com.carrefour.fid.android.service.databinding.FragmentDeliveryServiceSelectionBinding");
    }

    @C0359n0
    public static FragmentDeliveryServiceSelectionBinding inflate(@C0359n0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    public static FragmentDeliveryServiceSelectionBinding inflate(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28330R.C28336layout.fragment_delivery_service_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @C0359n0
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
