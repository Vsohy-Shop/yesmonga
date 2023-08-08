package androidx.compose.p004ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 */
public final class C15787x68d8e1f6 extends Lambda implements C11300l<Configuration, C11079d2> {
    final /* synthetic */ C8700z0<Configuration> $configuration$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15787x68d8e1f6(C8700z0<Configuration> z0Var) {
        super(1);
        this.$configuration$delegate = z0Var;
    }

    /* renamed from: a */
    public final void mo45479a(@C12579k Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "it");
        AndroidCompositionLocals_androidKt.m70948c(this.$configuration$delegate, configuration);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo45479a((Configuration) obj);
        return C11079d2.f28267a;
    }
}
