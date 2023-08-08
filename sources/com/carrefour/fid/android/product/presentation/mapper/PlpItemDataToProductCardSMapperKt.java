package com.carrefour.fid.android.product.presentation.mapper;

import android.content.res.Resources;
import com.carrefour.fid.android.design.components.type.ProductOverlayType;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.widgets.NutriscoreComponent;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ProductCardSComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.carrefour.fid.android.domain.models.offer.C38067d;
import com.carrefour.fid.android.domain.models.offer.Discount;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.detail.PictureSize;
import com.carrefour.fid.android.domain.models.product.plp.C38114b;
import com.carrefour.fid.android.domain.models.product.plp.PlpOffer;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.models.OfferAvailability;
import com.carrefour.fid.android.product.presentation.models.extensions.C27661d;
import com.carrefour.fid.android.product.presentation.models.extensions.C27662e;
import com.carrefour.fid.android.shared.extension.C28782t;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class PlpItemDataToProductCardSMapperKt {

    /* renamed from: com.carrefour.fid.android.product.presentation.mapper.PlpItemDataToProductCardSMapperKt$a */
    public /* synthetic */ class C27639a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.carrefour.fid.android.domain.models.offer.PromoType[] r0 = com.carrefour.fid.android.domain.models.offer.PromoType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.PROMO     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.RI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.RD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.PF     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.carrefour.fid.android.domain.models.offer.PromoType r1 = com.carrefour.fid.android.domain.models.offer.PromoType.TA     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.mapper.PlpItemDataToProductCardSMapperKt.C27639a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final ProductOverlayComponent.C37161b m116270a(C38114b bVar, boolean z, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        Discount discount;
        PlpOffer i = C27662e.m116389i(bVar.mo118842j());
        String str = null;
        if (i != null) {
            discount = C27661d.m116375b(i);
        } else {
            discount = null;
        }
        if (aVar == null || aVar2 == null || !z) {
            return null;
        }
        if (discount != null) {
            str = discount.mo117986x();
        }
        return new ProductOverlayComponent.C37161b(str, (String) null, ProductOverlayType.HORIZONTAL, new PlpItemDataToProductCardSMapperKt$getProductOverlayInfo$1(aVar), new PlpItemDataToProductCardSMapperKt$getProductOverlayInfo$2(aVar2), false);
    }

    @C12579k
    /* renamed from: b */
    public static final ProductCardSComponent.C37338a m116271b(@C12579k C38114b bVar, @C12579k Resources resources, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12580l C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12580l C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, boolean z, boolean z2, boolean z3, boolean z4, @C12580l C11289a<C11079d2> aVar5) {
        Discount discount;
        int i;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
        Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
        PlpOffer i2 = C27662e.m116389i(bVar.mo118842j());
        PromoType promoType = null;
        if (i2 != null) {
            discount = C27661d.m116375b(i2);
        } else {
            discount = null;
        }
        if (discount != null) {
            promoType = discount.mo117953A();
        }
        if (promoType == null) {
            i = -1;
        } else {
            i = C27639a.$EnumSwitchMapping$0[promoType.ordinal()];
        }
        if (i == 1) {
            return m116281l(bVar, lVar, lVar2, lVar3, aVar, z2, z3, z4, discount, aVar5);
        }
        if (i != 2) {
            if (i == 3) {
                return m116277h(bVar, lVar, lVar2, lVar3, aVar, z2, z3, z4, discount, aVar5);
            }
            if (i == 4) {
                return m116281l(bVar, lVar, lVar2, lVar3, aVar, z2, z3, z4, discount, aVar5);
            }
            if (i != 5) {
                return m116283n(bVar, lVar, lVar2, lVar3, aVar, z2, z3, z4, aVar5);
            }
            return m116273d(bVar, lVar, lVar2, lVar3, aVar, z2, z3, z4, discount, aVar5);
        } else if (discount.mo117958F()) {
            return m116279j(bVar, resources, lVar, lVar2, lVar3, aVar, aVar2, aVar3, aVar4, z, z2, z3, z4, discount, aVar5);
        } else {
            return m116275f(bVar, lVar, lVar2, lVar3, aVar, z2, z3, z4, discount, aVar5);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ ProductCardSComponent.C37338a m116272c(C38114b bVar, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, boolean z, boolean z2, boolean z3, boolean z4, C11289a aVar5, int i, Object obj) {
        int i2 = i;
        return m116271b(bVar, resources, lVar, (i2 & 4) != 0 ? null : lVar2, lVar3, (i2 & 16) != 0 ? null : aVar, (i2 & 32) != 0 ? null : aVar2, (i2 & 64) != 0 ? null : aVar3, (i2 & 128) != 0 ? null : aVar4, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? false : z4, (i2 & 4096) != 0 ? null : aVar5);
    }

    /* renamed from: d */
    public static final ProductCardSComponent.C37338a.C37339a m116273d(C38114b bVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, Discount discount, C11289a<C11079d2> aVar2) {
        String str;
        String str2;
        OfferAvailability offerAvailability;
        List<Integer> list;
        boolean z4;
        boolean z5;
        boolean z6;
        ProductPicture productPicture;
        String e;
        String w;
        PlpOffer i = C27662e.m116389i(bVar.mo118842j());
        String A = bVar.mo118842j().mo118850A();
        String D = bVar.mo118842j().mo118853D();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z7 = discount.mo117988z();
        OfferAvailability offerAvailability2 = null;
        if (z7 != null) {
            str = C27641a.m116296a(z7.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37330a aVar3 = new PriceComponent.C37329a.C37330a(a, str, (PriceComponent.Size) null, bVar.mo118842j().mo118861L(), 4, (DefaultConstructorMarker) null);
        String d = C27662e.m116384d(bVar.mo118842j());
        LabelComponent.C37316a.C37317a aVar4 = new LabelComponent.C37316a.C37317a(discount.mo117986x());
        String str3 = "";
        if (i == null || (w = i.mo118820w()) == null) {
            str2 = str3;
        } else {
            str2 = w;
        }
        if (i != null) {
            offerAvailability = C27661d.m116374a(i);
        } else {
            offerAvailability = null;
        }
        OfferAvailability offerAvailability3 = OfferAvailability.Available;
        if (offerAvailability != offerAvailability3 || bVar.mo118842j().mo118860K()) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = C27662e.m116386f(bVar.mo118842j());
        }
        ContentComponent.C37305a.C37306a aVar5 = new ContentComponent.C37305a.C37306a(D, d, aVar3, str2, list, bVar.mo118842j().mo118860K(), bVar.mo118842j().mo118884u(), aVar4);
        List list2 = bVar.mo118842j().mo118857H().get(PictureSize.Small);
        if (!(list2 == null || (productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(list2)) == null || (e = productPicture.mo118573e()) == null)) {
            str3 = e;
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || bVar.mo118843k() <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        ImageComponent.C37313a aVar6 = new ImageComponent.C37313a(str3, size, z4);
        LozengeListComponent.C37381a e2 = C27662e.m116385e(bVar.mo118842j());
        NutriscoreComponent.C37157a h = C27662e.m116388h(bVar.mo118842j(), false, (NutriscoreComponent.Size) null, 2, (Object) null);
        if (i != null) {
            z5 = C27661d.m116377d(i);
        } else {
            z5 = false;
        }
        boolean n = bVar.mo118846n();
        int k = bVar.mo118843k();
        boolean o = bVar.mo118847o();
        boolean p = bVar.mo118848p();
        if (i != null) {
            offerAvailability2 = C27661d.m116374a(i);
        }
        if (offerAvailability2 == offerAvailability3) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new ProductCardSComponent.C37338a.C37339a(A, aVar6, aVar5, e2, h, z5, n, k, lVar, lVar2, lVar3, aVar, (C11289a) null, o, p, false, z6, bVar.mo118845m(), z2, C27662e.m116392l(bVar.mo118842j()), z3, bVar.mo118844l(), aVar2, 4096, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37339a m116274e(C38114b bVar, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, Discount discount, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m116273d(bVar, lVar, (i2 & 2) != 0 ? null : lVar2, lVar3, (i2 & 8) != 0 ? null : aVar, z, z2, z3, discount, (i2 & 256) != 0 ? null : aVar2);
    }

    /* renamed from: f */
    public static final ProductCardSComponent.C37338a.C37340b m116275f(C38114b bVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, Discount discount, C11289a<C11079d2> aVar2) {
        String str;
        String str2;
        OfferAvailability offerAvailability;
        List<Integer> list;
        boolean z4;
        boolean z5;
        boolean z6;
        ProductPicture productPicture;
        String e;
        String w;
        PlpOffer i = C27662e.m116389i(bVar.mo118842j());
        String A = bVar.mo118842j().mo118850A();
        String D = bVar.mo118842j().mo118853D();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z7 = discount.mo117988z();
        OfferAvailability offerAvailability2 = null;
        if (z7 != null) {
            str = C27641a.m116296a(z7.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37331b bVar2 = new PriceComponent.C37329a.C37331b(a, str, (PriceComponent.Size) null, bVar.mo118842j().mo118861L(), 4, (DefaultConstructorMarker) null);
        String d = C27662e.m116384d(bVar.mo118842j());
        LabelComponent.C37316a.C37325i iVar = new LabelComponent.C37316a.C37325i(discount.mo117986x());
        String str3 = "";
        if (i == null || (w = i.mo118820w()) == null) {
            str2 = str3;
        } else {
            str2 = w;
        }
        if (i != null) {
            offerAvailability = C27661d.m116374a(i);
        } else {
            offerAvailability = null;
        }
        OfferAvailability offerAvailability3 = OfferAvailability.Available;
        if (offerAvailability != offerAvailability3 || bVar.mo118842j().mo118860K()) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = C27662e.m116386f(bVar.mo118842j());
        }
        ContentComponent.C37305a.C37307b bVar3 = new ContentComponent.C37305a.C37307b(D, d, bVar2, str2, list, bVar.mo118842j().mo118860K(), bVar.mo118842j().mo118884u(), iVar);
        List list2 = bVar.mo118842j().mo118857H().get(PictureSize.Small);
        if (!(list2 == null || (productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(list2)) == null || (e = productPicture.mo118573e()) == null)) {
            str3 = e;
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || bVar.mo118843k() <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        ImageComponent.C37313a aVar3 = new ImageComponent.C37313a(str3, size, z4);
        LozengeListComponent.C37381a e2 = C27662e.m116385e(bVar.mo118842j());
        NutriscoreComponent.C37157a h = C27662e.m116388h(bVar.mo118842j(), false, (NutriscoreComponent.Size) null, 2, (Object) null);
        if (i != null) {
            z5 = C27661d.m116377d(i);
        } else {
            z5 = false;
        }
        boolean n = bVar.mo118846n();
        int k = bVar.mo118843k();
        boolean o = bVar.mo118847o();
        boolean p = bVar.mo118848p();
        if (i != null) {
            offerAvailability2 = C27661d.m116374a(i);
        }
        if (offerAvailability2 == offerAvailability3) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new ProductCardSComponent.C37338a.C37340b(A, aVar3, bVar3, e2, h, z5, n, k, lVar, lVar2, lVar3, aVar, (C11289a) null, o, p, false, z6, bVar.mo118845m(), z2, C27662e.m116392l(bVar.mo118842j()), z3, bVar.mo118844l(), aVar2, 4096, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37340b m116276g(C38114b bVar, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, Discount discount, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m116275f(bVar, lVar, (i2 & 2) != 0 ? null : lVar2, lVar3, (i2 & 8) != 0 ? null : aVar, z, z2, z3, discount, (i2 & 256) != 0 ? null : aVar2);
    }

    /* renamed from: h */
    public static final ProductCardSComponent.C37338a.C37341c m116277h(C38114b bVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, Discount discount, C11289a<C11079d2> aVar2) {
        String str;
        OfferAvailability offerAvailability;
        List<Integer> list;
        String str2;
        boolean z4;
        boolean z5;
        boolean z6;
        ProductPicture productPicture;
        String e;
        String w;
        PlpOffer i = C27662e.m116389i(bVar.mo118842j());
        String A = bVar.mo118842j().mo118850A();
        String D = bVar.mo118842j().mo118853D();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z7 = discount.mo117988z();
        OfferAvailability offerAvailability2 = null;
        if (z7 != null) {
            str = C27641a.m116296a(z7.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37332c cVar = new PriceComponent.C37329a.C37332c(a, str, (PriceComponent.Size) null, bVar.mo118842j().mo118861L(), 4, (DefaultConstructorMarker) null);
        String d = C27662e.m116384d(bVar.mo118842j());
        LabelComponent.C37316a.C37321e eVar = new LabelComponent.C37316a.C37321e(discount.mo117986x());
        if (i != null) {
            offerAvailability = C27661d.m116374a(i);
        } else {
            offerAvailability = null;
        }
        OfferAvailability offerAvailability3 = OfferAvailability.Available;
        if (offerAvailability != offerAvailability3 || bVar.mo118842j().mo118860K()) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = C27662e.m116386f(bVar.mo118842j());
        }
        List<Integer> list2 = list;
        String str3 = "";
        if (i == null || (w = i.mo118820w()) == null) {
            str2 = str3;
        } else {
            str2 = w;
        }
        ContentComponent.C37305a.C37308c cVar2 = new ContentComponent.C37305a.C37308c(D, d, cVar, str2, list2, bVar.mo118842j().mo118860K(), bVar.mo118842j().mo118884u(), eVar);
        List list3 = bVar.mo118842j().mo118857H().get(PictureSize.Small);
        if (!(list3 == null || (productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(list3)) == null || (e = productPicture.mo118573e()) == null)) {
            str3 = e;
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || bVar.mo118843k() <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        ImageComponent.C37313a aVar3 = new ImageComponent.C37313a(str3, size, z4);
        LozengeListComponent.C37381a e2 = C27662e.m116385e(bVar.mo118842j());
        NutriscoreComponent.C37157a h = C27662e.m116388h(bVar.mo118842j(), false, (NutriscoreComponent.Size) null, 2, (Object) null);
        if (i != null) {
            z5 = C27661d.m116377d(i);
        } else {
            z5 = false;
        }
        boolean n = bVar.mo118846n();
        int k = bVar.mo118843k();
        boolean o = bVar.mo118847o();
        boolean p = bVar.mo118848p();
        if (i != null) {
            offerAvailability2 = C27661d.m116374a(i);
        }
        if (offerAvailability2 == offerAvailability3) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new ProductCardSComponent.C37338a.C37341c(A, aVar3, cVar2, e2, h, z5, n, k, lVar, lVar2, lVar3, aVar, (C11289a) null, o, p, false, z6, bVar.mo118845m(), z2, C27662e.m116392l(bVar.mo118842j()), z3, bVar.mo118844l(), aVar2, 4096, (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37341c m116278i(C38114b bVar, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, Discount discount, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m116277h(bVar, lVar, (i2 & 2) != 0 ? null : lVar2, lVar3, (i2 & 8) != 0 ? null : aVar, z, z2, z3, discount, (i2 & 256) != 0 ? null : aVar2);
    }

    /* renamed from: j */
    public static final ProductCardSComponent.C37338a.C37342d m116279j(C38114b bVar, Resources resources, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, boolean z, boolean z2, boolean z3, boolean z4, Discount discount, C11289a<C11079d2> aVar5) {
        List<Integer> list;
        boolean z5;
        C11289a<C11079d2> aVar6;
        C11289a<C11079d2> aVar7;
        boolean z6;
        C38114b bVar2;
        ProductPicture productPicture;
        String e;
        String w;
        PlpOffer i = C27662e.m116389i(bVar.mo118842j());
        String A = bVar.mo118842j().mo118850A();
        String D = bVar.mo118842j().mo118853D();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z7 = discount.mo117988z();
        OfferAvailability offerAvailability = null;
        PriceComponent.C37329a.C37333d dVar = new PriceComponent.C37329a.C37333d(a, z7 != null ? C27641a.m116296a(z7.mo118204h()) : null, (PriceComponent.Size) null, bVar.mo118842j().mo118861L(), 4, (DefaultConstructorMarker) null);
        String d = C27662e.m116384d(bVar.mo118842j());
        String x = discount.mo117986x();
        String string = resources.getString(C27609f.C27627r.show_selection);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.show_selection)");
        LabelComponent.C37316a.C37324h hVar = new LabelComponent.C37316a.C37324h(x, string, aVar2);
        String str = "";
        String str2 = (i == null || (w = i.mo118820w()) == null) ? str : w;
        OfferAvailability a2 = i != null ? C27661d.m116374a(i) : null;
        OfferAvailability offerAvailability2 = OfferAvailability.Available;
        if (a2 != offerAvailability2 || bVar.mo118842j().mo118860K()) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = C27662e.m116386f(bVar.mo118842j());
        }
        ContentComponent.C37305a.C37309d dVar2 = new ContentComponent.C37305a.C37309d(D, d, dVar, str2, list, bVar.mo118842j().mo118860K(), bVar.mo118842j().mo118884u(), hVar);
        List list2 = bVar.mo118842j().mo118857H().get(PictureSize.Small);
        if (!(list2 == null || (productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(list2)) == null || (e = productPicture.mo118573e()) == null)) {
            str = e;
        }
        ImageComponent.C37313a aVar8 = new ImageComponent.C37313a(str, ImageComponent.Size.f93604d, !z2 && bVar.mo118843k() > 0);
        LozengeListComponent.C37381a e2 = C27662e.m116385e(bVar.mo118842j());
        NutriscoreComponent.C37157a h = C27662e.m116388h(bVar.mo118842j(), false, (NutriscoreComponent.Size) null, 2, (Object) null);
        if (i != null) {
            aVar7 = aVar3;
            aVar6 = aVar4;
            z5 = z;
            z6 = C27661d.m116377d(i);
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            aVar7 = aVar3;
            aVar6 = aVar4;
            z5 = z;
            z6 = false;
        }
        ProductOverlayComponent.C37161b a3 = m116270a(bVar2, z5, aVar7, aVar6);
        boolean n = bVar.mo118846n();
        int k = bVar.mo118843k();
        boolean o = bVar.mo118847o();
        boolean p = bVar.mo118848p();
        if (i != null) {
            offerAvailability = C27661d.m116374a(i);
        }
        return new ProductCardSComponent.C37338a.C37342d(A, aVar8, dVar2, e2, h, z6, a3, n, k, lVar, lVar2, lVar3, aVar, (C11289a) null, o, p, false, offerAvailability == offerAvailability2, bVar.mo118845m(), z3, C27662e.m116392l(bVar.mo118842j()), z4, bVar.mo118844l(), aVar5, 8192, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37342d m116280k(C38114b bVar, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, boolean z, boolean z2, boolean z3, boolean z4, Discount discount, C11289a aVar5, int i, Object obj) {
        int i2 = i;
        return m116279j(bVar, resources, lVar, (i2 & 4) != 0 ? null : lVar2, lVar3, (i2 & 16) != 0 ? null : aVar, aVar2, aVar3, aVar4, z, z2, z3, z4, discount, (i2 & 8192) != 0 ? null : aVar5);
    }

    /* renamed from: l */
    public static final ProductCardSComponent.C37338a.C37343e m116281l(C38114b bVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, Discount discount, C11289a<C11079d2> aVar2) {
        String str;
        String str2;
        OfferAvailability offerAvailability;
        List<Integer> list;
        boolean z4;
        boolean z5;
        boolean z6;
        ProductPicture productPicture;
        String e;
        String w;
        PlpOffer i = C27662e.m116389i(bVar.mo118842j());
        String A = bVar.mo118842j().mo118850A();
        String D = bVar.mo118842j().mo118853D();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z7 = discount.mo117988z();
        OfferAvailability offerAvailability2 = null;
        if (z7 != null) {
            str = C27641a.m116296a(z7.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37334e eVar = new PriceComponent.C37329a.C37334e(a, str, (PriceComponent.Size) null, bVar.mo118842j().mo118861L(), 4, (DefaultConstructorMarker) null);
        String d = C27662e.m116384d(bVar.mo118842j());
        LabelComponent.C37316a.C37325i iVar = new LabelComponent.C37316a.C37325i(discount.mo117986x());
        String str3 = "";
        if (i == null || (w = i.mo118820w()) == null) {
            str2 = str3;
        } else {
            str2 = w;
        }
        if (i != null) {
            offerAvailability = C27661d.m116374a(i);
        } else {
            offerAvailability = null;
        }
        OfferAvailability offerAvailability3 = OfferAvailability.Available;
        if (offerAvailability != offerAvailability3 || bVar.mo118842j().mo118860K()) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = C27662e.m116386f(bVar.mo118842j());
        }
        ContentComponent.C37305a.C37310e eVar2 = new ContentComponent.C37305a.C37310e(D, d, eVar, str2, list, bVar.mo118842j().mo118860K(), bVar.mo118842j().mo118884u(), iVar);
        List list2 = bVar.mo118842j().mo118857H().get(PictureSize.Small);
        if (!(list2 == null || (productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(list2)) == null || (e = productPicture.mo118573e()) == null)) {
            str3 = e;
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || bVar.mo118843k() <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        ImageComponent.C37313a aVar3 = new ImageComponent.C37313a(str3, size, z4);
        LozengeListComponent.C37381a e2 = C27662e.m116385e(bVar.mo118842j());
        NutriscoreComponent.C37157a h = C27662e.m116388h(bVar.mo118842j(), false, (NutriscoreComponent.Size) null, 2, (Object) null);
        if (i != null) {
            z5 = C27661d.m116377d(i);
        } else {
            z5 = false;
        }
        boolean n = bVar.mo118846n();
        int k = bVar.mo118843k();
        boolean o = bVar.mo118847o();
        boolean p = bVar.mo118848p();
        if (i != null) {
            offerAvailability2 = C27661d.m116374a(i);
        }
        if (offerAvailability2 == offerAvailability3) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new ProductCardSComponent.C37338a.C37343e(A, aVar3, eVar2, e2, h, z5, n, k, lVar, lVar2, lVar3, aVar, (C11289a) null, o, p, false, z6, bVar.mo118845m(), z2, C27662e.m116392l(bVar.mo118842j()), z3, bVar.mo118844l(), aVar2, 4096, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37343e m116282m(C38114b bVar, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, Discount discount, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m116281l(bVar, lVar, (i2 & 2) != 0 ? null : lVar2, lVar3, (i2 & 8) != 0 ? null : aVar, z, z2, z3, discount, (i2 & 256) != 0 ? null : aVar2);
    }

    /* renamed from: n */
    public static final ProductCardSComponent.C37338a.C37344f m116283n(C38114b bVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, boolean z3, C11289a<C11079d2> aVar2) {
        Double d;
        String str;
        OfferAvailability offerAvailability;
        List<Integer> list;
        boolean z4;
        boolean z5;
        boolean z6;
        ProductPicture productPicture;
        String e;
        String w;
        PlpOffer i = C27662e.m116389i(bVar.mo118842j());
        String A = bVar.mo118842j().mo118850A();
        String D = bVar.mo118842j().mo118853D();
        OfferAvailability offerAvailability2 = null;
        if (i != null) {
            d = Double.valueOf(C27661d.m116376c(i));
        } else {
            d = null;
        }
        PriceComponent.C37329a.C37335f fVar = new PriceComponent.C37329a.C37335f(C28782t.m119105b(d), (PriceComponent.Size) null, bVar.mo118842j().mo118861L(), 2, (DefaultConstructorMarker) null);
        String d2 = C27662e.m116384d(bVar.mo118842j());
        String str2 = "";
        if (i == null || (w = i.mo118820w()) == null) {
            str = str2;
        } else {
            str = w;
        }
        boolean K = bVar.mo118842j().mo118860K();
        if (i != null) {
            offerAvailability = C27661d.m116374a(i);
        } else {
            offerAvailability = null;
        }
        OfferAvailability offerAvailability3 = OfferAvailability.Available;
        if (offerAvailability != offerAvailability3 || bVar.mo118842j().mo118860K()) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = C27662e.m116386f(bVar.mo118842j());
        }
        ContentComponent.C37305a.C37311f fVar2 = new ContentComponent.C37305a.C37311f(D, d2, fVar, str, list, K, bVar.mo118842j().mo118884u());
        List list2 = bVar.mo118842j().mo118857H().get(PictureSize.Small);
        if (!(list2 == null || (productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(list2)) == null || (e = productPicture.mo118573e()) == null)) {
            str2 = e;
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || bVar.mo118843k() <= 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        ImageComponent.C37313a aVar3 = new ImageComponent.C37313a(str2, size, z4);
        LozengeListComponent.C37381a e2 = C27662e.m116385e(bVar.mo118842j());
        NutriscoreComponent.C37157a h = C27662e.m116388h(bVar.mo118842j(), false, (NutriscoreComponent.Size) null, 2, (Object) null);
        if (i != null) {
            z5 = C27661d.m116377d(i);
        } else {
            z5 = false;
        }
        boolean n = bVar.mo118846n();
        int k = bVar.mo118843k();
        boolean o = bVar.mo118847o();
        boolean p = bVar.mo118848p();
        if (i != null) {
            offerAvailability2 = C27661d.m116374a(i);
        }
        if (offerAvailability2 == offerAvailability3) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new ProductCardSComponent.C37338a.C37344f(A, aVar3, fVar2, e2, h, z5, n, k, lVar, lVar2, lVar3, aVar, (C11289a) null, o, p, false, z6, bVar.mo118845m(), z2, C27662e.m116392l(bVar.mo118842j()), z3, bVar.mo118844l(), aVar2, 4096, (DefaultConstructorMarker) null);
    }

    /* renamed from: o */
    public static /* synthetic */ ProductCardSComponent.C37338a.C37344f m116284o(C38114b bVar, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, boolean z, boolean z2, boolean z3, C11289a aVar2, int i, Object obj) {
        int i2 = i;
        return m116283n(bVar, lVar, (i2 & 2) != 0 ? null : lVar2, lVar3, (i2 & 8) != 0 ? null : aVar, z, z2, z3, (i2 & 128) != 0 ? null : aVar2);
    }
}
