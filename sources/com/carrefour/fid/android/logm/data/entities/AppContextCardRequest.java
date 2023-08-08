package com.carrefour.fid.android.logm.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/logm/data/entities/AppContextCardRequest;", "", "type", "", "isSecured", "", "id", "(Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getType", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "logM_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class AppContextCardRequest {
    @C33608c("id")
    @C12580l

    /* renamed from: id */
    private final String f96945id;
    @C33608c("is_secured")
    private final boolean isSecured;
    @C33608c("type")
    @C12580l
    private final String type;

    public AppContextCardRequest() {
        this((String) null, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AppContextCardRequest copy$default(AppContextCardRequest appContextCardRequest, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appContextCardRequest.type;
        }
        if ((i & 2) != 0) {
            z = appContextCardRequest.isSecured;
        }
        if ((i & 4) != 0) {
            str2 = appContextCardRequest.f96945id;
        }
        return appContextCardRequest.copy(str, z, str2);
    }

    @C12580l
    public final String component1() {
        return this.type;
    }

    public final boolean component2() {
        return this.isSecured;
    }

    @C12580l
    public final String component3() {
        return this.f96945id;
    }

    @C12579k
    public final AppContextCardRequest copy(@C12580l String str, boolean z, @C12580l String str2) {
        return new AppContextCardRequest(str, z, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppContextCardRequest)) {
            return false;
        }
        AppContextCardRequest appContextCardRequest = (AppContextCardRequest) obj;
        return Intrinsics.areEqual((Object) this.type, (Object) appContextCardRequest.type) && this.isSecured == appContextCardRequest.isSecured && Intrinsics.areEqual((Object) this.f96945id, (Object) appContextCardRequest.f96945id);
    }

    @C12580l
    public final String getId() {
        return this.f96945id;
    }

    @C12580l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isSecured;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f96945id;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final boolean isSecured() {
        return this.isSecured;
    }

    @C12579k
    public String toString() {
        String str = this.type;
        boolean z = this.isSecured;
        String str2 = this.f96945id;
        return "AppContextCardRequest(type=" + str + ", isSecured=" + z + ", id=" + str2 + ")";
    }

    public AppContextCardRequest(@C12580l String str, boolean z, @C12580l String str2) {
        this.type = str;
        this.isSecured = z;
        this.f96945id = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppContextCardRequest(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }
}
