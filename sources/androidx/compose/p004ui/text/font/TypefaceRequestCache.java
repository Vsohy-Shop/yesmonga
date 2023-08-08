package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.caches.C16153b;
import androidx.compose.p004ui.text.font.C16217k1;
import androidx.compose.p004ui.text.platform.C16399y;
import androidx.compose.p004ui.text.platform.C16400z;
import java.util.List;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n24#2:250\n24#2:251\n24#2:252\n24#2:253\n24#2:254\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache\n*L\n165#1:249\n202#1:250\n219#1:251\n232#1:252\n239#1:253\n245#1:254\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache */
public final class TypefaceRequestCache {
    @C12579k

    /* renamed from: a */
    public final C16400z f40231a = C16399y.m73981a();
    @C12579k

    /* renamed from: b */
    public final C16153b<C16214j1, C16217k1> f40232b = new C16153b<>(16);

    @C12580l
    /* renamed from: b */
    public final C16217k1 mo46805b(@C12579k C16214j1 j1Var) {
        C16217k1 g;
        Intrinsics.checkNotNullParameter(j1Var, "typefaceRequest");
        synchronized (this.f40231a) {
            g = this.f40232b.mo46628g(j1Var);
        }
        return g;
    }

    @C12579k
    /* renamed from: c */
    public final C16400z mo46806c() {
        return this.f40231a;
    }

    /* renamed from: d */
    public final int mo46807d() {
        int p;
        synchronized (this.f40231a) {
            p = this.f40232b.mo46637p();
        }
        return p;
    }

    /* renamed from: e */
    public final void mo46808e(@C12579k List<C16214j1> list, @C12579k C11300l<? super C16214j1, ? extends C16217k1> lVar) {
        C16217k1 g;
        Intrinsics.checkNotNullParameter(list, "typefaceRequests");
        Intrinsics.checkNotNullParameter(lVar, "resolveTypeface");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C16214j1 j1Var = list.get(i);
            synchronized (this.f40231a) {
                g = this.f40232b.mo46628g(j1Var);
            }
            if (g == null) {
                try {
                    C16217k1 k1Var = (C16217k1) lVar.invoke(j1Var);
                    if (!(k1Var instanceof C16217k1.C16218a)) {
                        synchronized (this.f40231a) {
                            C16217k1 k = this.f40232b.mo46632k(j1Var, k1Var);
                        }
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r5 = (androidx.compose.p004ui.text.font.C16217k1) r5.invoke(new androidx.compose.p004ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = r3.f40231a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r3.f40232b.mo46628g(r4) != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r5.mo46977b() == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r3.f40232b.mo46632k(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r4 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        throw new java.lang.IllegalStateException("Could not load font", r4);
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.C8578k2<java.lang.Object> mo46809f(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16214j1 r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.font.C16217k1, kotlin.C11079d2>, ? extends androidx.compose.p004ui.text.font.C16217k1> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "typefaceRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "resolveTypeface"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.compose.ui.text.platform.z r0 = r3.f40231a
            monitor-enter(r0)
            androidx.compose.ui.text.caches.b<androidx.compose.ui.text.font.j1, androidx.compose.ui.text.font.k1> r1 = r3.f40232b     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.mo46628g(r4)     // Catch:{ all -> 0x0059 }
            androidx.compose.ui.text.font.k1 r1 = (androidx.compose.p004ui.text.font.C16217k1) r1     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0027
            boolean r2 = r1.mo46977b()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r0)
            return r1
        L_0x001f:
            androidx.compose.ui.text.caches.b<androidx.compose.ui.text.font.j1, androidx.compose.ui.text.font.k1> r1 = r3.f40232b     // Catch:{ all -> 0x0059 }
            java.lang.Object r1 = r1.mo46634m(r4)     // Catch:{ all -> 0x0059 }
            androidx.compose.ui.text.font.k1 r1 = (androidx.compose.p004ui.text.font.C16217k1) r1     // Catch:{ all -> 0x0059 }
        L_0x0027:
            monitor-exit(r0)
            androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 r0 = new androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1     // Catch:{ Exception -> 0x0050 }
            r0.<init>(r3, r4)     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ Exception -> 0x0050 }
            androidx.compose.ui.text.font.k1 r5 = (androidx.compose.p004ui.text.font.C16217k1) r5     // Catch:{ Exception -> 0x0050 }
            androidx.compose.ui.text.platform.z r0 = r3.f40231a
            monitor-enter(r0)
            androidx.compose.ui.text.caches.b<androidx.compose.ui.text.font.j1, androidx.compose.ui.text.font.k1> r1 = r3.f40232b     // Catch:{ all -> 0x004d }
            java.lang.Object r1 = r1.mo46628g(r4)     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0049
            boolean r1 = r5.mo46977b()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0049
            androidx.compose.ui.text.caches.b<androidx.compose.ui.text.font.j1, androidx.compose.ui.text.font.k1> r1 = r3.f40232b     // Catch:{ all -> 0x004d }
            r1.mo46632k(r4, r5)     // Catch:{ all -> 0x004d }
        L_0x0049:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x004d }
            monitor-exit(r0)
            return r5
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0050:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r5.<init>(r0, r4)
            throw r5
        L_0x0059:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.TypefaceRequestCache.mo46809f(androidx.compose.ui.text.font.j1, kotlin.jvm.functions.l):androidx.compose.runtime.k2");
    }
}
