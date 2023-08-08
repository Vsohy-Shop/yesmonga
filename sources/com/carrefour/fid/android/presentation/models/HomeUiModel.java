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

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/HomeUiModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/presentation/models/UserCardModel;", "a", "", "b", "c", "", "d", "homeCardModel", "userHasStore", "hasAccount", "accountName", "e", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/presentation/models/UserCardModel;", "i", "()Lcom/carrefour/fid/android/presentation/models/UserCardModel;", "Z", "j", "()Z", "h", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/presentation/models/UserCardModel;ZZLjava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class HomeUiModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<HomeUiModel> CREATOR = new C38431a();

    /* renamed from: e */
    public static final int f97424e = 0;
    @C12579k

    /* renamed from: a */
    public final UserCardModel f97425a;

    /* renamed from: b */
    public final boolean f97426b;

    /* renamed from: c */
    public final boolean f97427c;
    @C12579k

    /* renamed from: d */
    public final String f97428d;

    /* renamed from: com.carrefour.fid.android.presentation.models.HomeUiModel$a */
    public static final class C38431a implements Parcelable.Creator<HomeUiModel> {
        @C12579k
        /* renamed from: a */
        public final HomeUiModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UserCardModel createFromParcel = UserCardModel.CREATOR.createFromParcel(parcel);
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new HomeUiModel(createFromParcel, z2, z, parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final HomeUiModel[] newArray(int i) {
            return new HomeUiModel[i];
        }
    }

    public HomeUiModel(@C12579k UserCardModel userCardModel, boolean z, boolean z2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(userCardModel, "homeCardModel");
        Intrinsics.checkNotNullParameter(str, "accountName");
        this.f97425a = userCardModel;
        this.f97426b = z;
        this.f97427c = z2;
        this.f97428d = str;
    }

    /* renamed from: f */
    public static /* synthetic */ HomeUiModel m159228f(HomeUiModel homeUiModel, UserCardModel userCardModel, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userCardModel = homeUiModel.f97425a;
        }
        if ((i & 2) != 0) {
            z = homeUiModel.f97426b;
        }
        if ((i & 4) != 0) {
            z2 = homeUiModel.f97427c;
        }
        if ((i & 8) != 0) {
            str = homeUiModel.f97428d;
        }
        return homeUiModel.mo121631e(userCardModel, z, z2, str);
    }

    @C12579k
    /* renamed from: a */
    public final UserCardModel mo121626a() {
        return this.f97425a;
    }

    /* renamed from: b */
    public final boolean mo121627b() {
        return this.f97426b;
    }

    /* renamed from: c */
    public final boolean mo121628c() {
        return this.f97427c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo121629d() {
        return this.f97428d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final HomeUiModel mo121631e(@C12579k UserCardModel userCardModel, boolean z, boolean z2, @C12579k String str) {
        Intrinsics.checkNotNullParameter(userCardModel, "homeCardModel");
        Intrinsics.checkNotNullParameter(str, "accountName");
        return new HomeUiModel(userCardModel, z, z2, str);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeUiModel)) {
            return false;
        }
        HomeUiModel homeUiModel = (HomeUiModel) obj;
        return Intrinsics.areEqual((Object) this.f97425a, (Object) homeUiModel.f97425a) && this.f97426b == homeUiModel.f97426b && this.f97427c == homeUiModel.f97427c && Intrinsics.areEqual((Object) this.f97428d, (Object) homeUiModel.f97428d);
    }

    @C12579k
    /* renamed from: g */
    public final String mo121633g() {
        return this.f97428d;
    }

    /* renamed from: h */
    public final boolean mo121634h() {
        return this.f97427c;
    }

    public int hashCode() {
        int hashCode = this.f97425a.hashCode() * 31;
        boolean z = this.f97426b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f97427c;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.f97428d.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final UserCardModel mo121636i() {
        return this.f97425a;
    }

    /* renamed from: j */
    public final boolean mo121637j() {
        return this.f97426b;
    }

    @C12579k
    public String toString() {
        UserCardModel userCardModel = this.f97425a;
        boolean z = this.f97426b;
        boolean z2 = this.f97427c;
        String str = this.f97428d;
        return "HomeUiModel(homeCardModel=" + userCardModel + ", userHasStore=" + z + ", hasAccount=" + z2 + ", accountName=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f97425a.writeToParcel(parcel, i);
        parcel.writeInt(this.f97426b ? 1 : 0);
        parcel.writeInt(this.f97427c ? 1 : 0);
        parcel.writeString(this.f97428d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeUiModel(UserCardModel userCardModel, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userCardModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? new String() : str);
    }
}
