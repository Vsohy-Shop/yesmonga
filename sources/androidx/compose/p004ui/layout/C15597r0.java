package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.layout.r0 */
public final class C15597r0 {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m69325a(@C12579k C8767m mVar, @C12579k C11300l<? super C15588o, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onPlaced");
        return mVar.mo17224k3(new OnPlacedElement(lVar));
    }
}
