package androidx.compose.foundation.text;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "b", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nTextFieldSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n76#2:117\n76#2:118\n76#2:119\n50#3:120\n49#3:121\n50#3:128\n49#3:129\n25#3:136\n1114#4,6:122\n1114#4,6:130\n1114#4,6:137\n76#5:143\n*S KotlinDebug\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n*L\n40#1:117\n41#1:118\n42#1:119\n44#1:120\n44#1:121\n47#1:128\n47#1:129\n56#1:136\n44#1:122,6\n47#1:130,6\n56#1:137,6\n47#1:143\n*E\n"})
public final class TextFieldSizeKt$textFieldMinSize$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C16361p0 $style;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1(C16361p0 p0Var) {
        super(3);
        this.$style = p0Var;
    }

    /* renamed from: c */
    public static final Object m12475c(C8578k2<? extends Object> k2Var) {
        return k2Var.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.text.p0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.runtime.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: androidx.compose.foundation.text.w} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo9429b(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r11 = 1582736677(0x5e56a525, float:3.86670229E18)
            r12.mo14918M(r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0017
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)"
            androidx.compose.runtime.ComposerKt.m29845w0(r11, r13, r0, r1)
        L_0x0017:
            androidx.compose.runtime.i1 r11 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r11 = r12.mo15032w(r11)
            androidx.compose.ui.unit.d r11 = (androidx.compose.p004ui.unit.C16479d) r11
            androidx.compose.runtime.i1 r13 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71013k()
            java.lang.Object r13 = r12.mo15032w(r13)
            androidx.compose.ui.text.font.u$b r13 = (androidx.compose.p004ui.text.font.C16242u.C16244b) r13
            androidx.compose.runtime.i1 r0 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71018p()
            java.lang.Object r0 = r12.mo15032w(r0)
            r6 = r0
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p004ui.unit.LayoutDirection) r6
            androidx.compose.ui.text.p0 r0 = r10.$style
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.mo14918M(r1)
            boolean r2 = r12.mo15006n0(r0)
            boolean r3 = r12.mo15006n0(r6)
            r2 = r2 | r3
            java.lang.Object r3 = r12.mo14921N()
            if (r2 != 0) goto L_0x0055
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x005c
        L_0x0055:
            androidx.compose.ui.text.p0 r3 = androidx.compose.p004ui.text.C16402q0.m73989d(r0, r6)
            r12.mo14893C(r3)
        L_0x005c:
            r12.mo15002m0()
            r7 = r3
            androidx.compose.ui.text.p0 r7 = (androidx.compose.p004ui.text.C16361p0) r7
            r12.mo14918M(r1)
            boolean r0 = r12.mo15006n0(r13)
            boolean r1 = r12.mo15006n0(r7)
            r0 = r0 | r1
            java.lang.Object r1 = r12.mo14921N()
            if (r0 != 0) goto L_0x007c
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00b5
        L_0x007c:
            androidx.compose.ui.text.font.u r0 = r7.mo47513u()
            androidx.compose.ui.text.font.i0 r1 = r7.mo47518z()
            if (r1 != 0) goto L_0x008c
            androidx.compose.ui.text.font.i0$a r1 = androidx.compose.p004ui.text.font.C16209i0.f40292b
            androidx.compose.ui.text.font.i0 r1 = r1.mo46952m()
        L_0x008c:
            androidx.compose.ui.text.font.e0 r2 = r7.mo47516x()
            if (r2 == 0) goto L_0x0097
            int r2 = r2.mo46880j()
            goto L_0x009d
        L_0x0097:
            androidx.compose.ui.text.font.e0$a r2 = androidx.compose.p004ui.text.font.C16190e0.f40252b
            int r2 = r2.mo46883b()
        L_0x009d:
            androidx.compose.ui.text.font.f0 r3 = r7.mo47517y()
            if (r3 == 0) goto L_0x00a8
            int r3 = r3.mo46893m()
            goto L_0x00ae
        L_0x00a8:
            androidx.compose.ui.text.font.f0$a r3 = androidx.compose.p004ui.text.font.C16194f0.f40257b
            int r3 = r3.mo46895a()
        L_0x00ae:
            androidx.compose.runtime.k2 r1 = r13.mo46784b(r0, r1, r2, r3)
            r12.mo14893C(r1)
        L_0x00b5:
            r12.mo15002m0()
            r8 = r1
            androidx.compose.runtime.k2 r8 = (androidx.compose.runtime.C8578k2) r8
            androidx.compose.ui.text.p0 r4 = r10.$style
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo14918M(r0)
            java.lang.Object r0 = r12.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r0 != r1) goto L_0x00df
            androidx.compose.foundation.text.w r9 = new androidx.compose.foundation.text.w
            java.lang.Object r5 = m12475c(r8)
            r0 = r9
            r1 = r6
            r2 = r11
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r12.mo14893C(r9)
        L_0x00df:
            r12.mo15002m0()
            r9 = r0
            androidx.compose.foundation.text.w r9 = (androidx.compose.foundation.text.C2849w) r9
            java.lang.Object r5 = m12475c(r8)
            r0 = r9
            r1 = r6
            r2 = r11
            r3 = r13
            r4 = r7
            r0.mo9923m(r1, r2, r3, r4, r5)
            androidx.compose.ui.m$a r11 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1 r13 = new androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1
            r13.<init>(r9)
            androidx.compose.ui.m r11 = androidx.compose.p004ui.layout.C15610w.m69384a(r11, r13)
            boolean r13 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r13 == 0) goto L_0x0105
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0105:
            r12.mo15002m0()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1.mo9429b(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo9429b((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
