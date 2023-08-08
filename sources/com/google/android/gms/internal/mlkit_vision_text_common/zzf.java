package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "BoundingBoxParcelCreator")
@SafeParcelable.C40818g({1})
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new C30194r4();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final int f72419a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final int f72420b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final int f72421c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public final int f72422d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public final float f72423e;

    @SafeParcelable.C40813b
    public zzf(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) int i2, @SafeParcelable.C40816e(mo134492id = 4) int i3, @SafeParcelable.C40816e(mo134492id = 5) int i4, @SafeParcelable.C40816e(mo134492id = 6) float f) {
        this.f72419a = i;
        this.f72420b = i2;
        this.f72421c = i3;
        this.f72422d = i4;
        this.f72423e = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f72419a);
        C40820a.m166089F(parcel, 3, this.f72420b);
        C40820a.m166089F(parcel, 4, this.f72421c);
        C40820a.m166089F(parcel, 5, this.f72422d);
        C40820a.m166141w(parcel, 6, this.f72423e);
        C40820a.m166112b(parcel, a);
    }
}
