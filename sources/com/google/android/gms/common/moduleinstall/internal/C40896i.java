package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.internal.base.C41065b;
import com.google.android.gms.internal.base.C41066c;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.i */
public abstract class C40896i extends C41065b implements C40897j {
    public C40896i() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    /* renamed from: E8 */
    public final boolean mo87664E8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        C41066c.m166936b(parcel);
        mo134594W7((ModuleInstallStatusUpdate) C41066c.m166935a(parcel, ModuleInstallStatusUpdate.CREATOR));
        return true;
    }
}
