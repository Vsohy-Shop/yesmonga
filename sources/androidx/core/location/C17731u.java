package androidx.core.location;

import android.location.Location;
import androidx.core.util.C17970d;

/* renamed from: androidx.core.location.u */
public final /* synthetic */ class C17731u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17970d f46101a;

    /* renamed from: b */
    public final /* synthetic */ Location f46102b;

    public /* synthetic */ C17731u(C17970d dVar, Location location) {
        this.f46101a = dVar;
        this.f46102b = location;
    }

    public final void run() {
        this.f46101a.accept(this.f46102b);
    }
}
