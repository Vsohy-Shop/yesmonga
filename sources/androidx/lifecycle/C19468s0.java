package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import com.google.firebase.crashlytics.C32648f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.lifecycle.s0 */
public final class C19468s0 {
    @C12579k

    /* renamed from: a */
    public static final List<Class<?>> f49857a;
    @C12579k

    /* renamed from: b */
    public static final List<Class<?>> f49858b;

    static {
        Class<C19456p0> cls = C19456p0.class;
        f49857a = CollectionsKt__CollectionsKt.m40448L(Application.class, cls);
        f49858b = C10976s.m41419k(cls);
    }

    @C12580l
    /* renamed from: c */
    public static final <T> Constructor<T> m90792c(@C12579k Class<T> cls, @C12579k List<? extends Class<?>> list) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Intrinsics.checkNotNullParameter(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor<T> constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List kz = ArraysKt___ArraysKt.m39955kz(parameterTypes);
            if (Intrinsics.areEqual((Object) list, (Object) kz)) {
                Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != kz.size() || !kz.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends C19476v0> T m90793d(@C12579k Class<T> cls, @C12579k Constructor<T> constructor, @C12579k Object... objArr) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(objArr, C32648f.f79206e);
        try {
            return (C19476v0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
