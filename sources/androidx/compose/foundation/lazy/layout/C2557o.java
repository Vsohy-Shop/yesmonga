package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C2855v
@C11363r0({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,61:1\n76#2:62\n102#2,2:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState\n*L\n32#1:62\n32#1:63,2\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.layout.o */
public final class C2557o {

    /* renamed from: b */
    public static final int f6740b = 0;
    @C12579k

    /* renamed from: a */
    public final C8700z0 f6741a = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    /* renamed from: androidx.compose.foundation.lazy.layout.o$a */
    public interface C2558a {
        void cancel();
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.o$b */
    public interface C2559b {
        @C12579k
        /* renamed from: a */
        C2558a mo8796a(int i, long j);
    }

    @C12580l
    /* renamed from: a */
    public final C2559b mo8793a() {
        return (C2559b) this.f6741a.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r0.mo8796a(r2, r3);
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.layout.C2557o.C2558a mo8794b(int r2, long r3) {
        /*
            r1 = this;
            androidx.compose.foundation.lazy.layout.o$b r0 = r1.mo8793a()
            if (r0 == 0) goto L_0x000c
            androidx.compose.foundation.lazy.layout.o$a r2 = r0.mo8796a(r2, r3)
            if (r2 != 0) goto L_0x000e
        L_0x000c:
            androidx.compose.foundation.lazy.layout.b r2 = androidx.compose.foundation.lazy.layout.C2538b.f6711a
        L_0x000e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C2557o.mo8794b(int, long):androidx.compose.foundation.lazy.layout.o$a");
    }

    /* renamed from: c */
    public final void mo8795c(@C12580l C2559b bVar) {
        this.f6741a.setValue(bVar);
    }
}
