package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/BlockCmsResponse;", "", "templateId", "", "title", "description", "weight", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getTemplateId", "setTemplateId", "getTitle", "setTitle", "getWeight", "()Ljava/lang/Integer;", "setWeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/cms/data/entities/BlockCmsResponse;", "equals", "", "other", "hashCode", "toString", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class BlockCmsResponse {
    @C33608c("description")
    @C12580l
    private String description;
    @C33608c("template_id")
    @C12580l
    private String templateId;
    @C33608c("title")
    @C12580l
    private String title;
    @C33608c("weight")
    @C12580l
    private Integer weight;

    public BlockCmsResponse() {
        this((String) null, (String) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BlockCmsResponse copy$default(BlockCmsResponse blockCmsResponse, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blockCmsResponse.templateId;
        }
        if ((i & 2) != 0) {
            str2 = blockCmsResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = blockCmsResponse.description;
        }
        if ((i & 8) != 0) {
            num = blockCmsResponse.weight;
        }
        return blockCmsResponse.copy(str, str2, str3, num);
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
    public final String component3() {
        return this.description;
    }

    @C12580l
    public final Integer component4() {
        return this.weight;
    }

    @C12579k
    public final BlockCmsResponse copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Integer num) {
        return new BlockCmsResponse(str, str2, str3, num);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockCmsResponse)) {
            return false;
        }
        BlockCmsResponse blockCmsResponse = (BlockCmsResponse) obj;
        return Intrinsics.areEqual((Object) this.templateId, (Object) blockCmsResponse.templateId) && Intrinsics.areEqual((Object) this.title, (Object) blockCmsResponse.title) && Intrinsics.areEqual((Object) this.description, (Object) blockCmsResponse.description) && Intrinsics.areEqual((Object) this.weight, (Object) blockCmsResponse.weight);
    }

    @C12580l
    public final String getDescription() {
        return this.description;
    }

    @C12580l
    public final String getTemplateId() {
        return this.templateId;
    }

    @C12580l
    public final String getTitle() {
        return this.title;
    }

    @C12580l
    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.templateId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.weight;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setDescription(@C12580l String str) {
        this.description = str;
    }

    public final void setTemplateId(@C12580l String str) {
        this.templateId = str;
    }

    public final void setTitle(@C12580l String str) {
        this.title = str;
    }

    public final void setWeight(@C12580l Integer num) {
        this.weight = num;
    }

    @C12579k
    public String toString() {
        String str = this.templateId;
        String str2 = this.title;
        String str3 = this.description;
        Integer num = this.weight;
        return "BlockCmsResponse(templateId=" + str + ", title=" + str2 + ", description=" + str3 + ", weight=" + num + ")";
    }

    public BlockCmsResponse(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Integer num) {
        this.templateId = str;
        this.title = str2;
        this.description = str3;
        this.weight = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockCmsResponse(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }
}
