package com.carrefour.fid.android.catalogs.data.api.entities.responses.catalogdetails;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J/\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/CatalogProductDescriptionResponse;", "", "", "component1", "component2", "", "Lcom/carrefour/fid/android/catalogs/data/api/entities/responses/catalogdetails/b;", "component3", "label", "content", "pictos", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getContent", "Ljava/util/List;", "getPictos", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
public final class CatalogProductDescriptionResponse {
    @C33608c("content")
    @C12579k
    private final String content;
    @C33608c("label")
    @C12579k
    private final String label;
    @C33608c("pictos")
    @C12580l
    private final List<C39399b> pictos;

    public CatalogProductDescriptionResponse() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogProductDescriptionResponse copy$default(CatalogProductDescriptionResponse catalogProductDescriptionResponse, String str, String str2, List<C39399b> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogProductDescriptionResponse.label;
        }
        if ((i & 2) != 0) {
            str2 = catalogProductDescriptionResponse.content;
        }
        if ((i & 4) != 0) {
            list = catalogProductDescriptionResponse.pictos;
        }
        return catalogProductDescriptionResponse.copy(str, str2, list);
    }

    @C12579k
    public final String component1() {
        return this.label;
    }

    @C12579k
    public final String component2() {
        return this.content;
    }

    @C12580l
    public final List<C39399b> component3() {
        return this.pictos;
    }

    @C12579k
    public final CatalogProductDescriptionResponse copy(@C12579k String str, @C12579k String str2, @C12580l List<C39399b> list) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "content");
        return new CatalogProductDescriptionResponse(str, str2, list);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogProductDescriptionResponse)) {
            return false;
        }
        CatalogProductDescriptionResponse catalogProductDescriptionResponse = (CatalogProductDescriptionResponse) obj;
        return Intrinsics.areEqual((Object) this.label, (Object) catalogProductDescriptionResponse.label) && Intrinsics.areEqual((Object) this.content, (Object) catalogProductDescriptionResponse.content) && Intrinsics.areEqual((Object) this.pictos, (Object) catalogProductDescriptionResponse.pictos);
    }

    @C12579k
    public final String getContent() {
        return this.content;
    }

    @C12579k
    public final String getLabel() {
        return this.label;
    }

    @C12580l
    public final List<C39399b> getPictos() {
        return this.pictos;
    }

    public int hashCode() {
        int hashCode = ((this.label.hashCode() * 31) + this.content.hashCode()) * 31;
        List<C39399b> list = this.pictos;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @C12579k
    public String toString() {
        String str = this.label;
        String str2 = this.content;
        List<C39399b> list = this.pictos;
        return "CatalogProductDescriptionResponse(label=" + str + ", content=" + str2 + ", pictos=" + list + ")";
    }

    public CatalogProductDescriptionResponse(@C12579k String str, @C12579k String str2, @C12580l List<C39399b> list) {
        Intrinsics.checkNotNullParameter(str, "label");
        Intrinsics.checkNotNullParameter(str2, "content");
        this.label = str;
        this.content = str2;
        this.pictos = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogProductDescriptionResponse(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? null : list);
    }
}
