package com.carrefour.fid.android.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.LoyaltyCardType;
import com.carrefour.fid.android.loyalty.core.constants.LoyaltyConstantsKt;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/UserCardModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/core/type/LoyaltyCardType;", "a", "", "b", "cardType", "loyaltyCardNumber", "c", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/core/type/LoyaltyCardType;", "e", "()Lcom/carrefour/fid/android/core/type/LoyaltyCardType;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/core/type/LoyaltyCardType;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class UserCardModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<UserCardModel> CREATOR = new C38452a();

    /* renamed from: c */
    public static final int f97567c = 0;
    @C12579k

    /* renamed from: a */
    public final LoyaltyCardType f97568a;
    @C12579k

    /* renamed from: b */
    public final String f97569b;

    /* renamed from: com.carrefour.fid.android.presentation.models.UserCardModel$a */
    public static final class C38452a implements Parcelable.Creator<UserCardModel> {
        @C12579k
        /* renamed from: a */
        public final UserCardModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserCardModel(LoyaltyCardType.valueOf(parcel.readString()), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final UserCardModel[] newArray(int i) {
            return new UserCardModel[i];
        }
    }

    public UserCardModel() {
        this((LoyaltyCardType) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ UserCardModel m159500d(UserCardModel userCardModel, LoyaltyCardType loyaltyCardType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            loyaltyCardType = userCardModel.f97568a;
        }
        if ((i & 2) != 0) {
            str = userCardModel.f97569b;
        }
        return userCardModel.mo121977c(loyaltyCardType, str);
    }

    @C12579k
    /* renamed from: a */
    public final LoyaltyCardType mo121975a() {
        return this.f97568a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo121976b() {
        return this.f97569b;
    }

    @C12579k
    /* renamed from: c */
    public final UserCardModel mo121977c(@C12579k LoyaltyCardType loyaltyCardType, @C12579k String str) {
        Intrinsics.checkNotNullParameter(loyaltyCardType, "cardType");
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        return new UserCardModel(loyaltyCardType, str);
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final LoyaltyCardType mo121979e() {
        return this.f97568a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCardModel)) {
            return false;
        }
        UserCardModel userCardModel = (UserCardModel) obj;
        return this.f97568a == userCardModel.f97568a && Intrinsics.areEqual((Object) this.f97569b, (Object) userCardModel.f97569b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo121981f() {
        return this.f97569b;
    }

    public int hashCode() {
        return (this.f97568a.hashCode() * 31) + this.f97569b.hashCode();
    }

    @C12579k
    public String toString() {
        LoyaltyCardType loyaltyCardType = this.f97568a;
        String str = this.f97569b;
        return "UserCardModel(cardType=" + loyaltyCardType + ", loyaltyCardNumber=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f97568a.name());
        parcel.writeString(this.f97569b);
    }

    public UserCardModel(@C12579k LoyaltyCardType loyaltyCardType, @C12579k String str) {
        Intrinsics.checkNotNullParameter(loyaltyCardType, "cardType");
        Intrinsics.checkNotNullParameter(str, LoyaltyConstantsKt.BUNDLE_KEY_LOYALTY_CARD);
        this.f97568a = loyaltyCardType;
        this.f97569b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserCardModel(LoyaltyCardType loyaltyCardType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LoyaltyCardType.FID : loyaltyCardType, (i & 2) != 0 ? "" : str);
    }
}
