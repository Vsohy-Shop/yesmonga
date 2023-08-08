package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.w0 */
public final class C19500w0 {
    @C12579k

    /* renamed from: a */
    public static final String f49886a = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @C12579k
    /* renamed from: a */
    public static final C12074o0 m90846a(@C12579k C19476v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        C12074o0 o0Var = (C12074o0) v0Var.getTag(f49886a);
        if (o0Var != null) {
            return o0Var;
        }
        Object tagIfAbsent = v0Var.setTagIfAbsent(f49886a, new C19405e(C11719b3.m46155c((C11723c2) null, 1, (Object) null).mo7443Q(C11768d1.m46783e().mo23706a0())));
        Intrinsics.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (C12074o0) tagIfAbsent;
    }
}
