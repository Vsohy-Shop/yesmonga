package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.u1 */
public final class C36840u1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91734a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91735b;

    public C36840u1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView) {
        this.f91734a = constraintLayout;
        this.f91735b = composeView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36840u1 m151081a(@C0359n0 View view) {
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.coupon_details_compose_view);
        if (composeView != null) {
            return new C36840u1((ConstraintLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.coupon_details_compose_view)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36840u1 m151082c(@C0359n0 LayoutInflater layoutInflater) {
        return m151083d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36840u1 m151083d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_coupon_details_overlay_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151081a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91734a;
    }
}
