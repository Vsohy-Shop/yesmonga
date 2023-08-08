package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.C0328d;
import androidx.annotation.C0359n0;
import androidx.collection.C1886l;
import com.google.android.gms.internal.cloudmessaging.C41086a;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.installations.C33124s;
import com.google.firebase.installations.local.C33093b;
import com.google.firebase.messaging.C33188f0;
import com.google.firebase.messaging.C33206k0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.cloudmessaging.d */
public class C40444d {

    /* renamed from: h */
    public static int f103062h;

    /* renamed from: i */
    public static PendingIntent f103063i;

    /* renamed from: j */
    public static final Executor f103064j = C40443c0.f103061a;

    /* renamed from: k */
    public static final Pattern f103065k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    @GuardedBy("responseCallbacks")

    /* renamed from: a */
    public final C1886l<String, C31049l<Bundle>> f103066a = new C1886l<>();

    /* renamed from: b */
    public final Context f103067b;

    /* renamed from: c */
    public final C40463w f103068c;

    /* renamed from: d */
    public final ScheduledExecutorService f103069d;

    /* renamed from: e */
    public Messenger f103070e;

    /* renamed from: f */
    public Messenger f103071f;

    /* renamed from: g */
    public zzd f103072g;

    public C40444d(@C0359n0 Context context) {
        this.f103067b = context;
        this.f103068c = new C40463w(context);
        this.f103070e = new Messenger(new C40446f(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f103069d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    public static /* synthetic */ C31047k m164603b(Bundle bundle) throws Exception {
        if (m164607j(bundle)) {
            return C31053n.m124525g(null);
        }
        return C31053n.m124525g(bundle);
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m164604d(C40444d dVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C40448h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        dVar.f103072g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f103071f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra(C33188f0.f80660h);
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra(C33188f0.f80661i);
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3) && stringExtra2.length() != 0) {
                            "Received InstanceID error ".concat(stringExtra2);
                        }
                        if (stringExtra2.startsWith(C33093b.f80279g)) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length > 2 && "ID".equals(split[1])) {
                                String str = split[2];
                                String str2 = split[3];
                                if (str2.startsWith(C33124s.f80355c)) {
                                    str2 = str2.substring(1);
                                }
                                dVar.mo133550i(str, intent2.putExtra("error", str2).getExtras());
                            } else if (stringExtra2.length() != 0) {
                                "Unexpected structured response ".concat(stringExtra2);
                            }
                        } else {
                            synchronized (dVar.f103066a) {
                                for (int i = 0; i < dVar.f103066a.size(); i++) {
                                    dVar.mo133550i(dVar.f103066a.mo6334j(i), intent2.getExtras());
                                }
                            }
                        }
                    } else {
                        Matcher matcher = f103065k.matcher(stringExtra);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            if (group != null) {
                                Bundle extras = intent2.getExtras();
                                extras.putString(C33188f0.f80660h, group2);
                                dVar.mo133550i(group, extras);
                            }
                        } else if (Log.isLoggable("Rpc", 3) && stringExtra.length() != 0) {
                            "Unexpected response string: ".concat(stringExtra);
                        }
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    if (valueOf2.length() != 0) {
                        "Unexpected response action: ".concat(valueOf2);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static synchronized String m164605g() {
        String num;
        synchronized (C40444d.class) {
            int i = f103062h;
            f103062h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    public static synchronized void m164606h(Context context, Intent intent) {
        synchronized (C40444d.class) {
            if (f103063i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f103063i = C41086a.m166954a(context, 0, intent2, C41086a.f104377a);
            }
            intent.putExtra(FirebaseMessaging.f80405r, f103063i);
        }
    }

    /* renamed from: j */
    public static boolean m164607j(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: a */
    public C31047k<Bundle> mo133546a(@C0359n0 Bundle bundle) {
        if (this.f103068c.mo133583a() >= 12000000) {
            return C40462v.m164630b(this.f103067b).mo133580d(1, bundle).mo87730n(f103064j, C40465y.f103109a);
        }
        if (this.f103068c.mo133584b() != 0) {
            return mo133549f(bundle).mo87732p(f103064j, new C40464x(this, bundle));
        }
        return C31053n.m124524f(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    @C0359n0
    /* renamed from: c */
    public final /* synthetic */ C31047k mo133547c(@C0359n0 Bundle bundle, @C0359n0 C31047k kVar) throws Exception {
        if (kVar.mo87738v() && m164607j((Bundle) kVar.mo87734r())) {
            return mo133549f(bundle).mo87740x(f103064j, C40437a0.f103056a);
        }
        return kVar;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo133548e(@C0359n0 String str, @C0359n0 ScheduledFuture scheduledFuture, @C0359n0 C31047k kVar) {
        synchronized (this.f103066a) {
            this.f103066a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @C0328d
    /* renamed from: f */
    public final C31047k<Bundle> mo133549f(Bundle bundle) {
        String g = m164605g();
        C31049l lVar = new C31049l();
        synchronized (this.f103066a) {
            this.f103066a.put(g, lVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f103068c.mo133584b() == 2) {
            intent.setAction(C33206k0.f80727h);
        } else {
            intent.setAction(C33206k0.f80728i);
        }
        intent.putExtras(bundle);
        m164606h(this.f103067b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 5);
        sb.append("|ID|");
        sb.append(g);
        sb.append(C33093b.f80279g);
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
        }
        intent.putExtra("google.messenger", this.f103070e);
        if (!(this.f103071f == null && this.f103072g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f103071f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f103072g.mo133586b(obtain);
                }
            } catch (RemoteException unused) {
            }
            lVar.mo87741a().mo87722f(f103064j, new C40466z(this, g, this.f103069d.schedule(new C40441b0(lVar), 30, TimeUnit.SECONDS)));
            return lVar.mo87741a();
        }
        if (this.f103068c.mo133584b() == 2) {
            this.f103067b.sendBroadcast(intent);
        } else {
            this.f103067b.startService(intent);
        }
        lVar.mo87741a().mo87722f(f103064j, new C40466z(this, g, this.f103069d.schedule(new C40441b0(lVar), 30, TimeUnit.SECONDS)));
        return lVar.mo87741a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133550i(java.lang.String r3, @androidx.annotation.C0363p0 android.os.Bundle r4) {
        /*
            r2 = this;
            androidx.collection.l<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r0 = r2.f103066a
            monitor-enter(r0)
            androidx.collection.l<java.lang.String, com.google.android.gms.tasks.l<android.os.Bundle>> r1 = r2.f103066a     // Catch:{ all -> 0x0023 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.tasks.l r1 = (com.google.android.gms.tasks.C31049l) r1     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x001e
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0023 }
            int r1 = r3.length()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001c
            r4.concat(r3)     // Catch:{ all -> 0x0023 }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x001e:
            r1.mo87743c(r4)     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.C40444d.mo133550i(java.lang.String, android.os.Bundle):void");
    }
}
