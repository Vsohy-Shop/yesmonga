package com.carrefour.fid.android.loyalty.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/CardTypeModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "cardPictureId", "title", "copy", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "I", "getCardPictureId", "()I", "getTitle", "<init>", "(II)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CardTypeModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CardTypeModel> CREATOR = new Creator();
    private final int cardPictureId;
    private final int title;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<CardTypeModel> {
        @C12579k
        public final CardTypeModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardTypeModel(parcel.readInt(), parcel.readInt());
        }

        @C12579k
        public final CardTypeModel[] newArray(int i) {
            return new CardTypeModel[i];
        }
    }

    public CardTypeModel(int i, int i2) {
        this.cardPictureId = i;
        this.title = i2;
    }

    public static /* synthetic */ CardTypeModel copy$default(CardTypeModel cardTypeModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardTypeModel.cardPictureId;
        }
        if ((i3 & 2) != 0) {
            i2 = cardTypeModel.title;
        }
        return cardTypeModel.copy(i, i2);
    }

    public final int component1() {
        return this.cardPictureId;
    }

    public final int component2() {
        return this.title;
    }

    @C12579k
    public final CardTypeModel copy(int i, int i2) {
        return new CardTypeModel(i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardTypeModel)) {
            return false;
        }
        CardTypeModel cardTypeModel = (CardTypeModel) obj;
        return this.cardPictureId == cardTypeModel.cardPictureId && this.title == cardTypeModel.title;
    }

    public final int getCardPictureId() {
        return this.cardPictureId;
    }

    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (Integer.hashCode(this.cardPictureId) * 31) + Integer.hashCode(this.title);
    }

    @C12579k
    public String toString() {
        int i = this.cardPictureId;
        int i2 = this.title;
        return "CardTypeModel(cardPictureId=" + i + ", title=" + i2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.cardPictureId);
        parcel.writeInt(this.title);
    }
}
