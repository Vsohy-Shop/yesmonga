package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.impl.C21176e;
import androidx.work.impl.C21361v;
import androidx.work.impl.C21362w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C21116g;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.b */
public class C21111b implements C21176e {

    /* renamed from: X */
    public static final String f54508X = "KEY_WORKSPEC_GENERATION";

    /* renamed from: Y */
    public static final String f54509Y = "KEY_NEEDS_RESCHEDULE";

    /* renamed from: Z */
    public static final long f54510Z = 600000;

    /* renamed from: e */
    public static final String f54511e = C21377l.m98584i("CommandHandler");

    /* renamed from: f */
    public static final String f54512f = "ACTION_SCHEDULE_WORK";

    /* renamed from: g */
    public static final String f54513g = "ACTION_DELAY_MET";

    /* renamed from: v */
    public static final String f54514v = "ACTION_STOP_WORK";

    /* renamed from: w */
    public static final String f54515w = "ACTION_CONSTRAINTS_CHANGED";

    /* renamed from: x */
    public static final String f54516x = "ACTION_RESCHEDULE";

    /* renamed from: y */
    public static final String f54517y = "ACTION_EXECUTION_COMPLETED";

    /* renamed from: z */
    public static final String f54518z = "KEY_WORKSPEC_ID";

    /* renamed from: a */
    public final Context f54519a;

    /* renamed from: b */
    public final Map<C21237m, C21115f> f54520b = new HashMap();

    /* renamed from: c */
    public final Object f54521c = new Object();

    /* renamed from: d */
    public final C21362w f54522d;

    public C21111b(@C0359n0 Context context, @C0359n0 C21362w wVar) {
        this.f54519a = context;
        this.f54522d = wVar;
    }

    /* renamed from: a */
    public static Intent m97717a(@C0359n0 Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f54515w);
        return intent;
    }

    /* renamed from: b */
    public static Intent m97718b(@C0359n0 Context context, @C0359n0 C21237m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f54513g);
        return m97726s(intent, mVar);
    }

    /* renamed from: c */
    public static Intent m97719c(@C0359n0 Context context, @C0359n0 C21237m mVar, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f54517y);
        intent.putExtra(f54509Y, z);
        return m97726s(intent, mVar);
    }

    /* renamed from: e */
    public static Intent m97720e(@C0359n0 Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f54516x);
        return intent;
    }

    /* renamed from: f */
    public static Intent m97721f(@C0359n0 Context context, @C0359n0 C21237m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f54512f);
        return m97726s(intent, mVar);
    }

    /* renamed from: g */
    public static Intent m97722g(@C0359n0 Context context, @C0359n0 C21237m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f54514v);
        return m97726s(intent, mVar);
    }

    /* renamed from: h */
    public static Intent m97723h(@C0359n0 Context context, @C0359n0 String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(f54514v);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: o */
    public static boolean m97724o(@C0363p0 Bundle bundle, @C0359n0 String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static C21237m m97725r(@C0359n0 Intent intent) {
        return new C21237m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra(f54508X, 0));
    }

    /* renamed from: s */
    public static Intent m97726s(@C0359n0 Intent intent, @C0359n0 C21237m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.mo63437f());
        intent.putExtra(f54508X, mVar.mo63435e());
        return intent;
    }

    /* renamed from: d */
    public void mo63222d(@C0359n0 C21237m mVar, boolean z) {
        synchronized (this.f54521c) {
            C21115f remove = this.f54520b.remove(mVar);
            this.f54522d.mo63720b(mVar);
            if (remove != null) {
                remove.mo63249h(z);
            }
        }
    }

    /* renamed from: i */
    public final void mo63235i(@C0359n0 Intent intent, int i, @C0359n0 C21116g gVar) {
        C21377l e = C21377l.m98582e();
        String str = f54511e;
        e.mo63774a(str, "Handling constraints changed " + intent);
        new C21112c(this.f54519a, i, gVar).mo63243a();
    }

    /* renamed from: j */
    public final void mo63236j(@C0359n0 Intent intent, int i, @C0359n0 C21116g gVar) {
        synchronized (this.f54521c) {
            C21237m r = m97725r(intent);
            C21377l e = C21377l.m98582e();
            String str = f54511e;
            e.mo63774a(str, "Handing delay met for " + r);
            if (!this.f54520b.containsKey(r)) {
                C21115f fVar = new C21115f(this.f54519a, i, gVar, this.f54522d.mo63723e(r));
                this.f54520b.put(r, fVar);
                fVar.mo63248g();
            } else {
                C21377l e2 = C21377l.m98582e();
                e2.mo63774a(str, "WorkSpec " + r + " is is already being handled for ACTION_DELAY_MET");
            }
        }
    }

    /* renamed from: k */
    public final void mo63237k(@C0359n0 Intent intent, int i) {
        C21237m r = m97725r(intent);
        boolean z = intent.getExtras().getBoolean(f54509Y);
        C21377l e = C21377l.m98582e();
        String str = f54511e;
        e.mo63774a(str, "Handling onExecutionCompleted " + intent + ", " + i);
        mo63222d(r, z);
    }

    /* renamed from: l */
    public final void mo63238l(@C0359n0 Intent intent, int i, @C0359n0 C21116g gVar) {
        C21377l e = C21377l.m98582e();
        String str = f54511e;
        e.mo63774a(str, "Handling reschedule " + intent + ", " + i);
        gVar.mo63257g().mo63368U();
    }

    /* renamed from: m */
    public final void mo63239m(@C0359n0 Intent intent, int i, @C0359n0 C21116g gVar) {
        C21237m r = m97725r(intent);
        C21377l e = C21377l.m98582e();
        String str = f54511e;
        e.mo63774a(str, "Handling schedule work for " + r);
        WorkDatabase P = gVar.mo63257g().mo63363P();
        P.mo60905e();
        try {
            C21249u l = P.mo63207X().mo63539l(r.mo63437f());
            if (l == null) {
                C21377l e2 = C21377l.m98582e();
                e2.mo63782l(str, "Skipping scheduling " + r + " because it's no longer in the DB");
            } else if (l.f54805b.mo63047q()) {
                C21377l e3 = C21377l.m98582e();
                e3.mo63782l(str, "Skipping scheduling " + r + "because it is finished.");
                P.mo60908k();
            } else {
                long c = l.mo63461c();
                if (!l.mo63454B()) {
                    C21377l e4 = C21377l.m98582e();
                    e4.mo63774a(str, "Setting up Alarms for " + r + "at " + c);
                    C21109a.m97714c(this.f54519a, P, r, c);
                } else {
                    C21377l e5 = C21377l.m98582e();
                    e5.mo63774a(str, "Opportunistically setting an alarm for " + r + "at " + c);
                    C21109a.m97714c(this.f54519a, P, r, c);
                    gVar.mo63256f().mo63698a().execute(new C21116g.C21118b(gVar, m97717a(this.f54519a), i));
                }
                P.mo60901O();
                P.mo60908k();
            }
        } finally {
            P.mo60908k();
        }
    }

    /* renamed from: n */
    public final void mo63240n(@C0359n0 Intent intent, @C0359n0 C21116g gVar) {
        List<C21361v> list;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey(f54508X)) {
            int i = extras.getInt(f54508X);
            list = new ArrayList<>(1);
            C21361v b = this.f54522d.mo63720b(new C21237m(string, i));
            if (b != null) {
                list.add(b);
            }
        } else {
            list = this.f54522d.mo63722d(string);
        }
        for (C21361v vVar : list) {
            C21377l e = C21377l.m98582e();
            String str = f54511e;
            e.mo63774a(str, "Handing stopWork work for " + string);
            gVar.mo63257g().mo63373a0(vVar);
            C21109a.m97712a(this.f54519a, gVar.mo63257g().mo63363P(), vVar.mo63718a());
            gVar.mo63222d(vVar.mo63718a(), false);
        }
    }

    /* renamed from: p */
    public boolean mo63241p() {
        boolean z;
        synchronized (this.f54521c) {
            if (!this.f54520b.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @C0348i1
    /* renamed from: q */
    public void mo63242q(@C0359n0 Intent intent, int i, @C0359n0 C21116g gVar) {
        String action = intent.getAction();
        if (f54515w.equals(action)) {
            mo63235i(intent, i, gVar);
        } else if (f54516x.equals(action)) {
            mo63238l(intent, i, gVar);
        } else if (!m97724o(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            C21377l e = C21377l.m98582e();
            String str = f54511e;
            e.mo63776c(str, "Invalid request for " + action + " , requires " + "KEY_WORKSPEC_ID" + " .");
        } else if (f54512f.equals(action)) {
            mo63239m(intent, i, gVar);
        } else if (f54513g.equals(action)) {
            mo63236j(intent, i, gVar);
        } else if (f54514v.equals(action)) {
            mo63240n(intent, gVar);
        } else if (f54517y.equals(action)) {
            mo63237k(intent, i);
        } else {
            C21377l e2 = C21377l.m98582e();
            String str2 = f54511e;
            e2.mo63782l(str2, "Ignoring intent " + intent);
        }
    }
}
