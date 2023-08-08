package androidx.compose.foundation.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.PointerEventPass;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", mo22502f = "PointerMoveDetector.kt", mo22503i = {}, mo22504l = {41}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,57:1\n329#2:58\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:58\n*E\n"})
public final class PointerMoveDetectorKt$detectMoves$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C15094f, C11079d2> $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ C15472e0 $this_detectMoves;
    int label;

    @C11067d(mo22501c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", mo22502f = "PointerMoveDetector.kt", mo22503i = {0, 0}, mo22504l = {44}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitPointerEventScope", "previousPosition"}, mo22507s = {"L$0", "L$1"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1 */
    public static final class C27261 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C27261 r0 = new C27261(context, pointerEventPass, lVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
            return ((C27261) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r1 = r9.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r9.L$0
                androidx.compose.ui.input.pointer.c r3 = (androidx.compose.p004ui.input.pointer.C15465c) r3
                kotlin.C11661u0.m45747n(r10)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L_0x004e
            L_0x001b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0023:
                kotlin.C11661u0.m45747n(r10)
                java.lang.Object r10 = r9.L$0
                androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p004ui.input.pointer.C15465c) r10
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                r3 = r10
                r10 = r9
            L_0x0031:
                kotlin.coroutines.CoroutineContext r4 = r8
                boolean r4 = kotlinx.coroutines.C11804f2.m46952C(r4)
                if (r4 == 0) goto L_0x00b3
                androidx.compose.ui.input.pointer.PointerEventPass r4 = r4
                r10.L$0 = r3
                r10.L$1 = r1
                r10.label = r2
                java.lang.Object r4 = r3.mo44003i3(r4, r10)
                if (r4 != r0) goto L_0x0048
                return r0
            L_0x0048:
                r8 = r0
                r0 = r10
                r10 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L_0x004e:
                androidx.compose.ui.input.pointer.o r10 = (androidx.compose.p004ui.input.pointer.C15491o) r10
                int r5 = r10.mo44114i()
                androidx.compose.ui.input.pointer.q$a r6 = androidx.compose.p004ui.input.pointer.C15493q.f38527b
                int r7 = r6.mo44122c()
                boolean r7 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r5, r7)
                if (r7 == 0) goto L_0x0062
                r7 = r2
                goto L_0x006a
            L_0x0062:
                int r7 = r6.mo44120a()
                boolean r7 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r5, r7)
            L_0x006a:
                if (r7 == 0) goto L_0x006e
                r5 = r2
                goto L_0x0076
            L_0x006e:
                int r6 = r6.mo44121b()
                boolean r5 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r5, r6)
            L_0x0076:
                if (r5 == 0) goto L_0x00ad
                java.util.List r10 = r10.mo44110e()
                java.lang.Object r10 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r10)
                androidx.compose.ui.input.pointer.w r10 = (androidx.compose.p004ui.input.pointer.C15507w) r10
                long r5 = r10.mo44177q()
                androidx.compose.ui.geometry.f r10 = androidx.compose.p004ui.geometry.C15094f.m64868d(r5)
                long r5 = r10.mo42242A()
                T r7 = r3.element
                boolean r5 = androidx.compose.p004ui.geometry.C15094f.m64875k(r5, r7)
                if (r5 != 0) goto L_0x0097
                goto L_0x0098
            L_0x0097:
                r10 = 0
            L_0x0098:
                if (r10 == 0) goto L_0x00ad
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r5 = r5
                long r6 = r10.mo42242A()
                androidx.compose.ui.geometry.f r10 = androidx.compose.p004ui.geometry.C15094f.m64868d(r6)
                r3.element = r10
                androidx.compose.ui.geometry.f r10 = androidx.compose.p004ui.geometry.C15094f.m64868d(r6)
                r5.invoke(r10)
            L_0x00ad:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L_0x0031
            L_0x00b3:
                kotlin.d2 r10 = kotlin.C11079d2.f28267a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.C27261.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerMoveDetectorKt$detectMoves$2(C15472e0 e0Var, PointerEventPass pointerEventPass, C11300l<? super C15094f, C11079d2> lVar, C11045c<? super PointerMoveDetectorKt$detectMoves$2> cVar) {
        super(2, cVar);
        this.$this_detectMoves = e0Var;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final CoroutineContext context = getContext();
            C15472e0 e0Var = this.$this_detectMoves;
            final PointerEventPass pointerEventPass = this.$pointerEventPass;
            final C11300l<C15094f, C11079d2> lVar = this.$onMove;
            C27261 r3 = new C27261((C11045c<? super C27261>) null);
            this.label = 1;
            if (e0Var.mo43994R0(r3, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
