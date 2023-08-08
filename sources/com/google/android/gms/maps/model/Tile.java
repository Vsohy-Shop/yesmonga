package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "TileCreator")
@SafeParcelable.C40818g({1})
public final class Tile extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<Tile> CREATOR = new C30584f0();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final int f73100a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final int f73101b;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final byte[] f73102c;

    @SafeParcelable.C40813b
    public Tile(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) byte[] bArr) {
        this.f73100a = i;
        this.f73101b = i2;
        this.f73102c = bArr;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f73100a);
        C40820a.m166089F(parcel, 3, this.f73101b);
        C40820a.m166131m(parcel, 4, this.f73102c, false);
        C40820a.m166112b(parcel, a);
    }
}
