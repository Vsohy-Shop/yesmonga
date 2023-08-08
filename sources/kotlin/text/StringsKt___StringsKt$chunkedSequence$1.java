package kotlin.text;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "", "a", "(Ljava/lang/CharSequence;)Ljava/lang/String;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StringsKt___StringsKt$chunkedSequence$1 extends Lambda implements C11300l<CharSequence, String> {

    /* renamed from: f */
    public static final StringsKt___StringsKt$chunkedSequence$1 f28864f = new StringsKt___StringsKt$chunkedSequence$1();

    public StringsKt___StringsKt$chunkedSequence$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final String invoke(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "it");
        return charSequence.toString();
    }
}
