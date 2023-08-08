package com.contentsquare.android.sdk;

import com.carrefour.fid.android.shared.constant.C28515a1;
import com.journeyapps.barcodescanner.camera.C34930o;
import com.usabilla.sdk.ubform.net.C9851c;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.y6 */
public class C14886y6 {

    /* renamed from: a */
    public static C14453jf f36929a = new C14453jf("JsonProxyUtils");

    /* renamed from: a */
    public static JSONObject m64137a(C14283e eVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pid", eVar.mo34989h());
            jSONObject.put("uid", eVar.mo34993l());
            jSONObject.put("dt", eVar.mo34986e());
            jSONObject.put("os", eVar.mo34987f());
            jSONObject.put("l", eVar.mo34982a());
            jSONObject.put("tz", eVar.mo34991j());
            jSONObject.put("to", eVar.mo34992k());
            jSONObject.put(C28515a1.f68703k, eVar.mo34985d());
            jSONObject.put("pl", eVar.mo34988g());
            jSONObject.put("now", eVar.mo34990i());
            jSONObject.put("dmo", eVar.mo34984c());
            jSONObject.put("dma", eVar.mo34983b());
            return jSONObject;
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[EventsBundle] Error in json proxy : %s", e.getMessage());
            return jSONObject;
        }
    }

    /* renamed from: b */
    public static JSONObject m64138b(C14659r0 r0Var) {
        JSONObject q = m64153q(r0Var);
        try {
            q.put("tvp", r0Var.mo36283m());
            q.put("tvt", r0Var.mo36285o());
            q.put("tvac", r0Var.mo36284n());
            m64151o(r0Var);
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[LongPressEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: c */
    public static JSONObject m64139c(C14883y4 y4Var) {
        JSONObject q = m64153q(y4Var);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hm", y4Var.mo36913m());
            jSONObject.put("u", y4Var.mo36915o());
            jSONObject.put("sc", y4Var.mo36917q());
            jSONObject.put("rst", y4Var.mo36914n());
            jSONObject.put("rpt", y4Var.mo36916p());
            q.putOpt("nrm", jSONObject);
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[NetworkRequestMetricEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: d */
    public static JSONObject m64140d(C14497l8 l8Var) {
        JSONObject q = m64153q(l8Var);
        try {
            q.put("tvp", l8Var.mo35815m());
            q.put("tvt", l8Var.mo35817o());
            q.put("tvac", l8Var.mo35816n());
            q.put("ur", l8Var.mo35818p());
            m64151o(l8Var);
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[TapEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: e */
    public static JSONObject m64141e(C14613p8 p8Var) {
        JSONObject q = m64153q(p8Var);
        try {
            q.put("tvp", p8Var.mo36145p());
            q.put("tvt", p8Var.mo36147r());
            q.put("tvac", p8Var.mo36146q());
            q.put("fd", p8Var.mo36142m());
            q.put("tvd", p8Var.mo36143n());
            q.put("tvv", p8Var.mo36144o());
            m64151o(p8Var);
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[DragEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: f */
    public static JSONObject m64142f(C14479ka kaVar) {
        return m64153q(kaVar);
    }

    /* renamed from: g */
    public static JSONObject m64143g(C14342fb fbVar) {
        JSONObject q = m64153q(fbVar);
        try {
            q.put("m", fbVar.mo35182n());
            q.put("co", fbVar.mo35181m());
            q.put("cf", fbVar.mo35183o());
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[CrashEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: h */
    public static JSONObject m64144h(C14375gb gbVar) {
        JSONObject q = m64153q(gbVar);
        try {
            q.put("k", gbVar.mo35370m());
            q.put(C9851c.f26937h, gbVar.mo35371n());
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[DynamicStringVarEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: i */
    public static JSONObject m64145i(C14223bc bcVar) {
        JSONObject q = m64153q(bcVar);
        try {
            q.put("k", bcVar.mo34707m());
            q.put(C9851c.f26937h, bcVar.mo34708n());
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[DynamicStringVarEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: j */
    public static JSONObject m64146j(C14928zb zbVar) {
        return m64153q(zbVar);
    }

    /* renamed from: k */
    public static JSONObject m64147k(C14685rc rcVar) {
        return m64153q(rcVar);
    }

    /* renamed from: l */
    public static JSONObject m64148l(C14655qe qeVar) {
        JSONObject q = m64153q(qeVar);
        try {
            q.put("tvp", qeVar.mo36268p());
            q.put("tvt", qeVar.mo36270r());
            q.put("tvac", qeVar.mo36269q());
            q.put("fd", qeVar.mo36265m());
            q.put("tvd", qeVar.mo36266n());
            q.put("tvv", qeVar.mo36267o());
            m64151o(qeVar);
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[FlickEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: m */
    public static JSONObject m64149m(C14228bf bfVar) {
        JSONObject q = m64153q(bfVar);
        try {
            q.put("tr", bfVar.mo34719m());
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[DragEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: n */
    public static JSONObject m64150n(C14313eg egVar) {
        JSONObject q = m64153q(egVar);
        try {
            q.put("sl", egVar.mo35095m());
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[ScreenViewEvent] Error in json proxy : %s", e.getMessage());
        }
        return q;
    }

    /* renamed from: o */
    public static void m64151o(C14439j3 j3Var) {
        if (j3Var.mo35594j().isEmpty()) {
            f36929a.mo35679i("No screenview detected. Gestures are linked to screenviews. Please implement screenview tracking to enable gestures tracking.", new Object[0]);
        }
    }

    /* renamed from: p */
    public static JSONObject m64152p(C14439j3 j3Var) {
        if (j3Var instanceof C14313eg) {
            return m64150n((C14313eg) j3Var);
        }
        if (j3Var instanceof C14497l8) {
            return m64140d((C14497l8) j3Var);
        }
        if (j3Var instanceof C14659r0) {
            return m64138b((C14659r0) j3Var);
        }
        if (j3Var instanceof C14613p8) {
            return m64141e((C14613p8) j3Var);
        }
        if (j3Var instanceof C14655qe) {
            return m64148l((C14655qe) j3Var);
        }
        if (j3Var instanceof C14342fb) {
            return m64143g((C14342fb) j3Var);
        }
        if (j3Var instanceof C14685rc) {
            return m64147k((C14685rc) j3Var);
        }
        if (j3Var instanceof C14928zb) {
            return m64146j((C14928zb) j3Var);
        }
        if (j3Var instanceof C14479ka) {
            return m64142f((C14479ka) j3Var);
        }
        if (j3Var instanceof C14228bf) {
            return m64149m((C14228bf) j3Var);
        }
        if (j3Var instanceof C14883y4) {
            return m64139c((C14883y4) j3Var);
        }
        if (j3Var instanceof C14223bc) {
            return m64145i((C14223bc) j3Var);
        }
        if (j3Var instanceof C14375gb) {
            return m64144h((C14375gb) j3Var);
        }
        f36929a.mo35677f("!!Wrong event type sent! returning null.", new Object[0]);
        return null;
    }

    /* renamed from: q */
    public static JSONObject m64153q(C14439j3 j3Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("euid", j3Var.mo35595k());
            jSONObject.put("ea", j3Var.mo35587c());
            jSONObject.put("url", j3Var.mo35594j());
            jSONObject.put("scn", j3Var.mo35590f());
            jSONObject.put("c", j3Var.mo35586b());
            jSONObject.put("ci", j3Var.mo35585a());
            jSONObject.put(C34930o.f84983b, j3Var.mo35588d());
            jSONObject.put("vo", j3Var.mo35589e());
            jSONObject.put("sn", j3Var.mo35591g());
            jSONObject.put(C10108c.f27801d, j3Var.mo35592h());
            jSONObject.put("upt", j3Var.mo35593i());
        } catch (JSONException e) {
            f36929a.mo35680j(e, "[EventsBundle] Error in json proxy : %s", e.getMessage());
        }
        return jSONObject;
    }
}
