package kotlin.text;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements C11300l<String, String> {
    final /* synthetic */ String $indent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__IndentKt$getIndentFunction$2(String str) {
        super(1);
        this.$indent = str;
    }

    @C12579k
    /* renamed from: a */
    public final String invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "line");
        return this.$indent + str;
    }
}
