package androidx.fragment.app;

import androidx.lifecycle.viewmodel.C19477a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/viewmodel/a;", "a", "()Landroidx/lifecycle/viewmodel/a;"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class FragmentViewModelLazyKt$activityViewModels$5 extends Lambda implements C11289a<C19477a> {
    final /* synthetic */ C11289a<C19477a> $extrasProducer;
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$5(C11289a<? extends C19477a> aVar, Fragment fragment) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_activityViewModels = fragment;
    }

    @C12579k
    /* renamed from: a */
    public final C19477a invoke() {
        C19477a invoke;
        C11289a<C19477a> aVar = this.$extrasProducer;
        if (aVar != null && (invoke = aVar.invoke()) != null) {
            return invoke;
        }
        C19477a defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
