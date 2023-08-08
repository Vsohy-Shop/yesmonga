package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.q */
public final class C37071q implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92774a;
    @C0359n0

    /* renamed from: b */
    public final LinearLayoutCompat f92775b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92776c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f92777d;
    @C0359n0

    /* renamed from: e */
    public final ComposeView f92778e;
    @C0359n0

    /* renamed from: f */
    public final TextView f92779f;
    @C0359n0

    /* renamed from: g */
    public final TextView f92780g;
    @C0359n0

    /* renamed from: h */
    public final ImageView f92781h;
    @C0359n0

    /* renamed from: i */
    public final ConstraintLayout f92782i;
    @C0359n0

    /* renamed from: j */
    public final ImageView f92783j;
    @C0359n0

    /* renamed from: k */
    public final MaterialButton f92784k;

    public C37071q(@C0359n0 View view, @C0359n0 LinearLayoutCompat linearLayoutCompat, @C0359n0 TextView textView, @C0359n0 RecyclerView recyclerView, @C0359n0 ComposeView composeView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 ImageView imageView, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView2, @C0359n0 MaterialButton materialButton) {
        this.f92774a = view;
        this.f92775b = linearLayoutCompat;
        this.f92776c = textView;
        this.f92777d = recyclerView;
        this.f92778e = composeView;
        this.f92779f = textView2;
        this.f92780g = textView3;
        this.f92781h = imageView;
        this.f92782i = constraintLayout;
        this.f92783j = imageView2;
        this.f92784k = materialButton;
    }

    @C0359n0
    /* renamed from: a */
    public static C37071q m152041a(@C0359n0 View view) {
        int i = C36896b.C36906j.component_container;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) C20753c.m96463a(view, i);
        if (linearLayoutCompat != null) {
            i = C36896b.C36906j.hub_product_description;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                i = C36896b.C36906j.hub_product_list;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, i);
                if (recyclerView != null) {
                    i = C36896b.C36906j.hub_product_search;
                    ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
                    if (composeView != null) {
                        i = C36896b.C36906j.hub_product_title;
                        TextView textView2 = (TextView) C20753c.m96463a(view, i);
                        if (textView2 != null) {
                            i = C36896b.C36906j.hub_product_title_suffix;
                            TextView textView3 = (TextView) C20753c.m96463a(view, i);
                            if (textView3 != null) {
                                i = C36896b.C36906j.product_hub_arrow;
                                ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                                if (imageView != null) {
                                    i = C36896b.C36906j.product_hub_header;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view, i);
                                    if (constraintLayout != null) {
                                        i = C36896b.C36906j.product_hub_icon;
                                        ImageView imageView2 = (ImageView) C20753c.m96463a(view, i);
                                        if (imageView2 != null) {
                                            i = C36896b.C36906j.sub_product_list_button;
                                            MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
                                            if (materialButton != null) {
                                                return new C37071q(view, linearLayoutCompat, textView, recyclerView, composeView, textView2, textView3, imageView, constraintLayout, imageView2, materialButton);
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
    /* renamed from: b */
    public static C37071q m152042b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_hub_product, viewGroup);
            return m152041a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92774a;
    }
}
