package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.notification.NotificationView;

/* renamed from: com.carrefour.fid.android.databinding.h5 */
public final class C36714h5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90962a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f90963b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90964c;
    @C0359n0

    /* renamed from: d */
    public final NotificationView f90965d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90966e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90967f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90968g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90969h;
    @C0359n0

    /* renamed from: i */
    public final TextView f90970i;
    @C0359n0

    /* renamed from: j */
    public final TextView f90971j;
    @C0359n0

    /* renamed from: k */
    public final TextView f90972k;
    @C0359n0

    /* renamed from: l */
    public final TextView f90973l;

    public C36714h5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 NotificationView notificationView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 TextView textView8) {
        this.f90962a = constraintLayout;
        this.f90963b = imageView;
        this.f90964c = imageView2;
        this.f90965d = notificationView;
        this.f90966e = textView;
        this.f90967f = textView2;
        this.f90968g = textView3;
        this.f90969h = textView4;
        this.f90970i = textView5;
        this.f90971j = textView6;
        this.f90972k = textView7;
        this.f90973l = textView8;
    }

    @C0359n0
    /* renamed from: a */
    public static C36714h5 m150583a(@C0359n0 View view) {
        int i = R.id.image_holder_info_replacement_difference;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_holder_info_replacement_difference);
        if (imageView != null) {
            i = R.id.image_holder_order_details_replacement_product;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.image_holder_order_details_replacement_product);
            if (imageView2 != null) {
                i = R.id.notification_offer_replacement_product_tool_tip;
                NotificationView notificationView = (NotificationView) C20753c.m96463a(view, R.id.notification_offer_replacement_product_tool_tip);
                if (notificationView != null) {
                    i = R.id.text_holder_order_details_replacement_product_amount;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_replacement_product_amount);
                    if (textView != null) {
                        i = R.id.text_holder_order_details_replacement_product_description;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_replacement_product_description);
                        if (textView2 != null) {
                            i = R.id.text_holder_order_details_replacement_product_name;
                            TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_replacement_product_name);
                            if (textView3 != null) {
                                i = R.id.text_holder_order_details_replacement_product_quantity;
                                TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_details_replacement_product_quantity);
                                if (textView4 != null) {
                                    i = R.id.text_holder_order_replacement_difference_amount;
                                    TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_replacement_difference_amount);
                                    if (textView5 != null) {
                                        i = R.id.text_holder_order_replacement_difference_title;
                                        TextView textView6 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_replacement_difference_title);
                                        if (textView6 != null) {
                                            i = R.id.text_holder_order_replacement_receipt;
                                            TextView textView7 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_replacement_receipt);
                                            if (textView7 != null) {
                                                i = R.id.text_holder_order_replacement_receipt_amount;
                                                TextView textView8 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_replacement_receipt_amount);
                                                if (textView8 != null) {
                                                    return new C36714h5((ConstraintLayout) view, imageView, imageView2, notificationView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static C36714h5 m150584c(@C0359n0 LayoutInflater layoutInflater) {
        return m150585d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36714h5 m150585d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_replacement_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150583a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90962a;
    }
}
