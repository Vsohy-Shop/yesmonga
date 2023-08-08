package kotlin.text;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/text/h;", "a", "(I)Lkotlin/text/h;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class MatcherMatchResult$groups$1$iterator$1 extends Lambda implements C11300l<Integer, C11607h> {
    final /* synthetic */ MatcherMatchResult$groups$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MatcherMatchResult$groups$1$iterator$1(MatcherMatchResult$groups$1 matcherMatchResult$groups$1) {
        super(1);
        this.this$0 = matcherMatchResult$groups$1;
    }

    @C12580l
    /* renamed from: a */
    public final C11607h mo23326a(int i) {
        return this.this$0.get(i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return mo23326a(((Number) obj).intValue());
    }
}
