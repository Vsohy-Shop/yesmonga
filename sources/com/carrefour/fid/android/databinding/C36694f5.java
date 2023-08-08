package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.f5 */
public final class C36694f5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90810a;
    @C0359n0

    /* renamed from: b */
    public final Group f90811b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f90812c;
    @C0359n0

    /* renamed from: d */
    public final ComposeView f90813d;
    @C0359n0

    /* renamed from: e */
    public final ImageView f90814e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90815f;
    @C0359n0

    /* renamed from: g */
    public final View f90816g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90817h;
    @C0359n0

    /* renamed from: i */
    public final TextView f90818i;
    @C0359n0

    /* renamed from: j */
    public final TextView f90819j;
    @C0359n0

    /* renamed from: k */
    public final TextView f90820k;
    @C0359n0

    /* renamed from: l */
    public final TextView f90821l;

    public C36694f5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Group group, @C0359n0 ComposeView composeView, @C0359n0 ComposeView composeView2, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 View view, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6) {
        this.f90810a = constraintLayout;
        this.f90811b = group;
        this.f90812c = composeView;
        this.f90813d = composeView2;
        this.f90814e = imageView;
        this.f90815f = textView;
        this.f90816g = view;
        this.f90817h = textView2;
        this.f90818i = textView3;
        this.f90819j = textView4;
        this.f90820k = textView5;
        this.f90821l = textView6;
    }

    @C0359n0
    /* renamed from: a */
    public static C36694f5 m150503a(@C0359n0 View view) {
        int i = R.id.group_discount;
        Group group = (Group) C20753c.m96463a(view, R.id.group_discount);
        if (group != null) {
            i = R.id.holder_order_details_digital_item;
            ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.holder_order_details_digital_item);
            if (composeView != null) {
                i = R.id.holder_order_details_display_digital_item;
                ComposeView composeView2 = (ComposeView) C20753c.m96463a(view, R.id.holder_order_details_display_digital_item);
                if (composeView2 != null) {
                    i = R.id.image_holder_order_details_product;
                    ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_holder_order_details_product);
                    if (imageView != null) {
                        i = R.id.text_holder_order_details_product_amount;
                        TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_amount);
                        if (textView != null) {
                            i = R.id.text_holder_order_details_product_amount_strike_through;
                            View a = C20753c.m96463a(view, R.id.text_holder_order_details_product_amount_strike_through);
                            if (a != null) {
                                i = R.id.text_holder_order_details_product_description;
                                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_description);
                                if (textView2 != null) {
                                    i = R.id.text_holder_order_details_product_immediate_discount;
                                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_immediate_discount);
                                    if (textView3 != null) {
                                        i = R.id.text_holder_order_details_product_name;
                                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_name);
                                        if (textView4 != null) {
                                            i = R.id.text_holder_order_details_product_quantity;
                                            TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_quantity);
                                            if (textView5 != null) {
                                                i = R.id.text_holder_order_details_product_total_paid_amount;
                                                TextView textView6 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_product_total_paid_amount);
                                                if (textView6 != null) {
                                                    return new C36694f5((ConstraintLayout) view, group, composeView, composeView2, imageView, textView, a, textView2, textView3, textView4, textView5, textView6);
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
    public static C36694f5 m150504c(@C0359n0 LayoutInflater layoutInflater) {
        return m150505d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36694f5 m150505d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150503a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90810a;
    }
}
