package com.carrefour.fid.android.bff_data_shared.data.api.entities;

import java.math.BigDecimal;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12196b;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12438n;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.descriptors.C12217f;
import kotlinx.serialization.encoding.C12239d;
import kotlinx.serialization.internal.C12261c1;
import kotlinx.serialization.internal.C12269f;
import kotlinx.serialization.internal.C12278i;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 s2\u00020\u0001:\u0002tsBý\u0001\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bm\u0010nB\u0002\b\u0017\u0012\u0006\u0010o\u001a\u00020:\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00105\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00106\u001a\u0004\u0018\u00010\t\u0012\b\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\bm\u0010rJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0002\u00107\u001a\u00020\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b7\u00108J\t\u00109\u001a\u00020\tHÖ\u0001J\t\u0010;\u001a\u00020:HÖ\u0001J\u0013\u0010=\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010>\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@R\"\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010C\u0012\u0004\bF\u0010B\u001a\u0004\bD\u0010ER\"\u0010%\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010G\u0012\u0004\bH\u0010B\u001a\u0004\b%\u0010\u000fR\"\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010C\u0012\u0004\bJ\u0010B\u001a\u0004\bI\u0010ER\"\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010C\u0012\u0004\bL\u0010B\u001a\u0004\bK\u0010ER\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010>\u0012\u0004\bN\u0010B\u001a\u0004\bM\u0010@R(\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010O\u0012\u0004\bR\u0010B\u001a\u0004\bP\u0010QR\"\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010>\u0012\u0004\bT\u0010B\u001a\u0004\bS\u0010@R\"\u0010+\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010>\u0012\u0004\bV\u0010B\u001a\u0004\bU\u0010@R\"\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010>\u0012\u0004\bX\u0010B\u001a\u0004\bW\u0010@R\"\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010>\u0012\u0004\bZ\u0010B\u001a\u0004\bY\u0010@R\"\u0010.\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010>\u0012\u0004\b\\\u0010B\u001a\u0004\b[\u0010@R\"\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010>\u0012\u0004\b^\u0010B\u001a\u0004\b]\u0010@R\"\u00100\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010>\u0012\u0004\b`\u0010B\u001a\u0004\b_\u0010@R\"\u00101\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010>\u0012\u0004\bb\u0010B\u001a\u0004\ba\u0010@R\"\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010>\u0012\u0004\bd\u0010B\u001a\u0004\bc\u0010@R\"\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010>\u0012\u0004\bf\u0010B\u001a\u0004\be\u0010@R\"\u00104\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010>\u0012\u0004\bh\u0010B\u001a\u0004\bg\u0010@R\"\u00105\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010>\u0012\u0004\bj\u0010B\u001a\u0004\bi\u0010@R\"\u00106\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010>\u0012\u0004\bl\u0010B\u001a\u0004\bk\u0010@¨\u0006u"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "Ljava/math/BigDecimal;", "component2", "", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "countryCode", "distance", "isCarrefour", "latitude", "longitude", "locationKey", "openingWeekPattern", "pickupPointFinancialKey", "pickupPointGlnKey", "pickupPointId", "pickupPointInternalType", "pickupPointName", "pickupPointProvider", "pickupPointProviderId", "pickupPointProviderType", "pickupReturnFlag", "postalCode", "streetAddressOne", "streetAddressTwo", "town", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", "getCountryCode$annotations", "()V", "Ljava/math/BigDecimal;", "getDistance", "()Ljava/math/BigDecimal;", "getDistance$annotations", "Ljava/lang/Boolean;", "isCarrefour$annotations", "getLatitude", "getLatitude$annotations", "getLongitude", "getLongitude$annotations", "getLocationKey", "getLocationKey$annotations", "Ljava/util/List;", "getOpeningWeekPattern", "()Ljava/util/List;", "getOpeningWeekPattern$annotations", "getPickupPointFinancialKey", "getPickupPointFinancialKey$annotations", "getPickupPointGlnKey", "getPickupPointGlnKey$annotations", "getPickupPointId", "getPickupPointId$annotations", "getPickupPointInternalType", "getPickupPointInternalType$annotations", "getPickupPointName", "getPickupPointName$annotations", "getPickupPointProvider", "getPickupPointProvider$annotations", "getPickupPointProviderId", "getPickupPointProviderId$annotations", "getPickupPointProviderType", "getPickupPointProviderType$annotations", "getPickupReturnFlag", "getPickupReturnFlag$annotations", "getPostalCode", "getPostalCode$annotations", "getStreetAddressOne", "getStreetAddressOne$annotations", "getStreetAddressTwo", "getStreetAddressTwo$annotations", "getTown", "getTown$annotations", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffPickupPoint {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String countryCode;
    @C12580l
    private final BigDecimal distance;
    @C12580l
    private final Boolean isCarrefour;
    @C12580l
    private final BigDecimal latitude;
    @C12580l
    private final String locationKey;
    @C12580l
    private final BigDecimal longitude;
    @C12580l
    private final List<BffWeekPattern> openingWeekPattern;
    @C12580l
    private final String pickupPointFinancialKey;
    @C12580l
    private final String pickupPointGlnKey;
    @C12580l
    private final String pickupPointId;
    @C12580l
    private final String pickupPointInternalType;
    @C12580l
    private final String pickupPointName;
    @C12580l
    private final String pickupPointProvider;
    @C12580l
    private final String pickupPointProviderId;
    @C12580l
    private final String pickupPointProviderType;
    @C12580l
    private final String pickupReturnFlag;
    @C12580l
    private final String postalCode;
    @C12580l
    private final String streetAddressOne;
    @C12580l
    private final String streetAddressTwo;
    @C12580l
    private final String town;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffPickupPoint;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffPickupPoint> serializer() {
            return BffPickupPoint$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Class<BigDecimal> cls = BigDecimal.class;
        $childSerializers = new C12248g[]{null, new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), null, new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), new ContextualSerializer(C11342l0.m43547d(cls), (C12248g) null, new C12248g[0]), null, new C12269f(BffWeekPattern$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public BffPickupPoint() {
        this((String) null, (BigDecimal) null, (Boolean) null, (BigDecimal) null, (BigDecimal) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffPickupPoint copy$default(BffPickupPoint bffPickupPoint, String str, BigDecimal bigDecimal, Boolean bool, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        BffPickupPoint bffPickupPoint2 = bffPickupPoint;
        int i2 = i;
        return bffPickupPoint.copy((i2 & 1) != 0 ? bffPickupPoint2.countryCode : str, (i2 & 2) != 0 ? bffPickupPoint2.distance : bigDecimal, (i2 & 4) != 0 ? bffPickupPoint2.isCarrefour : bool, (i2 & 8) != 0 ? bffPickupPoint2.latitude : bigDecimal2, (i2 & 16) != 0 ? bffPickupPoint2.longitude : bigDecimal3, (i2 & 32) != 0 ? bffPickupPoint2.locationKey : str2, (i2 & 64) != 0 ? bffPickupPoint2.openingWeekPattern : list, (i2 & 128) != 0 ? bffPickupPoint2.pickupPointFinancialKey : str3, (i2 & 256) != 0 ? bffPickupPoint2.pickupPointGlnKey : str4, (i2 & 512) != 0 ? bffPickupPoint2.pickupPointId : str5, (i2 & 1024) != 0 ? bffPickupPoint2.pickupPointInternalType : str6, (i2 & 2048) != 0 ? bffPickupPoint2.pickupPointName : str7, (i2 & 4096) != 0 ? bffPickupPoint2.pickupPointProvider : str8, (i2 & 8192) != 0 ? bffPickupPoint2.pickupPointProviderId : str9, (i2 & 16384) != 0 ? bffPickupPoint2.pickupPointProviderType : str10, (i2 & 32768) != 0 ? bffPickupPoint2.pickupReturnFlag : str11, (i2 & 65536) != 0 ? bffPickupPoint2.postalCode : str12, (i2 & 131072) != 0 ? bffPickupPoint2.streetAddressOne : str13, (i2 & 262144) != 0 ? bffPickupPoint2.streetAddressTwo : str14, (i2 & 524288) != 0 ? bffPickupPoint2.town : str15);
    }

    @C12438n("country_code")
    public static /* synthetic */ void getCountryCode$annotations() {
    }

    @C12196b
    @C12438n("distance")
    public static /* synthetic */ void getDistance$annotations() {
    }

    @C12196b
    @C12438n("latitude")
    public static /* synthetic */ void getLatitude$annotations() {
    }

    @C12438n("location_key")
    public static /* synthetic */ void getLocationKey$annotations() {
    }

    @C12196b
    @C12438n("longitude")
    public static /* synthetic */ void getLongitude$annotations() {
    }

    @C12438n("opening_week_pattern")
    public static /* synthetic */ void getOpeningWeekPattern$annotations() {
    }

    @C12438n("pickup_point_financial_key")
    public static /* synthetic */ void getPickupPointFinancialKey$annotations() {
    }

    @C12438n("pickup_point_gln_key")
    public static /* synthetic */ void getPickupPointGlnKey$annotations() {
    }

    @C12438n("pickup_point_id")
    public static /* synthetic */ void getPickupPointId$annotations() {
    }

    @C12438n("pickup_point_internal_type")
    public static /* synthetic */ void getPickupPointInternalType$annotations() {
    }

    @C12438n("pickup_point_name")
    public static /* synthetic */ void getPickupPointName$annotations() {
    }

    @C12438n("pickup_point_provider")
    public static /* synthetic */ void getPickupPointProvider$annotations() {
    }

    @C12438n("pickup_point_provider_id")
    public static /* synthetic */ void getPickupPointProviderId$annotations() {
    }

    @C12438n("pickup_point_provider_type")
    public static /* synthetic */ void getPickupPointProviderType$annotations() {
    }

    @C12438n("pickup_return_flag")
    public static /* synthetic */ void getPickupReturnFlag$annotations() {
    }

    @C12438n("postal_code")
    public static /* synthetic */ void getPostalCode$annotations() {
    }

    @C12438n("street_address_one")
    public static /* synthetic */ void getStreetAddressOne$annotations() {
    }

    @C12438n("street_address_two")
    public static /* synthetic */ void getStreetAddressTwo$annotations() {
    }

    @C12438n("town")
    public static /* synthetic */ void getTown$annotations() {
    }

    @C12438n("is_carrefour")
    public static /* synthetic */ void isCarrefour$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffPickupPoint bffPickupPoint, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffPickupPoint.countryCode != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffPickupPoint.countryCode);
        }
        if (dVar.mo24897A(fVar, 1) || bffPickupPoint.distance != null) {
            dVar.mo24912i(fVar, 1, gVarArr[1], bffPickupPoint.distance);
        }
        if (dVar.mo24897A(fVar, 2) || bffPickupPoint.isCarrefour != null) {
            dVar.mo24912i(fVar, 2, C12278i.f30070a, bffPickupPoint.isCarrefour);
        }
        if (dVar.mo24897A(fVar, 3) || bffPickupPoint.latitude != null) {
            dVar.mo24912i(fVar, 3, gVarArr[3], bffPickupPoint.latitude);
        }
        if (dVar.mo24897A(fVar, 4) || bffPickupPoint.longitude != null) {
            dVar.mo24912i(fVar, 4, gVarArr[4], bffPickupPoint.longitude);
        }
        if (dVar.mo24897A(fVar, 5) || bffPickupPoint.locationKey != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffPickupPoint.locationKey);
        }
        if (dVar.mo24897A(fVar, 6) || bffPickupPoint.openingWeekPattern != null) {
            dVar.mo24912i(fVar, 6, gVarArr[6], bffPickupPoint.openingWeekPattern);
        }
        if (dVar.mo24897A(fVar, 7) || bffPickupPoint.pickupPointFinancialKey != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffPickupPoint.pickupPointFinancialKey);
        }
        if (dVar.mo24897A(fVar, 8) || bffPickupPoint.pickupPointGlnKey != null) {
            dVar.mo24912i(fVar, 8, C12310s1.f30117a, bffPickupPoint.pickupPointGlnKey);
        }
        if (dVar.mo24897A(fVar, 9) || bffPickupPoint.pickupPointId != null) {
            dVar.mo24912i(fVar, 9, C12310s1.f30117a, bffPickupPoint.pickupPointId);
        }
        if (dVar.mo24897A(fVar, 10) || bffPickupPoint.pickupPointInternalType != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffPickupPoint.pickupPointInternalType);
        }
        if (dVar.mo24897A(fVar, 11) || bffPickupPoint.pickupPointName != null) {
            dVar.mo24912i(fVar, 11, C12310s1.f30117a, bffPickupPoint.pickupPointName);
        }
        if (dVar.mo24897A(fVar, 12) || bffPickupPoint.pickupPointProvider != null) {
            dVar.mo24912i(fVar, 12, C12310s1.f30117a, bffPickupPoint.pickupPointProvider);
        }
        if (dVar.mo24897A(fVar, 13) || bffPickupPoint.pickupPointProviderId != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffPickupPoint.pickupPointProviderId);
        }
        if (dVar.mo24897A(fVar, 14) || bffPickupPoint.pickupPointProviderType != null) {
            dVar.mo24912i(fVar, 14, C12310s1.f30117a, bffPickupPoint.pickupPointProviderType);
        }
        if (dVar.mo24897A(fVar, 15) || bffPickupPoint.pickupReturnFlag != null) {
            dVar.mo24912i(fVar, 15, C12310s1.f30117a, bffPickupPoint.pickupReturnFlag);
        }
        if (dVar.mo24897A(fVar, 16) || bffPickupPoint.postalCode != null) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffPickupPoint.postalCode);
        }
        if (dVar.mo24897A(fVar, 17) || bffPickupPoint.streetAddressOne != null) {
            dVar.mo24912i(fVar, 17, C12310s1.f30117a, bffPickupPoint.streetAddressOne);
        }
        if (dVar.mo24897A(fVar, 18) || bffPickupPoint.streetAddressTwo != null) {
            dVar.mo24912i(fVar, 18, C12310s1.f30117a, bffPickupPoint.streetAddressTwo);
        }
        if (dVar.mo24897A(fVar, 19) || bffPickupPoint.town != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 19, C12310s1.f30117a, bffPickupPoint.town);
        }
    }

    @C12580l
    public final String component1() {
        return this.countryCode;
    }

    @C12580l
    public final String component10() {
        return this.pickupPointId;
    }

    @C12580l
    public final String component11() {
        return this.pickupPointInternalType;
    }

    @C12580l
    public final String component12() {
        return this.pickupPointName;
    }

    @C12580l
    public final String component13() {
        return this.pickupPointProvider;
    }

    @C12580l
    public final String component14() {
        return this.pickupPointProviderId;
    }

    @C12580l
    public final String component15() {
        return this.pickupPointProviderType;
    }

    @C12580l
    public final String component16() {
        return this.pickupReturnFlag;
    }

    @C12580l
    public final String component17() {
        return this.postalCode;
    }

    @C12580l
    public final String component18() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String component19() {
        return this.streetAddressTwo;
    }

    @C12580l
    public final BigDecimal component2() {
        return this.distance;
    }

    @C12580l
    public final String component20() {
        return this.town;
    }

    @C12580l
    public final Boolean component3() {
        return this.isCarrefour;
    }

    @C12580l
    public final BigDecimal component4() {
        return this.latitude;
    }

    @C12580l
    public final BigDecimal component5() {
        return this.longitude;
    }

    @C12580l
    public final String component6() {
        return this.locationKey;
    }

    @C12580l
    public final List<BffWeekPattern> component7() {
        return this.openingWeekPattern;
    }

    @C12580l
    public final String component8() {
        return this.pickupPointFinancialKey;
    }

    @C12580l
    public final String component9() {
        return this.pickupPointGlnKey;
    }

    @C12579k
    public final BffPickupPoint copy(@C12580l String str, @C12580l BigDecimal bigDecimal, @C12580l Boolean bool, @C12580l BigDecimal bigDecimal2, @C12580l BigDecimal bigDecimal3, @C12580l String str2, @C12580l List<BffWeekPattern> list, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15) {
        return new BffPickupPoint(str, bigDecimal, bool, bigDecimal2, bigDecimal3, str2, list, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffPickupPoint)) {
            return false;
        }
        BffPickupPoint bffPickupPoint = (BffPickupPoint) obj;
        return Intrinsics.areEqual((Object) this.countryCode, (Object) bffPickupPoint.countryCode) && Intrinsics.areEqual((Object) this.distance, (Object) bffPickupPoint.distance) && Intrinsics.areEqual((Object) this.isCarrefour, (Object) bffPickupPoint.isCarrefour) && Intrinsics.areEqual((Object) this.latitude, (Object) bffPickupPoint.latitude) && Intrinsics.areEqual((Object) this.longitude, (Object) bffPickupPoint.longitude) && Intrinsics.areEqual((Object) this.locationKey, (Object) bffPickupPoint.locationKey) && Intrinsics.areEqual((Object) this.openingWeekPattern, (Object) bffPickupPoint.openingWeekPattern) && Intrinsics.areEqual((Object) this.pickupPointFinancialKey, (Object) bffPickupPoint.pickupPointFinancialKey) && Intrinsics.areEqual((Object) this.pickupPointGlnKey, (Object) bffPickupPoint.pickupPointGlnKey) && Intrinsics.areEqual((Object) this.pickupPointId, (Object) bffPickupPoint.pickupPointId) && Intrinsics.areEqual((Object) this.pickupPointInternalType, (Object) bffPickupPoint.pickupPointInternalType) && Intrinsics.areEqual((Object) this.pickupPointName, (Object) bffPickupPoint.pickupPointName) && Intrinsics.areEqual((Object) this.pickupPointProvider, (Object) bffPickupPoint.pickupPointProvider) && Intrinsics.areEqual((Object) this.pickupPointProviderId, (Object) bffPickupPoint.pickupPointProviderId) && Intrinsics.areEqual((Object) this.pickupPointProviderType, (Object) bffPickupPoint.pickupPointProviderType) && Intrinsics.areEqual((Object) this.pickupReturnFlag, (Object) bffPickupPoint.pickupReturnFlag) && Intrinsics.areEqual((Object) this.postalCode, (Object) bffPickupPoint.postalCode) && Intrinsics.areEqual((Object) this.streetAddressOne, (Object) bffPickupPoint.streetAddressOne) && Intrinsics.areEqual((Object) this.streetAddressTwo, (Object) bffPickupPoint.streetAddressTwo) && Intrinsics.areEqual((Object) this.town, (Object) bffPickupPoint.town);
    }

    @C12580l
    public final String getCountryCode() {
        return this.countryCode;
    }

    @C12580l
    public final BigDecimal getDistance() {
        return this.distance;
    }

    @C12580l
    public final BigDecimal getLatitude() {
        return this.latitude;
    }

    @C12580l
    public final String getLocationKey() {
        return this.locationKey;
    }

    @C12580l
    public final BigDecimal getLongitude() {
        return this.longitude;
    }

    @C12580l
    public final List<BffWeekPattern> getOpeningWeekPattern() {
        return this.openingWeekPattern;
    }

    @C12580l
    public final String getPickupPointFinancialKey() {
        return this.pickupPointFinancialKey;
    }

    @C12580l
    public final String getPickupPointGlnKey() {
        return this.pickupPointGlnKey;
    }

    @C12580l
    public final String getPickupPointId() {
        return this.pickupPointId;
    }

    @C12580l
    public final String getPickupPointInternalType() {
        return this.pickupPointInternalType;
    }

    @C12580l
    public final String getPickupPointName() {
        return this.pickupPointName;
    }

    @C12580l
    public final String getPickupPointProvider() {
        return this.pickupPointProvider;
    }

    @C12580l
    public final String getPickupPointProviderId() {
        return this.pickupPointProviderId;
    }

    @C12580l
    public final String getPickupPointProviderType() {
        return this.pickupPointProviderType;
    }

    @C12580l
    public final String getPickupReturnFlag() {
        return this.pickupReturnFlag;
    }

    @C12580l
    public final String getPostalCode() {
        return this.postalCode;
    }

    @C12580l
    public final String getStreetAddressOne() {
        return this.streetAddressOne;
    }

    @C12580l
    public final String getStreetAddressTwo() {
        return this.streetAddressTwo;
    }

    @C12580l
    public final String getTown() {
        return this.town;
    }

    public int hashCode() {
        String str = this.countryCode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.distance;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool = this.isCarrefour;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.latitude;
        int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.longitude;
        int hashCode5 = (hashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.locationKey;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BffWeekPattern> list = this.openingWeekPattern;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.pickupPointFinancialKey;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pickupPointGlnKey;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pickupPointId;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pickupPointInternalType;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pickupPointName;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pickupPointProvider;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.pickupPointProviderId;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pickupPointProviderType;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.pickupReturnFlag;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.postalCode;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.streetAddressOne;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.streetAddressTwo;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.town;
        if (str15 != null) {
            i = str15.hashCode();
        }
        return hashCode19 + i;
    }

    @C12580l
    public final Boolean isCarrefour() {
        return this.isCarrefour;
    }

    @C12579k
    public String toString() {
        String str = this.countryCode;
        BigDecimal bigDecimal = this.distance;
        Boolean bool = this.isCarrefour;
        BigDecimal bigDecimal2 = this.latitude;
        BigDecimal bigDecimal3 = this.longitude;
        String str2 = this.locationKey;
        List<BffWeekPattern> list = this.openingWeekPattern;
        String str3 = this.pickupPointFinancialKey;
        String str4 = this.pickupPointGlnKey;
        String str5 = this.pickupPointId;
        String str6 = this.pickupPointInternalType;
        String str7 = this.pickupPointName;
        String str8 = this.pickupPointProvider;
        String str9 = this.pickupPointProviderId;
        String str10 = this.pickupPointProviderType;
        String str11 = this.pickupReturnFlag;
        String str12 = this.postalCode;
        String str13 = this.streetAddressOne;
        String str14 = this.streetAddressTwo;
        String str15 = this.town;
        return "BffPickupPoint(countryCode=" + str + ", distance=" + bigDecimal + ", isCarrefour=" + bool + ", latitude=" + bigDecimal2 + ", longitude=" + bigDecimal3 + ", locationKey=" + str2 + ", openingWeekPattern=" + list + ", pickupPointFinancialKey=" + str3 + ", pickupPointGlnKey=" + str4 + ", pickupPointId=" + str5 + ", pickupPointInternalType=" + str6 + ", pickupPointName=" + str7 + ", pickupPointProvider=" + str8 + ", pickupPointProviderId=" + str9 + ", pickupPointProviderType=" + str10 + ", pickupReturnFlag=" + str11 + ", postalCode=" + str12 + ", streetAddressOne=" + str13 + ", streetAddressTwo=" + str14 + ", town=" + str15 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffPickupPoint(int i, @C12438n("country_code") String str, @C12196b @C12438n("distance") BigDecimal bigDecimal, @C12438n("is_carrefour") Boolean bool, @C12196b @C12438n("latitude") BigDecimal bigDecimal2, @C12196b @C12438n("longitude") BigDecimal bigDecimal3, @C12438n("location_key") String str2, @C12438n("opening_week_pattern") List list, @C12438n("pickup_point_financial_key") String str3, @C12438n("pickup_point_gln_key") String str4, @C12438n("pickup_point_id") String str5, @C12438n("pickup_point_internal_type") String str6, @C12438n("pickup_point_name") String str7, @C12438n("pickup_point_provider") String str8, @C12438n("pickup_point_provider_id") String str9, @C12438n("pickup_point_provider_type") String str10, @C12438n("pickup_return_flag") String str11, @C12438n("postal_code") String str12, @C12438n("street_address_one") String str13, @C12438n("street_address_two") String str14, @C12438n("town") String str15, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffPickupPoint$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str;
        }
        if ((i2 & 2) == 0) {
            this.distance = null;
        } else {
            this.distance = bigDecimal;
        }
        if ((i2 & 4) == 0) {
            this.isCarrefour = null;
        } else {
            this.isCarrefour = bool;
        }
        if ((i2 & 8) == 0) {
            this.latitude = null;
        } else {
            this.latitude = bigDecimal2;
        }
        if ((i2 & 16) == 0) {
            this.longitude = null;
        } else {
            this.longitude = bigDecimal3;
        }
        if ((i2 & 32) == 0) {
            this.locationKey = null;
        } else {
            this.locationKey = str2;
        }
        if ((i2 & 64) == 0) {
            this.openingWeekPattern = null;
        } else {
            this.openingWeekPattern = list;
        }
        if ((i2 & 128) == 0) {
            this.pickupPointFinancialKey = null;
        } else {
            this.pickupPointFinancialKey = str3;
        }
        if ((i2 & 256) == 0) {
            this.pickupPointGlnKey = null;
        } else {
            this.pickupPointGlnKey = str4;
        }
        if ((i2 & 512) == 0) {
            this.pickupPointId = null;
        } else {
            this.pickupPointId = str5;
        }
        if ((i2 & 1024) == 0) {
            this.pickupPointInternalType = null;
        } else {
            this.pickupPointInternalType = str6;
        }
        if ((i2 & 2048) == 0) {
            this.pickupPointName = null;
        } else {
            this.pickupPointName = str7;
        }
        if ((i2 & 4096) == 0) {
            this.pickupPointProvider = null;
        } else {
            this.pickupPointProvider = str8;
        }
        if ((i2 & 8192) == 0) {
            this.pickupPointProviderId = null;
        } else {
            this.pickupPointProviderId = str9;
        }
        if ((i2 & 16384) == 0) {
            this.pickupPointProviderType = null;
        } else {
            this.pickupPointProviderType = str10;
        }
        if ((32768 & i2) == 0) {
            this.pickupReturnFlag = null;
        } else {
            this.pickupReturnFlag = str11;
        }
        if ((65536 & i2) == 0) {
            this.postalCode = null;
        } else {
            this.postalCode = str12;
        }
        if ((131072 & i2) == 0) {
            this.streetAddressOne = null;
        } else {
            this.streetAddressOne = str13;
        }
        if ((262144 & i2) == 0) {
            this.streetAddressTwo = null;
        } else {
            this.streetAddressTwo = str14;
        }
        if ((i2 & 524288) == 0) {
            this.town = null;
        } else {
            this.town = str15;
        }
    }

    public BffPickupPoint(@C12580l String str, @C12580l BigDecimal bigDecimal, @C12580l Boolean bool, @C12580l BigDecimal bigDecimal2, @C12580l BigDecimal bigDecimal3, @C12580l String str2, @C12580l List<BffWeekPattern> list, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15) {
        this.countryCode = str;
        this.distance = bigDecimal;
        this.isCarrefour = bool;
        this.latitude = bigDecimal2;
        this.longitude = bigDecimal3;
        this.locationKey = str2;
        this.openingWeekPattern = list;
        this.pickupPointFinancialKey = str3;
        this.pickupPointGlnKey = str4;
        this.pickupPointId = str5;
        this.pickupPointInternalType = str6;
        this.pickupPointName = str7;
        this.pickupPointProvider = str8;
        this.pickupPointProviderId = str9;
        this.pickupPointProviderType = str10;
        this.pickupReturnFlag = str11;
        this.postalCode = str12;
        this.streetAddressOne = str13;
        this.streetAddressTwo = str14;
        this.town = str15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffPickupPoint(java.lang.String r22, java.math.BigDecimal r23, java.lang.Boolean r24, java.math.BigDecimal r25, java.math.BigDecimal r26, java.lang.String r27, java.util.List r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r22
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r23
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r24
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r25
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r26
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r27
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r28
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r29
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r30
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r31
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r32
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r33
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r34
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r35
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r36
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r37
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r38
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r39
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r40
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00af
            r0 = 0
            goto L_0x00b1
        L_0x00af:
            r0 = r41
        L_0x00b1:
            r22 = r21
            r23 = r1
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r12
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r2
            r38 = r16
            r39 = r17
            r40 = r18
            r41 = r19
            r42 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffPickupPoint.<init>(java.lang.String, java.math.BigDecimal, java.lang.Boolean, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
