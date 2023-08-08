package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, mo22516d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "i", "Landroidx/lifecycle/n;", "a", "Landroidx/lifecycle/n;", "generatedAdapter", "<init>", "(Landroidx/lifecycle/n;)V", "lifecycle-common"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class SingleGeneratedAdapterObserver implements C19470t {
    @C12579k

    /* renamed from: a */
    public final C19447n f49739a;

    public SingleGeneratedAdapterObserver(@C12579k C19447n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "generatedAdapter");
        this.f49739a = nVar;
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f49739a.mo57617a(wVar, event, false, (C19421f0) null);
        this.f49739a.mo57617a(wVar, event, true, (C19421f0) null);
    }
}
