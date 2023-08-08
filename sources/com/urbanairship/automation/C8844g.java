package com.urbanairship.automation;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17970d;
import com.urbanairship.C36051i;
import com.urbanairship.C36059m;
import com.urbanairship.C36062p;
import com.urbanairship.C36064q;
import com.urbanairship.C36071u;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.analytics.C35528c;
import com.urbanairship.analytics.C35551h;
import com.urbanairship.analytics.location.C35563d;
import com.urbanairship.app.C36029a;
import com.urbanairship.app.C36030b;
import com.urbanairship.app.C36031c;
import com.urbanairship.app.C36038h;
import com.urbanairship.automation.C8823d;
import com.urbanairship.automation.C8975w;
import com.urbanairship.automation.alarms.C8804a;
import com.urbanairship.automation.alarms.C8809b;
import com.urbanairship.automation.storage.AutomationDatabase;
import com.urbanairship.automation.storage.C8937a;
import com.urbanairship.automation.storage.C8938b;
import com.urbanairship.automation.storage.C8946e;
import com.urbanairship.automation.storage.C8950g;
import com.urbanairship.automation.storage.C8954h;
import com.urbanairship.automation.storage.C8956j;
import com.urbanairship.config.C9061a;
import com.urbanairship.iam.C9202i;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import com.urbanairship.reactive.C9550c;
import com.urbanairship.reactive.C9551d;
import com.urbanairship.reactive.C9587f;
import com.urbanairship.reactive.C9588g;
import com.urbanairship.reactive.C9593i;
import com.urbanairship.reactive.C9595j;
import com.urbanairship.reactive.C9596k;
import com.urbanairship.remoteconfig.C9602c;
import com.urbanairship.util.C9641c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.urbanairship.automation.g */
public class C8844g {

    /* renamed from: A */
    public final C8975w.C8977b f23715A;

    /* renamed from: B */
    public final C8868l0 f23716B;

    /* renamed from: a */
    public long f23717a;

    /* renamed from: b */
    public final List<Integer> f23718b;

    /* renamed from: c */
    public final Comparator<C8946e> f23719c;

    /* renamed from: d */
    public final C36030b f23720d;

    /* renamed from: e */
    public C8823d f23721e;

    /* renamed from: f */
    public final C35518b f23722f;

    /* renamed from: g */
    public final C8809b f23723g;

    /* renamed from: h */
    public volatile boolean f23724h;

    /* renamed from: i */
    public Handler f23725i;

    /* renamed from: j */
    public final Handler f23726j;

    /* renamed from: k */
    public C8874n0 f23727k;

    /* renamed from: l */
    public final C8950g f23728l;

    /* renamed from: m */
    public long f23729m;

    /* renamed from: n */
    public final SparseArray<Long> f23730n;

    /* renamed from: o */
    public C8975w f23731o;
    @C0344h1

    /* renamed from: p */
    public HandlerThread f23732p;

    /* renamed from: q */
    public final List<C8876o0> f23733q;

    /* renamed from: r */
    public String f23734r;

    /* renamed from: s */
    public String f23735s;

    /* renamed from: t */
    public C9593i<C8880q0> f23736t;

    /* renamed from: u */
    public C9596k f23737u;

    /* renamed from: v */
    public C9587f f23738v;

    /* renamed from: w */
    public final C8937a f23739w;

    /* renamed from: x */
    public final C36031c f23740x;

    /* renamed from: y */
    public final C36029a f23741y;

    /* renamed from: z */
    public final C35528c f23742z;

    /* renamed from: com.urbanairship.automation.g$a */
    public class C8845a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f23743a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23744b;

        public C8845a(String str, C36062p pVar) {
            this.f23743a = str;
            this.f23744b = pVar;
        }

        public void run() {
            List<C8946e> n = C8844g.this.f23739w.mo17650n(this.f23743a);
            if (n.isEmpty()) {
                C36059m.m148419o("Failed to cancel schedule group: %s", this.f23743a);
                this.f23744b.mo107828g(Boolean.FALSE);
                return;
            }
            C8844g.this.f23739w.mo17639c(n);
            C8844g.this.mo17444Y(Collections.singletonList(this.f23743a));
            C8844g.this.mo17468y0(n);
        }
    }

    /* renamed from: com.urbanairship.automation.g$a0 */
    public class C8846a0 implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C8876o0 f23746a;

        public C8846a0(C8876o0 o0Var) {
            this.f23746a = o0Var;
        }

        public void run() {
            C8844g.this.f23733q.remove(this.f23746a);
        }
    }

    /* renamed from: com.urbanairship.automation.g$b */
    public class C8847b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f23748a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23749b;

        public C8847b(String str, C36062p pVar) {
            this.f23748a = str;
            this.f23749b = pVar;
        }

        public void run() {
            C8844g.this.mo17447b0();
            this.f23749b.mo107828g(C8844g.this.mo17449d0(C8844g.this.f23739w.mo17649m(this.f23748a)));
        }
    }

    /* renamed from: com.urbanairship.automation.g$b0 */
    public class C8848b0 extends C8876o0 {
        public C8848b0(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: h */
        public void mo17473h() {
            C8946e g = C8844g.this.f23739w.mo17643g(this.f23808v);
            if (g != null && g.f23968a.f24023n == 3) {
                if (C8844g.this.mo17465t0(g)) {
                    C8844g.this.mo17463r0(g);
                    return;
                }
                long j = g.f23968a.f24024o;
                C8844g.this.mo17440V0(g, 0);
                C8844g.this.f23739w.mo17656t(g);
                C8844g.this.mo17436T0(g, j);
            }
        }
    }

    /* renamed from: com.urbanairship.automation.g$c */
    public class C8849c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f23752a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23753b;

        public C8849c(String str, C36062p pVar) {
            this.f23752a = str;
            this.f23753b = pVar;
        }

        public void run() {
            C8844g.this.mo17447b0();
            C8844g gVar = C8844g.this;
            this.f23753b.mo107828g(gVar.mo17448c0(gVar.f23739w.mo17643g(this.f23752a)));
        }
    }

    /* renamed from: com.urbanairship.automation.g$c0 */
    public class C8850c0 implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C8876o0 f23755a;

        public C8850c0(C8876o0 o0Var) {
            this.f23755a = o0Var;
        }

        public void run() {
            C8844g.this.f23733q.remove(this.f23755a);
        }
    }

    /* renamed from: com.urbanairship.automation.g$d */
    public class C8851d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f23757a;

        /* renamed from: b */
        public final /* synthetic */ String f23758b;

        /* renamed from: c */
        public final /* synthetic */ C36062p f23759c;

        public C8851d(String str, String str2, C36062p pVar) {
            this.f23757a = str;
            this.f23758b = str2;
            this.f23759c = pVar;
        }

        public void run() {
            C8844g.this.mo17447b0();
            C8844g gVar = C8844g.this;
            this.f23759c.mo107828g(gVar.mo17448c0(gVar.f23739w.mo17644h(this.f23757a, this.f23758b)));
        }
    }

    /* renamed from: com.urbanairship.automation.g$d0 */
    public class C8852d0 extends C36038h {
        public C8852d0() {
        }

        public void onActivityResumed(@C0359n0 Activity activity) {
            C8844g.this.mo17446a0();
        }
    }

    /* renamed from: com.urbanairship.automation.g$e */
    public class C8853e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C36062p f23762a;

        /* renamed from: b */
        public final /* synthetic */ Set f23763b;

        public C8853e(C36062p pVar, Set set) {
            this.f23762a = pVar;
            this.f23763b = set;
        }

        public void run() {
            C8844g.this.mo17447b0();
            C36062p pVar = this.f23762a;
            C8844g gVar = C8844g.this;
            pVar.mo107828g(gVar.mo17450e0(gVar.f23739w.mo17647k(this.f23763b)));
        }
    }

    /* renamed from: com.urbanairship.automation.g$e0 */
    public class C8854e0 implements C35528c {
        public C8854e0() {
        }

        /* renamed from: a */
        public void mo17479a(@C0359n0 String str) {
            String unused = C8844g.this.f23734r = str;
            C8844g.this.mo17418D0(JsonValue.m34968N(str), 7, 1.0d);
            C8844g.this.mo17446a0();
        }

        /* renamed from: b */
        public void mo17480b(@C0359n0 C35563d dVar) {
            int i;
            String unused = C8844g.this.f23735s = dVar.mo17264q().mo18749A().mo18801A("region_id").mo18769l();
            if (dVar.mo106538n() == 1) {
                i = 3;
            } else {
                i = 4;
            }
            C8844g.this.mo17418D0(dVar.mo17264q(), i, 1.0d);
            C8844g.this.mo17446a0();
        }

        /* renamed from: c */
        public void mo17481c(@C0359n0 C35551h hVar) {
            C8844g.this.mo17418D0(hVar.mo17264q(), 5, 1.0d);
            BigDecimal o = hVar.mo106492o();
            if (o != null) {
                C8844g.this.mo17418D0(hVar.mo17264q(), 6, o.doubleValue());
            }
        }
    }

    /* renamed from: com.urbanairship.automation.g$f */
    public class C8855f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f23766a;

        /* renamed from: b */
        public final /* synthetic */ String f23767b;

        /* renamed from: c */
        public final /* synthetic */ C36062p f23768c;

        public C8855f(String str, String str2, C36062p pVar) {
            this.f23766a = str;
            this.f23767b = str2;
            this.f23768c = pVar;
        }

        public void run() {
            C8844g.this.mo17447b0();
            C8844g gVar = C8844g.this;
            this.f23768c.mo107828g(gVar.mo17449d0(gVar.f23739w.mo17651o(this.f23766a, this.f23767b)));
        }
    }

    /* renamed from: com.urbanairship.automation.g$f0 */
    public class C8856f0 implements Runnable {
        public C8856f0() {
        }

        public void run() {
            C8844g.this.f23728l.mo17678b(C8844g.this.f23739w);
            C8844g.this.mo17454i0();
            C8844g.this.mo17447b0();
            C8844g.this.mo17421G0();
            C8844g.this.mo17423I0();
            C8844g.this.mo17424J0();
            C8844g gVar = C8844g.this;
            gVar.mo17420F0(gVar.f23739w.mo17652p(6));
        }
    }

    /* renamed from: com.urbanairship.automation.g$g */
    public class C8857g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f23771a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23772b;

        /* renamed from: c */
        public final /* synthetic */ C8820c0 f23773c;

        public C8857g(String str, C36062p pVar, C8820c0 c0Var) {
            this.f23771a = str;
            this.f23772b = pVar;
            this.f23773c = c0Var;
        }

        public void run() {
            boolean z;
            long j;
            C8946e g = C8844g.this.f23739w.mo17643g(this.f23771a);
            if (g == null) {
                C36059m.m148409e("AutomationEngine - Schedule no longer exists. Unable to edit: %s", this.f23771a);
                this.f23772b.mo107828g(Boolean.FALSE);
                return;
            }
            C8844g.this.mo17433S(g, this.f23773c);
            boolean o = C8844g.this.mo17466u0(g);
            boolean q = C8844g.this.mo17465t0(g);
            C8954h hVar = g.f23968a;
            int i = hVar.f24023n;
            if (i != 4 || o || q) {
                if (i != 4 && (o || q)) {
                    C8844g.this.mo17440V0(g, 4);
                    if (o) {
                        C8844g.this.mo17417C0(g);
                    } else {
                        C8844g.this.mo17469z0(Collections.singleton(g));
                    }
                }
                j = -1;
                z = false;
            } else {
                j = hVar.f24024o;
                C8844g.this.mo17440V0(g, 0);
                z = true;
            }
            C8844g.this.f23739w.mo17656t(g);
            if (z) {
                C8844g.this.mo17436T0(g, j);
            }
            C36059m.m148419o("Updated schedule: %s", this.f23771a);
            this.f23772b.mo107828g(Boolean.TRUE);
        }
    }

    /* renamed from: com.urbanairship.automation.g$g0 */
    public class C8858g0 implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C36062p f23775a;

        /* renamed from: b */
        public final /* synthetic */ C8996y f23776b;

        public C8858g0(C36062p pVar, C8996y yVar) {
            this.f23775a = pVar;
            this.f23776b = yVar;
        }

        public void run() {
            C8844g.this.mo17447b0();
            if (((long) C8844g.this.f23739w.mo17645i()) >= C8844g.this.f23717a) {
                C36059m.m148409e("AutomationEngine - Unable to insert schedule due to schedule exceeded limit.", new Object[0]);
                this.f23775a.mo107828g(Boolean.FALSE);
                return;
            }
            C8946e c = C9000z.m33492c(this.f23776b);
            C8844g.this.f23739w.mo17653q(c);
            C8844g.this.mo17438U0(Collections.singletonList(c));
            C8844g.this.mo17416B0(Collections.singletonList(this.f23776b));
            C36059m.m148419o("Scheduled entries: %s", this.f23776b);
            this.f23775a.mo107828g(Boolean.TRUE);
        }
    }

    /* renamed from: com.urbanairship.automation.g$h */
    public class C8859h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C36062p f23778a;

        public C8859h(C36062p pVar) {
            this.f23778a = pVar;
        }

        public void run() {
            C36062p pVar = this.f23778a;
            C8844g gVar = C8844g.this;
            pVar.mo107828g(gVar.mo17450e0(gVar.f23739w.mo17646j()));
        }
    }

    /* renamed from: com.urbanairship.automation.g$h0 */
    public class C8860h0 implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f23780a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23781b;

        public C8860h0(List list, C36062p pVar) {
            this.f23780a = list;
            this.f23781b = pVar;
        }

        public void run() {
            C8844g.this.mo17447b0();
            if (((long) (C8844g.this.f23739w.mo17645i() + this.f23780a.size())) > C8844g.this.f23717a) {
                C36059m.m148409e("AutomationDataManager - Unable to insert schedule due to schedule exceeded limit.", new Object[0]);
                this.f23781b.mo107828g(Boolean.FALSE);
                return;
            }
            List<C8946e> e = C9000z.m33494e(this.f23780a);
            if (e.isEmpty()) {
                this.f23781b.mo107828g(Boolean.FALSE);
                return;
            }
            C8844g.this.f23739w.mo17655s(e);
            C8844g.this.mo17438U0(e);
            Collection i = C8844g.this.mo17450e0(e);
            C8844g.this.mo17416B0(i);
            C36059m.m148419o("Scheduled entries: %s", i);
            this.f23781b.mo107828g(Boolean.TRUE);
        }
    }

    /* renamed from: com.urbanairship.automation.g$i */
    public class C8861i implements C9550c<C9333e, C8880q0> {

        /* renamed from: a */
        public final /* synthetic */ int f23783a;

        public C8861i(int i) {
            this.f23783a = i;
        }

        @C0359n0
        /* renamed from: a */
        public C8880q0 apply(@C0359n0 C9333e eVar) {
            C8844g.this.f23730n.put(this.f23783a, Long.valueOf(System.currentTimeMillis()));
            return new C8880q0(C8844g.this.f23739w.mo17641e(this.f23783a), eVar, 1.0d);
        }
    }

    /* renamed from: com.urbanairship.automation.g$i0 */
    public class C8862i0 implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Collection f23785a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23786b;

        public C8862i0(Collection collection, C36062p pVar) {
            this.f23785a = collection;
            this.f23786b = pVar;
        }

        public void run() {
            List<C8946e> k = C8844g.this.f23739w.mo17647k(this.f23785a);
            if (k.isEmpty()) {
                this.f23786b.mo107828g(Boolean.FALSE);
                return;
            }
            C36059m.m148419o("Cancelled schedules: %s", this.f23785a);
            C8844g.this.f23739w.mo17639c(k);
            C8844g.this.mo17468y0(k);
            C8844g.this.mo17445Z(this.f23785a);
            this.f23786b.mo107828g(Boolean.TRUE);
        }
    }

    /* renamed from: com.urbanairship.automation.g$j */
    public class C8863j extends C9595j<C8880q0> {
        public C8863j() {
        }

        /* renamed from: d */
        public void mo17490c(@C0359n0 C8880q0 q0Var) {
            C8844g.this.mo17442W0(q0Var.f23823a, q0Var.f23824b, q0Var.f23825c);
        }
    }

    /* renamed from: com.urbanairship.automation.g$j0 */
    public class C8864j0 implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f23789a;

        /* renamed from: b */
        public final /* synthetic */ C36062p f23790b;

        public C8864j0(String str, C36062p pVar) {
            this.f23789a = str;
            this.f23790b = pVar;
        }

        public void run() {
            List<C8946e> m = C8844g.this.f23739w.mo17649m(this.f23789a);
            if (m.isEmpty()) {
                this.f23790b.mo107828g(Boolean.FALSE);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (C8946e eVar : m) {
                arrayList.add(eVar.f23968a.f24011b);
            }
            C36059m.m148419o("Cancelled schedules: %s", arrayList);
            C8844g.this.f23739w.mo17639c(m);
            C8844g.this.mo17468y0(m);
            C8844g.this.mo17445Z(arrayList);
            this.f23790b.mo107828g(Boolean.TRUE);
        }
    }

    /* renamed from: com.urbanairship.automation.g$k */
    public class C8865k implements Comparator<C8946e> {
        public C8865k() {
        }

        /* renamed from: a */
        public int compare(@C0359n0 C8946e eVar, @C0359n0 C8946e eVar2) {
            int i = eVar.f23968a.f24015f;
            int i2 = eVar2.f23968a.f24015f;
            if (i == i2) {
                return 0;
            }
            return i > i2 ? 1 : -1;
        }
    }

    /* renamed from: com.urbanairship.automation.g$k0 */
    public interface C8866k0 {
        /* renamed from: a */
        void mo17495a(@C0359n0 C8874n0 n0Var, @C0359n0 C8996y<? extends C8800a0> yVar);
    }

    /* renamed from: com.urbanairship.automation.g$l */
    public class C8867l implements Runnable {
        public C8867l() {
        }

        public void run() {
            C8844g gVar = C8844g.this;
            gVar.mo17438U0(gVar.f23739w.mo17646j());
        }
    }

    /* renamed from: com.urbanairship.automation.g$l0 */
    public class C8868l0 {

        /* renamed from: a */
        public final AtomicBoolean f23794a = new AtomicBoolean(false);

        /* renamed from: b */
        public final List<C17970d<Boolean>> f23795b = new CopyOnWriteArrayList();

        public C8868l0() {
        }

        /* renamed from: a */
        public void mo17497a(C17970d<Boolean> dVar) {
            this.f23795b.add(dVar);
        }

        /* renamed from: b */
        public boolean mo17498b() {
            return this.f23794a.get();
        }

        /* renamed from: c */
        public void mo17499c(C17970d<Boolean> dVar) {
            this.f23795b.remove(dVar);
        }

        /* renamed from: d */
        public void mo17500d(boolean z) {
            if (this.f23794a.compareAndSet(!z, z)) {
                for (C17970d<Boolean> accept : this.f23795b) {
                    accept.accept(Boolean.valueOf(z));
                }
            }
        }
    }

    /* renamed from: com.urbanairship.automation.g$m */
    public class C8869m extends C9595j<C8880q0> {
        public C8869m() {
        }

        /* renamed from: d */
        public void mo17490c(@C0359n0 C8880q0 q0Var) {
            C8844g.this.f23736t.mo17490c(q0Var);
        }
    }

    /* renamed from: com.urbanairship.automation.g$m0 */
    public class C8870m0 implements C8823d.C8824a {

        /* renamed from: a */
        public final String f23798a;

        /* renamed from: com.urbanairship.automation.g$m0$a */
        public class C8871a implements Runnable {
            public C8871a() {
            }

            public void run() {
                C8844g gVar = C8844g.this;
                gVar.mo17419E0(gVar.f23739w.mo17643g(C8870m0.this.f23798a));
            }
        }

        public C8870m0(String str) {
            this.f23798a = str;
        }

        /* renamed from: a */
        public void mo17385a() {
            C8844g.this.f23725i.post(new C8871a());
        }
    }

    /* renamed from: com.urbanairship.automation.g$n */
    public class C8872n implements C9550c<Integer, C9551d<C8880q0>> {

        /* renamed from: a */
        public final /* synthetic */ C8946e f23801a;

        /* renamed from: com.urbanairship.automation.g$n$a */
        public class C8873a implements C9550c<C9333e, C8880q0> {

            /* renamed from: a */
            public final /* synthetic */ Integer f23803a;

            public C8873a(Integer num) {
                this.f23803a = num;
            }

            @C0359n0
            /* renamed from: a */
            public C8880q0 apply(@C0359n0 C9333e eVar) {
                return new C8880q0(C8844g.this.f23739w.mo17642f(this.f23803a.intValue(), C8872n.this.f23801a.f23968a.f24011b), eVar, 1.0d);
            }
        }

        public C8872n(C8946e eVar) {
            this.f23801a = eVar;
        }

        @C0359n0
        /* renamed from: a */
        public C9551d<C8880q0> apply(@C0359n0 Integer num) {
            return C8844g.this.mo17452g0(num.intValue()).mo19466t(C8844g.this.f23738v).mo19465p(new C8873a(num));
        }
    }

    /* renamed from: com.urbanairship.automation.g$n0 */
    public interface C8874n0 {
        @C0353k0
        /* renamed from: a */
        void mo17505a(@C0359n0 C8996y<? extends C8800a0> yVar);

        @C0353k0
        /* renamed from: b */
        void mo17506b(@C0359n0 C8996y<? extends C8800a0> yVar);

        @C0353k0
        /* renamed from: c */
        void mo17507c(@C0359n0 C8996y<? extends C8800a0> yVar);

        @C0353k0
        /* renamed from: d */
        void mo17508d(@C0359n0 C8996y<? extends C8800a0> yVar);
    }

    /* renamed from: com.urbanairship.automation.g$o */
    public class C8875o implements C36064q<Integer> {

        /* renamed from: a */
        public final /* synthetic */ long f23805a;

        /* renamed from: b */
        public final /* synthetic */ C8946e f23806b;

        public C8875o(long j, C8946e eVar) {
            this.f23805a = j;
            this.f23806b = eVar;
        }

        /* renamed from: a */
        public boolean apply(Integer num) {
            if (((Long) C8844g.this.f23730n.get(num.intValue(), Long.valueOf(C8844g.this.f23729m))).longValue() <= this.f23805a) {
                return false;
            }
            for (C8956j jVar : this.f23806b.f23969b) {
                if (jVar.f24042b == num.intValue()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.urbanairship.automation.g$o0 */
    public class C8876o0 extends C36051i {

        /* renamed from: v */
        public final String f23808v;

        /* renamed from: w */
        public final String f23809w;

        public C8876o0(String str, String str2) {
            super(C8844g.this.f23725i.getLooper());
            this.f23808v = str;
            this.f23809w = str2;
        }
    }

    /* renamed from: com.urbanairship.automation.g$p */
    public class C8877p implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f23811a;

        /* renamed from: b */
        public final /* synthetic */ C9333e f23812b;

        /* renamed from: c */
        public final /* synthetic */ double f23813c;

        public C8877p(int i, C9333e eVar, double d) {
            this.f23811a = i;
            this.f23812b = eVar;
            this.f23813c = d;
        }

        public void run() {
            C36059m.m148406b("Updating triggers with type: %s", Integer.valueOf(this.f23811a));
            List<C8956j> e = C8844g.this.f23739w.mo17641e(this.f23811a);
            if (!e.isEmpty()) {
                C8844g.this.mo17442W0(e, this.f23812b, this.f23813c);
            }
        }
    }

    /* renamed from: com.urbanairship.automation.g$p0 */
    public static abstract class C8878p0<T> implements Runnable {

        /* renamed from: a */
        public final String f23815a;

        /* renamed from: b */
        public final String f23816b;

        /* renamed from: c */
        public T f23817c;

        /* renamed from: d */
        public Exception f23818d;

        public C8878p0(String str, String str2) {
            this.f23815a = str;
            this.f23816b = str2;
        }
    }

    /* renamed from: com.urbanairship.automation.g$q */
    public class C8879q implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f23819a;

        /* renamed from: b */
        public final /* synthetic */ C9333e f23820b;

        /* renamed from: c */
        public final /* synthetic */ double f23821c;

        public C8879q(List list, C9333e eVar, double d) {
            this.f23819a = list;
            this.f23820b = eVar;
            this.f23821c = d;
        }

        public void run() {
            if (!C8844g.this.f23716B.mo17498b() && !this.f23819a.isEmpty()) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (C8956j jVar : this.f23819a) {
                    C9329d dVar = jVar.f24044d;
                    if (dVar == null || dVar.apply(this.f23820b)) {
                        arrayList.add(jVar);
                        double d = jVar.f24046f + this.f23821c;
                        jVar.f24046f = d;
                        if (d >= jVar.f24043c) {
                            jVar.f24046f = 0.0d;
                            if (jVar.f24045e) {
                                hashSet2.add(jVar.f24047g);
                                C8844g.this.mo17445Z(Collections.singletonList(jVar.f24047g));
                            } else {
                                hashSet.add(jVar.f24047g);
                                hashMap.put(jVar.f24047g, new C8828d0(C9000z.m33491b(jVar), this.f23820b.mo17264q()));
                            }
                        }
                    }
                }
                C8844g.this.f23739w.mo17659w(arrayList);
                if (!hashSet2.isEmpty()) {
                    C8844g gVar = C8844g.this;
                    gVar.mo17461p0(gVar.f23739w.mo17647k(hashSet2));
                }
                if (!hashSet.isEmpty()) {
                    C8844g gVar2 = C8844g.this;
                    gVar2.mo17464s0(gVar2.f23739w.mo17647k(hashSet), hashMap);
                }
            }
        }
    }

    /* renamed from: com.urbanairship.automation.g$q0 */
    public static class C8880q0 {

        /* renamed from: a */
        public final List<C8956j> f23823a;

        /* renamed from: b */
        public final C9333e f23824b;

        /* renamed from: c */
        public final double f23825c;

        public C8880q0(@C0359n0 List<C8956j> list, @C0359n0 C9333e eVar, double d) {
            this.f23823a = list;
            this.f23824b = eVar;
            this.f23825c = d;
        }
    }

    /* renamed from: com.urbanairship.automation.g$r */
    public class C8881r implements C8823d.C8826c {

        /* renamed from: a */
        public final /* synthetic */ String f23826a;

        /* renamed from: com.urbanairship.automation.g$r$a */
        public class C8882a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f23828a;

            public C8882a(int i) {
                this.f23828a = i;
            }

            public void run() {
                C8946e g = C8844g.this.f23739w.mo17643g(C8881r.this.f23826a);
                if (g != null && g.f23968a.f24023n == 6) {
                    if (C8844g.this.mo17465t0(g)) {
                        C8844g.this.mo17463r0(g);
                        return;
                    }
                    int i = this.f23828a;
                    if (i == 0) {
                        C8844g.this.mo17440V0(g, 1);
                        C8844g.this.f23739w.mo17656t(g);
                        C8844g.this.mo17446a0();
                    } else if (i == 1) {
                        C8844g.this.f23739w.mo17637a(g);
                        C8844g.this.mo17468y0(Collections.singleton(g));
                    } else if (i == 2) {
                        C8844g.this.mo17419E0(g);
                    } else if (i == 3) {
                        C8844g.this.mo17440V0(g, 0);
                        C8844g.this.f23739w.mo17656t(g);
                    } else if (i == 4) {
                        C8844g.this.mo17420F0(Collections.singletonList(g));
                    }
                }
            }
        }

        public C8881r(String str) {
            this.f23826a = str;
        }

        /* renamed from: a */
        public void mo17386a(int i) {
            C8844g.this.f23725i.post(new C8882a(i));
        }
    }

    /* renamed from: com.urbanairship.automation.g$s */
    public class C8883s extends C8878p0<Integer> {

        /* renamed from: e */
        public final /* synthetic */ C8946e f23830e;

        /* renamed from: f */
        public final /* synthetic */ CountDownLatch f23831f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8883s(String str, String str2, C8946e eVar, CountDownLatch countDownLatch) {
            super(str, str2);
            this.f23830e = eVar;
            this.f23831f = countDownLatch;
        }

        public void run() {
            this.f23817c = 0;
            if (!C8844g.this.f23716B.mo17498b()) {
                C8996y yVar = null;
                if (C8844g.this.mo17467v0(this.f23830e)) {
                    try {
                        yVar = C9000z.m33490a(this.f23830e);
                        this.f23817c = Integer.valueOf(C8844g.this.f23721e.mo17381b(yVar));
                    } catch (Exception e) {
                        C36059m.m148411g(e, "Unable to create schedule.", new Object[0]);
                        this.f23818d = e;
                    }
                }
                this.f23831f.countDown();
                if (1 == ((Integer) this.f23817c).intValue() && yVar != null) {
                    C8844g.this.f23721e.mo17383d(yVar, new C8870m0(this.f23830e.f23968a.f24011b));
                }
            }
        }
    }

    /* renamed from: com.urbanairship.automation.g$t */
    public class C8884t implements C8866k0 {
        public C8884t() {
        }

        /* renamed from: a */
        public void mo17495a(@C0359n0 C8874n0 n0Var, @C0359n0 C8996y<? extends C8800a0> yVar) {
            n0Var.mo17506b(yVar);
        }
    }

    /* renamed from: com.urbanairship.automation.g$u */
    public class C8885u implements C8866k0 {
        public C8885u() {
        }

        /* renamed from: a */
        public void mo17495a(@C0359n0 C8874n0 n0Var, @C0359n0 C8996y<? extends C8800a0> yVar) {
            n0Var.mo17507c(yVar);
        }
    }

    /* renamed from: com.urbanairship.automation.g$v */
    public class C8886v implements C36031c {
        public C8886v() {
        }

        /* renamed from: a */
        public void mo17410a(long j) {
            C8844g.this.mo17418D0(JsonValue.f25436b, 1, 1.0d);
            C8844g.this.mo17446a0();
        }

        /* renamed from: b */
        public void mo17411b(long j) {
            C8844g.this.mo17418D0(JsonValue.f25436b, 2, 1.0d);
            C8844g.this.mo17446a0();
        }
    }

    /* renamed from: com.urbanairship.automation.g$w */
    public class C8887w implements C8866k0 {
        public C8887w() {
        }

        /* renamed from: a */
        public void mo17495a(@C0359n0 C8874n0 n0Var, @C0359n0 C8996y<? extends C8800a0> yVar) {
            n0Var.mo17508d(yVar);
        }
    }

    /* renamed from: com.urbanairship.automation.g$x */
    public class C8888x implements C8866k0 {
        public C8888x() {
        }

        /* renamed from: a */
        public void mo17495a(@C0359n0 C8874n0 n0Var, @C0359n0 C8996y yVar) {
            n0Var.mo17505a(yVar);
        }
    }

    /* renamed from: com.urbanairship.automation.g$y */
    public class C8889y implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Collection f23838a;

        /* renamed from: b */
        public final /* synthetic */ C8866k0 f23839b;

        public C8889y(Collection collection, C8866k0 k0Var) {
            this.f23838a = collection;
            this.f23839b = k0Var;
        }

        public void run() {
            for (C8996y yVar : this.f23838a) {
                C8874n0 L = C8844g.this.f23727k;
                if (L != null) {
                    this.f23839b.mo17495a(L, yVar);
                }
            }
        }
    }

    /* renamed from: com.urbanairship.automation.g$z */
    public class C8890z extends C8876o0 {
        public C8890z(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: h */
        public void mo17473h() {
            C8946e g = C8844g.this.f23739w.mo17643g(this.f23808v);
            if (g != null && g.f23968a.f24023n == 5) {
                if (C8844g.this.mo17465t0(g)) {
                    C8844g.this.mo17463r0(g);
                    return;
                }
                C8844g.this.mo17440V0(g, 6);
                C8844g.this.f23739w.mo17656t(g);
                C8844g.this.mo17420F0(Collections.singletonList(g));
            }
        }
    }

    public C8844g(@C0359n0 Context context, @C0359n0 C9061a aVar, @C0359n0 C35518b bVar, @C0359n0 C36071u uVar) {
        this(bVar, C9202i.m34549m(context), C8804a.m32712d(context), new C8938b(AutomationDatabase.m33208Q(context, aVar).mo17635R()), new C8950g(context, aVar, uVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ void m32920w0() {
        List<C8946e> p = this.f23739w.mo17652p(1);
        if (!p.isEmpty()) {
            mo17431Q0(p);
            for (C8946e T : p) {
                mo17435T(T);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ void m32922x0(boolean z) {
        if (z) {
            mo17446a0();
        }
    }

    @C0348i1
    /* renamed from: A0 */
    public final void mo17415A0(@C0359n0 Collection<C8996y<? extends C8800a0>> collection, @C0359n0 C8866k0 k0Var) {
        if (this.f23727k != null && !collection.isEmpty()) {
            this.f23726j.post(new C8889y(collection, k0Var));
        }
    }

    @C0348i1
    /* renamed from: B0 */
    public final void mo17416B0(@C0359n0 Collection<C8996y<? extends C8800a0>> collection) {
        mo17415A0(collection, new C8888x());
    }

    @C0348i1
    /* renamed from: C0 */
    public final void mo17417C0(@C0359n0 C8946e eVar) {
        mo17415A0(mo17450e0(Collections.singleton(eVar)), new C8887w());
    }

    /* renamed from: D0 */
    public final void mo17418D0(@C0359n0 C9333e eVar, int i, double d) {
        this.f23725i.post(new C8877p(i, eVar, d));
    }

    @C0348i1
    /* renamed from: E0 */
    public final void mo17419E0(@C0363p0 C8946e eVar) {
        if (eVar != null) {
            C36059m.m148419o("Schedule finished: %s", eVar.f23968a.f24011b);
            eVar.f23968a.f24022m++;
            boolean u0 = mo17466u0(eVar);
            if (mo17465t0(eVar)) {
                mo17463r0(eVar);
                return;
            }
            if (u0) {
                mo17440V0(eVar, 4);
                mo17417C0(eVar);
                if (eVar.f23968a.f24018i <= 0) {
                    this.f23739w.mo17637a(eVar);
                    return;
                }
            } else if (eVar.f23968a.f24019j > 0) {
                mo17440V0(eVar, 3);
                mo17428N0(eVar, eVar.f23968a.f24019j);
            } else {
                mo17440V0(eVar, 0);
            }
            this.f23739w.mo17656t(eVar);
        }
    }

    @C0348i1
    /* renamed from: F0 */
    public final void mo17420F0(@C0363p0 List<C8946e> list) {
        if (list != null && !list.isEmpty()) {
            mo17431Q0(list);
            for (C8946e next : list) {
                C8996y c0 = mo17448c0(next);
                if (c0 != null) {
                    this.f23721e.mo17384e(c0, next.f23968a.f24025p, new C8881r(c0.mo17733B()));
                }
            }
        }
    }

    @C0348i1
    /* renamed from: G0 */
    public final void mo17421G0() {
        List<C8946e> p = this.f23739w.mo17652p(1);
        if (!p.isEmpty()) {
            for (C8946e V0 : p) {
                mo17440V0(V0, 6);
            }
            this.f23739w.mo17658v(p);
            C36059m.m148419o("AutomationEngine: Schedules reset state to STATE_PREPARING_SCHEDULE: %s", p);
        }
    }

    @C0348i1
    /* renamed from: H0 */
    public final void mo17422H0() {
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : this.f23718b) {
            int intValue2 = intValue.intValue();
            arrayList.add(mo17451f0(intValue2).mo19466t(this.f23738v).mo19465p(new C8861i(intValue2)));
        }
        C9551d r = C9551d.m35862r(arrayList);
        C9593i<C8880q0> y = C9593i.m35933y();
        this.f23736t = y;
        this.f23737u = C9551d.m35861q(r, y).mo19467u(new C8863j());
        this.f23725i.post(new C8867l());
    }

    @C0348i1
    /* renamed from: I0 */
    public final void mo17423I0() {
        List<C8946e> p = this.f23739w.mo17652p(5);
        if (!p.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C8946e next : p) {
                long j = next.f23968a.f24028s;
                if (j != 0) {
                    long min = Math.min(TimeUnit.SECONDS.toMillis(j), System.currentTimeMillis() - next.f23968a.f24024o);
                    if (min <= 0) {
                        mo17440V0(next, 6);
                        arrayList.add(next);
                    } else {
                        mo17427M0(next, min);
                    }
                }
            }
            this.f23739w.mo17658v(arrayList);
        }
    }

    @C0348i1
    /* renamed from: J0 */
    public final void mo17424J0() {
        List<C8946e> p = this.f23739w.mo17652p(3);
        if (!p.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C8946e next : p) {
                long currentTimeMillis = System.currentTimeMillis();
                C8954h hVar = next.f23968a;
                long j = hVar.f24019j - (currentTimeMillis - hVar.f24024o);
                if (j > 0) {
                    mo17428N0(next, j);
                } else {
                    mo17440V0(next, 0);
                    arrayList.add(next);
                }
            }
            this.f23739w.mo17658v(arrayList);
        }
    }

    @C0359n0
    /* renamed from: K0 */
    public C36062p<Boolean> mo17425K0(@C0359n0 C8996y<? extends C8800a0> yVar) {
        C36062p<Boolean> pVar = new C36062p<>();
        this.f23725i.post(new C8858g0(pVar, yVar));
        return pVar;
    }

    @C0359n0
    /* renamed from: L0 */
    public C36062p<Boolean> mo17426L0(@C0359n0 List<C8996y<? extends C8800a0>> list) {
        C36062p<Boolean> pVar = new C36062p<>();
        this.f23725i.post(new C8860h0(list, pVar));
        return pVar;
    }

    /* renamed from: M0 */
    public final void mo17427M0(@C0359n0 C8946e eVar, long j) {
        C8954h hVar = eVar.f23968a;
        C8890z zVar = new C8890z(hVar.f24011b, hVar.f24012c);
        zVar.mo107801e(new C8846a0(zVar));
        this.f23733q.add(zVar);
        this.f23723g.mo17314a(j, zVar);
    }

    @C0348i1
    /* renamed from: N0 */
    public final void mo17428N0(@C0359n0 C8946e eVar, long j) {
        C8954h hVar = eVar.f23968a;
        C8848b0 b0Var = new C8848b0(hVar.f24011b, hVar.f24012c);
        b0Var.mo107801e(new C8850c0(b0Var));
        this.f23733q.add(b0Var);
        this.f23723g.mo17314a(j, b0Var);
    }

    /* renamed from: O0 */
    public void mo17429O0(boolean z) {
        this.f23716B.mo17500d(z);
        if (!z && this.f23724h) {
            mo17446a0();
        }
    }

    /* renamed from: P0 */
    public void mo17430P0(@C0363p0 C8874n0 n0Var) {
        synchronized (this) {
            this.f23727k = n0Var;
        }
    }

    @C0348i1
    /* renamed from: Q0 */
    public final void mo17431Q0(@C0359n0 List<C8946e> list) {
        if (list.size() > 1) {
            Collections.sort(list, this.f23719c);
        }
    }

    /* renamed from: R0 */
    public void mo17432R0(@C0359n0 C8823d dVar) {
        if (!this.f23724h) {
            this.f23721e = dVar;
            this.f23729m = System.currentTimeMillis();
            C9641c cVar = new C9641c(C9602c.f26266e);
            this.f23732p = cVar;
            cVar.start();
            this.f23725i = new Handler(this.f23732p.getLooper());
            this.f23738v = C9588g.m35926a(this.f23732p.getLooper());
            C8975w wVar = new C8975w();
            this.f23731o = wVar;
            wVar.mo17727c(this.f23715A);
            this.f23720d.mo18485f(this.f23740x);
            this.f23720d.mo18484e(this.f23741y);
            this.f23722f.mo106422I(this.f23742z);
            this.f23725i.post(new C8856f0());
            mo17422H0();
            mo17418D0(JsonValue.f25436b, 8, 1.0d);
            this.f23724h = true;
            mo17446a0();
        }
    }

    /* renamed from: S */
    public void mo17433S(@C0359n0 C8946e eVar, @C0359n0 C8820c0 c0Var) {
        long j;
        long j2;
        int i;
        JsonValue jsonValue;
        int i2;
        long j3;
        long j4;
        C9323b bVar;
        String str;
        C8814b bVar2;
        JsonValue jsonValue2;
        JsonValue jsonValue3;
        List<String> list;
        C8954h hVar = eVar.f23968a;
        if (c0Var.mo17367x() == null) {
            j = hVar.f24016g;
        } else {
            j = c0Var.mo17367x().longValue();
        }
        hVar.f24016g = j;
        if (c0Var.mo17360q() == null) {
            j2 = hVar.f24017h;
        } else {
            j2 = c0Var.mo17360q().longValue();
        }
        hVar.f24017h = j2;
        if (c0Var.mo17363t() == null) {
            i = hVar.f24014e;
        } else {
            i = c0Var.mo17363t().intValue();
        }
        hVar.f24014e = i;
        if (c0Var.mo17358o() == null) {
            jsonValue = hVar.f24021l;
        } else {
            jsonValue = c0Var.mo17358o().mo17264q();
        }
        hVar.f24021l = jsonValue;
        if (c0Var.mo17365v() == null) {
            i2 = hVar.f24015f;
        } else {
            i2 = c0Var.mo17365v().intValue();
        }
        hVar.f24015f = i2;
        if (c0Var.mo17362s() == null) {
            j3 = hVar.f24019j;
        } else {
            j3 = c0Var.mo17362s().longValue();
        }
        hVar.f24019j = j3;
        if (c0Var.mo17359p() == null) {
            j4 = hVar.f24018i;
        } else {
            j4 = c0Var.mo17359p().longValue();
        }
        hVar.f24018i = j4;
        if (c0Var.mo17364u() == null) {
            bVar = hVar.f24013d;
        } else {
            bVar = c0Var.mo17364u();
        }
        hVar.f24013d = bVar;
        if (c0Var.mo17368y() == null) {
            str = hVar.f24020k;
        } else {
            str = c0Var.mo17368y();
        }
        hVar.f24020k = str;
        if (c0Var.mo17356m() == null) {
            bVar2 = hVar.f24030u;
        } else {
            bVar2 = c0Var.mo17356m();
        }
        hVar.f24030u = bVar2;
        if (c0Var.mo17357n() == null) {
            jsonValue2 = hVar.f24031v;
        } else {
            jsonValue2 = c0Var.mo17357n();
        }
        hVar.f24031v = jsonValue2;
        if (c0Var.mo17366w() == null) {
            jsonValue3 = hVar.f24032w;
        } else {
            jsonValue3 = c0Var.mo17366w();
        }
        hVar.f24032w = jsonValue3;
        if (c0Var.mo17361r() == null) {
            list = hVar.f24033x;
        } else {
            list = c0Var.mo17361r();
        }
        hVar.f24033x = list;
    }

    /* renamed from: S0 */
    public void mo17434S0() {
        if (this.f23724h) {
            this.f23737u.mo19457a();
            this.f23720d.mo18481b(this.f23740x);
            this.f23722f.mo106441b0(this.f23742z);
            this.f23731o.mo17728d();
            mo17439V();
            this.f23732p.quit();
            this.f23732p = null;
            this.f23724h = false;
        }
    }

    @C0348i1
    /* renamed from: T */
    public final void mo17435T(@C0359n0 C8946e eVar) {
        int i;
        int i2 = eVar.f23968a.f24023n;
        if (i2 != 1) {
            C36059m.m148409e("Unable to execute schedule when state is %s scheduleID: %s", Integer.valueOf(i2), eVar.f23968a.f24011b);
        } else if (mo17465t0(eVar)) {
            mo17463r0(eVar);
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C8954h hVar = eVar.f23968a;
            C8883s sVar = new C8883s(hVar.f24011b, hVar.f24012c, eVar, countDownLatch);
            this.f23726j.post(sVar);
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                C36059m.m148411g(e, "Failed to execute schedule. ", new Object[0]);
                Thread.currentThread().interrupt();
            }
            if (sVar.f23818d != null) {
                C36059m.m148409e("Failed to check conditions. Deleting schedule: %s", eVar.f23968a.f24011b);
                this.f23739w.mo17637a(eVar);
                mo17468y0(Collections.singleton(eVar));
                return;
            }
            T t = sVar.f23817c;
            if (t == null) {
                i = 0;
            } else {
                i = ((Integer) t).intValue();
            }
            if (i == -1) {
                C36059m.m148419o("Schedule invalidated: %s", eVar.f23968a.f24011b);
                mo17440V0(eVar, 6);
                this.f23739w.mo17656t(eVar);
                mo17420F0(Collections.singletonList(this.f23739w.mo17643g(eVar.f23968a.f24011b)));
            } else if (i == 0) {
                C36059m.m148419o("Schedule not ready for execution: %s", eVar.f23968a.f24011b);
            } else if (i == 1) {
                C36059m.m148419o("Schedule executing: %s", eVar.f23968a.f24011b);
                mo17440V0(eVar, 2);
                this.f23739w.mo17656t(eVar);
            } else if (i == 2) {
                C36059m.m148419o("Schedule execution skipped: %s", eVar.f23968a.f24011b);
                mo17440V0(eVar, 0);
                this.f23739w.mo17656t(eVar);
            }
        }
    }

    @C0348i1
    /* renamed from: T0 */
    public final void mo17436T0(@C0359n0 C8946e eVar, long j) {
        C9551d.m35859n(this.f23718b).mo19463l(new C8875o(j, eVar)).mo19464m(new C8872n(eVar)).mo19467u(new C8869m());
    }

    @C0359n0
    /* renamed from: U */
    public C36062p<Boolean> mo17437U(@C0359n0 Collection<String> collection) {
        C36062p<Boolean> pVar = new C36062p<>();
        this.f23725i.post(new C8862i0(collection, pVar));
        return pVar;
    }

    @C0348i1
    /* renamed from: U0 */
    public final void mo17438U0(@C0359n0 List<C8946e> list) {
        mo17431Q0(list);
        for (C8946e T0 : list) {
            mo17436T0(T0, -1);
        }
    }

    @C0348i1
    /* renamed from: V */
    public final void mo17439V() {
        for (C8876o0 cancel : this.f23733q) {
            cancel.cancel();
        }
        this.f23733q.clear();
    }

    /* renamed from: V0 */
    public final void mo17440V0(@C0359n0 C8946e eVar, int i) {
        C8954h hVar = eVar.f23968a;
        if (hVar.f24023n != i) {
            hVar.f24023n = i;
            hVar.f24024o = System.currentTimeMillis();
        }
    }

    @C0359n0
    /* renamed from: W */
    public C36062p<Boolean> mo17441W(@C0359n0 String str) {
        C36062p<Boolean> pVar = new C36062p<>();
        this.f23725i.post(new C8864j0(str, pVar));
        return pVar;
    }

    /* renamed from: W0 */
    public final void mo17442W0(@C0359n0 List<C8956j> list, @C0359n0 C9333e eVar, double d) {
        this.f23725i.post(new C8879q(list, eVar, d));
    }

    @C0359n0
    /* renamed from: X */
    public C36062p<Boolean> mo17443X(@C0359n0 String str) {
        C36062p<Boolean> pVar = new C36062p<>();
        this.f23725i.post(new C8845a(str, pVar));
        return pVar;
    }

    @C0348i1
    /* renamed from: Y */
    public final void mo17444Y(@C0359n0 Collection<String> collection) {
        Iterator it = new ArrayList(this.f23733q).iterator();
        while (it.hasNext()) {
            C8876o0 o0Var = (C8876o0) it.next();
            if (collection.contains(o0Var.f23809w)) {
                o0Var.cancel();
                this.f23733q.remove(o0Var);
            }
        }
    }

    @C0348i1
    /* renamed from: Z */
    public final void mo17445Z(@C0359n0 Collection<String> collection) {
        Iterator it = new ArrayList(this.f23733q).iterator();
        while (it.hasNext()) {
            C8876o0 o0Var = (C8876o0) it.next();
            if (collection.contains(o0Var.f23808v)) {
                o0Var.cancel();
                this.f23733q.remove(o0Var);
            }
        }
    }

    /* renamed from: a0 */
    public void mo17446a0() {
        if (this.f23724h) {
            this.f23725i.post(new C8836e(this));
        }
    }

    @C0348i1
    /* renamed from: b0 */
    public final void mo17447b0() {
        long j;
        List<C8946e> d = this.f23739w.mo17640d();
        List<C8946e> p = this.f23739w.mo17652p(4);
        mo17462q0(d);
        HashSet hashSet = new HashSet();
        for (C8946e next : p) {
            C8954h hVar = next.f23968a;
            long j2 = hVar.f24018i;
            if (j2 == 0) {
                j = hVar.f24024o;
            } else {
                long j3 = hVar.f24017h;
                if (j3 >= 0) {
                    j = j2 + j3;
                }
            }
            if (System.currentTimeMillis() >= j) {
                hashSet.add(next);
            }
        }
        if (!hashSet.isEmpty()) {
            C36059m.m148419o("Deleting finished schedules: %s", hashSet);
            this.f23739w.mo17639c(hashSet);
        }
    }

    @C0363p0
    /* renamed from: c0 */
    public final <T extends C8800a0> C8996y<T> mo17448c0(@C0363p0 C8946e eVar) {
        if (eVar == null) {
            return null;
        }
        try {
            return C9000z.m33490a(eVar);
        } catch (ClassCastException e) {
            C36059m.m148411g(e, "Exception converting entity to schedule %s", eVar.f23968a.f24011b);
            return null;
        } catch (Exception e2) {
            C36059m.m148411g(e2, "Exception converting entity to schedule %s. Cancelling.", eVar.f23968a.f24011b);
            mo17437U(Collections.singleton(eVar.f23968a.f24011b));
            return null;
        }
    }

    @C0359n0
    /* renamed from: d0 */
    public final <T extends C8800a0> Collection<C8996y<T>> mo17449d0(@C0359n0 Collection<C8946e> collection) {
        ArrayList arrayList = new ArrayList();
        for (C8946e c0 : collection) {
            C8996y c02 = mo17448c0(c0);
            if (c02 != null) {
                arrayList.add(c02);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: e0 */
    public final Collection<C8996y<? extends C8800a0>> mo17450e0(@C0359n0 Collection<C8946e> collection) {
        ArrayList arrayList = new ArrayList();
        for (C8946e c0 : collection) {
            C8996y c02 = mo17448c0(c0);
            if (c02 != null) {
                arrayList.add(c02);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: f0 */
    public final C9551d<C9333e> mo17451f0(int i) {
        if (i != 9) {
            return C9551d.m35857j();
        }
        return C8837e0.m32867c(this.f23720d, this.f23716B);
    }

    @C0359n0
    /* renamed from: g0 */
    public final C9551d<C9333e> mo17452g0(int i) {
        if (i == 9) {
            return C8837e0.m32866b(this.f23720d);
        }
        if (i != 10) {
            return C9551d.m35857j();
        }
        return C8837e0.m32865a();
    }

    @C0359n0
    /* renamed from: h0 */
    public C36062p<Boolean> mo17453h0(@C0359n0 String str, @C0359n0 C8820c0<? extends C8800a0> c0Var) {
        C36062p<Boolean> pVar = new C36062p<>();
        this.f23725i.post(new C8857g(str, pVar, c0Var));
        return pVar;
    }

    @C0348i1
    /* renamed from: i0 */
    public final void mo17454i0() {
        for (C8946e next : this.f23739w.mo17652p(2)) {
            this.f23721e.mo17382c(mo17448c0(next));
            mo17419E0(next);
        }
    }

    @C0359n0
    /* renamed from: j0 */
    public C36062p<C8996y<? extends C8800a0>> mo17455j0(@C0359n0 String str) {
        C36062p<C8996y<? extends C8800a0>> pVar = new C36062p<>();
        this.f23725i.post(new C8849c(str, pVar));
        return pVar;
    }

    @C0359n0
    /* renamed from: k0 */
    public <T extends C8800a0> C36062p<C8996y<T>> mo17456k0(@C0359n0 String str, String str2) {
        C36062p<C8996y<T>> pVar = new C36062p<>();
        this.f23725i.post(new C8851d(str, str2, pVar));
        return pVar;
    }

    @C0359n0
    /* renamed from: l0 */
    public C36062p<Collection<C8996y<? extends C8800a0>>> mo17457l0() {
        C36062p<Collection<C8996y<? extends C8800a0>>> pVar = new C36062p<>();
        this.f23725i.post(new C8859h(pVar));
        return pVar;
    }

    @C0359n0
    /* renamed from: m0 */
    public <T extends C8800a0> C36062p<Collection<C8996y<T>>> mo17458m0(@C0359n0 String str, @C0359n0 String str2) {
        C36062p<Collection<C8996y<T>>> pVar = new C36062p<>();
        this.f23725i.post(new C8855f(str, str2, pVar));
        return pVar;
    }

    @C0359n0
    /* renamed from: n0 */
    public C36062p<Collection<C8996y<? extends C8800a0>>> mo17459n0(@C0359n0 Set<String> set) {
        C36062p<Collection<C8996y<? extends C8800a0>>> pVar = new C36062p<>();
        this.f23725i.post(new C8853e(pVar, set));
        return pVar;
    }

    @C0359n0
    /* renamed from: o0 */
    public <T extends C8800a0> C36062p<Collection<C8996y<T>>> mo17460o0(String str) {
        C36062p<Collection<C8996y<T>>> pVar = new C36062p<>();
        this.f23725i.post(new C8847b(str, pVar));
        return pVar;
    }

    @C0348i1
    /* renamed from: p0 */
    public final void mo17461p0(@C0359n0 List<C8946e> list) {
        if (!list.isEmpty()) {
            for (C8946e V0 : list) {
                mo17440V0(V0, 0);
            }
            this.f23739w.mo17658v(list);
        }
    }

    /* renamed from: q0 */
    public final void mo17462q0(@C0359n0 Collection<C8946e> collection) {
        if (!collection.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C8946e next : collection) {
                mo17440V0(next, 4);
                if (next.f23968a.f24018i > 0) {
                    arrayList2.add(next);
                } else {
                    arrayList.add(next);
                }
            }
            this.f23739w.mo17658v(arrayList2);
            this.f23739w.mo17639c(arrayList);
            mo17469z0(collection);
        }
    }

    /* renamed from: r0 */
    public final void mo17463r0(@C0359n0 C8946e eVar) {
        mo17462q0(Collections.singleton(eVar));
    }

    @C0348i1
    /* renamed from: s0 */
    public final void mo17464s0(@C0359n0 List<C8946e> list, Map<String, C8828d0> map) {
        if (!this.f23716B.mo17498b() && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C8946e next : list) {
                if (next.f23968a.f24023n == 0) {
                    arrayList.add(next);
                    C8954h hVar = next.f23968a;
                    hVar.f24025p = map.get(hVar.f24011b);
                    if (mo17465t0(next)) {
                        arrayList2.add(next);
                    } else {
                        for (C8956j next2 : next.f23969b) {
                            if (next2.f24045e) {
                                next2.f24046f = 0.0d;
                            }
                        }
                        if (next.f23968a.f24028s > 0) {
                            mo17440V0(next, 5);
                            mo17427M0(next, TimeUnit.SECONDS.toMillis(next.f23968a.f24028s));
                        } else {
                            mo17440V0(next, 6);
                            arrayList3.add(next);
                        }
                    }
                }
            }
            this.f23739w.mo17658v(arrayList);
            mo17420F0(arrayList3);
            mo17462q0(arrayList2);
        }
    }

    /* renamed from: t0 */
    public final boolean mo17465t0(@C0359n0 C8946e eVar) {
        long j = eVar.f23968a.f24017h;
        return j >= 0 && j < System.currentTimeMillis();
    }

    /* renamed from: u0 */
    public final boolean mo17466u0(@C0359n0 C8946e eVar) {
        C8954h hVar = eVar.f23968a;
        int i = hVar.f24014e;
        return i > 0 && hVar.f24022m >= i;
    }

    @C0353k0
    /* renamed from: v0 */
    public final boolean mo17467v0(@C0359n0 C8946e eVar) {
        List<String> list = eVar.f23968a.f24027r;
        if (list != null && !list.isEmpty() && !eVar.f23968a.f24027r.contains(this.f23734r)) {
            return false;
        }
        String str = eVar.f23968a.f24029t;
        if (str != null && !str.equals(this.f23735s)) {
            return false;
        }
        int i = eVar.f23968a.f24026q;
        if (i != 2) {
            if (i == 3 && this.f23720d.mo18483d()) {
                return false;
            }
            return true;
        } else if (!this.f23720d.mo18483d()) {
            return false;
        } else {
            return true;
        }
    }

    @C0348i1
    /* renamed from: y0 */
    public final void mo17468y0(@C0359n0 Collection<C8946e> collection) {
        mo17415A0(mo17450e0(collection), new C8885u());
    }

    @C0348i1
    /* renamed from: z0 */
    public final void mo17469z0(@C0359n0 Collection<C8946e> collection) {
        mo17415A0(mo17450e0(collection), new C8884t());
    }

    @C0344h1
    public C8844g(@C0359n0 C35518b bVar, @C0359n0 C36030b bVar2, @C0359n0 C8809b bVar3, @C0359n0 C8937a aVar, @C0359n0 C8950g gVar) {
        this.f23717a = 1000;
        this.f23718b = Arrays.asList(new Integer[]{9, 10});
        this.f23719c = new C8865k();
        this.f23730n = new SparseArray<>();
        this.f23733q = new ArrayList();
        this.f23740x = new C8886v();
        this.f23741y = new C8852d0();
        this.f23742z = new C8854e0();
        this.f23715A = new C8842f(this);
        this.f23722f = bVar;
        this.f23720d = bVar2;
        this.f23723g = bVar3;
        this.f23726j = new Handler(Looper.getMainLooper());
        this.f23739w = aVar;
        this.f23728l = gVar;
        this.f23716B = new C8868l0();
    }
}
