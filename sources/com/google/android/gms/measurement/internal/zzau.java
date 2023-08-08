package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.C40812a(creator = "EventParamsCreator")
@SafeParcelable.C40818g({1})
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new C30883t();
    @SafeParcelable.C40814c(getter = "z", mo134489id = 2)

    /* renamed from: a */
    public final Bundle f74162a;

    @SafeParcelable.C40813b
    public zzau(@SafeParcelable.C40816e(mo134492id = 2) Bundle bundle) {
        this.f74162a = bundle;
    }

    /* renamed from: M */
    public final int mo87633M() {
        return this.f74162a.size();
    }

    /* renamed from: W */
    public final Bundle mo87634W() {
        return new Bundle(this.f74162a);
    }

    /* renamed from: X */
    public final Double mo87635X(String str) {
        return Double.valueOf(this.f74162a.getDouble("value"));
    }

    /* renamed from: e0 */
    public final Long mo87636e0(String str) {
        return Long.valueOf(this.f74162a.getLong("value"));
    }

    /* renamed from: f0 */
    public final Object mo87637f0(String str) {
        return this.f74162a.get(str);
    }

    public final Iterator iterator() {
        return new C30871s(this);
    }

    /* renamed from: n0 */
    public final String mo87639n0(String str) {
        return this.f74162a.getString(str);
    }

    public final String toString() {
        return this.f74162a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166129k(parcel, 2, mo87634W(), false);
        C40820a.m166112b(parcel, a);
    }
}
