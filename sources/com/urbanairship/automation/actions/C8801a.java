package com.urbanairship.automation.actions;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.automation.C8800a0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.urbanairship.automation.actions.a */
public class C8801a implements C8800a0 {

    /* renamed from: a */
    public final C9323b f23564a;

    /* renamed from: com.urbanairship.automation.actions.a$b */
    public static class C8803b {

        /* renamed from: a */
        public Map<String, C9333e> f23565a;

        @C0359n0
        /* renamed from: a */
        public C8803b mo17307a(@C0359n0 String str, double d) {
            this.f23565a.put(str, JsonValue.m34962H(d));
            return this;
        }

        @C0359n0
        /* renamed from: b */
        public C8803b mo17308b(@C0359n0 String str, long j) {
            this.f23565a.put(str, JsonValue.m34964J(j));
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C8803b mo17309c(@C0359n0 String str, @C0359n0 C9333e eVar) {
            this.f23565a.put(str, eVar);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C8803b mo17310d(@C0359n0 String str, @C0359n0 String str2) {
            this.f23565a.put(str, JsonValue.m34968N(str2));
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C8803b mo17311e(@C0359n0 String str, boolean z) {
            this.f23565a.put(str, JsonValue.m34969O(z));
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C8801a mo17312f() {
            return new C8801a(JsonValue.m34975U(this.f23565a).mo18749A());
        }

        public C8803b() {
            this.f23565a = new HashMap();
        }
    }

    public C8801a(@C0359n0 C9323b bVar) {
        this.f23564a = bVar;
    }

    @C0359n0
    /* renamed from: b */
    public static C8803b m32703b() {
        return new C8803b();
    }

    /* renamed from: a */
    public C9323b mo17304a() {
        return this.f23564a;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f23564a.equals(((C8801a) obj).f23564a);
    }

    public int hashCode() {
        return this.f23564a.hashCode();
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return this.f23564a.mo17264q();
    }
}
