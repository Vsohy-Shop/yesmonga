package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17992m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.urbanairship.contacts.o */
public class C9089o implements C9333e {

    /* renamed from: e */
    public static final String f24535e = "tag_groups";

    /* renamed from: f */
    public static final String f24536f = "attributes";

    /* renamed from: g */
    public static final String f24537g = "associated_channels";

    /* renamed from: v */
    public static final String f24538v = "subscription_lists";

    /* renamed from: a */
    public final Map<String, JsonValue> f24539a;

    /* renamed from: b */
    public final Map<String, Set<String>> f24540b;

    /* renamed from: c */
    public final List<C9070a> f24541c;

    /* renamed from: d */
    public final Map<String, Set<Scope>> f24542d;

    public C9089o(@C0363p0 Map<String, JsonValue> map, @C0363p0 Map<String, Set<String>> map2, @C0363p0 List<C9070a> list, @C0363p0 Map<String, Set<Scope>> map3) {
        Map<String, JsonValue> map4;
        Map<String, Set<String>> map5;
        List<C9070a> list2;
        Map<String, Set<Scope>> map6;
        if (map == null) {
            map4 = Collections.emptyMap();
        } else {
            map4 = Collections.unmodifiableMap(map);
        }
        this.f24539a = map4;
        if (map2 == null) {
            map5 = Collections.emptyMap();
        } else {
            map5 = Collections.unmodifiableMap(map2);
        }
        this.f24540b = map5;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = Collections.unmodifiableList(list);
        }
        this.f24541c = list2;
        if (map3 == null) {
            map6 = Collections.emptyMap();
        } else {
            map6 = Collections.unmodifiableMap(map3);
        }
        this.f24542d = map6;
    }

    @C0363p0
    /* renamed from: a */
    public static C9089o m33908a(@C0359n0 JsonValue jsonValue) throws JsonException {
        C9323b A = jsonValue.mo18749A();
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, JsonValue>> it = A.mo18801A(f24535e).mo18749A().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            HashSet hashSet = new HashSet();
            Iterator<JsonValue> it2 = ((JsonValue) next.getValue()).mo18784z().iterator();
            while (it2.hasNext()) {
                JsonValue next2 = it2.next();
                if (next2.mo18783y()) {
                    hashSet.add(next2.mo18750B());
                }
            }
            hashMap.put((String) next.getKey(), hashSet);
        }
        HashMap hashMap2 = new HashMap();
        Iterator<Map.Entry<String, JsonValue>> it3 = A.mo18801A("subscription_lists").mo18749A().iterator();
        while (it3.hasNext()) {
            Map.Entry next3 = it3.next();
            HashSet hashSet2 = new HashSet();
            Iterator<JsonValue> it4 = ((JsonValue) next3.getValue()).mo18784z().iterator();
            while (it4.hasNext()) {
                hashSet2.add(Scope.m33817b(it4.next()));
            }
            hashMap2.put((String) next3.getKey(), hashSet2);
        }
        Map<String, JsonValue> r = A.mo18801A("attributes").mo18749A().mo18813r();
        ArrayList arrayList = new ArrayList();
        for (JsonValue a : A.mo18801A(f24537g).mo18784z().mo18793i()) {
            arrayList.add(C9070a.m33819a(a));
        }
        if (!r.isEmpty() || !hashMap.isEmpty() || !arrayList.isEmpty() || !hashMap2.isEmpty()) {
            return new C9089o(r, hashMap, arrayList, hashMap2);
        }
        return null;
    }

    @C0359n0
    /* renamed from: b */
    public List<C9070a> mo18061b() {
        return this.f24541c;
    }

    @C0359n0
    /* renamed from: c */
    public Map<String, JsonValue> mo18062c() {
        return this.f24539a;
    }

    @C0359n0
    /* renamed from: d */
    public Map<String, Set<Scope>> mo18063d() {
        return this.f24542d;
    }

    @C0359n0
    /* renamed from: e */
    public Map<String, Set<String>> mo18064e() {
        return this.f24540b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9089o oVar = (C9089o) obj;
        if (!C17992m.m81740a(this.f24539a, oVar.f24539a) || !C17992m.m81740a(this.f24540b, oVar.f24540b) || !C17992m.m81740a(this.f24541c, oVar.f24541c) || !C17992m.m81740a(this.f24542d, oVar.f24542d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17992m.m81741b(this.f24539a, this.f24540b, this.f24541c, this.f24542d);
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18826j(f24535e, this.f24540b).mo18826j("attributes", this.f24539a).mo18826j(f24537g, this.f24541c).mo18826j("subscription_lists", this.f24542d).mo18817a().mo17264q();
    }
}
