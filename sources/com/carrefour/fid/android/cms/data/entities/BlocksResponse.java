package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/BlocksResponse;", "", "image", "Lcom/carrefour/fid/android/cms/data/entities/ImageResponse;", "linkType", "", "deepLink", "link", "Lcom/carrefour/fid/android/cms/data/entities/LinkResponse;", "(Lcom/carrefour/fid/android/cms/data/entities/ImageResponse;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/cms/data/entities/LinkResponse;)V", "getDeepLink", "()Ljava/lang/String;", "getImage", "()Lcom/carrefour/fid/android/cms/data/entities/ImageResponse;", "getLink", "()Lcom/carrefour/fid/android/cms/data/entities/LinkResponse;", "getLinkType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class BlocksResponse {
    @C33608c("deeplink")
    @C12580l
    private final String deepLink;
    @C33608c("image")
    @C12580l
    private final ImageResponse image;
    @C33608c("link")
    @C12580l
    private final LinkResponse link;
    @C33608c("link_type")
    @C12579k
    private final String linkType;

    public BlocksResponse(@C12580l ImageResponse imageResponse, @C12579k String str, @C12580l String str2, @C12580l LinkResponse linkResponse) {
        Intrinsics.checkNotNullParameter(str, "linkType");
        this.image = imageResponse;
        this.linkType = str;
        this.deepLink = str2;
        this.link = linkResponse;
    }

    public static /* synthetic */ BlocksResponse copy$default(BlocksResponse blocksResponse, ImageResponse imageResponse, String str, String str2, LinkResponse linkResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            imageResponse = blocksResponse.image;
        }
        if ((i & 2) != 0) {
            str = blocksResponse.linkType;
        }
        if ((i & 4) != 0) {
            str2 = blocksResponse.deepLink;
        }
        if ((i & 8) != 0) {
            linkResponse = blocksResponse.link;
        }
        return blocksResponse.copy(imageResponse, str, str2, linkResponse);
    }

    @C12580l
    public final ImageResponse component1() {
        return this.image;
    }

    @C12579k
    public final String component2() {
        return this.linkType;
    }

    @C12580l
    public final String component3() {
        return this.deepLink;
    }

    @C12580l
    public final LinkResponse component4() {
        return this.link;
    }

    @C12579k
    public final BlocksResponse copy(@C12580l ImageResponse imageResponse, @C12579k String str, @C12580l String str2, @C12580l LinkResponse linkResponse) {
        Intrinsics.checkNotNullParameter(str, "linkType");
        return new BlocksResponse(imageResponse, str, str2, linkResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlocksResponse)) {
            return false;
        }
        BlocksResponse blocksResponse = (BlocksResponse) obj;
        return Intrinsics.areEqual((Object) this.image, (Object) blocksResponse.image) && Intrinsics.areEqual((Object) this.linkType, (Object) blocksResponse.linkType) && Intrinsics.areEqual((Object) this.deepLink, (Object) blocksResponse.deepLink) && Intrinsics.areEqual((Object) this.link, (Object) blocksResponse.link);
    }

    @C12580l
    public final String getDeepLink() {
        return this.deepLink;
    }

    @C12580l
    public final ImageResponse getImage() {
        return this.image;
    }

    @C12580l
    public final LinkResponse getLink() {
        return this.link;
    }

    @C12579k
    public final String getLinkType() {
        return this.linkType;
    }

    public int hashCode() {
        ImageResponse imageResponse = this.image;
        int i = 0;
        int hashCode = (((imageResponse == null ? 0 : imageResponse.hashCode()) * 31) + this.linkType.hashCode()) * 31;
        String str = this.deepLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LinkResponse linkResponse = this.link;
        if (linkResponse != null) {
            i = linkResponse.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        ImageResponse imageResponse = this.image;
        String str = this.linkType;
        String str2 = this.deepLink;
        LinkResponse linkResponse = this.link;
        return "BlocksResponse(image=" + imageResponse + ", linkType=" + str + ", deepLink=" + str2 + ", link=" + linkResponse + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlocksResponse(ImageResponse imageResponse, String str, String str2, LinkResponse linkResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageResponse, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : linkResponse);
    }
}
