package com.carrefour.fid.android.product.presentation.analytics;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
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
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.presentation.models.extensions.C27661d;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.product.presentation.viewmodel.list.ProductListSource;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28592s1;
import com.carrefour.fid.android.shared.constant.C28606w1;
import com.carrefour.fid.android.shared.constant.C28623z0;
import com.google.firebase.installations.local.C33093b;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nPlpProductAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlpProductAnalytics.kt\ncom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,591:1\n1864#2,2:592\n1569#2,11:594\n1864#2,2:605\n1866#2:608\n1580#2:609\n1866#2:610\n1#3:607\n*S KotlinDebug\n*F\n+ 1 PlpProductAnalytics.kt\ncom/carrefour/fid/android/product/presentation/analytics/PlpProductAnalytics\n*L\n253#1:592,2\n261#1:594,11\n261#1:605,2\n261#1:608\n261#1:609\n253#1:610\n261#1:607\n*E\n"})
public final class PlpProductAnalytics {

    /* renamed from: i */
    public static final int f67109i = 8;
    @C12579k

    /* renamed from: a */
    public final Context f67110a;
    @C12579k

    /* renamed from: b */
    public final C13783a f67111b;
    @C12579k

    /* renamed from: c */
    public final C13814a f67112c;

    /* renamed from: d */
    public String f67113d;

    /* renamed from: e */
    public String f67114e;

    /* renamed from: f */
    public int f67115f;

    /* renamed from: g */
    public int f67116g;

    /* renamed from: h */
    public ProductListSource f67117h;

    @Inject
    public PlpProductAnalytics(@C10255b @C12579k Context context, @C12579k C13783a aVar, @C12579k C13814a aVar2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        this.f67110a = context;
        this.f67111b = aVar;
        this.f67112c = aVar2;
    }

    /* renamed from: a */
    public final void mo80224a(@C12579k ProductListSource productListSource) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(productListSource, "source");
        this.f67117h = productListSource;
        boolean z = productListSource instanceof ProductListSource.Search;
        if (z) {
            str = "search";
        } else {
            str = "product-list";
        }
        this.f67113d = str;
        if (z) {
            str2 = C28606w1.f69975l;
        } else if (productListSource instanceof ProductListSource.Promo) {
            str2 = C28592s1.f69855o;
        } else if (productListSource instanceof ProductListSource.Department) {
            str2 = ((ProductListSource.Department) productListSource).mo82059d().mo117297q();
        } else {
            str2 = new String();
        }
        this.f67114e = str2;
    }

    /* renamed from: b */
    public final void mo80225b() {
        this.f67115f = 0;
    }

    /* renamed from: c */
    public final void mo80226c(ProductListSource productListSource, List<C38114b> list, int i) {
        String str;
        ProductListSource productListSource2 = productListSource;
        String str2 = "";
        if (this.f67116g == 1) {
            str = CollectionsKt___CollectionsKt.m40639h3(list, C33093b.f80279g, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, PlpProductAnalytics$sendScreenView$listProductEanValue$1.f67118f, 30, (Object) null);
        } else {
            str = str2;
        }
        if (productListSource2 instanceof ProductListSource.Search) {
            C13783a aVar = this.f67111b;
            C13783a aVar2 = aVar;
            C13783a.m58667i(aVar2, "search", C28606w1.f69975l, C10977s0.m41456W(C11078d1.m42659a("list_page", String.valueOf(this.f67116g)), C11078d1.m42659a("list_size_product", "0"), C11078d1.m42659a("list_name_product", C28606w1.f69975l), C11078d1.m42659a("search_keywords", ((ProductListSource.Search) productListSource2).mo82101d()), C11078d1.m42659a("search_resultsNumber", "0"), C11078d1.m42659a("list_product_EAN", str)), false, true, false, 40, (Object) null);
        } else if (productListSource2 instanceof ProductListSource.Promo) {
            C13783a aVar3 = this.f67111b;
            C13783a aVar4 = aVar3;
            C13783a.m58667i(aVar4, "product-list", C28592s1.f69855o, C10977s0.m41456W(C11078d1.m42659a("list_page", String.valueOf(this.f67116g)), C11078d1.m42659a("list_size_product", "0"), C11078d1.m42659a("list_name_product", C28592s1.f69855o), C11078d1.m42659a("screen_cat1ID", "group_8"), C11078d1.m42659a("screen_cat1Name", "Offres du moment"), C11078d1.m42659a("list_product_EAN", str)), false, true, false, 40, (Object) null);
        } else if (productListSource2 instanceof ProductListSource.Department) {
            C13783a aVar5 = this.f67111b;
            ProductListSource.Department department = (ProductListSource.Department) productListSource2;
            String q = department.mo82059d().mo117297q();
            Pair[] pairArr = new Pair[9];
            pairArr[0] = C11078d1.m42659a("list_page", String.valueOf(this.f67116g));
            pairArr[1] = C11078d1.m42659a("list_size_product", String.valueOf(i));
            pairArr[2] = C11078d1.m42659a("list_name_product", department.mo82059d().mo117297q());
            String str3 = department.mo82059d().mo117292l().get(2);
            if (str3 == null) {
                str3 = str2;
            }
            pairArr[3] = C11078d1.m42659a("screen_cat2Name", str3);
            String str4 = department.mo82059d().mo117292l().get(1);
            if (str4 == null) {
                str4 = str2;
            }
            pairArr[4] = C11078d1.m42659a("screen_cat1Name", str4);
            String str5 = department.mo82059d().mo117292l().get(3);
            if (str5 == null) {
                str5 = str2;
            }
            pairArr[5] = C11078d1.m42659a("screen_cat3Name", str5);
            String str6 = department.mo82059d().mo117292l().get(4);
            if (str6 != null) {
                str2 = str6;
            }
            pairArr[6] = C11078d1.m42659a("screen_cat4Name", str2);
            pairArr[7] = C11078d1.m42659a(C28592s1.f69848h, C28592s1.f69841a.mo83494a(department.mo82059d().mo117292l().size()));
            pairArr[8] = C11078d1.m42659a("list_product_EAN", str);
            C13783a.m58667i(aVar5, "product-list", q, C10977s0.m41456W(pairArr), true, true, false, 32, (Object) null);
        }
    }

    /* renamed from: d */
    public final void mo80227d(@C12579k C38115c cVar, int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C13783a aVar;
        String str7;
        String str8;
        String str9;
        String str10;
        C13783a aVar2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        PromoType A;
        int i3 = i;
        Intrinsics.checkNotNullParameter(cVar, "product");
        PlpOffer i4 = C27662e.m116389i(cVar);
        if (i4 != null) {
            if (i3 == 1) {
                mo80232i(cVar.mo118850A(), i3);
            }
            C13783a aVar3 = this.f67111b;
            C13813h[] hVarArr = new C13813h[4];
            Pair[] pairArr = new Pair[14];
            pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
            String str17 = this.f67114e;
            if (str17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str17 = null;
            }
            pairArr[1] = C11078d1.m42659a("screen_name", str17);
            String str18 = this.f67113d;
            if (str18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str18 = null;
            }
            pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str18);
            pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
            String str19 = this.f67113d;
            if (str19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str19 = null;
            }
            pairArr[4] = C11078d1.m42659a("ecommerce_zone", str19);
            pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
            pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
            pairArr[7] = C11078d1.m42659a("product_cdBase", i4.mo118819v().mo118134e());
            pairArr[8] = C11078d1.m42659a("product_EAN", cVar.mo118850A());
            pairArr[9] = C11078d1.m42659a("product_name", cVar.mo118853D());
            pairArr[10] = C11078d1.m42659a(C28526d.f68907d0, String.valueOf(C27661d.m116376c(i4)));
            Discount b = C27661d.m116375b(i4);
            if (b != null) {
                str = b.mo117986x();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            pairArr[11] = C11078d1.m42659a("product_promotionsName", str);
            Discount b2 = C27661d.m116375b(i4);
            if (b2 == null || (A = b2.mo117953A()) == null) {
                str2 = null;
            } else {
                str2 = A.name();
            }
            if (str2 == null) {
                str2 = "";
            }
            pairArr[12] = C11078d1.m42659a("product_promotionsType", str2);
            pairArr[13] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
            hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
            FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
            String str20 = this.f67114e;
            if (str20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str20 = null;
            }
            String str21 = this.f67113d;
            if (str21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str21 = null;
            }
            String str22 = this.f67114e;
            if (str22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str3 = null;
            } else {
                str3 = str22;
            }
            String D = cVar.mo118853D();
            String A2 = cVar.mo118850A();
            ProductCategory v = cVar.mo118885v();
            if (v != null) {
                str4 = v.mo117297q();
            } else {
                str4 = null;
            }
            if (str4 == null) {
                aVar = aVar3;
                str6 = "";
                str5 = str6;
            } else {
                str5 = "";
                str6 = str4;
                aVar = aVar3;
            }
            float c = (float) C27661d.m116376c(i4);
            FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
            String q = firebaseProductDimension.mo32726q();
            Integer valueOf = Integer.valueOf(C27662e.m116383c(cVar));
            C13796h.C13798b bVar = C13796h.C13798b.f33600b;
            String a = bVar.mo32724a();
            if (C13786d.m58689b(firebaseEventKey)) {
                str7 = "undefined";
            } else {
                str7 = null;
            }
            hVarArr[1] = new C13812g(firebaseEventKey, str20, str21, new C13806m(str3, (String) null, new C13802i(D, A2, str6, i2, c, q, valueOf, a, str7), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
            FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
            String str23 = this.f67114e;
            if (str23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str23 = null;
            }
            String str24 = this.f67113d;
            if (str24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str24 = null;
            }
            String str25 = this.f67114e;
            if (str25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str8 = null;
            } else {
                str8 = str25;
            }
            String D2 = cVar.mo118853D();
            String A3 = cVar.mo118850A();
            ProductCategory v2 = cVar.mo118885v();
            if (v2 != null) {
                str9 = v2.mo117297q();
            } else {
                str9 = null;
            }
            if (str9 == null) {
                aVar2 = aVar;
                str11 = "screenClass";
                str10 = str5;
            } else {
                str10 = str9;
                aVar2 = aVar;
                str11 = "screenClass";
            }
            float c2 = (float) C27661d.m116376c(i4);
            String q2 = firebaseProductDimension.mo32726q();
            Integer valueOf2 = Integer.valueOf(C27662e.m116383c(cVar));
            String a2 = bVar.mo32724a();
            if (C13786d.m58689b(firebaseEventKey2)) {
                str12 = "undefined";
            } else {
                str12 = null;
            }
            hVarArr[2] = new C13812g(firebaseEventKey2, str23, str24, new C13807n(str8, (String) null, new C13802i(D2, A3, str10, i2, c2, q2, valueOf2, a2, str12), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
            FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
            String str26 = this.f67114e;
            if (str26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str26 = null;
            }
            String str27 = this.f67113d;
            if (str27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str11);
                str27 = null;
            }
            String str28 = this.f67114e;
            if (str28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str13 = null;
            } else {
                str13 = str28;
            }
            float c3 = (float) C27661d.m116376c(i4);
            String D3 = cVar.mo118853D();
            String A4 = cVar.mo118850A();
            ProductCategory v3 = cVar.mo118885v();
            if (v3 != null) {
                str14 = v3.mo117297q();
            } else {
                str14 = null;
            }
            if (str14 == null) {
                str15 = str5;
            } else {
                str15 = str14;
            }
            Integer valueOf3 = Integer.valueOf(i2);
            float c4 = (float) C27661d.m116376c(i4);
            Integer valueOf4 = Integer.valueOf(i);
            Integer valueOf5 = Integer.valueOf(C27662e.m116383c(cVar));
            String a3 = bVar.mo32724a();
            if (C13786d.m58689b(firebaseEventKey3)) {
                str16 = "undefined";
            } else {
                str16 = null;
            }
            hVarArr[3] = new C13812g(firebaseEventKey3, str26, str27, new C13789a(str13, c3, (String) null, C10976s.m41419k(new C13803j(D3, A4, str15, valueOf3, c4, valueOf4, valueOf5, a3, (String) null, str16, 256, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
            aVar2.mo32711n(hVarArr);
        }
    }

    /* renamed from: e */
    public final void mo80228e() {
        C13783a aVar = this.f67111b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str = this.f67114e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str);
        String str2 = this.f67113d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str2 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str2);
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, "info-panachage-produit");
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo80229f(@C12579k C38115c cVar, int i, int i2) {
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
        PromoType A;
        Intrinsics.checkNotNullParameter(cVar, "product");
        PlpOffer i3 = C27662e.m116389i(cVar);
        if (i3 != null) {
            C13783a aVar = this.f67111b;
            C13813h[] hVarArr = new C13813h[4];
            Pair[] pairArr = new Pair[14];
            pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
            String str15 = this.f67114e;
            if (str15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str15 = null;
            }
            pairArr[1] = C11078d1.m42659a("screen_name", str15);
            String str16 = this.f67113d;
            if (str16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str16 = null;
            }
            pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str16);
            pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
            String str17 = this.f67113d;
            if (str17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str17 = null;
            }
            pairArr[4] = C11078d1.m42659a("ecommerce_zone", str17);
            pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
            pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
            pairArr[7] = C11078d1.m42659a("product_cdBase", i3.mo118819v().mo118134e());
            pairArr[8] = C11078d1.m42659a("product_EAN", cVar.mo118850A());
            pairArr[9] = C11078d1.m42659a("product_name", cVar.mo118853D());
            pairArr[10] = C11078d1.m42659a(C28526d.f68907d0, String.valueOf(C27661d.m116376c(i3)));
            Discount b = C27661d.m116375b(i3);
            if (b != null) {
                str = b.mo117986x();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            pairArr[11] = C11078d1.m42659a("product_promotionsName", str);
            Discount b2 = C27661d.m116375b(i3);
            if (b2 == null || (A = b2.mo117953A()) == null) {
                str2 = null;
            } else {
                str2 = A.name();
            }
            if (str2 == null) {
                str2 = "";
            }
            pairArr[12] = C11078d1.m42659a("product_promotionsType", str2);
            pairArr[13] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
            hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
            FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
            String str18 = this.f67114e;
            if (str18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str18 = null;
            }
            String str19 = this.f67113d;
            if (str19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str19 = null;
            }
            String str20 = this.f67114e;
            if (str20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str3 = null;
            } else {
                str3 = str20;
            }
            String D = cVar.mo118853D();
            String A2 = cVar.mo118850A();
            ProductCategory v = cVar.mo118885v();
            if (v != null) {
                str4 = v.mo117297q();
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str5 = "";
            } else {
                str5 = str4;
            }
            String str21 = "screenClass";
            float c = (float) C27661d.m116376c(i3);
            FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
            String q = firebaseProductDimension.mo32726q();
            Integer valueOf = Integer.valueOf(C27662e.m116383c(cVar));
            C13796h.C13798b bVar = C13796h.C13798b.f33600b;
            String a = bVar.mo32724a();
            if (C13786d.m58689b(firebaseEventKey)) {
                str6 = "undefined";
            } else {
                str6 = null;
            }
            hVarArr[1] = new C13812g(firebaseEventKey, str18, str19, new C13806m(str3, (String) null, new C13802i(D, A2, str5, i2, c, q, valueOf, a, str6), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
            FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
            String str22 = this.f67114e;
            if (str22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str22 = null;
            }
            String str23 = this.f67113d;
            if (str23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str21);
                str23 = null;
            }
            String str24 = this.f67114e;
            if (str24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str7 = null;
            } else {
                str7 = str24;
            }
            String D2 = cVar.mo118853D();
            String A3 = cVar.mo118850A();
            ProductCategory v2 = cVar.mo118885v();
            if (v2 != null) {
                str8 = v2.mo117297q();
            } else {
                str8 = null;
            }
            if (str8 == null) {
                str9 = "";
            } else {
                str9 = str8;
            }
            float c2 = (float) C27661d.m116376c(i3);
            String q2 = firebaseProductDimension.mo32726q();
            Integer valueOf2 = Integer.valueOf(C27662e.m116383c(cVar));
            String a2 = bVar.mo32724a();
            if (C13786d.m58689b(firebaseEventKey2)) {
                str10 = "undefined";
            } else {
                str10 = null;
            }
            hVarArr[2] = new C13812g(firebaseEventKey2, str22, str23, new C13807n(str7, (String) null, new C13802i(D2, A3, str9, i2, c2, q2, valueOf2, a2, str10), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
            FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
            String str25 = this.f67114e;
            if (str25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str25 = null;
            }
            String str26 = this.f67113d;
            if (str26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str21);
                str26 = null;
            }
            String str27 = this.f67114e;
            if (str27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str11 = null;
            } else {
                str11 = str27;
            }
            float c3 = (float) C27661d.m116376c(i3);
            String D3 = cVar.mo118853D();
            String A4 = cVar.mo118850A();
            ProductCategory v3 = cVar.mo118885v();
            if (v3 != null) {
                str12 = v3.mo117297q();
            } else {
                str12 = null;
            }
            if (str12 == null) {
                str13 = "";
            } else {
                str13 = str12;
            }
            Integer valueOf3 = Integer.valueOf(i2);
            float c4 = (float) C27661d.m116376c(i3);
            Integer valueOf4 = Integer.valueOf(i);
            Integer valueOf5 = Integer.valueOf(C27662e.m116383c(cVar));
            String a3 = bVar.mo32724a();
            if (C13786d.m58689b(firebaseEventKey3)) {
                str14 = "undefined";
            } else {
                str14 = null;
            }
            hVarArr[3] = new C13812g(firebaseEventKey3, str25, str26, new C13789a(str11, c3, (String) null, C10976s.m41419k(new C13803j(D3, A4, str13, valueOf3, c4, valueOf4, valueOf5, a3, (String) null, str14, 256, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
            aVar.mo32711n(hVarArr);
        }
    }

    /* renamed from: g */
    public final void mo80230g() {
        C13783a aVar = this.f67111b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str = this.f67114e;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str);
        String str2 = this.f67113d;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str2 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str2);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68868U0);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo80231h(@C12579k C38115c cVar, int i, boolean z) {
        FirebaseEventKey firebaseEventKey;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(cVar, "product");
        PlpOffer i2 = C27662e.m116389i(cVar);
        if (i2 != null) {
            if (z) {
                firebaseEventKey = FirebaseEventKey.ADD_TO_WISHLIST;
            } else {
                firebaseEventKey = FirebaseEventKey.REMOVE_FROM_WISHLIST;
            }
            C13783a aVar = this.f67111b;
            C13813h[] hVarArr = new C13813h[2];
            Pair[] pairArr = new Pair[9];
            pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
            String str5 = this.f67114e;
            String str6 = null;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str5 = null;
            }
            pairArr[1] = C11078d1.m42659a("screen_name", str5);
            String str7 = this.f67113d;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str7 = null;
            }
            pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str7);
            if (z) {
                str = "add";
            } else {
                str = "remove";
            }
            pairArr[3] = C11078d1.m42659a("ecommerce_action", str);
            if (z) {
                str2 = C28526d.f68837M1;
            } else {
                str2 = C28526d.f68841N1;
            }
            pairArr[4] = C11078d1.m42659a(C28526d.f68933j, str2);
            pairArr[5] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
            pairArr[6] = C11078d1.m42659a("product_EAN", cVar.mo118850A());
            pairArr[7] = C11078d1.m42659a("product_name", cVar.mo118853D());
            pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, String.valueOf(C27661d.m116376c(i2)));
            hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
            String str8 = this.f67114e;
            if (str8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str8 = null;
            }
            String str9 = this.f67113d;
            if (str9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                str9 = null;
            }
            String str10 = this.f67114e;
            if (str10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                str3 = null;
            } else {
                str3 = str10;
            }
            float c = (float) C27661d.m116376c(i2);
            String D = cVar.mo118853D();
            String A = cVar.mo118850A();
            ProductCategory v = cVar.mo118885v();
            if (v != null) {
                str4 = v.mo117297q();
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            String str11 = str4;
            Integer valueOf = Integer.valueOf(i);
            float c2 = (float) C27661d.m116376c(i2);
            if (C13786d.m58689b(firebaseEventKey)) {
                str6 = "undefined";
            }
            hVarArr[1] = new C13812g(firebaseEventKey, str8, str9, new C13789a(str3, c, (String) null, C10976s.m41419k(new C13803j(D, A, str11, valueOf, c2, 1, (Integer) null, (String) null, (String) null, str6, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
            aVar.mo32711n(hVarArr);
        }
    }

    /* renamed from: i */
    public final void mo80232i(String str, int i) {
        this.f67112c.mo32735i(this.f67110a, "af_add_to_cart", C10977s0.m41456W(C11078d1.m42659a("af_add_to_cart", "Oui"), C11078d1.m42659a("af_content_id", str), C11078d1.m42659a("af_quantity", String.valueOf(i))));
    }

    /* renamed from: j */
    public final void mo80233j(C27633c cVar) {
        C13814a aVar = this.f67112c;
        Context context = this.f67110a;
        Pair[] pairArr = new Pair[3];
        String u = cVar.mo80272u();
        if (u == null) {
            u = "";
        }
        pairArr[0] = C11078d1.m42659a("af_content_view", u);
        pairArr[1] = C11078d1.m42659a("af_content_id", cVar.mo80270t());
        pairArr[2] = C11078d1.m42659a("af_quantity", "1");
        aVar.mo32735i(context, "af_content_view", C10977s0.m41456W(pairArr));
    }

    /* renamed from: k */
    public final void mo80234k(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "bannerName");
        C13783a aVar = this.f67111b;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str2 = this.f67114e;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str2 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str2);
        String str3 = this.f67113d;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str3 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str3);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, C28623z0.f70140b);
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, "select-content");
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: l */
    public final void mo80235l(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "bannerName");
        C13783a aVar = this.f67111b;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str2 = this.f67114e;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str2 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str2);
        String str3 = this.f67113d;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str3 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str3);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, C28623z0.f70140b);
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, "view-promotion");
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: m */
    public final void mo80236m() {
        C13783a aVar = this.f67111b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str = this.f67113d;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str = null;
        }
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, str);
        String str2 = this.f67114e;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str2 = null;
        }
        pairArr[2] = C11078d1.m42659a("screen_name", str2);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68864T0);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: n */
    public final void mo80237n(@C12579k List<C38114b> list, @C12579k ProductListSource productListSource) {
        String str;
        int i;
        Iterator it;
        C13804k kVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        PromoType A;
        List<C38114b> list2 = list;
        ProductListSource productListSource2 = productListSource;
        Intrinsics.checkNotNullParameter(list2, "products");
        Intrinsics.checkNotNullParameter(productListSource2, "source");
        int size = list.size();
        int i2 = this.f67115f;
        if (size > i2) {
            int i3 = size - i2;
            int i4 = 1;
            this.f67116g++;
            mo80226c(productListSource2, list2, i3);
            Iterator it2 = CollectionsKt___CollectionsKt.m40523K1(CollectionsKt___CollectionsKt.m40502F5(list2, i3), 10).iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                List list3 = (List) next;
                C13783a aVar = this.f67111b;
                C13813h[] hVarArr = new C13813h[i4];
                FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
                String str7 = this.f67114e;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("screenName");
                    str7 = null;
                }
                String str8 = this.f67113d;
                if (str8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                    str8 = null;
                }
                String str9 = this.f67114e;
                if (str9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("screenName");
                    str = null;
                } else {
                    str = str9;
                }
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                for (Object next2 : list3) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    C38114b bVar = (C38114b) next2;
                    C38115c j = bVar.mo118842j();
                    PlpOffer i9 = C27662e.m116389i(j);
                    if (i9 == null) {
                        i = i4;
                        kVar = null;
                        it = it2;
                    } else {
                        String D = j.mo118853D();
                        String A2 = j.mo118850A();
                        ProductCategory v = j.mo118885v();
                        if (v != null) {
                            str2 = v.mo117297q();
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        int i10 = this.f67115f + (i5 * 10) + i7;
                        i = 1;
                        Integer valueOf = Integer.valueOf(i10 + 1);
                        it = it2;
                        float c = (float) C27661d.m116376c(i9);
                        Discount b = C27661d.m116375b(i9);
                        if (b == null || (A = b.mo117953A()) == null) {
                            str4 = null;
                        } else {
                            str4 = A.name();
                        }
                        if (str4 == null) {
                            str5 = "";
                        } else {
                            str5 = str4;
                        }
                        Integer valueOf2 = Integer.valueOf(C27662e.m116383c(j));
                        String a = C27662e.m116397q(j, i9).mo32724a();
                        Integer valueOf3 = Integer.valueOf(bVar.mo118844l() ? 1 : 0);
                        if (C13786d.m58689b(FirebaseEventKey.VIEW_ITEM_LIST)) {
                            str6 = "undefined";
                        } else {
                            str6 = null;
                        }
                        kVar = new C13804k(D, A2, str3, valueOf, (String) null, c, str5, (Integer) null, valueOf2, a, (String) null, valueOf3, str6, 1168, (DefaultConstructorMarker) null);
                    }
                    if (kVar != null) {
                        arrayList.add(kVar);
                    }
                    List<C38114b> list4 = list;
                    it2 = it;
                    i4 = i;
                    i7 = i8;
                }
                hVarArr[0] = new C13812g(firebaseEventKey, str7, str8, new C13790b(str, (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
                aVar.mo32711n(hVarArr);
                List<C38114b> list5 = list;
                it2 = it2;
                i5 = i6;
                i4 = i4;
            }
            this.f67115f = list.size();
        }
    }

    /* renamed from: o */
    public final void mo80238o(@C12579k C27633c cVar, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(cVar, C28547h2.f69318f);
        mo80233j(cVar);
        C13783a aVar = this.f67111b;
        C13813h[] hVarArr = new C13813h[2];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str9 = this.f67114e;
        if (str9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str9 = null;
        }
        String str10 = this.f67113d;
        if (str10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str10 = null;
        }
        String str11 = this.f67114e;
        if (str11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str = null;
        } else {
            str = str11;
        }
        String u = cVar.mo80272u();
        if (u == null) {
            str2 = "";
        } else {
            str2 = u;
        }
        String t = cVar.mo80270t();
        String o = cVar.mo80265o();
        if (o == null) {
            str3 = "";
        } else {
            str3 = o;
        }
        float parseFloat = Float.parseFloat(cVar.mo80273v());
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q = firebaseProductDimension.mo32726q();
        Integer valueOf = Integer.valueOf(cVar.mo80264n());
        String w = cVar.mo80274w();
        if (C13786d.m58689b(firebaseEventKey)) {
            str4 = "undefined";
        } else {
            str4 = null;
        }
        C13806m mVar = r11;
        C13806m mVar2 = new C13806m(str, (String) null, new C13802i(str2, t, str3, i, parseFloat, q, valueOf, w, str4), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, str9, str10, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String str12 = this.f67114e;
        if (str12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str12 = null;
        }
        String str13 = this.f67113d;
        if (str13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str13 = null;
        }
        String str14 = this.f67114e;
        if (str14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str5 = null;
        } else {
            str5 = str14;
        }
        String u2 = cVar.mo80272u();
        if (u2 == null) {
            str6 = "";
        } else {
            str6 = u2;
        }
        String t2 = cVar.mo80270t();
        String o2 = cVar.mo80265o();
        if (o2 == null) {
            str7 = "";
        } else {
            str7 = o2;
        }
        float parseFloat2 = Float.parseFloat(cVar.mo80273v());
        String q2 = firebaseProductDimension.mo32726q();
        Integer valueOf2 = Integer.valueOf(cVar.mo80264n());
        String w2 = cVar.mo80274w();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str8 = "undefined";
        } else {
            str8 = null;
        }
        C13807n nVar = r9;
        C13807n nVar2 = new C13807n(str5, (String) null, new C13802i(str6, t2, str7, i, parseFloat2, q2, valueOf2, w2, str8), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey2, str12, str13, nVar);
        aVar.mo32711n(hVarArr);
    }
}
