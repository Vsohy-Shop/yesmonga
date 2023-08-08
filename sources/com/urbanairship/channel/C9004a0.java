package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.C9322a;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.channel.a0 */
public class C9004a0 implements C9333e {

    /* renamed from: d */
    public static final String f24197d = "add";

    /* renamed from: e */
    public static final String f24198e = "remove";

    /* renamed from: f */
    public static final String f24199f = "set";

    /* renamed from: a */
    public final Map<String, Set<String>> f24200a;

    /* renamed from: b */
    public final Map<String, Set<String>> f24201b;

    /* renamed from: c */
    public final Map<String, Set<String>> f24202c;

    public C9004a0(@C0363p0 Map<String, Set<String>> map, @C0363p0 Map<String, Set<String>> map2, @C0363p0 Map<String, Set<String>> map3) {
        this.f24200a = map == null ? Collections.emptyMap() : map;
        this.f24201b = map2 == null ? Collections.emptyMap() : map2;
        this.f24202c = map3 == null ? Collections.emptyMap() : map3;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @C0359n0
    /* renamed from: b */
    public static List<C9004a0> m33497b(@C0363p0 List<C9004a0> list) {
        HashSet hashSet;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (C9004a0 next : list) {
            Map<String, Set<String>> map = next.f24200a;
            if (map != null) {
                for (Map.Entry next2 : map.entrySet()) {
                    Set set = (Set) next2.getValue();
                    String trim = ((String) next2.getKey()).trim();
                    if (!trim.isEmpty() && set != null && !set.isEmpty()) {
                        Set set2 = (Set) hashMap3.get(trim);
                        if (set2 != null) {
                            set2.addAll(set);
                        } else {
                            Set set3 = (Set) hashMap2.get(trim);
                            if (set3 != null) {
                                set3.removeAll(set);
                                if (set3.isEmpty()) {
                                    hashMap2.remove(trim);
                                }
                            }
                            Set set4 = (Set) hashMap.get(trim);
                            if (set4 == null) {
                                set4 = new HashSet();
                                hashMap.put(trim, set4);
                            }
                            set4.addAll(set);
                        }
                    }
                }
            }
            Map<String, Set<String>> map2 = next.f24201b;
            if (map2 != null) {
                for (Map.Entry next3 : map2.entrySet()) {
                    Set set5 = (Set) next3.getValue();
                    String trim2 = ((String) next3.getKey()).trim();
                    if (!trim2.isEmpty() && set5 != null && !set5.isEmpty()) {
                        Set set6 = (Set) hashMap3.get(trim2);
                        if (set6 != null) {
                            set6.removeAll(set5);
                        } else {
                            Set set7 = (Set) hashMap.get(trim2);
                            if (set7 != null) {
                                set7.removeAll(set5);
                                if (set7.isEmpty()) {
                                    hashMap.remove(trim2);
                                }
                            }
                            Set set8 = (Set) hashMap2.get(trim2);
                            if (set8 == null) {
                                set8 = new HashSet();
                                hashMap2.put(trim2, set8);
                            }
                            set8.addAll(set5);
                        }
                    }
                }
            }
            Map<String, Set<String>> map3 = next.f24202c;
            if (map3 != null) {
                for (Map.Entry next4 : map3.entrySet()) {
                    Set set9 = (Set) next4.getValue();
                    String trim3 = ((String) next4.getKey()).trim();
                    if (!trim3.isEmpty()) {
                        if (set9 == null) {
                            hashSet = new HashSet();
                        } else {
                            hashSet = new HashSet(set9);
                        }
                        hashMap3.put(trim3, hashSet);
                        hashMap2.remove(trim3);
                        hashMap.remove(trim3);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!hashMap3.isEmpty()) {
            arrayList.add(new C9004a0((Map<String, Set<String>>) null, (Map<String, Set<String>>) null, hashMap3));
        }
        if (!hashMap.isEmpty() || !hashMap2.isEmpty()) {
            arrayList.add(new C9004a0(hashMap, hashMap2, (Map<String, Set<String>>) null));
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: c */
    public static List<C9004a0> m33498c(@C0359n0 C9322a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonValue> it = aVar.iterator();
        while (it.hasNext()) {
            arrayList.add(m33499d(it.next()));
        }
        return arrayList;
    }

    @C0359n0
    /* renamed from: d */
    public static C9004a0 m33499d(@C0359n0 JsonValue jsonValue) {
        C9323b A = jsonValue.mo18749A();
        return new C9004a0(C9006b0.m33507a(A.mo18801A("add")), C9006b0.m33507a(A.mo18801A("remove")), C9006b0.m33507a(A.mo18801A("set")));
    }

    @C0359n0
    /* renamed from: f */
    public static C9004a0 m33500f(@C0359n0 String str, @C0359n0 Set<String> set) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, new HashSet(set));
        return new C9004a0(hashMap, (Map<String, Set<String>>) null, (Map<String, Set<String>>) null);
    }

    @C0359n0
    /* renamed from: g */
    public static C9004a0 m33501g(@C0359n0 String str, @C0359n0 Set<String> set) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, new HashSet(set));
        return new C9004a0((Map<String, Set<String>>) null, hashMap, (Map<String, Set<String>>) null);
    }

    @C0359n0
    /* renamed from: h */
    public static C9004a0 m33502h(@C0359n0 String str, @C0359n0 Set<String> set) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, new HashSet(set));
        return new C9004a0((Map<String, Set<String>>) null, (Map<String, Set<String>>) null, hashMap);
    }

    /* renamed from: a */
    public void mo17774a(@C0359n0 Map<String, Set<String>> map) {
        Map<String, Set<String>> map2 = this.f24200a;
        if (map2 != null) {
            for (Map.Entry next : map2.entrySet()) {
                Set set = map.get(next.getKey());
                if (set == null) {
                    set = new HashSet();
                    map.put((String) next.getKey(), set);
                }
                set.addAll((Collection) next.getValue());
            }
        }
        Map<String, Set<String>> map3 = this.f24201b;
        if (map3 != null) {
            for (Map.Entry next2 : map3.entrySet()) {
                Set set2 = map.get(next2.getKey());
                if (set2 != null) {
                    set2.removeAll((Collection) next2.getValue());
                }
            }
        }
        Map<String, Set<String>> map4 = this.f24202c;
        if (map4 != null) {
            for (Map.Entry next3 : map4.entrySet()) {
                map.put((String) next3.getKey(), (Set) next3.getValue());
            }
        }
    }

    /* renamed from: e */
    public boolean mo17775e() {
        Map<String, Set<String>> map = this.f24200a;
        if (map != null && !map.isEmpty()) {
            return false;
        }
        Map<String, Set<String>> map2 = this.f24201b;
        if (map2 != null && !map2.isEmpty()) {
            return false;
        }
        Map<String, Set<String>> map3 = this.f24202c;
        if (map3 == null || map3.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9004a0 a0Var = (C9004a0) obj;
        Map<String, Set<String>> map = this.f24200a;
        if (map == null ? a0Var.f24200a != null : !map.equals(a0Var.f24200a)) {
            return false;
        }
        Map<String, Set<String>> map2 = this.f24201b;
        if (map2 == null ? a0Var.f24201b != null : !map2.equals(a0Var.f24201b)) {
            return false;
        }
        Map<String, Set<String>> map3 = this.f24202c;
        Map<String, Set<String>> map4 = a0Var.f24202c;
        if (map3 != null) {
            return map3.equals(map4);
        }
        if (map4 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        Map<String, Set<String>> map = this.f24200a;
        int i3 = 0;
        if (map != null) {
            i = map.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map<String, Set<String>> map2 = this.f24201b;
        if (map2 != null) {
            i2 = map2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Map<String, Set<String>> map3 = this.f24202c;
        if (map3 != null) {
            i3 = map3.hashCode();
        }
        return i5 + i3;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        C9323b.C9325b y = C9323b.m35017y();
        Map<String, Set<String>> map = this.f24200a;
        if (map != null && !map.isEmpty()) {
            y.mo18822f("add", JsonValue.m34975U(this.f24200a));
        }
        Map<String, Set<String>> map2 = this.f24201b;
        if (map2 != null && !map2.isEmpty()) {
            y.mo18822f("remove", JsonValue.m34975U(this.f24201b));
        }
        Map<String, Set<String>> map3 = this.f24202c;
        if (map3 != null && !map3.isEmpty()) {
            y.mo18822f("set", JsonValue.m34975U(this.f24202c));
        }
        return y.mo18817a().mo17264q();
    }
}
