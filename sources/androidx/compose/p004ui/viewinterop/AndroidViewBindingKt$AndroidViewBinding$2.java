package androidx.compose.p004ui.viewinterop;

import android.view.View;
import androidx.compose.p004ui.node.C15695i1;
import androidx.viewbinding.C20752b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$2 */
public final class AndroidViewBindingKt$AndroidViewBinding$2 extends Lambda implements C11300l<View, C11079d2> {
    final /* synthetic */ C11300l<T, C11079d2> $update;
    final /* synthetic */ C15695i1<T> $viewBindingRef;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$2(C15695i1<T> i1Var, C11300l<? super T, C11079d2> lVar) {
        super(1);
        this.$viewBindingRef = i1Var;
        this.$update = lVar;
    }

    /* renamed from: a */
    public final void mo47917a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        C20752b bVar = (C20752b) this.$viewBindingRef.mo45026a();
        if (bVar != null) {
            this.$update.invoke(bVar);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo47917a((View) obj);
        return C11079d2.f28267a;
    }
}
