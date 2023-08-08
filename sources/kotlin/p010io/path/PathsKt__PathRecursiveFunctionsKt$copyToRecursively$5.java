package kotlin.p010io.path;

import com.fasterxml.jackson.databind.ext.C14969a;
import com.google.android.gms.maps.internal.C30519p1;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Lkotlin/io/path/s;", "Lkotlin/d2;", "a", "(Lkotlin/io/path/s;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 */
public final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 extends Lambda implements C11300l<C11245s, C11079d2> {
    final /* synthetic */ C11305q<C11168a, Path, Path, CopyActionResult> $copyAction;
    final /* synthetic */ C11305q<Path, Path, Exception, OnErrorResult> $onError;
    final /* synthetic */ Path $target;
    final /* synthetic */ Path $this_copyToRecursively;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5(C11305q<? super C11168a, ? super Path, ? super Path, ? extends CopyActionResult> qVar, Path path, Path path2, C11305q<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> qVar2) {
        super(1);
        this.$copyAction = qVar;
        this.$this_copyToRecursively = path;
        this.$target = path2;
        this.$onError = qVar2;
    }

    /* renamed from: a */
    public final void mo22648a(@C12579k C11245s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "$this$visitFileTree");
        final C11305q<C11168a, Path, Path, CopyActionResult> qVar = this.$copyAction;
        final Path path = this.$this_copyToRecursively;
        final Path path2 = this.$target;
        final C11305q<Path, Path, Exception, OnErrorResult> qVar2 = this.$onError;
        sVar.mo22669b(new C11304p<Path, BasicFileAttributes, FileVisitResult>() {
            @C12579k
            /* renamed from: d */
            public final FileVisitResult mo22649d(@C12579k Path path, @C12579k BasicFileAttributes basicFileAttributes) {
                Intrinsics.checkNotNullParameter(path, "p0");
                Intrinsics.checkNotNullParameter(basicFileAttributes, C30519p1.f72971a);
                return PathsKt__PathRecursiveFunctionsKt.m43109M(qVar, path, path2, qVar2, path, basicFileAttributes);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return mo22649d(C14969a.m64318a(obj), C11263w1.m43362a(obj2));
            }
        });
        final C11305q<C11168a, Path, Path, CopyActionResult> qVar3 = this.$copyAction;
        final Path path3 = this.$this_copyToRecursively;
        final Path path4 = this.$target;
        final C11305q<Path, Path, Exception, OnErrorResult> qVar4 = this.$onError;
        sVar.mo22668a(new C11304p<Path, BasicFileAttributes, FileVisitResult>() {
            @C12579k
            /* renamed from: d */
            public final FileVisitResult mo22650d(@C12579k Path path, @C12579k BasicFileAttributes basicFileAttributes) {
                Intrinsics.checkNotNullParameter(path, "p0");
                Intrinsics.checkNotNullParameter(basicFileAttributes, C30519p1.f72971a);
                return PathsKt__PathRecursiveFunctionsKt.m43109M(qVar3, path3, path4, qVar4, path, basicFileAttributes);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return mo22650d(C14969a.m64318a(obj), C11263w1.m43362a(obj2));
            }
        });
        final C11305q<Path, Path, Exception, OnErrorResult> qVar5 = this.$onError;
        final Path path5 = this.$this_copyToRecursively;
        final Path path6 = this.$target;
        sVar.mo22671d(new C11304p<Path, Exception, FileVisitResult>() {
            @C12579k
            /* renamed from: d */
            public final FileVisitResult mo22651d(@C12579k Path path, @C12579k Exception exc) {
                Intrinsics.checkNotNullParameter(path, "p0");
                Intrinsics.checkNotNullParameter(exc, C30519p1.f72971a);
                return PathsKt__PathRecursiveFunctionsKt.m43113Q(qVar5, path5, path6, path, exc);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return mo22651d(C14969a.m64318a(obj), (Exception) obj2);
            }
        });
        final C11305q<Path, Path, Exception, OnErrorResult> qVar6 = this.$onError;
        final Path path7 = this.$this_copyToRecursively;
        final Path path8 = this.$target;
        sVar.mo22670c(new C11304p<Path, IOException, FileVisitResult>() {
            @C12579k
            /* renamed from: a */
            public final FileVisitResult mo22652a(@C12579k Path path, @C12580l IOException iOException) {
                Intrinsics.checkNotNullParameter(path, "directory");
                if (iOException == null) {
                    return FileVisitResult.CONTINUE;
                }
                return PathsKt__PathRecursiveFunctionsKt.m43113Q(qVar6, path7, path8, path, iOException);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return mo22652a(C14969a.m64318a(obj), (IOException) obj2);
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo22648a((C11245s) obj);
        return C11079d2.f28267a;
    }
}
