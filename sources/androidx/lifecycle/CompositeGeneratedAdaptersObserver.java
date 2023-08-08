package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo22516d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "i", "", "Landroidx/lifecycle/n;", "a", "[Landroidx/lifecycle/n;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/n;)V", "lifecycle-common"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class CompositeGeneratedAdaptersObserver implements C19470t {
    @C12579k

    /* renamed from: a */
    public final C19447n[] f49669a;

    public CompositeGeneratedAdaptersObserver(@C12579k C19447n[] nVarArr) {
        Intrinsics.checkNotNullParameter(nVarArr, "generatedAdapters");
        this.f49669a = nVarArr;
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        C19421f0 f0Var = new C19421f0();
        for (C19447n a : this.f49669a) {
            a.mo57617a(wVar, event, false, f0Var);
        }
        for (C19447n a2 : this.f49669a) {
            a2.mo57617a(wVar, event, true, f0Var);
        }
    }
}
