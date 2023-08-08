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

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010HÖ\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/PaymentSettingsModel;", "Landroid/os/Parcelable;", "", "a", "b", "c", "d", "", "e", "isPaymentOnSite", "isFullLoyaltyChecked", "isExpressPickup", "isPostOrderSubstitutionEnabled", "orderId", "f", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Z", "k", "()Z", "p", "(Z)V", "j", "n", "i", "m", "l", "q", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "<init>", "(ZZZZLjava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class PaymentSettingsModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<PaymentSettingsModel> CREATOR = new C37933a();

    /* renamed from: f */
    public static final int f95343f = 8;

    /* renamed from: a */
    public boolean f95344a;

    /* renamed from: b */
    public boolean f95345b;

    /* renamed from: c */
    public boolean f95346c;

    /* renamed from: d */
    public boolean f95347d;
    @C12580l

    /* renamed from: e */
    public String f95348e;

    /* renamed from: com.carrefour.fid.android.domain.models.PaymentSettingsModel$a */
    public static final class C37933a implements Parcelable.Creator<PaymentSettingsModel> {
        @C12579k
        /* renamed from: a */
        public final PaymentSettingsModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentSettingsModel(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final PaymentSettingsModel[] newArray(int i) {
            return new PaymentSettingsModel[i];
        }
    }

    public PaymentSettingsModel(boolean z, boolean z2, boolean z3, boolean z4, @C12580l String str) {
        this.f95344a = z;
        this.f95345b = z2;
        this.f95346c = z3;
        this.f95347d = z4;
        this.f95348e = str;
    }

    /* renamed from: g */
    public static /* synthetic */ PaymentSettingsModel m155728g(PaymentSettingsModel paymentSettingsModel, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = paymentSettingsModel.f95344a;
        }
        if ((i & 2) != 0) {
            z2 = paymentSettingsModel.f95345b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = paymentSettingsModel.f95346c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            z4 = paymentSettingsModel.f95347d;
        }
        boolean z7 = z4;
        if ((i & 16) != 0) {
            str = paymentSettingsModel.f95348e;
        }
        return paymentSettingsModel.mo116484f(z, z5, z6, z7, str);
    }

    /* renamed from: a */
    public final boolean mo116477a() {
        return this.f95344a;
    }

    /* renamed from: b */
    public final boolean mo116478b() {
        return this.f95345b;
    }

    /* renamed from: c */
    public final boolean mo116479c() {
        return this.f95346c;
    }

    /* renamed from: d */
    public final boolean mo116480d() {
        return this.f95347d;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final String mo116482e() {
        return this.f95348e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentSettingsModel)) {
            return false;
        }
        PaymentSettingsModel paymentSettingsModel = (PaymentSettingsModel) obj;
        return this.f95344a == paymentSettingsModel.f95344a && this.f95345b == paymentSettingsModel.f95345b && this.f95346c == paymentSettingsModel.f95346c && this.f95347d == paymentSettingsModel.f95347d && Intrinsics.areEqual((Object) this.f95348e, (Object) paymentSettingsModel.f95348e);
    }

    @C12579k
    /* renamed from: f */
    public final PaymentSettingsModel mo116484f(boolean z, boolean z2, boolean z3, boolean z4, @C12580l String str) {
        return new PaymentSettingsModel(z, z2, z3, z4, str);
    }

    @C12580l
    /* renamed from: h */
    public final String mo116485h() {
        return this.f95348e;
    }

    public int hashCode() {
        boolean z = this.f95344a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f95345b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f95346c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f95347d;
        if (!z5) {
            z2 = z5;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        String str = this.f95348e;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: i */
    public final boolean mo116487i() {
        return this.f95346c;
    }

    /* renamed from: j */
    public final boolean mo116488j() {
        return this.f95345b;
    }

    /* renamed from: k */
    public final boolean mo116489k() {
        return this.f95344a;
    }

    /* renamed from: l */
    public final boolean mo116490l() {
        return this.f95347d;
    }

    /* renamed from: m */
    public final void mo116491m(boolean z) {
        this.f95346c = z;
    }

    /* renamed from: n */
    public final void mo116492n(boolean z) {
        this.f95345b = z;
    }

    /* renamed from: o */
    public final void mo116493o(@C12580l String str) {
        this.f95348e = str;
    }

    /* renamed from: p */
    public final void mo116494p(boolean z) {
        this.f95344a = z;
    }

    /* renamed from: q */
    public final void mo116495q(boolean z) {
        this.f95347d = z;
    }

    @C12579k
    public String toString() {
        boolean z = this.f95344a;
        boolean z2 = this.f95345b;
        boolean z3 = this.f95346c;
        boolean z4 = this.f95347d;
        String str = this.f95348e;
        return "PaymentSettingsModel(isPaymentOnSite=" + z + ", isFullLoyaltyChecked=" + z2 + ", isExpressPickup=" + z3 + ", isPostOrderSubstitutionEnabled=" + z4 + ", orderId=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f95344a ? 1 : 0);
        parcel.writeInt(this.f95345b ? 1 : 0);
        parcel.writeInt(this.f95346c ? 1 : 0);
        parcel.writeInt(this.f95347d ? 1 : 0);
        parcel.writeString(this.f95348e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentSettingsModel(boolean z, boolean z2, boolean z3, boolean z4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, (i & 16) != 0 ? null : str);
    }
}
