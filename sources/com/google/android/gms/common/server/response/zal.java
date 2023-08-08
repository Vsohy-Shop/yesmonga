package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

@C40858y
@SafeParcelable.C40812a(creator = "FieldMappingDictionaryEntryCreator")
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C40949m();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f104168a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final String f104169b;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public final ArrayList f104170c;

    @SafeParcelable.C40813b
    public zal(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) ArrayList arrayList) {
        this.f104168a = i;
        this.f104169b = str;
        this.f104170c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104168a);
        C40820a.m166108Y(parcel, 2, this.f104169b, false);
        C40820a.m166117d0(parcel, 3, this.f104170c, false);
        C40820a.m166112b(parcel, a);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f104168a = 1;
        this.f104169b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f104170c = arrayList;
    }
}
