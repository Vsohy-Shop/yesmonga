package com.urbanairship.iam;

import androidx.annotation.C0363p0;
import com.urbanairship.actions.C35497g;
import com.urbanairship.actions.C35504j;
import com.urbanairship.json.JsonValue;
import java.util.Map;

/* renamed from: com.urbanairship.iam.h */
public abstract class C9190h {
    /* renamed from: a */
    public static void m34481a(@C0363p0 C9139b bVar) {
        if (bVar != null) {
            m34482b(bVar.mo18258j());
        }
    }

    /* renamed from: b */
    public static void m34482b(@C0363p0 Map<String, JsonValue> map) {
        m34483c(map, (C35504j) null);
    }

    /* renamed from: c */
    public static void m34483c(@C0363p0 Map<String, JsonValue> map, @C0363p0 C35504j jVar) {
        C35497g gVar;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (jVar == null) {
                    gVar = C35497g.m146465d(str);
                } else {
                    gVar = jVar.mo106388a(str);
                }
                gVar.mo106383p(next.getValue()).mo106375h();
            }
        }
    }
}
