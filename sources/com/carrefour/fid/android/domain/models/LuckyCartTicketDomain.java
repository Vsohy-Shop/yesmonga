package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/LuckyCartTicketDomain;", "Landroid/os/Parcelable;", "", "component1", "component2", "imageUrl", "redirectionUrl", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "getRedirectionUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class LuckyCartTicketDomain implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<LuckyCartTicketDomain> CREATOR = new C37915a();
    @C12579k
    private final String imageUrl;
    @C12579k
    private final String redirectionUrl;

    /* renamed from: com.carrefour.fid.android.domain.models.LuckyCartTicketDomain$a */
    public static final class C37915a implements Parcelable.Creator<LuckyCartTicketDomain> {
        @C12579k
        /* renamed from: a */
        public final LuckyCartTicketDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LuckyCartTicketDomain(parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final LuckyCartTicketDomain[] newArray(int i) {
            return new LuckyCartTicketDomain[i];
        }
    }

    public LuckyCartTicketDomain(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "redirectionUrl");
        this.imageUrl = str;
        this.redirectionUrl = str2;
    }

    public static /* synthetic */ LuckyCartTicketDomain copy$default(LuckyCartTicketDomain luckyCartTicketDomain, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = luckyCartTicketDomain.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = luckyCartTicketDomain.redirectionUrl;
        }
        return luckyCartTicketDomain.copy(str, str2);
    }

    @C12579k
    public final String component1() {
        return this.imageUrl;
    }

    @C12579k
    public final String component2() {
        return this.redirectionUrl;
    }

    @C12579k
    public final LuckyCartTicketDomain copy(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "imageUrl");
        Intrinsics.checkNotNullParameter(str2, "redirectionUrl");
        return new LuckyCartTicketDomain(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LuckyCartTicketDomain)) {
            return false;
        }
        LuckyCartTicketDomain luckyCartTicketDomain = (LuckyCartTicketDomain) obj;
        return Intrinsics.areEqual((Object) this.imageUrl, (Object) luckyCartTicketDomain.imageUrl) && Intrinsics.areEqual((Object) this.redirectionUrl, (Object) luckyCartTicketDomain.redirectionUrl);
    }

    @C12579k
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @C12579k
    public final String getRedirectionUrl() {
        return this.redirectionUrl;
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + this.redirectionUrl.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.imageUrl;
        String str2 = this.redirectionUrl;
        return "LuckyCartTicketDomain(imageUrl=" + str + ", redirectionUrl=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.redirectionUrl);
    }
}
