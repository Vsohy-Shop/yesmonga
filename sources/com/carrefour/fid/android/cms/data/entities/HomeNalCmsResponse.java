package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/HomeNalCmsResponse;", "", "data", "Lcom/carrefour/fid/android/cms/data/entities/DataHomeCmsResponse;", "(Lcom/carrefour/fid/android/cms/data/entities/DataHomeCmsResponse;)V", "getData", "()Lcom/carrefour/fid/android/cms/data/entities/DataHomeCmsResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class HomeNalCmsResponse {
    @C33608c("data")
    @C12579k
    private final DataHomeCmsResponse data;

    public HomeNalCmsResponse(@C12579k DataHomeCmsResponse dataHomeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataHomeCmsResponse, "data");
        this.data = dataHomeCmsResponse;
    }

    public static /* synthetic */ HomeNalCmsResponse copy$default(HomeNalCmsResponse homeNalCmsResponse, DataHomeCmsResponse dataHomeCmsResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            dataHomeCmsResponse = homeNalCmsResponse.data;
        }
        return homeNalCmsResponse.copy(dataHomeCmsResponse);
    }

    @C12579k
    public final DataHomeCmsResponse component1() {
        return this.data;
    }

    @C12579k
    public final HomeNalCmsResponse copy(@C12579k DataHomeCmsResponse dataHomeCmsResponse) {
        Intrinsics.checkNotNullParameter(dataHomeCmsResponse, "data");
        return new HomeNalCmsResponse(dataHomeCmsResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HomeNalCmsResponse) && Intrinsics.areEqual((Object) this.data, (Object) ((HomeNalCmsResponse) obj).data);
    }

    @C12579k
    public final DataHomeCmsResponse getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @C12579k
    public String toString() {
        DataHomeCmsResponse dataHomeCmsResponse = this.data;
        return "HomeNalCmsResponse(data=" + dataHomeCmsResponse + ")";
    }
}
