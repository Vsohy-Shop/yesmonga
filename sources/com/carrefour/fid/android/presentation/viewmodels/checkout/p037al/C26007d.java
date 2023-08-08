package com.carrefour.fid.android.presentation.viewmodels.checkout.p037al;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13788f;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13790b;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13791c;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13792d;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13802i;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13804k;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13806m;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13807n;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.CheckoutProgressStep;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseItemListName;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseProductDimension;
import com.carrefour.fid.android.analytics.data.appflyer.C13814a;
import com.carrefour.fid.android.core.type.BasketService;
import com.carrefour.fid.android.core.type.BasketType;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.BasketOfferDomain;
import com.carrefour.fid.android.domain.models.C37953b;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.domain.models.ProductDomain;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.domain.models.service.models.C38162k;
import com.carrefour.fid.android.domain.models.service.models.C38163l;
import com.carrefour.fid.android.domain.models.service.models.StoreService;
import com.carrefour.fid.android.presentation.models.C38489h;
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.contentsquare.android.api.C14092c;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.C10998z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckoutStep1AnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep1AnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep1AnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,697:1\n1864#2,2:698\n1559#2:700\n1590#2,4:701\n1549#2:705\n1620#2,3:706\n1866#2:709\n1559#2:710\n1590#2,4:711\n1864#2,2:715\n1559#2:717\n1590#2,4:718\n1866#2:722\n*S KotlinDebug\n*F\n+ 1 CheckoutStep1AnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/al/CheckoutStep1AnalyticsViewModel\n*L\n101#1:698,2\n109#1:700\n109#1:701,4\n130#1:705\n130#1:706,3\n101#1:709\n157#1:710\n157#1:711,4\n452#1:715,2\n460#1:717\n460#1:718,4\n452#1:722\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.d */
public final class C26007d {

    /* renamed from: f */
    public static final int f63570f = 8;
    @C12579k

    /* renamed from: a */
    public final Context f63571a;
    @C12579k

    /* renamed from: b */
    public final C13783a f63572b;
    @C12579k

    /* renamed from: c */
    public final C13814a f63573c;

    /* renamed from: d */
    public boolean f63574d;

    /* renamed from: e */
    public int f63575e;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.al.d$a */
    public /* synthetic */ class C26008a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.carrefour.fid.android.core.type.BasketType[] r0 = com.carrefour.fid.android.core.type.BasketType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.core.type.BasketType r1 = com.carrefour.fid.android.core.type.BasketType.BASKET_V4_TYPE_DRIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.core.type.BasketType r1 = com.carrefour.fid.android.core.type.BasketType.BASKET_V4_EXPRESS_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.core.type.BasketType r1 = com.carrefour.fid.android.core.type.BasketType.BASKET_V4_TYPE_MARKETPLACE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.p037al.C26007d.C26008a.<clinit>():void");
        }
    }

    @Inject
    public C26007d(@C10255b @C12579k Context context, @C12579k C13783a aVar, @C12579k C13814a aVar2) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "appsFlyerTrackingManager");
        this.f63571a = context;
        this.f63572b = aVar;
        this.f63573c = aVar2;
    }

    @C12579k
    /* renamed from: a */
    public final String mo75483a(@C12580l BasketType basketType, @C12580l BasketService basketService, boolean z) {
        int i;
        if (basketType == null) {
            i = -1;
        } else {
            i = C26008a.$EnumSwitchMapping$0[basketType.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                return "lex";
            }
            if (i == 3) {
                return C28526d.f68995y1;
            }
            if (z) {
                return "retrait-express";
            }
            return new String();
        } else if (basketService == BasketService.DELIVERY) {
            return "livraison";
        } else {
            return "drive";
        }
    }

    /* renamed from: b */
    public final void mo75484b(float f) {
        this.f63572b.mo32711n(new C13812g(FirebaseEventKey.CHECKOUT_PROGRESS, "basket", "checkout", new C13792d(CheckoutProgressStep.FIRST, (String) null, f, 2, (DefaultConstructorMarker) null)));
    }

    /* renamed from: c */
    public final void mo75485c(float f) {
        this.f63572b.mo32711n(new C13812g(FirebaseEventKey.CHECKOUT_PROGRESS, "choix-slot", "checkout", new C13792d(CheckoutProgressStep.SECOND, (String) null, f, 2, (DefaultConstructorMarker) null)));
    }

    /* renamed from: d */
    public final void mo75486d(@C12579k List<BasketOfferDomain> list, float f) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ProductCategoryDomain q;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        OfferDiscountType z;
        ProductCategoryDomain q2;
        List<BasketOfferDomain> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "offers");
        if (list.size() != this.f63575e) {
            int i = 10;
            int i2 = 0;
            for (Object next : CollectionsKt___CollectionsKt.m40523K1(list2, 10)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                C13783a aVar = this.f63572b;
                C13813h[] hVarArr = new C13813h[2];
                FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
                Iterable<BasketOfferDomain> iterable = (List) next;
                ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, i));
                Iterator it = iterable.iterator();
                int i4 = 0;
                while (true) {
                    String str14 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next2 = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt__CollectionsKt.m40459W();
                    }
                    BasketOfferDomain basketOfferDomain = (BasketOfferDomain) next2;
                    ProductDomain A = basketOfferDomain.mo115540A();
                    if (A != null) {
                        str7 = A.mo116553z();
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                    ProductDomain A2 = basketOfferDomain.mo115540A();
                    if (A2 != null) {
                        str9 = A2.mo116544s();
                    } else {
                        str9 = null;
                    }
                    if (str9 == null) {
                        str10 = "";
                    } else {
                        str10 = str9;
                    }
                    ProductDomain A3 = basketOfferDomain.mo115540A();
                    if (A3 == null || (q2 = A3.mo116542q()) == null) {
                        str11 = null;
                    } else {
                        str11 = q2.mo116513j();
                    }
                    if (str11 == null) {
                        str12 = "";
                    } else {
                        str12 = str11;
                    }
                    Integer valueOf = Integer.valueOf((i2 * 10) + i4 + 1);
                    float a = C37953b.m155979a(basketOfferDomain);
                    OfferDiscountDomain q3 = basketOfferDomain.mo115565q();
                    if (!(q3 == null || (z = q3.mo115961z()) == null)) {
                        str14 = z.mo118123y();
                    }
                    if (str14 == null) {
                        str13 = "";
                    } else {
                        str13 = str14;
                    }
                    arrayList.add(new C13804k(str8, str10, str12, valueOf, (String) null, a, str13, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, (String) null, 3984, (DefaultConstructorMarker) null));
                    i4 = i5;
                }
                hVarArr[0] = new C13812g(firebaseEventKey, "basket", "checkout", new C13790b("basket", (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
                List L = CollectionsKt__CollectionsKt.m40448L(FirebaseEventKey.VIEW_CART, FirebaseEventKey.BEGIN_CHECKOUT);
                CheckoutProgressStep checkoutProgressStep = CheckoutProgressStep.FIRST;
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
                for (BasketOfferDomain basketOfferDomain2 : iterable) {
                    ProductDomain A4 = basketOfferDomain2.mo115540A();
                    if (A4 != null) {
                        str = A4.mo116553z();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    ProductDomain A5 = basketOfferDomain2.mo115540A();
                    if (A5 != null) {
                        str3 = A5.mo116544s();
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    ProductDomain A6 = basketOfferDomain2.mo115540A();
                    if (A6 == null || (q = A6.mo116542q()) == null) {
                        str5 = null;
                    } else {
                        str5 = q.mo116513j();
                    }
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    arrayList2.add(new C13804k(str2, str4, str6, (Integer) null, (String) null, C37953b.m155979a(basketOfferDomain2), (String) null, Integer.valueOf(basketOfferDomain2.mo115541B()), (Integer) null, (String) null, (String) null, (Integer) null, (String) null, 3928, (DefaultConstructorMarker) null));
                }
                hVarArr[1] = new C13788f(L, "basket", "checkout", new C13791c("basket", checkoutProgressStep, (String) null, f, arrayList2, 4, (DefaultConstructorMarker) null));
                aVar.mo32711n(hVarArr);
                i2 = i3;
                i = 10;
            }
            this.f63575e = list.size();
        }
    }

    /* renamed from: e */
    public final void mo75487e(@C12579k List<? extends OfferProductModel> list) {
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
        if (!this.f63574d) {
            C13783a aVar = this.f63572b;
            C13813h[] hVarArr = new C13813h[1];
            FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
            String q2 = FirebaseItemListName.RECOMMENDATIONS.mo32725q();
            Iterable iterable = list2;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            int i = 0;
            for (Object next : iterable) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                OfferProductModel offerProductModel = (OfferProductModel) next;
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
                Integer valueOf = Integer.valueOf(i2);
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
                i = i2;
            }
            hVarArr[0] = new C13812g(firebaseEventKey, "basket", "checkout", new C13790b(q2, (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
            aVar.mo32711n(hVarArr);
            this.f63574d = true;
        }
    }

    /* renamed from: f */
    public final void mo75488f(@C12579k List<? extends OfferModel> list, @C12579k String str) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(str, "basketType");
        List<R> a1 = C10998z.m42387a1(list, OfferProductModel.class);
        String valueOf = String.valueOf(OfferProductModelKt.m159580b(a1));
        String valueOf2 = String.valueOf(OfferProductModelKt.m159595q(a1));
        String valueOf3 = String.valueOf(OfferProductModelKt.m159586h(a1));
        String valueOf4 = String.valueOf(Integer.parseInt(valueOf2) - Integer.parseInt(valueOf3));
        C13783a.m58667i(this.f63572b, "checkout", "basket", C10977s0.m41456W(C11078d1.m42659a("list_name_product", "basket"), C11078d1.m42659a("list_size_product", String.valueOf(a1.size())), C11078d1.m42659a("list_size_productDispo", valueOf), C11078d1.m42659a("list_size_productIndispo", valueOf2), C11078d1.m42659a("list_size_productIndispoA", valueOf3), C11078d1.m42659a("list_size_productIndispoS", valueOf4), C11078d1.m42659a("panier_type", str)), false, false, false, 56, (Object) null);
        mo75504v(a1);
    }

    /* renamed from: g */
    public final void mo75489g(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        C13783a.m58667i(this.f63572b, "checkout", "basket", C10975r0.m41401k(C11078d1.m42659a("panier_type", str)), false, false, false, 56, (Object) null);
    }

    /* renamed from: h */
    public final void mo75490h() {
        C13783a.m58667i(this.f63572b, "checkout", "basket-vide", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: i */
    public final void mo75491i(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        C13783a aVar = this.f63572b;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[12];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[2] = C11078d1.m42659a("screen_name", "basket");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, "crossell-cart|vos-achats-frequents");
        pairArr[6] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[7] = C11078d1.m42659a("ecommerce_zone", "basket|crossell-cart");
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
        pairArr[8] = C11078d1.m42659a("product_EAN", str);
        pairArr[9] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str2 = W2.mo115984e();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[10] = C11078d1.m42659a("product_cdBase", str2);
        pairArr[11] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
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
        hVarArr[1] = new C13812g(firebaseEventKey, "basket", "checkout", new C13806m(q4, (String) null, new C13802i(str4, str6, str8, i2, k, q5, (Integer) null, (String) null, str9, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
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
        hVarArr[2] = new C13812g(firebaseEventKey2, "basket", "checkout", new C13807n(q6, (String) null, new C13802i(str11, str13, str15, i2, k2, q7, (Integer) null, (String) null, str16, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        String q8 = firebaseItemListName.mo32725q();
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
        hVarArr[3] = new C13812g(firebaseEventKey3, "basket", "checkout", new C13789a(q8, k3, (String) null, C10976s.m41419k(new C13803j(str18, str20, str22, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str23, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: j */
    public final void mo75492j(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        OfferDiscountType z;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63572b;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[14];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "basket");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "basket");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str26 = null;
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
        if (o04 == null || (q3 = o04.mo121887q()) == null) {
            str10 = null;
        } else {
            str10 = q3.mo116513j();
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str12 = offerProductModel.mo121498K0();
        } else {
            str12 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "basket", "checkout", new C13806m("basket", (String) null, new C13802i(str7, str9, str11, i2, k, q4, (Integer) null, (String) null, str12, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str13 = o05.mo121898z();
        } else {
            str13 = null;
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 != null) {
            str15 = o06.mo121889s();
        } else {
            str15 = null;
        }
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 == null || (q2 = o07.mo121887q()) == null) {
            str17 = null;
        } else {
            str17 = q2.mo116513j();
        }
        if (str17 == null) {
            str18 = "";
        } else {
            str18 = str17;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str19 = offerProductModel.mo121498K0();
        } else {
            str19 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, "basket", "checkout", new C13807n("basket", (String) null, new C13802i(str14, str16, str18, i2, k2, q5, (Integer) null, (String) null, str19, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str20 = o08.mo121898z();
        } else {
            str20 = null;
        }
        if (str20 == null) {
            str21 = "";
        } else {
            str21 = str20;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 != null) {
            str22 = o09.mo121889s();
        } else {
            str22 = null;
        }
        if (str22 == null) {
            str23 = "";
        } else {
            str23 = str22;
        }
        ProductModel o010 = offerProductModel.mo121517o0();
        if (o010 == null || (q = o010.mo121887q()) == null) {
            str24 = null;
        } else {
            str24 = q.mo116513j();
        }
        if (str24 == null) {
            str25 = "";
        } else {
            str25 = str24;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str26 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, "basket", "checkout", new C13789a("basket", k3, (String) null, C10976s.m41419k(new C13803j(str21, str23, str25, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str26, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: k */
    public final void mo75493k() {
        C13783a.m58668o(this.f63572b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "basket"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "vider-panier"), C11078d1.m42659a(C28526d.f68929i, "ecommerce")), false, 2, (Object) null);
    }

    /* renamed from: l */
    public final void mo75494l(@C12579k C38489h hVar) {
        String str;
        Intrinsics.checkNotNullParameter(hVar, "deliveryThreshold");
        C13783a aVar = this.f63572b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "basket");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, C28526d.f68880X0);
        if (hVar instanceof C38489h.C38490a) {
            str = C28526d.f68939k1;
        } else {
            str = C28526d.f68943l1;
        }
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: m */
    public final void mo75495m(@C12579k List<? extends OfferProductModel> list) {
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
        Intrinsics.checkNotNullParameter(list2, "list");
        C13783a aVar = this.f63572b;
        C13813h[] hVarArr = new C13813h[1];
        Pair[] pairArr = new Pair[8];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "basket");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68918f1);
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, C28526d.f68923g1);
        pairArr[6] = C11078d1.m42659a("list_size_product", String.valueOf(list.size()));
        OfferProductModel offerProductModel = (OfferProductModel) CollectionsKt___CollectionsKt.m40479B2(list);
        if (offerProductModel != null) {
            str = offerProductModel.mo121498K0();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a(C28526d.f68908d1, str);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        aVar.mo32711n(hVarArr);
        int i = 10;
        int i2 = 0;
        for (Object next : CollectionsKt___CollectionsKt.m40523K1(list2, 10)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C13783a aVar2 = this.f63572b;
            C13813h[] hVarArr2 = new C13813h[1];
            FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
            String q2 = FirebaseItemListName.RECOMMENDATIONS.mo32725q();
            Iterable iterable = (List) next;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, i));
            int i4 = 0;
            for (Object next2 : iterable) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                OfferProductModel offerProductModel2 = (OfferProductModel) next2;
                ProductModel o0 = offerProductModel2.mo121517o0();
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
                ProductModel o02 = offerProductModel2.mo121517o0();
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
                ProductModel o03 = offerProductModel2.mo121517o0();
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
                float k = OfferProductModelKt.m159589k(offerProductModel2);
                OfferDiscountDomain w = offerProductModel2.mo121523w();
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
                    str10 = offerProductModel2.mo121498K0();
                } else {
                    str10 = null;
                }
                arrayList.add(new C13804k(str3, str5, str7, valueOf, (String) null, k, str9, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, str10, 3984, (DefaultConstructorMarker) null));
                i4 = i5;
            }
            hVarArr2[0] = new C13812g(firebaseEventKey, "checkout", "checkout", new C13790b(q2, (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
            aVar2.mo32711n(hVarArr2);
            i2 = i3;
            i = 10;
        }
    }

    /* renamed from: n */
    public final void mo75496n(int i) {
        C13783a.m58668o(this.f63572b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "basket"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68947m1), C11078d1.m42659a(C28526d.f68937k, String.valueOf(i))), false, 2, (Object) null);
    }

    /* renamed from: o */
    public final void mo75497o(@C12579k List<? extends OfferProductModel> list) {
        String str;
        Intrinsics.checkNotNullParameter(list, "list");
        C13783a aVar = this.f63572b;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[2] = C11078d1.m42659a("screen_name", "basket");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68918f1);
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, C28526d.f68927h1);
        pairArr[6] = C11078d1.m42659a("list_size_product", String.valueOf(list.size()));
        OfferProductModel offerProductModel = (OfferProductModel) CollectionsKt___CollectionsKt.m40479B2(list);
        if (offerProductModel != null) {
            str = offerProductModel.mo121498K0();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[7] = C11078d1.m42659a(C28526d.f68908d1, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: p */
    public final void mo75498p(@C12579k OfferProductModel offerProductModel, int i, int i2) {
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
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        OfferDiscountType z;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63572b;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[14];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", "basket");
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", "basket");
        pairArr[5] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[6] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str26 = null;
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
        if (o04 == null || (q3 = o04.mo121887q()) == null) {
            str10 = null;
        } else {
            str10 = q3.mo116513j();
        }
        if (str10 == null) {
            str11 = "";
        } else {
            str11 = str10;
        }
        float k = OfferProductModelKt.m159589k(offerProductModel);
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q4 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str12 = offerProductModel.mo121498K0();
        } else {
            str12 = null;
        }
        hVarArr[1] = new C13812g(firebaseEventKey, "basket", "checkout", new C13806m("basket", (String) null, new C13802i(str7, str9, str11, i2, k, q4, (Integer) null, (String) null, str12, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        ProductModel o05 = offerProductModel.mo121517o0();
        if (o05 != null) {
            str13 = o05.mo121898z();
        } else {
            str13 = null;
        }
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        ProductModel o06 = offerProductModel.mo121517o0();
        if (o06 != null) {
            str15 = o06.mo121889s();
        } else {
            str15 = null;
        }
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        ProductModel o07 = offerProductModel.mo121517o0();
        if (o07 == null || (q2 = o07.mo121887q()) == null) {
            str17 = null;
        } else {
            str17 = q2.mo116513j();
        }
        if (str17 == null) {
            str18 = "";
        } else {
            str18 = str17;
        }
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        String q5 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey2)) {
            str19 = offerProductModel.mo121498K0();
        } else {
            str19 = null;
        }
        hVarArr[2] = new C13812g(firebaseEventKey2, "basket", "checkout", new C13807n("basket", (String) null, new C13802i(str14, str16, str18, i2, k2, q5, (Integer) null, (String) null, str19, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        float k3 = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o08 = offerProductModel.mo121517o0();
        if (o08 != null) {
            str20 = o08.mo121898z();
        } else {
            str20 = null;
        }
        if (str20 == null) {
            str21 = "";
        } else {
            str21 = str20;
        }
        ProductModel o09 = offerProductModel.mo121517o0();
        if (o09 != null) {
            str22 = o09.mo121889s();
        } else {
            str22 = null;
        }
        if (str22 == null) {
            str23 = "";
        } else {
            str23 = str22;
        }
        ProductModel o010 = offerProductModel.mo121517o0();
        if (o010 == null || (q = o010.mo121887q()) == null) {
            str24 = null;
        } else {
            str24 = q.mo116513j();
        }
        if (str24 == null) {
            str25 = "";
        } else {
            str25 = str24;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k4 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey3)) {
            str26 = offerProductModel.mo121498K0();
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, "basket", "checkout", new C13789a("basket", k3, (String) null, C10976s.m41419k(new C13803j(str21, str23, str25, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str26, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: q */
    public final void mo75499q(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        C13783a.m58668o(this.f63572b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "basket"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "erreurs-validation-basket"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: r */
    public final void mo75500r(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "basketType");
        C13783a.m58668o(this.f63572b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "basket"), C11078d1.m42659a(C28526d.f68906d, "basket-vide"), C11078d1.m42659a(C28526d.f68933j, "commencer-courses"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a("panier_type", str)), false, 2, (Object) null);
    }

    /* renamed from: s */
    public final void mo75501s(@C12579k OfferProductModel offerProductModel, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ProductCategoryDomain q;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63572b;
        C13813h[] hVarArr = new C13813h[1];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_WISHLIST;
        float k = OfferProductModelKt.m159589k(offerProductModel);
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
        Integer valueOf = Integer.valueOf(i);
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str7 = offerProductModel.mo121498K0();
        } else {
            str7 = null;
        }
        C13789a aVar2 = r7;
        C13789a aVar3 = new C13789a("basket", k, (String) null, C10976s.m41419k(new C13803j(str2, str4, str6, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str7, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, "basket", "checkout", aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: t */
    public final void mo75502t(@C12579k OfferProductModel offerProductModel, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ProductCategoryDomain q;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        C13783a aVar = this.f63572b;
        C13813h[] hVarArr = new C13813h[1];
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_WISHLIST;
        float k = OfferProductModelKt.m159589k(offerProductModel);
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
        Integer valueOf = Integer.valueOf(i);
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        if (C13786d.m58689b(firebaseEventKey)) {
            str7 = offerProductModel.mo121498K0();
        } else {
            str7 = null;
        }
        C13789a aVar2 = r7;
        C13789a aVar3 = new C13789a("basket", k, (String) null, C10976s.m41419k(new C13803j(str2, str4, str6, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str7, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, "basket", "checkout", aVar2);
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: u */
    public final void mo75503u() {
        C13783a.m58668o(this.f63572b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "basket"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a(C28526d.f68933j, "voir-produits-indisponibles"), C11078d1.m42659a(C28526d.f68929i, "ecommerce")), false, 2, (Object) null);
    }

    /* renamed from: v */
    public final void mo75504v(List<? extends OfferProductModel> list) {
        String str;
        String str2;
        C13814a aVar = this.f63573c;
        Context context = this.f63571a;
        Pair[] pairArr = new Pair[4];
        String str3 = null;
        if (list != null) {
            str = OfferProductModelKt.m159591m(list);
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = str4;
        }
        pairArr[0] = C11078d1.m42659a("af_content_id", str);
        if (list != null) {
            str2 = OfferProductModelKt.m159593o(list);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = str4;
        }
        pairArr[1] = C11078d1.m42659a("af_price", str2);
        pairArr[2] = C11078d1.m42659a("af_currency", "EUR");
        if (list != null) {
            str3 = OfferProductModelKt.m159594p(list);
        }
        if (str3 != null) {
            str4 = str3;
        }
        pairArr[3] = C11078d1.m42659a("af_quantity", str4);
        aVar.mo32735i(context, "af_view_cart", C10977s0.m41456W(pairArr));
    }

    /* renamed from: w */
    public final void mo75505w(boolean z) {
        String str;
        C13783a aVar = this.f63572b;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        pairArr[2] = C11078d1.m42659a("screen_name", "basket");
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        if (z) {
            str = C28526d.f68967r1;
        } else {
            str = C28526d.f68971s1;
        }
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, str);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: x */
    public final void mo75506x() {
        C13783a.m58668o(this.f63572b, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "checkout"), C11078d1.m42659a("screen_name", "basket"), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68963q1)), false, 2, (Object) null);
    }

    /* renamed from: y */
    public final void mo75507y(@C12579k OfferProductModel offerProductModel, int i) {
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
        C13783a aVar = this.f63572b;
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
        FirebaseProductDimension firebaseProductDimension = FirebaseProductDimension.CLASSIC;
        String q3 = firebaseProductDimension.mo32726q();
        if (C13786d.m58689b(firebaseEventKey)) {
            str7 = offerProductModel.mo121498K0();
        } else {
            str7 = null;
        }
        C13806m mVar = r6;
        C13806m mVar2 = new C13806m("basket", (String) null, new C13802i(str2, str4, str6, i, k, q3, (Integer) null, (String) null, str7, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[0] = new C13812g(firebaseEventKey, "basket", "checkout", mVar);
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
        hVarArr[1] = new C13812g(firebaseEventKey2, "basket", "checkout", new C13807n("basket", (String) null, new C13802i(str9, str11, str13, i, k2, q4, (Integer) null, (String) null, str14, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: z */
    public final void mo75508z(@C12580l BasketDomain basketDomain, @C12580l C38162k kVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StoreService f;
        C38163l e;
        C38163l e2;
        C13783a aVar = this.f63572b;
        Pair[] pairArr = new Pair[3];
        String str6 = "";
        if (basketDomain == null || (str = basketDomain.mo115464G()) == null) {
            str = str6;
        }
        pairArr[0] = C11078d1.m42659a("cart_ID", str);
        if (kVar == null || (e2 = kVar.mo119352e()) == null) {
            str2 = null;
        } else {
            str2 = e2.mo119359C();
        }
        if (str2 == null) {
            str2 = str6;
        }
        pairArr[1] = C11078d1.m42659a(C28564m1.f69577k, str2);
        if (kVar == null || (e = kVar.mo119352e()) == null) {
            str3 = null;
        } else {
            str3 = e.mo119357A();
        }
        if (str3 != null) {
            str6 = str3;
        }
        pairArr[2] = C11078d1.m42659a(C28564m1.f69579m, str6);
        aVar.mo32708k(C10977s0.m41456W(pairArr));
        C13783a aVar2 = this.f63572b;
        Pair[] pairArr2 = new Pair[5];
        pairArr2[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr2[1] = C11078d1.m42659a("screen_name", "basket");
        pairArr2[2] = C11078d1.m42659a(C28526d.f68906d, "checkout");
        if (basketDomain != null) {
            str4 = basketDomain.mo115464G();
        } else {
            str4 = null;
        }
        pairArr2[3] = C11078d1.m42659a("cart_ID", str4);
        if (kVar == null || (f = kVar.mo119354f()) == null || (str5 = f.mo119180X()) == null) {
            str5 = "STORE_VIRTUEL";
        }
        pairArr2[4] = C11078d1.m42659a("cart_storeService", str5);
        C13783a.m58668o(aVar2, C10977s0.m41456W(pairArr2), false, 2, (Object) null);
    }
}
