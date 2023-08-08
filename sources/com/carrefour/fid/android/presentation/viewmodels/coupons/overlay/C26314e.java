package com.carrefour.fid.android.presentation.viewmodels.coupons.overlay;

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
import com.carrefour.fid.android.shared.constant.C28526d;
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

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOverlayProductsBottomSheetAnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayProductsBottomSheetAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayProductsBottomSheetAnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n1864#2,2:406\n1559#2:408\n1590#2,4:409\n1866#2:413\n*S KotlinDebug\n*F\n+ 1 OverlayProductsBottomSheetAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/coupons/overlay/OverlayProductsBottomSheetAnalyticsViewModel\n*L\n120#1:406,2\n128#1:408\n128#1:409,4\n120#1:413\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.coupons.overlay.e */
public final class C26314e {

    /* renamed from: b */
    public static final int f64322b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f64323a;

    @Inject
    public C26314e(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f64323a = aVar;
    }

    /* renamed from: a */
    public final void mo76578a(@C12579k List<? extends OfferProductModel> list) {
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
        int i = 10;
        int i2 = 0;
        for (Object next : CollectionsKt___CollectionsKt.m40523K1(list2, 10)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C13783a aVar = this.f64323a;
            C13813h[] hVarArr = new C13813h[1];
            FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
            String name = FirebaseItemListName.COUPONS.name();
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
            hVarArr[0] = new C13812g(firebaseEventKey, "coupons-online", "coupons", new C13790b(name, (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
            aVar.mo32711n(hVarArr);
            i2 = i3;
            i = 10;
        }
    }

    /* renamed from: b */
    public final void mo76579b(@C12579k List<? extends OfferProductModel> list) {
        Intrinsics.checkNotNullParameter(list, "productList");
        C13783a.m58668o(this.f64323a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "coupons"), C11078d1.m42659a("screen_name", "coupons-online"), C11078d1.m42659a("ecommerce_zone", "coupons-online"), C11078d1.m42659a("list_size_product", String.valueOf(list.size())), C11078d1.m42659a("list_name_product", "coupons-online")), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo76580c(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        C13783a aVar = this.f64323a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[13];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "coupons");
        pairArr[2] = C11078d1.m42659a("screen_name", "coupons-online");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[5] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[6] = C11078d1.m42659a("ecommerce_zone", "coupons-online");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str24 = null;
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
        if (str2 == null) {
            str2 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_cdBase", str2);
        pairArr[10] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_name", str3);
        pairArr[12] = C11078d1.m42659a(C28526d.f68912e0, "coupons");
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        FirebaseItemListName firebaseItemListName = FirebaseItemListName.COUPONS;
        String name = firebaseItemListName.name();
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str4 = o02.mo121898z();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str6 = o03.mo121889s();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q3 = o04.mo121887q()) == null) {
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
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str10 = offerProductModel.mo121498K0();
        } else {
            str10 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "coupons-online", "coupons", new C13806m(name, (String) null, new C13802i(str5, str7, str9, i2, k, q4, (Integer) null, (String) null, str10, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String name2 = firebaseItemListName.name();
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str11 = o05.mo121898z();
        } else {
            str11 = null;
        }
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 != null) {
            str13 = o06.mo121889s();
        } else {
            str13 = null;
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 == null || (q2 = o07.mo121887q()) == null) {
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
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str17 = offerProductModel.mo121498K0();
        } else {
            str17 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, "coupons-online", "coupons", new C13807n(name2, (String) null, new C13802i(str12, str14, str16, i2, k2, q5, (Integer) null, (String) null, str17, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        String name3 = firebaseItemListName.name();
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str18 = o08.mo121898z();
        } else {
            str18 = null;
        }
        if (str18 == null) {
            str19 = "";
        } else {
            str19 = str18;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 != null) {
            str20 = o09.mo121889s();
        } else {
            str20 = null;
        }
        if (str20 == null) {
            str21 = "";
        } else {
            str21 = str20;
        }
        ProductModel o010 = offerProductModel.mo121517o0();
        if (o010 == null || (q = o010.mo121887q()) == null) {
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
        hVarArr[3] = new C13812g(firebaseEventKey3, "coupons-online", "coupons", new C13789a(name3, k3, (String) null, C10976s.m41419k(new C13803j(str19, str21, str23, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str24, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: d */
    public final void mo76581d(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        C13783a aVar = this.f64323a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[13];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "coupons");
        pairArr[2] = C11078d1.m42659a("screen_name", "coupons-online");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[5] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[6] = C11078d1.m42659a("ecommerce_zone", "coupons-online");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str24 = null;
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
        if (str2 == null) {
            str2 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_cdBase", str2);
        pairArr[10] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_name", str3);
        pairArr[12] = C11078d1.m42659a(C28526d.f68912e0, "coupons");
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        FirebaseItemListName firebaseItemListName = FirebaseItemListName.COUPONS;
        String name = firebaseItemListName.name();
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str4 = o02.mo121898z();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str6 = o03.mo121889s();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q3 = o04.mo121887q()) == null) {
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
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str10 = offerProductModel.mo121498K0();
        } else {
            str10 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "coupons-online", "coupons", new C13806m(name, (String) null, new C13802i(str5, str7, str9, i2, k, q4, (Integer) null, (String) null, str10, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String name2 = firebaseItemListName.name();
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str11 = o05.mo121898z();
        } else {
            str11 = null;
        }
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 != null) {
            str13 = o06.mo121889s();
        } else {
            str13 = null;
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 == null || (q2 = o07.mo121887q()) == null) {
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
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str17 = offerProductModel.mo121498K0();
        } else {
            str17 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, "coupons-online", "coupons", new C13807n(name2, (String) null, new C13802i(str12, str14, str16, i2, k2, q5, (Integer) null, (String) null, str17, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        String name3 = firebaseItemListName.name();
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str18 = o08.mo121898z();
        } else {
            str18 = null;
        }
        if (str18 == null) {
            str19 = "";
        } else {
            str19 = str18;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 != null) {
            str20 = o09.mo121889s();
        } else {
            str20 = null;
        }
        if (str20 == null) {
            str21 = "";
        } else {
            str21 = str20;
        }
        ProductModel o010 = offerProductModel.mo121517o0();
        if (o010 == null || (q = o010.mo121887q()) == null) {
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
        hVarArr[3] = new C13812g(firebaseEventKey3, "coupons-online", "coupons", new C13789a(name3, k3, (String) null, C10976s.m41419k(new C13803j(str19, str21, str23, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str24, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: e */
    public final void mo76582e(@C12579k OfferProductModel offerProductModel, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        ProductCategoryDomain q;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f64323a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[13];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "coupons");
        pairArr[2] = C11078d1.m42659a("screen_name", "coupons-online");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68837M1);
        pairArr[5] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[6] = C11078d1.m42659a("ecommerce_zone", "coupons-online");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str10 = null;
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
        if (str2 == null) {
            str2 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_cdBase", str2);
        pairArr[10] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(offerProductModel.mo121519p0()));
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_name", str3);
        pairArr[12] = C11078d1.m42659a(C28526d.f68912e0, "coupons");
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_WISHLIST;
        String name = FirebaseItemListName.COUPONS.name();
        float k = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str4 = o02.mo121898z();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str6 = o03.mo121889s();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q = o04.mo121887q()) == null) {
            str8 = null;
        } else {
            str8 = q.mo116513j();
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        Integer valueOf = Integer.valueOf(i);
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str10 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "coupons-online", "coupons", new C13789a(name, k, (String) null, C10976s.m41419k(new C13803j(str5, str7, str9, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str10, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: f */
    public final void mo76583f(@C12579k OfferProductModel offerProductModel, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        ProductCategoryDomain q;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f64323a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[13];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "coupons");
        pairArr[2] = C11078d1.m42659a("screen_name", "coupons-online");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68841N1);
        pairArr[5] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[6] = C11078d1.m42659a("ecommerce_zone", "coupons-online");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str10 = null;
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
        if (str2 == null) {
            str2 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_cdBase", str2);
        pairArr[10] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(offerProductModel.mo121519p0()));
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_name", str3);
        pairArr[12] = C11078d1.m42659a(C28526d.f68912e0, "coupons");
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_WISHLIST;
        String name = FirebaseItemListName.COUPONS.name();
        float k = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str4 = o02.mo121898z();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str6 = o03.mo121889s();
        } else {
            str6 = null;
        }
        if (str6 == null) {
            str7 = "";
        } else {
            str7 = str6;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q = o04.mo121887q()) == null) {
            str8 = null;
        } else {
            str8 = q.mo116513j();
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        Integer valueOf = Integer.valueOf(i);
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str10 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "coupons-online", "coupons", new C13789a(name, k, (String) null, C10976s.m41419k(new C13803j(str5, str7, str9, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str10, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: g */
    public final void mo76584g(@C12579k OfferProductModel offerProductModel, int i) {
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
        C13783a aVar = this.f64323a;
        C13813h[] hVarArr = new C13813h[2];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        FirebaseItemListName firebaseItemListName = FirebaseItemListName.COUPONS;
        String name = firebaseItemListName.name();
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
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q3 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str7 = offerProductModel.mo121498K0();
        } else {
            str7 = null;
        }
        C13806m mVar = r6;
        C13806m mVar2 = new C13806m(name, (String) null, new C13802i(str2, str4, str6, i, k, q3, (Integer) null, (String) null, str7, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, "coupons-online", "coupons", mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String name2 = firebaseItemListName.name();
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
        hVarArr[1] = new C13812g(firebaseEventKey2, "coupons-online", "coupons", new C13807n(name2, (String) null, new C13802i(str9, str11, str13, i, k2, q4, (Integer) null, (String) null, str14, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }
}
