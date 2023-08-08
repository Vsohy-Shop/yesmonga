package com.carrefour.fid.android.loyalty.data.models.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b!\u0010#J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\nHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\"\u0010\u000e\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/UserChannelsMediaResponse;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/d2;", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "mediaKey", "mediaValue", "mediaType", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getMediaKey", "()Ljava/lang/String;", "setMediaKey", "(Ljava/lang/String;)V", "getMediaValue", "setMediaValue", "getMediaType", "setMediaType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
public final class UserChannelsMediaResponse implements Serializable, Parcelable {
    @C12579k
    public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);
    @C33608c("media_key")
    @C12579k
    private String mediaKey;
    @C33608c("media_type")
    @C12579k
    private String mediaType;
    @C33608c("media_value")
    @C12579k
    private String mediaValue;

    @C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/data/models/entities/UserChannelsMediaResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/carrefour/fid/android/loyalty/data/models/entities/UserChannelsMediaResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/carrefour/fid/android/loyalty/data/models/entities/UserChannelsMediaResponse;", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    public static final class CREATOR implements Parcelable.Creator<UserChannelsMediaResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @C12579k
        public UserChannelsMediaResponse createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserChannelsMediaResponse(parcel);
        }

        @C12579k
        public UserChannelsMediaResponse[] newArray(int i) {
            return new UserChannelsMediaResponse[i];
        }
    }

    public UserChannelsMediaResponse() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserChannelsMediaResponse copy$default(UserChannelsMediaResponse userChannelsMediaResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userChannelsMediaResponse.mediaKey;
        }
        if ((i & 2) != 0) {
            str2 = userChannelsMediaResponse.mediaValue;
        }
        if ((i & 4) != 0) {
            str3 = userChannelsMediaResponse.mediaType;
        }
        return userChannelsMediaResponse.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.mediaKey;
    }

    @C12579k
    public final String component2() {
        return this.mediaValue;
    }

    @C12579k
    public final String component3() {
        return this.mediaType;
    }

    @C12579k
    public final UserChannelsMediaResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "mediaKey");
        Intrinsics.checkNotNullParameter(str2, "mediaValue");
        Intrinsics.checkNotNullParameter(str3, "mediaType");
        return new UserChannelsMediaResponse(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserChannelsMediaResponse)) {
            return false;
        }
        UserChannelsMediaResponse userChannelsMediaResponse = (UserChannelsMediaResponse) obj;
        return Intrinsics.areEqual((Object) this.mediaKey, (Object) userChannelsMediaResponse.mediaKey) && Intrinsics.areEqual((Object) this.mediaValue, (Object) userChannelsMediaResponse.mediaValue) && Intrinsics.areEqual((Object) this.mediaType, (Object) userChannelsMediaResponse.mediaType);
    }

    @C12579k
    public final String getMediaKey() {
        return this.mediaKey;
    }

    @C12579k
    public final String getMediaType() {
        return this.mediaType;
    }

    @C12579k
    public final String getMediaValue() {
        return this.mediaValue;
    }

    public int hashCode() {
        return (((this.mediaKey.hashCode() * 31) + this.mediaValue.hashCode()) * 31) + this.mediaType.hashCode();
    }

    public final void setMediaKey(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mediaKey = str;
    }

    public final void setMediaType(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mediaType = str;
    }

    public final void setMediaValue(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mediaValue = str;
    }

    @C12579k
    public String toString() {
        String str = this.mediaKey;
        String str2 = this.mediaValue;
        String str3 = this.mediaType;
        return "UserChannelsMediaResponse(mediaKey=" + str + ", mediaValue=" + str2 + ", mediaType=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.mediaKey);
        parcel.writeString(this.mediaValue);
        parcel.writeString(this.mediaType);
    }

    public UserChannelsMediaResponse(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "mediaKey");
        Intrinsics.checkNotNullParameter(str2, "mediaValue");
        Intrinsics.checkNotNullParameter(str3, "mediaType");
        this.mediaKey = str;
        this.mediaValue = str2;
        this.mediaType = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserChannelsMediaResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UserChannelsMediaResponse(@org.jetbrains.annotations.C12579k android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.readString()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r2 = r4.readString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r1)
            java.lang.String r4 = r4.readString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r1)
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.data.models.entities.UserChannelsMediaResponse.<init>(android.os.Parcel):void");
    }
}
