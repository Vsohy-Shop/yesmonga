package com.urbanairship;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.urbanairship.v */
public class C36075v {

    /* renamed from: f */
    public static final int f89137f = 1;

    /* renamed from: g */
    public static final int f89138g = 2;

    /* renamed from: h */
    public static final int f89139h = 4;

    /* renamed from: i */
    public static final int f89140i = 8;

    /* renamed from: j */
    public static final int f89141j = 16;

    /* renamed from: k */
    public static final int f89142k = 32;

    /* renamed from: l */
    public static final int f89143l = 64;

    /* renamed from: m */
    public static final int f89144m = 128;

    /* renamed from: n */
    public static final int f89145n = 0;

    /* renamed from: o */
    public static final int f89146o = 255;
    @C0344h1
    @C0359n0

    /* renamed from: p */
    public static final String f89147p = "com.urbanairship.DATA_COLLECTION_ENABLED";
    @C0344h1
    @C0359n0

    /* renamed from: q */
    public static final String f89148q = "com.urbanairship.analytics.ANALYTICS_ENABLED";
    @C0344h1
    @C0359n0

    /* renamed from: r */
    public static final String f89149r = "com.urbanairship.push.PUSH_TOKEN_REGISTRATION_ENABLED";
    @C0344h1
    @C0359n0

    /* renamed from: s */
    public static final String f89150s = "com.urbanairship.push.PUSH_ENABLED";
    @C0344h1
    @C0359n0

    /* renamed from: t */
    public static final String f89151t = "com.urbanairship.chat.CHAT";
    @C0344h1

    /* renamed from: u */
    public static final String f89152u = "com.urbanairship.iam.enabled";

    /* renamed from: a */
    public final String f89153a = "com.urbanairship.PrivacyManager.enabledFeatures";

    /* renamed from: b */
    public final Object f89154b = new Object();

    /* renamed from: c */
    public final List<C36077b> f89155c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final C36071u f89156d;

    /* renamed from: e */
    public volatile int f89157e;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.urbanairship.v$a */
    public @interface C36076a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.urbanairship.v$b */
    public interface C36077b {
        /* renamed from: a */
        void mo17533a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C36075v(@C0359n0 C36071u uVar, int i) {
        this.f89156d = uVar;
        this.f89157e = uVar.mo107844g("com.urbanairship.PrivacyManager.enabledFeatures", i);
    }

    /* renamed from: b */
    public static int m148496b(int... iArr) {
        if (iArr == null) {
            return 0;
        }
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        return i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo107868a(C36077b bVar) {
        this.f89155c.add(bVar);
    }

    /* renamed from: c */
    public void mo107869c(int... iArr) {
        mo107878l((~m148496b(iArr)) & this.f89157e);
    }

    /* renamed from: d */
    public void mo107870d(int... iArr) {
        mo107878l(m148496b(iArr) | this.f89157e);
    }

    /* renamed from: e */
    public int mo107871e() {
        return this.f89157e;
    }

    /* renamed from: f */
    public boolean mo107872f(int... iArr) {
        int e = mo107871e();
        for (int i : iArr) {
            if ((i == 0 && e == 0) || (e & i) == i) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: g */
    public boolean mo107873g() {
        return mo107871e() != 0;
    }

    /* renamed from: h */
    public boolean mo107874h(int... iArr) {
        int e = mo107871e();
        int b = m148496b(iArr);
        if (b == 0) {
            if (e == 0) {
                return true;
            }
            return false;
        } else if ((e & b) == b) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    public void mo107875i() {
        if (this.f89156d.mo107849m(f89147p)) {
            if (this.f89156d.mo107843f(f89147p, false)) {
                mo107877k(255);
            } else {
                mo107877k(0);
            }
            this.f89156d.mo107859x(f89147p);
        }
        if (this.f89156d.mo107849m(f89148q)) {
            if (!this.f89156d.mo107843f(f89148q, true)) {
                mo107869c(16);
            }
            this.f89156d.mo107859x(f89148q);
        }
        if (this.f89156d.mo107849m(f89149r)) {
            if (!this.f89156d.mo107843f(f89149r, true)) {
                mo107869c(4);
            }
            this.f89156d.mo107859x(f89149r);
        }
        if (this.f89156d.mo107849m(f89150s)) {
            if (!this.f89156d.mo107843f(f89150s, true)) {
                mo107869c(4);
            }
            this.f89156d.mo107859x(f89150s);
        }
        if (this.f89156d.mo107849m(f89151t)) {
            if (!this.f89156d.mo107843f(f89151t, true)) {
                mo107869c(8);
            }
            this.f89156d.mo107859x(f89151t);
        }
        if (this.f89156d.mo107849m(f89152u)) {
            if (!this.f89156d.mo107843f(f89152u, true)) {
                mo107869c(1);
            }
            this.f89156d.mo107859x(f89152u);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: j */
    public void mo107876j(C36077b bVar) {
        this.f89155c.remove(bVar);
    }

    /* renamed from: k */
    public void mo107877k(int... iArr) {
        mo107878l(m148496b(iArr));
    }

    /* renamed from: l */
    public final void mo107878l(int i) {
        synchronized (this.f89154b) {
            if (this.f89157e != i) {
                this.f89157e = i;
                this.f89156d.mo107852q("com.urbanairship.PrivacyManager.enabledFeatures", i);
                for (C36077b a : this.f89155c) {
                    a.mo17533a();
                }
            }
        }
    }
}
