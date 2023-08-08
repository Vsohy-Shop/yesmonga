package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40473a
@SafeParcelable.C40812a(creator = "VisionImageMetadataParcelCreator")
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new C34047n();
    @C40473a
    @SafeParcelable.C40814c(mo134489id = 1)

    /* renamed from: a */
    public final int f82666a;
    @C40473a
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final int f82667b;
    @C40473a
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final long f82668c;
    @C40473a
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public final int f82669d;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: e */
    public final int f82670e;

    @SafeParcelable.C40813b
    public VisionImageMetadataParcel(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @SafeParcelable.C40816e(mo134492id = 4) long j, @SafeParcelable.C40816e(mo134492id = 5) int i4) {
        this.f82666a = i;
        this.f82667b = i2;
        this.f82670e = i3;
        this.f82668c = j;
        this.f82669d = i4;
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: M */
    public Matrix mo98977M() {
        return C34036f.m136944b().mo98991e(this.f82666a, this.f82667b, this.f82669d);
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f82666a);
        C40820a.m166089F(parcel, 2, this.f82667b);
        C40820a.m166089F(parcel, 3, this.f82670e);
        C40820a.m166094K(parcel, 4, this.f82668c);
        C40820a.m166089F(parcel, 5, this.f82669d);
        C40820a.m166112b(parcel, a);
    }
}
