package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.C11112h;
import kotlin.jvm.C11283a;
import kotlin.jvm.internal.C11328e0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C11622t;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class TypesJVMKt {

    /* renamed from: kotlin.reflect.TypesJVMKt$a */
    public /* synthetic */ class C11489a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.TypesJVMKt.C11489a.<clinit>():void");
        }
    }

    @C11429q
    /* renamed from: c */
    public static final Type m44494c(C11520r rVar, boolean z) {
        Class cls;
        int i;
        C11498g m = rVar.mo22759m();
        if (m instanceof C11522s) {
            return new C11528w((C11522s) m);
        }
        if (m instanceof C11494d) {
            C11494d dVar = (C11494d) m;
            if (z) {
                cls = C11283a.m43411g(dVar);
            } else {
                cls = C11283a.m43409e(dVar);
            }
            List<C11523t> arguments = rVar.getArguments();
            if (arguments.isEmpty()) {
                return cls;
            }
            if (!cls.isArray()) {
                return m44496e(cls, arguments);
            }
            if (cls.getComponentType().isPrimitive()) {
                return cls;
            }
            C11523t tVar = (C11523t) CollectionsKt___CollectionsKt.m40631f5(arguments);
            if (tVar != null) {
                KVariance a = tVar.mo23139a();
                C11520r b = tVar.mo23140b();
                if (a == null) {
                    i = -1;
                } else {
                    i = C11489a.$EnumSwitchMapping$0[a.ordinal()];
                }
                if (i == -1 || i == 1) {
                    return cls;
                }
                if (i == 2 || i == 3) {
                    Intrinsics.checkNotNull(b);
                    Type d = m44495d(b, false, 1, (Object) null);
                    if (d instanceof Class) {
                        return cls;
                    }
                    return new C11490a(d);
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + rVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + rVar);
    }

    /* renamed from: d */
    public static /* synthetic */ Type m44495d(C11520r rVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m44494c(rVar, z);
    }

    @C11429q
    /* renamed from: e */
    public static final Type m44496e(Class<?> cls, List<C11523t> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            Iterable<C11523t> iterable = list;
            ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
            for (C11523t g : iterable) {
                arrayList.add(m44498g(g));
            }
            return new ParameterizedTypeImpl(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            Iterable<C11523t> iterable2 = list;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable2, 10));
            for (C11523t g2 : iterable2) {
                arrayList2.add(m44498g(g2));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e = m44496e(declaringClass, list.subList(length, list.size()));
            Iterable<C11523t> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(subList, 10));
            for (C11523t g3 : subList) {
                arrayList3.add(m44498g(g3));
            }
            return new ParameterizedTypeImpl(cls, e, arrayList3);
        }
    }

    @C12579k
    /* renamed from: f */
    public static final Type m44497f(@C12579k C11520r rVar) {
        Type j;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (!(rVar instanceof C11328e0) || (j = ((C11328e0) rVar).mo22774j()) == null) {
            return m44495d(rVar, false, 1, (Object) null);
        }
        return j;
    }

    /* renamed from: g */
    public static final Type m44498g(C11523t tVar) {
        KVariance h = tVar.mo23144h();
        if (h == null) {
            return C11529x.f28660c.mo23165a();
        }
        C11520r g = tVar.mo23143g();
        Intrinsics.checkNotNull(g);
        int i = C11489a.$EnumSwitchMapping$0[h.ordinal()];
        if (i == 1) {
            return new C11529x((Type) null, m44494c(g, true));
        }
        if (i == 2) {
            return m44494c(g, true);
        }
        if (i == 3) {
            return new C11529x(m44494c(g, true), (Type) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @C11112h
    @C11429q
    @C11665v0(version = "1.4")
    /* renamed from: h */
    public static /* synthetic */ void m44499h(C11520r rVar) {
    }

    @C11429q
    /* renamed from: i */
    public static /* synthetic */ void m44500i(C11523t tVar) {
    }

    /* renamed from: j */
    public static final String m44501j(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            C11559m l = SequencesKt__SequencesKt.m44595l(type, TypesJVMKt$typeToString$unwrap$1.f28653a);
            str = ((Class) SequencesKt___SequencesKt.m44741f1(l)).getName() + C11622t.repeat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, SequencesKt___SequencesKt.m44744g0(l));
        } else {
            str = cls.getName();
        }
        Intrinsics.checkNotNullExpressionValue(str, "{\n        if (type.isArr…   } else type.name\n    }");
        return str;
    }
}
