package androidx.fragment.app;

import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.viewmodel.C19477a;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/viewmodel/a;", "a", "()Landroidx/lifecycle/viewmodel/a;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class FragmentViewModelLazyKt$viewModels$7 extends Lambda implements C11289a<C19477a> {
    final /* synthetic */ C11289a<C19477a> $extrasProducer;
    final /* synthetic */ C11677z<C19395b1> $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$7(C11289a<? extends C19477a> aVar, C11677z<? extends C19395b1> zVar) {
        super(0);
        this.$extrasProducer = aVar;
        this.$owner$delegate = zVar;
    }

    @C12579k
    /* renamed from: a */
    public final C19477a invoke() {
        C19455p pVar;
        C19477a aVar;
        C19477a invoke;
        C11289a<C19477a> aVar2 = this.$extrasProducer;
        if (aVar2 != null && (invoke = aVar2.invoke()) != null) {
            return invoke;
        }
        C19395b1 b = FragmentViewModelLazyKt.m89931p(this.$owner$delegate);
        if (b instanceof C19455p) {
            pVar = (C19455p) b;
        } else {
            pVar = null;
        }
        if (pVar != null) {
            aVar = pVar.getDefaultViewModelCreationExtras();
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return C19477a.C19478a.f49866b;
        }
        return aVar;
    }
}
