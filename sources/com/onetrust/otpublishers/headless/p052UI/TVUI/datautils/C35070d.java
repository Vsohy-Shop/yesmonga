package com.onetrust.otpublishers.headless.p052UI.TVUI.datautils;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import com.onetrust.otpublishers.headless.Internal.Log.OTLogger;
import com.onetrust.otpublishers.headless.Internal.Preferences.C35015e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35105e;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35114n;
import com.onetrust.otpublishers.headless.p052UI.UIProperty.C35126z;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.TVUI.datautils.d */
public class C35070d {

    /* renamed from: h */
    public static C35070d f85406h;

    /* renamed from: a */
    public JSONObject f85407a;

    /* renamed from: b */
    public String f85408b;

    /* renamed from: c */
    public String f85409c;

    /* renamed from: d */
    public String f85410d;

    /* renamed from: e */
    public String f85411e;

    /* renamed from: f */
    public C35126z f85412f;

    /* renamed from: g */
    public C35105e f85413g;

    /* renamed from: g */
    public static synchronized C35070d m143959g() {
        C35070d dVar;
        synchronized (C35070d.class) {
            if (f85406h == null) {
                f85406h = new C35070d();
            }
            dVar = f85406h;
        }
        return dVar;
    }

    @C0359n0
    /* renamed from: a */
    public String mo104426a() {
        return this.f85410d;
    }

    /* renamed from: b */
    public JSONObject mo104427b(@C0359n0 Context context) {
        JSONObject jSONObject = this.f85407a;
        return jSONObject != null ? jSONObject : new C35015e(context).mo103995f();
    }

    /* renamed from: c */
    public void mo104428c(@C0363p0 JSONObject jSONObject) {
        this.f85407a = jSONObject;
    }

    @C0359n0
    /* renamed from: d */
    public C35105e mo104429d() {
        return this.f85413g;
    }

    /* renamed from: e */
    public void mo104430e(@C0359n0 Context context) {
        try {
            JSONObject b = mo104427b(context);
            this.f85407a = b;
            if (b != null) {
                this.f85408b = b.optString("PcTextColor");
                if (this.f85407a.has("LegIntSettings") && !C35020d.m143605J("LegIntSettings")) {
                    this.f85407a.getJSONObject("LegIntSettings").getBoolean("PAllowLI");
                }
                this.f85409c = this.f85407a.optString("PCenterVendorsListText");
                this.f85410d = this.f85407a.optString("PCenterApplyFiltersText");
                this.f85411e = this.f85407a.optString("PCenterClearFiltersText");
                C35126z w = new C35114n(context).mo104811w(22);
                this.f85412f = w;
                if (w != null) {
                    if (C35020d.m143605J(w.mo105045E().mo104966a().mo104663g())) {
                        this.f85412f.mo105045E().mo104966a().mo104662f(this.f85409c);
                    }
                    this.f85413g = new C35105e();
                    if (C35020d.m143605J(this.f85412f.mo105078y())) {
                        this.f85412f.mo105070r(this.f85407a.optString("PcButtonColor"));
                    }
                    this.f85413g.mo104718v(this.f85412f.mo105078y());
                    if (C35020d.m143605J(this.f85412f.mo105076w())) {
                        this.f85412f.mo105068p(this.f85407a.optString("PcTextColor"));
                    }
                    this.f85413g.mo104701d(this.f85412f.mo105076w());
                    this.f85413g.mo104709l(C35068b.m143905i().mo104384j());
                }
            }
        } catch (JSONException e) {
            OTLogger.m143457l("OneTrust", "Error while parsing PC data for VL rendering, error: " + e.getMessage());
        }
    }

    @C0359n0
    /* renamed from: f */
    public String mo104431f() {
        return this.f85411e;
    }

    @C0359n0
    /* renamed from: h */
    public String mo104432h() {
        return this.f85408b;
    }

    @C0359n0
    /* renamed from: i */
    public String mo104433i() {
        C35126z zVar = this.f85412f;
        return (zVar == null || zVar.mo105045E().mo104966a().mo104663g() == null) ? "" : this.f85412f.mo105045E().mo104966a().mo104663g();
    }
}
