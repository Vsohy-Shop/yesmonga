package dagger.hilt.android.flags;

import android.content.Context;
import dagger.C10159h;
import dagger.hilt.C10262b;
import dagger.hilt.C10267e;
import dagger.hilt.android.C10174e;
import dagger.hilt.components.C10265a;
import dagger.hilt.internal.C10280f;
import dagger.multibindings.C10355g;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Set;
import javax.inject.Qualifier;

/* renamed from: dagger.hilt.android.flags.a */
public final class C10176a {

    @Qualifier
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
    /* renamed from: dagger.hilt.android.flags.a$a */
    public @interface C10177a {
    }

    @C10267e({C10265a.class})
    @C10262b
    /* renamed from: dagger.hilt.android.flags.a$b */
    public interface C10178b {
        @C10177a
        /* renamed from: i */
        Set<Boolean> mo21617i();
    }

    @C10267e({C10265a.class})
    @C10159h
    /* renamed from: dagger.hilt.android.flags.a$c */
    public static abstract class C10179c {
        @C10355g
        @C10177a
        /* renamed from: a */
        public abstract Set<Boolean> mo21618a();
    }

    /* renamed from: a */
    public static boolean m38399a(Context context) {
        boolean z;
        Set<Boolean> i = ((C10178b) C10174e.m38392d(context, C10178b.class)).mo21617i();
        if (i.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        C10280f.m38508d(z, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (i.isEmpty()) {
            return true;
        }
        return i.iterator().next().booleanValue();
    }
}
