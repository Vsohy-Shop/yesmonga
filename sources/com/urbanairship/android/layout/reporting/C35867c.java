package com.urbanairship.android.layout.reporting;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.urbanairship.android.layout.reporting.c */
public class C35867c {
    @C0359n0

    /* renamed from: a */
    public final String f88691a;
    @C0359n0

    /* renamed from: b */
    public final String f88692b;
    @C0359n0

    /* renamed from: c */
    public final String f88693c;
    @C0363p0

    /* renamed from: d */
    public final Boolean f88694d;

    public C35867c(@C0359n0 String str, @C0359n0 String str2, @C0363p0 String str3, @C0363p0 Boolean bool) {
        this.f88691a = str;
        this.f88692b = str3;
        this.f88693c = str2;
        this.f88694d = bool;
    }

    @C0359n0
    /* renamed from: a */
    public String mo107460a() {
        return this.f88692b;
    }

    @C0363p0
    /* renamed from: b */
    public Boolean mo107461b() {
        return this.f88694d;
    }

    @C0359n0
    /* renamed from: c */
    public String mo107462c() {
        return this.f88693c;
    }

    @C0359n0
    /* renamed from: d */
    public String mo107463d() {
        return this.f88691a;
    }

    public String toString() {
        return "FormInfo{identifier='" + this.f88691a + '\'' + ", formResponseType='" + this.f88692b + '\'' + ", formType='" + this.f88693c + '\'' + ", isFormSubmitted=" + this.f88694d + C12361b.f30259j;
    }
}
