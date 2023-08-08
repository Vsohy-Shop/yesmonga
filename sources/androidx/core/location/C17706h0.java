package androidx.core.location;

import android.location.Location;
import androidx.core.util.C17970d;

/* renamed from: androidx.core.location.h0 */
public final /* synthetic */ class C17706h0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17970d f46068a;

    /* renamed from: b */
    public final /* synthetic */ Location f46069b;

    public /* synthetic */ C17706h0(C17970d dVar, Location location) {
        this.f46068a = dVar;
        this.f46069b = location;
    }

    public final void run() {
        this.f46068a.accept(this.f46069b);
    }
}
