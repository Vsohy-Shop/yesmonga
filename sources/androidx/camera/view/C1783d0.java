package androidx.camera.view;

import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.view.d0 */
public final /* synthetic */ class C1783d0 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ C1793i0 f4929a;

    /* renamed from: b */
    public final /* synthetic */ Surface f4930b;

    public /* synthetic */ C1783d0(C1793i0 i0Var, Surface surface) {
        this.f4929a = i0Var;
        this.f4930b = surface;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4929a.m7166p(this.f4930b, aVar);
    }
}
