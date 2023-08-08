package androidx.compose.p004ui.text.font;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.text.font.AsyncFontListLoader", mo22502f = "FontListFontFamilyTypefaceAdapter.kt", mo22503i = {0, 0, 0, 0, 1, 1, 1}, mo22504l = {268, 281}, mo22505m = "load", mo22506n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, mo22507s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1 */
public final class AsyncFontListLoader$load$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, C11045c<? super AsyncFontListLoader$load$1> cVar) {
        super(cVar);
        this.this$0 = asyncFontListLoader;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo46760h(this);
    }
}
