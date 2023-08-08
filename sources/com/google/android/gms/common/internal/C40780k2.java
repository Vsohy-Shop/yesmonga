package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C41092a;

/* renamed from: com.google.android.gms.common.internal.k2 */
public final class C40780k2 extends C41092a implements C40790n {
    public C40780k2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    public final void cancel() throws RemoteException {
        mo134904O0(2, mo134905T6());
    }
}
