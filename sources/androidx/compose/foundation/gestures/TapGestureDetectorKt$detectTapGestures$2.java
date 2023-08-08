package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", mo22502f = "TapGestureDetector.kt", mo22503i = {}, mo22504l = {99}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C15094f, C11079d2> $onDoubleTap;
    final /* synthetic */ C11300l<C15094f, C11079d2> $onLongPress;
    final /* synthetic */ C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> $onPress;
    final /* synthetic */ C11300l<C15094f, C11079d2> $onTap;
    final /* synthetic */ C15472e0 $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", mo22502f = "TapGestureDetector.kt", mo22503i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, mo22504l = {100, 114, 129, 141, 156, 178}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, mo22507s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1 */
    public static final class C21631 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C21631 r0 = new C21631(o0Var, qVar, lVar, lVar2, lVar3, pressGestureScopeImpl, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
            return ((C21631) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: androidx.compose.ui.input.pointer.c} */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
            r4 = (androidx.compose.p004ui.input.pointer.C15507w) r0;
            r4.mo44168a();
            r9 = r4;
            r0 = r9;
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21641((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21641>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
            if (r5 == androidx.compose.foundation.gestures.TapGestureDetectorKt.f5912a) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b0, code lost:
            r9 = r4;
            r0 = r5;
            r1 = r9;
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21662((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21662>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
            if (r6 == null) goto L_0x00cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
            r0 = r5.getViewConfiguration().mo44720c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
            r0 = 4611686018427387903L;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
            r2 = new kotlin.jvm.internal.Ref.ObjectRef();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21673((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21673>) null);
            r6.L$0 = r5;
            r6.L$1 = r4;
            r6.L$2 = r2;
            r6.L$3 = r2;
            r6.J$0 = r0;
            r6.label = 2;
            r3 = r5.mo44006u2(r0, r3, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
            if (r3 != r7) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f1, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f2, code lost:
            r9 = r5;
            r5 = r4;
            r4 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            r2.element = r3;
            r2 = r4.element;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
            if (r2 != null) goto L_0x010c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
            r10 = r4;
            r2 = r9;
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r10, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21684((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21684>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x010c, code lost:
            r2.mo44168a();
            r10 = r4;
            r2 = r9;
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r10, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21695((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21695>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0122, code lost:
            r2 = r4;
            r4 = r5;
            r3 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0129, code lost:
            r5.invoke(androidx.compose.p004ui.geometry.C15094f.m64868d(r4.mo44177q()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0147, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0160, code lost:
            if (r7 == null) goto L_0x0162;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0162, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0164, code lost:
            if (r0 != null) goto L_0x0166;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0166, code lost:
            r0.invoke(androidx.compose.p004ui.geometry.C15094f.m64868d(r2.mo44177q()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0175, code lost:
            r6.L$0 = r9;
            r6.L$1 = r4;
            r6.L$2 = null;
            r6.L$3 = null;
            r6.J$0 = r0;
            r6.label = 4;
            r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9441h(r9, r2, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0188, code lost:
            if (r2 == r7) goto L_0x018a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x018a, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x018b, code lost:
            r3 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x018c, code lost:
            r2 = (androidx.compose.p004ui.input.pointer.C15507w) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x018e, code lost:
            if (r2 == null) goto L_0x0190;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0190, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0192, code lost:
            if (r0 != null) goto L_0x0194;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0194, code lost:
            r0.invoke(androidx.compose.p004ui.geometry.C15094f.m64868d(r4.element.mo44177q()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a5, code lost:
            r9 = r4;
            r5 = r9;
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21717((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21717>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bb, code lost:
            if (r5 != androidx.compose.foundation.gestures.TapGestureDetectorKt.f5912a) goto L_0x01bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bd, code lost:
            r10 = r4;
            r5 = r5;
            r9 = r9;
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r10, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21728((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21728>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            r10 = r4;
            r11 = r7;
            r12 = r8;
            r14 = r9;
            r13 = r4;
            r9 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21739((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C21739>) null);
            r6.L$0 = r3;
            r6.L$1 = r4;
            r6.L$2 = r2;
            r6.label = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ec, code lost:
            if (r3.mo44006u2(r0, r9, r6) == r7) goto L_0x01ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ee, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ef, code lost:
            r0 = r2;
            r2 = r3;
            r1 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f2, code lost:
            r3 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f4, code lost:
            if (r3 != null) goto L_0x01f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f6, code lost:
            r3.invoke(androidx.compose.p004ui.geometry.C15094f.m64868d(r1.element.mo44177q()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0205, code lost:
            r1 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0207, code lost:
            if (r1 != null) goto L_0x0209;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0209, code lost:
            r1.invoke(androidx.compose.p004ui.geometry.C15094f.m64868d(r0.mo44177q()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0214, code lost:
            r6.L$0 = null;
            r6.L$1 = null;
            r6.L$2 = null;
            r6.label = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0221, code lost:
            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.m9442i(r2, r6) == r7) goto L_0x0223;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0223, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0224, code lost:
            r9 = r4;
            r0 = r9;
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C216510((kotlin.coroutines.C11045c<? super androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.C216510>) null), 3, (java.lang.Object) null);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0147 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x015e  */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r17) {
            /*
                r16 = this;
                r6 = r16
                java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r0 = r6.label
                r8 = 0
                switch(r0) {
                    case 0: goto L_0x0076;
                    case 1: goto L_0x006b;
                    case 2: goto L_0x004b;
                    case 3: goto L_0x003c;
                    case 4: goto L_0x002a;
                    case 5: goto L_0x0019;
                    case 6: goto L_0x0014;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0014:
                kotlin.C11661u0.m45747n(r17)
                goto L_0x0224
            L_0x0019:
                java.lang.Object r0 = r6.L$2
                androidx.compose.ui.input.pointer.w r0 = (androidx.compose.p004ui.input.pointer.C15507w) r0
                java.lang.Object r1 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r2 = r6.L$0
                androidx.compose.ui.input.pointer.c r2 = (androidx.compose.p004ui.input.pointer.C15465c) r2
                kotlin.C11661u0.m45747n(r17)     // Catch:{ PointerEventTimeoutCancellationException -> 0x01f2 }
                goto L_0x0234
            L_0x002a:
                long r0 = r6.J$0
                java.lang.Object r2 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
                java.lang.Object r3 = r6.L$0
                androidx.compose.ui.input.pointer.c r3 = (androidx.compose.p004ui.input.pointer.C15465c) r3
                kotlin.C11661u0.m45747n(r17)
                r4 = r2
                r2 = r17
                goto L_0x018c
            L_0x003c:
                long r0 = r6.J$0
                java.lang.Object r2 = r6.L$1
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
                java.lang.Object r3 = r6.L$0
                androidx.compose.ui.input.pointer.c r3 = (androidx.compose.p004ui.input.pointer.C15465c) r3
                kotlin.C11661u0.m45747n(r17)
                goto L_0x0148
            L_0x004b:
                long r0 = r6.J$0
                java.lang.Object r2 = r6.L$3
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
                java.lang.Object r3 = r6.L$2
                kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
                java.lang.Object r4 = r6.L$1
                androidx.compose.ui.input.pointer.w r4 = (androidx.compose.p004ui.input.pointer.C15507w) r4
                java.lang.Object r5 = r6.L$0
                androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p004ui.input.pointer.C15465c) r5
                kotlin.C11661u0.m45747n(r17)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0067 }
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r17
                goto L_0x00f5
            L_0x0067:
                r2 = r3
            L_0x0068:
                r3 = r5
                goto L_0x0125
            L_0x006b:
                java.lang.Object r0 = r6.L$0
                androidx.compose.ui.input.pointer.c r0 = (androidx.compose.p004ui.input.pointer.C15465c) r0
                kotlin.C11661u0.m45747n(r17)
                r5 = r0
                r0 = r17
                goto L_0x0092
            L_0x0076:
                kotlin.C11661u0.m45747n(r17)
                java.lang.Object r0 = r6.L$0
                r9 = r0
                androidx.compose.ui.input.pointer.c r9 = (androidx.compose.p004ui.input.pointer.C15465c) r9
                r1 = 0
                r2 = 0
                r4 = 3
                r5 = 0
                r6.L$0 = r9
                r0 = 1
                r6.label = r0
                r0 = r9
                r3 = r16
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x0091
                return r7
            L_0x0091:
                r5 = r9
            L_0x0092:
                r4 = r0
                androidx.compose.ui.input.pointer.w r4 = (androidx.compose.p004ui.input.pointer.C15507w) r4
                r4.mo44168a()
                kotlinx.coroutines.o0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r12.<init>(r0, r8)
                r13 = 3
                r14 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
                kotlin.jvm.functions.q<androidx.compose.foundation.gestures.j, androidx.compose.ui.geometry.f, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r0 = r5
                kotlin.jvm.functions.q r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f5912a
                if (r0 == r1) goto L_0x00c2
                kotlinx.coroutines.o0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2
                kotlin.jvm.functions.q<androidx.compose.foundation.gestures.j, androidx.compose.ui.geometry.f, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r0 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r9
                r12.<init>(r0, r1, r4, r8)
                r13 = 3
                r14 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
            L_0x00c2:
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r0 = r6
                if (r0 == 0) goto L_0x00cf
                androidx.compose.ui.platform.c4 r0 = r5.getViewConfiguration()
                long r0 = r0.mo44720c()
                goto L_0x00d4
            L_0x00cf:
                r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            L_0x00d4:
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r3.<init>(r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.L$0 = r5     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.L$1 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.L$2 = r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.L$3 = r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r6.J$0 = r0     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                r9 = 2
                r6.label = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                java.lang.Object r3 = r5.mo44006u2(r0, r3, r6)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0068 }
                if (r3 != r7) goto L_0x00f2
                return r7
            L_0x00f2:
                r9 = r5
                r5 = r4
                r4 = r2
            L_0x00f5:
                r2.element = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                T r2 = r4.element     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                if (r2 != 0) goto L_0x010c
                kotlinx.coroutines.o0 r10 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r11 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r13.<init>(r2, r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r14 = 3
                r15 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r10, r11, r12, r13, r14, r15)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                goto L_0x015a
            L_0x010c:
                androidx.compose.ui.input.pointer.w r2 = (androidx.compose.p004ui.input.pointer.C15507w) r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r2.mo44168a()     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                kotlinx.coroutines.o0 r10 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r11 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r13.<init>(r2, r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                r14 = 3
                r15 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r10, r11, r12, r13, r14, r15)     // Catch:{ PointerEventTimeoutCancellationException -> 0x0122 }
                goto L_0x015a
            L_0x0122:
                r2 = r4
                r4 = r5
                r3 = r9
            L_0x0125:
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r5 = r6
                if (r5 == 0) goto L_0x0134
                long r9 = r4.mo44177q()
                androidx.compose.ui.geometry.f r4 = androidx.compose.p004ui.geometry.C15094f.m64868d(r9)
                r5.invoke(r4)
            L_0x0134:
                r6.L$0 = r3
                r6.L$1 = r2
                r6.L$2 = r8
                r6.L$3 = r8
                r6.J$0 = r0
                r4 = 3
                r6.label = r4
                java.lang.Object r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9442i(r3, r6)
                if (r4 != r7) goto L_0x0148
                return r7
            L_0x0148:
                kotlinx.coroutines.o0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6
                androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r9
                r12.<init>(r4, r8)
                r13 = 3
                r14 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
                r4 = r2
                r9 = r3
            L_0x015a:
                T r2 = r4.element
                if (r2 == 0) goto L_0x0234
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r3 = r7
                if (r3 != 0) goto L_0x0175
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r0 = r8
                if (r0 == 0) goto L_0x0234
                androidx.compose.ui.input.pointer.w r2 = (androidx.compose.p004ui.input.pointer.C15507w) r2
                long r1 = r2.mo44177q()
                androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r1)
                r0.invoke(r1)
                goto L_0x0234
            L_0x0175:
                androidx.compose.ui.input.pointer.w r2 = (androidx.compose.p004ui.input.pointer.C15507w) r2
                r6.L$0 = r9
                r6.L$1 = r4
                r6.L$2 = r8
                r6.L$3 = r8
                r6.J$0 = r0
                r3 = 4
                r6.label = r3
                java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9441h(r9, r2, r6)
                if (r2 != r7) goto L_0x018b
                return r7
            L_0x018b:
                r3 = r9
            L_0x018c:
                androidx.compose.ui.input.pointer.w r2 = (androidx.compose.p004ui.input.pointer.C15507w) r2
                if (r2 != 0) goto L_0x01a5
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r0 = r8
                if (r0 == 0) goto L_0x0234
                T r1 = r4.element
                androidx.compose.ui.input.pointer.w r1 = (androidx.compose.p004ui.input.pointer.C15507w) r1
                long r1 = r1.mo44177q()
                androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r1)
                r0.invoke(r1)
                goto L_0x0234
            L_0x01a5:
                kotlinx.coroutines.o0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7
                androidx.compose.foundation.gestures.PressGestureScopeImpl r5 = r9
                r12.<init>(r5, r8)
                r13 = 3
                r14 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
                kotlin.jvm.functions.q<androidx.compose.foundation.gestures.j, androidx.compose.ui.geometry.f, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r5 = r5
                kotlin.jvm.functions.q r9 = androidx.compose.foundation.gestures.TapGestureDetectorKt.f5912a
                if (r5 == r9) goto L_0x01cf
                kotlinx.coroutines.o0 r10 = r4
                r11 = 0
                r12 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8 r13 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8
                kotlin.jvm.functions.q<androidx.compose.foundation.gestures.j, androidx.compose.ui.geometry.f, kotlin.coroutines.c<? super kotlin.d2>, java.lang.Object> r5 = r5
                androidx.compose.foundation.gestures.PressGestureScopeImpl r9 = r9
                r13.<init>(r5, r9, r2, r8)
                r14 = 3
                r15 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r10, r11, r12, r13, r14, r15)
            L_0x01cf:
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9 r5 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                kotlinx.coroutines.o0 r10 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r11 = r7     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r12 = r8     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                androidx.compose.foundation.gestures.PressGestureScopeImpl r14 = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r15 = 0
                r9 = r5
                r13 = r4
                r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r6.L$0 = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r6.L$1 = r4     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r6.L$2 = r2     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                r9 = 5
                r6.label = r9     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                java.lang.Object r0 = r3.mo44006u2(r0, r5, r6)     // Catch:{ PointerEventTimeoutCancellationException -> 0x01ef }
                if (r0 != r7) goto L_0x0234
                return r7
            L_0x01ef:
                r0 = r2
                r2 = r3
                r1 = r4
            L_0x01f2:
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r3 = r8
                if (r3 == 0) goto L_0x0205
                T r1 = r1.element
                androidx.compose.ui.input.pointer.w r1 = (androidx.compose.p004ui.input.pointer.C15507w) r1
                long r4 = r1.mo44177q()
                androidx.compose.ui.geometry.f r1 = androidx.compose.p004ui.geometry.C15094f.m64868d(r4)
                r3.invoke(r1)
            L_0x0205:
                kotlin.jvm.functions.l<androidx.compose.ui.geometry.f, kotlin.d2> r1 = r6
                if (r1 == 0) goto L_0x0214
                long r3 = r0.mo44177q()
                androidx.compose.ui.geometry.f r0 = androidx.compose.p004ui.geometry.C15094f.m64868d(r3)
                r1.invoke(r0)
            L_0x0214:
                r6.L$0 = r8
                r6.L$1 = r8
                r6.L$2 = r8
                r0 = 6
                r6.label = r0
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9442i(r2, r6)
                if (r0 != r7) goto L_0x0224
                return r7
            L_0x0224:
                kotlinx.coroutines.o0 r9 = r4
                r10 = 0
                r11 = 0
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10 r12 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r9
                r12.<init>(r0, r8)
                r13 = 3
                r14 = 0
                kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r9, r10, r11, r12, r13, r14)
            L_0x0234:
                kotlin.d2 r0 = kotlin.C11079d2.f28267a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.C21631.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(C15472e0 e0Var, C11305q<? super C2198j, ? super C15094f, ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11300l<? super C15094f, C11079d2> lVar, C11300l<? super C15094f, C11079d2> lVar2, C11300l<? super C15094f, C11079d2> lVar3, C11045c<? super TapGestureDetectorKt$detectTapGestures$2> cVar) {
        super(2, cVar);
        this.$this_detectTapGestures = e0Var;
        this.$onPress = qVar;
        this.$onLongPress = lVar;
        this.$onDoubleTap = lVar2;
        this.$onTap = lVar3;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, cVar);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C12074o0 o0Var = (C12074o0) this.L$0;
            final PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            C15472e0 e0Var = this.$this_detectTapGestures;
            final C11305q<C2198j, C15094f, C11045c<? super C11079d2>, Object> qVar = this.$onPress;
            final C11300l<C15094f, C11079d2> lVar = this.$onLongPress;
            final C11300l<C15094f, C11079d2> lVar2 = this.$onDoubleTap;
            final C11300l<C15094f, C11079d2> lVar3 = this.$onTap;
            C21631 r3 = new C21631((C11045c<? super C21631>) null);
            this.label = 1;
            if (ForEachGestureKt.m9336d(e0Var, r3, this) == h) {
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
        return ((TapGestureDetectorKt$detectTapGestures$2) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
