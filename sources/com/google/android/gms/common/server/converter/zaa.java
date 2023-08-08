package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@SafeParcelable.C40812a(creator = "ConverterWrapperCreator")
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C40933a();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f104125a;
    @SafeParcelable.C40814c(getter = "getStringToIntConverter", mo134489id = 2)

    /* renamed from: b */
    public final StringToIntConverter f104126b;

    @SafeParcelable.C40813b
    public zaa(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) StringToIntConverter stringToIntConverter) {
        this.f104125a = i;
        this.f104126b = stringToIntConverter;
    }

    /* renamed from: M */
    public static zaa m166385M(FastJsonResponse.C40936a aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: Q */
    public final FastJsonResponse.C40936a mo134632Q() {
        StringToIntConverter stringToIntConverter = this.f104126b;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104125a);
        C40820a.m166102S(parcel, 2, this.f104126b, i, false);
        C40820a.m166112b(parcel, a);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f104125a = 1;
        this.f104126b = stringToIntConverter;
    }
}
