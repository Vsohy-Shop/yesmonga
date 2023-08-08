package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.play.core.appupdate.C31865a;
import com.google.android.play.core.appupdate.C31868c;
import com.google.android.play.core.appupdate.C31870e;
import com.google.android.play.core.appupdate.C31872f;
import com.google.android.play.core.common.C32014a;
import com.google.android.play.core.install.C32019a;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.model.C32022b;
import com.google.android.play.core.install.model.C32023c;
import com.google.android.play.core.install.model.C32024d;
import com.google.android.play.core.install.model.C32025e;
import com.google.android.play.core.tasks.C32227d;
import com.google.android.play.core.tasks.C32229f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.appupdate.testing.a */
public class C31887a implements C31868c {

    /* renamed from: a */
    public final C31872f f77751a;

    /* renamed from: b */
    public final Context f77752b;

    /* renamed from: c */
    public final List<Integer> f77753c = new ArrayList();
    @C32024d

    /* renamed from: d */
    public int f77754d = 0;
    @C32023c

    /* renamed from: e */
    public int f77755e = 0;

    /* renamed from: f */
    public boolean f77756f = false;

    /* renamed from: g */
    public int f77757g = 0;
    @Nullable

    /* renamed from: h */
    public Integer f77758h = null;

    /* renamed from: i */
    public int f77759i = 0;

    /* renamed from: j */
    public long f77760j = 0;

    /* renamed from: k */
    public long f77761k = 0;

    /* renamed from: l */
    public boolean f77762l = false;

    /* renamed from: m */
    public boolean f77763m = false;

    /* renamed from: n */
    public boolean f77764n = false;
    @Nullable
    @C32022b

    /* renamed from: o */
    public Integer f77765o;

    public C31887a(Context context) {
        this.f77751a = new C31872f(context);
        this.f77752b = context;
    }

    /* renamed from: A */
    public void mo92425A(int i, @C32022b int i2) {
        this.f77756f = true;
        this.f77753c.clear();
        this.f77753c.add(Integer.valueOf(i2));
        this.f77757g = i;
    }

    /* renamed from: B */
    public void mo92426B() {
        this.f77756f = false;
        this.f77758h = null;
    }

    /* renamed from: C */
    public void mo92427C(int i) {
        if (this.f77756f) {
            this.f77759i = i;
        }
    }

    /* renamed from: D */
    public void mo92428D() {
        if (this.f77762l || this.f77763m) {
            this.f77762l = false;
            this.f77754d = 1;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
            }
        }
    }

    /* renamed from: E */
    public void mo92429E() {
        int i = this.f77754d;
        if (i == 1 || i == 2) {
            this.f77754d = 6;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
            }
            this.f77765o = null;
            this.f77763m = false;
            this.f77754d = 0;
        }
    }

    /* renamed from: F */
    public void mo92430F() {
        if (this.f77762l || this.f77763m) {
            this.f77762l = false;
            this.f77763m = false;
            this.f77765o = null;
            this.f77754d = 0;
        }
    }

    /* renamed from: a */
    public final boolean mo92400a(C31865a aVar, Activity activity, C31870e eVar, int i) {
        return mo92431j(aVar, eVar);
    }

    /* renamed from: b */
    public boolean mo92401b(C31865a aVar, @C32022b int i, C32014a aVar2, int i2) {
        return mo92431j(aVar, C31870e.m129280d(i).mo92411a());
    }

    /* renamed from: c */
    public C32227d<Void> mo92402c() {
        int i = this.f77755e;
        if (i != 0) {
            return C32229f.m130361d(new InstallException(i));
        }
        int i2 = this.f77754d;
        if (i2 != 11) {
            return i2 == 3 ? C32229f.m130361d(new InstallException(-8)) : C32229f.m130361d(new InstallException(-7));
        }
        this.f77754d = 3;
        this.f77764n = true;
        Integer num = 0;
        if (num.equals(this.f77765o)) {
            mo92433l();
        }
        return C32229f.m130358a(null);
    }

    /* renamed from: d */
    public C32227d<C31865a> mo92403d() {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        PendingIntent pendingIntent4;
        PendingIntent pendingIntent5;
        PendingIntent pendingIntent6;
        int i = this.f77755e;
        if (i != 0) {
            return C32229f.m130361d(new InstallException(i));
        }
        if (mo92432k() == 2 && this.f77755e == 0) {
            if (this.f77753c.contains(0)) {
                pendingIntent6 = PendingIntent.getBroadcast(this.f77752b, 0, new Intent(), 0);
                pendingIntent5 = PendingIntent.getBroadcast(this.f77752b, 0, new Intent(), 0);
            } else {
                pendingIntent6 = null;
                pendingIntent5 = null;
            }
            if (this.f77753c.contains(1)) {
                PendingIntent broadcast = PendingIntent.getBroadcast(this.f77752b, 0, new Intent(), 0);
                pendingIntent3 = pendingIntent6;
                pendingIntent2 = PendingIntent.getBroadcast(this.f77752b, 0, new Intent(), 0);
                pendingIntent4 = broadcast;
            } else {
                pendingIntent3 = pendingIntent6;
                pendingIntent4 = null;
                pendingIntent2 = null;
            }
            pendingIntent = pendingIntent5;
        } else {
            pendingIntent4 = null;
            pendingIntent3 = null;
            pendingIntent2 = null;
            pendingIntent = null;
        }
        return C32229f.m130358a(C31865a.m129249a(this.f77752b.getPackageName(), this.f77757g, mo92432k(), this.f77754d, this.f77758h, this.f77759i, this.f77760j, this.f77761k, 0, 0, pendingIntent4, pendingIntent3, pendingIntent2, pendingIntent));
    }

    /* renamed from: e */
    public void mo92404e(C32019a aVar) {
        this.f77751a.mo92850d(aVar);
    }

    /* renamed from: f */
    public final boolean mo92405f(C31865a aVar, C32014a aVar2, C31870e eVar, int i) {
        return mo92431j(aVar, eVar);
    }

    /* renamed from: g */
    public final C32227d<Integer> mo92406g(C31865a aVar, Activity activity, C31870e eVar) {
        return mo92431j(aVar, eVar) ? C32229f.m130358a(-1) : C32229f.m130361d(new InstallException(-6));
    }

    /* renamed from: h */
    public boolean mo92407h(C31865a aVar, @C32022b int i, Activity activity, int i2) {
        return mo92431j(aVar, C31870e.m129280d(i).mo92411a());
    }

    /* renamed from: i */
    public void mo92408i(C32019a aVar) {
        this.f77751a.mo92851e(aVar);
    }

    /* renamed from: j */
    public final boolean mo92431j(C31865a aVar, C31870e eVar) {
        int i;
        if (!aVar.mo92393o(eVar) && (!C31870e.m129279c(eVar.mo92410b()).equals(eVar) || !aVar.mo92392n(eVar.mo92410b()))) {
            return false;
        }
        if (eVar.mo92410b() == 1) {
            this.f77763m = true;
            i = 1;
        } else {
            this.f77762l = true;
            i = 0;
        }
        this.f77765o = i;
        return true;
    }

    @C32025e
    /* renamed from: k */
    public final int mo92432k() {
        if (!this.f77756f) {
            return 1;
        }
        int i = this.f77754d;
        return (i == 0 || i == 4 || i == 5 || i == 6) ? 2 : 3;
    }

    /* renamed from: l */
    public final void mo92433l() {
        this.f77751a.mo92853g(InstallState.m129748a(this.f77754d, this.f77760j, this.f77761k, this.f77755e, this.f77752b.getPackageName()));
    }

    /* renamed from: m */
    public void mo92434m() {
        int i = this.f77754d;
        if (i == 2 || i == 1) {
            this.f77754d = 11;
            this.f77760j = 0;
            this.f77761k = 0;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
                return;
            }
            Integer num2 = 1;
            if (num2.equals(this.f77765o)) {
                mo92402c();
            }
        }
    }

    /* renamed from: n */
    public void mo92435n() {
        int i = this.f77754d;
        if (i == 1 || i == 2) {
            this.f77754d = 5;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
            }
            this.f77765o = null;
            this.f77763m = false;
            this.f77754d = 0;
        }
    }

    /* renamed from: o */
    public void mo92436o() {
        if (this.f77754d == 1) {
            this.f77754d = 2;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
            }
        }
    }

    @Nullable
    @C32022b
    /* renamed from: p */
    public Integer mo92437p() {
        return this.f77765o;
    }

    /* renamed from: q */
    public void mo92438q() {
        if (this.f77754d == 3) {
            this.f77754d = 4;
            this.f77756f = false;
            this.f77757g = 0;
            this.f77758h = null;
            this.f77759i = 0;
            this.f77760j = 0;
            this.f77761k = 0;
            this.f77763m = false;
            this.f77764n = false;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
            }
            this.f77765o = null;
            this.f77754d = 0;
        }
    }

    /* renamed from: r */
    public void mo92439r() {
        if (this.f77754d == 3) {
            this.f77754d = 5;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
            }
            this.f77765o = null;
            this.f77764n = false;
            this.f77763m = false;
            this.f77754d = 0;
        }
    }

    /* renamed from: s */
    public boolean mo92440s() {
        return this.f77762l;
    }

    /* renamed from: t */
    public boolean mo92441t() {
        return this.f77763m;
    }

    /* renamed from: u */
    public boolean mo92442u() {
        return this.f77764n;
    }

    /* renamed from: v */
    public void mo92443v(long j) {
        if (this.f77754d == 2 && j <= this.f77761k) {
            this.f77760j = j;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
            }
        }
    }

    /* renamed from: w */
    public void mo92444w(@Nullable Integer num) {
        if (this.f77756f) {
            this.f77758h = num;
        }
    }

    /* renamed from: x */
    public void mo92445x(@C32023c int i) {
        this.f77755e = i;
    }

    /* renamed from: y */
    public void mo92446y(long j) {
        if (this.f77754d == 2) {
            this.f77761k = j;
            Integer num = 0;
            if (num.equals(this.f77765o)) {
                mo92433l();
            }
        }
    }

    /* renamed from: z */
    public void mo92447z(int i) {
        this.f77756f = true;
        this.f77753c.clear();
        this.f77753c.add(0);
        this.f77753c.add(1);
        this.f77757g = i;
    }
}
