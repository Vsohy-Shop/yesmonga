package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

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
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
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
@C11363r0({"SMAP\nBasketBuilderFrequentPurchasesAnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBuilderFrequentPurchasesAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderFrequentPurchasesAnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n1864#2,2:348\n1559#2:350\n1590#2,4:351\n1866#2:355\n*S KotlinDebug\n*F\n+ 1 BasketBuilderFrequentPurchasesAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderFrequentPurchasesAnalyticsViewModel\n*L\n109#1:348,2\n117#1:350\n117#1:351,4\n109#1:355\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.f */
public final class C25956f {

    /* renamed from: c */
    public static final int f63484c = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f63485a;

    /* renamed from: b */
    public int f63486b;

    @Inject
    public C25956f(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f63485a = aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ void m111125c(C25956f fVar, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fVar.mo75378b(list, z);
    }

    /* renamed from: a */
    public final void mo75377a(@C12579k List<? extends OfferProductModel> list) {
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
        if (list.size() != this.f63486b) {
            int i = 10;
            int i2 = 0;
            for (Object next : CollectionsKt___CollectionsKt.m40523K1(list2, 10)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                C13783a aVar = this.f63485a;
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
                hVarArr[0] = new C13812g(firebaseEventKey, "mes-achats-frequents", "mes-produits", new C13790b("mes-achats-frequents", (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
                aVar.mo32711n(hVarArr);
                i2 = i3;
                i = 10;
            }
            this.f63486b = list.size();
        }
    }

    /* renamed from: b */
    public final void mo75378b(@C12579k List<? extends OfferProductModel> list, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(list, "productList");
        int b = OfferProductModelKt.m159580b(list);
        int q = OfferProductModelKt.m159595q(list);
        String valueOf = String.valueOf(q - OfferProductModelKt.m159586h(list));
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C13783a.m58667i(this.f63485a, "mes-produits", "mes-achats-frequents", C10977s0.m41456W(C11078d1.m42659a("list_name_product", "mes-achats-frequents"), C11078d1.m42659a("list_size_product", String.valueOf(list.size())), C11078d1.m42659a("list_size_productDispo", String.valueOf(b)), C11078d1.m42659a("list_size_productIndispo", String.valueOf(q)), C11078d1.m42659a("list_size_productIndispoS", valueOf), C11078d1.m42659a("screen_error", str)), false, false, false, 56, (Object) null);
    }

    /* renamed from: d */
    public final void mo75379d() {
        C13783a.m58667i(this.f63485a, "mes-produits", "mes-achats-frequents", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: e */
    public final void mo75380e(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63485a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[11];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "mes-achats-frequents");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mes-produits");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "mes-produits");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str22 = null;
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
        pairArr[9] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        pairArr[10] = C11078d1.m42659a(C28526d.f68908d1, offerProductModel.mo121498K0());
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
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
        if (o03 == null || (q3 = o03.mo121887q()) == null) {
            str6 = null;
        } else {
            str6 = q3.mo116513j();
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.RECOMMENDATION;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str8 = offerProductModel.mo121498K0();
        } else {
            str8 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "mes-achats-frequents", "mes-produits", new C13806m("mes-achats-frequents", (String) null, new C13802i(str3, str5, str7, i2, k, q4, (Integer) null, (String) null, str8, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
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
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str15 = offerProductModel.mo121498K0();
        } else {
            str15 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, "mes-achats-frequents", "mes-produits", new C13807n("mes-achats-frequents", (String) null, new C13802i(str10, str12, str14, i2, k2, q5, (Integer) null, (String) null, str15, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
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
            str22 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, "mes-achats-frequents", "mes-produits", new C13789a("mes-achats-frequents", k3, (String) null, C10976s.m41419k(new C13803j(str17, str19, str21, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str22, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: f */
    public final void mo75381f(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63485a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[11];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "mes-achats-frequents");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mes-produits");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "mes-produits");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str22 = null;
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
        pairArr[9] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        pairArr[10] = C11078d1.m42659a(C28526d.f68908d1, offerProductModel.mo121498K0());
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
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
        if (o03 == null || (q3 = o03.mo121887q()) == null) {
            str6 = null;
        } else {
            str6 = q3.mo116513j();
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.RECOMMENDATION;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str8 = offerProductModel.mo121498K0();
        } else {
            str8 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "mes-achats-frequents", "mes-produits", new C13806m("mes-achats-frequents", (String) null, new C13802i(str3, str5, str7, i2, k, q4, (Integer) null, (String) null, str8, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
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
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str15 = offerProductModel.mo121498K0();
        } else {
            str15 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, "mes-achats-frequents", "mes-produits", new C13807n("mes-achats-frequents", (String) null, new C13802i(str10, str12, str14, i2, k2, q5, (Integer) null, (String) null, str15, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
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
            str22 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, "mes-achats-frequents", "mes-produits", new C13789a("mes-achats-frequents", k3, (String) null, C10976s.m41419k(new C13803j(str17, str19, str21, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str22, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: g */
    public final void mo75382g() {
        C13783a.m58668o(this.f63485a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "mes-achats-frequents"), C11078d1.m42659a(C28526d.f68906d, "mes-produits"), C11078d1.m42659a(C28526d.f68929i, "courses-en-5-minutes"), C11078d1.m42659a(C28526d.f68933j, "mes-achats-frequents"), C11078d1.m42659a(C28526d.f68937k, "commencer-mes-courses")), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo75383h() {
        C13783a.m58668o(this.f63485a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mes-produits"), C11078d1.m42659a("screen_name", "mes-achats-frequents"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68868U0)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo75384i(@C12579k OfferProductModel offerProductModel, int i) {
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
        C13783a aVar = this.f63485a;
        C13813h[] hVarArr = new C13813h[2];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
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
        String q3 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str7 = offerProductModel.mo121498K0();
        } else {
            str7 = null;
        }
        C13806m mVar = r6;
        C13806m mVar2 = new C13806m("recommande-pour-vous", (String) null, new C13802i(str2, str4, str6, i, k, q3, (Integer) null, (String) null, str7, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, "mes-achats-frequents", "mes-produits", mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
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
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str14 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey2, "mes-achats-frequents", "mes-produits", new C13807n("recommande-pour-vous", (String) null, new C13802i(str9, str11, str13, i, k2, q4, (Integer) null, (String) null, str14, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: j */
    public final void mo75385j() {
        C13783a.m58668o(this.f63485a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mes-produits"), C11078d1.m42659a("screen_name", "mes-achats-frequents"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68864T0)), false, 2, (Object) null);
    }
}
