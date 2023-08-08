package androidx.compose.material3;

import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class NavigationDrawerKt$Scrim$dismissDrawer$2$1 extends Lambda implements C11300l<C16044q, C11079d2> {
    final /* synthetic */ String $closeDrawer;
    final /* synthetic */ C11289a<C11079d2> $onClose;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$dismissDrawer$2$1(String str, C11289a<C11079d2> aVar) {
        super(1);
        this.$closeDrawer = str;
        this.$onClose = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C16044q) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
        SemanticsPropertiesKt.m71959G0(qVar, this.$closeDrawer);
        final C11289a<C11079d2> aVar = this.$onClose;
        SemanticsPropertiesKt.m72017h0(qVar, (String) null, new C11289a<Boolean>() {
            @C12579k
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
    }
}
