package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.onetrust.otpublishers.headless.p052UI.DataModels.C35023b;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.w */
public class C35123w {

    /* renamed from: a */
    public String f85780a;

    /* renamed from: b */
    public String f85781b;

    /* renamed from: c */
    public String f85782c;

    /* renamed from: d */
    public String f85783d;

    /* renamed from: e */
    public C35102b0 f85784e = new C35102b0();

    /* renamed from: f */
    public C35102b0 f85785f = new C35102b0();

    /* renamed from: g */
    public C35105e f85786g = new C35105e();

    /* renamed from: h */
    public ArrayList<C35023b> f85787h = new ArrayList<>();

    @C0359n0
    /* renamed from: a */
    public C35102b0 mo104995a() {
        return this.f85785f;
    }

    /* renamed from: b */
    public void mo104996b(@C0359n0 C35105e eVar) {
        this.f85786g = eVar;
    }

    /* renamed from: c */
    public void mo104997c(@C0359n0 C35102b0 b0Var) {
        this.f85785f = b0Var;
    }

    /* renamed from: d */
    public void mo104998d(@C0359n0 String str) {
        this.f85782c = str;
    }

    /* renamed from: e */
    public void mo104999e(@C0359n0 ArrayList<C35023b> arrayList) {
        this.f85787h = arrayList;
    }

    @C0359n0
    /* renamed from: f */
    public ArrayList<C35023b> mo105000f() {
        return this.f85787h;
    }

    /* renamed from: g */
    public void mo105001g(@C0359n0 C35102b0 b0Var) {
        this.f85784e = b0Var;
    }

    /* renamed from: h */
    public void mo105002h(@C0359n0 String str) {
        this.f85783d = str;
    }

    @C0363p0
    /* renamed from: i */
    public String mo105003i() {
        return this.f85782c;
    }

    /* renamed from: j */
    public void mo105004j(@C0359n0 String str) {
        this.f85780a = str;
    }

    @C0363p0
    /* renamed from: k */
    public String mo105005k() {
        return this.f85783d;
    }

    @C0359n0
    /* renamed from: l */
    public C35105e mo105006l() {
        return this.f85786g;
    }

    @C0363p0
    /* renamed from: m */
    public String mo105007m() {
        return this.f85780a;
    }

    @C0359n0
    /* renamed from: n */
    public C35102b0 mo105008n() {
        return this.f85784e;
    }

    public String toString() {
        return "OTConsentPreferencesUIProperty{show='" + this.f85780a + '\'' + ", backgroundColor='" + this.f85781b + '\'' + ", titleTextProperty=" + this.f85784e.toString() + ", descriptionTextProperty=" + this.f85785f.toString() + ", saveChoicesButtonProperty=" + this.f85786g.toString() + ", otConsentPreferencesPurposeModelHashSet=" + this.f85787h + C12361b.f30259j;
    }
}
