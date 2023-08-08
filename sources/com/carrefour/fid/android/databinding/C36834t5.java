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
import com.carrefour.fid.android.presentation.components.image.OfferFlagListView;
import com.carrefour.fid.android.presentation.components.notification.NotificationView;
import com.carrefour.fid.android.presentation.components.overlay.OverlayView;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.QuantityView;

/* renamed from: com.carrefour.fid.android.databinding.t5 */
public final class C36834t5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91684a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91685b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f91686c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91687d;
    @C0359n0

    /* renamed from: e */
    public final OfferFlagListView f91688e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f91689f;
    @C0359n0

    /* renamed from: g */
    public final QuantityView f91690g;
    @C0359n0

    /* renamed from: h */
    public final NotificationView f91691h;
    @C0359n0

    /* renamed from: i */
    public final OverlayView f91692i;
    @C0359n0

    /* renamed from: j */
    public final ProgressBar f91693j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91694k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91695l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91696m;
    @C0359n0

    /* renamed from: n */
    public final TextView f91697n;
    @C0359n0

    /* renamed from: o */
    public final TextView f91698o;
    @C0359n0

    /* renamed from: p */
    public final TextView f91699p;
    @C0359n0

    /* renamed from: q */
    public final TextView f91700q;
    @C0359n0

    /* renamed from: r */
    public final TextView f91701r;
    @C0359n0

    /* renamed from: s */
    public final TextView f91702s;
    @C0359n0

    /* renamed from: t */
    public final TextView f91703t;

    public C36834t5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 ImageButton imageButton2, @C0359n0 ImageView imageView, @C0359n0 OfferFlagListView offerFlagListView, @C0359n0 ImageView imageView2, @C0359n0 QuantityView quantityView, @C0359n0 NotificationView notificationView, @C0359n0 OverlayView overlayView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 TextView textView8, @C0359n0 TextView textView9, @C0359n0 TextView textView10) {
        this.f91684a = constraintLayout;
        this.f91685b = imageButton;
        this.f91686c = imageButton2;
        this.f91687d = imageView;
        this.f91688e = offerFlagListView;
        this.f91689f = imageView2;
        this.f91690g = quantityView;
        this.f91691h = notificationView;
        this.f91692i = overlayView;
        this.f91693j = progressBar;
        this.f91694k = textView;
        this.f91695l = textView2;
        this.f91696m = textView3;
        this.f91697n = textView4;
        this.f91698o = textView5;
        this.f91699p = textView6;
        this.f91700q = textView7;
        this.f91701r = textView8;
        this.f91702s = textView9;
        this.f91703t = textView10;
    }

    @C0359n0
    /* renamed from: a */
    public static C36834t5 m151057a(@C0359n0 View view) {
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
                                    OverlayView overlayView = (OverlayView) C20753c.m96463a(view2, R.id.overlay_offer_product);
                                    if (overlayView != null) {
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
                                                                                    return new C36834t5((ConstraintLayout) view2, imageButton, imageButton2, imageView, offerFlagListView, imageView2, quantityView, notificationView, overlayView, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
    public static C36834t5 m151058c(@C0359n0 LayoutInflater layoutInflater) {
        return m151059d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36834t5 m151059d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_recommended_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151057a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91684a;
    }
}
