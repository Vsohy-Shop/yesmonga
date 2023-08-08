package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.C16347j;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.input.b */
public final class C16278b implements C16293h {

    /* renamed from: a */
    public static final int f40461a = 0;

    /* renamed from: a */
    public void mo47162a(@C12579k C16297j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "buffer");
        if (jVar.mo47212m()) {
            jVar.mo47202c(jVar.mo47206g(), jVar.mo47205f());
        } else if (jVar.mo47207h() == -1) {
            int l = jVar.mo47211l();
            int k = jVar.mo47210k();
            jVar.mo47216q(jVar.mo47211l());
            jVar.mo47202c(l, k);
        } else if (jVar.mo47207h() != 0) {
            jVar.mo47202c(C16347j.m73633b(jVar.toString(), jVar.mo47207h()), jVar.mo47207h());
        }
    }

    public boolean equals(@C12580l Object obj) {
        return obj instanceof C16278b;
    }

    public int hashCode() {
        return C11342l0.m43547d(C16278b.class).hashCode();
    }

    @C12579k
    public String toString() {
        return "BackspaceCommand()";
    }
}
