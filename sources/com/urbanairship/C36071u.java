package com.urbanairship;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.u */
public final class C36071u {

    /* renamed from: f */
    public static final String[] f89126f = {"com.urbanairship.TAG_GROUP_HISTORIAN_RECORDS", "com.urbanairship.push.iam.PENDING_IN_APP_MESSAGE", "com.urbanairship.push.iam.AUTO_DISPLAY_ENABLED", "com.urbanairship.push.iam.LAST_DISPLAYED_ID", "com.urbanairship.nameduser.CHANGE_TOKEN_KEY", "com.urbanairship.nameduser.LAST_UPDATED_TOKEN_KEY", "com.urbanairship.iam.tags.TAG_PREFER_LOCAL_DATA_TIME"};

    /* renamed from: a */
    public Executor f89127a = C36044d.m148369a();

    /* renamed from: b */
    public final Map<String, C36072a> f89128b = new HashMap();

    /* renamed from: c */
    public final C36066s f89129c;

    /* renamed from: d */
    public final PreferenceDataDatabase f89130d;

    /* renamed from: e */
    public final List<C36074b> f89131e = new ArrayList();

    /* renamed from: com.urbanairship.u$a */
    public class C36072a {

        /* renamed from: a */
        public final String f89132a;

        /* renamed from: b */
        public String f89133b;

        /* renamed from: com.urbanairship.u$a$a */
        public class C36073a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f89135a;

            public C36073a(String str) {
                this.f89135a = str;
            }

            public void run() {
                boolean unused = C36072a.this.mo107866g(this.f89135a);
            }
        }

        public C36072a(String str, String str2) {
            this.f89132a = str;
            this.f89133b = str2;
        }

        /* renamed from: c */
        public String mo107862c() {
            String str;
            synchronized (this) {
                str = this.f89133b;
            }
            return str;
        }

        /* renamed from: d */
        public void mo107863d(String str) {
            if (mo107865f(str)) {
                C36071u.this.f89127a.execute(new C36073a(str));
            }
        }

        /* renamed from: e */
        public boolean mo107864e(String str) {
            synchronized (this) {
                if (!mo107866g(str)) {
                    return false;
                }
                mo107865f(str);
                return true;
            }
        }

        /* renamed from: f */
        public final boolean mo107865f(String str) {
            synchronized (this) {
                if (C9669o0.m36223d(str, this.f89133b)) {
                    return false;
                }
                this.f89133b = str;
                C36059m.m148419o("Preference updated: %s", this.f89132a);
                C36071u.this.mo107851p(this.f89132a);
                return true;
            }
        }

        /* renamed from: g */
        public final boolean mo107866g(@C0363p0 String str) {
            synchronized (this) {
                if (str == null) {
                    try {
                        C36059m.m148419o("Removing preference: %s", this.f89132a);
                        C36071u.this.f89129c.mo107833a(this.f89132a);
                    } catch (Exception e) {
                        C36059m.m148411g(e, "Failed to write preference %s:%s", this.f89132a, str);
                        return false;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    C36059m.m148419o("Saving preference: %s value: %s", this.f89132a, str);
                    C36071u.this.f89129c.mo107838f(new C36065r(this.f89132a, str));
                }
            }
            return true;
        }
    }

    /* renamed from: com.urbanairship.u$b */
    public interface C36074b {
        /* renamed from: a */
        void mo107790a(@C0359n0 String str);
    }

    @C0344h1
    public C36071u(@C0359n0 PreferenceDataDatabase preferenceDataDatabase) {
        this.f89130d = preferenceDataDatabase;
        this.f89129c = preferenceDataDatabase.mo106199T();
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public static C36071u m148464l(@C0359n0 Context context) {
        return new C36071u(PreferenceDataDatabase.m146151R(context));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public static C36071u m148465n(@C0359n0 Context context, @C0359n0 AirshipConfigOptions airshipConfigOptions) {
        PreferenceDataDatabase Q = PreferenceDataDatabase.m146150Q(context, airshipConfigOptions);
        C36071u uVar = new C36071u(Q);
        if (Q.mo106198S(context)) {
            uVar.mo107850o();
        }
        return uVar;
    }

    /* renamed from: c */
    public void mo107840c(@C0359n0 C36074b bVar) {
        synchronized (this.f89131e) {
            this.f89131e.add(bVar);
        }
    }

    /* renamed from: d */
    public final void mo107841d() {
        List<String> list;
        try {
            list = this.f89129c.mo107836d();
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to load keys.", new Object[0]);
            list = null;
        }
        if (list == null || list.isEmpty()) {
            C36059m.m148409e("Unable to load keys, deleting preference store.", new Object[0]);
            try {
                this.f89129c.mo107834b();
            } catch (Exception e2) {
                C36059m.m148411g(e2, "Failed to delete preferences.", new Object[0]);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                try {
                    C36065r e3 = this.f89129c.mo107837e(next);
                    if (e3.f89118b == null) {
                        C36059m.m148409e("Unable to fetch preference value. Deleting: %s", next);
                        this.f89129c.mo107833a(next);
                    } else {
                        arrayList.add(new C36072a(e3.mo107831a(), e3.mo107832b()));
                    }
                } catch (Exception e4) {
                    C36059m.m148411g(e4, "Failed to delete preference %s", next);
                }
            }
            mo107842e(arrayList);
        }
    }

    /* renamed from: e */
    public final void mo107842e(@C0359n0 List<C36072a> list) {
        for (C36072a next : list) {
            this.f89128b.put(next.f89132a, next);
        }
        for (String x : f89126f) {
            mo107859x(x);
        }
    }

    /* renamed from: f */
    public boolean mo107843f(@C0359n0 String str, boolean z) {
        String c = mo107847j(str).mo107862c();
        if (c == null) {
            return z;
        }
        return Boolean.parseBoolean(c);
    }

    /* renamed from: g */
    public int mo107844g(@C0359n0 String str, int i) {
        String c = mo107847j(str).mo107862c();
        if (c == null) {
            return i;
        }
        try {
            return Integer.parseInt(c);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @C0359n0
    /* renamed from: h */
    public JsonValue mo107845h(@C0359n0 String str) {
        try {
            return JsonValue.m34960C(mo107847j(str).mo107862c());
        } catch (JsonException e) {
            C36059m.m148407c(e, "Unable to parse preference value: %s", str);
            return JsonValue.f25436b;
        }
    }

    /* renamed from: i */
    public long mo107846i(@C0359n0 String str, long j) {
        String c = mo107847j(str).mo107862c();
        if (c == null) {
            return j;
        }
        try {
            return Long.parseLong(c);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    @C0359n0
    /* renamed from: j */
    public final C36072a mo107847j(@C0359n0 String str) {
        C36072a aVar;
        synchronized (this.f89128b) {
            aVar = this.f89128b.get(str);
            if (aVar == null) {
                aVar = new C36072a(str, (String) null);
                this.f89128b.put(str, aVar);
            }
        }
        return aVar;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: k */
    public String mo107848k(@C0359n0 String str, String str2) {
        String c = mo107847j(str).mo107862c();
        return c == null ? str2 : c;
    }

    /* renamed from: m */
    public boolean mo107849m(@C0359n0 String str) {
        return mo107847j(str).mo107862c() != null;
    }

    /* renamed from: o */
    public final void mo107850o() {
        try {
            List<C36065r> c = this.f89129c.mo107835c();
            ArrayList arrayList = new ArrayList();
            for (C36065r next : c) {
                arrayList.add(new C36072a(next.mo107831a(), next.mo107832b()));
            }
            mo107842e(arrayList);
        } catch (Exception e) {
            C36059m.m148411g(e, "Failed to load preferences. Retrying with fallback loading.", new Object[0]);
            mo107841d();
        }
    }

    /* renamed from: p */
    public final void mo107851p(@C0359n0 String str) {
        synchronized (this.f89131e) {
            for (C36074b a : this.f89131e) {
                a.mo107790a(str);
            }
        }
    }

    /* renamed from: q */
    public void mo107852q(@C0359n0 String str, int i) {
        mo107847j(str).mo107863d(String.valueOf(i));
    }

    /* renamed from: r */
    public void mo107853r(@C0359n0 String str, long j) {
        mo107847j(str).mo107863d(String.valueOf(j));
    }

    /* renamed from: s */
    public void mo107854s(@C0359n0 String str, @C0363p0 C9333e eVar) {
        if (eVar == null) {
            mo107859x(str);
        } else {
            mo107855t(str, eVar.mo17264q());
        }
    }

    /* renamed from: t */
    public void mo107855t(@C0359n0 String str, @C0363p0 JsonValue jsonValue) {
        if (jsonValue == null) {
            mo107859x(str);
        } else {
            mo107847j(str).mo107863d(jsonValue.toString());
        }
    }

    /* renamed from: u */
    public void mo107856u(@C0359n0 String str, @C0363p0 String str2) {
        if (str2 == null) {
            mo107859x(str);
        } else {
            mo107847j(str).mo107863d(str2);
        }
    }

    /* renamed from: v */
    public void mo107857v(@C0359n0 String str, boolean z) {
        mo107847j(str).mo107863d(String.valueOf(z));
    }

    /* renamed from: w */
    public boolean mo107858w(@C0359n0 String str, @C0363p0 String str2) {
        return mo107847j(str).mo107864e(str2);
    }

    /* renamed from: x */
    public void mo107859x(@C0359n0 String str) {
        C36072a aVar;
        synchronized (this.f89128b) {
            if (this.f89128b.containsKey(str)) {
                aVar = this.f89128b.get(str);
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo107863d((String) null);
        }
    }

    /* renamed from: y */
    public void mo107860y(@C0359n0 C36074b bVar) {
        synchronized (this.f89131e) {
            this.f89131e.remove(bVar);
        }
    }

    /* renamed from: z */
    public void mo107861z() {
        this.f89131e.clear();
        this.f89130d.mo60906g();
    }
}
