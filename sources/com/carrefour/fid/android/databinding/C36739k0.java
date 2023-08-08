package com.carrefour.fid.android.databinding;

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
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.k0 */
public final class C36739k0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91107a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91108b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91109c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f91110d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f91111e;
    @C0359n0

    /* renamed from: f */
    public final ViewStub f91112f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f91113g;

    public C36739k0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f91107a = constraintLayout;
        this.f91108b = composeView;
        this.f91109c = linearLayout;
        this.f91110d = recyclerView;
        this.f91111e = shimmerFrameLayout;
        this.f91112f = viewStub;
        this.f91113g = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36739k0 m150683a(@C0359n0 View view) {
        int i = R.id.additional_order_department_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.additional_order_department_header);
        if (composeView != null) {
            i = R.id.additional_order_department_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.additional_order_department_header_layout);
            if (linearLayout != null) {
                i = R.id.list_additional_orders_department_preview;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_additional_orders_department_preview);
                if (recyclerView != null) {
                    i = R.id.shimmer_additional_order_department_preview;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_additional_order_department_preview);
                    if (shimmerFrameLayout != null) {
                        i = R.id.stub_additional_orders_department_empty;
                        ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_additional_orders_department_empty);
                        if (viewStub != null) {
                            i = R.id.stub_additional_orders_department_error;
                            ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_additional_orders_department_error);
                            if (viewStub2 != null) {
                                return new C36739k0((ConstraintLayout) view, composeView, linearLayout, recyclerView, shimmerFrameLayout, viewStub, viewStub2);
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
    public static C36739k0 m150684c(@C0359n0 LayoutInflater layoutInflater) {
        return m150685d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36739k0 m150685d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order_department, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150683a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91107a;
    }
}
