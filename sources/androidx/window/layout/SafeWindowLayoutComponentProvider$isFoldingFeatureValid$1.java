package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    @C12579k
    public final Boolean invoke() {
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f54232a;
        Class d = safeWindowLayoutComponentProvider.mo62903l(this.$classLoader);
        boolean z = false;
        Method method = d.getMethod("getBounds", new Class[0]);
        Method method2 = d.getMethod("getType", new Class[0]);
        Method method3 = d.getMethod("getState", new Class[0]);
        Intrinsics.checkNotNullExpressionValue(method, "getBoundsMethod");
        if (safeWindowLayoutComponentProvider.mo62902k(method, C11342l0.m43547d(Rect.class)) && safeWindowLayoutComponentProvider.mo62906o(method)) {
            Intrinsics.checkNotNullExpressionValue(method2, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (safeWindowLayoutComponentProvider.mo62902k(method2, C11342l0.m43547d(cls)) && safeWindowLayoutComponentProvider.mo62906o(method2)) {
                Intrinsics.checkNotNullExpressionValue(method3, "getStateMethod");
                if (safeWindowLayoutComponentProvider.mo62902k(method3, C11342l0.m43547d(cls)) && safeWindowLayoutComponentProvider.mo62906o(method3)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
