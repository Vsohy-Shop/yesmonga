package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/AdServingCriteoResponse;", "", "status", "", "placements", "", "Lcom/carrefour/fid/android/data/entities/CriteoPlacement;", "errors", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "getPlacements", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class AdServingCriteoResponse {
    public static final int $stable = 8;
    @C33608c("errors")
    @C12580l
    private final List<String> errors;
    @C33608c("placements")
    @C12580l
    private final List<CriteoPlacement> placements;
    @C33608c("status")
    @C12580l
    private final String status;

    public AdServingCriteoResponse(@C12580l String str, @C12580l List<CriteoPlacement> list, @C12580l List<String> list2) {
        this.status = str;
        this.placements = list;
        this.errors = list2;
    }

    public static /* synthetic */ AdServingCriteoResponse copy$default(AdServingCriteoResponse adServingCriteoResponse, String str, List<CriteoPlacement> list, List<String> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adServingCriteoResponse.status;
        }
        if ((i & 2) != 0) {
            list = adServingCriteoResponse.placements;
        }
        if ((i & 4) != 0) {
            list2 = adServingCriteoResponse.errors;
        }
        return adServingCriteoResponse.copy(str, list, list2);
    }

    @C12580l
    public final String component1() {
        return this.status;
    }

    @C12580l
    public final List<CriteoPlacement> component2() {
        return this.placements;
    }

    @C12580l
    public final List<String> component3() {
        return this.errors;
    }

    @C12579k
    public final AdServingCriteoResponse copy(@C12580l String str, @C12580l List<CriteoPlacement> list, @C12580l List<String> list2) {
        return new AdServingCriteoResponse(str, list, list2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdServingCriteoResponse)) {
            return false;
        }
        AdServingCriteoResponse adServingCriteoResponse = (AdServingCriteoResponse) obj;
        return Intrinsics.areEqual((Object) this.status, (Object) adServingCriteoResponse.status) && Intrinsics.areEqual((Object) this.placements, (Object) adServingCriteoResponse.placements) && Intrinsics.areEqual((Object) this.errors, (Object) adServingCriteoResponse.errors);
    }

    @C12580l
    public final List<String> getErrors() {
        return this.errors;
    }

    @C12580l
    public final List<CriteoPlacement> getPlacements() {
        return this.placements;
    }

    @C12580l
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CriteoPlacement> list = this.placements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.errors;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.status;
        List<CriteoPlacement> list = this.placements;
        List<String> list2 = this.errors;
        return "AdServingCriteoResponse(status=" + str + ", placements=" + list + ", errors=" + list2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdServingCriteoResponse(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list2);
    }
}
