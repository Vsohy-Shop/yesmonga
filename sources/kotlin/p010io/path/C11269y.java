package kotlin.p010io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.io.path.y */
public final class C11269y {
    @C12579k

    /* renamed from: a */
    public final Path f28408a;
    @C12580l

    /* renamed from: b */
    public final Object f28409b;
    @C12580l

    /* renamed from: c */
    public final C11269y f28410c;
    @C12580l

    /* renamed from: d */
    public Iterator<C11269y> f28411d;

    public C11269y(@C12579k Path path, @C12580l Object obj, @C12580l C11269y yVar) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f28408a = path;
        this.f28409b = obj;
        this.f28410c = yVar;
    }

    @C12580l
    /* renamed from: a */
    public final Iterator<C11269y> mo22685a() {
        return this.f28411d;
    }

    @C12580l
    /* renamed from: b */
    public final Object mo22686b() {
        return this.f28409b;
    }

    @C12580l
    /* renamed from: c */
    public final C11269y mo22687c() {
        return this.f28410c;
    }

    @C12579k
    /* renamed from: d */
    public final Path mo22688d() {
        return this.f28408a;
    }

    /* renamed from: e */
    public final void mo22689e(@C12580l Iterator<C11269y> it) {
        this.f28411d = it;
    }
}
