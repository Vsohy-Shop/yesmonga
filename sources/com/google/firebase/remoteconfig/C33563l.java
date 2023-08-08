package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.C0344h1;
import androidx.annotation.C0351j1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.C32515c;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.C33088k;
import com.google.firebase.remoteconfig.internal.C33523e;
import com.google.firebase.remoteconfig.internal.C33526f;
import com.google.firebase.remoteconfig.internal.C33533k;
import com.google.firebase.remoteconfig.internal.C33537m;
import com.google.firebase.remoteconfig.internal.C33538n;
import com.google.firebase.remoteconfig.internal.C33541p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.l */
public class C33563l {

    /* renamed from: l */
    public static final String f81680l = "";

    /* renamed from: m */
    public static final long f81681m = 0;

    /* renamed from: n */
    public static final double f81682n = 0.0d;

    /* renamed from: o */
    public static final boolean f81683o = false;

    /* renamed from: p */
    public static final byte[] f81684p = new byte[0];

    /* renamed from: q */
    public static final int f81685q = 0;

    /* renamed from: r */
    public static final int f81686r = 1;

    /* renamed from: s */
    public static final int f81687s = 2;

    /* renamed from: t */
    public static final int f81688t = -1;

    /* renamed from: u */
    public static final int f81689u = 0;

    /* renamed from: v */
    public static final int f81690v = 1;

    /* renamed from: w */
    public static final int f81691w = 2;

    /* renamed from: x */
    public static final String f81692x = "FirebaseRemoteConfig";

    /* renamed from: a */
    public final Context f81693a;

    /* renamed from: b */
    public final C33033f f81694b;
    @C0363p0

    /* renamed from: c */
    public final C32515c f81695c;

    /* renamed from: d */
    public final Executor f81696d;

    /* renamed from: e */
    public final C33523e f81697e;

    /* renamed from: f */
    public final C33523e f81698f;

    /* renamed from: g */
    public final C33523e f81699g;

    /* renamed from: h */
    public final C33533k f81700h;

    /* renamed from: i */
    public final C33537m f81701i;

    /* renamed from: j */
    public final C33538n f81702j;

    /* renamed from: k */
    public final C33088k f81703k;

    public C33563l(Context context, C33033f fVar, C33088k kVar, @C0363p0 C32515c cVar, Executor executor, C33523e eVar, C33523e eVar2, C33523e eVar3, C33533k kVar2, C33537m mVar, C33538n nVar) {
        this.f81693a = context;
        this.f81694b = fVar;
        this.f81703k = kVar;
        this.f81695c = cVar;
        this.f81696d = executor;
        this.f81697e = eVar;
        this.f81698f = eVar2;
        this.f81699g = eVar3;
        this.f81700h = kVar2;
        this.f81701i = mVar;
        this.f81702j = nVar;
    }

    /* renamed from: A */
    public static /* synthetic */ C33564m m135252A(C31047k kVar, C31047k kVar2) throws Exception {
        return (C33564m) kVar.mo87734r();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ C31047k m135255D(Void voidR) throws Exception {
        return mo97393j();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ Void m135256E() throws Exception {
        this.f81698f.mo97291d();
        this.f81697e.mo97291d();
        this.f81699g.mo97291d();
        this.f81702j.mo97347a();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ Void m135257F(C33565n nVar) throws Exception {
        this.f81702j.mo97357k(nVar);
        return null;
    }

    @C0344h1
    /* renamed from: O */
    public static List<Map<String, String>> m135259O(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: s */
    public static C33563l m135269s() {
        return m135270t(C33033f.m133333p());
    }

    @C0359n0
    /* renamed from: t */
    public static C33563l m135270t(@C0359n0 C33033f fVar) {
        return ((C33584t) fVar.mo95720l(C33584t.class)).mo97419e();
    }

    /* renamed from: y */
    public static boolean m135271y(C33526f fVar, @C0363p0 C33526f fVar2) {
        return fVar2 == null || !fVar.mo97303e().equals(fVar2.mo97303e());
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ C31047k m135272z(C31047k kVar, C31047k kVar2, C31047k kVar3) throws Exception {
        if (!kVar.mo87738v() || kVar.mo87734r() == null) {
            return C31053n.m124525g(Boolean.FALSE);
        }
        C33526f fVar = (C33526f) kVar.mo87734r();
        if (!kVar2.mo87738v() || m135271y(fVar, (C33526f) kVar2.mo87734r())) {
            return this.f81698f.mo97296m(fVar).mo87730n(this.f81696d, new C33547j(this));
        }
        return C31053n.m124525g(Boolean.FALSE);
    }

    /* renamed from: H */
    public final boolean mo97385H(C31047k<C33526f> kVar) {
        if (!kVar.mo87738v()) {
            return false;
        }
        this.f81697e.mo97291d();
        if (kVar.mo87734r() == null) {
            return true;
        }
        mo97392P(kVar.mo87734r().mo97301c());
        return true;
    }

    @C0359n0
    /* renamed from: I */
    public C31047k<Void> mo97386I() {
        return C31053n.m124522d(this.f81696d, new C33513d(this));
    }

    @C0359n0
    /* renamed from: J */
    public C31047k<Void> mo97387J(@C0359n0 C33565n nVar) {
        return C31053n.m124522d(this.f81696d, new C33517h(this, nVar));
    }

    @C0359n0
    /* renamed from: K */
    public C31047k<Void> mo97388K(@C0351j1 int i) {
        return mo97390M(C33541p.m135229a(this.f81693a, i));
    }

    @C0359n0
    /* renamed from: L */
    public C31047k<Void> mo97389L(@C0359n0 Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (value instanceof byte[]) {
                hashMap.put((String) next.getKey(), new String((byte[]) value));
            } else {
                hashMap.put((String) next.getKey(), value.toString());
            }
        }
        return mo97390M(hashMap);
    }

    /* renamed from: M */
    public final C31047k<Void> mo97390M(Map<String, String> map) {
        try {
            return this.f81699g.mo97296m(C33526f.m135137g().mo97309b(map).mo97308a()).mo87740x(FirebaseExecutors.m131793a(), new C33511b());
        } catch (JSONException unused) {
            return C31053n.m124525g(null);
        }
    }

    /* renamed from: N */
    public void mo97391N() {
        this.f81698f.mo97292f();
        this.f81699g.mo97292f();
        this.f81697e.mo97292f();
    }

    @C0344h1
    /* renamed from: P */
    public void mo97392P(@C0359n0 JSONArray jSONArray) {
        if (this.f81695c != null) {
            try {
                this.f81695c.mo94622l(m135259O(jSONArray));
            } catch (AbtException | JSONException unused) {
            }
        }
    }

    @C0359n0
    /* renamed from: j */
    public C31047k<Boolean> mo97393j() {
        C31047k<C33526f> f = this.f81697e.mo97292f();
        C31047k<C33526f> f2 = this.f81698f.mo97292f();
        return C31053n.m124529k(f, f2).mo87732p(this.f81696d, new C33548k(this, f, f2));
    }

    @C0359n0
    /* renamed from: k */
    public C31047k<C33564m> mo97394k() {
        C31047k<C33526f> f = this.f81698f.mo97292f();
        C31047k<C33526f> f2 = this.f81699g.mo97292f();
        C31047k<C33526f> f3 = this.f81697e.mo97292f();
        C31047k d = C31053n.m124522d(this.f81696d, new C33515f(this));
        return C31053n.m124529k(f, f2, f3, d, this.f81703k.getId(), this.f81703k.mo95804b(false)).mo87730n(this.f81696d, new C33516g(d));
    }

    @C0359n0
    /* renamed from: l */
    public C31047k<Void> mo97395l() {
        return this.f81700h.mo97317h().mo87740x(FirebaseExecutors.m131793a(), new C33514e());
    }

    @C0359n0
    /* renamed from: m */
    public C31047k<Void> mo97396m(long j) {
        return this.f81700h.mo97318i(j).mo87740x(FirebaseExecutors.m131793a(), new C33512c());
    }

    @C0359n0
    /* renamed from: n */
    public C31047k<Boolean> mo97397n() {
        return mo97395l().mo87740x(this.f81696d, new C33518i(this));
    }

    @C0359n0
    /* renamed from: o */
    public Map<String, C33568o> mo97398o() {
        return this.f81701i.mo97339d();
    }

    /* renamed from: p */
    public boolean mo97399p(@C0359n0 String str) {
        return this.f81701i.mo97340e(str);
    }

    /* renamed from: q */
    public double mo97400q(@C0359n0 String str) {
        return this.f81701i.mo97342h(str);
    }

    @C0359n0
    /* renamed from: r */
    public C33564m mo97401r() {
        return this.f81702j.mo97350d();
    }

    @C0359n0
    /* renamed from: u */
    public Set<String> mo97402u(@C0359n0 String str) {
        return this.f81701i.mo97343k(str);
    }

    /* renamed from: v */
    public long mo97403v(@C0359n0 String str) {
        return this.f81701i.mo97344m(str);
    }

    @C0359n0
    /* renamed from: w */
    public String mo97404w(@C0359n0 String str) {
        return this.f81701i.mo97345o(str);
    }

    @C0359n0
    /* renamed from: x */
    public C33568o mo97405x(@C0359n0 String str) {
        return this.f81701i.mo97346q(str);
    }
}
