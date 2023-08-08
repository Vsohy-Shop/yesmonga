package com.carrefour.fid.android.tracking.product;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.constant.C28526d;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductTracking.kt\ncom/carrefour/fid/android/tracking/product/ProductListTracking\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
/* renamed from: com.carrefour.fid.android.tracking.product.a */
public final class C29021a implements C29023c {

    /* renamed from: e */
    public static final int f71116e = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f71117a;
    @C12579k

    /* renamed from: b */
    public String f71118b = "";
    @C12579k

    /* renamed from: c */
    public String f71119c = "";
    @C12579k

    /* renamed from: d */
    public String f71120d = "";

    @Inject
    public C29021a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71117a = aVar;
    }

    /* renamed from: H */
    public void mo77646H(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "screenClass");
        Intrinsics.checkNotNullParameter(str2, "screenName");
        Intrinsics.checkNotNullParameter(str3, "ecommerceZone");
        this.f71119c = str;
        this.f71118b = str2;
        this.f71120d = str3;
    }

    /* renamed from: N */
    public void mo77648N(@C12579k OfferProductModel offerProductModel, int i) {
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        int p0 = offerProductModel.mo121519p0();
        if (i > p0) {
            mo77657t(offerProductModel, i - p0, 0);
        } else if (i < p0) {
            mo77650Z(offerProductModel, p0 - i, 0);
        }
    }

    /* renamed from: P */
    public void mo77649P(@C12579k OfferProductModel offerProductModel, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ProductCategoryDomain q;
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        C13783a aVar = this.f71117a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[10];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo84463c());
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo84462b());
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", mo84461a());
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68837M1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str8 = null;
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a("product_EAN", str);
        String n = OfferProductModelKt.m159592n(offerProductModel);
        if (n == null) {
            n = "";
        }
        pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, n);
        String K0 = offerProductModel.mo121498K0();
        if (K0 == null) {
            K0 = "";
        }
        pairArr[9] = C11078d1.m42659a(C28526d.f68908d1, K0);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_WISHLIST;
        String c = mo84463c();
        String b = mo84462b();
        String c2 = mo84463c();
        float k = OfferProductModelKt.m159589k(offerProductModel);
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
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str8 = offerProductModel.mo121498K0();
        }
        C13789a aVar2 = r12;
        C13789a aVar3 = new C13789a(c2, k, (String) null, C10976s.m41419k(new C13803j(str3, str5, str7, 0, k2, 1, (Integer) null, (String) null, (String) null, str8, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, c, b, aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: Z */
    public void mo77650Z(@C12579k OfferProductModel offerProductModel, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        ProductCategoryDomain q;
        OfferDiscountType z;
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        C13783a aVar = this.f71117a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[16];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, mo84462b());
        pairArr[2] = C11078d1.m42659a("screen_name", mo84463c());
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, mo84462b());
        pairArr[4] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[5] = C11078d1.m42659a("ecommerce_zone", mo84461a());
        pairArr[6] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[7] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str12 = null;
        if (W != null) {
            str = W.mo115984e();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[8] = C11078d1.m42659a("product_cdBase", str);
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115986f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_EAN", str2);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[10] = C11078d1.m42659a("product_name", str3);
        String n = OfferProductModelKt.m159592n(offerProductModel);
        if (n == null) {
            n = "";
        }
        pairArr[11] = C11078d1.m42659a(C28526d.f68907d0, n);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[12] = C11078d1.m42659a("product_promotionsName", str4);
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 == null || (z = w2.mo115961z()) == null) {
            str5 = null;
        } else {
            str5 = z.mo118123y();
        }
        if (str5 == null) {
            str5 = "";
        }
        pairArr[13] = C11078d1.m42659a("product_promotionsType", str5);
        pairArr[14] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        String K0 = offerProductModel.mo121498K0();
        if (K0 == null) {
            K0 = "";
        }
        pairArr[15] = C11078d1.m42659a(C28526d.f68908d1, K0);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_CART;
        String c = mo84463c();
        String b = mo84462b();
        String c2 = mo84463c();
        float k = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str6 = o02.mo121898z();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str8 = o03.mo121889s();
        } else {
            str8 = null;
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q = o04.mo121887q()) == null) {
            str10 = null;
        } else {
            str10 = q.mo116513j();
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str12 = offerProductModel.mo121498K0();
        }
        C13789a aVar2 = r12;
        C13789a aVar3 = new C13789a(c2, k, (String) null, C10976s.m41419k(new C13803j(str7, str9, str11, 0, k2, 1, (Integer) null, (String) null, (String) null, str12, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, c, b, aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: a */
    public final String mo84461a() {
        boolean z;
        if (this.f71120d.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f71120d;
        }
        throw new IllegalArgumentException("[ecommerceZone] parameter must not be empty.".toString());
    }

    /* renamed from: a0 */
    public void mo77651a0(@C12579k OfferProductModel offerProductModel, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ProductCategoryDomain q;
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        C13783a aVar = this.f71117a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[10];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo84463c());
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo84462b());
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", mo84461a());
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68841N1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str8 = null;
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a("product_EAN", str);
        String n = OfferProductModelKt.m159592n(offerProductModel);
        if (n == null) {
            n = "";
        }
        pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, n);
        String K0 = offerProductModel.mo121498K0();
        if (K0 == null) {
            K0 = "";
        }
        pairArr[9] = C11078d1.m42659a(C28526d.f68908d1, K0);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_WISHLIST;
        String c = mo84463c();
        String b = mo84462b();
        String c2 = mo84463c();
        float k = OfferProductModelKt.m159589k(offerProductModel);
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
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str8 = offerProductModel.mo121498K0();
        }
        C13789a aVar2 = r12;
        C13789a aVar3 = new C13789a(c2, k, (String) null, C10976s.m41419k(new C13803j(str3, str5, str7, 0, k2, 1, (Integer) null, (String) null, (String) null, str8, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, c, b, aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: b */
    public final String mo84462b() {
        boolean z;
        if (this.f71119c.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f71119c;
        }
        throw new IllegalArgumentException("[screenTemplate] parameter must not be empty.".toString());
    }

    /* renamed from: c */
    public final String mo84463c() {
        boolean z;
        if (this.f71118b.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f71118b;
        }
        throw new IllegalArgumentException("[screenName] parameter must not be empty.".toString());
    }

    /* renamed from: t */
    public void mo77657t(@C12579k OfferProductModel offerProductModel, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        ProductCategoryDomain q;
        OfferDiscountType z;
        Intrinsics.checkNotNullParameter(offerProductModel, "product");
        C13783a aVar = this.f71117a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[16];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, mo84462b());
        pairArr[2] = C11078d1.m42659a("screen_name", mo84463c());
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, mo84462b());
        pairArr[4] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[5] = C11078d1.m42659a("ecommerce_zone", mo84461a());
        pairArr[6] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[7] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str12 = null;
        if (W != null) {
            str = W.mo115984e();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[8] = C11078d1.m42659a("product_cdBase", str);
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115986f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_EAN", str2);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[10] = C11078d1.m42659a("product_name", str3);
        String n = OfferProductModelKt.m159592n(offerProductModel);
        if (n == null) {
            n = "";
        }
        pairArr[11] = C11078d1.m42659a(C28526d.f68907d0, n);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[12] = C11078d1.m42659a("product_promotionsName", str4);
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 == null || (z = w2.mo115961z()) == null) {
            str5 = null;
        } else {
            str5 = z.mo118123y();
        }
        if (str5 == null) {
            str5 = "";
        }
        pairArr[13] = C11078d1.m42659a("product_promotionsType", str5);
        pairArr[14] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        String K0 = offerProductModel.mo121498K0();
        if (K0 == null) {
            K0 = "";
        }
        pairArr[15] = C11078d1.m42659a(C28526d.f68908d1, K0);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_CART;
        String c = mo84463c();
        String b = mo84462b();
        String c2 = mo84463c();
        float k = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str6 = o02.mo121898z();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str8 = o03.mo121889s();
        } else {
            str8 = null;
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q = o04.mo121887q()) == null) {
            str10 = null;
        } else {
            str10 = q.mo116513j();
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str12 = offerProductModel.mo121498K0();
        }
        C13789a aVar2 = r12;
        C13789a aVar3 = new C13789a(c2, k, (String) null, C10976s.m41419k(new C13803j(str7, str9, str11, 0, k2, 1, (Integer) null, (String) null, (String) null, str12, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, c, b, aVar2);
        aVar.mo32711n(hVarArr);
    }
}
