package kotlin.text;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lkotlin/ranges/l;", "it", "", "a", "(Lkotlin/ranges/l;)Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StringsKt__StringsKt$splitToSequence$2 extends Lambda implements C11300l<C11466l, String> {
    final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$splitToSequence$2(CharSequence charSequence) {
        super(1);
        this.$this_splitToSequence = charSequence;
    }

    @C12579k
    /* renamed from: a */
    public final String invoke(@C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "it");
        return StringsKt__StringsKt.substring(this.$this_splitToSequence, lVar);
    }
}
