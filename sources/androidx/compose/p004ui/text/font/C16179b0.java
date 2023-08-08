package androidx.compose.p004ui.text.font;

import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n416#2:428\n417#2,9:430\n416#2:439\n417#2,7:441\n424#2,2:449\n24#3:429\n24#3:440\n1#4:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n185#1:428\n185#1:430,9\n201#1:439\n201#1:441,7\n201#1:449,2\n185#1:429\n201#1:440\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.b0 */
public final class C16179b0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: androidx.compose.ui.text.font.AsyncTypefaceCache$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Pair<java.util.List<androidx.compose.p004ui.text.font.C16238t>, java.lang.Object> m72908b(java.util.List<? extends androidx.compose.p004ui.text.font.C16238t> r16, androidx.compose.p004ui.text.font.C16214j1 r17, androidx.compose.p004ui.text.font.AsyncTypefaceCache r18, androidx.compose.p004ui.text.font.C16227o0 r19, kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.text.font.C16214j1, ? extends java.lang.Object> r20) {
        /*
            r8 = r19
            int r9 = r16.size()
            r10 = 0
            r11 = 0
            r13 = r10
            r12 = r11
        L_0x000a:
            if (r12 >= r9) goto L_0x0198
            r14 = r16
            java.lang.Object r0 = r14.get(r12)
            r15 = r0
            androidx.compose.ui.text.font.t r15 = (androidx.compose.p004ui.text.font.C16238t) r15
            int r0 = r15.mo46868a()
            androidx.compose.ui.text.font.c0$a r1 = androidx.compose.p004ui.text.font.C16182c0.f40243b
            int r2 = r1.mo46866b()
            boolean r2 = androidx.compose.p004ui.text.font.C16182c0.m72919g(r0, r2)
            if (r2 == 0) goto L_0x00b0
            androidx.compose.ui.text.platform.z r1 = r18.f40211d
            monitor-enter(r1)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r19.mo46755b()     // Catch:{ all -> 0x00ad }
            r0.<init>(r15, r2)     // Catch:{ all -> 0x00ad }
            androidx.compose.ui.text.caches.b r2 = r18.f40209b     // Catch:{ all -> 0x00ad }
            java.lang.Object r2 = r2.mo46628g(r0)     // Catch:{ all -> 0x00ad }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a) r2     // Catch:{ all -> 0x00ad }
            if (r2 != 0) goto L_0x004a
            androidx.compose.ui.text.caches.c r2 = r18.f40210c     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r2.mo46647e(r0)     // Catch:{ all -> 0x00ad }
            r2 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a) r2     // Catch:{ all -> 0x00ad }
        L_0x004a:
            if (r2 == 0) goto L_0x0052
            java.lang.Object r0 = r2.mo46773i()     // Catch:{ all -> 0x00ad }
            monitor-exit(r1)
            goto L_0x0066
        L_0x0052:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x00ad }
            monitor-exit(r1)
            java.lang.Object r0 = r8.mo46754a(r15)     // Catch:{ Exception -> 0x0094 }
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r18
            r2 = r15
            r3 = r19
            r4 = r0
            androidx.compose.p004ui.text.font.AsyncTypefaceCache.m72837f(r1, r2, r3, r4, r5, r6, r7)
        L_0x0066:
            if (r0 == 0) goto L_0x007d
            int r1 = r17.mo46971j()
            androidx.compose.ui.text.font.i0 r2 = r17.mo46972k()
            int r3 = r17.mo46970i()
            java.lang.Object r0 = androidx.compose.p004ui.text.font.C16198g0.m72983a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r13, r0)
            return r0
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load font "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0094:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to load font "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2, r1)
            throw r0
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00b0:
            int r2 = r1.mo46867c()
            boolean r2 = androidx.compose.p004ui.text.font.C16182c0.m72919g(r0, r2)
            if (r2 == 0) goto L_0x0131
            androidx.compose.ui.text.platform.z r1 = r18.f40211d
            monitor-enter(r1)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b     // Catch:{ all -> 0x012e }
            java.lang.Object r2 = r19.mo46755b()     // Catch:{ all -> 0x012e }
            r0.<init>(r15, r2)     // Catch:{ all -> 0x012e }
            androidx.compose.ui.text.caches.b r2 = r18.f40209b     // Catch:{ all -> 0x012e }
            java.lang.Object r2 = r2.mo46628g(r0)     // Catch:{ all -> 0x012e }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a) r2     // Catch:{ all -> 0x012e }
            if (r2 != 0) goto L_0x00df
            androidx.compose.ui.text.caches.c r2 = r18.f40210c     // Catch:{ all -> 0x012e }
            java.lang.Object r0 = r2.mo46647e(r0)     // Catch:{ all -> 0x012e }
            r2 = r0
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r2 = (androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a) r2     // Catch:{ all -> 0x012e }
        L_0x00df:
            if (r2 == 0) goto L_0x00e7
            java.lang.Object r0 = r2.mo46773i()     // Catch:{ all -> 0x012e }
            monitor-exit(r1)
            goto L_0x0114
        L_0x00e7:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x012e }
            monitor-exit(r1)
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = r8.mo46754a(r15)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x0100
        L_0x00f5:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.f28060a
            java.lang.Object r0 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
        L_0x0100:
            boolean r1 = kotlin.Result.m38709i(r0)
            if (r1 == 0) goto L_0x0107
            r0 = r10
        L_0x0107:
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r18
            r2 = r15
            r3 = r19
            r4 = r0
            androidx.compose.p004ui.text.font.AsyncTypefaceCache.m72837f(r1, r2, r3, r4, r5, r6, r7)
        L_0x0114:
            if (r0 == 0) goto L_0x012b
            int r1 = r17.mo46971j()
            androidx.compose.ui.text.font.i0 r2 = r17.mo46972k()
            int r3 = r17.mo46970i()
            java.lang.Object r0 = androidx.compose.p004ui.text.font.C16198g0.m72983a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r13, r0)
            return r0
        L_0x012b:
            r1 = r18
            goto L_0x017d
        L_0x012e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0131:
            int r1 = r1.mo46865a()
            boolean r0 = androidx.compose.p004ui.text.font.C16182c0.m72919g(r0, r1)
            if (r0 == 0) goto L_0x0181
            r1 = r18
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r0 = r1.mo46766d(r15, r8)
            if (r0 != 0) goto L_0x0153
            if (r13 != 0) goto L_0x014f
            r0 = 1
            androidx.compose.ui.text.font.t[] r0 = new androidx.compose.p004ui.text.font.C16238t[r0]
            r0[r11] = r15
            java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.m40452P(r0)
            goto L_0x017d
        L_0x014f:
            r13.add(r15)
            goto L_0x017d
        L_0x0153:
            java.lang.Object r2 = r0.mo46773i()
            boolean r2 = androidx.compose.p004ui.text.font.AsyncTypefaceCache.C16167a.m72847g(r2)
            if (r2 == 0) goto L_0x015e
            goto L_0x017d
        L_0x015e:
            java.lang.Object r2 = r0.mo46773i()
            if (r2 == 0) goto L_0x017d
            int r1 = r17.mo46971j()
            java.lang.Object r0 = r0.mo46773i()
            androidx.compose.ui.text.font.i0 r2 = r17.mo46972k()
            int r3 = r17.mo46970i()
            java.lang.Object r0 = androidx.compose.p004ui.text.font.C16198g0.m72983a(r1, r0, r15, r2, r3)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r13, r0)
            return r0
        L_0x017d:
            int r12 = r12 + 1
            goto L_0x000a
        L_0x0181:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown font type "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0198:
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r2.invoke(r1)
            kotlin.Pair r0 = kotlin.C11078d1.m42659a(r13, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.font.C16179b0.m72908b(java.util.List, androidx.compose.ui.text.font.j1, androidx.compose.ui.text.font.AsyncTypefaceCache, androidx.compose.ui.text.font.o0, kotlin.jvm.functions.l):kotlin.Pair");
    }
}
