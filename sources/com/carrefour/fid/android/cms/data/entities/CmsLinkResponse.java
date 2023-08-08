package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/CmsLinkResponse;", "", "uri", "", "linkType", "(Ljava/lang/String;Ljava/lang/String;)V", "getLinkType", "()Ljava/lang/String;", "getUri", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class CmsLinkResponse {
    @C33608c("link_type")
    @C12579k
    private final String linkType;
    @C33608c("uri")
    @C12579k
    private final String uri;

    public CmsLinkResponse(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "uri");
        Intrinsics.checkNotNullParameter(str2, "linkType");
        this.uri = str;
        this.linkType = str2;
    }

    public static /* synthetic */ CmsLinkResponse copy$default(CmsLinkResponse cmsLinkResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cmsLinkResponse.uri;
        }
        if ((i & 2) != 0) {
            str2 = cmsLinkResponse.linkType;
        }
        return cmsLinkResponse.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.uri;
    }

    @C12579k
    public final String component2() {
        return this.linkType;
    }

    @C12579k
    public final CmsLinkResponse copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "uri");
        Intrinsics.checkNotNullParameter(str2, "linkType");
        return new CmsLinkResponse(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmsLinkResponse)) {
            return false;
        }
        CmsLinkResponse cmsLinkResponse = (CmsLinkResponse) obj;
        return Intrinsics.areEqual((Object) this.uri, (Object) cmsLinkResponse.uri) && Intrinsics.areEqual((Object) this.linkType, (Object) cmsLinkResponse.linkType);
    }

    @C12579k
    public final String getLinkType() {
        return this.linkType;
    }

    @C12579k
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (this.uri.hashCode() * 31) + this.linkType.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.uri;
        String str2 = this.linkType;
        return "CmsLinkResponse(uri=" + str + ", linkType=" + str2 + ")";
    }
}
