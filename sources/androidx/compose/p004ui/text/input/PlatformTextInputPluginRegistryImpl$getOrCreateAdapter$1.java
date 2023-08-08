package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.input.PlatformTextInputPluginRegistryImpl;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/text/input/g0;", "T", "", "invoke", "()Ljava/lang/Boolean;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1 */
public final class PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ PlatformTextInputPluginRegistryImpl.C16266c<T> $adapterWithRefCount;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlatformTextInputPluginRegistryImpl$getOrCreateAdapter$1(PlatformTextInputPluginRegistryImpl.C16266c<T> cVar) {
        super(0);
        this.$adapterWithRefCount = cVar;
    }

    @C12579k
    public final Boolean invoke() {
        return Boolean.valueOf(this.$adapterWithRefCount.mo47100a());
    }
}
