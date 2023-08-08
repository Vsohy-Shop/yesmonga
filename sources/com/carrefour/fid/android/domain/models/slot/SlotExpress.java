package com.carrefour.fid.android.domain.models.slot;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/SlotExpress;", "Landroid/os/Parcelable;", "", "a", "Ljava/util/Date;", "b", "c", "id", "startDate", "endDate", "d", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Ljava/util/Date;", "h", "()Ljava/util/Date;", "f", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class SlotExpress implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SlotExpress> CREATOR = new C38178a();
    @C12580l

    /* renamed from: a */
    public final String f96718a;
    @C12580l

    /* renamed from: b */
    public final Date f96719b;
    @C12580l

    /* renamed from: c */
    public final Date f96720c;

    /* renamed from: com.carrefour.fid.android.domain.models.slot.SlotExpress$a */
    public static final class C38178a implements Parcelable.Creator<SlotExpress> {
        @C12579k
        /* renamed from: a */
        public final SlotExpress createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotExpress(parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @C12579k
        /* renamed from: b */
        public final SlotExpress[] newArray(int i) {
            return new SlotExpress[i];
        }
    }

    public SlotExpress() {
        this((String) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static /* synthetic */ SlotExpress m158297e(SlotExpress slotExpress, String str, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotExpress.f96718a;
        }
        if ((i & 2) != 0) {
            date = slotExpress.f96719b;
        }
        if ((i & 4) != 0) {
            date2 = slotExpress.f96720c;
        }
        return slotExpress.mo119524d(str, date, date2);
    }

    @C12580l
    /* renamed from: a */
    public final String mo119521a() {
        return this.f96718a;
    }

    @C12580l
    /* renamed from: b */
    public final Date mo119522b() {
        return this.f96719b;
    }

    @C12580l
    /* renamed from: c */
    public final Date mo119523c() {
        return this.f96720c;
    }

    @C12579k
    /* renamed from: d */
    public final SlotExpress mo119524d(@C12580l String str, @C12580l Date date, @C12580l Date date2) {
        return new SlotExpress(str, date, date2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotExpress)) {
            return false;
        }
        SlotExpress slotExpress = (SlotExpress) obj;
        return Intrinsics.areEqual((Object) this.f96718a, (Object) slotExpress.f96718a) && Intrinsics.areEqual((Object) this.f96719b, (Object) slotExpress.f96719b) && Intrinsics.areEqual((Object) this.f96720c, (Object) slotExpress.f96720c);
    }

    @C12580l
    /* renamed from: f */
    public final Date mo119527f() {
        return this.f96720c;
    }

    @C12580l
    /* renamed from: g */
    public final String mo119528g() {
        return this.f96718a;
    }

    @C12580l
    /* renamed from: h */
    public final Date mo119529h() {
        return this.f96719b;
    }

    public int hashCode() {
        String str = this.f96718a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f96719b;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f96720c;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.f96718a;
        Date date = this.f96719b;
        Date date2 = this.f96720c;
        return "SlotExpress(id=" + str + ", startDate=" + date + ", endDate=" + date2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f96718a);
        parcel.writeSerializable(this.f96719b);
        parcel.writeSerializable(this.f96720c);
    }

    public SlotExpress(@C12580l String str, @C12580l Date date, @C12580l Date date2) {
        this.f96718a = str;
        this.f96719b = date;
        this.f96720c = date2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotExpress(String str, Date date, Date date2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : date2);
    }
}
