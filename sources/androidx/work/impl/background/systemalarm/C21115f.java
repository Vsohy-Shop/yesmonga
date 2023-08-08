package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.work.C21377l;
import androidx.work.impl.C21361v;
import androidx.work.impl.background.systemalarm.C21116g;
import androidx.work.impl.constraints.C21139c;
import androidx.work.impl.constraints.C21153e;
import androidx.work.impl.constraints.trackers.C21172o;
import androidx.work.impl.model.C21237m;
import androidx.work.impl.model.C21249u;
import androidx.work.impl.model.C21273x;
import androidx.work.impl.utils.C21300c0;
import androidx.work.impl.utils.C21326i0;
import com.carrefour.fid.android.core.extension.C36306e;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.f */
public class C21115f implements C21139c, C21326i0.C21327a {

    /* renamed from: E0 */
    public static final int f54530E0 = 2;

    /* renamed from: X */
    public static final String f54531X = C21377l.m98584i("DelayMetCommandHandler");

    /* renamed from: Y */
    public static final int f54532Y = 0;

    /* renamed from: Z */
    public static final int f54533Z = 1;

    /* renamed from: a */
    public final Context f54534a;

    /* renamed from: b */
    public final int f54535b;

    /* renamed from: c */
    public final C21237m f54536c;

    /* renamed from: d */
    public final C21116g f54537d;

    /* renamed from: e */
    public final C21153e f54538e;

    /* renamed from: f */
    public final Object f54539f = new Object();

    /* renamed from: g */
    public int f54540g = 0;

    /* renamed from: v */
    public final Executor f54541v;

    /* renamed from: w */
    public final Executor f54542w;
    @C0363p0

    /* renamed from: x */
    public PowerManager.WakeLock f54543x;

    /* renamed from: y */
    public boolean f54544y = false;

    /* renamed from: z */
    public final C21361v f54545z;

    public C21115f(@C0359n0 Context context, int i, @C0359n0 C21116g gVar, @C0359n0 C21361v vVar) {
        this.f54534a = context;
        this.f54535b = i;
        this.f54537d = gVar;
        this.f54536c = vVar.mo63718a();
        this.f54545z = vVar;
        C21172o O = gVar.mo63257g().mo63362O();
        this.f54541v = gVar.mo63256f().mo63699b();
        this.f54542w = gVar.mo63256f().mo63698a();
        this.f54538e = new C21153e(O, (C21139c) this);
    }

    /* renamed from: a */
    public void mo63219a(@C0359n0 List<C21249u> list) {
        this.f54541v.execute(new C21113d(this));
    }

    /* renamed from: b */
    public void mo63246b(@C0359n0 C21237m mVar) {
        C21377l e = C21377l.m98582e();
        String str = f54531X;
        e.mo63774a(str, "Exceeded time limits on execution for " + mVar);
        this.f54541v.execute(new C21113d(this));
    }

    /* renamed from: e */
    public final void mo63247e() {
        synchronized (this.f54539f) {
            this.f54538e.reset();
            this.f54537d.mo63258h().mo63682d(this.f54536c);
            PowerManager.WakeLock wakeLock = this.f54543x;
            if (wakeLock != null && wakeLock.isHeld()) {
                C21377l e = C21377l.m98582e();
                String str = f54531X;
                e.mo63774a(str, "Releasing wakelock " + this.f54543x + "for WorkSpec " + this.f54536c);
                this.f54543x.release();
            }
        }
    }

    /* renamed from: f */
    public void mo63224f(@C0359n0 List<C21249u> list) {
        for (C21249u a : list) {
            if (C21273x.m98280a(a).equals(this.f54536c)) {
                this.f54541v.execute(new C21114e(this));
                return;
            }
        }
    }

    @C0348i1
    /* renamed from: g */
    public void mo63248g() {
        String f = this.f54536c.mo63437f();
        Context context = this.f54534a;
        this.f54543x = C21300c0.m98371b(context, f + C36306e.f89637a + this.f54535b + ")");
        C21377l e = C21377l.m98582e();
        String str = f54531X;
        e.mo63774a(str, "Acquiring wakelock " + this.f54543x + "for WorkSpec " + f);
        this.f54543x.acquire();
        C21249u l = this.f54537d.mo63257g().mo63363P().mo63207X().mo63539l(f);
        if (l == null) {
            this.f54541v.execute(new C21113d(this));
            return;
        }
        boolean B = l.mo63454B();
        this.f54544y = B;
        if (!B) {
            C21377l e2 = C21377l.m98582e();
            e2.mo63774a(str, "No constraints for " + f);
            mo63224f(Collections.singletonList(l));
            return;
        }
        this.f54538e.mo63305a(Collections.singletonList(l));
    }

    /* renamed from: h */
    public void mo63249h(boolean z) {
        C21377l e = C21377l.m98582e();
        String str = f54531X;
        e.mo63774a(str, "onExecuted " + this.f54536c + ", " + z);
        mo63247e();
        if (z) {
            this.f54542w.execute(new C21116g.C21118b(this.f54537d, C21111b.m97721f(this.f54534a, this.f54536c), this.f54535b));
        }
        if (this.f54544y) {
            this.f54542w.execute(new C21116g.C21118b(this.f54537d, C21111b.m97717a(this.f54534a), this.f54535b));
        }
    }

    /* renamed from: i */
    public final void mo63250i() {
        if (this.f54540g == 0) {
            this.f54540g = 1;
            C21377l e = C21377l.m98582e();
            String str = f54531X;
            e.mo63774a(str, "onAllConstraintsMet for " + this.f54536c);
            if (this.f54537d.mo63255e().mo63611q(this.f54545z)) {
                this.f54537d.mo63258h().mo63681c(this.f54536c, 600000, this);
            } else {
                mo63247e();
            }
        } else {
            C21377l e2 = C21377l.m98582e();
            String str2 = f54531X;
            e2.mo63774a(str2, "Already started work for " + this.f54536c);
        }
    }

    /* renamed from: j */
    public final void mo63251j() {
        String f = this.f54536c.mo63437f();
        if (this.f54540g < 2) {
            this.f54540g = 2;
            C21377l e = C21377l.m98582e();
            String str = f54531X;
            e.mo63774a(str, "Stopping work for WorkSpec " + f);
            this.f54542w.execute(new C21116g.C21118b(this.f54537d, C21111b.m97722g(this.f54534a, this.f54536c), this.f54535b));
            if (this.f54537d.mo63255e().mo63608l(this.f54536c.mo63437f())) {
                C21377l e2 = C21377l.m98582e();
                e2.mo63774a(str, "WorkSpec " + f + " needs to be rescheduled");
                this.f54542w.execute(new C21116g.C21118b(this.f54537d, C21111b.m97721f(this.f54534a, this.f54536c), this.f54535b));
                return;
            }
            C21377l e3 = C21377l.m98582e();
            e3.mo63774a(str, "Processor does not have WorkSpec " + f + ". No need to reschedule");
            return;
        }
        C21377l e4 = C21377l.m98582e();
        String str2 = f54531X;
        e4.mo63774a(str2, "Already stopped work for " + f);
    }
}
