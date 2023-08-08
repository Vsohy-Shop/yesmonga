package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.C2116e0;
import androidx.compose.foundation.MagnifierKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16491k;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.runtime.C8700z0;
import com.urbanairship.iam.C9168d0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1 extends Lambda implements C11300l<C11289a<? extends C15094f>, C8767m> {
    final /* synthetic */ C16479d $density;
    final /* synthetic */ C8700z0<C16500q> $magnifierSize$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(C16479d dVar, C8700z0<C16500q> z0Var) {
        super(1);
        this.$density = dVar;
        this.$magnifierSize$delegate = z0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C8767m invoke(@C12579k final C11289a<C15094f> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C9168d0.f24881F0);
        C8767m.C8768a aVar2 = C8767m.f23478j;
        C2116e0 c = C2116e0.f5798g.mo7298c();
        C28161 r2 = new C11300l<C16479d, C15094f>() {
            /* renamed from: a */
            public final long mo9781a(@C12579k C16479d dVar) {
                Intrinsics.checkNotNullParameter(dVar, "$this$magnifier");
                return aVar.invoke().mo42242A();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C15094f.m64868d(mo9781a((C16479d) obj));
            }
        };
        final C16479d dVar = this.$density;
        final C8700z0<C16500q> z0Var = this.$magnifierSize$delegate;
        return MagnifierKt.m8982f(aVar2, r2, (C11300l) null, 0.0f, c, new C11300l<C16491k, C11079d2>() {
            /* renamed from: a */
            public final void mo9782a(long j) {
                C8700z0<C16500q> z0Var = z0Var;
                C16479d dVar = dVar;
                TextFieldSelectionManager_androidKt$textFieldMagnifier$1.m12946e(z0Var, C16502r.m74668a(dVar.mo7429n2(C16491k.m74558p(j)), dVar.mo7429n2(C16491k.m74555m(j))));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo9782a(((C16491k) obj).mo47850x());
                return C11079d2.f28267a;
            }
        }, 6, (Object) null);
    }
}
