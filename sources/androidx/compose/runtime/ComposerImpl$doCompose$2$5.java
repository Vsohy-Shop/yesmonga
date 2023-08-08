package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ComposerImpl$doCompose$2$5 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $content;
    final /* synthetic */ Object $savedContent;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$doCompose$2$5(C11304p<? super C8592o, ? super Integer, C11079d2> pVar, ComposerImpl composerImpl, Object obj) {
        super(0);
        this.$content = pVar;
        this.this$0 = composerImpl;
        this.$savedContent = obj;
    }

    public final void invoke() {
        Object obj;
        if (this.$content != null) {
            this.this$0.mo15010o2(200, ComposerKt.m29786M());
            C8407b.m30217c(this.this$0, this.$content);
            this.this$0.mo14951X0();
        } else if ((this.this$0.f22613r || this.this$0.f22619x) && (obj = this.$savedContent) != null && !Intrinsics.areEqual(obj, C8592o.f23032a.mo16277a())) {
            this.this$0.mo15010o2(200, ComposerKt.m29786M());
            ComposerImpl composerImpl = this.this$0;
            Object obj2 = this.$savedContent;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            C8407b.m30217c(composerImpl, (C11304p) C11370u0.m43701q(obj2, 2));
            this.this$0.mo14951X0();
        } else {
            this.this$0.mo15005n();
        }
    }
}
