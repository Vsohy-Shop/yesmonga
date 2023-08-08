package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C20431c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\n\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0011"}, mo22516d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/w;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/d2;", "i", "", "className", "a", "Landroidx/savedstate/e;", "Landroidx/savedstate/e;", "owner", "<init>", "(Landroidx/savedstate/e;)V", "b", "savedstate_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class Recreator implements C19470t {
    @C12579k

    /* renamed from: b */
    public static final C20424a f52675b = new C20424a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final String f52676c = "classes_to_restore";
    @C12579k

    /* renamed from: d */
    public static final String f52677d = "androidx.savedstate.Restarter";
    @C12579k

    /* renamed from: a */
    public final C20437e f52678a;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C20424a {
        public /* synthetic */ C20424a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C20424a() {
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    public static final class C20425b implements C20431c.C20434c {
        @C12579k

        /* renamed from: a */
        public final Set<String> f52679a = new LinkedHashSet();

        public C20425b(@C12579k C20431c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "registry");
            cVar.mo61291j(Recreator.f52677d, this);
        }

        /* renamed from: a */
        public final void mo61281a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "className");
            this.f52679a.add(str);
        }

        @C12579k
        /* renamed from: c */
        public Bundle mo832c() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f52676c, new ArrayList(this.f52679a));
            return bundle;
        }
    }

    public Recreator(@C12579k C20437e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "owner");
        this.f52678a = eVar;
    }

    /* renamed from: a */
    public final void mo61280a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C20431c.C20432a.class);
            Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C20431c.C20432a) newInstance).mo57463a(this.f52678a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: i */
    public void mo750i(@C12579k C19499w wVar, @C12579k Lifecycle.C19372Event event) {
        Intrinsics.checkNotNullParameter(wVar, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.C19372Event.ON_CREATE) {
            wVar.getLifecycle().mo57467d(this);
            Bundle b = this.f52678a.getSavedStateRegistry().mo61284b(f52677d);
            if (b != null) {
                ArrayList<String> stringArrayList = b.getStringArrayList(f52676c);
                if (stringArrayList != null) {
                    for (String a : stringArrayList) {
                        mo61280a(a);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
