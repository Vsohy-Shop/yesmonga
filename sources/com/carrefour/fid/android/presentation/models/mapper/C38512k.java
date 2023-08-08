package com.carrefour.fid.android.presentation.models.mapper;

import android.content.res.Resources;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36309h;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardXsComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.models.mapper.k */
public final class C38512k {

    /* renamed from: com.carrefour.fid.android.presentation.models.mapper.k$a */
    public /* synthetic */ class C38513a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType[] r0 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.PROMO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.PF     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RI     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.RD     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.mapper.C38512k.C38513a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final ProductCardXsComponent.C37345a m159777a(@C12579k OfferProductModel offerProductModel, @C12579k Resources resources, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2, @C12579k C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, @C12580l C11289a<C11079d2> aVar5) {
        OfferDiscountType offerDiscountType;
        int i;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(aVar, "onAtcPressed");
        Intrinsics.checkNotNullParameter(aVar2, "onDeletePressed");
        Intrinsics.checkNotNullParameter(aVar3, "onCardPressed");
        if (ProductCardMapperKt.m159738k(offerProductModel)) {
            return m159780d(offerProductModel, resources, aVar, aVar2, aVar3, aVar4, aVar5);
        }
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            offerDiscountType = w.mo115961z();
        } else {
            offerDiscountType = null;
        }
        if (offerDiscountType == null) {
            i = -1;
        } else {
            i = C38513a.$EnumSwitchMapping$0[offerDiscountType.ordinal()];
        }
        if (i == 1) {
            return m159781e(offerProductModel, resources, aVar, aVar2, aVar3);
        }
        if (i == 2) {
            return m159781e(offerProductModel, resources, aVar, aVar2, aVar3);
        }
        if (i == 3) {
            return m159781e(offerProductModel, resources, aVar, aVar2, aVar3);
        }
        if (i != 4) {
            return m159782f(offerProductModel, aVar, aVar2, aVar3);
        }
        return m159779c(offerProductModel, resources, aVar, aVar2, aVar3);
    }

    /* renamed from: b */
    public static /* synthetic */ ProductCardXsComponent.C37345a m159778b(OfferProductModel offerProductModel, Resources resources, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, C11289a aVar5, int i, Object obj) {
        return m159777a(offerProductModel, resources, aVar, aVar2, aVar3, (i & 16) != 0 ? null : aVar4, (i & 32) != 0 ? null : aVar5);
    }

    /* renamed from: c */
    public static final ProductCardXsComponent.C37345a.C37346a m159779c(OfferProductModel offerProductModel, Resources resources, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W == null || (f = W.mo115986f()) == null) {
            str = "";
        } else {
            str = f;
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
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, false)));
        PriceComponent.Size size = PriceComponent.Size.SMALL;
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z = o02.mo121868B();
        } else {
            z = false;
        }
        PriceComponent.C37329a.C37332c cVar = new PriceComponent.C37329a.C37332c(b, (String) null, size, z, 2, (DefaultConstructorMarker) null);
        String string = resources.getString(R.string.product_card_loyalty);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.product_card_loyalty)");
        LabelComponent.C37316a.C37323g gVar = new LabelComponent.C37316a.C37323g(string);
        String d = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size2 = ImageComponent.Size.f93604d;
        if (offerProductModel.mo121519p0() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ImageComponent.C37313a aVar4 = new ImageComponent.C37313a(d, size2, z2);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new ProductCardXsComponent.C37345a.C37346a(str, aVar4, str3, f2, B, p0, cVar, gVar, aVar, aVar3, N0, z3, ProductCardMapperKt.m159737j(offerProductModel));
    }

    /* renamed from: d */
    public static final ProductCardXsComponent.C37345a.C37347b m159780d(OfferProductModel offerProductModel, Resources resources, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11289a<C11079d2> aVar5) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W == null || (f = W.mo115986f()) == null) {
            str = "";
        } else {
            str = f;
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
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, false)));
        PriceComponent.Size size = PriceComponent.Size.SMALL;
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z = o02.mo121868B();
        } else {
            z = false;
        }
        PriceComponent.C37329a.C37333d dVar = new PriceComponent.C37329a.C37333d(b, (String) null, size, z, 2, (DefaultConstructorMarker) null);
        String string = resources.getString(R.string.product_card_promo);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.product_card_promo)");
        LabelComponent.C37316a.C37326j jVar = new LabelComponent.C37316a.C37326j(string);
        String d = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size2 = ImageComponent.Size.f93604d;
        if (offerProductModel.mo121519p0() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ImageComponent.C37313a aVar6 = new ImageComponent.C37313a(d, size2, z2);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        ProductOverlayComponent.C37161b h = ProductCardMapperKt.m159735h(offerProductModel2, aVar4, aVar5);
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new ProductCardXsComponent.C37345a.C37347b(str, aVar6, str3, f2, B, h, p0, dVar, jVar, aVar, aVar3, N0, z3, ProductCardMapperKt.m159737j(offerProductModel));
    }

    /* renamed from: e */
    public static final ProductCardXsComponent.C37345a.C37348c m159781e(OfferProductModel offerProductModel, Resources resources, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W == null || (f = W.mo115986f()) == null) {
            str = "";
        } else {
            str = f;
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
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, false)));
        String b2 = C28782t.m119105b(ProductCardMapperKt.m159736i(offerProductModel));
        PriceComponent.Size size = PriceComponent.Size.SMALL;
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z = o02.mo121868B();
        } else {
            z = false;
        }
        PriceComponent.C37329a.C37334e eVar = new PriceComponent.C37329a.C37334e(b, b2, size, z);
        String string = resources.getString(R.string.product_card_promo);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.product_card_promo)");
        LabelComponent.C37316a.C37326j jVar = new LabelComponent.C37316a.C37326j(string);
        String d = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size2 = ImageComponent.Size.f93604d;
        if (offerProductModel.mo121519p0() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ImageComponent.C37313a aVar4 = new ImageComponent.C37313a(d, size2, z2);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new ProductCardXsComponent.C37345a.C37348c(str, aVar4, str3, f2, B, p0, eVar, jVar, aVar, aVar3, N0, z3, ProductCardMapperKt.m159737j(offerProductModel));
    }

    /* renamed from: f */
    public static final ProductCardXsComponent.C37345a.C37349d m159782f(OfferProductModel offerProductModel, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        if (W == null || (f = W.mo115986f()) == null) {
            str = "";
        } else {
            str = f;
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
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, false)));
        PriceComponent.Size size = PriceComponent.Size.SMALL;
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z = o02.mo121868B();
        } else {
            z = false;
        }
        PriceComponent.C37329a.C37335f fVar = new PriceComponent.C37329a.C37335f(b, size, z);
        String d = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size2 = ImageComponent.Size.f93604d;
        if (offerProductModel.mo121519p0() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ImageComponent.C37313a aVar4 = new ImageComponent.C37313a(d, size2, z2);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new ProductCardXsComponent.C37345a.C37349d(str, aVar4, str3, f2, B, p0, fVar, aVar, aVar3, N0, z3, ProductCardMapperKt.m159737j(offerProductModel));
    }
}
