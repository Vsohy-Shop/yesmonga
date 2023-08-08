package com.squareup.moshi;

import com.squareup.moshi.C35384h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.b */
public final class C35368b extends C35384h<Object> {

    /* renamed from: c */
    public static final C35384h.C35389e f86917c = new C35369a();

    /* renamed from: a */
    public final Class<?> f86918a;

    /* renamed from: b */
    public final C35384h<Object> f86919b;

    /* renamed from: com.squareup.moshi.b$a */
    public class C35369a implements C35384h.C35389e {
        @Nullable
        /* renamed from: a */
        public C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar) {
            Type a = C35431v.m146014a(type);
            if (a != null && set.isEmpty()) {
                return new C35368b(C35431v.m146023j(a), sVar.mo106086d(a)).nullSafe();
            }
            return null;
        }
    }

    public C35368b(Class<?> cls, C35384h<Object> hVar) {
        this.f86918a = cls;
        this.f86919b = hVar;
    }

    public Object fromJson(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo105872a();
        while (jsonReader.mo105877g()) {
            arrayList.add(this.f86919b.fromJson(jsonReader));
        }
        jsonReader.mo105874c();
        Object newInstance = Array.newInstance(this.f86918a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public void toJson(C35407q qVar, Object obj) throws IOException {
        qVar.mo106039a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f86919b.toJson(qVar, Array.get(obj, i));
        }
        qVar.mo106042f();
    }

    public String toString() {
        return this.f86919b + ".array()";
    }
}
