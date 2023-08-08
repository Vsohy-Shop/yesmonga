package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.C19754h0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/os/Bundle;", "it", "Landroidx/navigation/h0;", "a", "(Landroid/os/Bundle;)Landroidx/navigation/h0;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavHostControllerKt$NavControllerSaver$2 extends Lambda implements C11300l<Bundle, C19754h0> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$NavControllerSaver$2(Context context) {
        super(1);
        this.$context = context;
    }

    @C12580l
    /* renamed from: a */
    public final C19754h0 invoke(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "it");
        C19754h0 b = NavHostControllerKt.m91707c(this.$context);
        b.mo58102H0(bundle);
        return b;
    }
}
