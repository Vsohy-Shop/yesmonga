package androidx.window.layout;

import java.lang.reflect.Method;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    @C12579k
    public final Boolean invoke() {
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f54232a;
        boolean z = false;
        Method method = safeWindowLayoutComponentProvider.mo62911t(this.$classLoader).getMethod("getWindowLayoutComponent", new Class[0]);
        Class h = safeWindowLayoutComponentProvider.mo62913v(this.$classLoader);
        Intrinsics.checkNotNullExpressionValue(method, "getWindowLayoutComponentMethod");
        if (safeWindowLayoutComponentProvider.mo62906o(method)) {
            Intrinsics.checkNotNullExpressionValue(h, "windowLayoutComponentClass");
            if (safeWindowLayoutComponentProvider.mo62901j(method, h)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
