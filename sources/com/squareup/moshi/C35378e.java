package com.squareup.moshi;

import com.squareup.moshi.C35384h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.e */
public abstract class C35378e<C extends Collection<T>, T> extends C35384h<C> {

    /* renamed from: b */
    public static final C35384h.C35389e f86937b = new C35379a();

    /* renamed from: a */
    public final C35384h<T> f86938a;

    /* renamed from: com.squareup.moshi.e$a */
    public class C35379a implements C35384h.C35389e {
        @Nullable
        /* renamed from: a */
        public C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar) {
            Class<?> j = C35431v.m146023j(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (j == List.class || j == Collection.class) {
                return C35378e.m145790b(type, sVar).nullSafe();
            }
            if (j == Set.class) {
                return C35378e.m145791d(type, sVar).nullSafe();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.e$b */
    public class C35380b extends C35378e<Collection<T>, T> {
        public C35380b(C35384h hVar) {
            super(hVar, (C35379a) null);
        }

        /* renamed from: c */
        public Collection<T> mo105967c() {
            return new ArrayList();
        }

        public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return C35378e.super.fromJson(jsonReader);
        }

        public /* bridge */ /* synthetic */ void toJson(C35407q qVar, Object obj) throws IOException {
            C35378e.super.toJson(qVar, (Collection) obj);
        }
    }

    /* renamed from: com.squareup.moshi.e$c */
    public class C35381c extends C35378e<Set<T>, T> {
        public C35381c(C35384h hVar) {
            super(hVar, (C35379a) null);
        }

        /* renamed from: f */
        public Set<T> mo105967c() {
            return new LinkedHashSet();
        }

        public /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader) throws IOException {
            return C35378e.super.fromJson(jsonReader);
        }

        public /* bridge */ /* synthetic */ void toJson(C35407q qVar, Object obj) throws IOException {
            C35378e.super.toJson(qVar, (Collection) obj);
        }
    }

    public /* synthetic */ C35378e(C35384h hVar, C35379a aVar) {
        this(hVar);
    }

    /* renamed from: b */
    public static <T> C35384h<Collection<T>> m145790b(Type type, C35410s sVar) {
        return new C35380b(sVar.mo106086d(C35431v.m146016c(type, Collection.class)));
    }

    /* renamed from: d */
    public static <T> C35384h<Set<T>> m145791d(Type type, C35410s sVar) {
        return new C35381c(sVar.mo106086d(C35431v.m146016c(type, Collection.class)));
    }

    /* renamed from: a */
    public C fromJson(JsonReader jsonReader) throws IOException {
        C c = mo105967c();
        jsonReader.mo105872a();
        while (jsonReader.mo105877g()) {
            c.add(this.f86938a.fromJson(jsonReader));
        }
        jsonReader.mo105874c();
        return c;
    }

    /* renamed from: c */
    public abstract C mo105967c();

    /* renamed from: e */
    public void toJson(C35407q qVar, C c) throws IOException {
        qVar.mo106039a();
        for (Object json : c) {
            this.f86938a.toJson(qVar, json);
        }
        qVar.mo106042f();
    }

    public String toString() {
        return this.f86938a + ".collection()";
    }

    public C35378e(C35384h<T> hVar) {
        this.f86938a = hVar;
    }
}
