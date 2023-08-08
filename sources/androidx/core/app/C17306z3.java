package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.collection.C1869c;
import androidx.core.app.C17075f2;
import androidx.core.content.C17358m0;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.app.z3 */
public class C17306z3 implements C17073f0 {

    /* renamed from: a */
    public final Context f45574a;

    /* renamed from: b */
    public final Notification.Builder f45575b;

    /* renamed from: c */
    public final C17075f2.C17092g f45576c;

    /* renamed from: d */
    public RemoteViews f45577d;

    /* renamed from: e */
    public RemoteViews f45578e;

    /* renamed from: f */
    public final List<Bundle> f45579f = new ArrayList();

    /* renamed from: g */
    public final Bundle f45580g = new Bundle();

    /* renamed from: h */
    public int f45581h;

    /* renamed from: i */
    public RemoteViews f45582i;

    public C17306z3(C17075f2.C17092g gVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> list;
        int i;
        this.f45576c = gVar;
        this.f45574a = gVar.f45220a;
        if (Build.VERSION.SDK_INT >= 26) {
            C17201p3.m79495a();
            this.f45575b = C17192o3.m79482a(gVar.f45220a, gVar.f45207L);
        } else {
            this.f45575b = new Notification.Builder(gVar.f45220a);
        }
        Notification notification = gVar.f45216U;
        Notification.Builder lights = this.f45575b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, gVar.f45228i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(gVar.f45224e).setContentText(gVar.f45225f).setContentInfo(gVar.f45230k).setContentIntent(gVar.f45226g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = gVar.f45227h;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(gVar.f45229j).setNumber(gVar.f45231l).setProgress(gVar.f45240u, gVar.f45241v, gVar.f45242w);
        this.f45575b.setSubText(gVar.f45237r).setUsesChronometer(gVar.f45234o).setPriority(gVar.f45232m);
        Iterator<C17075f2.C17077b> it = gVar.f45221b.iterator();
        while (it.hasNext()) {
            mo51743b(it.next());
        }
        Bundle bundle = gVar.f45200E;
        if (bundle != null) {
            this.f45580g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f45577d = gVar.f45204I;
        this.f45578e = gVar.f45205J;
        this.f45575b.setShowWhen(gVar.f45233n);
        this.f45575b.setLocalOnly(gVar.f45196A).setGroup(gVar.f45243x).setGroupSummary(gVar.f45244y).setSortKey(gVar.f45245z);
        this.f45581h = gVar.f45212Q;
        this.f45575b.setCategory(gVar.f45199D).setColor(gVar.f45201F).setVisibility(gVar.f45202G).setPublicVersion(gVar.f45203H).setSound(notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = m79701e(m79702g(gVar.f45222c), gVar.f45219X);
        } else {
            list = gVar.f45219X;
        }
        if (list != null && !list.isEmpty()) {
            for (String addPerson : list) {
                this.f45575b.addPerson(addPerson);
            }
        }
        this.f45582i = gVar.f45206K;
        if (gVar.f45223d.size() > 0) {
            Bundle bundle2 = gVar.mo51413t().getBundle(C17075f2.C17093h.f45246d);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < gVar.f45223d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), C17038b4.m78794j(gVar.f45223d.get(i3)));
            }
            bundle2.putBundle(C17075f2.C17093h.f45250h, bundle4);
            bundle3.putBundle(C17075f2.C17093h.f45250h, bundle4);
            gVar.mo51413t().putBundle(C17075f2.C17093h.f45246d, bundle2);
            this.f45580g.putBundle(C17075f2.C17093h.f45246d, bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Icon icon = gVar.f45218W;
        if (icon != null) {
            this.f45575b.setSmallIcon(icon);
        }
        this.f45575b.setExtras(gVar.f45200E).setRemoteInputHistory(gVar.f45239t);
        RemoteViews remoteViews = gVar.f45204I;
        if (remoteViews != null) {
            this.f45575b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = gVar.f45205J;
        if (remoteViews2 != null) {
            this.f45575b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = gVar.f45206K;
        if (remoteViews3 != null) {
            this.f45575b.setCustomHeadsUpContentView(remoteViews3);
        }
        if (i4 >= 26) {
            Notification.Builder unused = this.f45575b.setBadgeIconType(gVar.f45208M).setSettingsText(gVar.f45238s).setShortcutId(gVar.f45209N).setTimeoutAfter(gVar.f45211P).setGroupAlertBehavior(gVar.f45212Q);
            if (gVar.f45198C) {
                Notification.Builder unused2 = this.f45575b.setColorized(gVar.f45197B);
            }
            if (!TextUtils.isEmpty(gVar.f45207L)) {
                this.f45575b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i4 >= 28) {
            Iterator<C17218r4> it2 = gVar.f45222c.iterator();
            while (it2.hasNext()) {
                Notification.Builder unused3 = this.f45575b.addPerson(it2.next().mo51663k());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Notification.Builder unused4 = this.f45575b.setAllowSystemGeneratedContextualActions(gVar.f45214S);
            Notification.Builder unused5 = this.f45575b.setBubbleMetadata(C17075f2.C17088f.m79023k(gVar.f45215T));
            C17358m0 m0Var = gVar.f45210O;
            if (m0Var != null) {
                Notification.Builder unused6 = this.f45575b.setLocusId(m0Var.mo51798c());
            }
        }
        if (i5 >= 31 && (i = gVar.f45213R) != 0) {
            Notification.Builder unused7 = this.f45575b.setForegroundServiceBehavior(i);
        }
        if (gVar.f45217V) {
            if (this.f45576c.f45244y) {
                this.f45581h = 2;
            } else {
                this.f45581h = 1;
            }
            this.f45575b.setVibrate((long[]) null);
            this.f45575b.setSound((Uri) null);
            int i6 = notification.defaults & -2 & -3;
            notification.defaults = i6;
            this.f45575b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f45576c.f45243x)) {
                    this.f45575b.setGroup(C17075f2.f45058Q0);
                }
                Notification.Builder unused8 = this.f45575b.setGroupAlertBehavior(this.f45581h);
            }
        }
    }

    @C0363p0
    /* renamed from: e */
    public static List<String> m79701e(@C0363p0 List<String> list, @C0363p0 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C1869c cVar = new C1869c(list.size() + list2.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    @C0363p0
    /* renamed from: g */
    public static List<String> m79702g(@C0363p0 List<C17218r4> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C17218r4 j : list) {
            arrayList.add(j.mo51662j());
        }
        return arrayList;
    }

    /* renamed from: a */
    public Notification.Builder mo51268a() {
        return this.f45575b;
    }

    /* renamed from: b */
    public final void mo51743b(C17075f2.C17077b bVar) {
        Icon icon;
        Bundle bundle;
        IconCompat f = bVar.mo51274f();
        if (f != null) {
            icon = f.mo51938K();
        } else {
            icon = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, bVar.mo51278j(), bVar.mo51269a());
        if (bVar.mo51275g() != null) {
            for (RemoteInput addRemoteInput : C17230s5.m79562d(bVar.mo51275g())) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        if (bVar.mo51272d() != null) {
            bundle = new Bundle(bVar.mo51272d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(C17038b4.f44971c, bVar.mo51270b());
        int i = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(bVar.mo51270b());
        bundle.putInt(C17075f2.C17077b.f45135y, bVar.mo51276h());
        if (i >= 28) {
            Notification.Action.Builder unused = builder.setSemanticAction(bVar.mo51276h());
        }
        if (i >= 29) {
            Notification.Action.Builder unused2 = builder.setContextual(bVar.mo51280l());
        }
        if (i >= 31) {
            Notification.Action.Builder unused3 = builder.setAuthenticationRequired(bVar.mo51279k());
        }
        bundle.putBoolean(C17075f2.C17077b.f45134x, bVar.mo51277i());
        builder.addExtras(bundle);
        this.f45575b.addAction(builder.build());
    }

    /* renamed from: c */
    public Notification mo51744c() {
        RemoteViews remoteViews;
        Bundle n;
        RemoteViews x;
        RemoteViews v;
        C17075f2.C17105q qVar = this.f45576c.f45236q;
        if (qVar != null) {
            qVar.mo51315b(this);
        }
        if (qVar != null) {
            remoteViews = qVar.mo51448w(this);
        } else {
            remoteViews = null;
        }
        Notification d = mo51745d();
        if (remoteViews != null) {
            d.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f45576c.f45204I;
            if (remoteViews2 != null) {
                d.contentView = remoteViews2;
            }
        }
        if (!(qVar == null || (v = qVar.mo51447v(this)) == null)) {
            d.bigContentView = v;
        }
        if (!(qVar == null || (x = this.f45576c.f45236q.mo51449x(this)) == null)) {
            d.headsUpContentView = x;
        }
        if (!(qVar == null || (n = C17075f2.m78942n(d)) == null)) {
            qVar.mo51322a(n);
        }
        return d;
    }

    /* renamed from: d */
    public Notification mo51745d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f45575b.build();
        }
        Notification build = this.f45575b.build();
        if (this.f45581h != 0) {
            if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f45581h != 2)) {
                mo51747h(build);
            }
            if (build.getGroup() != null && (build.flags & 512) == 0 && this.f45581h == 1) {
                mo51747h(build);
            }
        }
        return build;
    }

    /* renamed from: f */
    public Context mo51746f() {
        return this.f45574a;
    }

    /* renamed from: h */
    public final void mo51747h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & -2 & -3;
    }
}
