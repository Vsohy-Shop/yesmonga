package com.urbanairship.iam;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import com.urbanairship.C36059m;
import com.urbanairship.C36064q;
import com.urbanairship.app.C36029a;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36031c;
import com.urbanairship.app.C36032d;
import com.urbanairship.app.C36033e;
import com.urbanairship.app.C36035g;
import com.urbanairship.util.C9640b0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.urbanairship.iam.i */
public class C9202i implements C36030b {
    @C0359n0

    /* renamed from: g */
    public static final String f25049g = "com.urbanairship.push.iam.EXCLUDE_FROM_AUTO_SHOW";

    /* renamed from: h */
    public static C9202i f25050h;

    /* renamed from: a */
    public final C36030b f25051a;

    /* renamed from: b */
    public final Set<Class> f25052b = new HashSet();

    /* renamed from: c */
    public final Set<Class> f25053c = new HashSet();

    /* renamed from: d */
    public final C36064q<Activity> f25054d;

    /* renamed from: e */
    public final C36033e f25055e;

    /* renamed from: f */
    public final C36032d f25056f;

    /* renamed from: com.urbanairship.iam.i$a */
    public class C9203a implements C36064q<Activity> {
        public C9203a() {
        }

        /* renamed from: a */
        public boolean apply(Activity activity) {
            if (C9202i.this.f25052b.contains(activity.getClass())) {
                return true;
            }
            if (C9202i.this.f25053c.contains(activity.getClass())) {
                return false;
            }
            if (C9202i.this.mo18488n(activity)) {
                C9202i.this.f25053c.add(activity.getClass());
                return false;
            }
            C9202i.this.f25052b.add(activity.getClass());
            return true;
        }
    }

    /* renamed from: com.urbanairship.iam.i$b */
    public class C9204b implements C36064q<Activity> {

        /* renamed from: a */
        public final /* synthetic */ C36064q f25058a;

        public C9204b(C36064q qVar) {
            this.f25058a = qVar;
        }

        /* renamed from: a */
        public boolean apply(Activity activity) {
            return C9202i.this.f25054d.apply(activity) && this.f25058a.apply(activity);
        }
    }

    public C9202i(@C0359n0 C36030b bVar) {
        C9203a aVar = new C9203a();
        this.f25054d = aVar;
        this.f25051a = bVar;
        C36033e eVar = new C36033e();
        this.f25055e = eVar;
        this.f25056f = new C36032d(eVar, aVar);
    }

    @C0359n0
    /* renamed from: m */
    public static C9202i m34549m(@C0359n0 Context context) {
        if (f25050h == null) {
            synchronized (C9202i.class) {
                if (f25050h == null) {
                    C9202i iVar = new C9202i(C36035g.m148341t(context));
                    f25050h = iVar;
                    iVar.mo18487l();
                }
            }
        }
        return f25050h;
    }

    /* renamed from: a */
    public void mo18480a(@C0359n0 C36029a aVar) {
        this.f25055e.mo107768b(aVar);
    }

    /* renamed from: b */
    public void mo18481b(@C0359n0 C36031c cVar) {
        this.f25051a.mo18481b(cVar);
    }

    @C0353k0
    @C0359n0
    /* renamed from: c */
    public List<Activity> mo18482c() {
        return this.f25051a.mo18486g(this.f25054d);
    }

    /* renamed from: d */
    public boolean mo18483d() {
        return this.f25051a.mo18483d();
    }

    /* renamed from: e */
    public void mo18484e(@C0359n0 C36029a aVar) {
        this.f25055e.mo107767a(aVar);
    }

    /* renamed from: f */
    public void mo18485f(@C0359n0 C36031c cVar) {
        this.f25051a.mo18485f(cVar);
    }

    @C0353k0
    @C0359n0
    /* renamed from: g */
    public List<Activity> mo18486g(@C0359n0 C36064q<Activity> qVar) {
        return this.f25051a.mo18486g(new C9204b(qVar));
    }

    /* renamed from: l */
    public final void mo18487l() {
        this.f25051a.mo18484e(this.f25056f);
    }

    /* renamed from: n */
    public final boolean mo18488n(Activity activity) {
        Bundle bundle;
        ActivityInfo a = C9640b0.m36123a(activity.getClass());
        if (a == null || (bundle = a.metaData) == null || !bundle.getBoolean(f25049g, false)) {
            return false;
        }
        C36059m.m148419o("Activity contains metadata to exclude it from auto showing an in-app message", new Object[0]);
        return true;
    }
}
