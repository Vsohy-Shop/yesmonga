package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.step2.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13791c;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13792d;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.CheckoutProgressStep;
import com.carrefour.fid.android.domain.extension.C37507h;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.analytics.C38362d;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28590s;
import com.carrefour.fid.android.tracking.C28994a;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep2Analytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep2Analytics.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step2/analytics/CheckoutStep2Analytics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1549#2:192\n1620#2,3:193\n*S KotlinDebug\n*F\n+ 1 CheckoutStep2Analytics.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/step2/analytics/CheckoutStep2Analytics\n*L\n167#1:192\n167#1:193,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.step2.analytics.a */
public final class C26092a {

    /* renamed from: c */
    public static final int f63775c = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f63776a;
    @C12579k

    /* renamed from: b */
    public final C28994a f63777b;

    @Inject
    public C26092a(@C12579k C13783a aVar, @C12579k C28994a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "audienceTrackingAdapter");
        this.f63776a = aVar;
        this.f63777b = aVar2;
    }

    /* renamed from: a */
    public final String mo75776a(Basket basket) {
        return C38362d.f97145a.mo121198a(basket.mo116829N(), basket.mo116824I(), basket.mo116830O());
    }

    /* renamed from: b */
    public final void mo75777b(float f) {
        this.f63776a.mo32711n(new C13812g(FirebaseEventKey.CHECKOUT_PROGRESS, "recapitulatif", "checkout", new C13792d(CheckoutProgressStep.THIRD, (String) null, f, 2, (DefaultConstructorMarker) null)));
    }

    /* renamed from: c */
    public final void mo75778c(@C12579k List<OfferProductDomain> list, float f) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        OfferDiscountType z;
        ProductCategoryDomain q;
        List<OfferProductDomain> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "offers");
        C13783a aVar = this.f63776a;
        C13813h[] hVarArr = new C13813h[1];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_SHIPPING_INFO;
        CheckoutProgressStep checkoutProgressStep = CheckoutProgressStep.SECOND;
        Iterable<OfferProductDomain> iterable = list2;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (OfferProductDomain offerProductDomain : iterable) {
            ProductDomain Q = offerProductDomain.mo116032Q();
            String str9 = null;
            if (Q != null) {
                str = Q.mo116553z();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            ProductDomain Q2 = offerProductDomain.mo116032Q();
            if (Q2 != null) {
                str3 = Q2.mo116544s();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            ProductDomain Q3 = offerProductDomain.mo116032Q();
            if (Q3 == null || (q = Q3.mo116542q()) == null) {
                str5 = null;
            } else {
                str5 = q.mo116513j();
            }
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
            float b = C37507h.m153950b(offerProductDomain);
            int R = offerProductDomain.mo116033R();
            OfferDiscountDomain D = offerProductDomain.mo116019D();
            if (D == null || (z = D.mo115961z()) == null) {
                str7 = null;
            } else {
                str7 = z.mo118123y();
            }
            if (str7 == null) {
                str8 = "";
            } else {
                str8 = str7;
            }
            if (C13786d.m58689b(FirebaseEventKey.ADD_SHIPPING_INFO)) {
                str9 = offerProductDomain.mo116036U();
            }
            arrayList.add(new C13804k(str2, str4, str6, (Integer) null, (String) null, b, str8, Integer.valueOf(R), (Integer) null, (String) null, (String) null, (Integer) null, str9, 3864, (DefaultConstructorMarker) null));
        }
        hVarArr[0] = new C13812g(firebaseEventKey, "recapitulatif", "checkout", new C13791c("recapitulatif", checkoutProgressStep, (String) null, f, arrayList, 4, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: d */
    public final void mo75779d(@C12579k Basket basket) {
        Intrinsics.checkNotNullParameter(basket, "basket");
        String a = mo75776a(basket);
        C13783a.m58668o(this.f63776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "recapitulatif"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "checkout-progress"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, C28590s.f69831w), C11078d1.m42659a("panier_type", a)), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo75780e() {
        C13783a.m58668o(this.f63776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "recapitulatif"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68816H0), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, C28526d.f68824J0)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo75781f() {
        C13783a.m58668o(this.f63776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "recapitulatif"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68816H0), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, "affichage")), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo75782g() {
        C13783a.m58668o(this.f63776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "recapitulatif"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68816H0), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, C28526d.f68828K0)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo75783h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "promoCode");
        this.f63777b.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33403A0, str)));
    }

    /* renamed from: i */
    public final void mo75784i() {
        C13783a.m58668o(this.f63776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "checkout-progress"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, C28526d.f68838M2)), false, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo75785j(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "promoCode");
        Intrinsics.checkNotNullParameter(str2, "errorType");
        C13783a aVar = this.f63776a;
        String lowerCase = C11622t.replace$default(str2, C32920e.f79928l, "-", false, 4, (Object) null).toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68933j, "voucher-fail"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, lowerCase + C33093b.f80279g + str)), false, 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo75786k() {
        C13783a.m58668o(this.f63776a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "paiement"), C11078d1.m42659a(C28526d.f68933j, "checkout-progress"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, "code-promo-ok")), false, 2, (Object) null);
    }

    /* renamed from: l */
    public final void mo75787l(@C12579k Basket basket) {
        Intrinsics.checkNotNullParameter(basket, "basket");
        C13783a.m58667i(this.f63776a, "checkout", "recapitulatif", C10975r0.m41401k(C11078d1.m42659a("panier_type", mo75776a(basket))), false, true, false, 40, (Object) null);
    }
}
