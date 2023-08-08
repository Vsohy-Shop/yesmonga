package androidx.window.layout;

import androidx.annotation.C0376v0;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.C11283a;
import kotlin.jvm.functions.C11289a;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SafeWindowLayoutComponentProvider {
    @C12579k

    /* renamed from: a */
    public static final SafeWindowLayoutComponentProvider f54232a = new SafeWindowLayoutComponentProvider();
    @C12579k

    /* renamed from: b */
    public static final C11677z f54233b = C10864b0.m38748c(SafeWindowLayoutComponentProvider$windowLayoutComponent$2.f54234f);

    /* renamed from: i */
    public final boolean mo62900i(ClassLoader classLoader) {
        if (!mo62909r(classLoader) || !mo62907p(classLoader) || !mo62908q(classLoader) || !mo62905n(classLoader)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo62901j(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* renamed from: k */
    public final boolean mo62902k(Method method, C11494d<?> dVar) {
        return mo62901j(method, C11283a.m43409e(dVar));
    }

    /* renamed from: l */
    public final Class<?> mo62903l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    @C12580l
    /* renamed from: m */
    public final WindowLayoutComponent mo62904m() {
        return (WindowLayoutComponent) f54233b.getValue();
    }

    /* renamed from: n */
    public final boolean mo62905n(ClassLoader classLoader) {
        return mo62910s(new SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(classLoader));
    }

    /* renamed from: o */
    public final boolean mo62906o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* renamed from: p */
    public final boolean mo62907p(ClassLoader classLoader) {
        return mo62910s(new SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(classLoader));
    }

    @C0376v0(24)
    /* renamed from: q */
    public final boolean mo62908q(ClassLoader classLoader) {
        return mo62910s(new SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(classLoader));
    }

    /* renamed from: r */
    public final boolean mo62909r(ClassLoader classLoader) {
        return mo62910s(new SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(classLoader));
    }

    /* renamed from: s */
    public final boolean mo62910s(C11289a<Boolean> aVar) {
        try {
            return aVar.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final Class<?> mo62911t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* renamed from: u */
    public final Class<?> mo62912u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* renamed from: v */
    public final Class<?> mo62913v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
