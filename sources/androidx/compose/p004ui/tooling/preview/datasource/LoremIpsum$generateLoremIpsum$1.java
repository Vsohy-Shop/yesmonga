package androidx.compose.p004ui.tooling.preview.datasource;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo22516d2 = {"<anonymous>", "", "invoke"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$generateLoremIpsum$1 */
public final class LoremIpsum$generateLoremIpsum$1 extends Lambda implements C11289a<String> {
    final /* synthetic */ int $loremIpsumMaxSize;
    final /* synthetic */ Ref.IntRef $wordsUsed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoremIpsum$generateLoremIpsum$1(Ref.IntRef intRef, int i) {
        super(0);
        this.$wordsUsed = intRef;
        this.$loremIpsumMaxSize = i;
    }

    @C12580l
    public final String invoke() {
        List a = C16468b.f40839a;
        Ref.IntRef intRef = this.$wordsUsed;
        int i = intRef.element;
        intRef.element = i + 1;
        return (String) a.get(i % this.$loremIpsumMaxSize);
    }
}
