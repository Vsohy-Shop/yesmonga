package com.contentsquare.android.sdk;

import com.contentsquare.android.api.model.C14103e;
import com.contentsquare.android.sdk.C14439j3;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.bf */
public class C14228bf extends C14439j3 {

    /* renamed from: m */
    public final JSONObject f35144m;

    /* renamed from: com.contentsquare.android.sdk.bf$a */
    public static class C14229a extends C14439j3.C14440a<C14228bf> {

        /* renamed from: k */
        public JSONObject f35145k;

        public C14229a() {
            mo35603i(16);
        }

        /* renamed from: v */
        public C14229a mo34720v(C14103e eVar) {
            C14453jf jfVar = new C14453jf("TransactionEventBuilder");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("vl", (double) eVar.mo34349e());
                jSONObject.put("cu", eVar.mo34347c());
                if (eVar.mo34348d() != null) {
                    jSONObject.put("id", eVar.mo34348d());
                }
                this.f35145k = jSONObject;
                return this;
            } catch (JSONException e) {
                this.f35145k = null;
                jfVar.mo35678g(e, "Not valid transaction JSON: ", e);
                throw new IllegalArgumentException("Invalid transaction");
            }
        }

        /* renamed from: w */
        public C14228bf mo34709e() {
            return new C14228bf(this);
        }

        /* renamed from: x */
        public JSONObject mo34722x() {
            return this.f35145k;
        }
    }

    public C14228bf(C14229a aVar) {
        super(aVar);
        this.f35144m = aVar.mo34722x();
    }

    /* renamed from: l */
    public void mo34706l() {
        double optDouble = this.f35144m.optDouble("vl", 0.0d);
        String format = String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(optDouble)});
        int optInt = this.f35144m.optInt("cu", 0);
        String optString = this.f35144m.optString("id", "");
        C14439j3.f35661l.mo35679i("Transaction - Value: %s - Currency: %d - ID: %s", format, Integer.valueOf(optInt), optString);
    }

    /* renamed from: m */
    public JSONObject mo34719m() {
        return this.f35144m;
    }
}
