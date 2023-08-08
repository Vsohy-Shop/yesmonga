package com.urbanairship.json;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36064q;
import com.urbanairship.json.matchers.C9336a;
import com.urbanairship.json.matchers.C9337b;
import com.urbanairship.json.matchers.C9338c;
import com.urbanairship.json.matchers.C9339d;
import com.urbanairship.json.matchers.C9340e;
import com.urbanairship.util.C9689z;

/* renamed from: com.urbanairship.json.g */
public abstract class C9335g implements C9333e, C36064q<C9333e> {
    @C0359n0
    /* renamed from: d */
    public static C9335g m35071d(@C0359n0 C9329d dVar) {
        return new C9336a(dVar, (Integer) null);
    }

    @C0359n0
    /* renamed from: e */
    public static C9335g m35072e(@C0359n0 C9329d dVar, int i) {
        return new C9336a(dVar, Integer.valueOf(i));
    }

    @C0359n0
    /* renamed from: f */
    public static C9335g m35073f() {
        return new C9339d(false);
    }

    @C0359n0
    /* renamed from: g */
    public static C9335g m35074g() {
        return new C9339d(true);
    }

    @C0359n0
    /* renamed from: h */
    public static C9335g m35075h(@C0363p0 Double d, @C0363p0 Double d2) {
        if (d == null || d2 == null || d2.doubleValue() >= d.doubleValue()) {
            return new C9338c(d, d2);
        }
        throw new IllegalArgumentException();
    }

    @C0359n0
    /* renamed from: i */
    public static C9335g m35076i(@C0359n0 JsonValue jsonValue) {
        return new C9337b(jsonValue);
    }

    @C0359n0
    /* renamed from: j */
    public static C9335g m35077j(@C0359n0 String str) {
        return new C9340e(C9689z.m36263b(str));
    }

    @C0359n0
    /* renamed from: k */
    public static C9335g m35078k(@C0363p0 JsonValue jsonValue) throws JsonException {
        C9323b bVar;
        Double d;
        if (jsonValue == null) {
            bVar = C9323b.f25440b;
        } else {
            bVar = jsonValue.mo18749A();
        }
        if (bVar.mo18805e(C9337b.f25466b)) {
            return m35076i(bVar.mo18801A(C9337b.f25466b));
        }
        if (bVar.mo18805e(C9338c.f25468c) || bVar.mo18805e(C9338c.f25469d)) {
            Double d2 = null;
            if (bVar.mo18805e(C9338c.f25468c)) {
                d = Double.valueOf(bVar.mo18801A(C9338c.f25468c).mo18758d(0.0d));
            } else {
                d = null;
            }
            if (bVar.mo18805e(C9338c.f25469d)) {
                d2 = Double.valueOf(bVar.mo18801A(C9338c.f25469d).mo18758d(0.0d));
            }
            try {
                return m35075h(d, d2);
            } catch (IllegalArgumentException e) {
                throw new JsonException("Invalid range matcher: " + jsonValue, e);
            }
        } else if (bVar.mo18805e(C9339d.f25472b)) {
            if (bVar.mo18801A(C9339d.f25472b).mo18757c(false)) {
                return m35074g();
            }
            return m35073f();
        } else if (bVar.mo18805e(C9340e.f25474b)) {
            try {
                return m35077j(bVar.mo18801A(C9340e.f25474b).mo18750B());
            } catch (NumberFormatException e2) {
                throw new JsonException("Invalid version constraint: " + bVar.mo18801A(C9340e.f25474b), e2);
            }
        } else if (bVar.mo18805e("version")) {
            try {
                return m35077j(bVar.mo18801A("version").mo18750B());
            } catch (NumberFormatException e3) {
                throw new JsonException("Invalid version constraint: " + bVar.mo18801A("version"), e3);
            }
        } else if (bVar.mo18805e(C9336a.f25462c)) {
            C9329d d3 = C9329d.m35055d(bVar.mo18812k(C9336a.f25462c));
            if (!bVar.mo18805e("index")) {
                return m35071d(d3);
            }
            int f = bVar.mo18801A("index").mo18762f(-1);
            if (f != -1) {
                return m35072e(d3, f);
            }
            throw new JsonException("Invalid index for array_contains matcher: " + bVar.mo18812k("index"));
        } else {
            throw new JsonException("Unknown value matcher: " + jsonValue);
        }
    }

    /* renamed from: a */
    public boolean apply(@C0363p0 C9333e eVar) {
        return mo18850b(eVar, false);
    }

    /* renamed from: b */
    public boolean mo18850b(@C0363p0 C9333e eVar, boolean z) {
        JsonValue jsonValue;
        if (eVar == null) {
            jsonValue = JsonValue.f25436b;
        } else {
            jsonValue = eVar.mo17264q();
        }
        return mo18851c(jsonValue, z);
    }

    /* renamed from: c */
    public abstract boolean mo18851c(@C0359n0 JsonValue jsonValue, boolean z);

    @C0359n0
    public String toString() {
        return mo17264q().toString();
    }
}
