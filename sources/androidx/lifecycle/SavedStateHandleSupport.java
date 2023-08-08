package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.C0353k0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.lifecycle.viewmodel.C19481c;
import androidx.savedstate.C20431c;
import androidx.savedstate.C20437e;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "SavedStateHandleSupport")
@C11363r0({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,221:1\n1#2:222\n31#3:223\n63#3,2:224\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandleSupport\n*L\n109#1:223\n110#1:224,2\n*E\n"})
public final class SavedStateHandleSupport {
    @C12579k

    /* renamed from: a */
    public static final String f49729a = "androidx.lifecycle.internal.SavedStateHandlesVM";
    @C12579k

    /* renamed from: b */
    public static final String f49730b = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    @C12579k
    @C11287e

    /* renamed from: c */
    public static final C19477a.C19479b<C20437e> f49731c = new C19382b();
    @C12579k
    @C11287e

    /* renamed from: d */
    public static final C19477a.C19479b<C19395b1> f49732d = new C19383c();
    @C12579k
    @C11287e

    /* renamed from: e */
    public static final C19477a.C19479b<Bundle> f49733e = new C19381a();

    /* renamed from: androidx.lifecycle.SavedStateHandleSupport$a */
    public static final class C19381a implements C19477a.C19479b<Bundle> {
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleSupport$b */
    public static final class C19382b implements C19477a.C19479b<C20437e> {
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleSupport$c */
    public static final class C19383c implements C19477a.C19479b<C19395b1> {
    }

    @C0353k0
    @C12579k
    /* renamed from: a */
    public static final C19456p0 m90589a(@C12579k C19477a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        C20437e eVar = (C20437e) aVar.mo57677a(f49731c);
        if (eVar != null) {
            C19395b1 b1Var = (C19395b1) aVar.mo57677a(f49732d);
            if (b1Var != null) {
                Bundle bundle = (Bundle) aVar.mo57677a(f49733e);
                String str = (String) aVar.mo57677a(C19502x0.C19508c.f49900d);
                if (str != null) {
                    return m90590b(eVar, b1Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* renamed from: b */
    public static final C19456p0 m90590b(C20437e eVar, C19395b1 b1Var, String str, Bundle bundle) {
        SavedStateHandlesProvider d = m90592d(eVar);
        C19461q0 e = m90593e(b1Var);
        C19456p0 p0Var = e.mo57661c0().get(str);
        if (p0Var != null) {
            return p0Var;
        }
        C19456p0 a = C19456p0.f49832f.mo57658a(d.mo57519a(str), bundle);
        e.mo57661c0().put(str, a);
        return a;
    }

    @C0353k0
    /* renamed from: c */
    public static final <T extends C20437e & C19395b1> void m90591c(@C12579k T t) {
        boolean z;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Lifecycle.State b = t.getLifecycle().mo57465b();
        if (b == Lifecycle.State.INITIALIZED || b == Lifecycle.State.CREATED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t.getSavedStateRegistry().mo61285c(f49730b) == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), (C19395b1) t);
            t.getSavedStateRegistry().mo61291j(f49730b, savedStateHandlesProvider);
            t.getLifecycle().mo57464a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    @C12579k
    /* renamed from: d */
    public static final SavedStateHandlesProvider m90592d(@C12579k C20437e eVar) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        C20431c.C20434c c = eVar.getSavedStateRegistry().mo61285c(f49730b);
        if (c instanceof SavedStateHandlesProvider) {
            savedStateHandlesProvider = (SavedStateHandlesProvider) c;
        } else {
            savedStateHandlesProvider = null;
        }
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    @C12579k
    /* renamed from: e */
    public static final C19461q0 m90593e(@C12579k C19395b1 b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        C19481c cVar = new C19481c();
        Class cls = C19461q0.class;
        cVar.mo57679a(C11342l0.m43547d(cls), SavedStateHandleSupport$savedStateHandlesVM$1$1.f49734f);
        return (C19461q0) new C19502x0(b1Var, cVar.mo57680b()).mo57694b(f49729a, cls);
    }
}
