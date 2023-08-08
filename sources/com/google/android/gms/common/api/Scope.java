package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @C0359n0
    public static final Parcelable.Creator<Scope> CREATOR = new C40500e0();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103180a;
    @SafeParcelable.C40814c(getter = "getScopeUri", mo134489id = 2)

    /* renamed from: b */
    public final String f103181b;

    @SafeParcelable.C40813b
    public Scope(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) String str) {
        C40843u.m166199i(str, "scopeUri must not be null or empty");
        this.f103180a = i;
        this.f103181b = str;
    }

    @C40473a
    @C0359n0
    /* renamed from: M */
    public String mo133640M() {
        return this.f103181b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f103181b.equals(((Scope) obj).f103181b);
    }

    public int hashCode() {
        return this.f103181b.hashCode();
    }

    @C0359n0
    public String toString() {
        return this.f103181b;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103180a);
        C40820a.m166108Y(parcel, 2, mo133640M(), false);
        C40820a.m166112b(parcel, a);
    }

    public Scope(@C0359n0 String str) {
        this(1, str);
    }
}
