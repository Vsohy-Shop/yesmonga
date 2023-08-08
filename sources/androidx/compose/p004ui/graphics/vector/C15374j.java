package androidx.compose.p004ui.graphics.vector;

import androidx.compose.runtime.C8403a;
import androidx.compose.runtime.internal.C8567o;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.j */
public final class C15374j extends C8403a<C15373i> {

    /* renamed from: e */
    public static final int f38012e = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15374j(@C12579k C15373i iVar) {
        super(iVar);
        Intrinsics.checkNotNullParameter(iVar, C10108c.f27819v);
    }

    /* renamed from: b */
    public void mo15555b(int i, int i2, int i3) {
        mo43531q((C15373i) mo15321a()).mo43159q(i, i2, i3);
    }

    /* renamed from: c */
    public void mo15556c(int i, int i2) {
        mo43531q((C15373i) mo15321a()).mo43160r(i, i2);
    }

    /* renamed from: n */
    public void mo15327n() {
        C15339b q = mo43531q((C15373i) mo15325l());
        q.mo43160r(0, q.mo43149g());
    }

    /* renamed from: q */
    public final C15339b mo43531q(C15373i iVar) {
        if (iVar instanceof C15339b) {
            return (C15339b) iVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    /* renamed from: r */
    public void mo15559h(int i, @C12579k C15373i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "instance");
    }

    /* renamed from: s */
    public void mo15557e(int i, @C12579k C15373i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "instance");
        mo43531q((C15373i) mo15321a()).mo43158p(i, iVar);
    }
}
