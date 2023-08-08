package com.carrefour.fid.android.logm.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/entities/AppContextAddressRequest;", "", "address1", "", "address2", "address3", "zipCode", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "getAddress2", "getAddress3", "getCategory", "getZipCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AppContextAddressRequest {
    @C33608c("address1")
    @C12580l
    private final String address1;
    @C33608c("address2")
    @C12580l
    private final String address2;
    @C33608c("address3")
    @C12580l
    private final String address3;
    @C33608c("category")
    @C12580l
    private final String category;
    @C33608c("zipcode")
    @C12580l
    private final String zipCode;

    public AppContextAddressRequest() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AppContextAddressRequest copy$default(AppContextAddressRequest appContextAddressRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appContextAddressRequest.address1;
        }
        if ((i & 2) != 0) {
            str2 = appContextAddressRequest.address2;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = appContextAddressRequest.address3;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = appContextAddressRequest.zipCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = appContextAddressRequest.category;
        }
        return appContextAddressRequest.copy(str, str6, str7, str8, str5);
    }

    @C12580l
    public final String component1() {
        return this.address1;
    }

    @C12580l
    public final String component2() {
        return this.address2;
    }

    @C12580l
    public final String component3() {
        return this.address3;
    }

    @C12580l
    public final String component4() {
        return this.zipCode;
    }

    @C12580l
    public final String component5() {
        return this.category;
    }

    @C12579k
    public final AppContextAddressRequest copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        return new AppContextAddressRequest(str, str2, str3, str4, str5);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppContextAddressRequest)) {
            return false;
        }
        AppContextAddressRequest appContextAddressRequest = (AppContextAddressRequest) obj;
        return Intrinsics.areEqual((Object) this.address1, (Object) appContextAddressRequest.address1) && Intrinsics.areEqual((Object) this.address2, (Object) appContextAddressRequest.address2) && Intrinsics.areEqual((Object) this.address3, (Object) appContextAddressRequest.address3) && Intrinsics.areEqual((Object) this.zipCode, (Object) appContextAddressRequest.zipCode) && Intrinsics.areEqual((Object) this.category, (Object) appContextAddressRequest.category);
    }

    @C12580l
    public final String getAddress1() {
        return this.address1;
    }

    @C12580l
    public final String getAddress2() {
        return this.address2;
    }

    @C12580l
    public final String getAddress3() {
        return this.address3;
    }

    @C12580l
    public final String getCategory() {
        return this.category;
    }

    @C12580l
    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        String str = this.address1;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address2;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address3;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zipCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.category;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @C12579k
    public String toString() {
        String str = this.address1;
        String str2 = this.address2;
        String str3 = this.address3;
        String str4 = this.zipCode;
        String str5 = this.category;
        return "AppContextAddressRequest(address1=" + str + ", address2=" + str2 + ", address3=" + str3 + ", zipCode=" + str4 + ", category=" + str5 + ")";
    }

    public AppContextAddressRequest(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5) {
        this.address1 = str;
        this.address2 = str2;
        this.address3 = str3;
        this.zipCode = str4;
        this.category = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppContextAddressRequest(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.logm.data.entities.AppContextAddressRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
