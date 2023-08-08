package com.contentsquare.android.sdk;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.k4 */
public class C14466k4 {

    /* renamed from: e */
    public static final C14453jf f35731e = new C14453jf();

    /* renamed from: a */
    public final int f35732a;

    /* renamed from: b */
    public final C14471e f35733b;

    /* renamed from: c */
    public final C14471e f35734c;

    /* renamed from: d */
    public final C14469c f35735d;

    /* renamed from: com.contentsquare.android.sdk.k4$a */
    public static class C14467a {

        /* renamed from: a */
        public final boolean f35736a;

        /* renamed from: b */
        public final String f35737b;

        public C14467a(boolean z, String str) {
            this.f35736a = z;
            this.f35737b = str;
        }

        /* renamed from: a */
        public static C14467a m62303a(JSONObject jSONObject) {
            return new C14467a(jSONObject.getBoolean("snapshot"), jSONObject.getString("snapshot_endpoint"));
        }

        /* renamed from: b */
        public String mo35714b() {
            return this.f35737b;
        }

        /* renamed from: c */
        public final JSONObject mo35715c() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snapshot", this.f35736a);
            jSONObject.put("snapshot_endpoint", this.f35737b);
            return jSONObject;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k4$b */
    public static class C14468b {

        /* renamed from: a */
        public final String f35738a;

        /* renamed from: b */
        public final boolean f35739b;

        /* renamed from: c */
        public final String f35740c;

        public C14468b(String str, boolean z, String str2) {
            this.f35738a = str;
            this.f35739b = z;
            this.f35740c = str2;
        }

        /* renamed from: a */
        public static C14468b m62306a(JSONObject jSONObject) {
            return new C14468b(jSONObject.getString("name"), jSONObject.getBoolean("enabled"), jSONObject.getString("min_version"));
        }

        /* renamed from: b */
        public String mo35716b() {
            return this.f35740c;
        }

        /* renamed from: c */
        public String mo35717c() {
            return this.f35738a;
        }

        /* renamed from: d */
        public boolean mo35718d() {
            return this.f35739b;
        }

        /* renamed from: e */
        public final JSONObject mo35719e() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", this.f35738a);
            jSONObject.put("enabled", this.f35739b);
            jSONObject.put("min_version", this.f35740c);
            return jSONObject;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k4$c */
    public static class C14469c {

        /* renamed from: a */
        public final boolean f35741a;

        /* renamed from: b */
        public final String f35742b;

        public C14469c(boolean z, String str) {
            this.f35741a = z;
            this.f35742b = str;
        }

        /* renamed from: a */
        public static C14469c m62311a(JSONObject jSONObject) {
            return new C14469c(jSONObject.getBoolean("enable_log"), jSONObject.getString("activation_flag"));
        }

        /* renamed from: b */
        public final JSONObject mo35720b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activation_flag", this.f35742b);
            jSONObject.put("enable_log", this.f35741a);
            return jSONObject;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k4$d */
    public static class C14470d {

        /* renamed from: a */
        public final boolean f35743a;

        /* renamed from: b */
        public final String f35744b;

        public C14470d() {
            this.f35743a = false;
            this.f35744b = "";
        }

        /* renamed from: a */
        public static C14470d m62313a(JSONObject jSONObject) {
            return jSONObject == null ? new C14470d() : new C14470d(jSONObject.optBoolean("enabled"), jSONObject.optString("activation_key"));
        }

        /* renamed from: b */
        public String mo35721b() {
            return this.f35744b;
        }

        /* renamed from: c */
        public boolean mo35722c() {
            return this.f35743a;
        }

        /* renamed from: d */
        public final JSONObject mo35723d() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", this.f35743a);
            jSONObject.put("activation_key", this.f35744b);
            return jSONObject;
        }

        public C14470d(boolean z, String str) {
            this.f35743a = z;
            this.f35744b = str;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k4$e */
    public static class C14471e {

        /* renamed from: a */
        public final boolean f35745a;

        /* renamed from: b */
        public final String f35746b;

        /* renamed from: c */
        public final double f35747c;

        /* renamed from: d */
        public final int f35748d;

        /* renamed from: e */
        public final boolean f35749e;

        /* renamed from: f */
        public final long f35750f;

        /* renamed from: g */
        public final boolean f35751g;

        /* renamed from: h */
        public final boolean f35752h;

        /* renamed from: i */
        public final C14467a f35753i;

        /* renamed from: j */
        public final C14470d f35754j;

        /* renamed from: k */
        public final C14472f f35755k;

        /* renamed from: l */
        public final List<C14468b> f35756l;

        public C14471e(boolean z, String str, double d, int i, boolean z2, long j, boolean z3, boolean z4, C14467a aVar, C14470d dVar, C14472f fVar, List<C14468b> list) {
            this.f35745a = z;
            this.f35746b = str;
            this.f35747c = d;
            this.f35748d = i;
            this.f35749e = z2;
            this.f35750f = j;
            this.f35751g = z3;
            this.f35752h = z4;
            this.f35753i = aVar;
            this.f35754j = dVar;
            this.f35755k = fVar;
            this.f35756l = list;
        }

        /* renamed from: b */
        public static C14471e m62317b(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            boolean z = jSONObject2.getBoolean("enabled");
            String string = jSONObject2.getString("endpoint");
            double d = jSONObject2.getDouble("sample");
            int i = jSONObject2.getInt("bucket");
            boolean z2 = jSONObject2.getBoolean("crash_handler");
            long j = jSONObject2.getLong("session_timeout");
            boolean z3 = jSONObject2.getBoolean("opt_out_by_default");
            boolean z4 = jSONObject2.getBoolean("enable_screen_auto_tracking");
            C14467a a = C14467a.m62303a(jSONObject2.getJSONObject("client_mode"));
            C14470d a2 = C14470d.m62313a(jSONObject2.optJSONObject("in_app_config"));
            C14472f a3 = C14472f.m62331a(jSONObject2.optJSONObject("session_replay"));
            JSONArray jSONArray = jSONObject2.getJSONArray("feature_flags");
            ArrayList arrayList = new ArrayList();
            C14472f fVar = a3;
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(C14468b.m62306a((JSONObject) jSONArray.opt(i2)));
            }
            return new C14471e(z, string, d, i, z2, j, z3, z4, a, a2, fVar, arrayList);
        }

        /* renamed from: a */
        public int mo35724a() {
            return this.f35748d;
        }

        /* renamed from: c */
        public C14467a mo35725c() {
            return this.f35753i;
        }

        /* renamed from: d */
        public String mo35726d() {
            return this.f35746b;
        }

        /* renamed from: e */
        public List<C14468b> mo35727e() {
            return this.f35756l;
        }

        /* renamed from: f */
        public C14470d mo35728f() {
            return this.f35754j;
        }

        /* renamed from: g */
        public double mo35729g() {
            return this.f35747c;
        }

        /* renamed from: h */
        public C14472f mo35730h() {
            return this.f35755k;
        }

        /* renamed from: i */
        public long mo35731i() {
            return this.f35750f;
        }

        /* renamed from: j */
        public boolean mo35732j() {
            return this.f35749e;
        }

        /* renamed from: k */
        public boolean mo35733k() {
            return this.f35751g;
        }

        /* renamed from: l */
        public boolean mo35734l() {
            return this.f35752h;
        }

        /* renamed from: m */
        public boolean mo35735m() {
            return this.f35745a;
        }

        /* renamed from: n */
        public final JSONObject mo35736n() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enabled", this.f35745a);
            jSONObject.put("endpoint", this.f35746b);
            jSONObject.put("sample", this.f35747c);
            jSONObject.put("bucket", this.f35748d);
            jSONObject.put("crash_handler", this.f35749e);
            jSONObject.put("session_timeout", this.f35750f);
            jSONObject.put("opt_out_by_default", this.f35751g);
            jSONObject.put("enable_screen_auto_tracking", this.f35752h);
            jSONObject.put("client_mode", this.f35753i.mo35715c());
            jSONObject.put("in_app_config", this.f35754j.mo35723d());
            jSONObject.put("session_replay", this.f35755k.mo35743h());
            JSONArray jSONArray = new JSONArray();
            for (C14468b e : this.f35756l) {
                jSONArray.put(e.mo35719e());
            }
            jSONObject.put("feature_flags", jSONArray);
            return jSONObject;
        }
    }

    /* renamed from: com.contentsquare.android.sdk.k4$f */
    public static class C14472f {

        /* renamed from: a */
        public final double f35757a;

        /* renamed from: b */
        public final boolean f35758b;

        /* renamed from: c */
        public final String f35759c;

        /* renamed from: d */
        public final String f35760d;

        /* renamed from: e */
        public final ArrayList<String> f35761e;

        /* renamed from: f */
        public final String f35762f;

        public C14472f() {
            this.f35757a = 0.0d;
            this.f35758b = false;
            this.f35761e = new ArrayList<>();
            String str = C14923z8.f36995g;
            this.f35760d = str;
            this.f35759c = str;
            this.f35762f = "";
        }

        /* renamed from: a */
        public static C14472f m62331a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return new C14472f();
            }
            double optDouble = jSONObject.optDouble("recording_rate", 0.0d);
            boolean optBoolean = jSONObject.optBoolean("record_via_cellular_network");
            JSONArray optJSONArray = jSONObject.optJSONArray("blocked_app_versions");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i, ""));
                }
            }
            String optString = jSONObject.optString("endpoint", "");
            String str = C14923z8.f36995g;
            return new C14472f(optString, optDouble, optBoolean, jSONObject.optString("recording_quality_cellular", str), jSONObject.optString("recording_quality_wifi", str), arrayList);
        }

        /* renamed from: b */
        public ArrayList<String> mo35737b() {
            return this.f35761e;
        }

        /* renamed from: c */
        public String mo35738c() {
            return this.f35762f;
        }

        /* renamed from: d */
        public String mo35739d() {
            return this.f35760d;
        }

        /* renamed from: e */
        public String mo35740e() {
            return this.f35759c;
        }

        /* renamed from: f */
        public double mo35741f() {
            return this.f35757a;
        }

        /* renamed from: g */
        public boolean mo35742g() {
            return this.f35758b;
        }

        /* renamed from: h */
        public final JSONObject mo35743h() {
            JSONObject jSONObject = new JSONObject();
            if (!"".equals(this.f35762f)) {
                jSONObject.put("endpoint", this.f35762f);
            }
            jSONObject.put("recording_rate", this.f35757a);
            jSONObject.put("record_via_cellular_network", this.f35758b);
            jSONObject.put("recording_quality_cellular", this.f35760d);
            jSONObject.put("recording_quality_wifi", this.f35759c);
            jSONObject.put("blocked_app_versions", new JSONArray(this.f35761e));
            return jSONObject;
        }

        public C14472f(String str, double d, boolean z, String str2, String str3, ArrayList<String> arrayList) {
            this.f35762f = str;
            this.f35757a = d;
            this.f35758b = z;
            this.f35760d = str2;
            this.f35759c = str3;
            this.f35761e = arrayList;
        }
    }

    public C14466k4(int i, C14471e eVar, C14471e eVar2, C14469c cVar) {
        this.f35732a = i;
        this.f35733b = eVar;
        this.f35734c = eVar2;
        this.f35735d = cVar;
    }

    /* renamed from: b */
    public static C14466k4 m62296b(String str) {
        try {
            return m62297c(new JSONObject(str));
        } catch (NullPointerException | JSONException e) {
            f35731e.mo35678g(e, "could not parse the configuration", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static C14466k4 m62297c(JSONObject jSONObject) {
        int i = jSONObject.getInt("cs_project_id");
        JSONObject jSONObject2 = jSONObject.getJSONObject("project_configurations");
        return new C14466k4(i, C14471e.m62317b(jSONObject2.getJSONObject("project_config")), C14471e.m62317b(jSONObject2.getJSONObject("god_mode_project_config")), C14469c.m62311a(jSONObject.getJSONObject("god_mode")));
    }

    /* renamed from: a */
    public int mo35709a() {
        return this.f35732a;
    }

    /* renamed from: d */
    public C14471e mo35710d() {
        return this.f35734c;
    }

    /* renamed from: e */
    public C14471e mo35711e() {
        return this.f35733b;
    }

    /* renamed from: f */
    public final JSONObject mo35712f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cs_project_id", this.f35732a);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("project_config", this.f35733b.mo35736n());
        jSONObject2.put("god_mode_project_config", this.f35734c.mo35736n());
        jSONObject.put("project_configurations", jSONObject2);
        jSONObject.put("god_mode", this.f35735d.mo35720b());
        return jSONObject;
    }

    /* renamed from: g */
    public String mo35713g() {
        try {
            return mo35712f().toString();
        } catch (JSONException e) {
            f35731e.mo35678g(e, "could not serialise configuration as Json", new Object[0]);
            return null;
        }
    }
}
