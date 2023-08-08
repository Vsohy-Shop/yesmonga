package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.a0 */
public final class C36639a0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90537a;
    @C0359n0

    /* renamed from: b */
    public final RecyclerView f90538b;
    @C0359n0

    /* renamed from: c */
    public final ShimmerFrameLayout f90539c;
    @C0359n0

    /* renamed from: d */
    public final ViewStub f90540d;
    @C0359n0

    /* renamed from: e */
    public final ViewStub f90541e;

    public C36639a0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2) {
        this.f90537a = constraintLayout;
        this.f90538b = recyclerView;
        this.f90539c = shimmerFrameLayout;
        this.f90540d = viewStub;
        this.f90541e = viewStub2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36639a0 m150285a(@C0359n0 View view) {
        int i = R.id.list_account_list_default;
        RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_account_list_default);
        if (recyclerView != null) {
            i = R.id.shimmer_account_list_default;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_account_list_default);
            if (shimmerFrameLayout != null) {
                i = R.id.stub_account_list_empty;
                ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_account_list_empty);
                if (viewStub != null) {
                    i = R.id.stub_account_list_error;
                    ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_account_list_error);
                    if (viewStub2 != null) {
                        return new C36639a0((ConstraintLayout) view, recyclerView, shimmerFrameLayout, viewStub, viewStub2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36639a0 m150286c(@C0359n0 LayoutInflater layoutInflater) {
        return m150287d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36639a0 m150287d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_list_default, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150285a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90537a;
    }
}
