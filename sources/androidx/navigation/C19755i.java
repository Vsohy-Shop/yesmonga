package androidx.navigation;

import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.navigation.i */
public final class C19755i {
    @C12579k
    /* renamed from: a */
    public static final C19753h m91859a(@C12579k String str, @C12579k C11300l<? super C19790p, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(lVar, "builder");
        C19790p pVar = new C19790p();
        lVar.invoke(pVar);
        return new C19753h(str, pVar.mo58550a());
    }
}
