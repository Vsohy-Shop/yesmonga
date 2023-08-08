package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.l */
public final class C39421l implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f100860a;
    @C0359n0

    /* renamed from: b */
    public final AppBarLayout f100861b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f100862c;
    @C0359n0

    /* renamed from: d */
    public final TextView f100863d;
    @C0359n0

    /* renamed from: e */
    public final TextView f100864e;
    @C0359n0

    /* renamed from: f */
    public final TextView f100865f;
    @C0359n0

    /* renamed from: g */
    public final TextView f100866g;
    @C0359n0

    /* renamed from: h */
    public final RecyclerView f100867h;
    @C0359n0

    /* renamed from: i */
    public final ShimmerFrameLayout f100868i;
    @C0359n0

    /* renamed from: j */
    public final Group f100869j;
    @C0359n0

    /* renamed from: k */
    public final Group f100870k;
    @C0359n0

    /* renamed from: l */
    public final ImageView f100871l;
    @C0359n0

    /* renamed from: m */
    public final ImageView f100872m;
    @C0359n0

    /* renamed from: n */
    public final Toolbar f100873n;

    public C39421l(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 ComposeView composeView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 RecyclerView recyclerView, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 Group group, @C0359n0 Group group2, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 Toolbar toolbar) {
        this.f100860a = coordinatorLayout;
        this.f100861b = appBarLayout;
        this.f100862c = composeView;
        this.f100863d = textView;
        this.f100864e = textView2;
        this.f100865f = textView3;
        this.f100866g = textView4;
        this.f100867h = recyclerView;
        this.f100868i = shimmerFrameLayout;
        this.f100869j = group;
        this.f100870k = group2;
        this.f100871l = imageView;
        this.f100872m = imageView2;
        this.f100873n = toolbar;
    }

    @C0359n0
    /* renamed from: a */
    public static C39421l m161573a(@C0359n0 View view) {
        View view2 = view;
        int i = C39364b.C39374j.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) C20753c.m96463a(view2, i);
        if (appBarLayout != null) {
            i = C39364b.C39374j.catalog_details_search_bar;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view2, i);
            if (composeView != null) {
                i = C39364b.C39374j.catalog_no_result_description;
                TextView textView = (TextView) C20753c.m96463a(view2, i);
                if (textView != null) {
                    i = C39364b.C39374j.catalog_no_result_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view2, i);
                    if (textView2 != null) {
                        i = C39364b.C39374j.catalog_no_search_result_description;
                        TextView textView3 = (TextView) C20753c.m96463a(view2, i);
                        if (textView3 != null) {
                            i = C39364b.C39374j.catalog_no_search_result_title;
                            TextView textView4 = (TextView) C20753c.m96463a(view2, i);
                            if (textView4 != null) {
                                i = C39364b.C39374j.catalogProductsRecyclerView;
                                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view2, i);
                                if (recyclerView != null) {
                                    i = C39364b.C39374j.catalogShimmerViewContainer;
                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view2, i);
                                    if (shimmerFrameLayout != null) {
                                        i = C39364b.C39374j.empty_group;
                                        Group group = (Group) C20753c.m96463a(view2, i);
                                        if (group != null) {
                                            i = C39364b.C39374j.not_visible_group;
                                            Group group2 = (Group) C20753c.m96463a(view2, i);
                                            if (group2 != null) {
                                                i = C39364b.C39374j.productImage;
                                                ImageView imageView = (ImageView) C20753c.m96463a(view2, i);
                                                if (imageView != null) {
                                                    i = C39364b.C39374j.searchImage;
                                                    ImageView imageView2 = (ImageView) C20753c.m96463a(view2, i);
                                                    if (imageView2 != null) {
                                                        i = C39364b.C39374j.toolbar;
                                                        Toolbar toolbar = (Toolbar) C20753c.m96463a(view2, i);
                                                        if (toolbar != null) {
                                                            return new C39421l((CoordinatorLayout) view2, appBarLayout, composeView, textView, textView2, textView3, textView4, recyclerView, shimmerFrameLayout, group, group2, imageView, imageView2, toolbar);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static C39421l m161574c(@C0359n0 LayoutInflater layoutInflater) {
        return m161575d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39421l m161575d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.fragment_catalog_product_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161573a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f100860a;
    }
}
