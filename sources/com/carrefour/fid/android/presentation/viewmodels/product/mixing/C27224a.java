package com.carrefour.fid.android.presentation.viewmodels.product.mixing;

import androidx.compose.runtime.internal.C8567o;
import com.bumptech.glide.gifdecoder.C22075f;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.data.analytics.C13785c;
import com.carrefour.fid.android.analytics.data.analytics.C13786d;
import com.carrefour.fid.android.analytics.data.analytics.C13812g;
import com.carrefour.fid.android.analytics.data.analytics.C13813h;
import com.carrefour.fid.android.analytics.data.analytics.FirebaseEventKey;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13789a;
import com.carrefour.fid.android.analytics.data.analytics.firebasemodels.C13803j;
import com.carrefour.fid.android.analytics.data.analytics.firebasetypes.FirebaseItemListName;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.ProductCategoryDomain;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductListSettingsModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.C38477m;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.constant.C28592s1;
import com.carrefour.fid.android.shared.constant.C28606w1;
import com.journeyapps.barcodescanner.camera.C34935s;
import java.util.List;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C10976s;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.mixing.a */
public final class C27224a {

    /* renamed from: b */
    public static final int f66177b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f66178a;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.product.mixing.a$a */
    public /* synthetic */ class C27225a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0054 */
        static {
            /*
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$ParentScreen[] r0 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.ParentScreen.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$ParentScreen r2 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.ParentScreen.FREQUENT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$ParentScreen r3 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.ParentScreen.PRODUCTS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$ParentScreen r4 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.ParentScreen.DETAIL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$ParentScreen r5 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.ParentScreen.BASKET_BUILDER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$TypeOfProducts[] r0 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.TypeOfProducts.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$TypeOfProducts r5 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.TypeOfProducts.FREQUENT     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$TypeOfProducts r1 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.TypeOfProducts.CLASSIC     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$TypeOfProducts r1 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.TypeOfProducts.SPONSORED     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$TypeOfProducts r1 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.TypeOfProducts.RECOMMENDED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.carrefour.fid.android.presentation.ui.product.mixing.MixingProductsBottomSheetDialogFragment$TypeOfProducts r1 = com.carrefour.fid.android.presentation.p035ui.product.mixing.MixingProductsBottomSheetDialogFragment.TypeOfProducts.COUPON     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.product.mixing.C27224a.C27225a.<clinit>():void");
        }
    }

    @Inject
    public C27224a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f66178a = aVar;
    }

    /* renamed from: a */
    public final String mo79206a(MixingProductsBottomSheetDialogFragment.TypeOfProducts typeOfProducts) {
        int i = C27225a.$EnumSwitchMapping$1[typeOfProducts.ordinal()];
        if (i == 1) {
            return C22075f.f56695A;
        }
        if (i == 2) {
            return "c";
        }
        if (i == 3) {
            return C34935s.f84988a;
        }
        if (i == 4) {
            return C28515a1.f68703k;
        }
        if (i == 5) {
            return "coupons";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final String mo79207b(ProductListSettingsModel productListSettingsModel, String str, OfferProductModel offerProductModel, MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen) {
        boolean z;
        ProductModel o0;
        boolean z2 = false;
        if (productListSettingsModel != null) {
            z = productListSettingsModel.mo121830F();
        } else {
            z = false;
        }
        if (productListSettingsModel != null) {
            z2 = productListSettingsModel.mo121829E();
        }
        int i = C27225a.$EnumSwitchMapping$0[parentScreen.ordinal()];
        if (i == 1) {
            return "mes-achats-frequents";
        }
        String str2 = null;
        if (i != 2) {
            if (i == 3) {
                if (!(offerProductModel == null || (o0 = offerProductModel.mo121517o0()) == null)) {
                    str2 = o0.mo121898z();
                }
                if (str2 == null) {
                    return "";
                }
            } else if (i == 4) {
                return "recommande-pour-vous-" + str;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (z) {
            return C28606w1.f69975l;
        } else {
            if (z2) {
                return C28592s1.f69855o;
            }
            if (productListSettingsModel != null) {
                str2 = C38477m.m159642b(productListSettingsModel);
            }
            if (str2 == null) {
                return "";
            }
        }
        return str2;
    }

    /* renamed from: c */
    public final String mo79208c(ProductListSettingsModel productListSettingsModel, MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen) {
        boolean z;
        if (productListSettingsModel != null) {
            z = productListSettingsModel.mo121830F();
        } else {
            z = false;
        }
        int i = C27225a.$EnumSwitchMapping$0[parentScreen.ordinal()];
        if (i == 1) {
            return "listes";
        }
        if (i != 2) {
            if (i == 3) {
                return "product-details";
            }
            if (i == 4) {
                return "mes-produits";
            }
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            return C28526d.f68961q;
        } else {
            return "product-list";
        }
    }

    /* renamed from: d */
    public final void mo79209d(@C12580l ProductListSettingsModel productListSettingsModel, @C12580l String str, @C12580l OfferProductModel offerProductModel, @C12579k List<? extends OfferProductModel> list, @C12579k MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen) {
        String str2;
        Intrinsics.checkNotNullParameter(list, "productList");
        Intrinsics.checkNotNullParameter(parentScreen, "from");
        String b = mo79207b(productListSettingsModel, str, offerProductModel, parentScreen);
        String c = mo79208c(productListSettingsModel, parentScreen);
        C13783a aVar = this.f66178a;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, c);
        pairArr[2] = C11078d1.m42659a("screen_name", b);
        pairArr[3] = C11078d1.m42659a("ecommerce_zone", C28526d.f68934j0);
        pairArr[4] = C11078d1.m42659a("list_size_product", String.valueOf(list.size()));
        pairArr[5] = C11078d1.m42659a("list_name_product", C28526d.f68934j0);
        if (offerProductModel != null) {
            str2 = offerProductModel.mo121498K0();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        pairArr[6] = C11078d1.m42659a(C28526d.f68908d1, str2);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo79210e(@C12580l ProductListSettingsModel productListSettingsModel, @C12580l String str, @C12579k OfferProductModel offerProductModel, @C12579k MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen, @C12579k MixingProductsBottomSheetDialogFragment.TypeOfProducts typeOfProducts, int i, int i2) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        ProductCategoryDomain q;
        MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen2 = parentScreen;
        MixingProductsBottomSheetDialogFragment.TypeOfProducts typeOfProducts2 = typeOfProducts;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        Intrinsics.checkNotNullParameter(typeOfProducts2, "type");
        String b = mo79207b(productListSettingsModel, str, offerProductModel, parentScreen);
        String c = mo79208c(productListSettingsModel, parentScreen2);
        String a = mo79206a(typeOfProducts2);
        C13783a aVar = this.f66178a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[13];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, c);
        pairArr[2] = C11078d1.m42659a("screen_name", b);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68884Y0);
        pairArr[5] = C11078d1.m42659a("ecommerce_action", "add");
        pairArr[6] = C11078d1.m42659a("ecommerce_zone", C28526d.f68934j0);
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str11 = null;
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
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str3 = W2.mo115984e();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_cdBase", str3);
        pairArr[10] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str4 = o0.mo121898z();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_name", str4);
        pairArr[12] = C11078d1.m42659a(C28526d.f68912e0, a);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.ADD_TO_CART;
        String name = FirebaseItemListName.MIXING.name();
        float k = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str5 = o02.mo121898z();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str7 = o03.mo121889s();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q = o04.mo121887q()) == null) {
            str9 = null;
        } else {
            str9 = q.mo116513j();
        }
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey)) {
            str11 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, b, c, new C13789a(name, k, (String) null, C10976s.m41419k(new C13803j(str6, str8, str10, valueOf, k2, valueOf2, (Integer) null, (String) null, (String) null, str11, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }

    /* renamed from: f */
    public final void mo79211f(@C12580l ProductListSettingsModel productListSettingsModel, @C12580l String str, @C12579k OfferProductModel offerProductModel, @C12579k MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen, @C12579k MixingProductsBottomSheetDialogFragment.TypeOfProducts typeOfProducts, int i, int i2) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        ProductCategoryDomain q;
        MixingProductsBottomSheetDialogFragment.ParentScreen parentScreen2 = parentScreen;
        MixingProductsBottomSheetDialogFragment.TypeOfProducts typeOfProducts2 = typeOfProducts;
        Intrinsics.checkNotNullParameter(offerProductModel, C28547h2.f69318f);
        Intrinsics.checkNotNullParameter(parentScreen2, "from");
        Intrinsics.checkNotNullParameter(typeOfProducts2, "type");
        String b = mo79207b(productListSettingsModel, str, offerProductModel, parentScreen);
        String c = mo79208c(productListSettingsModel, parentScreen2);
        String a = mo79206a(typeOfProducts2);
        C13783a aVar = this.f66178a;
        C13813h[] hVarArr = new C13813h[2];
        Pair[] pairArr = new Pair[13];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, c);
        pairArr[2] = C11078d1.m42659a("screen_name", b);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "ecommerce");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28526d.f68935j1);
        pairArr[5] = C11078d1.m42659a("ecommerce_action", "remove");
        pairArr[6] = C11078d1.m42659a("ecommerce_zone", C28526d.f68934j0);
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str11 = null;
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
        OfferIdentifierDomain W2 = offerProductModel.mo121502W();
        if (W2 != null) {
            str3 = W2.mo115984e();
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        pairArr[9] = C11078d1.m42659a("product_cdBase", str3);
        pairArr[10] = C11078d1.m42659a(C28526d.f68930i0, String.valueOf(i));
        ProductModel o0 = offerProductModel.mo121517o0();
        if (o0 != null) {
            str4 = o0.mo121898z();
        } else {
            str4 = null;
        }
        if (str4 == null) {
            str4 = "";
        }
        pairArr[11] = C11078d1.m42659a("product_name", str4);
        pairArr[12] = C11078d1.m42659a(C28526d.f68912e0, a);
        hVarArr[0] = new C13785c(C10977s0.m41456W(pairArr), false, 2, (DefaultConstructorMarker) null);
        FirebaseEventKey firebaseEventKey = FirebaseEventKey.REMOVE_FROM_CART;
        String name = FirebaseItemListName.MIXING.name();
        float k = OfferProductModelKt.m159589k(offerProductModel);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            str5 = o02.mo121898z();
        } else {
            str5 = null;
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        ProductModel o03 = offerProductModel.mo121517o0();
        if (o03 != null) {
            str7 = o03.mo121889s();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        ProductModel o04 = offerProductModel.mo121517o0();
        if (o04 == null || (q = o04.mo121887q()) == null) {
            str9 = null;
        } else {
            str9 = q.mo116513j();
        }
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        Integer valueOf = Integer.valueOf(i2);
        float k2 = OfferProductModelKt.m159589k(offerProductModel);
        Integer valueOf2 = Integer.valueOf(i);
        if (C13786d.m58689b(firebaseEventKey)) {
            str11 = offerProductModel.mo121498K0();
        }
        hVarArr[1] = new C13812g(firebaseEventKey, b, c, new C13789a(name, k, (String) null, C10976s.m41419k(new C13803j(str6, str8, str10, valueOf, k2, valueOf2, (Integer) null, (String) null, (String) null, str11, 448, (DefaultConstructorMarker) null)), (String) null, (Float) null, 52, (DefaultConstructorMarker) null));
        aVar.mo32711n(hVarArr);
    }
}
