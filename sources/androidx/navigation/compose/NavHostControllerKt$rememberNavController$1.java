package androidx.navigation.compose;

import android.content.Context;
import androidx.navigation.C19754h0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class NavHostControllerKt$rememberNavController$1 extends Lambda implements C11289a<C19754h0> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$rememberNavController$1(Context context) {
        super(0);
        this.$context = context;
    }

    @C12579k
    /* renamed from: a */
    public final C19754h0 invoke() {
        return NavHostControllerKt.m91707c(this.$context);
    }
}
