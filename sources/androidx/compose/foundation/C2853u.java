package androidx.compose.foundation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.layout.C15588o;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.u */
public final class C2853u {
    @C11395k(message = "Use systemGestureExclusion", replaceWith = @C11587t0(expression = "systemGestureExclusion", imports = {}))
    @C12579k
    /* renamed from: a */
    public static final C8767m m13162a(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return SystemGestureExclusionKt.m9105b(mVar);
    }

    @C11395k(message = "Use systemGestureExclusion", replaceWith = @C11587t0(expression = "systemGestureExclusion", imports = {}))
    @C12579k
    /* renamed from: b */
    public static final C8767m m13163b(@C12579k C8767m mVar, @C12579k C11300l<? super C15588o, C15098i> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "exclusion");
        return SystemGestureExclusionKt.m9106c(mVar, lVar);
    }
}
