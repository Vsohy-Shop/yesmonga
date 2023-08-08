package com.carrefour.fid.android.service.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.service.C28330R;
import com.carrefour.fid.android.service.presentation.p044ui.drive.map.TapInterceptor;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class FragmentDriveMapBinding implements C20752b {
    @C0359n0
    public final FloatingActionButton centerOnLocationFab;
    @C0359n0
    public final ComposeView driveCarousel;
    @C0359n0
    public final ComposeView driveHeader;
    @C0359n0
    public final FragmentContainerView map;
    @C0359n0
    private final ConstraintLayout rootView;
    @C0359n0
    public final ComposeView searchDrive;
    @C0359n0
    public final TapInterceptor tapInterceptor;

    private FragmentDriveMapBinding(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 FloatingActionButton floatingActionButton, @C0359n0 ComposeView composeView, @C0359n0 ComposeView composeView2, @C0359n0 FragmentContainerView fragmentContainerView, @C0359n0 ComposeView composeView3, @C0359n0 TapInterceptor tapInterceptor2) {
        this.rootView = constraintLayout;
        this.centerOnLocationFab = floatingActionButton;
        this.driveCarousel = composeView;
        this.driveHeader = composeView2;
        this.map = fragmentContainerView;
        this.searchDrive = composeView3;
        this.tapInterceptor = tapInterceptor2;
    }

    @C0359n0
    public static FragmentDriveMapBinding bind(@C0359n0 View view) {
        int i = C28330R.C28334id.center_on_location_fab;
        FloatingActionButton floatingActionButton = (FloatingActionButton) C20753c.m96463a(view, i);
        if (floatingActionButton != null) {
            i = C28330R.C28334id.drive_carousel;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
            if (composeView != null) {
                i = C28330R.C28334id.drive_header;
                ComposeView composeView2 = (ComposeView) C20753c.m96463a(view, i);
                if (composeView2 != null) {
                    i = C28330R.C28334id.map;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view, i);
                    if (fragmentContainerView != null) {
                        i = C28330R.C28334id.search_drive;
                        ComposeView composeView3 = (ComposeView) C20753c.m96463a(view, i);
                        if (composeView3 != null) {
                            i = C28330R.C28334id.tap_interceptor;
                            TapInterceptor tapInterceptor2 = (TapInterceptor) C20753c.m96463a(view, i);
                            if (tapInterceptor2 != null) {
                                return new FragmentDriveMapBinding((ConstraintLayout) view, floatingActionButton, composeView, composeView2, fragmentContainerView, composeView3, tapInterceptor2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    public static FragmentDriveMapBinding inflate(@C0359n0 LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    public static FragmentDriveMapBinding inflate(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28330R.C28336layout.fragment_drive_map, viewGroup, false);
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
