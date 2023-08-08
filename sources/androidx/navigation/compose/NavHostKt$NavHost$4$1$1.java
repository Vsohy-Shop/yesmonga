package androidx.navigation.compose;

import androidx.compose.runtime.C8430d0;
import androidx.compose.runtime.C8434e0;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class NavHostKt$NavHost$4$1$1 extends Lambda implements C11300l<C8434e0, C8430d0> {
    final /* synthetic */ C19710b $composeNavigator;
    final /* synthetic */ C8700z0<Boolean> $initialCrossfade$delegate;
    final /* synthetic */ C8578k2<List<NavBackStackEntry>> $visibleEntries$delegate;

    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$4$1$1$a */
    public static final class C19708a implements C8430d0 {

        /* renamed from: a */
        public final /* synthetic */ C8578k2 f50508a;

        /* renamed from: b */
        public final /* synthetic */ C19710b f50509b;

        public C19708a(C8578k2 k2Var, C19710b bVar) {
            this.f50508a = k2Var;
            this.f50509b = bVar;
        }

        /* renamed from: g */
        public void mo791g() {
            for (NavBackStackEntry o : NavHostKt.m91715c(this.f50508a)) {
                this.f50509b.mo58378o(o);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$4$1$1(C8700z0<Boolean> z0Var, C8578k2<? extends List<NavBackStackEntry>> k2Var, C19710b bVar) {
        super(1);
        this.$initialCrossfade$delegate = z0Var;
        this.$visibleEntries$delegate = k2Var;
        this.$composeNavigator = bVar;
    }

    @C12579k
    /* renamed from: a */
    public final C8430d0 invoke(@C12579k C8434e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "$this$DisposableEffect");
        if (NavHostKt.m91716d(this.$initialCrossfade$delegate)) {
            C19710b bVar = this.$composeNavigator;
            for (NavBackStackEntry o : NavHostKt.m91715c(this.$visibleEntries$delegate)) {
                bVar.mo58378o(o);
            }
            NavHostKt.m91717e(this.$initialCrossfade$delegate, false);
        }
        return new C19708a(this.$visibleEntries$delegate, this.$composeNavigator);
    }
}
