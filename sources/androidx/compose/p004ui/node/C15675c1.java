package androidx.compose.p004ui.node;

import android.view.KeyEvent;
import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.autofill.C8713i;
import androidx.compose.p004ui.autofill.C8731z;
import androidx.compose.p004ui.focus.C15059d;
import androidx.compose.p004ui.focus.C15076p;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.hapticfeedback.C15425a;
import androidx.compose.p004ui.input.C15432b;
import androidx.compose.p004ui.input.pointer.C15498t;
import androidx.compose.p004ui.modifier.ModifierLocalManager;
import androidx.compose.p004ui.platform.C15851b;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.C15912k0;
import androidx.compose.p004ui.platform.C15922l4;
import androidx.compose.p004ui.platform.C15996x3;
import androidx.compose.p004ui.text.font.C16238t;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.input.C16301k0;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.node.c1 */
public interface C15675c1 {
    @C12579k

    /* renamed from: n */
    public static final C15676a f38993n = C15676a.f38994a;

    /* renamed from: androidx.compose.ui.node.c1$a */
    public static final class C15676a {

        /* renamed from: a */
        public static final /* synthetic */ C15676a f38994a = new C15676a();

        /* renamed from: b */
        public static boolean f38995b;

        /* renamed from: a */
        public final boolean mo45001a() {
            return f38995b;
        }

        /* renamed from: b */
        public final void mo45002b(boolean z) {
            f38995b = z;
        }
    }

    /* renamed from: androidx.compose.ui.node.c1$b */
    public interface C15677b {
        /* renamed from: n */
        void mo44572n();
    }

    @C8761g
    /* renamed from: B */
    static /* synthetic */ void m70187B() {
    }

    /* renamed from: b */
    static /* synthetic */ void m70188b(C15675c1 c1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            c1Var.mo44963a(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
    }

    @C8761g
    /* renamed from: d */
    static /* synthetic */ void m70189d() {
    }

    /* renamed from: g */
    static /* synthetic */ void m70190g(C15675c1 c1Var, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            c1Var.mo44965e(layoutNode, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
    }

    @C11395k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @C11587t0(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    /* renamed from: k */
    static /* synthetic */ void m70191k() {
    }

    /* renamed from: q */
    static /* synthetic */ void m70192q(C15675c1 c1Var, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            c1Var.mo44964c(layoutNode, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
    }

    /* renamed from: C */
    void mo44958C(@C12579k LayoutNode layoutNode);

    @C12579k
    /* renamed from: F */
    C15672b1 mo44959F(@C12579k C11300l<? super C15118b2, C11079d2> lVar, @C12579k C11289a<C11079d2> aVar);

    /* renamed from: G */
    void mo44960G(@C12579k C11289a<C11079d2> aVar);

    /* renamed from: H */
    void mo44961H();

    /* renamed from: I */
    void mo44962I();

    /* renamed from: a */
    void mo44963a(boolean z);

    /* renamed from: c */
    void mo44964c(@C12579k LayoutNode layoutNode, boolean z, boolean z2);

    /* renamed from: e */
    void mo44965e(@C12579k LayoutNode layoutNode, boolean z, boolean z2);

    @C12579k
    C15851b getAccessibilityManager();

    @C12580l
    @C8761g
    C8713i getAutofill();

    @C8761g
    @C12579k
    C8731z getAutofillTree();

    @C12579k
    C15912k0 getClipboardManager();

    @C12579k
    C16479d getDensity();

    @C12579k
    C15076p getFocusOwner();

    @C12579k
    C16242u.C16244b getFontFamilyResolver();

    @C12579k
    C16238t.C16240b getFontLoader();

    @C12579k
    C15425a getHapticFeedBack();

    @C12579k
    C15432b getInputModeManager();

    @C12579k
    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    @C12579k
    ModifierLocalManager getModifierLocalManager();

    @C12579k
    C16301k0 getPlatformTextInputPluginRegistry();

    @C12579k
    C15498t getPointerIconService();

    @C12579k
    LayoutNode getRoot();

    @C12579k
    C15698j1 getRootForTest();

    @C12579k
    C15674c0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    @C12579k
    OwnerSnapshotObserver getSnapshotObserver();

    @C12579k
    C16321t0 getTextInputService();

    @C12579k
    C15996x3 getTextToolbar();

    @C12579k
    C15863c4 getViewConfiguration();

    @C12579k
    C15922l4 getWindowInfo();

    /* renamed from: h */
    long mo44990h(long j);

    /* renamed from: j */
    void mo44991j(@C12579k LayoutNode layoutNode);

    /* renamed from: l */
    void mo44992l(@C12579k LayoutNode layoutNode);

    /* renamed from: m */
    void mo44993m(@C12579k LayoutNode layoutNode);

    /* renamed from: o */
    void mo44994o(@C12579k C15677b bVar);

    boolean requestFocus();

    @C15727r
    void setShowLayoutBounds(boolean z);

    @C12580l
    /* renamed from: t */
    C15059d mo44997t(@C12579k KeyEvent keyEvent);

    /* renamed from: u */
    void mo44998u(@C12579k LayoutNode layoutNode);

    /* renamed from: w */
    void mo44999w(@C12579k LayoutNode layoutNode, long j);

    /* renamed from: z */
    long mo45000z(long j);
}
