package com.ad4screen.sdk.service.modules.profile;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.UAirship;
import com.urbanairship.channel.C9022g;
import java.util.Date;

/* renamed from: com.ad4screen.sdk.service.modules.profile.a */
public class C21429a {

    /* renamed from: a */
    public final C9022g f55195a = UAirship.m146188Y().mo106223n().mo17786S();

    /* renamed from: a */
    public void mo63905a(@C0359n0 String str) {
        this.f55195a.mo17830d(str);
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    public C9022g mo63906b() {
        return this.f55195a;
    }

    /* renamed from: c */
    public void mo63907c(@C0363p0 String str, @C0363p0 Double d) {
        if (str != null && !str.isEmpty()) {
            this.f55195a.mo17831e(str, d.doubleValue());
        }
    }

    /* renamed from: d */
    public void mo63908d(@C0363p0 String str, @C0363p0 Float f) {
        if (str != null && !str.isEmpty()) {
            this.f55195a.mo17832f(str, f.floatValue());
        }
    }

    /* renamed from: e */
    public void mo63909e(@C0363p0 String str, @C0363p0 Integer num) {
        if (str != null && !str.isEmpty()) {
            this.f55195a.mo17833g(str, num.intValue());
        }
    }

    /* renamed from: f */
    public void mo63910f(@C0363p0 String str, @C0363p0 Long l) {
        if (str != null && !str.isEmpty()) {
            this.f55195a.mo17834h(str, l.longValue());
        }
    }

    /* renamed from: g */
    public void mo63911g(@C0363p0 String str, @C0363p0 String str2) {
        if (str != null && !str.isEmpty()) {
            this.f55195a.mo17835i(str, str2);
        }
    }

    /* renamed from: h */
    public void mo63912h(@C0363p0 String str, @C0363p0 Date date) {
        if (str != null && !str.isEmpty()) {
            this.f55195a.mo17836j(str, date);
        }
    }
}
