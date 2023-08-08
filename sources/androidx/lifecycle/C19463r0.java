package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20437e;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.r0 */
public final class C19463r0 extends C19502x0.C19511d implements C19502x0.C19506b {
    @C12580l

    /* renamed from: b */
    public Application f49850b;
    @C12579k

    /* renamed from: c */
    public final C19502x0.C19506b f49851c;
    @C12580l

    /* renamed from: d */
    public Bundle f49852d;
    @C12580l

    /* renamed from: e */
    public Lifecycle f49853e;
    @C12580l

    /* renamed from: f */
    public C20431c f49854f;

    public C19463r0() {
        this.f49851c = new C19502x0.C19503a();
    }

    @C12579k
    /* renamed from: a */
    public <T extends C19476v0> T mo21644a(@C12579k Class<T> cls, @C12579k C19477a aVar) {
        Constructor<T> constructor;
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Intrinsics.checkNotNullParameter(aVar, "extras");
        String str = (String) aVar.mo57677a(C19502x0.C19508c.f49900d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.mo57677a(SavedStateHandleSupport.f49731c) != null && aVar.mo57677a(SavedStateHandleSupport.f49732d) != null) {
            Application application = (Application) aVar.mo57677a(C19502x0.C19503a.f49893i);
            boolean isAssignableFrom = C19393b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = C19468s0.m90792c(cls, C19468s0.f49858b);
            } else {
                constructor = C19468s0.m90792c(cls, C19468s0.f49857a);
            }
            if (constructor == null) {
                return this.f49851c.mo21644a(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return C19468s0.m90793d(cls, constructor, SavedStateHandleSupport.m90589a(aVar));
            }
            return C19468s0.m90793d(cls, constructor, application, SavedStateHandleSupport.m90589a(aVar));
        } else if (this.f49853e != null) {
            return mo57664e(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    @C12579k
    /* renamed from: b */
    public <T extends C19476v0> T mo21645b(@C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo57664e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public void mo57543d(@C12579k C19476v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "viewModel");
        if (this.f49853e != null) {
            C20431c cVar = this.f49854f;
            Intrinsics.checkNotNull(cVar);
            Lifecycle lifecycle = this.f49853e;
            Intrinsics.checkNotNull(lifecycle);
            LegacySavedStateHandleController.m90512a(v0Var, cVar, lifecycle);
        }
    }

    @C12579k
    /* renamed from: e */
    public final <T extends C19476v0> T mo57664e(@C12579k String str, @C12579k Class<T> cls) {
        Constructor<T> constructor;
        T t;
        Application application;
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Lifecycle lifecycle = this.f49853e;
        if (lifecycle != null) {
            boolean isAssignableFrom = C19393b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f49850b == null) {
                constructor = C19468s0.m90792c(cls, C19468s0.f49858b);
            } else {
                constructor = C19468s0.m90792c(cls, C19468s0.f49857a);
            }
            if (constructor != null) {
                C20431c cVar = this.f49854f;
                Intrinsics.checkNotNull(cVar);
                SavedStateHandleController b = LegacySavedStateHandleController.m90513b(cVar, lifecycle, str, this.f49852d);
                if (!isAssignableFrom || (application = this.f49850b) == null) {
                    t = C19468s0.m90793d(cls, constructor, b.mo57516b());
                } else {
                    Intrinsics.checkNotNull(application);
                    t = C19468s0.m90793d(cls, constructor, application, b.mo57516b());
                }
                t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
                return t;
            } else if (this.f49850b != null) {
                return this.f49851c.mo21645b(cls);
            } else {
                return C19502x0.C19508c.f49898b.mo57699a().mo21645b(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19463r0(@C12580l Application application, @C12579k C20437e eVar) {
        this(application, eVar, (Bundle) null);
        Intrinsics.checkNotNullParameter(eVar, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public C19463r0(@C12580l Application application, @C12579k C20437e eVar, @C12580l Bundle bundle) {
        C19502x0.C19503a aVar;
        Intrinsics.checkNotNullParameter(eVar, "owner");
        this.f49854f = eVar.getSavedStateRegistry();
        this.f49853e = eVar.getLifecycle();
        this.f49852d = bundle;
        this.f49850b = application;
        if (application != null) {
            aVar = C19502x0.C19503a.f49890f.mo57697b(application);
        } else {
            aVar = new C19502x0.C19503a();
        }
        this.f49851c = aVar;
    }
}
