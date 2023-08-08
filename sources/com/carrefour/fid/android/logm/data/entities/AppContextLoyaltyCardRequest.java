package com.carrefour.fid.android.logm.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/entities/AppContextLoyaltyCardRequest;", "", "id", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AppContextLoyaltyCardRequest {
    @C33608c("id")
    @C12580l

    /* renamed from: id */
    private final String f96946id;
    @C33608c("type")
    @C12580l
    private final String type;

    public AppContextLoyaltyCardRequest() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AppContextLoyaltyCardRequest copy$default(AppContextLoyaltyCardRequest appContextLoyaltyCardRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appContextLoyaltyCardRequest.f96946id;
        }
        if ((i & 2) != 0) {
            str2 = appContextLoyaltyCardRequest.type;
        }
        return appContextLoyaltyCardRequest.copy(str, str2);
    }

    @C12580l
    public final String component1() {
        return this.f96946id;
    }

    @C12580l
    public final String component2() {
        return this.type;
    }

    @C12579k
    public final AppContextLoyaltyCardRequest copy(@C12580l String str, @C12580l String str2) {
        return new AppContextLoyaltyCardRequest(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppContextLoyaltyCardRequest)) {
            return false;
        }
        AppContextLoyaltyCardRequest appContextLoyaltyCardRequest = (AppContextLoyaltyCardRequest) obj;
        return Intrinsics.areEqual((Object) this.f96946id, (Object) appContextLoyaltyCardRequest.f96946id) && Intrinsics.areEqual((Object) this.type, (Object) appContextLoyaltyCardRequest.type);
    }

    @C12580l
    public final String getId() {
        return this.f96946id;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.f96946id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.f96946id;
        String str2 = this.type;
        return "AppContextLoyaltyCardRequest(id=" + str + ", type=" + str2 + ")";
    }

    public AppContextLoyaltyCardRequest(@C12580l String str, @C12580l String str2) {
        this.f96946id = str;
        this.type = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppContextLoyaltyCardRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
