package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ImageMetadataParcelCreator")
public final class zzlq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlq> CREATOR = new C30080ha();
    @SafeParcelable.C40814c(getter = "getImageFormat", mo134489id = 1)

    /* renamed from: a */
    public final int f72632a;
    @SafeParcelable.C40814c(getter = "getWidth", mo134489id = 2)

    /* renamed from: b */
    public final int f72633b;
    @SafeParcelable.C40814c(getter = "getHeight", mo134489id = 3)

    /* renamed from: c */
    public final int f72634c;
    @SafeParcelable.C40814c(getter = "getRotation", mo134489id = 4)

    /* renamed from: d */
    public final int f72635d;
    @SafeParcelable.C40814c(getter = "getTimestampMs", mo134489id = 5)

    /* renamed from: e */
    public final long f72636e;

    @SafeParcelable.C40813b
    public zzlq(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) int i4, @SafeParcelable.C40816e(mo134492id = 5) long j) {
        this.f72632a = i;
        this.f72633b = i2;
        this.f72634c = i3;
        this.f72635d = i4;
        this.f72636e = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f72632a);
        C40820a.m166089F(parcel, 2, this.f72633b);
        C40820a.m166089F(parcel, 3, this.f72634c);
        C40820a.m166089F(parcel, 4, this.f72635d);
        C40820a.m166094K(parcel, 5, this.f72636e);
        C40820a.m166112b(parcel, a);
    }
}
