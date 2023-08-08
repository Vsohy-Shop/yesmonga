package kotlin.p010io.path;

import java.nio.file.Path;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.sequences.C11561o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", mo22502f = "PathTreeWalk.kt", mo22503i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, mo22504l = {184, 190}, mo22505m = "invokeSuspend", mo22506n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/sequences/o;", "Ljava/nio/file/Path;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
/* renamed from: kotlin.io.path.PathTreeWalk$bfsIterator$1 */
public final class PathTreeWalk$bfsIterator$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super Path>, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PathTreeWalk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$bfsIterator$1(PathTreeWalk pathTreeWalk, C11045c<? super PathTreeWalk$bfsIterator$1> cVar) {
        super(2, cVar);
        this.this$0 = pathTreeWalk;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(this.this$0, cVar);
        pathTreeWalk$bfsIterator$1.L$0 = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super Path> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PathTreeWalk$bfsIterator$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0136 A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r14.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r4) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            java.lang.Object r1 = r14.L$2
            kotlin.io.path.i r1 = (kotlin.p010io.path.C11205i) r1
            java.lang.Object r5 = r14.L$1
            kotlin.collections.i r5 = (kotlin.collections.C10944i) r5
            java.lang.Object r6 = r14.L$0
            kotlin.sequences.o r6 = (kotlin.sequences.C11561o) r6
            kotlin.C11661u0.m45747n(r15)
            r15 = r14
            goto L_0x0082
        L_0x0020:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0028:
            java.lang.Object r1 = r14.L$5
            java.nio.file.Path r1 = com.fasterxml.jackson.databind.ext.C14969a.m64318a(r1)
            java.lang.Object r5 = r14.L$4
            kotlin.io.path.PathTreeWalk r5 = (kotlin.p010io.path.PathTreeWalk) r5
            java.lang.Object r6 = r14.L$3
            kotlin.io.path.y r6 = (kotlin.p010io.path.C11269y) r6
            java.lang.Object r7 = r14.L$2
            kotlin.io.path.i r7 = (kotlin.p010io.path.C11205i) r7
            java.lang.Object r8 = r14.L$1
            kotlin.collections.i r8 = (kotlin.collections.C10944i) r8
            java.lang.Object r9 = r14.L$0
            kotlin.sequences.o r9 = (kotlin.sequences.C11561o) r9
            kotlin.C11661u0.m45747n(r15)
            r15 = r14
            goto L_0x00d6
        L_0x0048:
            kotlin.C11661u0.m45747n(r15)
            java.lang.Object r15 = r14.L$0
            kotlin.sequences.o r15 = (kotlin.sequences.C11561o) r15
            kotlin.collections.i r1 = new kotlin.collections.i
            r1.<init>()
            kotlin.io.path.i r5 = new kotlin.io.path.i
            kotlin.io.path.PathTreeWalk r6 = r14.this$0
            boolean r6 = r6.mo22637i()
            r5.<init>(r6)
            kotlin.io.path.y r6 = new kotlin.io.path.y
            kotlin.io.path.PathTreeWalk r7 = r14.this$0
            java.nio.file.Path r7 = r7.f28375a
            kotlin.io.path.PathTreeWalk r8 = r14.this$0
            java.nio.file.Path r8 = r8.f28375a
            kotlin.io.path.PathTreeWalk r9 = r14.this$0
            java.nio.file.LinkOption[] r9 = r9.mo22639k()
            java.lang.Object r8 = kotlin.p010io.path.C11222m0.m43271b(r8, r9)
            r6.<init>(r7, r8, r3)
            r1.mo22308q(r6)
            r6 = r15
            r15 = r14
            r12 = r5
            r5 = r1
            r1 = r12
        L_0x0082:
            boolean r7 = r5.isEmpty()
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0136
            java.lang.Object r7 = r5.mo22306o0()
            kotlin.io.path.y r7 = (kotlin.p010io.path.C11269y) r7
            kotlin.io.path.PathTreeWalk r8 = r15.this$0
            java.nio.file.Path r9 = r7.mo22688d()
            java.nio.file.LinkOption[] r10 = r8.mo22639k()
            int r11 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
            java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
            int r11 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
            java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
            boolean r10 = java.nio.file.Files.isDirectory(r9, r10)
            if (r10 == 0) goto L_0x010c
            boolean r10 = kotlin.p010io.path.C11222m0.m43270a(r7)
            if (r10 != 0) goto L_0x0100
            boolean r10 = r8.mo22638j()
            if (r10 == 0) goto L_0x00de
            r15.L$0 = r6
            r15.L$1 = r5
            r15.L$2 = r1
            r15.L$3 = r7
            r15.L$4 = r8
            r15.L$5 = r9
            r15.label = r4
            java.lang.Object r10 = r6.mo23250b(r9, r15)
            if (r10 != r0) goto L_0x00ce
            return r0
        L_0x00ce:
            r12 = r7
            r7 = r1
            r1 = r9
            r9 = r6
            r6 = r12
            r13 = r8
            r8 = r5
            r5 = r13
        L_0x00d6:
            r12 = r9
            r9 = r1
            r1 = r7
            r7 = r6
            r6 = r12
            r13 = r8
            r8 = r5
            r5 = r13
        L_0x00de:
            java.nio.file.LinkOption[] r8 = r8.mo22639k()
            int r10 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
            java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
            int r10 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
            java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
            boolean r8 = java.nio.file.Files.isDirectory(r9, r8)
            if (r8 == 0) goto L_0x0082
            java.util.List r7 = r1.mo22657c(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            r5.addAll(r7)
            goto L_0x0082
        L_0x0100:
            kotlin.p010io.path.C11210j0.m43258a()
            java.lang.String r15 = r9.toString()
            java.nio.file.FileSystemLoopException r15 = kotlin.p010io.path.C11206i0.m43254a(r15)
            throw r15
        L_0x010c:
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r4]
            r8 = 0
            java.nio.file.LinkOption r10 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r7[r8] = r10
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = java.nio.file.Files.exists(r9, r7)
            if (r7 == 0) goto L_0x0082
            r15.L$0 = r6
            r15.L$1 = r5
            r15.L$2 = r1
            r15.L$3 = r3
            r15.L$4 = r3
            r15.L$5 = r3
            r15.label = r2
            java.lang.Object r7 = r6.mo23250b(r9, r15)
            if (r7 != r0) goto L_0x0082
            return r0
        L_0x0136:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.PathTreeWalk$bfsIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
