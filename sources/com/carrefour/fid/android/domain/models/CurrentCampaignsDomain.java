package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/CurrentCampaignsDomain;", "Landroid/os/Parcelable;", "", "a", "", "b", "c", "isCampaignValid", "startDate", "endDate", "d", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Z", "h", "()Z", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "f", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CurrentCampaignsDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CurrentCampaignsDomain> CREATOR = new C37909a();

    /* renamed from: d */
    public static final int f95132d = 0;

    /* renamed from: a */
    public final boolean f95133a;
    @C12579k

    /* renamed from: b */
    public final String f95134b;
    @C12579k

    /* renamed from: c */
    public final String f95135c;

    /* renamed from: com.carrefour.fid.android.domain.models.CurrentCampaignsDomain$a */
    public static final class C37909a implements Parcelable.Creator<CurrentCampaignsDomain> {
        @C12579k
        /* renamed from: a */
        public final CurrentCampaignsDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrentCampaignsDomain(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CurrentCampaignsDomain[] newArray(int i) {
            return new CurrentCampaignsDomain[i];
        }
    }

    public CurrentCampaignsDomain(boolean z, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        this.f95133a = z;
        this.f95134b = str;
        this.f95135c = str2;
    }

    /* renamed from: e */
    public static /* synthetic */ CurrentCampaignsDomain m155418e(CurrentCampaignsDomain currentCampaignsDomain, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = currentCampaignsDomain.f95133a;
        }
        if ((i & 2) != 0) {
            str = currentCampaignsDomain.f95134b;
        }
        if ((i & 4) != 0) {
            str2 = currentCampaignsDomain.f95135c;
        }
        return currentCampaignsDomain.mo115776d(z, str, str2);
    }

    /* renamed from: a */
    public final boolean mo115773a() {
        return this.f95133a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo115774b() {
        return this.f95134b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo115775c() {
        return this.f95135c;
    }

    @C12579k
    /* renamed from: d */
    public final CurrentCampaignsDomain mo115776d(boolean z, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        return new CurrentCampaignsDomain(z, str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentCampaignsDomain)) {
            return false;
        }
        CurrentCampaignsDomain currentCampaignsDomain = (CurrentCampaignsDomain) obj;
        return this.f95133a == currentCampaignsDomain.f95133a && Intrinsics.areEqual((Object) this.f95134b, (Object) currentCampaignsDomain.f95134b) && Intrinsics.areEqual((Object) this.f95135c, (Object) currentCampaignsDomain.f95135c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo115779f() {
        return this.f95135c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo115780g() {
        return this.f95134b;
    }

    /* renamed from: h */
    public final boolean mo115781h() {
        return this.f95133a;
    }

    public int hashCode() {
        boolean z = this.f95133a;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + this.f95134b.hashCode()) * 31) + this.f95135c.hashCode();
    }

    @C12579k
    public String toString() {
        boolean z = this.f95133a;
        String str = this.f95134b;
        String str2 = this.f95135c;
        return "CurrentCampaignsDomain(isCampaignValid=" + z + ", startDate=" + str + ", endDate=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f95133a ? 1 : 0);
        parcel.writeString(this.f95134b);
        parcel.writeString(this.f95135c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrentCampaignsDomain(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, str2);
    }
}
