package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.C19764l;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.C11677z;
import kotlin.jvm.C11283a;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.m */
public final class C19766m<Args extends C19764l> implements C11677z<Args> {
    @C12579k

    /* renamed from: a */
    public final C11494d<Args> f50605a;
    @C12579k

    /* renamed from: b */
    public final C11289a<Bundle> f50606b;
    @C12580l

    /* renamed from: c */
    public Args f50607c;

    public C19766m(@C12579k C11494d<Args> dVar, @C12579k C11289a<Bundle> aVar) {
        Intrinsics.checkNotNullParameter(dVar, "navArgsClass");
        Intrinsics.checkNotNullParameter(aVar, "argumentProducer");
        this.f50605a = dVar;
        this.f50606b = aVar;
    }

    @C12579k
    /* renamed from: a */
    public Args getValue() {
        Args args = this.f50607c;
        if (args != null) {
            return args;
        }
        Bundle invoke = this.f50606b.invoke();
        Method method = C19768n.m91908a().get(this.f50605a);
        if (method == null) {
            Class<Args> e = C11283a.m43409e(this.f50605a);
            Class[] b = C19768n.m91909b();
            method = e.getMethod("fromBundle", (Class[]) Arrays.copyOf(b, b.length));
            C19768n.m91908a().put(this.f50605a, method);
            Intrinsics.checkNotNullExpressionValue(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Args invoke2 = method.invoke((Object) null, new Object[]{invoke});
        if (invoke2 != null) {
            Args args2 = (C19764l) invoke2;
            this.f50607c = args2;
            return args2;
        }
        throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
    }

    public boolean isInitialized() {
        return this.f50607c != null;
    }
}
