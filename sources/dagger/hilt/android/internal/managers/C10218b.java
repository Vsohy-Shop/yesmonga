package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10262b;
import dagger.hilt.C10263c;
import dagger.hilt.C10267e;
import dagger.hilt.android.C10162a;
import dagger.hilt.android.C10174e;
import dagger.hilt.android.components.C10167b;
import dagger.hilt.android.internal.builders.C10187b;
import dagger.hilt.android.internal.lifecycle.C10212i;
import dagger.hilt.android.scopes.C10256a;
import dagger.hilt.components.C10265a;
import dagger.hilt.internal.C10274c;

/* renamed from: dagger.hilt.android.internal.managers.b */
public final class C10218b implements C10274c<C10167b> {

    /* renamed from: a */
    public final C19502x0 f27937a;
    @C0363p0

    /* renamed from: b */
    public volatile C10167b f27938b;

    /* renamed from: c */
    public final Object f27939c = new Object();

    /* renamed from: dagger.hilt.android.internal.managers.b$a */
    public class C10219a implements C19502x0.C19506b {

        /* renamed from: b */
        public final /* synthetic */ Context f27940b;

        public C10219a(Context context) {
            this.f27940b = context;
        }

        @C0359n0
        /* renamed from: b */
        public <T extends C19476v0> T mo21645b(@C0359n0 Class<T> cls) {
            return new C10221c(((C10220b) C10174e.m38392d(this.f27940b, C10220b.class)).mo21669r().mo21621g());
        }
    }

    @C10267e({C10265a.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.managers.b$b */
    public interface C10220b {
        /* renamed from: r */
        C10187b mo21669r();
    }

    /* renamed from: dagger.hilt.android.internal.managers.b$c */
    public static final class C10221c extends C19476v0 {

        /* renamed from: a */
        public final C10167b f27942a;

        public C10221c(C10167b bVar) {
            this.f27942a = bVar;
        }

        /* renamed from: c0 */
        public C10167b mo21670c0() {
            return this.f27942a;
        }

        public void onCleared() {
            super.onCleared();
            ((C10212i) ((C10222d) C10263c.m38503a(this.f27942a, C10222d.class)).mo21672b()).mo21653c();
        }
    }

    @C10267e({C10167b.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.managers.b$d */
    public interface C10222d {
        /* renamed from: b */
        C10162a mo21672b();
    }

    @C10267e({C10167b.class})
    @C10159h
    /* renamed from: dagger.hilt.android.internal.managers.b$e */
    public static abstract class C10223e {
        @C10256a
        @C10315i
        /* renamed from: a */
        public static C10162a m38463a() {
            return new C10212i();
        }
    }

    public C10218b(ComponentActivity componentActivity) {
        this.f27937a = mo21668c(componentActivity, componentActivity);
    }

    /* renamed from: a */
    public final C10167b mo21666a() {
        return ((C10221c) this.f27937a.mo57693a(C10221c.class)).mo21670c0();
    }

    /* renamed from: b */
    public C10167b generatedComponent() {
        if (this.f27938b == null) {
            synchronized (this.f27939c) {
                if (this.f27938b == null) {
                    this.f27938b = mo21666a();
                }
            }
        }
        return this.f27938b;
    }

    /* renamed from: c */
    public final C19502x0 mo21668c(C19395b1 b1Var, Context context) {
        return new C19502x0(b1Var, (C19502x0.C19506b) new C10219a(context));
    }
}
