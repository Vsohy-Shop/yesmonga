package androidx.compose.p004ui.text.font;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.text.font.AsyncFontListLoader", mo22502f = "FontListFontFamilyTypefaceAdapter.kt", mo22503i = {0}, mo22504l = {300}, mo22505m = "loadWithTimeoutOrNull$ui_text_release", mo22506n = {"$this$loadWithTimeoutOrNull"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, C11045c<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> cVar) {
        super(cVar);
        this.this$0 = asyncFontListLoader;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo46761i((C16238t) null, this);
    }
}
