package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40473a
@SafeParcelable.C40812a(creator = "FavaDiagnosticsEntityCreator")
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C40932a();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f104119a;
    @C0359n0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final String f104120b;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public final int f104121c;

    @SafeParcelable.C40813b
    public FavaDiagnosticsEntity(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) @C0359n0 String str, @SafeParcelable.C40816e(mo134492id = 3) int i2) {
        this.f104119a = i;
        this.f104120b = str;
        this.f104121c = i2;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104119a);
        C40820a.m166108Y(parcel, 2, this.f104120b, false);
        C40820a.m166089F(parcel, 3, this.f104121c);
        C40820a.m166112b(parcel, a);
    }

    @C40473a
    public FavaDiagnosticsEntity(@C0359n0 String str, int i) {
        this.f104119a = 1;
        this.f104120b = str;
        this.f104121c = i;
    }
}
