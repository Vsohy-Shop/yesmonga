package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20437e;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LegacySavedStateHandleController {
    @C12579k

    /* renamed from: a */
    public static final LegacySavedStateHandleController f49681a = new LegacySavedStateHandleController();
    @C12579k

    /* renamed from: b */
    public static final String f49682b = "androidx.lifecycle.savedstate.vm.tag";

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    public static final class C19371a implements C20431c.C20432a {
        /* renamed from: a */
        public void mo57463a(@C12579k C20437e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "owner");
            if (eVar instanceof C19395b1) {
                C19392a1 viewModelStore = ((C19395b1) eVar).getViewModelStore();
                C20431c savedStateRegistry = eVar.getSavedStateRegistry();
                for (String b : viewModelStore.mo57552c()) {
                    C19476v0 b2 = viewModelStore.mo57551b(b);
                    Intrinsics.checkNotNull(b2);
                    LegacySavedStateHandleController.m90512a(b2, savedStateRegistry, eVar.getLifecycle());
                }
                if (!viewModelStore.mo57552c().isEmpty()) {
                    savedStateRegistry.mo61292k(C19371a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    @C11384m
    /* renamed from: a */
    public static final void m90512a(@C12579k C19476v0 v0Var, @C12579k C20431c cVar, @C12579k Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(v0Var, "viewModel");
        Intrinsics.checkNotNullParameter(cVar, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) v0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo57517c()) {
            savedStateHandleController.mo57515a(cVar, lifecycle);
            f49681a.mo57462c(cVar, lifecycle);
        }
    }

    @C12579k
    @C11384m
    /* renamed from: b */
    public static final SavedStateHandleController m90513b(@C12579k C20431c cVar, @C12579k Lifecycle lifecycle, @C12580l String str, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(cVar, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C19456p0.f49832f.mo57658a(cVar.mo61284b(str), bundle));
        savedStateHandleController.mo57515a(cVar, lifecycle);
        f49681a.mo57462c(cVar, lifecycle);
        return savedStateHandleController;
    }

    /* renamed from: c */
    public final void mo57462c(C20431c cVar, Lifecycle lifecycle) {
        Lifecycle.State b = lifecycle.mo57465b();
        if (b == Lifecycle.State.INITIALIZED || b.mo57474q(Lifecycle.State.STARTED)) {
            cVar.mo61292k(C19371a.class);
        } else {
            lifecycle.mo57464a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, cVar));
        }
    }
}
