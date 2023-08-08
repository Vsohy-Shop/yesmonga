package com.carrefour.fid.android.data.entities.luckycart;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/luckycart/LuckyCartBannersEntity;", "", "homePage", "", "", "promotions", "categories", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "getHomePage", "getPromotions", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class LuckyCartBannersEntity {
    public static final int $stable = 8;
    @C33608c("categories")
    @C12580l
    private final List<String> categories;
    @C33608c("homepage")
    @C12580l
    private final List<String> homePage;
    @C33608c("promotions")
    @C12580l
    private final List<String> promotions;

    public LuckyCartBannersEntity() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LuckyCartBannersEntity copy$default(LuckyCartBannersEntity luckyCartBannersEntity, List<String> list, List<String> list2, List<String> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = luckyCartBannersEntity.homePage;
        }
        if ((i & 2) != 0) {
            list2 = luckyCartBannersEntity.promotions;
        }
        if ((i & 4) != 0) {
            list3 = luckyCartBannersEntity.categories;
        }
        return luckyCartBannersEntity.copy(list, list2, list3);
    }

    @C12580l
    public final List<String> component1() {
        return this.homePage;
    }

    @C12580l
    public final List<String> component2() {
        return this.promotions;
    }

    @C12580l
    public final List<String> component3() {
        return this.categories;
    }

    @C12579k
    public final LuckyCartBannersEntity copy(@C12580l List<String> list, @C12580l List<String> list2, @C12580l List<String> list3) {
        return new LuckyCartBannersEntity(list, list2, list3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LuckyCartBannersEntity)) {
            return false;
        }
        LuckyCartBannersEntity luckyCartBannersEntity = (LuckyCartBannersEntity) obj;
        return Intrinsics.areEqual((Object) this.homePage, (Object) luckyCartBannersEntity.homePage) && Intrinsics.areEqual((Object) this.promotions, (Object) luckyCartBannersEntity.promotions) && Intrinsics.areEqual((Object) this.categories, (Object) luckyCartBannersEntity.categories);
    }

    @C12580l
    public final List<String> getCategories() {
        return this.categories;
    }

    @C12580l
    public final List<String> getHomePage() {
        return this.homePage;
    }

    @C12580l
    public final List<String> getPromotions() {
        return this.promotions;
    }

    public int hashCode() {
        List<String> list = this.homePage;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.promotions;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.categories;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        List<String> list = this.homePage;
        List<String> list2 = this.promotions;
        List<String> list3 = this.categories;
        return "LuckyCartBannersEntity(homePage=" + list + ", promotions=" + list2 + ", categories=" + list3 + ")";
    }

    public LuckyCartBannersEntity(@C12580l List<String> list, @C12580l List<String> list2, @C12580l List<String> list3) {
        this.homePage = list;
        this.promotions = list2;
        this.categories = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LuckyCartBannersEntity(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
