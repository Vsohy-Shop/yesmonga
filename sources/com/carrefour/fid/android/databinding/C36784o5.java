package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.o5 */
public final class C36784o5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91440a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91441b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91442c;
    @C0359n0

    /* renamed from: d */
    public final Switch f91443d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91444e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91445f;

    public C36784o5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 Switch switchR, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91440a = constraintLayout;
        this.f91441b = imageView;
        this.f91442c = imageView2;
        this.f91443d = switchR;
        this.f91444e = textView;
        this.f91445f = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36784o5 m150863a(@C0359n0 View view) {
        int i = R.id.image_product_list_filters_facet_icon;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_product_list_filters_facet_icon);
        if (imageView != null) {
            i = R.id.image_product_list_filters_facet_icon_arrow;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.image_product_list_filters_facet_icon_arrow);
            if (imageView2 != null) {
                i = R.id.switch_product_list_filters_facet;
                Switch switchR = (Switch) C20753c.m96463a(view, R.id.switch_product_list_filters_facet);
                if (switchR != null) {
                    i = R.id.text_product_list_filters_facet_subtitle;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.text_product_list_filters_facet_subtitle);
                    if (textView != null) {
                        i = R.id.text_product_list_filters_facet_title;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_product_list_filters_facet_title);
                        if (textView2 != null) {
                            return new C36784o5((ConstraintLayout) view, imageView, imageView2, switchR, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36784o5 m150864c(@C0359n0 LayoutInflater layoutInflater) {
        return m150865d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36784o5 m150865d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_product_list_filters_facet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150863a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91440a;
    }
}
