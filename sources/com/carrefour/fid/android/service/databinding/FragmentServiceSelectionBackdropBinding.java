package com.carrefour.fid.android.service.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.widgets.StoreSetComponent;
import com.carrefour.fid.android.service.C28330R;

public final class FragmentServiceSelectionBackdropBinding implements C20752b {
    @C0359n0
    private final ConstraintLayout rootView;
    @C0359n0
    public final StoreSetComponent serviceSelectionDeliveryButton;
    @C0359n0
    public final StoreSetComponent serviceSelectionDeliveryH1h3Button;
    @C0359n0
    public final StoreSetComponent serviceSelectionDriveButton;
    @C0359n0
    public final TextView serviceSelectionHeaderTitle;

    private FragmentServiceSelectionBackdropBinding(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 StoreSetComponent storeSetComponent, @C0359n0 StoreSetComponent storeSetComponent2, @C0359n0 StoreSetComponent storeSetComponent3, @C0359n0 TextView textView) {
        this.rootView = constraintLayout;
        this.serviceSelectionDeliveryButton = storeSetComponent;
        this.serviceSelectionDeliveryH1h3Button = storeSetComponent2;
        this.serviceSelectionDriveButton = storeSetComponent3;
        this.serviceSelectionHeaderTitle = textView;
    }

    @C0359n0
    public static FragmentServiceSelectionBackdropBinding bind(@C0359n0 View view) {
        int i = C28330R.C28334id.service_selection_delivery_button;
        StoreSetComponent storeSetComponent = (StoreSetComponent) C20753c.m96463a(view, i);
        if (storeSetComponent != null) {
            i = C28330R.C28334id.service_selection_delivery_h1h3_button;
            StoreSetComponent storeSetComponent2 = (StoreSetComponent) C20753c.m96463a(view, i);
            if (storeSetComponent2 != null) {
                i = C28330R.C28334id.service_selection_drive_button;
                StoreSetComponent storeSetComponent3 = (StoreSetComponent) C20753c.m96463a(view, i);
                if (storeSetComponent3 != null) {
                    i = C28330R.C28334id.service_selection_header_title;
                    TextView textView = (TextView) C20753c.m96463a(view, i);
                    if (textView != null) {
                        return new FragmentServiceSelectionBackdropBinding((ConstraintLayout) view, storeSetComponent, storeSetComponent2, storeSetComponent3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    public static FragmentServiceSelectionBackdropBinding inflate(@C0359n0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    public static FragmentServiceSelectionBackdropBinding inflate(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28330R.C28336layout.fragment_service_selection_backdrop, viewGroup, false);
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
