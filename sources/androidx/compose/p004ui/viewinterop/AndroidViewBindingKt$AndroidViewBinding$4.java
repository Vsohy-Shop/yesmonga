package androidx.compose.p004ui.viewinterop;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$4 */
public final class AndroidViewBindingKt$AndroidViewBinding$4 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C11305q<LayoutInflater, ViewGroup, Boolean, T> $factory;
    final /* synthetic */ C8767m $modifier;
    final /* synthetic */ C11300l<T, C11079d2> $update;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$4(C11305q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> qVar, C8767m mVar, C11300l<? super T, C11079d2> lVar, int i, int i2) {
        super(2);
        this.$factory = qVar;
        this.$modifier = mVar;
        this.$update = lVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        AndroidViewBindingKt.m74784a(this.$factory, this.$modifier, this.$update, oVar, C8590n1.m31123a(this.$$changed | 1), this.$$default);
    }
}
