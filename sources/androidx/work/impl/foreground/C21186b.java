package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.work.C21094f;
import androidx.work.C21377l;
import androidx.work.impl.C21176e;
import androidx.work.impl.C21191g0;
import androidx.work.impl.constraints.C21139c;
import androidx.work.impl.constraints.C21152d;
import androidx.work.impl.constraints.C21153e;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21273x;
import androidx.work.impl.utils.taskexecutor.C21345b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.foreground.b */
public class C21186b implements C21139c, C21176e {

    /* renamed from: E0 */
    public static final String f54663E0 = "KEY_GENERATION";

    /* renamed from: F0 */
    public static final String f54664F0 = "ACTION_START_FOREGROUND";

    /* renamed from: G0 */
    public static final String f54665G0 = "ACTION_NOTIFY";

    /* renamed from: H0 */
    public static final String f54666H0 = "ACTION_CANCEL_WORK";

    /* renamed from: I0 */
    public static final String f54667I0 = "ACTION_STOP_FOREGROUND";

    /* renamed from: X */
    public static final String f54668X = "KEY_NOTIFICATION_ID";

    /* renamed from: Y */
    public static final String f54669Y = "KEY_FOREGROUND_SERVICE_TYPE";

    /* renamed from: Z */
    public static final String f54670Z = "KEY_WORKSPEC_ID";

    /* renamed from: y */
    public static final String f54671y = C21377l.m98584i("SystemFgDispatcher");

    /* renamed from: z */
    public static final String f54672z = "KEY_NOTIFICATION";

    /* renamed from: a */
    public Context f54673a;

    /* renamed from: b */
    public C21191g0 f54674b;

    /* renamed from: c */
    public final C21345b f54675c;

    /* renamed from: d */
    public final Object f54676d = new Object();

    /* renamed from: e */
    public C21237m f54677e;

    /* renamed from: f */
    public final Map<C21237m, C21094f> f54678f;

    /* renamed from: g */
    public final Map<C21237m, C21249u> f54679g;

    /* renamed from: v */
    public final Set<C21249u> f54680v;

    /* renamed from: w */
    public final C21152d f54681w;
    @C0363p0

    /* renamed from: x */
    public C21188b f54682x;

    /* renamed from: androidx.work.impl.foreground.b$a */
    public class C21187a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f54683a;

        public C21187a(String str) {
            this.f54683a = str;
        }

        public void run() {
            C21249u h = C21186b.this.f54674b.mo63359L().mo63605h(this.f54683a);
            if (h != null && h.mo63454B()) {
                synchronized (C21186b.this.f54676d) {
                    C21186b.this.f54679g.put(C21273x.m98280a(h), h);
                    C21186b.this.f54680v.add(h);
                    C21186b bVar = C21186b.this;
                    bVar.f54681w.mo63305a(bVar.f54680v);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.b$b */
    public interface C21188b {
        /* renamed from: a */
        void mo63336a(int i, @C0359n0 Notification notification);

        /* renamed from: c */
        void mo63337c(int i, int i2, @C0359n0 Notification notification);

        /* renamed from: d */
        void mo63338d(int i);

        void stop();
    }

    public C21186b(@C0359n0 Context context) {
        this.f54673a = context;
        C21191g0 J = C21191g0.m97937J(context);
        this.f54674b = J;
        this.f54675c = J.mo63365R();
        this.f54677e = null;
        this.f54678f = new LinkedHashMap();
        this.f54680v = new HashSet();
        this.f54679g = new HashMap();
        this.f54681w = new C21153e(this.f54674b.mo63362O(), (C21139c) this);
        this.f54674b.mo63359L().mo63604g(this);
    }

    @C0359n0
    /* renamed from: c */
    public static Intent m97915c(@C0359n0 Context context, @C0359n0 String str) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(f54666H0);
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @C0359n0
    /* renamed from: e */
    public static Intent m97916e(@C0359n0 Context context, @C0359n0 C21237m mVar, @C0359n0 C21094f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(f54665G0);
        intent.putExtra(f54668X, fVar.mo63195c());
        intent.putExtra(f54669Y, fVar.mo63193a());
        intent.putExtra(f54672z, fVar.mo63194b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.mo63437f());
        intent.putExtra(f54663E0, mVar.mo63435e());
        return intent;
    }

    @C0359n0
    /* renamed from: g */
    public static Intent m97917g(@C0359n0 Context context, @C0359n0 C21237m mVar, @C0359n0 C21094f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(f54664F0);
        intent.putExtra("KEY_WORKSPEC_ID", mVar.mo63437f());
        intent.putExtra(f54663E0, mVar.mo63435e());
        intent.putExtra(f54668X, fVar.mo63195c());
        intent.putExtra(f54669Y, fVar.mo63193a());
        intent.putExtra(f54672z, fVar.mo63194b());
        return intent;
    }

    @C0359n0
    /* renamed from: h */
    public static Intent m97918h(@C0359n0 Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(f54667I0);
        return intent;
    }

    /* renamed from: a */
    public void mo63219a(@C0359n0 List<C21249u> list) {
        if (!list.isEmpty()) {
            for (C21249u next : list) {
                String str = next.f54804a;
                C21377l e = C21377l.m98582e();
                String str2 = f54671y;
                e.mo63774a(str2, "Constraints unmet for WorkSpec " + str);
                this.f54674b.mo63372Z(C21273x.m98280a(next));
            }
        }
    }

    @C0353k0
    /* renamed from: d */
    public void mo63222d(@C0359n0 C21237m mVar, boolean z) {
        boolean z2;
        Map.Entry entry;
        synchronized (this.f54676d) {
            C21249u remove = this.f54679g.remove(mVar);
            if (remove != null) {
                z2 = this.f54680v.remove(remove);
            } else {
                z2 = false;
            }
            if (z2) {
                this.f54681w.mo63305a(this.f54680v);
            }
        }
        C21094f remove2 = this.f54678f.remove(mVar);
        if (mVar.equals(this.f54677e) && this.f54678f.size() > 0) {
            Iterator it = this.f54678f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f54677e = (C21237m) entry.getKey();
            if (this.f54682x != null) {
                C21094f fVar = (C21094f) entry.getValue();
                this.f54682x.mo63337c(fVar.mo63195c(), fVar.mo63193a(), fVar.mo63194b());
                this.f54682x.mo63338d(fVar.mo63195c());
            }
        }
        C21188b bVar = this.f54682x;
        if (remove2 != null && bVar != null) {
            C21377l e = C21377l.m98582e();
            String str = f54671y;
            e.mo63774a(str, "Removing Notification (id: " + remove2.mo63195c() + ", workSpecId: " + mVar + ", notificationType: " + remove2.mo63193a());
            bVar.mo63338d(remove2.mo63195c());
        }
    }

    /* renamed from: f */
    public void mo63224f(@C0359n0 List<C21249u> list) {
    }

    @C0353k0
    /* renamed from: i */
    public final void mo63347i(@C0359n0 Intent intent) {
        C21377l e = C21377l.m98582e();
        String str = f54671y;
        e.mo63778f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f54674b.mo63058h(UUID.fromString(stringExtra));
        }
    }

    @C0353k0
    /* renamed from: j */
    public final void mo63348j(@C0359n0 Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra(f54668X, 0);
        int intExtra2 = intent.getIntExtra(f54669Y, 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C21237m mVar = new C21237m(stringExtra, intent.getIntExtra(f54663E0, 0));
        Notification notification = (Notification) intent.getParcelableExtra(f54672z);
        C21377l e = C21377l.m98582e();
        String str = f54671y;
        e.mo63774a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f54682x != null) {
            this.f54678f.put(mVar, new C21094f(intExtra, notification, intExtra2));
            if (this.f54677e == null) {
                this.f54677e = mVar;
                this.f54682x.mo63337c(intExtra, intExtra2, notification);
                return;
            }
            this.f54682x.mo63336a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<C21237m, C21094f> value : this.f54678f.entrySet()) {
                    i |= ((C21094f) value.getValue()).mo63193a();
                }
                C21094f fVar = this.f54678f.get(this.f54677e);
                if (fVar != null) {
                    this.f54682x.mo63337c(fVar.mo63195c(), i, fVar.mo63194b());
                }
            }
        }
    }

    @C0353k0
    /* renamed from: k */
    public final void mo63349k(@C0359n0 Intent intent) {
        C21377l e = C21377l.m98582e();
        String str = f54671y;
        e.mo63778f(str, "Started foreground service " + intent);
        this.f54675c.mo63700c(new C21187a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @C0353k0
    /* renamed from: l */
    public void mo63350l(@C0359n0 Intent intent) {
        C21377l.m98582e().mo63778f(f54671y, "Stopping foreground service");
        C21188b bVar = this.f54682x;
        if (bVar != null) {
            bVar.stop();
        }
    }

    @C0353k0
    /* renamed from: m */
    public void mo63351m() {
        this.f54682x = null;
        synchronized (this.f54676d) {
            this.f54681w.reset();
        }
        this.f54674b.mo63359L().mo63609o(this);
    }

    /* renamed from: n */
    public void mo63352n(@C0359n0 Intent intent) {
        String action = intent.getAction();
        if (f54664F0.equals(action)) {
            mo63349k(intent);
            mo63348j(intent);
        } else if (f54665G0.equals(action)) {
            mo63348j(intent);
        } else if (f54666H0.equals(action)) {
            mo63347i(intent);
        } else if (f54667I0.equals(action)) {
            mo63350l(intent);
        }
    }

    @C0353k0
    /* renamed from: o */
    public void mo63353o(@C0359n0 C21188b bVar) {
        if (this.f54682x != null) {
            C21377l.m98582e().mo63776c(f54671y, "A callback already exists.");
        } else {
            this.f54682x = bVar;
        }
    }

    @C0344h1
    public C21186b(@C0359n0 Context context, @C0359n0 C21191g0 g0Var, @C0359n0 C21152d dVar) {
        this.f54673a = context;
        this.f54674b = g0Var;
        this.f54675c = g0Var.mo63365R();
        this.f54677e = null;
        this.f54678f = new LinkedHashMap();
        this.f54680v = new HashSet();
        this.f54679g = new HashMap();
        this.f54681w = dVar;
        this.f54674b.mo63359L().mo63604g(this);
    }
}
