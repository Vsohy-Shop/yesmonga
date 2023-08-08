package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.urbanairship.analytics.location.C35560b;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, mo22516d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "i", "Landroidx/lifecycle/SavedStateHandlesProvider;", "a", "Landroidx/lifecycle/SavedStateHandlesProvider;", "provider", "<init>", "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "lifecycle-viewmodel-savedstate_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class SavedStateHandleAttacher implements C19470t {
    @C12579k

    /* renamed from: a */
    public final SavedStateHandlesProvider f49725a;

    public SavedStateHandleAttacher(@C12579k SavedStateHandlesProvider savedStateHandlesProvider) {
        Intrinsics.checkNotNullParameter(savedStateHandlesProvider, C35560b.f87807Z0);
        this.f49725a = savedStateHandlesProvider;
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        boolean z;
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            wVar.getLifecycle().mo57467d(this);
            this.f49725a.mo57521d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
