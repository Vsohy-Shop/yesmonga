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
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ProductCardSMapperKt {

    /* renamed from: com.carrefour.fid.android.product.presentation.mapper.ProductCardSMapperKt$a */
    public /* synthetic */ class C27640a {
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
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.presentation.mapper.ProductCardSMapperKt.C27640a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final ProductOverlayComponent.C37161b m116285a(C27670g.C27674d dVar, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        Discount T = dVar.mo80396e().mo118011T();
        String str = null;
        if (aVar == null || aVar2 == null || !dVar.mo80398f()) {
            return null;
        }
        if (T != null) {
            str = T.mo117986x();
        }
        return new ProductOverlayComponent.C37161b(str, (String) null, ProductOverlayType.HORIZONTAL, new ProductCardSMapperKt$getProductOverlayInfo$1(aVar), new ProductCardSMapperKt$getProductOverlayInfo$2(aVar2), false);
    }

    @C11395k(message = "Use ProductListElementModel.OfferModel.toProductCardSUiModel() instead. Also ProductListElementModel.OfferModel (presentation model) should be used in UI layer")
    @C12579k
    /* renamed from: b */
    public static final ProductCardSComponent.C37338a m116286b(@C12579k Offer offer, @C12579k Resources resources, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12579k C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12579k C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, boolean z, boolean z2) {
        Offer offer2 = offer;
        Intrinsics.checkNotNullParameter(offer, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
        C11300l<? super C37133a, C11079d2> lVar4 = lVar2;
        Intrinsics.checkNotNullParameter(lVar4, "onDeletePressed");
        C11300l<? super C37133a, C11079d2> lVar5 = lVar3;
        Intrinsics.checkNotNullParameter(lVar5, "onFavPressed");
        C11289a<C11079d2> aVar5 = aVar;
        Intrinsics.checkNotNullParameter(aVar5, "onCardPressed");
        return m116287c(new C27670g.C27674d(offer, false), resources, lVar, lVar4, lVar5, aVar5, aVar2, aVar3, aVar4, z, z2);
    }

    @C12579k
    /* renamed from: c */
    public static final ProductCardSComponent.C37338a m116287c(@C12579k C27670g.C27674d dVar, @C12579k Resources resources, @C12579k C11300l<? super C37133a, C11079d2> lVar, @C12579k C11300l<? super C37133a, C11079d2> lVar2, @C12579k C11300l<? super C37133a, C11079d2> lVar3, @C12579k C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4, boolean z, boolean z2) {
        PromoType promoType;
        int i;
        C27670g.C27674d dVar2 = dVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Resources resources2 = resources;
        Intrinsics.checkNotNullParameter(resources, "resources");
        C11300l<? super C37133a, C11079d2> lVar4 = lVar;
        Intrinsics.checkNotNullParameter(lVar, "onAtcPressed");
        Intrinsics.checkNotNullParameter(lVar2, "onDeletePressed");
        Intrinsics.checkNotNullParameter(lVar3, "onFavPressed");
        Intrinsics.checkNotNullParameter(aVar, "onCardPressed");
        Discount T = dVar.mo80396e().mo118011T();
        if (T != null) {
            promoType = T.mo117953A();
        } else {
            promoType = null;
        }
        if (promoType == null) {
            i = -1;
        } else {
            i = C27640a.$EnumSwitchMapping$0[promoType.ordinal()];
        }
        if (i == 1) {
            return m116294j(dVar, lVar, lVar2, lVar3, aVar, z, z2, T);
        }
        if (i != 2) {
            if (i == 3) {
                return m116292h(dVar, lVar, lVar2, lVar3, aVar, z, z2, T);
            }
            if (i == 4) {
                return m116294j(dVar, lVar, lVar2, lVar3, aVar, z, z2, T);
            }
            if (i != 5) {
                return m116295k(dVar, lVar, lVar2, lVar3, aVar, z, z2);
            }
            return m116290f(dVar, lVar, lVar2, lVar3, aVar, z, z2, T);
        } else if (T.mo117958F()) {
            return m116293i(dVar, resources, lVar, lVar2, lVar3, aVar, aVar2, aVar3, aVar4, z, z2, T);
        } else {
            return m116291g(dVar, lVar, lVar2, lVar3, aVar, z, z2, T);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ ProductCardSComponent.C37338a m116288d(Offer offer, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, boolean z, boolean z2, int i, Object obj) {
        int i2 = i;
        return m116286b(offer, resources, lVar, lVar2, lVar3, aVar, aVar2, (i2 & 64) != 0 ? null : aVar3, (i2 & 128) != 0 ? null : aVar4, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2);
    }

    /* renamed from: e */
    public static /* synthetic */ ProductCardSComponent.C37338a m116289e(C27670g.C27674d dVar, Resources resources, C11300l lVar, C11300l lVar2, C11300l lVar3, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, boolean z, boolean z2, int i, Object obj) {
        int i2 = i;
        return m116287c(dVar, resources, lVar, lVar2, lVar3, aVar, aVar2, (i2 & 64) != 0 ? null : aVar3, (i2 & 128) != 0 ? null : aVar4, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2);
    }

    /* renamed from: f */
    public static final ProductCardSComponent.C37338a.C37339a m116290f(C27670g.C27674d dVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, Discount discount) {
        String str;
        String str2;
        Offer e = dVar.mo80396e();
        String f = e.mo118001J().mo118136f();
        String S = e.mo118010S().mo118418S();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z3 = discount.mo117988z();
        if (z3 != null) {
            str = C27641a.m116296a(z3.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37330a aVar2 = new PriceComponent.C37329a.C37330a(a, str, (PriceComponent.Size) null, e.mo118028e0(), 4, (DefaultConstructorMarker) null);
        boolean z4 = true;
        PriceComponent.C37329a.C37330a aVar3 = aVar2;
        ContentComponent.C37305a.C37306a aVar4 = new ContentComponent.C37305a.C37306a(S, "", aVar3, e.mo118003L(), (List) null, !e.mo118010S().mo118436e0(), e.mo118010S().mo118406G(), new LabelComponent.C37316a.C37317a(discount.mo117986x()), 16, (DefaultConstructorMarker) null);
        ProductPicture productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(e.mo118010S().mo118416Q());
        if (productPicture == null || (str2 = productPicture.mo118573e()) == null) {
            str2 = "";
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || e.mo118012U() <= 0) {
            z4 = false;
        }
        ImageComponent.C37313a aVar5 = new ImageComponent.C37313a(str2, size, z4);
        LozengeListComponent.C37381a aVar6 = r1;
        LozengeListComponent.C37381a aVar7 = new LozengeListComponent.C37381a(CollectionsKt__CollectionsKt.m40441E());
        return new ProductCardSComponent.C37338a.C37339a(f, aVar5, aVar4, aVar6, (NutriscoreComponent.C37157a) null, false, e.mo118016Y(), e.mo118012U(), lVar, lVar2, lVar3, aVar, (C11289a) null, e.mo118023c0(), e.mo118025d0(), false, true, e.mo118021b0(), z2, false, false, false, (C11289a) null, 7868416, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static final ProductCardSComponent.C37338a.C37340b m116291g(C27670g.C27674d dVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, Discount discount) {
        String str;
        String str2;
        Offer e = dVar.mo80396e();
        String f = e.mo118001J().mo118136f();
        String S = e.mo118010S().mo118418S();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z3 = discount.mo117988z();
        if (z3 != null) {
            str = C27641a.m116296a(z3.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37331b bVar = new PriceComponent.C37329a.C37331b(a, str, (PriceComponent.Size) null, e.mo118028e0(), 4, (DefaultConstructorMarker) null);
        boolean z4 = true;
        PriceComponent.C37329a.C37331b bVar2 = bVar;
        ContentComponent.C37305a.C37307b bVar3 = new ContentComponent.C37305a.C37307b(S, "", bVar2, e.mo118003L(), (List) null, !e.mo118010S().mo118436e0(), e.mo118010S().mo118406G(), new LabelComponent.C37316a.C37325i(discount.mo117986x()), 16, (DefaultConstructorMarker) null);
        ProductPicture productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(e.mo118010S().mo118416Q());
        if (productPicture == null || (str2 = productPicture.mo118573e()) == null) {
            str2 = "";
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || e.mo118012U() <= 0) {
            z4 = false;
        }
        ImageComponent.C37313a aVar2 = new ImageComponent.C37313a(str2, size, z4);
        LozengeListComponent.C37381a aVar3 = r1;
        LozengeListComponent.C37381a aVar4 = new LozengeListComponent.C37381a(CollectionsKt__CollectionsKt.m40441E());
        return new ProductCardSComponent.C37338a.C37340b(f, aVar2, bVar3, aVar3, (NutriscoreComponent.C37157a) null, false, e.mo118016Y(), e.mo118012U(), lVar, lVar2, lVar3, aVar, (C11289a) null, e.mo118023c0(), e.mo118025d0(), false, true, e.mo118021b0(), z2, false, false, false, (C11289a) null, 7868416, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static final ProductCardSComponent.C37338a.C37341c m116292h(C27670g.C27674d dVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, Discount discount) {
        String str;
        String str2;
        Offer e = dVar.mo80396e();
        String f = e.mo118001J().mo118136f();
        String S = e.mo118010S().mo118418S();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z3 = discount.mo117988z();
        if (z3 != null) {
            str = C27641a.m116296a(z3.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37332c cVar = new PriceComponent.C37329a.C37332c(a, str, (PriceComponent.Size) null, e.mo118028e0(), 4, (DefaultConstructorMarker) null);
        boolean z4 = true;
        PriceComponent.C37329a.C37332c cVar2 = cVar;
        ContentComponent.C37305a.C37308c cVar3 = new ContentComponent.C37305a.C37308c(S, "", cVar2, e.mo118003L(), (List) null, !e.mo118010S().mo118436e0(), e.mo118010S().mo118406G(), new LabelComponent.C37316a.C37321e(discount.mo117986x()), 16, (DefaultConstructorMarker) null);
        ProductPicture productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(e.mo118010S().mo118416Q());
        if (productPicture == null || (str2 = productPicture.mo118573e()) == null) {
            str2 = "";
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || e.mo118012U() <= 0) {
            z4 = false;
        }
        ImageComponent.C37313a aVar2 = new ImageComponent.C37313a(str2, size, z4);
        LozengeListComponent.C37381a aVar3 = r1;
        LozengeListComponent.C37381a aVar4 = new LozengeListComponent.C37381a(CollectionsKt__CollectionsKt.m40441E());
        return new ProductCardSComponent.C37338a.C37341c(f, aVar2, cVar3, aVar3, (NutriscoreComponent.C37157a) null, false, e.mo118016Y(), e.mo118012U(), lVar, lVar2, lVar3, aVar, (C11289a) null, e.mo118023c0(), e.mo118025d0(), false, true, e.mo118021b0(), z2, false, false, false, (C11289a) null, 7868416, (DefaultConstructorMarker) null);
    }

    /* renamed from: i */
    public static final ProductCardSComponent.C37338a.C37342d m116293i(C27670g.C27674d dVar, Resources resources, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, boolean z, boolean z2, Discount discount) {
        String str;
        String str2;
        Offer e = dVar.mo80396e();
        String f = e.mo118001J().mo118136f();
        String S = e.mo118010S().mo118418S();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z3 = discount.mo117988z();
        if (z3 != null) {
            str = C27641a.m116296a(z3.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37333d dVar2 = new PriceComponent.C37329a.C37333d(a, str, (PriceComponent.Size) null, e.mo118028e0(), 4, (DefaultConstructorMarker) null);
        String x = discount.mo117986x();
        String string = resources.getString(C27609f.C27627r.show_selection);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.show_selection)");
        boolean z4 = true;
        PriceComponent.C37329a.C37333d dVar3 = dVar2;
        ContentComponent.C37305a.C37309d dVar4 = new ContentComponent.C37305a.C37309d(S, "", dVar3, e.mo118003L(), (List) null, !e.mo118010S().mo118436e0(), e.mo118010S().mo118406G(), new LabelComponent.C37316a.C37324h(x, string, aVar2), 16, (DefaultConstructorMarker) null);
        ProductPicture productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(e.mo118010S().mo118416Q());
        if (productPicture == null || (str2 = productPicture.mo118573e()) == null) {
            str2 = "";
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || e.mo118012U() <= 0) {
            z4 = false;
        }
        ImageComponent.C37313a aVar5 = new ImageComponent.C37313a(str2, size, z4);
        LozengeListComponent.C37381a aVar6 = r1;
        LozengeListComponent.C37381a aVar7 = new LozengeListComponent.C37381a(CollectionsKt__CollectionsKt.m40441E());
        return new ProductCardSComponent.C37338a.C37342d(f, aVar5, dVar4, aVar6, (NutriscoreComponent.C37157a) null, false, m116285a(dVar, aVar3, aVar4), e.mo118016Y(), e.mo118012U(), lVar, lVar2, lVar3, aVar, (C11289a) null, e.mo118023c0(), e.mo118025d0(), false, true, e.mo118021b0(), z2, false, false, false, (C11289a) null, 15736832, (DefaultConstructorMarker) null);
    }

    /* renamed from: j */
    public static final ProductCardSComponent.C37338a.C37343e m116294j(C27670g.C27674d dVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2, Discount discount) {
        String str;
        String str2;
        Offer e = dVar.mo80396e();
        String f = e.mo118001J().mo118136f();
        String S = e.mo118010S().mo118418S();
        String a = C27641a.m116296a(discount.mo117980t());
        C38067d z3 = discount.mo117988z();
        if (z3 != null) {
            str = C27641a.m116296a(z3.mo118204h());
        } else {
            str = null;
        }
        PriceComponent.C37329a.C37334e eVar = new PriceComponent.C37329a.C37334e(a, str, (PriceComponent.Size) null, e.mo118028e0(), 4, (DefaultConstructorMarker) null);
        boolean z4 = true;
        PriceComponent.C37329a.C37334e eVar2 = eVar;
        ContentComponent.C37305a.C37310e eVar3 = new ContentComponent.C37305a.C37310e(S, "", eVar2, e.mo118003L(), (List) null, !e.mo118010S().mo118436e0(), e.mo118010S().mo118406G(), new LabelComponent.C37316a.C37325i(discount.mo117986x()), 16, (DefaultConstructorMarker) null);
        ProductPicture productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(e.mo118010S().mo118416Q());
        if (productPicture == null || (str2 = productPicture.mo118573e()) == null) {
            str2 = "";
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || e.mo118012U() <= 0) {
            z4 = false;
        }
        ImageComponent.C37313a aVar2 = new ImageComponent.C37313a(str2, size, z4);
        LozengeListComponent.C37381a aVar3 = r1;
        LozengeListComponent.C37381a aVar4 = new LozengeListComponent.C37381a(CollectionsKt__CollectionsKt.m40441E());
        return new ProductCardSComponent.C37338a.C37343e(f, aVar2, eVar3, aVar3, (NutriscoreComponent.C37157a) null, false, e.mo118016Y(), e.mo118012U(), lVar, lVar2, lVar3, aVar, (C11289a) null, e.mo118023c0(), e.mo118025d0(), false, true, e.mo118021b0(), z2, false, false, false, (C11289a) null, 7868416, (DefaultConstructorMarker) null);
    }

    /* renamed from: k */
    public static final ProductCardSComponent.C37338a.C37344f m116295k(C27670g.C27674d dVar, C11300l<? super C37133a, C11079d2> lVar, C11300l<? super C37133a, C11079d2> lVar2, C11300l<? super C37133a, C11079d2> lVar3, C11289a<C11079d2> aVar, boolean z, boolean z2) {
        String str;
        Offer e = dVar.mo80396e();
        String f = e.mo118001J().mo118136f();
        boolean z3 = true;
        ContentComponent.C37305a.C37311f fVar = new ContentComponent.C37305a.C37311f(e.mo118010S().mo118418S(), "", new PriceComponent.C37329a.C37335f("", (PriceComponent.Size) null, e.mo118028e0(), 2, (DefaultConstructorMarker) null), dVar.mo80396e().mo118003L(), (List) null, !e.mo118010S().mo118436e0(), e.mo118010S().mo118406G(), 16, (DefaultConstructorMarker) null);
        ProductPicture productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(e.mo118010S().mo118416Q());
        if (productPicture == null || (str = productPicture.mo118573e()) == null) {
            str = "";
        }
        ImageComponent.Size size = ImageComponent.Size.f93604d;
        if (z || e.mo118012U() <= 0) {
            z3 = false;
        }
        ImageComponent.C37313a aVar2 = new ImageComponent.C37313a(str, size, z3);
        LozengeListComponent.C37381a aVar3 = r1;
        LozengeListComponent.C37381a aVar4 = new LozengeListComponent.C37381a(CollectionsKt__CollectionsKt.m40441E());
        return new ProductCardSComponent.C37338a.C37344f(f, aVar2, fVar, aVar3, (NutriscoreComponent.C37157a) null, false, e.mo118016Y(), e.mo118012U(), lVar, lVar2, lVar3, aVar, (C11289a) null, e.mo118023c0(), e.mo118025d0(), false, true, e.mo118021b0(), z2, false, false, false, (C11289a) null, 7868416, (DefaultConstructorMarker) null);
    }
}
