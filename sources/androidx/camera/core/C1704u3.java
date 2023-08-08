package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.u3 */
public final /* synthetic */ class C1704u3 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4743a;

    public /* synthetic */ C1704u3(AtomicReference atomicReference) {
        this.f4743a = atomicReference;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4743a.set(aVar);
    }
}
