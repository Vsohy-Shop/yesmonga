package com.carrefour.fid.android.domain.models.basket;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.slot.SlotId;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B<\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005ø\u0001\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010\u0003\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003JH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0013HÖ\u0001R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0004R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\u0004R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b%\u0010\u0004\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/basket/BasketSlot;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/domain/models/slot/SlotId;", "a", "()Ljava/lang/String;", "", "b", "c", "", "d", "e", "ref", "beginDate", "endDate", "isBooked", "sliceId", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/carrefour/fid/android/domain/models/basket/BasketSlot;", "toString", "", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "j", "h", "i", "Z", "l", "()Z", "k", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class BasketSlot implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<BasketSlot> CREATOR = new C37965a();
    @C12579k

    /* renamed from: a */
    public final String f95515a;
    @C12579k

    /* renamed from: b */
    public final String f95516b;
    @C12579k

    /* renamed from: c */
    public final String f95517c;

    /* renamed from: d */
    public final boolean f95518d;
    @C12579k

    /* renamed from: e */
    public final String f95519e;

    /* renamed from: com.carrefour.fid.android.domain.models.basket.BasketSlot$a */
    public static final class C37965a implements Parcelable.Creator<BasketSlot> {
        @C12579k
        /* renamed from: a */
        public final BasketSlot createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BasketSlot(SlotId.CREATOR.createFromParcel(parcel).mo119541j(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: b */
        public final BasketSlot[] newArray(int i) {
            return new BasketSlot[i];
        }
    }

    public /* synthetic */ BasketSlot(String str, String str2, String str3, boolean z, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, str4);
    }

    /* renamed from: g */
    public static /* synthetic */ BasketSlot m156124g(BasketSlot basketSlot, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basketSlot.f95515a;
        }
        if ((i & 2) != 0) {
            str2 = basketSlot.f95516b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = basketSlot.f95517c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = basketSlot.f95518d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = basketSlot.f95519e;
        }
        return basketSlot.mo116995f(str, str5, str6, z2, str4);
    }

    @C12579k
    /* renamed from: a */
    public final String mo116988a() {
        return this.f95515a;
    }

    @C12579k
    /* renamed from: b */
    public final String mo116989b() {
        return this.f95516b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo116990c() {
        return this.f95517c;
    }

    /* renamed from: d */
    public final boolean mo116991d() {
        return this.f95518d;
    }

    public int describeContents() {
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final String mo116993e() {
        return this.f95519e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketSlot)) {
            return false;
        }
        BasketSlot basketSlot = (BasketSlot) obj;
        return SlotId.m158312f(this.f95515a, basketSlot.f95515a) && Intrinsics.areEqual((Object) this.f95516b, (Object) basketSlot.f95516b) && Intrinsics.areEqual((Object) this.f95517c, (Object) basketSlot.f95517c) && this.f95518d == basketSlot.f95518d && Intrinsics.areEqual((Object) this.f95519e, (Object) basketSlot.f95519e);
    }

    @C12579k
    /* renamed from: f */
    public final BasketSlot mo116995f(@C12579k String str, @C12579k String str2, @C12579k String str3, boolean z, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "ref");
        Intrinsics.checkNotNullParameter(str2, "beginDate");
        Intrinsics.checkNotNullParameter(str3, "endDate");
        Intrinsics.checkNotNullParameter(str4, "sliceId");
        return new BasketSlot(str, str2, str3, z, str4, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: h */
    public final String mo116996h() {
        return this.f95516b;
    }

    public int hashCode() {
        int h = ((((SlotId.m158313h(this.f95515a) * 31) + this.f95516b.hashCode()) * 31) + this.f95517c.hashCode()) * 31;
        boolean z = this.f95518d;
        if (z) {
            z = true;
        }
        return ((h + (z ? 1 : 0)) * 31) + this.f95519e.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final String mo116998i() {
        return this.f95517c;
    }

    @C12579k
    /* renamed from: j */
    public final String mo116999j() {
        return this.f95515a;
    }

    @C12579k
    /* renamed from: k */
    public final String mo117000k() {
        return this.f95519e;
    }

    /* renamed from: l */
    public final boolean mo117001l() {
        return this.f95518d;
    }

    @C12579k
    public String toString() {
        String i = SlotId.m158314i(this.f95515a);
        String str = this.f95516b;
        String str2 = this.f95517c;
        boolean z = this.f95518d;
        String str3 = this.f95519e;
        return "BasketSlot(ref=" + i + ", beginDate=" + str + ", endDate=" + str2 + ", isBooked=" + z + ", sliceId=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        SlotId.m158315k(this.f95515a, parcel, i);
        parcel.writeString(this.f95516b);
        parcel.writeString(this.f95517c);
        parcel.writeInt(this.f95518d ? 1 : 0);
        parcel.writeString(this.f95519e);
    }

    public BasketSlot(String str, String str2, String str3, boolean z, String str4) {
        Intrinsics.checkNotNullParameter(str, "ref");
        Intrinsics.checkNotNullParameter(str2, "beginDate");
        Intrinsics.checkNotNullParameter(str3, "endDate");
        Intrinsics.checkNotNullParameter(str4, "sliceId");
        this.f95515a = str;
        this.f95516b = str2;
        this.f95517c = str3;
        this.f95518d = z;
        this.f95519e = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketSlot(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SlotId.m158309c((String) null, 1, (DefaultConstructorMarker) null) : str, (i & 2) != 0 ? new String() : str2, (i & 4) != 0 ? new String() : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new String() : str4, (DefaultConstructorMarker) null);
    }
}
