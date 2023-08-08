package androidx.compose.runtime;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004`\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo22516d2 = {"Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Landroidx/compose/runtime/s0;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "a", "()Ljava/util/HashMap;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class Pending$keyMap$2 extends Lambda implements C11289a<HashMap<Object, LinkedHashSet<C8615s0>>> {
    final /* synthetic */ Pending this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pending$keyMap$2(Pending pending) {
        super(0);
        this.this$0 = pending;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<Object, LinkedHashSet<C8615s0>> invoke() {
        HashMap<Object, LinkedHashSet<C8615s0>> o = ComposerKt.m29815h0();
        Pending pending = this.this$0;
        int size = pending.mo15174b().size();
        for (int i = 0; i < size; i++) {
            C8615s0 s0Var = pending.mo15174b().get(i);
            boolean unused = ComposerKt.m29823l0(o, ComposerKt.m29789P(s0Var), s0Var);
        }
        return o;
    }
}
