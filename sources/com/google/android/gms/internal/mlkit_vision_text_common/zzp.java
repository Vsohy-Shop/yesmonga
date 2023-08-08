package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40858y
@SafeParcelable.C40812a(creator = "TextRecognizerOptionsCreator")
@SafeParcelable.C40818g({1})
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C30212sa();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCustomModelsDir", mo134489id = 2)

    /* renamed from: a */
    public final String f72653a;

    public zzp() {
        this.f72653a = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f72653a, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzp(@C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str) {
        this.f72653a = str;
    }
}
