package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/DataMobilePagesCmsResponse;", "", "templateId", "", "contentId", "", "mini_hubs", "", "Lcom/carrefour/fid/android/cms/data/entities/MiniHubCmsResponse;", "(Ljava/lang/String;ILjava/util/List;)V", "getContentId", "()I", "getMini_hubs", "()Ljava/util/List;", "getTemplateId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class DataMobilePagesCmsResponse {
    @C33608c("content_id")
    private final int contentId;
    @C33608c("mini_hubs")
    @C12579k
    private final List<MiniHubCmsResponse> mini_hubs;
    @C33608c("template_id")
    @C12580l
    private final String templateId;

    public DataMobilePagesCmsResponse(@C12580l String str, int i, @C12579k List<MiniHubCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "mini_hubs");
        this.templateId = str;
        this.contentId = i;
        this.mini_hubs = list;
    }

    public static /* synthetic */ DataMobilePagesCmsResponse copy$default(DataMobilePagesCmsResponse dataMobilePagesCmsResponse, String str, int i, List<MiniHubCmsResponse> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dataMobilePagesCmsResponse.templateId;
        }
        if ((i2 & 2) != 0) {
            i = dataMobilePagesCmsResponse.contentId;
        }
        if ((i2 & 4) != 0) {
            list = dataMobilePagesCmsResponse.mini_hubs;
        }
        return dataMobilePagesCmsResponse.copy(str, i, list);
    }

    @C12580l
    public final String component1() {
        return this.templateId;
    }

    public final int component2() {
        return this.contentId;
    }

    @C12579k
    public final List<MiniHubCmsResponse> component3() {
        return this.mini_hubs;
    }

    @C12579k
    public final DataMobilePagesCmsResponse copy(@C12580l String str, int i, @C12579k List<MiniHubCmsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "mini_hubs");
        return new DataMobilePagesCmsResponse(str, i, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataMobilePagesCmsResponse)) {
            return false;
        }
        DataMobilePagesCmsResponse dataMobilePagesCmsResponse = (DataMobilePagesCmsResponse) obj;
        return Intrinsics.areEqual((Object) this.templateId, (Object) dataMobilePagesCmsResponse.templateId) && this.contentId == dataMobilePagesCmsResponse.contentId && Intrinsics.areEqual((Object) this.mini_hubs, (Object) dataMobilePagesCmsResponse.mini_hubs);
    }

    public final int getContentId() {
        return this.contentId;
    }

    @C12579k
    public final List<MiniHubCmsResponse> getMini_hubs() {
        return this.mini_hubs;
    }

    @C12580l
    public final String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        String str = this.templateId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.contentId)) * 31) + this.mini_hubs.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.templateId;
        int i = this.contentId;
        List<MiniHubCmsResponse> list = this.mini_hubs;
        return "DataMobilePagesCmsResponse(templateId=" + str + ", contentId=" + i + ", mini_hubs=" + list + ")";
    }
}
