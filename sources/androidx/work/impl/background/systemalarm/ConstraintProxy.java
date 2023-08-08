package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C21087c;
import androidx.work.C21377l;
import androidx.work.NetworkType;
import androidx.work.impl.model.C21249u;
import java.util.List;

public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f54492a = C21377l.m98584i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    /* renamed from: a */
    public static void m97708a(Context context, List<C21249u> list) {
        boolean z;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (C21249u uVar : list) {
            C21087c cVar = uVar.f54813j;
            z2 |= cVar.mo63131f();
            z3 |= cVar.mo63132g();
            z4 |= cVar.mo63135i();
            if (cVar.mo63128d() != NetworkType.NOT_REQUIRED) {
                z = true;
            } else {
                z = false;
            }
            z5 |= z;
            if (z2 && z3 && z4 && z5) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m97709a(context, z2, z3, z4, z5));
    }

    public void onReceive(Context context, Intent intent) {
        C21377l e = C21377l.m98582e();
        String str = f54492a;
        e.mo63774a(str, "onReceive : " + intent);
        context.startService(C21111b.m97717a(context));
    }
}
