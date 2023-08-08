package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0004\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\t\n\u000b\f¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "AdditionalOrders", "CheckoutStep3", "MyAccount", "NonFoodCheckoutStep2", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination$AdditionalOrders;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination$CheckoutStep3;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination$MyAccount;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination$NonFoodCheckoutStep2;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination */
public abstract class OtpOrigination implements Parcelable {
    @C12579k

    /* renamed from: a */
    public static final C24558a f61092a = new C24558a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f61093b = 0;
    @C12579k

    /* renamed from: c */
    public static final String f61094c = "has_fid_code_successfully_changed";

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination$AdditionalOrders;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination;", "Landroid/os/Bundle;", "a", "args", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "d", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$AdditionalOrders */
    public static final class AdditionalOrders extends OtpOrigination {
        @C12579k
        public static final Parcelable.Creator<AdditionalOrders> CREATOR = new C24554a();

        /* renamed from: e */
        public static final int f61095e = 8;
        @C12579k

        /* renamed from: d */
        public final Bundle f61096d;

        /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$AdditionalOrders$a */
        public static final class C24554a implements Parcelable.Creator<AdditionalOrders> {
            @C12579k
            /* renamed from: a */
            public final AdditionalOrders createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalOrders(parcel.readBundle(AdditionalOrders.class.getClassLoader()));
            }

            @C12579k
            /* renamed from: b */
            public final AdditionalOrders[] newArray(int i) {
                return new AdditionalOrders[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AdditionalOrders(@C12579k Bundle bundle) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(bundle, "args");
            this.f61096d = bundle;
        }

        /* renamed from: c */
        public static /* synthetic */ AdditionalOrders m107464c(AdditionalOrders additionalOrders, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = additionalOrders.f61096d;
            }
            return additionalOrders.mo71774b(bundle);
        }

        @C12579k
        /* renamed from: a */
        public final Bundle mo71773a() {
            return this.f61096d;
        }

        @C12579k
        /* renamed from: b */
        public final AdditionalOrders mo71774b(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "args");
            return new AdditionalOrders(bundle);
        }

        @C12579k
        /* renamed from: d */
        public final Bundle mo71775d() {
            return this.f61096d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AdditionalOrders) && Intrinsics.areEqual((Object) this.f61096d, (Object) ((AdditionalOrders) obj).f61096d);
        }

        public int hashCode() {
            return this.f61096d.hashCode();
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f61096d;
            return "AdditionalOrders(args=" + bundle + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeBundle(this.f61096d);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination$CheckoutStep3;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination;", "Landroid/os/Bundle;", "a", "args", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "d", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$CheckoutStep3 */
    public static final class CheckoutStep3 extends OtpOrigination {
        @C12579k
        public static final Parcelable.Creator<CheckoutStep3> CREATOR = new C24555a();

        /* renamed from: e */
        public static final int f61097e = 8;
        @C12579k

        /* renamed from: d */
        public final Bundle f61098d;

        /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$CheckoutStep3$a */
        public static final class C24555a implements Parcelable.Creator<CheckoutStep3> {
            @C12579k
            /* renamed from: a */
            public final CheckoutStep3 createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CheckoutStep3(parcel.readBundle(CheckoutStep3.class.getClassLoader()));
            }

            @C12579k
            /* renamed from: b */
            public final CheckoutStep3[] newArray(int i) {
                return new CheckoutStep3[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CheckoutStep3(@C12579k Bundle bundle) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(bundle, "args");
            this.f61098d = bundle;
        }

        /* renamed from: c */
        public static /* synthetic */ CheckoutStep3 m107470c(CheckoutStep3 checkoutStep3, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = checkoutStep3.f61098d;
            }
            return checkoutStep3.mo71786b(bundle);
        }

        @C12579k
        /* renamed from: a */
        public final Bundle mo71785a() {
            return this.f61098d;
        }

        @C12579k
        /* renamed from: b */
        public final CheckoutStep3 mo71786b(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "args");
            return new CheckoutStep3(bundle);
        }

        @C12579k
        /* renamed from: d */
        public final Bundle mo71787d() {
            return this.f61098d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckoutStep3) && Intrinsics.areEqual((Object) this.f61098d, (Object) ((CheckoutStep3) obj).f61098d);
        }

        public int hashCode() {
            return this.f61098d.hashCode();
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f61098d;
            return "CheckoutStep3(args=" + bundle + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeBundle(this.f61098d);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination$MyAccount;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$MyAccount */
    public static final class MyAccount extends OtpOrigination {
        @C12579k
        public static final Parcelable.Creator<MyAccount> CREATOR = new C24556a();
        @C12579k

        /* renamed from: d */
        public static final MyAccount f61099d = new MyAccount();

        /* renamed from: e */
        public static final int f61100e = 0;

        /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$MyAccount$a */
        public static final class C24556a implements Parcelable.Creator<MyAccount> {
            @C12579k
            /* renamed from: a */
            public final MyAccount createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MyAccount.f61099d;
            }

            @C12579k
            /* renamed from: b */
            public final MyAccount[] newArray(int i) {
                return new MyAccount[i];
            }
        }

        public MyAccount() {
            super((DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination$NonFoodCheckoutStep2;", "Lcom/carrefour/fid/android/presentation/ui/loyalty/fragments/otp/OtpOrigination;", "", "a", "subBasketId", "b", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$NonFoodCheckoutStep2 */
    public static final class NonFoodCheckoutStep2 extends OtpOrigination {
        @C12579k
        public static final Parcelable.Creator<NonFoodCheckoutStep2> CREATOR = new C24557a();

        /* renamed from: e */
        public static final int f61101e = 0;
        @C12579k

        /* renamed from: d */
        public final String f61102d;

        /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$NonFoodCheckoutStep2$a */
        public static final class C24557a implements Parcelable.Creator<NonFoodCheckoutStep2> {
            @C12579k
            /* renamed from: a */
            public final NonFoodCheckoutStep2 createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NonFoodCheckoutStep2(parcel.readString());
            }

            @C12579k
            /* renamed from: b */
            public final NonFoodCheckoutStep2[] newArray(int i) {
                return new NonFoodCheckoutStep2[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NonFoodCheckoutStep2(@C12579k String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            this.f61102d = str;
        }

        /* renamed from: c */
        public static /* synthetic */ NonFoodCheckoutStep2 m107478c(NonFoodCheckoutStep2 nonFoodCheckoutStep2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nonFoodCheckoutStep2.f61102d;
            }
            return nonFoodCheckoutStep2.mo71804b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo71803a() {
            return this.f61102d;
        }

        @C12579k
        /* renamed from: b */
        public final NonFoodCheckoutStep2 mo71804b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "subBasketId");
            return new NonFoodCheckoutStep2(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo71805d() {
            return this.f61102d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NonFoodCheckoutStep2) && Intrinsics.areEqual((Object) this.f61102d, (Object) ((NonFoodCheckoutStep2) obj).f61102d);
        }

        public int hashCode() {
            return this.f61102d.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f61102d;
            return "NonFoodCheckoutStep2(subBasketId=" + str + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.f61102d);
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.OtpOrigination$a */
    public static final class C24558a {
        public /* synthetic */ C24558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C24558a() {
        }
    }

    public /* synthetic */ OtpOrigination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public OtpOrigination() {
    }
}
