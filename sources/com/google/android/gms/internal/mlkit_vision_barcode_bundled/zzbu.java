package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ImageMetadataParcelCreator")
public final class zzbu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbu> CREATOR = new C38943i0();
    @SafeParcelable.C40814c(getter = "getImageFormat", mo134489id = 1)

    /* renamed from: a */
    public final int f99072a;
    @SafeParcelable.C40814c(getter = "getWidth", mo134489id = 2)

    /* renamed from: b */
    public final int f99073b;
    @SafeParcelable.C40814c(getter = "getHeight", mo134489id = 3)

    /* renamed from: c */
    public final int f99074c;
    @SafeParcelable.C40814c(getter = "getRotation", mo134489id = 4)

    /* renamed from: d */
    public final int f99075d;
    @SafeParcelable.C40814c(getter = "getTimestampMs", mo134489id = 5)

    /* renamed from: e */
    public final long f99076e;

    @SafeParcelable.C40813b
    public zzbu(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) int i4, @SafeParcelable.C40816e(mo134492id = 5) long j) {
        this.f99072a = i;
        this.f99073b = i2;
        this.f99074c = i3;
        this.f99075d = i4;
        this.f99076e = j;
    }

    /* renamed from: M */
    public final int mo123177M() {
        return this.f99074c;
    }

    /* renamed from: Q */
    public final int mo123178Q() {
        return this.f99072a;
    }

    /* renamed from: W */
    public final int mo123179W() {
        return this.f99075d;
    }

    /* renamed from: X */
    public final int mo123180X() {
        return this.f99073b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f99072a);
        C40820a.m166089F(parcel, 2, this.f99073b);
        C40820a.m166089F(parcel, 3, this.f99074c);
        C40820a.m166089F(parcel, 4, this.f99075d);
        C40820a.m166094K(parcel, 5, this.f99076e);
        C40820a.m166112b(parcel, a);
    }
}
