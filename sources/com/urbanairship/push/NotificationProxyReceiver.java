package com.urbanairship.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.Autopilot;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NotificationProxyReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final long f25807a = 9;

    /* renamed from: com.urbanairship.push.NotificationProxyReceiver$a */
    public class C9444a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Future f25808a;

        /* renamed from: b */
        public final /* synthetic */ BroadcastReceiver.PendingResult f25809b;

        public C9444a(Future future, BroadcastReceiver.PendingResult pendingResult) {
            this.f25808a = future;
            this.f25809b = pendingResult;
        }

        public void run() {
            try {
                C36059m.m148419o("Finished processing notification intent with result %s.", (Boolean) this.f25808a.get(9, TimeUnit.SECONDS));
            } catch (InterruptedException | ExecutionException e) {
                C36059m.m148411g(e, "NotificationProxyReceiver - Exception when processing notification intent.", new Object[0]);
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused) {
                C36059m.m148409e("NotificationProxyReceiver - Application took too long to process notification intent.", new Object[0]);
            }
            this.f25809b.finish();
        }
    }

    public void onReceive(@C0359n0 Context context, @C0363p0 Intent intent) {
        Autopilot.m146142e(context);
        if (!UAirship.m146184O() && !UAirship.m146182M()) {
            C36059m.m148409e("NotificationProxyReceiver - unable to receive intent, takeOff not called.", new Object[0]);
        } else if (intent != null && intent.getAction() != null) {
            C36059m.m148419o("Received intent: %s", intent.getAction());
            BroadcastReceiver.PendingResult goAsync = goAsync();
            C36044d.m148370b().execute(new C9444a(new C9462f(context, intent).mo19247e(), goAsync));
        }
    }
}
