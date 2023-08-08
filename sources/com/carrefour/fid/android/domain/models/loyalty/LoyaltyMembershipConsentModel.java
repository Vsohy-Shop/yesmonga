package com.carrefour.fid.android.domain.models.loyalty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.C0861a;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.util.C9650g;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JO\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b'\u0010\"R\"\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006/"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/loyalty/LoyaltyMembershipConsentModel;", "Landroid/os/Parcelable;", "", "a", "b", "c", "d", "e", "f", "Lcom/carrefour/fid/android/domain/models/account/Address;", "g", "optEmail", "optSms", "canal", "secretCode", "phoneNumber", "birthdate", "address", "h", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "n", "l", "p", "o", "k", "Lcom/carrefour/fid/android/domain/models/account/Address;", "j", "()Lcom/carrefour/fid/android/domain/models/account/Address;", "q", "(Lcom/carrefour/fid/android/domain/models/account/Address;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/domain/models/account/Address;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class LoyaltyMembershipConsentModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<LoyaltyMembershipConsentModel> CREATOR = new C38043a();
    @C12579k

    /* renamed from: a */
    public final String f95910a;
    @C12579k

    /* renamed from: b */
    public final String f95911b;
    @C12579k

    /* renamed from: c */
    public final String f95912c;
    @C12579k

    /* renamed from: d */
    public final String f95913d;
    @C12579k

    /* renamed from: e */
    public final String f95914e;
    @C12579k

    /* renamed from: f */
    public final String f95915f;
    @C12579k

    /* renamed from: g */
    public Address f95916g;

    /* renamed from: com.carrefour.fid.android.domain.models.loyalty.LoyaltyMembershipConsentModel$a */
    public static final class C38043a implements Parcelable.Creator<LoyaltyMembershipConsentModel> {
        @C12579k
        /* renamed from: a */
        public final LoyaltyMembershipConsentModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoyaltyMembershipConsentModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Address.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final LoyaltyMembershipConsentModel[] newArray(int i) {
            return new LoyaltyMembershipConsentModel[i];
        }
    }

    public LoyaltyMembershipConsentModel(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k Address address) {
        Intrinsics.checkNotNullParameter(str, "optEmail");
        Intrinsics.checkNotNullParameter(str2, "optSms");
        Intrinsics.checkNotNullParameter(str3, C28534f.f69160j);
        Intrinsics.checkNotNullParameter(str4, "secretCode");
        Intrinsics.checkNotNullParameter(str5, C0861a.f2689A);
        Intrinsics.checkNotNullParameter(str6, C9650g.f26447j);
        Intrinsics.checkNotNullParameter(address, "address");
        this.f95910a = str;
        this.f95911b = str2;
        this.f95912c = str3;
        this.f95913d = str4;
        this.f95914e = str5;
        this.f95915f = str6;
        this.f95916g = address;
    }

    /* renamed from: i */
    public static /* synthetic */ LoyaltyMembershipConsentModel m156877i(LoyaltyMembershipConsentModel loyaltyMembershipConsentModel, String str, String str2, String str3, String str4, String str5, String str6, Address address, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loyaltyMembershipConsentModel.f95910a;
        }
        if ((i & 2) != 0) {
            str2 = loyaltyMembershipConsentModel.f95911b;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = loyaltyMembershipConsentModel.f95912c;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = loyaltyMembershipConsentModel.f95913d;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = loyaltyMembershipConsentModel.f95914e;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = loyaltyMembershipConsentModel.f95915f;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            address = loyaltyMembershipConsentModel.f95916g;
        }
        return loyaltyMembershipConsentModel.mo117841h(str, str7, str8, str9, str10, str11, address);
    }

    @C12579k
    /* renamed from: a */
    public final String mo117832a() {
        return this.f95910a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo117833b() {
        return this.f95911b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo117834c() {
        return this.f95912c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo117835d() {
        return this.f95913d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo117837e() {
        return this.f95914e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMembershipConsentModel)) {
            return false;
        }
        LoyaltyMembershipConsentModel loyaltyMembershipConsentModel = (LoyaltyMembershipConsentModel) obj;
        return Intrinsics.areEqual((Object) this.f95910a, (Object) loyaltyMembershipConsentModel.f95910a) && Intrinsics.areEqual((Object) this.f95911b, (Object) loyaltyMembershipConsentModel.f95911b) && Intrinsics.areEqual((Object) this.f95912c, (Object) loyaltyMembershipConsentModel.f95912c) && Intrinsics.areEqual((Object) this.f95913d, (Object) loyaltyMembershipConsentModel.f95913d) && Intrinsics.areEqual((Object) this.f95914e, (Object) loyaltyMembershipConsentModel.f95914e) && Intrinsics.areEqual((Object) this.f95915f, (Object) loyaltyMembershipConsentModel.f95915f) && Intrinsics.areEqual((Object) this.f95916g, (Object) loyaltyMembershipConsentModel.f95916g);
    }

    @C12579k
    /* renamed from: f */
    public final String mo117839f() {
        return this.f95915f;
    }

    @C12579k
    /* renamed from: g */
    public final Address mo117840g() {
        return this.f95916g;
    }

    @C12579k
    /* renamed from: h */
    public final LoyaltyMembershipConsentModel mo117841h(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k Address address) {
        Intrinsics.checkNotNullParameter(str, "optEmail");
        Intrinsics.checkNotNullParameter(str2, "optSms");
        Intrinsics.checkNotNullParameter(str3, C28534f.f69160j);
        Intrinsics.checkNotNullParameter(str4, "secretCode");
        Intrinsics.checkNotNullParameter(str5, C0861a.f2689A);
        Intrinsics.checkNotNullParameter(str6, C9650g.f26447j);
        Address address2 = address;
        Intrinsics.checkNotNullParameter(address2, "address");
        return new LoyaltyMembershipConsentModel(str, str2, str3, str4, str5, str6, address2);
    }

    public int hashCode() {
        return (((((((((((this.f95910a.hashCode() * 31) + this.f95911b.hashCode()) * 31) + this.f95912c.hashCode()) * 31) + this.f95913d.hashCode()) * 31) + this.f95914e.hashCode()) * 31) + this.f95915f.hashCode()) * 31) + this.f95916g.hashCode();
    }

    @C12579k
    /* renamed from: j */
    public final Address mo117843j() {
        return this.f95916g;
    }

    @C12579k
    /* renamed from: k */
    public final String mo117844k() {
        return this.f95915f;
    }

    @C12579k
    /* renamed from: l */
    public final String mo117845l() {
        return this.f95912c;
    }

    @C12579k
    /* renamed from: m */
    public final String mo117846m() {
        return this.f95910a;
    }

    @C12579k
    /* renamed from: n */
    public final String mo117847n() {
        return this.f95911b;
    }

    @C12579k
    /* renamed from: o */
    public final String mo117848o() {
        return this.f95914e;
    }

    @C12579k
    /* renamed from: p */
    public final String mo117849p() {
        return this.f95913d;
    }

    /* renamed from: q */
    public final void mo117850q(@C12579k Address address) {
        Intrinsics.checkNotNullParameter(address, "<set-?>");
        this.f95916g = address;
    }

    @C12579k
    public String toString() {
        String str = this.f95910a;
        String str2 = this.f95911b;
        String str3 = this.f95912c;
        String str4 = this.f95913d;
        String str5 = this.f95914e;
        String str6 = this.f95915f;
        Address address = this.f95916g;
        return "LoyaltyMembershipConsentModel(optEmail=" + str + ", optSms=" + str2 + ", canal=" + str3 + ", secretCode=" + str4 + ", phoneNumber=" + str5 + ", birthdate=" + str6 + ", address=" + address + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95910a);
        parcel.writeString(this.f95911b);
        parcel.writeString(this.f95912c);
        parcel.writeString(this.f95913d);
        parcel.writeString(this.f95914e);
        parcel.writeString(this.f95915f);
        this.f95916g.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoyaltyMembershipConsentModel(String str, String str2, String str3, String str4, String str5, String str6, Address address, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3, (i & 8) != 0 ? new String() : str4, (i & 16) != 0 ? new String() : str5, (i & 32) != 0 ? new String() : str6, address);
    }
}
