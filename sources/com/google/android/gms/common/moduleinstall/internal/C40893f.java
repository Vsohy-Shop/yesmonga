package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.C41065b;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.f */
public abstract class C40893f extends C41065b implements C40894g {
    public C40893f() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    /* renamed from: E8 */
    public final boolean mo87664E8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C41066c.m166936b(parcel);
            mo134593h7((Status) C41066c.m166935a(parcel, Status.CREATOR), (ModuleAvailabilityResponse) C41066c.m166935a(parcel, ModuleAvailabilityResponse.CREATOR));
        } else if (i == 2) {
            C41066c.m166936b(parcel);
            mo134592e7((Status) C41066c.m166935a(parcel, Status.CREATOR), (ModuleInstallResponse) C41066c.m166935a(parcel, ModuleInstallResponse.CREATOR));
        } else if (i == 3) {
            C41066c.m166936b(parcel);
            mo134591d2((Status) C41066c.m166935a(parcel, Status.CREATOR), (ModuleInstallIntentResponse) C41066c.m166935a(parcel, ModuleInstallIntentResponse.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            C41066c.m166936b(parcel);
            mo134590a8((Status) C41066c.m166935a(parcel, Status.CREATOR));
        }
        return true;
    }
}
