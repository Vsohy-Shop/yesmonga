package kotlin.p010io.path;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.C11561o;
import kotlin.sequences.C11563q;
import org.jetbrains.annotations.C12579k;

@C11241r
/* renamed from: kotlin.io.path.PathTreeWalk */
public final class PathTreeWalk implements C11559m<Path> {
    @C12579k

    /* renamed from: a */
    public final Path f28375a;
    @C12579k

    /* renamed from: b */
    public final PathWalkOption[] f28376b;

    public PathTreeWalk(@C12579k Path path, @C12579k PathWalkOption[] pathWalkOptionArr) {
        Intrinsics.checkNotNullParameter(path, "start");
        Intrinsics.checkNotNullParameter(pathWalkOptionArr, "options");
        this.f28375a = path;
        this.f28376b = pathWalkOptionArr;
    }

    /* renamed from: g */
    public final Iterator<Path> mo22635g() {
        return C11563q.m44901a(new PathTreeWalk$bfsIterator$1(this, (C11045c<? super PathTreeWalk$bfsIterator$1>) null));
    }

    /* renamed from: h */
    public final Iterator<Path> mo22636h() {
        return C11563q.m44901a(new PathTreeWalk$dfsIterator$1(this, (C11045c<? super PathTreeWalk$dfsIterator$1>) null));
    }

    /* renamed from: i */
    public final boolean mo22637i() {
        return ArraysKt___ArraysKt.m39388T8(this.f28376b, PathWalkOption.FOLLOW_LINKS);
    }

    @C12579k
    public Iterator<Path> iterator() {
        return mo22640l() ? mo22635g() : mo22636h();
    }

    /* renamed from: j */
    public final boolean mo22638j() {
        return ArraysKt___ArraysKt.m39388T8(this.f28376b, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    /* renamed from: k */
    public final LinkOption[] mo22639k() {
        return C11265x.f28403a.mo22683a(mo22637i());
    }

    /* renamed from: l */
    public final boolean mo22640l() {
        return ArraysKt___ArraysKt.m39388T8(this.f28376b, PathWalkOption.BREADTH_FIRST);
    }

    /* renamed from: m */
    public final Object mo22641m(C11561o<? super Path> oVar, C11269y yVar, C11205i iVar, C11300l<? super List<C11269y>, C11079d2> lVar, C11045c<? super C11079d2> cVar) {
        Path d = yVar.mo22688d();
        LinkOption[] e = mo22639k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(e, e.length);
        if (!Files.isDirectory(d, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (Files.exists(d, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                C11322b0.m43482e(0);
                oVar.mo23250b(d, cVar);
                C11322b0.m43482e(1);
                return C11079d2.f28267a;
            }
        } else if (!C11222m0.m43272c(yVar)) {
            if (mo22638j()) {
                C11322b0.m43482e(0);
                oVar.mo23250b(d, cVar);
                C11322b0.m43482e(1);
            }
            LinkOption[] e2 = mo22639k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(e2, e2.length);
            if (Files.isDirectory(d, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                lVar.invoke(iVar.mo22657c(yVar));
            }
        } else {
            C11210j0.m43258a();
            throw C11206i0.m43254a(d.toString());
        }
        return C11079d2.f28267a;
    }
}
