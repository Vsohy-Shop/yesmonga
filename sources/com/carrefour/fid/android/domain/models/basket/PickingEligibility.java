package com.carrefour.fid.android.domain.models.basket;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0007J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0001\u001a\u0001\u00020\u0005ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/PickingEligibility;", "Landroid/os/Parcelable;", "", "i", "(Ljava/lang/String;)Z", "", "j", "(Ljava/lang/String;)Ljava/lang/String;", "", "h", "(Ljava/lang/String;)I", "", "other", "e", "(Ljava/lang/String;Ljava/lang/Object;)Z", "d", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "l", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "eligibility", "b", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11288f
@C12187d
public final class PickingEligibility implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<PickingEligibility> CREATOR = new C37967a();
    @C12579k

    /* renamed from: a */
    public final String f95528a;

    /* renamed from: com.carrefour.fid.android.domain.models.basket.PickingEligibility$a */
    public static final class C37967a implements Parcelable.Creator<PickingEligibility> {
        @C12579k
        /* renamed from: a */
        public final String mo117017a(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PickingEligibility.m156142b(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final PickingEligibility[] newArray(int i) {
            return new PickingEligibility[i];
        }

        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return PickingEligibility.m156141a(mo117017a(parcel));
        }
    }

    public /* synthetic */ PickingEligibility(String str) {
        this.f95528a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ PickingEligibility m156141a(String str) {
        return new PickingEligibility(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m156142b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "eligibility");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ String m156143c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = new String();
        }
        return m156142b(str);
    }

    /* renamed from: d */
    public static int m156144d(String str) {
        return 0;
    }

    /* renamed from: e */
    public static boolean m156145e(String str, Object obj) {
        return (obj instanceof PickingEligibility) && Intrinsics.areEqual((Object) str, (Object) ((PickingEligibility) obj).mo117014k());
    }

    /* renamed from: f */
    public static final boolean m156146f(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: h */
    public static int m156147h(String str) {
        return str.hashCode();
    }

    /* renamed from: i */
    public static final boolean m156148i(String str) {
        return Intrinsics.areEqual((Object) str, (Object) "drive");
    }

    /* renamed from: j */
    public static String m156149j(String str) {
        return "PickingEligibility(eligibility=" + str + ")";
    }

    /* renamed from: l */
    public static void m156150l(String str, @C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(str);
    }

    public int describeContents() {
        return m156144d(this.f95528a);
    }

    public boolean equals(Object obj) {
        return m156145e(this.f95528a, obj);
    }

    @C12579k
    /* renamed from: g */
    public final String mo117012g() {
        return this.f95528a;
    }

    public int hashCode() {
        return m156147h(this.f95528a);
    }

    /* renamed from: k */
    public final /* synthetic */ String mo117014k() {
        return this.f95528a;
    }

    public String toString() {
        return m156149j(this.f95528a);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        m156150l(this.f95528a, parcel, i);
    }
}
