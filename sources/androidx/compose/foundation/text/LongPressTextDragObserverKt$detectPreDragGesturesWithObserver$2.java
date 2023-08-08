package androidx.compose.foundation.text;

import androidx.compose.p004ui.input.pointer.C15465c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", mo22502f = "LongPressTextDragObserver.kt", mo22503i = {0, 1, 1}, mo22504l = {98, 102}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, mo22507s = {"L$0", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLongPressTextDragObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,124:1\n101#2,2:125\n33#2,6:127\n103#2:133\n*S KotlinDebug\n*F\n+ 1 LongPressTextDragObserver.kt\nandroidx/compose/foundation/text/LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2\n*L\n103#1:125,2\n103#1:127,6\n103#1:133\n*E\n"})
public final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C2846t $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(C2846t tVar, C11045c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.$observer = tVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, cVar);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: androidx.compose.ui.input.pointer.c} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099 A[EDGE_INSN: B:30:0x0099->B:26:0x0099 ?: BREAK  , SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r16
            java.lang.Object r7 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r0 = r6.label
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r9) goto L_0x0027
            if (r0 != r8) goto L_0x001f
            java.lang.Object r0 = r6.L$1
            androidx.compose.ui.input.pointer.w r0 = (androidx.compose.p004ui.input.pointer.C15507w) r0
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
            kotlin.C11661u0.m45747n(r17)
            r3 = r17
            r2 = r6
            goto L_0x0067
        L_0x001f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0027:
            java.lang.Object r0 = r6.L$0
            androidx.compose.ui.input.pointer.c r0 = (androidx.compose.p004ui.input.pointer.C15465c) r0
            kotlin.C11661u0.m45747n(r17)
            r10 = r0
            r0 = r17
            goto L_0x004c
        L_0x0032:
            kotlin.C11661u0.m45747n(r17)
            java.lang.Object r0 = r6.L$0
            r10 = r0
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p004ui.input.pointer.C15465c) r10
            r1 = 0
            r2 = 0
            r4 = 3
            r5 = 0
            r6.L$0 = r10
            r6.label = r9
            r0 = r10
            r3 = r16
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x004c
            return r7
        L_0x004c:
            androidx.compose.ui.input.pointer.w r0 = (androidx.compose.p004ui.input.pointer.C15507w) r0
            androidx.compose.foundation.text.t r1 = r6.$observer
            long r2 = r0.mo44177q()
            r1.mo9337b(r2)
            r2 = r6
            r1 = r10
        L_0x0059:
            r2.L$0 = r1
            r2.L$1 = r0
            r2.label = r8
            r3 = 0
            java.lang.Object r3 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r1, r3, r2, r9, r3)
            if (r3 != r7) goto L_0x0067
            return r7
        L_0x0067:
            androidx.compose.ui.input.pointer.o r3 = (androidx.compose.p004ui.input.pointer.C15491o) r3
            java.util.List r3 = r3.mo44110e()
            int r4 = r3.size()
            r5 = 0
            r10 = r5
        L_0x0073:
            if (r10 >= r4) goto L_0x0099
            java.lang.Object r11 = r3.get(r10)
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            long r12 = r11.mo44176p()
            long r14 = r0.mo44176p()
            boolean r12 = androidx.compose.p004ui.input.pointer.C15506v.m68789d(r12, r14)
            if (r12 == 0) goto L_0x0091
            boolean r11 = r11.mo44178r()
            if (r11 == 0) goto L_0x0091
            r11 = r9
            goto L_0x0092
        L_0x0091:
            r11 = r5
        L_0x0092:
            if (r11 == 0) goto L_0x0096
            r5 = r9
            goto L_0x0099
        L_0x0096:
            int r10 = r10 + 1
            goto L_0x0073
        L_0x0099:
            if (r5 != 0) goto L_0x0059
            androidx.compose.foundation.text.t r0 = r2.$observer
            r0.mo9339d()
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
