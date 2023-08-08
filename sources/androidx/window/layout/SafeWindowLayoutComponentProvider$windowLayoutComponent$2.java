package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/window/extensions/layout/WindowLayoutComponent;", "a", "()Landroidx/window/extensions/layout/WindowLayoutComponent;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class SafeWindowLayoutComponentProvider$windowLayoutComponent$2 extends Lambda implements C11289a<WindowLayoutComponent> {

    /* renamed from: f */
    public static final SafeWindowLayoutComponentProvider$windowLayoutComponent$2 f54234f = new SafeWindowLayoutComponentProvider$windowLayoutComponent$2();

    public SafeWindowLayoutComponentProvider$windowLayoutComponent$2() {
        super(0);
    }

    @C12580l
    /* renamed from: a */
    public final WindowLayoutComponent invoke() {
        ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
        if (classLoader == null || !SafeWindowLayoutComponentProvider.f54232a.mo62900i(classLoader)) {
            WindowLayoutComponent windowLayoutComponent = null;
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            WindowLayoutComponent windowLayoutComponent2 = null;
            return null;
        }
    }
}
