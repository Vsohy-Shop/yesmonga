package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OrderOffer;", "Landroid/os/Parcelable;", "", "e", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "b", "c", "id", "gtin", "categoryName", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "quantity", "", "Ljava/lang/Float;", "g", "()Ljava/lang/Float;", "salePrice", "h", "standardPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderOffer implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderOffer> CREATOR = new C37926a();

    /* renamed from: v */
    public static final int f95316v = 0;
    @C12580l

    /* renamed from: a */
    public final String f95317a;
    @C12580l

    /* renamed from: b */
    public final String f95318b;
    @C12580l

    /* renamed from: c */
    public final String f95319c;
    @C12580l

    /* renamed from: d */
    public final String f95320d;
    @C12580l

    /* renamed from: e */
    public final Integer f95321e;
    @C12580l

    /* renamed from: f */
    public final Float f95322f;
    @C12580l

    /* renamed from: g */
    public final Float f95323g;

    /* renamed from: com.carrefour.fid.android.domain.models.OrderOffer$a */
    public static final class C37926a implements Parcelable.Creator<OrderOffer> {
        @C12579k
        /* renamed from: a */
        public final OrderOffer createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderOffer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @C12579k
        /* renamed from: b */
        public final OrderOffer[] newArray(int i) {
            return new OrderOffer[i];
        }
    }

    public OrderOffer(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l Integer num, @C12580l Float f, @C12580l Float f2) {
        this.f95317a = str;
        this.f95318b = str2;
        this.f95319c = str3;
        this.f95320d = str4;
        this.f95321e = num;
        this.f95322f = f;
        this.f95323g = f2;
    }

    @C12580l
    /* renamed from: a */
    public final String mo116186a() {
        return this.f95320d;
    }

    @C12580l
    /* renamed from: b */
    public final String mo116187b() {
        return this.f95319c;
    }

    @C12580l
    /* renamed from: c */
    public final String mo116188c() {
        return this.f95318b;
    }

    @C12580l
    /* renamed from: d */
    public final String mo116189d() {
        return this.f95317a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final double mo116191e() {
        float f;
        float f2;
        Float f3 = this.f95322f;
        if (f3 != null) {
            f = f3.floatValue();
        } else {
            f = 0.0f;
        }
        Float f4 = this.f95323g;
        if (f4 != null) {
            f2 = f4.floatValue();
        } else {
            f2 = 0.0f;
        }
        if (f > 0.0f) {
            return (double) f;
        }
        return (double) f2;
    }

    @C12580l
    /* renamed from: f */
    public final Integer mo116192f() {
        return this.f95321e;
    }

    @C12580l
    /* renamed from: g */
    public final Float mo116193g() {
        return this.f95322f;
    }

    @C12580l
    /* renamed from: h */
    public final Float mo116194h() {
        return this.f95323g;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95317a);
        parcel.writeString(this.f95318b);
        parcel.writeString(this.f95319c);
        parcel.writeString(this.f95320d);
        Integer num = this.f95321e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Float f = this.f95322f;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.f95323g;
        if (f2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(f2.floatValue());
    }
}
