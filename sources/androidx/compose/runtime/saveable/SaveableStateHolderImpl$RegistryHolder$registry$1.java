package androidx.compose.runtime.saveable;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SaveableStateHolderImpl$RegistryHolder$registry$1 extends Lambda implements C11300l<Object, Boolean> {
    final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k Object obj) {
        boolean z;
        Intrinsics.checkNotNullParameter(obj, "it");
        C8624c g = this.this$0.mo16390g();
        if (g != null) {
            z = g.mo8708a(obj);
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
