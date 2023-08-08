package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.k3 */
public final /* synthetic */ class C1634k3 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4573a;

    /* renamed from: b */
    public final /* synthetic */ String f4574b;

    public /* synthetic */ C1634k3(AtomicReference atomicReference, String str) {
        this.f4573a = atomicReference;
        this.f4574b = str;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4573a.set(aVar);
    }
}
