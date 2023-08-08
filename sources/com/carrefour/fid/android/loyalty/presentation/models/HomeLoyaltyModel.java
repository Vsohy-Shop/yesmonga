package com.carrefour.fid.android.loyalty.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003JM\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0014\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tHÖ\u0001R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b(\u0010'¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/HomeLoyaltyModel;", "Landroid/os/Parcelable;", "", "Lcom/carrefour/fid/android/loyalty/presentation/models/LoyaltyBenefitModel;", "component1", "Lkotlin/Function0;", "Lkotlin/d2;", "component2", "component3", "", "component4", "component5", "loyaltyBenefits", "attachCardCallback", "secondActionCallback", "secondActionButtonLabelId", "attachCardButtonLabelId", "copy", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Ljava/util/List;", "getLoyaltyBenefits", "()Ljava/util/List;", "Lkotlin/jvm/functions/a;", "getAttachCardCallback", "()Lkotlin/jvm/functions/a;", "getSecondActionCallback", "I", "getSecondActionButtonLabelId", "()I", "getAttachCardButtonLabelId", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/a;Lkotlin/jvm/functions/a;II)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class HomeLoyaltyModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<HomeLoyaltyModel> CREATOR = new Creator();
    private final int attachCardButtonLabelId;
    @C12579k
    private final C11289a<C11079d2> attachCardCallback;
    @C12579k
    private final List<LoyaltyBenefitModel> loyaltyBenefits;
    private final int secondActionButtonLabelId;
    @C12579k
    private final C11289a<C11079d2> secondActionCallback;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<HomeLoyaltyModel> {
        @C12579k
        public final HomeLoyaltyModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(LoyaltyBenefitModel.CREATOR.createFromParcel(parcel));
            }
            return new HomeLoyaltyModel(arrayList, (C11289a) parcel.readSerializable(), (C11289a) parcel.readSerializable(), parcel.readInt(), parcel.readInt());
        }

        @C12579k
        public final HomeLoyaltyModel[] newArray(int i) {
            return new HomeLoyaltyModel[i];
        }
    }

    public HomeLoyaltyModel(@C12579k List<LoyaltyBenefitModel> list, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "loyaltyBenefits");
        Intrinsics.checkNotNullParameter(aVar, "attachCardCallback");
        Intrinsics.checkNotNullParameter(aVar2, "secondActionCallback");
        this.loyaltyBenefits = list;
        this.attachCardCallback = aVar;
        this.secondActionCallback = aVar2;
        this.secondActionButtonLabelId = i;
        this.attachCardButtonLabelId = i2;
    }

    public static /* synthetic */ HomeLoyaltyModel copy$default(HomeLoyaltyModel homeLoyaltyModel, List<LoyaltyBenefitModel> list, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = homeLoyaltyModel.loyaltyBenefits;
        }
        if ((i3 & 2) != 0) {
            aVar = homeLoyaltyModel.attachCardCallback;
        }
        C11289a<C11079d2> aVar3 = aVar;
        if ((i3 & 4) != 0) {
            aVar2 = homeLoyaltyModel.secondActionCallback;
        }
        C11289a<C11079d2> aVar4 = aVar2;
        if ((i3 & 8) != 0) {
            i = homeLoyaltyModel.secondActionButtonLabelId;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = homeLoyaltyModel.attachCardButtonLabelId;
        }
        return homeLoyaltyModel.copy(list, aVar3, aVar4, i4, i2);
    }

    @C12579k
    public final List<LoyaltyBenefitModel> component1() {
        return this.loyaltyBenefits;
    }

    @C12579k
    public final C11289a<C11079d2> component2() {
        return this.attachCardCallback;
    }

    @C12579k
    public final C11289a<C11079d2> component3() {
        return this.secondActionCallback;
    }

    public final int component4() {
        return this.secondActionButtonLabelId;
    }

    public final int component5() {
        return this.attachCardButtonLabelId;
    }

    @C12579k
    public final HomeLoyaltyModel copy(@C12579k List<LoyaltyBenefitModel> list, @C12579k C11289a<C11079d2> aVar, @C12579k C11289a<C11079d2> aVar2, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "loyaltyBenefits");
        Intrinsics.checkNotNullParameter(aVar, "attachCardCallback");
        Intrinsics.checkNotNullParameter(aVar2, "secondActionCallback");
        return new HomeLoyaltyModel(list, aVar, aVar2, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeLoyaltyModel)) {
            return false;
        }
        HomeLoyaltyModel homeLoyaltyModel = (HomeLoyaltyModel) obj;
        return Intrinsics.areEqual((Object) this.loyaltyBenefits, (Object) homeLoyaltyModel.loyaltyBenefits) && Intrinsics.areEqual((Object) this.attachCardCallback, (Object) homeLoyaltyModel.attachCardCallback) && Intrinsics.areEqual((Object) this.secondActionCallback, (Object) homeLoyaltyModel.secondActionCallback) && this.secondActionButtonLabelId == homeLoyaltyModel.secondActionButtonLabelId && this.attachCardButtonLabelId == homeLoyaltyModel.attachCardButtonLabelId;
    }

    public final int getAttachCardButtonLabelId() {
        return this.attachCardButtonLabelId;
    }

    @C12579k
    public final C11289a<C11079d2> getAttachCardCallback() {
        return this.attachCardCallback;
    }

    @C12579k
    public final List<LoyaltyBenefitModel> getLoyaltyBenefits() {
        return this.loyaltyBenefits;
    }

    public final int getSecondActionButtonLabelId() {
        return this.secondActionButtonLabelId;
    }

    @C12579k
    public final C11289a<C11079d2> getSecondActionCallback() {
        return this.secondActionCallback;
    }

    public int hashCode() {
        return (((((((this.loyaltyBenefits.hashCode() * 31) + this.attachCardCallback.hashCode()) * 31) + this.secondActionCallback.hashCode()) * 31) + Integer.hashCode(this.secondActionButtonLabelId)) * 31) + Integer.hashCode(this.attachCardButtonLabelId);
    }

    @C12579k
    public String toString() {
        List<LoyaltyBenefitModel> list = this.loyaltyBenefits;
        C11289a<C11079d2> aVar = this.attachCardCallback;
        C11289a<C11079d2> aVar2 = this.secondActionCallback;
        int i = this.secondActionButtonLabelId;
        int i2 = this.attachCardButtonLabelId;
        return "HomeLoyaltyModel(loyaltyBenefits=" + list + ", attachCardCallback=" + aVar + ", secondActionCallback=" + aVar2 + ", secondActionButtonLabelId=" + i + ", attachCardButtonLabelId=" + i2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<LoyaltyBenefitModel> list = this.loyaltyBenefits;
        parcel.writeInt(list.size());
        for (LoyaltyBenefitModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeSerializable((Serializable) this.attachCardCallback);
        parcel.writeSerializable((Serializable) this.secondActionCallback);
        parcel.writeInt(this.secondActionButtonLabelId);
        parcel.writeInt(this.attachCardButtonLabelId);
    }
}
