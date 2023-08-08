package com.urbanairship.iam;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.C0337f0;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.actions.C35504j;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.automation.C8823d;
import com.urbanairship.iam.AdapterWrapper;
import com.urbanairship.iam.C9173e;
import com.urbanairship.iam.C9207l;
import com.urbanairship.iam.assets.C9135d;
import com.urbanairship.iam.banner.C9155b;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.iam.fullscreen.C9184b;
import com.urbanairship.iam.html.C9196a;
import com.urbanairship.iam.layout.C9215a;
import com.urbanairship.iam.modal.C9224b;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.RetryingExecutor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.iam.v */
public class C9237v {

    /* renamed from: r */
    public static final long f25152r = 30000;

    /* renamed from: s */
    public static final String f25153s = "com.urbanairship.iam.displayinterval";

    /* renamed from: a */
    public final Map<String, AdapterWrapper> f25154a;

    /* renamed from: b */
    public final RetryingExecutor f25155b;

    /* renamed from: c */
    public final C35504j f25156c;

    /* renamed from: d */
    public final C35518b f25157d;

    /* renamed from: e */
    public final Map<String, C9207l.C9208a> f25158e;

    /* renamed from: f */
    public final List<C9229n> f25159f;

    /* renamed from: g */
    public final C9161c f25160g;

    /* renamed from: h */
    public final C9189g f25161h;

    /* renamed from: i */
    public final C9135d f25162i;

    /* renamed from: j */
    public final Context f25163j;

    /* renamed from: k */
    public final C36071u f25164k;

    /* renamed from: l */
    public final C9241d f25165l;
    @C0363p0

    /* renamed from: m */
    public C9242e f25166m;
    @C0363p0

    /* renamed from: n */
    public C9220m f25167n;
    @C0363p0

    /* renamed from: o */
    public C9143b0 f25168o;

    /* renamed from: p */
    public final C9173e.C9174a f25169p;

    /* renamed from: q */
    public final Map<String, C8823d.C8824a> f25170q;

    /* renamed from: com.urbanairship.iam.v$a */
    public class C9238a implements C9173e.C9174a {
        public C9238a() {
        }

        /* renamed from: a */
        public void mo18403a() {
            C9237v.this.f25165l.mo17534a();
        }
    }

    /* renamed from: com.urbanairship.iam.v$b */
    public class C9239b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AdapterWrapper f25172a;

        public C9239b(AdapterWrapper adapterWrapper) {
            this.f25172a = adapterWrapper;
        }

        public void run() {
            this.f25172a.mo18158b(C9237v.this.f25163j);
        }
    }

    /* renamed from: com.urbanairship.iam.v$c */
    public class C9240c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f25174a;

        public C9240c(String str) {
            this.f25174a = str;
        }

        public void run() {
            C9237v.this.f25162i.mo18249c(this.f25174a);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: com.urbanairship.iam.v$d */
    public interface C9241d {
        /* renamed from: a */
        void mo17534a();
    }

    /* renamed from: com.urbanairship.iam.v$e */
    public interface C9242e {
        @C0353k0
        /* renamed from: a */
        boolean mo18581a(@C0359n0 InAppMessage inAppMessage);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9237v(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C35518b bVar, @C0359n0 C9241d dVar) {
        this(context, uVar, bVar, RetryingExecutor.m36100o(Looper.getMainLooper()), new C35504j(), new C9135d(context), dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m34693r(AdapterWrapper adapterWrapper) {
        adapterWrapper.mo18158b(this.f25163j);
        this.f25162i.mo18248b(adapterWrapper.f24656a, adapterWrapper.f24659d);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m34694s(InAppMessage inAppMessage, String str, JsonValue jsonValue, JsonValue jsonValue2) {
        String str2;
        if (inAppMessage == null || inAppMessage.mo18189u()) {
            if (inAppMessage != null) {
                str2 = inAppMessage.mo18186s();
            } else {
                str2 = InAppMessage.f24674L0;
            }
            C9175a.m34405g(str, str2).mo18410u(jsonValue).mo18407r(jsonValue2).mo18406o(this.f25157d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m34695t(String str, AdapterWrapper adapterWrapper) {
        this.f25162i.mo18248b(str, adapterWrapper.f24659d);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m34697v(String str, InAppMessage inAppMessage) {
        this.f25162i.mo18251e(str, new C9234s(this, inAppMessage));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ RetryingExecutor.C9635d m34698w(String str, AdapterWrapper adapterWrapper, C8823d.C8826c cVar) {
        int d = this.f25162i.mo18250d(str, adapterWrapper.f24659d);
        if (d == 0) {
            C36059m.m148406b("Assets prepared for schedule %s.", str);
            return RetryingExecutor.m36098m();
        } else if (d != 1) {
            C36059m.m148406b("Assets failed to prepare. Cancelling display for schedule %s.", str);
            this.f25162i.mo18248b(str, adapterWrapper.f24659d);
            cVar.mo17386a(1);
            return RetryingExecutor.m36097i();
        } else {
            C36059m.m148406b("Assets failed to prepare for schedule %s. Will retry.", str);
            return RetryingExecutor.m36101p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ RetryingExecutor.C9635d m34699x(AdapterWrapper adapterWrapper, String str, C8823d.C8826c cVar) {
        int g = adapterWrapper.mo18162g(this.f25163j, this.f25162i.mo18247a(str));
        if (g == 0) {
            C36059m.m148406b("Adapter prepared schedule %s.", str);
            this.f25154a.put(str, adapterWrapper);
            cVar.mo17386a(0);
            return RetryingExecutor.m36098m();
        } else if (g != 1) {
            C36059m.m148406b("Adapter failed to prepare. Cancelling display for schedule %s.", str);
            cVar.mo17386a(1);
            return RetryingExecutor.m36097i();
        } else {
            C36059m.m148406b("Adapter failed to prepare schedule %s. Will retry.", str);
            return RetryingExecutor.m36101p();
        }
    }

    @C0353k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: A */
    public int mo18555A(@C0359n0 String str) {
        AdapterWrapper adapterWrapper = this.f25154a.get(str);
        if (adapterWrapper == null) {
            C36059m.m148409e("Missing adapter for schedule %.", str);
            return -1;
        }
        C9242e eVar = this.f25166m;
        if (!adapterWrapper.mo18161e(this.f25163j) || (eVar != null && !eVar.mo18581a(adapterWrapper.f24659d))) {
            return 0;
        }
        return 1;
    }

    @C0353k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: B */
    public void mo18556B(@C0359n0 String str, @C0359n0 C9163c0 c0Var) {
        C36059m.m148419o("Message finished for schedule %s.", str);
        AdapterWrapper remove = this.f25154a.remove(str);
        if (remove != null) {
            C9190h.m34483c(remove.f24659d.mo18180l(), this.f25156c);
            synchronized (this.f25159f) {
                Iterator it = new ArrayList(this.f25159f).iterator();
                while (it.hasNext()) {
                    ((C9229n) it.next()).mo18549b(str, remove.f24659d, c0Var);
                }
            }
            mo18571l(str);
            remove.mo18160d();
            this.f25155b.execute(new C9231p(this, remove));
        }
    }

    @C0353k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: C */
    public void mo18557C(@C0359n0 String str, @C0359n0 C8823d.C8824a aVar) {
        AdapterWrapper adapterWrapper = this.f25154a.get(str);
        if (adapterWrapper == null) {
            C36059m.m148409e("Missing adapter for schedule %.", str);
            aVar.mo17385a();
            return;
        }
        synchronized (this.f25170q) {
            this.f25170q.put(str, aVar);
        }
        try {
            adapterWrapper.mo18159c(this.f25163j);
            if (adapterWrapper.f24659d.mo18189u()) {
                C9175a.m34402d(str, adapterWrapper.f24659d).mo18407r(adapterWrapper.f24657b).mo18410u(adapterWrapper.f24658c).mo18406o(this.f25157d);
            }
            synchronized (this.f25159f) {
                Iterator it = new ArrayList(this.f25159f).iterator();
                while (it.hasNext()) {
                    ((C9229n) it.next()).mo18548a(str, adapterWrapper.f24659d);
                }
            }
            C36059m.m148419o("Message displayed for schedule %s.", str);
        } catch (AdapterWrapper.DisplayException e) {
            C36059m.m148411g(e, "Failed to display in-app message for schedule %s.", str);
            mo18571l(str);
            this.f25155b.execute(new C9239b(adapterWrapper));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: D */
    public void mo18558D(@C0359n0 String str, @C0363p0 JsonValue jsonValue, @C0363p0 JsonValue jsonValue2, @C0363p0 InAppMessage inAppMessage) {
        this.f25155b.execute(new C9233r(this, inAppMessage, str, jsonValue2, jsonValue));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: E */
    public void mo18559E(@C0359n0 String str) {
        AdapterWrapper remove = this.f25154a.remove(str);
        if (remove != null) {
            this.f25155b.execute(new C9230o(this, str, remove));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: F */
    public void mo18560F(@C0359n0 String str) {
        this.f25155b.execute(new C9240c(str));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: G */
    public void mo18561G(@C0359n0 String str, @C0359n0 InAppMessage inAppMessage) {
        this.f25155b.execute(new C9232q(this, str, inAppMessage));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: H */
    public void mo18562H(@C0359n0 String str, @C0363p0 JsonValue jsonValue, @C0363p0 JsonValue jsonValue2, @C0359n0 InAppMessage inAppMessage, @C0359n0 C8823d.C8826c cVar) {
        AdapterWrapper m = mo18572m(str, jsonValue, jsonValue2, inAppMessage);
        if (m == null) {
            cVar.mo17386a(2);
            return;
        }
        C9235t tVar = new C9235t(this, str, m, cVar);
        C9236u uVar = new C9236u(this, m, str, cVar);
        this.f25155b.mo19592l(tVar, uVar);
    }

    @C0353k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: I */
    public void mo18563I(@C0359n0 String str, @C0359n0 C9163c0 c0Var, long j) {
        C36059m.m148419o("Message finished for schedule %s.", str);
        AdapterWrapper adapterWrapper = this.f25154a.get(str);
        if (adapterWrapper != null && adapterWrapper.f24659d.mo18189u()) {
            C9175a.m34413p(str, adapterWrapper.f24659d, j, c0Var).mo18407r(adapterWrapper.f24657b).mo18410u(adapterWrapper.f24658c).mo18406o(this.f25157d);
        }
    }

    /* renamed from: J */
    public void mo18564J(@C0359n0 C9229n nVar) {
        synchronized (this.f25159f) {
            this.f25159f.remove(nVar);
        }
    }

    /* renamed from: K */
    public void mo18565K(@C0359n0 String str, @C0363p0 C9207l.C9208a aVar) {
        if (aVar == null) {
            this.f25158e.remove(str);
        } else {
            this.f25158e.put(str, aVar);
        }
    }

    /* renamed from: L */
    public void mo18566L(@C0363p0 C9242e eVar) {
        this.f25166m = eVar;
    }

    /* renamed from: M */
    public void mo18567M(@C0337f0(from = 0) long j, @C0359n0 TimeUnit timeUnit) {
        this.f25164k.mo107853r(f25153s, timeUnit.toMillis(j));
        this.f25160g.mo18373i(j, timeUnit);
    }

    /* renamed from: N */
    public void mo18568N(@C0363p0 C9220m mVar) {
        this.f25167n = mVar;
    }

    /* renamed from: O */
    public void mo18569O(@C0363p0 C9143b0 b0Var) {
        this.f25168o = b0Var;
    }

    /* renamed from: k */
    public void mo18570k(@C0359n0 C9229n nVar) {
        synchronized (this.f25159f) {
            this.f25159f.add(nVar);
        }
    }

    /* renamed from: l */
    public final void mo18571l(String str) {
        synchronized (this.f25170q) {
            C8823d.C8824a remove = this.f25170q.remove(str);
            if (remove != null) {
                remove.mo17385a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068 A[Catch:{ Exception -> 0x0089 }] */
    @androidx.annotation.C0363p0
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.urbanairship.iam.AdapterWrapper mo18572m(@androidx.annotation.C0359n0 java.lang.String r10, @androidx.annotation.C0363p0 com.urbanairship.json.JsonValue r11, @androidx.annotation.C0363p0 com.urbanairship.json.JsonValue r12, @androidx.annotation.C0359n0 com.urbanairship.iam.InAppMessage r13) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            com.urbanairship.iam.InAppMessage r6 = r9.m34696u(r13)     // Catch:{ Exception -> 0x0089 }
            java.util.Map<java.lang.String, com.urbanairship.iam.l$a> r13 = r9.f25158e     // Catch:{ Exception -> 0x0089 }
            monitor-enter(r13)     // Catch:{ Exception -> 0x0089 }
            java.util.Map<java.lang.String, com.urbanairship.iam.l$a> r2 = r9.f25158e     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = r6.mo18187t()     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0086 }
            com.urbanairship.iam.l$a r2 = (com.urbanairship.iam.C9207l.C9208a) r2     // Catch:{ all -> 0x0086 }
            monitor-exit(r13)     // Catch:{ all -> 0x0086 }
            r13 = 1
            if (r2 != 0) goto L_0x002b
            java.lang.String r2 = "InAppMessageManager - No display adapter for message type: %s. Unable to process schedule: %s."
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0089 }
            java.lang.String r4 = r6.mo18187t()     // Catch:{ Exception -> 0x0089 }
            r3[r0] = r4     // Catch:{ Exception -> 0x0089 }
            r3[r13] = r10     // Catch:{ Exception -> 0x0089 }
            com.urbanairship.C36059m.m148406b(r2, r3)     // Catch:{ Exception -> 0x0089 }
            r7 = r1
            goto L_0x0030
        L_0x002b:
            com.urbanairship.iam.l r2 = r2.mo18338a(r6)     // Catch:{ Exception -> 0x0089 }
            r7 = r2
        L_0x0030:
            com.urbanairship.iam.b0 r2 = r9.f25168o     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x0039
            com.urbanairship.iam.e r2 = r2.mo18276a(r6)     // Catch:{ Exception -> 0x0089 }
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            if (r2 != 0) goto L_0x006c
            java.lang.String r2 = r6.mo18181m()     // Catch:{ Exception -> 0x0089 }
            int r3 = r2.hashCode()     // Catch:{ Exception -> 0x0089 }
            r4 = 1124382641(0x4304b7b1, float:132.71754)
            if (r3 == r4) goto L_0x0058
            r4 = 1544803905(0x5c13d641, float:1.66449585E17)
            if (r3 == r4) goto L_0x004f
            goto L_0x0062
        L_0x004f:
            java.lang.String r3 = "default"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0058:
            java.lang.String r13 = "immediate"
            boolean r13 = r2.equals(r13)     // Catch:{ Exception -> 0x0089 }
            if (r13 == 0) goto L_0x0062
            r13 = r0
            goto L_0x0063
        L_0x0062:
            r13 = -1
        L_0x0063:
            if (r13 == 0) goto L_0x0068
            com.urbanairship.iam.c r13 = r9.f25160g     // Catch:{ Exception -> 0x0089 }
            goto L_0x006a
        L_0x0068:
            com.urbanairship.iam.g r13 = r9.f25161h     // Catch:{ Exception -> 0x0089 }
        L_0x006a:
            r8 = r13
            goto L_0x006d
        L_0x006c:
            r8 = r2
        L_0x006d:
            if (r7 != 0) goto L_0x0077
            java.lang.String r10 = "InAppMessageManager - Failed to create in-app message adapter."
            java.lang.Object[] r11 = new java.lang.Object[r0]
            com.urbanairship.C36059m.m148409e(r10, r11)
            return r1
        L_0x0077:
            com.urbanairship.iam.e$a r13 = r9.f25169p
            r8.mo18402e(r13)
            com.urbanairship.iam.AdapterWrapper r13 = new com.urbanairship.iam.AdapterWrapper
            r2 = r13
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r13
        L_0x0086:
            r10 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0086 }
            throw r10     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            r10 = move-exception
            java.lang.String r11 = "InAppMessageManager - Failed to create in-app message adapter."
            java.lang.Object[] r12 = new java.lang.Object[r0]
            com.urbanairship.C36059m.m148411g(r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.iam.C9237v.mo18572m(java.lang.String, com.urbanairship.json.JsonValue, com.urbanairship.json.JsonValue, com.urbanairship.iam.InAppMessage):com.urbanairship.iam.AdapterWrapper");
    }

    @C0359n0
    /* renamed from: n */
    public final InAppMessage m34696u(@C0359n0 InAppMessage inAppMessage) {
        C9220m mVar = this.f25167n;
        if (mVar != null) {
            return mVar.mo18515a(inAppMessage);
        }
        return inAppMessage;
    }

    @C0359n0
    /* renamed from: o */
    public C9135d mo18574o() {
        return this.f25162i;
    }

    /* renamed from: p */
    public long mo18575p() {
        return this.f25164k.mo107846i(f25153s, 30000);
    }

    @C0353k0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public boolean mo18576q(@C0359n0 String str) {
        AdapterWrapper adapterWrapper = this.f25154a.get(str);
        if (adapterWrapper == null || !adapterWrapper.f24662g) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public void mo18577y() {
        this.f25165l.mo17534a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: z */
    public void mo18578z() {
        this.f25155b.mo19593r(false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9237v(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C35518b bVar, @C0359n0 RetryingExecutor retryingExecutor, @C0359n0 C35504j jVar, @C0359n0 C9135d dVar, @C0359n0 C9241d dVar2) {
        this.f25154a = Collections.synchronizedMap(new HashMap());
        this.f25158e = new HashMap();
        this.f25159f = new ArrayList();
        this.f25169p = new C9238a();
        this.f25170q = new HashMap();
        this.f25163j = context;
        this.f25164k = uVar;
        this.f25157d = bVar;
        this.f25155b = retryingExecutor;
        this.f25162i = dVar;
        this.f25165l = dVar2;
        this.f25156c = jVar;
        this.f25160g = new C9161c(mo18575p());
        this.f25161h = new C9189g();
        retryingExecutor.mo19593r(true);
        mo18565K("banner", new C9155b());
        mo18565K(InAppMessage.f24678P0, new C9184b());
        mo18565K(InAppMessage.f24679Q0, new C9224b());
        mo18565K("html", new C9196a());
        mo18565K("layout", new C9215a());
    }
}
