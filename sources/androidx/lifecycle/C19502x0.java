package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.C0353k0;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.lifecycle.viewmodel.C19480b;
import androidx.lifecycle.viewmodel.C19492e;
import androidx.lifecycle.viewmodel.C19496h;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11315i;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* renamed from: androidx.lifecycle.x0 */
public class C19502x0 {
    @C12579k

    /* renamed from: a */
    public final C19392a1 f49887a;
    @C12579k

    /* renamed from: b */
    public final C19506b f49888b;
    @C12579k

    /* renamed from: c */
    public final C19477a f49889c;

    /* renamed from: androidx.lifecycle.x0$b */
    public interface C19506b {
        @C12579k

        /* renamed from: a */
        public static final C19507a f49896a = C19507a.f49897a;

        /* renamed from: androidx.lifecycle.x0$b$a */
        public static final class C19507a {

            /* renamed from: a */
            public static final /* synthetic */ C19507a f49897a = new C19507a();

            @C12579k
            @C11384m
            /* renamed from: a */
            public final C19506b mo57698a(@C12579k C19496h<?>... hVarArr) {
                Intrinsics.checkNotNullParameter(hVarArr, "initializers");
                return new C19480b((C19496h[]) Arrays.copyOf(hVarArr, hVarArr.length));
            }
        }

        @C12579k
        @C11384m
        /* renamed from: c */
        static C19506b m90858c(@C12579k C19496h<?>... hVarArr) {
            return f49896a.mo57698a(hVarArr);
        }

        @C12579k
        /* renamed from: a */
        <T extends C19476v0> T mo21644a(@C12579k Class<T> cls, @C12579k C19477a aVar) {
            Intrinsics.checkNotNullParameter(cls, "modelClass");
            Intrinsics.checkNotNullParameter(aVar, "extras");
            return mo21645b(cls);
        }

        @C12579k
        /* renamed from: b */
        <T extends C19476v0> T mo21645b(@C12579k Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* renamed from: androidx.lifecycle.x0$c */
    public static class C19508c implements C19506b {
        @C12579k

        /* renamed from: b */
        public static final C19509a f49898b = new C19509a((DefaultConstructorMarker) null);
        @C12580l

        /* renamed from: c */
        public static C19508c f49899c;
        @C12579k
        @C11287e

        /* renamed from: d */
        public static final C19477a.C19479b<String> f49900d = C19509a.C19510a.f49901a;

        /* renamed from: androidx.lifecycle.x0$c$a */
        public static final class C19509a {

            /* renamed from: androidx.lifecycle.x0$c$a$a */
            public static final class C19510a implements C19477a.C19479b<String> {
                @C12579k

                /* renamed from: a */
                public static final C19510a f49901a = new C19510a();
            }

            public /* synthetic */ C19509a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C11384m
            /* renamed from: b */
            public static /* synthetic */ void m90866b() {
            }

            @C12579k
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            /* renamed from: a */
            public final C19508c mo57699a() {
                if (C19508c.f49899c == null) {
                    C19508c.f49899c = new C19508c();
                }
                C19508c d = C19508c.f49899c;
                Intrinsics.checkNotNull(d);
                return d;
            }

            public C19509a() {
            }
        }

        @C12579k
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* renamed from: f */
        public static final C19508c m90864f() {
            return f49898b.mo57699a();
        }

        @C12579k
        /* renamed from: b */
        public <T extends C19476v0> T mo21645b(@C12579k Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                modelC…wInstance()\n            }");
                return (C19476v0) newInstance;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.lifecycle.x0$d */
    public static class C19511d {
        /* renamed from: d */
        public void mo57543d(@C12579k C19476v0 v0Var) {
            Intrinsics.checkNotNullParameter(v0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public C19502x0(@C12579k C19392a1 a1Var, @C12579k C19506b bVar) {
        this(a1Var, bVar, (C19477a) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(a1Var, "store");
        Intrinsics.checkNotNullParameter(bVar, "factory");
    }

    @C0353k0
    @C12579k
    /* renamed from: a */
    public <T extends C19476v0> T mo57693a(@C12579k Class<T> cls) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo57694b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @C0353k0
    @C12579k
    /* renamed from: b */
    public <T extends C19476v0> T mo57694b(@C12579k String str, @C12579k Class<T> cls) {
        T t;
        C19511d dVar;
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        T b = this.f49887a.mo57551b(str);
        if (cls.isInstance(b)) {
            C19506b bVar = this.f49888b;
            if (bVar instanceof C19511d) {
                dVar = (C19511d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                Intrinsics.checkNotNull(b);
                dVar.mo57543d(b);
            }
            Intrinsics.checkNotNull(b, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b;
        }
        C19492e eVar = new C19492e(this.f49889c);
        eVar.mo57690c(C19508c.f49900d, str);
        try {
            t = this.f49888b.mo21644a(cls, eVar);
        } catch (AbstractMethodError unused) {
            t = this.f49888b.mo21645b(cls);
        }
        this.f49887a.mo57553d(str, t);
        return t;
    }

    /* renamed from: androidx.lifecycle.x0$a */
    public static class C19503a extends C19508c {
        @C12579k

        /* renamed from: f */
        public static final C19504a f49890f = new C19504a((DefaultConstructorMarker) null);
        @C12579k

        /* renamed from: g */
        public static final String f49891g = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        @C12580l

        /* renamed from: h */
        public static C19503a f49892h;
        @C12579k
        @C11287e

        /* renamed from: i */
        public static final C19477a.C19479b<Application> f49893i = C19504a.C19505a.f49895a;
        @C12580l

        /* renamed from: e */
        public final Application f49894e;

        /* renamed from: androidx.lifecycle.x0$a$a */
        public static final class C19504a {

            /* renamed from: androidx.lifecycle.x0$a$a$a */
            public static final class C19505a implements C19477a.C19479b<Application> {
                @C12579k

                /* renamed from: a */
                public static final C19505a f49895a = new C19505a();
            }

            public /* synthetic */ C19504a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C19506b mo57696a(@C12579k C19395b1 b1Var) {
                Intrinsics.checkNotNullParameter(b1Var, "owner");
                if (b1Var instanceof C19455p) {
                    return ((C19455p) b1Var).getDefaultViewModelProviderFactory();
                }
                return C19508c.f49898b.mo57699a();
            }

            @C12579k
            @C11384m
            /* renamed from: b */
            public final C19503a mo57697b(@C12579k Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (C19503a.f49892h == null) {
                    C19503a.f49892h = new C19503a(application);
                }
                C19503a g = C19503a.f49892h;
                Intrinsics.checkNotNull(g);
                return g;
            }

            public C19504a() {
            }
        }

        public C19503a(Application application, int i) {
            this.f49894e = application;
        }

        @C12579k
        @C11384m
        /* renamed from: j */
        public static final C19503a m90852j(@C12579k Application application) {
            return f49890f.mo57697b(application);
        }

        @C12579k
        /* renamed from: a */
        public <T extends C19476v0> T mo21644a(@C12579k Class<T> cls, @C12579k C19477a aVar) {
            Intrinsics.checkNotNullParameter(cls, "modelClass");
            Intrinsics.checkNotNullParameter(aVar, "extras");
            if (this.f49894e != null) {
                return mo21645b(cls);
            }
            Application application = (Application) aVar.mo57677a(f49893i);
            if (application != null) {
                return mo57695i(cls, application);
            }
            if (!C19393b.class.isAssignableFrom(cls)) {
                return super.mo21645b(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        @C12579k
        /* renamed from: b */
        public <T extends C19476v0> T mo21645b(@C12579k Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "modelClass");
            Application application = this.f49894e;
            if (application != null) {
                return mo57695i(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        /* renamed from: i */
        public final <T extends C19476v0> T mo57695i(Class<T> cls, Application application) {
            if (!C19393b.class.isAssignableFrom(cls)) {
                return super.mo21645b(cls);
            }
            try {
                T t = (C19476v0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                Intrinsics.checkNotNullExpressionValue(t, "{\n                try {\n…          }\n            }");
                return t;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        public C19503a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C19503a(@C12579k Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }
    }

    @C11315i
    public C19502x0(@C12579k C19392a1 a1Var, @C12579k C19506b bVar, @C12579k C19477a aVar) {
        Intrinsics.checkNotNullParameter(a1Var, "store");
        Intrinsics.checkNotNullParameter(bVar, "factory");
        Intrinsics.checkNotNullParameter(aVar, "defaultCreationExtras");
        this.f49887a = a1Var;
        this.f49888b = bVar;
        this.f49889c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19502x0(C19392a1 a1Var, C19506b bVar, C19477a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(a1Var, bVar, (i & 4) != 0 ? C19477a.C19478a.f49866b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19502x0(@C12579k C19395b1 b1Var) {
        this(b1Var.getViewModelStore(), C19503a.f49890f.mo57696a(b1Var), C19515y0.m90894a(b1Var));
        Intrinsics.checkNotNullParameter(b1Var, "owner");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19502x0(@C12579k C19395b1 b1Var, @C12579k C19506b bVar) {
        this(b1Var.getViewModelStore(), bVar, C19515y0.m90894a(b1Var));
        Intrinsics.checkNotNullParameter(b1Var, "owner");
        Intrinsics.checkNotNullParameter(bVar, "factory");
    }
}
