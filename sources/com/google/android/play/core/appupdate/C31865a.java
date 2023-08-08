package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.play.core.install.model.C32022b;
import com.google.android.play.core.install.model.C32024d;
import com.google.android.play.core.install.model.C32025e;

/* renamed from: com.google.android.play.core.appupdate.a */
public abstract class C31865a {
    /* renamed from: a */
    public static C31865a m129249a(@NonNull String str, int i, @C32025e int i2, @C32024d int i3, @Nullable Integer num, int i4, long j, long j2, long j3, long j4, @Nullable PendingIntent pendingIntent, @Nullable PendingIntent pendingIntent2, @Nullable PendingIntent pendingIntent3, @Nullable PendingIntent pendingIntent4) {
        return new C31889v(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    /* renamed from: b */
    public abstract int mo92380b();

    /* renamed from: c */
    public abstract long mo92381c();

    /* renamed from: d */
    public abstract long mo92382d();

    /* renamed from: e */
    public abstract long mo92383e();

    @Nullable
    /* renamed from: f */
    public abstract Integer mo92384f();

    @Nullable
    /* renamed from: g */
    public abstract PendingIntent mo92385g();

    @Nullable
    /* renamed from: h */
    public abstract PendingIntent mo92386h();

    @Nullable
    /* renamed from: i */
    public abstract PendingIntent mo92387i();

    @Nullable
    /* renamed from: j */
    public abstract PendingIntent mo92388j();

    @Nullable
    /* renamed from: k */
    public final PendingIntent mo92389k(C31870e eVar) {
        if (eVar.mo92410b() != 0) {
            if (eVar.mo92410b() == 1) {
                if (mo92385g() != null) {
                    return mo92385g();
                }
                if (mo92390l(eVar)) {
                    return mo92387i();
                }
            }
            return null;
        } else if (mo92386h() != null) {
            return mo92386h();
        } else {
            if (mo92390l(eVar)) {
                return mo92388j();
            }
            return null;
        }
    }

    /* renamed from: l */
    public final boolean mo92390l(C31870e eVar) {
        return eVar.mo92409a() && mo92381c() <= mo92383e();
    }

    @C32024d
    /* renamed from: m */
    public abstract int mo92391m();

    /* renamed from: n */
    public boolean mo92392n(@C32022b int i) {
        return mo92389k(C31870e.m129279c(i)) != null;
    }

    /* renamed from: o */
    public boolean mo92393o(@NonNull C31870e eVar) {
        return mo92389k(eVar) != null;
    }

    @NonNull
    /* renamed from: p */
    public abstract String mo92394p();

    /* renamed from: q */
    public abstract long mo92395q();

    @C32025e
    /* renamed from: r */
    public abstract int mo92396r();

    /* renamed from: s */
    public abstract int mo92397s();
}
