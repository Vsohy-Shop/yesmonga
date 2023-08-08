package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,289:1\n153#1,5:290\n153#1,5:295\n153#1,5:300\n153#1,5:305\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n172#1:290,5\n194#1:295,5\n212#1:300,5\n227#1:305,5\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.y0 */
public final class C16331y0 {

    /* renamed from: c */
    public static final int f40552c = 8;
    @C12579k

    /* renamed from: a */
    public final C16321t0 f40553a;
    @C12579k

    /* renamed from: b */
    public final C16303l0 f40554b;

    public C16331y0(@C12579k C16321t0 t0Var, @C12579k C16303l0 l0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "textInputService");
        Intrinsics.checkNotNullParameter(l0Var, "platformTextInputService");
        this.f40553a = t0Var;
        this.f40554b = l0Var;
    }

    /* renamed from: a */
    public final void mo47327a() {
        this.f40553a.mo47321e(this);
    }

    /* renamed from: b */
    public final boolean mo47328b(C11289a<C11079d2> aVar) {
        boolean d = mo47330d();
        if (d) {
            aVar.invoke();
        }
        return d;
    }

    /* renamed from: c */
    public final boolean mo47329c() {
        boolean d = mo47330d();
        if (d) {
            this.f40554b.mo47123d();
        }
        return d;
    }

    /* renamed from: d */
    public final boolean mo47330d() {
        return Intrinsics.areEqual((Object) this.f40553a.mo47317a(), (Object) this);
    }

    /* renamed from: e */
    public final boolean mo47331e(@C12579k C15098i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "rect");
        boolean d = mo47330d();
        if (d) {
            this.f40554b.mo47125f(iVar);
        }
        return d;
    }

    /* renamed from: f */
    public final boolean mo47332f() {
        boolean d = mo47330d();
        if (d) {
            this.f40554b.mo47124e();
        }
        return d;
    }

    /* renamed from: g */
    public final boolean mo47333g(@C12580l TextFieldValue textFieldValue, @C12579k TextFieldValue textFieldValue2) {
        Intrinsics.checkNotNullParameter(textFieldValue2, "newValue");
        boolean d = mo47330d();
        if (d) {
            this.f40554b.mo47121b(textFieldValue, textFieldValue2);
        }
        return d;
    }
}
