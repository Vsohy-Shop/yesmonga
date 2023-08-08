package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/DataCmsResponse;", "", "templateId", "", "title", "blocks", "", "Lcom/carrefour/fid/android/cms/data/entities/BlockCmsResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBlocks", "()Ljava/util/List;", "setBlocks", "(Ljava/util/List;)V", "getTemplateId", "()Ljava/lang/String;", "setTemplateId", "(Ljava/lang/String;)V", "getTitle", "setTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class DataCmsResponse {
    @C33608c("blocks")
    @C12580l
    private List<BlockCmsResponse> blocks;
    @C33608c("template_id")
    @C12580l
    private String templateId;
    @C33608c("title")
    @C12580l
    private String title;

    public DataCmsResponse() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DataCmsResponse copy$default(DataCmsResponse dataCmsResponse, String str, String str2, List<BlockCmsResponse> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataCmsResponse.templateId;
        }
        if ((i & 2) != 0) {
            str2 = dataCmsResponse.title;
        }
        if ((i & 4) != 0) {
            list = dataCmsResponse.blocks;
        }
        return dataCmsResponse.copy(str, str2, list);
    }

    @C12580l
    public final String component1() {
        return this.templateId;
    }

    @C12580l
    public final String component2() {
        return this.title;
    }

    @C12580l
    public final List<BlockCmsResponse> component3() {
        return this.blocks;
    }

    @C12579k
    public final DataCmsResponse copy(@C12580l String str, @C12580l String str2, @C12580l List<BlockCmsResponse> list) {
        return new DataCmsResponse(str, str2, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCmsResponse)) {
            return false;
        }
        DataCmsResponse dataCmsResponse = (DataCmsResponse) obj;
        return Intrinsics.areEqual((Object) this.templateId, (Object) dataCmsResponse.templateId) && Intrinsics.areEqual((Object) this.title, (Object) dataCmsResponse.title) && Intrinsics.areEqual((Object) this.blocks, (Object) dataCmsResponse.blocks);
    }

    @C12580l
    public final List<BlockCmsResponse> getBlocks() {
        return this.blocks;
    }

    @C12580l
    public final String getTemplateId() {
        return this.templateId;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.templateId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BlockCmsResponse> list = this.blocks;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setBlocks(@C12580l List<BlockCmsResponse> list) {
        this.blocks = list;
    }

    public final void setTemplateId(@C12580l String str) {
        this.templateId = str;
    }

    public final void setTitle(@C12580l String str) {
        this.title = str;
    }

    @C12579k
    public String toString() {
        String str = this.templateId;
        String str2 = this.title;
        List<BlockCmsResponse> list = this.blocks;
        return "DataCmsResponse(templateId=" + str + ", title=" + str2 + ", blocks=" + list + ")";
    }

    public DataCmsResponse(@C12580l String str, @C12580l String str2, @C12580l List<BlockCmsResponse> list) {
        this.templateId = str;
        this.title = str2;
        this.blocks = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataCmsResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
