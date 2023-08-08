package androidx.compose.foundation.pager;

import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/AwaitLazyListStateSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
public final class AwaitLazyListStateSet {
    @C12580l

    /* renamed from: a */
    public C11045c<? super C11079d2> f6972a;

    /* renamed from: b */
    public boolean f6973b;

    /* renamed from: a */
    public final void mo9050a() {
        if (!this.f6973b) {
            this.f6973b = true;
            C11045c<? super C11079d2> cVar = this.f6972a;
            if (cVar != null) {
                Result.C10852a aVar = Result.f28060a;
                cVar.resumeWith(Result.m38702b(C11079d2.f28267a));
            }
            this.f6972a = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo9051b(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1 r0 = new androidx.compose.foundation.pager.AwaitLazyListStateSet$waitFinalLazyListSetting$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.L$1
            kotlin.coroutines.c r1 = (kotlin.coroutines.C11045c) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.pager.AwaitLazyListStateSet r0 = (androidx.compose.foundation.pager.AwaitLazyListStateSet) r0
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0064
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            kotlin.C11661u0.m45747n(r5)
            boolean r5 = r4.f6973b
            if (r5 != 0) goto L_0x0071
            kotlin.coroutines.c<? super kotlin.d2> r5 = r4.f6972a
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            kotlin.coroutines.h r2 = new kotlin.coroutines.h
            kotlin.coroutines.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)
            r2.<init>(r3)
            r4.f6972a = r2
            java.lang.Object r2 = r2.mo22492a()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r2 != r3) goto L_0x0060
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)
        L_0x0060:
            if (r2 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r1 = r5
        L_0x0064:
            if (r1 == 0) goto L_0x0071
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            r1.resumeWith(r5)
        L_0x0071:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.AwaitLazyListStateSet.mo9051b(kotlin.coroutines.c):java.lang.Object");
    }
}
