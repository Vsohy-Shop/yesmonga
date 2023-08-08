package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "CalendarDateTimeParcelCreator")
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new C39036s();
    @SafeParcelable.C40814c(getter = "getYear", mo134489id = 1)

    /* renamed from: a */
    public final int f98998a;
    @SafeParcelable.C40814c(getter = "getMonth", mo134489id = 2)

    /* renamed from: b */
    public final int f98999b;
    @SafeParcelable.C40814c(getter = "getDay", mo134489id = 3)

    /* renamed from: c */
    public final int f99000c;
    @SafeParcelable.C40814c(getter = "getHours", mo134489id = 4)

    /* renamed from: d */
    public final int f99001d;
    @SafeParcelable.C40814c(getter = "getMinutes", mo134489id = 5)

    /* renamed from: e */
    public final int f99002e;
    @SafeParcelable.C40814c(getter = "getSeconds", mo134489id = 6)

    /* renamed from: f */
    public final int f99003f;
    @SafeParcelable.C40814c(getter = "isUtc", mo134489id = 7)

    /* renamed from: g */
    public final boolean f99004g;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getRawValue", mo134489id = 8)

    /* renamed from: v */
    public final String f99005v;

    @SafeParcelable.C40813b
    public zzap(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) int i4, @SafeParcelable.C40816e(mo134492id = 5) int i5, @SafeParcelable.C40816e(mo134492id = 6) int i6, @SafeParcelable.C40816e(mo134492id = 7) boolean z, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) String str) {
        this.f98998a = i;
        this.f98999b = i2;
        this.f99000c = i3;
        this.f99001d = i4;
        this.f99002e = i5;
        this.f99003f = i6;
        this.f99004g = z;
        this.f99005v = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98998a);
        C40820a.m166089F(parcel, 2, this.f98999b);
        C40820a.m166089F(parcel, 3, this.f99000c);
        C40820a.m166089F(parcel, 4, this.f99001d);
        C40820a.m166089F(parcel, 5, this.f99002e);
        C40820a.m166089F(parcel, 6, this.f99003f);
        C40820a.m166122g(parcel, 7, this.f99004g);
        C40820a.m166108Y(parcel, 8, this.f99005v, false);
        C40820a.m166112b(parcel, a);
    }
}
