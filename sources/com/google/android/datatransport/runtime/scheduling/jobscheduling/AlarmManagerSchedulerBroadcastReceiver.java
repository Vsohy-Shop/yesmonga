package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.C40323w;
import com.google.android.datatransport.runtime.util.C40321a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public static /* synthetic */ void m163551b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C40323w.m163831f(context);
        C40203r.C40204a d = C40203r.m163518a().mo132743b(queryParameter).mo132745d(C40321a.m163827b(intValue));
        if (queryParameter2 != null) {
            d.mo132744c(Base64.decode(queryParameter2, 0));
        }
        C40323w.m163829c().mo132984e().mo132897v(d.mo132742a(), i, new C40222b());
    }
}
