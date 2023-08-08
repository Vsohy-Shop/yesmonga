package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.platform.TestTagKt */
public final class TestTagKt {
    @C8547h2
    @C12579k
    /* renamed from: a */
    public static final C8767m m71091a(@C12579k C8767m mVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "tag");
        return SemanticsModifierKt.m71868c(mVar, false, new TestTagKt$testTag$1(str), 1, (Object) null);
    }
}
