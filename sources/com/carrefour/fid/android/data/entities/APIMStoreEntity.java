package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMStoreEntity;", "", "facilityId", "", "gln", "facilityName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFacilityId", "()Ljava/lang/String;", "getFacilityName", "getGln", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMStoreEntity {
    public static final int $stable = 0;
    @C33608c("facility_id")
    @C12580l
    private final String facilityId;
    @C33608c("facility_name")
    @C12580l
    private final String facilityName;
    @C33608c("gln")
    @C12580l
    private final String gln;

    public APIMStoreEntity(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        this.facilityId = str;
        this.gln = str2;
        this.facilityName = str3;
    }

    public static /* synthetic */ APIMStoreEntity copy$default(APIMStoreEntity aPIMStoreEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMStoreEntity.facilityId;
        }
        if ((i & 2) != 0) {
            str2 = aPIMStoreEntity.gln;
        }
        if ((i & 4) != 0) {
            str3 = aPIMStoreEntity.facilityName;
        }
        return aPIMStoreEntity.copy(str, str2, str3);
    }

    @C12580l
    public final String component1() {
        return this.facilityId;
    }

    @C12580l
    public final String component2() {
        return this.gln;
    }

    @C12580l
    public final String component3() {
        return this.facilityName;
    }

    @C12579k
    public final APIMStoreEntity copy(@C12580l String str, @C12580l String str2, @C12580l String str3) {
        return new APIMStoreEntity(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMStoreEntity)) {
            return false;
        }
        APIMStoreEntity aPIMStoreEntity = (APIMStoreEntity) obj;
        return Intrinsics.areEqual((Object) this.facilityId, (Object) aPIMStoreEntity.facilityId) && Intrinsics.areEqual((Object) this.gln, (Object) aPIMStoreEntity.gln) && Intrinsics.areEqual((Object) this.facilityName, (Object) aPIMStoreEntity.facilityName);
    }

    @C12580l
    public final String getFacilityId() {
        return this.facilityId;
    }

    @C12580l
    public final String getFacilityName() {
        return this.facilityName;
    }

    @C12580l
    public final String getGln() {
        return this.gln;
    }

    public int hashCode() {
        String str = this.facilityId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gln;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.facilityName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.facilityId;
        String str2 = this.gln;
        String str3 = this.facilityName;
        return "APIMStoreEntity(facilityId=" + str + ", gln=" + str2 + ", facilityName=" + str3 + ")";
    }
}
