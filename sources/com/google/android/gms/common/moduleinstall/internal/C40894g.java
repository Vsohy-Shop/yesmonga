package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.g */
public interface C40894g extends IInterface {
    /* renamed from: a8 */
    void mo134590a8(Status status) throws RemoteException;

    /* renamed from: d2 */
    void mo134591d2(Status status, @C0363p0 ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;

    /* renamed from: e7 */
    void mo134592e7(Status status, @C0363p0 ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    /* renamed from: h7 */
    void mo134593h7(Status status, @C0363p0 ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;
}
