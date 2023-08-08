package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13802i;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13806m;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13807n;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28536f1;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.contentsquare.android.api.C14092c;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.e */
public final class C29001e implements C28999d {

    /* renamed from: c */
    public static final int f71095c = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f71096a;

    /* renamed from: b */
    public boolean f71097b;

    @Inject
    public C29001e(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71096a = aVar;
    }

    /* renamed from: E */
    public void mo77645E(@C12580l String str, @C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "productList");
        if (!this.f71097b) {
            this.f71097b = true;
            String a = C28536f1.f69200a.mo83425a(str);
            String valueOf = String.valueOf(OfferProductModelKt.m159580b(list));
            String valueOf2 = String.valueOf(OfferProductModelKt.m159595q(list));
            String valueOf3 = String.valueOf(OfferProductModelKt.m159586h(list));
            String valueOf4 = String.valueOf(Integer.parseInt(valueOf2) - Integer.parseInt(valueOf3));
            C13783a.m58667i(this.f71096a, "mes-produits", a, C10977s0.m41456W(C11078d1.m42659a("list_name_product", a), C11078d1.m42659a("list_size_product", String.valueOf(list.size())), C11078d1.m42659a("list_size_productDispo", valueOf), C11078d1.m42659a("list_size_productIndispo", valueOf2), C11078d1.m42659a("list_size_productIndispoA", valueOf3), C11078d1.m42659a("list_size_productIndispoS", valueOf4)), false, false, false, 56, (Object) null);
        }
    }

    /* renamed from: J */
    public void mo77647J(@C12580l String str, @C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        String str22 = str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f71096a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[11];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str22);
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mes-produits");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "mes-produits");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str23 = null;
        if (W != null) {
            str2 = W.mo115986f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[7] = C11078d1.m42659a("product_EAN", str2);
        pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        pairArr[9] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        pairArr[10] = C11078d1.m42659a(C28526d.f68908d1, offerProductModel.mo121498K0());
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str24 = "recommande-pour-vous-" + str22;
        String str25 = "recommande-pour-vous-" + str22;
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str5 = o02.mo121889s();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 == null || (q3 = o03.mo121887q()) == null) {
            str7 = null;
        } else {
            str7 = q3.mo116513j();
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.RECOMMENDATION;
        hVarArr[1] = new C13812g(firebaseEventKey, str24, "mes-produits", new C13806m(str25, (String) null, new C13802i(str4, str6, str8, i2, k, firebaseProductDimension.mo32726q(), (Integer) null, (String) null, offerProductModel.mo121498K0(), C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String str26 = "recommande-pour-vous-" + str22;
        String str27 = "recommande-pour-vous-" + str22;
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 != null) {
            str9 = o04.mo121898z();
        } else {
            str9 = null;
        }
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str11 = o05.mo121889s();
        } else {
            str11 = null;
        }
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 == null || (q2 = o06.mo121887q()) == null) {
            str13 = null;
        } else {
            str13 = q2.mo116513j();
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str15 = offerProductModel.mo121498K0();
        } else {
            str15 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, str26, "mes-produits", new C13807n(str27, (String) null, new C13802i(str10, str12, str14, i2, k2, q4, (Integer) null, (String) null, str15, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        String str28 = "recommande-pour-vous-" + str22;
        String str29 = "recommande-pour-vous-" + str22;
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 != null) {
            str16 = o07.mo121898z();
        } else {
            str16 = null;
        }
        if (str16 == null) {
            str17 = "";
        } else {
            str17 = str16;
        }
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str18 = o08.mo121889s();
        } else {
            str18 = null;
        }
        if (str18 == null) {
            str19 = "";
        } else {
            str19 = str18;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 == null || (q = o09.mo121887q()) == null) {
            str20 = null;
        } else {
            str20 = q.mo116513j();
        }
        if (str20 == null) {
            str21 = "";
        } else {
            str21 = str20;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str23 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, str28, "mes-produits", new C13789a(str29, k3, (String) null, C10976s.m41419k(new C13803j(str17, str19, str21, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str23, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: b */
    public void mo77652b(@C12580l String str) {
        C13783a aVar = this.f71096a;
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mes-produits"), C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68868U0)), false, 2, (Object) null);
    }

    /* renamed from: q */
    public void mo77656q(@C12580l String str) {
        C13783a aVar = this.f71096a;
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mes-produits"), C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68864T0)), false, 2, (Object) null);
    }
}
