package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.sequences.C11561o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.core.view.ViewGroupKt$descendants$1", mo22502f = "ViewGroup.kt", mo22503i = {0, 0, 0, 0, 1, 1, 1}, mo22504l = {119, 121}, mo22505m = "invokeSuspend", mo22506n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, mo22507s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlin/sequences/o;", "Landroid/view/View;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements C11304p<C11561o<? super View>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ ViewGroup $this_descendants;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, C11045c<? super ViewGroupKt$descendants$1> cVar) {
        super(2, cVar);
        this.$this_descendants = viewGroup;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, cVar);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11561o<? super View> oVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ViewGroupKt$descendants$1) create(oVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r3) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r11.L$0
            kotlin.sequences.o r6 = (kotlin.sequences.C11561o) r6
            kotlin.C11661u0.m45747n(r12)
            r12 = r11
            goto L_0x0091
        L_0x0020:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0028:
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$2
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r11.L$1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r7 = r11.L$0
            kotlin.sequences.o r7 = (kotlin.sequences.C11561o) r7
            kotlin.C11661u0.m45747n(r12)
            r12 = r11
            goto L_0x0071
        L_0x003d:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            kotlin.sequences.o r12 = (kotlin.sequences.C11561o) r12
            android.view.ViewGroup r1 = r11.$this_descendants
            int r4 = r1.getChildCount()
            r5 = 0
            r6 = r11
        L_0x004c:
            if (r5 >= r4) goto L_0x00a1
            android.view.View r7 = r1.getChildAt(r5)
            java.lang.String r8 = "getChildAt(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r6.L$0 = r12
            r6.L$1 = r1
            r6.L$2 = r7
            r6.I$0 = r5
            r6.I$1 = r4
            r6.label = r3
            java.lang.Object r8 = r12.mo23250b(r7, r6)
            if (r8 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r9 = r7
            r7 = r12
            r12 = r6
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r9
        L_0x0071:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0098
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            kotlin.sequences.m r5 = androidx.core.view.ViewGroupKt.m81809f(r5)
            r12.L$0 = r7
            r12.L$1 = r6
            r8 = 0
            r12.L$2 = r8
            r12.I$0 = r4
            r12.I$1 = r1
            r12.label = r2
            java.lang.Object r5 = r7.mo23260h(r5, r12)
            if (r5 != r0) goto L_0x008f
            return r0
        L_0x008f:
            r5 = r6
            r6 = r7
        L_0x0091:
            r9 = r6
            r6 = r12
            r12 = r9
            r10 = r5
            r5 = r1
            r1 = r10
            goto L_0x009c
        L_0x0098:
            r5 = r1
            r1 = r6
            r6 = r12
            r12 = r7
        L_0x009c:
            int r4 = r4 + r3
            r9 = r5
            r5 = r4
            r4 = r9
            goto L_0x004c
        L_0x00a1:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
