package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.work.C21377l;
import androidx.work.impl.C21191g0;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.C21341s;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f54493a = C21377l.m98584i("ConstrntProxyUpdtRecvr");

    /* renamed from: b */
    public static final String f54494b = "androidx.work.impl.background.systemalarm.UpdateProxies";

    /* renamed from: c */
    public static final String f54495c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";

    /* renamed from: d */
    public static final String f54496d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";

    /* renamed from: e */
    public static final String f54497e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";

    /* renamed from: f */
    public static final String f54498f = "KEY_NETWORK_STATE_PROXY_ENABLED";

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class C21108a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Intent f54499a;

        /* renamed from: b */
        public final /* synthetic */ Context f54500b;

        /* renamed from: c */
        public final /* synthetic */ BroadcastReceiver.PendingResult f54501c;

        public C21108a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f54499a = intent;
            this.f54500b = context;
            this.f54501c = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f54499a.getBooleanExtra(ConstraintProxyUpdateReceiver.f54495c, false);
                boolean booleanExtra2 = this.f54499a.getBooleanExtra(ConstraintProxyUpdateReceiver.f54496d, false);
                boolean booleanExtra3 = this.f54499a.getBooleanExtra(ConstraintProxyUpdateReceiver.f54497e, false);
                boolean booleanExtra4 = this.f54499a.getBooleanExtra(ConstraintProxyUpdateReceiver.f54498f, false);
                C21377l.m98582e().mo63774a(ConstraintProxyUpdateReceiver.f54493a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                C21341s.m98460c(this.f54500b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C21341s.m98460c(this.f54500b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C21341s.m98460c(this.f54500b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C21341s.m98460c(this.f54500b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f54501c.finish();
            }
        }
    }

    @C0359n0
    /* renamed from: a */
    public static Intent m97709a(@C0359n0 Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(f54494b);
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra(f54495c, z).putExtra(f54496d, z2).putExtra(f54497e, z3).putExtra(f54498f, z4);
        return intent;
    }

    public void onReceive(@C0359n0 Context context, @C0363p0 Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!f54494b.equals(str)) {
            C21377l e = C21377l.m98582e();
            String str2 = f54493a;
            e.mo63774a(str2, "Ignoring unknown action " + str);
            return;
        }
        C21191g0.m97937J(context).mo63365R().mo63700c(new C21108a(intent, context, goAsync()));
    }
}
