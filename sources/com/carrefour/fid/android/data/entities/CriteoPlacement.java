package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0002\u00103\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u0006;"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/CriteoPlacement;", "", "categoryPlacement", "", "Lcom/carrefour/fid/android/data/entities/CriteoViewCategory;", "categoryButterflyPlacement", "categorySecondButterflyPlacement", "categoryFlagshipPlacement", "searchResultPlacement", "searchResultButterflyPlacement", "searchResultSecondButterflyPlacement", "searchResultFlagshipPlacement", "itemPlacement", "basketPlacement", "storePlacement", "catalogPlacement", "insideCatalogPlacement", "homePlacement", "secondHomePlacement", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBasketPlacement", "()Ljava/util/List;", "getCatalogPlacement", "getCategoryButterflyPlacement", "getCategoryFlagshipPlacement", "getCategoryPlacement", "getCategorySecondButterflyPlacement", "getHomePlacement", "getInsideCatalogPlacement", "getItemPlacement", "getSearchResultButterflyPlacement", "getSearchResultFlagshipPlacement", "getSearchResultPlacement", "getSearchResultSecondButterflyPlacement", "getSecondHomePlacement", "getStorePlacement", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class CriteoPlacement {
    public static final int $stable = 8;
    @C33608c("viewBasketApiApp-bottom")
    @C12580l
    private final List<CriteoViewCategory> basketPlacement;
    @C33608c("viewCatalogueApiApp-inGrid")
    @C12580l
    private final List<CriteoViewCategory> catalogPlacement;
    @C33608c("viewCategoryApiApp-inGrid1")
    @C12580l
    private final List<CriteoViewCategory> categoryButterflyPlacement;
    @C33608c("viewCategoryApiApp-inGridFs")
    @C12580l
    private final List<CriteoViewCategory> categoryFlagshipPlacement;
    @C33608c("viewCategoryApiApp-inGrid3")
    @C12580l
    private final List<CriteoViewCategory> categoryPlacement;
    @C33608c("viewCategoryApiApp-inGrid4")
    @C12580l
    private final List<CriteoViewCategory> categorySecondButterflyPlacement;
    @C33608c("viewHomeApiApp-inList2")
    @C12580l
    private final List<CriteoViewCategory> homePlacement;
    @C33608c("viewInsideCatalogueApiApp-inGrid")
    @C12580l
    private final List<CriteoViewCategory> insideCatalogPlacement;
    @C33608c("viewItemApiApp-bottom")
    @C12580l
    private final List<CriteoViewCategory> itemPlacement;
    @C33608c("viewSearchResultApiApp-inGrid1")
    @C12580l
    private final List<CriteoViewCategory> searchResultButterflyPlacement;
    @C33608c("viewSearchResultApiApp-inGridFs")
    @C12580l
    private final List<CriteoViewCategory> searchResultFlagshipPlacement;
    @C33608c("viewSearchResultApiApp-inGrid3")
    @C12580l
    private final List<CriteoViewCategory> searchResultPlacement;
    @C33608c("viewSearchResultApiApp-inGrid4")
    @C12580l
    private final List<CriteoViewCategory> searchResultSecondButterflyPlacement;
    @C33608c("viewHomeApiApp-inList2b")
    @C12580l
    private final List<CriteoViewCategory> secondHomePlacement;
    @C33608c("viewMagasinApiApp-inList")
    @C12580l
    private final List<CriteoViewCategory> storePlacement;

    public CriteoPlacement() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CriteoPlacement copy$default(CriteoPlacement criteoPlacement, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, int i, Object obj) {
        CriteoPlacement criteoPlacement2 = criteoPlacement;
        int i2 = i;
        return criteoPlacement.copy((i2 & 1) != 0 ? criteoPlacement2.categoryPlacement : list, (i2 & 2) != 0 ? criteoPlacement2.categoryButterflyPlacement : list2, (i2 & 4) != 0 ? criteoPlacement2.categorySecondButterflyPlacement : list3, (i2 & 8) != 0 ? criteoPlacement2.categoryFlagshipPlacement : list4, (i2 & 16) != 0 ? criteoPlacement2.searchResultPlacement : list5, (i2 & 32) != 0 ? criteoPlacement2.searchResultButterflyPlacement : list6, (i2 & 64) != 0 ? criteoPlacement2.searchResultSecondButterflyPlacement : list7, (i2 & 128) != 0 ? criteoPlacement2.searchResultFlagshipPlacement : list8, (i2 & 256) != 0 ? criteoPlacement2.itemPlacement : list9, (i2 & 512) != 0 ? criteoPlacement2.basketPlacement : list10, (i2 & 1024) != 0 ? criteoPlacement2.storePlacement : list11, (i2 & 2048) != 0 ? criteoPlacement2.catalogPlacement : list12, (i2 & 4096) != 0 ? criteoPlacement2.insideCatalogPlacement : list13, (i2 & 8192) != 0 ? criteoPlacement2.homePlacement : list14, (i2 & 16384) != 0 ? criteoPlacement2.secondHomePlacement : list15);
    }

    @C12580l
    public final List<CriteoViewCategory> component1() {
        return this.categoryPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component10() {
        return this.basketPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component11() {
        return this.storePlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component12() {
        return this.catalogPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component13() {
        return this.insideCatalogPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component14() {
        return this.homePlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component15() {
        return this.secondHomePlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component2() {
        return this.categoryButterflyPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component3() {
        return this.categorySecondButterflyPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component4() {
        return this.categoryFlagshipPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component5() {
        return this.searchResultPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component6() {
        return this.searchResultButterflyPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component7() {
        return this.searchResultSecondButterflyPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component8() {
        return this.searchResultFlagshipPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> component9() {
        return this.itemPlacement;
    }

    @C12579k
    public final CriteoPlacement copy(@C12580l List<CriteoViewCategory> list, @C12580l List<CriteoViewCategory> list2, @C12580l List<CriteoViewCategory> list3, @C12580l List<CriteoViewCategory> list4, @C12580l List<CriteoViewCategory> list5, @C12580l List<CriteoViewCategory> list6, @C12580l List<CriteoViewCategory> list7, @C12580l List<CriteoViewCategory> list8, @C12580l List<CriteoViewCategory> list9, @C12580l List<CriteoViewCategory> list10, @C12580l List<CriteoViewCategory> list11, @C12580l List<CriteoViewCategory> list12, @C12580l List<CriteoViewCategory> list13, @C12580l List<CriteoViewCategory> list14, @C12580l List<CriteoViewCategory> list15) {
        return new CriteoPlacement(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CriteoPlacement)) {
            return false;
        }
        CriteoPlacement criteoPlacement = (CriteoPlacement) obj;
        return Intrinsics.areEqual((Object) this.categoryPlacement, (Object) criteoPlacement.categoryPlacement) && Intrinsics.areEqual((Object) this.categoryButterflyPlacement, (Object) criteoPlacement.categoryButterflyPlacement) && Intrinsics.areEqual((Object) this.categorySecondButterflyPlacement, (Object) criteoPlacement.categorySecondButterflyPlacement) && Intrinsics.areEqual((Object) this.categoryFlagshipPlacement, (Object) criteoPlacement.categoryFlagshipPlacement) && Intrinsics.areEqual((Object) this.searchResultPlacement, (Object) criteoPlacement.searchResultPlacement) && Intrinsics.areEqual((Object) this.searchResultButterflyPlacement, (Object) criteoPlacement.searchResultButterflyPlacement) && Intrinsics.areEqual((Object) this.searchResultSecondButterflyPlacement, (Object) criteoPlacement.searchResultSecondButterflyPlacement) && Intrinsics.areEqual((Object) this.searchResultFlagshipPlacement, (Object) criteoPlacement.searchResultFlagshipPlacement) && Intrinsics.areEqual((Object) this.itemPlacement, (Object) criteoPlacement.itemPlacement) && Intrinsics.areEqual((Object) this.basketPlacement, (Object) criteoPlacement.basketPlacement) && Intrinsics.areEqual((Object) this.storePlacement, (Object) criteoPlacement.storePlacement) && Intrinsics.areEqual((Object) this.catalogPlacement, (Object) criteoPlacement.catalogPlacement) && Intrinsics.areEqual((Object) this.insideCatalogPlacement, (Object) criteoPlacement.insideCatalogPlacement) && Intrinsics.areEqual((Object) this.homePlacement, (Object) criteoPlacement.homePlacement) && Intrinsics.areEqual((Object) this.secondHomePlacement, (Object) criteoPlacement.secondHomePlacement);
    }

    @C12580l
    public final List<CriteoViewCategory> getBasketPlacement() {
        return this.basketPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getCatalogPlacement() {
        return this.catalogPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getCategoryButterflyPlacement() {
        return this.categoryButterflyPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getCategoryFlagshipPlacement() {
        return this.categoryFlagshipPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getCategoryPlacement() {
        return this.categoryPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getCategorySecondButterflyPlacement() {
        return this.categorySecondButterflyPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getHomePlacement() {
        return this.homePlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getInsideCatalogPlacement() {
        return this.insideCatalogPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getItemPlacement() {
        return this.itemPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getSearchResultButterflyPlacement() {
        return this.searchResultButterflyPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getSearchResultFlagshipPlacement() {
        return this.searchResultFlagshipPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getSearchResultPlacement() {
        return this.searchResultPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getSearchResultSecondButterflyPlacement() {
        return this.searchResultSecondButterflyPlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getSecondHomePlacement() {
        return this.secondHomePlacement;
    }

    @C12580l
    public final List<CriteoViewCategory> getStorePlacement() {
        return this.storePlacement;
    }

    public int hashCode() {
        List<CriteoViewCategory> list = this.categoryPlacement;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CriteoViewCategory> list2 = this.categoryButterflyPlacement;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CriteoViewCategory> list3 = this.categorySecondButterflyPlacement;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CriteoViewCategory> list4 = this.categoryFlagshipPlacement;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<CriteoViewCategory> list5 = this.searchResultPlacement;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<CriteoViewCategory> list6 = this.searchResultButterflyPlacement;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<CriteoViewCategory> list7 = this.searchResultSecondButterflyPlacement;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<CriteoViewCategory> list8 = this.searchResultFlagshipPlacement;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<CriteoViewCategory> list9 = this.itemPlacement;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<CriteoViewCategory> list10 = this.basketPlacement;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<CriteoViewCategory> list11 = this.storePlacement;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<CriteoViewCategory> list12 = this.catalogPlacement;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<CriteoViewCategory> list13 = this.insideCatalogPlacement;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<CriteoViewCategory> list14 = this.homePlacement;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<CriteoViewCategory> list15 = this.secondHomePlacement;
        if (list15 != null) {
            i = list15.hashCode();
        }
        return hashCode14 + i;
    }

    @C12579k
    public String toString() {
        List<CriteoViewCategory> list = this.categoryPlacement;
        List<CriteoViewCategory> list2 = this.categoryButterflyPlacement;
        List<CriteoViewCategory> list3 = this.categorySecondButterflyPlacement;
        List<CriteoViewCategory> list4 = this.categoryFlagshipPlacement;
        List<CriteoViewCategory> list5 = this.searchResultPlacement;
        List<CriteoViewCategory> list6 = this.searchResultButterflyPlacement;
        List<CriteoViewCategory> list7 = this.searchResultSecondButterflyPlacement;
        List<CriteoViewCategory> list8 = this.searchResultFlagshipPlacement;
        List<CriteoViewCategory> list9 = this.itemPlacement;
        List<CriteoViewCategory> list10 = this.basketPlacement;
        List<CriteoViewCategory> list11 = this.storePlacement;
        List<CriteoViewCategory> list12 = this.catalogPlacement;
        List<CriteoViewCategory> list13 = this.insideCatalogPlacement;
        List<CriteoViewCategory> list14 = this.homePlacement;
        List<CriteoViewCategory> list15 = this.secondHomePlacement;
        return "CriteoPlacement(categoryPlacement=" + list + ", categoryButterflyPlacement=" + list2 + ", categorySecondButterflyPlacement=" + list3 + ", categoryFlagshipPlacement=" + list4 + ", searchResultPlacement=" + list5 + ", searchResultButterflyPlacement=" + list6 + ", searchResultSecondButterflyPlacement=" + list7 + ", searchResultFlagshipPlacement=" + list8 + ", itemPlacement=" + list9 + ", basketPlacement=" + list10 + ", storePlacement=" + list11 + ", catalogPlacement=" + list12 + ", insideCatalogPlacement=" + list13 + ", homePlacement=" + list14 + ", secondHomePlacement=" + list15 + ")";
    }

    public CriteoPlacement(@C12580l List<CriteoViewCategory> list, @C12580l List<CriteoViewCategory> list2, @C12580l List<CriteoViewCategory> list3, @C12580l List<CriteoViewCategory> list4, @C12580l List<CriteoViewCategory> list5, @C12580l List<CriteoViewCategory> list6, @C12580l List<CriteoViewCategory> list7, @C12580l List<CriteoViewCategory> list8, @C12580l List<CriteoViewCategory> list9, @C12580l List<CriteoViewCategory> list10, @C12580l List<CriteoViewCategory> list11, @C12580l List<CriteoViewCategory> list12, @C12580l List<CriteoViewCategory> list13, @C12580l List<CriteoViewCategory> list14, @C12580l List<CriteoViewCategory> list15) {
        this.categoryPlacement = list;
        this.categoryButterflyPlacement = list2;
        this.categorySecondButterflyPlacement = list3;
        this.categoryFlagshipPlacement = list4;
        this.searchResultPlacement = list5;
        this.searchResultButterflyPlacement = list6;
        this.searchResultSecondButterflyPlacement = list7;
        this.searchResultFlagshipPlacement = list8;
        this.itemPlacement = list9;
        this.basketPlacement = list10;
        this.storePlacement = list11;
        this.catalogPlacement = list12;
        this.insideCatalogPlacement = list13;
        this.homePlacement = list14;
        this.secondHomePlacement = list15;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CriteoPlacement(java.util.List r17, java.util.List r18, java.util.List r19, java.util.List r20, java.util.List r21, java.util.List r22, java.util.List r23, java.util.List r24, java.util.List r25, java.util.List r26, java.util.List r27, java.util.List r28, java.util.List r29, java.util.List r30, java.util.List r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r18
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r19
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r21
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r22
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r23
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r2
            goto L_0x0043
        L_0x0041:
            r9 = r24
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r2
            goto L_0x004b
        L_0x0049:
            r10 = r25
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r2
            goto L_0x0053
        L_0x0051:
            r11 = r26
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r2
            goto L_0x005b
        L_0x0059:
            r12 = r27
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r2
            goto L_0x0063
        L_0x0061:
            r13 = r28
        L_0x0063:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0069
            r14 = r2
            goto L_0x006b
        L_0x0069:
            r14 = r29
        L_0x006b:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0071
            r15 = r2
            goto L_0x0073
        L_0x0071:
            r15 = r30
        L_0x0073:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r31
        L_0x007a:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.CriteoPlacement.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
