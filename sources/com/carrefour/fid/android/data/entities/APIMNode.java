package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jo\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00008\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006."}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/APIMNode;", "", "picture_path", "", "code", "level", "", "sub_node", "name", "id", "", "orderNumber", "type", "slug", "status", "(Ljava/lang/String;Ljava/lang/String;ILcom/carrefour/fid/android/data/entities/APIMNode;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getId", "()J", "getLevel", "()I", "getName", "getOrderNumber", "getPicture_path", "getSlug", "getStatus", "getSub_node", "()Lcom/carrefour/fid/android/data/entities/APIMNode;", "getType", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class APIMNode {
    public static final int $stable = 8;
    @C33608c("code")
    @C12579k
    private final String code;
    @C33608c("id")

    /* renamed from: id */
    private final long f90051id;
    @C33608c("level")
    private final int level;
    @C33608c("name")
    @C12579k
    private final String name;
    @C33608c("order_num")
    private final long orderNumber;
    @C33608c("picture_path")
    @C12579k
    private final String picture_path;
    @C33608c("slug")
    @C12579k
    private final String slug;
    @C33608c("status")
    @C12579k
    private final String status;
    @C33608c("sub_node")
    @C12580l
    private final APIMNode sub_node;
    @C33608c("type")
    @C12579k
    private final String type;

    public APIMNode(@C12579k String str, @C12579k String str2, int i, @C12580l APIMNode aPIMNode, @C12579k String str3, long j, long j2, @C12579k String str4, @C12579k String str5, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "picture_path");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "type");
        Intrinsics.checkNotNullParameter(str5, "slug");
        Intrinsics.checkNotNullParameter(str6, "status");
        this.picture_path = str;
        this.code = str2;
        this.level = i;
        this.sub_node = aPIMNode;
        this.name = str3;
        this.f90051id = j;
        this.orderNumber = j2;
        this.type = str4;
        this.slug = str5;
        this.status = str6;
    }

    public static /* synthetic */ APIMNode copy$default(APIMNode aPIMNode, String str, String str2, int i, APIMNode aPIMNode2, String str3, long j, long j2, String str4, String str5, String str6, int i2, Object obj) {
        APIMNode aPIMNode3 = aPIMNode;
        int i3 = i2;
        return aPIMNode.copy((i3 & 1) != 0 ? aPIMNode3.picture_path : str, (i3 & 2) != 0 ? aPIMNode3.code : str2, (i3 & 4) != 0 ? aPIMNode3.level : i, (i3 & 8) != 0 ? aPIMNode3.sub_node : aPIMNode2, (i3 & 16) != 0 ? aPIMNode3.name : str3, (i3 & 32) != 0 ? aPIMNode3.f90051id : j, (i3 & 64) != 0 ? aPIMNode3.orderNumber : j2, (i3 & 128) != 0 ? aPIMNode3.type : str4, (i3 & 256) != 0 ? aPIMNode3.slug : str5, (i3 & 512) != 0 ? aPIMNode3.status : str6);
    }

    @C12579k
    public final String component1() {
        return this.picture_path;
    }

    @C12579k
    public final String component10() {
        return this.status;
    }

    @C12579k
    public final String component2() {
        return this.code;
    }

    public final int component3() {
        return this.level;
    }

    @C12580l
    public final APIMNode component4() {
        return this.sub_node;
    }

    @C12579k
    public final String component5() {
        return this.name;
    }

    public final long component6() {
        return this.f90051id;
    }

    public final long component7() {
        return this.orderNumber;
    }

    @C12579k
    public final String component8() {
        return this.type;
    }

    @C12579k
    public final String component9() {
        return this.slug;
    }

    @C12579k
    public final APIMNode copy(@C12579k String str, @C12579k String str2, int i, @C12580l APIMNode aPIMNode, @C12579k String str3, long j, long j2, @C12579k String str4, @C12579k String str5, @C12579k String str6) {
        Intrinsics.checkNotNullParameter(str, "picture_path");
        String str7 = str2;
        Intrinsics.checkNotNullParameter(str7, "code");
        String str8 = str3;
        Intrinsics.checkNotNullParameter(str8, "name");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "type");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "slug");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "status");
        return new APIMNode(str, str7, i, aPIMNode, str8, j, j2, str9, str10, str11);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIMNode)) {
            return false;
        }
        APIMNode aPIMNode = (APIMNode) obj;
        return Intrinsics.areEqual((Object) this.picture_path, (Object) aPIMNode.picture_path) && Intrinsics.areEqual((Object) this.code, (Object) aPIMNode.code) && this.level == aPIMNode.level && Intrinsics.areEqual((Object) this.sub_node, (Object) aPIMNode.sub_node) && Intrinsics.areEqual((Object) this.name, (Object) aPIMNode.name) && this.f90051id == aPIMNode.f90051id && this.orderNumber == aPIMNode.orderNumber && Intrinsics.areEqual((Object) this.type, (Object) aPIMNode.type) && Intrinsics.areEqual((Object) this.slug, (Object) aPIMNode.slug) && Intrinsics.areEqual((Object) this.status, (Object) aPIMNode.status);
    }

    @C12579k
    public final String getCode() {
        return this.code;
    }

    public final long getId() {
        return this.f90051id;
    }

    public final int getLevel() {
        return this.level;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    public final long getOrderNumber() {
        return this.orderNumber;
    }

    @C12579k
    public final String getPicture_path() {
        return this.picture_path;
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
    public final APIMNode getSub_node() {
        return this.sub_node;
    }

    @C12579k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.picture_path.hashCode() * 31) + this.code.hashCode()) * 31) + Integer.hashCode(this.level)) * 31;
        APIMNode aPIMNode = this.sub_node;
        return ((((((((((((hashCode + (aPIMNode == null ? 0 : aPIMNode.hashCode())) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.f90051id)) * 31) + Long.hashCode(this.orderNumber)) * 31) + this.type.hashCode()) * 31) + this.slug.hashCode()) * 31) + this.status.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.picture_path;
        String str2 = this.code;
        int i = this.level;
        APIMNode aPIMNode = this.sub_node;
        String str3 = this.name;
        long j = this.f90051id;
        long j2 = this.orderNumber;
        String str4 = this.type;
        String str5 = this.slug;
        String str6 = this.status;
        return "APIMNode(picture_path=" + str + ", code=" + str2 + ", level=" + i + ", sub_node=" + aPIMNode + ", name=" + str3 + ", id=" + j + ", orderNumber=" + j2 + ", type=" + str4 + ", slug=" + str5 + ", status=" + str6 + ")";
    }
}
