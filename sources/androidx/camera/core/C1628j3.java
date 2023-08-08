package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.j3 */
public final /* synthetic */ class C1628j3 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4563a;

    /* renamed from: b */
    public final /* synthetic */ String f4564b;

    public /* synthetic */ C1628j3(AtomicReference atomicReference, String str) {
        this.f4563a = atomicReference;
        this.f4564b = str;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4563a.set(aVar);
    }
}
