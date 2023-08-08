package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.C0344h1;
import androidx.compose.runtime.C8698y1;
import androidx.core.app.C17075f2;
import com.google.android.datatransport.runtime.C40203r;
import com.google.android.datatransport.runtime.logging.C40195a;
import com.google.android.datatransport.runtime.scheduling.persistence.C40255d;
import com.google.android.datatransport.runtime.time.C40309a;
import com.google.android.datatransport.runtime.util.C40321a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
public class C40221a implements C40246x {

    /* renamed from: f */
    public static final String f102492f = "AlarmManagerScheduler";

    /* renamed from: g */
    public static final String f102493g = "attemptNumber";

    /* renamed from: h */
    public static final String f102494h = "backendName";

    /* renamed from: i */
    public static final String f102495i = "priority";

    /* renamed from: j */
    public static final String f102496j = "extras";

    /* renamed from: a */
    public final Context f102497a;

    /* renamed from: b */
    public final C40255d f102498b;

    /* renamed from: c */
    public AlarmManager f102499c;

    /* renamed from: d */
    public final SchedulerConfig f102500d;

    /* renamed from: e */
    public final C40309a f102501e;

    public C40221a(Context context, C40255d dVar, C40309a aVar, SchedulerConfig schedulerConfig) {
        this(context, dVar, (AlarmManager) context.getSystemService(C17075f2.f45116w0), aVar, schedulerConfig);
    }

    /* renamed from: a */
    public void mo132880a(C40203r rVar, int i) {
        mo132881b(rVar, i, false);
    }

    /* renamed from: b */
    public void mo132881b(C40203r rVar, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", rVar.mo132737b());
        builder.appendQueryParameter("priority", String.valueOf(C40321a.m163826a(rVar.mo132739d())));
        if (rVar.mo132738c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(rVar.mo132738c(), 0));
        }
        Intent intent = new Intent(this.f102497a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (z || !mo132882c(intent)) {
            long S1 = this.f102498b.mo132930S1(rVar);
            long h = this.f102500d.mo132867h(rVar.mo132739d(), S1, i);
            C40195a.m163494e(f102492f, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", rVar, Long.valueOf(h), Long.valueOf(S1), Integer.valueOf(i));
            this.f102499c.set(3, this.f102501e.getTime() + h, PendingIntent.getBroadcast(this.f102497a, 0, intent, C8698y1.f23302n));
            return;
        }
        C40195a.m163492c(f102492f, "Upload for context %s is already scheduled. Returning...", rVar);
    }

    @C0344h1
    /* renamed from: c */
    public boolean mo132882c(Intent intent) {
        return PendingIntent.getBroadcast(this.f102497a, 0, intent, 603979776) != null;
    }

    @C0344h1
    public C40221a(Context context, C40255d dVar, AlarmManager alarmManager, C40309a aVar, SchedulerConfig schedulerConfig) {
        this.f102497a = context;
        this.f102498b = dVar;
        this.f102499c = alarmManager;
        this.f102501e = aVar;
        this.f102500d = schedulerConfig;
    }
}
