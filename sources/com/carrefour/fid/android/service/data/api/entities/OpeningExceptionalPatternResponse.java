package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/OpeningExceptionalPatternResponse;", "", "description", "", "statusCode", "typeCode", "date", "dayTimeRange", "", "Lcom/carrefour/fid/android/service/data/api/entities/DayTimeRangeResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "getDayTimeRange", "()Ljava/util/List;", "getDescription", "getStatusCode", "getTypeCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class OpeningExceptionalPatternResponse {
    @C33608c("date_key")
    @C12579k
    private final String date;
    @C33608c("day_time_ranges")
    @C12579k
    private final List<DayTimeRangeResponse> dayTimeRange;
    @C33608c("event_desc")
    @C12579k
    private final String description;
    @C33608c("status_code")
    @C12579k
    private final String statusCode;
    @C33608c("event_type_code")
    @C12579k
    private final String typeCode;

    public OpeningExceptionalPatternResponse() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OpeningExceptionalPatternResponse copy$default(OpeningExceptionalPatternResponse openingExceptionalPatternResponse, String str, String str2, String str3, String str4, List<DayTimeRangeResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openingExceptionalPatternResponse.description;
        }
        if ((i & 2) != 0) {
            str2 = openingExceptionalPatternResponse.statusCode;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = openingExceptionalPatternResponse.typeCode;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = openingExceptionalPatternResponse.date;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = openingExceptionalPatternResponse.dayTimeRange;
        }
        return openingExceptionalPatternResponse.copy(str, str5, str6, str7, list);
    }

    @C12579k
    public final String component1() {
        return this.description;
    }

    @C12579k
    public final String component2() {
        return this.statusCode;
    }

    @C12579k
    public final String component3() {
        return this.typeCode;
    }

    @C12579k
    public final String component4() {
        return this.date;
    }

    @C12579k
    public final List<DayTimeRangeResponse> component5() {
        return this.dayTimeRange;
    }

    @C12579k
    public final OpeningExceptionalPatternResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k List<DayTimeRangeResponse> list) {
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "statusCode");
        Intrinsics.checkNotNullParameter(str3, "typeCode");
        Intrinsics.checkNotNullParameter(str4, "date");
        Intrinsics.checkNotNullParameter(list, "dayTimeRange");
        return new OpeningExceptionalPatternResponse(str, str2, str3, str4, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpeningExceptionalPatternResponse)) {
            return false;
        }
        OpeningExceptionalPatternResponse openingExceptionalPatternResponse = (OpeningExceptionalPatternResponse) obj;
        return Intrinsics.areEqual((Object) this.description, (Object) openingExceptionalPatternResponse.description) && Intrinsics.areEqual((Object) this.statusCode, (Object) openingExceptionalPatternResponse.statusCode) && Intrinsics.areEqual((Object) this.typeCode, (Object) openingExceptionalPatternResponse.typeCode) && Intrinsics.areEqual((Object) this.date, (Object) openingExceptionalPatternResponse.date) && Intrinsics.areEqual((Object) this.dayTimeRange, (Object) openingExceptionalPatternResponse.dayTimeRange);
    }

    @C12579k
    public final String getDate() {
        return this.date;
    }

    @C12579k
    public final List<DayTimeRangeResponse> getDayTimeRange() {
        return this.dayTimeRange;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getStatusCode() {
        return this.statusCode;
    }

    @C12579k
    public final String getTypeCode() {
        return this.typeCode;
    }

    public int hashCode() {
        return (((((((this.description.hashCode() * 31) + this.statusCode.hashCode()) * 31) + this.typeCode.hashCode()) * 31) + this.date.hashCode()) * 31) + this.dayTimeRange.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.description;
        String str2 = this.statusCode;
        String str3 = this.typeCode;
        String str4 = this.date;
        List<DayTimeRangeResponse> list = this.dayTimeRange;
        return "OpeningExceptionalPatternResponse(description=" + str + ", statusCode=" + str2 + ", typeCode=" + str3 + ", date=" + str4 + ", dayTimeRange=" + list + ")";
    }

    public OpeningExceptionalPatternResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k List<DayTimeRangeResponse> list) {
        Intrinsics.checkNotNullParameter(str, "description");
        Intrinsics.checkNotNullParameter(str2, "statusCode");
        Intrinsics.checkNotNullParameter(str3, "typeCode");
        Intrinsics.checkNotNullParameter(str4, "date");
        Intrinsics.checkNotNullParameter(list, "dayTimeRange");
        this.description = str;
        this.statusCode = str2;
        this.typeCode = str3;
        this.date = str4;
        this.dayTimeRange = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OpeningExceptionalPatternResponse(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.List r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0016
            r2 = r0
            goto L_0x0017
        L_0x0016:
            r2 = r6
        L_0x0017:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r7
        L_0x001d:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0025
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0025:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.entities.OpeningExceptionalPatternResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
