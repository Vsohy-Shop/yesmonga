package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10976s;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.lifecycle.b0 */
public final class C19394b0 {
    @C12579k

    /* renamed from: a */
    public static final C19394b0 f49773a = new C19394b0();

    /* renamed from: b */
    public static final int f49774b = 1;

    /* renamed from: c */
    public static final int f49775c = 2;
    @C12579k

    /* renamed from: d */
    public static final Map<Class<?>, Integer> f49776d = new HashMap();
    @C12579k

    /* renamed from: e */
    public static final Map<Class<?>, List<Constructor<? extends C19447n>>> f49777e = new HashMap();

    @C12579k
    @C11384m
    /* renamed from: c */
    public static final String m90658c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "className");
        return C11622t.replace$default(str, ".", C32920e.f79928l, false, 4, (Object) null) + "_LifecycleAdapter";
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C19470t m90659f(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "object");
        boolean z = obj instanceof C19470t;
        boolean z2 = obj instanceof C19427i;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((C19427i) obj, (C19470t) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((C19427i) obj, (C19470t) null);
        }
        if (z) {
            return (C19470t) obj;
        }
        Class<?> cls = obj.getClass();
        C19394b0 b0Var = f49773a;
        if (b0Var.mo57557d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends C19447n>> list = f49777e.get(cls);
        Intrinsics.checkNotNull(list);
        List list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(b0Var.mo57555a((Constructor) list2.get(0), obj));
        }
        int size = list2.size();
        C19447n[] nVarArr = new C19447n[size];
        for (int i = 0; i < size; i++) {
            nVarArr[i] = f49773a.mo57555a((Constructor) list2.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(nVarArr);
    }

    /* renamed from: a */
    public final C19447n mo57555a(Constructor<? extends C19447n> constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (C19447n) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public final Constructor<? extends C19447n> mo57556b(Class<?> cls) {
        String str;
        boolean z;
        boolean z2;
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR != null) {
                str = packageR.getName();
            } else {
                str = "";
            }
            Intrinsics.checkNotNullExpressionValue(str, "fullPackage");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Intrinsics.checkNotNullExpressionValue(canonicalName, "name");
                canonicalName = canonicalName.substring(str.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c = m90658c(canonicalName);
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                c = str + '.' + c;
            }
            Class<?> cls2 = Class.forName(c);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public final int mo57557d(Class<?> cls) {
        Map<Class<?>, Integer> map = f49776d;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = mo57559g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    public final boolean mo57558e(Class<?> cls) {
        return cls != null && C19475v.class.isAssignableFrom(cls);
    }

    /* renamed from: g */
    public final int mo57559g(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C19447n> b = mo57556b(cls);
        if (b != null) {
            f49777e.put(cls, C10976s.m41419k(b));
            return 2;
        } else if (C19400d.f49780c.mo57564d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (mo57558e(superclass)) {
                Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                if (mo57557d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends C19447n>> list = f49777e.get(superclass);
                Intrinsics.checkNotNull(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class[] interfaces = cls.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (mo57558e(cls2)) {
                    Intrinsics.checkNotNullExpressionValue(cls2, "intrface");
                    if (mo57557d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends C19447n>> list2 = f49777e.get(cls2);
                    Intrinsics.checkNotNull(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f49777e.put(cls, arrayList);
            return 2;
        }
    }
}
