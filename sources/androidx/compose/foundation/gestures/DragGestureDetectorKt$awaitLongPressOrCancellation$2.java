package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15507w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", mo22502f = "DragGestureDetector.kt", mo22503i = {0, 0, 1, 1, 1}, mo22504l = {811, 828}, mo22505m = "invokeSuspend", mo22506n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, mo22507s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,873:1\n86#2,2:874\n33#2,6:876\n88#2:882\n101#2,2:883\n33#2,6:885\n103#2:891\n101#2,2:892\n33#2,6:894\n103#2:900\n116#2,2:901\n33#2,6:903\n118#2:909\n116#2,2:910\n33#2,6:912\n118#2:918\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt$awaitLongPressOrCancellation$2\n*L\n812#1:874,2\n812#1:876,6\n812#1:882\n818#1:883,2\n818#1:885,6\n818#1:891\n829#1:892,2\n829#1:894,6\n829#1:900\n833#1:901,2\n833#1:903,6\n833#1:909\n843#1:910,2\n843#1:912,6\n843#1:918\n*E\n"})
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Ref.ObjectRef<C15507w> $currentDown;
    final /* synthetic */ Ref.ObjectRef<C15507w> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.ObjectRef<C15507w> objectRef, Ref.ObjectRef<C15507w> objectRef2, C11045c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> cVar) {
        super(2, cVar);
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, cVar);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0079 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ae A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3 A[SYNTHETIC] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 == r6) goto L_0x002b
            if (r2 != r3) goto L_0x0023
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.o r7 = (androidx.compose.p004ui.input.pointer.C15491o) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.p004ui.input.pointer.C15465c) r8
            kotlin.C11661u0.m45747n(r18)
            r4 = r18
            r5 = r0
            goto L_0x00c5
        L_0x0023:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002b:
            int r2 = r0.I$0
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p004ui.input.pointer.C15465c) r7
            kotlin.C11661u0.m45747n(r18)
            r9 = r18
            r8 = r7
            r7 = r0
            goto L_0x005b
        L_0x0039:
            kotlin.C11661u0.m45747n(r18)
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.c r2 = (androidx.compose.p004ui.input.pointer.C15465c) r2
            r8 = r0
            r7 = r2
            r2 = 0
        L_0x0043:
            if (r2 != 0) goto L_0x015f
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.p004ui.input.pointer.PointerEventPass.Main
            r8.L$0 = r7
            r8.L$1 = r4
            r8.I$0 = r2
            r8.label = r6
            java.lang.Object r9 = r7.mo44003i3(r9, r8)
            if (r9 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r16 = r8
            r8 = r7
            r7 = r16
        L_0x005b:
            androidx.compose.ui.input.pointer.o r9 = (androidx.compose.p004ui.input.pointer.C15491o) r9
            java.util.List r10 = r9.mo44110e()
            int r11 = r10.size()
            r12 = 0
        L_0x0066:
            if (r12 >= r11) goto L_0x0079
            java.lang.Object r13 = r10.get(r12)
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            boolean r13 = androidx.compose.p004ui.input.pointer.C15492p.m68685e(r13)
            if (r13 != 0) goto L_0x0076
            r10 = 0
            goto L_0x007a
        L_0x0076:
            int r12 = r12 + 1
            goto L_0x0066
        L_0x0079:
            r10 = r6
        L_0x007a:
            if (r10 == 0) goto L_0x007d
            r2 = r6
        L_0x007d:
            java.util.List r10 = r9.mo44110e()
            int r11 = r10.size()
            r12 = 0
        L_0x0086:
            if (r12 >= r11) goto L_0x00ae
            java.lang.Object r13 = r10.get(r12)
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            boolean r14 = r13.mo44167A()
            if (r14 != 0) goto L_0x00a5
            long r14 = r8.mo44000a()
            long r4 = r8.mo44008y()
            boolean r4 = androidx.compose.p004ui.input.pointer.C15492p.m68690j(r13, r14, r4)
            if (r4 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r4 = 0
            goto L_0x00a6
        L_0x00a5:
            r4 = r6
        L_0x00a6:
            if (r4 == 0) goto L_0x00aa
            r4 = r6
            goto L_0x00af
        L_0x00aa:
            int r12 = r12 + 1
            r4 = 0
            goto L_0x0086
        L_0x00ae:
            r4 = 0
        L_0x00af:
            if (r4 == 0) goto L_0x00b2
            r2 = r6
        L_0x00b2:
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            r7.L$0 = r8
            r7.L$1 = r9
            r7.I$0 = r2
            r7.label = r3
            java.lang.Object r4 = r8.mo44003i3(r4, r7)
            if (r4 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            r5 = r7
            r7 = r9
        L_0x00c5:
            androidx.compose.ui.input.pointer.o r4 = (androidx.compose.p004ui.input.pointer.C15491o) r4
            java.util.List r4 = r4.mo44110e()
            int r9 = r4.size()
            r10 = 0
        L_0x00d0:
            if (r10 >= r9) goto L_0x00e3
            java.lang.Object r11 = r4.get(r10)
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            boolean r11 = r11.mo44167A()
            if (r11 == 0) goto L_0x00e0
            r4 = r6
            goto L_0x00e4
        L_0x00e0:
            int r10 = r10 + 1
            goto L_0x00d0
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            if (r4 == 0) goto L_0x00e7
            r2 = r6
        L_0x00e7:
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.w> r4 = r5.$currentDown
            T r4 = r4.element
            androidx.compose.ui.input.pointer.w r4 = (androidx.compose.p004ui.input.pointer.C15507w) r4
            long r9 = r4.mo44176p()
            boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9239C(r7, r9)
            if (r4 == 0) goto L_0x0125
            java.util.List r4 = r7.mo44110e()
            int r7 = r4.size()
            r9 = 0
        L_0x0100:
            if (r9 >= r7) goto L_0x0113
            java.lang.Object r10 = r4.get(r9)
            r11 = r10
            androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
            boolean r11 = r11.mo44178r()
            if (r11 == 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            int r9 = r9 + 1
            goto L_0x0100
        L_0x0113:
            r10 = 0
        L_0x0114:
            androidx.compose.ui.input.pointer.w r10 = (androidx.compose.p004ui.input.pointer.C15507w) r10
            if (r10 == 0) goto L_0x0121
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.w> r4 = r5.$currentDown
            r4.element = r10
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.w> r4 = r5.$longPress
            r4.element = r10
            goto L_0x0159
        L_0x0121:
            r2 = r6
            r7 = r8
            r4 = 0
            goto L_0x015c
        L_0x0125:
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.w> r4 = r5.$longPress
            java.util.List r7 = r7.mo44110e()
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.input.pointer.w> r9 = r5.$currentDown
            int r10 = r7.size()
            r11 = 0
        L_0x0132:
            if (r11 >= r10) goto L_0x0156
            java.lang.Object r12 = r7.get(r11)
            r13 = r12
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p004ui.input.pointer.C15507w) r13
            long r13 = r13.mo44176p()
            T r15 = r9.element
            androidx.compose.ui.input.pointer.w r15 = (androidx.compose.p004ui.input.pointer.C15507w) r15
            r18 = r7
            long r6 = r15.mo44176p()
            boolean r6 = androidx.compose.p004ui.input.pointer.C15506v.m68789d(r13, r6)
            if (r6 == 0) goto L_0x0150
            goto L_0x0157
        L_0x0150:
            int r11 = r11 + 1
            r7 = r18
            r6 = 1
            goto L_0x0132
        L_0x0156:
            r12 = 0
        L_0x0157:
            r4.element = r12
        L_0x0159:
            r7 = r8
            r4 = 0
            r6 = 1
        L_0x015c:
            r8 = r5
            goto L_0x0043
        L_0x015f:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
