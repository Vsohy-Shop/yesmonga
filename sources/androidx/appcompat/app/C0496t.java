package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.appcompat.app.t */
public final class C0496t extends Service {

    @C0376v0(24)
    /* renamed from: androidx.appcompat.app.t$a */
    public static class C0497a {
        @C0373u
        /* renamed from: a */
        public static int m2325a() {
            return 512;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static ServiceInfo m2324a(@C0359n0 Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, C0496t.class), C0497a.m2325a() | 128);
    }

    @C0359n0
    public IBinder onBind(@C0359n0 Intent intent) {
        throw new UnsupportedOperationException();
    }
}
