package androidx.core.location;

import android.location.GnssStatus;
import androidx.core.location.C17735w;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.location.t0 */
public final /* synthetic */ class C17730t0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17748m f46098a;

    /* renamed from: b */
    public final /* synthetic */ Executor f46099b;

    /* renamed from: c */
    public final /* synthetic */ GnssStatus f46100c;

    public /* synthetic */ C17730t0(C17735w.C17748m mVar, Executor executor, GnssStatus gnssStatus) {
        this.f46098a = mVar;
        this.f46099b = executor;
        this.f46100c = gnssStatus;
    }

    public final void run() {
        this.f46098a.m81067f(this.f46099b, this.f46100c);
    }
}
