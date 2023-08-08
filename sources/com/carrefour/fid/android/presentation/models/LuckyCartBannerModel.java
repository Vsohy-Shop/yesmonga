package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/LuckyCartBannerModel;", "Lcom/carrefour/fid/android/presentation/models/OfferModel;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/a;", "", "id", "Lcom/carrefour/fid/android/design/components/widgets/productcard/b$a;", "typeFactory", "", "getType", "", "component1", "component2", "component3", "imageUrl", "name", "query", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "getName", "getQuery", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class LuckyCartBannerModel implements OfferModel, C37369a {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<LuckyCartBannerModel> CREATOR = new C38433a();
    @C12579k
    private final String imageUrl;
    @C12579k
    private final String name;
    @C12579k
    private final String query;

    /* renamed from: com.carrefour.fid.android.presentation.models.LuckyCartBannerModel$a */
    public static final class C38433a implements Parcelable.Creator<LuckyCartBannerModel> {
        @C12579k
        /* renamed from: a */
        public final LuckyCartBannerModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LuckyCartBannerModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final LuckyCartBannerModel[] newArray(int i) {
            return new LuckyCartBannerModel[i];
        }
    }

    public LuckyCartBannerModel(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "query");
        this.imageUrl = str;
        this.name = str2;
        this.query = str3;
    }

    public static /* synthetic */ LuckyCartBannerModel copy$default(LuckyCartBannerModel luckyCartBannerModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = luckyCartBannerModel.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = luckyCartBannerModel.name;
        }
        if ((i & 4) != 0) {
            str3 = luckyCartBannerModel.query;
        }
        return luckyCartBannerModel.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.imageUrl;
    }

    @C12579k
    public final String component2() {
        return this.name;
    }

    @C12579k
    public final String component3() {
        return this.query;
    }

    @C12579k
    public final LuckyCartBannerModel copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "query");
        return new LuckyCartBannerModel(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LuckyCartBannerModel)) {
            return false;
        }
        LuckyCartBannerModel luckyCartBannerModel = (LuckyCartBannerModel) obj;
        return Intrinsics.areEqual((Object) this.imageUrl, (Object) luckyCartBannerModel.imageUrl) && Intrinsics.areEqual((Object) this.name, (Object) luckyCartBannerModel.name) && Intrinsics.areEqual((Object) this.query, (Object) luckyCartBannerModel.query);
    }

    @C12579k
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final String getQuery() {
        return this.query;
    }

    public int getType(@C12579k C37353b.C37354a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "typeFactory");
        return C11342l0.m43547d(LuckyCartBannerModel.class).hashCode();
    }

    public int hashCode() {
        return (((this.imageUrl.hashCode() * 31) + this.name.hashCode()) * 31) + this.query.hashCode();
    }

    /* renamed from: id */
    public long mo121471id() {
        return (long) hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.name;
        String str3 = this.query;
        return "LuckyCartBannerModel(imageUrl=" + str + ", name=" + str2 + ", query=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.query);
    }
}
