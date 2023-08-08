package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.caches.C16153b;
import androidx.compose.p004ui.text.caches.C16154c;
import androidx.compose.p004ui.text.platform.C16399y;
import androidx.compose.p004ui.text.platform.C16400z;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,427:1\n24#2:428\n24#2:429\n24#2:430\n24#2:431\n24#2:432\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n365#1:428\n376#1:429\n388#1:430\n395#1:431\n416#1:432\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache */
public final class AsyncTypefaceCache {
    @C12579k

    /* renamed from: a */
    public final Object f40208a = C16167a.m72843b((Object) null);
    @C12579k

    /* renamed from: b */
    public final C16153b<C16168b, C16167a> f40209b = new C16153b<>(16);
    @C12579k

    /* renamed from: c */
    public final C16154c<C16168b, C16167a> f40210c = new C16154c<>(0, 1, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: d */
    public final C16400z f40211d = C16399y.m73981a();

    @C11288f
    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$a */
    public static final class C16167a {
        @C12580l

        /* renamed from: a */
        public final Object f40212a;

        public /* synthetic */ C16167a(Object obj) {
            this.f40212a = obj;
        }

        /* renamed from: a */
        public static final /* synthetic */ C16167a m72842a(Object obj) {
            return new C16167a(obj);
        }

        @C12579k
        /* renamed from: b */
        public static Object m72843b(@C12580l Object obj) {
            return obj;
        }

        /* renamed from: c */
        public static boolean m72844c(Object obj, Object obj2) {
            return (obj2 instanceof C16167a) && Intrinsics.areEqual(obj, ((C16167a) obj2).mo46773i());
        }

        /* renamed from: d */
        public static final boolean m72845d(Object obj, Object obj2) {
            return Intrinsics.areEqual(obj, obj2);
        }

        /* renamed from: f */
        public static int m72846f(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: g */
        public static final boolean m72847g(Object obj) {
            return obj == null;
        }

        /* renamed from: h */
        public static String m72848h(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        @C12580l
        /* renamed from: e */
        public final Object mo46770e() {
            return this.f40212a;
        }

        public boolean equals(Object obj) {
            return m72844c(this.f40212a, obj);
        }

        public int hashCode() {
            return m72846f(this.f40212a);
        }

        /* renamed from: i */
        public final /* synthetic */ Object mo46773i() {
            return this.f40212a;
        }

        public String toString() {
            return m72848h(this.f40212a);
        }
    }

    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$b */
    public static final class C16168b {
        @C12579k

        /* renamed from: a */
        public final C16238t f40213a;
        @C12580l

        /* renamed from: b */
        public final Object f40214b;

        public C16168b(@C12579k C16238t tVar, @C12580l Object obj) {
            Intrinsics.checkNotNullParameter(tVar, "font");
            this.f40213a = tVar;
            this.f40214b = obj;
        }

        /* renamed from: d */
        public static /* synthetic */ C16168b m72851d(C16168b bVar, C16238t tVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                tVar = bVar.f40213a;
            }
            if ((i & 2) != 0) {
                obj = bVar.f40214b;
            }
            return bVar.mo46777c(tVar, obj);
        }

        @C12579k
        /* renamed from: a */
        public final C16238t mo46775a() {
            return this.f40213a;
        }

        @C12580l
        /* renamed from: b */
        public final Object mo46776b() {
            return this.f40214b;
        }

        @C12579k
        /* renamed from: c */
        public final C16168b mo46777c(@C12579k C16238t tVar, @C12580l Object obj) {
            Intrinsics.checkNotNullParameter(tVar, "font");
            return new C16168b(tVar, obj);
        }

        @C12579k
        /* renamed from: e */
        public final C16238t mo46778e() {
            return this.f40213a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16168b)) {
                return false;
            }
            C16168b bVar = (C16168b) obj;
            return Intrinsics.areEqual((Object) this.f40213a, (Object) bVar.f40213a) && Intrinsics.areEqual(this.f40214b, bVar.f40214b);
        }

        @C12580l
        /* renamed from: f */
        public final Object mo46780f() {
            return this.f40214b;
        }

        public int hashCode() {
            int hashCode = this.f40213a.hashCode() * 31;
            Object obj = this.f40214b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        @C12579k
        public String toString() {
            return "Key(font=" + this.f40213a + ", loaderKey=" + this.f40214b + ')';
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m72837f(AsyncTypefaceCache asyncTypefaceCache, C16238t tVar, C16227o0 o0Var, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.mo46767e(tVar, o0Var, obj, z);
    }

    @C12580l
    /* renamed from: d */
    public final C16167a mo46766d(@C12579k C16238t tVar, @C12579k C16227o0 o0Var) {
        C16167a g;
        Intrinsics.checkNotNullParameter(tVar, "font");
        Intrinsics.checkNotNullParameter(o0Var, "platformFontLoader");
        C16168b bVar = new C16168b(tVar, o0Var.mo46755b());
        synchronized (this.f40211d) {
            g = this.f40209b.mo46628g(bVar);
            if (g == null) {
                g = this.f40210c.mo46647e(bVar);
            }
        }
        return g;
    }

    /* renamed from: e */
    public final void mo46767e(@C12579k C16238t tVar, @C12579k C16227o0 o0Var, @C12580l Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(tVar, "font");
        Intrinsics.checkNotNullParameter(o0Var, "platformFontLoader");
        C16168b bVar = new C16168b(tVar, o0Var.mo46755b());
        synchronized (this.f40211d) {
            if (obj == null) {
                try {
                    C16167a n = this.f40210c.mo46658n(bVar, C16167a.m72842a(this.f40208a));
                } catch (Throwable th) {
                    throw th;
                }
            } else if (z) {
                C16167a n2 = this.f40210c.mo46658n(bVar, C16167a.m72842a(C16167a.m72843b(obj)));
            } else {
                C16167a k = this.f40209b.mo46632k(bVar, C16167a.m72842a(C16167a.m72843b(obj)));
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    public final java.lang.Object mo46768g(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16238t r6, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16227o0 r7, boolean r8, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.coroutines.C11045c<java.lang.Object>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.p004ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r6 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16168b) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache) r7
            kotlin.C11661u0.m45747n(r10)
            goto L_0x007a
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            kotlin.C11661u0.m45747n(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b
            java.lang.Object r7 = r7.mo46755b()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.z r6 = r5.f40211d
            monitor-enter(r6)
            androidx.compose.ui.text.caches.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r5.f40209b     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r7.mo46628g(r10)     // Catch:{ all -> 0x00b0 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a) r7     // Catch:{ all -> 0x00b0 }
            if (r7 != 0) goto L_0x005c
            androidx.compose.ui.text.caches.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r5.f40210c     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r7.mo46647e(r10)     // Catch:{ all -> 0x00b0 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a) r7     // Catch:{ all -> 0x00b0 }
        L_0x005c:
            if (r7 == 0) goto L_0x0064
            java.lang.Object r7 = r7.mo46773i()     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)
            return r7
        L_0x0064:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00b0 }
            monitor-exit(r6)
            r0.L$0 = r5
            r0.L$1 = r10
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L_0x007a:
            androidx.compose.ui.text.platform.z r9 = r7.f40211d
            monitor-enter(r9)
            if (r10 != 0) goto L_0x008d
            androidx.compose.ui.text.caches.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r8 = r7.f40210c     // Catch:{ all -> 0x008b }
            java.lang.Object r7 = r7.f40208a     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r7 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a.m72842a(r7)     // Catch:{ all -> 0x008b }
            r8.mo46658n(r6, r7)     // Catch:{ all -> 0x008b }
            goto L_0x00aa
        L_0x008b:
            r6 = move-exception
            goto L_0x00ae
        L_0x008d:
            if (r8 == 0) goto L_0x009d
            androidx.compose.ui.text.caches.c<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r7.f40210c     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a.m72843b(r10)     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a.m72842a(r8)     // Catch:{ all -> 0x008b }
            r7.mo46658n(r6, r8)     // Catch:{ all -> 0x008b }
            goto L_0x00aa
        L_0x009d:
            androidx.compose.ui.text.caches.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r7 = r7.f40209b     // Catch:{ all -> 0x008b }
            java.lang.Object r8 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a.m72843b(r10)     // Catch:{ all -> 0x008b }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a.m72842a(r8)     // Catch:{ all -> 0x008b }
            r7.mo46632k(r6, r8)     // Catch:{ all -> 0x008b }
        L_0x00aa:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x008b }
            monitor-exit(r9)
            return r10
        L_0x00ae:
            monitor-exit(r9)
            throw r6
        L_0x00b0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AsyncTypefaceCache.mo46768g(androidx.compose.ui.text.font.t, androidx.compose.ui.text.font.o0, boolean, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46769h(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16238t r11, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.text.font.C16227o0 r12, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<? extends java.lang.Object> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "font"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "platformFontLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            androidx.compose.ui.text.platform.z r0 = r10.f40211d
            monitor-enter(r0)
            r1 = 1
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r2 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x005d }
            java.lang.Object r3 = r12.mo46755b()     // Catch:{ all -> 0x005d }
            r2.<init>(r11, r3)     // Catch:{ all -> 0x005d }
            androidx.compose.ui.text.caches.b r3 = r10.f40209b     // Catch:{ all -> 0x005d }
            java.lang.Object r3 = r3.mo46628g(r2)     // Catch:{ all -> 0x005d }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r3 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a) r3     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x0035
            androidx.compose.ui.text.caches.c r3 = r10.f40210c     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r3.mo46647e(r2)     // Catch:{ all -> 0x005d }
            r3 = r2
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r3 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a) r3     // Catch:{ all -> 0x005d }
        L_0x0035:
            if (r3 == 0) goto L_0x0044
            java.lang.Object r11 = r3.mo46773i()     // Catch:{ all -> 0x005d }
            r12 = 2
            kotlin.jvm.internal.C11322b0.m43481d(r12)
            monitor-exit(r0)
            kotlin.jvm.internal.C11322b0.m43480c(r12)
            return r11
        L_0x0044:
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x005d }
            kotlin.jvm.internal.C11322b0.m43481d(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.C11322b0.m43480c(r1)
            java.lang.Object r13 = r13.invoke()
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            m72837f(r3, r4, r5, r6, r7, r8, r9)
            return r13
        L_0x005d:
            r11 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r1)
            monitor-exit(r0)
            kotlin.jvm.internal.C11322b0.m43480c(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.AsyncTypefaceCache.mo46769h(androidx.compose.ui.text.font.t, androidx.compose.ui.text.font.o0, kotlin.jvm.functions.a):java.lang.Object");
    }
}
