package androidx.compose.p004ui.text.input;

import androidx.compose.p004ui.text.AnnotatedStringKt;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.runtime.internal.C8567o;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n33#2,6:174\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:174,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.EditProcessor */
public final class EditProcessor {

    /* renamed from: c */
    public static final int f40388c = 8;
    @C12579k

    /* renamed from: a */
    public TextFieldValue f40389a = new TextFieldValue(AnnotatedStringKt.m72256o(), C16356n0.f40590b.mo47429a(), (C16356n0) null, (DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: b */
    public C16297j f40390b = new C16297j(this.f40389a.mo47111f(), this.f40389a.mo47113h(), (DefaultConstructorMarker) null);

    @C12579k
    /* renamed from: b */
    public final TextFieldValue mo47076b(@C12579k List<? extends C16293h> list) {
        C16293h hVar;
        Exception e;
        Intrinsics.checkNotNullParameter(list, "editCommands");
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                hVar = (C16293h) list.get(i);
                try {
                    hVar.mo47162a(this.f40390b);
                    i++;
                    C16293h hVar2 = hVar;
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(mo47077c(list, hVar), e);
                }
            }
            TextFieldValue textFieldValue = new TextFieldValue(this.f40390b.mo47221u(), this.f40390b.mo47209j(), this.f40390b.mo47204e(), (DefaultConstructorMarker) null);
            this.f40389a = textFieldValue;
            return textFieldValue;
        } catch (Exception e3) {
            hVar = null;
            e = e3;
            throw new RuntimeException(mo47077c(list, hVar), e);
        }
    }

    /* renamed from: c */
    public final String mo47077c(List<? extends C16293h> list, C16293h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.f40390b.mo47208i() + ", composition=" + this.f40390b.mo47204e() + ", selection=" + C16356n0.m73745q(this.f40390b.mo47209j()) + "):");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append(10);
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        CollectionsKt___CollectionsKt.m40629f3(list, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new EditProcessor$generateBatchErrorMessage$1$1(hVar, this), 60, (Object) null);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @C12579k
    /* renamed from: d */
    public final C16297j mo47078d() {
        return this.f40390b;
    }

    @C12579k
    /* renamed from: e */
    public final TextFieldValue mo47079e() {
        return this.f40389a;
    }

    /* renamed from: f */
    public final void mo47080f(@C12579k TextFieldValue textFieldValue, @C12580l C16331y0 y0Var) {
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual((Object) textFieldValue.mo47112g(), (Object) this.f40390b.mo47204e());
        boolean z3 = false;
        if (!Intrinsics.areEqual((Object) this.f40389a.mo47111f(), (Object) textFieldValue.mo47111f())) {
            this.f40390b = new C16297j(textFieldValue.mo47111f(), textFieldValue.mo47113h(), (DefaultConstructorMarker) null);
        } else if (!C16356n0.m73735g(this.f40389a.mo47113h(), textFieldValue.mo47113h())) {
            this.f40390b.mo47217r(C16356n0.m73740l(textFieldValue.mo47113h()), C16356n0.m73739k(textFieldValue.mo47113h()));
            z3 = true;
            z = false;
        } else {
            z = false;
        }
        if (textFieldValue.mo47112g() == null) {
            this.f40390b.mo47201b();
        } else if (!C16356n0.m73736h(textFieldValue.mo47112g().mo47427r())) {
            this.f40390b.mo47215p(C16356n0.m73740l(textFieldValue.mo47112g().mo47427r()), C16356n0.m73739k(textFieldValue.mo47112g().mo47427r()));
        }
        if (z || (!z3 && z2)) {
            this.f40390b.mo47201b();
            textFieldValue = TextFieldValue.m73307d(textFieldValue, (C16156d) null, 0, (C16356n0) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue2 = this.f40389a;
        this.f40389a = textFieldValue;
        if (y0Var != null) {
            y0Var.mo47333g(textFieldValue2, textFieldValue);
        }
    }

    /* renamed from: g */
    public final String mo47081g(C16293h hVar) {
        if (hVar instanceof C16280c) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommitTextCommand(text.length=");
            C16280c cVar = (C16280c) hVar;
            sb.append(cVar.mo47172d().length());
            sb.append(", newCursorPosition=");
            sb.append(cVar.mo47171c());
            sb.append(')');
            return sb.toString();
        } else if (hVar instanceof C16312p0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SetComposingTextCommand(text.length=");
            C16312p0 p0Var = (C16312p0) hVar;
            sb2.append(p0Var.mo47289d().length());
            sb2.append(", newCursorPosition=");
            sb2.append(p0Var.mo47288c());
            sb2.append(')');
            return sb2.toString();
        } else if (hVar instanceof C16309o0) {
            return hVar.toString();
        } else {
            if (hVar instanceof C16289f) {
                return hVar.toString();
            }
            if (hVar instanceof C16291g) {
                return hVar.toString();
            }
            if (hVar instanceof C16315q0) {
                return hVar.toString();
            }
            if (hVar instanceof C16302l) {
                return hVar.toString();
            }
            if (hVar instanceof C16278b) {
                return hVar.toString();
            }
            if (hVar instanceof C16279b0) {
                return hVar.toString();
            }
            if (hVar instanceof C16287e) {
                return hVar.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown EditCommand: ");
            String s = C11342l0.m43547d(hVar.getClass()).mo22848s();
            if (s == null) {
                s = "{anonymous EditCommand}";
            }
            sb3.append(s);
            return sb3.toString();
        }
    }

    @C12579k
    /* renamed from: h */
    public final TextFieldValue mo47082h() {
        return this.f40389a;
    }
}
