package androidx.navigation;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C19463r0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/lifecycle/r0;", "a", "()Landroidx/lifecycle/r0;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class NavBackStackEntry$defaultFactory$2 extends Lambda implements C11289a<C19463r0> {
    final /* synthetic */ NavBackStackEntry this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry$defaultFactory$2(NavBackStackEntry navBackStackEntry) {
        super(0);
        this.this$0 = navBackStackEntry;
    }

    @C12579k
    /* renamed from: a */
    public final C19463r0 invoke() {
        Context a = this.this$0.f50344a;
        Application application = null;
        Context applicationContext = a != null ? a.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        NavBackStackEntry navBackStackEntry = this.this$0;
        return new C19463r0(application, navBackStackEntry, navBackStackEntry.mo58062d());
    }
}
