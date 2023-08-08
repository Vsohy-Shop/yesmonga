package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.C11283a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12249h;
import kotlinx.serialization.C12439o;
import kotlinx.serialization.PolymorphicSerializer;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.internal.a1 */
public final class C12255a1 {
    /* renamed from: a */
    public static final Object m49208a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @C12580l
    /* renamed from: b */
    public static final <T> C12248g<T> m49209b(@C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return m49210c(dVar, new C12248g[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r3 == false) goto L_0x0066;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[Catch:{ NoSuchFieldException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> kotlinx.serialization.C12248g<T> m49210c(@org.jetbrains.annotations.C12579k kotlin.reflect.C11494d<T> r8, @org.jetbrains.annotations.C12579k kotlinx.serialization.C12248g<java.lang.Object>... r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.Class r0 = kotlin.jvm.C11283a.m43409e(r8)
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L_0x001f
            boolean r1 = m49218k(r0)
            if (r1 == 0) goto L_0x001f
            kotlinx.serialization.g r8 = m49211d(r0)
            return r8
        L_0x001f:
            boolean r1 = r0.isInterface()
            if (r1 == 0) goto L_0x002a
            kotlinx.serialization.g r8 = m49215h(r8)
            return r8
        L_0x002a:
            int r1 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
            kotlinx.serialization.g[] r9 = (kotlinx.serialization.C12248g[]) r9
            kotlinx.serialization.g r9 = m49216i(r0, r9)
            if (r9 == 0) goto L_0x0038
            return r9
        L_0x0038:
            kotlinx.serialization.g r9 = m49212e(r0)
            if (r9 != 0) goto L_0x0089
            r9 = 0
            java.lang.Class[] r0 = r0.getDeclaredClasses()     // Catch:{ NoSuchFieldException -> 0x0081 }
            java.lang.String r1 = "jClass.declaredClasses"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ NoSuchFieldException -> 0x0081 }
            int r1 = r0.length     // Catch:{ NoSuchFieldException -> 0x0081 }
            r2 = 0
            r4 = r9
            r3 = r2
        L_0x004c:
            if (r2 >= r1) goto L_0x0064
            r5 = r0[r2]     // Catch:{ NoSuchFieldException -> 0x0081 }
            int r2 = r2 + 1
            java.lang.String r6 = r5.getSimpleName()     // Catch:{ NoSuchFieldException -> 0x0081 }
            java.lang.String r7 = "$serializer"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ NoSuchFieldException -> 0x0081 }
            if (r6 == 0) goto L_0x004c
            if (r3 == 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r3 = 1
            r4 = r5
            goto L_0x004c
        L_0x0064:
            if (r3 != 0) goto L_0x0067
        L_0x0066:
            r4 = r9
        L_0x0067:
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ NoSuchFieldException -> 0x0081 }
            if (r4 != 0) goto L_0x006d
        L_0x006b:
            r0 = r9
            goto L_0x007a
        L_0x006d:
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r4.getField(r0)     // Catch:{ NoSuchFieldException -> 0x0081 }
            if (r0 != 0) goto L_0x0076
            goto L_0x006b
        L_0x0076:
            java.lang.Object r0 = r0.get(r9)     // Catch:{ NoSuchFieldException -> 0x0081 }
        L_0x007a:
            boolean r1 = r0 instanceof kotlinx.serialization.C12248g     // Catch:{ NoSuchFieldException -> 0x0081 }
            if (r1 == 0) goto L_0x0081
            kotlinx.serialization.g r0 = (kotlinx.serialization.C12248g) r0     // Catch:{ NoSuchFieldException -> 0x0081 }
            r9 = r0
        L_0x0081:
            if (r9 == 0) goto L_0x0084
            return r9
        L_0x0084:
            kotlinx.serialization.g r8 = m49221n(r8)
            return r8
        L_0x0089:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.C12255a1.m49210c(kotlin.reflect.d, kotlinx.serialization.g[]):kotlinx.serialization.g");
    }

    /* renamed from: d */
    public static final <T> C12248g<T> m49211d(Class<T> cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "canonicalName");
        if (enumConstants != null) {
            return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r5 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r5 == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        r6 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x005a A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> kotlinx.serialization.C12248g<T> m49212e(java.lang.Class<T> r11) {
        /*
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r1 = "jClass.declaredFields"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        L_0x000f:
            r7 = 1
            if (r4 >= r1) goto L_0x0041
            r8 = r0[r4]
            int r4 = r4 + 1
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0038
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r11)
            if (r9 == 0) goto L_0x0038
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L_0x0038
            r9 = r7
            goto L_0x0039
        L_0x0038:
            r9 = r3
        L_0x0039:
            if (r9 == 0) goto L_0x000f
            if (r5 == 0) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            r5 = r7
            r6 = r8
            goto L_0x000f
        L_0x0041:
            if (r5 != 0) goto L_0x0044
        L_0x0043:
            r6 = r2
        L_0x0044:
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 != 0) goto L_0x0049
            return r2
        L_0x0049:
            java.lang.Object r0 = r6.get(r2)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r1 = "jClass.methods"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
            int r1 = r11.length
            r6 = r2
            r4 = r3
            r5 = r4
        L_0x005a:
            if (r4 >= r1) goto L_0x0094
            r8 = r11[r4]
            int r4 = r4 + 1
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "serializer"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x008b
            java.lang.Class[] r9 = r8.getParameterTypes()
            java.lang.String r10 = "it.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            int r9 = r9.length
            if (r9 != 0) goto L_0x007a
            r9 = r7
            goto L_0x007b
        L_0x007a:
            r9 = r3
        L_0x007b:
            if (r9 == 0) goto L_0x008b
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<kotlinx.serialization.g> r10 = kotlinx.serialization.C12248g.class
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x008b
            r9 = r7
            goto L_0x008c
        L_0x008b:
            r9 = r3
        L_0x008c:
            if (r9 == 0) goto L_0x005a
            if (r5 == 0) goto L_0x0091
            goto L_0x0096
        L_0x0091:
            r5 = r7
            r6 = r8
            goto L_0x005a
        L_0x0094:
            if (r5 != 0) goto L_0x0097
        L_0x0096:
            r6 = r2
        L_0x0097:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L_0x009c
            return r2
        L_0x009c:
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Object r11 = r6.invoke(r0, r11)
            boolean r0 = r11 instanceof kotlinx.serialization.C12248g
            if (r0 == 0) goto L_0x00a9
            r2 = r11
            kotlinx.serialization.g r2 = (kotlinx.serialization.C12248g) r2
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.C12255a1.m49212e(java.lang.Class):kotlinx.serialization.g");
    }

    /* renamed from: f */
    public static final <T> T m49213f(@C12579k T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr[i];
    }

    /* renamed from: g */
    public static final boolean m49214g(@C12579k boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr[i];
    }

    /* renamed from: h */
    public static final <T> C12248g<T> m49215h(C11494d<T> dVar) {
        C12439o oVar = (C12439o) C11283a.m43409e(dVar).getAnnotation(C12439o.class);
        if (oVar == null || Intrinsics.areEqual((Object) C11342l0.m43547d(oVar.with()), (Object) C11342l0.m43547d(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer(dVar);
        }
        return null;
    }

    /* renamed from: i */
    public static final <T> C12248g<T> m49216i(Class<?> cls, C12248g<Object>... gVarArr) {
        boolean z;
        Class[] clsArr;
        Object a = m49208a(cls);
        if (a == null) {
            return null;
        }
        try {
            if (gVarArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                clsArr = new Class[0];
            } else {
                int length = gVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = C12248g.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = a.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(a, Arrays.copyOf(gVarArr, gVarArr.length));
            if (invoke instanceof C12248g) {
                return (C12248g) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    /* renamed from: j */
    public static final boolean m49217j(@C12579k Object obj, @C12579k C11494d<?> dVar) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "kclass");
        return C11283a.m43411g(dVar).isInstance(obj);
    }

    /* renamed from: k */
    public static final <T> boolean m49218k(Class<T> cls) {
        if (cls.getAnnotation(C12439o.class) == null && cls.getAnnotation(C12249h.class) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m49219l(@C12579k C11494d<Object> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "rootClass");
        return C11283a.m43409e(dVar).isArray();
    }

    @C12579k
    /* renamed from: m */
    public static final Void m49220m(@C12579k C11494d<?> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        C12258b1.m49236i(dVar);
        throw new KotlinNothingValueException();
    }

    /* renamed from: n */
    public static final <T> C12248g<T> m49221n(C11494d<T> dVar) {
        Class<T> e = C11283a.m43409e(dVar);
        if (e.getAnnotation(C12249h.class) != null) {
            return new PolymorphicSerializer(dVar);
        }
        C12439o oVar = (C12439o) e.getAnnotation(C12439o.class);
        if (oVar == null || !Intrinsics.areEqual((Object) C11342l0.m43547d(oVar.with()), (Object) C11342l0.m43547d(PolymorphicSerializer.class))) {
            return null;
        }
        return new PolymorphicSerializer(dVar);
    }

    @C12579k
    /* renamed from: o */
    public static final <T, E extends T> E[] m49222o(@C12579k ArrayList<E> arrayList, @C12579k C11494d<T> dVar) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "eClass");
        Object newInstance = Array.newInstance(C11283a.m43409e(dVar), arrayList.size());
        if (newInstance != null) {
            E[] array = arrayList.toArray((Object[]) newInstance);
            Intrinsics.checkNotNullExpressionValue(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
            return array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
    }
}
