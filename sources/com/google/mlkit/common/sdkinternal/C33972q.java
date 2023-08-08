package com.google.mlkit.common.sdkinternal;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: com.google.mlkit.common.sdkinternal.q */
public final /* synthetic */ class C33972q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReferenceQueue f82474a;

    /* renamed from: b */
    public final /* synthetic */ Set f82475b;

    public /* synthetic */ C33972q(ReferenceQueue referenceQueue, Set set) {
        this.f82474a = referenceQueue;
        this.f82475b = set;
    }

    public final void run() {
        ReferenceQueue referenceQueue = this.f82474a;
        Set set = this.f82475b;
        while (!set.isEmpty()) {
            try {
                ((C33975t) referenceQueue.remove()).mo98700a();
            } catch (InterruptedException unused) {
            }
        }
    }
}
