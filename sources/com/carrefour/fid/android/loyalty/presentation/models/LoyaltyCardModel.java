package com.carrefour.fid.android.loyalty.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0005HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyCardModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "hasCard", "hasSecuredCard", "category", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Z", "getHasCard", "()Z", "getHasSecuredCard", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "<init>", "(ZZLjava/lang/String;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class LoyaltyCardModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoyaltyCardModel> CREATOR = new Creator();
    @C12579k
    private final String category;
    private final boolean hasCard;
    private final boolean hasSecuredCard;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyCardModel> {
        @C12579k
        public final LoyaltyCardModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new LoyaltyCardModel(z2, z, parcel.readString());
        }

        @C12579k
        public final LoyaltyCardModel[] newArray(int i) {
            return new LoyaltyCardModel[i];
        }
    }

    public LoyaltyCardModel() {
        this(false, false, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LoyaltyCardModel copy$default(LoyaltyCardModel loyaltyCardModel, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loyaltyCardModel.hasCard;
        }
        if ((i & 2) != 0) {
            z2 = loyaltyCardModel.hasSecuredCard;
        }
        if ((i & 4) != 0) {
            str = loyaltyCardModel.category;
        }
        return loyaltyCardModel.copy(z, z2, str);
    }

    public final boolean component1() {
        return this.hasCard;
    }

    public final boolean component2() {
        return this.hasSecuredCard;
    }

    @C12579k
    public final String component3() {
        return this.category;
    }

    @C12579k
    public final LoyaltyCardModel copy(boolean z, boolean z2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "category");
        return new LoyaltyCardModel(z, z2, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyCardModel)) {
            return false;
        }
        LoyaltyCardModel loyaltyCardModel = (LoyaltyCardModel) obj;
        return this.hasCard == loyaltyCardModel.hasCard && this.hasSecuredCard == loyaltyCardModel.hasSecuredCard && Intrinsics.areEqual((Object) this.category, (Object) loyaltyCardModel.category);
    }

    @C12579k
    public final String getCategory() {
        return this.category;
    }

    public final boolean getHasCard() {
        return this.hasCard;
    }

    public final boolean getHasSecuredCard() {
        return this.hasSecuredCard;
    }

    public int hashCode() {
        boolean z = this.hasCard;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.hasSecuredCard;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.category.hashCode();
    }

    @C12579k
    public String toString() {
        boolean z = this.hasCard;
        boolean z2 = this.hasSecuredCard;
        String str = this.category;
        return "LoyaltyCardModel(hasCard=" + z + ", hasSecuredCard=" + z2 + ", category=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.hasCard ? 1 : 0);
        parcel.writeInt(this.hasSecuredCard ? 1 : 0);
        parcel.writeString(this.category);
    }

    public LoyaltyCardModel(boolean z, boolean z2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "category");
        this.hasCard = z;
        this.hasSecuredCard = z2;
        this.category = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoyaltyCardModel(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new String() : str);
    }
}
