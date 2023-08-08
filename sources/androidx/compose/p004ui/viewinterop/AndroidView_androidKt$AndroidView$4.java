package androidx.compose.p004ui.viewinterop;

import android.content.Context;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4 */
public final class AndroidView_androidKt$AndroidView$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11300l<Context, T> $factory;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<T, C11079d2> $onRelease;
    final /* synthetic */ C11300l<T, C11079d2> $onReset;
    final /* synthetic */ C11300l<T, C11079d2> $update;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$4(C11300l<? super Context, ? extends T> lVar, C11300l<? super T, C11079d2> lVar2, C8767m mVar, C11300l<? super T, C11079d2> lVar3, C11300l<? super T, C11079d2> lVar4, int i, int i2) {
        super(2);
        this.$factory = lVar;
        this.$onReset = lVar2;
        this.$modifier = mVar;
        this.$update = lVar3;
        this.$onRelease = lVar4;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AndroidView_androidKt.m74830b(this.$factory, this.$onReset, this.$modifier, this.$update, this.$onRelease, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
