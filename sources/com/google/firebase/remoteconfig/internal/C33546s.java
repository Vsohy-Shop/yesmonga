package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import androidx.annotation.C0359n0;
import com.google.firebase.analytics.connector.C32537a;
import com.google.firebase.inject.C33058b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.s */
public class C33546s {

    /* renamed from: c */
    public static final String f81656c = "fp";

    /* renamed from: d */
    public static final String f81657d = "personalization_assignment";

    /* renamed from: e */
    public static final String f81658e = "arm_key";

    /* renamed from: f */
    public static final String f81659f = "arm_value";

    /* renamed from: g */
    public static final String f81660g = "personalizationId";

    /* renamed from: h */
    public static final String f81661h = "personalization_id";

    /* renamed from: i */
    public static final String f81662i = "armIndex";

    /* renamed from: j */
    public static final String f81663j = "arm_index";

    /* renamed from: k */
    public static final String f81664k = "group";

    /* renamed from: l */
    public static final String f81665l = "group";

    /* renamed from: m */
    public static final String f81666m = "_fpc";

    /* renamed from: n */
    public static final String f81667n = "choiceId";

    /* renamed from: o */
    public static final String f81668o = "_fpid";

    /* renamed from: a */
    public final C33058b<C32537a> f81669a;

    /* renamed from: b */
    public final Map<String, String> f81670b = Collections.synchronizedMap(new HashMap());

    public C33546s(C33058b<C32537a> bVar) {
        this.f81669a = bVar;
    }

    /* renamed from: a */
    public void mo97384a(@C0359n0 String str, @C0359n0 C33526f fVar) {
        JSONObject optJSONObject;
        C32537a aVar = this.f81669a.get();
        if (aVar != null) {
            JSONObject f = fVar.mo97305f();
            if (f.length() >= 1) {
                JSONObject d = fVar.mo97302d();
                if (d.length() >= 1 && (optJSONObject = f.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString(f81667n);
                    if (!optString.isEmpty()) {
                        synchronized (this.f81670b) {
                            if (!optString.equals(this.f81670b.get(str))) {
                                this.f81670b.put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString(f81658e, str);
                                bundle.putString(f81659f, d.optString(str));
                                bundle.putString(f81661h, optJSONObject.optString(f81660g));
                                bundle.putInt(f81663j, optJSONObject.optInt(f81662i, -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.mo94646b(f81656c, f81657d, bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(f81668o, optString);
                                aVar.mo94646b(f81656c, f81666m, bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}
