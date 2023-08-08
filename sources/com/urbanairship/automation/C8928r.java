package com.urbanairship.automation;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.C36071u;
import com.urbanairship.C36075v;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.automation.C8823d;
import com.urbanairship.automation.C8844g;
import com.urbanairship.automation.C8970v;
import com.urbanairship.automation.actions.C8801a;
import com.urbanairship.automation.auth.AuthException;
import com.urbanairship.automation.auth.C8812b;
import com.urbanairship.automation.deferred.C8829a;
import com.urbanairship.automation.deferred.C8831b;
import com.urbanairship.automation.limits.C8905a;
import com.urbanairship.automation.limits.C8906b;
import com.urbanairship.automation.limits.C8909c;
import com.urbanairship.automation.tags.C8965b;
import com.urbanairship.channel.C9008d;
import com.urbanairship.config.C9061a;
import com.urbanairship.contacts.C9074e;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.RequestException;
import com.urbanairship.iam.C9205j;
import com.urbanairship.iam.C9237v;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.reactive.C9596k;
import com.urbanairship.remotedata.C9619j;
import com.urbanairship.util.RetryingExecutor;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.urbanairship.automation.r */
public class C8928r extends C36040b implements C9205j {

    /* renamed from: y */
    public static final String f23925y = "com.urbanairship.iam.paused";

    /* renamed from: f */
    public final C8970v f23926f;

    /* renamed from: g */
    public final C9008d f23927g;

    /* renamed from: h */
    public final C8844g f23928h;

    /* renamed from: i */
    public final C9237v f23929i;

    /* renamed from: j */
    public final C8965b f23930j;

    /* renamed from: k */
    public final RetryingExecutor f23931k;

    /* renamed from: l */
    public final C8831b f23932l;

    /* renamed from: m */
    public final C8909c f23933m;

    /* renamed from: n */
    public final C36075v f23934n;

    /* renamed from: o */
    public final C8798a f23935o;

    /* renamed from: p */
    public final C8932s f23936p;

    /* renamed from: q */
    public final Map<String, C8818b0<?>> f23937q = new HashMap();

    /* renamed from: r */
    public final Map<String, C8905a> f23938r = new HashMap();

    /* renamed from: s */
    public final Map<String, Uri> f23939s = new HashMap();

    /* renamed from: t */
    public final AtomicBoolean f23940t = new AtomicBoolean(false);

    /* renamed from: u */
    public C9596k f23941u;

    /* renamed from: v */
    public final C8823d f23942v = new C8929a();

    /* renamed from: w */
    public final C8970v.C8973c f23943w = new C8930b();

    /* renamed from: x */
    public final C36075v.C36077b f23944x = new C8901i(this);

    /* renamed from: com.urbanairship.automation.r$a */
    public class C8929a implements C8823d {
        public C8929a() {
        }

        /* renamed from: b */
        public int mo17381b(@C0359n0 C8996y<? extends C8800a0> yVar) {
            return C8928r.this.mo17616k0(yVar);
        }

        /* renamed from: c */
        public void mo17382c(C8996y<? extends C8800a0> yVar) {
            C8928r.this.mo17621n0(yVar);
        }

        /* renamed from: d */
        public void mo17383d(@C0359n0 C8996y<? extends C8800a0> yVar, @C0359n0 C8823d.C8824a aVar) {
            C8928r.this.mo17618l0(yVar, aVar);
        }

        /* renamed from: e */
        public void mo17384e(@C0359n0 C8996y<? extends C8800a0> yVar, @C0363p0 C8828d0 d0Var, @C0359n0 C8823d.C8826c cVar) {
            C8928r.this.mo17619m0(yVar, d0Var, cVar);
        }
    }

    /* renamed from: com.urbanairship.automation.r$b */
    public class C8930b implements C8970v.C8973c {
        public C8930b() {
        }

        @C0359n0
        /* renamed from: a */
        public C36062p<Collection<C8996y<? extends C8800a0>>> mo17630a() {
            return C8928r.this.mo17603a();
        }

        @C0359n0
        /* renamed from: b */
        public C36062p<Boolean> mo17631b(@C0359n0 String str, @C0359n0 C8820c0<? extends C8800a0> c0Var) {
            return C8928r.this.mo17605b(str, c0Var);
        }

        @C0359n0
        /* renamed from: c */
        public C36062p<Boolean> mo17632c(@C0359n0 List<C8996y<? extends C8800a0>> list) {
            return C8928r.this.mo17607c(list);
        }

        /* renamed from: d */
        public Future<Boolean> mo17633d(@C0359n0 Collection<C8906b> collection) {
            return C8928r.this.f23933m.mo17555m(collection);
        }
    }

    /* renamed from: com.urbanairship.automation.r$c */
    public class C8931c implements C8844g.C8874n0 {
        public C8931c() {
        }

        /* renamed from: a */
        public void mo17505a(@C0359n0 C8996y<? extends C8800a0> yVar) {
            C8818b0 O = C8928r.this.mo17594R(yVar);
            if (O != null) {
                O.mo17292a(yVar);
            }
        }

        /* renamed from: b */
        public void mo17506b(@C0359n0 C8996y<? extends C8800a0> yVar) {
            C8818b0 O = C8928r.this.mo17594R(yVar);
            if (O != null) {
                O.mo17298g(yVar);
            }
        }

        /* renamed from: c */
        public void mo17507c(@C0359n0 C8996y<? extends C8800a0> yVar) {
            C8818b0 O = C8928r.this.mo17594R(yVar);
            if (O != null) {
                O.mo17298g(yVar);
            }
        }

        /* renamed from: d */
        public void mo17508d(@C0359n0 C8996y<? extends C8800a0> yVar) {
            C8818b0 O = C8928r.this.mo17594R(yVar);
            if (O != null) {
                O.mo17298g(yVar);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C8928r(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C9061a aVar, @C0359n0 C36075v vVar, @C0359n0 C35518b bVar, @C0359n0 C9619j jVar, @C0359n0 C9008d dVar, @C0359n0 C9074e eVar) {
        super(context, uVar);
        this.f23934n = vVar;
        C8844g gVar = new C8844g(context, aVar, bVar, uVar);
        this.f23928h = gVar;
        this.f23927g = dVar;
        this.f23930j = new C8965b(aVar, dVar, eVar, uVar);
        this.f23926f = new C8970v(uVar, jVar);
        Objects.requireNonNull(gVar);
        C9237v vVar2 = new C9237v(context, uVar, bVar, new C8902j(gVar));
        this.f23929i = vVar2;
        this.f23931k = RetryingExecutor.m36100o(Looper.getMainLooper());
        this.f23932l = new C8831b(aVar, new C8812b(aVar, dVar));
        this.f23935o = new C8798a();
        this.f23936p = new C8932s(vVar2);
        this.f23933m = new C8909c(context, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m33140c0() {
        mo17593Q();
        mo17627t0();
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m33141d0(C8996y yVar, C8823d.C8826c cVar, int i) {
        if (i != 0) {
            this.f23938r.remove(yVar.mo17733B());
        }
        cVar.mo17386a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ RetryingExecutor.C9635d m33142e0(C8996y yVar, C8823d.C8826c cVar) {
        if (!yVar.mo17753z().isEmpty()) {
            C8905a U = mo17597U(yVar);
            if (U == null) {
                return RetryingExecutor.m36101p();
            }
            this.f23938r.put(yVar.mo17733B(), U);
            if (U.mo17536a()) {
                cVar.mo17386a(3);
            }
        }
        return RetryingExecutor.m36098m();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ RetryingExecutor.C9635d m33143f0(C8996y yVar, C8823d.C8826c cVar) {
        if (yVar.mo17745s() == null) {
            return RetryingExecutor.m36098m();
        }
        if (C8819c.m32776a(mo107785o(), yVar.mo17745s())) {
            return RetryingExecutor.m36098m();
        }
        cVar.mo17386a(mo17600X(yVar));
        return RetryingExecutor.m36097i();
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ RetryingExecutor.C9635d m33144g0(C8996y yVar, C8828d0 d0Var, C8823d.C8826c cVar) {
        String J = yVar.mo17741J();
        J.hashCode();
        char c = 65535;
        switch (J.hashCode()) {
            case -1161803523:
                if (J.equals("actions")) {
                    c = 0;
                    break;
                }
                break;
            case -379237425:
                if (J.equals("in_app_message")) {
                    c = 1;
                    break;
                }
                break;
            case 647890911:
                if (J.equals("deferred")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo17622o0(yVar, (C8801a) yVar.mo17744r(), this.f23935o, cVar);
                break;
            case 1:
                mo17622o0(yVar, (InAppMessage) yVar.mo17744r(), this.f23936p, cVar);
                break;
            case 2:
                return mo17623p0(yVar, d0Var, cVar);
        }
        return RetryingExecutor.m36098m();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m33145h0(C8996y yVar, C8823d.C8826c cVar, RetryingExecutor.C9634c[] cVarArr) {
        if (mo17606b0(yVar)) {
            cVar.mo17386a(4);
        } else {
            this.f23931k.mo19592l(cVarArr);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m33146i0(C8996y yVar, C8818b0 b0Var, C8823d.C8826c cVar, int i) {
        if (i == 0) {
            this.f23937q.put(yVar.mo17733B(), b0Var);
        }
        cVar.mo17386a(i);
    }

    @C0359n0
    /* renamed from: s0 */
    public static C8928r m33148s0() {
        return (C8928r) UAirship.m146188Y().mo106211R(C8928r.class);
    }

    /* renamed from: A */
    public void mo17591A() {
        super.mo17591A();
        C9596k kVar = this.f23941u;
        if (kVar != null) {
            kVar.mo19457a();
            this.f23941u = null;
        }
        this.f23928h.mo17434S0();
        this.f23940t.set(false);
        this.f23934n.mo107876j(this.f23944x);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: P */
    public C36062p<Boolean> mo17592P(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17441W(str);
    }

    /* renamed from: Q */
    public final void mo17593Q() {
        synchronized (this.f23943w) {
            if (this.f23934n.mo107874h(1)) {
                mo17595S();
                if (this.f23941u == null) {
                    if (this.f23926f.mo17713h() == -1) {
                        this.f23926f.mo17722y(mo17599W());
                    }
                    this.f23941u = this.f23926f.mo17708A(this.f23943w);
                }
            } else {
                C9596k kVar = this.f23941u;
                if (kVar != null) {
                    kVar.mo19457a();
                    this.f23941u = null;
                }
            }
        }
    }

    @C0363p0
    /* renamed from: R */
    public final C8818b0<? extends C8800a0> mo17594R(C8996y<? extends C8800a0> yVar) {
        String J = yVar.mo17741J();
        J.hashCode();
        char c = 65535;
        switch (J.hashCode()) {
            case -1161803523:
                if (J.equals("actions")) {
                    c = 0;
                    break;
                }
                break;
            case -379237425:
                if (J.equals("in_app_message")) {
                    c = 1;
                    break;
                }
                break;
            case 647890911:
                if (J.equals("deferred")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.f23935o;
            case 1:
                return this.f23936p;
            case 2:
                if ("in_app_message".equals(((C8829a) yVar.mo17744r()).mo17393c())) {
                    return this.f23936p;
                }
                break;
        }
        return null;
    }

    /* renamed from: S */
    public final void mo17595S() {
        if (!this.f23940t.getAndSet(true)) {
            C36059m.m148419o("Starting In-App automation", new Object[0]);
            this.f23928h.mo17432R0(this.f23942v);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: T */
    public C36062p<C8996y<C8829a>> mo17596T(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17456k0(str, "deferred");
    }

    @C0363p0
    /* renamed from: U */
    public final C8905a mo17597U(@C0359n0 C8996y<? extends C8800a0> yVar) {
        try {
            return this.f23933m.mo17551i(yVar.mo17753z()).get();
        } catch (InterruptedException | ExecutionException e) {
            C36059m.m148409e("InAppAutomation - Failed to get Frequency Limit Checker : " + e, new Object[0]);
            return null;
        }
    }

    /* renamed from: V */
    public C9237v mo17598V() {
        return this.f23929i;
    }

    /* renamed from: W */
    public final long mo17599W() {
        try {
            return mo107785o().getPackageManager().getPackageInfo(mo107785o().getPackageName(), 0).firstInstallTime;
        } catch (Exception e) {
            C36059m.m148421q("Unable to get install date", e);
            if (this.f23927g.mo17793Z() == null) {
                return System.currentTimeMillis();
            }
            return 0;
        }
    }

    /* renamed from: X */
    public final int mo17600X(@C0359n0 C8996y<? extends C8800a0> yVar) {
        if (yVar.mo17745s() == null) {
            return 2;
        }
        String d = yVar.mo17745s().mo17333d();
        d.hashCode();
        char c = 65535;
        switch (d.hashCode()) {
            case -1367724422:
                if (d.equals("cancel")) {
                    c = 0;
                    break;
                }
                break;
            case 3532159:
                if (d.equals("skip")) {
                    c = 1;
                    break;
                }
                break;
            case 311930832:
                if (d.equals(C8814b.f23601L0)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 3;
            default:
                return 2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: Y */
    public C36062p<C8996y<? extends C8800a0>> mo17601Y(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17455j0(str);
    }

    @Deprecated
    /* renamed from: Z */
    public boolean mo17602Z() {
        return this.f23934n.mo107874h(1);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public C36062p<Collection<C8996y<? extends C8800a0>>> mo17603a() {
        mo17595S();
        return this.f23928h.mo17457l0();
    }

    /* renamed from: a0 */
    public boolean mo17604a0() {
        return mo107786p().mo107843f(f23925y, false);
    }

    @C0359n0
    /* renamed from: b */
    public C36062p<Boolean> mo17605b(@C0359n0 String str, @C0359n0 C8820c0<? extends C8800a0> c0Var) {
        mo17595S();
        return this.f23928h.mo17453h0(str, c0Var);
    }

    /* renamed from: b0 */
    public final boolean mo17606b0(@C0359n0 C8996y<? extends C8800a0> yVar) {
        return this.f23926f.mo17715j(yVar) && !this.f23926f.mo17716k(yVar);
    }

    @C0359n0
    /* renamed from: c */
    public C36062p<Boolean> mo17607c(@C0359n0 List<C8996y<? extends C8800a0>> list) {
        mo17595S();
        return this.f23928h.mo17426L0(list);
    }

    @C0359n0
    /* renamed from: d */
    public C36062p<Collection<C8996y<InAppMessage>>> mo17608d() {
        mo17595S();
        return this.f23928h.mo17460o0("in_app_message");
    }

    @C0359n0
    /* renamed from: e */
    public C36062p<C8996y<InAppMessage>> mo17609e(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17456k0(str, "in_app_message");
    }

    @C0359n0
    /* renamed from: f */
    public C36062p<Boolean> mo17610f(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17437U(Collections.singletonList(str));
    }

    @C0359n0
    /* renamed from: g */
    public C36062p<Collection<C8996y<InAppMessage>>> mo17611g(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17458m0(str, "in_app_message");
    }

    @C0359n0
    /* renamed from: h */
    public C36062p<C8996y<C8801a>> mo17612h(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17456k0(str, "actions");
    }

    @C0359n0
    /* renamed from: i */
    public C36062p<Boolean> mo17613i(@C0359n0 C8996y<? extends C8800a0> yVar) {
        mo17595S();
        return this.f23928h.mo17425K0(yVar);
    }

    @C0359n0
    /* renamed from: j */
    public C36062p<Collection<C8996y<C8801a>>> mo17614j(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17458m0(str, "actions");
    }

    @C0359n0
    /* renamed from: k */
    public C36062p<Boolean> mo17615k(@C0359n0 String str) {
        mo17595S();
        return this.f23928h.mo17443X(str);
    }

    @C0353k0
    /* renamed from: k0 */
    public final int mo17616k0(@C0359n0 C8996y<? extends C8800a0> yVar) {
        C36059m.m148419o("onCheckExecutionReadiness schedule: %s", yVar.mo17733B());
        if (mo17604a0()) {
            return 0;
        }
        if (mo17606b0(yVar)) {
            C8818b0 remove = this.f23937q.remove(yVar.mo17733B());
            if (remove == null) {
                return -1;
            }
            remove.mo17296e(yVar);
            return -1;
        }
        C8818b0 b0Var = this.f23937q.get(yVar.mo17733B());
        if (b0Var == null) {
            return 0;
        }
        int b = b0Var.mo17293b(yVar);
        if (b != 1) {
            return b;
        }
        C8905a aVar = this.f23938r.get(yVar.mo17733B());
        if (aVar == null || aVar.mo17537b()) {
            return 1;
        }
        b0Var.mo17296e(yVar);
        return 2;
    }

    @C0359n0
    /* renamed from: l */
    public C36062p<Collection<C8996y<C8801a>>> mo17617l() {
        mo17595S();
        return this.f23928h.mo17460o0("actions");
    }

    @C0353k0
    /* renamed from: l0 */
    public final void mo17618l0(@C0359n0 C8996y<? extends C8800a0> yVar, @C0359n0 C8823d.C8824a aVar) {
        C36059m.m148419o("onExecuteTriggeredSchedule schedule: %s", yVar.mo17733B());
        this.f23938r.remove(yVar.mo17733B());
        C8818b0 remove = this.f23937q.remove(yVar.mo17733B());
        if (remove != null) {
            remove.mo17295d(yVar, aVar);
            return;
        }
        C36059m.m148409e("Unexpected schedule type: %s", yVar.mo17741J());
        aVar.mo17385a();
    }

    @C0348i1
    /* renamed from: m0 */
    public final void mo17619m0(@C0359n0 C8996y<? extends C8800a0> yVar, @C0363p0 C8828d0 d0Var, @C0359n0 C8823d.C8826c cVar) {
        C36059m.m148419o("onPrepareSchedule schedule: %s, trigger context: %s", yVar.mo17733B(), d0Var);
        C8903k kVar = new C8903k(this, yVar, cVar);
        RetryingExecutor.C9634c[] cVarArr = {new C8904l(this, yVar, kVar), new C8923m(this, yVar, kVar), new C8924n(this, yVar, d0Var, kVar)};
        if (this.f23926f.mo17715j(yVar)) {
            this.f23926f.mo17710e(false, new C8925o(this, yVar, kVar, cVarArr));
        } else {
            this.f23931k.mo19592l(cVarArr);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return 3;
    }

    /* renamed from: n0 */
    public final void mo17621n0(C8996y<? extends C8800a0> yVar) {
        C36059m.m148419o("onScheduleExecutionInterrupted schedule: %s", yVar.mo17733B());
        C8818b0<? extends C8800a0> R = mo17594R(yVar);
        if (R != null) {
            R.mo17297f(yVar);
        }
    }

    /* renamed from: o0 */
    public final <T extends C8800a0> void mo17622o0(C8996y<? extends C8800a0> yVar, T t, C8818b0<T> b0Var, @C0359n0 C8823d.C8826c cVar) {
        b0Var.mo17294c(yVar, t, new C8926p(this, yVar, b0Var, cVar));
    }

    /* renamed from: p0 */
    public final RetryingExecutor.C9635d mo17623p0(@C0359n0 C8996y<? extends C8800a0> yVar, @C0363p0 C8828d0 d0Var, @C0359n0 C8823d.C8826c cVar) {
        Uri uri;
        C8829a aVar = (C8829a) yVar.mo17744r();
        String Z = this.f23927g.mo17793Z();
        if (Z == null) {
            return RetryingExecutor.m36101p();
        }
        if (this.f23939s.containsKey(yVar.mo17733B())) {
            uri = this.f23939s.get(yVar.mo17733B());
        } else {
            uri = aVar.mo17394d();
        }
        Uri uri2 = uri;
        try {
            C9116c<C8831b.C8834c> c = this.f23932l.mo17399c(uri2, Z, d0Var, this.f23930j.mo17700c(), this.f23930j.mo17698a());
            C8831b.C8834c f = c.mo18144f();
            if (!c.mo18150l() || c.mo18144f() == null) {
                C36059m.m148406b("Failed to resolve deferred schedule. Schedule: %s, Response: %s", yVar.mo17733B(), c.mo18144f());
                Uri b = c.mo18140b();
                long g = c.mo18145g(TimeUnit.MILLISECONDS, -1);
                int i = c.mo18147i();
                if (i == 307) {
                    if (b != null) {
                        this.f23939s.put(yVar.mo17733B(), b);
                    }
                    if (g >= 0) {
                        return RetryingExecutor.m36102q(g);
                    }
                    return RetryingExecutor.m36102q(0);
                } else if (i == 409) {
                    this.f23926f.mo17710e(true, new C8927q(cVar));
                    return RetryingExecutor.m36098m();
                } else if (i != 429) {
                    return RetryingExecutor.m36101p();
                } else {
                    if (b != null) {
                        this.f23939s.put(yVar.mo17733B(), b);
                    }
                    if (g >= 0) {
                        return RetryingExecutor.m36102q(g);
                    }
                    return RetryingExecutor.m36101p();
                }
            } else if (!f.mo17405b()) {
                cVar.mo17386a(mo17600X(yVar));
                return RetryingExecutor.m36097i();
            } else {
                InAppMessage a = f.mo17404a();
                if (a != null) {
                    mo17622o0(yVar, a, this.f23936p, cVar);
                } else {
                    cVar.mo17386a(2);
                }
                return RetryingExecutor.m36098m();
            }
        } catch (RequestException e) {
            if (aVar.mo17392b()) {
                C36059m.m148407c(e, "Failed to resolve deferred schedule, will retry. Schedule: %s", yVar.mo17733B());
                return RetryingExecutor.m36101p();
            }
            C36059m.m148407c(e, "Failed to resolve deferred schedule. Schedule: %s", yVar.mo17733B());
            cVar.mo17386a(2);
            return RetryingExecutor.m36097i();
        } catch (AuthException e2) {
            C36059m.m148407c(e2, "Failed to resolve deferred schedule: %s", yVar.mo17733B());
            return RetryingExecutor.m36101p();
        }
    }

    @Deprecated
    /* renamed from: q0 */
    public void mo17624q0(boolean z) {
        if (z) {
            this.f23934n.mo107870d(1);
            return;
        }
        this.f23934n.mo107869c(1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        this.f23928h.mo17430P0(new C8931c());
        mo17627t0();
    }

    /* renamed from: r0 */
    public void mo17626r0(boolean z) {
        if (mo107786p().mo107843f(f23925y, z) && !z) {
            this.f23928h.mo17446a0();
        }
        mo107786p().mo107857v(f23925y, z);
    }

    /* renamed from: t0 */
    public final void mo17627t0() {
        boolean z = false;
        if (this.f23934n.mo107874h(1) && mo107787s()) {
            z = true;
        }
        this.f23928h.mo17429O0(true ^ z);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: u */
    public void mo17628u(@C0359n0 UAirship uAirship) {
        super.mo17628u(uAirship);
        this.f23929i.mo18578z();
        this.f23934n.mo107868a(this.f23944x);
        mo17593Q();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: v */
    public void mo17629v(boolean z) {
        mo17627t0();
    }

    @C0344h1
    public C8928r(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C8844g gVar, @C0359n0 C9008d dVar, @C0359n0 C8965b bVar, @C0359n0 C8970v vVar2, @C0359n0 C9237v vVar3, @C0359n0 RetryingExecutor retryingExecutor, @C0359n0 C8831b bVar2, @C0359n0 C8798a aVar, @C0359n0 C8932s sVar, @C0359n0 C8909c cVar) {
        super(context, uVar);
        this.f23934n = vVar;
        this.f23928h = gVar;
        this.f23927g = dVar;
        this.f23930j = bVar;
        this.f23926f = vVar2;
        this.f23929i = vVar3;
        this.f23931k = retryingExecutor;
        this.f23932l = bVar2;
        this.f23935o = aVar;
        this.f23936p = sVar;
        this.f23933m = cVar;
    }
}
