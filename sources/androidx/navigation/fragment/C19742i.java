package androidx.navigation.fragment;

import androidx.annotation.C0329d0;
import androidx.fragment.app.Fragment;
import androidx.navigation.C19691a0;
import androidx.navigation.C19853z;
import androidx.navigation.fragment.C19737h;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.C11283a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

@C19691a0
/* renamed from: androidx.navigation.fragment.i */
public final class C19742i extends C19853z<C19737h.C19739b> {
    @C12579k

    /* renamed from: h */
    public C11494d<? extends Fragment> f50567h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11395k(message = "Use routes to build your FragmentNavigatorDestination instead", replaceWith = @C11587t0(expression = "FragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public C19742i(@C12579k C19737h hVar, @C0329d0 int i, @C12579k C11494d<? extends Fragment> dVar) {
        super(hVar, i);
        Intrinsics.checkNotNullParameter(hVar, "navigator");
        Intrinsics.checkNotNullParameter(dVar, "fragmentClass");
        this.f50567h = dVar;
    }

    @C12579k
    /* renamed from: k */
    public C19737h.C19739b mo58331c() {
        C19737h.C19739b bVar = (C19737h.C19739b) super.mo58331c();
        String name = C11283a.m43409e(this.f50567h).getName();
        Intrinsics.checkNotNullExpressionValue(name, "fragmentClass.java.name");
        bVar.mo58422G0(name);
        return bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19742i(@C12579k C19737h hVar, @C12579k String str, @C12579k C11494d<? extends Fragment> dVar) {
        super(hVar, str);
        Intrinsics.checkNotNullParameter(hVar, "navigator");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(dVar, "fragmentClass");
        this.f50567h = dVar;
    }
}
