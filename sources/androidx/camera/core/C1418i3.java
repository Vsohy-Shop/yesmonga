package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.i3 */
public final /* synthetic */ class C1418i3 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f4084a;

    /* renamed from: b */
    public final /* synthetic */ String f4085b;

    public /* synthetic */ C1418i3(AtomicReference atomicReference, String str) {
        this.f4084a = atomicReference;
        this.f4085b = str;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4084a.set(aVar);
    }
}
