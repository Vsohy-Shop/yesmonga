package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C21377l;
import androidx.work.impl.C21191g0;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f54503a = C21377l.m98584i("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C21377l e = C21377l.m98582e();
        String str = f54503a;
        e.mo63774a(str, "Received intent " + intent);
        try {
            C21191g0.m97937J(context).mo63369W(goAsync());
        } catch (IllegalStateException e2) {
            C21377l.m98582e().mo63777d(f54503a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
