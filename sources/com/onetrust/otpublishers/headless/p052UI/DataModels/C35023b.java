package com.onetrust.otpublishers.headless.p052UI.DataModels;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.onetrust.otpublishers.headless.UI.DataModels.b */
public class C35023b {

    /* renamed from: a */
    public String f85240a;

    /* renamed from: b */
    public String f85241b;

    /* renamed from: c */
    public String f85242c;

    /* renamed from: d */
    public String f85243d;

    /* renamed from: e */
    public String f85244e;

    /* renamed from: f */
    public String f85245f;

    /* renamed from: g */
    public String f85246g;

    /* renamed from: h */
    public String f85247h;

    /* renamed from: i */
    public ArrayList<C35025d> f85248i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C35021a> f85249j = new ArrayList<>();

    /* renamed from: k */
    public String f85250k;

    /* renamed from: l */
    public String f85251l;

    @C0363p0
    /* renamed from: a */
    public String mo104214a() {
        return this.f85242c;
    }

    /* renamed from: b */
    public void mo104215b(@C0359n0 String str) {
        this.f85242c = str;
    }

    /* renamed from: c */
    public void mo104216c(@C0363p0 ArrayList<C35021a> arrayList) {
        this.f85249j = arrayList;
    }

    @C0363p0
    /* renamed from: d */
    public String mo104217d() {
        return this.f85240a;
    }

    /* renamed from: e */
    public void mo104218e(@C0359n0 String str) {
        this.f85240a = str;
    }

    /* renamed from: f */
    public void mo104219f(@C0363p0 ArrayList<C35025d> arrayList) {
        this.f85248i = arrayList;
    }

    @C0363p0
    /* renamed from: g */
    public String mo104220g() {
        return this.f85241b;
    }

    /* renamed from: h */
    public void mo104221h(@C0359n0 String str) {
        this.f85241b = str;
    }

    @C0363p0
    /* renamed from: i */
    public ArrayList<C35021a> mo104222i() {
        return this.f85249j;
    }

    /* renamed from: j */
    public void mo104223j(@C0359n0 String str) {
        this.f85246g = str;
    }

    @C0363p0
    /* renamed from: k */
    public ArrayList<C35025d> mo104224k() {
        return this.f85248i;
    }

    /* renamed from: l */
    public void mo104225l(@C0359n0 String str) {
        this.f85244e = str;
    }

    /* renamed from: m */
    public void mo104226m(@C0359n0 String str) {
        this.f85243d = str;
    }

    /* renamed from: n */
    public void mo104227n(@C0359n0 String str) {
        this.f85245f = str;
    }

    /* renamed from: o */
    public void mo104228o(@C0359n0 String str) {
        this.f85251l = str;
    }

    /* renamed from: p */
    public void mo104229p(@C0359n0 String str) {
        this.f85247h = str;
    }

    public String toString() {
        return "OTUCPurposesModel{Id='" + this.f85240a + '\'' + ", Label='" + this.f85241b + '\'' + ", Description='" + this.f85242c + '\'' + ", Status='" + this.f85243d + '\'' + ", NewVersionAvailable='" + this.f85244e + '\'' + ", Type='" + this.f85245f + '\'' + ", LifeSpan='" + this.f85246g + '\'' + ", Version='" + this.f85247h + '\'' + ", otUcPurposesTopicsModels=" + this.f85248i + ", otUcPurposesCustomPreferencesModels=" + this.f85249j + ", DefaultConsentStatus='" + this.f85250k + '\'' + ", UserConsentStatus='" + this.f85251l + '\'' + C12361b.f30259j;
    }
}
