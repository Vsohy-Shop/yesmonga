package com.carrefour.fid.android.product.presentation.analytics;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.OfferDiscount;
import com.carrefour.fid.android.product.presentation.models.extensions.C27659c;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28547h2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.product.presentation.analytics.g */
public final class C27637g implements C27636f {
    @C12579k

    /* renamed from: a */
    public final C13783a f67142a;

    @Inject
    public C27637g(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f67142a = aVar;
    }

    /* renamed from: B */
    public void mo80277B(@C12579k Offer offer) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        if (offer.mo118010S().mo118436e0()) {
            str = "2";
        } else {
            str = "1";
        }
        C13783a.m58667i(this.f67142a, "product-details", "fiche-produit", C10975r0.m41401k(C11078d1.m42659a("product_business", str)), false, false, false, 56, (Object) null);
        C13783a aVar = this.f67142a;
        C13813h[] hVarArr = new C13813h[1];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM;
        float parseFloat = Float.parseFloat(C27659c.m116363a(offer));
        String S = offer.mo118010S().mo118418S();
        String P = offer.mo118010S().mo118415P();
        ProductCategory H = offer.mo118010S().mo118407H();
        if (H != null) {
            str2 = H.mo117297q();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        String str4 = str2;
        float parseFloat2 = Float.parseFloat(C27659c.m116363a(offer));
        if (C13786d.m58689b(firebaseEventKey)) {
            str3 = "undefined";
        } else {
            str3 = null;
        }
        C13789a aVar2 = r7;
        C13789a aVar3 = new C13789a("fiche-produit", parseFloat, (String) null, C10976s.m41419k(new C13803j(S, P, str4, (Integer) null, parseFloat2, (Integer) null, 1, (String) null, (String) null, str3, C16717v.C16720c.f42235v, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, "fiche-produit", "product-details", aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: S */
    public void mo80278S() {
        C13783a.m58668o(this.f67142a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "fiche-produit"), C11078d1.m42659a(C28526d.f68906d, "product-details"), C11078d1.m42659a(C28526d.f68933j, "ecoscore"), C11078d1.m42659a(C28526d.f68929i, "ecommerce")), false, 2, (Object) null);
    }

    /* renamed from: U */
    public void mo80279U() {
        C13783a.m58668o(this.f67142a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "fiche-produit"), C11078d1.m42659a(C28526d.f68906d, "product-details"), C11078d1.m42659a(C28526d.f68933j, "info-panachage-produit"), C11078d1.m42659a(C28526d.f68929i, "ecommerce")), false, 2, (Object) null);
    }

    /* renamed from: W */
    public void mo80280W(@C12579k Offer offer) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        C13783a aVar = this.f67142a;
        C13813h[] hVarArr = new C13813h[2];
        Map j0 = C10977s0.m41469j0(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "fiche-produit"), C11078d1.m42659a(C28526d.f68906d, "product-details"), C11078d1.m42659a("ecommerce_action", "add"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("product_cdBase", offer.mo118001J().mo118134e()), C11078d1.m42659a("product_EAN", offer.mo118001J().mo118136f()), C11078d1.m42659a(C28526d.f68907d0, C27659c.m116363a(offer)), C11078d1.m42659a(C28526d.f68930i0, "1"));
        OfferDiscount F = offer.mo117997F();
        if (F != null) {
            j0.put("product_promotionsType", F.mo118087z().mo118123y());
            OfferDiscount F2 = offer.mo117997F();
            if (F2 != null) {
                str3 = F2.mo118082v();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            j0.put("product_promotionsName", str3);
        }
        hVarArr[0] = new C13785c(j0, false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_CART;
        float parseFloat = Float.parseFloat(C27659c.m116363a(offer));
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
        float parseFloat2 = Float.parseFloat(C27659c.m116363a(offer));
        if (C13786d.m58689b(firebaseEventKey)) {
            str2 = "undefined";
        } else {
            str2 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "fiche-produit", "product-details", new C13789a("fiche-produit", parseFloat, (String) null, C10976s.m41419k(new C13803j(S, P, str, (Integer) null, parseFloat2, 1, 1, (String) null, (String) null, str2, C22132b.f56831b, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: d */
    public void mo80281d(@C12579k Offer offer) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        C13783a aVar = this.f67142a;
        C13813h[] hVarArr = new C13813h[2];
        hVarArr[0] = new C13785c(C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "fiche-produit"), C11078d1.m42659a(C28526d.f68906d, "product-details"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68837M1), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("ecommerce_action", "add"), C11078d1.m42659a("product_EAN", offer.mo118001J().mo118136f()), C11078d1.m42659a("product_name", offer.mo118010S().mo118418S()), C11078d1.m42659a(C28526d.f68907d0, C27659c.m116363a(offer))), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_WISHLIST;
        float parseFloat = Float.parseFloat(C27659c.m116363a(offer));
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
        float parseFloat2 = Float.parseFloat(C27659c.m116363a(offer));
        if (C13786d.m58689b(firebaseEventKey)) {
            str2 = "undefined";
        } else {
            str2 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "fiche-produit", "product-details", new C13789a("fiche-produit", parseFloat, (String) null, C10976s.m41419k(new C13803j(S, P, str3, (Integer) null, parseFloat2, 1, 1, (String) null, (String) null, str2, C22132b.f56831b, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: g */
    public void mo80282g(@C12579k Offer offer) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        C13783a aVar = this.f67142a;
        C13813h[] hVarArr = new C13813h[2];
        Map j0 = C10977s0.m41469j0(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "fiche-produit"), C11078d1.m42659a(C28526d.f68906d, "product-details"), C11078d1.m42659a("ecommerce_action", "remove"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("product_cdBase", offer.mo118001J().mo118134e()), C11078d1.m42659a("product_EAN", offer.mo118001J().mo118136f()), C11078d1.m42659a(C28526d.f68907d0, C27659c.m116363a(offer)), C11078d1.m42659a(C28526d.f68930i0, "1"));
        OfferDiscount F = offer.mo117997F();
        if (F != null) {
            j0.put("product_promotionsType", F.mo118087z().mo118123y());
            OfferDiscount F2 = offer.mo117997F();
            if (F2 != null) {
                str3 = F2.mo118082v();
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            j0.put("product_promotionsName", str3);
        }
        hVarArr[0] = new C13785c(j0, false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_CART;
        float parseFloat = Float.parseFloat(C27659c.m116363a(offer));
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
        float parseFloat2 = Float.parseFloat(C27659c.m116363a(offer));
        if (C13786d.m58689b(firebaseEventKey)) {
            str2 = "undefined";
        } else {
            str2 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "fiche-produit", "product-details", new C13789a("fiche-produit", parseFloat, (String) null, C10976s.m41419k(new C13803j(S, P, str, (Integer) null, parseFloat2, 1, 1, (String) null, (String) null, str2, C22132b.f56831b, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: j */
    public void mo80283j(@C12579k Offer offer) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(offer, C28547h2.f69318f);
        C13783a aVar = this.f67142a;
        C13813h[] hVarArr = new C13813h[2];
        hVarArr[0] = new C13785c(C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "fiche-produit"), C11078d1.m42659a(C28526d.f68906d, "product-details"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68841N1), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("ecommerce_action", "remove"), C11078d1.m42659a("product_EAN", offer.mo118001J().mo118136f()), C11078d1.m42659a("product_name", offer.mo118010S().mo118418S()), C11078d1.m42659a(C28526d.f68907d0, C27659c.m116363a(offer))), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_WISHLIST;
        float parseFloat = Float.parseFloat(C27659c.m116363a(offer));
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
        float parseFloat2 = Float.parseFloat(C27659c.m116363a(offer));
        if (C13786d.m58689b(firebaseEventKey)) {
            str2 = "undefined";
        } else {
            str2 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "fiche-produit", "product-details", new C13789a("fiche-produit", parseFloat, (String) null, C10976s.m41419k(new C13803j(S, P, str3, (Integer) null, parseFloat2, 1, 1, (String) null, (String) null, str2, C22132b.f56831b, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }
}
