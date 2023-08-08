package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.cache.DiskLruCache;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Ljava/io/IOException;", "it", "Lkotlin/d2;", "invoke", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 4, 0})
public final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends Lambda implements C11300l<IOException, C11079d2> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "it");
        synchronized (this.this$0.this$0) {
            this.this$0.detach$okhttp();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }
}
