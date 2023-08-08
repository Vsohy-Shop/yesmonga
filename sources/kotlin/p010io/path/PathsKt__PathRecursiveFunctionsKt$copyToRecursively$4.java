package kotlin.p010io.path;

import com.fasterxml.jackson.databind.ext.C14969a;
import java.nio.file.Path;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Lkotlin/io/path/a;", "Ljava/nio/file/Path;", "src", "dst", "Lkotlin/io/path/CopyActionResult;", "a", "(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/CopyActionResult;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4 */
public final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4 extends Lambda implements C11305q<C11168a, Path, Path, CopyActionResult> {
    final /* synthetic */ boolean $followLinks;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4(boolean z) {
        super(3);
        this.$followLinks = z;
    }

    @C12579k
    /* renamed from: a */
    public final CopyActionResult mo22647a(@C12579k C11168a aVar, @C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(aVar, "$this$null");
        Intrinsics.checkNotNullParameter(path, "src");
        Intrinsics.checkNotNullParameter(path2, "dst");
        return aVar.mo22653a(path, path2, this.$followLinks);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo22647a((C11168a) obj, C14969a.m64318a(obj2), C14969a.m64318a(obj3));
    }
}
