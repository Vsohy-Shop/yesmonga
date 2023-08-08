package com.carrefour.fid.android.cms.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b6\u00107J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JY\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\nHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016HÖ\u0001R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b.\u0010#\"\u0004\b/\u0010%R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u00102\u001a\u0004\b\u0013\u00103\"\u0004\b4\u00105¨\u00068"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonus;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "primeId", "name", "imageUrl", "imageOffUrl", "editorialUri", "description", "text", "isSelected", "copy", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getPrimeId", "()Ljava/lang/String;", "setPrimeId", "(Ljava/lang/String;)V", "getName", "setName", "getImageUrl", "setImageUrl", "getImageOffUrl", "setImageOffUrl", "getEditorialUri", "setEditorialUri", "getDescription", "setDescription", "getText", "setText", "Z", "()Z", "setSelected", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class LoyaltyBonus implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoyaltyBonus> CREATOR = new Creator();
    @C12579k
    private String description;
    @C12579k
    private String editorialUri;
    @C12579k
    private String imageOffUrl;
    @C12579k
    private String imageUrl;
    private boolean isSelected;
    @C12579k
    private String name;
    @C12579k
    private String primeId;
    @C12579k
    private String text;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyBonus> {
        @C12579k
        public final LoyaltyBonus createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoyaltyBonus(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        public final LoyaltyBonus[] newArray(int i) {
            return new LoyaltyBonus[i];
        }
    }

    public LoyaltyBonus(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "primeId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "imageUrl");
        Intrinsics.checkNotNullParameter(str4, "imageOffUrl");
        Intrinsics.checkNotNullParameter(str5, "editorialUri");
        Intrinsics.checkNotNullParameter(str6, "description");
        Intrinsics.checkNotNullParameter(str7, "text");
        this.primeId = str;
        this.name = str2;
        this.imageUrl = str3;
        this.imageOffUrl = str4;
        this.editorialUri = str5;
        this.description = str6;
        this.text = str7;
        this.isSelected = z;
    }

    public static /* synthetic */ LoyaltyBonus copy$default(LoyaltyBonus loyaltyBonus, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
        LoyaltyBonus loyaltyBonus2 = loyaltyBonus;
        int i2 = i;
        return loyaltyBonus.copy((i2 & 1) != 0 ? loyaltyBonus2.primeId : str, (i2 & 2) != 0 ? loyaltyBonus2.name : str2, (i2 & 4) != 0 ? loyaltyBonus2.imageUrl : str3, (i2 & 8) != 0 ? loyaltyBonus2.imageOffUrl : str4, (i2 & 16) != 0 ? loyaltyBonus2.editorialUri : str5, (i2 & 32) != 0 ? loyaltyBonus2.description : str6, (i2 & 64) != 0 ? loyaltyBonus2.text : str7, (i2 & 128) != 0 ? loyaltyBonus2.isSelected : z);
    }

    @C12579k
    public final String component1() {
        return this.primeId;
    }

    @C12579k
    public final String component2() {
        return this.name;
    }

    @C12579k
    public final String component3() {
        return this.imageUrl;
    }

    @C12579k
    public final String component4() {
        return this.imageOffUrl;
    }

    @C12579k
    public final String component5() {
        return this.editorialUri;
    }

    @C12579k
    public final String component6() {
        return this.description;
    }

    @C12579k
    public final String component7() {
        return this.text;
    }

    public final boolean component8() {
        return this.isSelected;
    }

    @C12579k
    public final LoyaltyBonus copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "primeId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "imageUrl");
        Intrinsics.checkNotNullParameter(str4, "imageOffUrl");
        Intrinsics.checkNotNullParameter(str5, "editorialUri");
        String str8 = str6;
        Intrinsics.checkNotNullParameter(str8, "description");
        String str9 = str7;
        Intrinsics.checkNotNullParameter(str9, "text");
        return new LoyaltyBonus(str, str2, str3, str4, str5, str8, str9, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyBonus)) {
            return false;
        }
        LoyaltyBonus loyaltyBonus = (LoyaltyBonus) obj;
        return Intrinsics.areEqual((Object) this.primeId, (Object) loyaltyBonus.primeId) && Intrinsics.areEqual((Object) this.name, (Object) loyaltyBonus.name) && Intrinsics.areEqual((Object) this.imageUrl, (Object) loyaltyBonus.imageUrl) && Intrinsics.areEqual((Object) this.imageOffUrl, (Object) loyaltyBonus.imageOffUrl) && Intrinsics.areEqual((Object) this.editorialUri, (Object) loyaltyBonus.editorialUri) && Intrinsics.areEqual((Object) this.description, (Object) loyaltyBonus.description) && Intrinsics.areEqual((Object) this.text, (Object) loyaltyBonus.text) && this.isSelected == loyaltyBonus.isSelected;
    }

    @C12579k
    public final String getDescription() {
        return this.description;
    }

    @C12579k
    public final String getEditorialUri() {
        return this.editorialUri;
    }

    @C12579k
    public final String getImageOffUrl() {
        return this.imageOffUrl;
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
    public final String getPrimeId() {
        return this.primeId;
    }

    @C12579k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.primeId.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.imageOffUrl.hashCode()) * 31) + this.editorialUri.hashCode()) * 31) + this.description.hashCode()) * 31) + this.text.hashCode()) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setDescription(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setEditorialUri(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.editorialUri = str;
    }

    public final void setImageOffUrl(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageOffUrl = str;
    }

    public final void setImageUrl(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setName(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPrimeId(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.primeId = str;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setText(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    @C12579k
    public String toString() {
        String str = this.primeId;
        String str2 = this.name;
        String str3 = this.imageUrl;
        String str4 = this.imageOffUrl;
        String str5 = this.editorialUri;
        String str6 = this.description;
        String str7 = this.text;
        boolean z = this.isSelected;
        return "LoyaltyBonus(primeId=" + str + ", name=" + str2 + ", imageUrl=" + str3 + ", imageOffUrl=" + str4 + ", editorialUri=" + str5 + ", description=" + str6 + ", text=" + str7 + ", isSelected=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.primeId);
        parcel.writeString(this.name);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.imageOffUrl);
        parcel.writeString(this.editorialUri);
        parcel.writeString(this.description);
        parcel.writeString(this.text);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }
}
