package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/CmsResponse;", "", "data", "", "Lcom/carrefour/fid/android/cms/data/entities/DataCmsResponse;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CmsResponse {
    @C33608c("data")
    @C12580l
    private List<DataCmsResponse> data;

    public CmsResponse() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CmsResponse copy$default(CmsResponse cmsResponse, List<DataCmsResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cmsResponse.data;
        }
        return cmsResponse.copy(list);
    }

    @C12580l
    public final List<DataCmsResponse> component1() {
        return this.data;
    }

    @C12579k
    public final CmsResponse copy(@C12580l List<DataCmsResponse> list) {
        return new CmsResponse(list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CmsResponse) && Intrinsics.areEqual((Object) this.data, (Object) ((CmsResponse) obj).data);
    }

    @C12580l
    public final List<DataCmsResponse> getData() {
        return this.data;
    }

    public int hashCode() {
        List<DataCmsResponse> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setData(@C12580l List<DataCmsResponse> list) {
        this.data = list;
    }

    @C12579k
    public String toString() {
        List<DataCmsResponse> list = this.data;
        return "CmsResponse(data=" + list + ")";
    }

    public CmsResponse(@C12580l List<DataCmsResponse> list) {
        this.data = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CmsResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
