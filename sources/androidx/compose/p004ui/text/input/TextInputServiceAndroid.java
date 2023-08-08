package androidx.compose.p004ui.text.input;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.runtime.collection.C8423g;
import com.google.android.gms.analytics.ecommerce.C40383c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n1182#2:508\n1161#2,2:509\n728#3,2:511\n460#3,11:514\n1#4:513\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n101#1:508\n101#1:509,2\n205#1:511,2\n282#1:514,11\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid */
public final class TextInputServiceAndroid implements C16303l0 {
    @C12579k

    /* renamed from: a */
    public final View f40419a;
    @C12579k

    /* renamed from: b */
    public final C16328x f40420b;
    @C12580l

    /* renamed from: c */
    public final C16290f0 f40421c;
    @C12579k

    /* renamed from: d */
    public final Executor f40422d;
    @C12579k

    /* renamed from: e */
    public C11300l<? super List<? extends C16293h>, C11079d2> f40423e;
    @C12579k

    /* renamed from: f */
    public C11300l<? super C16310p, C11079d2> f40424f;
    @C12579k

    /* renamed from: g */
    public TextFieldValue f40425g;
    @C12579k

    /* renamed from: h */
    public C16313q f40426h;
    @C12579k

    /* renamed from: i */
    public List<WeakReference<C16305m0>> f40427i;
    @C12579k

    /* renamed from: j */
    public final C11677z f40428j;
    @C12580l

    /* renamed from: k */
    public Rect f40429k;
    @C12579k

    /* renamed from: l */
    public final C8423g<TextInputCommand> f40430l;
    @C12580l

    /* renamed from: m */
    public Runnable f40431m;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ui_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand */
    public enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$a */
    public /* synthetic */ class C16269a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand[] r0 = androidx.compose.p004ui.text.input.TextInputServiceAndroid.TextInputCommand.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.p004ui.text.input.TextInputServiceAndroid.TextInputCommand.StartInput     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.p004ui.text.input.TextInputServiceAndroid.TextInputCommand.StopInput     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.p004ui.text.input.TextInputServiceAndroid.TextInputCommand.ShowKeyboard     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.text.input.TextInputServiceAndroid$TextInputCommand r1 = androidx.compose.p004ui.text.input.TextInputServiceAndroid.TextInputCommand.HideKeyboard     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.input.TextInputServiceAndroid.C16269a.<clinit>():void");
        }
    }

    /* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$b */
    public static final class C16270b implements C16324v {

        /* renamed from: a */
        public final /* synthetic */ TextInputServiceAndroid f40437a;

        public C16270b(TextInputServiceAndroid textInputServiceAndroid) {
            this.f40437a = textInputServiceAndroid;
        }

        /* renamed from: a */
        public void mo47134a(int i) {
            this.f40437a.f40424f.invoke(C16310p.m73492i(i));
        }

        /* renamed from: b */
        public void mo47135b(@C12579k List<? extends C16293h> list) {
            Intrinsics.checkNotNullParameter(list, "editCommands");
            this.f40437a.f40423e.invoke(list);
        }

        /* renamed from: c */
        public void mo47136c(@C12579k KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(keyEvent, "event");
            this.f40437a.mo47127m().sendKeyEvent(keyEvent);
        }

        /* renamed from: d */
        public void mo47137d(@C12579k C16305m0 m0Var) {
            Intrinsics.checkNotNullParameter(m0Var, "ic");
            int size = this.f40437a.f40427i.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(((WeakReference) this.f40437a.f40427i.get(i)).get(), (Object) m0Var)) {
                    this.f40437a.f40427i.remove(i);
                    return;
                }
            }
        }
    }

    public TextInputServiceAndroid(@C12579k View view, @C12579k C16328x xVar, @C12580l C16290f0 f0Var, @C12579k Executor executor) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(xVar, "inputMethodManager");
        Intrinsics.checkNotNullParameter(executor, "inputCommandProcessorExecutor");
        this.f40419a = view;
        this.f40420b = xVar;
        this.f40421c = f0Var;
        this.f40422d = executor;
        this.f40423e = TextInputServiceAndroid$onEditCommand$1.f40438f;
        this.f40424f = TextInputServiceAndroid$onImeActionPerformed$1.f40439f;
        this.f40425g = new TextFieldValue("", C16356n0.f40590b.mo47429a(), (C16356n0) null, 4, (DefaultConstructorMarker) null);
        this.f40426h = C16313q.f40529f.mo47302a();
        this.f40427i = new ArrayList();
        this.f40428j = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.f40430l = new C8423g<>(new TextInputCommand[16], 0);
    }

    /* renamed from: q */
    public static final void m73323q(TextInputCommand textInputCommand, Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Boolean> objectRef2) {
        int i = C16269a.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        boolean z = true;
        if (i == 1) {
            T t = Boolean.TRUE;
            objectRef.element = t;
            objectRef2.element = t;
        } else if (i == 2) {
            T t2 = Boolean.FALSE;
            objectRef.element = t2;
            objectRef2.element = t2;
        } else if ((i == 3 || i == 4) && !Intrinsics.areEqual((Object) objectRef.element, (Object) Boolean.FALSE)) {
            if (textInputCommand != TextInputCommand.ShowKeyboard) {
                z = false;
            }
            objectRef2.element = Boolean.valueOf(z);
        }
    }

    /* renamed from: t */
    public static final void m73324t(TextInputServiceAndroid textInputServiceAndroid) {
        Intrinsics.checkNotNullParameter(textInputServiceAndroid, "this$0");
        textInputServiceAndroid.f40431m = null;
        textInputServiceAndroid.mo47130p();
    }

    /* renamed from: a */
    public void mo47120a() {
        C16290f0 f0Var = this.f40421c;
        if (f0Var != null) {
            f0Var.mo47099b();
        }
        this.f40423e = TextInputServiceAndroid$stopInput$1.f40440f;
        this.f40424f = TextInputServiceAndroid$stopInput$2.f40441f;
        this.f40429k = null;
        mo47132s(TextInputCommand.StopInput);
    }

    /* renamed from: b */
    public void mo47121b(@C12580l TextFieldValue textFieldValue, @C12579k TextFieldValue textFieldValue2) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(textFieldValue2, "newValue");
        boolean z2 = true;
        if (!C16356n0.m73735g(this.f40425g.mo47113h(), textFieldValue2.mo47113h()) || !Intrinsics.areEqual((Object) this.f40425g.mo47112g(), (Object) textFieldValue2.mo47112g())) {
            z = true;
        } else {
            z = false;
        }
        this.f40425g = textFieldValue2;
        int size = this.f40427i.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16305m0 m0Var = (C16305m0) this.f40427i.get(i2).get();
            if (m0Var != null) {
                m0Var.mo47259j(textFieldValue2);
            }
        }
        if (!Intrinsics.areEqual((Object) textFieldValue, (Object) textFieldValue2)) {
            if (textFieldValue == null || (Intrinsics.areEqual((Object) textFieldValue.mo47115i(), (Object) textFieldValue2.mo47115i()) && (!C16356n0.m73735g(textFieldValue.mo47113h(), textFieldValue2.mo47113h()) || Intrinsics.areEqual((Object) textFieldValue.mo47112g(), (Object) textFieldValue2.mo47112g())))) {
                z2 = false;
            }
            if (z2) {
                mo47131r();
                return;
            }
            int size2 = this.f40427i.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C16305m0 m0Var2 = (C16305m0) this.f40427i.get(i3).get();
                if (m0Var2 != null) {
                    m0Var2.mo47260k(this.f40425g, this.f40420b);
                }
            }
        } else if (z) {
            C16328x xVar = this.f40420b;
            int l = C16356n0.m73740l(textFieldValue2.mo47113h());
            int k = C16356n0.m73739k(textFieldValue2.mo47113h());
            C16356n0 g = this.f40425g.mo47112g();
            int i4 = -1;
            if (g != null) {
                i = C16356n0.m73740l(g.mo47427r());
            } else {
                i = -1;
            }
            C16356n0 g2 = this.f40425g.mo47112g();
            if (g2 != null) {
                i4 = C16356n0.m73739k(g2.mo47427r());
            }
            xVar.mo47086c(l, k, i, i4);
        }
    }

    /* renamed from: c */
    public void mo47122c(@C12579k TextFieldValue textFieldValue, @C12579k C16313q qVar, @C12579k C11300l<? super List<? extends C16293h>, C11079d2> lVar, @C12579k C11300l<? super C16310p, C11079d2> lVar2) {
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        Intrinsics.checkNotNullParameter(qVar, "imeOptions");
        Intrinsics.checkNotNullParameter(lVar, "onEditCommand");
        Intrinsics.checkNotNullParameter(lVar2, "onImeActionPerformed");
        C16290f0 f0Var = this.f40421c;
        if (f0Var != null) {
            f0Var.mo47098a();
        }
        this.f40425g = textFieldValue;
        this.f40426h = qVar;
        this.f40423e = lVar;
        this.f40424f = lVar2;
        mo47132s(TextInputCommand.StartInput);
    }

    /* renamed from: d */
    public void mo47123d() {
        mo47132s(TextInputCommand.HideKeyboard);
    }

    /* renamed from: e */
    public void mo47124e() {
        mo47132s(TextInputCommand.ShowKeyboard);
    }

    @C11395k(message = "This method should not be called, used BringIntoViewRequester instead.")
    /* renamed from: f */
    public void mo47125f(@C12579k C15098i iVar) {
        Rect rect;
        Intrinsics.checkNotNullParameter(iVar, "rect");
        this.f40429k = new Rect(C11409d.m43851L0(iVar.mo42279t()), C11409d.m43851L0(iVar.mo42249B()), C11409d.m43851L0(iVar.mo42283x()), C11409d.m43851L0(iVar.mo42271j()));
        if (this.f40427i.isEmpty() && (rect = this.f40429k) != null) {
            this.f40419a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @C12579k
    /* renamed from: l */
    public final InputConnection mo47126l(@C12579k EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "outAttrs");
        C16329x0.m73571h(editorInfo, this.f40426h, this.f40425g);
        C16329x0.m73572i(editorInfo);
        C16305m0 m0Var = new C16305m0(this.f40425g, new C16270b(this), this.f40426h.mo47294d());
        this.f40427i.add(new WeakReference(m0Var));
        return m0Var;
    }

    /* renamed from: m */
    public final BaseInputConnection mo47127m() {
        return (BaseInputConnection) this.f40428j.getValue();
    }

    @C12579k
    /* renamed from: n */
    public final TextFieldValue mo47128n() {
        return this.f40425g;
    }

    @C12579k
    /* renamed from: o */
    public final View mo47129o() {
        return this.f40419a;
    }

    /* renamed from: p */
    public final void mo47130p() {
        if (!this.f40419a.isFocused()) {
            this.f40430l.mo15490w();
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        C8423g<TextInputCommand> gVar = this.f40430l;
        int h0 = gVar.mo15469h0();
        if (h0 > 0) {
            Object[] d0 = gVar.mo15462d0();
            int i = 0;
            do {
                m73323q((TextInputCommand) d0[i], objectRef, objectRef2);
                i++;
            } while (i < h0);
        }
        if (Intrinsics.areEqual((Object) objectRef.element, (Object) Boolean.TRUE)) {
            mo47131r();
        }
        Boolean bool = (Boolean) objectRef2.element;
        if (bool != null) {
            mo47133u(bool.booleanValue());
        }
        if (Intrinsics.areEqual((Object) objectRef.element, (Object) Boolean.FALSE)) {
            mo47131r();
        }
    }

    /* renamed from: r */
    public final void mo47131r() {
        this.f40420b.mo47087d();
    }

    /* renamed from: s */
    public final void mo47132s(TextInputCommand textInputCommand) {
        this.f40430l.mo15463e(textInputCommand);
        if (this.f40431m == null) {
            C16323u0 u0Var = new C16323u0(this);
            this.f40422d.execute(u0Var);
            this.f40431m = u0Var;
        }
    }

    /* renamed from: u */
    public final void mo47133u(boolean z) {
        if (z) {
            this.f40420b.mo47085b();
        } else {
            this.f40420b.mo47088e();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextInputServiceAndroid(android.view.View r1, androidx.compose.p004ui.text.input.C16328x r2, androidx.compose.p004ui.text.input.C16290f0 r3, java.util.concurrent.Executor r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0005
            r3 = 0
        L_0x0005:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0016
            android.view.Choreographer r4 = android.view.Choreographer.getInstance()
            java.lang.String r5 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.concurrent.Executor r4 = androidx.compose.p004ui.text.input.C16329x0.m73567d(r4)
        L_0x0016:
            r0.<init>((android.view.View) r1, (androidx.compose.p004ui.text.input.C16328x) r2, (androidx.compose.p004ui.text.input.C16290f0) r3, (java.util.concurrent.Executor) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.input.TextInputServiceAndroid.<init>(android.view.View, androidx.compose.ui.text.input.x, androidx.compose.ui.text.input.f0, java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextInputServiceAndroid(View view, C16290f0 f0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? null : f0Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid(@C12579k View view, @C12580l C16290f0 f0Var) {
        this(view, new InputMethodManagerImpl(view), f0Var, (Executor) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
    }
}
