package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/OpeningPatternResponse;", "", "patternId", "", "beginDate", "", "endDate", "mondayTimeRange", "", "Lcom/carrefour/fid/android/service/data/api/entities/DayTimeRangeResponse;", "tuesayTimeRange", "wednesdayTimeRange", "thursdayTimeRange", "fridayTimeRange", "saturdayTimeRange", "sundayTimeRange", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBeginDate", "()Ljava/lang/String;", "getEndDate", "getFridayTimeRange", "()Ljava/util/List;", "getMondayTimeRange", "getPatternId", "()I", "getSaturdayTimeRange", "getSundayTimeRange", "getThursdayTimeRange", "getTuesayTimeRange", "getWednesdayTimeRange", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OpeningPatternResponse {
    @C33608c("beg_date")
    @C12579k
    private final String beginDate;
    @C33608c("end_date")
    @C12579k
    private final String endDate;
    @C33608c("friday_time_ranges")
    @C12579k
    private final List<DayTimeRangeResponse> fridayTimeRange;
    @C33608c("monday_time_ranges")
    @C12579k
    private final List<DayTimeRangeResponse> mondayTimeRange;
    @C33608c("pattern_id")
    private final int patternId;
    @C33608c("saturday_time_ranges")
    @C12579k
    private final List<DayTimeRangeResponse> saturdayTimeRange;
    @C33608c("sunday_time_ranges")
    @C12579k
    private final List<DayTimeRangeResponse> sundayTimeRange;
    @C33608c("thursday_time_ranges")
    @C12579k
    private final List<DayTimeRangeResponse> thursdayTimeRange;
    @C33608c("tuesday_time_ranges")
    @C12579k
    private final List<DayTimeRangeResponse> tuesayTimeRange;
    @C33608c("wednesday_time_ranges")
    @C12579k
    private final List<DayTimeRangeResponse> wednesdayTimeRange;

    public OpeningPatternResponse() {
        this(0, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OpeningPatternResponse copy$default(OpeningPatternResponse openingPatternResponse, int i, String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i2, Object obj) {
        OpeningPatternResponse openingPatternResponse2 = openingPatternResponse;
        int i3 = i2;
        return openingPatternResponse.copy((i3 & 1) != 0 ? openingPatternResponse2.patternId : i, (i3 & 2) != 0 ? openingPatternResponse2.beginDate : str, (i3 & 4) != 0 ? openingPatternResponse2.endDate : str2, (i3 & 8) != 0 ? openingPatternResponse2.mondayTimeRange : list, (i3 & 16) != 0 ? openingPatternResponse2.tuesayTimeRange : list2, (i3 & 32) != 0 ? openingPatternResponse2.wednesdayTimeRange : list3, (i3 & 64) != 0 ? openingPatternResponse2.thursdayTimeRange : list4, (i3 & 128) != 0 ? openingPatternResponse2.fridayTimeRange : list5, (i3 & 256) != 0 ? openingPatternResponse2.saturdayTimeRange : list6, (i3 & 512) != 0 ? openingPatternResponse2.sundayTimeRange : list7);
    }

    public final int component1() {
        return this.patternId;
    }

    @C12579k
    public final List<DayTimeRangeResponse> component10() {
        return this.sundayTimeRange;
    }

    @C12579k
    public final String component2() {
        return this.beginDate;
    }

    @C12579k
    public final String component3() {
        return this.endDate;
    }

    @C12579k
    public final List<DayTimeRangeResponse> component4() {
        return this.mondayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> component5() {
        return this.tuesayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> component6() {
        return this.wednesdayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> component7() {
        return this.thursdayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> component8() {
        return this.fridayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> component9() {
        return this.saturdayTimeRange;
    }

    @C12579k
    public final OpeningPatternResponse copy(int i, @C12579k String str, @C12579k String str2, @C12579k List<DayTimeRangeResponse> list, @C12579k List<DayTimeRangeResponse> list2, @C12579k List<DayTimeRangeResponse> list3, @C12579k List<DayTimeRangeResponse> list4, @C12579k List<DayTimeRangeResponse> list5, @C12579k List<DayTimeRangeResponse> list6, @C12579k List<DayTimeRangeResponse> list7) {
        Intrinsics.checkNotNullParameter(str, "beginDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        List<DayTimeRangeResponse> list8 = list;
        Intrinsics.checkNotNullParameter(list8, "mondayTimeRange");
        List<DayTimeRangeResponse> list9 = list2;
        Intrinsics.checkNotNullParameter(list9, "tuesayTimeRange");
        List<DayTimeRangeResponse> list10 = list3;
        Intrinsics.checkNotNullParameter(list10, "wednesdayTimeRange");
        List<DayTimeRangeResponse> list11 = list4;
        Intrinsics.checkNotNullParameter(list11, "thursdayTimeRange");
        List<DayTimeRangeResponse> list12 = list5;
        Intrinsics.checkNotNullParameter(list12, "fridayTimeRange");
        List<DayTimeRangeResponse> list13 = list6;
        Intrinsics.checkNotNullParameter(list13, "saturdayTimeRange");
        List<DayTimeRangeResponse> list14 = list7;
        Intrinsics.checkNotNullParameter(list14, "sundayTimeRange");
        return new OpeningPatternResponse(i, str, str2, list8, list9, list10, list11, list12, list13, list14);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpeningPatternResponse)) {
            return false;
        }
        OpeningPatternResponse openingPatternResponse = (OpeningPatternResponse) obj;
        return this.patternId == openingPatternResponse.patternId && Intrinsics.areEqual((Object) this.beginDate, (Object) openingPatternResponse.beginDate) && Intrinsics.areEqual((Object) this.endDate, (Object) openingPatternResponse.endDate) && Intrinsics.areEqual((Object) this.mondayTimeRange, (Object) openingPatternResponse.mondayTimeRange) && Intrinsics.areEqual((Object) this.tuesayTimeRange, (Object) openingPatternResponse.tuesayTimeRange) && Intrinsics.areEqual((Object) this.wednesdayTimeRange, (Object) openingPatternResponse.wednesdayTimeRange) && Intrinsics.areEqual((Object) this.thursdayTimeRange, (Object) openingPatternResponse.thursdayTimeRange) && Intrinsics.areEqual((Object) this.fridayTimeRange, (Object) openingPatternResponse.fridayTimeRange) && Intrinsics.areEqual((Object) this.saturdayTimeRange, (Object) openingPatternResponse.saturdayTimeRange) && Intrinsics.areEqual((Object) this.sundayTimeRange, (Object) openingPatternResponse.sundayTimeRange);
    }

    @C12579k
    public final String getBeginDate() {
        return this.beginDate;
    }

    @C12579k
    public final String getEndDate() {
        return this.endDate;
    }

    @C12579k
    public final List<DayTimeRangeResponse> getFridayTimeRange() {
        return this.fridayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> getMondayTimeRange() {
        return this.mondayTimeRange;
    }

    public final int getPatternId() {
        return this.patternId;
    }

    @C12579k
    public final List<DayTimeRangeResponse> getSaturdayTimeRange() {
        return this.saturdayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> getSundayTimeRange() {
        return this.sundayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> getThursdayTimeRange() {
        return this.thursdayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> getTuesayTimeRange() {
        return this.tuesayTimeRange;
    }

    @C12579k
    public final List<DayTimeRangeResponse> getWednesdayTimeRange() {
        return this.wednesdayTimeRange;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.patternId) * 31) + this.beginDate.hashCode()) * 31) + this.endDate.hashCode()) * 31) + this.mondayTimeRange.hashCode()) * 31) + this.tuesayTimeRange.hashCode()) * 31) + this.wednesdayTimeRange.hashCode()) * 31) + this.thursdayTimeRange.hashCode()) * 31) + this.fridayTimeRange.hashCode()) * 31) + this.saturdayTimeRange.hashCode()) * 31) + this.sundayTimeRange.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.patternId;
        String str = this.beginDate;
        String str2 = this.endDate;
        List<DayTimeRangeResponse> list = this.mondayTimeRange;
        List<DayTimeRangeResponse> list2 = this.tuesayTimeRange;
        List<DayTimeRangeResponse> list3 = this.wednesdayTimeRange;
        List<DayTimeRangeResponse> list4 = this.thursdayTimeRange;
        List<DayTimeRangeResponse> list5 = this.fridayTimeRange;
        List<DayTimeRangeResponse> list6 = this.saturdayTimeRange;
        List<DayTimeRangeResponse> list7 = this.sundayTimeRange;
        return "OpeningPatternResponse(patternId=" + i + ", beginDate=" + str + ", endDate=" + str2 + ", mondayTimeRange=" + list + ", tuesayTimeRange=" + list2 + ", wednesdayTimeRange=" + list3 + ", thursdayTimeRange=" + list4 + ", fridayTimeRange=" + list5 + ", saturdayTimeRange=" + list6 + ", sundayTimeRange=" + list7 + ")";
    }

    public OpeningPatternResponse(int i, @C12579k String str, @C12579k String str2, @C12579k List<DayTimeRangeResponse> list, @C12579k List<DayTimeRangeResponse> list2, @C12579k List<DayTimeRangeResponse> list3, @C12579k List<DayTimeRangeResponse> list4, @C12579k List<DayTimeRangeResponse> list5, @C12579k List<DayTimeRangeResponse> list6, @C12579k List<DayTimeRangeResponse> list7) {
        Intrinsics.checkNotNullParameter(str, "beginDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        Intrinsics.checkNotNullParameter(list, "mondayTimeRange");
        Intrinsics.checkNotNullParameter(list2, "tuesayTimeRange");
        Intrinsics.checkNotNullParameter(list3, "wednesdayTimeRange");
        Intrinsics.checkNotNullParameter(list4, "thursdayTimeRange");
        Intrinsics.checkNotNullParameter(list5, "fridayTimeRange");
        Intrinsics.checkNotNullParameter(list6, "saturdayTimeRange");
        Intrinsics.checkNotNullParameter(list7, "sundayTimeRange");
        this.patternId = i;
        this.beginDate = str;
        this.endDate = str2;
        this.mondayTimeRange = list;
        this.tuesayTimeRange = list2;
        this.wednesdayTimeRange = list3;
        this.thursdayTimeRange = list4;
        this.fridayTimeRange = list5;
        this.saturdayTimeRange = list6;
        this.sundayTimeRange = list7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OpeningPatternResponse(int r11, java.lang.String r12, java.lang.String r13, java.util.List r14, java.util.List r15, java.util.List r16, java.util.List r17, java.util.List r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0009
        L_0x0008:
            r1 = r11
        L_0x0009:
            r2 = r0 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = r13
        L_0x0018:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0021
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0022
        L_0x0021:
            r4 = r14
        L_0x0022:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002b
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x002c
        L_0x002b:
            r5 = r15
        L_0x002c:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0035
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0037
        L_0x0035:
            r6 = r16
        L_0x0037:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0040
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0042
        L_0x0040:
            r7 = r17
        L_0x0042:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x004b
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x004d
        L_0x004b:
            r8 = r18
        L_0x004d:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0056
            java.util.List r9 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0058
        L_0x0056:
            r9 = r19
        L_0x0058:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0061
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0063
        L_0x0061:
            r0 = r20
        L_0x0063:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.entities.OpeningPatternResponse.<init>(int, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
