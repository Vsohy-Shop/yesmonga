package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/ImageUrlResponse;", "", "url", "", "uri", "alt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlt", "()Ljava/lang/String;", "getUri", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class ImageUrlResponse {
    @C33608c("alt")
    @C12579k
    private final String alt;
    @C33608c("uri")
    @C12579k
    private final String uri;
    @C33608c("url")
    @C12579k
    private final String url;

    public ImageUrlResponse(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "uri");
        Intrinsics.checkNotNullParameter(str3, "alt");
        this.url = str;
        this.uri = str2;
        this.alt = str3;
    }

    public static /* synthetic */ ImageUrlResponse copy$default(ImageUrlResponse imageUrlResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageUrlResponse.url;
        }
        if ((i & 2) != 0) {
            str2 = imageUrlResponse.uri;
        }
        if ((i & 4) != 0) {
            str3 = imageUrlResponse.alt;
        }
        return imageUrlResponse.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.url;
    }

    @C12579k
    public final String component2() {
        return this.uri;
    }

    @C12579k
    public final String component3() {
        return this.alt;
    }

    @C12579k
    public final ImageUrlResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "uri");
        Intrinsics.checkNotNullParameter(str3, "alt");
        return new ImageUrlResponse(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrlResponse)) {
            return false;
        }
        ImageUrlResponse imageUrlResponse = (ImageUrlResponse) obj;
        return Intrinsics.areEqual((Object) this.url, (Object) imageUrlResponse.url) && Intrinsics.areEqual((Object) this.uri, (Object) imageUrlResponse.uri) && Intrinsics.areEqual((Object) this.alt, (Object) imageUrlResponse.alt);
    }

    @C12579k
    public final String getAlt() {
        return this.alt;
    }

    @C12579k
    public final String getUri() {
        return this.uri;
    }

    @C12579k
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.url.hashCode() * 31) + this.uri.hashCode()) * 31) + this.alt.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.url;
        String str2 = this.uri;
        String str3 = this.alt;
        return "ImageUrlResponse(url=" + str + ", uri=" + str2 + ", alt=" + str3 + ")";
    }
}
