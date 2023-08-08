package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.C21379m;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f54645a = C21377l.m98584i("DiagnosticsRcvr");

    public void onReceive(@C0359n0 Context context, @C0363p0 Intent intent) {
        if (intent != null) {
            C21377l.m98582e().mo63774a(f54645a, "Requesting diagnostics");
            try {
                WorkManager.m97474q(context).mo63060j(C21379m.m98605e(DiagnosticsWorker.class));
            } catch (IllegalStateException e) {
                C21377l.m98582e().mo63777d(f54645a, "WorkManager is not initialized", e);
            }
        }
    }
}
