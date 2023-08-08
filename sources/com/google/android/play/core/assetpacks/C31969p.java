package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C32239p;

/* renamed from: com.google.android.play.core.assetpacks.p */
public final class C31969p extends C31965o<ParcelFileDescriptor> {
    public C31969p(C31993v vVar, C32239p<ParcelFileDescriptor> pVar) {
        super(vVar, pVar);
    }

    /* renamed from: X7 */
    public final void mo92642X7(Bundle bundle, Bundle bundle2) throws RemoteException {
        super.mo92642X7(bundle, bundle2);
        this.f78011n.mo93034e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
