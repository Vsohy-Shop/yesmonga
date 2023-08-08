package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "FrameMetadataParcelCreator")
@SafeParcelable.C40818g({1})
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C30180q2();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public int f72414a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public int f72415b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public int f72416c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public long f72417d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public int f72418e;

    public zzd() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f72414a);
        C40820a.m166089F(parcel, 3, this.f72415b);
        C40820a.m166089F(parcel, 4, this.f72416c);
        C40820a.m166094K(parcel, 5, this.f72417d);
        C40820a.m166089F(parcel, 6, this.f72418e);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzd(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) int i2, @SafeParcelable.C40816e(mo134492id = 4) int i3, @SafeParcelable.C40816e(mo134492id = 5) long j, @SafeParcelable.C40816e(mo134492id = 6) int i4) {
        this.f72414a = i;
        this.f72415b = i2;
        this.f72416c = i3;
        this.f72417d = j;
        this.f72418e = i4;
    }
}
