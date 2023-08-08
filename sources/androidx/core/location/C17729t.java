package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.C17735w;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.location.t */
public final /* synthetic */ class C17729t implements Callable {

    /* renamed from: a */
    public final /* synthetic */ LocationManager f46096a;

    /* renamed from: b */
    public final /* synthetic */ C17735w.C17744i f46097b;

    public /* synthetic */ C17729t(LocationManager locationManager, C17735w.C17744i iVar) {
        this.f46096a = locationManager;
        this.f46097b = iVar;
    }

    public final Object call() {
        return Boolean.valueOf(this.f46096a.addGpsStatusListener(this.f46097b));
    }
}
