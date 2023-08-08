package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.carrefour.fid.android.databinding.c3 */
public final class C36662c3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90637a;
    @C0359n0

    /* renamed from: b */
    public final AppBarLayout f90638b;
    @C0359n0

    /* renamed from: c */
    public final Button f90639c;
    @C0363p0

    /* renamed from: d */
    public final C36656b7 f90640d;
    @C0359n0

    /* renamed from: e */
    public final ConstraintLayout f90641e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f90642f;
    @C0359n0

    /* renamed from: g */
    public final C36666c7 f90643g;
    @C0359n0

    /* renamed from: h */
    public final ProgressBar f90644h;
    @C0359n0

    /* renamed from: i */
    public final RecyclerView f90645i;

    public C36662c3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 Button button, @C0363p0 C36656b7 b7Var, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 C36666c7 c7Var, @C0359n0 ProgressBar progressBar, @C0359n0 RecyclerView recyclerView) {
        this.f90637a = constraintLayout;
        this.f90638b = appBarLayout;
        this.f90639c = button;
        this.f90640d = b7Var;
        this.f90641e = constraintLayout2;
        this.f90642f = shimmerFrameLayout;
        this.f90643g = c7Var;
        this.f90644h = progressBar;
        this.f90645i = recyclerView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36662c3 m150377a(@C0359n0 View view) {
        C36656b7 b7Var;
        int i = R.id.appBarLayout_plp;
        AppBarLayout appBarLayout = (AppBarLayout) C20753c.m96463a(view, R.id.appBarLayout_plp);
        if (appBarLayout != null) {
            i = R.id.button_fragment_attach_card_submit;
            Button button = (Button) C20753c.m96463a(view, R.id.button_fragment_attach_card_submit);
            if (button != null) {
                View a = C20753c.m96463a(view, R.id.prime_cell_footer);
                if (a != null) {
                    b7Var = C36656b7.m150353a(a);
                } else {
                    b7Var = null;
                }
                C36656b7 b7Var2 = b7Var;
                i = R.id.primeFidLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view, R.id.primeFidLayout);
                if (constraintLayout != null) {
                    i = R.id.primeFidShimmer;
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.primeFidShimmer);
                    if (shimmerFrameLayout != null) {
                        i = R.id.primeLayoutHeader;
                        View a2 = C20753c.m96463a(view, R.id.primeLayoutHeader);
                        if (a2 != null) {
                            C36666c7 a3 = C36666c7.m150393a(a2);
                            i = R.id.progress_bar;
                            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_bar);
                            if (progressBar != null) {
                                i = R.id.recyclerPrimeFid;
                                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.recyclerPrimeFid);
                                if (recyclerView != null) {
                                    return new C36662c3((ConstraintLayout) view, appBarLayout, button, b7Var2, constraintLayout, shimmerFrameLayout, a3, progressBar, recyclerView);
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
    public static C36662c3 m150378c(@C0359n0 LayoutInflater layoutInflater) {
        return m150379d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36662c3 m150379d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_primes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150377a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90637a;
    }
}
