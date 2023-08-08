package com.carrefour.fid.android.presentation.models.mapper;

import android.content.res.Resources;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.core.extension.C36309h;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.widgets.NutriscoreComponent;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.carrefour.fid.android.domain.models.OfferDiscountDomain;
import com.carrefour.fid.android.domain.models.OfferIdentifierDomain;
import com.carrefour.fid.android.domain.models.offer.OfferAvailability;
import com.carrefour.fid.android.domain.models.offer.OfferDiscountType;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.models.ProductModel;
import com.carrefour.fid.android.presentation.models.extension.OfferProductModelKt;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.presentation.models.mapper.j */
public final class C38510j {

    /* renamed from: com.carrefour.fid.android.presentation.models.mapper.j$a */
    public /* synthetic */ class C38511a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
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
                com.carrefour.fid.android.domain.models.offer.OfferDiscountType r1 = com.carrefour.fid.android.domain.models.offer.OfferDiscountType.TA     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.models.mapper.C38510j.C38511a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final ProductCardSComponent.C37338a m159763a(@C12579k OfferProductModel offerProductModel, @C12579k Resources resources, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12579k C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, boolean z, boolean z2, boolean z3, boolean z4, @C12580l C11289a<C11079d2> aVar5) {
        OfferDiscountType offerDiscountType;
        int i;
        OfferProductModel offerProductModel2 = offerProductModel;
        Intrinsics.checkNotNullParameter(offerProductModel, "<this>");
        Resources resources2 = resources;
        Intrinsics.checkNotNullParameter(resources, "resources");
        C11300l<? super C37133a, C11079d2> lVar4 = lVar;
        Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
        C11300l<? super C37133a, C11079d2> lVar5 = lVar2;
        Intrinsics.checkNotNullParameter(lVar2, "onDeletePressed");
        Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
        if (ProductCardMapperKt.m159738k(offerProductModel)) {
            return m159771i(offerProductModel, resources, lVar, lVar2, lVar3, aVar, aVar2, aVar3, aVar4, z, z2, z3, z4, aVar5);
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
            i = C38511a.$EnumSwitchMapping$0[offerDiscountType.ordinal()];
        }
        if (i == 1) {
            return m159773k(offerProductModel, lVar, lVar2, lVar3, aVar, z, z2, z3, z4, aVar5);
        }
        if (i == 2) {
            return m159773k(offerProductModel, lVar, lVar2, lVar3, aVar, z, z2, z3, z4, aVar5);
        }
        if (i == 3) {
            return m159767e(offerProductModel, resources, lVar, lVar2, lVar3, aVar, z, z2, z3, z4, aVar5);
        }
        if (i == 4) {
            return m159769g(offerProductModel, resources, lVar, lVar2, lVar3, aVar, z, z2, z3, z4, aVar5);
        }
        if (i != 5) {
            return m159775m(offerProductModel, lVar, lVar2, lVar3, aVar, z, z2, z3, z4, aVar5);
        }
        return m159765c(offerProductModel, lVar, lVar2, lVar3, aVar, z, z2, z3, z4, aVar5);
    }

    /* renamed from: b */
    public static /* synthetic */ ProductCardSComponent.C37338a m159764b(OfferProductModel offerProductModel, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, boolean z, boolean z2, boolean z3, boolean z4, C11289a aVar5, int i, Object obj) {
        int i2 = i;
        return m159763a(offerProductModel, resources, lVar, lVar2, lVar3, (i2 & 16) != 0 ? null : aVar, aVar2, (i2 & 64) != 0 ? null : aVar3, (i2 & 128) != 0 ? null : aVar4, z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? false : z4, (i2 & 4096) != 0 ? null : aVar5);
    }

    /* renamed from: c */
    public static final ProductCardSComponent.C37338a.C37339a m159765c(OfferProductModel offerProductModel, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a<C11079d2> aVar2) {
        String str;
        String str2;
        String str3;
        boolean z5;
        String str4;
        boolean z6;
        boolean z7;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str5 = "";
        if (W == null || (f = W.mo115986f()) == null) {
            str = str5;
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
            str3 = str5;
        } else {
            str3 = str2;
        }
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, z)));
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z5 = o02.mo121868B();
        } else {
            z5 = false;
        }
        PriceComponent.C37329a.C37330a aVar3 = new PriceComponent.C37329a.C37330a(b, (String) null, (PriceComponent.Size) null, z5, 6, (DefaultConstructorMarker) null);
        String b2 = ProductCardMapperKt.m159729b(offerProductModel);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 != null) {
            str5 = str4;
        }
        ContentComponent.C37305a.C37306a aVar4 = new ContentComponent.C37305a.C37306a(str3, b2, aVar3, "", (List) null, true, "", new LabelComponent.C37316a.C37317a(str5), 16, (DefaultConstructorMarker) null);
        String d = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z2 || offerProductModel.mo121519p0() <= 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        ImageComponent.C37313a aVar5 = new ImageComponent.C37313a(d, size, z6);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        NutriscoreComponent.C37157a j = OfferProductModelKt.m159588j(offerProductModel2, false, (NutriscoreComponent.Size) null, 2, (Object) null);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        boolean A1 = offerProductModel.mo121497A1();
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        boolean l1 = offerProductModel.mo121744l1();
        boolean j1 = offerProductModel.mo121742j1();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new ProductCardSComponent.C37338a.C37339a(str, aVar5, aVar4, f2, j, B, A1, p0, lVar, lVar2, lVar3, aVar, (C11289a) null, N0, l1, j1, z7, ProductCardMapperKt.m159737j(offerProductModel), z3, false, false, z4, aVar2, 1576960, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37339a m159766d(OfferProductModel offerProductModel, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m159765c(offerProductModel, lVar, lVar2, lVar3, (i2 & 8) != 0 ? null : aVar, z, z2, z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? null : aVar2);
    }

    /* renamed from: e */
    public static final ProductCardSComponent.C37338a.C37340b m159767e(OfferProductModel offerProductModel, Resources resources, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a<C11079d2> aVar2) {
        String str;
        String str2;
        String str3;
        boolean z5;
        String str4;
        boolean z6;
        boolean z7;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str5 = "";
        if (W == null || (f = W.mo115986f()) == null) {
            str = str5;
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
            str3 = str5;
        } else {
            str3 = str2;
        }
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, z)));
        String d = ProductCardMapperKt.m159731d(offerProductModel, resources);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z5 = o02.mo121868B();
        } else {
            z5 = false;
        }
        PriceComponent.C37329a.C37331b bVar = new PriceComponent.C37329a.C37331b(b, d, (PriceComponent.Size) null, z5, 4, (DefaultConstructorMarker) null);
        String b2 = ProductCardMapperKt.m159729b(offerProductModel);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 != null) {
            str5 = str4;
        }
        ContentComponent.C37305a.C37307b bVar2 = new ContentComponent.C37305a.C37307b(str3, b2, bVar, "", (List) null, true, "", new LabelComponent.C37316a.C37325i(str5), 16, (DefaultConstructorMarker) null);
        String d2 = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z2 || offerProductModel.mo121519p0() <= 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        ImageComponent.C37313a aVar3 = new ImageComponent.C37313a(d2, size, z6);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        NutriscoreComponent.C37157a j = OfferProductModelKt.m159588j(offerProductModel2, false, (NutriscoreComponent.Size) null, 2, (Object) null);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        boolean A1 = offerProductModel.mo121497A1();
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        boolean l1 = offerProductModel.mo121744l1();
        boolean j1 = offerProductModel.mo121742j1();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new ProductCardSComponent.C37338a.C37340b(str, aVar3, bVar2, f2, j, B, A1, p0, lVar, lVar2, lVar3, aVar, (C11289a) null, N0, l1, j1, z7, ProductCardMapperKt.m159737j(offerProductModel), z3, false, false, z4, aVar2, 1576960, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37340b m159768f(OfferProductModel offerProductModel, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m159767e(offerProductModel, resources, lVar, lVar2, lVar3, (i2 & 16) != 0 ? null : aVar, z, z2, z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? null : aVar2);
    }

    /* renamed from: g */
    public static final ProductCardSComponent.C37338a.C37341c m159769g(OfferProductModel offerProductModel, Resources resources, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a<C11079d2> aVar2) {
        String str;
        String str2;
        String str3;
        boolean z5;
        String str4;
        boolean z6;
        boolean z7;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str5 = "";
        if (W == null || (f = W.mo115986f()) == null) {
            str = str5;
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
            str3 = str5;
        } else {
            str3 = str2;
        }
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, z)));
        String e = ProductCardMapperKt.m159732e(offerProductModel, resources);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z5 = o02.mo121868B();
        } else {
            z5 = false;
        }
        PriceComponent.C37329a.C37332c cVar = new PriceComponent.C37329a.C37332c(b, e, (PriceComponent.Size) null, z5, 4, (DefaultConstructorMarker) null);
        String b2 = ProductCardMapperKt.m159729b(offerProductModel);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 != null) {
            str5 = str4;
        }
        ContentComponent.C37305a.C37308c cVar2 = new ContentComponent.C37305a.C37308c(str3, b2, cVar, "", (List) null, true, "", new LabelComponent.C37316a.C37321e(str5), 16, (DefaultConstructorMarker) null);
        String d = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z2 || offerProductModel.mo121519p0() <= 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        ImageComponent.C37313a aVar3 = new ImageComponent.C37313a(d, size, z6);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        NutriscoreComponent.C37157a j = OfferProductModelKt.m159588j(offerProductModel2, false, (NutriscoreComponent.Size) null, 2, (Object) null);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        boolean A1 = offerProductModel.mo121497A1();
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        boolean l1 = offerProductModel.mo121744l1();
        boolean j1 = offerProductModel.mo121742j1();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new ProductCardSComponent.C37338a.C37341c(str, aVar3, cVar2, f2, j, B, A1, p0, lVar, lVar2, lVar3, aVar, (C11289a) null, N0, l1, j1, z7, ProductCardMapperKt.m159737j(offerProductModel), z3, false, false, z4, aVar2, 1576960, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37341c m159770h(OfferProductModel offerProductModel, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m159769g(offerProductModel, resources, lVar, lVar2, lVar3, (i2 & 16) != 0 ? null : aVar, z, z2, z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? null : aVar2);
    }

    /* renamed from: i */
    public static final ProductCardSComponent.C37338a.C37342d m159771i(OfferProductModel offerProductModel, Resources resources, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, boolean z, boolean z2, boolean z3, boolean z4, C11289a<C11079d2> aVar5) {
        String str;
        String str2;
        String str3;
        boolean z5;
        String str4;
        boolean z6;
        boolean z7;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str5 = "";
        if (W == null || (f = W.mo115986f()) == null) {
            str = str5;
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
            str3 = str5;
        } else {
            str3 = str2;
        }
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, z)));
        String g = ProductCardMapperKt.m159734g(offerProductModel, resources);
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z5 = o02.mo121868B();
        } else {
            z5 = false;
        }
        PriceComponent.C37329a.C37333d dVar = new PriceComponent.C37329a.C37333d(b, g, (PriceComponent.Size) null, z5, 4, (DefaultConstructorMarker) null);
        String b2 = ProductCardMapperKt.m159729b(offerProductModel);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str4 = w.mo115956v();
        } else {
            str4 = null;
        }
        if (str4 != null) {
            str5 = str4;
        }
        String string = resources.getString(R.string.show_selection);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.show_selection)");
        ContentComponent.C37305a.C37309d dVar2 = new ContentComponent.C37305a.C37309d(str3, b2, dVar, "", (List) null, true, "", new LabelComponent.C37316a.C37324h(str5, string, aVar2), 16, (DefaultConstructorMarker) null);
        String d = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z2 || offerProductModel.mo121519p0() <= 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        ImageComponent.C37313a aVar6 = new ImageComponent.C37313a(d, size, z6);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        NutriscoreComponent.C37157a j = OfferProductModelKt.m159588j(offerProductModel2, false, (NutriscoreComponent.Size) null, 2, (Object) null);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        ProductOverlayComponent.C37161b h = ProductCardMapperKt.m159735h(offerProductModel2, aVar3, aVar4);
        boolean A1 = offerProductModel.mo121497A1();
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        boolean l1 = offerProductModel.mo121744l1();
        boolean j1 = offerProductModel.mo121742j1();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new ProductCardSComponent.C37338a.C37342d(str, aVar6, dVar2, f2, j, B, h, A1, p0, lVar, lVar2, lVar3, aVar, (C11289a) null, N0, l1, j1, z7, ProductCardMapperKt.m159737j(offerProductModel), z3, false, false, z4, aVar5, 3153920, (DefaultConstructorMarker) null);
    }

    /* renamed from: j */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37342d m159772j(OfferProductModel offerProductModel, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, boolean z, boolean z2, boolean z3, boolean z4, C11289a aVar5, int i, Object obj) {
        int i2 = i;
        return m159771i(offerProductModel, resources, lVar, lVar2, lVar3, (i2 & 16) != 0 ? null : aVar, aVar2, aVar3, aVar4, z, z2, z3, (i2 & 2048) != 0 ? false : z4, (i2 & 4096) != 0 ? null : aVar5);
    }

    /* renamed from: k */
    public static final ProductCardSComponent.C37338a.C37343e m159773k(OfferProductModel offerProductModel, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a<C11079d2> aVar2) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z5;
        String str5;
        boolean z6;
        boolean z7;
        Double d;
        String f;
        OfferProductModel offerProductModel2 = offerProductModel;
        boolean z8 = z;
        OfferIdentifierDomain W = offerProductModel.mo121502W();
        String str6 = "";
        if (W == null || (f = W.mo115986f()) == null) {
            str = str6;
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
            str3 = str6;
        } else {
            str3 = str2;
        }
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, z8)));
        if (z8) {
            Double i = ProductCardMapperKt.m159736i(offerProductModel);
            if (i != null) {
                d = Double.valueOf(i.doubleValue() * ((double) offerProductModel.mo121519p0()));
            } else {
                d = null;
            }
            str4 = C28782t.m119105b(d);
        } else {
            str4 = C28782t.m119105b(ProductCardMapperKt.m159736i(offerProductModel));
        }
        String str7 = str4;
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z5 = o02.mo121868B();
        } else {
            z5 = false;
        }
        PriceComponent.C37329a.C37334e eVar = new PriceComponent.C37329a.C37334e(b, str7, (PriceComponent.Size) null, z5, 4, (DefaultConstructorMarker) null);
        String b2 = ProductCardMapperKt.m159729b(offerProductModel);
        OfferDiscountDomain w = offerProductModel.mo121523w();
        if (w != null) {
            str5 = w.mo115956v();
        } else {
            str5 = null;
        }
        if (str5 != null) {
            str6 = str5;
        }
        ContentComponent.C37305a.C37310e eVar2 = new ContentComponent.C37305a.C37310e(str3, b2, eVar, "", (List) null, true, "", new LabelComponent.C37316a.C37325i(str6), 16, (DefaultConstructorMarker) null);
        String d2 = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z2 || offerProductModel.mo121519p0() <= 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        ImageComponent.C37313a aVar3 = new ImageComponent.C37313a(d2, size, z6);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        NutriscoreComponent.C37157a j = OfferProductModelKt.m159588j(offerProductModel2, false, (NutriscoreComponent.Size) null, 2, (Object) null);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        boolean A1 = offerProductModel.mo121497A1();
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        boolean l1 = offerProductModel.mo121744l1();
        boolean j1 = offerProductModel.mo121742j1();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new ProductCardSComponent.C37338a.C37343e(str, aVar3, eVar2, f2, j, B, A1, p0, lVar, lVar2, lVar3, aVar, (C11289a) null, N0, l1, j1, z7, ProductCardMapperKt.m159737j(offerProductModel), z3, false, false, z4, aVar2, 1576960, (DefaultConstructorMarker) null);
    }

    /* renamed from: l */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37343e m159774l(OfferProductModel offerProductModel, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m159773k(offerProductModel, lVar, lVar2, lVar3, (i2 & 8) != 0 ? null : aVar, z, z2, z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? null : aVar2);
    }

    /* renamed from: m */
    public static final ProductCardSComponent.C37338a.C37344f m159775m(OfferProductModel offerProductModel, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a<C11079d2> aVar2) {
        String str;
        String str2;
        String str3;
        boolean z5;
        boolean z6;
        boolean z7;
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
        String b = C28782t.m119105b(Double.valueOf(ProductCardMapperKt.m159730c(offerProductModel2, z)));
        ProductModel o02 = offerProductModel.mo121517o0();
        if (o02 != null) {
            z5 = o02.mo121868B();
        } else {
            z5 = false;
        }
        ContentComponent.C37305a.C37311f fVar = new ContentComponent.C37305a.C37311f(str3, ProductCardMapperKt.m159729b(offerProductModel), new PriceComponent.C37329a.C37335f(b, (PriceComponent.Size) null, z5, 2, (DefaultConstructorMarker) null), "", (List) null, true, "", 16, (DefaultConstructorMarker) null);
        String d = C36309h.m148964d(offerProductModel2, (String) null, 1, (Object) null);
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z2 || offerProductModel.mo121519p0() <= 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        ImageComponent.C37313a aVar3 = new ImageComponent.C37313a(d, size, z6);
        LozengeListComponent.C37381a f2 = ProductCardMapperKt.m159733f(offerProductModel);
        NutriscoreComponent.C37157a j = OfferProductModelKt.m159588j(offerProductModel2, false, (NutriscoreComponent.Size) null, 2, (Object) null);
        boolean B = OfferProductModelKt.m159553B(offerProductModel);
        boolean A1 = offerProductModel.mo121497A1();
        int p0 = offerProductModel.mo121519p0();
        boolean N0 = offerProductModel.mo121733N0();
        boolean l1 = offerProductModel.mo121744l1();
        boolean j1 = offerProductModel.mo121742j1();
        if (offerProductModel.mo121509g() == OfferAvailability.AVAILABLE) {
            z7 = true;
        } else {
            z7 = false;
        }
        return new ProductCardSComponent.C37338a.C37344f(str, aVar3, fVar, f2, j, B, A1, p0, lVar, lVar2, lVar3, aVar, (C11289a) null, N0, l1, j1, z7, ProductCardMapperKt.m159737j(offerProductModel), z3, false, false, z4, aVar2, 1576960, (DefaultConstructorMarker) null);
    }

    /* renamed from: n */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37344f m159776n(OfferProductModel offerProductModel, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, boolean z4, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m159775m(offerProductModel, lVar, lVar2, lVar3, (i2 & 8) != 0 ? null : aVar, z, z2, z3, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? null : aVar2);
    }
}
