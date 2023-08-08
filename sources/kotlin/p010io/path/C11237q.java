package kotlin.p010io.path;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.io.path.q */
public final class C11237q {

    /* renamed from: a */
    public final int f28390a;

    /* renamed from: b */
    public int f28391b;
    @C12579k

    /* renamed from: c */
    public final List<Exception> f28392c;
    @C12580l

    /* renamed from: d */
    public Path f28393d;

    public C11237q() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo22661a(@C12579k Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "exception");
        boolean z = true;
        this.f28391b++;
        if (this.f28392c.size() >= this.f28390a) {
            z = false;
        }
        if (z) {
            if (this.f28393d != null) {
                C11233p.m43283a();
                Throwable a = C11229o.m43279a(String.valueOf(this.f28393d)).initCause(exc);
                Intrinsics.checkNotNull(a, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exc = C11217l.m43265a(a);
            }
            this.f28392c.add(exc);
        }
    }

    /* renamed from: b */
    public final void mo22662b(@C12579k Path path) {
        Path path2;
        Intrinsics.checkNotNullParameter(path, "name");
        Path path3 = this.f28393d;
        if (path3 != null) {
            path2 = path3.resolve(path);
        } else {
            path2 = null;
        }
        this.f28393d = path2;
    }

    /* renamed from: c */
    public final void mo22663c(@C12579k Path path) {
        Path path2;
        Intrinsics.checkNotNullParameter(path, "name");
        Path path3 = this.f28393d;
        Path path4 = null;
        if (path3 != null) {
            path2 = path3.getFileName();
        } else {
            path2 = null;
        }
        if (Intrinsics.areEqual((Object) path, (Object) path2)) {
            Path path5 = this.f28393d;
            if (path5 != null) {
                path4 = path5.getParent();
            }
            this.f28393d = path4;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @C12579k
    /* renamed from: d */
    public final List<Exception> mo22664d() {
        return this.f28392c;
    }

    @C12580l
    /* renamed from: e */
    public final Path mo22665e() {
        return this.f28393d;
    }

    /* renamed from: f */
    public final int mo22666f() {
        return this.f28391b;
    }

    /* renamed from: g */
    public final void mo22667g(@C12580l Path path) {
        this.f28393d = path;
    }

    public C11237q(int i) {
        this.f28390a = i;
        this.f28392c = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11237q(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }
}
