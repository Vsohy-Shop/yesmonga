package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C20431c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo22516d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "i", "lifecycle-viewmodel-savedstate_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements C19470t {

    /* renamed from: a */
    public final /* synthetic */ Lifecycle f49683a;

    /* renamed from: b */
    public final /* synthetic */ C20431c f49684b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(Lifecycle lifecycle, C20431c cVar) {
        this.f49683a = lifecycle;
        this.f49684b = cVar;
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_START) {
            this.f49683a.mo57467d(this);
            this.f49684b.mo61292k(LegacySavedStateHandleController.C19371a.class);
        }
    }
}
