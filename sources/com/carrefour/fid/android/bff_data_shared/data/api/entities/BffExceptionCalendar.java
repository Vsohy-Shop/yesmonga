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

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 22\u00020\u0001:\u000232BI\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b,\u0010-B]\b\u0017\u0012\u0006\u0010.\u001a\u00020\u0018\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b,\u00101J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003JK\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u001fR\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u001fR\"\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001d\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010\u001fR(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010(\u0012\u0004\b+\u0010!\u001a\u0004\b)\u0010*¨\u00064"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffExceptionCalendar;", "", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/f;", "serialDesc", "Lkotlin/d2;", "write$Self", "", "component1", "component2", "component3", "component4", "", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffTimeRange;", "component5", "dateKey", "statusCode", "eventTypeCode", "eventDesc", "dayTimeRanges", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDateKey", "()Ljava/lang/String;", "getDateKey$annotations", "()V", "getStatusCode", "getStatusCode$annotations", "getEventTypeCode", "getEventTypeCode$annotations", "getEventDesc", "getEventDesc$annotations", "Ljava/util/List;", "getDayTimeRanges", "()Ljava/util/List;", "getDayTimeRanges$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/n1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/n1;)V", "Companion", "$serializer", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12439o
public final class BffExceptionCalendar {
    /* access modifiers changed from: private */
    @C12579k
    @C11287e
    public static final C12248g<Object>[] $childSerializers = {null, null, null, null, new C12269f(BffTimeRange$$serializer.INSTANCE)};
    @C12579k
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @C12580l
    private final String dateKey;
    @C12580l
    private final List<BffTimeRange> dayTimeRanges;
    @C12580l
    private final String eventDesc;
    @C12580l
    private final String eventTypeCode;
    @C12580l
    private final String statusCode;

    @C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffExceptionCalendar$Companion;", "", "Lkotlinx/serialization/g;", "Lcom/carrefour/fid/android/bff_data_shared/data/api/entities/BffExceptionCalendar;", "serializer", "<init>", "()V", "bff-data-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<BffExceptionCalendar> serializer() {
            return BffExceptionCalendar$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BffExceptionCalendar() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BffExceptionCalendar copy$default(BffExceptionCalendar bffExceptionCalendar, String str, String str2, String str3, String str4, List<BffTimeRange> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bffExceptionCalendar.dateKey;
        }
        if ((i & 2) != 0) {
            str2 = bffExceptionCalendar.statusCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = bffExceptionCalendar.eventTypeCode;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = bffExceptionCalendar.eventDesc;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = bffExceptionCalendar.dayTimeRanges;
        }
        return bffExceptionCalendar.copy(str, str5, str6, str7, list);
    }

    @C12438n("date_key")
    public static /* synthetic */ void getDateKey$annotations() {
    }

    @C12438n("day_time_ranges")
    public static /* synthetic */ void getDayTimeRanges$annotations() {
    }

    @C12438n("event_desc")
    public static /* synthetic */ void getEventDesc$annotations() {
    }

    @C12438n("event_type_code")
    public static /* synthetic */ void getEventTypeCode$annotations() {
    }

    @C12438n("status_code")
    public static /* synthetic */ void getStatusCode$annotations() {
    }

    @C11384m
    public static final /* synthetic */ void write$Self(BffExceptionCalendar bffExceptionCalendar, C12239d dVar, C12217f fVar) {
        C12248g<Object>[] gVarArr = $childSerializers;
        boolean z = false;
        if (dVar.mo24897A(fVar, 0) || bffExceptionCalendar.dateKey != null) {
            dVar.mo24912i(fVar, 0, C12310s1.f30117a, bffExceptionCalendar.dateKey);
        }
        if (dVar.mo24897A(fVar, 1) || bffExceptionCalendar.statusCode != null) {
            dVar.mo24912i(fVar, 1, C12310s1.f30117a, bffExceptionCalendar.statusCode);
        }
        if (dVar.mo24897A(fVar, 2) || bffExceptionCalendar.eventTypeCode != null) {
            dVar.mo24912i(fVar, 2, C12310s1.f30117a, bffExceptionCalendar.eventTypeCode);
        }
        if (dVar.mo24897A(fVar, 3) || bffExceptionCalendar.eventDesc != null) {
            dVar.mo24912i(fVar, 3, C12310s1.f30117a, bffExceptionCalendar.eventDesc);
        }
        if (dVar.mo24897A(fVar, 4) || bffExceptionCalendar.dayTimeRanges != null) {
            z = true;
        }
        if (z) {
            dVar.mo24912i(fVar, 4, gVarArr[4], bffExceptionCalendar.dayTimeRanges);
        }
    }

    @C12580l
    public final String component1() {
        return this.dateKey;
    }

    @C12580l
    public final String component2() {
        return this.statusCode;
    }

    @C12580l
    public final String component3() {
        return this.eventTypeCode;
    }

    @C12580l
    public final String component4() {
        return this.eventDesc;
    }

    @C12580l
    public final List<BffTimeRange> component5() {
        return this.dayTimeRanges;
    }

    @C12579k
    public final BffExceptionCalendar copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l List<BffTimeRange> list) {
        return new BffExceptionCalendar(str, str2, str3, str4, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffExceptionCalendar)) {
            return false;
        }
        BffExceptionCalendar bffExceptionCalendar = (BffExceptionCalendar) obj;
        return Intrinsics.areEqual((Object) this.dateKey, (Object) bffExceptionCalendar.dateKey) && Intrinsics.areEqual((Object) this.statusCode, (Object) bffExceptionCalendar.statusCode) && Intrinsics.areEqual((Object) this.eventTypeCode, (Object) bffExceptionCalendar.eventTypeCode) && Intrinsics.areEqual((Object) this.eventDesc, (Object) bffExceptionCalendar.eventDesc) && Intrinsics.areEqual((Object) this.dayTimeRanges, (Object) bffExceptionCalendar.dayTimeRanges);
    }

    @C12580l
    public final String getDateKey() {
        return this.dateKey;
    }

    @C12580l
    public final List<BffTimeRange> getDayTimeRanges() {
        return this.dayTimeRanges;
    }

    @C12580l
    public final String getEventDesc() {
        return this.eventDesc;
    }

    @C12580l
    public final String getEventTypeCode() {
        return this.eventTypeCode;
    }

    @C12580l
    public final String getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.dateKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.statusCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventTypeCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventDesc;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<BffTimeRange> list = this.dayTimeRanges;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.dateKey;
        String str2 = this.statusCode;
        String str3 = this.eventTypeCode;
        String str4 = this.eventDesc;
        List<BffTimeRange> list = this.dayTimeRanges;
        return "BffExceptionCalendar(dateKey=" + str + ", statusCode=" + str2 + ", eventTypeCode=" + str3 + ", eventDesc=" + str4 + ", dayTimeRanges=" + list + ")";
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @C11587t0(expression = "", imports = {}))
    public /* synthetic */ BffExceptionCalendar(int i, @C12438n("date_key") String str, @C12438n("status_code") String str2, @C12438n("event_type_code") String str3, @C12438n("event_desc") String str4, @C12438n("day_time_ranges") List list, C12295n1 n1Var) {
        if ((i & 0) != 0) {
            C12261c1.m49256b(i, 0, BffExceptionCalendar$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.dateKey = null;
        } else {
            this.dateKey = str;
        }
        if ((i & 2) == 0) {
            this.statusCode = null;
        } else {
            this.statusCode = str2;
        }
        if ((i & 4) == 0) {
            this.eventTypeCode = null;
        } else {
            this.eventTypeCode = str3;
        }
        if ((i & 8) == 0) {
            this.eventDesc = null;
        } else {
            this.eventDesc = str4;
        }
        if ((i & 16) == 0) {
            this.dayTimeRanges = null;
        } else {
            this.dayTimeRanges = list;
        }
    }

    public BffExceptionCalendar(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l List<BffTimeRange> list) {
        this.dateKey = str;
        this.statusCode = str2;
        this.eventTypeCode = str3;
        this.eventDesc = str4;
        this.dayTimeRanges = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffExceptionCalendar(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.bff_data_shared.data.api.entities.BffExceptionCalendar.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
