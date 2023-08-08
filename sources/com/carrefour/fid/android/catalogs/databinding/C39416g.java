package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.g */
public final class C39416g implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100817a;
    @C0359n0

    /* renamed from: b */
    public final TabLayout f100818b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f100819c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f100820d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f100821e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f100822f;

    public C39416g(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TabLayout tabLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout) {
        this.f100817a = constraintLayout;
        this.f100818b = tabLayout;
        this.f100819c = composeView;
        this.f100820d = linearLayout;
        this.f100821e = recyclerView;
        this.f100822f = shimmerFrameLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C39416g m161553a(@C0359n0 View view) {
        int i = C39364b.C39374j.all_catalogs_tagline;
        TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, i);
        if (tabLayout != null) {
            i = C39364b.C39374j.catalog_builder_header;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
            if (composeView != null) {
                i = C39364b.C39374j.catalog_builder_header_layout;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
                if (linearLayout != null) {
                    i = C39364b.C39374j.catalogs_list;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
                    if (recyclerView != null) {
                        i = C39364b.C39374j.catalogs_shimmer;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, i);
                        if (shimmerFrameLayout != null) {
                            return new C39416g((ConstraintLayout) view, tabLayout, composeView, linearLayout, recyclerView, shimmerFrameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C39416g m161554c(@C0359n0 LayoutInflater layoutInflater) {
        return m161555d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39416g m161555d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.fragment_catalog_builder, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161553a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100817a;
    }
}
