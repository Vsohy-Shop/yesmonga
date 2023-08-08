package com.carrefour.fid.android.data.entities.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33606a;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/coupons/CouponImageEntity;", "Ljava/io/Serializable;", "", "a", "b", "c", "damId", "imagePatternId", "imageName", "d", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "h", "g", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CouponImageEntity implements Serializable {

    /* renamed from: a */
    public static final int f90072a = 0;
    @C33608c("dam_id")
    @C12579k
    @C33606a
    private final String damId;
    @C33608c("name")
    @C12579k
    @C33606a
    private final String imageName;
    @C33608c("pattern_id")
    @C12579k
    @C33606a
    private final String imagePatternId;

    public CouponImageEntity() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ CouponImageEntity m149438e(CouponImageEntity couponImageEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = couponImageEntity.damId;
        }
        if ((i & 2) != 0) {
            str2 = couponImageEntity.imagePatternId;
        }
        if ((i & 4) != 0) {
            str3 = couponImageEntity.imageName;
        }
        return couponImageEntity.mo110921d(str, str2, str3);
    }

    @C12579k
    /* renamed from: a */
    public final String mo110918a() {
        return this.damId;
    }

    @C12579k
    /* renamed from: b */
    public final String mo110919b() {
        return this.imagePatternId;
    }

    @C12579k
    /* renamed from: c */
    public final String mo110920c() {
        return this.imageName;
    }

    @C12579k
    /* renamed from: d */
    public final CouponImageEntity mo110921d(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "damId");
        Intrinsics.checkNotNullParameter(str2, "imagePatternId");
        Intrinsics.checkNotNullParameter(str3, "imageName");
        return new CouponImageEntity(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponImageEntity)) {
            return false;
        }
        CouponImageEntity couponImageEntity = (CouponImageEntity) obj;
        return Intrinsics.areEqual((Object) this.damId, (Object) couponImageEntity.damId) && Intrinsics.areEqual((Object) this.imagePatternId, (Object) couponImageEntity.imagePatternId) && Intrinsics.areEqual((Object) this.imageName, (Object) couponImageEntity.imageName);
    }

    @C12579k
    /* renamed from: f */
    public final String mo110923f() {
        return this.damId;
    }

    @C12579k
    /* renamed from: g */
    public final String mo110924g() {
        return this.imageName;
    }

    @C12579k
    /* renamed from: h */
    public final String mo110925h() {
        return this.imagePatternId;
    }

    public int hashCode() {
        return (((this.damId.hashCode() * 31) + this.imagePatternId.hashCode()) * 31) + this.imageName.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.damId;
        String str2 = this.imagePatternId;
        String str3 = this.imageName;
        return "CouponImageEntity(damId=" + str + ", imagePatternId=" + str2 + ", imageName=" + str3 + ")";
    }

    public CouponImageEntity(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "damId");
        Intrinsics.checkNotNullParameter(str2, "imagePatternId");
        Intrinsics.checkNotNullParameter(str3, "imageName");
        this.damId = str;
        this.imagePatternId = str2;
        this.imageName = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CouponImageEntity(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
