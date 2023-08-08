package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.notification.NotificationView;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.QuantityView;

/* renamed from: com.carrefour.fid.android.databinding.l4 */
public final class C36753l4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91203a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91204b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91205c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91206d;
    @C0359n0

    /* renamed from: e */
    public final QuantityView f91207e;
    @C0359n0

    /* renamed from: f */
    public final NotificationView f91208f;
    @C0359n0

    /* renamed from: g */
    public final ProgressBar f91209g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91210h;
    @C0359n0

    /* renamed from: i */
    public final TextView f91211i;
    @C0359n0

    /* renamed from: j */
    public final TextView f91212j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91213k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91214l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91215m;
    @C0359n0

    /* renamed from: n */
    public final TextView f91216n;

    public C36753l4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 QuantityView quantityView, @C0359n0 NotificationView notificationView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7) {
        this.f91203a = constraintLayout;
        this.f91204b = imageButton;
        this.f91205c = imageView;
        this.f91206d = imageView2;
        this.f91207e = quantityView;
        this.f91208f = notificationView;
        this.f91209g = progressBar;
        this.f91210h = textView;
        this.f91211i = textView2;
        this.f91212j = textView3;
        this.f91213k = textView4;
        this.f91214l = textView5;
        this.f91215m = textView6;
        this.f91216n = textView7;
    }

    @C0359n0
    /* renamed from: a */
    public static C36753l4 m150739a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.button_offer_product_basket_shopping_list;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view2, R.id.button_offer_product_basket_shopping_list);
        if (imageButton != null) {
            i = R.id.image_offer_product_basket_item;
            ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.image_offer_product_basket_item);
            if (imageView != null) {
                i = R.id.image_offer_product_basket_item_origin_france;
                ImageView imageView2 = (ImageView) C20753c.m96463a(view2, R.id.image_offer_product_basket_item_origin_france);
                if (imageView2 != null) {
                    i = R.id.layout_offer_product_basket_item_quantity;
                    QuantityView quantityView = (QuantityView) C20753c.m96463a(view2, R.id.layout_offer_product_basket_item_quantity);
                    if (quantityView != null) {
                        i = R.id.notification_offer_product_basket_item;
                        NotificationView notificationView = (NotificationView) C20753c.m96463a(view2, R.id.notification_offer_product_basket_item);
                        if (notificationView != null) {
                            i = R.id.progress_offer_product_basket_shopping_list;
                            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view2, R.id.progress_offer_product_basket_shopping_list);
                            if (progressBar != null) {
                                i = R.id.text_offer_product_basket_item_packaging;
                                TextView textView = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_basket_item_packaging);
                                if (textView != null) {
                                    i = R.id.text_offer_product_basket_item_price;
                                    TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_basket_item_price);
                                    if (textView2 != null) {
                                        i = R.id.text_offer_product_basket_item_promo;
                                        TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_basket_item_promo);
                                        if (textView3 != null) {
                                            i = R.id.text_offer_product_basket_item_strike_through_price;
                                            TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_basket_item_strike_through_price);
                                            if (textView4 != null) {
                                                i = R.id.text_offer_product_basket_item_title;
                                                TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_basket_item_title);
                                                if (textView5 != null) {
                                                    i = R.id.text_offer_product_basket_item_weight_price;
                                                    TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_basket_item_weight_price);
                                                    if (textView6 != null) {
                                                        i = R.id.text_offer_product_highlight;
                                                        TextView textView7 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_highlight);
                                                        if (textView7 != null) {
                                                            return new C36753l4((ConstraintLayout) view2, imageButton, imageView, imageView2, quantityView, notificationView, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static C36753l4 m150740c(@C0359n0 LayoutInflater layoutInflater) {
        return m150741d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36753l4 m150741d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_product_basket, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150739a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91203a;
    }
}
