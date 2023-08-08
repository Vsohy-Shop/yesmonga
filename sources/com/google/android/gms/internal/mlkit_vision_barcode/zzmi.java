package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "CalendarEventParcelCreator")
public final class zzmi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmi> CREATOR = new C38789ta();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSummary", mo134489id = 1)

    /* renamed from: a */
    public final String f98704a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getDescription", mo134489id = 2)

    /* renamed from: b */
    public final String f98705b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLocation", mo134489id = 3)

    /* renamed from: c */
    public final String f98706c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getOrganizer", mo134489id = 4)

    /* renamed from: d */
    public final String f98707d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStatus", mo134489id = 5)

    /* renamed from: e */
    public final String f98708e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStart", mo134489id = 6)

    /* renamed from: f */
    public final zzmh f98709f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getEnd", mo134489id = 7)

    /* renamed from: g */
    public final zzmh f98710g;

    @SafeParcelable.C40813b
    public zzmi(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str4, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) String str5, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) zzmh zzmh, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) zzmh zzmh2) {
        this.f98704a = str;
        this.f98705b = str2;
        this.f98706c = str3;
        this.f98707d = str4;
        this.f98708e = str5;
        this.f98709f = zzmh;
        this.f98710g = zzmh2;
    }

    @C0363p0
    /* renamed from: M */
    public final zzmh mo122679M() {
        return this.f98710g;
    }

    @C0363p0
    /* renamed from: Q */
    public final zzmh mo122680Q() {
        return this.f98709f;
    }

    @C0363p0
    /* renamed from: W */
    public final String mo122681W() {
        return this.f98705b;
    }

    @C0363p0
    /* renamed from: X */
    public final String mo122682X() {
        return this.f98706c;
    }

    @C0363p0
    /* renamed from: e0 */
    public final String mo122683e0() {
        return this.f98707d;
    }

    @C0363p0
    /* renamed from: f0 */
    public final String mo122684f0() {
        return this.f98708e;
    }

    @C0363p0
    /* renamed from: n0 */
    public final String mo122685n0() {
        return this.f98704a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f98704a, false);
        C40820a.m166108Y(parcel, 2, this.f98705b, false);
        C40820a.m166108Y(parcel, 3, this.f98706c, false);
        C40820a.m166108Y(parcel, 4, this.f98707d, false);
        C40820a.m166108Y(parcel, 5, this.f98708e, false);
        C40820a.m166102S(parcel, 6, this.f98709f, i, false);
        C40820a.m166102S(parcel, 7, this.f98710g, i, false);
        C40820a.m166112b(parcel, a);
    }
}
