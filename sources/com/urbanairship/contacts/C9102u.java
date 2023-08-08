package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C17992m;
import com.google.firebase.installations.C33124s;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9668o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.contacts.u */
public class C9102u implements C9333e {

    /* renamed from: e */
    public static final String f24598e = "action";

    /* renamed from: f */
    public static final String f24599f = "list_id";

    /* renamed from: g */
    public static final String f24600g = "timestamp";

    /* renamed from: v */
    public static final String f24601v = "scope";

    /* renamed from: w */
    public static final String f24602w = "subscribe";

    /* renamed from: x */
    public static final String f24603x = "unsubscribe";
    @C0359n0

    /* renamed from: a */
    public final String f24604a;
    @C0359n0

    /* renamed from: b */
    public final String f24605b;
    @C0359n0

    /* renamed from: c */
    public final Scope f24606c;
    @C0363p0

    /* renamed from: d */
    public final String f24607d;

    public C9102u(@C0359n0 String str, @C0359n0 String str2, @C0363p0 Scope scope, @C0363p0 String str3) {
        this.f24604a = str;
        this.f24605b = str2;
        this.f24606c = scope;
        this.f24607d = str3;
    }

    /* renamed from: b */
    public static List<C9102u> m33981b(List<C9102u> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C9102u> arrayList2 = new ArrayList<>(list);
        Collections.reverse(arrayList2);
        HashSet hashSet = new HashSet();
        for (C9102u uVar : arrayList2) {
            String str = uVar.mo18104g() + C33124s.f80355c + uVar.mo18103f();
            if (!hashSet.contains(str)) {
                arrayList.add(0, uVar);
                hashSet.add(str);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: c */
    public static List<C9102u> m33982c(@C0359n0 C9322a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(m33983d(it.next()));
            } catch (JsonException e) {
                C36059m.m148411g(e, "Invalid subscription list mutation!", new Object[0]);
            }
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: d */
    public static C9102u m33983d(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        String l = A.mo18801A("action").mo18769l();
        String l2 = A.mo18801A("list_id").mo18769l();
        String l3 = A.mo18801A("timestamp").mo18769l();
        Scope b = Scope.m33817b(A.mo18801A("scope"));
        if (l != null && l2 != null) {
            return new C9102u(l, l2, b, l3);
        }
        throw new JsonException("Invalid subscription list mutation: " + A);
    }

    @C0359n0
    /* renamed from: i */
    public static C9102u m33984i(@C0359n0 String str, @C0359n0 Scope scope, long j) {
        return new C9102u("subscribe", str, scope, C9668o.m36217a(j));
    }

    @C0359n0
    /* renamed from: j */
    public static C9102u m33985j(@C0359n0 String str, @C0359n0 Scope scope, long j) {
        return new C9102u("unsubscribe", str, scope, C9668o.m36217a(j));
    }

    /* renamed from: a */
    public void mo18100a(Map<String, Set<Scope>> map) {
        Set set = map.get(this.f24605b);
        String str = this.f24604a;
        str.hashCode();
        if (str.equals("subscribe")) {
            if (set == null) {
                set = new HashSet();
                map.put(this.f24605b, set);
            }
            set.add(this.f24606c);
        } else if (str.equals("unsubscribe") && set != null) {
            set.remove(this.f24606c);
        }
        if (set == null || set.isEmpty()) {
            map.remove(this.f24605b);
        }
    }

    @C0359n0
    /* renamed from: e */
    public String mo18101e() {
        return this.f24604a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9102u uVar = (C9102u) obj;
        if (!C17992m.m81740a(this.f24604a, uVar.f24604a) || !C17992m.m81740a(this.f24605b, uVar.f24605b) || !C17992m.m81740a(this.f24606c, uVar.f24606c) || !C17992m.m81740a(this.f24607d, uVar.f24607d)) {
            return false;
        }
        return true;
    }

    @C0359n0
    /* renamed from: f */
    public String mo18103f() {
        return this.f24605b;
    }

    @C0359n0
    /* renamed from: g */
    public Scope mo18104g() {
        return this.f24606c;
    }

    @C0363p0
    /* renamed from: h */
    public String mo18105h() {
        return this.f24607d;
    }

    public int hashCode() {
        return C17992m.m81741b(this.f24604a, this.f24605b, this.f24607d, this.f24606c);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("action", this.f24604a).mo18823g("list_id", this.f24605b).mo18822f("scope", this.f24606c).mo18823g("timestamp", this.f24607d).mo18817a().mo17264q();
    }

    public String toString() {
        return "ScopedSubscriptionListMutation{action='" + this.f24604a + '\'' + ", listId='" + this.f24605b + '\'' + ", scope=" + this.f24606c + ", timestamp='" + this.f24607d + '\'' + C12361b.f30259j;
    }
}
