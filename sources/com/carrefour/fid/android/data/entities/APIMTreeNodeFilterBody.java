package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMTreeNodeFilterBody;", "", "filter", "Lcom/carrefour/fid/android/data/entities/APIMFilterBody;", "(Lcom/carrefour/fid/android/data/entities/APIMFilterBody;)V", "getFilter", "()Lcom/carrefour/fid/android/data/entities/APIMFilterBody;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMTreeNodeFilterBody {
    public static final int $stable = 0;
    @C33608c("filter")
    @C12579k
    private final APIMFilterBody filter;

    public APIMTreeNodeFilterBody(@C12579k APIMFilterBody aPIMFilterBody) {
        Intrinsics.checkNotNullParameter(aPIMFilterBody, "filter");
        this.filter = aPIMFilterBody;
    }

    public static /* synthetic */ APIMTreeNodeFilterBody copy$default(APIMTreeNodeFilterBody aPIMTreeNodeFilterBody, APIMFilterBody aPIMFilterBody, int i, Object obj) {
        if ((i & 1) != 0) {
            aPIMFilterBody = aPIMTreeNodeFilterBody.filter;
        }
        return aPIMTreeNodeFilterBody.copy(aPIMFilterBody);
    }

    @C12579k
    public final APIMFilterBody component1() {
        return this.filter;
    }

    @C12579k
    public final APIMTreeNodeFilterBody copy(@C12579k APIMFilterBody aPIMFilterBody) {
        Intrinsics.checkNotNullParameter(aPIMFilterBody, "filter");
        return new APIMTreeNodeFilterBody(aPIMFilterBody);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof APIMTreeNodeFilterBody) && Intrinsics.areEqual((Object) this.filter, (Object) ((APIMTreeNodeFilterBody) obj).filter);
    }

    @C12579k
    public final APIMFilterBody getFilter() {
        return this.filter;
    }

    public int hashCode() {
        return this.filter.hashCode();
    }

    @C12579k
    public String toString() {
        APIMFilterBody aPIMFilterBody = this.filter;
        return "APIMTreeNodeFilterBody(filter=" + aPIMFilterBody + ")";
    }
}
