package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "CalendarDateTimeParcelCreator")
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new C38777sa();
    @SafeParcelable.C40814c(getter = "getYear", mo134489id = 1)

    /* renamed from: a */
    public final int f98696a;
    @SafeParcelable.C40814c(getter = "getMonth", mo134489id = 2)

    /* renamed from: b */
    public final int f98697b;
    @SafeParcelable.C40814c(getter = "getDay", mo134489id = 3)

    /* renamed from: c */
    public final int f98698c;
    @SafeParcelable.C40814c(getter = "getHours", mo134489id = 4)

    /* renamed from: d */
    public final int f98699d;
    @SafeParcelable.C40814c(getter = "getMinutes", mo134489id = 5)

    /* renamed from: e */
    public final int f98700e;
    @SafeParcelable.C40814c(getter = "getSeconds", mo134489id = 6)

    /* renamed from: f */
    public final int f98701f;
    @SafeParcelable.C40814c(getter = "isUtc", mo134489id = 7)

    /* renamed from: g */
    public final boolean f98702g;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getRawValue", mo134489id = 8)

    /* renamed from: v */
    public final String f98703v;

    @SafeParcelable.C40813b
    public zzmh(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) int i4, @SafeParcelable.C40816e(mo134492id = 5) int i5, @SafeParcelable.C40816e(mo134492id = 6) int i6, @SafeParcelable.C40816e(mo134492id = 7) boolean z, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) String str) {
        this.f98696a = i;
        this.f98697b = i2;
        this.f98698c = i3;
        this.f98699d = i4;
        this.f98700e = i5;
        this.f98701f = i6;
        this.f98702g = z;
        this.f98703v = str;
    }

    /* renamed from: M */
    public final int mo122670M() {
        return this.f98698c;
    }

    /* renamed from: Q */
    public final int mo122671Q() {
        return this.f98699d;
    }

    /* renamed from: W */
    public final int mo122672W() {
        return this.f98700e;
    }

    /* renamed from: X */
    public final int mo122673X() {
        return this.f98697b;
    }

    /* renamed from: e0 */
    public final int mo122674e0() {
        return this.f98701f;
    }

    /* renamed from: f0 */
    public final int mo122675f0() {
        return this.f98696a;
    }

    @C0363p0
    /* renamed from: n0 */
    public final String mo122676n0() {
        return this.f98703v;
    }

    /* renamed from: p0 */
    public final boolean mo122677p0() {
        return this.f98702g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98696a);
        C40820a.m166089F(parcel, 2, this.f98697b);
        C40820a.m166089F(parcel, 3, this.f98698c);
        C40820a.m166089F(parcel, 4, this.f98699d);
        C40820a.m166089F(parcel, 5, this.f98700e);
        C40820a.m166089F(parcel, 6, this.f98701f);
        C40820a.m166122g(parcel, 7, this.f98702g);
        C40820a.m166108Y(parcel, 8, this.f98703v, false);
        C40820a.m166112b(parcel, a);
    }
}
