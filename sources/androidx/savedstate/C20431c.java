package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.C0353k0;
import androidx.arch.core.internal.C0836b;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import com.urbanairship.analytics.location.C35560b;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"RestrictedApi"})
@C11363r0({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* renamed from: androidx.savedstate.c */
public final class C20431c {
    @C12579k

    /* renamed from: g */
    public static final C20433b f52683g = new C20433b((DefaultConstructorMarker) null);
    @Deprecated
    @C12579k

    /* renamed from: h */
    public static final String f52684h = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    @C12579k

    /* renamed from: a */
    public final C0836b<String, C20434c> f52685a = new C0836b<>();

    /* renamed from: b */
    public boolean f52686b;
    @C12580l

    /* renamed from: c */
    public Bundle f52687c;

    /* renamed from: d */
    public boolean f52688d;
    @C12580l

    /* renamed from: e */
    public Recreator.C20425b f52689e;

    /* renamed from: f */
    public boolean f52690f = true;

    /* renamed from: androidx.savedstate.c$a */
    public interface C20432a {
        /* renamed from: a */
        void mo57463a(@C12579k C20437e eVar);
    }

    /* renamed from: androidx.savedstate.c$b */
    public static final class C20433b {
        public /* synthetic */ C20433b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C20433b() {
        }
    }

    /* renamed from: androidx.savedstate.c$c */
    public interface C20434c {
        @C12579k
        /* renamed from: c */
        Bundle mo832c();
    }

    /* renamed from: f */
    public static final void m95257f(C20431c cVar, C19499w wVar, Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(cVar, "this$0");
        Intrinsics.checkNotNullParameter(wVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_START) {
            cVar.f52690f = true;
        } else if (event == Lifecycle.C19372Event.ON_STOP) {
            cVar.f52690f = false;
        }
    }

    @C0353k0
    @C12580l
    /* renamed from: b */
    public final Bundle mo61284b(@C12579k String str) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(str, "key");
        if (this.f52688d) {
            Bundle bundle2 = this.f52687c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f52687c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f52687c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f52687c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    @C12580l
    /* renamed from: c */
    public final C20434c mo61285c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Iterator<Map.Entry<String, C20434c>> it = this.f52685a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "components");
            C20434c cVar = (C20434c) next.getValue();
            if (Intrinsics.areEqual((Object) (String) next.getKey(), (Object) str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo61286d() {
        return this.f52690f;
    }

    @C0353k0
    /* renamed from: e */
    public final boolean mo61287e() {
        return this.f52688d;
    }

    @C0353k0
    /* renamed from: g */
    public final void mo61288g(@C12579k Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (!this.f52686b) {
            lifecycle.mo57464a(new C20430b(this));
            this.f52686b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    @C0353k0
    /* renamed from: h */
    public final void mo61289h(@C12580l Bundle bundle) {
        Bundle bundle2;
        if (!this.f52686b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f52688d) {
            if (bundle != null) {
                bundle2 = bundle.getBundle(f52684h);
            } else {
                bundle2 = null;
            }
            this.f52687c = bundle2;
            this.f52688d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    @C0353k0
    /* renamed from: i */
    public final void mo61290i(@C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f52687c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0836b<K, V>.d i = this.f52685a.mo3810i();
        Intrinsics.checkNotNullExpressionValue(i, "this.components.iteratorWithAdditions()");
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            bundle2.putBundle((String) entry.getKey(), ((C20434c) entry.getValue()).mo832c());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f52684h, bundle2);
        }
    }

    @C0353k0
    /* renamed from: j */
    public final void mo61291j(@C12579k String str, @C12579k C20434c cVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cVar, C35560b.f87807Z0);
        if (this.f52685a.mo3803r(str, cVar) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @C0353k0
    /* renamed from: k */
    public final void mo61292k(@C12579k Class<? extends C20432a> cls) {
        Intrinsics.checkNotNullParameter(cls, "clazz");
        if (this.f52690f) {
            Recreator.C20425b bVar = this.f52689e;
            if (bVar == null) {
                bVar = new Recreator.C20425b(this);
            }
            this.f52689e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C20425b bVar2 = this.f52689e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                    bVar2.mo61281a(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }

    /* renamed from: l */
    public final void mo61293l(boolean z) {
        this.f52690f = z;
    }

    @C0353k0
    /* renamed from: m */
    public final void mo61294m(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.f52685a.mo3804w(str);
    }
}
