package com.urbanairship.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import com.urbanairship.C36064q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.urbanairship.app.g */
public class C36035g implements C36030b {

    /* renamed from: i */
    public static final long f89021i = 200;

    /* renamed from: j */
    public static C36035g f89022j;

    /* renamed from: a */
    public final Handler f89023a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Runnable f89024b = new C36037b();

    /* renamed from: c */
    public int f89025c = 0;

    /* renamed from: d */
    public long f89026d;

    /* renamed from: e */
    public boolean f89027e;

    /* renamed from: f */
    public final List<Activity> f89028f = new ArrayList();
    @C0359n0

    /* renamed from: g */
    public final C36034f f89029g = new C36034f();
    @C0359n0

    /* renamed from: h */
    public final C36033e f89030h = new C36036a();

    /* renamed from: com.urbanairship.app.g$a */
    public class C36036a extends C36033e {
        public C36036a() {
        }

        public void onActivityPaused(Activity activity) {
            C36035g.this.f89028f.remove(activity);
            super.onActivityPaused(activity);
        }

        public void onActivityResumed(Activity activity) {
            C36035g.this.f89028f.add(activity);
            super.onActivityResumed(activity);
        }

        public void onActivityStarted(Activity activity) {
            C36035g.this.f89023a.removeCallbacks(C36035g.this.f89024b);
            C36035g.m148334l(C36035g.this);
            if (!C36035g.this.f89027e) {
                boolean unused = C36035g.this.f89027e = true;
                C36035g.this.f89029g.mo17410a(System.currentTimeMillis());
            }
            super.onActivityStarted(activity);
        }

        public void onActivityStopped(Activity activity) {
            if (C36035g.this.f89025c > 0) {
                C36035g.m148335m(C36035g.this);
            }
            if (C36035g.this.f89025c == 0 && C36035g.this.f89027e) {
                long unused = C36035g.this.f89026d = System.currentTimeMillis() + 200;
                C36035g.this.f89023a.postDelayed(C36035g.this.f89024b, 200);
            }
            super.onActivityStopped(activity);
        }
    }

    /* renamed from: com.urbanairship.app.g$b */
    public class C36037b implements Runnable {
        public C36037b() {
        }

        public void run() {
            boolean unused = C36035g.this.f89027e = false;
            C36035g.this.f89029g.mo17411b(C36035g.this.f89026d);
        }
    }

    /* renamed from: l */
    public static /* synthetic */ int m148334l(C36035g gVar) {
        int i = gVar.f89025c;
        gVar.f89025c = i + 1;
        return i;
    }

    /* renamed from: m */
    public static /* synthetic */ int m148335m(C36035g gVar) {
        int i = gVar.f89025c;
        gVar.f89025c = i - 1;
        return i;
    }

    @C0359n0
    /* renamed from: t */
    public static C36035g m148341t(@C0359n0 Context context) {
        C36035g gVar = f89022j;
        if (gVar != null) {
            return gVar;
        }
        synchronized (C36035g.class) {
            if (f89022j == null) {
                C36035g gVar2 = new C36035g();
                f89022j = gVar2;
                gVar2.mo107778s(context);
            }
        }
        return f89022j;
    }

    /* renamed from: a */
    public void mo18480a(@C0359n0 C36029a aVar) {
        this.f89030h.mo107768b(aVar);
    }

    /* renamed from: b */
    public void mo18481b(@C0359n0 C36031c cVar) {
        this.f89029g.mo107777d(cVar);
    }

    @C0353k0
    @C0359n0
    /* renamed from: c */
    public List<Activity> mo18482c() {
        return Collections.unmodifiableList(this.f89028f);
    }

    /* renamed from: d */
    public boolean mo18483d() {
        return this.f89027e;
    }

    /* renamed from: e */
    public void mo18484e(@C0359n0 C36029a aVar) {
        this.f89030h.mo107767a(aVar);
    }

    /* renamed from: f */
    public void mo18485f(@C0359n0 C36031c cVar) {
        this.f89029g.mo107776c(cVar);
    }

    @C0353k0
    @C0359n0
    /* renamed from: g */
    public List<Activity> mo18486g(@C0359n0 C36064q<Activity> qVar) {
        ArrayList arrayList = new ArrayList();
        for (Activity next : this.f89028f) {
            if (qVar.apply(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C0344h1
    /* renamed from: s */
    public void mo107778s(@C0359n0 Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.f89030h);
    }

    @C0344h1
    /* renamed from: u */
    public void mo107779u(@C0359n0 Context context) {
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f89030h);
    }
}
