package com.carrefour.fid.android.data.entities.luckycart;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBannerDetailsEntity;", "", "imageUrl", "", "name", "action", "Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBannerActionEntity;", "(Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBannerActionEntity;)V", "getAction", "()Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBannerActionEntity;", "getImageUrl", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class LuckyCartBannerDetailsEntity {
    public static final int $stable = 0;
    @C33608c("action")
    @C12580l
    private final LuckyCartBannerActionEntity action;
    @C33608c("image_url")
    @C12580l
    private final String imageUrl;
    @C33608c("name")
    @C12580l
    private final String name;

    public LuckyCartBannerDetailsEntity() {
        this((String) null, (String) null, (LuckyCartBannerActionEntity) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LuckyCartBannerDetailsEntity copy$default(LuckyCartBannerDetailsEntity luckyCartBannerDetailsEntity, String str, String str2, LuckyCartBannerActionEntity luckyCartBannerActionEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = luckyCartBannerDetailsEntity.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = luckyCartBannerDetailsEntity.name;
        }
        if ((i & 4) != 0) {
            luckyCartBannerActionEntity = luckyCartBannerDetailsEntity.action;
        }
        return luckyCartBannerDetailsEntity.copy(str, str2, luckyCartBannerActionEntity);
    }

    @C12580l
    public final String component1() {
        return this.imageUrl;
    }

    @C12580l
    public final String component2() {
        return this.name;
    }

    @C12580l
    public final LuckyCartBannerActionEntity component3() {
        return this.action;
    }

    @C12579k
    public final LuckyCartBannerDetailsEntity copy(@C12580l String str, @C12580l String str2, @C12580l LuckyCartBannerActionEntity luckyCartBannerActionEntity) {
        return new LuckyCartBannerDetailsEntity(str, str2, luckyCartBannerActionEntity);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LuckyCartBannerDetailsEntity)) {
            return false;
        }
        LuckyCartBannerDetailsEntity luckyCartBannerDetailsEntity = (LuckyCartBannerDetailsEntity) obj;
        return Intrinsics.areEqual((Object) this.imageUrl, (Object) luckyCartBannerDetailsEntity.imageUrl) && Intrinsics.areEqual((Object) this.name, (Object) luckyCartBannerDetailsEntity.name) && Intrinsics.areEqual((Object) this.action, (Object) luckyCartBannerDetailsEntity.action);
    }

    @C12580l
    public final LuckyCartBannerActionEntity getAction() {
        return this.action;
    }

    @C12580l
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @C12580l
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LuckyCartBannerActionEntity luckyCartBannerActionEntity = this.action;
        if (luckyCartBannerActionEntity != null) {
            i = luckyCartBannerActionEntity.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.name;
        LuckyCartBannerActionEntity luckyCartBannerActionEntity = this.action;
        return "LuckyCartBannerDetailsEntity(imageUrl=" + str + ", name=" + str2 + ", action=" + luckyCartBannerActionEntity + ")";
    }

    public LuckyCartBannerDetailsEntity(@C12580l String str, @C12580l String str2, @C12580l LuckyCartBannerActionEntity luckyCartBannerActionEntity) {
        this.imageUrl = str;
        this.name = str2;
        this.action = luckyCartBannerActionEntity;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LuckyCartBannerDetailsEntity(String str, String str2, LuckyCartBannerActionEntity luckyCartBannerActionEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : luckyCartBannerActionEntity);
    }
}
