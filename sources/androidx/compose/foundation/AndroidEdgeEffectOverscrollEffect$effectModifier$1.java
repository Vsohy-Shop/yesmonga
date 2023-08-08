package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ForEachGestureKt;
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
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", mo22502f = "AndroidOverscroll.kt", mo22503i = {}, mo22504l = {316}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/e0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AndroidEdgeEffectOverscrollEffect$effectModifier$1 extends SuspendLambda implements C11304p<C15472e0, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    @C11067d(mo22501c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", mo22502f = "AndroidOverscroll.kt", mo22503i = {0, 1}, mo22504l = {317, 321}, mo22505m = "invokeSuspend", mo22506n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, mo22507s = {"L$0", "L$0"})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    @C11363r0({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,589:1\n36#2,3:590\n39#2,2:597\n41#2:600\n33#3,4:593\n38#3:599\n116#3,2:601\n33#3,6:603\n118#3:609\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n*L\n321#1:590,3\n321#1:597,2\n321#1:600\n321#1:593,4\n321#1:599\n325#1:601,2\n325#1:603,6\n325#1:609\n*E\n"})
    /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1 */
    public static final class C20491 extends RestrictedSuspendLambda implements C11304p<C15465c, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C20491 r0 = new C20491(androidEdgeEffectOverscrollEffect, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C15465c cVar, @C12580l C11045c<? super C11079d2> cVar2) {
            return ((C20491) create(cVar, cVar2)).invokeSuspend(C11079d2.f28267a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.compose.ui.input.pointer.w} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.ui.input.pointer.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb A[SYNTHETIC] */
        @org.jetbrains.annotations.C12580l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r1 = r14.label
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r1 = r14.L$0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
                kotlin.C11661u0.m45747n(r15)
                r5 = r1
                r1 = r0
                r0 = r14
                goto L_0x0070
            L_0x001a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0022:
                java.lang.Object r1 = r14.L$0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
                kotlin.C11661u0.m45747n(r15)
                goto L_0x0043
            L_0x002a:
                kotlin.C11661u0.m45747n(r15)
                java.lang.Object r15 = r14.L$0
                r1 = r15
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p004ui.input.pointer.C15465c) r1
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r14.L$0 = r1
                r14.label = r4
                r5 = r1
                r8 = r14
                java.lang.Object r15 = androidx.compose.foundation.gestures.TapGestureDetectorKt.m9439f(r5, r6, r7, r8, r9, r10)
                if (r15 != r0) goto L_0x0043
                return r0
            L_0x0043:
                androidx.compose.ui.input.pointer.w r15 = (androidx.compose.p004ui.input.pointer.C15507w) r15
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r3
                long r6 = r15.mo44176p()
                androidx.compose.ui.input.pointer.v r6 = androidx.compose.p004ui.input.pointer.C15506v.m68786a(r6)
                r5.f5718q = r6
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r5 = r3
                long r6 = r15.mo44177q()
                androidx.compose.ui.geometry.f r15 = androidx.compose.p004ui.geometry.C15094f.m64868d(r6)
                r5.f5703b = r15
                r15 = r14
            L_0x0060:
                r15.L$0 = r1
                r15.label = r2
                java.lang.Object r5 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r1, r3, r15, r4, r3)
                if (r5 != r0) goto L_0x006b
                return r0
            L_0x006b:
                r13 = r0
                r0 = r15
                r15 = r5
                r5 = r1
                r1 = r13
            L_0x0070:
                androidx.compose.ui.input.pointer.o r15 = (androidx.compose.p004ui.input.pointer.C15491o) r15
                java.util.List r15 = r15.mo44110e()
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = r15.size()
                r6.<init>(r7)
                int r7 = r15.size()
                r8 = 0
                r9 = r8
            L_0x0085:
                if (r9 >= r7) goto L_0x009a
                java.lang.Object r10 = r15.get(r9)
                r11 = r10
                androidx.compose.ui.input.pointer.w r11 = (androidx.compose.p004ui.input.pointer.C15507w) r11
                boolean r11 = r11.mo44178r()
                if (r11 == 0) goto L_0x0097
                r6.add(r10)
            L_0x0097:
                int r9 = r9 + 1
                goto L_0x0085
            L_0x009a:
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                int r7 = r6.size()
            L_0x00a0:
                if (r8 >= r7) goto L_0x00bb
                java.lang.Object r9 = r6.get(r8)
                r10 = r9
                androidx.compose.ui.input.pointer.w r10 = (androidx.compose.p004ui.input.pointer.C15507w) r10
                long r10 = r10.mo44176p()
                androidx.compose.ui.input.pointer.v r12 = r15.f5718q
                boolean r10 = androidx.compose.p004ui.input.pointer.C15506v.m68788c(r10, r12)
                if (r10 == 0) goto L_0x00b8
                goto L_0x00bc
            L_0x00b8:
                int r8 = r8 + 1
                goto L_0x00a0
            L_0x00bb:
                r9 = r3
            L_0x00bc:
                androidx.compose.ui.input.pointer.w r9 = (androidx.compose.p004ui.input.pointer.C15507w) r9
                if (r9 != 0) goto L_0x00c7
                java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40479B2(r6)
                r9 = r15
                androidx.compose.ui.input.pointer.w r9 = (androidx.compose.p004ui.input.pointer.C15507w) r9
            L_0x00c7:
                if (r9 == 0) goto L_0x00e3
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                long r7 = r9.mo44176p()
                androidx.compose.ui.input.pointer.v r7 = androidx.compose.p004ui.input.pointer.C15506v.m68786a(r7)
                r15.f5718q = r7
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                long r7 = r9.mo44177q()
                androidx.compose.ui.geometry.f r7 = androidx.compose.p004ui.geometry.C15094f.m64868d(r7)
                r15.f5703b = r7
            L_0x00e3:
                boolean r15 = r6.isEmpty()
                r15 = r15 ^ r4
                if (r15 != 0) goto L_0x00f2
                androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r15 = r3
                r15.f5718q = r3
                kotlin.d2 r15 = kotlin.C11079d2.f28267a
                return r15
            L_0x00f2:
                r15 = r0
                r0 = r1
                r1 = r5
                goto L_0x0060
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1.C20491.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$effectModifier$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C11045c<? super AndroidEdgeEffectOverscrollEffect$effectModifier$1> cVar) {
        super(2, cVar);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        AndroidEdgeEffectOverscrollEffect$effectModifier$1 androidEdgeEffectOverscrollEffect$effectModifier$1 = new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this.this$0, cVar);
        androidEdgeEffectOverscrollEffect$effectModifier$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$effectModifier$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C15472e0 e0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AndroidEdgeEffectOverscrollEffect$effectModifier$1) create(e0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.this$0;
            C20491 r1 = new C20491((C11045c<? super C20491>) null);
            this.label = 1;
            if (ForEachGestureKt.m9336d((C15472e0) this.L$0, r1, this) == h) {
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
