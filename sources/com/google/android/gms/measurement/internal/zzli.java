package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "UserAttributeParcelCreator")
public final class zzli extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzli> CREATOR = new C30858qa();
    @SafeParcelable.C40814c(mo134489id = 1)

    /* renamed from: a */
    public final int f74167a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final String f74168b;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public final long f74169c;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: d */
    public final Long f74170d;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public final String f74171e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public final String f74172f;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public final Double f74173g;

    @SafeParcelable.C40813b
    public zzli(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) long j, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) Long l, @SafeParcelable.C40816e(mo134492id = 5) Float f, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String str2, @SafeParcelable.C40816e(mo134492id = 7) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) Double d) {
        this.f74167a = i;
        this.f74168b = str;
        this.f74169c = j;
        this.f74170d = l;
        if (i == 1) {
            this.f74173g = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f74173g = d;
        }
        this.f74171e = str2;
        this.f74172f = str3;
    }

    @C0363p0
    /* renamed from: M */
    public final Object mo87644M() {
        Long l = this.f74170d;
        if (l != null) {
            return l;
        }
        Double d = this.f74173g;
        if (d != null) {
            return d;
        }
        String str = this.f74171e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C30858qa.m124152a(this, parcel, i);
    }

    public zzli(C30870ra raVar) {
        this(raVar.f73924c, raVar.f73925d, raVar.f73926e, raVar.f73923b);
    }

    public zzli(String str, long j, @C0363p0 Object obj, String str2) {
        C40843u.m166198h(str);
        this.f74167a = 2;
        this.f74168b = str;
        this.f74169c = j;
        this.f74172f = str2;
        if (obj == null) {
            this.f74170d = null;
            this.f74173g = null;
            this.f74171e = null;
        } else if (obj instanceof Long) {
            this.f74170d = (Long) obj;
            this.f74173g = null;
            this.f74171e = null;
        } else if (obj instanceof String) {
            this.f74170d = null;
            this.f74173g = null;
            this.f74171e = (String) obj;
        } else if (obj instanceof Double) {
            this.f74170d = null;
            this.f74173g = (Double) obj;
            this.f74171e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
