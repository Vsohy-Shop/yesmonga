package androidx.core.location;

import android.location.Location;
import androidx.core.location.C17735w;

/* renamed from: androidx.core.location.q0 */
public final /* synthetic */ class C17724q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17735w.C17747l f46088a;

    /* renamed from: b */
    public final /* synthetic */ Location f46089b;

    public /* synthetic */ C17724q0(C17735w.C17747l lVar, Location location) {
        this.f46088a = lVar;
        this.f46089b = location;
    }

    public final void run() {
        this.f46088a.m81055i(this.f46089b);
    }
}
