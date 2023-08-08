package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: retrofit2.k */
public final class C13053k {

    /* renamed from: a */
    public final Method f32039a;

    /* renamed from: b */
    public final List<?> f32040b;

    public C13053k(Method method, List<?> list) {
        this.f32039a = method;
        this.f32040b = Collections.unmodifiableList(list);
    }

    /* renamed from: c */
    public static C13053k m56364c(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new C13053k(method, new ArrayList(list));
    }

    /* renamed from: a */
    public List<?> mo30524a() {
        return this.f32040b;
    }

    /* renamed from: b */
    public Method mo30525b() {
        return this.f32039a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f32039a.getDeclaringClass().getName(), this.f32039a.getName(), this.f32040b});
    }
}
