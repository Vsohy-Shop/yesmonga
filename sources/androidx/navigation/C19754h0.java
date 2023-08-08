package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19499w;
import com.urbanairship.iam.events.C9175a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.navigation.h0 */
public class C19754h0 extends NavController {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19754h0(@C12579k Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: P0 */
    public final void mo58118P0(@C12579k C19499w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "owner");
        super.mo58118P0(wVar);
    }

    /* renamed from: R0 */
    public final void mo58122R0(@C12579k OnBackPressedDispatcher onBackPressedDispatcher) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "dispatcher");
        super.mo58122R0(onBackPressedDispatcher);
    }

    /* renamed from: S0 */
    public final void mo58124S0(@C12579k C19392a1 a1Var) {
        Intrinsics.checkNotNullParameter(a1Var, "viewModelStore");
        super.mo58124S0(a1Var);
    }

    /* renamed from: x */
    public final void mo58164x(boolean z) {
        super.mo58164x(z);
    }
}
