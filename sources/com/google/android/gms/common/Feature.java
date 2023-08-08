package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40473a
@SafeParcelable.C40812a(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<Feature> CREATOR = new C40681c0();
    @SafeParcelable.C40814c(getter = "getName", mo134489id = 1)

    /* renamed from: a */
    public final String f103145a;
    @Deprecated
    @SafeParcelable.C40814c(getter = "getOldVersion", mo134489id = 2)

    /* renamed from: b */
    public final int f103146b;
    @SafeParcelable.C40814c(defaultValue = "-1", getter = "getVersion", mo134489id = 3)

    /* renamed from: c */
    public final long f103147c;

    @SafeParcelable.C40813b
    public Feature(@SafeParcelable.C40816e(mo134492id = 1) @C0359n0 String str, @SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) long j) {
        this.f103145a = str;
        this.f103146b = i;
        this.f103147c = j;
    }

    @C40473a
    @C0359n0
    /* renamed from: M */
    public String mo133601M() {
        return this.f103145a;
    }

    @C40473a
    /* renamed from: Q */
    public long mo133602Q() {
        long j = this.f103147c;
        return j == -1 ? (long) this.f103146b : j;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo133601M() == null || !mo133601M().equals(feature.mo133601M())) && (mo133601M() != null || feature.mo133601M() != null)) || mo133602Q() != feature.mo133602Q()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C40808s.m166011c(mo133601M(), Long.valueOf(mo133602Q()));
    }

    @C0359n0
    public final String toString() {
        C40808s.C40809a d = C40808s.m166012d(this);
        d.mo134475a("name", mo133601M());
        d.mo134475a("version", Long.valueOf(mo133602Q()));
        return d.toString();
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, mo133601M(), false);
        C40820a.m166089F(parcel, 2, this.f103146b);
        C40820a.m166094K(parcel, 3, mo133602Q());
        C40820a.m166112b(parcel, a);
    }

    @C40473a
    public Feature(@C0359n0 String str, long j) {
        this.f103145a = str;
        this.f103147c = j;
        this.f103146b = -1;
    }
}
