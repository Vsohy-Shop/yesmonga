package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.i */
public class C35109i {
    @C0359n0
    /* renamed from: a */
    public String mo104752a(int i, @C0359n0 String str, @C0359n0 String str2) {
        return i == 11 ? C35020d.m143605J(str2) ? "" : str2 : C35020d.m143605J(str) ? "" : str;
    }

    @C0363p0
    /* renamed from: b */
    public JSONObject mo104753b(@C0359n0 JSONObject jSONObject, @C0359n0 String str, @C0359n0 String str2) {
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2.has(str2)) {
            return jSONObject2.getJSONObject(str2);
        }
        return null;
    }
}
