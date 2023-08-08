package com.squareup.moshi;

import com.squareup.moshi.C35384h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.r */
public final class C35408r<K, V> extends C35384h<Map<K, V>> {

    /* renamed from: c */
    public static final C35384h.C35389e f87047c = new C35409a();

    /* renamed from: a */
    public final C35384h<K> f87048a;

    /* renamed from: b */
    public final C35384h<V> f87049b;

    /* renamed from: com.squareup.moshi.r$a */
    public class C35409a implements C35384h.C35389e {
        @Nullable
        /* renamed from: a */
        public C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar) {
            Class<?> j;
            if (!set.isEmpty() || (j = C35431v.m146023j(type)) != Map.class) {
                return null;
            }
            Type[] l = C35431v.m146025l(type, j);
            return new C35408r(sVar, l[0], l[1]).nullSafe();
        }
    }

    public C35408r(C35410s sVar, Type type, Type type2) {
        this.f87048a = sVar.mo106086d(type);
        this.f87049b = sVar.mo106086d(type2);
    }

    /* renamed from: a */
    public Map<K, V> fromJson(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.mo105873b();
        while (jsonReader.mo105877g()) {
            jsonReader.mo105890u();
            K fromJson = this.f87048a.fromJson(jsonReader);
            V fromJson2 = this.f87049b.fromJson(jsonReader);
            Object put = linkedHashTreeMap.put(fromJson, fromJson2);
            if (put != null) {
                throw new JsonDataException("Map key '" + fromJson + "' has multiple values at path " + jsonReader.getPath() + ": " + put + " and " + fromJson2);
            }
        }
        jsonReader.mo105875d();
        return linkedHashTreeMap;
    }

    /* renamed from: b */
    public void toJson(C35407q qVar, Map<K, V> map) throws IOException {
        qVar.mo106040c();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                qVar.mo106075r();
                this.f87048a.toJson(qVar, next.getKey());
                this.f87049b.toJson(qVar, next.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + qVar.getPath());
            }
        }
        qVar.mo106044i();
    }

    public String toString() {
        return "JsonAdapter(" + this.f87048a + "=" + this.f87049b + ")";
    }
}
