package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMOrdersPagingEntity;", "", "scrollHash", "", "scrollPaging", "(Ljava/lang/String;Ljava/lang/String;)V", "getScrollHash", "()Ljava/lang/String;", "getScrollPaging", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMOrdersPagingEntity {
    public static final int $stable = 0;
    @C33608c("scrollhash")
    @C12580l
    private final String scrollHash;
    @C33608c("scrollpaging")
    @C12580l
    private final String scrollPaging;

    public APIMOrdersPagingEntity(@C12580l String str, @C12580l String str2) {
        this.scrollHash = str;
        this.scrollPaging = str2;
    }

    public static /* synthetic */ APIMOrdersPagingEntity copy$default(APIMOrdersPagingEntity aPIMOrdersPagingEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aPIMOrdersPagingEntity.scrollHash;
        }
        if ((i & 2) != 0) {
            str2 = aPIMOrdersPagingEntity.scrollPaging;
        }
        return aPIMOrdersPagingEntity.copy(str, str2);
    }

    @C12580l
    public final String component1() {
        return this.scrollHash;
    }

    @C12580l
    public final String component2() {
        return this.scrollPaging;
    }

    @C12579k
    public final APIMOrdersPagingEntity copy(@C12580l String str, @C12580l String str2) {
        return new APIMOrdersPagingEntity(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMOrdersPagingEntity)) {
            return false;
        }
        APIMOrdersPagingEntity aPIMOrdersPagingEntity = (APIMOrdersPagingEntity) obj;
        return Intrinsics.areEqual((Object) this.scrollHash, (Object) aPIMOrdersPagingEntity.scrollHash) && Intrinsics.areEqual((Object) this.scrollPaging, (Object) aPIMOrdersPagingEntity.scrollPaging);
    }

    @C12580l
    public final String getScrollHash() {
        return this.scrollHash;
    }

    @C12580l
    public final String getScrollPaging() {
        return this.scrollPaging;
    }

    public int hashCode() {
        String str = this.scrollHash;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scrollPaging;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.scrollHash;
        String str2 = this.scrollPaging;
        return "APIMOrdersPagingEntity(scrollHash=" + str + ", scrollPaging=" + str2 + ")";
    }
}
