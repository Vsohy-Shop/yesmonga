package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13788f;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13791c;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13809p;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.CheckoutProgressStep;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28531e0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nNonFoodCheckoutStep1AnalyticsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep1AnalyticsImpl.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/analytics/NonFoodCheckoutStep1AnalyticsImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n1549#2:108\n1620#2,3:109\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep1AnalyticsImpl.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/analytics/NonFoodCheckoutStep1AnalyticsImpl\n*L\n49#1:104\n49#1:105,3\n73#1:108\n73#1:109,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.analytics.b */
public final class C23517b implements C23516a {
    @C12579k

    /* renamed from: a */
    public C13783a f59434a;

    @Inject
    public C23517b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f59434a = aVar;
    }

    /* renamed from: a */
    public void mo68898a(@C12579k List<? extends OfferProductModel> list, double d) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ProductCategoryDomain q;
        List<? extends OfferProductModel> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "offers");
        C13783a aVar = this.f59434a;
        C13813h[] hVarArr = new C13813h[1];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.INTERACTION;
        CheckoutProgressStep checkoutProgressStep = CheckoutProgressStep.FIRST;
        float f = (float) d;
        Iterable<OfferProductModel> iterable = list2;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (OfferProductModel offerProductModel : iterable) {
            ProductModel o0 = offerProductModel.mo121517o0();
            if (o0 != null) {
                str = o0.mo121898z();
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            ProductModel o02 = offerProductModel.mo121517o0();
            if (o02 != null) {
                str3 = o02.mo121889s();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            ProductModel o03 = offerProductModel.mo121517o0();
            if (o03 == null || (q = o03.mo121887q()) == null) {
                str5 = null;
            } else {
                str5 = q.mo116513j();
            }
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
            float k = OfferProductModelKt.m159589k(offerProductModel);
            Integer valueOf = Integer.valueOf(offerProductModel.mo121519p0());
            if (C13786d.m58689b(FirebaseEventKey.INTERACTION)) {
                str7 = offerProductModel.mo121498K0();
            } else {
                str7 = null;
            }
            arrayList.add(new C13804k(str2, str4, str6, (Integer) null, (String) null, k, (String) null, valueOf, (Integer) null, (String) null, (String) null, (Integer) null, str7, 3928, (DefaultConstructorMarker) null));
        }
        hVarArr[0] = new C13812g(firebaseEventKey, "checkout", "basket", new C13809p("ecommerce", C28526d.f68792B0, checkoutProgressStep, (String) null, f, arrayList, 8, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: b */
    public void mo68899b(boolean z, @C12579k BasketType basketType, @C12580l StoreServiceType storeServiceType, boolean z2, @C12579k List<? extends OfferProductModel> list, double d) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ProductCategoryDomain q;
        List<? extends OfferProductModel> list2 = list;
        Intrinsics.checkNotNullParameter(basketType, "basketType");
        Intrinsics.checkNotNullParameter(list2, "offers");
        if (z) {
            str = "multi";
        } else {
            str = "simple";
        }
        C13783a.m58667i(this.f59434a, "checkout", "basket", C10977s0.m41456W(C11078d1.m42659a("panier_type", "nonfood-delivery"), C11078d1.m42659a("env_basketBusiness", "nonfood"), C11078d1.m42659a("env_basketSize", str)), false, false, false, 56, (Object) null);
        C13783a aVar = this.f59434a;
        C13813h[] hVarArr = new C13813h[1];
        List L = CollectionsKt__CollectionsKt.m40448L(FirebaseEventKey.VIEW_CART, FirebaseEventKey.BEGIN_CHECKOUT);
        CheckoutProgressStep checkoutProgressStep = CheckoutProgressStep.FIRST;
        float f = (float) d;
        Iterable<OfferProductModel> iterable = list2;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (OfferProductModel offerProductModel : iterable) {
            ProductModel o0 = offerProductModel.mo121517o0();
            if (o0 != null) {
                str2 = o0.mo121898z();
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            ProductModel o02 = offerProductModel.mo121517o0();
            if (o02 != null) {
                str4 = o02.mo121889s();
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str5 = "";
            } else {
                str5 = str4;
            }
            ProductModel o03 = offerProductModel.mo121517o0();
            if (o03 == null || (q = o03.mo121887q()) == null) {
                str6 = null;
            } else {
                str6 = q.mo116513j();
            }
            if (str6 == null) {
                str7 = "";
            } else {
                str7 = str6;
            }
            float k = OfferProductModelKt.m159589k(offerProductModel);
            Integer valueOf = Integer.valueOf(offerProductModel.mo121519p0());
            if (C13786d.m58689b(FirebaseEventKey.VIEW_CART) || C13786d.m58689b(FirebaseEventKey.BEGIN_CHECKOUT)) {
                str8 = offerProductModel.mo121498K0();
            } else {
                str8 = null;
            }
            arrayList.add(new C13804k(str3, str5, str7, (Integer) null, (String) null, k, (String) null, valueOf, (Integer) null, (String) null, (String) null, (Integer) null, str8, 3928, (DefaultConstructorMarker) null));
        }
        hVarArr[0] = new C13788f(L, "checkout", "basket", new C13791c("basket", checkoutProgressStep, (String) null, f, arrayList, 4, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: c */
    public void mo68900c(boolean z) {
        String str;
        C13783a aVar = this.f59434a;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[2] = C11078d1.m42659a("screen_name", "basket");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "achat-carte-cadeau");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, "sortie-site");
        if (z) {
            str = C38212b.f96812t;
        } else {
            str = C28531e0.f69089s;
        }
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }
}
