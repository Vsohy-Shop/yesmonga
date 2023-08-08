package androidx.compose.foundation;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MagnifierKt$magnifier$4$4$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ C8578k2<C15094f> $sourceCenterInRoot$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$4$1(C8578k2<C15094f> k2Var) {
        super(1);
        this.$sourceCenterInRoot$delegate = k2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertyKey<C11289a<C15094f>> a = MagnifierKt.m8977a();
        final C8578k2<C15094f> k2Var = this.$sourceCenterInRoot$delegate;
        qVar.mo46157e(a, new C11289a<C15094f>() {
            /* renamed from: a */
            public final long mo7209a() {
                return MagnifierKt$magnifier$4.m9000q(k2Var);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C15094f.m64868d(mo7209a());
            }
        });
    }
}
