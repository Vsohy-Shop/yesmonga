package com.squareup.moshi.internal;

import com.squareup.moshi.C35397j;
import com.squareup.moshi.C35431v;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.Nullable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;

/* renamed from: com.squareup.moshi.internal.c */
public final class C35393c {

    /* renamed from: a */
    public static final Set<Annotation> f86950a = Collections.emptySet();

    /* renamed from: b */
    public static final Type[] f86951b = new Type[0];
    @Nullable

    /* renamed from: c */
    public static final Class<?> f86952c = DefaultConstructorMarker.class;
    @Nullable

    /* renamed from: d */
    public static final Class<? extends Annotation> f86953d;

    /* renamed from: e */
    public static final Map<Class<?>, Class<?>> f86954e;

    /* renamed from: com.squareup.moshi.internal.c$a */
    public static final class C35394a implements GenericArrayType {

        /* renamed from: a */
        public final Type f86955a;

        public C35394a(Type type) {
            this.f86955a = C35393c.m145803b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C35431v.m146018e(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f86955a;
        }

        public int hashCode() {
            return this.f86955a.hashCode();
        }

        public String toString() {
            return C35393c.m145825x(this.f86955a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: com.squareup.moshi.internal.c$b */
    public static final class C35395b implements ParameterizedType {
        @Nullable

        /* renamed from: a */
        public final Type f86956a;

        /* renamed from: b */
        public final Type f86957b;

        /* renamed from: c */
        public final Type[] f86958c;

        public C35395b(@Nullable Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || C35431v.m146023j(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C35393c.m145803b(type);
            }
            this.f86956a = type3;
            this.f86957b = C35393c.m145803b(type2);
            this.f86958c = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f86958c;
                if (i < typeArr2.length) {
                    Type type4 = typeArr2[i];
                    type4.getClass();
                    C35393c.m145804c(type4);
                    Type[] typeArr3 = this.f86958c;
                    typeArr3[i] = C35393c.m145803b(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C35431v.m146018e(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f86958c.clone();
        }

        @Nullable
        public Type getOwnerType() {
            return this.f86956a;
        }

        public Type getRawType() {
            return this.f86957b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f86958c) ^ this.f86957b.hashCode()) ^ C35393c.m145810i(this.f86956a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f86958c.length + 1) * 30);
            sb.append(C35393c.m145825x(this.f86957b));
            if (this.f86958c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C35393c.m145825x(this.f86958c[0]));
            for (int i = 1; i < this.f86958c.length; i++) {
                sb.append(", ");
                sb.append(C35393c.m145825x(this.f86958c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.squareup.moshi.internal.c$c */
    public static final class C35396c implements WildcardType {

        /* renamed from: a */
        public final Type f86959a;
        @Nullable

        /* renamed from: b */
        public final Type f86960b;

        public C35396c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Type type = typeArr2[0];
                type.getClass();
                C35393c.m145804c(type);
                Class<Object> cls = Object.class;
                if (typeArr[0] == cls) {
                    this.f86960b = C35393c.m145803b(typeArr2[0]);
                    this.f86959a = cls;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Type type2 = typeArr[0];
                type2.getClass();
                C35393c.m145804c(type2);
                this.f86960b = null;
                this.f86959a = C35393c.m145803b(typeArr[0]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C35431v.m146018e(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f86960b;
            if (type == null) {
                return C35393c.f86951b;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f86959a};
        }

        public int hashCode() {
            Type type = this.f86960b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f86959a.hashCode() + 31);
        }

        public String toString() {
            if (this.f86960b != null) {
                return "? super " + C35393c.m145825x(this.f86960b);
            } else if (this.f86959a == Object.class) {
                return "?";
            } else {
                return "? extends " + C35393c.m145825x(this.f86959a);
            }
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f86953d = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f86954e = Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    public static <T> Class<T> m145802a(Class<T> cls) {
        Class<T> cls2 = f86954e.get(cls);
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: b */
    public static Type m145803b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new C35394a(m145803b(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof C35395b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C35395b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type instanceof C35394a) {
                return type;
            }
            return new C35394a(((GenericArrayType) type).getGenericComponentType());
        } else if (!(type instanceof WildcardType) || (type instanceof C35396c)) {
            return type;
        } else {
            WildcardType wildcardType = (WildcardType) type;
            return new C35396c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: c */
    public static void m145804c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    @Nullable
    /* renamed from: d */
    public static Class<?> m145805d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    public static <T> Constructor<T> m145806e(Class<T> cls) {
        for (Constructor<T> constructor : cls.getDeclaredConstructors()) {
            Class[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length != 0 && parameterTypes[parameterTypes.length - 1].equals(f86952c)) {
                return constructor;
            }
        }
        throw new IllegalStateException("No defaults constructor found for " + cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        throw m145823v(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ab, code lost:
        throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        if ((r8 instanceof java.lang.reflect.ParameterizedType) != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for '" + r8 + "'. Suspiciously, the type was not parameterized but the target class '" + r2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f6, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for " + r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + r8, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076 A[ExcHandler: InvocationTargetException (r7v5 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c A[ExcHandler: InstantiationException (r7v4 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[ExcHandler: IllegalAccessException (r7v3 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f7 A[ExcHandler: ClassNotFoundException (r7v1 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:5:0x001d] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0060=Splitter:B:19:0x0060, B:15:0x0046=Splitter:B:15:0x0046} */
    @javax.annotation.Nullable
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.moshi.C35384h<?> m145807f(com.squareup.moshi.C35410s r7, java.lang.reflect.Type r8, java.lang.Class<?> r9) {
        /*
            java.lang.Class<java.lang.reflect.Type[]> r0 = java.lang.reflect.Type[].class
            java.lang.Class<com.squareup.moshi.i> r1 = com.squareup.moshi.C35390i.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.squareup.moshi.i r1 = (com.squareup.moshi.C35390i) r1
            r2 = 0
            if (r1 == 0) goto L_0x010f
            boolean r1 = r1.generateAdapter()
            if (r1 != 0) goto L_0x0015
            goto L_0x010f
        L_0x0015:
            java.lang.String r1 = r9.getName()
            java.lang.String r1 = com.squareup.moshi.C35431v.m146020g(r1)
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r3 = 1
            java.lang.Class r2 = java.lang.Class.forName(r1, r3, r9)     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            boolean r9 = r8 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Class<com.squareup.moshi.s> r1 = com.squareup.moshi.C35410s.class
            r4 = 0
            if (r9 == 0) goto L_0x0053
            r9 = r8
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Type[] r9 = r9.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r6[r4] = r1     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r6[r3] = r0     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r5[r4] = r7     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r5[r3] = r9     // Catch:{ NoSuchMethodException -> 0x0046, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            goto L_0x0068
        L_0x0046:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r7[r4] = r0     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r5[r4] = r9     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            goto L_0x0068
        L_0x0053:
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r9[r4] = r1     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r9)     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            r5[r4] = r7     // Catch:{ NoSuchMethodException -> 0x0060, ClassNotFoundException -> 0x00f7, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            goto L_0x0068
        L_0x0060:
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
        L_0x0068:
            r1.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            java.lang.Object r7 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            com.squareup.moshi.h r7 = (com.squareup.moshi.C35384h) r7     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            com.squareup.moshi.h r7 = r7.nullSafe()     // Catch:{ ClassNotFoundException -> 0x00f7, NoSuchMethodException -> 0x00ac, IllegalAccessException -> 0x0094, InstantiationException -> 0x007c, InvocationTargetException -> 0x0076 }
            return r7
        L_0x0076:
            r7 = move-exception
            java.lang.RuntimeException r7 = m145823v(r7)
            throw r7
        L_0x007c:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to instantiate the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x0094:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access the generated JsonAdapter for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00ac:
            r7 = move-exception
            boolean r9 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r9 != 0) goto L_0x00e0
            java.lang.reflect.TypeVariable[] r9 = r2.getTypeParameters()
            int r9 = r9.length
            if (r9 == 0) goto L_0x00e0
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for '"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "'. Suspiciously, the type was not parameterized but the target class '"
            r0.append(r8)
            java.lang.String r8 = r2.getCanonicalName()
            r0.append(r8)
            java.lang.String r8 = "' is generic. Consider using Types#newParameterizedType() to define these missing type variables."
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00e0:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x00f7:
            r7 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find the generated JsonAdapter class for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8, r7)
            throw r9
        L_0x010f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.internal.C35393c.m145807f(com.squareup.moshi.s, java.lang.reflect.Type, java.lang.Class):com.squareup.moshi.h");
    }

    /* renamed from: g */
    public static Type m145808g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m145808g(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m145808g(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static boolean m145809h(Annotation[] annotationArr) {
        for (Annotation annotationType : annotationArr) {
            if (annotationType.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static int m145810i(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: j */
    public static int m145811j(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: k */
    public static boolean m145812k(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (set.isEmpty()) {
            return false;
        }
        for (Annotation annotationType : set) {
            if (annotationType.annotationType() == cls) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m145813l(Class<?> cls) {
        Class<? extends Annotation> cls2 = f86953d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    /* renamed from: m */
    public static boolean m145814m(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.")) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static Set<? extends Annotation> m145815n(AnnotatedElement annotatedElement) {
        return m145816o(annotatedElement.getAnnotations());
    }

    /* renamed from: o */
    public static Set<? extends Annotation> m145816o(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C35397j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return f86950a;
    }

    /* renamed from: p */
    public static <T> Constructor<T> m145817p(Class<T> cls) {
        if (f86952c != null) {
            Constructor<T> e = m145806e(cls);
            e.setAccessible(true);
            return e;
        }
        throw new IllegalStateException("DefaultConstructorMarker not on classpath. Make sure the Kotlin stdlib is on the classpath.");
    }

    /* renamed from: q */
    public static JsonDataException m145818q(String str, String str2, JsonReader jsonReader) {
        String str3;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }

    /* renamed from: r */
    public static Type m145819r(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: s */
    public static Type m145820s(Type type, Class<?> cls, Type type2) {
        return m145821t(type, cls, type2, new LinkedHashSet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m145821t(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10, java.util.Collection<java.lang.reflect.TypeVariable<?>> r11) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x0018
            r0 = r10
            java.lang.reflect.TypeVariable r0 = (java.lang.reflect.TypeVariable) r0
            boolean r1 = r11.contains(r0)
            if (r1 == 0) goto L_0x000e
            return r10
        L_0x000e:
            r11.add(r0)
            java.lang.reflect.Type r10 = m145822u(r8, r9, r0)
            if (r10 != r0) goto L_0x0000
            return r10
        L_0x0018:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0035
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x0035
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m145821t(r8, r9, r10, r11)
            if (r10 != r8) goto L_0x0030
            goto L_0x0034
        L_0x0030:
            java.lang.reflect.GenericArrayType r0 = com.squareup.moshi.C35431v.m146015b(r8)
        L_0x0034:
            return r0
        L_0x0035:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x004b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m145821t(r8, r9, r0, r11)
            if (r0 != r8) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            java.lang.reflect.GenericArrayType r10 = com.squareup.moshi.C35431v.m146015b(r8)
        L_0x004a:
            return r10
        L_0x004b:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m145821t(r8, r9, r0, r11)
            if (r3 == r0) goto L_0x005f
            r0 = r1
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0065:
            if (r2 >= r5) goto L_0x0080
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m145821t(r8, r9, r6, r11)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x007d
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L_0x007b:
            r4[r2] = r6
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x0080:
            if (r0 == 0) goto L_0x008c
            com.squareup.moshi.internal.c$b r8 = new com.squareup.moshi.internal.c$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x008c:
            return r10
        L_0x008d:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00bf
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00ad
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m145821t(r8, r9, r1, r11)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.C35431v.m146030q(r8)
            return r8
        L_0x00ad:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00bf
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m145821t(r8, r9, r0, r11)
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00bf
            java.lang.reflect.WildcardType r8 = com.squareup.moshi.C35431v.m146029p(r8)
            return r8
        L_0x00bf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.internal.C35393c.m145821t(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Collection):java.lang.reflect.Type");
    }

    /* renamed from: u */
    public static Type m145822u(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d = m145805d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        Type g = m145808g(type, cls, d);
        if (!(g instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) g).getActualTypeArguments()[m145811j(d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: v */
    public static RuntimeException m145823v(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        } else if (targetException instanceof Error) {
            throw ((Error) targetException);
        } else {
            throw new RuntimeException(targetException);
        }
    }

    /* renamed from: w */
    public static String m145824w(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: x */
    public static String m145825x(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: y */
    public static boolean m145826y(Type type, Type type2) {
        return C35431v.m146018e(type, type2);
    }

    /* renamed from: z */
    public static JsonDataException m145827z(String str, String str2, JsonReader jsonReader) {
        String str3;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", new Object[]{str, path});
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", new Object[]{str, str2, path});
        }
        return new JsonDataException(str3);
    }
}
