package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,161:1\n77#1,5:162\n77#1,5:168\n131#1,13:183\n1#2:167\n1360#3:173\n1446#3,5:174\n1549#3:179\n1620#3,3:180\n1064#4,2:196\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n60#1:162,5\n61#1:168,5\n117#1:183,13\n99#1:173\n99#1:174,5\n101#1:179\n101#1:180,3\n153#1:196,2\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.m */
public final class C12004m {
    @C12579k

    /* renamed from: a */
    public static final C12004m f29608a = new C12004m();
    @C12579k

    /* renamed from: b */
    public static final String f29609b = "META-INF/services/";

    /* renamed from: a */
    public final C12033z mo24383a(Class<C12033z> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final <S> S mo24384b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: c */
    public final <S> List<S> mo24385c(Class<S> cls, ClassLoader classLoader) {
        try {
            return mo24387e(cls, classLoader);
        } catch (Throwable unused) {
            return CollectionsKt___CollectionsKt.m40557Q5(ServiceLoader.load(cls, classLoader));
        }
    }

    @C12579k
    /* renamed from: d */
    public final List<C12033z> mo24386d() {
        C12033z zVar;
        Class<C12033z> cls = C12033z.class;
        if (!C12006n.m47897a()) {
            return mo24385c(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            C12033z zVar2 = null;
            try {
                zVar = cls.cast(Class.forName("kotlinx.coroutines.android.a", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                zVar = null;
            }
            if (zVar != null) {
                arrayList.add(zVar);
            }
            try {
                zVar2 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (zVar2 == null) {
                return arrayList;
            }
            arrayList.add(zVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return mo24385c(cls, cls.getClassLoader());
        }
    }

    @C12579k
    /* renamed from: e */
    public final <S> List<S> mo24387e(@C12579k Class<S> cls, @C12579k ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources(f29609b + cls.getName()));
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (T f : list) {
            C10994x.m42360n0(arrayList, f29608a.mo24388f(f));
        }
        Set V5 = CollectionsKt___CollectionsKt.m40582V5(arrayList);
        if (!V5.isEmpty()) {
            Iterable<String> iterable = V5;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (String b : iterable) {
                arrayList2.add(f29608a.mo24384b(b, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        kotlin.p010io.C11133b.m42950a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        kotlin.C11414o.m43942a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        throw r1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo24388f(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.C11622t.startsWith$default(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x005b
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt.substringAfter$default((java.lang.String) r0, (java.lang.String) r6, (java.lang.String) r4, (int) r3, (java.lang.Object) r4)
            r1 = 33
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt.substringBefore$default((java.lang.String) r6, (char) r1, (java.lang.String) r4, (int) r3, (java.lang.Object) r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt.substringAfter$default((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r4, (int) r3, (java.lang.Object) r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x004f }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x004f }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x004f }
            r3.<init>(r0)     // Catch:{ all -> 0x004f }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x004f }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x004f }
            r6.<init>(r2)     // Catch:{ all -> 0x004f }
            kotlinx.coroutines.internal.m r0 = f29608a     // Catch:{ all -> 0x0048 }
            java.util.List r0 = r0.mo24389g(r6)     // Catch:{ all -> 0x0048 }
            kotlin.p010io.C11133b.m42950a(r6, r4)     // Catch:{ all -> 0x004f }
            r1.close()
            return r0
        L_0x0048:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r6, r0)     // Catch:{ all -> 0x004f }
            throw r2     // Catch:{ all -> 0x004f }
        L_0x004f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0056 }
            throw r0
        L_0x0056:
            r0 = move-exception
            kotlin.C11414o.m43942a(r6, r0)
            throw r6
        L_0x005b:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r6)
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.m r6 = f29608a     // Catch:{ all -> 0x0073 }
            java.util.List r6 = r6.mo24389g(r0)     // Catch:{ all -> 0x0073 }
            kotlin.p010io.C11133b.m42950a(r0, r4)
            return r6
        L_0x0073:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C12004m.mo24388f(java.net.URL):java.util.List");
    }

    /* renamed from: g */
    public final List<String> mo24389g(BufferedReader bufferedReader) {
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return CollectionsKt___CollectionsKt.m40557Q5(linkedHashSet);
            }
            String obj = StringsKt__StringsKt.trim(StringsKt__StringsKt.substringBefore$default(readLine, "#", (String) null, 2, (Object) null)).toString();
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                if (obj.length() > 0) {
                    z3 = true;
                }
                if (z3) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        kotlin.C11414o.m43942a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R mo24390h(java.util.jar.JarFile r3, kotlin.jvm.functions.C11300l<? super java.util.jar.JarFile, ? extends R> r4) {
        /*
            r2 = this;
            r0 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch:{ all -> 0x000f }
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            r3.close()
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            return r4
        L_0x000f:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r1 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            r3.close()     // Catch:{ all -> 0x001c }
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            throw r1
        L_0x001c:
            r3 = move-exception
            kotlin.C11414o.m43942a(r4, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C12004m.mo24390h(java.util.jar.JarFile, kotlin.jvm.functions.l):java.lang.Object");
    }
}
