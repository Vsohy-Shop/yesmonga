package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/LinkResponse;", "", "uri", "", "(Ljava/lang/String;)V", "getUri", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class LinkResponse {
    @C33608c("uri")
    @C12579k
    private final String uri;

    public LinkResponse(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uri");
        this.uri = str;
    }

    public static /* synthetic */ LinkResponse copy$default(LinkResponse linkResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkResponse.uri;
        }
        return linkResponse.copy(str);
    }

    @C12579k
    public final String component1() {
        return this.uri;
    }

    @C12579k
    public final LinkResponse copy(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uri");
        return new LinkResponse(str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkResponse) && Intrinsics.areEqual((Object) this.uri, (Object) ((LinkResponse) obj).uri);
    }

    @C12579k
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.uri;
        return "LinkResponse(uri=" + str + ")";
    }
}
