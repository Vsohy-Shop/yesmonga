package com.onetrust.otpublishers.headless.p052UI.UIProperty;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.onetrust.otpublishers.headless.UI.UIProperty.l */
public class C35112l {

    /* renamed from: a */
    public String f85673a;

    /* renamed from: b */
    public String f85674b;

    /* renamed from: c */
    public String f85675c;

    /* renamed from: d */
    public String f85676d;

    @C0363p0
    /* renamed from: a */
    public String mo104772a() {
        return this.f85673a;
    }

    /* renamed from: b */
    public void mo104773b(@C0359n0 String str) {
        this.f85673a = str;
    }

    @C0363p0
    /* renamed from: c */
    public String mo104774c() {
        String str = this.f85674b;
        if (str == null) {
            return str;
        }
        if ("".equalsIgnoreCase(str.trim())) {
            return null;
        }
        return this.f85674b;
    }

    /* renamed from: d */
    public void mo104775d(@C0359n0 String str) {
        this.f85674b = str;
    }

    /* renamed from: e */
    public boolean mo104776e() {
        return !String.valueOf(false).equalsIgnoreCase(this.f85673a);
    }

    @C0359n0
    public String toString() {
        return "LogoProperty{show='" + this.f85673a + '\'' + ", url='" + this.f85674b + '\'' + ", height='" + this.f85675c + '\'' + ", width='" + this.f85676d + '\'' + C12361b.f30259j;
    }
}
