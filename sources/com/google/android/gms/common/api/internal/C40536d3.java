package com.google.android.gms.common.api.internal;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C31031c;
import com.google.android.gms.tasks.C31047k;

/* renamed from: com.google.android.gms.common.api.internal.d3 */
public final class C40536d3 implements C31031c {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85756a(@C0359n0 C31047k kVar) throws Exception {
        if (((Boolean) kVar.mo87734r()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
