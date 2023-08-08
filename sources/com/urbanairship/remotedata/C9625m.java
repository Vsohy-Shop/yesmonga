package com.urbanairship.remotedata;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9654i;
import com.urbanairship.util.C9668o;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.remotedata.m */
public class C9625m {
    @C0359n0

    /* renamed from: e */
    public static final String f26364e = "language";
    @C0359n0

    /* renamed from: f */
    public static final String f26365f = "country";
    @C0359n0

    /* renamed from: g */
    public static final String f26366g = "sdk_version";
    @C0359n0

    /* renamed from: a */
    public final String f26367a;

    /* renamed from: b */
    public final long f26368b;
    @C0359n0

    /* renamed from: c */
    public final C9323b f26369c;
    @C0359n0

    /* renamed from: d */
    public final C9323b f26370d;

    /* renamed from: com.urbanairship.remotedata.m$b */
    public static class C9627b {

        /* renamed from: a */
        public String f26371a;

        /* renamed from: b */
        public long f26372b;

        /* renamed from: c */
        public C9323b f26373c;

        /* renamed from: d */
        public C9323b f26374d;

        @C0359n0
        /* renamed from: e */
        public C9625m mo19571e() {
            C9654i.m36166b(this.f26371a, "Missing type");
            C9654i.m36166b(this.f26373c, "Missing data");
            return new C9625m(this);
        }

        @C0359n0
        /* renamed from: f */
        public C9627b mo19572f(@C0363p0 C9323b bVar) {
            this.f26373c = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C9627b mo19573g(@C0363p0 C9323b bVar) {
            this.f26374d = bVar;
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9627b mo19574h(long j) {
            this.f26372b = j;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9627b mo19575i(@C0363p0 String str) {
            this.f26371a = str;
            return this;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C9625m m36053a(@C0359n0 String str) {
        return m36054f().mo19575i(str).mo19574h(0).mo19572f(C9323b.f25440b).mo19571e();
    }

    @C0359n0
    /* renamed from: f */
    public static C9627b m36054f() {
        return new C9627b();
    }

    @C0359n0
    /* renamed from: g */
    public static C9625m m36055g(@C0359n0 JsonValue jsonValue, @C0359n0 C9323b bVar) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        JsonValue A2 = A.mo18801A("type");
        JsonValue A3 = A.mo18801A("timestamp");
        JsonValue A4 = A.mo18801A("data");
        try {
            if (!A2.mo18783y() || !A3.mo18783y() || !A4.mo18778u()) {
                throw new JsonException("Invalid remote data payload: " + jsonValue.toString());
            }
            return m36054f().mo19572f(A4.mo18749A()).mo19574h(C9668o.m36218b(A3.mo18769l())).mo19575i(A2.mo18750B()).mo19573g(bVar).mo19571e();
        } catch (IllegalArgumentException | ParseException e) {
            throw new JsonException("Invalid remote data payload: " + jsonValue.toString(), e);
        }
    }

    @C0359n0
    /* renamed from: h */
    public static Set<C9625m> m36056h(@C0359n0 C9322a aVar, @C0359n0 C9323b bVar) {
        try {
            HashSet hashSet = new HashSet();
            Iterator<JsonValue> it = aVar.iterator();
            while (it.hasNext()) {
                hashSet.add(m36055g(it.next(), bVar));
            }
            return hashSet;
        } catch (JsonException unused) {
            C36059m.m148409e("Unable to parse remote data payloads: %s", aVar);
            return Collections.emptySet();
        }
    }

    @C0359n0
    /* renamed from: b */
    public final C9323b mo19564b() {
        return this.f26369c;
    }

    @C0359n0
    /* renamed from: c */
    public final C9323b mo19565c() {
        return this.f26370d;
    }

    /* renamed from: d */
    public final long mo19566d() {
        return this.f26368b;
    }

    @C0359n0
    /* renamed from: e */
    public final String mo19567e() {
        return this.f26367a;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9625m mVar = (C9625m) obj;
        if (this.f26368b == mVar.f26368b && this.f26367a.equals(mVar.f26367a) && this.f26369c.equals(mVar.f26369c)) {
            return this.f26370d.equals(mVar.f26370d);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f26368b;
        return (((((this.f26367a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f26369c.hashCode()) * 31) + this.f26370d.hashCode();
    }

    @C0359n0
    public String toString() {
        return "RemoteDataPayload{type='" + this.f26367a + '\'' + ", timestamp=" + this.f26368b + ", data=" + this.f26369c + ", metadata=" + this.f26370d + C12361b.f30259j;
    }

    public C9625m(@C0359n0 C9627b bVar) {
        this.f26367a = bVar.f26371a;
        this.f26368b = bVar.f26372b;
        this.f26369c = bVar.f26373c;
        this.f26370d = bVar.f26374d == null ? C9323b.f25440b : bVar.f26374d;
    }
}
