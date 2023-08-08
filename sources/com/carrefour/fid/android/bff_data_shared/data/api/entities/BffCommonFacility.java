package com.carrefour.fid.android.bff_data_shared.data.api.entities;

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
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 s2\u00020\u0001:\u0002tsB\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0012\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012¢\u0006\u0004\bm\u0010nB£\u0002\b\u0017\u0012\u0006\u0010o\u001a\u000209\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0001\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00101\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00102\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u00105\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0012\u0012\u0010\b\u0001\u00106\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012\u0012\b\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\bm\u0010rJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0012HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012HÆ\u0003J\u0002\u00107\u001a\u00020\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00122\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0012HÆ\u0001J\t\u00108\u001a\u00020\tHÖ\u0001J\t\u0010:\u001a\u000209HÖ\u0001J\u0013\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010#\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010>\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@R\"\u0010$\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010>\u0012\u0004\bD\u0010B\u001a\u0004\bC\u0010@R\"\u0010%\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010>\u0012\u0004\bF\u0010B\u001a\u0004\bE\u0010@R\"\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010>\u0012\u0004\bH\u0010B\u001a\u0004\bG\u0010@R\"\u0010'\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010>\u0012\u0004\bJ\u0010B\u001a\u0004\bI\u0010@R\"\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010>\u0012\u0004\bL\u0010B\u001a\u0004\bK\u0010@R\"\u0010)\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010>\u0012\u0004\bN\u0010B\u001a\u0004\bM\u0010@R\"\u0010*\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010>\u0012\u0004\bP\u0010B\u001a\u0004\bO\u0010@R(\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010Q\u0012\u0004\bT\u0010B\u001a\u0004\bR\u0010SR(\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010Q\u0012\u0004\bV\u0010B\u001a\u0004\bU\u0010SR\"\u0010-\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010>\u0012\u0004\bX\u0010B\u001a\u0004\bW\u0010@R\"\u0010.\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010Y\u0012\u0004\b\\\u0010B\u001a\u0004\bZ\u0010[R\"\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010>\u0012\u0004\b^\u0010B\u001a\u0004\b]\u0010@R\"\u00100\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010>\u0012\u0004\b`\u0010B\u001a\u0004\b_\u0010@R\"\u00101\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010>\u0012\u0004\bb\u0010B\u001a\u0004\ba\u0010@R\"\u00102\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010>\u0012\u0004\bd\u0010B\u001a\u0004\bc\u0010@R\"\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010>\u0012\u0004\bf\u0010B\u001a\u0004\be\u0010@R\"\u00104\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010>\u0012\u0004\bh\u0010B\u001a\u0004\bg\u0010@R(\u00105\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010Q\u0012\u0004\bj\u0010B\u001a\u0004\bi\u0010SR(\u00106\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010Q\u0012\u0004\bl\u0010B\u001a\u0004\bk\u0010S¨\u0006u"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonFacility;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern;", "component9", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffExceptionCalendar;", "component10", "component11", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilityAddress;", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffServiceStore;", "component19", "component20", "id", "name", "label", "description", "gln", "displayableUrlId", "anabelKey", "phoneNumber", "openingWeekPattern", "openingExceptionCalendar", "distance", "address", "banner", "format", "type", "status", "openingDate", "closingDate", "services", "embeddedFacilities", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getName", "getName$annotations", "getLabel", "getLabel$annotations", "getDescription", "getDescription$annotations", "getGln", "getGln$annotations", "getDisplayableUrlId", "getDisplayableUrlId$annotations", "getAnabelKey", "getAnabelKey$annotations", "getPhoneNumber", "getPhoneNumber$annotations", "Ljava/util/List;", "getOpeningWeekPattern", "()Ljava/util/List;", "getOpeningWeekPattern$annotations", "getOpeningExceptionCalendar", "getOpeningExceptionCalendar$annotations", "getDistance", "getDistance$annotations", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilityAddress;", "getAddress", "()Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilityAddress;", "getAddress$annotations", "getBanner", "getBanner$annotations", "getFormat", "getFormat$annotations", "getType", "getType$annotations", "getStatus", "getStatus$annotations", "getOpeningDate", "getOpeningDate$annotations", "getClosingDate", "getClosingDate$annotations", "getServices", "getServices$annotations", "getEmbeddedFacilities", "getEmbeddedFacilities$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilityAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffFacilityAddress;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffCommonFacility {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new C12269f(BffWeekPattern$$serializer.INSTANCE), new C12269f(BffExceptionCalendar$$serializer.INSTANCE), null, null, null, null, null, null, null, null, new C12269f(BffServiceStore$$serializer.INSTANCE), new C12269f(BffCommonFacility$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final BffFacilityAddress address;
    @C12580l
    private final String anabelKey;
    @C12580l
    private final String banner;
    @C12580l
    private final String closingDate;
    @C12580l
    private final String description;
    @C12580l
    private final String displayableUrlId;
    @C12580l
    private final String distance;
    @C12580l
    private final List<BffCommonFacility> embeddedFacilities;
    @C12580l
    private final String format;
    @C12580l
    private final String gln;
    @C12580l

    /* renamed from: id */
    private final String f100676id;
    @C12580l
    private final String label;
    @C12580l
    private final String name;
    @C12580l
    private final String openingDate;
    @C12580l
    private final List<BffExceptionCalendar> openingExceptionCalendar;
    @C12580l
    private final List<BffWeekPattern> openingWeekPattern;
    @C12580l
    private final String phoneNumber;
    @C12580l
    private final List<BffServiceStore> services;
    @C12580l
    private final String status;
    @C12580l
    private final String type;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonFacility$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffCommonFacility;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffCommonFacility> serializer() {
            return BffCommonFacility$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffCommonFacility() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (BffFacilityAddress) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 1048575, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffCommonFacility copy$default(BffCommonFacility bffCommonFacility, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, String str9, BffFacilityAddress bffFacilityAddress, String str10, String str11, String str12, String str13, String str14, String str15, List list3, List list4, int i, Object obj) {
        BffCommonFacility bffCommonFacility2 = bffCommonFacility;
        int i2 = i;
        return bffCommonFacility.copy((i2 & 1) != 0 ? bffCommonFacility2.f100676id : str, (i2 & 2) != 0 ? bffCommonFacility2.name : str2, (i2 & 4) != 0 ? bffCommonFacility2.label : str3, (i2 & 8) != 0 ? bffCommonFacility2.description : str4, (i2 & 16) != 0 ? bffCommonFacility2.gln : str5, (i2 & 32) != 0 ? bffCommonFacility2.displayableUrlId : str6, (i2 & 64) != 0 ? bffCommonFacility2.anabelKey : str7, (i2 & 128) != 0 ? bffCommonFacility2.phoneNumber : str8, (i2 & 256) != 0 ? bffCommonFacility2.openingWeekPattern : list, (i2 & 512) != 0 ? bffCommonFacility2.openingExceptionCalendar : list2, (i2 & 1024) != 0 ? bffCommonFacility2.distance : str9, (i2 & 2048) != 0 ? bffCommonFacility2.address : bffFacilityAddress, (i2 & 4096) != 0 ? bffCommonFacility2.banner : str10, (i2 & 8192) != 0 ? bffCommonFacility2.format : str11, (i2 & 16384) != 0 ? bffCommonFacility2.type : str12, (i2 & 32768) != 0 ? bffCommonFacility2.status : str13, (i2 & 65536) != 0 ? bffCommonFacility2.openingDate : str14, (i2 & 131072) != 0 ? bffCommonFacility2.closingDate : str15, (i2 & 262144) != 0 ? bffCommonFacility2.services : list3, (i2 & 524288) != 0 ? bffCommonFacility2.embeddedFacilities : list4);
    }

    @C12438n("address")
    public static /* synthetic */ void getAddress$annotations() {
    }

    @C12438n("anabel_key")
    public static /* synthetic */ void getAnabelKey$annotations() {
    }

    @C12438n("banner")
    public static /* synthetic */ void getBanner$annotations() {
    }

    @C12438n("closing_date")
    public static /* synthetic */ void getClosingDate$annotations() {
    }

    @C12438n("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @C12438n("displayable_url_id")
    public static /* synthetic */ void getDisplayableUrlId$annotations() {
    }

    @C12438n("distance")
    public static /* synthetic */ void getDistance$annotations() {
    }

    @C12438n("embedded_facilities")
    public static /* synthetic */ void getEmbeddedFacilities$annotations() {
    }

    @C12438n("format")
    public static /* synthetic */ void getFormat$annotations() {
    }

    @C12438n("gln")
    public static /* synthetic */ void getGln$annotations() {
    }

    @C12438n("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @C12438n("label")
    public static /* synthetic */ void getLabel$annotations() {
    }

    @C12438n("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @C12438n("opening_date")
    public static /* synthetic */ void getOpeningDate$annotations() {
    }

    @C12438n("opening_exception_calendar")
    public static /* synthetic */ void getOpeningExceptionCalendar$annotations() {
    }

    @C12438n("opening_week_pattern")
    public static /* synthetic */ void getOpeningWeekPattern$annotations() {
    }

    @C12438n("phone_number")
    public static /* synthetic */ void getPhoneNumber$annotations() {
    }

    @C12438n("services")
    public static /* synthetic */ void getServices$annotations() {
    }

    @C12438n("status")
    public static /* synthetic */ void getStatus$annotations() {
    }

    @C12438n("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffCommonFacility bffCommonFacility, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffCommonFacility.f100676id != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffCommonFacility.f100676id);
        }
        if (dVar.mo24897A(fVar, 1) || bffCommonFacility.name != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffCommonFacility.name);
        }
        if (dVar.mo24897A(fVar, 2) || bffCommonFacility.label != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffCommonFacility.label);
        }
        if (dVar.mo24897A(fVar, 3) || bffCommonFacility.description != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffCommonFacility.description);
        }
        if (dVar.mo24897A(fVar, 4) || bffCommonFacility.gln != null) {
            dVar.mo24912i(fVar, 4, C12310s1.f30117a, bffCommonFacility.gln);
        }
        if (dVar.mo24897A(fVar, 5) || bffCommonFacility.displayableUrlId != null) {
            dVar.mo24912i(fVar, 5, C12310s1.f30117a, bffCommonFacility.displayableUrlId);
        }
        if (dVar.mo24897A(fVar, 6) || bffCommonFacility.anabelKey != null) {
            dVar.mo24912i(fVar, 6, C12310s1.f30117a, bffCommonFacility.anabelKey);
        }
        if (dVar.mo24897A(fVar, 7) || bffCommonFacility.phoneNumber != null) {
            dVar.mo24912i(fVar, 7, C12310s1.f30117a, bffCommonFacility.phoneNumber);
        }
        if (dVar.mo24897A(fVar, 8) || bffCommonFacility.openingWeekPattern != null) {
            dVar.mo24912i(fVar, 8, gVarArr[8], bffCommonFacility.openingWeekPattern);
        }
        if (dVar.mo24897A(fVar, 9) || bffCommonFacility.openingExceptionCalendar != null) {
            dVar.mo24912i(fVar, 9, gVarArr[9], bffCommonFacility.openingExceptionCalendar);
        }
        if (dVar.mo24897A(fVar, 10) || bffCommonFacility.distance != null) {
            dVar.mo24912i(fVar, 10, C12310s1.f30117a, bffCommonFacility.distance);
        }
        if (dVar.mo24897A(fVar, 11) || bffCommonFacility.address != null) {
            dVar.mo24912i(fVar, 11, BffFacilityAddress$$serializer.INSTANCE, bffCommonFacility.address);
        }
        if (dVar.mo24897A(fVar, 12) || bffCommonFacility.banner != null) {
            dVar.mo24912i(fVar, 12, C12310s1.f30117a, bffCommonFacility.banner);
        }
        if (dVar.mo24897A(fVar, 13) || bffCommonFacility.format != null) {
            dVar.mo24912i(fVar, 13, C12310s1.f30117a, bffCommonFacility.format);
        }
        if (dVar.mo24897A(fVar, 14) || bffCommonFacility.type != null) {
            dVar.mo24912i(fVar, 14, C12310s1.f30117a, bffCommonFacility.type);
        }
        if (dVar.mo24897A(fVar, 15) || bffCommonFacility.status != null) {
            dVar.mo24912i(fVar, 15, C12310s1.f30117a, bffCommonFacility.status);
        }
        if (dVar.mo24897A(fVar, 16) || bffCommonFacility.openingDate != null) {
            dVar.mo24912i(fVar, 16, C12310s1.f30117a, bffCommonFacility.openingDate);
        }
        if (dVar.mo24897A(fVar, 17) || bffCommonFacility.closingDate != null) {
            dVar.mo24912i(fVar, 17, C12310s1.f30117a, bffCommonFacility.closingDate);
        }
        if (dVar.mo24897A(fVar, 18) || bffCommonFacility.services != null) {
            dVar.mo24912i(fVar, 18, gVarArr[18], bffCommonFacility.services);
        }
        if (dVar.mo24897A(fVar, 19) || bffCommonFacility.embeddedFacilities != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 19, gVarArr[19], bffCommonFacility.embeddedFacilities);
        }
    }

    @C12580l
    public final String component1() {
        return this.f100676id;
    }

    @C12580l
    public final List<BffExceptionCalendar> component10() {
        return this.openingExceptionCalendar;
    }

    @C12580l
    public final String component11() {
        return this.distance;
    }

    @C12580l
    public final BffFacilityAddress component12() {
        return this.address;
    }

    @C12580l
    public final String component13() {
        return this.banner;
    }

    @C12580l
    public final String component14() {
        return this.format;
    }

    @C12580l
    public final String component15() {
        return this.type;
    }

    @C12580l
    public final String component16() {
        return this.status;
    }

    @C12580l
    public final String component17() {
        return this.openingDate;
    }

    @C12580l
    public final String component18() {
        return this.closingDate;
    }

    @C12580l
    public final List<BffServiceStore> component19() {
        return this.services;
    }

    @C12580l
    public final String component2() {
        return this.name;
    }

    @C12580l
    public final List<BffCommonFacility> component20() {
        return this.embeddedFacilities;
    }

    @C12580l
    public final String component3() {
        return this.label;
    }

    @C12580l
    public final String component4() {
        return this.description;
    }

    @C12580l
    public final String component5() {
        return this.gln;
    }

    @C12580l
    public final String component6() {
        return this.displayableUrlId;
    }

    @C12580l
    public final String component7() {
        return this.anabelKey;
    }

    @C12580l
    public final String component8() {
        return this.phoneNumber;
    }

    @C12580l
    public final List<BffWeekPattern> component9() {
        return this.openingWeekPattern;
    }

    @C12579k
    public final BffCommonFacility copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l List<BffWeekPattern> list, @C12580l List<BffExceptionCalendar> list2, @C12580l String str9, @C12580l BffFacilityAddress bffFacilityAddress, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l List<BffServiceStore> list3, @C12580l List<BffCommonFacility> list4) {
        return new BffCommonFacility(str, str2, str3, str4, str5, str6, str7, str8, list, list2, str9, bffFacilityAddress, str10, str11, str12, str13, str14, str15, list3, list4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffCommonFacility)) {
            return false;
        }
        BffCommonFacility bffCommonFacility = (BffCommonFacility) obj;
        return Intrinsics.areEqual((Object) this.f100676id, (Object) bffCommonFacility.f100676id) && Intrinsics.areEqual((Object) this.name, (Object) bffCommonFacility.name) && Intrinsics.areEqual((Object) this.label, (Object) bffCommonFacility.label) && Intrinsics.areEqual((Object) this.description, (Object) bffCommonFacility.description) && Intrinsics.areEqual((Object) this.gln, (Object) bffCommonFacility.gln) && Intrinsics.areEqual((Object) this.displayableUrlId, (Object) bffCommonFacility.displayableUrlId) && Intrinsics.areEqual((Object) this.anabelKey, (Object) bffCommonFacility.anabelKey) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) bffCommonFacility.phoneNumber) && Intrinsics.areEqual((Object) this.openingWeekPattern, (Object) bffCommonFacility.openingWeekPattern) && Intrinsics.areEqual((Object) this.openingExceptionCalendar, (Object) bffCommonFacility.openingExceptionCalendar) && Intrinsics.areEqual((Object) this.distance, (Object) bffCommonFacility.distance) && Intrinsics.areEqual((Object) this.address, (Object) bffCommonFacility.address) && Intrinsics.areEqual((Object) this.banner, (Object) bffCommonFacility.banner) && Intrinsics.areEqual((Object) this.format, (Object) bffCommonFacility.format) && Intrinsics.areEqual((Object) this.type, (Object) bffCommonFacility.type) && Intrinsics.areEqual((Object) this.status, (Object) bffCommonFacility.status) && Intrinsics.areEqual((Object) this.openingDate, (Object) bffCommonFacility.openingDate) && Intrinsics.areEqual((Object) this.closingDate, (Object) bffCommonFacility.closingDate) && Intrinsics.areEqual((Object) this.services, (Object) bffCommonFacility.services) && Intrinsics.areEqual((Object) this.embeddedFacilities, (Object) bffCommonFacility.embeddedFacilities);
    }

    @C12580l
    public final BffFacilityAddress getAddress() {
        return this.address;
    }

    @C12580l
    public final String getAnabelKey() {
        return this.anabelKey;
    }

    @C12580l
    public final String getBanner() {
        return this.banner;
    }

    @C12580l
    public final String getClosingDate() {
        return this.closingDate;
    }

    @C12580l
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final String getDisplayableUrlId() {
        return this.displayableUrlId;
    }

    @C12580l
    public final String getDistance() {
        return this.distance;
    }

    @C12580l
    public final List<BffCommonFacility> getEmbeddedFacilities() {
        return this.embeddedFacilities;
    }

    @C12580l
    public final String getFormat() {
        return this.format;
    }

    @C12580l
    public final String getGln() {
        return this.gln;
    }

    @C12580l
    public final String getId() {
        return this.f100676id;
    }

    @C12580l
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    @C12580l
    public final String getOpeningDate() {
        return this.openingDate;
    }

    @C12580l
    public final List<BffExceptionCalendar> getOpeningExceptionCalendar() {
        return this.openingExceptionCalendar;
    }

    @C12580l
    public final List<BffWeekPattern> getOpeningWeekPattern() {
        return this.openingWeekPattern;
    }

    @C12580l
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @C12580l
    public final List<BffServiceStore> getServices() {
        return this.services;
    }

    @C12580l
    public final String getStatus() {
        return this.status;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.f100676id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gln;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayableUrlId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.anabelKey;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.phoneNumber;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<BffWeekPattern> list = this.openingWeekPattern;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<BffExceptionCalendar> list2 = this.openingExceptionCalendar;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str9 = this.distance;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BffFacilityAddress bffFacilityAddress = this.address;
        int hashCode12 = (hashCode11 + (bffFacilityAddress == null ? 0 : bffFacilityAddress.hashCode())) * 31;
        String str10 = this.banner;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.format;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.type;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.status;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.openingDate;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.closingDate;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<BffServiceStore> list3 = this.services;
        int hashCode19 = (hashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BffCommonFacility> list4 = this.embeddedFacilities;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode19 + i;
    }

    @C12579k
    public String toString() {
        String str = this.f100676id;
        String str2 = this.name;
        String str3 = this.label;
        String str4 = this.description;
        String str5 = this.gln;
        String str6 = this.displayableUrlId;
        String str7 = this.anabelKey;
        String str8 = this.phoneNumber;
        List<BffWeekPattern> list = this.openingWeekPattern;
        List<BffExceptionCalendar> list2 = this.openingExceptionCalendar;
        String str9 = this.distance;
        BffFacilityAddress bffFacilityAddress = this.address;
        String str10 = this.banner;
        String str11 = this.format;
        String str12 = this.type;
        String str13 = this.status;
        String str14 = this.openingDate;
        String str15 = this.closingDate;
        List<BffServiceStore> list3 = this.services;
        List<BffCommonFacility> list4 = this.embeddedFacilities;
        return "BffCommonFacility(id=" + str + ", name=" + str2 + ", label=" + str3 + ", description=" + str4 + ", gln=" + str5 + ", displayableUrlId=" + str6 + ", anabelKey=" + str7 + ", phoneNumber=" + str8 + ", openingWeekPattern=" + list + ", openingExceptionCalendar=" + list2 + ", distance=" + str9 + ", address=" + bffFacilityAddress + ", banner=" + str10 + ", format=" + str11 + ", type=" + str12 + ", status=" + str13 + ", openingDate=" + str14 + ", closingDate=" + str15 + ", services=" + list3 + ", embeddedFacilities=" + list4 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffCommonFacility(int i, @C12438n("id") String str, @C12438n("name") String str2, @C12438n("label") String str3, @C12438n("description") String str4, @C12438n("gln") String str5, @C12438n("displayable_url_id") String str6, @C12438n("anabel_key") String str7, @C12438n("phone_number") String str8, @C12438n("opening_week_pattern") List list, @C12438n("opening_exception_calendar") List list2, @C12438n("distance") String str9, @C12438n("address") BffFacilityAddress bffFacilityAddress, @C12438n("banner") String str10, @C12438n("format") String str11, @C12438n("type") String str12, @C12438n("status") String str13, @C12438n("opening_date") String str14, @C12438n("closing_date") String str15, @C12438n("services") List list3, @C12438n("embedded_facilities") List list4, C12295n1 n1Var) {
        int i2 = i;
        if ((i2 & 0) != 0) {
            C12261c1.m49256b(i, 0, BffCommonFacility$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.f100676id = null;
        } else {
            this.f100676id = str;
        }
        if ((i2 & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i2 & 4) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
        if ((i2 & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i2 & 16) == 0) {
            this.gln = null;
        } else {
            this.gln = str5;
        }
        if ((i2 & 32) == 0) {
            this.displayableUrlId = null;
        } else {
            this.displayableUrlId = str6;
        }
        if ((i2 & 64) == 0) {
            this.anabelKey = null;
        } else {
            this.anabelKey = str7;
        }
        if ((i2 & 128) == 0) {
            this.phoneNumber = null;
        } else {
            this.phoneNumber = str8;
        }
        if ((i2 & 256) == 0) {
            this.openingWeekPattern = null;
        } else {
            this.openingWeekPattern = list;
        }
        if ((i2 & 512) == 0) {
            this.openingExceptionCalendar = null;
        } else {
            this.openingExceptionCalendar = list2;
        }
        if ((i2 & 1024) == 0) {
            this.distance = null;
        } else {
            this.distance = str9;
        }
        if ((i2 & 2048) == 0) {
            this.address = null;
        } else {
            this.address = bffFacilityAddress;
        }
        if ((i2 & 4096) == 0) {
            this.banner = null;
        } else {
            this.banner = str10;
        }
        if ((i2 & 8192) == 0) {
            this.format = null;
        } else {
            this.format = str11;
        }
        if ((i2 & 16384) == 0) {
            this.type = null;
        } else {
            this.type = str12;
        }
        if ((32768 & i2) == 0) {
            this.status = null;
        } else {
            this.status = str13;
        }
        if ((65536 & i2) == 0) {
            this.openingDate = null;
        } else {
            this.openingDate = str14;
        }
        if ((131072 & i2) == 0) {
            this.closingDate = null;
        } else {
            this.closingDate = str15;
        }
        if ((262144 & i2) == 0) {
            this.services = null;
        } else {
            this.services = list3;
        }
        if ((i2 & 524288) == 0) {
            this.embeddedFacilities = null;
        } else {
            this.embeddedFacilities = list4;
        }
    }

    public BffCommonFacility(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l String str6, @C12580l String str7, @C12580l String str8, @C12580l List<BffWeekPattern> list, @C12580l List<BffExceptionCalendar> list2, @C12580l String str9, @C12580l BffFacilityAddress bffFacilityAddress, @C12580l String str10, @C12580l String str11, @C12580l String str12, @C12580l String str13, @C12580l String str14, @C12580l String str15, @C12580l List<BffServiceStore> list3, @C12580l List<BffCommonFacility> list4) {
        this.f100676id = str;
        this.name = str2;
        this.label = str3;
        this.description = str4;
        this.gln = str5;
        this.displayableUrlId = str6;
        this.anabelKey = str7;
        this.phoneNumber = str8;
        this.openingWeekPattern = list;
        this.openingExceptionCalendar = list2;
        this.distance = str9;
        this.address = bffFacilityAddress;
        this.banner = str10;
        this.format = str11;
        this.type = str12;
        this.status = str13;
        this.openingDate = str14;
        this.closingDate = str15;
        this.services = list3;
        this.embeddedFacilities = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffCommonFacility(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.List r30, java.util.List r31, java.lang.String r32, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.List r40, java.util.List r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffCommonFacility.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, com.carrefour.fid.android.bff_data_shared.data.api.entities.BffFacilityAddress, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
