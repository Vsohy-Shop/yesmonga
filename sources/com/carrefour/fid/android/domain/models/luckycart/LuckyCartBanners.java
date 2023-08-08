package com.carrefour.fid.android.domain.models.luckycart;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.carrefour.fid.android.shared.constant.C28592s1;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J9\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/luckycart/LuckyCartBanners;", "Landroid/os/Parcelable;", "", "", "component1", "component2", "component3", "homePage", "promotions", "categories", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "getHomePage", "()Ljava/util/List;", "getPromotions", "getCategories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class LuckyCartBanners implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LuckyCartBanners> CREATOR = new C38046a();
    @C12579k
    private final List<String> categories;
    @C12579k
    private final List<String> homePage;
    @C12579k
    private final List<String> promotions;

    /* renamed from: com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners$a */
    public static final class C38046a implements Parcelable.Creator<LuckyCartBanners> {
        @C12579k
        /* renamed from: a */
        public final LuckyCartBanners createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LuckyCartBanners(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @C12579k
        /* renamed from: b */
        public final LuckyCartBanners[] newArray(int i) {
            return new LuckyCartBanners[i];
        }
    }

    public LuckyCartBanners(@C12579k List<String> list, @C12579k List<String> list2, @C12579k List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "homePage");
        Intrinsics.checkNotNullParameter(list2, C28592s1.f69855o);
        Intrinsics.checkNotNullParameter(list3, "categories");
        this.homePage = list;
        this.promotions = list2;
        this.categories = list3;
    }

    public static /* synthetic */ LuckyCartBanners copy$default(LuckyCartBanners luckyCartBanners, List<String> list, List<String> list2, List<String> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = luckyCartBanners.homePage;
        }
        if ((i & 2) != 0) {
            list2 = luckyCartBanners.promotions;
        }
        if ((i & 4) != 0) {
            list3 = luckyCartBanners.categories;
        }
        return luckyCartBanners.copy(list, list2, list3);
    }

    @C12579k
    public final List<String> component1() {
        return this.homePage;
    }

    @C12579k
    public final List<String> component2() {
        return this.promotions;
    }

    @C12579k
    public final List<String> component3() {
        return this.categories;
    }

    @C12579k
    public final LuckyCartBanners copy(@C12579k List<String> list, @C12579k List<String> list2, @C12579k List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "homePage");
        Intrinsics.checkNotNullParameter(list2, C28592s1.f69855o);
        Intrinsics.checkNotNullParameter(list3, "categories");
        return new LuckyCartBanners(list, list2, list3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LuckyCartBanners)) {
            return false;
        }
        LuckyCartBanners luckyCartBanners = (LuckyCartBanners) obj;
        return Intrinsics.areEqual((Object) this.homePage, (Object) luckyCartBanners.homePage) && Intrinsics.areEqual((Object) this.promotions, (Object) luckyCartBanners.promotions) && Intrinsics.areEqual((Object) this.categories, (Object) luckyCartBanners.categories);
    }

    @C12579k
    public final List<String> getCategories() {
        return this.categories;
    }

    @C12579k
    public final List<String> getHomePage() {
        return this.homePage;
    }

    @C12579k
    public final List<String> getPromotions() {
        return this.promotions;
    }

    public int hashCode() {
        return (((this.homePage.hashCode() * 31) + this.promotions.hashCode()) * 31) + this.categories.hashCode();
    }

    @C12579k
    public String toString() {
        List<String> list = this.homePage;
        List<String> list2 = this.promotions;
        List<String> list3 = this.categories;
        return "LuckyCartBanners(homePage=" + list + ", promotions=" + list2 + ", categories=" + list3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeStringList(this.homePage);
        parcel.writeStringList(this.promotions);
        parcel.writeStringList(this.categories);
    }
}
