package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.C8767m;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.a1 */
public final class C15534a1 {
    @C11395k(level = DeprecationLevel.ERROR, message = "Please use bringIntoViewRequester instead.", replaceWith = @C11587t0(expression = "bringIntoViewRequester", imports = {"androidx.compose.foundation.relocation.bringIntoViewRequester"}))
    @C8761g
    @C12579k
    /* renamed from: a */
    public static final C8767m m69049a(@C12579k C8767m mVar, @C12579k Object obj) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(obj, "relocationRequester");
        return mVar;
    }
}
