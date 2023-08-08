package kotlin.p010io.path;

import com.fasterxml.jackson.databind.ext.C14969a;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11366s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Lkotlin/io/path/a;", "Ljava/nio/file/Path;", "src", "dst", "Lkotlin/io/path/CopyActionResult;", "a", "(Lkotlin/io/path/a;Ljava/nio/file/Path;Ljava/nio/file/Path;)Lkotlin/io/path/CopyActionResult;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2 */
public final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2 extends Lambda implements C11305q<C11168a, Path, Path, CopyActionResult> {
    final /* synthetic */ boolean $followLinks;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2(boolean z) {
        super(3);
        this.$followLinks = z;
    }

    @C12579k
    /* renamed from: a */
    public final CopyActionResult mo22645a(@C12579k C11168a aVar, @C12579k Path path, @C12579k Path path2) {
        Intrinsics.checkNotNullParameter(aVar, "$this$copyToRecursively");
        Intrinsics.checkNotNullParameter(path, "src");
        Intrinsics.checkNotNullParameter(path2, "dst");
        LinkOption[] a = C11265x.f28403a.mo22683a(this.$followLinks);
        boolean a2 = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a, a.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !a2) {
            if (a2) {
                PathsKt__PathRecursiveFunctionsKt.m43114R(path2);
            }
            C11366s0 s0Var = new C11366s0(2);
            s0Var.mo22856b(a);
            s0Var.mo22855a(StandardCopyOption.REPLACE_EXISTING);
            CopyOption[] copyOptionArr = (CopyOption[]) s0Var.mo22858d(new CopyOption[s0Var.mo22857c()]);
            Intrinsics.checkNotNullExpressionValue(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
        }
        return CopyActionResult.CONTINUE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo22645a((C11168a) obj, C14969a.m64318a(obj2), C14969a.m64318a(obj3));
    }
}
