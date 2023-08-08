package com.squareup.moshi;

import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.squareup.moshi.internal.C35393c;
import com.urbanairship.json.matchers.C9337b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* renamed from: com.squareup.moshi.v */
public final class C35431v {

    /* renamed from: com.squareup.moshi.v$a */
    public class C35432a implements InvocationHandler {

        /* renamed from: a */
        public final /* synthetic */ Class f87092a;

        public C35432a(Class cls) {
            this.f87092a = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            name.hashCode();
            char c = 65535;
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1295482945:
                    if (name.equals(C9337b.f25466b)) {
                        c = 1;
                        break;
                    }
                    break;
                case 147696667:
                    if (name.equals("hashCode")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1444986633:
                    if (name.equals("annotationType")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return "@" + this.f87092a.getName() + "()";
                case 1:
                    return Boolean.valueOf(this.f87092a.isInstance(objArr[0]));
                case 2:
                    return 0;
                case 3:
                    return this.f87092a;
                default:
                    return method.invoke(obj, objArr);
            }
        }
    }

    /* renamed from: a */
    public static Type m146014a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* renamed from: b */
    public static GenericArrayType m146015b(Type type) {
        return new C35393c.C35394a(type);
    }

    /* renamed from: c */
    public static Type m146016c(Type type, Class<?> cls) {
        Type k = m146024k(type, cls, Collection.class);
        if (k instanceof WildcardType) {
            k = ((WildcardType) k).getUpperBounds()[0];
        }
        if (k instanceof ParameterizedType) {
            return ((ParameterizedType) k).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: d */
    public static <T extends Annotation> T m146017d(Class<T> cls) {
        if (!cls.isAnnotation()) {
            throw new IllegalArgumentException(cls + " must be an annotation.");
        } else if (!cls.isAnnotationPresent(C35397j.class)) {
            throw new IllegalArgumentException(cls + " must have @JsonQualifier.");
        } else if (cls.getDeclaredMethods().length == 0) {
            return (Annotation) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C35432a(cls));
        } else {
            throw new IllegalArgumentException(cls + " must not declare methods.");
        }
    }

    /* renamed from: e */
    public static boolean m146018e(@Nullable Type type, @Nullable Type type2) {
        Type[] typeArr;
        Type[] typeArr2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return m146018e(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof C35393c.C35395b) {
                typeArr = ((C35393c.C35395b) parameterizedType).f86958c;
            } else {
                typeArr = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof C35393c.C35395b) {
                typeArr2 = ((C35393c.C35395b) parameterizedType2).f86958c;
            } else {
                typeArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!m146018e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(typeArr, typeArr2)) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m146018e(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m146018e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: f */
    public static String m146019f(Class<?> cls) {
        if (cls.getAnnotation(C35390i.class) != null) {
            return m146020g(cls.getName());
        }
        throw new IllegalArgumentException("Class does not have a JsonClass annotation: " + cls);
    }

    /* renamed from: g */
    public static String m146020g(String str) {
        return str.replace("$", C32920e.f79928l) + "JsonAdapter";
    }

    /* renamed from: h */
    public static Set<? extends Annotation> m146021h(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            LinkedHashSet linkedHashSet = new LinkedHashSet(declaredAnnotations.length);
            for (Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().isAnnotationPresent(C35397j.class)) {
                    linkedHashSet.add(annotation);
                }
            }
            return Collections.unmodifiableSet(linkedHashSet);
        } catch (NoSuchFieldException e) {
            throw new IllegalArgumentException("Could not access field " + str + " on class " + cls.getCanonicalName(), e);
        }
    }

    /* renamed from: i */
    public static Type m146022i(Type type) {
        Class<?> j = m146023j(type);
        return C35393c.m145820s(type, j, j.getGenericSuperclass());
    }

    /* renamed from: j */
    public static Class<?> m146023j(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m146023j(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m146023j(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            str = "null";
        } else {
            str = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
    }

    /* renamed from: k */
    public static Type m146024k(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C35393c.m145820s(type, cls, C35393c.m145808g(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public static Type[] m146025l(Type type, Class<?> cls) {
        if (type == Properties.class) {
            Class<String> cls2 = String.class;
            return new Type[]{cls2, cls2};
        }
        Type k = m146024k(type, cls, Map.class);
        if (k instanceof ParameterizedType) {
            return ((ParameterizedType) k).getActualTypeArguments();
        }
        Class<Object> cls3 = Object.class;
        return new Type[]{cls3, cls3};
    }

    /* renamed from: m */
    public static ParameterizedType m146026m(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C35393c.C35395b((Type) null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    /* renamed from: n */
    public static ParameterizedType m146027n(Type type, Type type2, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C35393c.C35395b(type, type2, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type2);
    }

    @Nullable
    /* renamed from: o */
    public static Set<? extends Annotation> m146028o(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (!cls.isAnnotationPresent(C35397j.class)) {
            throw new IllegalArgumentException(cls + " is not a JsonQualifier.");
        } else if (set.isEmpty()) {
            return null;
        } else {
            for (Annotation annotation : set) {
                if (cls.equals(annotation.annotationType())) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                    linkedHashSet.remove(annotation);
                    return Collections.unmodifiableSet(linkedHashSet);
                }
            }
            return null;
        }
    }

    /* renamed from: p */
    public static WildcardType m146029p(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C35393c.C35396c(typeArr, C35393c.f86951b);
    }

    /* renamed from: q */
    public static WildcardType m146030q(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C35393c.C35396c(new Type[]{Object.class}, typeArr);
    }
}
