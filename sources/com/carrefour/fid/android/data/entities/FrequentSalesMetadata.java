package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/FrequentSalesMetadata;", "", "errors", "Lcom/carrefour/fid/android/data/entities/FrequentSalesErrors;", "status", "", "(Lcom/carrefour/fid/android/data/entities/FrequentSalesErrors;Ljava/lang/Integer;)V", "getErrors", "()Lcom/carrefour/fid/android/data/entities/FrequentSalesErrors;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/carrefour/fid/android/data/entities/FrequentSalesErrors;Ljava/lang/Integer;)Lcom/carrefour/fid/android/data/entities/FrequentSalesMetadata;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class FrequentSalesMetadata {
    public static final int $stable = 0;
    @C33608c("errors")
    @C12580l
    private final FrequentSalesErrors errors;
    @C33608c("status")
    @C12580l
    private final Integer status;

    public FrequentSalesMetadata(@C12580l FrequentSalesErrors frequentSalesErrors, @C12580l Integer num) {
        this.errors = frequentSalesErrors;
        this.status = num;
    }

    public static /* synthetic */ FrequentSalesMetadata copy$default(FrequentSalesMetadata frequentSalesMetadata, FrequentSalesErrors frequentSalesErrors, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            frequentSalesErrors = frequentSalesMetadata.errors;
        }
        if ((i & 2) != 0) {
            num = frequentSalesMetadata.status;
        }
        return frequentSalesMetadata.copy(frequentSalesErrors, num);
    }

    @C12580l
    public final FrequentSalesErrors component1() {
        return this.errors;
    }

    @C12580l
    public final Integer component2() {
        return this.status;
    }

    @C12579k
    public final FrequentSalesMetadata copy(@C12580l FrequentSalesErrors frequentSalesErrors, @C12580l Integer num) {
        return new FrequentSalesMetadata(frequentSalesErrors, num);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequentSalesMetadata)) {
            return false;
        }
        FrequentSalesMetadata frequentSalesMetadata = (FrequentSalesMetadata) obj;
        return Intrinsics.areEqual((Object) this.errors, (Object) frequentSalesMetadata.errors) && Intrinsics.areEqual((Object) this.status, (Object) frequentSalesMetadata.status);
    }

    @C12580l
    public final FrequentSalesErrors getErrors() {
        return this.errors;
    }

    @C12580l
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        FrequentSalesErrors frequentSalesErrors = this.errors;
        int i = 0;
        int hashCode = (frequentSalesErrors == null ? 0 : frequentSalesErrors.hashCode()) * 31;
        Integer num = this.status;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        FrequentSalesErrors frequentSalesErrors = this.errors;
        Integer num = this.status;
        return "FrequentSalesMetadata(errors=" + frequentSalesErrors + ", status=" + num + ")";
    }
}
