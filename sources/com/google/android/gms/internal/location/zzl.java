package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.C30377q0;
import com.google.android.gms.location.C30380r0;

@SafeParcelable.C40812a(creator = "DeviceOrientationRequestUpdateDataCreator")
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C41810y0();
    @SafeParcelable.C40814c(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", mo134489id = 1)

    /* renamed from: a */
    public final int f105976a;
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", mo134489id = 2)

    /* renamed from: b */
    public final zzj f105977b;
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", getter = "getDeviceOrientationListenerBinder", mo134489id = 3, type = "android.os.IBinder")

    /* renamed from: c */
    public final C30380r0 f105978c;
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", mo134489id = 4, type = "android.os.IBinder")

    /* renamed from: d */
    public final C41773i f105979d;

    @SafeParcelable.C40813b
    public zzl(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) zzj zzj, @SafeParcelable.C40816e(mo134492id = 3) IBinder iBinder, @SafeParcelable.C40816e(mo134492id = 4) IBinder iBinder2) {
        C30380r0 r0Var;
        this.f105976a = i;
        this.f105977b = zzj;
        C41773i iVar = null;
        if (iBinder == null) {
            r0Var = null;
        } else {
            r0Var = C30377q0.m122203H0(iBinder);
        }
        this.f105978c = r0Var;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof C41773i) {
                iVar = (C41773i) queryLocalInterface;
            } else {
                iVar = new C41767g(iBinder2);
            }
        }
        this.f105979d = iVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f105976a);
        C40820a.m166102S(parcel, 2, this.f105977b, i, false);
        C30380r0 r0Var = this.f105978c;
        IBinder iBinder2 = null;
        if (r0Var == null) {
            iBinder = null;
        } else {
            iBinder = r0Var.asBinder();
        }
        C40820a.m166085B(parcel, 3, iBinder, false);
        C41773i iVar = this.f105979d;
        if (iVar != null) {
            iBinder2 = iVar.asBinder();
        }
        C40820a.m166085B(parcel, 4, iBinder2, false);
        C40820a.m166112b(parcel, a);
    }
}
