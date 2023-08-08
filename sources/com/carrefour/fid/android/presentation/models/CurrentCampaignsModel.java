package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/CurrentCampaignsModel;", "Landroid/os/Parcelable;", "", "a", "", "b", "c", "isCampaignValid", "startDate", "endDate", "d", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Z", "h", "()Z", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "f", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class CurrentCampaignsModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CurrentCampaignsModel> CREATOR = new C38425a();

    /* renamed from: d */
    public static final int f97393d = 0;

    /* renamed from: a */
    public final boolean f97394a;
    @C12579k

    /* renamed from: b */
    public final String f97395b;
    @C12579k

    /* renamed from: c */
    public final String f97396c;

    /* renamed from: com.carrefour.fid.android.presentation.models.CurrentCampaignsModel$a */
    public static final class C38425a implements Parcelable.Creator<CurrentCampaignsModel> {
        @C12579k
        /* renamed from: a */
        public final CurrentCampaignsModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrentCampaignsModel(parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final CurrentCampaignsModel[] newArray(int i) {
            return new CurrentCampaignsModel[i];
        }
    }

    public CurrentCampaignsModel(boolean z, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        this.f97394a = z;
        this.f97395b = str;
        this.f97396c = str2;
    }

    /* renamed from: e */
    public static /* synthetic */ CurrentCampaignsModel m159163e(CurrentCampaignsModel currentCampaignsModel, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = currentCampaignsModel.f97394a;
        }
        if ((i & 2) != 0) {
            str = currentCampaignsModel.f97395b;
        }
        if ((i & 4) != 0) {
            str2 = currentCampaignsModel.f97396c;
        }
        return currentCampaignsModel.mo121534d(z, str, str2);
    }

    /* renamed from: a */
    public final boolean mo121531a() {
        return this.f97394a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo121532b() {
        return this.f97395b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo121533c() {
        return this.f97396c;
    }

    @C12579k
    /* renamed from: d */
    public final CurrentCampaignsModel mo121534d(boolean z, @C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        return new CurrentCampaignsModel(z, str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentCampaignsModel)) {
            return false;
        }
        CurrentCampaignsModel currentCampaignsModel = (CurrentCampaignsModel) obj;
        return this.f97394a == currentCampaignsModel.f97394a && Intrinsics.areEqual((Object) this.f97395b, (Object) currentCampaignsModel.f97395b) && Intrinsics.areEqual((Object) this.f97396c, (Object) currentCampaignsModel.f97396c);
    }

    @C12579k
    /* renamed from: f */
    public final String mo121537f() {
        return this.f97396c;
    }

    @C12579k
    /* renamed from: g */
    public final String mo121538g() {
        return this.f97395b;
    }

    /* renamed from: h */
    public final boolean mo121539h() {
        return this.f97394a;
    }

    public int hashCode() {
        boolean z = this.f97394a;
        if (z) {
            z = true;
        }
        return ((((z ? 1 : 0) * true) + this.f97395b.hashCode()) * 31) + this.f97396c.hashCode();
    }

    @C12579k
    public String toString() {
        boolean z = this.f97394a;
        String str = this.f97395b;
        String str2 = this.f97396c;
        return "CurrentCampaignsModel(isCampaignValid=" + z + ", startDate=" + str + ", endDate=" + str2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f97394a ? 1 : 0);
        parcel.writeString(this.f97395b);
        parcel.writeString(this.f97396c);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrentCampaignsModel(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, str2);
    }
}
