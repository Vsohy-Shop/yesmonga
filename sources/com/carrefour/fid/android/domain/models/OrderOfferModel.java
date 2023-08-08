package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrderOfferModel;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ean", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "quantity", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "d", "(Ljava/lang/Double;)V", "price", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderOfferModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderOfferModel> CREATOR = new C37927a();

    /* renamed from: d */
    public static final int f95324d = 8;
    @C12580l

    /* renamed from: a */
    public final String f95325a;
    @C12580l

    /* renamed from: b */
    public final Integer f95326b;
    @C12580l

    /* renamed from: c */
    public Double f95327c;

    /* renamed from: com.carrefour.fid.android.domain.models.OrderOfferModel$a */
    public static final class C37927a implements Parcelable.Creator<OrderOfferModel> {
        @C12579k
        /* renamed from: a */
        public final OrderOfferModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Double d = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                d = Double.valueOf(parcel.readDouble());
            }
            return new OrderOfferModel(readString, valueOf, d);
        }

        @C12579k
        /* renamed from: b */
        public final OrderOfferModel[] newArray(int i) {
            return new OrderOfferModel[i];
        }
    }

    public OrderOfferModel(@C12580l String str, @C12580l Integer num, @C12580l Double d) {
        this.f95325a = str;
        this.f95326b = num;
        this.f95327c = d;
    }

    @C12580l
    /* renamed from: a */
    public final String mo116200a() {
        return this.f95325a;
    }

    @C12580l
    /* renamed from: b */
    public final Double mo116201b() {
        return this.f95327c;
    }

    @C12580l
    /* renamed from: c */
    public final Integer mo116202c() {
        return this.f95326b;
    }

    /* renamed from: d */
    public final void mo116203d(@C12580l Double d) {
        this.f95327c = d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95325a);
        Integer num = this.f95326b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Double d = this.f95327c;
        if (d == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d.doubleValue());
    }
}
