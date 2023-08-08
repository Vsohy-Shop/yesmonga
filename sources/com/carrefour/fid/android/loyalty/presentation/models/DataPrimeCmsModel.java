package com.carrefour.fid.android.loyalty.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003JI\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\r\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/DataPrimeCmsModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "name", "primeId", "text", "isSelected", "imageUrl", "imageUrlOff", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getPrimeId", "getText", "Z", "()Z", "getImageUrl", "getImageUrlOff", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class DataPrimeCmsModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<DataPrimeCmsModel> CREATOR = new Creator();
    @C12580l
    private final String imageUrl;
    @C12580l
    private final String imageUrlOff;
    private final boolean isSelected;
    @C12579k
    private final String name;
    @C12579k
    private final String primeId;
    @C12579k
    private final String text;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<DataPrimeCmsModel> {
        @C12579k
        public final DataPrimeCmsModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataPrimeCmsModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @C12579k
        public final DataPrimeCmsModel[] newArray(int i) {
            return new DataPrimeCmsModel[i];
        }
    }

    public DataPrimeCmsModel(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z, @C12580l String str4, @C12580l String str5) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "primeId");
        Intrinsics.checkNotNullParameter(str3, "text");
        this.name = str;
        this.primeId = str2;
        this.text = str3;
        this.isSelected = z;
        this.imageUrl = str4;
        this.imageUrlOff = str5;
    }

    public static /* synthetic */ DataPrimeCmsModel copy$default(DataPrimeCmsModel dataPrimeCmsModel, String str, String str2, String str3, boolean z, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataPrimeCmsModel.name;
        }
        if ((i & 2) != 0) {
            str2 = dataPrimeCmsModel.primeId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = dataPrimeCmsModel.text;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            z = dataPrimeCmsModel.isSelected;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = dataPrimeCmsModel.imageUrl;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = dataPrimeCmsModel.imageUrlOff;
        }
        return dataPrimeCmsModel.copy(str, str6, str7, z2, str8, str5);
    }

    @C12579k
    public final String component1() {
        return this.name;
    }

    @C12579k
    public final String component2() {
        return this.primeId;
    }

    @C12579k
    public final String component3() {
        return this.text;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    @C12580l
    public final String component5() {
        return this.imageUrl;
    }

    @C12580l
    public final String component6() {
        return this.imageUrlOff;
    }

    @C12579k
    public final DataPrimeCmsModel copy(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z, @C12580l String str4, @C12580l String str5) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "primeId");
        Intrinsics.checkNotNullParameter(str3, "text");
        return new DataPrimeCmsModel(str, str2, str3, z, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPrimeCmsModel)) {
            return false;
        }
        DataPrimeCmsModel dataPrimeCmsModel = (DataPrimeCmsModel) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) dataPrimeCmsModel.name) && Intrinsics.areEqual((Object) this.primeId, (Object) dataPrimeCmsModel.primeId) && Intrinsics.areEqual((Object) this.text, (Object) dataPrimeCmsModel.text) && this.isSelected == dataPrimeCmsModel.isSelected && Intrinsics.areEqual((Object) this.imageUrl, (Object) dataPrimeCmsModel.imageUrl) && Intrinsics.areEqual((Object) this.imageUrlOff, (Object) dataPrimeCmsModel.imageUrlOff);
    }

    @C12580l
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @C12580l
    public final String getImageUrlOff() {
        return this.imageUrlOff;
    }

    @C12579k
    public final String getName() {
        return this.name;
    }

    @C12579k
    public final String getPrimeId() {
        return this.primeId;
    }

    @C12579k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((((this.name.hashCode() * 31) + this.primeId.hashCode()) * 31) + this.text.hashCode()) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.imageUrl;
        int i2 = 0;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrlOff;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @C12579k
    public String toString() {
        String str = this.name;
        String str2 = this.primeId;
        String str3 = this.text;
        boolean z = this.isSelected;
        String str4 = this.imageUrl;
        String str5 = this.imageUrlOff;
        return "DataPrimeCmsModel(name=" + str + ", primeId=" + str2 + ", text=" + str3 + ", isSelected=" + z + ", imageUrl=" + str4 + ", imageUrlOff=" + str5 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.primeId);
        parcel.writeString(this.text);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.imageUrlOff);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataPrimeCmsModel(String str, String str2, String str3, boolean z, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3, (i & 8) != 0 ? false : z, str4, str5);
    }
}
