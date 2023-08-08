package com.carrefour.fid.android.product.presentation.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13790b;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13796h;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13802i;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13806m;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13807n;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.models.extensions.C27661d;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28592s1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAlternativeProductsAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsAnalytics.kt\ncom/carrefour/fid/android/product/presentation/analytics/AlternativeProductsAnalytics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n1569#2,11:248\n1864#2,2:259\n1866#2:262\n1580#2:263\n1#3:261\n*S KotlinDebug\n*F\n+ 1 AlternativeProductsAnalytics.kt\ncom/carrefour/fid/android/product/presentation/analytics/AlternativeProductsAnalytics\n*L\n46#1:248,11\n46#1:259,2\n46#1:262\n46#1:263\n46#1:261\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.analytics.a */
public final class C27631a {

    /* renamed from: e */
    public static final int f67119e = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f67120a;
    @C12579k

    /* renamed from: b */
    public final String f67121b = "product-list";
    @C12579k

    /* renamed from: c */
    public final String f67122c = C28592s1.f69856p;
    @C12579k

    /* renamed from: d */
    public final String f67123d = "moins-cher";

    @Inject
    public C27631a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f67120a = aVar;
    }

    /* renamed from: a */
    public final C13812g mo80240a(C38115c cVar, C38115c cVar2, FirebaseEventKey firebaseEventKey, int i, int i2) {
        Double d;
        float f;
        float f2;
        String str;
        String str2;
        C13812g gVar;
        PlpOffer i3 = C27662e.m116389i(cVar2);
        PlpOffer i4 = C27662e.m116389i(cVar);
        if (i4 != null) {
            d = Double.valueOf(C27661d.m116376c(i4));
        } else {
            d = null;
        }
        String str3 = this.f67122c;
        String str4 = this.f67121b;
        String str5 = this.f67123d;
        float f3 = 0.0f;
        if (i3 != null) {
            f = (float) C27661d.m116376c(i3);
        } else {
            f = 0.0f;
        }
        String A = cVar.mo118850A();
        if (d != null) {
            f2 = (float) d.doubleValue();
        } else {
            f2 = 0.0f;
        }
        String D = cVar2.mo118853D();
        String A2 = cVar2.mo118850A();
        ProductCategory v = cVar2.mo118885v();
        if (v != null) {
            str = v.mo117297q();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str6 = str;
        Integer valueOf = Integer.valueOf(i);
        if (i3 != null) {
            f3 = (float) C27661d.m116376c(i3);
        }
        float f4 = f3;
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(C27662e.m116383c(cVar2));
        String a = C13796h.C13798b.f33600b.mo32724a();
        String q = FirebaseProductDimension.CLASSIC.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str2 = "undefined";
        } else {
            str2 = null;
        }
        gVar = new C13812g(firebaseEventKey, str3, str4, new C13789a(str5, f, (String) null, C10976s.m41419k(new C13803j(D, A2, str6, valueOf, f4, valueOf2, valueOf3, a, q, str2)), A, Float.valueOf(f2), 4, (DefaultConstructorMarker) null));
        return gVar;
    }

    /* renamed from: b */
    public final C13812g mo80241b(C38115c cVar, C38115c cVar2, int i) {
        Double d;
        float f;
        String str;
        PlpOffer i2 = C27662e.m116389i(cVar2);
        PlpOffer i3 = C27662e.m116389i(cVar);
        String str2 = null;
        if (i3 != null) {
            d = Double.valueOf(C27661d.m116376c(i3));
        } else {
            d = null;
        }
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str3 = this.f67122c;
        String str4 = this.f67121b;
        String str5 = this.f67123d;
        String A = cVar.mo118850A();
        float f2 = 0.0f;
        if (d != null) {
            f = (float) d.doubleValue();
        } else {
            f = 0.0f;
        }
        String D = cVar2.mo118853D();
        String A2 = cVar2.mo118850A();
        ProductCategory v = cVar2.mo118885v();
        if (v != null) {
            str = v.mo117297q();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str6 = str;
        if (i2 != null) {
            f2 = (float) C27661d.m116376c(i2);
        }
        float f3 = f2;
        String q = FirebaseProductDimension.CLASSIC.mo32726q();
        Integer valueOf = Integer.valueOf(C27662e.m116383c(cVar2));
        String a = C13796h.C13798b.f33600b.mo32724a();
        if (C13786d.m58689b(firebaseEventKey)) {
            str2 = "undefined";
        }
        return new C13812g(firebaseEventKey, str3, str4, new C13806m(str5, (String) null, new C13802i(D, A2, str6, i, f3, q, valueOf, a, str2), (Integer) null, (String) null, A, Float.valueOf(f), 26, (DefaultConstructorMarker) null));
    }

    /* renamed from: c */
    public final C13812g mo80242c(C38115c cVar, C38115c cVar2, int i) {
        Double d;
        float f;
        String str;
        PlpOffer i2 = C27662e.m116389i(cVar2);
        PlpOffer i3 = C27662e.m116389i(cVar);
        String str2 = null;
        if (i3 != null) {
            d = Double.valueOf(C27661d.m116376c(i3));
        } else {
            d = null;
        }
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_ITEM;
        String str3 = this.f67122c;
        String str4 = this.f67121b;
        String str5 = this.f67123d;
        String A = cVar.mo118850A();
        float f2 = 0.0f;
        if (d != null) {
            f = (float) d.doubleValue();
        } else {
            f = 0.0f;
        }
        String D = cVar2.mo118853D();
        String A2 = cVar2.mo118850A();
        ProductCategory v = cVar2.mo118885v();
        if (v != null) {
            str = v.mo117297q();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str6 = str;
        if (i2 != null) {
            f2 = (float) C27661d.m116376c(i2);
        }
        float f3 = f2;
        String q = FirebaseProductDimension.CLASSIC.mo32726q();
        Integer valueOf = Integer.valueOf(C27662e.m116383c(cVar2));
        String a = C13796h.C13798b.f33600b.mo32724a();
        if (C13786d.m58689b(firebaseEventKey)) {
            str2 = "undefined";
        }
        return new C13812g(firebaseEventKey, str3, str4, new C13807n(str5, (String) null, new C13802i(D, A2, str6, i, f3, q, valueOf, a, str2), (Integer) null, (String) null, A, Float.valueOf(f), 26, (DefaultConstructorMarker) null));
    }

    /* renamed from: d */
    public final void mo80243d() {
        C13783a.m58667i(this.f67120a, "product-list", C28592s1.f69856p, (Map) null, false, false, true, 28, (Object) null);
    }

    /* renamed from: e */
    public final void mo80244e(@C12579k C38115c cVar, @C12579k C38115c cVar2, int i, int i2) {
        Intrinsics.checkNotNullParameter(cVar, "initialProduct");
        Intrinsics.checkNotNullParameter(cVar2, "addedProduct");
        if (C27662e.m116389i(cVar2) != null) {
            this.f67120a.mo32711n(mo80241b(cVar, cVar2, i2), mo80242c(cVar, cVar2, i2), mo80240a(cVar, cVar2, FirebaseEventKey.ADD_TO_CART, i2, i));
        }
    }

    /* renamed from: f */
    public final void mo80245f(@C12579k C38115c cVar, @C12579k C38115c cVar2, int i, int i2) {
        Intrinsics.checkNotNullParameter(cVar, "initialProduct");
        Intrinsics.checkNotNullParameter(cVar2, "removedProduct");
        if (C27662e.m116389i(cVar2) != null) {
            this.f67120a.mo32711n(mo80241b(cVar, cVar2, i2), mo80242c(cVar, cVar2, i2), mo80240a(cVar, cVar2, FirebaseEventKey.REMOVE_FROM_CART, i2, i));
        }
    }

    /* renamed from: g */
    public final void mo80246g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "initialProductGtin");
        C13783a.m58668o(this.f67120a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", this.f67122c), C11078d1.m42659a(C28526d.f68906d, this.f67121b), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "produit-moins-cher-probleme-api"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo80247h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "initialProductGtin");
        C13783a.m58668o(this.f67120a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", this.f67122c), C11078d1.m42659a(C28526d.f68906d, this.f67121b), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "produit-moins-cher-deja-selectionne"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo80248i(@C12579k C38115c cVar, @C12579k List<C38115c> list) {
        Double d;
        float f;
        C13783a aVar;
        C13804k kVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        PromoType A;
        C38115c cVar2 = cVar;
        List<C38115c> list2 = list;
        Intrinsics.checkNotNullParameter(cVar2, "initialProduct");
        Intrinsics.checkNotNullParameter(list2, "alternativeProducts");
        List T5 = CollectionsKt___CollectionsKt.m40572T5(list2);
        T5.add(0, cVar2);
        PlpOffer i = C27662e.m116389i(cVar);
        if (i != null) {
            d = Double.valueOf(C27661d.m116376c(i));
        } else {
            d = null;
        }
        C13783a aVar2 = this.f67120a;
        C13813h[] hVarArr = new C13813h[1];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
        String str6 = this.f67122c;
        String str7 = this.f67121b;
        String str8 = this.f67123d;
        String A2 = cVar.mo118850A();
        if (d != null) {
            f = (float) d.doubleValue();
        } else {
            f = 0.0f;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object next : T5) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C38115c cVar3 = (C38115c) next;
            PlpOffer i4 = C27662e.m116389i(cVar3);
            if (i4 == null) {
                aVar = aVar2;
                kVar = null;
            } else {
                String D = cVar3.mo118853D();
                String A3 = cVar3.mo118850A();
                ProductCategory v = cVar3.mo118885v();
                if (v != null) {
                    str = v.mo117297q();
                } else {
                    str = null;
                }
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                Integer valueOf = Integer.valueOf(i3);
                aVar = aVar2;
                float c = (float) C27661d.m116376c(i4);
                Discount b = C27661d.m116375b(i4);
                if (b == null || (A = b.mo117953A()) == null) {
                    str3 = null;
                } else {
                    str3 = A.name();
                }
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                Integer valueOf2 = Integer.valueOf(C27662e.m116383c(cVar3));
                String a = C27662e.m116397q(cVar3, i4).mo32724a();
                String q = FirebaseProductDimension.CLASSIC.mo32726q();
                if (C13786d.m58689b(FirebaseEventKey.VIEW_ITEM_LIST)) {
                    str5 = "undefined";
                } else {
                    str5 = null;
                }
                kVar = new C13804k(D, A3, str2, valueOf, (String) null, c, str4, (Integer) null, valueOf2, a, q, (Integer) null, str5, 2192, (DefaultConstructorMarker) null);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
            i2 = i3;
            aVar2 = aVar;
        }
        hVarArr[0] = new C13812g(firebaseEventKey, str6, str7, new C13790b(str8, (String) null, arrayList, A2, Float.valueOf(f), 2, (DefaultConstructorMarker) null));
        aVar2.mo32711n(hVarArr);
    }
}
