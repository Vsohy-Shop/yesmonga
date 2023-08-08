package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.errorprone.annotations.C32488a;
import java.util.ArrayList;
import java.util.HashMap;

@C40473a
@SafeParcelable.C40812a(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C40936a<String, Integer> {
    @C0359n0
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C40934b();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f104122a;

    /* renamed from: b */
    public final HashMap f104123b;

    /* renamed from: c */
    public final SparseArray f104124c;

    @C40473a
    public StringToIntConverter() {
        this.f104122a = 1;
        this.f104123b = new HashMap();
        this.f104124c = new SparseArray();
    }

    @C40473a
    @C0359n0
    @C32488a
    /* renamed from: M */
    public StringToIntConverter mo134620M(@C0359n0 String str, int i) {
        this.f104123b.put(str, Integer.valueOf(i));
        this.f104124c.put(i, str);
        return this;
    }

    /* renamed from: i */
    public final int mo134621i() {
        return 7;
    }

    /* renamed from: k */
    public final int mo134622k() {
        return 0;
    }

    @C0359n0
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ Object mo134623q(@C0359n0 Object obj) {
        String str = (String) this.f104124c.get(((Integer) obj).intValue());
        if (str != null || !this.f104123b.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    @C0363p0
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ Object mo134624r(@C0359n0 Object obj) {
        Integer num = (Integer) this.f104123b.get((String) obj);
        if (num == null) {
            return (Integer) this.f104123b.get("gms_unknown");
        }
        return num;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104122a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f104123b.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f104123b.get(str)).intValue()));
        }
        C40820a.m166117d0(parcel, 2, arrayList, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public StringToIntConverter(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) ArrayList arrayList) {
        this.f104122a = i;
        this.f104123b = new HashMap();
        this.f104124c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = (zac) arrayList.get(i2);
            mo134620M(zac.f104128b, zac.f104129c);
        }
    }
}
