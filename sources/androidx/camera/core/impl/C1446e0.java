package androidx.camera.core.impl;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.camera.core.impl.e0 */
public final /* synthetic */ class C1446e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32487a f4200a;

    /* renamed from: b */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f4201b;

    /* renamed from: c */
    public final /* synthetic */ long f4202c;

    public /* synthetic */ C1446e0(C32487a aVar, CallbackToFutureAdapter.C16559a aVar2, long j) {
        this.f4200a = aVar;
        this.f4201b = aVar2;
        this.f4202c = j;
    }

    public final void run() {
        C1461i0.m6128g(this.f4200a, this.f4201b, this.f4202c);
    }
}
