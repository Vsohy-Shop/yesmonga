package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.q0 */
public final class C36799q0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91516a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91517b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91518c;
    @C0359n0

    /* renamed from: d */
    public final FragmentContainerView f91519d;

    public C36799q0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 FragmentContainerView fragmentContainerView) {
        this.f91516a = constraintLayout;
        this.f91517b = composeView;
        this.f91518c = linearLayout;
        this.f91519d = fragmentContainerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36799q0 m150921a(@C0359n0 View view) {
        int i = R.id.barcode_scan_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.barcode_scan_header);
        if (composeView != null) {
            i = R.id.barcode_scan_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.barcode_scan_header_layout);
            if (linearLayout != null) {
                i = R.id.barcode_view;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view, R.id.barcode_view);
                if (fragmentContainerView != null) {
                    return new C36799q0((ConstraintLayout) view, composeView, linearLayout, fragmentContainerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36799q0 m150922c(@C0359n0 LayoutInflater layoutInflater) {
        return m150923d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36799q0 m150923d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bar_code_scanner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150921a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91516a;
    }
}
