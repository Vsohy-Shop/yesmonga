package androidx.compose.foundation.layout;

import androidx.compose.p004ui.modifier.C15627d;
import androidx.compose.p004ui.modifier.C15634j;
import androidx.compose.p004ui.modifier.C15636k;
import androidx.compose.p004ui.modifier.C15638m;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8547h2
@C11363r0({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,305:1\n76#2:306\n102#2,2:307\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsConsumingModifier\n*L\n215#1:306\n215#1:307,2\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.u */
public abstract class C2410u extends C15988w0 implements C15627d, C15634j<C2354e1> {
    @C12579k

    /* renamed from: d */
    public final C8700z0 f6357d;

    public /* synthetic */ C2410u(C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar);
    }

    /* renamed from: V3 */
    public void mo7151V3(@C12579k C15636k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "scope");
        mo8197u(mo8013r((C2354e1) kVar.mo44518a(WindowInsetsPaddingKt.m10245e())));
    }

    @C12579k
    public C15638m<C2354e1> getKey() {
        return WindowInsetsPaddingKt.m10245e();
    }

    @C12579k
    /* renamed from: r */
    public abstract C2354e1 mo8013r(@C12579k C2354e1 e1Var);

    /* renamed from: s */
    public final C2354e1 mo8195s() {
        return (C2354e1) this.f6357d.getValue();
    }

    @C12579k
    /* renamed from: t */
    public C2354e1 getValue() {
        return mo8195s();
    }

    /* renamed from: u */
    public final void mo8197u(C2354e1 e1Var) {
        this.f6357d.setValue(e1Var);
    }

    public C2410u(C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        this.f6357d = C8539f2.m30981g(C2358f1.m10388a(0, 0, 0, 0), (C8410b2) null, 2, (Object) null);
    }
}
