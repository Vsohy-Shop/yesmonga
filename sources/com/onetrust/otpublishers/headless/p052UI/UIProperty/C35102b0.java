package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.b0 */
public class C35102b0 {

    /* renamed from: a */
    public C35110j f85639a = new C35110j();

    /* renamed from: b */
    public String f85640b;

    /* renamed from: c */
    public String f85641c;

    /* renamed from: d */
    public String f85642d;

    /* renamed from: e */
    public String f85643e;

    /* renamed from: f */
    public int f85644f;

    @C0359n0
    /* renamed from: a */
    public C35110j mo104657a() {
        return this.f85639a;
    }

    /* renamed from: b */
    public void mo104658b(int i) {
        this.f85644f = i;
    }

    /* renamed from: c */
    public void mo104659c(@C0359n0 C35110j jVar) {
        this.f85639a = jVar;
    }

    /* renamed from: d */
    public void mo104660d(@C0359n0 String str) {
        this.f85642d = str;
    }

    @C0363p0
    /* renamed from: e */
    public String mo104661e() {
        return this.f85642d;
    }

    /* renamed from: f */
    public void mo104662f(@C0359n0 String str) {
        this.f85643e = str;
    }

    @C0363p0
    /* renamed from: g */
    public String mo104663g() {
        return this.f85643e;
    }

    /* renamed from: h */
    public void mo104664h(@C0359n0 String str) {
        this.f85640b = str;
    }

    @C0363p0
    /* renamed from: i */
    public String mo104665i() {
        return this.f85640b;
    }

    /* renamed from: j */
    public void mo104666j(@C0359n0 String str) {
        this.f85641c = str;
    }

    @C0363p0
    /* renamed from: k */
    public String mo104667k() {
        return this.f85641c;
    }

    /* renamed from: l */
    public int mo104668l() {
        return this.f85644f;
    }

    /* renamed from: m */
    public boolean mo104669m() {
        return String.valueOf(true).equalsIgnoreCase(this.f85642d);
    }

    @C0359n0
    public String toString() {
        return "TextProperty{fontProperty=" + this.f85639a + ", textAlignment='" + this.f85640b + '\'' + ", textColor='" + this.f85641c + '\'' + ", showText='" + this.f85642d + '\'' + ", text='" + this.f85643e + '\'' + C12361b.f30259j;
    }
}
