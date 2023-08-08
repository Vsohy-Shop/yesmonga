package androidx.navigation.fragment;

import androidx.annotation.C0329d0;
import androidx.fragment.app.C19215c;
import androidx.navigation.C19691a0;
import androidx.navigation.C19853z;
import androidx.navigation.fragment.C19731d;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.C11283a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

@C19691a0
/* renamed from: androidx.navigation.fragment.e */
public final class C19734e extends C19853z<C19731d.C19733b> {
    @C12579k

    /* renamed from: h */
    public C11494d<? extends C19215c> f50556h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11395k(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @C11587t0(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public C19734e(@C12579k C19731d dVar, @C0329d0 int i, @C12579k C11494d<? extends C19215c> dVar2) {
        super(dVar, i);
        Intrinsics.checkNotNullParameter(dVar, "navigator");
        Intrinsics.checkNotNullParameter(dVar2, "fragmentClass");
        this.f50556h = dVar2;
    }

    @C12579k
    /* renamed from: k */
    public C19731d.C19733b mo58331c() {
        C19731d.C19733b bVar = (C19731d.C19733b) super.mo58331c();
        String name = C11283a.m43409e(this.f50556h).getName();
        Intrinsics.checkNotNullExpressionValue(name, "fragmentClass.java.name");
        bVar.mo58416G0(name);
        return bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19734e(@C12579k C19731d dVar, @C12579k String str, @C12579k C11494d<? extends C19215c> dVar2) {
        super(dVar, str);
        Intrinsics.checkNotNullParameter(dVar, "navigator");
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(dVar2, "fragmentClass");
        this.f50556h = dVar2;
    }
}
