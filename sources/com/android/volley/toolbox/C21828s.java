package com.android.volley.toolbox;

import androidx.annotation.C0363p0;
import com.android.volley.C21762l;
import com.android.volley.C21771p;
import com.android.volley.ParseError;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.android.volley.toolbox.s */
public class C21828s extends C21830u<JSONArray> {
    public C21828s(String str, C21771p.C21773b<JSONArray> bVar, @C0363p0 C21771p.C21772a aVar) {
        super(0, str, (String) null, bVar, aVar);
    }

    /* renamed from: k1 */
    public C21771p<JSONArray> mo20305k1(C21762l lVar) {
        try {
            return C21771p.m100087c(new JSONArray(new String(lVar.f56298b, C21812m.m100217g(lVar.f56299c, "utf-8"))), C21812m.m100215e(lVar));
        } catch (UnsupportedEncodingException e) {
            return C21771p.m100086a(new ParseError((Throwable) e));
        } catch (JSONException e2) {
            return C21771p.m100086a(new ParseError((Throwable) e2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21828s(int i, String str, @C0363p0 JSONArray jSONArray, C21771p.C21773b<JSONArray> bVar, @C0363p0 C21771p.C21772a aVar) {
        super(i, str, jSONArray == null ? null : jSONArray.toString(), bVar, aVar);
    }
}
