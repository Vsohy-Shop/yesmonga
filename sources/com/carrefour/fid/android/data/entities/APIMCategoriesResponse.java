package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b/\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J¹\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0005HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001fR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019¨\u0006@"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMCategoriesResponse;", "", "picturePath", "", "level", "", "subNode", "", "isBoutique", "", "isMainLink", "idPath", "type", "scope", "name", "orderNum", "id", "", "slug", "status", "copyOfId", "fieldPath", "fieldPathOrigin", "(Ljava/lang/String;ILjava/util/List;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCopyOfId", "()Ljava/lang/String;", "getFieldPath", "getFieldPathOrigin", "getId", "()J", "getIdPath", "()Z", "getLevel", "()I", "getName", "getOrderNum", "getPicturePath", "getScope", "getSlug", "getStatus", "getSubNode", "()Ljava/util/List;", "getType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMCategoriesResponse {
    public static final int $stable = 8;
    @C33608c("copy_of")
    @C12580l
    private final String copyOfId;
    @C33608c("fieldPath")
    @C12580l
    private final String fieldPath;
    @C33608c("field_path_origin")
    @C12580l
    private final String fieldPathOrigin;
    @C33608c("id")

    /* renamed from: id */
    private final long f90050id;
    @C33608c("id_path")
    @C12579k
    private final String idPath;
    @C33608c("is_boutique")
    private final boolean isBoutique;
    @C33608c("is_main_link")
    private final boolean isMainLink;
    @C33608c("level")
    private final int level;
    @C33608c("name")
    @C12579k
    private final String name;
    @C33608c("order_num")
    private final int orderNum;
    @C33608c("picture_path")
    @C12580l
    private final String picturePath;
    @C33608c("scope")
    private final int scope;
    @C33608c("slug")
    @C12579k
    private final String slug;
    @C33608c("status")
    @C12579k
    private final String status;
    @C33608c("sub_node")
    @C12580l
    private final List<APIMCategoriesResponse> subNode;
    @C33608c("type")
    @C12579k
    private final String type;

    public APIMCategoriesResponse(@C12580l String str, int i, @C12580l List<APIMCategoriesResponse> list, boolean z, boolean z2, @C12579k String str2, @C12579k String str3, int i2, @C12579k String str4, int i3, long j, @C12579k String str5, @C12579k String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9) {
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str2, "idPath");
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(str10, "name");
        Intrinsics.checkNotNullParameter(str11, "slug");
        Intrinsics.checkNotNullParameter(str12, "status");
        this.picturePath = str;
        this.level = i;
        this.subNode = list;
        this.isBoutique = z;
        this.isMainLink = z2;
        this.idPath = str2;
        this.type = str3;
        this.scope = i2;
        this.name = str10;
        this.orderNum = i3;
        this.f90050id = j;
        this.slug = str11;
        this.status = str12;
        this.copyOfId = str7;
        this.fieldPath = str8;
        this.fieldPathOrigin = str9;
    }

    public static /* synthetic */ APIMCategoriesResponse copy$default(APIMCategoriesResponse aPIMCategoriesResponse, String str, int i, List list, boolean z, boolean z2, String str2, String str3, int i2, String str4, int i3, long j, String str5, String str6, String str7, String str8, String str9, int i4, Object obj) {
        APIMCategoriesResponse aPIMCategoriesResponse2 = aPIMCategoriesResponse;
        int i5 = i4;
        return aPIMCategoriesResponse.copy((i5 & 1) != 0 ? aPIMCategoriesResponse2.picturePath : str, (i5 & 2) != 0 ? aPIMCategoriesResponse2.level : i, (i5 & 4) != 0 ? aPIMCategoriesResponse2.subNode : list, (i5 & 8) != 0 ? aPIMCategoriesResponse2.isBoutique : z, (i5 & 16) != 0 ? aPIMCategoriesResponse2.isMainLink : z2, (i5 & 32) != 0 ? aPIMCategoriesResponse2.idPath : str2, (i5 & 64) != 0 ? aPIMCategoriesResponse2.type : str3, (i5 & 128) != 0 ? aPIMCategoriesResponse2.scope : i2, (i5 & 256) != 0 ? aPIMCategoriesResponse2.name : str4, (i5 & 512) != 0 ? aPIMCategoriesResponse2.orderNum : i3, (i5 & 1024) != 0 ? aPIMCategoriesResponse2.f90050id : j, (i5 & 2048) != 0 ? aPIMCategoriesResponse2.slug : str5, (i5 & 4096) != 0 ? aPIMCategoriesResponse2.status : str6, (i5 & 8192) != 0 ? aPIMCategoriesResponse2.copyOfId : str7, (i5 & 16384) != 0 ? aPIMCategoriesResponse2.fieldPath : str8, (i5 & 32768) != 0 ? aPIMCategoriesResponse2.fieldPathOrigin : str9);
    }

    @C12580l
    public final String component1() {
        return this.picturePath;
    }

    public final int component10() {
        return this.orderNum;
    }

    public final long component11() {
        return this.f90050id;
    }

    @C12579k
    public final String component12() {
        return this.slug;
    }

    @C12579k
    public final String component13() {
        return this.status;
    }

    @C12580l
    public final String component14() {
        return this.copyOfId;
    }

    @C12580l
    public final String component15() {
        return this.fieldPath;
    }

    @C12580l
    public final String component16() {
        return this.fieldPathOrigin;
    }

    public final int component2() {
        return this.level;
    }

    @C12580l
    public final List<APIMCategoriesResponse> component3() {
        return this.subNode;
    }

    public final boolean component4() {
        return this.isBoutique;
    }

    public final boolean component5() {
        return this.isMainLink;
    }

    @C12579k
    public final String component6() {
        return this.idPath;
    }

    @C12579k
    public final String component7() {
        return this.type;
    }

    public final int component8() {
        return this.scope;
    }

    @C12579k
    public final String component9() {
        return this.name;
    }

    @C12579k
    public final APIMCategoriesResponse copy(@C12580l String str, int i, @C12580l List<APIMCategoriesResponse> list, boolean z, boolean z2, @C12579k String str2, @C12579k String str3, int i2, @C12579k String str4, int i3, long j, @C12579k String str5, @C12579k String str6, @C12580l String str7, @C12580l String str8, @C12580l String str9) {
        String str10 = str;
        Intrinsics.checkNotNullParameter(str2, "idPath");
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "slug");
        Intrinsics.checkNotNullParameter(str6, "status");
        return new APIMCategoriesResponse(str, i, list, z, z2, str2, str3, i2, str4, i3, j, str5, str6, str7, str8, str9);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMCategoriesResponse)) {
            return false;
        }
        APIMCategoriesResponse aPIMCategoriesResponse = (APIMCategoriesResponse) obj;
        return Intrinsics.areEqual((Object) this.picturePath, (Object) aPIMCategoriesResponse.picturePath) && this.level == aPIMCategoriesResponse.level && Intrinsics.areEqual((Object) this.subNode, (Object) aPIMCategoriesResponse.subNode) && this.isBoutique == aPIMCategoriesResponse.isBoutique && this.isMainLink == aPIMCategoriesResponse.isMainLink && Intrinsics.areEqual((Object) this.idPath, (Object) aPIMCategoriesResponse.idPath) && Intrinsics.areEqual((Object) this.type, (Object) aPIMCategoriesResponse.type) && this.scope == aPIMCategoriesResponse.scope && Intrinsics.areEqual((Object) this.name, (Object) aPIMCategoriesResponse.name) && this.orderNum == aPIMCategoriesResponse.orderNum && this.f90050id == aPIMCategoriesResponse.f90050id && Intrinsics.areEqual((Object) this.slug, (Object) aPIMCategoriesResponse.slug) && Intrinsics.areEqual((Object) this.status, (Object) aPIMCategoriesResponse.status) && Intrinsics.areEqual((Object) this.copyOfId, (Object) aPIMCategoriesResponse.copyOfId) && Intrinsics.areEqual((Object) this.fieldPath, (Object) aPIMCategoriesResponse.fieldPath) && Intrinsics.areEqual((Object) this.fieldPathOrigin, (Object) aPIMCategoriesResponse.fieldPathOrigin);
    }

    @C12580l
    public final String getCopyOfId() {
        return this.copyOfId;
    }

    @C12580l
    public final String getFieldPath() {
        return this.fieldPath;
    }

    @C12580l
    public final String getFieldPathOrigin() {
        return this.fieldPathOrigin;
    }

    public final long getId() {
        return this.f90050id;
    }

    @C12579k
    public final String getIdPath() {
        return this.idPath;
    }

    public final int getLevel() {
        return this.level;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    public final int getOrderNum() {
        return this.orderNum;
    }

    @C12580l
    public final String getPicturePath() {
        return this.picturePath;
    }

    public final int getScope() {
        return this.scope;
    }

    @C12579k
    public final String getSlug() {
        return this.slug;
    }

    @C12579k
    public final String getStatus() {
        return this.status;
    }

    @C12580l
    public final List<APIMCategoriesResponse> getSubNode() {
        return this.subNode;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.picturePath;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.level)) * 31;
        List<APIMCategoriesResponse> list = this.subNode;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.isBoutique;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isMainLink;
        if (!z3) {
            z2 = z3;
        }
        int hashCode3 = (((((((((((((((((i2 + (z2 ? 1 : 0)) * 31) + this.idPath.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.scope)) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.orderNum)) * 31) + Long.hashCode(this.f90050id)) * 31) + this.slug.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str2 = this.copyOfId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fieldPath;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fieldPathOrigin;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public final boolean isBoutique() {
        return this.isBoutique;
    }

    public final boolean isMainLink() {
        return this.isMainLink;
    }

    @C12579k
    public String toString() {
        String str = this.picturePath;
        int i = this.level;
        List<APIMCategoriesResponse> list = this.subNode;
        boolean z = this.isBoutique;
        boolean z2 = this.isMainLink;
        String str2 = this.idPath;
        String str3 = this.type;
        int i2 = this.scope;
        String str4 = this.name;
        int i3 = this.orderNum;
        long j = this.f90050id;
        String str5 = this.slug;
        String str6 = this.status;
        String str7 = this.copyOfId;
        String str8 = this.fieldPath;
        String str9 = this.fieldPathOrigin;
        return "APIMCategoriesResponse(picturePath=" + str + ", level=" + i + ", subNode=" + list + ", isBoutique=" + z + ", isMainLink=" + z2 + ", idPath=" + str2 + ", type=" + str3 + ", scope=" + i2 + ", name=" + str4 + ", orderNum=" + i3 + ", id=" + j + ", slug=" + str5 + ", status=" + str6 + ", copyOfId=" + str7 + ", fieldPath=" + str8 + ", fieldPathOrigin=" + str9 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ APIMCategoriesResponse(String str, int i, List list, boolean z, boolean z2, String str2, String str3, int i2, String str4, int i3, long j, String str5, String str6, String str7, String str8, String str9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, i, (i4 & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, z, z2, str2, str3, i2, str4, i3, j, str5, str6, str7, str8, str9);
    }
}
