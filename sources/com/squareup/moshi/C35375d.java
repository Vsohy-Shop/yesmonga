package com.squareup.moshi;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.d */
public final class C35375d<T> extends C35384h<T> {

    /* renamed from: d */
    public static final C35384h.C35389e f86930d = new C35376a();

    /* renamed from: a */
    public final C35370c<T> f86931a;

    /* renamed from: b */
    public final C35377b<?>[] f86932b;

    /* renamed from: c */
    public final JsonReader.C35351b f86933c;

    /* renamed from: com.squareup.moshi.d$a */
    public class C35376a implements C35384h.C35389e {
        @Nullable
        /* renamed from: a */
        public C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> j = C35431v.m146023j(type);
            if (j.isInterface() || j.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (C35393c.m145814m(j)) {
                mo105963d(type, List.class);
                mo105963d(type, Set.class);
                mo105963d(type, Map.class);
                mo105963d(type, Collection.class);
                String str = "Platform " + j;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            } else if (j.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + j.getName());
            } else if (j.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + j.getName());
            } else if (j.getEnclosingClass() != null && !Modifier.isStatic(j.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + j.getName());
            } else if (Modifier.isAbstract(j.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + j.getName());
            } else if (!C35393c.m145813l(j)) {
                C35370c<?> a = C35370c.m145778a(j);
                TreeMap treeMap = new TreeMap();
                while (type != Object.class) {
                    mo105961b(sVar, type, treeMap);
                    type = C35431v.m146022i(type);
                }
                return new C35375d(a, treeMap).nullSafe();
            } else {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + j.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
        }

        /* renamed from: b */
        public final void mo105961b(C35410s sVar, Type type, Map<String, C35377b<?>> map) {
            Class<?> j = C35431v.m146023j(type);
            boolean m = C35393c.m145814m(j);
            for (Field field : j.getDeclaredFields()) {
                if (mo105962c(m, field.getModifiers())) {
                    Type s = C35393c.m145820s(type, j, field.getGenericType());
                    Set<? extends Annotation> n = C35393c.m145815n(field);
                    String name = field.getName();
                    C35384h<T> g = sVar.mo106089g(s, n, name);
                    field.setAccessible(true);
                    C35383g gVar = (C35383g) field.getAnnotation(C35383g.class);
                    if (gVar != null) {
                        name = gVar.name();
                    }
                    C35377b bVar = new C35377b(name, field, g);
                    C35377b put = map.put(name, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f86935b + "\n    " + bVar.f86935b);
                    }
                }
            }
        }

        /* renamed from: c */
        public final boolean mo105962c(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            if (Modifier.isPublic(i) || Modifier.isProtected(i) || !z) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void mo105963d(Type type, Class<?> cls) {
            Class<?> j = C35431v.m146023j(type);
            if (cls.isAssignableFrom(j)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + j.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }
    }

    /* renamed from: com.squareup.moshi.d$b */
    public static class C35377b<T> {

        /* renamed from: a */
        public final String f86934a;

        /* renamed from: b */
        public final Field f86935b;

        /* renamed from: c */
        public final C35384h<T> f86936c;

        public C35377b(String str, Field field, C35384h<T> hVar) {
            this.f86934a = str;
            this.f86935b = field;
            this.f86936c = hVar;
        }

        /* renamed from: a */
        public void mo105964a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            this.f86935b.set(obj, this.f86936c.fromJson(jsonReader));
        }

        /* renamed from: b */
        public void mo105965b(C35407q qVar, Object obj) throws IllegalAccessException, IOException {
            this.f86936c.toJson(qVar, this.f86935b.get(obj));
        }
    }

    public C35375d(C35370c<T> cVar, Map<String, C35377b<?>> map) {
        this.f86931a = cVar;
        this.f86932b = (C35377b[]) map.values().toArray(new C35377b[map.size()]);
        this.f86933c = JsonReader.C35351b.m145735a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    public T fromJson(JsonReader jsonReader) throws IOException {
        try {
            T b = this.f86931a.mo105955b();
            try {
                jsonReader.mo105873b();
                while (jsonReader.mo105877g()) {
                    int x = jsonReader.mo105893x(this.f86933c);
                    if (x == -1) {
                        jsonReader.mo105867D();
                        jsonReader.mo105868E();
                    } else {
                        this.f86932b[x].mo105964a(jsonReader, b);
                    }
                }
                jsonReader.mo105875d();
                return b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw C35393c.m145823v(e2);
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public void toJson(C35407q qVar, T t) throws IOException {
        try {
            qVar.mo106040c();
            for (C35377b<?> bVar : this.f86932b) {
                qVar.mo106045n(bVar.f86934a);
                bVar.mo105965b(qVar, t);
            }
            qVar.mo106044i();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f86931a + ")";
    }
}
