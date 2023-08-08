package com.carrefour.fid.android.bff_data_shared.data.api.mapper;

import android.graphics.Color;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAction;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonCategory;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsent;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptIn;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentsResponseData;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoProduct;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeliveryFee;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffItemPicture;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLuckyCartResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffMoney;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPictures;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductFlags;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffRendering;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSponsoredItems;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSponsoredItemsResponse;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffSponsoredItemsResponseData;
import com.carrefour.fid.android.bff_data_shared.data.api.entities.BffUpdateConsentsBody;
import com.carrefour.fid.android.domain.models.category.CategoryType;
import com.carrefour.fid.android.domain.models.category.ProductCategory;
import com.carrefour.fid.android.domain.models.consent.ChoiceOptIn;
import com.carrefour.fid.android.domain.models.consent.ConsentName;
import com.carrefour.fid.android.domain.models.consent.ConsentOptIn;
import com.carrefour.fid.android.domain.models.consent.extension.C37997a;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.domain.models.criteo.C38001c;
import com.carrefour.fid.android.domain.models.criteo.C38007i;
import com.carrefour.fid.android.domain.models.criteo.C38009k;
import com.carrefour.fid.android.domain.models.criteo.C38011m;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.domain.models.criteo.CriteoFormatRendering;
import com.carrefour.fid.android.domain.models.criteo.CriteoPageType;
import com.carrefour.fid.android.domain.models.criteo.OptionalFooterType;
import com.carrefour.fid.android.domain.models.delivery.DeliveryMode;
import com.carrefour.fid.android.domain.models.luckycart.C38047a;
import com.carrefour.fid.android.domain.models.offer.OfferFlag;
import com.carrefour.fid.android.domain.models.offer.PromoType;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.domain.models.product.detail.PictureSize;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import com.carrefour.fid.android.domain.models.service.models.DeliveryFee;
import com.carrefour.fid.android.domain.models.service.models.DriveType;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import com.carrefour.fid.android.domain.utilities.C38207a;
import com.carrefour.fid.android.shared.constant.C28607x;
import com.carrefour.fid.android.shared.data.parsing.C28646a;
import com.carrefour.fid.android.shared.extension.C28746b0;
import com.carrefour.fid.android.shared.extension.C28750d0;
import com.carrefour.fid.android.shared.util.C28935i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11661u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.C10930d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C11621s;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a\f\u0010\r\u001a\u00020\u000f*\u00020\u000eH\u0000\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u001e\u001a\u0004\u0018\u00010\u001c2 \u0010\u001d\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0019\u0018\u00010\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a,\u0010 \u001a\u0004\u0018\u00010\u001c2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a2\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00122\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001a\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010$\u001a\u00020\u0001H\u0002\u001a2\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00122\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a4\u0010(\u001a\u0004\u0018\u00010\u001c2 \u0010\u001d\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0019\u0018\u00010\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a,\u0010)\u001a\u0004\u0018\u00010\u001c2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001c\u0010*\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\f\u0010-\u001a\u00020,*\u00020+H\u0002\u001a\u0012\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u001aH\u0002\u001a\u0012\u00102\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020+H\u0002\u001a\u001e\u0010\r\u001a\u000205*\u0002032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010%\u001a%\u0010\r\u001a\u000209*\u0002062\u0006\u0010\u0006\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b\r\u0010:\u001a \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020<\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00120\u0019*\u0004\u0018\u00010;H\u0002\u001a\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0006\u0010>\u001a\u00020\u001aH\u0002\u001a\u0015\u0010@\u001a\u0004\u0018\u000107*\u000206H\u0002¢\u0006\u0004\b@\u0010A\u001a\u000e\u0010\r\u001a\u00020C*\u0004\u0018\u00010BH\u0002\u001a\u0015\u0010E\u001a\u00020D*\u0004\u0018\u000107H\u0002¢\u0006\u0004\bE\u0010F\u001a/\u0010\r\u001a\b\u0012\u0004\u0012\u00020H0\u0012*\b\u0012\u0004\u0012\u00020G0\u00122\u0006\u0010\u0006\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\r\u0010I\u001a\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020K0\u0012*\u00020JH\u0000\u001a\u001c\u0010P\u001a\u0004\u0018\u00010O2\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010N\u001a\u00020\u0001H\u0002\u001a\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020R0\u00122\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0002\u001a(\u0010\r\u001a\u00020W*\u00020T2\u0006\u0010U\u001a\u00020\u00052\u0014\b\u0002\u0010V\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001a0\u0019\u001a4\u0010\r\u001a\b\u0012\u0004\u0012\u00020W0\u0012*\b\u0012\u0004\u0012\u00020T0\u00122\u0006\u0010U\u001a\u00020\u00052\u0014\b\u0002\u0010V\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001a0\u0019\u001a\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0006\u0010X\u001a\u00020\u001aH\u0002\u001a\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020[0\u0012*\u00020Z\u001a\u0018\u0010\r\u001a\u0004\u0018\u00010[*\u00020\\2\b\u0010^\u001a\u0004\u0018\u00010]H\u0000\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010`*\u00020_2\u0006\u0010^\u001a\u00020]H\u0000\u001a8\u0010f\u001a\u00020e*\b\u0012\u0004\u0012\u00020[0\u00122\b\u0010a\u001a\u0004\u0018\u00010\u001a2\b\u0010b\u001a\u0004\u0018\u00010\u001a2\b\u0010c\u001a\u0004\u0018\u00010\u001a2\b\u0010d\u001a\u0004\u0018\u00010\u001a\u001a\u0016\u0010g\u001a\b\u0012\u0004\u0012\u00020\\0\u0012*\b\u0012\u0004\u0012\u00020[0\u0012\u001a\f\u0010h\u001a\u0004\u0018\u00010_*\u00020`\u001a\u0010\u0010k\u001a\u0004\u0018\u00010j2\u0006\u0010i\u001a\u00020\u001a\u001a\n\u0010\r\u001a\u00020m*\u00020l\u001a\n\u0010\r\u001a\u00020o*\u00020n\u0002\u0004\n\u0002\b\u0019¨\u0006p"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSponsoredItemsResponse;", "", "isCriteoFlagshipEnabled", "Lcom/carrefour/fid/android/domain/models/criteo/CriteoPageType;", "pageType", "Lcom/carrefour/fid/android/shared/data/parsing/a;", "errorReporter", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/utilities/a;", "toResult", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffSponsoredItemsResponse;ZLcom/carrefour/fid/android/domain/models/criteo/CriteoPageType;Lcom/carrefour/fid/android/shared/data/parsing/a;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoResponse;", "Lcom/carrefour/fid/android/domain/models/criteo/c;", "toDomain", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLuckyCartResponse;", "Lcom/carrefour/fid/android/domain/models/luckycart/a;", "Lcom/carrefour/fid/android/domain/models/criteo/m;", "getSponsoredProducts", "", "Lcom/carrefour/fid/android/domain/models/criteo/i;", "getButterflies", "Lcom/carrefour/fid/android/domain/models/criteo/a;", "getBanners", "Lcom/carrefour/fid/android/domain/models/criteo/k;", "getFlagship", "", "", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoViewItem;", "placements", "getSponsoredProductsCategory", "placement", "getSponsoredProductsCategoryByPageType", "getButterflyCategoriesByPageType", "category", "getCriteoButterflyDomain", "isSponsored", "Lcom/carrefour/fid/android/domain/models/criteo/n;", "getCriteoProducts", "getBannerCategoriesByPageType", "getFlagshipCategory", "getFlagshipCategoriesByPageType", "getCriteoFlagshipDomain", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffRendering;", "Lcom/carrefour/fid/android/domain/models/criteo/CriteoFormatRendering;", "toCriteoFormatRenderingDomain", "optionalFooterType", "Lcom/carrefour/fid/android/domain/models/criteo/OptionalFooterType;", "getOptionalFooterType", "rendering", "getOptionalFooterUrl", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "criteoProduct", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer;", "", "bundle", "Lcom/carrefour/fid/android/domain/models/product/plp/PlpOffer;", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer;Lcom/carrefour/fid/android/shared/data/parsing/a;Ljava/lang/Integer;)Lcom/carrefour/fid/android/domain/models/product/plp/PlpOffer;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPictures;", "Lcom/carrefour/fid/android/domain/models/product/detail/PictureSize;", "Lcom/carrefour/fid/android/domain/models/product/ProductPicture;", "html", "parseKeyFeatures", "getBundle", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductOffer;)Ljava/lang/Integer;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPrices;", "Lcom/carrefour/fid/android/domain/models/offer/Prices;", "", "toPrice", "(Ljava/lang/Integer;)D", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;", "Lcom/carrefour/fid/android/domain/models/offer/Discount;", "(Ljava/util/List;Lcom/carrefour/fid/android/shared/data/parsing/a;Ljava/lang/Integer;)Ljava/util/List;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffProductFlags;", "Lcom/carrefour/fid/android/domain/models/offer/OfferFlag;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;", "promo", "isBundle", "Lcom/carrefour/fid/android/domain/models/offer/PromoType;", "getPromoType", "listDelivery", "Lcom/carrefour/fid/android/domain/models/delivery/DeliveryMode;", "getDeliveryMode", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonCategory;", "parsingErrorReporter", "categoryNamesByLevel", "Lcom/carrefour/fid/android/domain/models/category/ProductCategory;", "searchParams", "toSearchParams", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentsResponse;", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptIn;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentType;", "consentType", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffConsentOptInName;", "Lcom/carrefour/fid/android/domain/models/consent/ConsentName;", "email", "phoneNumber", "customerId", "loyaltyCardId", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffUpdateConsentsBody;", "toBffUpdateConsentsBody", "toBffConsentOptInList", "toBffConsentOptInName", "id", "Lcom/carrefour/fid/android/domain/models/service/models/StoreServiceType;", "getStoreServiceTypeFromId", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeliveryFee;", "Lcom/carrefour/fid/android/domain/models/service/models/DeliveryFee;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonDetailedFacility;", "Lcom/carrefour/fid/android/domain/models/service/models/StoreService;", "bff-data-shared_release"}, mo22517k = 2, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBffSharedMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BffSharedMapper.kt\ncom/carrefour/fid/android/bff_data_shared/data/api/mapper/BffSharedMapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,945:1\n1549#2:946\n1620#2,3:947\n1603#2,9:950\n1855#2:959\n1856#2:961\n1612#2:962\n1855#2:963\n1603#2,9:964\n1855#2:973\n1856#2:975\n1612#2:976\n1856#2:977\n766#2:978\n857#2,2:979\n1855#2:981\n1549#2:982\n1620#2,3:983\n1856#2:986\n1855#2,2:987\n766#2:990\n857#2,2:991\n1603#2,9:993\n1855#2:1002\n1856#2:1004\n1612#2:1005\n1603#2,9:1006\n1855#2:1015\n1856#2:1017\n1612#2:1018\n1549#2:1019\n1620#2,3:1020\n1855#2,2:1024\n1603#2,9:1026\n1855#2:1035\n1856#2:1037\n1612#2:1038\n1549#2:1040\n1620#2,3:1041\n1559#2:1044\n1590#2,4:1045\n1045#2:1049\n1559#2:1050\n1590#2,4:1051\n1045#2:1055\n1559#2:1056\n1590#2,4:1057\n1045#2:1061\n1603#2,9:1062\n1855#2:1071\n1549#2:1072\n1620#2,3:1073\n1856#2:1077\n1612#2:1078\n1603#2,9:1079\n1855#2:1088\n1856#2:1090\n1612#2:1091\n1603#2,9:1093\n1855#2:1102\n1856#2:1104\n1612#2:1105\n1855#2:1106\n1855#2,2:1107\n1856#2:1109\n766#2:1110\n857#2,2:1111\n766#2:1113\n857#2,2:1114\n766#2:1116\n857#2,2:1117\n766#2:1119\n857#2,2:1120\n1549#2:1122\n1620#2,3:1123\n1549#2:1126\n1620#2,3:1127\n1#3:960\n1#3:974\n1#3:989\n1#3:1003\n1#3:1016\n1#3:1023\n1#3:1036\n1#3:1039\n1#3:1076\n1#3:1089\n1#3:1092\n1#3:1103\n*S KotlinDebug\n*F\n+ 1 BffSharedMapper.kt\ncom/carrefour/fid/android/bff_data_shared/data/api/mapper/BffSharedMapperKt\n*L\n149#1:946\n149#1:947,3\n161#1:950,9\n161#1:959\n161#1:961\n161#1:962\n187#1:963\n189#1:964,9\n189#1:973\n189#1:975\n189#1:976\n187#1:977\n194#1:978\n194#1:979,2\n199#1:981\n201#1:982\n201#1:983,3\n199#1:986\n229#1:987,2\n264#1:990\n264#1:991,2\n272#1:993,9\n272#1:1002\n272#1:1004\n272#1:1005\n277#1:1006,9\n277#1:1015\n277#1:1017\n277#1:1018\n306#1:1019\n306#1:1020,3\n353#1:1024,2\n377#1:1026,9\n377#1:1035\n377#1:1037\n377#1:1038\n436#1:1040\n436#1:1041,3\n494#1:1044\n494#1:1045,4\n498#1:1049\n502#1:1050\n502#1:1051,4\n506#1:1055\n510#1:1056\n510#1:1057,4\n514#1:1061\n544#1:1062,9\n544#1:1071\n574#1:1072\n574#1:1073,3\n544#1:1077\n544#1:1078\n691#1:1079,9\n691#1:1088\n691#1:1090\n691#1:1091\n722#1:1093,9\n722#1:1102\n722#1:1104\n722#1:1105\n733#1:1106\n734#1:1107,2\n733#1:1109\n799#1:1110\n799#1:1111,2\n812#1:1113\n812#1:1114,2\n825#1:1116\n825#1:1117,2\n838#1:1119\n838#1:1120,2\n853#1:1122\n853#1:1123,3\n940#1:1126\n940#1:1127,3\n161#1:960\n189#1:974\n272#1:1003\n277#1:1016\n377#1:1036\n544#1:1076\n691#1:1089\n722#1:1103\n*E\n"})
public final class BffSharedMapperKt {

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        /* JADX WARNING: Can't wrap try/catch for region: R(85:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|(2:39|40)|41|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|(2:87|88)|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(86:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|(2:29|30)|31|33|34|35|36|37|38|(2:39|40)|41|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|(2:87|88)|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(87:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|36|37|38|(2:39|40)|41|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|(2:87|88)|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(88:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|36|37|38|(2:39|40)|41|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(89:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(90:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(91:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|(2:49|50)|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(93:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|49|50|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(94:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|49|50|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|(2:77|78)|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|(2:107|108)|109|111) */
        /* JADX WARNING: Can't wrap try/catch for region: R(98:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|43|44|45|46|47|48|49|50|51|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|71|72|73|74|75|76|77|78|79|81|82|83|84|85|86|87|88|89|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|111) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0175 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x017d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0061 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x009a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00bb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00d3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00e3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x00ff */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0109 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0124 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0134 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x014d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0155 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x015d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x0165 */
        static {
            /*
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType[] r0 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r2 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_CATEGORY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r3 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_SEARCH_RESULT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r4 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_ITEM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r5 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_BASKET     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r6 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_STORE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                r6 = 6
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r7 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_CATALOGUE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                r7 = 7
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r8 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_INSIDE_CATALOGUE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r0[r8] = r7     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                r8 = 8
                com.carrefour.fid.android.domain.models.criteo.CriteoPageType r9 = com.carrefour.fid.android.domain.models.criteo.CriteoPageType.VIEW_HOME     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r0[r9] = r8     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                $EnumSwitchMapping$0 = r0
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.hOMEDELIVERYNAL     // Catch:{ NoSuchFieldError -> 0x0061 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
                r0[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.eXPRESSDELIVERY     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r0[r9] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.mARKETPLACE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r9] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer.BffChannelType.dRIVECLCV     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r9] = r4     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                $EnumSwitchMapping$1 = r0
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.Type.promo     // Catch:{ NoSuchFieldError -> 0x008a }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x008a }
                r0[r9] = r1     // Catch:{ NoSuchFieldError -> 0x008a }
            L_0x008a:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.Type.ri     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r0[r9] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.Type.rd     // Catch:{ NoSuchFieldError -> 0x009a }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x009a }
                r0[r9] = r3     // Catch:{ NoSuchFieldError -> 0x009a }
            L_0x009a:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.Type.pf     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r0[r9] = r4     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                $EnumSwitchMapping$2 = r0
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_CARREFOUR_EMAIL     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r0[r9] = r1     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_CARREFOUR_SMS     // Catch:{ NoSuchFieldError -> 0x00bb }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bb }
                r0[r9] = r2     // Catch:{ NoSuchFieldError -> 0x00bb }
            L_0x00bb:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.CGU_CLIENT     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r0[r9] = r3     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.DATA_NO_CARD     // Catch:{ NoSuchFieldError -> 0x00cb }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
                r0[r9] = r4     // Catch:{ NoSuchFieldError -> 0x00cb }
            L_0x00cb:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.DATA_CARD     // Catch:{ NoSuchFieldError -> 0x00d3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d3 }
                r0[r9] = r5     // Catch:{ NoSuchFieldError -> 0x00d3 }
            L_0x00d3:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING     // Catch:{ NoSuchFieldError -> 0x00db }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r0[r9] = r6     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING     // Catch:{ NoSuchFieldError -> 0x00e3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e3 }
                r0[r9] = r7     // Catch:{ NoSuchFieldError -> 0x00e3 }
            L_0x00e3:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r9 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_FID_EMAIL     // Catch:{ NoSuchFieldError -> 0x00eb }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00eb }
                r0[r9] = r8     // Catch:{ NoSuchFieldError -> 0x00eb }
            L_0x00eb:
                r9 = 9
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_FID_SMS     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r0[r10] = r9     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_FID_POST     // Catch:{ NoSuchFieldError -> 0x00ff }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ff }
                r11 = 10
                r0[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00ff }
            L_0x00ff:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_FID_CARREFOUR_GROUP     // Catch:{ NoSuchFieldError -> 0x0109 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0109 }
                r11 = 11
                r0[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0109 }
            L_0x0109:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentOptInName.OPTIN_FID_TIERS     // Catch:{ NoSuchFieldError -> 0x0113 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0113 }
                r11 = 12
                r0[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0113 }
            L_0x0113:
                $EnumSwitchMapping$3 = r0
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType.EMAIL_CONSENT     // Catch:{ NoSuchFieldError -> 0x0124 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0124 }
                r0[r10] = r1     // Catch:{ NoSuchFieldError -> 0x0124 }
            L_0x0124:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType.PHONE_CONSENT     // Catch:{ NoSuchFieldError -> 0x012c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r0[r10] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType.APP_CONSENT     // Catch:{ NoSuchFieldError -> 0x0134 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0134 }
                r0[r10] = r3     // Catch:{ NoSuchFieldError -> 0x0134 }
            L_0x0134:
                com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType r10 = com.carrefour.fid.android.bff_data_shared.data.api.entities.BffConsentType.LOYALTY_CONSENT     // Catch:{ NoSuchFieldError -> 0x013c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x013c }
                r0[r10] = r4     // Catch:{ NoSuchFieldError -> 0x013c }
            L_0x013c:
                $EnumSwitchMapping$4 = r0
                com.carrefour.fid.android.domain.models.consent.ConsentName[] r0 = com.carrefour.fid.android.domain.models.consent.ConsentName.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.domain.models.consent.ConsentName r10 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_EMAIL     // Catch:{ NoSuchFieldError -> 0x014d }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x014d }
                r0[r10] = r1     // Catch:{ NoSuchFieldError -> 0x014d }
            L_0x014d:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_SMS     // Catch:{ NoSuchFieldError -> 0x0155 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0155 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0155 }
            L_0x0155:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING     // Catch:{ NoSuchFieldError -> 0x015d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x015d }
            L_0x015d:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING     // Catch:{ NoSuchFieldError -> 0x0165 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0165 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0165 }
            L_0x0165:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_FID_EMAIL     // Catch:{ NoSuchFieldError -> 0x016d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x016d }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x016d }
            L_0x016d:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_FID_SMS     // Catch:{ NoSuchFieldError -> 0x0175 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0175 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0175 }
            L_0x0175:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_FID_POST     // Catch:{ NoSuchFieldError -> 0x017d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x017d }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x017d }
            L_0x017d:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_FID_CARREFOUR_GROUP     // Catch:{ NoSuchFieldError -> 0x0185 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0185 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0185 }
            L_0x0185:
                com.carrefour.fid.android.domain.models.consent.ConsentName r1 = com.carrefour.fid.android.domain.models.consent.ConsentName.OPTIN_FID_TIERS     // Catch:{ NoSuchFieldError -> 0x018d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018d }
                r0[r1] = r9     // Catch:{ NoSuchFieldError -> 0x018d }
            L_0x018d:
                $EnumSwitchMapping$5 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.WhenMappings.<clinit>():void");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem> getBannerCategoriesByPageType(java.util.Map<java.lang.String, ? extends java.util.Set<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem>> r7, com.carrefour.fid.android.domain.models.criteo.CriteoPageType r8) {
        /*
            int[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.WhenMappings.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r0[r8]
            r0 = 5
            r1 = 0
            r2 = 2
            r3 = 0
            if (r8 == r0) goto L_0x00e0
            r0 = 6
            java.lang.String r4 = "ST"
            if (r8 == r0) goto L_0x00b1
            r0 = 7
            if (r8 == r0) goto L_0x0082
            r0 = 8
            if (r8 == r0) goto L_0x001c
            goto L_0x0110
        L_0x001c:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem[] r8 = new com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem[r2]
            java.lang.String r0 = "viewHomeApiApp-inList2"
            java.lang.Object r0 = r7.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r4 = "custom_minibanner"
            if (r0 == 0) goto L_0x004c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r0.next()
            r6 = r5
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r6 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r6
            java.lang.String r6 = r6.getFormat()
            boolean r6 = kotlin.text.C11622t.equals$default(r6, r4, r1, r2, r3)
            if (r6 == 0) goto L_0x0030
            goto L_0x0049
        L_0x0048:
            r5 = r3
        L_0x0049:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r5 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r5
            goto L_0x004d
        L_0x004c:
            r5 = r3
        L_0x004d:
            r8[r1] = r5
            java.lang.String r0 = "viewHomeApiApp-inList2b"
            java.lang.Object r7 = r7.get(r0)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L_0x0079
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x005f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r7.next()
            r5 = r0
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r5 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r5
            java.lang.String r5 = r5.getFormat()
            boolean r5 = kotlin.text.C11622t.equals$default(r5, r4, r1, r2, r3)
            if (r5 == 0) goto L_0x005f
            r3 = r0
        L_0x0077:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r3 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r3
        L_0x0079:
            r7 = 1
            r8[r7] = r3
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40450N(r8)
            goto L_0x0110
        L_0x0082:
            java.lang.String r8 = "viewInsideCatalogueApiApp-inGrid"
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L_0x00ac
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0092:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00aa
            java.lang.Object r8 = r7.next()
            r0 = r8
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r0
            java.lang.String r0 = r0.getFormat()
            boolean r0 = kotlin.text.C11622t.equals$default(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L_0x0092
            r3 = r8
        L_0x00aa:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r3 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r3
        L_0x00ac:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40449M(r3)
            goto L_0x0110
        L_0x00b1:
            java.lang.String r8 = "viewCatalogueApiApp-inGrid"
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L_0x00db
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00c1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00d9
            java.lang.Object r8 = r7.next()
            r0 = r8
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r0
            java.lang.String r0 = r0.getFormat()
            boolean r0 = kotlin.text.C11622t.equals$default(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L_0x00c1
            r3 = r8
        L_0x00d9:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r3 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r3
        L_0x00db:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40449M(r3)
            goto L_0x0110
        L_0x00e0:
            java.lang.String r8 = "viewMagasinApiApp-inList"
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L_0x010c
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00f0:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x010a
            java.lang.Object r8 = r7.next()
            r0 = r8
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r0
            java.lang.String r0 = r0.getFormat()
            java.lang.String r4 = "iab_medium_rectangle"
            boolean r0 = kotlin.text.C11622t.equals$default(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L_0x00f0
            r3 = r8
        L_0x010a:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r3 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r3
        L_0x010c:
            java.util.List r3 = kotlin.collections.CollectionsKt__CollectionsKt.m40449M(r3)
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.getBannerCategoriesByPageType(java.util.Map, com.carrefour.fid.android.domain.models.criteo.CriteoPageType):java.util.List");
    }

    private static final List<C37999a> getBanners(BffCriteoResponse bffCriteoResponse, CriteoPageType criteoPageType) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        List<Map<String, Set<BffCriteoViewItem>>> placements = bffCriteoResponse.getPlacements();
        if (placements != null) {
            for (Map bannerCategoriesByPageType : placements) {
                List<BffCriteoViewItem> bannerCategoriesByPageType2 = getBannerCategoriesByPageType(bannerCategoriesByPageType, criteoPageType);
                List list = null;
                if (bannerCategoriesByPageType2 != null) {
                    Iterable<BffCriteoViewItem> iterable = bannerCategoriesByPageType2;
                    ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
                    for (BffCriteoViewItem bffCriteoViewItem : iterable) {
                        BffRendering rendering = bffCriteoViewItem.getRendering();
                        if (rendering != null) {
                            str = rendering.getBackgroundImage();
                        } else {
                            str = null;
                        }
                        BffRendering rendering2 = bffCriteoViewItem.getRendering();
                        if (rendering2 != null) {
                            str2 = rendering2.getMobileBackgroundImage();
                        } else {
                            str2 = null;
                        }
                        arrayList2.add(new C37999a(str, str2, "", "", bffCriteoViewItem.getOnLoadBeacon(), bffCriteoViewItem.getOnViewBeacon(), bffCriteoViewItem.getOnClickBeacon()));
                    }
                    list = arrayList2;
                }
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.m40441E();
                }
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    private static final Integer getBundle(BffProductOffer bffProductOffer) {
        BffDiscount discount;
        List<BffDeals> deals;
        BffDeals bffDeals;
        BffPrices prices = bffProductOffer.getPrices();
        if (prices == null || (discount = prices.getDiscount()) == null || (deals = discount.getDeals()) == null || (bffDeals = (BffDeals) CollectionsKt___CollectionsKt.m40479B2(deals)) == null) {
            return null;
        }
        return bffDeals.getBundle();
    }

    private static final List<C38007i> getButterflies(BffCriteoResponse bffCriteoResponse, CriteoPageType criteoPageType, C28646a aVar) {
        List list;
        ArrayList arrayList = new ArrayList();
        List<Map<String, Set<BffCriteoViewItem>>> placements = bffCriteoResponse.getPlacements();
        if (placements != null) {
            for (Map butterflyCategoriesByPageType : placements) {
                List<BffCriteoViewItem> butterflyCategoriesByPageType2 = getButterflyCategoriesByPageType(butterflyCategoriesByPageType, criteoPageType);
                if (butterflyCategoriesByPageType2 != null) {
                    list = new ArrayList();
                    for (BffCriteoViewItem criteoButterflyDomain : butterflyCategoriesByPageType2) {
                        C38007i criteoButterflyDomain2 = getCriteoButterflyDomain(criteoButterflyDomain, aVar);
                        if (criteoButterflyDomain2 != null) {
                            list.add(criteoButterflyDomain2);
                        }
                    }
                } else {
                    list = null;
                }
                if (list == null) {
                    list = CollectionsKt__CollectionsKt.m40441E();
                }
                arrayList.addAll(list);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (!((C38007i) next).mo117513l().isEmpty()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    private static final List<BffCriteoViewItem> getButterflyCategoriesByPageType(Map<String, ? extends Set<BffCriteoViewItem>> map, CriteoPageType criteoPageType) {
        Set set;
        List a0;
        int i = WhenMappings.$EnumSwitchMapping$0[criteoPageType.ordinal()];
        ArrayList arrayList = null;
        if (i == 1) {
            set = C10930d1.m40904w(map.get("viewCategoryApiApp-inGrid1"), map.get("viewCategoryApiApp-inGrid4"));
        } else if (i != 2) {
            set = null;
        } else {
            set = C10930d1.m40904w(map.get("viewSearchResultApiApp-inGrid1"), map.get("viewSearchResultApiApp-inGrid4"));
        }
        if (!(set == null || (a0 = C10978t.m41497a0(set)) == null)) {
            arrayList = new ArrayList();
            for (Object next : a0) {
                if (Intrinsics.areEqual((Object) ((BffCriteoViewItem) next).getFormat(), (Object) C28607x.f69998r)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    private static final C38007i getCriteoButterflyDomain(BffCriteoViewItem bffCriteoViewItem, C28646a aVar) {
        List list;
        List list2;
        C38115c cVar;
        List<C38012n> criteoProducts = getCriteoProducts(bffCriteoViewItem, false);
        List<BffCriteoProduct> products = bffCriteoViewItem.getProducts();
        CriteoFormatRendering criteoFormatRendering = null;
        if (products != null) {
            list = new ArrayList();
            for (BffCriteoProduct bffButtonName : products) {
                String bffButtonName2 = bffButtonName.getBffButtonName();
                if (bffButtonName2 != null) {
                    list.add(bffButtonName2);
                }
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        List list3 = list;
        if (list3.isEmpty()) {
            return null;
        }
        List<BffCriteoProduct> products2 = bffCriteoViewItem.getProducts();
        if (products2 != null) {
            list2 = new ArrayList();
            for (BffCriteoProduct bffCriteoProduct : products2) {
                String productId = bffCriteoProduct.getProductId();
                if (productId == null) {
                    productId = "";
                }
                C38012n nVar = new C38012n(productId, true, bffCriteoProduct.getOnLoadBeacon(), bffCriteoProduct.getOnViewBeacon(), bffCriteoProduct.getOnClickBeacon(), bffCriteoProduct.getOnBasketChangeBeacon(), bffCriteoProduct.getOnWishlistBeacon());
                BffCommonProduct bffProduct = bffCriteoProduct.getBffProduct();
                C28646a aVar2 = aVar;
                if (bffProduct != null) {
                    cVar = toDomain(bffProduct, aVar2, nVar);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    list2.add(cVar);
                }
            }
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        List E5 = CollectionsKt___CollectionsKt.m40497E5(criteoProducts, 4);
        List E52 = CollectionsKt___CollectionsKt.m40497E5(list2, 4);
        BffRendering rendering = bffCriteoViewItem.getRendering();
        if (rendering != null) {
            criteoFormatRendering = toCriteoFormatRenderingDomain(rendering);
        }
        return new C38007i(E5, E52, bffCriteoViewItem.getOnViewBeacon(), bffCriteoViewItem.getOnLoadBeacon(), list3, criteoFormatRendering, bffCriteoViewItem.getOnClickBeacon(), bffCriteoViewItem.getOnFileClickBeacon());
    }

    private static final C38009k getCriteoFlagshipDomain(BffCriteoViewItem bffCriteoViewItem, C28646a aVar) {
        ArrayList arrayList;
        List list;
        CriteoFormatRendering criteoFormatRendering;
        String str;
        String str2;
        String str3;
        String str4;
        BffRendering rendering;
        List<BffCriteoProduct> products;
        C38115c cVar;
        BffCriteoViewItem bffCriteoViewItem2 = bffCriteoViewItem;
        List<C38012n> criteoProducts = getCriteoProducts(bffCriteoViewItem2, true);
        if (bffCriteoViewItem2 == null || (products = bffCriteoViewItem.getProducts()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (BffCriteoProduct bffCriteoProduct : products) {
                String productId = bffCriteoProduct.getProductId();
                if (productId == null) {
                    productId = "";
                }
                C38012n nVar = new C38012n(productId, true, bffCriteoProduct.getOnLoadBeacon(), bffCriteoProduct.getOnViewBeacon(), bffCriteoProduct.getOnClickBeacon(), bffCriteoProduct.getOnBasketChangeBeacon(), bffCriteoProduct.getOnWishlistBeacon());
                BffCommonProduct bffProduct = bffCriteoProduct.getBffProduct();
                C28646a aVar2 = aVar;
                if (bffProduct != null) {
                    cVar = toDomain(bffProduct, aVar2, nVar);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
        }
        if (arrayList == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        } else {
            list = arrayList;
        }
        if (!(true ^ criteoProducts.isEmpty())) {
            return null;
        }
        if (bffCriteoViewItem2 == null || (rendering = bffCriteoViewItem.getRendering()) == null) {
            criteoFormatRendering = null;
        } else {
            criteoFormatRendering = toCriteoFormatRenderingDomain(rendering);
        }
        if (bffCriteoViewItem2 != null) {
            str = bffCriteoViewItem.getOnLoadBeacon();
        } else {
            str = null;
        }
        if (bffCriteoViewItem2 != null) {
            str2 = bffCriteoViewItem.getOnViewBeacon();
        } else {
            str2 = null;
        }
        if (bffCriteoViewItem2 != null) {
            str3 = bffCriteoViewItem.getOnClickBeacon();
        } else {
            str3 = null;
        }
        if (bffCriteoViewItem2 != null) {
            str4 = bffCriteoViewItem.getOnFileClickBeacon();
        } else {
            str4 = null;
        }
        return new C38009k(criteoProducts, list, str, str2, criteoFormatRendering, str3, str4);
    }

    private static final List<C38012n> getCriteoProducts(BffCriteoViewItem bffCriteoViewItem, boolean z) {
        ArrayList arrayList;
        List<BffCriteoProduct> products;
        if (bffCriteoViewItem == null || (products = bffCriteoViewItem.getProducts()) == null) {
            arrayList = null;
        } else {
            Iterable<BffCriteoProduct> iterable = products;
            arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BffCriteoProduct bffCriteoProduct : iterable) {
                String productId = bffCriteoProduct.getProductId();
                if (productId == null) {
                    productId = new String();
                }
                arrayList.add(new C38012n(productId, z, bffCriteoProduct.getOnLoadBeacon(), bffCriteoProduct.getOnViewBeacon(), bffCriteoProduct.getOnClickBeacon(), bffCriteoProduct.getOnBasketChangeBeacon(), bffCriteoProduct.getOnWishlistBeacon()));
            }
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return arrayList;
    }

    private static final List<DeliveryMode> getDeliveryMode(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String valueOf : list) {
            DeliveryMode valueOf2 = DeliveryMode.valueOf(valueOf);
            if (valueOf2 != null) {
                arrayList.add(valueOf2);
            }
        }
        return arrayList;
    }

    private static final C38009k getFlagship(BffCriteoResponse bffCriteoResponse, CriteoPageType criteoPageType, C28646a aVar) {
        return getCriteoFlagshipDomain(getFlagshipCategory(bffCriteoResponse.getPlacements(), criteoPageType), aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem getFlagshipCategoriesByPageType(java.util.Map<java.lang.String, ? extends java.util.Set<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem>> r3, com.carrefour.fid.android.domain.models.criteo.CriteoPageType r4) {
        /*
            int[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L_0x001a
            r0 = 2
            if (r4 == r0) goto L_0x0011
            r3 = r1
            goto L_0x0022
        L_0x0011:
            java.lang.String r4 = "viewSearchResultApiApp-inGridFs"
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            goto L_0x0022
        L_0x001a:
            java.lang.String r4 = "viewCategoryApiApp-inGridFs"
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
        L_0x0022:
            if (r3 == 0) goto L_0x0046
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x002a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()
            r0 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r0
            java.lang.String r0 = r0.getFormat()
            java.lang.String r2 = "FS"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x002a
            r1 = r4
        L_0x0044:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r1 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r1
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.getFlagshipCategoriesByPageType(java.util.Map, com.carrefour.fid.android.domain.models.criteo.CriteoPageType):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem");
    }

    private static final BffCriteoViewItem getFlagshipCategory(List<? extends Map<String, ? extends Set<BffCriteoViewItem>>> list, CriteoPageType criteoPageType) {
        if (list == null) {
            return null;
        }
        for (Map flagshipCategoriesByPageType : list) {
            BffCriteoViewItem flagshipCategoriesByPageType2 = getFlagshipCategoriesByPageType(flagshipCategoriesByPageType, criteoPageType);
            if (flagshipCategoriesByPageType2 != null) {
                return flagshipCategoriesByPageType2;
            }
        }
        return null;
    }

    private static final OptionalFooterType getOptionalFooterType(String str) {
        if (Intrinsics.areEqual((Object) str, (Object) C28607x.f69979C)) {
            return OptionalFooterType.REDIRECTION;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "file")) {
            return OptionalFooterType.FILE;
        }
        return OptionalFooterType.NONE;
    }

    private static final String getOptionalFooterUrl(BffRendering bffRendering) {
        String optionalFooterType = bffRendering.getOptionalFooterType();
        if (Intrinsics.areEqual((Object) optionalFooterType, (Object) C28607x.f69979C)) {
            return bffRendering.getOptionalFooterRedirectUrlApp();
        }
        if (Intrinsics.areEqual((Object) optionalFooterType, (Object) "file")) {
            return bffRendering.getOptionalFooterMediaFile();
        }
        return null;
    }

    private static final PromoType getPromoType(BffBffDiscount.Type type, boolean z) {
        if (type == null) {
            return null;
        }
        if (z) {
            return PromoType.BUNDLE;
        }
        int i = WhenMappings.$EnumSwitchMapping$2[type.ordinal()];
        if (i == 1) {
            return PromoType.PROMO;
        }
        if (i == 2) {
            return PromoType.RI;
        }
        if (i == 3) {
            return PromoType.RD;
        }
        if (i != 4) {
            return PromoType.TA;
        }
        return PromoType.PF;
    }

    private static final C38011m getSponsoredProducts(BffCriteoResponse bffCriteoResponse, CriteoPageType criteoPageType, C28646a aVar) {
        List list;
        List list2;
        String str;
        List<BffCriteoProduct> products;
        C38115c cVar;
        List<BffCriteoProduct> products2;
        BffCriteoViewItem sponsoredProductsCategory = getSponsoredProductsCategory(bffCriteoResponse.getPlacements(), criteoPageType);
        String str2 = null;
        if (sponsoredProductsCategory == null || (products2 = sponsoredProductsCategory.getProducts()) == null) {
            list = null;
        } else {
            Iterable<BffCriteoProduct> iterable = products2;
            list = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (BffCriteoProduct bffCriteoProduct : iterable) {
                String productId = bffCriteoProduct.getProductId();
                if (productId == null) {
                    productId = new String();
                }
                list.add(new C38012n(productId, true, bffCriteoProduct.getOnLoadBeacon(), bffCriteoProduct.getOnViewBeacon(), bffCriteoProduct.getOnClickBeacon(), bffCriteoProduct.getOnBasketChangeBeacon(), bffCriteoProduct.getOnWishlistBeacon()));
            }
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        if (sponsoredProductsCategory == null || (products = sponsoredProductsCategory.getProducts()) == null) {
            list2 = null;
        } else {
            list2 = new ArrayList();
            for (BffCriteoProduct bffCriteoProduct2 : products) {
                String productId2 = bffCriteoProduct2.getProductId();
                if (productId2 == null) {
                    productId2 = "";
                }
                C38012n nVar = new C38012n(productId2, true, bffCriteoProduct2.getOnLoadBeacon(), bffCriteoProduct2.getOnViewBeacon(), bffCriteoProduct2.getOnClickBeacon(), bffCriteoProduct2.getOnBasketChangeBeacon(), bffCriteoProduct2.getOnWishlistBeacon());
                BffCommonProduct bffProduct = bffCriteoProduct2.getBffProduct();
                if (bffProduct != null) {
                    cVar = toDomain(bffProduct, aVar, nVar);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    list2.add(cVar);
                }
            }
        }
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.m40441E();
        }
        if (sponsoredProductsCategory != null) {
            str = sponsoredProductsCategory.getOnLoadBeacon();
        } else {
            str = null;
        }
        if (sponsoredProductsCategory != null) {
            str2 = sponsoredProductsCategory.getOnViewBeacon();
        }
        return new C38011m(list, list2, str, str2);
    }

    private static final BffCriteoViewItem getSponsoredProductsCategory(List<? extends Map<String, ? extends Set<BffCriteoViewItem>>> list, CriteoPageType criteoPageType) {
        if (list == null) {
            return null;
        }
        for (Map sponsoredProductsCategoryByPageType : list) {
            BffCriteoViewItem sponsoredProductsCategoryByPageType2 = getSponsoredProductsCategoryByPageType(sponsoredProductsCategoryByPageType, criteoPageType);
            if (sponsoredProductsCategoryByPageType2 != null) {
                return sponsoredProductsCategoryByPageType2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem getSponsoredProductsCategoryByPageType(java.util.Map<java.lang.String, ? extends java.util.Set<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem>> r3, com.carrefour.fid.android.domain.models.criteo.CriteoPageType r4) {
        /*
            int[] r0 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L_0x0032
            r0 = 2
            if (r4 == r0) goto L_0x0029
            r0 = 3
            if (r4 == r0) goto L_0x0020
            r0 = 4
            if (r4 == r0) goto L_0x0017
            r3 = r1
            goto L_0x003a
        L_0x0017:
            java.lang.String r4 = "viewBasketApiApp-bottom"
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            goto L_0x003a
        L_0x0020:
            java.lang.String r4 = "viewItemApiApp-bottom"
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            goto L_0x003a
        L_0x0029:
            java.lang.String r4 = "viewSearchResultApiApp-inGrid3"
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            goto L_0x003a
        L_0x0032:
            java.lang.String r4 = "viewCategoryApiApp-inGrid3"
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
        L_0x003a:
            if (r3 == 0) goto L_0x005e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0042:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = r3.next()
            r0 = r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r0 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r0
            java.lang.String r0 = r0.getFormat()
            java.lang.String r2 = "sponsored_products"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0042
            r1 = r4
        L_0x005c:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem r1 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem) r1
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.getSponsoredProductsCategoryByPageType(java.util.Map, com.carrefour.fid.android.domain.models.criteo.CriteoPageType):com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoViewItem");
    }

    @C12580l
    public static final StoreServiceType getStoreServiceTypeFromId(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        Integer intOrNull = C11621s.toIntOrNull(str);
        StoreServiceType.Drive drive = null;
        if (intOrNull == null) {
            return null;
        }
        int intValue = intOrNull.intValue();
        switch (str.hashCode()) {
            case 48780:
                if (str.equals("150")) {
                    return StoreServiceType.Drive.INSTANCE;
                }
                break;
            case 48781:
                if (str.equals("151")) {
                    return StoreServiceType.Clcv.INSTANCE;
                }
                break;
            case 49842:
                if (str.equals("288")) {
                    return StoreServiceType.H1h3.INSTANCE;
                }
                break;
        }
        if (DriveType.f96568a.mo119106a(intValue) != null) {
            drive = StoreServiceType.Drive.INSTANCE;
        }
        return drive;
    }

    private static final List<String> parseKeyFeatures(String str) {
        Object obj;
        try {
            Result.C10852a aVar = Result.f28060a;
            obj = Result.m38702b(SequencesKt___SequencesKt.m44731c3(SequencesKt___SequencesKt.m44761k1(Regex.m45043f(new Regex("<li>(.*?)</li>"), str, 0, 2, (Object) null), BffSharedMapperKt$parseKeyFeatures$1$1.INSTANCE)));
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            obj = Result.m38702b(C11661u0.m45734a(th));
        }
        if (Result.m38705e(obj) != null) {
            obj = CollectionsKt__CollectionsKt.m40441E();
        }
        return (List) obj;
    }

    @C12579k
    public static final List<BffConsentOptIn> toBffConsentOptInList(@C12579k List<ConsentOptIn> list) {
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterable<ConsentOptIn> iterable = list;
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (ConsentOptIn consentOptIn : iterable) {
            BffConsentOptInName bffConsentOptInName = toBffConsentOptInName(consentOptIn.mo117326h());
            if (consentOptIn.mo117324f() == ChoiceOptIn.ACCEPTED) {
                str = "1";
            } else {
                str = "0";
            }
            arrayList.add(new BffConsentOptIn(bffConsentOptInName, str));
        }
        return arrayList;
    }

    @C12580l
    public static final BffConsentOptInName toBffConsentOptInName(@C12579k ConsentName consentName) {
        Intrinsics.checkNotNullParameter(consentName, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$5[consentName.ordinal()]) {
            case 1:
                return BffConsentOptInName.OPTIN_CARREFOUR_EMAIL;
            case 2:
                return BffConsentOptInName.OPTIN_CARREFOUR_SMS;
            case 3:
                return BffConsentOptInName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING;
            case 4:
                return BffConsentOptInName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING;
            case 5:
                return BffConsentOptInName.OPTIN_FID_EMAIL;
            case 6:
                return BffConsentOptInName.OPTIN_FID_SMS;
            case 7:
                return BffConsentOptInName.OPTIN_FID_POST;
            case 8:
                return BffConsentOptInName.OPTIN_FID_CARREFOUR_GROUP;
            case 9:
                return BffConsentOptInName.OPTIN_FID_TIERS;
            default:
                return null;
        }
    }

    @C12579k
    public static final BffUpdateConsentsBody toBffUpdateConsentsBody(@C12579k List<ConsentOptIn> list, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        if (str == null || C11622t.isBlank(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : list) {
                if (((ConsentOptIn) next).mo117326h() == C37997a.m156419e()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new BffConsent(BffConsentType.EMAIL_CONSENT, str, toBffConsentOptInList(arrayList2)));
            }
        }
        if (str2 == null || C11622t.isBlank(str2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            ArrayList arrayList3 = new ArrayList();
            for (Object next2 : list) {
                if (((ConsentOptIn) next2).mo117326h() == C37997a.m156421g()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    arrayList3.add(next2);
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(new BffConsent(BffConsentType.PHONE_CONSENT, str2, toBffConsentOptInList(arrayList3)));
            }
        }
        if (str3 == null || C11622t.isBlank(str3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            ArrayList arrayList4 = new ArrayList();
            for (Object next3 : list) {
                if (C37997a.m156416b().contains(((ConsentOptIn) next3).mo117326h())) {
                    arrayList4.add(next3);
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(new BffConsent(BffConsentType.APP_CONSENT, str3, toBffConsentOptInList(arrayList4)));
            }
        }
        if (str4 == null || C11622t.isBlank(str4)) {
            z6 = true;
        }
        if (!z6) {
            ArrayList arrayList5 = new ArrayList();
            for (Object next4 : list) {
                if (C37997a.m156420f().contains(((ConsentOptIn) next4).mo117326h())) {
                    arrayList5.add(next4);
                }
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(new BffConsent(BffConsentType.LOYALTY_CONSENT, str4, toBffConsentOptInList(arrayList5)));
            }
        }
        return new BffUpdateConsentsBody(arrayList);
    }

    private static final CriteoFormatRendering toCriteoFormatRenderingDomain(BffRendering bffRendering) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String mobileLogoImage = bffRendering.getMobileLogoImage();
        String bffBackgroundImage = bffRendering.getBffBackgroundImage();
        String backgroundColor = bffRendering.getBackgroundColor();
        if (backgroundColor != null) {
            num = Integer.valueOf(Color.parseColor(backgroundColor));
        } else {
            num = null;
        }
        String borderColor = bffRendering.getBorderColor();
        if (borderColor != null) {
            num2 = Integer.valueOf(Color.parseColor(borderColor));
        } else {
            num2 = null;
        }
        String buttonColor = bffRendering.getButtonColor();
        if (buttonColor != null) {
            num3 = Integer.valueOf(Color.parseColor(buttonColor));
        } else {
            num3 = null;
        }
        String selectedButtonColor = bffRendering.getSelectedButtonColor();
        if (selectedButtonColor != null) {
            num4 = Integer.valueOf(Color.parseColor(selectedButtonColor));
        } else {
            num4 = null;
        }
        String buttonTextColor = bffRendering.getButtonTextColor();
        if (buttonTextColor != null) {
            num5 = Integer.valueOf(Color.parseColor(buttonTextColor));
        } else {
            num5 = null;
        }
        String selectedButtonTextColor = bffRendering.getSelectedButtonTextColor();
        if (selectedButtonTextColor != null) {
            num6 = Integer.valueOf(Color.parseColor(selectedButtonTextColor));
        } else {
            num6 = null;
        }
        return new CriteoFormatRendering(mobileLogoImage, bffBackgroundImage, num, num2, num3, num4, num5, num6, getOptionalFooterType(bffRendering.getOptionalFooterType()), getOptionalFooterUrl(bffRendering));
    }

    @C12579k
    public static final C38001c toDomain(@C12579k BffCriteoResponse bffCriteoResponse, boolean z, @C12579k CriteoPageType criteoPageType, @C12579k C28646a aVar) {
        Intrinsics.checkNotNullParameter(bffCriteoResponse, "<this>");
        Intrinsics.checkNotNullParameter(criteoPageType, "pageType");
        Intrinsics.checkNotNullParameter(aVar, "errorReporter");
        return new C38001c(getSponsoredProducts(bffCriteoResponse, criteoPageType, aVar), getButterflies(bffCriteoResponse, criteoPageType, aVar), getBanners(bffCriteoResponse, criteoPageType), z ? getFlagship(bffCriteoResponse, criteoPageType, aVar) : null);
    }

    public static /* synthetic */ C38115c toDomain$default(BffCommonProduct bffCommonProduct, C28646a aVar, C38012n nVar, int i, Object obj) {
        if ((i & 2) != 0) {
            nVar = null;
        }
        return toDomain(bffCommonProduct, aVar, nVar);
    }

    private static final double toPrice(Integer num) {
        if (num != null) {
            return ((double) num.intValue()) / ((double) 100);
        }
        return 0.0d;
    }

    @C12579k
    public static final Object toResult(@C12580l BffSponsoredItemsResponse bffSponsoredItemsResponse, boolean z, @C12579k CriteoPageType criteoPageType, @C12579k C28646a aVar) {
        BffSponsoredItemsResponseData data;
        BffSponsoredItems sponsoredItems;
        C38001c cVar;
        CriteoPageType criteoPageType2 = criteoPageType;
        C28646a aVar2 = aVar;
        Intrinsics.checkNotNullParameter(criteoPageType2, "pageType");
        Intrinsics.checkNotNullParameter(aVar2, "errorReporter");
        if (bffSponsoredItemsResponse == null || (data = bffSponsoredItemsResponse.getData()) == null || (sponsoredItems = data.getSponsoredItems()) == null) {
            Result.C10852a aVar3 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Throwable("Can't get sponsoredItems")));
        }
        BffCriteoResponse criteoResponse = sponsoredItems.getCriteoResponse();
        C38047a aVar4 = null;
        if (criteoResponse != null) {
            cVar = toDomain(criteoResponse, z, criteoPageType2, aVar2);
        } else {
            cVar = null;
        }
        BffLuckyCartResponse luckycartResponse = sponsoredItems.getLuckycartResponse();
        if (luckycartResponse != null) {
            aVar4 = toDomain(luckycartResponse);
        }
        if (cVar == null && aVar4 == null) {
            Result.C10852a aVar5 = Result.f28060a;
            return Result.m38702b(C11661u0.m45734a(new Throwable("Can't get criteo response and luckyCart response")));
        }
        if (cVar == null) {
            C28935i.m119704b(C28935i.f70940a, "Can't get criteo response", (Throwable) null, 0, 6, (Object) null);
        } else if (aVar4 == null) {
            C28935i.m119704b(C28935i.f70940a, "Can't get lucky cart response", (Throwable) null, 0, 6, (Object) null);
        }
        Result.C10852a aVar6 = Result.f28060a;
        return Result.m38702b(new C38207a(cVar, aVar4));
    }

    private static final List<String> toSearchParams(String str) {
        return StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.substringAfter$default(str, "filter=", (String) null, 2, (Object) null), new String[]{"&filter="}, false, 0, 6, (Object) null);
    }

    public static /* synthetic */ ProductCategory toDomain$default(BffCommonCategory bffCommonCategory, C28646a aVar, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C10977s0.m41492z();
        }
        return toDomain(bffCommonCategory, aVar, (Map<Integer, String>) map);
    }

    public static /* synthetic */ List toDomain$default(List list, C28646a aVar, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C10977s0.m41492z();
        }
        return toDomain((List<BffCommonCategory>) list, aVar, (Map<Integer, String>) map);
    }

    @C12579k
    public static final C38047a toDomain(@C12579k BffLuckyCartResponse bffLuckyCartResponse) {
        String str;
        Intrinsics.checkNotNullParameter(bffLuckyCartResponse, "<this>");
        String imageUrl = bffLuckyCartResponse.getImageUrl();
        String str2 = "";
        if (imageUrl == null) {
            imageUrl = str2;
        }
        String name = bffLuckyCartResponse.getName();
        if (name == null) {
            name = str2;
        }
        BffAction action = bffLuckyCartResponse.getAction();
        if (action == null || (str = action.getRef()) == null) {
            str = str2;
        }
        String bffTrackingUrl = bffLuckyCartResponse.getBffTrackingUrl();
        if (bffTrackingUrl != null) {
            str2 = bffTrackingUrl;
        }
        return new C38047a(imageUrl, name, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        r0 = toDomain$default((java.util.List) r1, r0, (java.util.Map) null, 2, (java.lang.Object) null);
     */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.product.plp.C38115c toDomain(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct r24, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.shared.data.parsing.C28646a r25, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.criteo.C38012n r26) {
        /*
            r0 = r25
            java.lang.String r1 = "<this>"
            r2 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "errorReporter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r24.getGtin()
            if (r1 == 0) goto L_0x015d
            java.lang.String r3 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r1)
            java.util.List r1 = r24.getOffers()
            if (r1 == 0) goto L_0x0155
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r11 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r1, r4)
            r11.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x002f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r1.next()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer r4 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer) r4
            java.lang.Integer r5 = getBundle(r4)
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r4 = toDomain((com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer) r4, (com.carrefour.fid.android.shared.data.parsing.C28646a) r0, (java.lang.Integer) r5)
            r11.add(r4)
            goto L_0x002f
        L_0x0047:
            java.util.List r1 = r24.getCategories()
            r4 = 0
            if (r1 == 0) goto L_0x005c
            r5 = 2
            java.util.List r0 = toDomain$default((java.util.List) r1, (com.carrefour.fid.android.shared.data.parsing.C28646a) r0, (java.util.Map) r4, (int) r5, (java.lang.Object) r4)
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r0)
            com.carrefour.fid.android.domain.models.category.ProductCategory r0 = (com.carrefour.fid.android.domain.models.category.ProductCategory) r0
            goto L_0x005d
        L_0x005c:
            r0 = r4
        L_0x005d:
            java.lang.String r1 = r24.getName()
            java.lang.String r5 = ""
            if (r1 != 0) goto L_0x0066
            r1 = r5
        L_0x0066:
            java.lang.String r6 = r24.getBffDisplayBrand()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0077
            boolean r6 = kotlin.text.C11622t.isBlank(r6)
            if (r6 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r6 = r7
            goto L_0x0078
        L_0x0077:
            r6 = r8
        L_0x0078:
            if (r6 != 0) goto L_0x007f
            java.lang.String r6 = r24.getBffDisplayBrand()
            goto L_0x0086
        L_0x007f:
            java.lang.String r6 = r24.getBrandName()
            if (r6 != 0) goto L_0x0086
            r6 = r5
        L_0x0086:
            java.lang.String r9 = r24.getFullDescription()
            if (r9 == 0) goto L_0x0091
            java.lang.String r9 = com.carrefour.fid.android.shared.extension.StringKt.m118913V(r9)
            goto L_0x0092
        L_0x0091:
            r9 = r4
        L_0x0092:
            if (r9 != 0) goto L_0x0095
            r9 = r5
        L_0x0095:
            java.lang.String r10 = r24.getPackaging()
            if (r10 != 0) goto L_0x009c
            r10 = r5
        L_0x009c:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPictures r12 = r24.getPictures()
            java.util.Map r12 = toDomain((com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPictures) r12)
            java.lang.String r13 = r24.getKeyFeatures()
            if (r13 == 0) goto L_0x00af
            java.util.List r13 = parseKeyFeatures(r13)
            goto L_0x00b0
        L_0x00af:
            r13 = r4
        L_0x00b0:
            if (r13 != 0) goto L_0x00b6
            java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00b6:
            java.lang.String r14 = r24.getTaxeMessage()
            if (r14 != 0) goto L_0x00bd
            r14 = r5
        L_0x00bd:
            java.lang.Double r15 = r24.getRepairIndex()
            java.util.List r16 = r24.getOffers()
            java.lang.Object r16 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r16)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer r16 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer) r16
            if (r16 == 0) goto L_0x00da
            java.lang.Boolean r7 = r16.isVariableWeight()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r4)
            r17 = r4
            goto L_0x00dc
        L_0x00da:
            r17 = r7
        L_0x00dc:
            java.lang.Boolean r4 = r24.getBffIsFood()
            if (r4 == 0) goto L_0x00e9
            boolean r4 = r4.booleanValue()
            r18 = r4
            goto L_0x00eb
        L_0x00e9:
            r18 = r8
        L_0x00eb:
            java.lang.String r4 = r24.getInformationFlagFormat()
            if (r4 != 0) goto L_0x00f4
            r19 = r5
            goto L_0x00f6
        L_0x00f4:
            r19 = r4
        L_0x00f6:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductFlags r4 = r24.getFlags()
            if (r4 == 0) goto L_0x0101
            java.util.List r4 = toDomain((com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductFlags) r4)
            goto L_0x0102
        L_0x0101:
            r4 = 0
        L_0x0102:
            if (r4 != 0) goto L_0x0108
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0108:
            r20 = r4
            com.carrefour.fid.android.domain.models.offer.ProductNutriScore$a r4 = com.carrefour.fid.android.domain.models.offer.ProductNutriScore.f96151a
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFood r5 = r24.getFood()
            if (r5 == 0) goto L_0x011d
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffIngredients r5 = r5.getIngredients()
            if (r5 == 0) goto L_0x011d
            java.lang.String r5 = r5.getNutriscore()
            goto L_0x011e
        L_0x011d:
            r5 = 0
        L_0x011e:
            com.carrefour.fid.android.domain.models.offer.ProductNutriScore r22 = r4.mo118185a(r5)
            java.util.List r4 = r24.getBffDeliveryModes()
            if (r4 == 0) goto L_0x0132
            java.util.List r2 = r24.getBffDeliveryModes()
            java.util.List r2 = getDeliveryMode(r2)
            if (r2 != 0) goto L_0x0136
        L_0x0132:
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0136:
            r16 = r2
            com.carrefour.fid.android.domain.models.product.plp.c r23 = new com.carrefour.fid.android.domain.models.product.plp.c
            r2 = r23
            r21 = 0
            r4 = r0
            r5 = r1
            r7 = r10
            r8 = r12
            r10 = r13
            r12 = r14
            r13 = r15
            r14 = r17
            r15 = r18
            r17 = r19
            r18 = r20
            r19 = r22
            r20 = r26
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r23
        L_0x0155:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't find offer in this product"
            r0.<init>(r1)
            throw r0
        L_0x015d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Product without gtin field!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toDomain(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct, com.carrefour.fid.android.shared.data.parsing.a, com.carrefour.fid.android.domain.models.criteo.n):com.carrefour.fid.android.domain.models.product.plp.c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.carrefour.fid.android.domain.models.product.plp.PlpOffer toDomain(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer r20, com.carrefour.fid.android.shared.data.parsing.C28646a r21, java.lang.Integer r22) {
        /*
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r1 = new com.carrefour.fid.android.domain.models.offer.OfferIdentifier
            java.lang.String r0 = r20.getGtin()
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r0)
            java.lang.String r2 = r20.getCdbase()
            if (r2 == 0) goto L_0x0119
            java.lang.String r2 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r2)
            r3 = 0
            r1.<init>(r0, r2, r3)
            java.lang.String r0 = r20.getCdbase()
            java.lang.String r2 = com.carrefour.fid.android.domain.models.product.ProductReference.m157466b(r0)
            java.lang.String r0 = r20.getFacilityServiceId()
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r0)
            r4 = r0
            goto L_0x002f
        L_0x002e:
            r4 = r3
        L_0x002f:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer$BffChannelType r0 = r20.getBffChannelType()
            if (r0 != 0) goto L_0x0037
            r0 = -1
            goto L_0x003f
        L_0x0037:
            int[] r5 = com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r5[r0]
        L_0x003f:
            r5 = 1
            if (r0 == r5) goto L_0x0056
            r6 = 2
            if (r0 == r6) goto L_0x0053
            r6 = 3
            if (r0 == r6) goto L_0x0050
            r6 = 4
            if (r0 == r6) goto L_0x004d
            r6 = r3
            goto L_0x0059
        L_0x004d:
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r0 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.DRIVE_CLCV
            goto L_0x0058
        L_0x0050:
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r0 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.MARKET_PLACE
            goto L_0x0058
        L_0x0053:
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r0 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.EXPRESS_DELIVERY
            goto L_0x0058
        L_0x0056:
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer$ChannelType r0 = com.carrefour.fid.android.domain.models.product.plp.PlpOffer.ChannelType.HOME_DELIVERY_NAL
        L_0x0058:
            r6 = r0
        L_0x0059:
            java.lang.Integer r0 = r20.getPurchasingStep()
            if (r0 == 0) goto L_0x0064
            int r0 = r0.intValue()
            r5 = r0
        L_0x0064:
            java.lang.Integer r0 = r20.getPurchasingMin()
            r7 = 0
            if (r0 == 0) goto L_0x0071
            int r0 = r0.intValue()
            r8 = r0
            goto L_0x0072
        L_0x0071:
            r8 = r7
        L_0x0072:
            java.lang.Integer r0 = r20.getPurchasingMax()
            if (r0 == 0) goto L_0x007d
            int r0 = r0.intValue()
            goto L_0x0080
        L_0x007d:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0080:
            r9 = r0
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffAvailability r0 = r20.getAvailability()
            if (r0 == 0) goto L_0x008b
            java.lang.Boolean r3 = r0.getBffIsAvailable()
        L_0x008b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x0096
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r0 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.AVAILABLE
            goto L_0x0098
        L_0x0096:
            com.carrefour.fid.android.domain.models.offer.OfferAvailability r0 = com.carrefour.fid.android.domain.models.offer.OfferAvailability.UNAVAILABLE
        L_0x0098:
            r10 = r0
            java.lang.String r0 = r20.getOrigin()
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x00a3
            r11 = r3
            goto L_0x00a4
        L_0x00a3:
            r11 = r0
        L_0x00a4:
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices r0 = r20.getPrices()
            if (r0 == 0) goto L_0x0111
            com.carrefour.fid.android.domain.models.offer.Prices r12 = toDomain((com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices) r0)
            if (r12 == 0) goto L_0x0111
            java.util.List r0 = r20.getBffDiscounts()
            if (r0 == 0) goto L_0x00c0
            r13 = r21
            r14 = r22
            java.util.List r0 = toDomain((java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount>) r0, (com.carrefour.fid.android.shared.data.parsing.C28646a) r13, (java.lang.Integer) r14)
            if (r0 != 0) goto L_0x00c4
        L_0x00c0:
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00c4:
            r13 = r0
            java.lang.Boolean r0 = r20.getBffIsPurchasable()
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r0.booleanValue()
            r14 = r0
            goto L_0x00d2
        L_0x00d1:
            r14 = r7
        L_0x00d2:
            java.lang.Boolean r0 = r20.isInAssortment()
            if (r0 == 0) goto L_0x00de
            boolean r0 = r0.booleanValue()
            r15 = r0
            goto L_0x00df
        L_0x00de:
            r15 = r7
        L_0x00df:
            java.lang.String r0 = r20.getLabelHighlight()
            if (r0 != 0) goto L_0x00e8
            r17 = r3
            goto L_0x00ea
        L_0x00e8:
            r17 = r0
        L_0x00ea:
            java.lang.Boolean r0 = r20.isAlternativeCheaper()
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r0.booleanValue()
            r18 = r0
            goto L_0x00f9
        L_0x00f7:
            r18 = r7
        L_0x00f9:
            r16 = 0
            com.carrefour.fid.android.domain.models.product.plp.PlpOffer r19 = new com.carrefour.fid.android.domain.models.product.plp.PlpOffer
            r0 = r19
            r3 = r4
            r4 = r6
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r17
            r15 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r19
        L_0x0111:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Offer without price field!"
            r0.<init>(r1)
            throw r0
        L_0x0119:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Offer without cdbase field!"
            r0.<init>(r1)
            throw r0
        L_0x0121:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Offer without gtin field!"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toDomain(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffProductOffer, com.carrefour.fid.android.shared.data.parsing.a, java.lang.Integer):com.carrefour.fid.android.domain.models.product.plp.PlpOffer");
    }

    private static final Map<PictureSize, List<ProductPicture>> toDomain(BffPictures bffPictures) {
        List<BffItemPicture> large;
        List<BffItemPicture> medium;
        List<BffItemPicture> small;
        Map g = C10975r0.m41397g();
        int i = 0;
        if (!(bffPictures == null || (small = bffPictures.getSmall()) == null)) {
            Iterable iterable = small;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            int i2 = 0;
            for (Object next : iterable) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                BffItemPicture bffItemPicture = (BffItemPicture) next;
                String path = bffItemPicture.getPath();
                if (path == null) {
                    path = "";
                }
                Integer order = bffItemPicture.getOrder();
                if (order != null) {
                    i2 = order.intValue();
                }
                arrayList.add(new ProductPicture(path, i2));
                i2 = i3;
            }
            List p5 = CollectionsKt___CollectionsKt.m40675p5(arrayList, new BffSharedMapperKt$toDomain$lambda$42$$inlined$sortedBy$1());
            if (p5 != null) {
                g.put(PictureSize.Small, p5);
            }
        }
        if (!(bffPictures == null || (medium = bffPictures.getMedium()) == null)) {
            Iterable iterable2 = medium;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            int i4 = 0;
            for (Object next2 : iterable2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                BffItemPicture bffItemPicture2 = (BffItemPicture) next2;
                String path2 = bffItemPicture2.getPath();
                if (path2 == null) {
                    path2 = "";
                }
                Integer order2 = bffItemPicture2.getOrder();
                if (order2 != null) {
                    i4 = order2.intValue();
                }
                arrayList2.add(new ProductPicture(path2, i4));
                i4 = i5;
            }
            List p52 = CollectionsKt___CollectionsKt.m40675p5(arrayList2, new BffSharedMapperKt$toDomain$lambda$42$$inlined$sortedBy$2());
            if (p52 != null) {
                g.put(PictureSize.Medium, p52);
            }
        }
        if (!(bffPictures == null || (large = bffPictures.getLarge()) == null)) {
            Iterable iterable3 = large;
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(iterable3, 10));
            for (Object next3 : iterable3) {
                int i6 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                BffItemPicture bffItemPicture3 = (BffItemPicture) next3;
                String path3 = bffItemPicture3.getPath();
                if (path3 == null) {
                    path3 = "";
                }
                Integer order3 = bffItemPicture3.getOrder();
                if (order3 != null) {
                    i = order3.intValue();
                }
                arrayList3.add(new ProductPicture(path3, i));
                i = i6;
            }
            List p53 = CollectionsKt___CollectionsKt.m40675p5(arrayList3, new BffSharedMapperKt$toDomain$lambda$42$$inlined$sortedBy$3());
            if (p53 != null) {
                g.put(PictureSize.Large, p53);
            }
        }
        return C10975r0.m41394d(g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r13.getStartingPrice();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final com.carrefour.fid.android.domain.models.offer.Prices toDomain(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices r13) {
        /*
            com.carrefour.fid.android.domain.models.offer.Prices r12 = new com.carrefour.fid.android.domain.models.offer.Prices
            r0 = 0
            if (r13 == 0) goto L_0x0011
            java.lang.Integer r2 = r13.getStartingPrice()
            if (r2 == 0) goto L_0x0011
            double r2 = toPrice(r2)
            goto L_0x0012
        L_0x0011:
            r2 = r0
        L_0x0012:
            if (r13 == 0) goto L_0x001f
            java.lang.Integer r4 = r13.getSalePrice()
            if (r4 == 0) goto L_0x001f
            double r4 = toPrice(r4)
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            if (r13 == 0) goto L_0x0033
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffStandardPricePerUnit r6 = r13.getStandardPricePerUnit()
            if (r6 == 0) goto L_0x0033
            java.lang.Integer r6 = r6.getPricePerUnitValue()
            if (r6 == 0) goto L_0x0033
            double r6 = toPrice(r6)
            goto L_0x0034
        L_0x0033:
            r6 = r0
        L_0x0034:
            if (r13 == 0) goto L_0x0046
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffStandardPricePerUnit r8 = r13.getStandardPricePerUnit()
            if (r8 == 0) goto L_0x0046
            java.lang.Integer r8 = r8.getPricePerUnitValue()
            if (r8 == 0) goto L_0x0046
            double r0 = toPrice(r8)
        L_0x0046:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = com.carrefour.fid.android.shared.extension.C28782t.m119105b(r0)
            if (r13 == 0) goto L_0x005b
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffStandardPricePerUnit r13 = r13.getStandardPricePerUnit()
            if (r13 == 0) goto L_0x005b
            java.lang.String r13 = r13.getUnitOfMeasure()
            goto L_0x005c
        L_0x005b:
            r13 = 0
        L_0x005c:
            if (r13 != 0) goto L_0x0060
            java.lang.String r13 = ""
        L_0x0060:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r2
            r3 = r4
            r5 = r6
            r7 = r13
            r0.<init>(r1, r3, r5, r7, r8, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toDomain(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPrices):com.carrefour.fid.android.domain.models.offer.Prices");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0076, code lost:
        r11 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals) kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x001a A[SYNTHETIC] */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.carrefour.fid.android.domain.models.offer.Discount> toDomain(@org.jetbrains.annotations.C12579k java.util.List<com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount> r22, @org.jetbrains.annotations.C12579k com.carrefour.fid.android.shared.data.parsing.C28646a r23, @org.jetbrains.annotations.C12580l java.lang.Integer r24) {
        /*
            r0 = r22
            r1 = r23
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "errorReporter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x001a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01bb
            java.lang.Object r4 = r2.next()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount r4 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount) r4
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type r5 = r4.getType()
            java.lang.Boolean r6 = r4.getBffIsBundle()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            com.carrefour.fid.android.domain.models.offer.PromoType r8 = getPromoType(r5, r6)
            java.lang.String r5 = "]"
            java.lang.String r6 = "bff_discounts["
            if (r8 != 0) goto L_0x0066
            int r8 = r0.indexOf(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r8)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type r4 = r4.getType()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "type"
            r1.mo83568a(r6, r5, r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
        L_0x0063:
            r7 = 0
            goto L_0x01b4
        L_0x0066:
            java.lang.String r9 = r4.getBffDiscountLabel()
            if (r9 != 0) goto L_0x006e
            java.lang.String r9 = ""
        L_0x006e:
            com.carrefour.fid.android.domain.models.offer.d$a r10 = com.carrefour.fid.android.domain.models.offer.C38067d.f96183b
            java.util.List r11 = r4.getDeals()
            if (r11 == 0) goto L_0x0083
            java.lang.Object r11 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r11)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals r11 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals) r11
            if (r11 == 0) goto L_0x0083
            java.lang.Integer r11 = r11.getDiscountAmount()
            goto L_0x0084
        L_0x0083:
            r11 = 0
        L_0x0084:
            com.carrefour.fid.android.domain.models.offer.d r11 = r10.mo118207a(r11)
            java.lang.Integer r12 = r4.getStartingPrice()
            com.carrefour.fid.android.domain.models.offer.d r12 = r10.mo118207a(r12)
            java.lang.Integer r13 = r4.getBffDisplayPrice()
            com.carrefour.fid.android.domain.models.offer.d r13 = r10.mo118207a(r13)
            if (r13 == 0) goto L_0x018d
            int r13 = r13.mo118204h()
            java.lang.Integer r14 = r4.getForcedPrice()
            com.carrefour.fid.android.domain.models.offer.d r14 = r10.mo118207a(r14)
            java.util.List r15 = r4.getDeals()
            if (r15 == 0) goto L_0x00b9
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r15)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals r15 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals) r15
            if (r15 == 0) goto L_0x00b9
            java.lang.Integer r15 = r15.getBffBundleSalePrice()
            goto L_0x00ba
        L_0x00b9:
            r15 = 0
        L_0x00ba:
            com.carrefour.fid.android.domain.models.offer.d r15 = r10.mo118207a(r15)
            java.util.List r16 = r4.getDeals()
            if (r16 == 0) goto L_0x00d3
            java.lang.Object r16 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r16)
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals r16 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeals) r16
            if (r16 == 0) goto L_0x00d3
            java.lang.Integer r16 = r16.getBffBundleBasePrice()
            r7 = r16
            goto L_0x00d4
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            com.carrefour.fid.android.domain.models.offer.d r17 = r10.mo118207a(r7)
            java.lang.String r7 = r4.getStartDate()
            org.joda.time.DateTime r18 = com.carrefour.fid.android.shared.extension.C28780s.m119103a(r7)
            if (r18 != 0) goto L_0x0109
            int r7 = r0.indexOf(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.String r4 = r4.getStartDate()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "start_date"
            r1.mo83568a(r6, r5, r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x0063
        L_0x0109:
            java.lang.String r7 = r4.getEndDate()
            org.joda.time.DateTime r19 = com.carrefour.fid.android.shared.extension.C28780s.m119103a(r7)
            if (r19 != 0) goto L_0x013a
            int r7 = r0.indexOf(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.String r4 = r4.getEndDate()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "end_date"
            r1.mo83568a(r6, r5, r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x0063
        L_0x013a:
            java.lang.Boolean r5 = r4.getBffIsMixed()
            if (r5 == 0) goto L_0x0145
            boolean r5 = r5.booleanValue()
            goto L_0x0146
        L_0x0145:
            r5 = 0
        L_0x0146:
            java.util.List r4 = r4.getGtins()
            if (r4 == 0) goto L_0x0178
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.C10978t.m41495Y(r4, r7)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x015d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0175
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.carrefour.fid.android.domain.models.product.Gtin.m157308b(r7)
            com.carrefour.fid.android.domain.models.product.Gtin r7 = com.carrefour.fid.android.domain.models.product.Gtin.m157307a(r7)
            r6.add(r7)
            goto L_0x015d
        L_0x0175:
            r20 = r6
            goto L_0x017a
        L_0x0178:
            r20 = 0
        L_0x017a:
            com.carrefour.fid.android.domain.models.offer.Discount r4 = new com.carrefour.fid.android.domain.models.offer.Discount
            r21 = 0
            r7 = r4
            r10 = r24
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x01b4
        L_0x018d:
            int r7 = r0.indexOf(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            java.lang.Integer r4 = r4.getBffDisplayPrice()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = "bff_display_price"
            r1.mo83568a(r6, r5, r4)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            goto L_0x0063
        L_0x01b4:
            if (r7 == 0) goto L_0x001a
            r3.add(r7)
            goto L_0x001a
        L_0x01bb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toDomain(java.util.List, com.carrefour.fid.android.shared.data.parsing.a, java.lang.Integer):java.util.List");
    }

    @C12579k
    public static final List<OfferFlag> toDomain(@C12579k BffProductFlags bffProductFlags) {
        Intrinsics.checkNotNullParameter(bffProductFlags, "<this>");
        ArrayList arrayList = new ArrayList();
        Boolean isAddedSugarFree = bffProductFlags.isAddedSugarFree();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual((Object) isAddedSugarFree, (Object) bool)) {
            arrayList.add(OfferFlag.ADDED_SUGAR_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFreeFromAdditifs(), (Object) bool)) {
            arrayList.add(OfferFlag.ADDITIFS_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isAntibioticFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ANTIBIOTIC_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isAop(), (Object) bool)) {
            arrayList.add(OfferFlag.AOP);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isArtificialColorsFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_COLORS_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isArtificialFragranceFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_FRAGRANCE_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isArtificialPreservativesFree(), (Object) bool)) {
            arrayList.add(OfferFlag.ARTIFICIAL_PRESERVATIVES_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isAwardWinnerWine(), (Object) bool)) {
            arrayList.add(OfferFlag.AWARD_WINNER_WINE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCarrefourBrand(), (Object) bool)) {
            arrayList.add(OfferFlag.CARREFOUR_BRAND);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCarrefourQualityAssured(), (Object) bool)) {
            arrayList.add(OfferFlag.CARREFOUR_QUALITY_ASSURED);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpAcuteToxicity(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_ACUTE_TOXICITY);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpCorrosive(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_CORROSIVE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpExplosive(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_EXPLOSIVE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpFlammable(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_FLAMMABLE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpGazUnderPressure(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_GAZ_UNDER_PRESSURE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpHazardousToEnvironment(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_HAZARDOUS_TO_ENVIRONMENT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpHealthHazard(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_HEALTH_HAZARD);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpOxidising(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_OXIDISING);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isClpSeriousHealthHazard(), (Object) bool)) {
            arrayList.add(OfferFlag.CLP_SERIOUS_HEALTH_HAZARD);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCosher(), (Object) bool)) {
            arrayList.add(OfferFlag.COSHER);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isDefrost(), (Object) bool)) {
            arrayList.add(OfferFlag.DEFROST);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isEcoFriendly(), (Object) bool)) {
            arrayList.add(OfferFlag.ECO_FRIENDLY);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isEcoPackaged(), (Object) bool)) {
            arrayList.add(OfferFlag.ECO_PACKAGED);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFairTrade(), (Object) bool)) {
            arrayList.add(OfferFlag.FAIR_TRADE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFatFree(), (Object) bool)) {
            arrayList.add(OfferFlag.FAT_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFreeRangeChicken(), (Object) bool)) {
            arrayList.add(OfferFlag.FREE_RANGE_CHICKEN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFrenchBeef(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_BEEF);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFrenchFruitOrVegetable(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_FRUIT_OR_VEGETABLE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFrenchPork(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_PORK);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFlagFrenchPoultryMeat(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_POULTRY_MEAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFlagFrenchVealMeat(), (Object) bool)) {
            arrayList.add(OfferFlag.FRENCH_VEAL_MEAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFrozen(), (Object) bool)) {
            arrayList.add(OfferFlag.FROZEN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isFsc(), (Object) bool)) {
            arrayList.add(OfferFlag.FSC);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isGlutenFree(), (Object) bool)) {
            arrayList.add(OfferFlag.GLUTEN_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isGmoFree(), (Object) bool)) {
            arrayList.add(OfferFlag.GMO_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isHalal(), (Object) bool)) {
            arrayList.add(OfferFlag.HALAL);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isHydrogenatedOilFree(), (Object) bool)) {
            arrayList.add(OfferFlag.HYDROGENATED_OIL_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isIdealForInfant(), (Object) bool)) {
            arrayList.add(OfferFlag.IDEAL_FOR_INFANT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isInadvisableForPregnantWomen(), (Object) bool)) {
            arrayList.add(OfferFlag.INADVISABLE_FOR_PREGNANT_WOMEN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isIndividualFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.INDIVIDUAL_FORMAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isInnovation(), (Object) bool)) {
            arrayList.add(OfferFlag.INNOVATION);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isLabelRouge(), (Object) bool)) {
            arrayList.add(OfferFlag.LABEL_ROUGE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isContainingLactose(), (Object) bool)) {
            arrayList.add(OfferFlag.LACTOSE_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isLargeFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.LARGE_FORMAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isLight(), (Object) bool)) {
            arrayList.add(OfferFlag.LIGHT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isMadeInFrance(), (Object) bool)) {
            arrayList.add(OfferFlag.MADE_IN_FRANCE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isOrganic(), (Object) bool)) {
            arrayList.add(OfferFlag.ORGANIC);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isParabenFree(), (Object) bool)) {
            arrayList.add(OfferFlag.PARABEN_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isPesticideFree(), (Object) bool)) {
            arrayList.add(OfferFlag.PESTICIDES_FREE_FROM);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isPhenylalanineFree(), (Object) bool)) {
            arrayList.add(OfferFlag.PHENYLALANINE_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isProtectedGeographicalIndication(), (Object) bool)) {
            arrayList.add(OfferFlag.PROTECTED_GEOGRAPHICAL_INDICATION);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isPureJuice(), (Object) bool)) {
            arrayList.add(OfferFlag.PURE_JUICE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isRaisedOutdoorChicken(), (Object) bool)) {
            arrayList.add(OfferFlag.RAISED_OUTDOOR_CHICKEN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isRichInOmega3(), (Object) bool)) {
            arrayList.add(OfferFlag.RICH_IN_OMEGA3);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSaltFree(), (Object) bool)) {
            arrayList.add(OfferFlag.SALT_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSmallFormat(), (Object) bool)) {
            arrayList.add(OfferFlag.SMALL_FORMAT);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSpecialForCommunities(), (Object) bool)) {
            arrayList.add(OfferFlag.SPECIAL_FOR_COMMUNITIES);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSugarDiet(), (Object) bool)) {
            arrayList.add(OfferFlag.SUGAR_DIET);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSugarFree(), (Object) bool)) {
            arrayList.add(OfferFlag.SUGAR_FREE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSustainable(), (Object) bool)) {
            arrayList.add(OfferFlag.SUSTAINABLE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isSustainableFisheries(), (Object) bool)) {
            arrayList.add(OfferFlag.SUSTAINABLE_FISHERIES);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isTraditionnalSpecialitiesGuaranteed(), (Object) bool)) {
            arrayList.add(OfferFlag.TRADITIONAL_SPECIALITIES_GUARANTEED);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isVegetarian(), (Object) bool)) {
            arrayList.add(OfferFlag.VEGETARIAN);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCrisis(), (Object) bool)) {
            arrayList.add(OfferFlag.CRISIS_RECIPE_CHANGE);
        }
        if (Intrinsics.areEqual((Object) bffProductFlags.isCrisisAllergenAdded(), (Object) bool)) {
            arrayList.add(OfferFlag.CRISIS_ALLERGEN_ADDED);
        }
        return CollectionsKt___CollectionsKt.m40557Q5(arrayList);
    }

    @C12579k
    public static final ProductCategory toDomain(@C12579k BffCommonCategory bffCommonCategory, @C12579k C28646a aVar, @C12579k Map<Integer, String> map) {
        String str;
        String str2;
        String str3;
        CategoryType categoryType;
        Intrinsics.checkNotNullParameter(bffCommonCategory, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "parsingErrorReporter");
        Intrinsics.checkNotNullParameter(map, "categoryNamesByLevel");
        Map<Integer, String> J0 = C10977s0.m41442J0(map);
        Integer level = bffCommonCategory.getLevel();
        int i = 1;
        Integer valueOf = Integer.valueOf(level != null ? level.intValue() : 1);
        String name = bffCommonCategory.getName();
        if (name == null) {
            name = "";
        }
        J0.put(valueOf, name);
        String bffId = bffCommonCategory.getBffId();
        if (bffId == null) {
            bffId = "";
        }
        String name2 = bffCommonCategory.getName();
        if (name2 == null) {
            str = "";
        } else {
            str = name2;
        }
        Integer level2 = bffCommonCategory.getLevel();
        if (level2 != null) {
            i = level2.intValue();
        }
        int i2 = i;
        String idPath = bffCommonCategory.getIdPath();
        if (idPath == null) {
            str2 = "";
        } else {
            str2 = idPath;
        }
        String bffSearchParam = bffCommonCategory.getBffSearchParam();
        if (bffSearchParam == null) {
            bffSearchParam = "";
        }
        List<String> searchParams = toSearchParams(bffSearchParam);
        List<BffCommonCategory> subNodes = bffCommonCategory.getSubNodes();
        List<ProductCategory> domain = subNodes != null ? toDomain(subNodes, aVar, J0) : null;
        if (domain == null) {
            domain = CollectionsKt__CollectionsKt.m40441E();
        }
        List<ProductCategory> list = domain;
        String picturePath = bffCommonCategory.getPicturePath();
        if (picturePath == null) {
            str3 = "";
        } else {
            str3 = picturePath;
        }
        String bffType = bffCommonCategory.getBffType();
        if (bffType == null || (categoryType = CategoryType.f95615a.mo117278a(bffType)) == null) {
            categoryType = CategoryType.OTHERS;
        }
        return new ProductCategory(bffId, str, i2, str2, str3, categoryType, searchParams, list, J0);
    }

    @C12579k
    public static final List<ProductCategory> toDomain(@C12579k List<BffCommonCategory> list, @C12579k C28646a aVar, @C12579k Map<Integer, String> map) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "parsingErrorReporter");
        Intrinsics.checkNotNullParameter(map, "categoryNamesByLevel");
        ArrayList arrayList = new ArrayList();
        for (BffCommonCategory domain : list) {
            ProductCategory domain2 = toDomain(domain, aVar, map);
            if (domain2 != null) {
                arrayList.add(domain2);
            }
        }
        return arrayList;
    }

    @C12579k
    public static final List<ConsentOptIn> toDomain(@C12579k BffConsentsResponse bffConsentsResponse) {
        List<BffConsent> consents;
        Intrinsics.checkNotNullParameter(bffConsentsResponse, "<this>");
        ArrayList arrayList = new ArrayList();
        BffConsentsResponseData data = bffConsentsResponse.getData();
        if (!(data == null || (consents = data.getConsents()) == null)) {
            for (BffConsent bffConsent : consents) {
                List<BffConsentOptIn> optIns = bffConsent.getOptIns();
                if (optIns != null) {
                    for (BffConsentOptIn domain : optIns) {
                        ConsentOptIn domain2 = toDomain(domain, bffConsent.getType());
                        if (domain2 != null) {
                            arrayList.add(domain2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @C12580l
    public static final ConsentOptIn toDomain(@C12579k BffConsentOptIn bffConsentOptIn, @C12580l BffConsentType bffConsentType) {
        ConsentName domain;
        ChoiceOptIn choiceOptIn;
        Intrinsics.checkNotNullParameter(bffConsentOptIn, "<this>");
        ConsentOptIn consentOptIn = null;
        if (!(bffConsentOptIn.getName() == null || bffConsentType == null)) {
            String choice = bffConsentOptIn.getChoice();
            if (!(choice == null || C11622t.isBlank(choice)) && (domain = toDomain(bffConsentOptIn.getName(), bffConsentType)) != null) {
                if (Intrinsics.areEqual((Object) bffConsentOptIn.getChoice(), (Object) "1")) {
                    choiceOptIn = ChoiceOptIn.ACCEPTED;
                } else {
                    choiceOptIn = ChoiceOptIn.REFUSED;
                }
                consentOptIn = new ConsentOptIn(domain, choiceOptIn, false, 4, (DefaultConstructorMarker) null);
            }
        }
        return consentOptIn;
    }

    @C12580l
    public static final ConsentName toDomain(@C12579k BffConsentOptInName bffConsentOptInName, @C12579k BffConsentType bffConsentType) {
        Intrinsics.checkNotNullParameter(bffConsentOptInName, "<this>");
        Intrinsics.checkNotNullParameter(bffConsentType, "consentType");
        int i = WhenMappings.$EnumSwitchMapping$4[bffConsentType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    int i2 = WhenMappings.$EnumSwitchMapping$3[bffConsentOptInName.ordinal()];
                    if (i2 == 3) {
                        return ConsentName.CGU_CLIENT;
                    }
                    if (i2 == 4) {
                        return ConsentName.DATA_NO_CARD;
                    }
                    if (i2 == 5) {
                        return ConsentName.DATA_CARD;
                    }
                    if (i2 == 6) {
                        return ConsentName.OPTIN_CARREFOUR_PERSONALIZED_ADVERTISING;
                    }
                    if (i2 != 7) {
                        return null;
                    }
                    return ConsentName.OPTIN_PARTNER_PERSONALIZED_ADVERTISING;
                } else if (i == 4) {
                    switch (WhenMappings.$EnumSwitchMapping$3[bffConsentOptInName.ordinal()]) {
                        case 8:
                            return ConsentName.OPTIN_FID_EMAIL;
                        case 9:
                            return ConsentName.OPTIN_FID_SMS;
                        case 10:
                            return ConsentName.OPTIN_FID_POST;
                        case 11:
                            return ConsentName.OPTIN_FID_CARREFOUR_GROUP;
                        case 12:
                            return ConsentName.OPTIN_FID_TIERS;
                        default:
                            return null;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (WhenMappings.$EnumSwitchMapping$3[bffConsentOptInName.ordinal()] == 2) {
                return ConsentName.OPTIN_CARREFOUR_SMS;
            } else {
                return null;
            }
        } else if (WhenMappings.$EnumSwitchMapping$3[bffConsentOptInName.ordinal()] == 1) {
            return ConsentName.OPTIN_CARREFOUR_EMAIL;
        } else {
            return null;
        }
    }

    @C12579k
    public static final DeliveryFee toDomain(@C12579k BffDeliveryFee bffDeliveryFee) {
        DeliveryFee.FeeAmount feeAmount;
        DeliveryFee.FeeAmount feeAmount2;
        DeliveryFee.FeeAmount feeAmount3;
        Intrinsics.checkNotNullParameter(bffDeliveryFee, "<this>");
        BffMoney minAmount = bffDeliveryFee.getMinAmount();
        String str = "";
        if (minAmount != null) {
            int g = C28746b0.m119036g(minAmount.getScale());
            int c = (int) C28750d0.m119041c(minAmount.getUnscaledAmount());
            String currency = minAmount.getCurrency();
            if (currency == null) {
                currency = str;
            }
            feeAmount = new DeliveryFee.FeeAmount(c, g, currency);
        } else {
            feeAmount = null;
        }
        BffMoney maxAmount = bffDeliveryFee.getMaxAmount();
        if (maxAmount != null) {
            int g2 = C28746b0.m119036g(maxAmount.getScale());
            int c2 = (int) C28750d0.m119041c(maxAmount.getUnscaledAmount());
            String currency2 = maxAmount.getCurrency();
            if (currency2 == null) {
                currency2 = str;
            }
            feeAmount2 = new DeliveryFee.FeeAmount(c2, g2, currency2);
        } else {
            feeAmount2 = null;
        }
        BffMoney feesAmount = bffDeliveryFee.getFeesAmount();
        if (feesAmount != null) {
            int g3 = C28746b0.m119036g(feesAmount.getScale());
            int c3 = (int) C28750d0.m119041c(feesAmount.getUnscaledAmount());
            String currency3 = feesAmount.getCurrency();
            if (currency3 != null) {
                str = currency3;
            }
            feeAmount3 = new DeliveryFee.FeeAmount(c3, g3, str);
        } else {
            feeAmount3 = null;
        }
        return new DeliveryFee((DeliveryFee.FeeType) null, feeAmount, feeAmount2, feeAmount3, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012b  */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.carrefour.fid.android.domain.models.service.models.StoreService toDomain(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility r32) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = r32.getId()
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0011
            r4 = r2
            goto L_0x0012
        L_0x0011:
            r4 = r0
        L_0x0012:
            java.lang.String r0 = r32.getName()
            if (r0 != 0) goto L_0x001a
            r5 = r2
            goto L_0x001b
        L_0x001a:
            r5 = r0
        L_0x001b:
            java.lang.String r0 = r32.getLabel()
            if (r0 != 0) goto L_0x0023
            r6 = r2
            goto L_0x0024
        L_0x0023:
            r6 = r0
        L_0x0024:
            java.util.List r7 = r32.getPassDays()
            java.lang.String r0 = r32.getWording()
            if (r0 != 0) goto L_0x0030
            r8 = r2
            goto L_0x0031
        L_0x0030:
            r8 = r0
        L_0x0031:
            java.lang.String r0 = r32.getDescription()
            if (r0 != 0) goto L_0x0039
            r9 = r2
            goto L_0x003a
        L_0x0039:
            r9 = r0
        L_0x003a:
            java.lang.String r0 = r32.getWeight()
            if (r0 != 0) goto L_0x0042
            r10 = r2
            goto L_0x0043
        L_0x0042:
            r10 = r0
        L_0x0043:
            java.lang.String r0 = r32.getCategory()
            if (r0 != 0) goto L_0x004b
            r11 = r2
            goto L_0x004c
        L_0x004b:
            r11 = r0
        L_0x004c:
            java.lang.String r0 = r32.getStatus()
            r3 = 0
            if (r0 == 0) goto L_0x006a
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r12)
            java.lang.String r12 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r12)
            if (r0 == 0) goto L_0x006a
            r12 = 2
            r13 = 0
            java.lang.String r14 = "open"
            boolean r0 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r14, (boolean) r3, (int) r12, (java.lang.Object) r13)
            r12 = r0
            goto L_0x006b
        L_0x006a:
            r12 = r3
        L_0x006b:
            java.lang.String r0 = r32.getType()
            if (r0 != 0) goto L_0x0073
            r13 = r2
            goto L_0x0074
        L_0x0073:
            r13 = r0
        L_0x0074:
            java.lang.String r0 = r32.getStoreFormat()
            if (r0 != 0) goto L_0x007c
            r14 = r2
            goto L_0x007d
        L_0x007c:
            r14 = r0
        L_0x007d:
            java.lang.String r0 = r32.getWlecService()
            if (r0 != 0) goto L_0x0085
            r15 = r2
            goto L_0x0086
        L_0x0085:
            r15 = r0
        L_0x0086:
            java.lang.String r0 = r32.getFacilityServiceId()
            if (r0 != 0) goto L_0x008f
            r16 = r2
            goto L_0x0091
        L_0x008f:
            r16 = r0
        L_0x0091:
            java.lang.String r0 = r32.getMinefiCode()
            if (r0 != 0) goto L_0x009a
            r17 = r2
            goto L_0x009c
        L_0x009a:
            r17 = r0
        L_0x009c:
            java.lang.String r0 = r32.getMetiReference()
            if (r0 != 0) goto L_0x00a5
            r18 = r2
            goto L_0x00a7
        L_0x00a5:
            r18 = r0
        L_0x00a7:
            java.lang.String r0 = r32.getOpeningDate()
            if (r0 != 0) goto L_0x00b0
            r19 = r2
            goto L_0x00b2
        L_0x00b0:
            r19 = r0
        L_0x00b2:
            java.lang.String r20 = ""
            java.math.BigDecimal r0 = r32.getMinOrderAmount()
            java.lang.String r21 = java.lang.String.valueOf(r0)
            java.lang.Boolean r0 = r32.getPaymentOnSiteActivated()
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.booleanValue()
            r22 = r0
            goto L_0x00cb
        L_0x00c9:
            r22 = r3
        L_0x00cb:
            java.lang.Boolean r0 = r32.isEWalletLoyaltyActivated()
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r0.booleanValue()
            r23 = r0
            goto L_0x00da
        L_0x00d8:
            r23 = r3
        L_0x00da:
            boolean r24 = r32.getReturnableShoppingBag()
            java.lang.Boolean r0 = r32.getYieldEligible()
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r0.booleanValue()
            r25 = r0
            goto L_0x00ed
        L_0x00eb:
            r25 = r3
        L_0x00ed:
            java.lang.String r0 = r32.getId()
            if (r0 != 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r2 = r0
        L_0x00f5:
            com.carrefour.fid.android.domain.models.service.models.StoreServiceType r26 = getStoreServiceTypeFromId(r2)
            r27 = 0
            r28 = 0
            java.util.List r0 = r32.getDeliveryFees()
            if (r0 == 0) goto L_0x012b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C10978t.m41495Y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0114:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0128
            java.lang.Object r2 = r0.next()
            com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeliveryFee r2 = (com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeliveryFee) r2
            com.carrefour.fid.android.domain.models.service.models.DeliveryFee r2 = toDomain((com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDeliveryFee) r2)
            r1.add(r2)
            goto L_0x0114
        L_0x0128:
            r29 = r1
            goto L_0x0131
        L_0x012b:
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            r29 = r0
        L_0x0131:
            r30 = 25165824(0x1800000, float:4.7019774E-38)
            r31 = 0
            com.carrefour.fid.android.domain.models.service.models.StoreService r0 = new com.carrefour.fid.android.domain.models.service.models.StoreService
            r3 = r0
            r3.<init>((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.util.List) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (boolean) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (boolean) r22, (boolean) r23, (boolean) r24, (boolean) r25, (com.carrefour.fid.android.domain.models.service.models.StoreServiceType) r26, (boolean) r27, (boolean) r28, (java.util.List) r29, (int) r30, (kotlin.jvm.internal.DefaultConstructorMarker) r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.mapper.BffSharedMapperKt.toDomain(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonDetailedFacility):com.carrefour.fid.android.domain.models.service.models.StoreService");
    }
}
