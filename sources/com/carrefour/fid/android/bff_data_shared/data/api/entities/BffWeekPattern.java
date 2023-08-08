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
import kotlinx.serialization.internal.C12276h0;
import kotlinx.serialization.internal.C12295n1;
import kotlinx.serialization.internal.C12310s1;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 I2\u00020\u0001:\u0002JIB©\u0001\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\bC\u0010DB½\u0001\b\u0017\u0012\u0006\u0010E\u001a\u00020\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bC\u0010HJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J²\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u000bR\"\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R\"\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010-\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010/R(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u00103\u0012\u0004\b6\u0010,\u001a\u0004\b4\u00105R(\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u00103\u0012\u0004\b8\u0010,\u001a\u0004\b7\u00105R(\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u00103\u0012\u0004\b:\u0010,\u001a\u0004\b9\u00105R(\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u00103\u0012\u0004\b<\u0010,\u001a\u0004\b;\u00105R(\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00103\u0012\u0004\b>\u0010,\u001a\u0004\b=\u00105R(\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b \u00103\u0012\u0004\b@\u0010,\u001a\u0004\b?\u00105R(\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u00103\u0012\u0004\bB\u0010,\u001a\u0004\bA\u00105¨\u0006K"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "()Ljava/lang/Integer;", "", "component2", "component3", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeRange;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "patternId", "begDate", "endDate", "mondayTimeRanges", "tuesdayTimeRanges", "wednesdayTimeRanges", "thursdayTimeRanges", "fridayTimeRanges", "saturdayTimeRanges", "sundayTimeRanges", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Integer;", "getPatternId", "getPatternId$annotations", "()V", "Ljava/lang/String;", "getBegDate", "()Ljava/lang/String;", "getBegDate$annotations", "getEndDate", "getEndDate$annotations", "Ljava/util/List;", "getMondayTimeRanges", "()Ljava/util/List;", "getMondayTimeRanges$annotations", "getTuesdayTimeRanges", "getTuesdayTimeRanges$annotations", "getWednesdayTimeRanges", "getWednesdayTimeRanges$annotations", "getThursdayTimeRanges", "getThursdayTimeRanges$annotations", "getFridayTimeRanges", "getFridayTimeRanges$annotations", "getSaturdayTimeRanges", "getSaturdayTimeRanges$annotations", "getSundayTimeRanges", "getSundayTimeRanges$annotations", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffWeekPattern {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers;
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String begDate;
    @C12580l
    private final String endDate;
    @C12580l
    private final List<BffTimeRange> fridayTimeRanges;
    @C12580l
    private final List<BffTimeRange> mondayTimeRanges;
    @C12580l
    private final Integer patternId;
    @C12580l
    private final List<BffTimeRange> saturdayTimeRanges;
    @C12580l
    private final List<BffTimeRange> sundayTimeRanges;
    @C12580l
    private final List<BffTimeRange> thursdayTimeRanges;
    @C12580l
    private final List<BffTimeRange> tuesdayTimeRanges;
    @C12580l
    private final List<BffTimeRange> wednesdayTimeRanges;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffWeekPattern;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffWeekPattern> serializer() {
            return BffWeekPattern$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        BffTimeRange$$serializer bffTimeRange$$serializer = BffTimeRange$$serializer.INSTANCE;
        $childSerializers = new C12248g[]{null, null, null, new C12269f(bffTimeRange$$serializer), new C12269f(bffTimeRange$$serializer), new C12269f(bffTimeRange$$serializer), new C12269f(bffTimeRange$$serializer), new C12269f(bffTimeRange$$serializer), new C12269f(bffTimeRange$$serializer), new C12269f(bffTimeRange$$serializer)};
    }

    public BffWeekPattern() {
        this((Integer) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffWeekPattern copy$default(BffWeekPattern bffWeekPattern, Integer num, String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, Object obj) {
        BffWeekPattern bffWeekPattern2 = bffWeekPattern;
        int i2 = i;
        return bffWeekPattern.copy((i2 & 1) != 0 ? bffWeekPattern2.patternId : num, (i2 & 2) != 0 ? bffWeekPattern2.begDate : str, (i2 & 4) != 0 ? bffWeekPattern2.endDate : str2, (i2 & 8) != 0 ? bffWeekPattern2.mondayTimeRanges : list, (i2 & 16) != 0 ? bffWeekPattern2.tuesdayTimeRanges : list2, (i2 & 32) != 0 ? bffWeekPattern2.wednesdayTimeRanges : list3, (i2 & 64) != 0 ? bffWeekPattern2.thursdayTimeRanges : list4, (i2 & 128) != 0 ? bffWeekPattern2.fridayTimeRanges : list5, (i2 & 256) != 0 ? bffWeekPattern2.saturdayTimeRanges : list6, (i2 & 512) != 0 ? bffWeekPattern2.sundayTimeRanges : list7);
    }

    @C12438n("beg_date")
    public static /* synthetic */ void getBegDate$annotations() {
    }

    @C12438n("end_date")
    public static /* synthetic */ void getEndDate$annotations() {
    }

    @C12438n("friday_time_ranges")
    public static /* synthetic */ void getFridayTimeRanges$annotations() {
    }

    @C12438n("monday_time_ranges")
    public static /* synthetic */ void getMondayTimeRanges$annotations() {
    }

    @C12438n("pattern_id")
    public static /* synthetic */ void getPatternId$annotations() {
    }

    @C12438n("saturday_time_ranges")
    public static /* synthetic */ void getSaturdayTimeRanges$annotations() {
    }

    @C12438n("sunday_time_ranges")
    public static /* synthetic */ void getSundayTimeRanges$annotations() {
    }

    @C12438n("thursday_time_ranges")
    public static /* synthetic */ void getThursdayTimeRanges$annotations() {
    }

    @C12438n("tuesday_time_ranges")
    public static /* synthetic */ void getTuesdayTimeRanges$annotations() {
    }

    @C12438n("wednesday_time_ranges")
    public static /* synthetic */ void getWednesdayTimeRanges$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffWeekPattern bffWeekPattern, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffWeekPattern.patternId != null) {
            dVar.mo24912i(fVar, 0, C12276h0.f30067a, bffWeekPattern.patternId);
        }
        if (dVar.mo24897A(fVar, 1) || bffWeekPattern.begDate != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffWeekPattern.begDate);
        }
        if (dVar.mo24897A(fVar, 2) || bffWeekPattern.endDate != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffWeekPattern.endDate);
        }
        if (dVar.mo24897A(fVar, 3) || bffWeekPattern.mondayTimeRanges != null) {
            dVar.mo24912i(fVar, 3, gVarArr[3], bffWeekPattern.mondayTimeRanges);
        }
        if (dVar.mo24897A(fVar, 4) || bffWeekPattern.tuesdayTimeRanges != null) {
            dVar.mo24912i(fVar, 4, gVarArr[4], bffWeekPattern.tuesdayTimeRanges);
        }
        if (dVar.mo24897A(fVar, 5) || bffWeekPattern.wednesdayTimeRanges != null) {
            dVar.mo24912i(fVar, 5, gVarArr[5], bffWeekPattern.wednesdayTimeRanges);
        }
        if (dVar.mo24897A(fVar, 6) || bffWeekPattern.thursdayTimeRanges != null) {
            dVar.mo24912i(fVar, 6, gVarArr[6], bffWeekPattern.thursdayTimeRanges);
        }
        if (dVar.mo24897A(fVar, 7) || bffWeekPattern.fridayTimeRanges != null) {
            dVar.mo24912i(fVar, 7, gVarArr[7], bffWeekPattern.fridayTimeRanges);
        }
        if (dVar.mo24897A(fVar, 8) || bffWeekPattern.saturdayTimeRanges != null) {
            dVar.mo24912i(fVar, 8, gVarArr[8], bffWeekPattern.saturdayTimeRanges);
        }
        if (dVar.mo24897A(fVar, 9) || bffWeekPattern.sundayTimeRanges != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 9, gVarArr[9], bffWeekPattern.sundayTimeRanges);
        }
    }

    @C12580l
    public final Integer component1() {
        return this.patternId;
    }

    @C12580l
    public final List<BffTimeRange> component10() {
        return this.sundayTimeRanges;
    }

    @C12580l
    public final String component2() {
        return this.begDate;
    }

    @C12580l
    public final String component3() {
        return this.endDate;
    }

    @C12580l
    public final List<BffTimeRange> component4() {
        return this.mondayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> component5() {
        return this.tuesdayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> component6() {
        return this.wednesdayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> component7() {
        return this.thursdayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> component8() {
        return this.fridayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> component9() {
        return this.saturdayTimeRanges;
    }

    @C12579k
    public final BffWeekPattern copy(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l List<BffTimeRange> list, @C12580l List<BffTimeRange> list2, @C12580l List<BffTimeRange> list3, @C12580l List<BffTimeRange> list4, @C12580l List<BffTimeRange> list5, @C12580l List<BffTimeRange> list6, @C12580l List<BffTimeRange> list7) {
        return new BffWeekPattern(num, str, str2, list, list2, list3, list4, list5, list6, list7);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffWeekPattern)) {
            return false;
        }
        BffWeekPattern bffWeekPattern = (BffWeekPattern) obj;
        return Intrinsics.areEqual((Object) this.patternId, (Object) bffWeekPattern.patternId) && Intrinsics.areEqual((Object) this.begDate, (Object) bffWeekPattern.begDate) && Intrinsics.areEqual((Object) this.endDate, (Object) bffWeekPattern.endDate) && Intrinsics.areEqual((Object) this.mondayTimeRanges, (Object) bffWeekPattern.mondayTimeRanges) && Intrinsics.areEqual((Object) this.tuesdayTimeRanges, (Object) bffWeekPattern.tuesdayTimeRanges) && Intrinsics.areEqual((Object) this.wednesdayTimeRanges, (Object) bffWeekPattern.wednesdayTimeRanges) && Intrinsics.areEqual((Object) this.thursdayTimeRanges, (Object) bffWeekPattern.thursdayTimeRanges) && Intrinsics.areEqual((Object) this.fridayTimeRanges, (Object) bffWeekPattern.fridayTimeRanges) && Intrinsics.areEqual((Object) this.saturdayTimeRanges, (Object) bffWeekPattern.saturdayTimeRanges) && Intrinsics.areEqual((Object) this.sundayTimeRanges, (Object) bffWeekPattern.sundayTimeRanges);
    }

    @C12580l
    public final String getBegDate() {
        return this.begDate;
    }

    @C12580l
    public final String getEndDate() {
        return this.endDate;
    }

    @C12580l
    public final List<BffTimeRange> getFridayTimeRanges() {
        return this.fridayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> getMondayTimeRanges() {
        return this.mondayTimeRanges;
    }

    @C12580l
    public final Integer getPatternId() {
        return this.patternId;
    }

    @C12580l
    public final List<BffTimeRange> getSaturdayTimeRanges() {
        return this.saturdayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> getSundayTimeRanges() {
        return this.sundayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> getThursdayTimeRanges() {
        return this.thursdayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> getTuesdayTimeRanges() {
        return this.tuesdayTimeRanges;
    }

    @C12580l
    public final List<BffTimeRange> getWednesdayTimeRanges() {
        return this.wednesdayTimeRanges;
    }

    public int hashCode() {
        Integer num = this.patternId;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.begDate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endDate;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BffTimeRange> list = this.mondayTimeRanges;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<BffTimeRange> list2 = this.tuesdayTimeRanges;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BffTimeRange> list3 = this.wednesdayTimeRanges;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BffTimeRange> list4 = this.thursdayTimeRanges;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BffTimeRange> list5 = this.fridayTimeRanges;
        int hashCode8 = (hashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<BffTimeRange> list6 = this.saturdayTimeRanges;
        int hashCode9 = (hashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<BffTimeRange> list7 = this.sundayTimeRanges;
        if (list7 != null) {
            i = list7.hashCode();
        }
        return hashCode9 + i;
    }

    @C12579k
    public String toString() {
        Integer num = this.patternId;
        String str = this.begDate;
        String str2 = this.endDate;
        List<BffTimeRange> list = this.mondayTimeRanges;
        List<BffTimeRange> list2 = this.tuesdayTimeRanges;
        List<BffTimeRange> list3 = this.wednesdayTimeRanges;
        List<BffTimeRange> list4 = this.thursdayTimeRanges;
        List<BffTimeRange> list5 = this.fridayTimeRanges;
        List<BffTimeRange> list6 = this.saturdayTimeRanges;
        List<BffTimeRange> list7 = this.sundayTimeRanges;
        return "BffWeekPattern(patternId=" + num + ", begDate=" + str + ", endDate=" + str2 + ", mondayTimeRanges=" + list + ", tuesdayTimeRanges=" + list2 + ", wednesdayTimeRanges=" + list3 + ", thursdayTimeRanges=" + list4 + ", fridayTimeRanges=" + list5 + ", saturdayTimeRanges=" + list6 + ", sundayTimeRanges=" + list7 + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffWeekPattern(int i, @C12438n("pattern_id") Integer num, @C12438n("beg_date") String str, @C12438n("end_date") String str2, @C12438n("monday_time_ranges") List list, @C12438n("tuesday_time_ranges") List list2, @C12438n("wednesday_time_ranges") List list3, @C12438n("thursday_time_ranges") List list4, @C12438n("friday_time_ranges") List list5, @C12438n("saturday_time_ranges") List list6, @C12438n("sunday_time_ranges") List list7, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffWeekPattern$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.patternId = null;
        } else {
            this.patternId = num;
        }
        if ((i & 2) == 0) {
            this.begDate = null;
        } else {
            this.begDate = str;
        }
        if ((i & 4) == 0) {
            this.endDate = null;
        } else {
            this.endDate = str2;
        }
        if ((i & 8) == 0) {
            this.mondayTimeRanges = null;
        } else {
            this.mondayTimeRanges = list;
        }
        if ((i & 16) == 0) {
            this.tuesdayTimeRanges = null;
        } else {
            this.tuesdayTimeRanges = list2;
        }
        if ((i & 32) == 0) {
            this.wednesdayTimeRanges = null;
        } else {
            this.wednesdayTimeRanges = list3;
        }
        if ((i & 64) == 0) {
            this.thursdayTimeRanges = null;
        } else {
            this.thursdayTimeRanges = list4;
        }
        if ((i & 128) == 0) {
            this.fridayTimeRanges = null;
        } else {
            this.fridayTimeRanges = list5;
        }
        if ((i & 256) == 0) {
            this.saturdayTimeRanges = null;
        } else {
            this.saturdayTimeRanges = list6;
        }
        if ((i & 512) == 0) {
            this.sundayTimeRanges = null;
        } else {
            this.sundayTimeRanges = list7;
        }
    }

    public BffWeekPattern(@C12580l Integer num, @C12580l String str, @C12580l String str2, @C12580l List<BffTimeRange> list, @C12580l List<BffTimeRange> list2, @C12580l List<BffTimeRange> list3, @C12580l List<BffTimeRange> list4, @C12580l List<BffTimeRange> list5, @C12580l List<BffTimeRange> list6, @C12580l List<BffTimeRange> list7) {
        this.patternId = num;
        this.begDate = str;
        this.endDate = str2;
        this.mondayTimeRanges = list;
        this.tuesdayTimeRanges = list2;
        this.wednesdayTimeRanges = list3;
        this.thursdayTimeRanges = list4;
        this.fridayTimeRanges = list5;
        this.saturdayTimeRanges = list6;
        this.sundayTimeRanges = list7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffWeekPattern(java.lang.Integer r12, java.lang.String r13, java.lang.String r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, java.util.List r19, java.util.List r20, java.util.List r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffWeekPattern.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
