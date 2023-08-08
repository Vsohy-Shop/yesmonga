package dagger.hilt.android.internal.lifecycle;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.annotation.C0363p0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C19502x0;
import androidx.savedstate.C20437e;
import dagger.C10159h;
import dagger.hilt.C10262b;
import dagger.hilt.C10263c;
import dagger.hilt.C10267e;
import dagger.hilt.android.components.C10166a;
import dagger.hilt.android.components.C10168c;
import dagger.hilt.android.internal.builders.C10191f;
import dagger.hilt.android.internal.lifecycle.C10207e;
import dagger.hilt.internal.C10280f;
import dagger.multibindings.C10355g;
import java.util.Set;
import javax.inject.Inject;

/* renamed from: dagger.hilt.android.internal.lifecycle.a */
public final class C10195a {

    @C10267e({C10166a.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.lifecycle.a$a */
    public interface C10196a {
        /* renamed from: a */
        C10199d mo21635a();
    }

    @C10267e({C10166a.class})
    @C10159h
    /* renamed from: dagger.hilt.android.internal.lifecycle.a$b */
    public interface C10197b {
        @C10355g
        @C10207e.C10208a
        /* renamed from: a */
        Set<String> mo21636a();
    }

    @C10267e({C10168c.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.lifecycle.a$c */
    public interface C10198c {
        /* renamed from: a */
        C10199d mo21637a();
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.a$d */
    public static final class C10199d {

        /* renamed from: a */
        public final Set<String> f27912a;

        /* renamed from: b */
        public final C10191f f27913b;

        @Inject
        public C10199d(@C10207e.C10208a Set<String> set, C10191f fVar) {
            this.f27912a = set;
            this.f27913b = fVar;
        }

        /* renamed from: a */
        public C19502x0.C19506b mo21638a(ComponentActivity componentActivity, C19502x0.C19506b bVar) {
            Bundle bundle;
            if (componentActivity.getIntent() != null) {
                bundle = componentActivity.getIntent().getExtras();
            } else {
                bundle = null;
            }
            return mo21640c(componentActivity, bundle, bVar);
        }

        /* renamed from: b */
        public C19502x0.C19506b mo21639b(Fragment fragment, C19502x0.C19506b bVar) {
            return mo21640c(fragment, fragment.getArguments(), bVar);
        }

        /* renamed from: c */
        public final C19502x0.C19506b mo21640c(C20437e eVar, @C0363p0 Bundle bundle, C19502x0.C19506b bVar) {
            return new C10202d(eVar, bundle, this.f27912a, (C19502x0.C19506b) C10280f.m38506b(bVar), this.f27913b);
        }
    }

    /* renamed from: a */
    public static C19502x0.C19506b m38419a(ComponentActivity componentActivity, C19502x0.C19506b bVar) {
        return ((C10196a) C10263c.m38503a(componentActivity, C10196a.class)).mo21635a().mo21638a(componentActivity, bVar);
    }

    /* renamed from: b */
    public static C19502x0.C19506b m38420b(Fragment fragment, C19502x0.C19506b bVar) {
        return ((C10198c) C10263c.m38503a(fragment, C10198c.class)).mo21637a().mo21639b(fragment, bVar);
    }
}
