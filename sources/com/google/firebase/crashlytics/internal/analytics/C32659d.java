package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.breadcrumbs.C32663a;
import com.google.firebase.crashlytics.internal.breadcrumbs.C32664b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.internal.analytics.d */
public class C32659d implements C32657b, C32664b {

    /* renamed from: b */
    public static final String f79227b = "name";

    /* renamed from: c */
    public static final String f79228c = "parameters";

    /* renamed from: d */
    public static final String f79229d = "$A$:";
    @C0363p0

    /* renamed from: a */
    public C32663a f79230a;

    @C0359n0
    /* renamed from: b */
    public static String m131901b(@C0359n0 String str, @C0359n0 Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put(f79228c, jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: U0 */
    public void mo94844U0(@C0359n0 String str, @C0359n0 Bundle bundle) {
        C32663a aVar = this.f79230a;
        if (aVar != null) {
            try {
                aVar.mo94846a(f79229d + m131901b(str, bundle));
            } catch (JSONException unused) {
                C32741f.m132248f().mo95062m("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    /* renamed from: a */
    public void mo94807a(@C0363p0 C32663a aVar) {
        this.f79230a = aVar;
        C32741f.m132248f().mo95052b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
