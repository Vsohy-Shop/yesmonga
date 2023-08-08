package androidx.compose.p004ui.modifier;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.runtime.C8547h2;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.ui.modifier.e */
public final class C15629e extends C15988w0 implements C15627d {
    @C12579k

    /* renamed from: d */
    public final C11300l<C15636k, C11079d2> f38771d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15629e(@C12579k C11300l<? super C15636k, C11079d2> lVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar2) {
        super(lVar2);
        Intrinsics.checkNotNullParameter(lVar, "consumer");
        Intrinsics.checkNotNullParameter(lVar2, "debugInspectorInfo");
        this.f38771d = lVar;
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        this.f38771d.invoke(kVar);
    }

    public boolean equals(@C12580l Object obj) {
        return (obj instanceof C15629e) && Intrinsics.areEqual((Object) ((C15629e) obj).f38771d, (Object) this.f38771d);
    }

    public int hashCode() {
        return this.f38771d.hashCode();
    }

    @C12579k
    /* renamed from: r */
    public final C11300l<C15636k, C11079d2> mo44517r() {
        return this.f38771d;
    }
}
