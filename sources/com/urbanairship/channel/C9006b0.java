package com.urbanairship.channel;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36059m;
import com.urbanairship.json.JsonValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.channel.b0 */
public class C9006b0 {

    /* renamed from: a */
    public static final int f24204a = 127;

    @C0363p0
    /* renamed from: a */
    public static Map<String, Set<String>> m33507a(@C0363p0 JsonValue jsonValue) {
        if (jsonValue == null || jsonValue.mo18780w()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (jsonValue.mo18778u()) {
            Iterator<Map.Entry<String, JsonValue>> it = jsonValue.mo18749A().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                HashSet hashSet = new HashSet();
                Iterator<JsonValue> it2 = ((JsonValue) next.getValue()).mo18784z().iterator();
                while (it2.hasNext()) {
                    JsonValue next2 = it2.next();
                    if (next2.mo18783y()) {
                        hashSet.add(next2.mo18769l());
                    }
                }
                hashMap.put((String) next.getKey(), hashSet);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    @C0359n0
    /* renamed from: b */
    public static Set<String> m33508b(@C0359n0 Set<String> set) {
        HashSet hashSet = new HashSet();
        for (String next : set) {
            if (next == null) {
                C36059m.m148406b("Null tag was removed from set.", new Object[0]);
            } else {
                String trim = next.trim();
                if (trim.length() <= 0 || trim.length() > 127) {
                    C36059m.m148409e("Tag with zero or greater than max length was removed from set: %s", trim);
                } else {
                    hashSet.add(trim);
                }
            }
        }
        return hashSet;
    }
}
