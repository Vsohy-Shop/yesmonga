package com.carrefour.fid.android.presentation.models;

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

@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/PaymentConfirmationModel;", "Landroid/os/Parcelable;", "()V", "FullFidPayment", "SdpPayment", "Lcom/carrefour/fid/android/presentation/models/PaymentConfirmationModel$FullFidPayment;", "Lcom/carrefour/fid/android/presentation/models/PaymentConfirmationModel$SdpPayment;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C8567o(parameters = 0)
public abstract class PaymentConfirmationModel implements Parcelable {

    /* renamed from: a */
    public static final int f97488a = 0;

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/PaymentConfirmationModel$FullFidPayment;", "Lcom/carrefour/fid/android/presentation/models/PaymentConfirmationModel;", "Landroid/os/Bundle;", "a", "bundle", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class FullFidPayment extends PaymentConfirmationModel {
        @C12579k
        public static final Parcelable.Creator<FullFidPayment> CREATOR = new C38442a();

        /* renamed from: c */
        public static final int f97489c = 8;
        @C12579k

        /* renamed from: b */
        public final Bundle f97490b;

        /* renamed from: com.carrefour.fid.android.presentation.models.PaymentConfirmationModel$FullFidPayment$a */
        public static final class C38442a implements Parcelable.Creator<FullFidPayment> {
            @C12579k
            /* renamed from: a */
            public final FullFidPayment createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullFidPayment(parcel.readBundle(FullFidPayment.class.getClassLoader()));
            }

            @C12579k
            /* renamed from: b */
            public final FullFidPayment[] newArray(int i) {
                return new FullFidPayment[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FullFidPayment(@C12579k Bundle bundle) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.f97490b = bundle;
        }

        /* renamed from: c */
        public static /* synthetic */ FullFidPayment m159358c(FullFidPayment fullFidPayment, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = fullFidPayment.f97490b;
            }
            return fullFidPayment.mo121786b(bundle);
        }

        @C12579k
        /* renamed from: a */
        public final Bundle mo121785a() {
            return this.f97490b;
        }

        @C12579k
        /* renamed from: b */
        public final FullFidPayment mo121786b(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new FullFidPayment(bundle);
        }

        @C12579k
        /* renamed from: d */
        public final Bundle mo121787d() {
            return this.f97490b;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FullFidPayment) && Intrinsics.areEqual((Object) this.f97490b, (Object) ((FullFidPayment) obj).f97490b);
        }

        public int hashCode() {
            return this.f97490b.hashCode();
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f97490b;
            return "FullFidPayment(bundle=" + bundle + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeBundle(this.f97490b);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/models/PaymentConfirmationModel$SdpPayment;", "Lcom/carrefour/fid/android/presentation/models/PaymentConfirmationModel;", "Landroid/os/Bundle;", "a", "bundle", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Landroid/os/Bundle;", "d", "()Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class SdpPayment extends PaymentConfirmationModel {
        @C12579k
        public static final Parcelable.Creator<SdpPayment> CREATOR = new C38443a();

        /* renamed from: c */
        public static final int f97491c = 8;
        @C12579k

        /* renamed from: b */
        public final Bundle f97492b;

        /* renamed from: com.carrefour.fid.android.presentation.models.PaymentConfirmationModel$SdpPayment$a */
        public static final class C38443a implements Parcelable.Creator<SdpPayment> {
            @C12579k
            /* renamed from: a */
            public final SdpPayment createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SdpPayment(parcel.readBundle(SdpPayment.class.getClassLoader()));
            }

            @C12579k
            /* renamed from: b */
            public final SdpPayment[] newArray(int i) {
                return new SdpPayment[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SdpPayment(@C12579k Bundle bundle) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.f97492b = bundle;
        }

        /* renamed from: c */
        public static /* synthetic */ SdpPayment m159364c(SdpPayment sdpPayment, Bundle bundle, int i, Object obj) {
            if ((i & 1) != 0) {
                bundle = sdpPayment.f97492b;
            }
            return sdpPayment.mo121798b(bundle);
        }

        @C12579k
        /* renamed from: a */
        public final Bundle mo121797a() {
            return this.f97492b;
        }

        @C12579k
        /* renamed from: b */
        public final SdpPayment mo121798b(@C12579k Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return new SdpPayment(bundle);
        }

        @C12579k
        /* renamed from: d */
        public final Bundle mo121799d() {
            return this.f97492b;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SdpPayment) && Intrinsics.areEqual((Object) this.f97492b, (Object) ((SdpPayment) obj).f97492b);
        }

        public int hashCode() {
            return this.f97492b.hashCode();
        }

        @C12579k
        public String toString() {
            Bundle bundle = this.f97492b;
            return "SdpPayment(bundle=" + bundle + ")";
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeBundle(this.f97492b);
        }
    }

    public /* synthetic */ PaymentConfirmationModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public PaymentConfirmationModel() {
    }
}
