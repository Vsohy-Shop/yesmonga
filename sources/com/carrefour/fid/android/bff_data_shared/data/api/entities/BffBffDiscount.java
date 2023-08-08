package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u0000 t2\u00020\u0001:\u0003utvB\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b\u0012\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001b¢\u0006\u0004\bn\u0010oB\u0002\b\u0017\u0012\u0006\u0010p\u001a\u00020\u000e\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0001\u00102\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0001\u00106\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b\u0012\u0010\b\u0001\u00107\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b\u0012\u0010\b\u0001\u00108\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001b\u0012\b\u0010r\u001a\u0004\u0018\u00010q¢\u0006\u0004\bn\u0010sJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0012\u0010 \u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bHÆ\u0003J\u0002\u00109\u001a\u00020\u00002\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b2\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b2\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b9\u0010:J\t\u0010;\u001a\u00020\u000bHÖ\u0001J\t\u0010<\u001a\u00020\u000eHÖ\u0001J\u0013\u0010>\u001a\u00020\u00172\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010?\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\"\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010D\u0012\u0004\bG\u0010C\u001a\u0004\bE\u0010FR\"\u0010(\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010D\u0012\u0004\bI\u0010C\u001a\u0004\bH\u0010FR\"\u0010)\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010J\u0012\u0004\bL\u0010C\u001a\u0004\bK\u0010\u0010R\"\u0010*\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010J\u0012\u0004\bN\u0010C\u001a\u0004\bM\u0010\u0010R\"\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010J\u0012\u0004\bP\u0010C\u001a\u0004\bO\u0010\u0010R\"\u0010,\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010J\u0012\u0004\bR\u0010C\u001a\u0004\bQ\u0010\u0010R\"\u0010-\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010J\u0012\u0004\bT\u0010C\u001a\u0004\bS\u0010\u0010R\"\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010D\u0012\u0004\bV\u0010C\u001a\u0004\bU\u0010FR\"\u0010/\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010D\u0012\u0004\bX\u0010C\u001a\u0004\bW\u0010FR\"\u00100\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010Y\u0012\u0004\b[\u0010C\u001a\u0004\bZ\u0010\u0019R\"\u00101\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010Y\u0012\u0004\b]\u0010C\u001a\u0004\b\\\u0010\u0019R(\u00102\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010^\u0012\u0004\ba\u0010C\u001a\u0004\b_\u0010`R\"\u00103\u001a\u0004\u0018\u00010\u001e8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010b\u0012\u0004\be\u0010C\u001a\u0004\bc\u0010dR\"\u00104\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010Y\u0012\u0004\bf\u0010C\u001a\u0004\b4\u0010\u0019R\"\u00105\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010Y\u0012\u0004\bg\u0010C\u001a\u0004\b5\u0010\u0019R(\u00106\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010^\u0012\u0004\bi\u0010C\u001a\u0004\bh\u0010`R(\u00107\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010^\u0012\u0004\bk\u0010C\u001a\u0004\bj\u0010`R(\u00108\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001b8\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010^\u0012\u0004\bm\u0010C\u001a\u0004\bl\u0010`¨\u0006w"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;", "component1", "", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "component9", "component10", "", "component11", "()Ljava/lang/Boolean;", "component12", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeals;", "component13", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "component14", "component15", "component16", "component17", "component18", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBundle;", "component19", "type", "label", "bffDiscountLabel", "bufferPromo", "bffDisplayPrice", "forcedPrice", "displayPrice", "startingPrice", "startDate", "endDate", "bffIsMixed", "bffIsBundle", "deals", "limit", "isDisplayedAsPromo", "isPromotion", "store", "gtins", "bundle", "copy", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;", "toString", "hashCode", "other", "equals", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;", "getType", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;", "getType$annotations", "()V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getLabel$annotations", "getBffDiscountLabel", "getBffDiscountLabel$annotations", "Ljava/lang/Integer;", "getBufferPromo", "getBufferPromo$annotations", "getBffDisplayPrice", "getBffDisplayPrice$annotations", "getForcedPrice", "getForcedPrice$annotations", "getDisplayPrice", "getDisplayPrice$annotations", "getStartingPrice", "getStartingPrice$annotations", "getStartDate", "getStartDate$annotations", "getEndDate", "getEndDate$annotations", "Ljava/lang/Boolean;", "getBffIsMixed", "getBffIsMixed$annotations", "getBffIsBundle", "getBffIsBundle$annotations", "Ljava/util/List;", "getDeals", "()Ljava/util/List;", "getDeals$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "getLimit", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "getLimit$annotations", "isDisplayedAsPromo$annotations", "isPromotion$annotations", "getStore", "getStore$annotations", "getGtins", "getGtins$annotations", "getBundle", "getBundle$annotations", "<init>", "(Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "Type", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffBffDiscount {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String bffDiscountLabel;
    @C12580l
    private final Integer bffDisplayPrice;
    @C12580l
    private final Boolean bffIsBundle;
    @C12580l
    private final Boolean bffIsMixed;
    @C12580l
    private final Integer bufferPromo;
    @C12580l
    private final List<BffBundle> bundle;
    @C12580l
    private final List<BffDeals> deals;
    @C12580l
    private final Integer displayPrice;
    @C12580l
    private final String endDate;
    @C12580l
    private final Integer forcedPrice;
    @C12580l
    private final List<String> gtins;
    @C12580l
    private final Boolean isDisplayedAsPromo;
    @C12580l
    private final Boolean isPromotion;
    @C12580l
    private final String label;
    @C12580l
    private final BffLimit limit;
    @C12580l
    private final String startDate;
    @C12580l
    private final Integer startingPrice;
    @C12580l
    private final List<String> store;
    @C12580l
    private final Type type;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffBffDiscount> serializer() {
            return BffBffDiscount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C12439o
    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\r\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "promo", "ri", "rd", "pf", "ta", "uNKNOWN", "$serializer", "Companion", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public enum Type {
        promo("promo"),
        ri("ri"),
        rd("rd"),
        pf("pf"),
        ta("ta"),
        uNKNOWN("UNKNOWN");
        
        /* access modifiers changed from: private */
        @C12579k
        public static final C11677z<C12248g<Object>> $cachedSerializer$delegate = null;
        @C12579k
        public static final Companion Companion = null;
        @C12579k
        private final String value;

        @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBffDiscount$Type;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C12248g get$cachedSerializer() {
                return (C12248g) Type.$cachedSerializer$delegate.getValue();
            }

            @C12579k
            public final C12248g<Type> serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C10864b0.m38747b(LazyThreadSafetyMode.PUBLICATION, Companion.C393551.INSTANCE);
        }

        private Type(String str) {
            this.value = str;
        }

        @C12579k
        public final String getValue() {
            return this.value;
        }
    }

    static {
        C12310s1 s1Var = C12310s1.f30117a;
        $childSerializers = new C12248g[]{null, null, null, null, null, null, null, null, null, null, null, null, new C12269f(BffDeals$$serializer.INSTANCE), null, null, null, new C12269f(s1Var), new C12269f(s1Var), new C12269f(BffBundle$$serializer.INSTANCE)};
    }

    public BffBffDiscount() {
        this((Type) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (List) null, (BffLimit) null, (Boolean) null, (Boolean) null, (List) null, (List) null, (List) null, 524287, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffBffDiscount copy$default(BffBffDiscount bffBffDiscount, Type type2, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str3, String str4, Boolean bool, Boolean bool2, List list, BffLimit bffLimit, Boolean bool3, Boolean bool4, List list2, List list3, List list4, int i, Object obj) {
        BffBffDiscount bffBffDiscount2 = bffBffDiscount;
        int i2 = i;
        return bffBffDiscount.copy((i2 & 1) != 0 ? bffBffDiscount2.type : type2, (i2 & 2) != 0 ? bffBffDiscount2.label : str, (i2 & 4) != 0 ? bffBffDiscount2.bffDiscountLabel : str2, (i2 & 8) != 0 ? bffBffDiscount2.bufferPromo : num, (i2 & 16) != 0 ? bffBffDiscount2.bffDisplayPrice : num2, (i2 & 32) != 0 ? bffBffDiscount2.forcedPrice : num3, (i2 & 64) != 0 ? bffBffDiscount2.displayPrice : num4, (i2 & 128) != 0 ? bffBffDiscount2.startingPrice : num5, (i2 & 256) != 0 ? bffBffDiscount2.startDate : str3, (i2 & 512) != 0 ? bffBffDiscount2.endDate : str4, (i2 & 1024) != 0 ? bffBffDiscount2.bffIsMixed : bool, (i2 & 2048) != 0 ? bffBffDiscount2.bffIsBundle : bool2, (i2 & 4096) != 0 ? bffBffDiscount2.deals : list, (i2 & 8192) != 0 ? bffBffDiscount2.limit : bffLimit, (i2 & 16384) != 0 ? bffBffDiscount2.isDisplayedAsPromo : bool3, (i2 & 32768) != 0 ? bffBffDiscount2.isPromotion : bool4, (i2 & 65536) != 0 ? bffBffDiscount2.store : list2, (i2 & 131072) != 0 ? bffBffDiscount2.gtins : list3, (i2 & 262144) != 0 ? bffBffDiscount2.bundle : list4);
    }

    @C12438n("bff_discount_label")
    public static /* synthetic */ void getBffDiscountLabel$annotations() {
    }

    @C12438n("bff_display_price")
    public static /* synthetic */ void getBffDisplayPrice$annotations() {
    }

    @C12438n("bff_is_bundle")
    public static /* synthetic */ void getBffIsBundle$annotations() {
    }

    @C12438n("bff_is_mixed")
    public static /* synthetic */ void getBffIsMixed$annotations() {
    }

    @C12438n("buffer_promo")
    public static /* synthetic */ void getBufferPromo$annotations() {
    }

    @C12438n("bundle")
    public static /* synthetic */ void getBundle$annotations() {
    }

    @C12438n("deals")
    public static /* synthetic */ void getDeals$annotations() {
    }

    @C12438n("display_price")
    public static /* synthetic */ void getDisplayPrice$annotations() {
    }

    @C12438n("end_date")
    public static /* synthetic */ void getEndDate$annotations() {
    }

    @C12438n("forced_price")
    public static /* synthetic */ void getForcedPrice$annotations() {
    }

    @C12438n("gtins")
    public static /* synthetic */ void getGtins$annotations() {
    }

    @C12438n("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @C12438n("limit")
    public static /* synthetic */ void getLimit$annotations() {
    }

    @C12438n("start_date")
    public static /* synthetic */ void getStartDate$annotations() {
    }

    @C12438n("starting_price")
    public static /* synthetic */ void getStartingPrice$annotations() {
    }

    @C12438n("store")
    public static /* synthetic */ void getStore$annotations() {
    }

    @C12438n("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @C12438n("is_displayed_as_promo")
    public static /* synthetic */ void isDisplayedAsPromo$annotations() {
    }

    @C12438n("is_promotion")
    public static /* synthetic */ void isPromotion$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffBffDiscount bffBffDiscount, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffBffDiscount.type != null) {
            dVar.mo24912i(fVar, 0, BffBffDiscount$Type$$serializer.INSTANCE, bffBffDiscount.type);
        }
        if (dVar.mo24897A(fVar, 1) || bffBffDiscount.label != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffBffDiscount.label);
        }
        if (dVar.mo24897A(fVar, 2) || bffBffDiscount.bffDiscountLabel != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffBffDiscount.bffDiscountLabel);
        }
        if (dVar.mo24897A(fVar, 3) || bffBffDiscount.bufferPromo != null) {
            dVar.mo24912i(fVar, 3, C12276h0.f30067a, bffBffDiscount.bufferPromo);
        }
        if (dVar.mo24897A(fVar, 4) || bffBffDiscount.bffDisplayPrice != null) {
            dVar.mo24912i(fVar, 4, C12276h0.f30067a, bffBffDiscount.bffDisplayPrice);
        }
        if (dVar.mo24897A(fVar, 5) || bffBffDiscount.forcedPrice != null) {
            dVar.mo24912i(fVar, 5, C12276h0.f30067a, bffBffDiscount.forcedPrice);
        }
        if (dVar.mo24897A(fVar, 6) || bffBffDiscount.displayPrice != null) {
            dVar.mo24912i(fVar, 6, C12276h0.f30067a, bffBffDiscount.displayPrice);
        }
        if (dVar.mo24897A(fVar, 7) || bffBffDiscount.startingPrice != null) {
            dVar.mo24912i(fVar, 7, C12276h0.f30067a, bffBffDiscount.startingPrice);
        }
        if (dVar.mo24897A(fVar, 8) || bffBffDiscount.startDate != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffBffDiscount.startDate);
        }
        if (dVar.mo24897A(fVar, 9) || bffBffDiscount.endDate != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffBffDiscount.endDate);
        }
        if (dVar.mo24897A(fVar, 10) || bffBffDiscount.bffIsMixed != null) {
            dVar.mo24912i(fVar, 10, C12278i.f30070a, bffBffDiscount.bffIsMixed);
        }
        if (dVar.mo24897A(fVar, 11) || bffBffDiscount.bffIsBundle != null) {
            dVar.mo24912i(fVar, 11, C12278i.f30070a, bffBffDiscount.bffIsBundle);
        }
        if (dVar.mo24897A(fVar, 12) || bffBffDiscount.deals != null) {
            dVar.mo24912i(fVar, 12, gVarArr[12], bffBffDiscount.deals);
        }
        if (dVar.mo24897A(fVar, 13) || bffBffDiscount.limit != null) {
            dVar.mo24912i(fVar, 13, BffLimit$$serializer.INSTANCE, bffBffDiscount.limit);
        }
        if (dVar.mo24897A(fVar, 14) || bffBffDiscount.isDisplayedAsPromo != null) {
            dVar.mo24912i(fVar, 14, C12278i.f30070a, bffBffDiscount.isDisplayedAsPromo);
        }
        if (dVar.mo24897A(fVar, 15) || bffBffDiscount.isPromotion != null) {
            dVar.mo24912i(fVar, 15, C12278i.f30070a, bffBffDiscount.isPromotion);
        }
        if (dVar.mo24897A(fVar, 16) || bffBffDiscount.store != null) {
            dVar.mo24912i(fVar, 16, gVarArr[16], bffBffDiscount.store);
        }
        if (dVar.mo24897A(fVar, 17) || bffBffDiscount.gtins != null) {
            dVar.mo24912i(fVar, 17, gVarArr[17], bffBffDiscount.gtins);
        }
        if (dVar.mo24897A(fVar, 18) || bffBffDiscount.bundle != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 18, gVarArr[18], bffBffDiscount.bundle);
        }
    }

    @C12580l
    public final Type component1() {
        return this.type;
    }

    @C12580l
    public final String component10() {
        return this.endDate;
    }

    @C12580l
    public final Boolean component11() {
        return this.bffIsMixed;
    }

    @C12580l
    public final Boolean component12() {
        return this.bffIsBundle;
    }

    @C12580l
    public final List<BffDeals> component13() {
        return this.deals;
    }

    @C12580l
    public final BffLimit component14() {
        return this.limit;
    }

    @C12580l
    public final Boolean component15() {
        return this.isDisplayedAsPromo;
    }

    @C12580l
    public final Boolean component16() {
        return this.isPromotion;
    }

    @C12580l
    public final List<String> component17() {
        return this.store;
    }

    @C12580l
    public final List<String> component18() {
        return this.gtins;
    }

    @C12580l
    public final List<BffBundle> component19() {
        return this.bundle;
    }

    @C12580l
    public final String component2() {
        return this.label;
    }

    @C12580l
    public final String component3() {
        return this.bffDiscountLabel;
    }

    @C12580l
    public final Integer component4() {
        return this.bufferPromo;
    }

    @C12580l
    public final Integer component5() {
        return this.bffDisplayPrice;
    }

    @C12580l
    public final Integer component6() {
        return this.forcedPrice;
    }

    @C12580l
    public final Integer component7() {
        return this.displayPrice;
    }

    @C12580l
    public final Integer component8() {
        return this.startingPrice;
    }

    @C12580l
    public final String component9() {
        return this.startDate;
    }

    @C12579k
    public final BffBffDiscount copy(@C12580l Type type2, @C12580l String str, @C12580l String str2, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4, @C12580l Integer num5, @C12580l String str3, @C12580l String str4, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l List<BffDeals> list, @C12580l BffLimit bffLimit, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l List<String> list2, @C12580l List<String> list3, @C12580l List<BffBundle> list4) {
        return new BffBffDiscount(type2, str, str2, num, num2, num3, num4, num5, str3, str4, bool, bool2, list, bffLimit, bool3, bool4, list2, list3, list4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffBffDiscount)) {
            return false;
        }
        BffBffDiscount bffBffDiscount = (BffBffDiscount) obj;
        return this.type == bffBffDiscount.type && Intrinsics.areEqual((Object) this.label, (Object) bffBffDiscount.label) && Intrinsics.areEqual((Object) this.bffDiscountLabel, (Object) bffBffDiscount.bffDiscountLabel) && Intrinsics.areEqual((Object) this.bufferPromo, (Object) bffBffDiscount.bufferPromo) && Intrinsics.areEqual((Object) this.bffDisplayPrice, (Object) bffBffDiscount.bffDisplayPrice) && Intrinsics.areEqual((Object) this.forcedPrice, (Object) bffBffDiscount.forcedPrice) && Intrinsics.areEqual((Object) this.displayPrice, (Object) bffBffDiscount.displayPrice) && Intrinsics.areEqual((Object) this.startingPrice, (Object) bffBffDiscount.startingPrice) && Intrinsics.areEqual((Object) this.startDate, (Object) bffBffDiscount.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) bffBffDiscount.endDate) && Intrinsics.areEqual((Object) this.bffIsMixed, (Object) bffBffDiscount.bffIsMixed) && Intrinsics.areEqual((Object) this.bffIsBundle, (Object) bffBffDiscount.bffIsBundle) && Intrinsics.areEqual((Object) this.deals, (Object) bffBffDiscount.deals) && Intrinsics.areEqual((Object) this.limit, (Object) bffBffDiscount.limit) && Intrinsics.areEqual((Object) this.isDisplayedAsPromo, (Object) bffBffDiscount.isDisplayedAsPromo) && Intrinsics.areEqual((Object) this.isPromotion, (Object) bffBffDiscount.isPromotion) && Intrinsics.areEqual((Object) this.store, (Object) bffBffDiscount.store) && Intrinsics.areEqual((Object) this.gtins, (Object) bffBffDiscount.gtins) && Intrinsics.areEqual((Object) this.bundle, (Object) bffBffDiscount.bundle);
    }

    @C12580l
    public final String getBffDiscountLabel() {
        return this.bffDiscountLabel;
    }

    @C12580l
    public final Integer getBffDisplayPrice() {
        return this.bffDisplayPrice;
    }

    @C12580l
    public final Boolean getBffIsBundle() {
        return this.bffIsBundle;
    }

    @C12580l
    public final Boolean getBffIsMixed() {
        return this.bffIsMixed;
    }

    @C12580l
    public final Integer getBufferPromo() {
        return this.bufferPromo;
    }

    @C12580l
    public final List<BffBundle> getBundle() {
        return this.bundle;
    }

    @C12580l
    public final List<BffDeals> getDeals() {
        return this.deals;
    }

    @C12580l
    public final Integer getDisplayPrice() {
        return this.displayPrice;
    }

    @C12580l
    public final String getEndDate() {
        return this.endDate;
    }

    @C12580l
    public final Integer getForcedPrice() {
        return this.forcedPrice;
    }

    @C12580l
    public final List<String> getGtins() {
        return this.gtins;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final BffLimit getLimit() {
        return this.limit;
    }

    @C12580l
    public final String getStartDate() {
        return this.startDate;
    }

    @C12580l
    public final Integer getStartingPrice() {
        return this.startingPrice;
    }

    @C12580l
    public final List<String> getStore() {
        return this.store;
    }

    @C12580l
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type2 = this.type;
        int i = 0;
        int hashCode = (type2 == null ? 0 : type2.hashCode()) * 31;
        String str = this.label;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bffDiscountLabel;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.bufferPromo;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bffDisplayPrice;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.forcedPrice;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.displayPrice;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.startingPrice;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.startDate;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endDate;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.bffIsMixed;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.bffIsBundle;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<BffDeals> list = this.deals;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        BffLimit bffLimit = this.limit;
        int hashCode14 = (hashCode13 + (bffLimit == null ? 0 : bffLimit.hashCode())) * 31;
        Boolean bool3 = this.isDisplayedAsPromo;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isPromotion;
        int hashCode16 = (hashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list2 = this.store;
        int hashCode17 = (hashCode16 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.gtins;
        int hashCode18 = (hashCode17 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BffBundle> list4 = this.bundle;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode18 + i;
    }

    @C12580l
    public final Boolean isDisplayedAsPromo() {
        return this.isDisplayedAsPromo;
    }

    @C12580l
    public final Boolean isPromotion() {
        return this.isPromotion;
    }

    @C12579k
    public String toString() {
        Type type2 = this.type;
        String str = this.label;
        String str2 = this.bffDiscountLabel;
        Integer num = this.bufferPromo;
        Integer num2 = this.bffDisplayPrice;
        Integer num3 = this.forcedPrice;
        Integer num4 = this.displayPrice;
        Integer num5 = this.startingPrice;
        String str3 = this.startDate;
        String str4 = this.endDate;
        Boolean bool = this.bffIsMixed;
        Boolean bool2 = this.bffIsBundle;
        List<BffDeals> list = this.deals;
        BffLimit bffLimit = this.limit;
        Boolean bool3 = this.isDisplayedAsPromo;
        Boolean bool4 = this.isPromotion;
        List<String> list2 = this.store;
        List<String> list3 = this.gtins;
        List<BffBundle> list4 = this.bundle;
        return "BffBffDiscount(type=" + type2 + ", label=" + str + ", bffDiscountLabel=" + str2 + ", bufferPromo=" + num + ", bffDisplayPrice=" + num2 + ", forcedPrice=" + num3 + ", displayPrice=" + num4 + ", startingPrice=" + num5 + ", startDate=" + str3 + ", endDate=" + str4 + ", bffIsMixed=" + bool + ", bffIsBundle=" + bool2 + ", deals=" + list + ", limit=" + bffLimit + ", isDisplayedAsPromo=" + bool3 + ", isPromotion=" + bool4 + ", store=" + list2 + ", gtins=" + list3 + ", bundle=" + list4 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffBffDiscount(int i, @C12438n("type") Type type2, @C12438n("label") String str, @C12438n("bff_discount_label") String str2, @C12438n("buffer_promo") Integer num, @C12438n("bff_display_price") Integer num2, @C12438n("forced_price") Integer num3, @C12438n("display_price") Integer num4, @C12438n("starting_price") Integer num5, @C12438n("start_date") String str3, @C12438n("end_date") String str4, @C12438n("bff_is_mixed") Boolean bool, @C12438n("bff_is_bundle") Boolean bool2, @C12438n("deals") List list, @C12438n("limit") BffLimit bffLimit, @C12438n("is_displayed_as_promo") Boolean bool3, @C12438n("is_promotion") Boolean bool4, @C12438n("store") List list2, @C12438n("gtins") List list3, @C12438n("bundle") List list4, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffBffDiscount$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.type = null;
        } else {
            this.type = type2;
        }
        if ((i2 & 2) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i2 & 4) == 0) {
            this.bffDiscountLabel = null;
        } else {
            this.bffDiscountLabel = str2;
        }
        if ((i2 & 8) == 0) {
            this.bufferPromo = null;
        } else {
            this.bufferPromo = num;
        }
        if ((i2 & 16) == 0) {
            this.bffDisplayPrice = null;
        } else {
            this.bffDisplayPrice = num2;
        }
        if ((i2 & 32) == 0) {
            this.forcedPrice = null;
        } else {
            this.forcedPrice = num3;
        }
        if ((i2 & 64) == 0) {
            this.displayPrice = null;
        } else {
            this.displayPrice = num4;
        }
        if ((i2 & 128) == 0) {
            this.startingPrice = null;
        } else {
            this.startingPrice = num5;
        }
        if ((i2 & 256) == 0) {
            this.startDate = null;
        } else {
            this.startDate = str3;
        }
        if ((i2 & 512) == 0) {
            this.endDate = null;
        } else {
            this.endDate = str4;
        }
        if ((i2 & 1024) == 0) {
            this.bffIsMixed = null;
        } else {
            this.bffIsMixed = bool;
        }
        if ((i2 & 2048) == 0) {
            this.bffIsBundle = null;
        } else {
            this.bffIsBundle = bool2;
        }
        if ((i2 & 4096) == 0) {
            this.deals = null;
        } else {
            this.deals = list;
        }
        if ((i2 & 8192) == 0) {
            this.limit = null;
        } else {
            this.limit = bffLimit;
        }
        if ((i2 & 16384) == 0) {
            this.isDisplayedAsPromo = null;
        } else {
            this.isDisplayedAsPromo = bool3;
        }
        if ((32768 & i2) == 0) {
            this.isPromotion = null;
        } else {
            this.isPromotion = bool4;
        }
        if ((65536 & i2) == 0) {
            this.store = null;
        } else {
            this.store = list2;
        }
        if ((131072 & i2) == 0) {
            this.gtins = null;
        } else {
            this.gtins = list3;
        }
        if ((i2 & 262144) == 0) {
            this.bundle = null;
        } else {
            this.bundle = list4;
        }
    }

    public BffBffDiscount(@C12580l Type type2, @C12580l String str, @C12580l String str2, @C12580l Integer num, @C12580l Integer num2, @C12580l Integer num3, @C12580l Integer num4, @C12580l Integer num5, @C12580l String str3, @C12580l String str4, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l List<BffDeals> list, @C12580l BffLimit bffLimit, @C12580l Boolean bool3, @C12580l Boolean bool4, @C12580l List<String> list2, @C12580l List<String> list3, @C12580l List<BffBundle> list4) {
        this.type = type2;
        this.label = str;
        this.bffDiscountLabel = str2;
        this.bufferPromo = num;
        this.bffDisplayPrice = num2;
        this.forcedPrice = num3;
        this.displayPrice = num4;
        this.startingPrice = num5;
        this.startDate = str3;
        this.endDate = str4;
        this.bffIsMixed = bool;
        this.bffIsBundle = bool2;
        this.deals = list;
        this.limit = bffLimit;
        this.isDisplayedAsPromo = bool3;
        this.isPromotion = bool4;
        this.store = list2;
        this.gtins = list3;
        this.bundle = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffBffDiscount(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.Type r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.String r29, java.lang.String r30, java.lang.Boolean r31, java.lang.Boolean r32, java.util.List r33, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit r34, java.lang.Boolean r35, java.lang.Boolean r36, java.util.List r37, java.util.List r38, java.util.List r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r22
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r23
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r24
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r25
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r26
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r27
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r28
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r29
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r30
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r31
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r32
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r33
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r34
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r35
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r36
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r37
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r38
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            goto L_0x00a6
        L_0x00a4:
            r0 = r39
        L_0x00a6:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r2
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount.<init>(com.carrefour.fid.android.bff_data_shared.data.api.entities.BffBffDiscount$Type, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
