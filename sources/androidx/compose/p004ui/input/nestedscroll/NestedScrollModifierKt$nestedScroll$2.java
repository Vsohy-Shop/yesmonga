package androidx.compose.p004ui.input.nestedscroll;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nNestedScrollModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,344:1\n474#2,4:345\n478#2,2:353\n482#2:359\n25#3:349\n25#3:360\n67#3,3:367\n66#3:370\n1114#4,3:350\n1117#4,3:356\n1114#4,6:361\n1114#4,6:371\n474#5:355\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2\n*L\n337#1:345,4\n337#1:353,2\n337#1:359\n337#1:349\n339#1:360\n340#1:367,3\n340#1:370\n337#1:350,3\n337#1:356,3\n339#1:361,6\n340#1:371,6\n337#1:355\n*E\n"})
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2 */
public final class NestedScrollModifierKt$nestedScroll$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C15446a $connection;
    final /* synthetic */ NestedScrollDispatcher $dispatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierKt$nestedScroll$2(NestedScrollDispatcher nestedScrollDispatcher, C15446a aVar) {
        super(3);
        this.$dispatcher = nestedScrollDispatcher;
        this.$connection = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo43951a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r5, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r5 = 410346167(0x187562b7, float:3.1715346E-24)
            r6.mo14918M(r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0017
            r0 = -1
            java.lang.String r1 = "androidx.compose.ui.input.nestedscroll.nestedScroll.<anonymous> (NestedScrollModifier.kt:335)"
            androidx.compose.runtime.ComposerKt.m29845w0(r5, r7, r0, r1)
        L_0x0017:
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r6.mo14918M(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo14918M(r5)
            java.lang.Object r7 = r6.mo14921N()
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r0.mo16277a()
            if (r7 != r1) goto L_0x003e
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            kotlinx.coroutines.o0 r7 = androidx.compose.runtime.EffectsKt.m29901m(r7, r6)
            androidx.compose.runtime.w r1 = new androidx.compose.runtime.w
            r1.<init>(r7)
            r6.mo14893C(r1)
            r7 = r1
        L_0x003e:
            r6.mo15002m0()
            androidx.compose.runtime.w r7 = (androidx.compose.runtime.C8690w) r7
            kotlinx.coroutines.o0 r7 = r7.mo16831a()
            r6.mo15002m0()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = r4.$dispatcher
            r2 = 100475956(0x5fd2434, float:2.3805305E-35)
            r6.mo14918M(r2)
            if (r1 != 0) goto L_0x006f
            r6.mo14918M(r5)
            java.lang.Object r5 = r6.mo14921N()
            java.lang.Object r1 = r0.mo16277a()
            if (r5 != r1) goto L_0x0069
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r5 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r5.<init>()
            r6.mo14893C(r5)
        L_0x0069:
            r6.mo15002m0()
            r1 = r5
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher) r1
        L_0x006f:
            r6.mo15002m0()
            androidx.compose.ui.input.nestedscroll.a r5 = r4.$connection
            r2 = 1618982084(0x607fb4c4, float:7.370227E19)
            r6.mo14918M(r2)
            boolean r2 = r6.mo15006n0(r5)
            boolean r3 = r6.mo15006n0(r1)
            r2 = r2 | r3
            boolean r3 = r6.mo15006n0(r7)
            r2 = r2 | r3
            java.lang.Object r3 = r6.mo14921N()
            if (r2 != 0) goto L_0x0094
            java.lang.Object r0 = r0.mo16277a()
            if (r3 != r0) goto L_0x009f
        L_0x0094:
            r1.mo43947j(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r3 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal
            r3.<init>(r1, r5)
            r6.mo14893C(r3)
        L_0x009f:
            r6.mo15002m0()
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r3 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierLocal) r3
            boolean r5 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r5 == 0) goto L_0x00ad
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00ad:
            r6.mo15002m0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2.mo43951a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo43951a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
