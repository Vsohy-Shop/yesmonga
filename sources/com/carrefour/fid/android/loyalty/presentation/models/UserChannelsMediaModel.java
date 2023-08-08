package com.carrefour.fid.android.loyalty.presentation.models;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/UserChannelsMediaModel;", "", "mediaKey", "", "mediaValue", "mediaType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMediaKey", "()Ljava/lang/String;", "getMediaType", "getMediaValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class UserChannelsMediaModel {
    @C12579k
    private final String mediaKey;
    @C12579k
    private final String mediaType;
    @C12579k
    private final String mediaValue;

    public UserChannelsMediaModel() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UserChannelsMediaModel copy$default(UserChannelsMediaModel userChannelsMediaModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userChannelsMediaModel.mediaKey;
        }
        if ((i & 2) != 0) {
            str2 = userChannelsMediaModel.mediaValue;
        }
        if ((i & 4) != 0) {
            str3 = userChannelsMediaModel.mediaType;
        }
        return userChannelsMediaModel.copy(str, str2, str3);
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
    public final UserChannelsMediaModel copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "mediaKey");
        Intrinsics.checkNotNullParameter(str2, "mediaValue");
        Intrinsics.checkNotNullParameter(str3, "mediaType");
        return new UserChannelsMediaModel(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserChannelsMediaModel)) {
            return false;
        }
        UserChannelsMediaModel userChannelsMediaModel = (UserChannelsMediaModel) obj;
        return Intrinsics.areEqual((Object) this.mediaKey, (Object) userChannelsMediaModel.mediaKey) && Intrinsics.areEqual((Object) this.mediaValue, (Object) userChannelsMediaModel.mediaValue) && Intrinsics.areEqual((Object) this.mediaType, (Object) userChannelsMediaModel.mediaType);
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

    @C12579k
    public String toString() {
        String str = this.mediaKey;
        String str2 = this.mediaValue;
        String str3 = this.mediaType;
        return "UserChannelsMediaModel(mediaKey=" + str + ", mediaValue=" + str2 + ", mediaType=" + str3 + ")";
    }

    public UserChannelsMediaModel(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "mediaKey");
        Intrinsics.checkNotNullParameter(str2, "mediaValue");
        Intrinsics.checkNotNullParameter(str3, "mediaType");
        this.mediaKey = str;
        this.mediaValue = str2;
        this.mediaType = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserChannelsMediaModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3);
    }
}
