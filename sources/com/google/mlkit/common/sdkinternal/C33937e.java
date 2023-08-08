package com.google.mlkit.common.sdkinternal;

import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.firebase.inject.C33058b;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.e */
public class C33937e {

    /* renamed from: a */
    public final C33058b<? extends Executor> f82356a;

    public C33937e(@RecentlyNonNull C33058b<? extends Executor> bVar) {
        this.f82356a = bVar;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public Executor mo98707a(@C0363p0 Executor executor) {
        if (executor != null) {
            return executor;
        }
        return (Executor) this.f82356a.get();
    }
}
