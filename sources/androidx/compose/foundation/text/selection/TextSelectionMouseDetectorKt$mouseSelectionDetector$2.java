package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.input.pointer.C15465c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", mo22502f = "TextSelectionMouseDetector.kt", mo22503i = {0, 0, 1, 1, 2, 2}, mo22504l = {89, 96, 111}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter"}, mo22507s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C2826e $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextSelectionMouseDetectorKt$mouseSelectionDetector$2(C2826e eVar, C11045c<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> cVar) {
        super(2, cVar);
        this.$observer = eVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, cVar);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r12.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r4) goto L_0x0027
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001a:
            java.lang.Object r1 = r12.L$1
            androidx.compose.foundation.text.selection.b r1 = (androidx.compose.foundation.text.selection.C2822b) r1
            java.lang.Object r5 = r12.L$0
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p004ui.input.pointer.C15465c) r5
            kotlin.C11661u0.m45747n(r13)
            r13 = r5
            goto L_0x0044
        L_0x0027:
            java.lang.Object r1 = r12.L$1
            androidx.compose.foundation.text.selection.b r1 = (androidx.compose.foundation.text.selection.C2822b) r1
            java.lang.Object r5 = r12.L$0
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p004ui.input.pointer.C15465c) r5
            kotlin.C11661u0.m45747n(r13)
            r6 = r12
            goto L_0x0056
        L_0x0034:
            kotlin.C11661u0.m45747n(r13)
            java.lang.Object r13 = r12.L$0
            androidx.compose.ui.input.pointer.c r13 = (androidx.compose.p004ui.input.pointer.C15465c) r13
            androidx.compose.foundation.text.selection.b r1 = new androidx.compose.foundation.text.selection.b
            androidx.compose.ui.platform.c4 r5 = r13.getViewConfiguration()
            r1.<init>(r5)
        L_0x0044:
            r5 = r12
        L_0x0045:
            r5.L$0 = r13
            r5.L$1 = r1
            r5.label = r4
            java.lang.Object r6 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.m12957b(r13, r5)
            if (r6 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r11 = r5
            r5 = r13
            r13 = r6
            r6 = r11
        L_0x0056:
            androidx.compose.ui.input.pointer.o r13 = (androidx.compose.p004ui.input.pointer.C15491o) r13
            r1.mo9847g(r13)
            java.util.List r7 = r13.mo44110e()
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            androidx.compose.ui.input.pointer.w r7 = (androidx.compose.p004ui.input.pointer.C15507w) r7
            boolean r13 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.m12941a(r13)
            if (r13 == 0) goto L_0x0093
            androidx.compose.foundation.text.selection.e r13 = r6.$observer
            long r8 = r7.mo44177q()
            boolean r13 = r13.mo9349d(r8)
            if (r13 == 0) goto L_0x00d6
            r7.mo44168a()
            long r7 = r7.mo44176p()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1 r13 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1
            androidx.compose.foundation.text.selection.e r9 = r6.$observer
            r13.<init>(r9)
            r6.L$0 = r5
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9267y(r5, r7, r13, r6)
            if (r13 != r0) goto L_0x00d6
            return r0
        L_0x0093:
            int r13 = r1.mo9841a()
            if (r13 == r4) goto L_0x00a9
            if (r13 == r3) goto L_0x00a2
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.f7343a
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.mo9599f()
            goto L_0x00af
        L_0x00a2:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.f7343a
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.mo9600g()
            goto L_0x00af
        L_0x00a9:
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.f7343a
            androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.mo9598e()
        L_0x00af:
            androidx.compose.foundation.text.selection.e r8 = r6.$observer
            long r9 = r7.mo44177q()
            boolean r8 = r8.mo9347b(r9, r13)
            if (r8 == 0) goto L_0x00d6
            r7.mo44168a()
            long r7 = r7.mo44176p()
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2 r9 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2
            androidx.compose.foundation.text.selection.e r10 = r6.$observer
            r9.<init>(r10, r13)
            r6.L$0 = r5
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m9267y(r5, r7, r9, r6)
            if (r13 != r0) goto L_0x00d6
            return r0
        L_0x00d6:
            r13 = r5
            r5 = r6
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
