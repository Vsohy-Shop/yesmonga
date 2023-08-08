package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ImageMetadataParcelCreator")
public final class zbro extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbro> CREATOR = new C29496mt();
    @SafeParcelable.C40814c(getter = "getImageFormat", mo134489id = 1)

    /* renamed from: a */
    public final int f71605a;
    @SafeParcelable.C40814c(getter = "getWidth", mo134489id = 2)

    /* renamed from: b */
    public final int f71606b;
    @SafeParcelable.C40814c(getter = "getHeight", mo134489id = 3)

    /* renamed from: c */
    public final int f71607c;
    @SafeParcelable.C40814c(getter = "getRotation", mo134489id = 4)

    /* renamed from: d */
    public final int f71608d;
    @SafeParcelable.C40814c(getter = "getTimestampMs", mo134489id = 5)

    /* renamed from: e */
    public final long f71609e;

    @SafeParcelable.C40813b
    public zbro(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) int i4, @SafeParcelable.C40816e(mo134492id = 5) long j) {
        this.f71605a = i;
        this.f71606b = i2;
        this.f71607c = i3;
        this.f71608d = i4;
        this.f71609e = j;
    }

    /* renamed from: M */
    public final int mo84975M() {
        return this.f71607c;
    }

    /* renamed from: Q */
    public final int mo84976Q() {
        return this.f71605a;
    }

    /* renamed from: W */
    public final int mo84977W() {
        return this.f71608d;
    }

    /* renamed from: X */
    public final int mo84978X() {
        return this.f71606b;
    }

    /* renamed from: e0 */
    public final long mo84979e0() {
        return this.f71609e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f71605a);
        C40820a.m166089F(parcel, 2, this.f71606b);
        C40820a.m166089F(parcel, 3, this.f71607c);
        C40820a.m166089F(parcel, 4, this.f71608d);
        C40820a.m166094K(parcel, 5, this.f71609e);
        C40820a.m166112b(parcel, a);
    }
}
