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
import com.carrefour.fid.android.shared.constant.C28536f1;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.contentsquare.android.api.C14092c;
import java.util.ArrayList;
import java.util.List;
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
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nBasketBuilderDepartmentAnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBuilderDepartmentAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderDepartmentAnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n1864#2,2:400\n1559#2:402\n1590#2,4:403\n1866#2:407\n*S KotlinDebug\n*F\n+ 1 BasketBuilderDepartmentAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/basketbuilder/BasketBuilderDepartmentAnalyticsViewModel\n*L\n75#1:400,2\n83#1:402\n83#1:403,4\n75#1:407\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.a */
public final class C25948a {

    /* renamed from: b */
    public static final int f63478b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f63479a;

    @Inject
    public C25948a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f63479a = aVar;
    }

    /* renamed from: j */
    public static /* synthetic */ void m111103j(C25948a aVar, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        aVar.mo75372i(str, list);
    }

    /* renamed from: a */
    public final void mo75364a(@C12580l String str, @C12579k List<? extends OfferProductModel> list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        OfferDiscountType z;
        ProductCategoryDomain q;
        String str11 = str;
        List<? extends OfferProductModel> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "offers");
        int i = 10;
        int i2 = 0;
        for (Object next : CollectionsKt___CollectionsKt.m40523K1(list2, 10)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C13783a aVar = this.f63479a;
            C13813h[] hVarArr = new C13813h[1];
            FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
            String str12 = "recommande-pour-vous-" + str11;
            String str13 = "recommande-pour-vous-" + str11;
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
                Integer valueOf = Integer.valueOf((i2 * 10) + i4 + 1);
                float k = OfferProductModelKt.m159589k(offerProductModel);
                OfferDiscountDomain w = offerProductModel.mo121523w();
                if (w == null || (z = w.mo115961z()) == null) {
                    str8 = null;
                } else {
                    str8 = z.mo118123y();
                }
                if (str8 == null) {
                    str9 = "";
                } else {
                    str9 = str8;
                }
                if (C13786d.m58689b(FirebaseEventKey.VIEW_ITEM_LIST)) {
                    str10 = offerProductModel.mo121498K0();
                } else {
                    str10 = null;
                }
                arrayList.add(new C13804k(str3, str5, str7, valueOf, (String) null, k, str9, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, str10, 3984, (DefaultConstructorMarker) null));
                i4 = i5;
            }
            hVarArr[0] = new C13812g(firebaseEventKey, str12, "mes-produits", new C13790b(str13, (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
            aVar.mo32711n(hVarArr);
            i2 = i3;
            i = 10;
        }
    }

    /* renamed from: b */
    public final void mo75365b(@C12580l String str, @C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        String str23 = str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63479a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[11];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str23);
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mes-produits");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "mes-produits");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
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
        pairArr[7] = C11078d1.m42659a("product_EAN", str2);
        pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        pairArr[9] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        pairArr[10] = C11078d1.m42659a(C28526d.f68908d1, offerProductModel.mo121498K0());
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str25 = "recommande-pour-vous-" + str23;
        String str26 = "recommande-pour-vous-" + str23;
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
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str9 = offerProductModel.mo121498K0();
        } else {
            str9 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, str25, "mes-produits", new C13806m(str26, (String) null, new C13802i(str4, str6, str8, i2, k, q4, (Integer) null, (String) null, str9, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String str27 = "recommande-pour-vous-" + str23;
        String str28 = "recommande-pour-vous-" + str23;
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
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str16 = offerProductModel.mo121498K0();
        } else {
            str16 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, str27, "mes-produits", new C13807n(str28, (String) null, new C13802i(str11, str13, str15, i2, k2, q5, (Integer) null, (String) null, str16, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        String str29 = "recommande-pour-vous-" + str23;
        String str30 = "recommande-pour-vous-" + str23;
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
            str24 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, str29, "mes-produits", new C13789a(str30, k3, (String) null, C10976s.m41419k(new C13803j(str18, str20, str22, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str24, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: c */
    public final void mo75366c(@C12580l String str, @C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        String str23 = str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63479a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[11];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str23);
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mes-produits");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "mes-produits");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
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
        pairArr[7] = C11078d1.m42659a("product_EAN", str2);
        pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        pairArr[9] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        pairArr[10] = C11078d1.m42659a(C28526d.f68908d1, offerProductModel.mo121498K0());
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str25 = "recommande-pour-vous-" + str23;
        String str26 = "recommande-pour-vous-" + str23;
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
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str9 = offerProductModel.mo121498K0();
        } else {
            str9 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, str25, "mes-produits", new C13806m(str26, (String) null, new C13802i(str4, str6, str8, i2, k, q4, (Integer) null, (String) null, str9, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String str27 = "recommande-pour-vous-" + str23;
        String str28 = "recommande-pour-vous-" + str23;
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
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str16 = offerProductModel.mo121498K0();
        } else {
            str16 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, str27, "mes-produits", new C13807n(str28, (String) null, new C13802i(str11, str13, str15, i2, k2, q5, (Integer) null, (String) null, str16, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        String str29 = "recommande-pour-vous-" + str23;
        String str30 = "recommande-pour-vous-" + str23;
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
            str24 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, str29, "mes-produits", new C13789a(str30, k3, (String) null, C10976s.m41419k(new C13803j(str18, str20, str22, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str24, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: d */
    public final void mo75367d(@C12580l String str) {
        C13783a aVar = this.f63479a;
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mes-produits"), C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68868U0)), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo75368e(@C12580l String str, @C12579k OfferProductModel offerProductModel, int i) {
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
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        String str15 = str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63479a;
        C13813h[] hVarArr = new C13813h[2];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str16 = "recommande-pour-vous-" + str15;
        String str17 = "recommande-pour-vous-" + str15;
        ProductModel o0 = offerProductModel.mo121517o0();
        String str18 = null;
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
        if (o03 == null || (q2 = o03.mo121887q()) == null) {
            str6 = null;
        } else {
            str6 = q2.mo116513j();
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q3 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str8 = offerProductModel.mo121498K0();
        } else {
            str8 = null;
        }
        C13806m mVar = r9;
        C13806m mVar2 = new C13806m(str17, (String) null, new C13802i(str3, str5, str7, i, k, q3, (Integer) null, (String) null, str8, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, str16, "mes-produits", mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String str19 = "recommande-pour-vous-" + str15;
        String str20 = "recommande-pour-vous-" + str15;
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
        if (o06 == null || (q = o06.mo121887q()) == null) {
            str13 = null;
        } else {
            str13 = q.mo116513j();
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str18 = offerProductModel.mo121498K0();
        }
        C13807n nVar = r10;
        C13807n nVar2 = new C13807n(str20, (String) null, new C13802i(str10, str12, str14, i, k2, q4, (Integer) null, (String) null, str18, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey2, str19, "mes-produits", nVar);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: f */
    public final void mo75369f(@C12580l String str, @C12579k OfferProductModel offerProductModel, int i) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ProductCategoryDomain q;
        String str9 = str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63479a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[10];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str9);
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mes-produits");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "mes-produits");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68837M1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str10 = null;
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
        pairArr[9] = C11078d1.m42659a(C28526d.f68908d1, offerProductModel.mo121498K0());
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_WISHLIST;
        String str11 = "recommande-pour-vous-" + str9;
        String str12 = "recommande-pour-vous-" + str9;
        float k = OfferProductModelKt.m159589k(offerProductModel);
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
        if (o03 == null || (q = o03.mo121887q()) == null) {
            str7 = null;
        } else {
            str7 = q.mo116513j();
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        Integer valueOf = Integer.valueOf(i);
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str10 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, str11, "mes-produits", new C13789a(str12, k, (String) null, C10976s.m41419k(new C13803j(str4, str6, str8, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str10, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: g */
    public final void mo75370g(@C12580l String str, @C12579k OfferProductModel offerProductModel, int i) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ProductCategoryDomain q;
        String str9 = str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63479a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[10];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str9);
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "mes-produits");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "mes-produits");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68841N1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str10 = null;
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
        pairArr[9] = C11078d1.m42659a(C28526d.f68908d1, offerProductModel.mo121498K0());
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_WISHLIST;
        String str11 = "recommande-pour-vous-" + str9;
        String str12 = "recommande-pour-vous-" + str9;
        float k = OfferProductModelKt.m159589k(offerProductModel);
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
        if (o03 == null || (q = o03.mo121887q()) == null) {
            str7 = null;
        } else {
            str7 = q.mo116513j();
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        Integer valueOf = Integer.valueOf(i);
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str10 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, str11, "mes-produits", new C13789a(str12, k, (String) null, C10976s.m41419k(new C13803j(str4, str6, str8, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str10, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: h */
    public final void mo75371h(@C12580l String str) {
        C13783a aVar = this.f63479a;
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mes-produits"), C11078d1.m42659a("screen_name", "recommande-pour-vous-" + str), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68864T0)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo75372i(@C12580l String str, @C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "productList");
        String a = C28536f1.f69200a.mo83425a(str);
        String valueOf = String.valueOf(OfferProductModelKt.m159580b(list));
        String valueOf2 = String.valueOf(OfferProductModelKt.m159595q(list));
        String valueOf3 = String.valueOf(OfferProductModelKt.m159586h(list));
        String valueOf4 = String.valueOf(Integer.parseInt(valueOf2) - Integer.parseInt(valueOf3));
        C13783a.m58667i(this.f63479a, "mes-produits", a, C10977s0.m41456W(C11078d1.m42659a("list_name_product", a), C11078d1.m42659a("list_size_product", String.valueOf(list.size())), C11078d1.m42659a("list_size_productDispo", valueOf), C11078d1.m42659a("list_size_productIndispo", valueOf2), C11078d1.m42659a("list_size_productIndispoA", valueOf3), C11078d1.m42659a("list_size_productIndispoS", valueOf4)), false, false, false, 56, (Object) null);
    }
}
