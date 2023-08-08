package com.carrefour.fid.android.logm.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/entities/AppContextAccountRequest;", "", "addresses", "", "Lcom/carrefour/fid/android/logm/data/entities/AppContextAddressRequest;", "customerRef", "", "isAuthenticated", "", "tokenExpiresIn", "cards", "Lcom/carrefour/fid/android/logm/data/entities/AppContextCardRequest;", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "getAddresses", "()Ljava/util/List;", "getCards", "getCustomerRef", "()Ljava/lang/String;", "()Z", "getTokenExpiresIn", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AppContextAccountRequest {
    @C33608c("addresses")
    @C12580l
    private final List<AppContextAddressRequest> addresses;
    @C33608c("cards")
    @C12580l
    private final List<AppContextCardRequest> cards;
    @C33608c("customer_ref")
    @C12580l
    private final String customerRef;
    @C33608c("is_authenticated")
    private final boolean isAuthenticated;
    @C33608c("token_expires_in")
    @C12580l
    private final String tokenExpiresIn;

    public AppContextAccountRequest() {
        this((List) null, (String) null, false, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AppContextAccountRequest copy$default(AppContextAccountRequest appContextAccountRequest, List<AppContextAddressRequest> list, String str, boolean z, String str2, List<AppContextCardRequest> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = appContextAccountRequest.addresses;
        }
        if ((i & 2) != 0) {
            str = appContextAccountRequest.customerRef;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = appContextAccountRequest.isAuthenticated;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = appContextAccountRequest.tokenExpiresIn;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            list2 = appContextAccountRequest.cards;
        }
        return appContextAccountRequest.copy(list, str3, z2, str4, list2);
    }

    @C12580l
    public final List<AppContextAddressRequest> component1() {
        return this.addresses;
    }

    @C12580l
    public final String component2() {
        return this.customerRef;
    }

    public final boolean component3() {
        return this.isAuthenticated;
    }

    @C12580l
    public final String component4() {
        return this.tokenExpiresIn;
    }

    @C12580l
    public final List<AppContextCardRequest> component5() {
        return this.cards;
    }

    @C12579k
    public final AppContextAccountRequest copy(@C12580l List<AppContextAddressRequest> list, @C12580l String str, boolean z, @C12580l String str2, @C12580l List<AppContextCardRequest> list2) {
        return new AppContextAccountRequest(list, str, z, str2, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppContextAccountRequest)) {
            return false;
        }
        AppContextAccountRequest appContextAccountRequest = (AppContextAccountRequest) obj;
        return Intrinsics.areEqual((Object) this.addresses, (Object) appContextAccountRequest.addresses) && Intrinsics.areEqual((Object) this.customerRef, (Object) appContextAccountRequest.customerRef) && this.isAuthenticated == appContextAccountRequest.isAuthenticated && Intrinsics.areEqual((Object) this.tokenExpiresIn, (Object) appContextAccountRequest.tokenExpiresIn) && Intrinsics.areEqual((Object) this.cards, (Object) appContextAccountRequest.cards);
    }

    @C12580l
    public final List<AppContextAddressRequest> getAddresses() {
        return this.addresses;
    }

    @C12580l
    public final List<AppContextCardRequest> getCards() {
        return this.cards;
    }

    @C12580l
    public final String getCustomerRef() {
        return this.customerRef;
    }

    @C12580l
    public final String getTokenExpiresIn() {
        return this.tokenExpiresIn;
    }

    public int hashCode() {
        List<AppContextAddressRequest> list = this.addresses;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.customerRef;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isAuthenticated;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str2 = this.tokenExpiresIn;
        int hashCode3 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<AppContextCardRequest> list2 = this.cards;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    public final boolean isAuthenticated() {
        return this.isAuthenticated;
    }

    @C12579k
    public String toString() {
        List<AppContextAddressRequest> list = this.addresses;
        String str = this.customerRef;
        boolean z = this.isAuthenticated;
        String str2 = this.tokenExpiresIn;
        List<AppContextCardRequest> list2 = this.cards;
        return "AppContextAccountRequest(addresses=" + list + ", customerRef=" + str + ", isAuthenticated=" + z + ", tokenExpiresIn=" + str2 + ", cards=" + list2 + ")";
    }

    public AppContextAccountRequest(@C12580l List<AppContextAddressRequest> list, @C12580l String str, boolean z, @C12580l String str2, @C12580l List<AppContextCardRequest> list2) {
        this.addresses = list;
        this.customerRef = str;
        this.isAuthenticated = z;
        this.tokenExpiresIn = str2;
        this.cards = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AppContextAccountRequest(java.util.List r4, java.lang.String r5, boolean r6, java.lang.String r7, java.util.List r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0008
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0008:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L_0x000f
            r10 = r0
            goto L_0x0010
        L_0x000f:
            r10 = r5
        L_0x0010:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0015
            r6 = 0
        L_0x0015:
            r1 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r7
        L_0x001c:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0024
            java.util.List r8 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0024:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.logm.data.entities.AppContextAccountRequest.<init>(java.util.List, java.lang.String, boolean, java.lang.String, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
