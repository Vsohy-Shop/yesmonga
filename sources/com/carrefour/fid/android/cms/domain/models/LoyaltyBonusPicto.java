package com.carrefour.fid.android.cms.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/domain/models/LoyaltyBonusPicto;", "Landroid/os/Parcelable;", "", "component1", "component2", "url", "uri", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "getUri", "setUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class LoyaltyBonusPicto implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoyaltyBonusPicto> CREATOR = new Creator();
    @C12579k
    private String uri;
    @C12579k
    private String url;

    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyBonusPicto> {
        @C12579k
        public final LoyaltyBonusPicto createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoyaltyBonusPicto(parcel.readString(), parcel.readString());
        }

        @C12579k
        public final LoyaltyBonusPicto[] newArray(int i) {
            return new LoyaltyBonusPicto[i];
        }
    }

    public LoyaltyBonusPicto(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "uri");
        this.url = str;
        this.uri = str2;
    }

    public static /* synthetic */ LoyaltyBonusPicto copy$default(LoyaltyBonusPicto loyaltyBonusPicto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyBonusPicto.url;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyBonusPicto.uri;
        }
        return loyaltyBonusPicto.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.url;
    }

    @C12579k
    public final String component2() {
        return this.uri;
    }

    @C12579k
    public final LoyaltyBonusPicto copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "uri");
        return new LoyaltyBonusPicto(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyBonusPicto)) {
            return false;
        }
        LoyaltyBonusPicto loyaltyBonusPicto = (LoyaltyBonusPicto) obj;
        return Intrinsics.areEqual((Object) this.url, (Object) loyaltyBonusPicto.url) && Intrinsics.areEqual((Object) this.uri, (Object) loyaltyBonusPicto.uri);
    }

    @C12579k
    public final String getUri() {
        return this.uri;
    }

    @C12579k
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.uri.hashCode();
    }

    public final void setUri(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uri = str;
    }

    public final void setUrl(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @C12579k
    public String toString() {
        String str = this.url;
        String str2 = this.uri;
        return "LoyaltyBonusPicto(url=" + str + ", uri=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.url);
        parcel.writeString(this.uri);
    }
}
