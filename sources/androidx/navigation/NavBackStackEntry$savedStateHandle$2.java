package androidx.navigation;

import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/lifecycle/p0;", "a", "()Landroidx/lifecycle/p0;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavBackStackEntry$savedStateHandle$2 extends Lambda implements C11289a<C19456p0> {
    final /* synthetic */ NavBackStackEntry this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$savedStateHandle$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.this$0 = navBackStackEntry;
    }

    @C12579k
    /* renamed from: a */
    public final C19456p0 invoke() {
        boolean z;
        if (this.this$0.f50353x) {
            if (this.this$0.f50351v.mo57465b() != Lifecycle.State.DESTROYED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return ((NavBackStackEntry.C19672c) new C19502x0((C19395b1) this.this$0, (C19502x0.C19506b) new NavBackStackEntry.C19671b(this.this$0)).mo57693a(NavBackStackEntry.C19672c.class)).mo58076c0();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
        throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
    }
}
