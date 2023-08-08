package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.internal.C32062k;
import com.google.android.play.core.listener.C32112c;

/* renamed from: com.google.android.play.core.appupdate.f */
public final class C31872f extends C32112c<InstallState> {
    public C31872f(Context context) {
        super(new C32062k("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* renamed from: a */
    public final void mo92414a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (!context.getPackageName().equals(intent2.getStringExtra("package.name"))) {
            this.f78323a.mo92775a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent2.getStringExtra("package.name"));
            return;
        }
        this.f78323a.mo92775a("List of extras in received intent:", new Object[0]);
        for (String next : intent.getExtras().keySet()) {
            this.f78323a.mo92775a("Key: %s; value: %s", next, intent.getExtras().get(next));
        }
        C32062k kVar = this.f78323a;
        kVar.mo92775a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        kVar.mo92775a("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        kVar.mo92775a("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        InstallState a = InstallState.m129748a(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
        this.f78323a.mo92775a("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
        mo92853g(a);
    }
}
