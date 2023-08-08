package com.urbanairship.remoteconfig;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9329d;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9674q0;
import com.urbanairship.util.C9689z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.remoteconfig.a */
public class C9598a implements C9333e {

    /* renamed from: e */
    public static final String f26248e = "modules";

    /* renamed from: f */
    public static final String f26249f = "sdk_versions";

    /* renamed from: g */
    public static final String f26250g = "app_versions";

    /* renamed from: v */
    public static final String f26251v = "remote_data_refresh_interval";

    /* renamed from: w */
    public static final String f26252w = "all";

    /* renamed from: a */
    public final Set<String> f26253a;

    /* renamed from: b */
    public final long f26254b;

    /* renamed from: c */
    public final Set<String> f26255c;

    /* renamed from: d */
    public final C9329d f26256d;

    /* renamed from: com.urbanairship.remoteconfig.a$b */
    public static class C9600b {

        /* renamed from: a */
        public final Set<String> f26257a;

        /* renamed from: b */
        public long f26258b;

        /* renamed from: c */
        public Set<String> f26259c;

        /* renamed from: d */
        public C9329d f26260d;

        @C0359n0
        /* renamed from: e */
        public C9598a mo19514e() {
            return new C9598a(this);
        }

        @C0359n0
        /* renamed from: f */
        public C9600b mo19515f(@C0363p0 C9329d dVar) {
            this.f26260d = dVar;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C9600b mo19516g(@C0363p0 Collection<String> collection) {
            this.f26257a.clear();
            if (collection != null) {
                this.f26257a.addAll(collection);
            }
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9600b mo19517h(long j) {
            this.f26258b = j;
            return this;
        }

        @C0359n0
        /* renamed from: i */
        public C9600b mo19518i(@C0363p0 Collection<String> collection) {
            this.f26259c = collection == null ? null : new HashSet(collection);
            return this;
        }

        public C9600b() {
            this.f26257a = new HashSet();
        }
    }

    @C0359n0
    /* renamed from: a */
    public static List<C9598a> m35949a(@C0359n0 Collection<C9598a> collection, @C0359n0 String str, long j) {
        boolean z;
        C9333e b = C9674q0.m36237b(j);
        ArrayList arrayList = new ArrayList();
        for (C9598a next : collection) {
            Set<String> set = next.f26255c;
            if (set != null) {
                Iterator<String> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C9689z.m36263b(it.next()).apply(str)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                }
            }
            C9329d dVar = next.f26256d;
            if (dVar == null || dVar.apply(b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: b */
    public static C9598a m35950b(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        C9600b g = m35951g();
        if (A.mo18805e(f26248e)) {
            HashSet hashSet = new HashSet();
            if ("all".equals(A.mo18801A(f26248e).mo18769l())) {
                hashSet.addAll(C9602c.f26273l);
            } else {
                C9322a h = A.mo18801A(f26248e).mo18764h();
                if (h != null) {
                    Iterator<JsonValue> it = h.iterator();
                    while (it.hasNext()) {
                        JsonValue next = it.next();
                        if (next.mo18783y()) {
                            if (C9602c.f26273l.contains(next.mo18769l())) {
                                hashSet.add(next.mo18769l());
                            }
                        } else {
                            throw new JsonException("Modules must be an array of strings: " + A.mo18801A(f26248e));
                        }
                    }
                } else {
                    throw new JsonException("Modules must be an array of strings: " + A.mo18801A(f26248e));
                }
            }
            g.mo19516g(hashSet);
        }
        if (A.mo18805e(f26251v)) {
            if (A.mo18801A(f26251v).mo18782x()) {
                g.mo19517h(TimeUnit.SECONDS.toMillis(A.mo18801A(f26251v).mo18766i(0)));
            } else {
                throw new IllegalArgumentException("Remote data refresh interval must be a number: " + A.mo18812k(f26251v));
            }
        }
        if (A.mo18805e(f26249f)) {
            HashSet hashSet2 = new HashSet();
            C9322a h2 = A.mo18801A(f26249f).mo18764h();
            if (h2 != null) {
                Iterator<JsonValue> it2 = h2.iterator();
                while (it2.hasNext()) {
                    JsonValue next2 = it2.next();
                    if (next2.mo18783y()) {
                        hashSet2.add(next2.mo18769l());
                    } else {
                        throw new JsonException("SDK Versions must be an array of strings: " + A.mo18801A(f26249f));
                    }
                }
                g.mo19518i(hashSet2);
            } else {
                throw new JsonException("SDK Versions must be an array of strings: " + A.mo18801A(f26249f));
            }
        }
        if (A.mo18805e(f26250g)) {
            g.mo19515f(C9329d.m35055d(A.mo18812k(f26250g)));
        }
        return g.mo19514e();
    }

    /* renamed from: g */
    public static C9600b m35951g() {
        return new C9600b();
    }

    @C0363p0
    /* renamed from: c */
    public C9329d mo19509c() {
        return this.f26256d;
    }

    @C0359n0
    /* renamed from: d */
    public Set<String> mo19510d() {
        return this.f26253a;
    }

    /* renamed from: e */
    public long mo19511e() {
        return this.f26254b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9598a aVar = (C9598a) obj;
        if (this.f26254b != aVar.f26254b || !this.f26253a.equals(aVar.f26253a)) {
            return false;
        }
        Set<String> set = this.f26255c;
        if (set == null ? aVar.f26255c != null : !set.equals(aVar.f26255c)) {
            return false;
        }
        C9329d dVar = this.f26256d;
        C9329d dVar2 = aVar.f26256d;
        if (dVar != null) {
            return dVar.equals(dVar2);
        }
        if (dVar2 == null) {
            return true;
        }
        return false;
    }

    @C0363p0
    /* renamed from: f */
    public Set<String> mo19513f() {
        return this.f26255c;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j(f26248e, this.f26253a).mo18826j(f26251v, Long.valueOf(this.f26254b)).mo18826j(f26249f, this.f26255c).mo18826j(f26250g, this.f26256d).mo18817a().mo17264q();
    }

    public C9598a(@C0359n0 C9600b bVar) {
        this.f26253a = bVar.f26257a;
        this.f26254b = bVar.f26258b;
        this.f26255c = bVar.f26259c;
        this.f26256d = bVar.f26260d;
    }
}
