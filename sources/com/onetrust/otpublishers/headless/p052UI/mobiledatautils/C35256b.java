package com.onetrust.otpublishers.headless.p052UI.mobiledatautils;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.mobiledatautils.b */
public class C35256b {

    /* renamed from: a */
    public int f86572a;

    public C35256b(int i) {
        this.f86572a = i;
    }

    @C0376v0(api = 17)
    /* renamed from: a */
    public int mo105525a(@C0363p0 String str) {
        if (!C35020d.m143605J(str)) {
            return Integer.parseInt(str);
        }
        return 2;
    }

    @C0359n0
    /* renamed from: b */
    public String mo105526b(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 String str4) {
        return !C35020d.m143605J(str) ? str : !C35020d.m143605J(str2) ? str2 : this.f86572a == 11 ? str4 : str3;
    }

    @C0359n0
    /* renamed from: c */
    public String mo105527c(@C0363p0 String str, @C0359n0 String str2, @C0363p0 JSONObject jSONObject) {
        return (str == null || C35020d.m143605J(str)) ? jSONObject != null ? jSONObject.optString(str2) : "#E8E8E8" : str;
    }
}
