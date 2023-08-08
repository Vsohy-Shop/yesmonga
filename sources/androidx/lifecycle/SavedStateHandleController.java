package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C20431c;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001d"}, mo22516d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/t;", "Landroidx/savedstate/c;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/d2;", "a", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "i", "", "Ljava/lang/String;", "key", "Landroidx/lifecycle/p0;", "b", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "handle", "", "<set-?>", "c", "Z", "()Z", "isAttached", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/p0;)V", "lifecycle-viewmodel-savedstate_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class SavedStateHandleController implements C19470t {
    @C12579k

    /* renamed from: a */
    public final String f49726a;
    @C12579k

    /* renamed from: b */
    public final C19456p0 f49727b;

    /* renamed from: c */
    public boolean f49728c;

    public SavedStateHandleController(@C12579k String str, @C12579k C19456p0 p0Var) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(p0Var, "handle");
        this.f49726a = str;
        this.f49727b = p0Var;
    }

    /* renamed from: a */
    public final void mo57515a(@C12579k C20431c cVar, @C12579k Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(cVar, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!this.f49728c) {
            this.f49728c = true;
            lifecycle.mo57464a(this);
            cVar.mo61291j(this.f49726a, this.f49727b.mo57655o());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @C12579k
    /* renamed from: b */
    public final C19456p0 mo57516b() {
        return this.f49727b;
    }

    /* renamed from: c */
    public final boolean mo57517c() {
        return this.f49728c;
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_DESTROY) {
            this.f49728c = false;
            wVar.getLifecycle().mo57467d(this);
        }
    }
}
