package com.android.volley.toolbox;

import androidx.annotation.C0363p0;
import com.android.volley.C21762l;
import com.android.volley.C21771p;
import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.volley.toolbox.t */
public class C21829t extends C21830u<JSONObject> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21829t(int i, String str, @C0363p0 JSONObject jSONObject, C21771p.C21773b<JSONObject> bVar, @C0363p0 C21771p.C21772a aVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    /* renamed from: k1 */
    public C21771p<JSONObject> mo20305k1(C21762l lVar) {
        try {
            return C21771p.m100087c(new JSONObject(new String(lVar.f56298b, C21812m.m100217g(lVar.f56299c, "utf-8"))), C21812m.m100215e(lVar));
        } catch (UnsupportedEncodingException e) {
            return C21771p.m100086a(new ParseError((Throwable) e));
        } catch (JSONException e2) {
            return C21771p.m100086a(new ParseError((Throwable) e2));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21829t(String str, @C0363p0 JSONObject jSONObject, C21771p.C21773b<JSONObject> bVar, @C0363p0 C21771p.C21772a aVar) {
        this(jSONObject == null ? 0 : 1, str, jSONObject, bVar, aVar);
    }
}
