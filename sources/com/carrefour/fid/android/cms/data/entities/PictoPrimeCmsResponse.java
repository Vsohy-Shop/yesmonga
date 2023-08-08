package com.carrefour.fid.android.cms.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006\""}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/PictoPrimeCmsResponse;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "url", "uri", "alt", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "getUri", "setUri", "getAlt", "setAlt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class PictoPrimeCmsResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<PictoPrimeCmsResponse> CREATOR = new C40016a();
    @C33608c("alt")
    @C12579k
    private String alt;
    @C33608c("uri")
    @C12579k
    private String uri;
    @C33608c("url")
    @C12579k
    private String url;

    /* renamed from: com.carrefour.fid.android.cms.data.entities.PictoPrimeCmsResponse$a */
    public static final class C40016a implements Parcelable.Creator<PictoPrimeCmsResponse> {
        @C12579k
        /* renamed from: a */
        public final PictoPrimeCmsResponse createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PictoPrimeCmsResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final PictoPrimeCmsResponse[] newArray(int i) {
            return new PictoPrimeCmsResponse[i];
        }
    }

    public PictoPrimeCmsResponse() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PictoPrimeCmsResponse copy$default(PictoPrimeCmsResponse pictoPrimeCmsResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pictoPrimeCmsResponse.url;
        }
        if ((i & 2) != 0) {
            str2 = pictoPrimeCmsResponse.uri;
        }
        if ((i & 4) != 0) {
            str3 = pictoPrimeCmsResponse.alt;
        }
        return pictoPrimeCmsResponse.copy(str, str2, str3);
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
    public final String component3() {
        return this.alt;
    }

    @C12579k
    public final PictoPrimeCmsResponse copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "uri");
        Intrinsics.checkNotNullParameter(str3, "alt");
        return new PictoPrimeCmsResponse(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PictoPrimeCmsResponse)) {
            return false;
        }
        PictoPrimeCmsResponse pictoPrimeCmsResponse = (PictoPrimeCmsResponse) obj;
        return Intrinsics.areEqual((Object) this.url, (Object) pictoPrimeCmsResponse.url) && Intrinsics.areEqual((Object) this.uri, (Object) pictoPrimeCmsResponse.uri) && Intrinsics.areEqual((Object) this.alt, (Object) pictoPrimeCmsResponse.alt);
    }

    @C12579k
    public final String getAlt() {
        return this.alt;
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
        return (((this.url.hashCode() * 31) + this.uri.hashCode()) * 31) + this.alt.hashCode();
    }

    public final void setAlt(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alt = str;
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
        String str3 = this.alt;
        return "PictoPrimeCmsResponse(url=" + str + ", uri=" + str2 + ", alt=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.url);
        parcel.writeString(this.uri);
        parcel.writeString(this.alt);
    }

    public PictoPrimeCmsResponse(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "uri");
        Intrinsics.checkNotNullParameter(str3, "alt");
        this.url = str;
        this.uri = str2;
        this.alt = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PictoPrimeCmsResponse(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3);
    }
}
