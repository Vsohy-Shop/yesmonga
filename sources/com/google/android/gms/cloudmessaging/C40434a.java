package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.util.concurrent.C40970b;
import com.google.android.gms.internal.cloudmessaging.C41090e;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.messaging.C33180f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.cloudmessaging.a */
public abstract class C40434a extends BroadcastReceiver {
    private final ExecutorService zza;

    /* renamed from: com.google.android.gms.cloudmessaging.a$a */
    public static final class C40435a {
        @C0359n0

        /* renamed from: a */
        public static final String f103052a = "com.google.firebase.messaging.NOTIFICATION_OPEN";
        @C0359n0

        /* renamed from: b */
        public static final String f103053b = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
    }

    /* renamed from: com.google.android.gms.cloudmessaging.a$b */
    public static final class C40436b {
        @C0359n0

        /* renamed from: a */
        public static final String f103054a = "pending_intent";
        @C0359n0

        /* renamed from: b */
        public static final String f103055b = "wrapped_intent";
    }

    public C40434a() {
        C41090e.m166955a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C40970b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @C0348i1
    /* renamed from: a */
    public final int mo133535a(@C0359n0 Context context, @C0359n0 Intent intent) {
        C31047k<Void> kVar;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra(C33180f.C33184d.f80615h);
        if (TextUtils.isEmpty(stringExtra)) {
            kVar = C31053n.m124525g(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString(C33180f.C33184d.f80615h, stringExtra);
            kVar = C40462v.m164630b(context).mo133579c(2, bundle);
        }
        int onMessageReceive = onMessageReceive(context, new CloudMessage(intent));
        try {
            C31053n.m124520b(kVar, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
        }
        return onMessageReceive;
    }

    @C0348i1
    /* renamed from: b */
    public final int mo133536b(@C0359n0 Context context, @C0359n0 Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(C40436b.f103054a);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(C40436b.f103054a);
        } else {
            extras = new Bundle();
        }
        if (!C40435a.f103053b.equals(intent.getAction())) {
            return 500;
        }
        onNotificationDismissed(context, extras);
        return -1;
    }

    @C0359n0
    public Executor getBroadcastExecutor() {
        return this.zza;
    }

    @C0348i1
    public abstract int onMessageReceive(@C0359n0 Context context, @C0359n0 CloudMessage cloudMessage);

    @C0348i1
    public void onNotificationDismissed(@C0359n0 Context context, @C0359n0 Bundle bundle) {
    }

    public final void onReceive(@C0359n0 Context context, @C0359n0 Intent intent) {
        if (intent != null) {
            getBroadcastExecutor().execute(new C40449i(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }

    public final /* synthetic */ void zza(@C0359n0 Intent intent, @C0359n0 Context context, boolean z, @C0359n0 BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                i = mo133536b(context, intent2);
            } else {
                i = mo133535a(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(i);
            }
        } finally {
            pendingResult.finish();
        }
    }
}
