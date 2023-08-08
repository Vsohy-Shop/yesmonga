package androidx.compose.p004ui.platform;

import androidx.compose.p004ui.geometry.C15098i;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.platform.x3 */
public interface C15996x3 {

    /* renamed from: androidx.compose.ui.platform.x3$a */
    public static final class C15997a {
    }

    /* renamed from: b */
    static /* synthetic */ void m71804b(C15996x3 x3Var, C15098i iVar, C11289a aVar, C11289a aVar2, C11289a aVar3, C11289a aVar4, int i, Object obj) {
        if (obj == null) {
            x3Var.mo45484a(iVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : aVar2, (i & 8) != 0 ? null : aVar3, (i & 16) != 0 ? null : aVar4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }

    /* renamed from: a */
    void mo45484a(@C12579k C15098i iVar, @C12580l C11289a<C11079d2> aVar, @C12580l C11289a<C11079d2> aVar2, @C12580l C11289a<C11079d2> aVar3, @C12580l C11289a<C11079d2> aVar4);

    /* renamed from: c */
    void mo45485c();

    @C12579k
    TextToolbarStatus getStatus();
}
