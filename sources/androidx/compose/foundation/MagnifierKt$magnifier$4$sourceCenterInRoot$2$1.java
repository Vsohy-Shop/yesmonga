package androidx.compose.foundation;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class MagnifierKt$magnifier$4$sourceCenterInRoot$2$1 extends Lambda implements C11289a<C15094f> {
    final /* synthetic */ C8700z0<C15094f> $anchorPositionInRoot$delegate;
    final /* synthetic */ C16479d $density;
    final /* synthetic */ C8578k2<C11300l<C16479d, C15094f>> $updatedSourceCenter$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(C16479d dVar, C8578k2<? extends C11300l<? super C16479d, C15094f>> k2Var, C8700z0<C15094f> z0Var) {
        super(0);
        this.$density = dVar;
        this.$updatedSourceCenter$delegate = k2Var;
        this.$anchorPositionInRoot$delegate = z0Var;
    }

    /* renamed from: a */
    public final long mo7210a() {
        long A = ((C15094f) MagnifierKt$magnifier$4.m8996m(this.$updatedSourceCenter$delegate).invoke(this.$density)).mo42242A();
        if (!C15096g.m64901d(MagnifierKt$magnifier$4.m8993j(this.$anchorPositionInRoot$delegate)) || !C15096g.m64901d(A)) {
            return C15094f.f37256b.mo42247c();
        }
        return C15094f.m64886v(MagnifierKt$magnifier$4.m8993j(this.$anchorPositionInRoot$delegate), A);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return C15094f.m64868d(mo7210a());
    }
}
