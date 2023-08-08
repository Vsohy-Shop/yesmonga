package com.carrefour.fid.android.data.entities.luckycart;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartTicketEntity;", "", "imageUrl", "", "redirectionUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getRedirectionUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class LuckyCartTicketEntity {
    public static final int $stable = 0;
    @C33608c("introMobile")
    @C12580l
    private final String imageUrl;
    @C33608c("mobileUrl")
    @C12580l
    private final String redirectionUrl;

    public LuckyCartTicketEntity() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LuckyCartTicketEntity copy$default(LuckyCartTicketEntity luckyCartTicketEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = luckyCartTicketEntity.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = luckyCartTicketEntity.redirectionUrl;
        }
        return luckyCartTicketEntity.copy(str, str2);
    }

    @C12580l
    public final String component1() {
        return this.imageUrl;
    }

    @C12580l
    public final String component2() {
        return this.redirectionUrl;
    }

    @C12579k
    public final LuckyCartTicketEntity copy(@C12580l String str, @C12580l String str2) {
        return new LuckyCartTicketEntity(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LuckyCartTicketEntity)) {
            return false;
        }
        LuckyCartTicketEntity luckyCartTicketEntity = (LuckyCartTicketEntity) obj;
        return Intrinsics.areEqual((Object) this.imageUrl, (Object) luckyCartTicketEntity.imageUrl) && Intrinsics.areEqual((Object) this.redirectionUrl, (Object) luckyCartTicketEntity.redirectionUrl);
    }

    @C12580l
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @C12580l
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectionUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.redirectionUrl;
        return "LuckyCartTicketEntity(imageUrl=" + str + ", redirectionUrl=" + str2 + ")";
    }

    public LuckyCartTicketEntity(@C12580l String str, @C12580l String str2) {
        this.imageUrl = str;
        this.redirectionUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LuckyCartTicketEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
