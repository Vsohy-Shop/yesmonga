package com.carrefour.fid.android.presentation.viewmodels.account.list.order;

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
import com.carrefour.fid.android.presentation.models.OfferModel;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28536f1;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28612y1;
import com.contentsquare.android.api.C14092c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAccountListOrderAnalyticsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountListOrderAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/order/AccountListOrderAnalyticsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n1864#2,2:369\n1559#2:371\n1590#2,4:372\n1866#2:376\n*S KotlinDebug\n*F\n+ 1 AccountListOrderAnalyticsViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/account/list/order/AccountListOrderAnalyticsViewModel\n*L\n306#1:369,2\n314#1:371\n314#1:372,4\n306#1:376\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.order.a */
public final class C25858a {

    /* renamed from: c */
    public static final int f63311c = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f63312a;

    /* renamed from: b */
    public boolean f63313b;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.list.order.a$a */
    public /* synthetic */ class C25859a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen[] r0 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.BASKET_BUILDER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$ParentScreen r1 = com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment.ParentScreen.ACCOUNT_LIST     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.account.list.order.C25858a.C25859a.<clinit>():void");
        }
    }

    @Inject
    public C25858a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f63312a = aVar;
    }

    /* renamed from: a */
    public final String mo75070a(AccountListFragment.ParentScreen parentScreen) {
        int i = C25859a.$EnumSwitchMapping$0[parentScreen.ordinal()];
        if (i == 1) {
            return "mes-produits";
        }
        if (i == 2) {
            return "mon-compte";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final String mo75071b(AccountListFragment.ParentScreen parentScreen) {
        int i = C25859a.$EnumSwitchMapping$0[parentScreen.ordinal()];
        if (i == 1) {
            return C28536f1.f69210k;
        }
        if (i == 2) {
            return "commander-a-nouveau";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public final String mo75072c(AccountListFragment.ParentScreen parentScreen) {
        int i = C25859a.$EnumSwitchMapping$0[parentScreen.ordinal()];
        if (i == 1) {
            return "mes-produits";
        }
        if (i == 2) {
            return "mon-compte";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public final void mo75073d() {
        this.f63313b = false;
    }

    /* renamed from: e */
    public final void mo75074e(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63312a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", mo75071b(parentScreen)), C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen)), C11078d1.m42659a(C28526d.f68933j, C28612y1.f70082c), C11078d1.m42659a(C28526d.f68929i, mo75072c(parentScreen))), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo75075f(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen, int i, int i2) {
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
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        OfferDiscountType z;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63312a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[14];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo75071b(parentScreen2));
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen2));
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", mo75070a(parentScreen2));
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
        String b = mo75071b(parentScreen2);
        String c = mo75072c(parentScreen2);
        String b2 = mo75071b(parentScreen2);
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
        C13806m mVar = r14;
        C13806m mVar2 = new C13806m(b2, (String) null, new C13802i(str7, str9, str11, i2, k, q4, (Integer) null, (String) null, str12, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, b, c, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String b3 = mo75071b(parentScreen2);
        String c2 = mo75072c(parentScreen2);
        String b4 = mo75071b(parentScreen2);
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
        hVarArr[2] = new C13812g(firebaseEventKey2, b3, c2, new C13807n(b4, (String) null, new C13802i(str14, str16, str18, i2, k2, q5, (Integer) null, (String) null, str19, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.ADD_TO_CART;
        String b5 = mo75071b(parentScreen2);
        String c3 = mo75072c(parentScreen2);
        String b6 = mo75071b(parentScreen2);
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
        } else {
            str26 = null;
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, b5, c3, new C13789a(b6, k3, (String) null, C10976s.m41419k(new C13803j(str21, str23, str25, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str26, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: g */
    public final void mo75076g(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen, int i, int i2) {
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
        ProductCategoryDomain q;
        ProductCategoryDomain q2;
        ProductCategoryDomain q3;
        OfferDiscountType z;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63312a;
        C13813h[] hVarArr = new C13813h[4];
        Pair[] pairArr = new Pair[14];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo75071b(parentScreen2));
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen2));
        pairArr[3] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[4] = C11078d1.m42659a("ecommerce_zone", mo75070a(parentScreen2));
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
        String b = mo75071b(parentScreen2);
        String c = mo75072c(parentScreen2);
        String b2 = mo75071b(parentScreen2);
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
        C13806m mVar = r14;
        C13806m mVar2 = new C13806m(b2, (String) null, new C13802i(str7, str9, str11, i2, k, q4, (Integer) null, (String) null, str12, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null);
        hVarArr[1] = new C13812g(firebaseEventKey, b, c, mVar);
        FirebaseEventKey firebaseEventKey2 = FirebaseEventKey.SELECT_ITEM;
        String b3 = mo75071b(parentScreen2);
        String c2 = mo75072c(parentScreen2);
        String b4 = mo75071b(parentScreen2);
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
        hVarArr[2] = new C13812g(firebaseEventKey2, b3, c2, new C13807n(b4, (String) null, new C13802i(str14, str16, str18, i2, k2, q5, (Integer) null, (String) null, str19, C14092c.f34560U, (DefaultConstructorMarker) null), (Integer) null, (String) null, (String) null, (Float) null, 122, (DefaultConstructorMarker) null));
        FirebaseEventKey firebaseEventKey3 = FirebaseEventKey.REMOVE_FROM_CART;
        String b5 = mo75071b(parentScreen2);
        String c3 = mo75072c(parentScreen2);
        String b6 = mo75071b(parentScreen2);
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
        } else {
            str26 = null;
        }
        hVarArr[3] = new C13812g(firebaseEventKey3, b5, c3, new C13789a(b6, k3, (String) null, C10976s.m41419k(new C13803j(str21, str23, str25, valueOf, k4, valueOf2, (Integer) null, (String) null, (String) null, str26, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: h */
    public final void mo75077h(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a aVar = this.f63312a;
        String b = mo75071b(parentScreen);
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", b + "-vide"), C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen)), C11078d1.m42659a(C28526d.f68933j, "commencer-mes-courses"), C11078d1.m42659a(C28526d.f68929i, mo75072c(parentScreen))), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo75078i(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63312a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen)), C11078d1.m42659a("screen_name", mo75071b(parentScreen)), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68868U0)), false, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo75079j(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ProductCategoryDomain q;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63312a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[8];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo75071b(parentScreen2));
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen2));
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68837M1);
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str9 = null;
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[5] = C11078d1.m42659a("product_EAN", str);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str2 = o0.mo121898z();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[6] = C11078d1.m42659a("product_name", str2);
        pairArr[7] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_WISHLIST;
        String b = mo75071b(parentScreen2);
        String c = mo75072c(parentScreen2);
        String b2 = mo75071b(parentScreen2);
        float k = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str3 = o02.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str5 = o03.mo121889s();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q = o04.mo121887q()) == null) {
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
            str9 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, b, c, new C13789a(b2, k, (String) null, C10976s.m41419k(new C13803j(str4, str6, str8, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str9, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: k */
    public final void mo75080k(@C12579k OfferProductModel offerProductModel, @C12579k AccountListFragment.ParentScreen parentScreen, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ProductCategoryDomain q;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        C13783a aVar = this.f63312a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[8];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a("screen_name", mo75071b(parentScreen2));
        pairArr[2] = C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen2));
        pairArr[3] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68841N1);
        pairArr[4] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str9 = null;
        if (W != null) {
            str = W.mo115986f();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        pairArr[5] = C11078d1.m42659a("product_EAN", str);
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str2 = o0.mo121898z();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[6] = C11078d1.m42659a("product_name", str2);
        pairArr[7] = C11078d1.m42659a(C28526d.f68907d0, OfferProductModelKt.m159592n(offerProductModel));
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_WISHLIST;
        String b = mo75071b(parentScreen2);
        String c = mo75072c(parentScreen2);
        String b2 = mo75071b(parentScreen2);
        float k = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str3 = o02.mo121898z();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str5 = o03.mo121889s();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q = o04.mo121887q()) == null) {
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
            str9 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, b, c, new C13789a(b2, k, (String) null, C10976s.m41419k(new C13803j(str4, str6, str8, valueOf, k2, 1, (Integer) null, (String) null, (String) null, str9, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: l */
    public final void mo75081l(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63312a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen)), C11078d1.m42659a("screen_name", mo75071b(parentScreen)), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68864T0)), false, 2, (Object) null);
    }

    /* renamed from: m */
    public final void mo75082m(@C12579k AccountListFragment.ParentScreen parentScreen) {
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        C13783a.m58668o(this.f63312a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", mo75071b(parentScreen)), C11078d1.m42659a(C28526d.f68906d, mo75072c(parentScreen)), C11078d1.m42659a(C28526d.f68933j, "infos-produits-indisponibles"), C11078d1.m42659a(C28526d.f68929i, mo75072c(parentScreen))), false, 2, (Object) null);
    }

    /* renamed from: n */
    public final void mo75083n(@C12579k List<? extends OfferModel> list, @C12579k AccountListFragment.ParentScreen parentScreen) {
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
        List<? extends OfferModel> list2 = list;
        AccountListFragment.ParentScreen parentScreen2 = parentScreen;
        Intrinsics.checkNotNullParameter(list2, "list");
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        if (!this.f63313b) {
            this.f63313b = true;
            List<R> a1 = C10998z.m42387a1(list2, OfferProductModel.class);
            if (parentScreen2 == AccountListFragment.ParentScreen.BASKET_BUILDER) {
                C13783a.m58667i(this.f63312a, "mes-produits", C28536f1.f69210k, (Map) null, false, false, false, 60, (Object) null);
            } else {
                C13783a.m58667i(this.f63312a, "mon-compte", "commander-a-nouveau", (Map) null, false, false, false, 60, (Object) null);
            }
            int i = 10;
            int i2 = 0;
            for (Object next : CollectionsKt___CollectionsKt.m40523K1(a1, 10)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                C13783a aVar = this.f63312a;
                C13813h[] hVarArr = new C13813h[1];
                FirebaseEventKey firebaseEventKey = FirebaseEventKey.VIEW_ITEM_LIST;
                String b = mo75071b(parentScreen2);
                String c = mo75072c(parentScreen2);
                String b2 = mo75071b(parentScreen2);
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
                hVarArr[0] = new C13812g(firebaseEventKey, b, c, new C13790b(b2, (String) null, arrayList, (String) null, (Float) null, 26, (DefaultConstructorMarker) null));
                aVar.mo32711n(hVarArr);
                i2 = i3;
                i = 10;
            }
        }
    }
}
