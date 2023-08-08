package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.catalogs.C39364b;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.k */
public final class C39420k implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final NestedScrollView f100847a;
    @C0359n0

    /* renamed from: b */
    public final TextView f100848b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f100849c;
    @C0359n0

    /* renamed from: d */
    public final TextView f100850d;
    @C0359n0

    /* renamed from: e */
    public final TextView f100851e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f100852f;
    @C0359n0

    /* renamed from: g */
    public final TextView f100853g;
    @C0359n0

    /* renamed from: h */
    public final TextView f100854h;
    @C0359n0

    /* renamed from: i */
    public final ImageView f100855i;
    @C0359n0

    /* renamed from: j */
    public final TextView f100856j;
    @C0359n0

    /* renamed from: k */
    public final ImageView f100857k;
    @C0359n0

    /* renamed from: l */
    public final TextView f100858l;
    @C0359n0

    /* renamed from: m */
    public final ImageView f100859m;

    public C39420k(@C0359n0 NestedScrollView nestedScrollView, @C0359n0 TextView textView, @C0359n0 ImageView imageView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 ImageView imageView2, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 ImageView imageView3, @C0359n0 TextView textView6, @C0359n0 ImageView imageView4, @C0359n0 TextView textView7, @C0359n0 ImageView imageView5) {
        this.f100847a = nestedScrollView;
        this.f100848b = textView;
        this.f100849c = imageView;
        this.f100850d = textView2;
        this.f100851e = textView3;
        this.f100852f = imageView2;
        this.f100853g = textView4;
        this.f100854h = textView5;
        this.f100855i = imageView3;
        this.f100856j = textView6;
        this.f100857k = imageView4;
        this.f100858l = textView7;
        this.f100859m = imageView5;
    }

    @C0359n0
    /* renamed from: a */
    public static C39420k m161569a(@C0359n0 View view) {
        View view2 = view;
        int i = C39364b.C39374j.cguBanner;
        TextView textView = (TextView) C20753c.m96463a(view2, i);
        if (textView != null) {
            i = C39364b.C39374j.pictoGmpProductDetail;
            ImageView imageView = (ImageView) C20753c.m96463a(view2, i);
            if (imageView != null) {
                i = C39364b.C39374j.productBrand;
                TextView textView2 = (TextView) C20753c.m96463a(view2, i);
                if (textView2 != null) {
                    i = C39364b.C39374j.productDescription;
                    TextView textView3 = (TextView) C20753c.m96463a(view2, i);
                    if (textView3 != null) {
                        i = C39364b.C39374j.productImage;
                        ImageView imageView2 = (ImageView) C20753c.m96463a(view2, i);
                        if (imageView2 != null) {
                            i = C39364b.C39374j.productLegalInfo;
                            TextView textView4 = (TextView) C20753c.m96463a(view2, i);
                            if (textView4 != null) {
                                i = C39364b.C39374j.productName;
                                TextView textView5 = (TextView) C20753c.m96463a(view2, i);
                                if (textView5 != null) {
                                    i = C39364b.C39374j.productPromo;
                                    ImageView imageView3 = (ImageView) C20753c.m96463a(view2, i);
                                    if (imageView3 != null) {
                                        i = C39364b.C39374j.productUnitPrice;
                                        TextView textView6 = (TextView) C20753c.m96463a(view2, i);
                                        if (textView6 != null) {
                                            i = C39364b.C39374j.shoppingListButton;
                                            ImageView imageView4 = (ImageView) C20753c.m96463a(view2, i);
                                            if (imageView4 != null) {
                                                i = C39364b.C39374j.toolbar_label_text;
                                                TextView textView7 = (TextView) C20753c.m96463a(view2, i);
                                                if (textView7 != null) {
                                                    i = C39364b.C39374j.toolbar_left_icon;
                                                    ImageView imageView5 = (ImageView) C20753c.m96463a(view2, i);
                                                    if (imageView5 != null) {
                                                        return new C39420k((NestedScrollView) view2, textView, imageView, textView2, textView3, imageView2, textView4, textView5, imageView3, textView6, imageView4, textView7, imageView5);
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
    public static C39420k m161570c(@C0359n0 LayoutInflater layoutInflater) {
        return m161571d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39420k m161571d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.fragment_catalog_product_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161569a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f100847a;
    }
}
