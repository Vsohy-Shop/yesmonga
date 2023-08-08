package com.carrefour.fid.android.service.data.api.entities;

import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/service/data/api/entities/StoreServiceWithUrlResponse;", "", "id", "", "label", "description", "code", "picto", "Lcom/carrefour/fid/android/service/data/api/entities/ServicePictoResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/service/data/api/entities/ServicePictoResponse;)V", "getCode", "()Ljava/lang/String;", "getDescription", "getId", "getLabel", "getPicto", "()Lcom/carrefour/fid/android/service/data/api/entities/ServicePictoResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "service_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class StoreServiceWithUrlResponse {
    @C33608c("code")
    @C12579k
    private final String code;
    @C33608c("description")
    @C12579k
    private final String description;
    @C33608c("id")
    @C12579k

    /* renamed from: id */
    private final String f68528id;
    @C33608c("label")
    @C12579k
    private final String label;
    @C33608c("picto")
    @C12580l
    private final ServicePictoResponse picto;

    public StoreServiceWithUrlResponse() {
        this((String) null, (String) null, (String) null, (String) null, (ServicePictoResponse) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoreServiceWithUrlResponse copy$default(StoreServiceWithUrlResponse storeServiceWithUrlResponse, String str, String str2, String str3, String str4, ServicePictoResponse servicePictoResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storeServiceWithUrlResponse.f68528id;
        }
        if ((i & 2) != 0) {
            str2 = storeServiceWithUrlResponse.label;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = storeServiceWithUrlResponse.description;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = storeServiceWithUrlResponse.code;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            servicePictoResponse = storeServiceWithUrlResponse.picto;
        }
        return storeServiceWithUrlResponse.copy(str, str5, str6, str7, servicePictoResponse);
    }

    @C12579k
    public final String component1() {
        return this.f68528id;
    }

    @C12579k
    public final String component2() {
        return this.label;
    }

    @C12579k
    public final String component3() {
        return this.description;
    }

    @C12579k
    public final String component4() {
        return this.code;
    }

    @C12580l
    public final ServicePictoResponse component5() {
        return this.picto;
    }

    @C12579k
    public final StoreServiceWithUrlResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l ServicePictoResponse servicePictoResponse) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(str3, "description");
        Intrinsics.checkNotNullParameter(str4, "code");
        return new StoreServiceWithUrlResponse(str, str2, str3, str4, servicePictoResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreServiceWithUrlResponse)) {
            return false;
        }
        StoreServiceWithUrlResponse storeServiceWithUrlResponse = (StoreServiceWithUrlResponse) obj;
        return Intrinsics.areEqual((Object) this.f68528id, (Object) storeServiceWithUrlResponse.f68528id) && Intrinsics.areEqual((Object) this.label, (Object) storeServiceWithUrlResponse.label) && Intrinsics.areEqual((Object) this.description, (Object) storeServiceWithUrlResponse.description) && Intrinsics.areEqual((Object) this.code, (Object) storeServiceWithUrlResponse.code) && Intrinsics.areEqual((Object) this.picto, (Object) storeServiceWithUrlResponse.picto);
    }

    @C12579k
    public final String getCode() {
        return this.code;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getId() {
        return this.f68528id;
    }

    @C12579k
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final ServicePictoResponse getPicto() {
        return this.picto;
    }

    public int hashCode() {
        int hashCode = ((((((this.f68528id.hashCode() * 31) + this.label.hashCode()) * 31) + this.description.hashCode()) * 31) + this.code.hashCode()) * 31;
        ServicePictoResponse servicePictoResponse = this.picto;
        return hashCode + (servicePictoResponse == null ? 0 : servicePictoResponse.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.f68528id;
        String str2 = this.label;
        String str3 = this.description;
        String str4 = this.code;
        ServicePictoResponse servicePictoResponse = this.picto;
        return "StoreServiceWithUrlResponse(id=" + str + ", label=" + str2 + ", description=" + str3 + ", code=" + str4 + ", picto=" + servicePictoResponse + ")";
    }

    public StoreServiceWithUrlResponse(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12580l ServicePictoResponse servicePictoResponse) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "label");
        Intrinsics.checkNotNullParameter(str3, "description");
        Intrinsics.checkNotNullParameter(str4, "code");
        this.f68528id = str;
        this.label = str2;
        this.description = str3;
        this.code = str4;
        this.picto = servicePictoResponse;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoreServiceWithUrlResponse(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.carrefour.fid.android.service.data.api.entities.ServicePictoResponse r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
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
            if (r4 == 0) goto L_0x0022
            r8 = 0
        L_0x0022:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.service.data.api.entities.StoreServiceWithUrlResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.carrefour.fid.android.service.data.api.entities.ServicePictoResponse, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
