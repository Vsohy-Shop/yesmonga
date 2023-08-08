package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.C30386t0;
import com.google.android.gms.location.C30392v0;
import com.google.android.gms.location.C30398x0;
import com.google.android.gms.location.C30401y0;

@SafeParcelable.C40812a(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.C40818g({1000})
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new C41756c0();
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", mo134489id = 1)

    /* renamed from: a */
    public final int f105949a;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 2)

    /* renamed from: b */
    public final zzba f105950b;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", getter = "getLocationListenerBinder", mo134489id = 3, type = "android.os.IBinder")

    /* renamed from: c */
    public final C30401y0 f105951c;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 4)

    /* renamed from: d */
    public final PendingIntent f105952d;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", getter = "getLocationCallbackBinder", mo134489id = 5, type = "android.os.IBinder")

    /* renamed from: e */
    public final C30392v0 f105953e;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", mo134489id = 6, type = "android.os.IBinder")

    /* renamed from: f */
    public final C41773i f105954f;

    @SafeParcelable.C40813b
    public zzbc(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) zzba zzba, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) IBinder iBinder, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) PendingIntent pendingIntent, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) IBinder iBinder2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) IBinder iBinder3) {
        C30401y0 y0Var;
        C30392v0 v0Var;
        this.f105949a = i;
        this.f105950b = zzba;
        C41773i iVar = null;
        if (iBinder == null) {
            y0Var = null;
        } else {
            y0Var = C30398x0.m122227H0(iBinder);
        }
        this.f105951c = y0Var;
        this.f105952d = pendingIntent;
        if (iBinder2 == null) {
            v0Var = null;
        } else {
            v0Var = C30386t0.m122213H0(iBinder2);
        }
        this.f105953e = v0Var;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof C41773i) {
                iVar = (C41773i) queryLocalInterface;
            } else {
                iVar = new C41767g(iBinder3);
            }
        }
        this.f105954f = iVar;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc m169195M(com.google.android.gms.location.C30401y0 r8, @androidx.annotation.C0363p0 com.google.android.gms.internal.location.C41773i r9) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            if (r9 != 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r6 = r9
            r1 = 2
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.m169195M(com.google.android.gms.location.y0, com.google.android.gms.internal.location.i):com.google.android.gms.internal.location.zzbc");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc m169196Q(com.google.android.gms.internal.location.zzba r8, android.app.PendingIntent r9, @androidx.annotation.C0363p0 com.google.android.gms.internal.location.C41773i r10) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            r1 = 1
            r3 = 0
            r5 = 0
            r0 = r7
            r2 = r8
            r4 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.m169196Q(com.google.android.gms.internal.location.zzba, android.app.PendingIntent, com.google.android.gms.internal.location.i):com.google.android.gms.internal.location.zzbc");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r5v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.location.zzbc m169197W(com.google.android.gms.location.C30392v0 r8, @androidx.annotation.C0363p0 com.google.android.gms.internal.location.C41773i r9) {
        /*
            com.google.android.gms.internal.location.zzbc r7 = new com.google.android.gms.internal.location.zzbc
            if (r9 != 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r6 = r9
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzbc.m169197W(com.google.android.gms.location.v0, com.google.android.gms.internal.location.i):com.google.android.gms.internal.location.zzbc");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f105949a);
        C40820a.m166102S(parcel, 2, this.f105950b, i, false);
        C30401y0 y0Var = this.f105951c;
        IBinder iBinder3 = null;
        if (y0Var == null) {
            iBinder = null;
        } else {
            iBinder = y0Var.asBinder();
        }
        C40820a.m166085B(parcel, 3, iBinder, false);
        C40820a.m166102S(parcel, 4, this.f105952d, i, false);
        C30392v0 v0Var = this.f105953e;
        if (v0Var == null) {
            iBinder2 = null;
        } else {
            iBinder2 = v0Var.asBinder();
        }
        C40820a.m166085B(parcel, 5, iBinder2, false);
        C41773i iVar = this.f105954f;
        if (iVar != null) {
            iBinder3 = iVar.asBinder();
        }
        C40820a.m166085B(parcel, 6, iBinder3, false);
        C40820a.m166112b(parcel, a);
    }
}
