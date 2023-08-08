package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: com.google.android.gms.common.api.b0 */
public final class C40494b0<R extends C40669r> extends BasePendingResult<R> {

    /* renamed from: r */
    public final C40669r f103209r;

    public C40494b0(C40669r rVar) {
        super(Looper.getMainLooper());
        this.f103209r = rVar;
    }

    /* renamed from: k */
    public final R mo133688k(Status status) {
        if (status.mo133648W() == this.f103209r.getStatus().mo133648W()) {
            return this.f103209r;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
