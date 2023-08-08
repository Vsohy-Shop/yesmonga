package androidx.compose.foundation.layout;

import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15636k;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.runtime.C8547h2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.layout.l */
public final class C2377l extends C15988w0 implements C15627d {
    @C12579k

    /* renamed from: d */
    public final C11300l<C2354e1, C11079d2> f6290d;
    @C12580l

    /* renamed from: e */
    public C2354e1 f6291e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2377l(@C12579k C11300l<? super C2354e1, C11079d2> lVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar2) {
        super(lVar2);
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        Intrinsics.checkNotNullParameter(lVar2, "inspectorInfo");
        this.f6290d = lVar;
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        C2354e1 e1Var = (C2354e1) kVar.mo44518a(WindowInsetsPaddingKt.m10245e());
        if (!Intrinsics.areEqual((Object) e1Var, (Object) this.f6291e)) {
            this.f6291e = e1Var;
            this.f6290d.invoke(e1Var);
        }
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2377l)) {
            return false;
        }
        return Intrinsics.areEqual((Object) ((C2377l) obj).f6290d, (Object) this.f6290d);
    }

    public int hashCode() {
        return this.f6290d.hashCode();
    }
}
