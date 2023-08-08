package androidx.work.impl.constraints.trackers;

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
/* renamed from: androidx.work.impl.constraints.trackers.m */
public final class C21170m extends C21160e<Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21170m(@C12579k Context context, @C12579k C21345b bVar) {
        super(context, bVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(bVar, "taskExecutor");
    }

    @C12579k
    /* renamed from: k */
    public IntentFilter mo63309k() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: l */
    public void mo63310l(@C12579k Intent intent) {
        Intrinsics.checkNotNullParameter(intent, C19965r.f51092g);
        if (intent.getAction() != null) {
            C21377l e = C21377l.m98582e();
            String a = C21171n.f54622a;
            e.mo63774a(a, "Received " + intent.getAction());
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        mo63322h(Boolean.TRUE);
                    }
                } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    mo63322h(Boolean.FALSE);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L_0x003c;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo63308e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.mo63319d()
            r1 = 0
            android.content.IntentFilter r2 = r5.mo63309k()
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            r1 = 1
            if (r0 == 0) goto L_0x003d
            java.lang.String r2 = r0.getAction()
            if (r2 != 0) goto L_0x0017
            goto L_0x003d
        L_0x0017:
            java.lang.String r0 = r0.getAction()
            r2 = 0
            if (r0 == 0) goto L_0x003c
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L_0x0036
            r4 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r3 == r4) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x003d
            goto L_0x003c
        L_0x0036:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r0 = r0.equals(r1)
        L_0x003c:
            r1 = r2
        L_0x003d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.C21170m.mo63308e():java.lang.Boolean");
    }
}
