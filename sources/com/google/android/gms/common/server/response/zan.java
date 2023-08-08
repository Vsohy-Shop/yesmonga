package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@C40858y
@SafeParcelable.C40812a(creator = "FieldMappingDictionaryCreator")
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C40948l();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f104174a;

    /* renamed from: b */
    public final HashMap f104175b;
    @SafeParcelable.C40814c(getter = "getRootClassName", mo134489id = 3)

    /* renamed from: c */
    public final String f104176c;

    @SafeParcelable.C40813b
    public zan(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) ArrayList arrayList, @SafeParcelable.C40816e(mo134492id = 3) String str) {
        this.f104174a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.f104169b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) C40843u.m166202l(zal.f104170c)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.f104170c.get(i3);
                hashMap2.put(zam.f104172b, zam.f104173c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f104175b = hashMap;
        this.f104176c = (String) C40843u.m166202l(str);
        mo134735X();
    }

    /* renamed from: M */
    public final String mo134732M() {
        return this.f104176c;
    }

    @C0363p0
    /* renamed from: Q */
    public final Map mo134733Q(String str) {
        return (Map) this.f104175b.get(str);
    }

    /* renamed from: W */
    public final void mo134734W() {
        for (String str : this.f104175b.keySet()) {
            Map map = (Map) this.f104175b.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, ((FastJsonResponse.Field) map.get(str2)).mo134689k1());
            }
            this.f104175b.put(str, hashMap);
        }
    }

    /* renamed from: X */
    public final void mo134735X() {
        for (String str : this.f104175b.keySet()) {
            Map map = (Map) this.f104175b.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo134686c2(this);
            }
        }
    }

    /* renamed from: e0 */
    public final void mo134736e0(Class cls, Map map) {
        this.f104175b.put((String) C40843u.m166202l(cls.getCanonicalName()), map);
    }

    /* renamed from: f0 */
    public final boolean mo134737f0(Class cls) {
        return this.f104175b.containsKey(C40843u.m166202l(cls.getCanonicalName()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f104175b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f104175b.get(str);
            for (String str2 : map.keySet()) {
                sb.append(GlideException.C22148a.f56917d);
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104174a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f104175b.keySet()) {
            arrayList.add(new zal(str, (Map) this.f104175b.get(str)));
        }
        C40820a.m166117d0(parcel, 2, arrayList, false);
        C40820a.m166108Y(parcel, 3, this.f104176c, false);
        C40820a.m166112b(parcel, a);
    }

    public zan(Class cls) {
        this.f104174a = 1;
        this.f104175b = new HashMap();
        this.f104176c = (String) C40843u.m166202l(cls.getCanonicalName());
    }
}
