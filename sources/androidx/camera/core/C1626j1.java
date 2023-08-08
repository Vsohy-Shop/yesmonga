package androidx.camera.core;

import androidx.camera.core.impl.C1430a0;
import androidx.camera.core.impl.C1583y;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* renamed from: androidx.camera.core.j1 */
public final /* synthetic */ class C1626j1 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f4557a;

    /* renamed from: b */
    public final /* synthetic */ C1583y.C1584a f4558b;

    /* renamed from: c */
    public final /* synthetic */ List f4559c;

    /* renamed from: d */
    public final /* synthetic */ C1430a0 f4560d;

    public /* synthetic */ C1626j1(ImageCapture imageCapture, C1583y.C1584a aVar, List list, C1430a0 a0Var) {
        this.f4557a = imageCapture;
        this.f4558b = aVar;
        this.f4559c = list;
        this.f4560d = a0Var;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f4557a.m5428z0(this.f4558b, this.f4559c, this.f4560d, aVar);
    }
}
