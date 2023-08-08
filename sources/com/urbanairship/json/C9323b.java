package com.urbanairship.json;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONStringer;

/* renamed from: com.urbanairship.json.b */
public class C9323b implements Iterable<Map.Entry<String, JsonValue>>, C9333e {
    @C0359n0

    /* renamed from: b */
    public static final C9323b f25440b = new C9323b((Map<String, JsonValue>) null);

    /* renamed from: a */
    public final Map<String, JsonValue> f25441a;

    /* renamed from: com.urbanairship.json.b$b */
    public static class C9325b {

        /* renamed from: a */
        public final Map<String, JsonValue> f25442a;

        @C0359n0
        /* renamed from: a */
        public C9323b mo18817a() {
            return new C9323b(this.f25442a);
        }

        @C0359n0
        /* renamed from: b */
        public C9325b mo18818b(@C0359n0 String str, char c) {
            return mo18822f(str, JsonValue.m34961G(c));
        }

        @C0359n0
        /* renamed from: c */
        public C9325b mo18819c(@C0359n0 String str, double d) {
            return mo18822f(str, JsonValue.m34962H(d));
        }

        @C0359n0
        /* renamed from: d */
        public C9325b mo18820d(@C0359n0 String str, int i) {
            return mo18822f(str, JsonValue.m34963I(i));
        }

        @C0359n0
        /* renamed from: e */
        public C9325b mo18821e(@C0359n0 String str, long j) {
            return mo18822f(str, JsonValue.m34964J(j));
        }

        @C0359n0
        /* renamed from: f */
        public C9325b mo18822f(@C0359n0 String str, @C0363p0 C9333e eVar) {
            if (eVar == null) {
                this.f25442a.remove(str);
            } else {
                JsonValue q = eVar.mo17264q();
                if (q.mo18780w()) {
                    this.f25442a.remove(str);
                } else {
                    this.f25442a.put(str, q);
                }
            }
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C9325b mo18823g(@C0359n0 String str, @C0363p0 String str2) {
            if (str2 != null) {
                mo18822f(str, JsonValue.m34968N(str2));
            } else {
                this.f25442a.remove(str);
            }
            return this;
        }

        @C0359n0
        /* renamed from: h */
        public C9325b mo18824h(@C0359n0 String str, boolean z) {
            return mo18822f(str, JsonValue.m34969O(z));
        }

        @C0359n0
        /* renamed from: i */
        public C9325b mo18825i(@C0359n0 C9323b bVar) {
            for (Map.Entry next : bVar.mo18809i()) {
                mo18822f((String) next.getKey(), (C9333e) next.getValue());
            }
            return this;
        }

        @C0359n0
        /* renamed from: j */
        public C9325b mo18826j(@C0359n0 String str, @C0363p0 Object obj) {
            mo18822f(str, JsonValue.m34975U(obj));
            return this;
        }

        public C9325b() {
            this.f25442a = new HashMap();
        }
    }

    public C9323b(@C0363p0 Map<String, JsonValue> map) {
        HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        this.f25441a = hashMap;
    }

    @C0359n0
    /* renamed from: y */
    public static C9325b m35017y() {
        return new C9325b();
    }

    @C0359n0
    /* renamed from: A */
    public JsonValue mo18801A(@C0359n0 String str) {
        JsonValue k = mo18812k(str);
        if (k != null) {
            return k;
        }
        return JsonValue.f25436b;
    }

    @C0359n0
    /* renamed from: H */
    public JsonValue mo18802H(@C0359n0 String str) throws JsonException {
        JsonValue k = mo18812k(str);
        if (k != null) {
            return k;
        }
        throw new JsonException("Expected value for key: " + str);
    }

    @C0359n0
    /* renamed from: M */
    public Collection<JsonValue> mo18803M() {
        return new ArrayList(this.f25441a.values());
    }

    /* renamed from: Q */
    public void mo18804Q(@C0359n0 JSONStringer jSONStringer) throws JSONException {
        jSONStringer.object();
        for (Map.Entry next : mo18809i()) {
            jSONStringer.key((String) next.getKey());
            ((JsonValue) next.getValue()).mo18754V(jSONStringer);
        }
        jSONStringer.endObject();
    }

    /* renamed from: e */
    public boolean mo18805e(@C0359n0 String str) {
        return this.f25441a.containsKey(str);
    }

    public boolean equals(@C0363p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9323b) {
            return this.f25441a.equals(((C9323b) obj).f25441a);
        }
        if (obj instanceof JsonValue) {
            return this.f25441a.equals(((JsonValue) obj).mo18749A().f25441a);
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo18807h(@C0359n0 JsonValue jsonValue) {
        return this.f25441a.containsValue(jsonValue);
    }

    public int hashCode() {
        return this.f25441a.hashCode();
    }

    @C0359n0
    /* renamed from: i */
    public Set<Map.Entry<String, JsonValue>> mo18809i() {
        return this.f25441a.entrySet();
    }

    public boolean isEmpty() {
        return this.f25441a.isEmpty();
    }

    @C0359n0
    public Iterator<Map.Entry<String, JsonValue>> iterator() {
        return mo18809i().iterator();
    }

    @C0363p0
    /* renamed from: k */
    public JsonValue mo18812k(@C0359n0 String str) {
        return this.f25441a.get(str);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return JsonValue.m34965K(this);
    }

    @C0359n0
    /* renamed from: r */
    public Map<String, JsonValue> mo18813r() {
        return new HashMap(this.f25441a);
    }

    public int size() {
        return this.f25441a.size();
    }

    @C0359n0
    public String toString() {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            mo18804Q(jSONStringer);
            return jSONStringer.toString();
        } catch (StringIndexOutOfBoundsException | JSONException e) {
            C36059m.m148411g(e, "JsonMap - Failed to create JSON String.", new Object[0]);
            return "";
        }
    }

    @C0359n0
    /* renamed from: w */
    public Set<String> mo18816w() {
        return this.f25441a.keySet();
    }
}
