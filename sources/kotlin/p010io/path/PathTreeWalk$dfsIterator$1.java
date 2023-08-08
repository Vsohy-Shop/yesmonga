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

@C11067d(mo22501c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", mo22502f = "PathTreeWalk.kt", mo22503i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, mo22504l = {184, 190, 199, 205}, mo22505m = "invokeSuspend", mo22506n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/sequences/o;", "Ljava/nio/file/Path;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
/* renamed from: kotlin.io.path.PathTreeWalk$dfsIterator$1 */
public final class PathTreeWalk$dfsIterator$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super Path>, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PathTreeWalk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$dfsIterator$1(PathTreeWalk pathTreeWalk, C11045c<? super PathTreeWalk$dfsIterator$1> cVar) {
        super(2, cVar);
        this.this$0 = pathTreeWalk;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new PathTreeWalk$dfsIterator$1(this.this$0, cVar);
        pathTreeWalk$dfsIterator$1.L$0 = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super Path> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PathTreeWalk$dfsIterator$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: kotlin.sequences.o} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0221 A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0073
            if (r2 == r8) goto L_0x0054
            if (r2 == r6) goto L_0x0018
            if (r2 == r5) goto L_0x0031
            if (r2 != r4) goto L_0x0029
        L_0x0018:
            java.lang.Object r2 = r0.L$2
            kotlin.io.path.i r2 = (kotlin.p010io.path.C11205i) r2
            java.lang.Object r6 = r0.L$1
            kotlin.collections.i r6 = (kotlin.collections.C10944i) r6
            java.lang.Object r9 = r0.L$0
            kotlin.sequences.o r9 = (kotlin.sequences.C11561o) r9
            kotlin.C11661u0.m45747n(r19)
            goto L_0x0147
        L_0x0029:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0031:
            java.lang.Object r2 = r0.L$5
            java.nio.file.Path r2 = com.fasterxml.jackson.databind.ext.C14969a.m64318a(r2)
            java.lang.Object r6 = r0.L$4
            kotlin.io.path.PathTreeWalk r6 = (kotlin.p010io.path.PathTreeWalk) r6
            java.lang.Object r9 = r0.L$3
            kotlin.io.path.y r9 = (kotlin.p010io.path.C11269y) r9
            java.lang.Object r10 = r0.L$2
            kotlin.io.path.i r10 = (kotlin.p010io.path.C11205i) r10
            java.lang.Object r11 = r0.L$1
            kotlin.collections.i r11 = (kotlin.collections.C10944i) r11
            java.lang.Object r12 = r0.L$0
            kotlin.sequences.o r12 = (kotlin.sequences.C11561o) r12
            kotlin.C11661u0.m45747n(r19)
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r0
            goto L_0x01b3
        L_0x0054:
            java.lang.Object r2 = r0.L$5
            java.nio.file.Path r2 = com.fasterxml.jackson.databind.ext.C14969a.m64318a(r2)
            java.lang.Object r6 = r0.L$4
            kotlin.io.path.PathTreeWalk r6 = (kotlin.p010io.path.PathTreeWalk) r6
            java.lang.Object r9 = r0.L$3
            kotlin.io.path.y r9 = (kotlin.p010io.path.C11269y) r9
            java.lang.Object r10 = r0.L$2
            kotlin.io.path.i r10 = (kotlin.p010io.path.C11205i) r10
            java.lang.Object r11 = r0.L$1
            kotlin.collections.i r11 = (kotlin.collections.C10944i) r11
            java.lang.Object r12 = r0.L$0
            kotlin.sequences.o r12 = (kotlin.sequences.C11561o) r12
            kotlin.C11661u0.m45747n(r19)
            goto L_0x00ea
        L_0x0073:
            kotlin.C11661u0.m45747n(r19)
            java.lang.Object r2 = r0.L$0
            r9 = r2
            kotlin.sequences.o r9 = (kotlin.sequences.C11561o) r9
            kotlin.collections.i r2 = new kotlin.collections.i
            r2.<init>()
            kotlin.io.path.i r10 = new kotlin.io.path.i
            kotlin.io.path.PathTreeWalk r11 = r0.this$0
            boolean r11 = r11.mo22637i()
            r10.<init>(r11)
            kotlin.io.path.y r11 = new kotlin.io.path.y
            kotlin.io.path.PathTreeWalk r12 = r0.this$0
            java.nio.file.Path r12 = r12.f28375a
            kotlin.io.path.PathTreeWalk r13 = r0.this$0
            java.nio.file.Path r13 = r13.f28375a
            kotlin.io.path.PathTreeWalk r14 = r0.this$0
            java.nio.file.LinkOption[] r14 = r14.mo22639k()
            java.lang.Object r13 = kotlin.p010io.path.C11222m0.m43273d(r13, r14)
            r11.<init>(r12, r13, r7)
            kotlin.io.path.PathTreeWalk r12 = r0.this$0
            java.nio.file.Path r13 = r11.mo22688d()
            java.nio.file.LinkOption[] r14 = r12.mo22639k()
            int r15 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
            int r15 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
            boolean r14 = java.nio.file.Files.isDirectory(r13, r14)
            if (r14 == 0) goto L_0x0122
            boolean r6 = kotlin.p010io.path.C11222m0.m43272c(r11)
            if (r6 != 0) goto L_0x0116
            boolean r6 = r12.mo22638j()
            if (r6 == 0) goto L_0x00ef
            r0.L$0 = r9
            r0.L$1 = r2
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r12
            r0.L$5 = r13
            r0.label = r8
            java.lang.Object r6 = r9.mo23250b(r13, r0)
            if (r6 != r1) goto L_0x00e5
            return r1
        L_0x00e5:
            r6 = r12
            r12 = r9
            r9 = r11
            r11 = r2
            r2 = r13
        L_0x00ea:
            r13 = r2
            r2 = r11
            r11 = r9
            r9 = r12
            r12 = r6
        L_0x00ef:
            java.nio.file.LinkOption[] r6 = r12.mo22639k()
            int r12 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)
            java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
            int r12 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)
            java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
            boolean r6 = java.nio.file.Files.isDirectory(r13, r6)
            if (r6 == 0) goto L_0x0145
            java.util.List r6 = r10.mo22657c(r11)
            java.util.Iterator r6 = r6.iterator()
            r11.mo22689e(r6)
            r2.mo22308q(r11)
            goto L_0x0145
        L_0x0116:
            kotlin.p010io.path.C11210j0.m43258a()
            java.lang.String r1 = r13.toString()
            java.nio.file.FileSystemLoopException r1 = kotlin.p010io.path.C11206i0.m43254a(r1)
            throw r1
        L_0x0122:
            java.nio.file.LinkOption[] r11 = new java.nio.file.LinkOption[r8]
            java.nio.file.LinkOption r12 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r11[r3] = r12
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r8)
            java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
            boolean r11 = java.nio.file.Files.exists(r13, r11)
            if (r11 == 0) goto L_0x0145
            r0.L$0 = r9
            r0.L$1 = r2
            r0.L$2 = r10
            r0.label = r6
            java.lang.Object r6 = r9.mo23250b(r13, r0)
            if (r6 != r1) goto L_0x0145
            return r1
        L_0x0145:
            r6 = r2
            r2 = r10
        L_0x0147:
            r10 = r0
        L_0x0148:
            boolean r11 = r6.isEmpty()
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x0221
            java.lang.Object r11 = r6.last()
            kotlin.io.path.y r11 = (kotlin.p010io.path.C11269y) r11
            java.util.Iterator r11 = r11.mo22685a()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x021c
            java.lang.Object r11 = r11.next()
            kotlin.io.path.y r11 = (kotlin.p010io.path.C11269y) r11
            kotlin.io.path.PathTreeWalk r12 = r10.this$0
            java.nio.file.Path r13 = r11.mo22688d()
            java.nio.file.LinkOption[] r14 = r12.mo22639k()
            int r15 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
            int r15 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
            boolean r14 = java.nio.file.Files.isDirectory(r13, r14)
            if (r14 == 0) goto L_0x01f3
            boolean r14 = kotlin.p010io.path.C11222m0.m43272c(r11)
            if (r14 != 0) goto L_0x01e7
            boolean r14 = r12.mo22638j()
            if (r14 == 0) goto L_0x01bf
            r10.L$0 = r9
            r10.L$1 = r6
            r10.L$2 = r2
            r10.L$3 = r11
            r10.L$4 = r12
            r10.L$5 = r13
            r10.label = r5
            java.lang.Object r14 = r9.mo23250b(r13, r10)
            if (r14 != r1) goto L_0x01a7
            return r1
        L_0x01a7:
            r16 = r11
            r11 = r2
            r2 = r13
            r13 = r9
            r9 = r16
            r17 = r12
            r12 = r6
            r6 = r17
        L_0x01b3:
            r16 = r13
            r13 = r2
            r2 = r11
            r11 = r9
            r9 = r16
            r17 = r12
            r12 = r6
            r6 = r17
        L_0x01bf:
            java.nio.file.LinkOption[] r12 = r12.mo22639k()
            int r14 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r14)
            java.nio.file.LinkOption[] r12 = (java.nio.file.LinkOption[]) r12
            int r14 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r14)
            java.nio.file.LinkOption[] r12 = (java.nio.file.LinkOption[]) r12
            boolean r12 = java.nio.file.Files.isDirectory(r13, r12)
            if (r12 == 0) goto L_0x0148
            java.util.List r12 = r2.mo22657c(r11)
            java.util.Iterator r12 = r12.iterator()
            r11.mo22689e(r12)
            r6.mo22308q(r11)
            goto L_0x0148
        L_0x01e7:
            kotlin.p010io.path.C11210j0.m43258a()
            java.lang.String r1 = r13.toString()
            java.nio.file.FileSystemLoopException r1 = kotlin.p010io.path.C11206i0.m43254a(r1)
            throw r1
        L_0x01f3:
            java.nio.file.LinkOption[] r11 = new java.nio.file.LinkOption[r8]
            java.nio.file.LinkOption r12 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r11[r3] = r12
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r8)
            java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
            boolean r11 = java.nio.file.Files.exists(r13, r11)
            if (r11 == 0) goto L_0x0148
            r10.L$0 = r9
            r10.L$1 = r6
            r10.L$2 = r2
            r10.L$3 = r7
            r10.L$4 = r7
            r10.L$5 = r7
            r10.label = r4
            java.lang.Object r11 = r9.mo23250b(r13, r10)
            if (r11 != r1) goto L_0x0148
            return r1
        L_0x021c:
            r6.mo22310r0()
            goto L_0x0148
        L_0x0221:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.PathTreeWalk$dfsIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
