package androidx.compose.p004ui;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.f */
public class C8760f extends C15988w0 implements C8767m.C8770c {
    @C12579k

    /* renamed from: d */
    public final C11305q<C8767m, C8592o, Integer, C8767m> f23466d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8760f(@C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12579k C11305q<? super C8767m, ? super C8592o, ? super Integer, ? extends C8767m> qVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        Intrinsics.checkNotNullParameter(qVar, "factory");
        this.f23466d = qVar;
    }

    @C12579k
    /* renamed from: r */
    public final C11305q<C8767m, C8592o, Integer, C8767m> mo17204r() {
        return this.f23466d;
    }
}
