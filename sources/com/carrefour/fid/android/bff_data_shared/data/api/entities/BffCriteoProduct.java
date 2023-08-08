package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 \u00012\u00020\u0001:\u0004\u0001\u0001B³\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b~\u0010BË\u0002\b\u0017\u0012\u0007\u0010\u0001\u001a\u00020\"\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010=\u001a\u0004\u0018\u00010\"\u0012\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0005\b~\u0010\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003J\u0012\u0010#\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\b#\u0010$J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J¼\u0002\u0010?\u001a\u00020\u00002\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b?\u0010@J\t\u0010A\u001a\u00020\tHÖ\u0001J\t\u0010B\u001a\u00020\"HÖ\u0001J\u0013\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010F\u0012\u0004\bI\u0010J\u001a\u0004\bG\u0010HR\"\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010F\u0012\u0004\bL\u0010J\u001a\u0004\bK\u0010HR\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010F\u0012\u0004\bN\u0010J\u001a\u0004\bM\u0010HR\"\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010F\u0012\u0004\bP\u0010J\u001a\u0004\bO\u0010HR\"\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010F\u0012\u0004\bR\u0010J\u001a\u0004\bQ\u0010HR\"\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010F\u0012\u0004\bT\u0010J\u001a\u0004\bS\u0010HR\"\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010F\u0012\u0004\bV\u0010J\u001a\u0004\bU\u0010HR\"\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010F\u0012\u0004\bX\u0010J\u001a\u0004\bW\u0010HR\"\u0010.\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010F\u0012\u0004\bZ\u0010J\u001a\u0004\bY\u0010HR\"\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010F\u0012\u0004\b\\\u0010J\u001a\u0004\b[\u0010HR\"\u00100\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010F\u0012\u0004\b^\u0010J\u001a\u0004\b]\u0010HR\"\u00101\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010F\u0012\u0004\b`\u0010J\u001a\u0004\b_\u0010HR\"\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010F\u0012\u0004\bb\u0010J\u001a\u0004\ba\u0010HR\"\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010F\u0012\u0004\bd\u0010J\u001a\u0004\bc\u0010HR\"\u00104\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010F\u0012\u0004\bf\u0010J\u001a\u0004\be\u0010HR\"\u00105\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010F\u0012\u0004\bh\u0010J\u001a\u0004\bg\u0010HR\"\u00106\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010F\u0012\u0004\bj\u0010J\u001a\u0004\bi\u0010HR\"\u00107\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010F\u0012\u0004\bl\u0010J\u001a\u0004\bk\u0010HR\"\u00108\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010F\u0012\u0004\bn\u0010J\u001a\u0004\bm\u0010HR\"\u00109\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010F\u0012\u0004\bp\u0010J\u001a\u0004\bo\u0010HR\"\u0010:\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010F\u0012\u0004\br\u0010J\u001a\u0004\bq\u0010HR\"\u0010;\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010F\u0012\u0004\bt\u0010J\u001a\u0004\bs\u0010HR\"\u0010<\u001a\u0004\u0018\u00010 8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010u\u0012\u0004\bx\u0010J\u001a\u0004\bv\u0010wR\"\u0010=\u001a\u0004\u0018\u00010\"8\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010y\u0012\u0004\b{\u0010J\u001a\u0004\bz\u0010$R\"\u0010>\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010F\u0012\u0004\b}\u0010J\u001a\u0004\b|\u0010H¨\u0006\u0001"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoProduct;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "component23", "", "component24", "()Ljava/lang/Integer;", "component25", "productName", "productId", "image", "rating", "price", "comparePrice", "shipping", "promoText", "parentSku", "clientAdvertiserId", "advertiserId", "renderingAttributes", "onLoadBeacon", "onViewBeacon", "onClickBeacon", "onFileClickBeacon", "onBasketChangeBeacon", "onWishlistBeacon", "onVideoBeacon", "productPage", "onAvailabilityUpdate", "lineItemID", "bffProduct", "bffPosition", "bffButtonName", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;Ljava/lang/Integer;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoProduct;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "getProductName$annotations", "()V", "getProductId", "getProductId$annotations", "getImage", "getImage$annotations", "getRating", "getRating$annotations", "getPrice", "getPrice$annotations", "getComparePrice", "getComparePrice$annotations", "getShipping", "getShipping$annotations", "getPromoText", "getPromoText$annotations", "getParentSku", "getParentSku$annotations", "getClientAdvertiserId", "getClientAdvertiserId$annotations", "getAdvertiserId", "getAdvertiserId$annotations", "getRenderingAttributes", "getRenderingAttributes$annotations", "getOnLoadBeacon", "getOnLoadBeacon$annotations", "getOnViewBeacon", "getOnViewBeacon$annotations", "getOnClickBeacon", "getOnClickBeacon$annotations", "getOnFileClickBeacon", "getOnFileClickBeacon$annotations", "getOnBasketChangeBeacon", "getOnBasketChangeBeacon$annotations", "getOnWishlistBeacon", "getOnWishlistBeacon$annotations", "getOnVideoBeacon", "getOnVideoBeacon$annotations", "getProductPage", "getProductPage$annotations", "getOnAvailabilityUpdate", "getOnAvailabilityUpdate$annotations", "getLineItemID", "getLineItemID$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "getBffProduct", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;", "getBffProduct$annotations", "Ljava/lang/Integer;", "getBffPosition", "getBffPosition$annotations", "getBffButtonName", "getBffButtonName$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;Ljava/lang/Integer;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonProduct;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCriteoProduct {
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String advertiserId;
    @C12580l
    private final String bffButtonName;
    @C12580l
    private final Integer bffPosition;
    @C12580l
    private final BffCommonProduct bffProduct;
    @C12580l
    private final String clientAdvertiserId;
    @C12580l
    private final String comparePrice;
    @C12580l
    private final String image;
    @C12580l
    private final String lineItemID;
    @C12580l
    private final String onAvailabilityUpdate;
    @C12580l
    private final String onBasketChangeBeacon;
    @C12580l
    private final String onClickBeacon;
    @C12580l
    private final String onFileClickBeacon;
    @C12580l
    private final String onLoadBeacon;
    @C12580l
    private final String onVideoBeacon;
    @C12580l
    private final String onViewBeacon;
    @C12580l
    private final String onWishlistBeacon;
    @C12580l
    private final String parentSku;
    @C12580l
    private final String price;
    @C12580l
    private final String productId;
    @C12580l
    private final String productName;
    @C12580l
    private final String productPage;
    @C12580l
    private final String promoText;
    @C12580l
    private final String rating;
    @C12580l
    private final String renderingAttributes;
    @C12580l
    private final String shipping;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoProduct$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCriteoProduct;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCriteoProduct> serializer() {
            return BffCriteoProduct$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffCriteoProduct() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BffCommonProduct) null, (Integer) null, (String) null, 33554431, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCriteoProduct copy$default(BffCriteoProduct bffCriteoProduct, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, BffCommonProduct bffCommonProduct, Integer num, String str23, int i, Object obj) {
        BffCriteoProduct bffCriteoProduct2 = bffCriteoProduct;
        int i2 = i;
        return bffCriteoProduct.copy((i2 & 1) != 0 ? bffCriteoProduct2.productName : str, (i2 & 2) != 0 ? bffCriteoProduct2.productId : str2, (i2 & 4) != 0 ? bffCriteoProduct2.image : str3, (i2 & 8) != 0 ? bffCriteoProduct2.rating : str4, (i2 & 16) != 0 ? bffCriteoProduct2.price : str5, (i2 & 32) != 0 ? bffCriteoProduct2.comparePrice : str6, (i2 & 64) != 0 ? bffCriteoProduct2.shipping : str7, (i2 & 128) != 0 ? bffCriteoProduct2.promoText : str8, (i2 & 256) != 0 ? bffCriteoProduct2.parentSku : str9, (i2 & 512) != 0 ? bffCriteoProduct2.clientAdvertiserId : str10, (i2 & 1024) != 0 ? bffCriteoProduct2.advertiserId : str11, (i2 & 2048) != 0 ? bffCriteoProduct2.renderingAttributes : str12, (i2 & 4096) != 0 ? bffCriteoProduct2.onLoadBeacon : str13, (i2 & 8192) != 0 ? bffCriteoProduct2.onViewBeacon : str14, (i2 & 16384) != 0 ? bffCriteoProduct2.onClickBeacon : str15, (i2 & 32768) != 0 ? bffCriteoProduct2.onFileClickBeacon : str16, (i2 & 65536) != 0 ? bffCriteoProduct2.onBasketChangeBeacon : str17, (i2 & 131072) != 0 ? bffCriteoProduct2.onWishlistBeacon : str18, (i2 & 262144) != 0 ? bffCriteoProduct2.onVideoBeacon : str19, (i2 & 524288) != 0 ? bffCriteoProduct2.productPage : str20, (i2 & 1048576) != 0 ? bffCriteoProduct2.onAvailabilityUpdate : str21, (i2 & 2097152) != 0 ? bffCriteoProduct2.lineItemID : str22, (i2 & 4194304) != 0 ? bffCriteoProduct2.bffProduct : bffCommonProduct, (i2 & 8388608) != 0 ? bffCriteoProduct2.bffPosition : num, (i2 & 16777216) != 0 ? bffCriteoProduct2.bffButtonName : str23);
    }

    @C12438n("advertiser_id")
    public static /* synthetic */ void getAdvertiserId$annotations() {
    }

    @C12438n("bff_button_name")
    public static /* synthetic */ void getBffButtonName$annotations() {
    }

    @C12438n("bff_position")
    public static /* synthetic */ void getBffPosition$annotations() {
    }

    @C12438n("bff_product")
    public static /* synthetic */ void getBffProduct$annotations() {
    }

    @C12438n("client_advertiser_id")
    public static /* synthetic */ void getClientAdvertiserId$annotations() {
    }

    @C12438n("compare_price")
    public static /* synthetic */ void getComparePrice$annotations() {
    }

    @C12438n("image")
    public static /* synthetic */ void getImage$annotations() {
    }

    @C12438n("line_item_ID")
    public static /* synthetic */ void getLineItemID$annotations() {
    }

    @C12438n("on_availability_update")
    public static /* synthetic */ void getOnAvailabilityUpdate$annotations() {
    }

    @C12438n("on_basket_change_beacon")
    public static /* synthetic */ void getOnBasketChangeBeacon$annotations() {
    }

    @C12438n("on_click_beacon")
    public static /* synthetic */ void getOnClickBeacon$annotations() {
    }

    @C12438n("on_file_click_beacon")
    public static /* synthetic */ void getOnFileClickBeacon$annotations() {
    }

    @C12438n("on_load_beacon")
    public static /* synthetic */ void getOnLoadBeacon$annotations() {
    }

    @C12438n("on_video_beacon")
    public static /* synthetic */ void getOnVideoBeacon$annotations() {
    }

    @C12438n("on_view_beacon")
    public static /* synthetic */ void getOnViewBeacon$annotations() {
    }

    @C12438n("on_wishlist_beacon")
    public static /* synthetic */ void getOnWishlistBeacon$annotations() {
    }

    @C12438n("parent_sku")
    public static /* synthetic */ void getParentSku$annotations() {
    }

    @C12438n("price")
    public static /* synthetic */ void getPrice$annotations() {
    }

    @C12438n("product_id")
    public static /* synthetic */ void getProductId$annotations() {
    }

    @C12438n("product_name")
    public static /* synthetic */ void getProductName$annotations() {
    }

    @C12438n("product_page")
    public static /* synthetic */ void getProductPage$annotations() {
    }

    @C12438n("promo_text")
    public static /* synthetic */ void getPromoText$annotations() {
    }

    @C12438n("rating")
    public static /* synthetic */ void getRating$annotations() {
    }

    @C12438n("rendering_attributes")
    public static /* synthetic */ void getRenderingAttributes$annotations() {
    }

    @C12438n("shipping")
    public static /* synthetic */ void getShipping$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCriteoProduct bffCriteoProduct, C12239d dVar, C12217f fVar) {
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCriteoProduct.productName != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffCriteoProduct.productName);
        }
        if (dVar.mo24897A(fVar, 1) || bffCriteoProduct.productId != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCriteoProduct.productId);
        }
        if (dVar.mo24897A(fVar, 2) || bffCriteoProduct.image != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffCriteoProduct.image);
        }
        if (dVar.mo24897A(fVar, 3) || bffCriteoProduct.rating != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCriteoProduct.rating);
        }
        if (dVar.mo24897A(fVar, 4) || bffCriteoProduct.price != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffCriteoProduct.price);
        }
        if (dVar.mo24897A(fVar, 5) || bffCriteoProduct.comparePrice != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffCriteoProduct.comparePrice);
        }
        if (dVar.mo24897A(fVar, 6) || bffCriteoProduct.shipping != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffCriteoProduct.shipping);
        }
        if (dVar.mo24897A(fVar, 7) || bffCriteoProduct.promoText != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffCriteoProduct.promoText);
        }
        if (dVar.mo24897A(fVar, 8) || bffCriteoProduct.parentSku != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffCriteoProduct.parentSku);
        }
        if (dVar.mo24897A(fVar, 9) || bffCriteoProduct.clientAdvertiserId != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffCriteoProduct.clientAdvertiserId);
        }
        if (dVar.mo24897A(fVar, 10) || bffCriteoProduct.advertiserId != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffCriteoProduct.advertiserId);
        }
        if (dVar.mo24897A(fVar, 11) || bffCriteoProduct.renderingAttributes != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffCriteoProduct.renderingAttributes);
        }
        if (dVar.mo24897A(fVar, 12) || bffCriteoProduct.onLoadBeacon != null) {
            dVar.mo24912i(fVar, 12, C12310s1.f30117a, bffCriteoProduct.onLoadBeacon);
        }
        if (dVar.mo24897A(fVar, 13) || bffCriteoProduct.onViewBeacon != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffCriteoProduct.onViewBeacon);
        }
        if (dVar.mo24897A(fVar, 14) || bffCriteoProduct.onClickBeacon != null) {
            dVar.mo24912i(fVar, 14, C12310s1.f30117a, bffCriteoProduct.onClickBeacon);
        }
        if (dVar.mo24897A(fVar, 15) || bffCriteoProduct.onFileClickBeacon != null) {
            dVar.mo24912i(fVar, 15, C12310s1.f30117a, bffCriteoProduct.onFileClickBeacon);
        }
        if (dVar.mo24897A(fVar, 16) || bffCriteoProduct.onBasketChangeBeacon != null) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffCriteoProduct.onBasketChangeBeacon);
        }
        if (dVar.mo24897A(fVar, 17) || bffCriteoProduct.onWishlistBeacon != null) {
            dVar.mo24912i(fVar, 17, C12310s1.f30117a, bffCriteoProduct.onWishlistBeacon);
        }
        if (dVar.mo24897A(fVar, 18) || bffCriteoProduct.onVideoBeacon != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffCriteoProduct.onVideoBeacon);
        }
        if (dVar.mo24897A(fVar, 19) || bffCriteoProduct.productPage != null) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffCriteoProduct.productPage);
        }
        if (dVar.mo24897A(fVar, 20) || bffCriteoProduct.onAvailabilityUpdate != null) {
            dVar.mo24912i(fVar, 20, C12310s1.f30117a, bffCriteoProduct.onAvailabilityUpdate);
        }
        if (dVar.mo24897A(fVar, 21) || bffCriteoProduct.lineItemID != null) {
            dVar.mo24912i(fVar, 21, C12310s1.f30117a, bffCriteoProduct.lineItemID);
        }
        if (dVar.mo24897A(fVar, 22) || bffCriteoProduct.bffProduct != null) {
            dVar.mo24912i(fVar, 22, BffCommonProduct$$serializer.INSTANCE, bffCriteoProduct.bffProduct);
        }
        if (dVar.mo24897A(fVar, 23) || bffCriteoProduct.bffPosition != null) {
            dVar.mo24912i(fVar, 23, C12276h0.f30067a, bffCriteoProduct.bffPosition);
        }
        if (dVar.mo24897A(fVar, 24) || bffCriteoProduct.bffButtonName != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 24, C12310s1.f30117a, bffCriteoProduct.bffButtonName);
        }
    }

    @C12580l
    public final String component1() {
        return this.productName;
    }

    @C12580l
    public final String component10() {
        return this.clientAdvertiserId;
    }

    @C12580l
    public final String component11() {
        return this.advertiserId;
    }

    @C12580l
    public final String component12() {
        return this.renderingAttributes;
    }

    @C12580l
    public final String component13() {
        return this.onLoadBeacon;
    }

    @C12580l
    public final String component14() {
        return this.onViewBeacon;
    }

    @C12580l
    public final String component15() {
        return this.onClickBeacon;
    }

    @C12580l
    public final String component16() {
        return this.onFileClickBeacon;
    }

    @C12580l
    public final String component17() {
        return this.onBasketChangeBeacon;
    }

    @C12580l
    public final String component18() {
        return this.onWishlistBeacon;
    }

    @C12580l
    public final String component19() {
        return this.onVideoBeacon;
    }

    @C12580l
    public final String component2() {
        return this.productId;
    }

    @C12580l
    public final String component20() {
        return this.productPage;
    }

    @C12580l
    public final String component21() {
        return this.onAvailabilityUpdate;
    }

    @C12580l
    public final String component22() {
        return this.lineItemID;
    }

    @C12580l
    public final BffCommonProduct component23() {
        return this.bffProduct;
    }

    @C12580l
    public final Integer component24() {
        return this.bffPosition;
    }

    @C12580l
    public final String component25() {
        return this.bffButtonName;
    }

    @C12580l
    public final String component3() {
        return this.image;
    }

    @C12580l
    public final String component4() {
        return this.rating;
    }

    @C12580l
    public final String component5() {
        return this.price;
    }

    @C12580l
    public final String component6() {
        return this.comparePrice;
    }

    @C12580l
    public final String component7() {
        return this.shipping;
    }

    @C12580l
    public final String component8() {
        return this.promoText;
    }

    @C12580l
    public final String component9() {
        return this.parentSku;
    }

    @C12579k
    public final BffCriteoProduct copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l String str21, @C12580l String str22, @C12580l BffCommonProduct bffCommonProduct, @C12580l Integer num, @C12580l String str23) {
        return new BffCriteoProduct(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, bffCommonProduct, num, str23);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCriteoProduct)) {
            return false;
        }
        BffCriteoProduct bffCriteoProduct = (BffCriteoProduct) obj;
        return Intrinsics.areEqual((Object) this.productName, (Object) bffCriteoProduct.productName) && Intrinsics.areEqual((Object) this.productId, (Object) bffCriteoProduct.productId) && Intrinsics.areEqual((Object) this.image, (Object) bffCriteoProduct.image) && Intrinsics.areEqual((Object) this.rating, (Object) bffCriteoProduct.rating) && Intrinsics.areEqual((Object) this.price, (Object) bffCriteoProduct.price) && Intrinsics.areEqual((Object) this.comparePrice, (Object) bffCriteoProduct.comparePrice) && Intrinsics.areEqual((Object) this.shipping, (Object) bffCriteoProduct.shipping) && Intrinsics.areEqual((Object) this.promoText, (Object) bffCriteoProduct.promoText) && Intrinsics.areEqual((Object) this.parentSku, (Object) bffCriteoProduct.parentSku) && Intrinsics.areEqual((Object) this.clientAdvertiserId, (Object) bffCriteoProduct.clientAdvertiserId) && Intrinsics.areEqual((Object) this.advertiserId, (Object) bffCriteoProduct.advertiserId) && Intrinsics.areEqual((Object) this.renderingAttributes, (Object) bffCriteoProduct.renderingAttributes) && Intrinsics.areEqual((Object) this.onLoadBeacon, (Object) bffCriteoProduct.onLoadBeacon) && Intrinsics.areEqual((Object) this.onViewBeacon, (Object) bffCriteoProduct.onViewBeacon) && Intrinsics.areEqual((Object) this.onClickBeacon, (Object) bffCriteoProduct.onClickBeacon) && Intrinsics.areEqual((Object) this.onFileClickBeacon, (Object) bffCriteoProduct.onFileClickBeacon) && Intrinsics.areEqual((Object) this.onBasketChangeBeacon, (Object) bffCriteoProduct.onBasketChangeBeacon) && Intrinsics.areEqual((Object) this.onWishlistBeacon, (Object) bffCriteoProduct.onWishlistBeacon) && Intrinsics.areEqual((Object) this.onVideoBeacon, (Object) bffCriteoProduct.onVideoBeacon) && Intrinsics.areEqual((Object) this.productPage, (Object) bffCriteoProduct.productPage) && Intrinsics.areEqual((Object) this.onAvailabilityUpdate, (Object) bffCriteoProduct.onAvailabilityUpdate) && Intrinsics.areEqual((Object) this.lineItemID, (Object) bffCriteoProduct.lineItemID) && Intrinsics.areEqual((Object) this.bffProduct, (Object) bffCriteoProduct.bffProduct) && Intrinsics.areEqual((Object) this.bffPosition, (Object) bffCriteoProduct.bffPosition) && Intrinsics.areEqual((Object) this.bffButtonName, (Object) bffCriteoProduct.bffButtonName);
    }

    @C12580l
    public final String getAdvertiserId() {
        return this.advertiserId;
    }

    @C12580l
    public final String getBffButtonName() {
        return this.bffButtonName;
    }

    @C12580l
    public final Integer getBffPosition() {
        return this.bffPosition;
    }

    @C12580l
    public final BffCommonProduct getBffProduct() {
        return this.bffProduct;
    }

    @C12580l
    public final String getClientAdvertiserId() {
        return this.clientAdvertiserId;
    }

    @C12580l
    public final String getComparePrice() {
        return this.comparePrice;
    }

    @C12580l
    public final String getImage() {
        return this.image;
    }

    @C12580l
    public final String getLineItemID() {
        return this.lineItemID;
    }

    @C12580l
    public final String getOnAvailabilityUpdate() {
        return this.onAvailabilityUpdate;
    }

    @C12580l
    public final String getOnBasketChangeBeacon() {
        return this.onBasketChangeBeacon;
    }

    @C12580l
    public final String getOnClickBeacon() {
        return this.onClickBeacon;
    }

    @C12580l
    public final String getOnFileClickBeacon() {
        return this.onFileClickBeacon;
    }

    @C12580l
    public final String getOnLoadBeacon() {
        return this.onLoadBeacon;
    }

    @C12580l
    public final String getOnVideoBeacon() {
        return this.onVideoBeacon;
    }

    @C12580l
    public final String getOnViewBeacon() {
        return this.onViewBeacon;
    }

    @C12580l
    public final String getOnWishlistBeacon() {
        return this.onWishlistBeacon;
    }

    @C12580l
    public final String getParentSku() {
        return this.parentSku;
    }

    @C12580l
    public final String getPrice() {
        return this.price;
    }

    @C12580l
    public final String getProductId() {
        return this.productId;
    }

    @C12580l
    public final String getProductName() {
        return this.productName;
    }

    @C12580l
    public final String getProductPage() {
        return this.productPage;
    }

    @C12580l
    public final String getPromoText() {
        return this.promoText;
    }

    @C12580l
    public final String getRating() {
        return this.rating;
    }

    @C12580l
    public final String getRenderingAttributes() {
        return this.renderingAttributes;
    }

    @C12580l
    public final String getShipping() {
        return this.shipping;
    }

    public int hashCode() {
        String str = this.productName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rating;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.price;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.comparePrice;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shipping;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.promoText;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.parentSku;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.clientAdvertiserId;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.advertiserId;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.renderingAttributes;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.onLoadBeacon;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.onViewBeacon;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.onClickBeacon;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.onFileClickBeacon;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.onBasketChangeBeacon;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.onWishlistBeacon;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.onVideoBeacon;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.productPage;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.onAvailabilityUpdate;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.lineItemID;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        BffCommonProduct bffCommonProduct = this.bffProduct;
        int hashCode23 = (hashCode22 + (bffCommonProduct == null ? 0 : bffCommonProduct.hashCode())) * 31;
        Integer num = this.bffPosition;
        int hashCode24 = (hashCode23 + (num == null ? 0 : num.hashCode())) * 31;
        String str23 = this.bffButtonName;
        if (str23 != null) {
            i = str23.hashCode();
        }
        return hashCode24 + i;
    }

    @C12579k
    public String toString() {
        String str = this.productName;
        String str2 = this.productId;
        String str3 = this.image;
        String str4 = this.rating;
        String str5 = this.price;
        String str6 = this.comparePrice;
        String str7 = this.shipping;
        String str8 = this.promoText;
        String str9 = this.parentSku;
        String str10 = this.clientAdvertiserId;
        String str11 = this.advertiserId;
        String str12 = this.renderingAttributes;
        String str13 = this.onLoadBeacon;
        String str14 = this.onViewBeacon;
        String str15 = this.onClickBeacon;
        String str16 = this.onFileClickBeacon;
        String str17 = this.onBasketChangeBeacon;
        String str18 = this.onWishlistBeacon;
        String str19 = this.onVideoBeacon;
        String str20 = this.productPage;
        String str21 = this.onAvailabilityUpdate;
        String str22 = this.lineItemID;
        BffCommonProduct bffCommonProduct = this.bffProduct;
        Integer num = this.bffPosition;
        String str23 = this.bffButtonName;
        return "BffCriteoProduct(productName=" + str + ", productId=" + str2 + ", image=" + str3 + ", rating=" + str4 + ", price=" + str5 + ", comparePrice=" + str6 + ", shipping=" + str7 + ", promoText=" + str8 + ", parentSku=" + str9 + ", clientAdvertiserId=" + str10 + ", advertiserId=" + str11 + ", renderingAttributes=" + str12 + ", onLoadBeacon=" + str13 + ", onViewBeacon=" + str14 + ", onClickBeacon=" + str15 + ", onFileClickBeacon=" + str16 + ", onBasketChangeBeacon=" + str17 + ", onWishlistBeacon=" + str18 + ", onVideoBeacon=" + str19 + ", productPage=" + str20 + ", onAvailabilityUpdate=" + str21 + ", lineItemID=" + str22 + ", bffProduct=" + bffCommonProduct + ", bffPosition=" + num + ", bffButtonName=" + str23 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCriteoProduct(int i, @C12438n("product_name") String str, @C12438n("product_id") String str2, @C12438n("image") String str3, @C12438n("rating") String str4, @C12438n("price") String str5, @C12438n("compare_price") String str6, @C12438n("shipping") String str7, @C12438n("promo_text") String str8, @C12438n("parent_sku") String str9, @C12438n("client_advertiser_id") String str10, @C12438n("advertiser_id") String str11, @C12438n("rendering_attributes") String str12, @C12438n("on_load_beacon") String str13, @C12438n("on_view_beacon") String str14, @C12438n("on_click_beacon") String str15, @C12438n("on_file_click_beacon") String str16, @C12438n("on_basket_change_beacon") String str17, @C12438n("on_wishlist_beacon") String str18, @C12438n("on_video_beacon") String str19, @C12438n("product_page") String str20, @C12438n("on_availability_update") String str21, @C12438n("line_item_ID") String str22, @C12438n("bff_product") BffCommonProduct bffCommonProduct, @C12438n("bff_position") Integer num, @C12438n("bff_button_name") String str23, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCriteoProduct$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.productName = null;
        } else {
            this.productName = str;
        }
        if ((i2 & 2) == 0) {
            this.productId = null;
        } else {
            this.productId = str2;
        }
        if ((i2 & 4) == 0) {
            this.image = null;
        } else {
            this.image = str3;
        }
        if ((i2 & 8) == 0) {
            this.rating = null;
        } else {
            this.rating = str4;
        }
        if ((i2 & 16) == 0) {
            this.price = null;
        } else {
            this.price = str5;
        }
        if ((i2 & 32) == 0) {
            this.comparePrice = null;
        } else {
            this.comparePrice = str6;
        }
        if ((i2 & 64) == 0) {
            this.shipping = null;
        } else {
            this.shipping = str7;
        }
        if ((i2 & 128) == 0) {
            this.promoText = null;
        } else {
            this.promoText = str8;
        }
        if ((i2 & 256) == 0) {
            this.parentSku = null;
        } else {
            this.parentSku = str9;
        }
        if ((i2 & 512) == 0) {
            this.clientAdvertiserId = null;
        } else {
            this.clientAdvertiserId = str10;
        }
        if ((i2 & 1024) == 0) {
            this.advertiserId = null;
        } else {
            this.advertiserId = str11;
        }
        if ((i2 & 2048) == 0) {
            this.renderingAttributes = null;
        } else {
            this.renderingAttributes = str12;
        }
        if ((i2 & 4096) == 0) {
            this.onLoadBeacon = null;
        } else {
            this.onLoadBeacon = str13;
        }
        if ((i2 & 8192) == 0) {
            this.onViewBeacon = null;
        } else {
            this.onViewBeacon = str14;
        }
        if ((i2 & 16384) == 0) {
            this.onClickBeacon = null;
        } else {
            this.onClickBeacon = str15;
        }
        if ((32768 & i2) == 0) {
            this.onFileClickBeacon = null;
        } else {
            this.onFileClickBeacon = str16;
        }
        if ((65536 & i2) == 0) {
            this.onBasketChangeBeacon = null;
        } else {
            this.onBasketChangeBeacon = str17;
        }
        if ((131072 & i2) == 0) {
            this.onWishlistBeacon = null;
        } else {
            this.onWishlistBeacon = str18;
        }
        if ((262144 & i2) == 0) {
            this.onVideoBeacon = null;
        } else {
            this.onVideoBeacon = str19;
        }
        if ((524288 & i2) == 0) {
            this.productPage = null;
        } else {
            this.productPage = str20;
        }
        if ((1048576 & i2) == 0) {
            this.onAvailabilityUpdate = null;
        } else {
            this.onAvailabilityUpdate = str21;
        }
        if ((2097152 & i2) == 0) {
            this.lineItemID = null;
        } else {
            this.lineItemID = str22;
        }
        if ((4194304 & i2) == 0) {
            this.bffProduct = null;
        } else {
            this.bffProduct = bffCommonProduct;
        }
        if ((8388608 & i2) == 0) {
            this.bffPosition = null;
        } else {
            this.bffPosition = num;
        }
        if ((i2 & 16777216) == 0) {
            this.bffButtonName = null;
        } else {
            this.bffButtonName = str23;
        }
    }

    public BffCriteoProduct(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l String str16, @C12580l String str17, @C12580l String str18, @C12580l String str19, @C12580l String str20, @C12580l String str21, @C12580l String str22, @C12580l BffCommonProduct bffCommonProduct, @C12580l Integer num, @C12580l String str23) {
        this.productName = str;
        this.productId = str2;
        this.image = str3;
        this.rating = str4;
        this.price = str5;
        this.comparePrice = str6;
        this.shipping = str7;
        this.promoText = str8;
        this.parentSku = str9;
        this.clientAdvertiserId = str10;
        this.advertiserId = str11;
        this.renderingAttributes = str12;
        this.onLoadBeacon = str13;
        this.onViewBeacon = str14;
        this.onClickBeacon = str15;
        this.onFileClickBeacon = str16;
        this.onBasketChangeBeacon = str17;
        this.onWishlistBeacon = str18;
        this.onVideoBeacon = str19;
        this.productPage = str20;
        this.onAvailabilityUpdate = str21;
        this.lineItemID = str22;
        this.bffProduct = bffCommonProduct;
        this.bffPosition = num;
        this.bffButtonName = str23;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCriteoProduct(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct r49, java.lang.Integer r50, java.lang.String r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
        /*
            r26 = this;
            r0 = r52
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r27
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r28
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r29
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r30
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r31
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r32
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r33
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r34
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r35
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r36
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r37
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r38
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r39
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r40
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r41
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r42
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r43
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r44
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r45
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r46
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r47
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r48
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r49
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00dc
            r24 = 0
            goto L_0x00de
        L_0x00dc:
            r24 = r50
        L_0x00de:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r0 = r0 & r25
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e8
        L_0x00e6:
            r0 = r51
        L_0x00e8:
            r27 = r26
            r28 = r1
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            r34 = r8
            r35 = r9
            r36 = r10
            r37 = r11
            r38 = r12
            r39 = r13
            r40 = r14
            r41 = r15
            r42 = r2
            r43 = r16
            r44 = r17
            r45 = r18
            r46 = r19
            r47 = r20
            r48 = r21
            r49 = r22
            r50 = r23
            r51 = r24
            r52 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCriteoProduct.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonProduct, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
