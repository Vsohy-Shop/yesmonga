package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.profileinstaller.C20006f;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.messaging.C33203j1;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.j */
public abstract class C33200j extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    @C0344h1
    final ExecutorService executor = C33217o.m134016e();
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.j$a */
    public class C33201a implements C33203j1.C33204a {
        public C33201a() {
        }

        @C40473a
        /* renamed from: a */
        public C31047k<Void> mo96101a(Intent intent) {
            return C33200j.this.mo96095f(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m133907d(Intent intent, C31047k kVar) {
        mo96094c(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m133908e(Intent intent, C31049l lVar) {
        try {
            handleIntent(intent);
        } finally {
            lVar.mo87743c(null);
        }
    }

    /* renamed from: c */
    public final void mo96094c(Intent intent) {
        if (intent != null) {
            C33196h1.m133897d(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    @C0353k0
    /* renamed from: f */
    public final C31047k<Void> mo96095f(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C31053n.m124525g(null);
        }
        C31049l lVar = new C31049l();
        this.executor.execute(new C33194h(this, intent, lVar));
        return lVar.mo87741a();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        boolean isLoggable = Log.isLoggable(TAG, 3);
        if (this.binder == null) {
            this.binder = new C33203j1(new C33201a());
        }
        return this.binder;
    }

    @C0346i
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            mo96094c(intent);
            return 2;
        }
        C31047k<Void> f = mo96095f(startCommandIntent);
        if (f.mo87737u()) {
            mo96094c(intent);
            return 2;
        }
        f.mo87722f(new C20006f(), new C33197i(this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
