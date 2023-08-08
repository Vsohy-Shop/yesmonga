package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.C12988c;
import retrofit2.C13015f;

/* renamed from: retrofit2.t */
public class C13084t {

    /* renamed from: c */
    public static final C13084t f32104c = m56408f();

    /* renamed from: a */
    public final boolean f32105a;
    @Nullable

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f32106b;

    /* renamed from: retrofit2.t$a */
    public static final class C13085a extends C13084t {

        /* renamed from: retrofit2.t$a$a */
        public static final class C13086a implements Executor {

            /* renamed from: a */
            public final Handler f32107a = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.f32107a.post(runnable);
            }
        }

        public C13085a() {
            super(true);
        }

        /* renamed from: c */
        public Executor mo30546c() {
            return new C13086a();
        }

        @Nullable
        /* renamed from: h */
        public Object mo30549h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return C13084t.super.mo30549h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public C13084t(boolean z) {
        this.f32105a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f32106b = constructor;
    }

    /* renamed from: f */
    public static C13084t m56408f() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new C13085a();
        }
        return new C13084t(true);
    }

    /* renamed from: g */
    public static C13084t m56409g() {
        return f32104c;
    }

    /* renamed from: a */
    public List<? extends C12988c.C12989a> mo30544a(@Nullable Executor executor) {
        C13017g gVar = new C13017g(executor);
        if (!this.f32105a) {
            return Collections.singletonList(gVar);
        }
        return Arrays.asList(new C12988c.C12989a[]{C13009e.f32010a, gVar});
    }

    /* renamed from: b */
    public int mo30545b() {
        return this.f32105a ? 2 : 1;
    }

    @Nullable
    /* renamed from: c */
    public Executor mo30546c() {
        return null;
    }

    /* renamed from: d */
    public List<? extends C13015f.C13016a> mo30547d() {
        return this.f32105a ? Collections.singletonList(C13059m.f32057a) : Collections.emptyList();
    }

    /* renamed from: e */
    public int mo30548e() {
        return this.f32105a ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    /* renamed from: h */
    public Object mo30549h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f32106b;
        if (constructor != null) {
            lookup = C13079o.m56403a(constructor.newInstance(new Object[]{cls, -1}));
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    /* renamed from: i */
    public boolean mo30550i(Method method) {
        return this.f32105a && method.isDefault();
    }
}
