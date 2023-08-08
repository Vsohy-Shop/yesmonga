package androidx.compose.p004ui.platform;

import androidx.savedstate.C20431c;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 */
public final class C15798xec1ea390 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C20431c $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15798xec1ea390(boolean z, C20431c cVar, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = cVar;
        this.$key = str;
    }

    public final void invoke() {
        if (this.$registered) {
            this.$androidxRegistry.mo61294m(this.$key);
        }
    }
}
