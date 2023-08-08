package com.carrefour.fid.android.presentation.viewmodels.product.list;

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
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13802i;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13806m;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13807n;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.DepartmentHeaderModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListResultModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.SortModel;
import com.carrefour.fid.android.presentation.models.extension.C38477m;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28535f0;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28592s1;
import com.carrefour.fid.android.shared.constant.C28606w1;
import com.carrefour.fid.android.shared.constant.C28623z0;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.contentsquare.android.api.C14092c;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
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
@C11363r0({"SMAP\nProductListAnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/list/ProductListAnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,599:1\n1864#2,2:600\n1559#2:602\n1590#2,4:603\n1866#2:607\n*S KotlinDebug\n*F\n+ 1 ProductListAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/product/list/ProductListAnalyticsViewModel\n*L\n173#1:600,2\n181#1:602\n181#1:603,4\n173#1:607\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.list.a */
public final class C27180a {

    /* renamed from: h */
    public static final int f66083h = 8;
    @C12579k

    /* renamed from: a */
    public final Context f66084a;
    @C12579k

    /* renamed from: b */
    public final C13783a f66085b;
    @C12579k

    /* renamed from: c */
    public final C13814a f66086c;
    @C12580l

    /* renamed from: d */
    public ProductListSettingsModel f66087d;

    /* renamed from: e */
    public int f66088e;

    /* renamed from: f */
    public String f66089f;

    /* renamed from: g */
    public String f66090g;

    @Inject
    public C27180a(@C10255b @C12579k Context context, @C12579k C13783a aVar, @C12579k C13814a aVar2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        this.f66084a = context;
        this.f66085b = aVar;
        this.f66086c = aVar2;
    }

    /* renamed from: e */
    public static /* synthetic */ void m114789e(C27180a aVar, ProductListSettingsModel productListSettingsModel, ProductListResultModel productListResultModel, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        aVar.mo79008d(productListSettingsModel, productListResultModel, num);
    }

    /* renamed from: a */
    public final void mo79005a(@C12579k ProductListSettingsModel productListSettingsModel) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
        if (productListSettingsModel.mo121830F()) {
            str = "search";
        } else {
            str = "product-list";
        }
        this.f66089f = str;
        if (productListSettingsModel.mo121830F()) {
            str2 = C28606w1.f69975l;
        } else if (productListSettingsModel.mo121829E()) {
            str2 = C28592s1.f69855o;
        } else {
            str2 = C38477m.m159642b(productListSettingsModel);
            if (str2 == null) {
                str2 = "";
            }
        }
        this.f66090g = str2;
    }

    /* renamed from: b */
    public final void mo79006b() {
        this.f66088e = 0;
    }

    /* renamed from: c */
    public final void mo79007c(@C12579k List<? extends OfferProductModel> list) {
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
        OfferDiscountType z;
        ProductCategoryDomain q;
        List<? extends OfferProductModel> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "offers");
        int size = list.size();
        int i = this.f66088e;
        if (size > i) {
            int i2 = 10;
            int i3 = 0;
            for (Object next : CollectionsKt___CollectionsKt.m40523K1(CollectionsKt___CollectionsKt.m40502F5(list2, size - i), 10)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                List list3 = (List) next;
                C13783a aVar = this.f66085b;
                C13813h[] hVarArr = new C13813h[1];
                FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
                String str11 = this.f66090g;
                if (str11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("screenName");
                    str11 = null;
                }
                String str12 = this.f66089f;
                if (str12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("screenClass");
                    str12 = null;
                }
                String str13 = this.f66090g;
                if (str13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("screenName");
                    str = null;
                } else {
                    str = str13;
                }
                Iterable iterable = list3;
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, i2));
                int i5 = 0;
                for (Object next2 : iterable) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
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
                    Integer valueOf = Integer.valueOf(this.f66088e + (i3 * 10) + i5 + 1);
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
                    i5 = i6;
                }
                hVarArr[0] = new C13812g(firebaseEventKey, str11, str12, new C13790b(str, (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
                aVar.mo32711n(hVarArr);
                i3 = i4;
                i2 = 10;
            }
            this.f66088e = list.size();
        }
    }

    /* renamed from: d */
    public final void mo79008d(@C12579k ProductListSettingsModel productListSettingsModel, @C12579k ProductListResultModel productListResultModel, @C12580l Integer num) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(productListSettingsModel, "settings");
        Intrinsics.checkNotNullParameter(productListResultModel, "result");
        if (productListSettingsModel.mo121827C() != 0) {
            this.f66087d = ProductListSettingsModel.m159380q(productListSettingsModel, (DepartmentHeaderModel) null, (DepartmentHeaderModel) null, (DepartmentHeaderModel) null, (String) null, (String) null, false, (String) null, (String) null, false, false, (String) null, (SortModel) null, (List) null, 0, (String) null, 32767, (Object) null);
            String str3 = "";
            if (productListSettingsModel.mo121830F()) {
                C13783a aVar = this.f66085b;
                Pair[] pairArr = new Pair[6];
                pairArr[0] = C11078d1.m42659a("list_page", String.valueOf(productListResultModel.mo121817h().mo121775e()));
                pairArr[1] = C11078d1.m42659a("list_size_product", String.valueOf(productListResultModel.mo121817h().mo121777f()));
                pairArr[2] = C11078d1.m42659a("list_name_product", C28606w1.f69975l);
                String A = productListSettingsModel.mo121825A();
                if (A != null) {
                    str3 = A;
                }
                pairArr[3] = C11078d1.m42659a("search_keywords", str3);
                pairArr[4] = C11078d1.m42659a("search_resultsNumber", String.valueOf(productListResultModel.mo121817h().mo121777f()));
                pairArr[5] = C11078d1.m42659a("screen_error", String.valueOf(num));
                C13783a.m58667i(aVar, "search", C28606w1.f69975l, C10977s0.m41456W(pairArr), false, true, false, 40, (Object) null);
            } else if (productListSettingsModel.mo121829E()) {
                C13783a aVar2 = this.f66085b;
                Pair[] pairArr2 = new Pair[6];
                pairArr2[0] = C11078d1.m42659a("list_page", String.valueOf(productListResultModel.mo121817h().mo121775e()));
                pairArr2[1] = C11078d1.m42659a("list_size_product", String.valueOf(productListResultModel.mo121817h().mo121777f()));
                pairArr2[2] = C11078d1.m42659a("list_name_product", C28592s1.f69855o);
                pairArr2[3] = C11078d1.m42659a("screen_cat1ID", "group_8");
                String x = productListSettingsModel.mo121860x();
                if (x != null) {
                    str3 = x;
                }
                pairArr2[4] = C11078d1.m42659a("screen_cat1Name", str3);
                pairArr2[5] = C11078d1.m42659a("screen_error", String.valueOf(num));
                C13783a.m58667i(aVar2, "product-list", C28592s1.f69855o, C10977s0.m41456W(pairArr2), false, true, false, 40, (Object) null);
            } else {
                C13783a aVar3 = this.f66085b;
                String e = C38477m.m159645e(productListSettingsModel);
                Pair[] pairArr3 = new Pair[7];
                pairArr3[0] = C11078d1.m42659a("list_page", String.valueOf(productListResultModel.mo121817h().mo121775e()));
                pairArr3[1] = C11078d1.m42659a("list_size_product", String.valueOf(productListResultModel.mo121817h().mo121777f()));
                pairArr3[2] = C11078d1.m42659a("list_name_product", C38477m.m159645e(productListSettingsModel));
                DepartmentHeaderModel u = productListSettingsModel.mo121856u();
                String str4 = null;
                if (u != null) {
                    str = u.mo121563o();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = str3;
                }
                pairArr3[3] = C11078d1.m42659a("screen_cat1Name", str);
                DepartmentHeaderModel v = productListSettingsModel.mo121857v();
                if (v != null) {
                    str2 = v.mo121563o();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = str3;
                }
                pairArr3[4] = C11078d1.m42659a("screen_cat2Name", str2);
                DepartmentHeaderModel w = productListSettingsModel.mo121858w();
                if (w != null) {
                    str4 = w.mo121563o();
                }
                if (str4 != null) {
                    str3 = str4;
                }
                pairArr3[5] = C11078d1.m42659a("screen_cat3Name", str3);
                pairArr3[6] = C11078d1.m42659a("screen_error", String.valueOf(num));
                C13783a.m58667i(aVar3, "product-list", e, C10977s0.m41456W(pairArr3), true, true, false, 32, (Object) null);
            }
        }
    }

    /* renamed from: f */
    public final void mo79009f(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        OfferDiscountType z;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f66085b;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[14];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str30 = this.f66090g;
        if (str30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str30 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str30);
        String str31 = this.f66089f;
        if (str31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str31 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str31);
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        String str32 = this.f66089f;
        if (str32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str32 = null;
        }
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", str32);
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W != null) {
            str = W.mo115984e();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a("product_cdBase", str);
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115986f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[8] = C11078d1.m42659a("product_EAN", str2);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_name", str3);
        pairArr[10] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_promotionsName", str4);
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 == null || (z = w2.mo115961z()) == null) {
            str5 = null;
        } else {
            str5 = z.mo118123y();
        }
        if (str5 == null) {
            str5 = "";
        }
        pairArr[12] = C11078d1.m42659a("product_promotionsType", str5);
        pairArr[13] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str33 = this.f66090g;
        if (str33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str33 = null;
        }
        String str34 = this.f66089f;
        if (str34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str34 = null;
        }
        String str35 = this.f66090g;
        if (str35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str6 = null;
        } else {
            str6 = str35;
        }
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str7 = o02.mo121898z();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str9 = o03.mo121889s();
        } else {
            str9 = null;
        }
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q3 = o04.mo121887q()) == null) {
            str11 = null;
        } else {
            str11 = q3.mo116513j();
        }
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str13 = offerProductModel.mo121498K0();
        } else {
            str13 = null;
        }
        C13806m mVar = r15;
        C13806m mVar2 = new C13806m(str6, (String) null, new C13802i(str8, str10, str12, i2, k, q4, (Integer) null, (String) null, str13, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, str33, str34, mVar2);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String str36 = this.f66090g;
        if (str36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str36 = null;
        }
        String str37 = this.f66089f;
        if (str37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str37 = null;
        }
        String str38 = this.f66090g;
        if (str38 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str14 = null;
        } else {
            str14 = str38;
        }
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str15 = o05.mo121898z();
        } else {
            str15 = null;
        }
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 != null) {
            str17 = o06.mo121889s();
        } else {
            str17 = null;
        }
        if (str17 == null) {
            str18 = "";
        } else {
            str18 = str17;
        }
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 == null || (q2 = o07.mo121887q()) == null) {
            str19 = null;
        } else {
            str19 = q2.mo116513j();
        }
        if (str19 == null) {
            str20 = "";
        } else {
            str20 = str19;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str21 = offerProductModel.mo121498K0();
        } else {
            str21 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, str36, str37, new C13807n(str14, (String) null, new C13802i(str16, str18, str20, i2, k2, q5, (Integer) null, (String) null, str21, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        String str39 = this.f66090g;
        if (str39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str39 = null;
        }
        String str40 = this.f66089f;
        if (str40 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str40 = null;
        }
        String str41 = this.f66090g;
        if (str41 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str22 = null;
        } else {
            str22 = str41;
        }
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str23 = o08.mo121898z();
        } else {
            str23 = null;
        }
        if (str23 == null) {
            str24 = "";
        } else {
            str24 = str23;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 != null) {
            str25 = o09.mo121889s();
        } else {
            str25 = null;
        }
        if (str25 == null) {
            str26 = "";
        } else {
            str26 = str25;
        }
        ProductModel o010 = offerProductModel.mo121517o0();
        if (o010 == null || (q = o010.mo121887q()) == null) {
            str27 = null;
        } else {
            str27 = q.mo116513j();
        }
        if (str27 == null) {
            str28 = "";
        } else {
            str28 = str27;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str29 = offerProductModel.mo121498K0();
        } else {
            str29 = null;
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, str39, str40, new C13789a(str22, k3, (String) null, C10976s.m41419k(new C13803j(str24, str26, str28, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str29, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: g */
    public final void mo79010g(@C12579k OfferProductModel offerProductModel) {
        String str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f66085b;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str2 = this.f66090g;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str2 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str2);
        String str3 = this.f66089f;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str3 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str3);
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, "stock-insuffisant");
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str = o0.mo121889s();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo79011h() {
        C13783a aVar = this.f66085b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str = this.f66090g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str);
        String str2 = this.f66089f;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str2 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str2);
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, "info-panachage-produit");
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo79012i(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        OfferDiscountType z;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f66085b;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[14];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str30 = this.f66090g;
        if (str30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str30 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str30);
        String str31 = this.f66089f;
        if (str31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str31 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str31);
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        String str32 = this.f66089f;
        if (str32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str32 = null;
        }
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", str32);
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W != null) {
            str = W.mo115984e();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a("product_cdBase", str);
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115986f();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[8] = C11078d1.m42659a("product_EAN", str2);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str3 = o0.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_name", str3);
        pairArr[10] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_promotionsName", str4);
        OfferDiscountDomain w2 = offerProductModel.mo121523w();
        if (w2 == null || (z = w2.mo115961z()) == null) {
            str5 = null;
        } else {
            str5 = z.mo118123y();
        }
        if (str5 == null) {
            str5 = "";
        }
        pairArr[12] = C11078d1.m42659a("product_promotionsType", str5);
        pairArr[13] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str33 = this.f66090g;
        if (str33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str33 = null;
        }
        String str34 = this.f66089f;
        if (str34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str34 = null;
        }
        String str35 = this.f66090g;
        if (str35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str6 = null;
        } else {
            str6 = str35;
        }
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str7 = o02.mo121898z();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str9 = o03.mo121889s();
        } else {
            str9 = null;
        }
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q3 = o04.mo121887q()) == null) {
            str11 = null;
        } else {
            str11 = q3.mo116513j();
        }
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str13 = offerProductModel.mo121498K0();
        } else {
            str13 = null;
        }
        C13806m mVar = r15;
        C13806m mVar2 = new C13806m(str6, (String) null, new C13802i(str8, str10, str12, i2, k, q4, (Integer) null, (String) null, str13, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, str33, str34, mVar2);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String str36 = this.f66090g;
        if (str36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str36 = null;
        }
        String str37 = this.f66089f;
        if (str37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str37 = null;
        }
        String str38 = this.f66090g;
        if (str38 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str14 = null;
        } else {
            str14 = str38;
        }
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str15 = o05.mo121898z();
        } else {
            str15 = null;
        }
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 != null) {
            str17 = o06.mo121889s();
        } else {
            str17 = null;
        }
        if (str17 == null) {
            str18 = "";
        } else {
            str18 = str17;
        }
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 == null || (q2 = o07.mo121887q()) == null) {
            str19 = null;
        } else {
            str19 = q2.mo116513j();
        }
        if (str19 == null) {
            str20 = "";
        } else {
            str20 = str19;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str21 = offerProductModel.mo121498K0();
        } else {
            str21 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, str36, str37, new C13807n(str14, (String) null, new C13802i(str16, str18, str20, i2, k2, q5, (Integer) null, (String) null, str21, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        String str39 = this.f66090g;
        if (str39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str39 = null;
        }
        String str40 = this.f66089f;
        if (str40 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str40 = null;
        }
        String str41 = this.f66090g;
        if (str41 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str22 = null;
        } else {
            str22 = str41;
        }
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str23 = o08.mo121898z();
        } else {
            str23 = null;
        }
        if (str23 == null) {
            str24 = "";
        } else {
            str24 = str23;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 != null) {
            str25 = o09.mo121889s();
        } else {
            str25 = null;
        }
        if (str25 == null) {
            str26 = "";
        } else {
            str26 = str25;
        }
        ProductModel o010 = offerProductModel.mo121517o0();
        if (o010 == null || (q = o010.mo121887q()) == null) {
            str27 = null;
        } else {
            str27 = q.mo116513j();
        }
        if (str27 == null) {
            str28 = "";
        } else {
            str28 = str27;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str29 = offerProductModel.mo121498K0();
        } else {
            str29 = null;
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, str39, str40, new C13789a(str22, k3, (String) null, C10976s.m41419k(new C13803j(str24, str26, str28, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str29, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: j */
    public final void mo79013j() {
        C13783a aVar = this.f66085b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str = this.f66090g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str);
        String str2 = this.f66089f;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str2 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str2);
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, "voir-catalogue");
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, C28526d.f68822I2);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo79014k() {
        C13783a aVar = this.f66085b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str = this.f66090g;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str);
        String str2 = this.f66089f;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str2 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str2);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68868U0);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: l */
    public final void mo79015l(@C12579k OfferProductModel offerProductModel, int i) {
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
        C13783a aVar = this.f66085b;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[9];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str10 = this.f66090g;
        String str11 = null;
        if (str10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str10 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str10);
        String str12 = this.f66089f;
        if (str12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str12 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str12);
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68837M1);
        pairArr[5] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[6] = C11078d1.m42659a("product_EAN", str);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str2 = o0.mo121898z();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[7] = C11078d1.m42659a("product_name", str2);
        pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_WISHLIST;
        String str13 = this.f66090g;
        if (str13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str13 = null;
        }
        String str14 = this.f66089f;
        if (str14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str14 = null;
        }
        String str15 = this.f66090g;
        if (str15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str3 = null;
        } else {
            str3 = str15;
        }
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
            str11 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, str13, str14, new C13789a(str3, k, (String) null, C10976s.m41419k(new C13803j(str5, str7, str9, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str11, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: m */
    public final void mo79016m(@C12579k OfferProductModel offerProductModel, int i) {
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
        C13783a aVar = this.f66085b;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[9];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str10 = this.f66090g;
        String str11 = null;
        if (str10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str10 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str10);
        String str12 = this.f66089f;
        if (str12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str12 = null;
        }
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, str12);
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68841N1);
        pairArr[5] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[6] = C11078d1.m42659a("product_EAN", str);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str2 = o0.mo121898z();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[7] = C11078d1.m42659a("product_name", str2);
        pairArr[8] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_WISHLIST;
        String str13 = this.f66090g;
        if (str13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str13 = null;
        }
        String str14 = this.f66089f;
        if (str14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str14 = null;
        }
        String str15 = this.f66090g;
        if (str15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str3 = null;
        } else {
            str3 = str15;
        }
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
            str11 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, str13, str14, new C13789a(str3, k, (String) null, C10976s.m41419k(new C13803j(str5, str7, str9, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str11, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: n */
    public final void mo79017n(@C12579k DepartmentHeaderModel departmentHeaderModel) {
        Intrinsics.checkNotNullParameter(departmentHeaderModel, "department");
        C13783a aVar = this.f66085b;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str = this.f66089f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str = null;
        }
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, str);
        String str2 = this.f66090g;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str2 = null;
        }
        pairArr[2] = C11078d1.m42659a("screen_name", str2);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, C28535f0.f69195b);
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, "tagline");
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, StringKt.m118908Q(departmentHeaderModel.mo121563o()));
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: o */
    public final void mo79018o() {
        C13783a aVar = this.f66085b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str = this.f66089f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str = null;
        }
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, str);
        String str2 = this.f66090g;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str2 = null;
        }
        pairArr[2] = C11078d1.m42659a("screen_name", str2);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68864T0);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: p */
    public final void mo79019p(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "gtin");
        this.f66086c.mo32735i(this.f66084a, "af_add_to_cart", C10977s0.m41456W(C11078d1.m42659a("af_add_to_cart", "Oui"), C11078d1.m42659a("af_content_id", str), C11078d1.m42659a("af_quantity", String.valueOf(i))));
    }

    /* renamed from: q */
    public final void mo79020q(@C12579k OfferProductModel offerProductModel) {
        String str;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13814a aVar = this.f66086c;
        Context context = this.f66084a;
        Pair[] pairArr = new Pair[3];
        ProductModel o0 = offerProductModel.mo121517o0();
        String str2 = null;
        if (o0 != null) {
            str = o0.mo121898z();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        pairArr[0] = C11078d1.m42659a("af_content_view", str);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str2 = o02.mo121889s();
        }
        if (str2 != null) {
            str3 = str2;
        }
        pairArr[1] = C11078d1.m42659a("af_content_id", str3);
        pairArr[2] = C11078d1.m42659a("af_quantity", "1");
        aVar.mo32735i(context, "af_content_view", C10977s0.m41456W(pairArr));
    }

    /* renamed from: r */
    public final void mo79021r(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "promoName");
        C13783a aVar = this.f66085b;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str2 = this.f66090g;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str2 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str2);
        String str3 = this.f66089f;
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

    /* renamed from: s */
    public final void mo79022s(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "promoName");
        C13783a aVar = this.f66085b;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        String str2 = this.f66090g;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str2 = null;
        }
        pairArr[1] = C11078d1.m42659a("screen_name", str2);
        String str3 = this.f66089f;
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

    /* renamed from: t */
    public final void mo79023t(@C12579k OfferProductModel offerProductModel, int i) {
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
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f66085b;
        C13813h[] hVarArr = new C13813h[2];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.SELECT_CONTENT;
        String str17 = this.f66090g;
        if (str17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str17 = null;
        }
        String str18 = this.f66089f;
        if (str18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str18 = null;
        }
        String str19 = this.f66090g;
        if (str19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str = null;
        } else {
            str = str19;
        }
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
        C13806m mVar = r11;
        C13806m mVar2 = new C13806m(str, (String) null, new C13802i(str3, str5, str7, i, k, q3, (Integer) null, (String) null, str8, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, str17, str18, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String str20 = this.f66090g;
        if (str20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str20 = null;
        }
        String str21 = this.f66089f;
        if (str21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenClass");
            str21 = null;
        }
        String str22 = this.f66090g;
        if (str22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            str9 = null;
        } else {
            str9 = str22;
        }
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
        if (o06 == null || (q = o06.mo121887q()) == null) {
            str14 = null;
        } else {
            str14 = q.mo116513j();
        }
        if (str14 == null) {
            str15 = "";
        } else {
            str15 = str14;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str16 = offerProductModel.mo121498K0();
        } else {
            str16 = null;
        }
        C13807n nVar = r9;
        C13807n nVar2 = new C13807n(str9, (String) null, new C13802i(str11, str13, str15, i, k2, q4, (Integer) null, (String) null, str16, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey2, str20, str21, nVar);
        aVar.mo32711n(hVarArr);
    }
}
