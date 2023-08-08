package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: androidx.compose.ui.node.ComposeUiNode */
public interface ComposeUiNode {
    @C12579k

    /* renamed from: m */
    public static final Companion f38797m = Companion.f38798a;

    /* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion */
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f38798a = new Companion();
        @C12579k

        /* renamed from: b */
        public static final C11289a<ComposeUiNode> f38799b = LayoutNode.f38817e1.mo44724a();
        @C12579k

        /* renamed from: c */
        public static final C11289a<ComposeUiNode> f38800c = ComposeUiNode$Companion$VirtualConstructor$1.f38811f;
        @C12579k

        /* renamed from: d */
        public static final C11304p<ComposeUiNode, C8767m, C11079d2> f38801d = ComposeUiNode$Companion$SetModifier$1.f38809f;
        @C12579k

        /* renamed from: e */
        public static final C11304p<ComposeUiNode, C16479d, C11079d2> f38802e = ComposeUiNode$Companion$SetDensity$1.f38806f;
        @C12579k

        /* renamed from: f */
        public static final C11304p<ComposeUiNode, C15560f0, C11079d2> f38803f = ComposeUiNode$Companion$SetMeasurePolicy$1.f38808f;
        @C12579k

        /* renamed from: g */
        public static final C11304p<ComposeUiNode, LayoutDirection, C11079d2> f38804g = ComposeUiNode$Companion$SetLayoutDirection$1.f38807f;
        @C12579k

        /* renamed from: h */
        public static final C11304p<ComposeUiNode, C15863c4, C11079d2> f38805h = ComposeUiNode$Companion$SetViewConfiguration$1.f38810f;

        @C12579k
        /* renamed from: a */
        public final C11289a<ComposeUiNode> mo44585a() {
            return f38799b;
        }

        @C12579k
        /* renamed from: b */
        public final C11304p<ComposeUiNode, C16479d, C11079d2> mo44586b() {
            return f38802e;
        }

        @C12579k
        /* renamed from: c */
        public final C11304p<ComposeUiNode, LayoutDirection, C11079d2> mo44587c() {
            return f38804g;
        }

        @C12579k
        /* renamed from: d */
        public final C11304p<ComposeUiNode, C15560f0, C11079d2> mo44588d() {
            return f38803f;
        }

        @C12579k
        /* renamed from: e */
        public final C11304p<ComposeUiNode, C8767m, C11079d2> mo44589e() {
            return f38801d;
        }

        @C12579k
        /* renamed from: f */
        public final C11304p<ComposeUiNode, C15863c4, C11079d2> mo44590f() {
            return f38805h;
        }

        @C12579k
        /* renamed from: g */
        public final C11289a<ComposeUiNode> mo44591g() {
            return f38800c;
        }
    }

    /* renamed from: a */
    void mo44575a(@C12579k LayoutDirection layoutDirection);

    @C12579k
    /* renamed from: b */
    C8767m mo44576b();

    @C12579k
    C16479d getDensity();

    @C12579k
    LayoutDirection getLayoutDirection();

    @C12579k
    C15863c4 getViewConfiguration();

    /* renamed from: m */
    void mo44580m(@C12579k C15863c4 c4Var);

    /* renamed from: o */
    void mo44581o(@C12579k C15560f0 f0Var);

    /* renamed from: u */
    void mo44582u(@C12579k C8767m mVar);

    /* renamed from: w */
    void mo44583w(@C12579k C16479d dVar);

    @C12579k
    /* renamed from: x */
    C15560f0 mo44584x();
}
