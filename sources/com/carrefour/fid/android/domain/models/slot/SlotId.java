package com.carrefour.fid.android.domain.models.slot;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.C11076d0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0001\u0018\u0001\u00020\u0002ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/SlotId;", "Landroid/os/Parcelable;", "", "i", "(Ljava/lang/String;)Ljava/lang/String;", "", "h", "(Ljava/lang/String;)I", "", "other", "", "e", "(Ljava/lang/String;Ljava/lang/Object;)Z", "d", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "k", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "id", "b", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11288f
@C12187d
public final class SlotId implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SlotId> CREATOR = new C38179a();
    @C12579k

    /* renamed from: a */
    public final String f96721a;

    /* renamed from: com.carrefour.fid.android.domain.models.slot.SlotId$a */
    public static final class C38179a implements Parcelable.Creator<SlotId> {
        @C12579k
        /* renamed from: a */
        public final String mo119544a(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SlotId.m158308b(parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final SlotId[] newArray(int i) {
            return new SlotId[i];
        }

        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return SlotId.m158307a(mo119544a(parcel));
        }
    }

    public /* synthetic */ SlotId(String str) {
        this.f96721a = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ SlotId m158307a(String str) {
        return new SlotId(str);
    }

    @C12579k
    /* renamed from: b */
    public static String m158308b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ String m158309c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            str = new String();
        }
        return m158308b(str);
    }

    /* renamed from: d */
    public static int m158310d(String str) {
        return 0;
    }

    /* renamed from: e */
    public static boolean m158311e(String str, Object obj) {
        return (obj instanceof SlotId) && Intrinsics.areEqual((Object) str, (Object) ((SlotId) obj).mo119541j());
    }

    /* renamed from: f */
    public static final boolean m158312f(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) str2);
    }

    /* renamed from: h */
    public static int m158313h(String str) {
        return str.hashCode();
    }

    /* renamed from: i */
    public static String m158314i(String str) {
        return "SlotId(id=" + str + ")";
    }

    /* renamed from: k */
    public static void m158315k(String str, @C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(str);
    }

    public int describeContents() {
        return m158310d(this.f96721a);
    }

    public boolean equals(Object obj) {
        return m158311e(this.f96721a, obj);
    }

    @C12579k
    /* renamed from: g */
    public final String mo119539g() {
        return this.f96721a;
    }

    public int hashCode() {
        return m158313h(this.f96721a);
    }

    /* renamed from: j */
    public final /* synthetic */ String mo119541j() {
        return this.f96721a;
    }

    public String toString() {
        return m158314i(this.f96721a);
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        m158315k(this.f96721a, parcel, i);
    }
}
