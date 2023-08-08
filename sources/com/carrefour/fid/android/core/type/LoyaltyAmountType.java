package com.carrefour.fid.android.core.type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u001d\b\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/LoyaltyAmountType;", "Landroid/os/Parcelable;", "", "a", "I", "b", "()I", "iconResId", "iconBackgroundResId", "<init>", "(II)V", "FailedLoyaltyAmount", "ResetLoyaltyAmount", "SuccessLoyaltyAmount", "Lcom/carrefour/fid/android/core/type/LoyaltyAmountType$FailedLoyaltyAmount;", "Lcom/carrefour/fid/android/core/type/LoyaltyAmountType$ResetLoyaltyAmount;", "Lcom/carrefour/fid/android/core/type/LoyaltyAmountType$SuccessLoyaltyAmount;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public abstract class LoyaltyAmountType implements Parcelable {

    /* renamed from: c */
    public static final int f89869c = 0;

    /* renamed from: a */
    public final int f89870a;

    /* renamed from: b */
    public final int f89871b;

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/LoyaltyAmountType$FailedLoyaltyAmount;", "Lcom/carrefour/fid/android/core/type/LoyaltyAmountType;", "", "c", "loyaltyAmount", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class FailedLoyaltyAmount extends LoyaltyAmountType {
        @C12579k
        public static final Parcelable.Creator<FailedLoyaltyAmount> CREATOR = new C36356a();

        /* renamed from: e */
        public static final int f89872e = 0;
        @C12579k

        /* renamed from: d */
        public final String f89873d;

        /* renamed from: com.carrefour.fid.android.core.type.LoyaltyAmountType$FailedLoyaltyAmount$a */
        public static final class C36356a implements Parcelable.Creator<FailedLoyaltyAmount> {
            @C12579k
            /* renamed from: a */
            public final FailedLoyaltyAmount createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FailedLoyaltyAmount(parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final FailedLoyaltyAmount[] newArray(int i) {
                return new FailedLoyaltyAmount[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FailedLoyaltyAmount(@C12579k String str) {
            super(R.drawable.ic_warning, R.drawable.checkout_background_error, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "loyaltyAmount");
            this.f89873d = str;
        }

        /* renamed from: e */
        public static /* synthetic */ FailedLoyaltyAmount m149127e(FailedLoyaltyAmount failedLoyaltyAmount, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failedLoyaltyAmount.f89873d;
            }
            return failedLoyaltyAmount.mo108513d(str);
        }

        @C12579k
        /* renamed from: c */
        public final String mo108512c() {
            return this.f89873d;
        }

        @C12579k
        /* renamed from: d */
        public final FailedLoyaltyAmount mo108513d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyAmount");
            return new FailedLoyaltyAmount(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FailedLoyaltyAmount) && Intrinsics.areEqual((Object) this.f89873d, (Object) ((FailedLoyaltyAmount) obj).f89873d);
        }

        @C12579k
        /* renamed from: f */
        public final String mo108516f() {
            return this.f89873d;
        }

        public int hashCode() {
            return this.f89873d.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f89873d;
            return "FailedLoyaltyAmount(loyaltyAmount=" + str + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f89873d);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/LoyaltyAmountType$ResetLoyaltyAmount;", "Lcom/carrefour/fid/android/core/type/LoyaltyAmountType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class ResetLoyaltyAmount extends LoyaltyAmountType {
        @C12579k
        public static final Parcelable.Creator<ResetLoyaltyAmount> CREATOR = new C36357a();
        @C12579k

        /* renamed from: d */
        public static final ResetLoyaltyAmount f89874d = new ResetLoyaltyAmount();

        /* renamed from: e */
        public static final int f89875e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.LoyaltyAmountType$ResetLoyaltyAmount$a */
        public static final class C36357a implements Parcelable.Creator<ResetLoyaltyAmount> {
            @C12579k
            /* renamed from: a */
            public final ResetLoyaltyAmount createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ResetLoyaltyAmount.f89874d;
            }

            @C12579k
            /* renamed from: b */
            public final ResetLoyaltyAmount[] newArray(int i) {
                return new ResetLoyaltyAmount[i];
            }
        }

        public ResetLoyaltyAmount() {
            super(R.drawable.ic_warning, R.drawable.checkout_background_error, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/LoyaltyAmountType$SuccessLoyaltyAmount;", "Lcom/carrefour/fid/android/core/type/LoyaltyAmountType;", "", "c", "loyaltyAmount", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class SuccessLoyaltyAmount extends LoyaltyAmountType {
        @C12579k
        public static final Parcelable.Creator<SuccessLoyaltyAmount> CREATOR = new C36358a();

        /* renamed from: e */
        public static final int f89876e = 0;
        @C12579k

        /* renamed from: d */
        public final String f89877d;

        /* renamed from: com.carrefour.fid.android.core.type.LoyaltyAmountType$SuccessLoyaltyAmount$a */
        public static final class C36358a implements Parcelable.Creator<SuccessLoyaltyAmount> {
            @C12579k
            /* renamed from: a */
            public final SuccessLoyaltyAmount createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SuccessLoyaltyAmount(parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final SuccessLoyaltyAmount[] newArray(int i) {
                return new SuccessLoyaltyAmount[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SuccessLoyaltyAmount(@C12579k String str) {
            super(R.drawable.ic_check_checkout, R.drawable.checkout_background_layout, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "loyaltyAmount");
            this.f89877d = str;
        }

        /* renamed from: e */
        public static /* synthetic */ SuccessLoyaltyAmount m149135e(SuccessLoyaltyAmount successLoyaltyAmount, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = successLoyaltyAmount.f89877d;
            }
            return successLoyaltyAmount.mo108531d(str);
        }

        @C12579k
        /* renamed from: c */
        public final String mo108530c() {
            return this.f89877d;
        }

        @C12579k
        /* renamed from: d */
        public final SuccessLoyaltyAmount mo108531d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "loyaltyAmount");
            return new SuccessLoyaltyAmount(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuccessLoyaltyAmount) && Intrinsics.areEqual((Object) this.f89877d, (Object) ((SuccessLoyaltyAmount) obj).f89877d);
        }

        @C12579k
        /* renamed from: f */
        public final String mo108534f() {
            return this.f89877d;
        }

        public int hashCode() {
            return this.f89877d.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f89877d;
            return "SuccessLoyaltyAmount(loyaltyAmount=" + str + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f89877d);
        }
    }

    public /* synthetic */ LoyaltyAmountType(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    /* renamed from: a */
    public final int mo108510a() {
        return this.f89871b;
    }

    /* renamed from: b */
    public final int mo108511b() {
        return this.f89870a;
    }

    public LoyaltyAmountType(@C0375v int i, @C0375v int i2) {
        this.f89870a = i;
        this.f89871b = i2;
    }
}
