package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrderProductModel;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "gtin", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "quantity", "", "d", "Ljava/lang/Float;", "()Ljava/lang/Float;", "salePrice", "e", "standardPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderProductModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderProductModel> CREATOR = new C37928a();

    /* renamed from: f */
    public static final int f95328f = 0;
    @C12580l

    /* renamed from: a */
    public final String f95329a;
    @C12580l

    /* renamed from: b */
    public final String f95330b;
    @C12580l

    /* renamed from: c */
    public final Integer f95331c;
    @C12580l

    /* renamed from: d */
    public final Float f95332d;
    @C12580l

    /* renamed from: e */
    public final Float f95333e;

    /* renamed from: com.carrefour.fid.android.domain.models.OrderProductModel$a */
    public static final class C37928a implements Parcelable.Creator<OrderProductModel> {
        @C12579k
        /* renamed from: a */
        public final OrderProductModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderProductModel(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @C12579k
        /* renamed from: b */
        public final OrderProductModel[] newArray(int i) {
            return new OrderProductModel[i];
        }
    }

    public OrderProductModel(@C12580l String str, @C12580l String str2, @C12580l Integer num, @C12580l Float f, @C12580l Float f2) {
        this.f95329a = str;
        this.f95330b = str2;
        this.f95331c = num;
        this.f95332d = f;
        this.f95333e = f2;
    }

    @C12580l
    /* renamed from: a */
    public final String mo116210a() {
        return this.f95330b;
    }

    @C12580l
    /* renamed from: b */
    public final String mo116211b() {
        return this.f95329a;
    }

    @C12580l
    /* renamed from: c */
    public final Integer mo116212c() {
        return this.f95331c;
    }

    @C12580l
    /* renamed from: d */
    public final Float mo116213d() {
        return this.f95332d;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Float mo116215e() {
        return this.f95333e;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95329a);
        parcel.writeString(this.f95330b);
        Integer num = this.f95331c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Float f = this.f95332d;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.f95333e;
        if (f2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(f2.floatValue());
    }
}
