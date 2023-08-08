package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C40991q;
import java.io.IOException;

@SafeParcelable.C40812a(creator = "MapStyleOptionsCreator")
@SafeParcelable.C40818g({1})
public final class MapStyleOptions extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new C30603u();

    /* renamed from: b */
    public static final String f73036b = "MapStyleOptions";
    @SafeParcelable.C40814c(getter = "getJson", mo134489id = 2)

    /* renamed from: a */
    public String f73037a;

    @SafeParcelable.C40813b
    public MapStyleOptions(@SafeParcelable.C40816e(mo134492id = 2) @C0359n0 String str) {
        C40843u.m166203m(str, "json must not be null");
        this.f73037a = str;
    }

    @C0359n0
    /* renamed from: M */
    public static MapStyleOptions m123054M(@C0359n0 Context context, int i) throws Resources.NotFoundException {
        try {
            return new MapStyleOptions(new String(C40991q.m166668f(context.getResources().openRawResource(i)), "UTF-8"));
        } catch (IOException e) {
            String obj = e.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 37);
            sb.append("Failed to read resource ");
            sb.append(i);
            sb.append(": ");
            sb.append(obj);
            throw new Resources.NotFoundException(sb.toString());
        }
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f73037a, false);
        C40820a.m166112b(parcel, a);
    }
}
