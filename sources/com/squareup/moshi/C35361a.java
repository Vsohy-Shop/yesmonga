package com.squareup.moshi;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35393c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.a */
public final class C35361a implements C35384h.C35389e {

    /* renamed from: a */
    public final List<C35367f> f86891a;

    /* renamed from: b */
    public final List<C35367f> f86892b;

    /* renamed from: com.squareup.moshi.a$a */
    public class C35362a extends C35384h<Object> {

        /* renamed from: a */
        public final /* synthetic */ C35367f f86893a;

        /* renamed from: b */
        public final /* synthetic */ C35384h f86894b;

        /* renamed from: c */
        public final /* synthetic */ C35410s f86895c;

        /* renamed from: d */
        public final /* synthetic */ C35367f f86896d;

        /* renamed from: e */
        public final /* synthetic */ Set f86897e;

        /* renamed from: f */
        public final /* synthetic */ Type f86898f;

        public C35362a(C35367f fVar, C35384h hVar, C35410s sVar, C35367f fVar2, Set set, Type type) {
            this.f86893a = fVar;
            this.f86894b = hVar;
            this.f86895c = sVar;
            this.f86896d = fVar2;
            this.f86897e = set;
            this.f86898f = type;
        }

        @Nullable
        public Object fromJson(JsonReader jsonReader) throws IOException {
            C35367f fVar = this.f86896d;
            if (fVar == null) {
                return this.f86894b.fromJson(jsonReader);
            }
            if (fVar.f86916g || jsonReader.mo105888s() != JsonReader.Token.NULL) {
                try {
                    return this.f86896d.mo105951b(this.f86895c, jsonReader);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + jsonReader.getPath(), cause);
                }
            } else {
                jsonReader.mo105885o();
                return null;
            }
        }

        public void toJson(C35407q qVar, @Nullable Object obj) throws IOException {
            C35367f fVar = this.f86893a;
            if (fVar == null) {
                this.f86894b.toJson(qVar, obj);
            } else if (fVar.f86916g || obj != null) {
                try {
                    fVar.mo105949e(this.f86895c, qVar, obj);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + qVar.getPath(), cause);
                }
            } else {
                qVar.mo106046o();
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f86897e + "(" + this.f86898f + ")";
        }
    }

    /* renamed from: com.squareup.moshi.a$b */
    public class C35363b extends C35367f {
        public C35363b(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
            super(type, set, obj, method, i, i2, z);
        }

        /* renamed from: e */
        public void mo105949e(C35410s sVar, C35407q qVar, @Nullable Object obj) throws IOException, InvocationTargetException {
            mo105953d(qVar, obj);
        }
    }

    /* renamed from: com.squareup.moshi.a$c */
    public class C35364c extends C35367f {

        /* renamed from: h */
        public C35384h<Object> f86900h;

        /* renamed from: i */
        public final /* synthetic */ Type[] f86901i;

        /* renamed from: j */
        public final /* synthetic */ Type f86902j;

        /* renamed from: k */
        public final /* synthetic */ Set f86903k;

        /* renamed from: l */
        public final /* synthetic */ Set f86904l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35364c(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i, i2, z);
            this.f86901i = typeArr;
            this.f86902j = type2;
            this.f86903k = set2;
            this.f86904l = set3;
        }

        /* renamed from: a */
        public void mo105950a(C35410s sVar, C35384h.C35389e eVar) {
            C35384h<Object> hVar;
            super.mo105950a(sVar, eVar);
            if (!C35431v.m146018e(this.f86901i[0], this.f86902j) || !this.f86903k.equals(this.f86904l)) {
                hVar = sVar.mo106088f(this.f86902j, this.f86904l);
            } else {
                hVar = sVar.mo106093m(eVar, this.f86902j, this.f86904l);
            }
            this.f86900h = hVar;
        }

        /* renamed from: e */
        public void mo105949e(C35410s sVar, C35407q qVar, @Nullable Object obj) throws IOException, InvocationTargetException {
            this.f86900h.toJson(qVar, mo105952c(obj));
        }
    }

    /* renamed from: com.squareup.moshi.a$d */
    public class C35365d extends C35367f {
        public C35365d(Type type, Set set, Object obj, Method method, int i, int i2, boolean z) {
            super(type, set, obj, method, i, i2, z);
        }

        /* renamed from: b */
        public Object mo105951b(C35410s sVar, JsonReader jsonReader) throws IOException, InvocationTargetException {
            return mo105952c(jsonReader);
        }
    }

    /* renamed from: com.squareup.moshi.a$e */
    public class C35366e extends C35367f {

        /* renamed from: h */
        public C35384h<Object> f86905h;

        /* renamed from: i */
        public final /* synthetic */ Type[] f86906i;

        /* renamed from: j */
        public final /* synthetic */ Type f86907j;

        /* renamed from: k */
        public final /* synthetic */ Set f86908k;

        /* renamed from: l */
        public final /* synthetic */ Set f86909l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35366e(Type type, Set set, Object obj, Method method, int i, int i2, boolean z, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i, i2, z);
            this.f86906i = typeArr;
            this.f86907j = type2;
            this.f86908k = set2;
            this.f86909l = set3;
        }

        /* renamed from: a */
        public void mo105950a(C35410s sVar, C35384h.C35389e eVar) {
            C35384h<Object> hVar;
            super.mo105950a(sVar, eVar);
            if (!C35431v.m146018e(this.f86906i[0], this.f86907j) || !this.f86908k.equals(this.f86909l)) {
                hVar = sVar.mo106088f(this.f86906i[0], this.f86908k);
            } else {
                hVar = sVar.mo106093m(eVar, this.f86906i[0], this.f86908k);
            }
            this.f86905h = hVar;
        }

        /* renamed from: b */
        public Object mo105951b(C35410s sVar, JsonReader jsonReader) throws IOException, InvocationTargetException {
            return mo105952c(this.f86905h.fromJson(jsonReader));
        }
    }

    /* renamed from: com.squareup.moshi.a$f */
    public static abstract class C35367f {

        /* renamed from: a */
        public final Type f86910a;

        /* renamed from: b */
        public final Set<? extends Annotation> f86911b;

        /* renamed from: c */
        public final Object f86912c;

        /* renamed from: d */
        public final Method f86913d;

        /* renamed from: e */
        public final int f86914e;

        /* renamed from: f */
        public final C35384h<?>[] f86915f;

        /* renamed from: g */
        public final boolean f86916g;

        public C35367f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
            this.f86910a = C35393c.m145803b(type);
            this.f86911b = set;
            this.f86912c = obj;
            this.f86913d = method;
            this.f86914e = i2;
            this.f86915f = new C35384h[(i - i2)];
            this.f86916g = z;
        }

        /* renamed from: a */
        public void mo105950a(C35410s sVar, C35384h.C35389e eVar) {
            C35384h<?> hVar;
            if (this.f86915f.length > 0) {
                Type[] genericParameterTypes = this.f86913d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f86913d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.f86914e; i < length; i++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    Set<? extends Annotation> o = C35393c.m145816o(parameterAnnotations[i]);
                    C35384h<?>[] hVarArr = this.f86915f;
                    int i2 = i - this.f86914e;
                    if (!C35431v.m146018e(this.f86910a, type) || !this.f86911b.equals(o)) {
                        hVar = sVar.mo106088f(type, o);
                    } else {
                        hVar = sVar.mo106093m(eVar, type, o);
                    }
                    hVarArr[i2] = hVar;
                }
            }
        }

        @Nullable
        /* renamed from: b */
        public Object mo105951b(C35410s sVar, JsonReader jsonReader) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        @Nullable
        /* renamed from: c */
        public Object mo105952c(@Nullable Object obj) throws InvocationTargetException {
            C35384h<?>[] hVarArr = this.f86915f;
            Object[] objArr = new Object[(hVarArr.length + 1)];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f86913d.invoke(this.f86912c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: d */
        public Object mo105953d(@Nullable Object obj, @Nullable Object obj2) throws InvocationTargetException {
            C35384h<?>[] hVarArr = this.f86915f;
            Object[] objArr = new Object[(hVarArr.length + 2)];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f86913d.invoke(this.f86912c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: e */
        public void mo105949e(C35410s sVar, C35407q qVar, @Nullable Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }
    }

    public C35361a(List<C35367f> list, List<C35367f> list2) {
        this.f86891a = list;
        this.f86892b = list2;
    }

    /* renamed from: b */
    public static C35367f m145760b(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> n = C35393c.m145815n(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 1 && genericParameterTypes[0] == JsonReader.class && genericReturnType != Void.TYPE && m145763e(1, genericParameterTypes)) {
            return new C35365d(genericReturnType, n, obj, method, genericParameterTypes.length, 1, true);
        } else if (genericParameterTypes.length != 1 || genericReturnType == Void.TYPE) {
            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
        } else {
            Set<? extends Annotation> o = C35393c.m145816o(parameterAnnotations[0]);
            return new C35366e(genericReturnType, n, obj, method, genericParameterTypes.length, 1, C35393c.m145809h(parameterAnnotations[0]), genericParameterTypes, genericReturnType, o, n);
        }
    }

    @Nullable
    /* renamed from: c */
    public static C35367f m145761c(List<C35367f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C35367f fVar = list.get(i);
            if (C35431v.m146018e(fVar.f86910a, type) && fVar.f86911b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C35361a m145762d(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(C35430u.class)) {
                    C35367f f = m145764f(obj, method);
                    C35367f c = m145761c(arrayList, f.f86910a, f.f86911b);
                    if (c == null) {
                        arrayList.add(f);
                    } else {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + c.f86913d + "\n    " + f.f86913d);
                    }
                }
                if (method.isAnnotationPresent(C35382f.class)) {
                    C35367f b = m145760b(obj, method);
                    C35367f c2 = m145761c(arrayList2, b.f86910a, b.f86911b);
                    if (c2 == null) {
                        arrayList2.add(b);
                    } else {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + c2.f86913d + "\n    " + b.f86913d);
                    }
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new C35361a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    /* renamed from: e */
    public static boolean m145763e(int i, Type[] typeArr) {
        int length = typeArr.length;
        while (i < length) {
            ParameterizedType parameterizedType = typeArr[i];
            if (!(parameterizedType instanceof ParameterizedType) || parameterizedType.getRawType() != C35384h.class) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: f */
    public static C35367f m145764f(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == C35407q.class && genericReturnType == Void.TYPE && m145763e(2, genericParameterTypes)) {
            return new C35363b(genericParameterTypes[1], C35393c.m145816o(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        } else if (genericParameterTypes.length != 1 || genericReturnType == Void.TYPE) {
            throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
        } else {
            Set<? extends Annotation> n = C35393c.m145815n(method);
            Set<? extends Annotation> o = C35393c.m145816o(parameterAnnotations[0]);
            return new C35364c(genericParameterTypes[0], o, obj, method, genericParameterTypes.length, 1, C35393c.m145809h(parameterAnnotations[0]), genericParameterTypes, genericReturnType, o, n);
        }
    }

    @Nullable
    /* renamed from: a */
    public C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar) {
        String str;
        C35367f c = m145761c(this.f86891a, type, set);
        C35367f c2 = m145761c(this.f86892b, type, set);
        C35384h<T> hVar = null;
        if (c == null && c2 == null) {
            return null;
        }
        if (c == null || c2 == null) {
            try {
                hVar = sVar.mo106093m(this, type, set);
            } catch (IllegalArgumentException e) {
                if (c == null) {
                    str = "@ToJson";
                } else {
                    str = "@FromJson";
                }
                throw new IllegalArgumentException("No " + str + " adapter for " + C35393c.m145824w(type, set), e);
            }
        }
        C35384h<T> hVar2 = hVar;
        if (c != null) {
            c.mo105950a(sVar, this);
        }
        if (c2 != null) {
            c2.mo105950a(sVar, this);
        }
        return new C35362a(c, hVar2, sVar, c2, set, type);
    }
}
