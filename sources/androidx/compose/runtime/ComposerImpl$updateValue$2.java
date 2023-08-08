package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo22516d2 = {"Landroidx/compose/runtime/d;", "<anonymous parameter 0>", "Landroidx/compose/runtime/z1;", "slots", "Landroidx/compose/runtime/r1;", "rememberManager", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/d;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/r1;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ComposerImpl$updateValue$2 extends Lambda implements C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> {
    final /* synthetic */ int $groupSlotIndex;
    final /* synthetic */ Object $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$updateValue$2(Object obj, int i) {
        super(3);
        this.$value = obj;
        this.$groupSlotIndex = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15102a(@org.jetbrains.annotations.C12579k androidx.compose.runtime.C8428d<?> r2, @org.jetbrains.annotations.C12579k androidx.compose.runtime.C8701z1 r3, @org.jetbrains.annotations.C12579k androidx.compose.runtime.C8608r1 r4) {
        /*
            r1 = this;
            java.lang.String r0 = "<anonymous parameter 0>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "slots"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "rememberManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.lang.Object r2 = r1.$value
            boolean r0 = r2 instanceof androidx.compose.runtime.C8616s1
            if (r0 == 0) goto L_0x001a
            androidx.compose.runtime.s1 r2 = (androidx.compose.runtime.C8616s1) r2
            r4.mo16309e(r2)
        L_0x001a:
            int r2 = r1.$groupSlotIndex
            java.lang.Object r0 = r1.$value
            java.lang.Object r2 = r3.mo16939X0(r2, r0)
            boolean r3 = r2 instanceof androidx.compose.runtime.C8616s1
            if (r3 == 0) goto L_0x002c
            androidx.compose.runtime.s1 r2 = (androidx.compose.runtime.C8616s1) r2
            r4.mo16306b(r2)
            goto L_0x003f
        L_0x002c:
            boolean r3 = r2 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r3 == 0) goto L_0x003f
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
            androidx.compose.runtime.s r3 = r2.mo15209l()
            if (r3 == 0) goto L_0x003f
            r2.mo15221x()
            r2 = 1
            r3.mo16349U(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$updateValue$2.mo15102a(androidx.compose.runtime.d, androidx.compose.runtime.z1, androidx.compose.runtime.r1):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo15102a((C8428d) obj, (C8701z1) obj2, (C8608r1) obj3);
        return C11079d2.f28267a;
    }
}
