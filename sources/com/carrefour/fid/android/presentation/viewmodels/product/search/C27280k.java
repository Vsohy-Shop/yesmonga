package com.carrefour.fid.android.presentation.viewmodels.product.search;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13790b;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13802i;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13806m;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13807n;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseItemListName;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.contentsquare.android.api.C14092c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductSearchWithListRecommendationResultsAnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSearchWithListRecommendationResultsAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListRecommendationResultsAnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,306:1\n1864#2,2:307\n1559#2:309\n1590#2,4:310\n1866#2:314\n*S KotlinDebug\n*F\n+ 1 ProductSearchWithListRecommendationResultsAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/search/ProductSearchWithListRecommendationResultsAnalyticsViewModel\n*L\n116#1:307,2\n124#1:309\n124#1:310,4\n116#1:314\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.search.k */
public final class C27280k {

    /* renamed from: c */
    public static final int f66263c = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f66264a;

    /* renamed from: b */
    public int f66265b;

    @Inject
    public C27280k(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f66264a = aVar;
    }

    /* renamed from: g */
    public static /* synthetic */ void m115098g(C27280k kVar, OfferProductModel offerProductModel, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        kVar.mo79321f(offerProductModel, z, i, i2);
    }

    /* renamed from: a */
    public final int mo79316a() {
        return this.f66265b;
    }

    /* renamed from: b */
    public final void mo79317b(@C12579k List<? extends OfferProductModel> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        OfferDiscountType z;
        ProductCategoryDomain q;
        List<? extends OfferProductModel> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "offers");
        if (list.size() != this.f66265b) {
            int i = 10;
            int i2 = 0;
            for (Object next : CollectionsKt___CollectionsKt.m40523K1(list2, 10)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                C13783a aVar = this.f66264a;
                C13813h[] hVarArr = new C13813h[1];
                FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
                Iterable iterable = (List) next;
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, i));
                int i4 = 0;
                for (Object next2 : iterable) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    OfferProductModel offerProductModel = (OfferProductModel) next2;
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
                    Integer valueOf = Integer.valueOf((i2 * 10) + i4 + 1);
                    float k = OfferProductModelKt.m159589k(offerProductModel);
                    OfferDiscountDomain w = offerProductModel.mo121523w();
                    if (w == null || (z = w.mo115961z()) == null) {
                        str7 = null;
                    } else {
                        str7 = z.mo118123y();
                    }
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                    if (C13786d.m58689b(FirebaseEventKey.VIEW_ITEM_LIST)) {
                        str9 = offerProductModel.mo121498K0();
                    } else {
                        str9 = null;
                    }
                    arrayList.add(new C13804k(str2, str4, str6, valueOf, (String) null, k, str8, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, str9, 3984, (DefaultConstructorMarker) null));
                    i4 = i5;
                }
                hVarArr[0] = new C13812g(firebaseEventKey, "recommander-pour-moi-recherche-multiple", "mon-memo-course", new C13790b("recommander-pour-moi-recherche-multiple", (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
                aVar.mo32711n(hVarArr);
                i2 = i3;
                i = 10;
            }
            this.f66265b = list.size();
        }
    }

    /* renamed from: c */
    public final void mo79318c() {
        C13783a.m58667i(this.f66264a, "mon-memo-course", "recommander-pour-moi-recherche-multiple", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: d */
    public final void mo79319d() {
        C13783a.m58667i(this.f66264a, "mon-memo-course", "erreur-affichage", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: e */
    public final void mo79320e(int i) {
        this.f66265b = i;
    }

    /* renamed from: f */
    public final void mo79321f(@C12579k OfferProductModel offerProductModel, boolean z, int i, int i2) {
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
        String str22;
        String str23;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f66264a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[13];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "recommander-pour-moi-recherche-multiple");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mon-memo-course");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        if (z) {
            str = C28526d.f68888Z0;
        } else {
            str = C28526d.f68955o1;
        }
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, str);
        pairArr[6] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[7] = C11078d1.m42659a("ecommerce_zone", "mon-memo-course");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str24 = null;
        if (W != null) {
            str2 = W.mo115986f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[8] = C11078d1.m42659a("product_EAN", str2);
        pairArr[9] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str3 = W2.mo115984e();
        } else {
            str3 = null;
        }
        pairArr[10] = C11078d1.m42659a("product_cdBase", str3);
        pairArr[11] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        pairArr[12] = C11078d1.m42659a(C28526d.f68912e0, C28515a1.f68703k);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        FirebaseItemListName firebaseItemListName = FirebaseItemListName.RECOMMENDATIONS;
        String q4 = firebaseItemListName.mo32725q();
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str4 = o0.mo121898z();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str6 = o02.mo121889s();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 == null || (q3 = o03.mo121887q()) == null) {
            str8 = null;
        } else {
            str8 = q3.mo116513j();
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.RECOMMENDATION;
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str10 = offerProductModel.mo121498K0();
        } else {
            str10 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "recommander-pour-moi-recherche-multiple", "mon-memo-course", new C13806m(q4, (String) null, new C13802i(str5, str7, str9, i2, k, q5, (Integer) null, (String) null, str10, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String q6 = firebaseItemListName.mo32725q();
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 != null) {
            str11 = o04.mo121898z();
        } else {
            str11 = null;
        }
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str13 = o05.mo121889s();
        } else {
            str13 = null;
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 == null || (q2 = o06.mo121887q()) == null) {
            str15 = null;
        } else {
            str15 = q2.mo116513j();
        }
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q7 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str17 = offerProductModel.mo121498K0();
        } else {
            str17 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, "recommander-pour-moi-recherche-multiple", "mon-memo-course", new C13807n(q6, (String) null, new C13802i(str12, str14, str16, i2, k2, q7, (Integer) null, (String) null, str17, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        String q8 = firebaseItemListName.mo32725q();
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 != null) {
            str18 = o07.mo121898z();
        } else {
            str18 = null;
        }
        if (str18 == null) {
            str19 = "";
        } else {
            str19 = str18;
        }
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str20 = o08.mo121889s();
        } else {
            str20 = null;
        }
        if (str20 == null) {
            str21 = "";
        } else {
            str21 = str20;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 == null || (q = o09.mo121887q()) == null) {
            str22 = null;
        } else {
            str22 = q.mo116513j();
        }
        if (str22 == null) {
            str23 = "";
        } else {
            str23 = str22;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str24 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, "recommander-pour-moi-recherche-multiple", "mon-memo-course", new C13789a(q8, k3, (String) null, C10976s.m41419k(new C13803j(str19, str21, str23, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str24, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: h */
    public final void mo79322h(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        String str22;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f66264a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[12];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "recommander-pour-moi-recherche-multiple");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mon-memo-course");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[5] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[6] = C11078d1.m42659a("ecommerce_zone", "mon-memo-course");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str23 = null;
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a("product_EAN", str);
        pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115984e();
        } else {
            str2 = null;
        }
        pairArr[9] = C11078d1.m42659a("product_cdBase", str2);
        pairArr[10] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        pairArr[11] = C11078d1.m42659a(C28526d.f68912e0, C28515a1.f68703k);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        FirebaseItemListName firebaseItemListName = FirebaseItemListName.RECOMMENDATIONS;
        String q4 = firebaseItemListName.mo32725q();
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
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str9 = offerProductModel.mo121498K0();
        } else {
            str9 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "recommander-pour-moi-recherche-multiple", "mon-memo-course", new C13806m(q4, (String) null, new C13802i(str4, str6, str8, i2, k, q5, (Integer) null, (String) null, str9, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String q6 = firebaseItemListName.mo32725q();
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 != null) {
            str10 = o04.mo121898z();
        } else {
            str10 = null;
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str12 = o05.mo121889s();
        } else {
            str12 = null;
        }
        if (str12 == null) {
            str13 = "";
        } else {
            str13 = str12;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 == null || (q2 = o06.mo121887q()) == null) {
            str14 = null;
        } else {
            str14 = q2.mo116513j();
        }
        if (str14 == null) {
            str15 = "";
        } else {
            str15 = str14;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q7 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str16 = offerProductModel.mo121498K0();
        } else {
            str16 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, "recommander-pour-moi-recherche-multiple", "mon-memo-course", new C13807n(q6, (String) null, new C13802i(str11, str13, str15, i2, k2, q7, (Integer) null, (String) null, str16, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 != null) {
            str17 = o07.mo121898z();
        } else {
            str17 = null;
        }
        if (str17 == null) {
            str18 = "";
        } else {
            str18 = str17;
        }
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str19 = o08.mo121889s();
        } else {
            str19 = null;
        }
        if (str19 == null) {
            str20 = "";
        } else {
            str20 = str19;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 == null || (q = o09.mo121887q()) == null) {
            str21 = null;
        } else {
            str21 = q.mo116513j();
        }
        if (str21 == null) {
            str22 = "";
        } else {
            str22 = str21;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str23 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, "recommander-pour-moi-recherche-multiple", "mon-memo-course", new C13789a("recommander-pour-moi-recherche-multiple", k3, (String) null, C10976s.m41419k(new C13803j(str18, str20, str22, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str23, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: i */
    public final void mo79323i(@C12579k OfferProductModel offerProductModel, int i) {
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
        String str12;
        String str13;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f66264a;
        C13813h[] hVarArr = new C13813h[2];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        FirebaseItemListName firebaseItemListName = FirebaseItemListName.RECOMMENDATIONS;
        String q3 = firebaseItemListName.mo32725q();
        ProductModel o0 = offerProductModel.mo121517o0();
        String str14 = null;
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
        if (o03 == null || (q2 = o03.mo121887q()) == null) {
            str5 = null;
        } else {
            str5 = q2.mo116513j();
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.RECOMMENDATION;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str7 = offerProductModel.mo121498K0();
        } else {
            str7 = null;
        }
        C13806m mVar = r6;
        C13806m mVar2 = new C13806m(q3, (String) null, new C13802i(str2, str4, str6, i, k, q4, (Integer) null, (String) null, str7, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, "recommander-pour-moi-recherche-multiple", "mon-memo-course", mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String q5 = firebaseItemListName.mo32725q();
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 != null) {
            str8 = o04.mo121898z();
        } else {
            str8 = null;
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str10 = o05.mo121889s();
        } else {
            str10 = null;
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 == null || (q = o06.mo121887q()) == null) {
            str12 = null;
        } else {
            str12 = q.mo116513j();
        }
        if (str12 == null) {
            str13 = "";
        } else {
            str13 = str12;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q6 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str14 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey2, "recommander-pour-moi-recherche-multiple", "mon-memo-course", new C13807n(q5, (String) null, new C13802i(str9, str11, str13, i, k2, q6, (Integer) null, (String) null, str14, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }
}
