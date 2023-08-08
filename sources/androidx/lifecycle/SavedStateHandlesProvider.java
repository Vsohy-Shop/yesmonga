package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C20431c;
import java.util.Map;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n215#2,2:222\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:222,2\n*E\n"})
public final class SavedStateHandlesProvider implements C20431c.C20434c {
    @C12579k

    /* renamed from: a */
    public final C20431c f49735a;

    /* renamed from: b */
    public boolean f49736b;
    @C12580l

    /* renamed from: c */
    public Bundle f49737c;
    @C12579k

    /* renamed from: d */
    public final C11677z f49738d;

    public SavedStateHandlesProvider(@C12579k C20431c cVar, @C12579k C19395b1 b1Var) {
        Intrinsics.checkNotNullParameter(cVar, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(b1Var, "viewModelStoreOwner");
        this.f49735a = cVar;
        this.f49738d = C10864b0.m38748c(new SavedStateHandlesProvider$viewModel$2(b1Var));
    }

    @C12580l
    /* renamed from: a */
    public final Bundle mo57519a(@C12579k String str) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(str, "key");
        mo57521d();
        Bundle bundle2 = this.f49737c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f49737c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f49737c;
        boolean z = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z = true;
        }
        if (z) {
            this.f49737c = null;
        }
        return bundle;
    }

    /* renamed from: b */
    public final C19461q0 mo57520b() {
        return (C19461q0) this.f49738d.getValue();
    }

    @C12579k
    /* renamed from: c */
    public Bundle mo832c() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f49737c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : mo57520b().mo57661c0().entrySet()) {
            String str = (String) next.getKey();
            Bundle c = ((C19456p0) next.getValue()).mo57655o().mo832c();
            if (!Intrinsics.areEqual((Object) c, (Object) Bundle.EMPTY)) {
                bundle.putBundle(str, c);
            }
        }
        this.f49736b = false;
        return bundle;
    }

    /* renamed from: d */
    public final void mo57521d() {
        if (!this.f49736b) {
            this.f49737c = this.f49735a.mo61284b(SavedStateHandleSupport.f49730b);
            this.f49736b = true;
            mo57520b();
        }
    }
}
