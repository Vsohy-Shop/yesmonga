package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.C1074i;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.j2 */
public final /* synthetic */ class C1198j2 implements CallbackToFutureAdapter.C16560b {

    /* renamed from: a */
    public final /* synthetic */ C1211m2 f3445a;

    /* renamed from: b */
    public final /* synthetic */ List f3446b;

    /* renamed from: c */
    public final /* synthetic */ C1074i f3447c;

    /* renamed from: d */
    public final /* synthetic */ C1122z f3448d;

    public /* synthetic */ C1198j2(C1211m2 m2Var, List list, C1074i iVar, C1122z zVar) {
        this.f3445a = m2Var;
        this.f3446b = list;
        this.f3447c = iVar;
        this.f3448d = zVar;
    }

    /* renamed from: a */
    public final Object mo4001a(CallbackToFutureAdapter.C16559a aVar) {
        return this.f3445a.m5007M(this.f3446b, this.f3447c, this.f3448d, aVar);
    }
}
