package androidx.compose.p004ui.semantics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.semantics.SemanticsConfigurationKt */
public final class SemanticsConfigurationKt {
    @C12580l
    /* renamed from: a */
    public static final <T> T m71865a(@C12579k C16035j jVar, @C12579k SemanticsPropertyKey<T> semanticsPropertyKey) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(semanticsPropertyKey, "key");
        return jVar.mo46167y(semanticsPropertyKey, SemanticsConfigurationKt$getOrNull$1.f39709f);
    }
}
