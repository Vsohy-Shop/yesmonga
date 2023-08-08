package com.squareup.moshi;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.internal.C35393c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.s */
public final class C35410s {

    /* renamed from: e */
    public static final List<C35384h.C35389e> f87050e;

    /* renamed from: a */
    public final List<C35384h.C35389e> f87051a;

    /* renamed from: b */
    public final int f87052b;

    /* renamed from: c */
    public final ThreadLocal<C35415e> f87053c = new ThreadLocal<>();

    /* renamed from: d */
    public final Map<Object, C35384h<?>> f87054d = new LinkedHashMap();

    /* renamed from: com.squareup.moshi.s$a */
    public class C35411a implements C35384h.C35389e {

        /* renamed from: a */
        public final /* synthetic */ Type f87055a;

        /* renamed from: b */
        public final /* synthetic */ C35384h f87056b;

        public C35411a(Type type, C35384h hVar) {
            this.f87055a = type;
            this.f87056b = hVar;
        }

        @Nullable
        /* renamed from: a */
        public C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar) {
            if (!set.isEmpty() || !C35393c.m145826y(this.f87055a, type)) {
                return null;
            }
            return this.f87056b;
        }
    }

    /* renamed from: com.squareup.moshi.s$b */
    public class C35412b implements C35384h.C35389e {

        /* renamed from: a */
        public final /* synthetic */ Type f87057a;

        /* renamed from: b */
        public final /* synthetic */ Class f87058b;

        /* renamed from: c */
        public final /* synthetic */ C35384h f87059c;

        public C35412b(Type type, Class cls, C35384h hVar) {
            this.f87057a = type;
            this.f87058b = cls;
            this.f87059c = hVar;
        }

        @Nullable
        /* renamed from: a */
        public C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar) {
            if (!C35393c.m145826y(this.f87057a, type) || set.size() != 1 || !C35393c.m145812k(set, this.f87058b)) {
                return null;
            }
            return this.f87059c;
        }
    }

    /* renamed from: com.squareup.moshi.s$c */
    public static final class C35413c {

        /* renamed from: a */
        public final List<C35384h.C35389e> f87060a = new ArrayList();

        /* renamed from: b */
        public int f87061b = 0;

        /* renamed from: a */
        public C35413c mo106094a(C35384h.C35389e eVar) {
            if (eVar != null) {
                List<C35384h.C35389e> list = this.f87060a;
                int i = this.f87061b;
                this.f87061b = i + 1;
                list.add(i, eVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* renamed from: b */
        public C35413c mo106095b(Object obj) {
            if (obj != null) {
                return mo106094a(C35361a.m145762d(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        /* renamed from: c */
        public <T> C35413c mo106096c(Type type, C35384h<T> hVar) {
            return mo106094a(C35410s.m145965j(type, hVar));
        }

        /* renamed from: d */
        public <T> C35413c mo106097d(Type type, Class<? extends Annotation> cls, C35384h<T> hVar) {
            return mo106094a(C35410s.m145966k(type, cls, hVar));
        }

        /* renamed from: e */
        public C35413c mo106098e(C35384h.C35389e eVar) {
            if (eVar != null) {
                this.f87060a.add(eVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* renamed from: f */
        public C35413c mo106099f(Object obj) {
            if (obj != null) {
                return mo106098e(C35361a.m145762d(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        /* renamed from: g */
        public <T> C35413c mo106100g(Type type, C35384h<T> hVar) {
            return mo106098e(C35410s.m145965j(type, hVar));
        }

        /* renamed from: h */
        public <T> C35413c mo106101h(Type type, Class<? extends Annotation> cls, C35384h<T> hVar) {
            return mo106098e(C35410s.m145966k(type, cls, hVar));
        }

        @CheckReturnValue
        /* renamed from: i */
        public C35410s mo106102i() {
            return new C35410s(this);
        }
    }

    /* renamed from: com.squareup.moshi.s$d */
    public static final class C35414d<T> extends C35384h<T> {

        /* renamed from: a */
        public final Type f87062a;
        @Nullable

        /* renamed from: b */
        public final String f87063b;

        /* renamed from: c */
        public final Object f87064c;
        @Nullable

        /* renamed from: d */
        public C35384h<T> f87065d;

        public C35414d(Type type, @Nullable String str, Object obj) {
            this.f87062a = type;
            this.f87063b = str;
            this.f87064c = obj;
        }

        public T fromJson(JsonReader jsonReader) throws IOException {
            C35384h<T> hVar = this.f87065d;
            if (hVar != null) {
                return hVar.fromJson(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public void toJson(C35407q qVar, T t) throws IOException {
            C35384h<T> hVar = this.f87065d;
            if (hVar != null) {
                hVar.toJson(qVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            C35384h<T> hVar = this.f87065d;
            return hVar != null ? hVar.toString() : super.toString();
        }
    }

    /* renamed from: com.squareup.moshi.s$e */
    public final class C35415e {

        /* renamed from: a */
        public final List<C35414d<?>> f87066a = new ArrayList();

        /* renamed from: b */
        public final Deque<C35414d<?>> f87067b = new ArrayDeque();

        /* renamed from: c */
        public boolean f87068c;

        public C35415e() {
        }

        /* renamed from: a */
        public <T> void mo106104a(C35384h<T> hVar) {
            this.f87067b.getLast().f87065d = hVar;
        }

        /* renamed from: b */
        public IllegalArgumentException mo106105b(IllegalArgumentException illegalArgumentException) {
            if (this.f87068c) {
                return illegalArgumentException;
            }
            this.f87068c = true;
            if (this.f87067b.size() == 1 && this.f87067b.getFirst().f87063b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<C35414d<?>> descendingIterator = this.f87067b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C35414d next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f87062a);
                if (next.f87063b != null) {
                    sb.append(' ');
                    sb.append(next.f87063b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* renamed from: c */
        public void mo106106c(boolean z) {
            this.f87067b.removeLast();
            if (this.f87067b.isEmpty()) {
                C35410s.this.f87053c.remove();
                if (z) {
                    synchronized (C35410s.this.f87054d) {
                        int size = this.f87066a.size();
                        for (int i = 0; i < size; i++) {
                            C35414d dVar = this.f87066a.get(i);
                            C35384h<T> hVar = (C35384h) C35410s.this.f87054d.put(dVar.f87064c, dVar.f87065d);
                            if (hVar != null) {
                                dVar.f87065d = hVar;
                                C35410s.this.f87054d.put(dVar.f87064c, hVar);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        public <T> C35384h<T> mo106107d(Type type, @Nullable String str, Object obj) {
            int size = this.f87066a.size();
            for (int i = 0; i < size; i++) {
                C35414d dVar = this.f87066a.get(i);
                if (dVar.f87064c.equals(obj)) {
                    this.f87067b.add(dVar);
                    C35384h<T> hVar = dVar.f87065d;
                    if (hVar != null) {
                        return hVar;
                    }
                    return dVar;
                }
            }
            C35414d dVar2 = new C35414d(type, str, obj);
            this.f87066a.add(dVar2);
            this.f87067b.add(dVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f87050e = arrayList;
        arrayList.add(C35416t.f87070a);
        arrayList.add(C35378e.f86937b);
        arrayList.add(C35408r.f87047c);
        arrayList.add(C35368b.f86917c);
        arrayList.add(C35375d.f86930d);
    }

    public C35410s(C35413c cVar) {
        int size = cVar.f87060a.size();
        List<C35384h.C35389e> list = f87050e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(cVar.f87060a);
        arrayList.addAll(list);
        this.f87051a = Collections.unmodifiableList(arrayList);
        this.f87052b = cVar.f87061b;
    }

    /* renamed from: j */
    public static <T> C35384h.C35389e m145965j(Type type, C35384h<T> hVar) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        } else if (hVar != null) {
            return new C35411a(type, hVar);
        } else {
            throw new IllegalArgumentException("jsonAdapter == null");
        }
    }

    /* renamed from: k */
    public static <T> C35384h.C35389e m145966k(Type type, Class<? extends Annotation> cls, C35384h<T> hVar) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        } else if (cls == null) {
            throw new IllegalArgumentException("annotation == null");
        } else if (hVar == null) {
            throw new IllegalArgumentException("jsonAdapter == null");
        } else if (!cls.isAnnotationPresent(C35397j.class)) {
            throw new IllegalArgumentException(cls + " does not have @JsonQualifier");
        } else if (cls.getDeclaredMethods().length <= 0) {
            return new C35412b(type, cls, hVar);
        } else {
            throw new IllegalArgumentException("Use JsonAdapter.Factory for annotations with elements");
        }
    }

    @CheckReturnValue
    /* renamed from: c */
    public <T> C35384h<T> mo106085c(Class<T> cls) {
        return mo106088f(cls, C35393c.f86950a);
    }

    @CheckReturnValue
    /* renamed from: d */
    public <T> C35384h<T> mo106086d(Type type) {
        return mo106088f(type, C35393c.f86950a);
    }

    @CheckReturnValue
    /* renamed from: e */
    public <T> C35384h<T> mo106087e(Type type, Class<? extends Annotation> cls) {
        if (cls != null) {
            return mo106088f(type, Collections.singleton(C35431v.m146017d(cls)));
        }
        throw new NullPointerException("annotationType == null");
    }

    @CheckReturnValue
    /* renamed from: f */
    public <T> C35384h<T> mo106088f(Type type, Set<? extends Annotation> set) {
        return mo106089g(type, set, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r4.f87053c.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = new com.squareup.moshi.C35410s.C35415e(r4);
        r4.f87053c.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r7 = r1.mo106107d(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r7 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r1.mo106106c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7 = r4.f87051a.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r2 >= r7) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r3 = r4.f87051a.get(r2).mo105947a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1.mo106104a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r1.mo106106c(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + com.squareup.moshi.internal.C35393c.m145824w(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        throw r1.mo106105b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        r1.mo106106c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        throw r5;
     */
    @javax.annotation.CheckReturnValue
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.squareup.moshi.C35384h<T> mo106089g(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, @javax.annotation.Nullable java.lang.String r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x008b
            java.lang.reflect.Type r5 = com.squareup.moshi.internal.C35393c.m145803b(r5)
            java.lang.reflect.Type r5 = com.squareup.moshi.internal.C35393c.m145819r(r5)
            java.lang.Object r0 = r4.mo106091i(r5, r6)
            java.util.Map<java.lang.Object, com.squareup.moshi.h<?>> r1 = r4.f87054d
            monitor-enter(r1)
            java.util.Map<java.lang.Object, com.squareup.moshi.h<?>> r2 = r4.f87054d     // Catch:{ all -> 0x0088 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0088 }
            com.squareup.moshi.h r2 = (com.squareup.moshi.C35384h) r2     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            java.lang.ThreadLocal<com.squareup.moshi.s$e> r1 = r4.f87053c
            java.lang.Object r1 = r1.get()
            com.squareup.moshi.s$e r1 = (com.squareup.moshi.C35410s.C35415e) r1
            if (r1 != 0) goto L_0x0034
            com.squareup.moshi.s$e r1 = new com.squareup.moshi.s$e
            r1.<init>()
            java.lang.ThreadLocal<com.squareup.moshi.s$e> r2 = r4.f87053c
            r2.set(r1)
        L_0x0034:
            com.squareup.moshi.h r7 = r1.mo106107d(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x003f
            r1.mo106106c(r0)
            return r7
        L_0x003f:
            java.util.List<com.squareup.moshi.h$e> r7 = r4.f87051a     // Catch:{ IllegalArgumentException -> 0x007e }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x007e }
            r2 = r0
        L_0x0046:
            if (r2 >= r7) goto L_0x0061
            java.util.List<com.squareup.moshi.h$e> r3 = r4.f87051a     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x007e }
            com.squareup.moshi.h$e r3 = (com.squareup.moshi.C35384h.C35389e) r3     // Catch:{ IllegalArgumentException -> 0x007e }
            com.squareup.moshi.h r3 = r3.mo105947a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x007e }
            if (r3 != 0) goto L_0x0059
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0059:
            r1.mo106104a(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            r5 = 1
            r1.mo106106c(r5)
            return r3
        L_0x0061:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = com.squareup.moshi.internal.C35393c.m145824w(r5, r6)     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x007e }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            throw r7     // Catch:{ IllegalArgumentException -> 0x007e }
        L_0x007c:
            r5 = move-exception
            goto L_0x0084
        L_0x007e:
            r5 = move-exception
            java.lang.IllegalArgumentException r5 = r1.mo106105b(r5)     // Catch:{ all -> 0x007c }
            throw r5     // Catch:{ all -> 0x007c }
        L_0x0084:
            r1.mo106106c(r0)
            throw r5
        L_0x0088:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            throw r5
        L_0x008b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "annotations == null"
            r5.<init>(r6)
            throw r5
        L_0x0093:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "type == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C35410s.mo106089g(java.lang.reflect.Type, java.util.Set, java.lang.String):com.squareup.moshi.h");
    }

    @CheckReturnValue
    /* renamed from: h */
    public <T> C35384h<T> mo106090h(Type type, Class<? extends Annotation>... clsArr) {
        if (clsArr.length == 1) {
            return mo106087e(type, clsArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(clsArr.length);
        for (Class<? extends Annotation> d : clsArr) {
            linkedHashSet.add(C35431v.m146017d(d));
        }
        return mo106088f(type, Collections.unmodifiableSet(linkedHashSet));
    }

    /* renamed from: i */
    public final Object mo106091i(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }

    @CheckReturnValue
    /* renamed from: l */
    public C35413c mo106092l() {
        C35413c cVar = new C35413c();
        int i = this.f87052b;
        for (int i2 = 0; i2 < i; i2++) {
            cVar.mo106094a(this.f87051a.get(i2));
        }
        int size = this.f87051a.size() - f87050e.size();
        for (int i3 = this.f87052b; i3 < size; i3++) {
            cVar.mo106098e(this.f87051a.get(i3));
        }
        return cVar;
    }

    @CheckReturnValue
    /* renamed from: m */
    public <T> C35384h<T> mo106093m(C35384h.C35389e eVar, Type type, Set<? extends Annotation> set) {
        if (set != null) {
            Type r = C35393c.m145819r(C35393c.m145803b(type));
            int indexOf = this.f87051a.indexOf(eVar);
            if (indexOf != -1) {
                int size = this.f87051a.size();
                for (int i = indexOf + 1; i < size; i++) {
                    C35384h<?> a = this.f87051a.get(i).mo105947a(r, set, this);
                    if (a != null) {
                        return a;
                    }
                }
                throw new IllegalArgumentException("No next JsonAdapter for " + C35393c.m145824w(r, set));
            }
            throw new IllegalArgumentException("Unable to skip past unknown factory " + eVar);
        }
        throw new NullPointerException("annotations == null");
    }
}
