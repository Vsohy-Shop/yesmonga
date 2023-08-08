package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.C1363b4;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.x3 */
public final /* synthetic */ class C1721x3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1363b4 f4791a;

    /* renamed from: b */
    public final /* synthetic */ C1363b4.C1368e f4792b;

    /* renamed from: c */
    public final /* synthetic */ String f4793c;

    /* renamed from: d */
    public final /* synthetic */ Size f4794d;

    /* renamed from: e */
    public final /* synthetic */ CallbackToFutureAdapter.C16559a f4795e;

    public /* synthetic */ C1721x3(C1363b4 b4Var, C1363b4.C1368e eVar, String str, Size size, CallbackToFutureAdapter.C16559a aVar) {
        this.f4791a = b4Var;
        this.f4792b = eVar;
        this.f4793c = str;
        this.f4794d = size;
        this.f4795e = aVar;
    }

    public final void run() {
        this.f4791a.m5759e0(this.f4792b, this.f4793c, this.f4794d, this.f4795e);
    }
}
