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

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/UrlPrimeCmsResponse;", "Landroid/os/Parcelable;", "", "component1", "uri", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "<init>", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
public final class UrlPrimeCmsResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<UrlPrimeCmsResponse> CREATOR = new C40018a();
    @C33608c("uri")
    @C12579k
    private String uri;

    /* renamed from: com.carrefour.fid.android.cms.data.entities.UrlPrimeCmsResponse$a */
    public static final class C40018a implements Parcelable.Creator<UrlPrimeCmsResponse> {
        @C12579k
        /* renamed from: a */
        public final UrlPrimeCmsResponse createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UrlPrimeCmsResponse(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final UrlPrimeCmsResponse[] newArray(int i) {
            return new UrlPrimeCmsResponse[i];
        }
    }

    public UrlPrimeCmsResponse() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UrlPrimeCmsResponse copy$default(UrlPrimeCmsResponse urlPrimeCmsResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlPrimeCmsResponse.uri;
        }
        return urlPrimeCmsResponse.copy(str);
    }

    @C12579k
    public final String component1() {
        return this.uri;
    }

    @C12579k
    public final UrlPrimeCmsResponse copy(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uri");
        return new UrlPrimeCmsResponse(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UrlPrimeCmsResponse) && Intrinsics.areEqual((Object) this.uri, (Object) ((UrlPrimeCmsResponse) obj).uri);
    }

    @C12579k
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.uri.hashCode();
    }

    public final void setUri(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uri = str;
    }

    @C12579k
    public String toString() {
        String str = this.uri;
        return "UrlPrimeCmsResponse(uri=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.uri);
    }

    public UrlPrimeCmsResponse(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uri");
        this.uri = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlPrimeCmsResponse(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str);
    }
}
