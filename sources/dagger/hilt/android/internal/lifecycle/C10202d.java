package dagger.hilt.android.internal.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.lifecycle.C19389a;
import androidx.lifecycle.C19456p0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.savedstate.C20437e;
import dagger.C10159h;
import dagger.hilt.C10262b;
import dagger.hilt.C10263c;
import dagger.hilt.C10267e;
import dagger.hilt.android.components.C10166a;
import dagger.hilt.android.components.C10171f;
import dagger.hilt.android.internal.builders.C10191f;
import dagger.hilt.android.internal.lifecycle.C10207e;
import dagger.multibindings.C10355g;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: dagger.hilt.android.internal.lifecycle.d */
public final class C10202d implements C19502x0.C19506b {

    /* renamed from: b */
    public final Set<String> f27917b;

    /* renamed from: c */
    public final C19502x0.C19506b f27918c;

    /* renamed from: d */
    public final C19389a f27919d;

    /* renamed from: dagger.hilt.android.internal.lifecycle.d$a */
    public class C10203a extends C19389a {

        /* renamed from: g */
        public final /* synthetic */ C10191f f27920g;

        public C10203a(C10191f fVar) {
            this.f27920g = fVar;
        }

        @C0359n0
        /* renamed from: f */
        public <T extends C19476v0> T mo21646f(@C0359n0 String str, @C0359n0 Class<T> cls, @C0359n0 C19456p0 p0Var) {
            C10212i iVar = new C10212i();
            Provider provider = ((C10205c) C10263c.m38503a(this.f27920g.mo21628a(p0Var).mo21629b(iVar).mo21630g(), C10205c.class)).mo21649a().get(cls.getName());
            if (provider != null) {
                T t = (C19476v0) provider.get();
                t.addCloseable(new C10201c(iVar));
                return t;
            }
            throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
        }
    }

    @C10267e({C10166a.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.lifecycle.d$b */
    public interface C10204b {
        @C10207e.C10208a
        /* renamed from: d */
        Set<String> mo21647d();

        /* renamed from: j */
        C10191f mo21648j();
    }

    @C10267e({C10171f.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.lifecycle.d$c */
    public interface C10205c {
        @C10207e
        /* renamed from: a */
        Map<String, Provider<C19476v0>> mo21649a();
    }

    @C10267e({C10171f.class})
    @C10159h
    /* renamed from: dagger.hilt.android.internal.lifecycle.d$d */
    public interface C10206d {
        @C10355g
        @C10207e
        /* renamed from: a */
        Map<String, C19476v0> mo21650a();
    }

    public C10202d(@C0359n0 C20437e eVar, @C0363p0 Bundle bundle, @C0359n0 Set<String> set, @C0359n0 C19502x0.C19506b bVar, @C0359n0 C10191f fVar) {
        this.f27917b = set;
        this.f27918c = bVar;
        this.f27919d = new C10203a(fVar);
    }

    /* renamed from: d */
    public static C19502x0.C19506b m38430d(@C0359n0 Activity activity, @C0359n0 C20437e eVar, @C0363p0 Bundle bundle, @C0359n0 C19502x0.C19506b bVar) {
        C10204b bVar2 = (C10204b) C10263c.m38503a(activity, C10204b.class);
        return new C10202d(eVar, bundle, bVar2.mo21647d(), bVar, bVar2.mo21648j());
    }

    @C0359n0
    /* renamed from: a */
    public <T extends C19476v0> T mo21644a(@C0359n0 Class<T> cls, @C0359n0 C19477a aVar) {
        if (this.f27917b.contains(cls.getName())) {
            return this.f27919d.mo21644a(cls, aVar);
        }
        return this.f27918c.mo21644a(cls, aVar);
    }

    @C0359n0
    /* renamed from: b */
    public <T extends C19476v0> T mo21645b(@C0359n0 Class<T> cls) {
        if (this.f27917b.contains(cls.getName())) {
            return this.f27919d.mo21645b(cls);
        }
        return this.f27918c.mo21645b(cls);
    }
}
