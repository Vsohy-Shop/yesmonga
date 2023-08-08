package com.google.android.gms.common.api;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40669r;

/* renamed from: com.google.android.gms.common.api.t */
public abstract class C40671t<R extends C40669r> implements C40670s<R> {
    @C40473a
    /* renamed from: a */
    public final void mo133903a(@C0359n0 R r) {
        Status status = r.getStatus();
        if (status.mo133655p0()) {
            mo134098c(r);
            return;
        }
        mo134097b(status);
        if (r instanceof C40666o) {
            try {
                ((C40666o) r).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(r));
            }
        }
    }

    /* renamed from: b */
    public abstract void mo134097b(@C0359n0 Status status);

    /* renamed from: c */
    public abstract void mo134098c(@C0359n0 R r);
}
