package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/MiniHubBlockCmsResponse;", "", "templateId", "", "contentId", "", "link", "Lcom/carrefour/fid/android/cms/data/entities/CmsLinkResponse;", "image", "Lcom/carrefour/fid/android/cms/data/entities/ImageResponse;", "(Ljava/lang/String;ILcom/carrefour/fid/android/cms/data/entities/CmsLinkResponse;Lcom/carrefour/fid/android/cms/data/entities/ImageResponse;)V", "getContentId", "()I", "getImage", "()Lcom/carrefour/fid/android/cms/data/entities/ImageResponse;", "getLink", "()Lcom/carrefour/fid/android/cms/data/entities/CmsLinkResponse;", "getTemplateId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class MiniHubBlockCmsResponse {
    @C33608c("content_id")
    private final int contentId;
    @C33608c("image")
    @C12580l
    private final ImageResponse image;
    @C33608c("link")
    @C12580l
    private final CmsLinkResponse link;
    @C33608c("template_id")
    @C12580l
    private final String templateId;

    public MiniHubBlockCmsResponse(@C12580l String str, int i, @C12580l CmsLinkResponse cmsLinkResponse, @C12580l ImageResponse imageResponse) {
        this.templateId = str;
        this.contentId = i;
        this.link = cmsLinkResponse;
        this.image = imageResponse;
    }

    public static /* synthetic */ MiniHubBlockCmsResponse copy$default(MiniHubBlockCmsResponse miniHubBlockCmsResponse, String str, int i, CmsLinkResponse cmsLinkResponse, ImageResponse imageResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = miniHubBlockCmsResponse.templateId;
        }
        if ((i2 & 2) != 0) {
            i = miniHubBlockCmsResponse.contentId;
        }
        if ((i2 & 4) != 0) {
            cmsLinkResponse = miniHubBlockCmsResponse.link;
        }
        if ((i2 & 8) != 0) {
            imageResponse = miniHubBlockCmsResponse.image;
        }
        return miniHubBlockCmsResponse.copy(str, i, cmsLinkResponse, imageResponse);
    }

    @C12580l
    public final String component1() {
        return this.templateId;
    }

    public final int component2() {
        return this.contentId;
    }

    @C12580l
    public final CmsLinkResponse component3() {
        return this.link;
    }

    @C12580l
    public final ImageResponse component4() {
        return this.image;
    }

    @C12579k
    public final MiniHubBlockCmsResponse copy(@C12580l String str, int i, @C12580l CmsLinkResponse cmsLinkResponse, @C12580l ImageResponse imageResponse) {
        return new MiniHubBlockCmsResponse(str, i, cmsLinkResponse, imageResponse);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniHubBlockCmsResponse)) {
            return false;
        }
        MiniHubBlockCmsResponse miniHubBlockCmsResponse = (MiniHubBlockCmsResponse) obj;
        return Intrinsics.areEqual((Object) this.templateId, (Object) miniHubBlockCmsResponse.templateId) && this.contentId == miniHubBlockCmsResponse.contentId && Intrinsics.areEqual((Object) this.link, (Object) miniHubBlockCmsResponse.link) && Intrinsics.areEqual((Object) this.image, (Object) miniHubBlockCmsResponse.image);
    }

    public final int getContentId() {
        return this.contentId;
    }

    @C12580l
    public final ImageResponse getImage() {
        return this.image;
    }

    @C12580l
    public final CmsLinkResponse getLink() {
        return this.link;
    }

    @C12580l
    public final String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        String str = this.templateId;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.contentId)) * 31;
        CmsLinkResponse cmsLinkResponse = this.link;
        int hashCode2 = (hashCode + (cmsLinkResponse == null ? 0 : cmsLinkResponse.hashCode())) * 31;
        ImageResponse imageResponse = this.image;
        if (imageResponse != null) {
            i = imageResponse.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.templateId;
        int i = this.contentId;
        CmsLinkResponse cmsLinkResponse = this.link;
        ImageResponse imageResponse = this.image;
        return "MiniHubBlockCmsResponse(templateId=" + str + ", contentId=" + i + ", link=" + cmsLinkResponse + ", image=" + imageResponse + ")";
    }
}
