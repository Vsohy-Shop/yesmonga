package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.RemainingAmountToPay;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/PaymentMethodDomain;", "Landroid/os/Parcelable;", "", "e", "()Ljava/lang/Boolean;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "key", "", "b", "Ljava/util/List;", "availableMethods", "c", "paymentUrl", "d", "paymentToken", "Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;", "Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;", "()Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;", "remainingAmountToPay", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/carrefour/fid/android/data/entities/RemainingAmountToPay;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class PaymentMethodDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<PaymentMethodDomain> CREATOR = new C37932a();

    /* renamed from: f */
    public static final int f95337f = 8;
    @C12580l

    /* renamed from: a */
    public final String f95338a;
    @C12580l

    /* renamed from: b */
    public final List<String> f95339b;
    @C12580l

    /* renamed from: c */
    public final String f95340c;
    @C12580l

    /* renamed from: d */
    public final String f95341d;
    @C12580l

    /* renamed from: e */
    public final RemainingAmountToPay f95342e;

    /* renamed from: com.carrefour.fid.android.domain.models.PaymentMethodDomain$a */
    public static final class C37932a implements Parcelable.Creator<PaymentMethodDomain> {
        @C12579k
        /* renamed from: a */
        public final PaymentMethodDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentMethodDomain(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RemainingAmountToPay.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final PaymentMethodDomain[] newArray(int i) {
            return new PaymentMethodDomain[i];
        }
    }

    public PaymentMethodDomain(@C12580l String str, @C12580l List<String> list, @C12580l String str2, @C12580l String str3, @C12580l RemainingAmountToPay remainingAmountToPay) {
        this.f95338a = str;
        this.f95339b = list;
        this.f95340c = str2;
        this.f95341d = str3;
        this.f95342e = remainingAmountToPay;
    }

    @C12580l
    /* renamed from: a */
    public final String mo116466a() {
        return this.f95338a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo116467b() {
        return this.f95341d;
    }

    @C12580l
    /* renamed from: c */
    public final String mo116468c() {
        return this.f95340c;
    }

    @C12580l
    /* renamed from: d */
    public final RemainingAmountToPay mo116469d() {
        return this.f95342e;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Boolean mo116471e() {
        List<String> list = this.f95339b;
        if (list != null) {
            return Boolean.valueOf(list.contains(C38212b.f96802j));
        }
        return null;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95338a);
        parcel.writeStringList(this.f95339b);
        parcel.writeString(this.f95340c);
        parcel.writeString(this.f95341d);
        RemainingAmountToPay remainingAmountToPay = this.f95342e;
        if (remainingAmountToPay == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        remainingAmountToPay.writeToParcel(parcel, i);
    }
}
