package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.C16717v;
import com.urbanairship.analytics.location.C35560b;
import com.urbanairship.contacts.ContactApiClient;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.C11660u;
import kotlin.C11665v0;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11283a;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11290b;
import kotlin.jvm.functions.C11291c;
import kotlin.jvm.functions.C11292d;
import kotlin.jvm.functions.C11293e;
import kotlin.jvm.functions.C11294f;
import kotlin.jvm.functions.C11295g;
import kotlin.jvm.functions.C11296h;
import kotlin.jvm.functions.C11297i;
import kotlin.jvm.functions.C11298j;
import kotlin.jvm.functions.C11299k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11301m;
import kotlin.jvm.functions.C11302n;
import kotlin.jvm.functions.C11303o;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.functions.C11308t;
import kotlin.jvm.functions.C11309u;
import kotlin.jvm.functions.C11310v;
import kotlin.jvm.functions.C11311w;
import kotlin.reflect.C11492c;
import kotlin.reflect.C11494d;
import kotlin.reflect.C11500i;
import kotlin.reflect.C11520r;
import kotlin.reflect.C11522s;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.internal.C12302q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n442#3:215\n392#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* renamed from: kotlin.jvm.internal.s */
public final class C11364s implements C11494d<Object>, C11362r {
    @C12579k

    /* renamed from: b */
    public static final C11365a f28494b = new C11365a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final Map<Class<? extends C11660u<?>>, Integer> f28495c;
    @C12579k

    /* renamed from: d */
    public static final HashMap<String, String> f28496d;
    @C12579k

    /* renamed from: e */
    public static final HashMap<String, String> f28497e;
    @C12579k

    /* renamed from: f */
    public static final HashMap<String, String> f28498f;
    @C12579k

    /* renamed from: g */
    public static final Map<String, String> f28499g;
    @C12579k

    /* renamed from: a */
    public final Class<?> f28500a;

    @C11363r0({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* renamed from: kotlin.jvm.internal.s$a */
    public static final class C11365a {
        public /* synthetic */ C11365a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12580l
        /* renamed from: a */
        public final String mo22852a(@C12579k Class<?> cls) {
            String str;
            Intrinsics.checkNotNullParameter(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C11364s.f28498f.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return C12302q.f30101a;
                }
                return str2;
            }
            String str3 = (String) C11364s.f28498f.get(cls.getName());
            if (str3 == null) {
                return cls.getCanonicalName();
            }
            return str3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
            if (r2 == null) goto L_0x0043;
         */
        @org.jetbrains.annotations.C12580l
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo22853b(@org.jetbrains.annotations.C12579k java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b6
            L_0x000e:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L_0x006c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L_0x0043
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = kotlin.text.StringsKt__StringsKt.substringAfter$default((java.lang.String) r0, (java.lang.String) r2, (java.lang.String) r1, (int) r3, (java.lang.Object) r1)
                if (r2 != 0) goto L_0x0040
                goto L_0x0043
            L_0x0040:
                r1 = r2
                goto L_0x00b6
            L_0x0043:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L_0x0064
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = kotlin.text.StringsKt__StringsKt.substringAfter$default((java.lang.String) r0, (java.lang.String) r8, (java.lang.String) r1, (int) r3, (java.lang.Object) r1)
                goto L_0x00b6
            L_0x0064:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                java.lang.String r1 = kotlin.text.StringsKt__StringsKt.substringAfter$default((java.lang.String) r0, (char) r4, (java.lang.String) r1, (int) r3, (java.lang.Object) r1)
                goto L_0x00b6
            L_0x006c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L_0x00a1
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x009e
                java.util.Map r0 = kotlin.jvm.internal.C11364s.f28499g
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x009e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L_0x009e:
                if (r1 != 0) goto L_0x00b6
                goto L_0x0040
            L_0x00a1:
                java.util.Map r0 = kotlin.jvm.internal.C11364s.f28499g
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b6
                java.lang.String r1 = r8.getSimpleName()
            L_0x00b6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C11364s.C11365a.mo22853b(java.lang.Class):java.lang.String");
        }

        /* renamed from: c */
        public final boolean mo22854c(@C12580l Object obj, @C12579k Class<?> cls) {
            Intrinsics.checkNotNullParameter(cls, "jClass");
            Map y = C11364s.f28495c;
            Intrinsics.checkNotNull(y, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) y.get(cls);
            if (num != null) {
                return C11370u0.m43672B(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = C11283a.m43411g(C11283a.m43413i(cls));
            }
            return cls.isInstance(obj);
        }

        public C11365a() {
        }
    }

    static {
        int i = 0;
        Iterable L = CollectionsKt__CollectionsKt.m40448L(C11289a.class, C11300l.class, C11304p.class, C11305q.class, C11306r.class, C11307s.class, C11308t.class, C11309u.class, C11310v.class, C11311w.class, C11290b.class, C11291c.class, C11292d.class, C11293e.class, C11294f.class, C11295g.class, C11296h.class, C11297i.class, C11298j.class, C11299k.class, C11301m.class, C11302n.class, C11303o.class);
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(L, 10));
        for (Object next : L) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            arrayList.add(C11078d1.m42659a((Class) next, Integer.valueOf(i)));
            i = i2;
        }
        f28495c = C10977s0.m41426B0(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(C16717v.C16719b.f42183f, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(C16717v.C16719b.f42180c, "kotlin.Float");
        hashMap.put(C35560b.f87804W0, "kotlin.Long");
        hashMap.put(ContactApiClient.f24442G, "kotlin.Double");
        f28496d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f28497e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            Intrinsics.checkNotNullExpressionValue(str, "kotlinName");
            sb.append(StringsKt__StringsKt.substringAfterLast$default(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            Pair a = C11078d1.m42659a(sb2, str + ".Companion");
            hashMap3.put(a.mo21849e(), a.mo21851f());
        }
        for (Map.Entry next2 : f28495c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f28498f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), StringsKt__StringsKt.substringAfterLast$default((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f28499g = linkedHashMap;
    }

    public C11364s(@C12579k Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "jClass");
        this.f28500a = cls;
    }

    @C11665v0(version = "1.3")
    /* renamed from: B */
    public static /* synthetic */ void m43616B() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: C */
    public static /* synthetic */ void m43617C() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: D */
    public static /* synthetic */ void m43618D() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: E */
    public static /* synthetic */ void m43619E() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: F */
    public static /* synthetic */ void m43620F() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: G */
    public static /* synthetic */ void m43621G() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: H */
    public static /* synthetic */ void m43622H() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: I */
    public static /* synthetic */ void m43623I() {
    }

    @C11665v0(version = "1.4")
    /* renamed from: J */
    public static /* synthetic */ void m43624J() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: K */
    public static /* synthetic */ void m43625K() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: L */
    public static /* synthetic */ void m43626L() {
    }

    @C11665v0(version = "1.1")
    /* renamed from: M */
    public static /* synthetic */ void m43627M() {
    }

    @C11665v0(version = "1.5")
    /* renamed from: N */
    public static /* synthetic */ void m43628N() {
    }

    /* renamed from: A */
    public final Void mo22829A() {
        throw new KotlinReflectionNotSupportedError();
    }

    @C12579k
    /* renamed from: a */
    public Collection<C11492c<?>> mo22784a() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: b */
    public Collection<C11494d<?>> mo22830b() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: c */
    public Collection<C11500i<Object>> mo22831c() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof C11364s) && Intrinsics.areEqual((Object) C11283a.m43411g(this), (Object) C11283a.m43411g((C11494d) obj));
    }

    @C12579k
    /* renamed from: f */
    public List<C11494d<? extends Object>> mo22833f() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    /* renamed from: g */
    public boolean mo22834g() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    @C12579k
    public List<Annotation> getAnnotations() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    @C12579k
    public List<C11522s> getTypeParameters() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    @C12580l
    public KVisibility getVisibility() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return C11283a.m43411g(this).hashCode();
    }

    @C12580l
    /* renamed from: i */
    public Object mo22838i() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    public boolean isAbstract() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    public boolean isFinal() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    public boolean isOpen() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    public boolean mo22842k() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    /* renamed from: l */
    public boolean mo22843l() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    @C11665v0(version = "1.1")
    /* renamed from: n */
    public boolean mo22844n(@C12580l Object obj) {
        return f28494b.mo22854c(obj, mo22787o());
    }

    @C12579k
    /* renamed from: o */
    public Class<?> mo22787o() {
        return this.f28500a;
    }

    @C12580l
    /* renamed from: p */
    public String mo22845p() {
        return f28494b.mo22852a(mo22787o());
    }

    /* renamed from: q */
    public boolean mo22846q() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    /* renamed from: r */
    public boolean mo22847r() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    @C12580l
    /* renamed from: s */
    public String mo22848s() {
        return f28494b.mo22853b(mo22787o());
    }

    @C12579k
    /* renamed from: t */
    public List<C11520r> mo22849t() {
        mo22829A();
        throw new KotlinNothingValueException();
    }

    @C12579k
    public String toString() {
        return mo22787o().toString() + C11342l0.f28466b;
    }

    /* renamed from: w */
    public boolean mo22851w() {
        mo22829A();
        throw new KotlinNothingValueException();
    }
}
