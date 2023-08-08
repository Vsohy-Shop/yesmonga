package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* renamed from: retrofit2.y */
public abstract class C13095y<T> {
    /* renamed from: b */
    public static <T> C13095y<T> m56485b(C13092x xVar, Method method) {
        C13089v b = C13089v.m56432b(xVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C12984b0.m56292j(genericReturnType)) {
            throw C12984b0.m56295m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return C13049j.m56358f(xVar, method, b);
        } else {
            throw C12984b0.m56295m(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract T mo30522a(Object[] objArr);
}
