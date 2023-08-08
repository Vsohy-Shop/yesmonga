package com.urbanairship.actions;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36044d;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.actions.C35492e;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* renamed from: com.urbanairship.actions.g */
public class C35497g {

    /* renamed from: a */
    public C35492e f87540a;

    /* renamed from: b */
    public String f87541b;

    /* renamed from: c */
    public C35487a f87542c;

    /* renamed from: d */
    public ActionValue f87543d;

    /* renamed from: e */
    public Bundle f87544e;

    /* renamed from: f */
    public Executor f87545f = C36044d.m148370b();

    /* renamed from: g */
    public int f87546g = 0;

    /* renamed from: com.urbanairship.actions.g$a */
    public class C35498a extends C35501c {

        /* renamed from: d */
        public final /* synthetic */ Semaphore f87547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35498a(C35489b bVar, Semaphore semaphore) {
            super(bVar);
            this.f87547d = semaphore;
        }

        /* renamed from: b */
        public void mo106385b(@C0359n0 C35489b bVar, @C0359n0 C35495f fVar) {
            this.f87547d.release();
        }
    }

    /* renamed from: com.urbanairship.actions.g$b */
    public class C35499b extends C35501c {

        /* renamed from: d */
        public final /* synthetic */ C35490c f87549d;

        /* renamed from: e */
        public final /* synthetic */ Handler f87550e;

        /* renamed from: com.urbanairship.actions.g$b$a */
        public class C35500a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C35489b f87552a;

            /* renamed from: b */
            public final /* synthetic */ C35495f f87553b;

            public C35500a(C35489b bVar, C35495f fVar) {
                this.f87552a = bVar;
                this.f87553b = fVar;
            }

            public void run() {
                C35499b.this.f87549d.mo17300a(this.f87552a, this.f87553b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35499b(C35489b bVar, C35490c cVar, Handler handler) {
            super(bVar);
            this.f87549d = cVar;
            this.f87550e = handler;
        }

        /* renamed from: b */
        public void mo106385b(@C0359n0 C35489b bVar, @C0359n0 C35495f fVar) {
            if (this.f87549d != null) {
                if (this.f87550e.getLooper() == Looper.myLooper()) {
                    this.f87549d.mo17300a(bVar, fVar);
                } else {
                    this.f87550e.post(new C35500a(bVar, fVar));
                }
            }
        }
    }

    /* renamed from: com.urbanairship.actions.g$c */
    public abstract class C35501c implements Runnable {

        /* renamed from: a */
        public volatile C35495f f87555a;

        /* renamed from: b */
        public final C35489b f87556b;

        public C35501c(@C0359n0 C35489b bVar) {
            this.f87556b = bVar;
        }

        /* renamed from: b */
        public abstract void mo106385b(@C0359n0 C35489b bVar, @C0359n0 C35495f fVar);

        public final void run() {
            this.f87555a = C35497g.this.mo106373f(this.f87556b);
            mo106385b(this.f87556b, this.f87555a);
        }
    }

    public C35497g(@C0359n0 String str, @C0363p0 C35492e eVar) {
        this.f87541b = str;
        this.f87540a = eVar;
    }

    @C0359n0
    /* renamed from: c */
    public static C35497g m146464c(@C0359n0 C35487a aVar) {
        if (aVar != null) {
            return new C35497g(aVar);
        }
        throw new IllegalArgumentException("Unable to run null action");
    }

    @C0359n0
    /* renamed from: d */
    public static C35497g m146465d(@C0359n0 String str) {
        return new C35497g(str, (C35492e) null);
    }

    @C0359n0
    /* renamed from: e */
    public static C35497g m146466e(@C0359n0 String str, @C0363p0 C35492e eVar) {
        return new C35497g(str, eVar);
    }

    @C0359n0
    /* renamed from: b */
    public final C35489b mo106372b() {
        Bundle bundle;
        if (this.f87544e == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(this.f87544e);
        }
        String str = this.f87541b;
        if (str != null) {
            bundle.putString(C35489b.f87519h, str);
        }
        return new C35489b(this.f87546g, this.f87543d, bundle);
    }

    @C0359n0
    /* renamed from: f */
    public final C35495f mo106373f(@C0359n0 C35489b bVar) {
        String str = this.f87541b;
        if (str != null) {
            C35492e.C35493a g = mo106374g(str);
            if (g == null) {
                return C35495f.m146457e(3);
            }
            if (g.mo106363f() == null || g.mo106363f().mo106318a(bVar)) {
                return g.mo106360c(this.f87546g).mo106346e(bVar);
            }
            C36059m.m148413i("Action %s will not be run. Registry predicate rejected the arguments: %s", this.f87541b, bVar);
            return C35495f.m146457e(2);
        }
        C35487a aVar = this.f87542c;
        if (aVar != null) {
            return aVar.mo106346e(bVar);
        }
        return C35495f.m146457e(3);
    }

    @C0363p0
    /* renamed from: g */
    public final C35492e.C35493a mo106374g(@C0359n0 String str) {
        C35492e eVar = this.f87540a;
        if (eVar != null) {
            return eVar.mo106352b(str);
        }
        return UAirship.m146188Y().mo106219e().mo106352b(str);
    }

    /* renamed from: h */
    public void mo106375h() {
        mo106376i((Looper) null, (C35490c) null);
    }

    /* renamed from: i */
    public void mo106376i(@C0363p0 Looper looper, @C0363p0 C35490c cVar) {
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        C35489b b = mo106372b();
        C35499b bVar = new C35499b(b, cVar, new Handler(looper));
        if (!mo106384q(b)) {
            this.f87545f.execute(bVar);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            bVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(bVar);
        }
    }

    /* renamed from: j */
    public void mo106377j(@C0363p0 C35490c cVar) {
        mo106376i((Looper) null, cVar);
    }

    @C0348i1
    @C0359n0
    /* renamed from: k */
    public C35495f mo106378k() {
        C35489b b = mo106372b();
        Semaphore semaphore = new Semaphore(0);
        C35498a aVar = new C35498a(b, semaphore);
        if (mo106384q(b)) {
            new Handler(Looper.getMainLooper()).post(aVar);
        } else {
            this.f87545f.execute(aVar);
        }
        try {
            semaphore.acquire();
            return aVar.f87555a;
        } catch (InterruptedException e) {
            C36059m.m148409e("Failed to run action with arguments %s", b);
            Thread.currentThread().interrupt();
            return C35495f.m146458f(e);
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public C35497g mo106379l(@C0359n0 Executor executor) {
        this.f87545f = executor;
        return this;
    }

    @C0359n0
    /* renamed from: m */
    public C35497g mo106380m(@C0363p0 Bundle bundle) {
        this.f87544e = bundle;
        return this;
    }

    @C0359n0
    /* renamed from: n */
    public C35497g mo106381n(int i) {
        this.f87546g = i;
        return this;
    }

    @C0359n0
    /* renamed from: o */
    public C35497g mo106382o(@C0363p0 ActionValue actionValue) {
        this.f87543d = actionValue;
        return this;
    }

    @C0359n0
    /* renamed from: p */
    public C35497g mo106383p(@C0363p0 Object obj) {
        try {
            this.f87543d = ActionValue.m146327n(obj);
            return this;
        } catch (ActionValueException e) {
            throw new IllegalArgumentException("Unable to wrap object: " + obj + " as an ActionValue.", e);
        }
    }

    /* renamed from: q */
    public final boolean mo106384q(@C0359n0 C35489b bVar) {
        C35487a aVar = this.f87542c;
        if (aVar != null) {
            return aVar.mo18905f();
        }
        C35492e.C35493a g = mo106374g(this.f87541b);
        if (g == null || !g.mo106360c(bVar.mo106348b()).mo18905f()) {
            return false;
        }
        return true;
    }

    @C0344h1
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C35497g(@C0359n0 C35487a aVar) {
        this.f87542c = aVar;
    }
}
