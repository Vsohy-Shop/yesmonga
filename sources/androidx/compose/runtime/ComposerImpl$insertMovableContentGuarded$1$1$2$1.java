package androidx.compose.runtime;

import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4528:1\n3212#2,4:4529\n3222#2,9:4533\n3217#2:4542\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$2$1\n*L\n3086#1:4529,4\n3087#1:4533,9\n3086#1:4542\n*E\n"})
public final class ComposerImpl$insertMovableContentGuarded$1$1$2$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> $offsetChanges;
    final /* synthetic */ C8689v1 $reader;
    final /* synthetic */ C8697y0 $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$2$1(ComposerImpl composerImpl, List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list, C8689v1 v1Var, C8697y0 y0Var) {
        super(0);
        this.this$0 = composerImpl;
        this.$offsetChanges = list;
        this.$reader = v1Var;
        this.$to = y0Var;
    }

    public final void invoke() {
        C8689v1 y0;
        int[] v0;
        ComposerImpl composerImpl = this.this$0;
        List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list = this.$offsetChanges;
        C8689v1 v1Var = this.$reader;
        C8697y0 y0Var = this.$to;
        List s0 = composerImpl.f22601f;
        try {
            composerImpl.f22601f = list;
            y0 = composerImpl.f22576I;
            v0 = composerImpl.f22610o;
            composerImpl.f22610o = null;
            composerImpl.f22576I = v1Var;
            composerImpl.mo15021s1(y0Var.mo16878c(), y0Var.mo16880e(), y0Var.mo16881f(), true);
            C11079d2 d2Var = C11079d2.f28267a;
            composerImpl.f22576I = y0;
            composerImpl.f22610o = v0;
            composerImpl.f22601f = s0;
        } catch (Throwable th) {
            composerImpl.f22601f = s0;
            throw th;
        }
    }
}
