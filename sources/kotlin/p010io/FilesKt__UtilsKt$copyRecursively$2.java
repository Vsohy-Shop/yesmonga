package kotlin.p010io;

import com.bumptech.glide.gifdecoder.C22075f;
import com.google.zxing.client.android.C34651e;
import java.io.File;
import java.io.IOException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Ljava/io/File;", "f", "Ljava/io/IOException;", "e", "Lkotlin/d2;", "a", "(Ljava/io/File;Ljava/io/IOException;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$2 */
public final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements C11304p<File, IOException, C11079d2> {
    final /* synthetic */ C11304p<File, IOException, OnErrorAction> $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilesKt__UtilsKt$copyRecursively$2(C11304p<? super File, ? super IOException, ? extends OnErrorAction> pVar) {
        super(2);
        this.$onError = pVar;
    }

    /* renamed from: a */
    public final void mo22551a(@C12579k File file, @C12579k IOException iOException) {
        Intrinsics.checkNotNullParameter(file, C22075f.f56695A);
        Intrinsics.checkNotNullParameter(iOException, C34651e.f83829d);
        if (this.$onError.invoke(file, iOException) == OnErrorAction.TERMINATE) {
            throw new TerminateException(file);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo22551a((File) obj, (IOException) obj2);
        return C11079d2.f28267a;
    }
}
