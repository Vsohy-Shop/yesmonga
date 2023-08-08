package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import androidx.compose.p004ui.unit.C16476b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
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

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 Y2\u00020\u0001:\u0002ZYB»\u0001\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012¢\u0006\u0004\bS\u0010TBÏ\u0001\b\u0017\u0012\u0006\u0010U\u001a\u00020\r\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0017\u0012\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012\u0012\b\u0010W\u001a\u0004\u0018\u00010V¢\u0006\u0004\bS\u0010XJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012HÆ\u0003JÄ\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b,\u0010-J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020\rHÖ\u0001J\u0013\u00101\u001a\u00020\u00172\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104R\"\u0010 \u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u00102\u0012\u0004\b8\u00106\u001a\u0004\b7\u00104R\"\u0010!\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u00102\u0012\u0004\b:\u00106\u001a\u0004\b9\u00104R\"\u0010\"\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010;\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010\u000fR\"\u0010#\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010;\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010\u000fR\"\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u00102\u0012\u0004\bA\u00106\u001a\u0004\b@\u00104R(\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010B\u0012\u0004\bE\u00106\u001a\u0004\bC\u0010DR\"\u0010&\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010F\u0012\u0004\bI\u00106\u001a\u0004\bG\u0010HR\"\u0010'\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010J\u0012\u0004\bK\u00106\u001a\u0004\b'\u0010\u0019R\"\u0010(\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010J\u0012\u0004\bL\u00106\u001a\u0004\b(\u0010\u0019R(\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010B\u0012\u0004\bN\u00106\u001a\u0004\bM\u0010DR(\u0010*\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010B\u0012\u0004\bP\u00106\u001a\u0004\bO\u0010DR(\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010B\u0012\u0004\bR\u00106\u001a\u0004\bQ\u0010D¨\u0006["}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDeals;", "component7", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "component8", "", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "component12", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffBundle;", "component13", "startDate", "endDate", "label", "forcedPrice", "bufferPromo", "type", "deals", "limit", "isDisplayedAsPromo", "isPromotion", "store", "gtins", "bundle", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getStartDate", "()Ljava/lang/String;", "getStartDate$annotations", "()V", "getEndDate", "getEndDate$annotations", "getLabel", "getLabel$annotations", "Ljava/lang/Integer;", "getForcedPrice", "getForcedPrice$annotations", "getBufferPromo", "getBufferPromo$annotations", "getType", "getType$annotations", "Ljava/util/List;", "getDeals", "()Ljava/util/List;", "getDeals$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "getLimit", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;", "getLimit$annotations", "Ljava/lang/Boolean;", "isDisplayedAsPromo$annotations", "isPromotion$annotations", "getStore", "getStore$annotations", "getGtins", "getGtins$annotations", "getBundle", "getBundle$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffLimit;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffDiscount {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final Integer bufferPromo;
    @C12580l
    private final List<BffBundle> bundle;
    @C12580l
    private final List<BffDeals> deals;
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
    private final List<String> store;
    @C12580l
    private final String type;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffDiscount;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffDiscount> serializer() {
            return BffDiscount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C12310s1 s1Var = C12310s1.f30117a;
        $childSerializers = new C12248g[]{null, null, null, null, null, null, new C12269f(BffDeals$$serializer.INSTANCE), null, null, null, new C12269f(s1Var), new C12269f(s1Var), new C12269f(BffBundle$$serializer.INSTANCE)};
    }

    public BffDiscount() {
        this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (List) null, (BffLimit) null, (Boolean) null, (Boolean) null, (List) null, (List) null, (List) null, (int) C16476b.f40864p, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffDiscount copy$default(BffDiscount bffDiscount, String str, String str2, String str3, Integer num, Integer num2, String str4, List list, BffLimit bffLimit, Boolean bool, Boolean bool2, List list2, List list3, List list4, int i, Object obj) {
        BffDiscount bffDiscount2 = bffDiscount;
        int i2 = i;
        return bffDiscount.copy((i2 & 1) != 0 ? bffDiscount2.startDate : str, (i2 & 2) != 0 ? bffDiscount2.endDate : str2, (i2 & 4) != 0 ? bffDiscount2.label : str3, (i2 & 8) != 0 ? bffDiscount2.forcedPrice : num, (i2 & 16) != 0 ? bffDiscount2.bufferPromo : num2, (i2 & 32) != 0 ? bffDiscount2.type : str4, (i2 & 64) != 0 ? bffDiscount2.deals : list, (i2 & 128) != 0 ? bffDiscount2.limit : bffLimit, (i2 & 256) != 0 ? bffDiscount2.isDisplayedAsPromo : bool, (i2 & 512) != 0 ? bffDiscount2.isPromotion : bool2, (i2 & 1024) != 0 ? bffDiscount2.store : list2, (i2 & 2048) != 0 ? bffDiscount2.gtins : list3, (i2 & 4096) != 0 ? bffDiscount2.bundle : list4);
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
    public static final /* synthetic */ void write$Self(BffDiscount bffDiscount, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffDiscount.startDate != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffDiscount.startDate);
        }
        if (dVar.mo24897A(fVar, 1) || bffDiscount.endDate != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffDiscount.endDate);
        }
        if (dVar.mo24897A(fVar, 2) || bffDiscount.label != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffDiscount.label);
        }
        if (dVar.mo24897A(fVar, 3) || bffDiscount.forcedPrice != null) {
            dVar.mo24912i(fVar, 3, C12276h0.f30067a, bffDiscount.forcedPrice);
        }
        if (dVar.mo24897A(fVar, 4) || bffDiscount.bufferPromo != null) {
            dVar.mo24912i(fVar, 4, C12276h0.f30067a, bffDiscount.bufferPromo);
        }
        if (dVar.mo24897A(fVar, 5) || bffDiscount.type != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffDiscount.type);
        }
        if (dVar.mo24897A(fVar, 6) || bffDiscount.deals != null) {
            dVar.mo24912i(fVar, 6, gVarArr[6], bffDiscount.deals);
        }
        if (dVar.mo24897A(fVar, 7) || bffDiscount.limit != null) {
            dVar.mo24912i(fVar, 7, BffLimit$$serializer.INSTANCE, bffDiscount.limit);
        }
        if (dVar.mo24897A(fVar, 8) || bffDiscount.isDisplayedAsPromo != null) {
            dVar.mo24912i(fVar, 8, C12278i.f30070a, bffDiscount.isDisplayedAsPromo);
        }
        if (dVar.mo24897A(fVar, 9) || bffDiscount.isPromotion != null) {
            dVar.mo24912i(fVar, 9, C12278i.f30070a, bffDiscount.isPromotion);
        }
        if (dVar.mo24897A(fVar, 10) || bffDiscount.store != null) {
            dVar.mo24912i(fVar, 10, gVarArr[10], bffDiscount.store);
        }
        if (dVar.mo24897A(fVar, 11) || bffDiscount.gtins != null) {
            dVar.mo24912i(fVar, 11, gVarArr[11], bffDiscount.gtins);
        }
        if (dVar.mo24897A(fVar, 12) || bffDiscount.bundle != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 12, gVarArr[12], bffDiscount.bundle);
        }
    }

    @C12580l
    public final String component1() {
        return this.startDate;
    }

    @C12580l
    public final Boolean component10() {
        return this.isPromotion;
    }

    @C12580l
    public final List<String> component11() {
        return this.store;
    }

    @C12580l
    public final List<String> component12() {
        return this.gtins;
    }

    @C12580l
    public final List<BffBundle> component13() {
        return this.bundle;
    }

    @C12580l
    public final String component2() {
        return this.endDate;
    }

    @C12580l
    public final String component3() {
        return this.label;
    }

    @C12580l
    public final Integer component4() {
        return this.forcedPrice;
    }

    @C12580l
    public final Integer component5() {
        return this.bufferPromo;
    }

    @C12580l
    public final String component6() {
        return this.type;
    }

    @C12580l
    public final List<BffDeals> component7() {
        return this.deals;
    }

    @C12580l
    public final BffLimit component8() {
        return this.limit;
    }

    @C12580l
    public final Boolean component9() {
        return this.isDisplayedAsPromo;
    }

    @C12579k
    public final BffDiscount copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Integer num, @C12580l Integer num2, @C12580l String str4, @C12580l List<BffDeals> list, @C12580l BffLimit bffLimit, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l List<String> list2, @C12580l List<String> list3, @C12580l List<BffBundle> list4) {
        return new BffDiscount(str, str2, str3, num, num2, str4, list, bffLimit, bool, bool2, list2, list3, list4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffDiscount)) {
            return false;
        }
        BffDiscount bffDiscount = (BffDiscount) obj;
        return Intrinsics.areEqual((Object) this.startDate, (Object) bffDiscount.startDate) && Intrinsics.areEqual((Object) this.endDate, (Object) bffDiscount.endDate) && Intrinsics.areEqual((Object) this.label, (Object) bffDiscount.label) && Intrinsics.areEqual((Object) this.forcedPrice, (Object) bffDiscount.forcedPrice) && Intrinsics.areEqual((Object) this.bufferPromo, (Object) bffDiscount.bufferPromo) && Intrinsics.areEqual((Object) this.type, (Object) bffDiscount.type) && Intrinsics.areEqual((Object) this.deals, (Object) bffDiscount.deals) && Intrinsics.areEqual((Object) this.limit, (Object) bffDiscount.limit) && Intrinsics.areEqual((Object) this.isDisplayedAsPromo, (Object) bffDiscount.isDisplayedAsPromo) && Intrinsics.areEqual((Object) this.isPromotion, (Object) bffDiscount.isPromotion) && Intrinsics.areEqual((Object) this.store, (Object) bffDiscount.store) && Intrinsics.areEqual((Object) this.gtins, (Object) bffDiscount.gtins) && Intrinsics.areEqual((Object) this.bundle, (Object) bffDiscount.bundle);
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
    public final List<String> getStore() {
        return this.store;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.startDate;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.forcedPrice;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bufferPromo;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.type;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<BffDeals> list = this.deals;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        BffLimit bffLimit = this.limit;
        int hashCode8 = (hashCode7 + (bffLimit == null ? 0 : bffLimit.hashCode())) * 31;
        Boolean bool = this.isDisplayedAsPromo;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPromotion;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list2 = this.store;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.gtins;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BffBundle> list4 = this.bundle;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode12 + i;
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
        String str = this.startDate;
        String str2 = this.endDate;
        String str3 = this.label;
        Integer num = this.forcedPrice;
        Integer num2 = this.bufferPromo;
        String str4 = this.type;
        List<BffDeals> list = this.deals;
        BffLimit bffLimit = this.limit;
        Boolean bool = this.isDisplayedAsPromo;
        Boolean bool2 = this.isPromotion;
        List<String> list2 = this.store;
        List<String> list3 = this.gtins;
        List<BffBundle> list4 = this.bundle;
        return "BffDiscount(startDate=" + str + ", endDate=" + str2 + ", label=" + str3 + ", forcedPrice=" + num + ", bufferPromo=" + num2 + ", type=" + str4 + ", deals=" + list + ", limit=" + bffLimit + ", isDisplayedAsPromo=" + bool + ", isPromotion=" + bool2 + ", store=" + list2 + ", gtins=" + list3 + ", bundle=" + list4 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffDiscount(int i, @C12438n("start_date") String str, @C12438n("end_date") String str2, @C12438n("label") String str3, @C12438n("forced_price") Integer num, @C12438n("buffer_promo") Integer num2, @C12438n("type") String str4, @C12438n("deals") List list, @C12438n("limit") BffLimit bffLimit, @C12438n("is_displayed_as_promo") Boolean bool, @C12438n("is_promotion") Boolean bool2, @C12438n("store") List list2, @C12438n("gtins") List list3, @C12438n("bundle") List list4, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffDiscount$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.startDate = null;
        } else {
            this.startDate = str;
        }
        if ((i2 & 2) == 0) {
            this.endDate = null;
        } else {
            this.endDate = str2;
        }
        if ((i2 & 4) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i2 & 8) == 0) {
            this.forcedPrice = null;
        } else {
            this.forcedPrice = num;
        }
        if ((i2 & 16) == 0) {
            this.bufferPromo = null;
        } else {
            this.bufferPromo = num2;
        }
        if ((i2 & 32) == 0) {
            this.type = null;
        } else {
            this.type = str4;
        }
        if ((i2 & 64) == 0) {
            this.deals = null;
        } else {
            this.deals = list;
        }
        if ((i2 & 128) == 0) {
            this.limit = null;
        } else {
            this.limit = bffLimit;
        }
        if ((i2 & 256) == 0) {
            this.isDisplayedAsPromo = null;
        } else {
            this.isDisplayedAsPromo = bool;
        }
        if ((i2 & 512) == 0) {
            this.isPromotion = null;
        } else {
            this.isPromotion = bool2;
        }
        if ((i2 & 1024) == 0) {
            this.store = null;
        } else {
            this.store = list2;
        }
        if ((i2 & 2048) == 0) {
            this.gtins = null;
        } else {
            this.gtins = list3;
        }
        if ((i2 & 4096) == 0) {
            this.bundle = null;
        } else {
            this.bundle = list4;
        }
    }

    public BffDiscount(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Integer num, @C12580l Integer num2, @C12580l String str4, @C12580l List<BffDeals> list, @C12580l BffLimit bffLimit, @C12580l Boolean bool, @C12580l Boolean bool2, @C12580l List<String> list2, @C12580l List<String> list3, @C12580l List<BffBundle> list4) {
        this.startDate = str;
        this.endDate = str2;
        this.label = str3;
        this.forcedPrice = num;
        this.bufferPromo = num2;
        this.type = str4;
        this.deals = list;
        this.limit = bffLimit;
        this.isDisplayedAsPromo = bool;
        this.isPromotion = bool2;
        this.store = list2;
        this.gtins = list3;
        this.bundle = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffDiscount(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Integer r18, java.lang.Integer r19, java.lang.String r20, java.util.List r21, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit r22, java.lang.Boolean r23, java.lang.Boolean r24, java.util.List r25, java.util.List r26, java.util.List r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = r2
            goto L_0x005a
        L_0x0058:
            r12 = r25
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = r2
            goto L_0x0062
        L_0x0060:
            r13 = r26
        L_0x0062:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r2 = r27
        L_0x0069:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffDiscount.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffLimit, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
