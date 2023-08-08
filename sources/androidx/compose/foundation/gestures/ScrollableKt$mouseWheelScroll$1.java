package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.runtime.C8578k2;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", mo22502f = "Scrollable.kt", mo22503i = {}, mo22504l = {291}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/e0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollableKt$mouseWheelScroll$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C2200k $mouseWheelScrollConfig;
    final /* synthetic */ C8578k2<ScrollingLogic> $scrollingLogicState;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", mo22502f = "Scrollable.kt", mo22503i = {0}, mo22504l = {293}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitPointerEventScope"}, mo22507s = {"L$0"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$mouseWheelScroll$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,579:1\n86#2,2:580\n33#2,6:582\n88#2:588\n33#2,6:589\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$mouseWheelScroll$1$1\n*L\n294#1:580,2\n294#1:582,6\n294#1:588\n301#1:589,6\n*E\n"})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1 */
    public static final class C21551 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C21551 r0 = new C21551(kVar, k2Var, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
            return ((C21551) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0057 A[SYNTHETIC] */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r10.label
                r2 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r1 = r10.L$0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
                kotlin.C11661u0.m45747n(r11)
                r3 = r1
                r1 = r0
                r0 = r10
                goto L_0x0037
            L_0x0016:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001e:
                kotlin.C11661u0.m45747n(r11)
                java.lang.Object r11 = r10.L$0
                androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p004ui.input.pointer.C15465c) r11
                r1 = r11
                r11 = r10
            L_0x0027:
                r11.L$0 = r1
                r11.label = r2
                java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.m9380e(r1, r11)
                if (r3 != r0) goto L_0x0032
                return r0
            L_0x0032:
                r9 = r0
                r0 = r11
                r11 = r3
                r3 = r1
                r1 = r9
            L_0x0037:
                androidx.compose.ui.input.pointer.o r11 = (androidx.compose.p004ui.input.pointer.C15491o) r11
                java.util.List r4 = r11.mo44110e()
                int r5 = r4.size()
                r6 = 0
                r7 = r6
            L_0x0043:
                if (r7 >= r5) goto L_0x0057
                java.lang.Object r8 = r4.get(r7)
                androidx.compose.ui.input.pointer.w r8 = (androidx.compose.p004ui.input.pointer.C15507w) r8
                boolean r8 = r8.mo44167A()
                r8 = r8 ^ r2
                if (r8 != 0) goto L_0x0054
                r4 = r6
                goto L_0x0058
            L_0x0054:
                int r7 = r7 + 1
                goto L_0x0043
            L_0x0057:
                r4 = r2
            L_0x0058:
                if (r4 == 0) goto L_0x009c
                androidx.compose.foundation.gestures.k r4 = r3
                androidx.compose.runtime.k2<androidx.compose.foundation.gestures.ScrollingLogic> r5 = r4
                long r7 = r3.mo44000a()
                long r7 = r4.mo7533a(r3, r11, r7)
                java.lang.Object r4 = r5.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                float r5 = r4.mo7477s(r7)
                float r5 = r4.mo7471m(r5)
                androidx.compose.foundation.gestures.n r4 = r4.mo7466h()
                float r4 = r4.mo7250b(r5)
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L_0x0083
                r4 = r2
                goto L_0x0084
            L_0x0083:
                r4 = r6
            L_0x0084:
                if (r4 != 0) goto L_0x009c
                java.util.List r11 = r11.mo44110e()
                int r4 = r11.size()
            L_0x008e:
                if (r6 >= r4) goto L_0x009c
                java.lang.Object r5 = r11.get(r6)
                androidx.compose.ui.input.pointer.w r5 = (androidx.compose.p004ui.input.pointer.C15507w) r5
                r5.mo44168a()
                int r6 = r6 + 1
                goto L_0x008e
            L_0x009c:
                r11 = r0
                r0 = r1
                r1 = r3
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1.C21551.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$mouseWheelScroll$1(C2200k kVar, C8578k2<ScrollingLogic> k2Var, C11045c<? super ScrollableKt$mouseWheelScroll$1> cVar) {
        super(2, cVar);
        this.$mouseWheelScrollConfig = kVar;
        this.$scrollingLogicState = k2Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ScrollableKt$mouseWheelScroll$1 scrollableKt$mouseWheelScroll$1 = new ScrollableKt$mouseWheelScroll$1(this.$mouseWheelScrollConfig, this.$scrollingLogicState, cVar);
        scrollableKt$mouseWheelScroll$1.L$0 = obj;
        return scrollableKt$mouseWheelScroll$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ScrollableKt$mouseWheelScroll$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C2200k kVar = this.$mouseWheelScrollConfig;
            final C8578k2<ScrollingLogic> k2Var = this.$scrollingLogicState;
            C21551 r1 = new C21551((C11045c<? super C21551>) null);
            this.label = 1;
            if (((C15472e0) this.L$0).mo43994R0(r1, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
