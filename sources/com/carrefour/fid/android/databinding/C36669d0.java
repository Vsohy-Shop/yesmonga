package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.d0 */
public final class C36669d0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90701a;
    @C0359n0

    /* renamed from: b */
    public final Guideline f90702b;
    @C0359n0

    /* renamed from: c */
    public final Button f90703c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f90704d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f90705e;
    @C0359n0

    /* renamed from: f */
    public final ViewStub f90706f;
    @C0359n0

    /* renamed from: g */
    public final ViewStub f90707g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90708h;

    public C36669d0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Guideline guideline, @C0359n0 Button button, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 ViewStub viewStub, @C0359n0 ViewStub viewStub2, @C0359n0 TextView textView) {
        this.f90701a = constraintLayout;
        this.f90702b = guideline;
        this.f90703c = button;
        this.f90704d = recyclerView;
        this.f90705e = shimmerFrameLayout;
        this.f90706f = viewStub;
        this.f90707g = viewStub2;
        this.f90708h = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36669d0 m150405a(@C0359n0 View view) {
        int i = R.id.header_guideline;
        Guideline guideline = (Guideline) C20753c.m96463a(view, R.id.header_guideline);
        if (guideline != null) {
            i = R.id.link_to_all_order;
            Button button = (Button) C20753c.m96463a(view, R.id.link_to_all_order);
            if (button != null) {
                i = R.id.list_account_list_order;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.list_account_list_order);
                if (recyclerView != null) {
                    i = R.id.shimmer_account_list_order;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.shimmer_account_list_order);
                    if (shimmerFrameLayout != null) {
                        i = R.id.stub_account_list_empty;
                        ViewStub viewStub = (ViewStub) C20753c.m96463a(view, R.id.stub_account_list_empty);
                        if (viewStub != null) {
                            i = R.id.stub_account_list_error;
                            ViewStub viewStub2 = (ViewStub) C20753c.m96463a(view, R.id.stub_account_list_error);
                            if (viewStub2 != null) {
                                i = R.id.text_list_account_list_order;
                                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_list_account_list_order);
                                if (textView != null) {
                                    return new C36669d0((ConstraintLayout) view, guideline, button, recyclerView, shimmerFrameLayout, viewStub, viewStub2, textView);
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
    public static C36669d0 m150406c(@C0359n0 LayoutInflater layoutInflater) {
        return m150407d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36669d0 m150407d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_list_order, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150405a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90701a;
    }
}
