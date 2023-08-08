package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreFacilityMetaResponse;", "", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreFacilityMetaResponse {
    @C33608c("code")
    private final int code;
    @C33608c("message")
    @C12579k
    private final String message;

    public StoreFacilityMetaResponse() {
        this(0, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoreFacilityMetaResponse copy$default(StoreFacilityMetaResponse storeFacilityMetaResponse, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = storeFacilityMetaResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = storeFacilityMetaResponse.message;
        }
        return storeFacilityMetaResponse.copy(i, str);
    }

    public final int component1() {
        return this.code;
    }

    @C12579k
    public final String component2() {
        return this.message;
    }

    @C12579k
    public final StoreFacilityMetaResponse copy(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        return new StoreFacilityMetaResponse(i, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreFacilityMetaResponse)) {
            return false;
        }
        StoreFacilityMetaResponse storeFacilityMetaResponse = (StoreFacilityMetaResponse) obj;
        return this.code == storeFacilityMetaResponse.code && Intrinsics.areEqual((Object) this.message, (Object) storeFacilityMetaResponse.message);
    }

    public final int getCode() {
        return this.code;
    }

    @C12579k
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.message.hashCode();
    }

    @C12579k
    public String toString() {
        int i = this.code;
        String str = this.message;
        return "StoreFacilityMetaResponse(code=" + i + ", message=" + str + ")";
    }

    public StoreFacilityMetaResponse(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.code = i;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoreFacilityMetaResponse(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
