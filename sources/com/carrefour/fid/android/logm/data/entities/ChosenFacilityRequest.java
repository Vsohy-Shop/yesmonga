package com.carrefour.fid.android.logm.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/entities/ChosenFacilityRequest;", "", "facilityServiceId", "", "anabel", "format", "service", "metiRef", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnabel", "()Ljava/lang/String;", "getFacilityServiceId", "getFormat", "getMetiRef", "getService", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class ChosenFacilityRequest {
    @C33608c("anabel")
    @C12580l
    private final String anabel;
    @C33608c("facility_service_id")
    @C12580l
    private final String facilityServiceId;
    @C33608c("format")
    @C12580l
    private final String format;
    @C33608c("meti_ref")
    @C12580l
    private final String metiRef;
    @C33608c("service")
    @C12580l
    private final String service;

    public ChosenFacilityRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ChosenFacilityRequest copy$default(ChosenFacilityRequest chosenFacilityRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chosenFacilityRequest.facilityServiceId;
        }
        if ((i & 2) != 0) {
            str2 = chosenFacilityRequest.anabel;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = chosenFacilityRequest.format;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = chosenFacilityRequest.service;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = chosenFacilityRequest.metiRef;
        }
        return chosenFacilityRequest.copy(str, str6, str7, str8, str5);
    }

    @C12580l
    public final String component1() {
        return this.facilityServiceId;
    }

    @C12580l
    public final String component2() {
        return this.anabel;
    }

    @C12580l
    public final String component3() {
        return this.format;
    }

    @C12580l
    public final String component4() {
        return this.service;
    }

    @C12580l
    public final String component5() {
        return this.metiRef;
    }

    @C12579k
    public final ChosenFacilityRequest copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new ChosenFacilityRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChosenFacilityRequest)) {
            return false;
        }
        ChosenFacilityRequest chosenFacilityRequest = (ChosenFacilityRequest) obj;
        return Intrinsics.areEqual((Object) this.facilityServiceId, (Object) chosenFacilityRequest.facilityServiceId) && Intrinsics.areEqual((Object) this.anabel, (Object) chosenFacilityRequest.anabel) && Intrinsics.areEqual((Object) this.format, (Object) chosenFacilityRequest.format) && Intrinsics.areEqual((Object) this.service, (Object) chosenFacilityRequest.service) && Intrinsics.areEqual((Object) this.metiRef, (Object) chosenFacilityRequest.metiRef);
    }

    @C12580l
    public final String getAnabel() {
        return this.anabel;
    }

    @C12580l
    public final String getFacilityServiceId() {
        return this.facilityServiceId;
    }

    @C12580l
    public final String getFormat() {
        return this.format;
    }

    @C12580l
    public final String getMetiRef() {
        return this.metiRef;
    }

    @C12580l
    public final String getService() {
        return this.service;
    }

    public int hashCode() {
        String str = this.facilityServiceId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.anabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.format;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.service;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.metiRef;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.facilityServiceId;
        String str2 = this.anabel;
        String str3 = this.format;
        String str4 = this.service;
        String str5 = this.metiRef;
        return "ChosenFacilityRequest(facilityServiceId=" + str + ", anabel=" + str2 + ", format=" + str3 + ", service=" + str4 + ", metiRef=" + str5 + ")";
    }

    public ChosenFacilityRequest(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.facilityServiceId = str;
        this.anabel = str2;
        this.format = str3;
        this.service = str4;
        this.metiRef = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChosenFacilityRequest(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0009
            java.lang.String r4 = new java.lang.String
            r4.<init>()
        L_0x0009:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0012
            java.lang.String r5 = new java.lang.String
            r5.<init>()
        L_0x0012:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x001c
            java.lang.String r6 = new java.lang.String
            r6.<init>()
        L_0x001c:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0026
            java.lang.String r7 = new java.lang.String
            r7.<init>()
        L_0x0026:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0030
            java.lang.String r8 = new java.lang.String
            r8.<init>()
        L_0x0030:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.logm.data.entities.ChosenFacilityRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
