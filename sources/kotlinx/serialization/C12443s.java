package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11283a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.builtins.C12197a;
import kotlinx.serialization.internal.C12255a1;
import kotlinx.serialization.internal.C12258b1;
import kotlinx.serialization.modules.C12434e;
import kotlinx.serialization.modules.C12436g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.s */
public final /* synthetic */ class C12443s {
    /* renamed from: a */
    public static final C12248g<Object> m50323a(C12434e eVar, GenericArrayType genericArrayType, boolean z) {
        C12248g<Object> gVar;
        C11494d dVar;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "it.upperBounds");
            genericComponentType = (Type) ArraysKt___ArraysKt.m40180sc(upperBounds);
        }
        Intrinsics.checkNotNullExpressionValue(genericComponentType, "eType");
        if (z) {
            gVar = C12442r.m50316g(eVar, genericComponentType);
        } else {
            gVar = C12442r.m50321l(eVar, genericComponentType);
            if (gVar == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            if (rawType != null) {
                dVar = C11283a.m43413i((Class) rawType);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        } else if (genericComponentType instanceof C11494d) {
            dVar = (C11494d) genericComponentType;
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("unsupported type in GenericArray: ", C11342l0.m43547d(genericComponentType.getClass())));
        }
        return C12197a.m48801a(dVar, gVar);
    }

    /* renamed from: b */
    public static final C11494d<?> m50324b(Type type) {
        if (type instanceof C11494d) {
            return (C11494d) type;
        }
        if (type instanceof Class) {
            return C11283a.m43413i((Class) type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "it.rawType");
            return m50324b(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "it.upperBounds");
            Object sc = ArraysKt___ArraysKt.m40180sc(upperBounds);
            Intrinsics.checkNotNullExpressionValue(sc, "it.upperBounds.first()");
            return m50324b((Type) sc);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "it.genericComponentType");
            return m50324b(genericComponentType);
        } else {
            throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + ' ' + C11342l0.m43547d(type.getClass()));
        }
    }

    @C12200d
    @C12579k
    /* renamed from: c */
    public static final C12248g<Object> m50325c(@C12579k Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return C12442r.m50316g(C12436g.m50300a(), type);
    }

    @C12200d
    @C12579k
    /* renamed from: d */
    public static final C12248g<Object> m50326d(@C12579k C12434e eVar, @C12579k Type type) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        C12248g<Object> e = m50327e(eVar, type, true);
        if (e != null) {
            return e;
        }
        C12258b1.m49236i(m50324b(type));
        throw new KotlinNothingValueException();
    }

    /* renamed from: e */
    public static final C12248g<Object> m50327e(C12434e eVar, Type type, boolean z) {
        ArrayList<C12248g> arrayList;
        if (type instanceof GenericArrayType) {
            return m50323a(eVar, (GenericArrayType) type, z);
        }
        if (type instanceof Class) {
            return m50331i(eVar, (Class) type, z);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            if (rawType != null) {
                Class cls = (Class) rawType;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "args");
                if (z) {
                    arrayList = new ArrayList<>(actualTypeArguments.length);
                    int length = actualTypeArguments.length;
                    int i = 0;
                    while (i < length) {
                        Type type2 = actualTypeArguments[i];
                        i++;
                        Intrinsics.checkNotNullExpressionValue(type2, "it");
                        arrayList.add(C12442r.m50316g(eVar, type2));
                    }
                } else {
                    arrayList = new ArrayList<>(actualTypeArguments.length);
                    int length2 = actualTypeArguments.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        Type type3 = actualTypeArguments[i2];
                        i2++;
                        Intrinsics.checkNotNullExpressionValue(type3, "it");
                        C12248g<Object> l = C12442r.m50321l(eVar, type3);
                        if (l == null) {
                            return null;
                        }
                        arrayList.add(l);
                    }
                }
                if (Set.class.isAssignableFrom(cls)) {
                    return C12197a.m48814n((C12248g) arrayList.get(0));
                }
                if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
                    return C12197a.m48809i((C12248g) arrayList.get(0));
                }
                if (Map.class.isAssignableFrom(cls)) {
                    return C12197a.m48812l((C12248g) arrayList.get(0), (C12248g) arrayList.get(1));
                }
                if (Map.Entry.class.isAssignableFrom(cls)) {
                    return C12197a.m48811k((C12248g) arrayList.get(0), (C12248g) arrayList.get(1));
                }
                if (Pair.class.isAssignableFrom(cls)) {
                    return C12197a.m48813m((C12248g) arrayList.get(0), (C12248g) arrayList.get(1));
                }
                if (Triple.class.isAssignableFrom(cls)) {
                    return C12197a.m48816p((C12248g) arrayList.get(0), (C12248g) arrayList.get(1), (C12248g) arrayList.get(2));
                }
                ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(arrayList, 10));
                for (C12248g add : arrayList) {
                    arrayList2.add(add);
                }
                C11494d i3 = C11283a.m43413i(cls);
                Object[] array = arrayList2.toArray(new C12248g[0]);
                if (array != null) {
                    C12248g[] gVarArr = (C12248g[]) array;
                    C12248g<Object> c = C12255a1.m49210c(i3, (C12248g[]) Arrays.copyOf(gVarArr, gVarArr.length));
                    if (!(c instanceof C12248g)) {
                        c = null;
                    }
                    if (c == null) {
                        return C12442r.m50310a(eVar, C11283a.m43413i(cls), arrayList2);
                    }
                    return c;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "type.upperBounds");
            Object sc = ArraysKt___ArraysKt.m40180sc(upperBounds);
            Intrinsics.checkNotNullExpressionValue(sc, "type.upperBounds.first()");
            return m50328f(eVar, (Type) sc, false, 2, (Object) null);
        } else {
            throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + ' ' + C11342l0.m43547d(type.getClass()));
        }
    }

    /* renamed from: f */
    public static /* synthetic */ C12248g m50328f(C12434e eVar, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m50327e(eVar, type, z);
    }

    @C12580l
    @C12200d
    /* renamed from: g */
    public static final C12248g<Object> m50329g(@C12579k Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return C12442r.m50321l(C12436g.m50300a(), type);
    }

    @C12580l
    @C12200d
    /* renamed from: h */
    public static final C12248g<Object> m50330h(@C12579k C12434e eVar, @C12579k Type type) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return m50327e(eVar, type, false);
    }

    /* renamed from: i */
    public static final C12248g<Object> m50331i(C12434e eVar, Class<?> cls, boolean z) {
        C12248g<Object> gVar;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            return C12442r.m50310a(eVar, C11283a.m43413i(cls), CollectionsKt__CollectionsKt.m40441E());
        }
        Class<?> componentType = cls.getComponentType();
        Intrinsics.checkNotNullExpressionValue(componentType, "type.componentType");
        if (z) {
            gVar = C12442r.m50316g(eVar, componentType);
        } else {
            gVar = C12442r.m50321l(eVar, componentType);
            if (gVar == null) {
                return null;
            }
        }
        return C12197a.m48801a(C11283a.m43413i(componentType), gVar);
    }
}
