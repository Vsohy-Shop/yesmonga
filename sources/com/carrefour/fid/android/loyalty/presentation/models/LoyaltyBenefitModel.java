package com.carrefour.fid.android.loyalty.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "iconId", "messageId", "copy", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "I", "getIconId", "()I", "getMessageId", "<init>", "(II)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class LoyaltyBenefitModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoyaltyBenefitModel> CREATOR = new Creator();
    private final int iconId;
    private final int messageId;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyBenefitModel> {
        @C12579k
        public final LoyaltyBenefitModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoyaltyBenefitModel(parcel.readInt(), parcel.readInt());
        }

        @C12579k
        public final LoyaltyBenefitModel[] newArray(int i) {
            return new LoyaltyBenefitModel[i];
        }
    }

    public LoyaltyBenefitModel(int i, int i2) {
        this.iconId = i;
        this.messageId = i2;
    }

    public static /* synthetic */ LoyaltyBenefitModel copy$default(LoyaltyBenefitModel loyaltyBenefitModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = loyaltyBenefitModel.iconId;
        }
        if ((i3 & 2) != 0) {
            i2 = loyaltyBenefitModel.messageId;
        }
        return loyaltyBenefitModel.copy(i, i2);
    }

    public final int component1() {
        return this.iconId;
    }

    public final int component2() {
        return this.messageId;
    }

    @C12579k
    public final LoyaltyBenefitModel copy(int i, int i2) {
        return new LoyaltyBenefitModel(i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyBenefitModel)) {
            return false;
        }
        LoyaltyBenefitModel loyaltyBenefitModel = (LoyaltyBenefitModel) obj;
        return this.iconId == loyaltyBenefitModel.iconId && this.messageId == loyaltyBenefitModel.messageId;
    }

    public final int getIconId() {
        return this.iconId;
    }

    public final int getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.iconId) * 31) + Integer.hashCode(this.messageId);
    }

    @C12579k
    public String toString() {
        int i = this.iconId;
        int i2 = this.messageId;
        return "LoyaltyBenefitModel(iconId=" + i + ", messageId=" + i2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.iconId);
        parcel.writeInt(this.messageId);
    }
}
