package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics;

import androidx.constraintlayout.core.motion.utils.C16680d;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13791c;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13793e;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.CheckoutProgressStep;
import com.carrefour.fid.android.domain.extension.C37507h;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferProductDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import com.carrefour.fid.android.domain.models.delivery.C38019d;
import com.carrefour.fid.android.domain.models.delivery.C38021f;
import com.carrefour.fid.android.domain.models.delivery.C38022g;
import com.carrefour.fid.android.domain.models.delivery.C38023h;
import com.carrefour.fid.android.domain.models.delivery.C38024i;
import com.carrefour.fid.android.domain.models.delivery.DeliveryCode;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.extension.C38476l;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28583q0;
import com.google.firebase.installations.local.C33093b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nNonFoodCheckoutStep2AnalyticsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2AnalyticsImpl.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/NonFoodCheckoutStep2AnalyticsImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1549#2:245\n1620#2,3:246\n1549#2:249\n1620#2,3:250\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2AnalyticsImpl.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/analytics/NonFoodCheckoutStep2AnalyticsImpl\n*L\n136#1:245\n136#1:246,3\n161#1:249\n161#1:250,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.analytics.b */
public final class C23615b implements C23614a {
    @C12579k

    /* renamed from: a */
    public C13783a f59568a;

    @Inject
    public C23615b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f59568a = aVar;
    }

    /* renamed from: a */
    public void mo69139a(@C12579k List<OfferProductDomain> list, float f) {
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
        C13783a aVar = this.f59568a;
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
        hVarArr[0] = new C13812g(firebaseEventKey, "choix-livraison", "checkout", new C13791c("recapitulatif", checkoutProgressStep, (String) null, f, arrayList, 4, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: b */
    public void mo69140b() {
        this.f59568a.mo32711n(new C13812g(FirebaseEventKey.INTERACTION, "choix-livraison", "checkout", new C13793e("ecommerce", "checkout-progress", C28526d.f68842N2)));
    }

    /* renamed from: c */
    public void mo69141c() {
        C13783a.m58668o(this.f59568a, C10977s0.m41456W(C11078d1.m42659a("screen_class", "checkout"), C11078d1.m42659a("screen_name", "choix-livraison"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68804E0), C11078d1.m42659a(C28526d.f68937k, "livraison")), false, 2, (Object) null);
    }

    /* renamed from: d */
    public void mo69142d() {
        C13783a.m58668o(this.f59568a, C10977s0.m41456W(C11078d1.m42659a("screen_class", "checkout"), C11078d1.m42659a("screen_name", "choix-livraison"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "ajouter-adresse"), C11078d1.m42659a(C28526d.f68937k, "livraison")), false, 2, (Object) null);
    }

    /* renamed from: e */
    public void mo69143e(@C12579k C38017b bVar) {
        String str;
        Intrinsics.checkNotNullParameter(bVar, "deliveryOption");
        C13783a aVar = this.f59568a;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        boolean z = true;
        pairArr[1] = C11078d1.m42659a("screen_name", "choix-livraison");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68796C0);
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        if (bVar instanceof C38019d) {
            str = "economique";
        } else if (bVar instanceof C38024i) {
            str = C16680d.f41933k;
        } else {
            if (!(bVar instanceof C38022g)) {
                z = bVar instanceof C38023h;
            }
            if (z) {
                str = "point-relais";
            } else if (bVar instanceof C38021f) {
                str = "livraison-express";
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: f */
    public void mo69144f() {
        this.f59568a.mo32711n(new C13812g(FirebaseEventKey.INTERACTION, "choix-livraison", "checkout", new C13793e("ecommerce", "checkout-progress", C28526d.f68838M2)));
    }

    /* renamed from: g */
    public void mo69145g() {
        C13783a.m58667i(this.f59568a, C28583q0.f69744b, "me-localiser", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: h */
    public void mo69146h(boolean z) {
        DeliveryCode deliveryCode;
        C13783a aVar = this.f59568a;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "me-localiser");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68788A0);
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, C28526d.f68793B1);
        if (z) {
            deliveryCode = DeliveryCode.PRC;
        } else {
            deliveryCode = DeliveryCode.PRE;
        }
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, deliveryCode.name());
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: i */
    public void mo69147i(double d, @C12579k C38017b bVar, @C12579k List<Offer> list) {
        String str;
        String str2;
        C38017b bVar2 = bVar;
        List<Offer> list2 = list;
        Intrinsics.checkNotNullParameter(bVar2, "deliveryOption");
        Intrinsics.checkNotNullParameter(list2, "offers");
        C13783a aVar = this.f59568a;
        C13813h[] hVarArr = new C13813h[1];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.CHECKOUT_PROGRESS;
        String l = mo69150l(bVar2);
        CheckoutProgressStep checkoutProgressStep = CheckoutProgressStep.SECOND;
        float f = (float) d;
        Iterable<Offer> iterable = list2;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (Offer offer : iterable) {
            String S = offer.mo118010S().mo118418S();
            String P = offer.mo118010S().mo118415P();
            ProductCategory H = offer.mo118010S().mo118407H();
            if (H != null) {
                str = H.mo117297q();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str3 = str;
            float f2 = f;
            float a = (float) C38476l.m159638a(offer);
            Integer valueOf = Integer.valueOf(offer.mo118012U());
            if (C13786d.m58689b(FirebaseEventKey.CHECKOUT_PROGRESS)) {
                str2 = "undefined";
            } else {
                str2 = null;
            }
            C13804k kVar = r12;
            C13804k kVar2 = new C13804k(S, P, str3, (Integer) null, (String) null, a, (String) null, valueOf, (Integer) null, (String) null, (String) null, (Integer) null, str2, 3928, (DefaultConstructorMarker) null);
            arrayList.add(kVar);
            f = f2;
        }
        float f3 = f;
        hVarArr[0] = new C13812g(firebaseEventKey, l, "basket", new C13791c("checkout", checkoutProgressStep, (String) null, f, arrayList, 4, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: j */
    public void mo69148j(boolean z) {
        String str;
        if (z) {
            str = "multi";
        } else {
            str = "simple";
        }
        C13783a.m58667i(this.f59568a, "checkout", "choix-livraison", C10977s0.m41456W(C11078d1.m42659a("panier_type", "nonfood-delivery"), C11078d1.m42659a("env_basketBusiness", "nonfood-delivery"), C11078d1.m42659a("env_basketSize", str)), false, false, false, 56, (Object) null);
    }

    /* renamed from: k */
    public void mo69149k(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "errorType");
        Intrinsics.checkNotNullParameter(str2, "promoCode");
        C13783a aVar = this.f59568a;
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.INTERACTION;
        aVar.mo32711n(new C13812g(firebaseEventKey, "choix-livraison", "checkout", new C13793e("ecommerce", "voucher-fail", str + C33093b.f80279g + str2)));
    }

    /* renamed from: l */
    public final String mo69150l(C38017b bVar) {
        boolean z;
        if (bVar instanceof C38024i) {
            z = true;
        } else {
            z = bVar instanceof C38021f;
        }
        if (z) {
            return "choix-livraison";
        }
        if (bVar instanceof C38019d) {
            return C28526d.f68998z0;
        }
        if ((bVar instanceof C38022g) || (bVar instanceof C38023h)) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }
}
