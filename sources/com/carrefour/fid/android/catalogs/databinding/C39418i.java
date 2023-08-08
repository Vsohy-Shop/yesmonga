package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.i */
public final class C39418i implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CoordinatorLayout f100829a;
    @C0359n0

    /* renamed from: b */
    public final AppBarLayout f100830b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f100831c;
    @C0359n0

    /* renamed from: d */
    public final TextView f100832d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f100833e;
    @C0359n0

    /* renamed from: f */
    public final RelativeLayout f100834f;
    @C0359n0

    /* renamed from: g */
    public final ImageButton f100835g;
    @C0359n0

    /* renamed from: h */
    public final ConstraintLayout f100836h;
    @C0359n0

    /* renamed from: i */
    public final ImageView f100837i;
    @C0359n0

    /* renamed from: j */
    public final ViewStub f100838j;
    @C0359n0

    /* renamed from: k */
    public final Toolbar f100839k;
    @C0359n0

    /* renamed from: l */
    public final TextView f100840l;

    public C39418i(@C0359n0 CoordinatorLayout coordinatorLayout, @C0359n0 AppBarLayout appBarLayout, @C0359n0 ImageButton imageButton, @C0359n0 TextView textView, @C0359n0 RecyclerView recyclerView, @C0359n0 RelativeLayout relativeLayout, @C0359n0 ImageButton imageButton2, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ViewStub viewStub, @C0359n0 Toolbar toolbar, @C0359n0 TextView textView2) {
        this.f100829a = coordinatorLayout;
        this.f100830b = appBarLayout;
        this.f100831c = imageButton;
        this.f100832d = textView;
        this.f100833e = recyclerView;
        this.f100834f = relativeLayout;
        this.f100835g = imageButton2;
        this.f100836h = constraintLayout;
        this.f100837i = imageView;
        this.f100838j = viewStub;
        this.f100839k = toolbar;
        this.f100840l = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C39418i m161561a(@C0359n0 View view) {
        int i = C39364b.C39374j.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) C20753c.m96463a(view, i);
        if (appBarLayout != null) {
            i = C39364b.C39374j.button_toolbar_back;
            ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
            if (imageButton != null) {
                i = C39364b.C39374j.catalog_no_result_title;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    i = C39364b.C39374j.catalogProductsRecyclerView;
                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
                    if (recyclerView != null) {
                        i = C39364b.C39374j.catalogProductsRecyclerViewEmpty;
                        RelativeLayout relativeLayout = (RelativeLayout) C20753c.m96463a(view, i);
                        if (relativeLayout != null) {
                            i = C39364b.C39374j.delete_image_button;
                            ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view, i);
                            if (imageButton2 != null) {
                                i = C39364b.C39374j.favorites_toolbar;
                                ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view, i);
                                if (constraintLayout != null) {
                                    i = C39364b.C39374j.productImage;
                                    ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                                    if (imageView != null) {
                                        i = C39364b.C39374j.stub_empty_view;
                                        ViewStub viewStub = (ViewStub) C20753c.m96463a(view, i);
                                        if (viewStub != null) {
                                            i = C39364b.C39374j.toolbar;
                                            Toolbar toolbar = (Toolbar) C20753c.m96463a(view, i);
                                            if (toolbar != null) {
                                                i = C39364b.C39374j.toolbar_title;
                                                TextView textView2 = (TextView) C20753c.m96463a(view, i);
                                                if (textView2 != null) {
                                                    return new C39418i((CoordinatorLayout) view, appBarLayout, imageButton, textView, recyclerView, relativeLayout, imageButton2, constraintLayout, imageView, viewStub, toolbar, textView2);
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
    public static C39418i m161562c(@C0359n0 LayoutInflater layoutInflater) {
        return m161563d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39418i m161563d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.fragment_catalog_favorite_product_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161561a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f100829a;
    }
}
