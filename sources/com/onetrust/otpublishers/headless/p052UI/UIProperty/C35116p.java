package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.Internal.C35020d;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.p */
public class C35116p {

    /* renamed from: a */
    public String f85694a;

    /* renamed from: b */
    public String f85695b;

    /* renamed from: c */
    public String f85696c;

    /* renamed from: d */
    public String f85697d;

    /* renamed from: e */
    public String f85698e;

    @C0359n0
    /* renamed from: a */
    public static C35116p m144453a(@C0363p0 JSONObject jSONObject, @C0363p0 String str) {
        C35116p pVar = new C35116p();
        if (jSONObject != null) {
            if (jSONObject.has("BannerTitle")) {
                pVar.mo104835g(jSONObject.getString("BannerTitle"));
            }
            if (jSONObject.has("AlertNoticeText")) {
                pVar.mo104833e(jSONObject.getString("AlertNoticeText"));
            }
            if (jSONObject.has("BannerAdditionalDescription")) {
                pVar.mo104831c(jSONObject.getString("BannerAdditionalDescription"));
            }
            if (jSONObject.has("OptanonLogo")) {
                pVar.mo104839k(jSONObject.getString("OptanonLogo"));
            }
        }
        if (str != null && !C35020d.m143605J(str)) {
            pVar.mo104837i(str);
        }
        return pVar;
    }

    @C0363p0
    /* renamed from: b */
    public String mo104830b() {
        return this.f85696c;
    }

    /* renamed from: c */
    public void mo104831c(@C0359n0 String str) {
        this.f85696c = str;
    }

    @C0363p0
    /* renamed from: d */
    public String mo104832d() {
        return this.f85695b;
    }

    /* renamed from: e */
    public void mo104833e(@C0359n0 String str) {
        this.f85695b = str;
    }

    @C0363p0
    /* renamed from: f */
    public String mo104834f() {
        return this.f85694a;
    }

    /* renamed from: g */
    public void mo104835g(@C0359n0 String str) {
        this.f85694a = str;
    }

    @C0363p0
    /* renamed from: h */
    public String mo104836h() {
        return this.f85698e;
    }

    /* renamed from: i */
    public void mo104837i(@C0359n0 String str) {
        this.f85698e = str;
    }

    @C0363p0
    /* renamed from: j */
    public String mo104838j() {
        return this.f85697d;
    }

    /* renamed from: k */
    public void mo104839k(@C0359n0 String str) {
        this.f85697d = str;
    }
}
