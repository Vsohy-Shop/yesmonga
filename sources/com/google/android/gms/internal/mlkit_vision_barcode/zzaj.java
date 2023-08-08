package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "FrameMetadataParcelCreator")
@SafeParcelable.C40818g({1})
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C38650j();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public int f98377a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public int f98378b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public int f98379c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public long f98380d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public int f98381e;

    public zzaj() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f98377a);
        C40820a.m166089F(parcel, 3, this.f98378b);
        C40820a.m166089F(parcel, 4, this.f98379c);
        C40820a.m166094K(parcel, 5, this.f98380d);
        C40820a.m166089F(parcel, 6, this.f98381e);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzaj(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) int i2, @SafeParcelable.C40816e(mo134492id = 4) int i3, @SafeParcelable.C40816e(mo134492id = 5) long j, @SafeParcelable.C40816e(mo134492id = 6) int i4) {
        this.f98377a = i;
        this.f98378b = i2;
        this.f98379c = i3;
        this.f98380d = j;
        this.f98381e = i4;
    }
}
