package com.carrefour.fid.android.domain.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0001\u0018\u0001\u00020\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/product/Gtin;", "Landroid/os/Parcelable;", "", "h", "(Ljava/lang/String;)Ljava/lang/String;", "", "g", "(Ljava/lang/String;)I", "", "other", "", "d", "(Ljava/lang/String;Ljava/lang/Object;)Z", "c", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "j", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "value", "b", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11288f
@C12187d
public final class Gtin implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<Gtin> CREATOR = new C38087a();
    @C12579k

    /* renamed from: a */
    public final String f96254a;

    /* renamed from: com.carrefour.fid.android.domain.models.product.Gtin$a */
    public static final class C38087a implements Parcelable.Creator<Gtin> {
        @C12579k
        /* renamed from: a */
        public final String mo118383a(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return Gtin.m157308b(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final Gtin[] newArray(int i) {
            return new Gtin[i];
        }

        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return Gtin.m157307a(mo118383a(parcel));
        }
    }

    public /* synthetic */ Gtin(String str) {
        this.f96254a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ Gtin m157307a(String str) {
        return new Gtin(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m157308b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        return str;
    }

    /* renamed from: c */
    public static int m157309c(String str) {
        return 0;
    }

    /* renamed from: d */
    public static boolean m157310d(String str, Object obj) {
        return (obj instanceof Gtin) && Intrinsics.areEqual((Object) str, (Object) ((Gtin) obj).mo118380i());
    }

    /* renamed from: e */
    public static final boolean m157311e(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: g */
    public static int m157312g(String str) {
        return str.hashCode();
    }

    /* renamed from: h */
    public static String m157313h(String str) {
        return "Gtin(value=" + str + ")";
    }

    /* renamed from: j */
    public static void m157314j(String str, @C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(str);
    }

    public int describeContents() {
        return m157309c(this.f96254a);
    }

    public boolean equals(Object obj) {
        return m157310d(this.f96254a, obj);
    }

    @C12579k
    /* renamed from: f */
    public final String mo118378f() {
        return this.f96254a;
    }

    public int hashCode() {
        return m157312g(this.f96254a);
    }

    /* renamed from: i */
    public final /* synthetic */ String mo118380i() {
        return this.f96254a;
    }

    public String toString() {
        return m157313h(this.f96254a);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        m157314j(this.f96254a, parcel, i);
    }
}
