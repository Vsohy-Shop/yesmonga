package kotlin.p010io;

import com.usabilla.sdk.ubform.telemetry.C10108c;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.io.g */
public final class C11147g {
    @C12579k

    /* renamed from: a */
    public final File f28333a;
    @C12579k

    /* renamed from: b */
    public final List<File> f28334b;

    public C11147g(@C12579k File file, @C12579k List<? extends File> list) {
        Intrinsics.checkNotNullParameter(file, C10108c.f27819v);
        Intrinsics.checkNotNullParameter(list, "segments");
        this.f28333a = file;
        this.f28334b = list;
    }

    /* renamed from: d */
    public static /* synthetic */ C11147g m43040d(C11147g gVar, File file, List<File> list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = gVar.f28333a;
        }
        if ((i & 2) != 0) {
            list = gVar.f28334b;
        }
        return gVar.mo22606c(file, list);
    }

    @C12579k
    /* renamed from: a */
    public final File mo22604a() {
        return this.f28333a;
    }

    @C12579k
    /* renamed from: b */
    public final List<File> mo22605b() {
        return this.f28334b;
    }

    @C12579k
    /* renamed from: c */
    public final C11147g mo22606c(@C12579k File file, @C12579k List<? extends File> list) {
        Intrinsics.checkNotNullParameter(file, C10108c.f27819v);
        Intrinsics.checkNotNullParameter(list, "segments");
        return new C11147g(file, list);
    }

    @C12579k
    /* renamed from: e */
    public final File mo22607e() {
        return this.f28333a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11147g)) {
            return false;
        }
        C11147g gVar = (C11147g) obj;
        return Intrinsics.areEqual((Object) this.f28333a, (Object) gVar.f28333a) && Intrinsics.areEqual((Object) this.f28334b, (Object) gVar.f28334b);
    }

    @C12579k
    /* renamed from: f */
    public final String mo22609f() {
        String path = this.f28333a.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "root.path");
        return path;
    }

    @C12579k
    /* renamed from: g */
    public final List<File> mo22610g() {
        return this.f28334b;
    }

    /* renamed from: h */
    public final int mo22611h() {
        return this.f28334b.size();
    }

    public int hashCode() {
        return (this.f28333a.hashCode() * 31) + this.f28334b.hashCode();
    }

    /* renamed from: i */
    public final boolean mo22613i() {
        String path = this.f28333a.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "root.path");
        return path.length() > 0;
    }

    @C12579k
    /* renamed from: j */
    public final File mo22614j(int i, int i2) {
        if (i < 0 || i > i2 || i2 > mo22611h()) {
            throw new IllegalArgumentException();
        }
        String str = File.separator;
        Intrinsics.checkNotNullExpressionValue(str, "separator");
        return new File(CollectionsKt___CollectionsKt.m40639h3(this.f28334b.subList(i, i2), str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null));
    }

    @C12579k
    public String toString() {
        return "FilePathComponents(root=" + this.f28333a + ", segments=" + this.f28334b + ')';
    }
}
