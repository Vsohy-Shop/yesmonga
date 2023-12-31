package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.font.C16217k1;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import java.util.List;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,427:1\n76#2:428\n102#2,2:429\n33#3,6:431\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n252#1:428\n252#1:429,2\n259#1:431,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader */
public final class AsyncFontListLoader implements C8578k2<Object> {
    @C12579k

    /* renamed from: a */
    public final List<C16238t> f40201a;
    @C12579k

    /* renamed from: b */
    public final C16214j1 f40202b;
    @C12579k

    /* renamed from: c */
    public final AsyncTypefaceCache f40203c;
    @C12579k

    /* renamed from: d */
    public final C11300l<C16217k1.C16219b, C11079d2> f40204d;
    @C12579k

    /* renamed from: e */
    public final C16227o0 f40205e;
    @C12579k

    /* renamed from: f */
    public final C8700z0 f40206f;

    /* renamed from: g */
    public boolean f40207g = true;

    public AsyncFontListLoader(@C12579k List<? extends C16238t> list, @C12579k Object obj, @C12579k C16214j1 j1Var, @C12579k AsyncTypefaceCache asyncTypefaceCache, @C12579k C11300l<? super C16217k1.C16219b, C11079d2> lVar, @C12579k C16227o0 o0Var) {
        Intrinsics.checkNotNullParameter(list, "fontList");
        Intrinsics.checkNotNullParameter(obj, "initialType");
        Intrinsics.checkNotNullParameter(j1Var, "typefaceRequest");
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(lVar, "onCompletion");
        Intrinsics.checkNotNullParameter(o0Var, "platformFontLoader");
        this.f40201a = list;
        this.f40202b = j1Var;
        this.f40203c = asyncTypefaceCache;
        this.f40204d = lVar;
        this.f40205e = o0Var;
        this.f40206f = C8539f2.m30981g(obj, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: g */
    public final boolean mo46759g() {
        return this.f40207g;
    }

    @C12579k
    public Object getValue() {
        return this.f40206f.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[SYNTHETIC, Splitter:B:27:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef A[SYNTHETIC, Splitter:B:38:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46760h(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof androidx.compose.p004ui.text.font.AsyncFontListLoader$load$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = (androidx.compose.p004ui.text.font.AsyncFontListLoader$load$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0068
            if (r4 == r7) goto L_0x004a
            if (r4 != r6) goto L_0x0042
            int r4 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$0
            androidx.compose.ui.text.font.AsyncFontListLoader r11 = (androidx.compose.p004ui.text.font.AsyncFontListLoader) r11
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0103
        L_0x003f:
            r0 = move-exception
            goto L_0x012c
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            int r4 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$2
            androidx.compose.ui.text.font.t r10 = (androidx.compose.p004ui.text.font.C16238t) r10
            java.lang.Object r11 = r2.L$1
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.L$0
            androidx.compose.ui.text.font.AsyncFontListLoader r12 = (androidx.compose.p004ui.text.font.AsyncFontListLoader) r12
            kotlin.C11661u0.m45747n(r0)     // Catch:{ all -> 0x0064 }
            r15 = r12
            r18 = r11
            r11 = r10
            r10 = r18
            goto L_0x00b9
        L_0x0064:
            r0 = move-exception
            r11 = r12
            goto L_0x012c
        L_0x0068:
            kotlin.C11661u0.m45747n(r0)
            java.util.List<androidx.compose.ui.text.font.t> r0 = r1.f40201a     // Catch:{ all -> 0x012a }
            int r4 = r0.size()     // Catch:{ all -> 0x012a }
            r15 = r1
            r14 = r8
        L_0x0073:
            if (r14 >= r4) goto L_0x010f
            java.lang.Object r9 = r0.get(r14)     // Catch:{ all -> 0x0107 }
            r13 = r9
            androidx.compose.ui.text.font.t r13 = (androidx.compose.p004ui.text.font.C16238t) r13     // Catch:{ all -> 0x0107 }
            int r9 = r13.mo46868a()     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.c0$a r10 = androidx.compose.p004ui.text.font.C16182c0.f40243b     // Catch:{ all -> 0x0107 }
            int r10 = r10.mo46865a()     // Catch:{ all -> 0x0107 }
            boolean r9 = androidx.compose.p004ui.text.font.C16182c0.m72919g(r9, r10)     // Catch:{ all -> 0x0107 }
            if (r9 == 0) goto L_0x010a
            androidx.compose.ui.text.font.AsyncTypefaceCache r9 = r15.f40203c     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.o0 r11 = r15.f40205e     // Catch:{ all -> 0x0107 }
            r12 = 0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 r10 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1     // Catch:{ all -> 0x0107 }
            r10.<init>(r15, r13, r5)     // Catch:{ all -> 0x0107 }
            r2.L$0 = r15     // Catch:{ all -> 0x0107 }
            r2.L$1 = r0     // Catch:{ all -> 0x0107 }
            r2.L$2 = r13     // Catch:{ all -> 0x0107 }
            r2.I$0 = r14     // Catch:{ all -> 0x0107 }
            r2.I$1 = r4     // Catch:{ all -> 0x0107 }
            r2.label = r7     // Catch:{ all -> 0x0107 }
            r16 = r10
            r10 = r13
            r17 = r13
            r13 = r16
            r16 = r14
            r14 = r2
            java.lang.Object r9 = r9.mo46768g(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0107 }
            if (r9 != r3) goto L_0x00b3
            return r3
        L_0x00b3:
            r10 = r0
            r0 = r9
            r9 = r16
            r11 = r17
        L_0x00b9:
            if (r0 == 0) goto L_0x00ef
            androidx.compose.ui.text.font.j1 r3 = r15.f40202b     // Catch:{ all -> 0x0107 }
            int r3 = r3.mo46971j()     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.j1 r4 = r15.f40202b     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.i0 r4 = r4.mo46972k()     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.j1 r5 = r15.f40202b     // Catch:{ all -> 0x0107 }
            int r5 = r5.mo46970i()     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = androidx.compose.p004ui.text.font.C16198g0.m72983a(r3, r0, r11, r4, r5)     // Catch:{ all -> 0x0107 }
            r15.setValue(r0)     // Catch:{ all -> 0x0107 }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0107 }
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            boolean r2 = kotlinx.coroutines.C11804f2.m46952C(r2)
            r15.f40207g = r8
            kotlin.jvm.functions.l<androidx.compose.ui.text.font.k1$b, kotlin.d2> r3 = r15.f40204d
            androidx.compose.ui.text.font.k1$b r4 = new androidx.compose.ui.text.font.k1$b
            java.lang.Object r5 = r15.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            return r0
        L_0x00ef:
            r2.L$0 = r15     // Catch:{ all -> 0x0107 }
            r2.L$1 = r10     // Catch:{ all -> 0x0107 }
            r2.L$2 = r5     // Catch:{ all -> 0x0107 }
            r2.I$0 = r9     // Catch:{ all -> 0x0107 }
            r2.I$1 = r4     // Catch:{ all -> 0x0107 }
            r2.label = r6     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = kotlinx.coroutines.C12088q3.m48293a(r2)     // Catch:{ all -> 0x0107 }
            if (r0 != r3) goto L_0x0102
            return r3
        L_0x0102:
            r11 = r15
        L_0x0103:
            r14 = r9
            r0 = r10
            r15 = r11
            goto L_0x010c
        L_0x0107:
            r0 = move-exception
            r11 = r15
            goto L_0x012c
        L_0x010a:
            r16 = r14
        L_0x010c:
            int r14 = r14 + r7
            goto L_0x0073
        L_0x010f:
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            boolean r0 = kotlinx.coroutines.C11804f2.m46952C(r0)
            r15.f40207g = r8
            kotlin.jvm.functions.l<androidx.compose.ui.text.font.k1$b, kotlin.d2> r2 = r15.f40204d
            androidx.compose.ui.text.font.k1$b r3 = new androidx.compose.ui.text.font.k1$b
            java.lang.Object r4 = r15.getValue()
            r3.<init>(r4, r0)
            r2.invoke(r3)
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x012a:
            r0 = move-exception
            r11 = r1
        L_0x012c:
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            boolean r2 = kotlinx.coroutines.C11804f2.m46952C(r2)
            r11.f40207g = r8
            kotlin.jvm.functions.l<androidx.compose.ui.text.font.k1$b, kotlin.d2> r3 = r11.f40204d
            androidx.compose.ui.text.font.k1$b r4 = new androidx.compose.ui.text.font.k1$b
            java.lang.Object r5 = r11.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AsyncFontListLoader.mo46760h(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46761i(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16238t r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.p004ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.p004ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.t r7 = (androidx.compose.p004ui.text.font.C16238t) r7
            kotlin.C11661u0.m45747n(r8)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            goto L_0x004b
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            kotlin.C11661u0.m45747n(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r8.<init>(r6, r7, r4)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r0.L$0 = r7     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r0.label = r3     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = kotlinx.coroutines.TimeoutKt.m46064e(r2, r8, r0)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r4 = r8
            goto L_0x0085
        L_0x004d:
            r8 = move-exception
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            kotlinx.coroutines.k0$b r2 = kotlinx.coroutines.C12044k0.f29686v0
            kotlin.coroutines.CoroutineContext$a r1 = r1.mo7444b(r2)
            kotlinx.coroutines.k0 r1 = (kotlinx.coroutines.C12044k0) r1
            if (r1 == 0) goto L_0x0085
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.mo23719P(r0, r2)
            goto L_0x0085
        L_0x007a:
            r7 = move-exception
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            boolean r8 = kotlinx.coroutines.C11804f2.m46952C(r8)
            if (r8 == 0) goto L_0x0086
        L_0x0085:
            return r4
        L_0x0086:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AsyncFontListLoader.mo46761i(androidx.compose.ui.text.font.t, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: k */
    public final void mo46762k(boolean z) {
        this.f40207g = z;
    }

    public final void setValue(Object obj) {
        this.f40206f.setValue(obj);
    }
}
