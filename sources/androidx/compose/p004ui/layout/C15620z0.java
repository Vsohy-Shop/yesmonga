package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(level = DeprecationLevel.ERROR, message = "Please use BringIntoViewRequester instead.", replaceWith = @C11587t0(expression = "BringIntoViewRequester", imports = {"androidx.compose.foundation.relocation.BringIntoViewRequester"}))
@C8761g
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.layout.z0 */
public final class C15620z0 {

    /* renamed from: a */
    public static final int f38758a = 0;

    /* renamed from: b */
    public static /* synthetic */ Object m69473b(C15620z0 z0Var, C15098i iVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = null;
        }
        return z0Var.mo44498a(iVar, cVar);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Please use BringIntoViewRequester instead.", replaceWith = @C11587t0(expression = "bringIntoView", imports = {"androidx.compose.foundation.relocation.BringIntoViewRequester"}))
    @C12580l
    /* renamed from: a */
    public final Object mo44498a(@C12580l C15098i iVar, @C12579k C11045c<? super C11079d2> cVar) {
        return C11079d2.f28267a;
    }
}
