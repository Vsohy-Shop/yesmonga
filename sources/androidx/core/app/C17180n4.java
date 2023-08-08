package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p002v4.app.C0025a;
import android.util.Log;
import androidx.annotation.C0323b0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0380x0;
import com.google.firebase.installations.C33124s;
import com.google.firebase.messaging.C33202j0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.n4 */
public final class C17180n4 {

    /* renamed from: c */
    public static final String f45405c = "NotifManCompat";

    /* renamed from: d */
    public static final String f45406d = "checkOpNoThrow";

    /* renamed from: e */
    public static final String f45407e = "OP_POST_NOTIFICATION";

    /* renamed from: f */
    public static final String f45408f = "android.support.useSideChannel";

    /* renamed from: g */
    public static final String f45409g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: h */
    public static final int f45410h = 19;

    /* renamed from: i */
    public static final int f45411i = 1000;

    /* renamed from: j */
    public static final int f45412j = 6;

    /* renamed from: k */
    public static final String f45413k = "enabled_notification_listeners";

    /* renamed from: l */
    public static final Object f45414l = new Object();
    @C0323b0("sEnabledNotificationListenersLock")

    /* renamed from: m */
    public static String f45415m = null;
    @C0323b0("sEnabledNotificationListenersLock")

    /* renamed from: n */
    public static Set<String> f45416n = new HashSet();

    /* renamed from: o */
    public static final Object f45417o = new Object();
    @C0323b0("sLock")

    /* renamed from: p */
    public static C17184d f45418p = null;

    /* renamed from: q */
    public static final int f45419q = -1000;

    /* renamed from: r */
    public static final int f45420r = 0;

    /* renamed from: s */
    public static final int f45421s = 1;

    /* renamed from: t */
    public static final int f45422t = 2;

    /* renamed from: u */
    public static final int f45423u = 3;

    /* renamed from: v */
    public static final int f45424v = 4;

    /* renamed from: w */
    public static final int f45425w = 5;

    /* renamed from: a */
    public final Context f45426a;

    /* renamed from: b */
    public final NotificationManager f45427b;

    /* renamed from: androidx.core.app.n4$b */
    public static class C17182b implements C17186e {

        /* renamed from: a */
        public final String f45432a;

        /* renamed from: b */
        public final int f45433b;

        /* renamed from: c */
        public final String f45434c;

        /* renamed from: d */
        public final Notification f45435d;

        public C17182b(String str, int i, String str2, Notification notification) {
            this.f45432a = str;
            this.f45433b = i;
            this.f45434c = str2;
            this.f45435d = notification;
        }

        /* renamed from: a */
        public void mo51625a(C0025a aVar) throws RemoteException {
            aVar.mo57q8(this.f45432a, this.f45433b, this.f45434c, this.f45435d);
        }

        @C0359n0
        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f45432a + ", id:" + this.f45433b + ", tag:" + this.f45434c + "]";
        }
    }

    /* renamed from: androidx.core.app.n4$c */
    public static class C17183c {

        /* renamed from: a */
        public final ComponentName f45436a;

        /* renamed from: b */
        public final IBinder f45437b;

        public C17183c(ComponentName componentName, IBinder iBinder) {
            this.f45436a = componentName;
            this.f45437b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.n4$d */
    public static class C17184d implements Handler.Callback, ServiceConnection {

        /* renamed from: h */
        public static final int f45438h = 0;

        /* renamed from: i */
        public static final int f45439i = 1;

        /* renamed from: j */
        public static final int f45440j = 2;

        /* renamed from: k */
        public static final int f45441k = 3;

        /* renamed from: c */
        public final Context f45442c;

        /* renamed from: d */
        public final HandlerThread f45443d;

        /* renamed from: e */
        public final Handler f45444e;

        /* renamed from: f */
        public final Map<ComponentName, C17185a> f45445f = new HashMap();

        /* renamed from: g */
        public Set<String> f45446g = new HashSet();

        /* renamed from: androidx.core.app.n4$d$a */
        public static class C17185a {

            /* renamed from: a */
            public final ComponentName f45447a;

            /* renamed from: b */
            public boolean f45448b = false;

            /* renamed from: c */
            public C0025a f45449c;

            /* renamed from: d */
            public ArrayDeque<C17186e> f45450d = new ArrayDeque<>();

            /* renamed from: e */
            public int f45451e = 0;

            public C17185a(ComponentName componentName) {
                this.f45447a = componentName;
            }
        }

        public C17184d(Context context) {
            this.f45442c = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f45443d = handlerThread;
            handlerThread.start();
            this.f45444e = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final boolean mo51628a(C17185a aVar) {
            if (aVar.f45448b) {
                return true;
            }
            boolean bindService = this.f45442c.bindService(new Intent(C17180n4.f45409g).setComponent(aVar.f45447a), this, 33);
            aVar.f45448b = bindService;
            if (bindService) {
                aVar.f45451e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.f45447a);
                this.f45442c.unbindService(this);
            }
            return aVar.f45448b;
        }

        /* renamed from: b */
        public final void mo51629b(C17185a aVar) {
            if (aVar.f45448b) {
                this.f45442c.unbindService(this);
                aVar.f45448b = false;
            }
            aVar.f45449c = null;
        }

        /* renamed from: c */
        public final void mo51630c(C17186e eVar) {
            mo51638j();
            for (C17185a next : this.f45445f.values()) {
                next.f45450d.add(eVar);
                mo51634g(next);
            }
        }

        /* renamed from: d */
        public final void mo51631d(ComponentName componentName) {
            C17185a aVar = this.f45445f.get(componentName);
            if (aVar != null) {
                mo51634g(aVar);
            }
        }

        /* renamed from: e */
        public final void mo51632e(ComponentName componentName, IBinder iBinder) {
            C17185a aVar = this.f45445f.get(componentName);
            if (aVar != null) {
                aVar.f45449c = C0025a.C0027b.m112m0(iBinder);
                aVar.f45451e = 0;
                mo51634g(aVar);
            }
        }

        /* renamed from: f */
        public final void mo51633f(ComponentName componentName) {
            C17185a aVar = this.f45445f.get(componentName);
            if (aVar != null) {
                mo51629b(aVar);
            }
        }

        /* renamed from: g */
        public final void mo51634g(C17185a aVar) {
            if (Log.isLoggable(C17180n4.f45405c, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f45447a);
                sb.append(", ");
                sb.append(aVar.f45450d.size());
                sb.append(" queued tasks");
            }
            if (!aVar.f45450d.isEmpty()) {
                if (!mo51628a(aVar) || aVar.f45449c == null) {
                    mo51637i(aVar);
                    return;
                }
                while (true) {
                    C17186e peek = aVar.f45450d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(C17180n4.f45405c, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Sending task ");
                            sb2.append(peek);
                        }
                        peek.mo51625a(aVar.f45449c);
                        aVar.f45450d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(C17180n4.f45405c, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Remote service has died: ");
                            sb3.append(aVar.f45447a);
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("RemoteException communicating with ");
                        sb4.append(aVar.f45447a);
                    }
                }
                if (!aVar.f45450d.isEmpty()) {
                    mo51637i(aVar);
                }
            }
        }

        /* renamed from: h */
        public void mo51635h(C17186e eVar) {
            this.f45444e.obtainMessage(0, eVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                mo51630c((C17186e) message.obj);
                return true;
            } else if (i == 1) {
                C17183c cVar = (C17183c) message.obj;
                mo51632e(cVar.f45436a, cVar.f45437b);
                return true;
            } else if (i == 2) {
                mo51633f((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                mo51631d((ComponentName) message.obj);
                return true;
            }
        }

        /* renamed from: i */
        public final void mo51637i(C17185a aVar) {
            if (!this.f45444e.hasMessages(3, aVar.f45447a)) {
                int i = aVar.f45451e + 1;
                aVar.f45451e = i;
                if (i > 6) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Giving up on delivering ");
                    sb.append(aVar.f45450d.size());
                    sb.append(" tasks to ");
                    sb.append(aVar.f45447a);
                    sb.append(" after ");
                    sb.append(aVar.f45451e);
                    sb.append(" retries");
                    aVar.f45450d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(C17180n4.f45405c, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Scheduling retry for ");
                    sb2.append(i2);
                    sb2.append(" ms");
                }
                this.f45444e.sendMessageDelayed(this.f45444e.obtainMessage(3, aVar.f45447a), (long) i2);
            }
        }

        /* renamed from: j */
        public final void mo51638j() {
            Set<String> q = C17180n4.m79434q(this.f45442c);
            if (!q.equals(this.f45446g)) {
                this.f45446g = q;
                List<ResolveInfo> queryIntentServices = this.f45442c.getPackageManager().queryIntentServices(new Intent().setAction(C17180n4.f45409g), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (q.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f45445f.containsKey(componentName2)) {
                        if (Log.isLoggable(C17180n4.f45405c, 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Adding listener record for ");
                            sb2.append(componentName2);
                        }
                        this.f45445f.put(componentName2, new C17185a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C17185a>> it = this.f45445f.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable(C17180n4.f45405c, 3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Removing listener record for ");
                            sb3.append(next2.getKey());
                        }
                        mo51629b((C17185a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(C17180n4.f45405c, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.f45444e.obtainMessage(1, new C17183c(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(C17180n4.f45405c, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.f45444e.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.n4$e */
    public interface C17186e {
        /* renamed from: a */
        void mo51625a(C0025a aVar) throws RemoteException;
    }

    public C17180n4(Context context) {
        this.f45426a = context;
        this.f45427b = (NotificationManager) context.getSystemService(C33202j0.f80718b);
    }

    /* renamed from: F */
    public static boolean m79432F(Notification notification) {
        Bundle n = C17075f2.m78942n(notification);
        if (n == null || !n.getBoolean(f45408f)) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: p */
    public static C17180n4 m79433p(@C0359n0 Context context) {
        return new C17180n4(context);
    }

    @C0359n0
    /* renamed from: q */
    public static Set<String> m79434q(@C0359n0 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f45414l) {
            if (string != null) {
                if (!string.equals(f45415m)) {
                    String[] split = string.split(C33124s.f80355c, -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f45416n = hashSet;
                    f45415m = string;
                }
            }
            set = f45416n;
        }
        return set;
    }

    @C0359n0
    /* renamed from: A */
    public List<NotificationChannel> mo51596A() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f45427b.getNotificationChannels();
        }
        return Collections.emptyList();
    }

    @C0359n0
    /* renamed from: B */
    public List<C17112g1> mo51597B() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> A = mo51596A();
            if (!A.isEmpty()) {
                ArrayList arrayList = new ArrayList(A.size());
                for (NotificationChannel a : A) {
                    arrayList.add(new C17112g1(C17177n1.m79429a(a)));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @C0380x0("android.permission.POST_NOTIFICATIONS")
    /* renamed from: C */
    public void mo51598C(int i, @C0359n0 Notification notification) {
        mo51599D((String) null, i, notification);
    }

    @C0380x0("android.permission.POST_NOTIFICATIONS")
    /* renamed from: D */
    public void mo51599D(@C0363p0 String str, int i, @C0359n0 Notification notification) {
        if (m79432F(notification)) {
            mo51600E(new C17182b(this.f45426a.getPackageName(), i, str, notification));
            this.f45427b.cancel(str, i);
            return;
        }
        this.f45427b.notify(str, i, notification);
    }

    /* renamed from: E */
    public final void mo51600E(C17186e eVar) {
        synchronized (f45417o) {
            if (f45418p == null) {
                f45418p = new C17184d(this.f45426a.getApplicationContext());
            }
            f45418p.mo51635h(eVar);
        }
    }

    /* renamed from: a */
    public boolean mo51601a() {
        return this.f45427b.areNotificationsEnabled();
    }

    /* renamed from: b */
    public void mo51602b(int i) {
        mo51603c((String) null, i);
    }

    /* renamed from: c */
    public void mo51603c(@C0363p0 String str, int i) {
        this.f45427b.cancel(str, i);
    }

    /* renamed from: d */
    public void mo51604d() {
        this.f45427b.cancelAll();
    }

    /* renamed from: e */
    public void mo51605e(@C0359n0 NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45427b.createNotificationChannel(notificationChannel);
        }
    }

    /* renamed from: f */
    public void mo51606f(@C0359n0 C17112g1 g1Var) {
        mo51605e(g1Var.mo51549m());
    }

    /* renamed from: g */
    public void mo51607g(@C0359n0 NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45427b.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    /* renamed from: h */
    public void mo51608h(@C0359n0 C17207q1 q1Var) {
        mo51607g(q1Var.mo51650f());
    }

    /* renamed from: i */
    public void mo51609i(@C0359n0 List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45427b.createNotificationChannelGroups(list);
        }
    }

    /* renamed from: j */
    public void mo51610j(@C0359n0 List<C17207q1> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C17207q1 f : list) {
                arrayList.add(f.mo51650f());
            }
            this.f45427b.createNotificationChannelGroups(arrayList);
        }
    }

    /* renamed from: k */
    public void mo51611k(@C0359n0 List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45427b.createNotificationChannels(list);
        }
    }

    /* renamed from: l */
    public void mo51612l(@C0359n0 List<C17112g1> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C17112g1 m : list) {
                arrayList.add(m.mo51549m());
            }
            this.f45427b.createNotificationChannels(arrayList);
        }
    }

    /* renamed from: m */
    public void mo51613m(@C0359n0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45427b.deleteNotificationChannel(str);
        }
    }

    /* renamed from: n */
    public void mo51614n(@C0359n0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45427b.deleteNotificationChannelGroup(str);
        }
    }

    /* renamed from: o */
    public void mo51615o(@C0359n0 Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (Object a : this.f45427b.getNotificationChannels()) {
                NotificationChannel a2 = C17177n1.m79429a(a);
                if (!collection.contains(a2.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(a2.getParentChannelId()))) {
                    this.f45427b.deleteNotificationChannel(a2.getId());
                }
            }
        }
    }

    /* renamed from: r */
    public int mo51616r() {
        return this.f45427b.getImportance();
    }

    @C0363p0
    /* renamed from: s */
    public NotificationChannel mo51617s(@C0359n0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f45427b.getNotificationChannel(str);
        }
        return null;
    }

    @C0363p0
    /* renamed from: t */
    public NotificationChannel mo51618t(@C0359n0 String str, @C0359n0 String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f45427b.getNotificationChannel(str, str2);
        }
        return mo51617s(str);
    }

    @C0363p0
    /* renamed from: u */
    public C17112g1 mo51619u(@C0359n0 String str) {
        NotificationChannel s;
        if (Build.VERSION.SDK_INT < 26 || (s = mo51617s(str)) == null) {
            return null;
        }
        return new C17112g1(s);
    }

    @C0363p0
    /* renamed from: v */
    public C17112g1 mo51620v(@C0359n0 String str, @C0359n0 String str2) {
        NotificationChannel t;
        if (Build.VERSION.SDK_INT < 26 || (t = mo51618t(str, str2)) == null) {
            return null;
        }
        return new C17112g1(t);
    }

    @C0363p0
    /* renamed from: w */
    public NotificationChannelGroup mo51621w(@C0359n0 String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return this.f45427b.getNotificationChannelGroup(str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup a : mo51623y()) {
                NotificationChannelGroup a2 = C17116g4.m79319a(a);
                if (a2.getId().equals(str)) {
                    return a2;
                }
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: x */
    public C17207q1 mo51622x(@C0359n0 String str) {
        NotificationChannelGroup w;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup w2 = mo51621w(str);
            if (w2 != null) {
                return new C17207q1(w2);
            }
            return null;
        } else if (i < 26 || (w = mo51621w(str)) == null) {
            return null;
        } else {
            return new C17207q1(w, mo51596A());
        }
    }

    @C0359n0
    /* renamed from: y */
    public List<NotificationChannelGroup> mo51623y() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f45427b.getNotificationChannelGroups();
        }
        return Collections.emptyList();
    }

    @C0359n0
    /* renamed from: z */
    public List<C17207q1> mo51624z() {
        List<NotificationChannel> list;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            List<NotificationChannelGroup> y = mo51623y();
            if (!y.isEmpty()) {
                if (i >= 28) {
                    list = Collections.emptyList();
                } else {
                    list = mo51596A();
                }
                ArrayList arrayList = new ArrayList(y.size());
                for (NotificationChannelGroup a : y) {
                    NotificationChannelGroup a2 = C17116g4.m79319a(a);
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new C17207q1(a2));
                    } else {
                        arrayList.add(new C17207q1(a2, list));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: androidx.core.app.n4$a */
    public static class C17181a implements C17186e {

        /* renamed from: a */
        public final String f45428a;

        /* renamed from: b */
        public final int f45429b;

        /* renamed from: c */
        public final String f45430c;

        /* renamed from: d */
        public final boolean f45431d;

        public C17181a(String str) {
            this.f45428a = str;
            this.f45429b = 0;
            this.f45430c = null;
            this.f45431d = true;
        }

        /* renamed from: a */
        public void mo51625a(C0025a aVar) throws RemoteException {
            if (this.f45431d) {
                aVar.mo55a6(this.f45428a);
            } else {
                aVar.mo56n3(this.f45428a, this.f45429b, this.f45430c);
            }
        }

        @C0359n0
        public String toString() {
            return "CancelTask[" + "packageName:" + this.f45428a + ", id:" + this.f45429b + ", tag:" + this.f45430c + ", all:" + this.f45431d + "]";
        }

        public C17181a(String str, int i, String str2) {
            this.f45428a = str;
            this.f45429b = i;
            this.f45430c = str2;
            this.f45431d = false;
        }
    }
}
