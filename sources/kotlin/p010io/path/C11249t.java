package kotlin.p010io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11241r
/* renamed from: kotlin.io.path.t */
public final class C11249t implements C11245s {
    @C12580l

    /* renamed from: a */
    public C11304p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f28394a;
    @C12580l

    /* renamed from: b */
    public C11304p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f28395b;
    @C12580l

    /* renamed from: c */
    public C11304p<? super Path, ? super IOException, ? extends FileVisitResult> f28396c;
    @C12580l

    /* renamed from: d */
    public C11304p<? super Path, ? super IOException, ? extends FileVisitResult> f28397d;

    /* renamed from: e */
    public boolean f28398e;

    /* renamed from: a */
    public void mo22668a(@C12579k C11304p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "function");
        mo22673f();
        mo22674g(this.f28395b, "onVisitFile");
        this.f28395b = pVar;
    }

    /* renamed from: b */
    public void mo22669b(@C12579k C11304p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "function");
        mo22673f();
        mo22674g(this.f28394a, "onPreVisitDirectory");
        this.f28394a = pVar;
    }

    /* renamed from: c */
    public void mo22670c(@C12579k C11304p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "function");
        mo22673f();
        mo22674g(this.f28397d, "onPostVisitDirectory");
        this.f28397d = pVar;
    }

    /* renamed from: d */
    public void mo22671d(@C12579k C11304p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "function");
        mo22673f();
        mo22674g(this.f28396c, "onVisitFileFailed");
        this.f28396c = pVar;
    }

    @C12579k
    /* renamed from: e */
    public final FileVisitor<Path> mo22672e() {
        mo22673f();
        this.f28398e = true;
        return C11197g.m43242a(new C11257v(this.f28394a, this.f28395b, this.f28396c, this.f28397d));
    }

    /* renamed from: f */
    public final void mo22673f() {
        if (this.f28398e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    /* renamed from: g */
    public final void mo22674g(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(str + " was already defined");
        }
    }
}
