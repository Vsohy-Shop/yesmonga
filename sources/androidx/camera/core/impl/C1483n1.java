package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.camera.core.C1417i2;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.n1 */
public final class C1483n1 {

    /* renamed from: c */
    public static final String f4243c = "UseCaseAttachState";

    /* renamed from: a */
    public final String f4244a;

    /* renamed from: b */
    public final Map<String, C1485b> f4245b = new HashMap();

    /* renamed from: androidx.camera.core.impl.n1$a */
    public interface C1484a {
        /* renamed from: a */
        boolean mo5257a(C1485b bVar);
    }

    /* renamed from: androidx.camera.core.impl.n1$b */
    public static final class C1485b {
        @C0359n0

        /* renamed from: a */
        public final SessionConfig f4246a;

        /* renamed from: b */
        public boolean f4247b = false;

        /* renamed from: c */
        public boolean f4248c = false;

        public C1485b(@C0359n0 SessionConfig sessionConfig) {
            this.f4246a = sessionConfig;
        }

        /* renamed from: a */
        public boolean mo5273a() {
            return this.f4248c;
        }

        /* renamed from: b */
        public boolean mo5274b() {
            return this.f4247b;
        }

        @C0359n0
        /* renamed from: c */
        public SessionConfig mo5275c() {
            return this.f4246a;
        }

        /* renamed from: d */
        public void mo5276d(boolean z) {
            this.f4248c = z;
        }

        /* renamed from: e */
        public void mo5277e(boolean z) {
            this.f4247b = z;
        }
    }

    public C1483n1(@C0359n0 String str) {
        this.f4244a = str;
    }

    /* renamed from: j */
    public static /* synthetic */ boolean m6205j(C1485b bVar) {
        return bVar.mo5273a() && bVar.mo5274b();
    }

    @C0359n0
    /* renamed from: c */
    public SessionConfig.C1427e mo5260c() {
        SessionConfig.C1427e eVar = new SessionConfig.C1427e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f4245b.entrySet()) {
            C1485b bVar = (C1485b) next.getValue();
            if (bVar.mo5273a() && bVar.mo5274b()) {
                eVar.mo5172a(bVar.mo5275c());
                arrayList.add((String) next.getKey());
            }
        }
        C1417i2.m5911a(f4243c, "Active and attached use case: " + arrayList + " for camera: " + this.f4244a);
        return eVar;
    }

    @C0359n0
    /* renamed from: d */
    public Collection<SessionConfig> mo5261d() {
        return Collections.unmodifiableCollection(mo5265h(new C1480m1()));
    }

    @C0359n0
    /* renamed from: e */
    public SessionConfig.C1427e mo5262e() {
        SessionConfig.C1427e eVar = new SessionConfig.C1427e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f4245b.entrySet()) {
            C1485b bVar = (C1485b) next.getValue();
            if (bVar.mo5274b()) {
                eVar.mo5172a(bVar.mo5275c());
                arrayList.add((String) next.getKey());
            }
        }
        C1417i2.m5911a(f4243c, "All use case: " + arrayList + " for camera: " + this.f4244a);
        return eVar;
    }

    @C0359n0
    /* renamed from: f */
    public Collection<SessionConfig> mo5263f() {
        return Collections.unmodifiableCollection(mo5265h(new C1476l1()));
    }

    /* renamed from: g */
    public final C1485b mo5264g(@C0359n0 String str, @C0359n0 SessionConfig sessionConfig) {
        C1485b bVar = this.f4245b.get(str);
        if (bVar != null) {
            return bVar;
        }
        C1485b bVar2 = new C1485b(sessionConfig);
        this.f4245b.put(str, bVar2);
        return bVar2;
    }

    /* renamed from: h */
    public final Collection<SessionConfig> mo5265h(C1484a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f4245b.entrySet()) {
            if (aVar == null || aVar.mo5257a((C1485b) next.getValue())) {
                arrayList.add(((C1485b) next.getValue()).mo5275c());
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public boolean mo5266i(@C0359n0 String str) {
        if (!this.f4245b.containsKey(str)) {
            return false;
        }
        return this.f4245b.get(str).mo5274b();
    }

    /* renamed from: l */
    public void mo5267l(@C0359n0 String str) {
        this.f4245b.remove(str);
    }

    /* renamed from: m */
    public void mo5268m(@C0359n0 String str, @C0359n0 SessionConfig sessionConfig) {
        mo5264g(str, sessionConfig).mo5276d(true);
    }

    /* renamed from: n */
    public void mo5269n(@C0359n0 String str, @C0359n0 SessionConfig sessionConfig) {
        mo5264g(str, sessionConfig).mo5277e(true);
    }

    /* renamed from: o */
    public void mo5270o(@C0359n0 String str) {
        if (this.f4245b.containsKey(str)) {
            C1485b bVar = this.f4245b.get(str);
            bVar.mo5277e(false);
            if (!bVar.mo5273a()) {
                this.f4245b.remove(str);
            }
        }
    }

    /* renamed from: p */
    public void mo5271p(@C0359n0 String str) {
        if (this.f4245b.containsKey(str)) {
            C1485b bVar = this.f4245b.get(str);
            bVar.mo5276d(false);
            if (!bVar.mo5274b()) {
                this.f4245b.remove(str);
            }
        }
    }

    /* renamed from: q */
    public void mo5272q(@C0359n0 String str, @C0359n0 SessionConfig sessionConfig) {
        if (this.f4245b.containsKey(str)) {
            C1485b bVar = new C1485b(sessionConfig);
            C1485b bVar2 = this.f4245b.get(str);
            bVar.mo5277e(bVar2.mo5274b());
            bVar.mo5276d(bVar2.mo5273a());
            this.f4245b.put(str, bVar);
        }
    }
}
