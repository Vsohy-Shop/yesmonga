package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import dagger.hilt.C10262b;
import dagger.hilt.C10263c;
import dagger.hilt.C10267e;
import dagger.hilt.android.components.C10166a;
import dagger.hilt.android.components.C10168c;
import dagger.hilt.android.internal.C10184a;
import dagger.hilt.android.internal.builders.C10190e;
import dagger.hilt.android.internal.builders.C10192g;
import dagger.hilt.internal.C10274c;
import dagger.hilt.internal.C10280f;

public final class ViewComponentManager implements C10274c<Object> {

    /* renamed from: a */
    public volatile Object f27924a;

    /* renamed from: b */
    public final Object f27925b = new Object();

    /* renamed from: c */
    public final boolean f27926c;

    /* renamed from: d */
    public final View f27927d;

    @C10267e({C10166a.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$a */
    public interface C10214a {
        /* renamed from: f */
        C10190e mo21662f();
    }

    @C10267e({C10168c.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$b */
    public interface C10215b {
        /* renamed from: Y */
        C10192g mo21663Y();
    }

    public ViewComponentManager(View view, boolean z) {
        this.f27927d = view;
        this.f27926c = z;
    }

    /* renamed from: e */
    public static Context m38442e(Context context, Class<?> cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: a */
    public final Object mo21655a() {
        C10274c<?> b = mo21656b(false);
        if (this.f27926c) {
            return ((C10215b) C10263c.m38503a(b, C10215b.class)).mo21663Y().mo21631a(this.f27927d).mo21632g();
        }
        return ((C10214a) C10263c.m38503a(b, C10214a.class)).mo21662f().mo21626a(this.f27927d).mo21627g();
    }

    /* renamed from: b */
    public final C10274c<?> mo21656b(boolean z) {
        Class<C10274c> cls = C10274c.class;
        if (this.f27926c) {
            Context c = mo21657c(FragmentContextWrapper.class, z);
            if (c instanceof FragmentContextWrapper) {
                return (C10274c) ((FragmentContextWrapper) c).mo21660d();
            }
            if (z) {
                return null;
            }
            Context c2 = mo21657c(cls, z);
            C10280f.m38508d(!(c2 instanceof C10274c), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.f27927d.getClass(), c2.getClass().getName());
        } else {
            Context c3 = mo21657c(cls, z);
            if (c3 instanceof C10274c) {
                return (C10274c) c3;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.f27927d.getClass()}));
    }

    /* renamed from: c */
    public final Context mo21657c(Class<?> cls, boolean z) {
        Context e = m38442e(this.f27927d.getContext(), cls);
        if (e != C10184a.m38402a(e.getApplicationContext())) {
            return e;
        }
        C10280f.m38508d(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.f27927d.getClass());
        return null;
    }

    /* renamed from: d */
    public C10274c<?> mo21658d() {
        return mo21656b(true);
    }

    public Object generatedComponent() {
        if (this.f27924a == null) {
            synchronized (this.f27925b) {
                if (this.f27924a == null) {
                    this.f27924a = mo21655a();
                }
            }
        }
        return this.f27924a;
    }

    public static final class FragmentContextWrapper extends ContextWrapper {

        /* renamed from: a */
        public Fragment f27928a;

        /* renamed from: b */
        public LayoutInflater f27929b;

        /* renamed from: c */
        public LayoutInflater f27930c;

        /* renamed from: d */
        public final C19470t f27931d;

        public FragmentContextWrapper(Context context, Fragment fragment) {
            super((Context) C10280f.m38506b(context));
            C102131 r2 = new C19470t() {
                /* renamed from: i */
                public void mo750i(C19499w wVar, Lifecycle.C19372Event event) {
                    if (event == Lifecycle.C19372Event.ON_DESTROY) {
                        Fragment unused = FragmentContextWrapper.this.f27928a = null;
                        LayoutInflater unused2 = FragmentContextWrapper.this.f27929b = null;
                        LayoutInflater unused3 = FragmentContextWrapper.this.f27930c = null;
                    }
                }
            };
            this.f27931d = r2;
            this.f27929b = null;
            Fragment fragment2 = (Fragment) C10280f.m38506b(fragment);
            this.f27928a = fragment2;
            fragment2.getLifecycle().mo57464a(r2);
        }

        /* renamed from: d */
        public Fragment mo21660d() {
            C10280f.m38507c(this.f27928a, "The fragment has already been destroyed.");
            return this.f27928a;
        }

        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f27930c == null) {
                if (this.f27929b == null) {
                    this.f27929b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f27930c = this.f27929b.cloneInContext(this);
            }
            return this.f27930c;
        }

        public FragmentContextWrapper(LayoutInflater layoutInflater, Fragment fragment) {
            super((Context) C10280f.m38506b(((LayoutInflater) C10280f.m38506b(layoutInflater)).getContext()));
            C102131 r0 = new C19470t() {
                /* renamed from: i */
                public void mo750i(C19499w wVar, Lifecycle.C19372Event event) {
                    if (event == Lifecycle.C19372Event.ON_DESTROY) {
                        Fragment unused = FragmentContextWrapper.this.f27928a = null;
                        LayoutInflater unused2 = FragmentContextWrapper.this.f27929b = null;
                        LayoutInflater unused3 = FragmentContextWrapper.this.f27930c = null;
                    }
                }
            };
            this.f27931d = r0;
            this.f27929b = layoutInflater;
            Fragment fragment2 = (Fragment) C10280f.m38506b(fragment);
            this.f27928a = fragment2;
            fragment2.getLifecycle().mo57464a(r0);
        }
    }
}
