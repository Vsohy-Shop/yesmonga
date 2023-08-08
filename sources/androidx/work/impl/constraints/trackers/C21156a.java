package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.preference.C19965r;
import androidx.work.C21377l;
import androidx.work.impl.utils.taskexecutor.C21345b;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.a */
public final class C21156a extends C21160e<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21156a(@C12579k Context context, @C12579k C21345b bVar) {
        super(context, bVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
    }

    @C12579k
    /* renamed from: k */
    public IntentFilter mo63309k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* renamed from: l */
    public void mo63310l(@C12579k Intent intent) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        String action = intent.getAction();
        if (action != null) {
            C21377l e = C21377l.m98582e();
            String a = C21157b.f54603a;
            e.mo63774a(a, "Received " + action);
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        mo63322h(Boolean.FALSE);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        mo63322h(Boolean.FALSE);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        mo63322h(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        mo63322h(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @C12579k
    /* renamed from: m */
    public Boolean mo63308e() {
        Intent registerReceiver = mo63319d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(mo63312n(registerReceiver));
        }
        C21377l.m98582e().mo63776c(C21157b.f54603a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }

    /* renamed from: n */
    public final boolean mo63312n(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }
}
