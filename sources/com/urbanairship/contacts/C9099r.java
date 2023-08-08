package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import java.util.Date;

/* renamed from: com.urbanairship.contacts.r */
public class C9099r implements C9333e {

    /* renamed from: e */
    public static final String f24584e = "transactional_opted_in";

    /* renamed from: f */
    public static final String f24585f = "commercial_opted_in";

    /* renamed from: g */
    public static final String f24586g = "properties";

    /* renamed from: v */
    public static final String f24587v = "double_opt_in";

    /* renamed from: a */
    public final long f24588a;

    /* renamed from: b */
    public final long f24589b;

    /* renamed from: c */
    public final boolean f24590c;
    @C0363p0

    /* renamed from: d */
    public final C9323b f24591d;

    public C9099r(@C0363p0 long j, @C0363p0 long j2, @C0363p0 C9323b bVar, boolean z) {
        this.f24588a = j;
        this.f24589b = j2;
        this.f24591d = bVar;
        this.f24590c = z;
    }

    @C0359n0
    /* renamed from: a */
    public static C9099r m33959a(@C0363p0 Date date, @C0363p0 Date date2, @C0363p0 C9323b bVar) {
        long j;
        long j2;
        if (date2 == null) {
            j = -1;
        } else {
            j = date2.getTime();
        }
        if (date == null) {
            j2 = -1;
        } else {
            j2 = date.getTime();
        }
        return new C9099r(j, j2, bVar, false);
    }

    @C0359n0
    /* renamed from: b */
    public static C9099r m33960b(@C0359n0 JsonValue jsonValue) {
        C9323b A = jsonValue.mo18749A();
        return new C9099r(A.mo18801A("transactional_opted_in").mo18766i(-1), A.mo18801A("commercial_opted_in").mo18766i(-1), A.mo18801A("properties").mo18767j(), A.mo18801A(f24587v).mo18757c(false));
    }

    @C0359n0
    /* renamed from: g */
    public static C9099r m33961g(@C0363p0 C9323b bVar, boolean z) {
        return new C9099r(-1, -1, bVar, z);
    }

    @C0359n0
    /* renamed from: h */
    public static C9099r m33962h(@C0363p0 Date date, @C0363p0 C9323b bVar, boolean z) {
        long j;
        if (date == null) {
            j = -1;
        } else {
            j = date.getTime();
        }
        return new C9099r(j, -1, bVar, z);
    }

    /* renamed from: c */
    public long mo18088c() {
        return this.f24589b;
    }

    @C0363p0
    /* renamed from: d */
    public C9323b mo18089d() {
        return this.f24591d;
    }

    /* renamed from: e */
    public long mo18090e() {
        return this.f24588a;
    }

    /* renamed from: f */
    public boolean mo18091f() {
        return this.f24590c;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18821e("transactional_opted_in", this.f24588a).mo18821e("commercial_opted_in", this.f24589b).mo18822f("properties", this.f24591d).mo18824h(f24587v, this.f24590c).mo18817a().mo17264q();
    }
}
