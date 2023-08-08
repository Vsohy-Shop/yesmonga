package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ImageMetadataParcelCreator")
public final class zznl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznl> CREATOR = new C38636hb();
    @SafeParcelable.C40814c(getter = "getImageFormat", mo134489id = 1)

    /* renamed from: a */
    public final int f98772a;
    @SafeParcelable.C40814c(getter = "getWidth", mo134489id = 2)

    /* renamed from: b */
    public final int f98773b;
    @SafeParcelable.C40814c(getter = "getHeight", mo134489id = 3)

    /* renamed from: c */
    public final int f98774c;
    @SafeParcelable.C40814c(getter = "getRotation", mo134489id = 4)

    /* renamed from: d */
    public final int f98775d;
    @SafeParcelable.C40814c(getter = "getTimestampMs", mo134489id = 5)

    /* renamed from: e */
    public final long f98776e;

    @SafeParcelable.C40813b
    public zznl(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) int i4, @SafeParcelable.C40816e(mo134492id = 5) long j) {
        this.f98772a = i;
        this.f98773b = i2;
        this.f98774c = i3;
        this.f98775d = i4;
        this.f98776e = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98772a);
        C40820a.m166089F(parcel, 2, this.f98773b);
        C40820a.m166089F(parcel, 3, this.f98774c);
        C40820a.m166089F(parcel, 4, this.f98775d);
        C40820a.m166094K(parcel, 5, this.f98776e);
        C40820a.m166112b(parcel, a);
    }
}
