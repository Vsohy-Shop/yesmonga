package com.usabilla.sdk.ubform.telemetry;

import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.p007db.telemetry.C9783a;
import com.usabilla.sdk.ubform.p007db.telemetry.TelemetryTable;
import com.usabilla.sdk.ubform.sdk.featurebilla.C9950a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.json.JSONObject;

public final class UbTelemetryClient implements C10094a {
    @C12579k

    /* renamed from: a */
    public final C12074o0 f27756a;
    @C12579k

    /* renamed from: b */
    public final C10109d f27757b;
    @C12579k

    /* renamed from: c */
    public ArrayList<C10110e> f27758c = new ArrayList<>();

    /* renamed from: d */
    public int f27759d = TelemetryOption.ALL.mo21522q();
    @C12580l

    /* renamed from: e */
    public AppInfo f27760e;
    @C12580l

    /* renamed from: f */
    public C9783a f27761f;
    @C12580l

    /* renamed from: g */
    public C9950a f27762g;

    public UbTelemetryClient(@C12579k C12074o0 o0Var, @C12579k C10109d dVar) {
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(dVar, "mapper");
        this.f27756a = o0Var;
        this.f27757b = dVar;
    }

    @C12580l
    /* renamed from: a */
    public C9783a mo21523a() {
        return this.f27761f;
    }

    @C12580l
    /* renamed from: b */
    public AppInfo mo21524b() {
        return this.f27760e;
    }

    /* renamed from: c */
    public void mo21525c(@C12580l AppInfo appInfo) {
        this.f27760e = appInfo;
        for (C10110e eVar : this.f27758c) {
            if (appInfo != null) {
                eVar.mo21541c(appInfo);
            }
        }
    }

    /* renamed from: d */
    public void mo21526d(@C12580l C9783a aVar) {
        this.f27761f = aVar;
        if (aVar != null) {
            ArrayList<C10110e> l = mo21531l();
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(l, 10));
            for (C10110e e : l) {
                arrayList.add(e.mo21543e());
            }
            mo21535p(aVar, arrayList);
        }
        this.f27758c.clear();
    }

    @C12579k
    /* renamed from: e */
    public C11907e<String> mo21527e() {
        C9783a a = mo21523a();
        if (a == null) {
            return C11909g.m47385M0("");
        }
        return new UbTelemetryClient$getLogs$lambda8$$inlined$map$1(a.mo20048b(), a, this);
    }

    @C12580l
    /* renamed from: f */
    public C9950a mo21528f() {
        return this.f27762g;
    }

    @C12579k
    /* renamed from: g */
    public C10110e mo21529g(@C12579k JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, TelemetryTable.f26835g);
        return new UbTelemetryRecorder(this.f27759d, jSONObject, new UbTelemetryClient$getRecorder$1(this));
    }

    /* renamed from: h */
    public void mo21530h(@C12580l C9950a aVar) {
        if (aVar != null) {
            C11723c2 unused = C12038j.m48061f(this.f27756a, (CoroutineContext) null, (CoroutineStart) null, new UbTelemetryClient$featureFlagManager$1$1(this, aVar, aVar, (C11045c<? super UbTelemetryClient$featureFlagManager$1$1>) null), 3, (Object) null);
        }
    }

    @C12579k
    /* renamed from: l */
    public final ArrayList<C10110e> mo21531l() {
        return this.f27758c;
    }

    /* renamed from: m */
    public final int mo21532m() {
        return this.f27759d;
    }

    /* renamed from: n */
    public final void mo21533n(@C12579k ArrayList<C10110e> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.f27758c = arrayList;
    }

    /* renamed from: o */
    public final void mo21534o(int i) {
        this.f27759d = i;
    }

    /* renamed from: p */
    public final void mo21535p(C9783a aVar, List<? extends JSONObject> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((JSONObject) next).length() <= 0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            C11723c2 unused = C12038j.m48061f(this.f27756a, (CoroutineContext) null, (CoroutineStart) null, new UbTelemetryClient$storeLogInDb$1(aVar, arrayList, (C11045c<? super UbTelemetryClient$storeLogInDb$1>) null), 3, (Object) null);
        }
    }
}
