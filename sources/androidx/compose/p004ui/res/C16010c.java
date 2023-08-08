package androidx.compose.p004ui.res;

import android.content.Context;
import androidx.annotation.C0323b0;
import androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p004ui.text.font.C16215k;
import androidx.compose.p004ui.text.font.C16221l0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.font.C16249w0;
import androidx.compose.p004ui.text.font.C16251x0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n76#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
/* renamed from: androidx.compose.ui.res.c */
public final class C16010c {
    @C12579k

    /* renamed from: a */
    public static final Object f39699a = new Object();
    @C0323b0("cacheLock")
    @C12579k

    /* renamed from: b */
    public static final Map<C16242u, C16251x0> f39700b = new LinkedHashMap();

    @C11395k(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @C11587t0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @C8540g
    @C8582l1
    @C12579k
    /* renamed from: a */
    public static final C16251x0 m71826a(@C12579k C16242u uVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(uVar, "fontFamily");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-190831095, i, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        C16251x0 b = m71827b((Context) oVar.mo15032w(AndroidCompositionLocals_androidKt.m70952g()), uVar);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return b;
    }

    @C11395k(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @C11587t0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    /* renamed from: b */
    public static final C16251x0 m71827b(Context context, C16242u uVar) {
        C16251x0 x0Var;
        if (!(uVar instanceof C16249w0) && !(uVar instanceof C16221l0)) {
            return C16215k.m73100d(context, uVar, (List) null, 4, (Object) null);
        }
        synchronized (f39699a) {
            Map<C16242u, C16251x0> map = f39700b;
            C16251x0 x0Var2 = map.get(uVar);
            if (x0Var2 == null) {
                x0Var2 = C16215k.m73100d(context, uVar, (List) null, 4, (Object) null);
                map.put(uVar, x0Var2);
            }
            x0Var = x0Var2;
        }
        return x0Var;
    }
}
