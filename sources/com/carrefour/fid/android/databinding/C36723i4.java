package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.PageControlsComponent;

/* renamed from: com.carrefour.fid.android.databinding.i4 */
public final class C36723i4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91013a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91014b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f91015c;
    @C0359n0

    /* renamed from: d */
    public final PageControlsComponent f91016d;

    public C36723i4(@C0359n0 LinearLayout linearLayout, @C0359n0 ImageView imageView, @C0359n0 RecyclerView recyclerView, @C0359n0 PageControlsComponent pageControlsComponent) {
        this.f91013a = linearLayout;
        this.f91014b = imageView;
        this.f91015c = recyclerView;
        this.f91016d = pageControlsComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C36723i4 m150619a(@C0359n0 View view) {
        int i = R.id.image_flagship_branding;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_flagship_branding);
        if (imageView != null) {
            i = R.id.product_list;
            RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.product_list);
            if (recyclerView != null) {
                i = R.id.product_list_indicator;
                PageControlsComponent pageControlsComponent = (PageControlsComponent) C20753c.m96463a(view, R.id.product_list_indicator);
                if (pageControlsComponent != null) {
                    return new C36723i4((LinearLayout) view, imageView, recyclerView, pageControlsComponent);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36723i4 m150620c(@C0359n0 LayoutInflater layoutInflater) {
        return m150621d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36723i4 m150621d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_criteo_flagship, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150619a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91013a;
    }
}
