package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.graphics.vector.i */
public abstract class C15373i {

    /* renamed from: b */
    public static final int f38010b = 8;
    @C12580l

    /* renamed from: a */
    public C11289a<C11079d2> f38011a;

    public /* synthetic */ C15373i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract void mo43054a(@C12579k C15187e eVar);

    @C12580l
    /* renamed from: b */
    public C11289a<C11079d2> mo43145b() {
        return this.f38011a;
    }

    /* renamed from: c */
    public final void mo43530c() {
        C11289a<C11079d2> b = mo43145b();
        if (b != null) {
            b.invoke();
        }
    }

    /* renamed from: d */
    public void mo43146d(@C12580l C11289a<C11079d2> aVar) {
        this.f38011a = aVar;
    }

    public C15373i() {
    }
}
