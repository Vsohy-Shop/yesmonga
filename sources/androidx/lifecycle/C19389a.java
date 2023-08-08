package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20437e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.lifecycle.a */
public abstract class C19389a extends C19502x0.C19511d implements C19502x0.C19506b {
    @C12579k

    /* renamed from: e */
    public static final C19390a f49765e = new C19390a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final String f49766f = "androidx.lifecycle.savedstate.vm.tag";
    @C12580l

    /* renamed from: b */
    public C20431c f49767b;
    @C12580l

    /* renamed from: c */
    public Lifecycle f49768c;
    @C12580l

    /* renamed from: d */
    public Bundle f49769d;

    /* renamed from: androidx.lifecycle.a$a */
    public static final class C19390a {
        public /* synthetic */ C19390a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C19390a() {
        }
    }

    public C19389a() {
    }

    @C12579k
    /* renamed from: a */
    public <T extends C19476v0> T mo21644a(@C12579k Class<T> cls, @C12579k C19477a aVar) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Intrinsics.checkNotNullParameter(aVar, "extras");
        String str = (String) aVar.mo57677a(C19502x0.C19508c.f49900d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.f49767b != null) {
            return mo57544e(str, cls);
        } else {
            return mo21646f(str, cls, SavedStateHandleSupport.m90589a(aVar));
        }
    }

    @C12579k
    /* renamed from: b */
    public <T extends C19476v0> T mo21645b(@C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f49768c != null) {
            return mo57544e(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public void mo57543d(@C12579k C19476v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "viewModel");
        C20431c cVar = this.f49767b;
        if (cVar != null) {
            Intrinsics.checkNotNull(cVar);
            Lifecycle lifecycle = this.f49768c;
            Intrinsics.checkNotNull(lifecycle);
            LegacySavedStateHandleController.m90512a(v0Var, cVar, lifecycle);
        }
    }

    /* renamed from: e */
    public final <T extends C19476v0> T mo57544e(String str, Class<T> cls) {
        C20431c cVar = this.f49767b;
        Intrinsics.checkNotNull(cVar);
        Lifecycle lifecycle = this.f49768c;
        Intrinsics.checkNotNull(lifecycle);
        SavedStateHandleController b = LegacySavedStateHandleController.m90513b(cVar, lifecycle, str, this.f49769d);
        T f = mo21646f(str, cls, b.mo57516b());
        f.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
        return f;
    }

    @C12579k
    /* renamed from: f */
    public abstract <T extends C19476v0> T mo21646f(@C12579k String str, @C12579k Class<T> cls, @C12579k C19456p0 p0Var);

    public C19389a(@C12579k C20437e eVar, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(eVar, "owner");
        this.f49767b = eVar.getSavedStateRegistry();
        this.f49768c = eVar.getLifecycle();
        this.f49769d = bundle;
    }
}
