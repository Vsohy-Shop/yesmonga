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
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.presentation.components.image.OfferFlagListView;
import com.carrefour.fid.android.presentation.components.notification.NotificationView;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.QuantityView;

/* renamed from: com.carrefour.fid.android.databinding.m4 */
public final class C36763m4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91278a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91279b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f91280c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91281d;
    @C0359n0

    /* renamed from: e */
    public final OfferFlagListView f91282e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f91283f;
    @C0359n0

    /* renamed from: g */
    public final QuantityView f91284g;
    @C0359n0

    /* renamed from: h */
    public final NotificationView f91285h;
    @C0359n0

    /* renamed from: i */
    public final ProductOverlayComponent f91286i;
    @C0359n0

    /* renamed from: j */
    public final ProgressBar f91287j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91288k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91289l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91290m;
    @C0359n0

    /* renamed from: n */
    public final TextView f91291n;
    @C0359n0

    /* renamed from: o */
    public final TextView f91292o;
    @C0359n0

    /* renamed from: p */
    public final TextView f91293p;
    @C0359n0

    /* renamed from: q */
    public final TextView f91294q;
    @C0359n0

    /* renamed from: r */
    public final TextView f91295r;
    @C0359n0

    /* renamed from: s */
    public final TextView f91296s;
    @C0359n0

    /* renamed from: t */
    public final TextView f91297t;

    public C36763m4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 ImageButton imageButton2, @C0359n0 ImageView imageView, @C0359n0 OfferFlagListView offerFlagListView, @C0359n0 ImageView imageView2, @C0359n0 QuantityView quantityView, @C0359n0 NotificationView notificationView, @C0359n0 ProductOverlayComponent productOverlayComponent, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 TextView textView8, @C0359n0 TextView textView9, @C0359n0 TextView textView10) {
        this.f91278a = constraintLayout;
        this.f91279b = imageButton;
        this.f91280c = imageButton2;
        this.f91281d = imageView;
        this.f91282e = offerFlagListView;
        this.f91283f = imageView2;
        this.f91284g = quantityView;
        this.f91285h = notificationView;
        this.f91286i = productOverlayComponent;
        this.f91287j = progressBar;
        this.f91288k = textView;
        this.f91289l = textView2;
        this.f91290m = textView3;
        this.f91291n = textView4;
        this.f91292o = textView5;
        this.f91293p = textView6;
        this.f91294q = textView7;
        this.f91295r = textView8;
        this.f91296s = textView9;
        this.f91297t = textView10;
    }

    @C0359n0
    /* renamed from: a */
    public static C36763m4 m150779a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.button_offer_product_purchase;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view2, R.id.button_offer_product_purchase);
        if (imageButton != null) {
            i = R.id.button_offer_product_shopping_list;
            ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view2, R.id.button_offer_product_shopping_list);
            if (imageButton2 != null) {
                i = R.id.image_offer_product;
                ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.image_offer_product);
                if (imageView != null) {
                    i = R.id.image_offer_product_flags;
                    OfferFlagListView offerFlagListView = (OfferFlagListView) C20753c.m96463a(view2, R.id.image_offer_product_flags);
                    if (offerFlagListView != null) {
                        i = R.id.image_offer_product_origin_france;
                        ImageView imageView2 = (ImageView) C20753c.m96463a(view2, R.id.image_offer_product_origin_france);
                        if (imageView2 != null) {
                            i = R.id.layout_offer_product_quantity;
                            QuantityView quantityView = (QuantityView) C20753c.m96463a(view2, R.id.layout_offer_product_quantity);
                            if (quantityView != null) {
                                i = R.id.notification_offer_product;
                                NotificationView notificationView = (NotificationView) C20753c.m96463a(view2, R.id.notification_offer_product);
                                if (notificationView != null) {
                                    i = R.id.overlay_offer_product;
                                    ProductOverlayComponent productOverlayComponent = (ProductOverlayComponent) C20753c.m96463a(view2, R.id.overlay_offer_product);
                                    if (productOverlayComponent != null) {
                                        i = R.id.progress_offer_product_shopping_list;
                                        ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view2, R.id.progress_offer_product_shopping_list);
                                        if (progressBar != null) {
                                            i = R.id.text_offer_information_flag;
                                            TextView textView = (TextView) C20753c.m96463a(view2, R.id.text_offer_information_flag);
                                            if (textView != null) {
                                                i = R.id.text_offer_product_highlight;
                                                TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_highlight);
                                                if (textView2 != null) {
                                                    i = R.id.text_offer_product_origin;
                                                    TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_origin);
                                                    if (textView3 != null) {
                                                        i = R.id.text_offer_product_packaging;
                                                        TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_packaging);
                                                        if (textView4 != null) {
                                                            i = R.id.text_offer_product_price;
                                                            TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_price);
                                                            if (textView5 != null) {
                                                                i = R.id.text_offer_product_promo;
                                                                TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_promo);
                                                                if (textView6 != null) {
                                                                    i = R.id.text_offer_product_sponsored;
                                                                    TextView textView7 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_sponsored);
                                                                    if (textView7 != null) {
                                                                        i = R.id.text_offer_product_strike_through_price;
                                                                        TextView textView8 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_strike_through_price);
                                                                        if (textView8 != null) {
                                                                            i = R.id.text_offer_product_title;
                                                                            TextView textView9 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_title);
                                                                            if (textView9 != null) {
                                                                                i = R.id.text_offer_product_weight_price;
                                                                                TextView textView10 = (TextView) C20753c.m96463a(view2, R.id.text_offer_product_weight_price);
                                                                                if (textView10 != null) {
                                                                                    return new C36763m4((ConstraintLayout) view2, imageButton, imageButton2, imageView, offerFlagListView, imageView2, quantityView, notificationView, productOverlayComponent, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static C36763m4 m150780c(@C0359n0 LayoutInflater layoutInflater) {
        return m150781d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36763m4 m150781d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_offer_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150779a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91278a;
    }
}
