package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import androidx.compose.runtime.C8698y1;
import com.google.gson.annotations.C33608c;
import com.urbanairship.util.C9647e0;
import java.util.Date;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\be\b\b\u0018\u00002\u00020\u0001B»\u0003\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u00103J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0003HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010HJ\u000b\u0010e\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0003HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010$HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010$HÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010HJ\u0010\u0010|\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010HJ\u000b\u0010}\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010>J\f\u0010\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003JÆ\u0003\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010$2\n\b\u0002\u00100\u001a\u0004\u0018\u00010$2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0003\u0010\u0001J\u0015\u0010\u0001\u001a\u00020\r2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0001\u001a\u00020\u0017HÖ\u0001J\n\u0010\u0001\u001a\u00020\bHÖ\u0001R\u0018\u0010/\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010?\u001a\u0004\b\f\u0010>R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0018\u00100\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00105R\u001a\u00101\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00107R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bK\u0010HR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00107R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00107R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001a\u00102\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\n\n\u0002\u0010I\u001a\u0004\bT\u0010HR\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00105R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00105R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00105R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00105R\u0018\u0010)\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00105R\u0018\u0010-\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00105R\u0018\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00105R\u0018\u0010*\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00105R\u0018\u0010+\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00105R\u0018\u0010,\u001a\u0004\u0018\u00010$8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u00105R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010:¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketResponse;", "", "discounts", "", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketDiscountResponse;", "errorMessages", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketErrorResponse;", "facilityServiceId", "", "freeShipping", "freeShippingAmount", "id", "isFullNonFood", "", "lastModified", "Ljava/util/Date;", "loyaltyAdvantages", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketLoyaltyAdvantageResponse;", "loyaltyCard", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketLoyaltyCardResponse;", "offers", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketOfferResponse;", "offersCount", "", "passCard", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketPassCard;", "pickingEligibility", "serviceType", "services", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketServiceInfo;", "shippingTypes", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketShippingType;", "slotInfo", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketSlotResponse;", "storeId", "storeRemainedAmount", "Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "totalBundleDiscountAmount", "totalCouponAmount", "totalDiscountCodeAmount", "totalMonetaryAmountIncludingTaxes", "totalInflatedMonetaryAmountIncludingTaxes", "totalOffersMonetaryAmount", "totalServiceAmount", "totalSimpleDiscountAmount", "totalLoyaltyAmount", "type", "amountToNextDeliveryThreshold", "nextThresholdDeliveryAmount", "nextThresholdDeliveryLevel", "stampsCount", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketLoyaltyAdvantageResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketLoyaltyCardResponse;Ljava/util/List;Ljava/lang/Integer;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketPassCard;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketSlotResponse;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAmountToNextDeliveryThreshold", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;", "getDiscounts", "()Ljava/util/List;", "getErrorMessages", "getFacilityServiceId", "()Ljava/lang/String;", "getFreeShipping", "getFreeShippingAmount", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastModified", "()Ljava/util/Date;", "getLoyaltyAdvantages", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketLoyaltyAdvantageResponse;", "getLoyaltyCard", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketLoyaltyCardResponse;", "getNextThresholdDeliveryAmount", "getNextThresholdDeliveryLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffers", "getOffersCount", "getPassCard", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketPassCard;", "getPickingEligibility", "getServiceType", "getServices", "getShippingTypes", "getSlotInfo", "()Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketSlotResponse;", "getStampsCount", "getStoreId", "getStoreRemainedAmount", "getTotalBundleDiscountAmount", "getTotalCouponAmount", "getTotalDiscountCodeAmount", "getTotalInflatedMonetaryAmountIncludingTaxes", "getTotalLoyaltyAmount", "getTotalMonetaryAmountIncludingTaxes", "getTotalOffersMonetaryAmount", "getTotalServiceAmount", "getTotalSimpleDiscountAmount", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketLoyaltyAdvantageResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketLoyaltyCardResponse;Ljava/util/List;Ljava/lang/Integer;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketPassCard;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketSlotResponse;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/String;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketAmountResponse;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketResponse;", "equals", "other", "hashCode", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketResponse */
public final class BasketResponse {
    @C33608c("amount_to_next_delivery_threshold")
    @C12580l
    private final BasketAmountResponse amountToNextDeliveryThreshold;
    @C33608c("discounts")
    @C12580l
    private final List<BasketDiscountResponse> discounts;
    @C33608c("error_messages")
    @C12580l
    private final List<BasketErrorResponse> errorMessages;
    @C33608c("facility_service_id")
    @C12580l
    private final String facilityServiceId;
    @C33608c("free_shipping")
    @C12580l
    private final String freeShipping;
    @C33608c("free_shipping_amount")
    @C12580l
    private final String freeShippingAmount;
    @C33608c("id")
    @C12580l

    /* renamed from: id */
    private final String f33836id;
    @C33608c("is_full_non_food")
    @C12580l
    private final Boolean isFullNonFood;
    @C33608c("last_modified")
    @C12580l
    private final Date lastModified;
    @C33608c("loyalty_advantages")
    @C12580l
    private final BasketLoyaltyAdvantageResponse loyaltyAdvantages;
    @C33608c("loyalty_card")
    @C12580l
    private final BasketLoyaltyCardResponse loyaltyCard;
    @C33608c("next_threshold_delivery_amount")
    @C12580l
    private final BasketAmountResponse nextThresholdDeliveryAmount;
    @C33608c("next_threshold_delivery_level")
    @C12580l
    private final Integer nextThresholdDeliveryLevel;
    @C33608c("offers")
    @C12580l
    private final List<BasketOfferResponse> offers;
    @C33608c("offers_count")
    @C12580l
    private final Integer offersCount;
    @C33608c("pass_card")
    @C12580l
    private final BasketPassCard passCard;
    @C33608c("picking_eligibility")
    @C12580l
    private final String pickingEligibility;
    @C33608c("service_type")
    @C12580l
    private final String serviceType;
    @C33608c("services")
    @C12580l
    private final List<BasketServiceInfo> services;
    @C33608c("shipping_types")
    @C12580l
    private final List<BasketShippingType> shippingTypes;
    @C33608c("slot_info")
    @C12580l
    private final BasketSlotResponse slotInfo;
    @C33608c("stamps_count")
    @C12580l
    private final Integer stampsCount;
    @C33608c("store_id")
    @C12580l
    private final String storeId;
    @C33608c("store_remained_amount")
    @C12580l
    private final BasketAmountResponse storeRemainedAmount;
    @C33608c("total_bundle_discount_amount")
    @C12580l
    private final BasketAmountResponse totalBundleDiscountAmount;
    @C33608c("total_coupon_amount")
    @C12580l
    private final BasketAmountResponse totalCouponAmount;
    @C33608c("total_discount_code_amount")
    @C12580l
    private final BasketAmountResponse totalDiscountCodeAmount;
    @C33608c("total_inflated_monetary_amount_including_taxes")
    @C12580l
    private final BasketAmountResponse totalInflatedMonetaryAmountIncludingTaxes;
    @C33608c("total_loyalty_amount")
    @C12580l
    private final BasketAmountResponse totalLoyaltyAmount;
    @C33608c("total_monetary_amount_including_taxes")
    @C12580l
    private final BasketAmountResponse totalMonetaryAmountIncludingTaxes;
    @C33608c("total_offers_monetary_amount")
    @C12580l
    private final BasketAmountResponse totalOffersMonetaryAmount;
    @C33608c("total_service_amount")
    @C12580l
    private final BasketAmountResponse totalServiceAmount;
    @C33608c("total_simple_discount_amount")
    @C12580l
    private final BasketAmountResponse totalSimpleDiscountAmount;
    @C33608c("type")
    @C12580l
    private final String type;

    public BasketResponse() {
        this((List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Date) null, (BasketLoyaltyAdvantageResponse) null, (BasketLoyaltyCardResponse) null, (List) null, (Integer) null, (BasketPassCard) null, (String) null, (String) null, (List) null, (List) null, (BasketSlotResponse) null, (String) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (String) null, (BasketAmountResponse) null, (BasketAmountResponse) null, (Integer) null, (Integer) null, -1, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BasketResponse copy$default(BasketResponse basketResponse, List list, List list2, String str, String str2, String str3, String str4, Boolean bool, Date date, BasketLoyaltyAdvantageResponse basketLoyaltyAdvantageResponse, BasketLoyaltyCardResponse basketLoyaltyCardResponse, List list3, Integer num, BasketPassCard basketPassCard, String str5, String str6, List list4, List list5, BasketSlotResponse basketSlotResponse, String str7, BasketAmountResponse basketAmountResponse, BasketAmountResponse basketAmountResponse2, BasketAmountResponse basketAmountResponse3, BasketAmountResponse basketAmountResponse4, BasketAmountResponse basketAmountResponse5, BasketAmountResponse basketAmountResponse6, BasketAmountResponse basketAmountResponse7, BasketAmountResponse basketAmountResponse8, BasketAmountResponse basketAmountResponse9, BasketAmountResponse basketAmountResponse10, String str8, BasketAmountResponse basketAmountResponse11, BasketAmountResponse basketAmountResponse12, Integer num2, Integer num3, int i, int i2, Object obj) {
        BasketResponse basketResponse2 = basketResponse;
        int i3 = i;
        return basketResponse.copy((i3 & 1) != 0 ? basketResponse2.discounts : list, (i3 & 2) != 0 ? basketResponse2.errorMessages : list2, (i3 & 4) != 0 ? basketResponse2.facilityServiceId : str, (i3 & 8) != 0 ? basketResponse2.freeShipping : str2, (i3 & 16) != 0 ? basketResponse2.freeShippingAmount : str3, (i3 & 32) != 0 ? basketResponse2.f33836id : str4, (i3 & 64) != 0 ? basketResponse2.isFullNonFood : bool, (i3 & 128) != 0 ? basketResponse2.lastModified : date, (i3 & 256) != 0 ? basketResponse2.loyaltyAdvantages : basketLoyaltyAdvantageResponse, (i3 & 512) != 0 ? basketResponse2.loyaltyCard : basketLoyaltyCardResponse, (i3 & 1024) != 0 ? basketResponse2.offers : list3, (i3 & 2048) != 0 ? basketResponse2.offersCount : num, (i3 & 4096) != 0 ? basketResponse2.passCard : basketPassCard, (i3 & 8192) != 0 ? basketResponse2.pickingEligibility : str5, (i3 & 16384) != 0 ? basketResponse2.serviceType : str6, (i3 & 32768) != 0 ? basketResponse2.services : list4, (i3 & 65536) != 0 ? basketResponse2.shippingTypes : list5, (i3 & 131072) != 0 ? basketResponse2.slotInfo : basketSlotResponse, (i3 & 262144) != 0 ? basketResponse2.storeId : str7, (i3 & 524288) != 0 ? basketResponse2.storeRemainedAmount : basketAmountResponse, (i3 & 1048576) != 0 ? basketResponse2.totalBundleDiscountAmount : basketAmountResponse2, (i3 & 2097152) != 0 ? basketResponse2.totalCouponAmount : basketAmountResponse3, (i3 & 4194304) != 0 ? basketResponse2.totalDiscountCodeAmount : basketAmountResponse4, (i3 & 8388608) != 0 ? basketResponse2.totalMonetaryAmountIncludingTaxes : basketAmountResponse5, (i3 & 16777216) != 0 ? basketResponse2.totalInflatedMonetaryAmountIncludingTaxes : basketAmountResponse6, (i3 & C9647e0.f26435a) != 0 ? basketResponse2.totalOffersMonetaryAmount : basketAmountResponse7, (i3 & C8698y1.f23302n) != 0 ? basketResponse2.totalServiceAmount : basketAmountResponse8, (i3 & C8698y1.f23301m) != 0 ? basketResponse2.totalSimpleDiscountAmount : basketAmountResponse9, (i3 & 268435456) != 0 ? basketResponse2.totalLoyaltyAmount : basketAmountResponse10, (i3 & 536870912) != 0 ? basketResponse2.type : str8, (i3 & 1073741824) != 0 ? basketResponse2.amountToNextDeliveryThreshold : basketAmountResponse11, (i3 & Integer.MIN_VALUE) != 0 ? basketResponse2.nextThresholdDeliveryAmount : basketAmountResponse12, (i2 & 1) != 0 ? basketResponse2.nextThresholdDeliveryLevel : num2, (i2 & 2) != 0 ? basketResponse2.stampsCount : num3);
    }

    @C12580l
    public final List<BasketDiscountResponse> component1() {
        return this.discounts;
    }

    @C12580l
    public final BasketLoyaltyCardResponse component10() {
        return this.loyaltyCard;
    }

    @C12580l
    public final List<BasketOfferResponse> component11() {
        return this.offers;
    }

    @C12580l
    public final Integer component12() {
        return this.offersCount;
    }

    @C12580l
    public final BasketPassCard component13() {
        return this.passCard;
    }

    @C12580l
    public final String component14() {
        return this.pickingEligibility;
    }

    @C12580l
    public final String component15() {
        return this.serviceType;
    }

    @C12580l
    public final List<BasketServiceInfo> component16() {
        return this.services;
    }

    @C12580l
    public final List<BasketShippingType> component17() {
        return this.shippingTypes;
    }

    @C12580l
    public final BasketSlotResponse component18() {
        return this.slotInfo;
    }

    @C12580l
    public final String component19() {
        return this.storeId;
    }

    @C12580l
    public final List<BasketErrorResponse> component2() {
        return this.errorMessages;
    }

    @C12580l
    public final BasketAmountResponse component20() {
        return this.storeRemainedAmount;
    }

    @C12580l
    public final BasketAmountResponse component21() {
        return this.totalBundleDiscountAmount;
    }

    @C12580l
    public final BasketAmountResponse component22() {
        return this.totalCouponAmount;
    }

    @C12580l
    public final BasketAmountResponse component23() {
        return this.totalDiscountCodeAmount;
    }

    @C12580l
    public final BasketAmountResponse component24() {
        return this.totalMonetaryAmountIncludingTaxes;
    }

    @C12580l
    public final BasketAmountResponse component25() {
        return this.totalInflatedMonetaryAmountIncludingTaxes;
    }

    @C12580l
    public final BasketAmountResponse component26() {
        return this.totalOffersMonetaryAmount;
    }

    @C12580l
    public final BasketAmountResponse component27() {
        return this.totalServiceAmount;
    }

    @C12580l
    public final BasketAmountResponse component28() {
        return this.totalSimpleDiscountAmount;
    }

    @C12580l
    public final BasketAmountResponse component29() {
        return this.totalLoyaltyAmount;
    }

    @C12580l
    public final String component3() {
        return this.facilityServiceId;
    }

    @C12580l
    public final String component30() {
        return this.type;
    }

    @C12580l
    public final BasketAmountResponse component31() {
        return this.amountToNextDeliveryThreshold;
    }

    @C12580l
    public final BasketAmountResponse component32() {
        return this.nextThresholdDeliveryAmount;
    }

    @C12580l
    public final Integer component33() {
        return this.nextThresholdDeliveryLevel;
    }

    @C12580l
    public final Integer component34() {
        return this.stampsCount;
    }

    @C12580l
    public final String component4() {
        return this.freeShipping;
    }

    @C12580l
    public final String component5() {
        return this.freeShippingAmount;
    }

    @C12580l
    public final String component6() {
        return this.f33836id;
    }

    @C12580l
    public final Boolean component7() {
        return this.isFullNonFood;
    }

    @C12580l
    public final Date component8() {
        return this.lastModified;
    }

    @C12580l
    public final BasketLoyaltyAdvantageResponse component9() {
        return this.loyaltyAdvantages;
    }

    @C12579k
    public final BasketResponse copy(@C12580l List<BasketDiscountResponse> list, @C12580l List<BasketErrorResponse> list2, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l Boolean bool, @C12580l Date date, @C12580l BasketLoyaltyAdvantageResponse basketLoyaltyAdvantageResponse, @C12580l BasketLoyaltyCardResponse basketLoyaltyCardResponse, @C12580l List<BasketOfferResponse> list3, @C12580l Integer num, @C12580l BasketPassCard basketPassCard, @C12580l String str5, @C12580l String str6, @C12580l List<BasketServiceInfo> list4, @C12580l List<BasketShippingType> list5, @C12580l BasketSlotResponse basketSlotResponse, @C12580l String str7, @C12580l BasketAmountResponse basketAmountResponse, @C12580l BasketAmountResponse basketAmountResponse2, @C12580l BasketAmountResponse basketAmountResponse3, @C12580l BasketAmountResponse basketAmountResponse4, @C12580l BasketAmountResponse basketAmountResponse5, @C12580l BasketAmountResponse basketAmountResponse6, @C12580l BasketAmountResponse basketAmountResponse7, @C12580l BasketAmountResponse basketAmountResponse8, @C12580l BasketAmountResponse basketAmountResponse9, @C12580l BasketAmountResponse basketAmountResponse10, @C12580l String str8, @C12580l BasketAmountResponse basketAmountResponse11, @C12580l BasketAmountResponse basketAmountResponse12, @C12580l Integer num2, @C12580l Integer num3) {
        return new BasketResponse(list, list2, str, str2, str3, str4, bool, date, basketLoyaltyAdvantageResponse, basketLoyaltyCardResponse, list3, num, basketPassCard, str5, str6, list4, list5, basketSlotResponse, str7, basketAmountResponse, basketAmountResponse2, basketAmountResponse3, basketAmountResponse4, basketAmountResponse5, basketAmountResponse6, basketAmountResponse7, basketAmountResponse8, basketAmountResponse9, basketAmountResponse10, str8, basketAmountResponse11, basketAmountResponse12, num2, num3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketResponse)) {
            return false;
        }
        BasketResponse basketResponse = (BasketResponse) obj;
        return Intrinsics.areEqual((Object) this.discounts, (Object) basketResponse.discounts) && Intrinsics.areEqual((Object) this.errorMessages, (Object) basketResponse.errorMessages) && Intrinsics.areEqual((Object) this.facilityServiceId, (Object) basketResponse.facilityServiceId) && Intrinsics.areEqual((Object) this.freeShipping, (Object) basketResponse.freeShipping) && Intrinsics.areEqual((Object) this.freeShippingAmount, (Object) basketResponse.freeShippingAmount) && Intrinsics.areEqual((Object) this.f33836id, (Object) basketResponse.f33836id) && Intrinsics.areEqual((Object) this.isFullNonFood, (Object) basketResponse.isFullNonFood) && Intrinsics.areEqual((Object) this.lastModified, (Object) basketResponse.lastModified) && Intrinsics.areEqual((Object) this.loyaltyAdvantages, (Object) basketResponse.loyaltyAdvantages) && Intrinsics.areEqual((Object) this.loyaltyCard, (Object) basketResponse.loyaltyCard) && Intrinsics.areEqual((Object) this.offers, (Object) basketResponse.offers) && Intrinsics.areEqual((Object) this.offersCount, (Object) basketResponse.offersCount) && Intrinsics.areEqual((Object) this.passCard, (Object) basketResponse.passCard) && Intrinsics.areEqual((Object) this.pickingEligibility, (Object) basketResponse.pickingEligibility) && Intrinsics.areEqual((Object) this.serviceType, (Object) basketResponse.serviceType) && Intrinsics.areEqual((Object) this.services, (Object) basketResponse.services) && Intrinsics.areEqual((Object) this.shippingTypes, (Object) basketResponse.shippingTypes) && Intrinsics.areEqual((Object) this.slotInfo, (Object) basketResponse.slotInfo) && Intrinsics.areEqual((Object) this.storeId, (Object) basketResponse.storeId) && Intrinsics.areEqual((Object) this.storeRemainedAmount, (Object) basketResponse.storeRemainedAmount) && Intrinsics.areEqual((Object) this.totalBundleDiscountAmount, (Object) basketResponse.totalBundleDiscountAmount) && Intrinsics.areEqual((Object) this.totalCouponAmount, (Object) basketResponse.totalCouponAmount) && Intrinsics.areEqual((Object) this.totalDiscountCodeAmount, (Object) basketResponse.totalDiscountCodeAmount) && Intrinsics.areEqual((Object) this.totalMonetaryAmountIncludingTaxes, (Object) basketResponse.totalMonetaryAmountIncludingTaxes) && Intrinsics.areEqual((Object) this.totalInflatedMonetaryAmountIncludingTaxes, (Object) basketResponse.totalInflatedMonetaryAmountIncludingTaxes) && Intrinsics.areEqual((Object) this.totalOffersMonetaryAmount, (Object) basketResponse.totalOffersMonetaryAmount) && Intrinsics.areEqual((Object) this.totalServiceAmount, (Object) basketResponse.totalServiceAmount) && Intrinsics.areEqual((Object) this.totalSimpleDiscountAmount, (Object) basketResponse.totalSimpleDiscountAmount) && Intrinsics.areEqual((Object) this.totalLoyaltyAmount, (Object) basketResponse.totalLoyaltyAmount) && Intrinsics.areEqual((Object) this.type, (Object) basketResponse.type) && Intrinsics.areEqual((Object) this.amountToNextDeliveryThreshold, (Object) basketResponse.amountToNextDeliveryThreshold) && Intrinsics.areEqual((Object) this.nextThresholdDeliveryAmount, (Object) basketResponse.nextThresholdDeliveryAmount) && Intrinsics.areEqual((Object) this.nextThresholdDeliveryLevel, (Object) basketResponse.nextThresholdDeliveryLevel) && Intrinsics.areEqual((Object) this.stampsCount, (Object) basketResponse.stampsCount);
    }

    @C12580l
    public final BasketAmountResponse getAmountToNextDeliveryThreshold() {
        return this.amountToNextDeliveryThreshold;
    }

    @C12580l
    public final List<BasketDiscountResponse> getDiscounts() {
        return this.discounts;
    }

    @C12580l
    public final List<BasketErrorResponse> getErrorMessages() {
        return this.errorMessages;
    }

    @C12580l
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12580l
    public final String getFreeShipping() {
        return this.freeShipping;
    }

    @C12580l
    public final String getFreeShippingAmount() {
        return this.freeShippingAmount;
    }

    @C12580l
    public final String getId() {
        return this.f33836id;
    }

    @C12580l
    public final Date getLastModified() {
        return this.lastModified;
    }

    @C12580l
    public final BasketLoyaltyAdvantageResponse getLoyaltyAdvantages() {
        return this.loyaltyAdvantages;
    }

    @C12580l
    public final BasketLoyaltyCardResponse getLoyaltyCard() {
        return this.loyaltyCard;
    }

    @C12580l
    public final BasketAmountResponse getNextThresholdDeliveryAmount() {
        return this.nextThresholdDeliveryAmount;
    }

    @C12580l
    public final Integer getNextThresholdDeliveryLevel() {
        return this.nextThresholdDeliveryLevel;
    }

    @C12580l
    public final List<BasketOfferResponse> getOffers() {
        return this.offers;
    }

    @C12580l
    public final Integer getOffersCount() {
        return this.offersCount;
    }

    @C12580l
    public final BasketPassCard getPassCard() {
        return this.passCard;
    }

    @C12580l
    public final String getPickingEligibility() {
        return this.pickingEligibility;
    }

    @C12580l
    public final String getServiceType() {
        return this.serviceType;
    }

    @C12580l
    public final List<BasketServiceInfo> getServices() {
        return this.services;
    }

    @C12580l
    public final List<BasketShippingType> getShippingTypes() {
        return this.shippingTypes;
    }

    @C12580l
    public final BasketSlotResponse getSlotInfo() {
        return this.slotInfo;
    }

    @C12580l
    public final Integer getStampsCount() {
        return this.stampsCount;
    }

    @C12580l
    public final String getStoreId() {
        return this.storeId;
    }

    @C12580l
    public final BasketAmountResponse getStoreRemainedAmount() {
        return this.storeRemainedAmount;
    }

    @C12580l
    public final BasketAmountResponse getTotalBundleDiscountAmount() {
        return this.totalBundleDiscountAmount;
    }

    @C12580l
    public final BasketAmountResponse getTotalCouponAmount() {
        return this.totalCouponAmount;
    }

    @C12580l
    public final BasketAmountResponse getTotalDiscountCodeAmount() {
        return this.totalDiscountCodeAmount;
    }

    @C12580l
    public final BasketAmountResponse getTotalInflatedMonetaryAmountIncludingTaxes() {
        return this.totalInflatedMonetaryAmountIncludingTaxes;
    }

    @C12580l
    public final BasketAmountResponse getTotalLoyaltyAmount() {
        return this.totalLoyaltyAmount;
    }

    @C12580l
    public final BasketAmountResponse getTotalMonetaryAmountIncludingTaxes() {
        return this.totalMonetaryAmountIncludingTaxes;
    }

    @C12580l
    public final BasketAmountResponse getTotalOffersMonetaryAmount() {
        return this.totalOffersMonetaryAmount;
    }

    @C12580l
    public final BasketAmountResponse getTotalServiceAmount() {
        return this.totalServiceAmount;
    }

    @C12580l
    public final BasketAmountResponse getTotalSimpleDiscountAmount() {
        return this.totalSimpleDiscountAmount;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        List<BasketDiscountResponse> list = this.discounts;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<BasketErrorResponse> list2 = this.errorMessages;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.facilityServiceId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.freeShipping;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.freeShippingAmount;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f33836id;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFullNonFood;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Date date = this.lastModified;
        int hashCode8 = (hashCode7 + (date == null ? 0 : date.hashCode())) * 31;
        BasketLoyaltyAdvantageResponse basketLoyaltyAdvantageResponse = this.loyaltyAdvantages;
        int hashCode9 = (hashCode8 + (basketLoyaltyAdvantageResponse == null ? 0 : basketLoyaltyAdvantageResponse.hashCode())) * 31;
        BasketLoyaltyCardResponse basketLoyaltyCardResponse = this.loyaltyCard;
        int hashCode10 = (hashCode9 + (basketLoyaltyCardResponse == null ? 0 : basketLoyaltyCardResponse.hashCode())) * 31;
        List<BasketOfferResponse> list3 = this.offers;
        int hashCode11 = (hashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.offersCount;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        BasketPassCard basketPassCard = this.passCard;
        int hashCode13 = (hashCode12 + (basketPassCard == null ? 0 : basketPassCard.hashCode())) * 31;
        String str5 = this.pickingEligibility;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.serviceType;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<BasketServiceInfo> list4 = this.services;
        int hashCode16 = (hashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BasketShippingType> list5 = this.shippingTypes;
        int hashCode17 = (hashCode16 + (list5 == null ? 0 : list5.hashCode())) * 31;
        BasketSlotResponse basketSlotResponse = this.slotInfo;
        int hashCode18 = (hashCode17 + (basketSlotResponse == null ? 0 : basketSlotResponse.hashCode())) * 31;
        String str7 = this.storeId;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse = this.storeRemainedAmount;
        int hashCode20 = (hashCode19 + (basketAmountResponse == null ? 0 : basketAmountResponse.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse2 = this.totalBundleDiscountAmount;
        int hashCode21 = (hashCode20 + (basketAmountResponse2 == null ? 0 : basketAmountResponse2.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse3 = this.totalCouponAmount;
        int hashCode22 = (hashCode21 + (basketAmountResponse3 == null ? 0 : basketAmountResponse3.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse4 = this.totalDiscountCodeAmount;
        int hashCode23 = (hashCode22 + (basketAmountResponse4 == null ? 0 : basketAmountResponse4.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse5 = this.totalMonetaryAmountIncludingTaxes;
        int hashCode24 = (hashCode23 + (basketAmountResponse5 == null ? 0 : basketAmountResponse5.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse6 = this.totalInflatedMonetaryAmountIncludingTaxes;
        int hashCode25 = (hashCode24 + (basketAmountResponse6 == null ? 0 : basketAmountResponse6.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse7 = this.totalOffersMonetaryAmount;
        int hashCode26 = (hashCode25 + (basketAmountResponse7 == null ? 0 : basketAmountResponse7.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse8 = this.totalServiceAmount;
        int hashCode27 = (hashCode26 + (basketAmountResponse8 == null ? 0 : basketAmountResponse8.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse9 = this.totalSimpleDiscountAmount;
        int hashCode28 = (hashCode27 + (basketAmountResponse9 == null ? 0 : basketAmountResponse9.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse10 = this.totalLoyaltyAmount;
        int hashCode29 = (hashCode28 + (basketAmountResponse10 == null ? 0 : basketAmountResponse10.hashCode())) * 31;
        String str8 = this.type;
        int hashCode30 = (hashCode29 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse11 = this.amountToNextDeliveryThreshold;
        int hashCode31 = (hashCode30 + (basketAmountResponse11 == null ? 0 : basketAmountResponse11.hashCode())) * 31;
        BasketAmountResponse basketAmountResponse12 = this.nextThresholdDeliveryAmount;
        int hashCode32 = (hashCode31 + (basketAmountResponse12 == null ? 0 : basketAmountResponse12.hashCode())) * 31;
        Integer num2 = this.nextThresholdDeliveryLevel;
        int hashCode33 = (hashCode32 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.stampsCount;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode33 + i;
    }

    @C12580l
    public final Boolean isFullNonFood() {
        return this.isFullNonFood;
    }

    @C12579k
    public String toString() {
        List<BasketDiscountResponse> list = this.discounts;
        List<BasketErrorResponse> list2 = this.errorMessages;
        String str = this.facilityServiceId;
        String str2 = this.freeShipping;
        String str3 = this.freeShippingAmount;
        String str4 = this.f33836id;
        Boolean bool = this.isFullNonFood;
        Date date = this.lastModified;
        BasketLoyaltyAdvantageResponse basketLoyaltyAdvantageResponse = this.loyaltyAdvantages;
        BasketLoyaltyCardResponse basketLoyaltyCardResponse = this.loyaltyCard;
        List<BasketOfferResponse> list3 = this.offers;
        Integer num = this.offersCount;
        BasketPassCard basketPassCard = this.passCard;
        String str5 = this.pickingEligibility;
        String str6 = this.serviceType;
        List<BasketServiceInfo> list4 = this.services;
        List<BasketShippingType> list5 = this.shippingTypes;
        BasketSlotResponse basketSlotResponse = this.slotInfo;
        String str7 = this.storeId;
        BasketAmountResponse basketAmountResponse = this.storeRemainedAmount;
        BasketAmountResponse basketAmountResponse2 = this.totalBundleDiscountAmount;
        BasketAmountResponse basketAmountResponse3 = this.totalCouponAmount;
        BasketAmountResponse basketAmountResponse4 = this.totalDiscountCodeAmount;
        BasketAmountResponse basketAmountResponse5 = this.totalMonetaryAmountIncludingTaxes;
        BasketAmountResponse basketAmountResponse6 = this.totalInflatedMonetaryAmountIncludingTaxes;
        BasketAmountResponse basketAmountResponse7 = this.totalOffersMonetaryAmount;
        BasketAmountResponse basketAmountResponse8 = this.totalServiceAmount;
        BasketAmountResponse basketAmountResponse9 = this.totalSimpleDiscountAmount;
        BasketAmountResponse basketAmountResponse10 = this.totalLoyaltyAmount;
        String str8 = this.type;
        BasketAmountResponse basketAmountResponse11 = this.amountToNextDeliveryThreshold;
        BasketAmountResponse basketAmountResponse12 = this.nextThresholdDeliveryAmount;
        Integer num2 = this.nextThresholdDeliveryLevel;
        Integer num3 = this.stampsCount;
        return "BasketResponse(discounts=" + list + ", errorMessages=" + list2 + ", facilityServiceId=" + str + ", freeShipping=" + str2 + ", freeShippingAmount=" + str3 + ", id=" + str4 + ", isFullNonFood=" + bool + ", lastModified=" + date + ", loyaltyAdvantages=" + basketLoyaltyAdvantageResponse + ", loyaltyCard=" + basketLoyaltyCardResponse + ", offers=" + list3 + ", offersCount=" + num + ", passCard=" + basketPassCard + ", pickingEligibility=" + str5 + ", serviceType=" + str6 + ", services=" + list4 + ", shippingTypes=" + list5 + ", slotInfo=" + basketSlotResponse + ", storeId=" + str7 + ", storeRemainedAmount=" + basketAmountResponse + ", totalBundleDiscountAmount=" + basketAmountResponse2 + ", totalCouponAmount=" + basketAmountResponse3 + ", totalDiscountCodeAmount=" + basketAmountResponse4 + ", totalMonetaryAmountIncludingTaxes=" + basketAmountResponse5 + ", totalInflatedMonetaryAmountIncludingTaxes=" + basketAmountResponse6 + ", totalOffersMonetaryAmount=" + basketAmountResponse7 + ", totalServiceAmount=" + basketAmountResponse8 + ", totalSimpleDiscountAmount=" + basketAmountResponse9 + ", totalLoyaltyAmount=" + basketAmountResponse10 + ", type=" + str8 + ", amountToNextDeliveryThreshold=" + basketAmountResponse11 + ", nextThresholdDeliveryAmount=" + basketAmountResponse12 + ", nextThresholdDeliveryLevel=" + num2 + ", stampsCount=" + num3 + ")";
    }

    public BasketResponse(@C12580l List<BasketDiscountResponse> list, @C12580l List<BasketErrorResponse> list2, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l Boolean bool, @C12580l Date date, @C12580l BasketLoyaltyAdvantageResponse basketLoyaltyAdvantageResponse, @C12580l BasketLoyaltyCardResponse basketLoyaltyCardResponse, @C12580l List<BasketOfferResponse> list3, @C12580l Integer num, @C12580l BasketPassCard basketPassCard, @C12580l String str5, @C12580l String str6, @C12580l List<BasketServiceInfo> list4, @C12580l List<BasketShippingType> list5, @C12580l BasketSlotResponse basketSlotResponse, @C12580l String str7, @C12580l BasketAmountResponse basketAmountResponse, @C12580l BasketAmountResponse basketAmountResponse2, @C12580l BasketAmountResponse basketAmountResponse3, @C12580l BasketAmountResponse basketAmountResponse4, @C12580l BasketAmountResponse basketAmountResponse5, @C12580l BasketAmountResponse basketAmountResponse6, @C12580l BasketAmountResponse basketAmountResponse7, @C12580l BasketAmountResponse basketAmountResponse8, @C12580l BasketAmountResponse basketAmountResponse9, @C12580l BasketAmountResponse basketAmountResponse10, @C12580l String str8, @C12580l BasketAmountResponse basketAmountResponse11, @C12580l BasketAmountResponse basketAmountResponse12, @C12580l Integer num2, @C12580l Integer num3) {
        this.discounts = list;
        this.errorMessages = list2;
        this.facilityServiceId = str;
        this.freeShipping = str2;
        this.freeShippingAmount = str3;
        this.f33836id = str4;
        this.isFullNonFood = bool;
        this.lastModified = date;
        this.loyaltyAdvantages = basketLoyaltyAdvantageResponse;
        this.loyaltyCard = basketLoyaltyCardResponse;
        this.offers = list3;
        this.offersCount = num;
        this.passCard = basketPassCard;
        this.pickingEligibility = str5;
        this.serviceType = str6;
        this.services = list4;
        this.shippingTypes = list5;
        this.slotInfo = basketSlotResponse;
        this.storeId = str7;
        this.storeRemainedAmount = basketAmountResponse;
        this.totalBundleDiscountAmount = basketAmountResponse2;
        this.totalCouponAmount = basketAmountResponse3;
        this.totalDiscountCodeAmount = basketAmountResponse4;
        this.totalMonetaryAmountIncludingTaxes = basketAmountResponse5;
        this.totalInflatedMonetaryAmountIncludingTaxes = basketAmountResponse6;
        this.totalOffersMonetaryAmount = basketAmountResponse7;
        this.totalServiceAmount = basketAmountResponse8;
        this.totalSimpleDiscountAmount = basketAmountResponse9;
        this.totalLoyaltyAmount = basketAmountResponse10;
        this.type = str8;
        this.amountToNextDeliveryThreshold = basketAmountResponse11;
        this.nextThresholdDeliveryAmount = basketAmountResponse12;
        this.nextThresholdDeliveryLevel = num2;
        this.stampsCount = num3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BasketResponse(java.util.List r35, java.util.List r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.Boolean r41, java.util.Date r42, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketLoyaltyAdvantageResponse r43, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketLoyaltyCardResponse r44, java.util.List r45, java.lang.Integer r46, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketPassCard r47, java.lang.String r48, java.lang.String r49, java.util.List r50, java.util.List r51, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketSlotResponse r52, java.lang.String r53, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r54, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r55, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r56, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r57, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r58, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r59, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r60, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r61, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r62, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r63, java.lang.String r64, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r65, com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketAmountResponse r66, java.lang.Integer r67, java.lang.Integer r68, int r69, int r70, kotlin.jvm.internal.DefaultConstructorMarker r71) {
        /*
            r34 = this;
            r0 = r69
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r35
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r36
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r37
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r38
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r39
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r40
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r41
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r42
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r43
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r44
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r45
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r46
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r47
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r48
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r49
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r50
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r51
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r52
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r53
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r54
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r55
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r56
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r57
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r58
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x00e7
            r25 = 0
            goto L_0x00e9
        L_0x00e7:
            r25 = r59
        L_0x00e9:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00f2
            r26 = 0
            goto L_0x00f4
        L_0x00f2:
            r26 = r60
        L_0x00f4:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00fd
            r27 = 0
            goto L_0x00ff
        L_0x00fd:
            r27 = r61
        L_0x00ff:
            r28 = 134217728(0x8000000, float:3.85186E-34)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0108
            r28 = 0
            goto L_0x010a
        L_0x0108:
            r28 = r62
        L_0x010a:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x0113
            r29 = 0
            goto L_0x0115
        L_0x0113:
            r29 = r63
        L_0x0115:
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            r30 = r0 & r30
            if (r30 == 0) goto L_0x011e
            r30 = 0
            goto L_0x0120
        L_0x011e:
            r30 = r64
        L_0x0120:
            r31 = 1073741824(0x40000000, float:2.0)
            r31 = r0 & r31
            if (r31 == 0) goto L_0x0129
            r31 = 0
            goto L_0x012b
        L_0x0129:
            r31 = r65
        L_0x012b:
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r32
            if (r0 == 0) goto L_0x0133
            r0 = 0
            goto L_0x0135
        L_0x0133:
            r0 = r66
        L_0x0135:
            r32 = r70 & 1
            if (r32 == 0) goto L_0x013c
            r32 = 0
            goto L_0x013e
        L_0x013c:
            r32 = r67
        L_0x013e:
            r33 = r70 & 2
            if (r33 == 0) goto L_0x0145
            r33 = 0
            goto L_0x0147
        L_0x0145:
            r33 = r68
        L_0x0147:
            r35 = r34
            r36 = r1
            r37 = r3
            r38 = r4
            r39 = r5
            r40 = r6
            r41 = r7
            r42 = r8
            r43 = r9
            r44 = r10
            r45 = r11
            r46 = r12
            r47 = r13
            r48 = r14
            r49 = r15
            r50 = r2
            r51 = r16
            r52 = r17
            r53 = r18
            r54 = r19
            r55 = r20
            r56 = r21
            r57 = r22
            r58 = r23
            r59 = r24
            r60 = r25
            r61 = r26
            r62 = r27
            r63 = r28
            r64 = r29
            r65 = r30
            r66 = r31
            r67 = r0
            r68 = r32
            r69 = r33
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketResponse.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.Date, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketLoyaltyAdvantageResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketLoyaltyCardResponse, java.util.List, java.lang.Integer, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketPassCard, java.lang.String, java.lang.String, java.util.List, java.util.List, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketSlotResponse, java.lang.String, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, java.lang.String, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketAmountResponse, java.lang.Integer, java.lang.Integer, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
