package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.presentation.components.home.CagnotteCardView;
import com.carrefour.fid.android.presentation.components.home.CouponCardView;
import com.carrefour.fid.android.presentation.components.loyalty.BarCodeCardView;

/* renamed from: com.carrefour.fid.android.databinding.m2 */
public final class C36761m2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ScrollView f91255a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91256b;
    @C0359n0

    /* renamed from: c */
    public final ComposeView f91257c;
    @C0359n0

    /* renamed from: d */
    public final BarCodeCardView f91258d;
    @C0359n0

    /* renamed from: e */
    public final CagnotteCardView f91259e;
    @C0359n0

    /* renamed from: f */
    public final LinearLayout f91260f;
    @C0359n0

    /* renamed from: g */
    public final NotificationComponent f91261g;
    @C0359n0

    /* renamed from: h */
    public final CouponCardView f91262h;
    @C0359n0

    /* renamed from: i */
    public final ComposeView f91263i;
    @C0359n0

    /* renamed from: j */
    public final ImageView f91264j;
    @C0359n0

    /* renamed from: k */
    public final ComposeView f91265k;
    @C0359n0

    /* renamed from: l */
    public final ProgressBar f91266l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91267m;
    @C0359n0

    /* renamed from: n */
    public final TextView f91268n;
    @C0359n0

    /* renamed from: o */
    public final TextView f91269o;
    @C0359n0

    /* renamed from: p */
    public final C36685e6 f91270p;

    public C36761m2(@C0359n0 ScrollView scrollView, @C0359n0 ComposeView composeView, @C0359n0 ComposeView composeView2, @C0359n0 BarCodeCardView barCodeCardView, @C0359n0 CagnotteCardView cagnotteCardView, @C0359n0 LinearLayout linearLayout, @C0359n0 NotificationComponent notificationComponent, @C0359n0 CouponCardView couponCardView, @C0359n0 ComposeView composeView3, @C0359n0 ImageView imageView, @C0359n0 ComposeView composeView4, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 C36685e6 e6Var) {
        this.f91255a = scrollView;
        this.f91256b = composeView;
        this.f91257c = composeView2;
        this.f91258d = barCodeCardView;
        this.f91259e = cagnotteCardView;
        this.f91260f = linearLayout;
        this.f91261g = notificationComponent;
        this.f91262h = couponCardView;
        this.f91263i = composeView3;
        this.f91264j = imageView;
        this.f91265k = composeView4;
        this.f91266l = progressBar;
        this.f91267m = textView;
        this.f91268n = textView2;
        this.f91269o = textView3;
        this.f91270p = e6Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36761m2 m150771a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.banner_arsenal_jo;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view2, R.id.banner_arsenal_jo);
        if (composeView != null) {
            i = R.id.banner_challenge_fid;
            ComposeView composeView2 = (ComposeView) C20753c.m96463a(view2, R.id.banner_challenge_fid);
            if (composeView2 != null) {
                i = R.id.barcode_card_view;
                BarCodeCardView barCodeCardView = (BarCodeCardView) C20753c.m96463a(view2, R.id.barcode_card_view);
                if (barCodeCardView != null) {
                    i = R.id.cagnotteCard;
                    CagnotteCardView cagnotteCardView = (CagnotteCardView) C20753c.m96463a(view2, R.id.cagnotteCard);
                    if (cagnotteCardView != null) {
                        i = R.id.cagnotteCouponContainer;
                        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view2, R.id.cagnotteCouponContainer);
                        if (linearLayout != null) {
                            i = R.id.cagnotteNotification;
                            NotificationComponent notificationComponent = (NotificationComponent) C20753c.m96463a(view2, R.id.cagnotteNotification);
                            if (notificationComponent != null) {
                                i = R.id.couponCard;
                                CouponCardView couponCardView = (CouponCardView) C20753c.m96463a(view2, R.id.couponCard);
                                if (couponCardView != null) {
                                    i = R.id.loyaltyBonusView;
                                    ComposeView composeView3 = (ComposeView) C20753c.m96463a(view2, R.id.loyaltyBonusView);
                                    if (composeView3 != null) {
                                        i = R.id.loyalty_card_button;
                                        ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.loyalty_card_button);
                                        if (imageView != null) {
                                            i = R.id.manage_card_buttons;
                                            ComposeView composeView4 = (ComposeView) C20753c.m96463a(view2, R.id.manage_card_buttons);
                                            if (composeView4 != null) {
                                                i = R.id.modifySecretCodeProgress;
                                                ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view2, R.id.modifySecretCodeProgress);
                                                if (progressBar != null) {
                                                    i = R.id.modifySecretCodeTxt;
                                                    TextView textView = (TextView) C20753c.m96463a(view2, R.id.modifySecretCodeTxt);
                                                    if (textView != null) {
                                                        i = R.id.pass_card_number;
                                                        TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.pass_card_number);
                                                        if (textView2 != null) {
                                                            i = R.id.pass_card_title;
                                                            TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.pass_card_title);
                                                            if (textView3 != null) {
                                                                i = R.id.serviceStations;
                                                                View a = C20753c.m96463a(view2, R.id.serviceStations);
                                                                if (a != null) {
                                                                    return new C36761m2((ScrollView) view2, composeView, composeView2, barCodeCardView, cagnotteCardView, linearLayout, notificationComponent, couponCardView, composeView3, imageView, composeView4, progressBar, textView, textView2, textView3, C36685e6.m150469a(a));
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
    public static C36761m2 m150772c(@C0359n0 LayoutInflater layoutInflater) {
        return m150773d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36761m2 m150773d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_loyalty_detail_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150771a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f91255a;
    }
}
