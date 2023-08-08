package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "CalendarDateTimeCreator")
@SafeParcelable.C40818g({1})
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C38662jb();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public int f98407a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public int f98408b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public int f98409c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public int f98410d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public int f98411e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public int f98412f;
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public boolean f98413g;
    @SafeParcelable.C40814c(mo134489id = 9)

    /* renamed from: v */
    public String f98414v;

    public zzf() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f98407a);
        C40820a.m166089F(parcel, 3, this.f98408b);
        C40820a.m166089F(parcel, 4, this.f98409c);
        C40820a.m166089F(parcel, 5, this.f98410d);
        C40820a.m166089F(parcel, 6, this.f98411e);
        C40820a.m166089F(parcel, 7, this.f98412f);
        C40820a.m166122g(parcel, 8, this.f98413g);
        C40820a.m166108Y(parcel, 9, this.f98414v, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzf(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) int i2, @SafeParcelable.C40816e(mo134492id = 4) int i3, @SafeParcelable.C40816e(mo134492id = 5) int i4, @SafeParcelable.C40816e(mo134492id = 6) int i5, @SafeParcelable.C40816e(mo134492id = 7) int i6, @SafeParcelable.C40816e(mo134492id = 8) boolean z, @SafeParcelable.C40816e(mo134492id = 9) String str) {
        this.f98407a = i;
        this.f98408b = i2;
        this.f98409c = i3;
        this.f98410d = i4;
        this.f98411e = i5;
        this.f98412f = i6;
        this.f98413g = z;
        this.f98414v = str;
    }
}
