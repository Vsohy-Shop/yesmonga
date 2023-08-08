package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/DayTimeRangeResponse;", "", "beginTime", "", "endTime", "(Ljava/lang/String;Ljava/lang/String;)V", "getBeginTime", "()Ljava/lang/String;", "getEndTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DayTimeRangeResponse {
    @C33608c("beg_time")
    @C12580l
    private final String beginTime;
    @C33608c("end_time")
    @C12580l
    private final String endTime;

    public DayTimeRangeResponse() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DayTimeRangeResponse copy$default(DayTimeRangeResponse dayTimeRangeResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dayTimeRangeResponse.beginTime;
        }
        if ((i & 2) != 0) {
            str2 = dayTimeRangeResponse.endTime;
        }
        return dayTimeRangeResponse.copy(str, str2);
    }

    @C12580l
    public final String component1() {
        return this.beginTime;
    }

    @C12580l
    public final String component2() {
        return this.endTime;
    }

    @C12579k
    public final DayTimeRangeResponse copy(@C12580l String str, @C12580l String str2) {
        return new DayTimeRangeResponse(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayTimeRangeResponse)) {
            return false;
        }
        DayTimeRangeResponse dayTimeRangeResponse = (DayTimeRangeResponse) obj;
        return Intrinsics.areEqual((Object) this.beginTime, (Object) dayTimeRangeResponse.beginTime) && Intrinsics.areEqual((Object) this.endTime, (Object) dayTimeRangeResponse.endTime);
    }

    @C12580l
    public final String getBeginTime() {
        return this.beginTime;
    }

    @C12580l
    public final String getEndTime() {
        return this.endTime;
    }

    public int hashCode() {
        String str = this.beginTime;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endTime;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.beginTime;
        String str2 = this.endTime;
        return "DayTimeRangeResponse(beginTime=" + str + ", endTime=" + str2 + ")";
    }

    public DayTimeRangeResponse(@C12580l String str, @C12580l String str2) {
        this.beginTime = str;
        this.endTime = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DayTimeRangeResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
