package androidx.compose.p004ui.window;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", mo22502f = "AndroidPopup.android.kt", mo22503i = {0}, mo22504l = {301}, mo22505m = "invokeSuspend", mo22506n = {"$this$LaunchedEffect"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5 */
public final class AndroidPopup_androidKt$Popup$5 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, C11045c<? super AndroidPopup_androidKt$Popup$5> cVar) {
        super(2, cVar);
        this.$popupLayout = popupLayout;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.$popupLayout, cVar);
        androidPopup_androidKt$Popup$5.L$0 = obj;
        return androidPopup_androidKt$Popup$5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.o0 r1 = (kotlinx.coroutines.C12074o0) r1
            kotlin.C11661u0.m45747n(r5)
            r5 = r4
            goto L_0x0038
        L_0x0014:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001c:
            kotlin.C11661u0.m45747n(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.o0 r5 = (kotlinx.coroutines.C12074o0) r5
            r1 = r5
            r5 = r4
        L_0x0025:
            boolean r3 = kotlinx.coroutines.C12079p0.m48270k(r1)
            if (r3 == 0) goto L_0x003e
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r3 = androidx.compose.p004ui.window.AndroidPopup_androidKt$Popup$5.C165311.f40980f
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r3 = androidx.compose.p004ui.platform.InfiniteAnimationPolicyKt.m71058a(r3, r5)
            if (r3 != r0) goto L_0x0038
            return r0
        L_0x0038:
            androidx.compose.ui.window.PopupLayout r3 = r5.$popupLayout
            r3.mo48057q()
            goto L_0x0025
        L_0x003e:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AndroidPopup_androidKt$Popup$5) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
