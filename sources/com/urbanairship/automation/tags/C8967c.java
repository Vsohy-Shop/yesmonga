package com.urbanairship.automation.tags;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.JsonValue;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.tags.c */
public class C8967c {
    /* renamed from: a */
    public static void m33359a(@C0359n0 Map<String, Set<String>> map, @C0359n0 Map<String, Set<String>> map2) {
        for (Map.Entry next : map2.entrySet()) {
            Set set = map.get(next.getKey());
            if (set == null) {
                set = new HashSet();
                map.put((String) next.getKey(), set);
            }
            set.addAll((Collection) next.getValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m33360b(@androidx.annotation.C0359n0 java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r2, @androidx.annotation.C0359n0 java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r3) {
        /*
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0008:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r1 = r2.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x002c
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r1.containsAll(r0)
            if (r0 != 0) goto L_0x0008
        L_0x002c:
            r2 = 0
            return r2
        L_0x002e:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.automation.tags.C8967c.m33360b(java.util.Map, java.util.Map):boolean");
    }

    @C0359n0
    /* renamed from: c */
    public static Map<String, Set<String>> m33361c(@C0359n0 Map<String, Set<String>> map, @C0359n0 Map<String, Set<String>> map2) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Set set = map2.get(str);
            if (set != null) {
                HashSet hashSet = new HashSet(set);
                hashSet.retainAll((Collection) next.getValue());
                hashMap.put(str, hashSet);
            }
        }
        return hashMap;
    }

    @C0359n0
    /* renamed from: d */
    public static Map<String, Set<String>> m33362d(@C0363p0 JsonValue jsonValue) {
        HashMap hashMap = new HashMap();
        if (jsonValue == null) {
            return hashMap;
        }
        Iterator<Map.Entry<String, JsonValue>> it = jsonValue.mo18749A().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Set set = (Set) hashMap.get(next.getKey());
            if (set == null) {
                set = new HashSet();
                hashMap.put((String) next.getKey(), set);
            }
            Iterator<JsonValue> it2 = ((JsonValue) next.getValue()).mo18784z().iterator();
            while (it2.hasNext()) {
                JsonValue next2 = it2.next();
                if (next2.mo18783y()) {
                    set.add(next2.mo18769l());
                }
            }
        }
        return hashMap;
    }

    @C0359n0
    /* renamed from: e */
    public static Map<String, Set<String>> m33363e(@C0359n0 Map<String, Set<String>> map, @C0359n0 Map<String, Set<String>> map2) {
        HashMap hashMap = new HashMap();
        m33359a(hashMap, map);
        m33359a(hashMap, map2);
        return hashMap;
    }
}
