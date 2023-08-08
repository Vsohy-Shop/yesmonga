package androidx.compose.p004ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.p004ui.text.C16356n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,403:1\n80#1,5:404\n80#1,5:409\n80#1,5:414\n80#1,5:419\n80#1,5:424\n80#1,5:429\n80#1,5:434\n80#1,5:439\n80#1,5:444\n80#1,5:449\n80#1,5:454\n80#1,5:459\n80#1,5:464\n80#1,5:469\n80#1,5:474\n80#1,5:479\n80#1,5:484\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n139#1:404,5\n175#1:409,5\n180#1:414,5\n186#1:419,5\n194#1:424,5\n205#1:429,5\n211#1:434,5\n217#1:439,5\n223#1:444,5\n259#1:449,5\n295#1:454,5\n321#1:459,5\n344#1:464,5\n354#1:469,5\n366#1:474,5\n386#1:479,5\n395#1:484,5\n*E\n"})
/* renamed from: androidx.compose.ui.text.input.m0 */
public final class C16305m0 implements InputConnection {
    @C12579k

    /* renamed from: a */
    public final C16324v f40502a;

    /* renamed from: b */
    public final boolean f40503b;

    /* renamed from: c */
    public int f40504c;
    @C12579k

    /* renamed from: d */
    public TextFieldValue f40505d;

    /* renamed from: e */
    public int f40506e;

    /* renamed from: f */
    public boolean f40507f;
    @C12579k

    /* renamed from: g */
    public final List<C16293h> f40508g = new ArrayList();

    /* renamed from: h */
    public boolean f40509h = true;

    public C16305m0(@C12579k TextFieldValue textFieldValue, @C12579k C16324v vVar, boolean z) {
        Intrinsics.checkNotNullParameter(textFieldValue, "initState");
        Intrinsics.checkNotNullParameter(vVar, "eventCallback");
        this.f40502a = vVar;
        this.f40503b = z;
        this.f40505d = textFieldValue;
    }

    /* renamed from: a */
    public final void mo47233a(C16293h hVar) {
        mo47234b();
        try {
            this.f40508g.add(hVar);
        } finally {
            mo47236c();
        }
    }

    /* renamed from: b */
    public final boolean mo47234b() {
        this.f40504c++;
        return true;
    }

    public boolean beginBatchEdit() {
        boolean z = this.f40509h;
        if (z) {
            return mo47234b();
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo47236c() {
        int i = this.f40504c - 1;
        this.f40504c = i;
        if (i == 0 && (!this.f40508g.isEmpty())) {
            this.f40502a.mo47135b(CollectionsKt___CollectionsKt.m40572T5(this.f40508g));
            this.f40508g.clear();
        }
        if (this.f40504c > 0) {
            return true;
        }
        return false;
    }

    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f40509h;
        if (z) {
            return false;
        }
        return z;
    }

    public void closeConnection() {
        this.f40508g.clear();
        this.f40504c = 0;
        this.f40509h = false;
        this.f40502a.mo47137d(this);
    }

    public boolean commitCompletion(@C12580l CompletionInfo completionInfo) {
        boolean z = this.f40509h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitContent(@C12579k InputContentInfo inputContentInfo, int i, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(inputContentInfo, "inputContentInfo");
        boolean z = this.f40509h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean commitCorrection(@C12580l CorrectionInfo correctionInfo) {
        boolean z = this.f40509h;
        if (z) {
            return this.f40503b;
        }
        return z;
    }

    public boolean commitText(@C12580l CharSequence charSequence, int i) {
        boolean z = this.f40509h;
        if (z) {
            mo47233a(new C16280c(String.valueOf(charSequence), i));
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo47243d(C11289a<C11079d2> aVar) {
        boolean z = this.f40509h;
        if (z) {
            aVar.invoke();
        }
        return z;
    }

    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f40509h;
        if (!z) {
            return z;
        }
        mo47233a(new C16289f(i, i2));
        return true;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f40509h;
        if (!z) {
            return z;
        }
        mo47233a(new C16291g(i, i2));
        return true;
    }

    /* renamed from: e */
    public final boolean mo47246e() {
        return this.f40503b;
    }

    public boolean endBatchEdit() {
        return mo47236c();
    }

    @C12579k
    /* renamed from: f */
    public final C16324v mo47248f() {
        return this.f40502a;
    }

    public boolean finishComposingText() {
        boolean z = this.f40509h;
        if (!z) {
            return z;
        }
        mo47233a(new C16302l());
        return true;
    }

    @C12579k
    /* renamed from: g */
    public final TextFieldValue mo47250g() {
        return this.f40505d;
    }

    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.f40505d.mo47115i(), C16356n0.m73740l(this.f40505d.mo47113h()), i);
    }

    @C12579k
    public ExtractedText getExtractedText(@C12580l ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.f40507f = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.f40506e = i2;
        }
        return C16330y.m73573a(this.f40505d);
    }

    @C12580l
    public Handler getHandler() {
        return null;
    }

    @C12580l
    public CharSequence getSelectedText(int i) {
        if (C16356n0.m73736h(this.f40505d.mo47113h())) {
            return null;
        }
        return C16317r0.m73531a(this.f40505d).toString();
    }

    @C12579k
    public CharSequence getTextAfterCursor(int i, int i2) {
        return C16317r0.m73532b(this.f40505d, i).toString();
    }

    @C12579k
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return C16317r0.m73533c(this.f40505d, i).toString();
    }

    /* renamed from: h */
    public final void mo47257h(String str) {
    }

    /* renamed from: i */
    public final void mo47258i(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    /* renamed from: j */
    public final void mo47259j(@C12579k TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "value");
        this.f40505d = textFieldValue;
    }

    /* renamed from: k */
    public final void mo47260k(@C12579k TextFieldValue textFieldValue, @C12579k C16328x xVar) {
        int i;
        Intrinsics.checkNotNullParameter(textFieldValue, "state");
        Intrinsics.checkNotNullParameter(xVar, "inputMethodManager");
        if (this.f40509h) {
            mo47259j(textFieldValue);
            if (this.f40507f) {
                xVar.mo47084a(this.f40506e, C16330y.m73573a(textFieldValue));
            }
            C16356n0 g = textFieldValue.mo47112g();
            int i2 = -1;
            if (g != null) {
                i = C16356n0.m73740l(g.mo47427r());
            } else {
                i = -1;
            }
            C16356n0 g2 = textFieldValue.mo47112g();
            if (g2 != null) {
                i2 = C16356n0.m73739k(g2.mo47427r());
            }
            xVar.mo47086c(C16356n0.m73740l(textFieldValue.mo47113h()), C16356n0.m73739k(textFieldValue.mo47113h()), i, i2);
        }
    }

    public boolean performContextMenuAction(int i) {
        boolean z = this.f40509h;
        if (z) {
            z = false;
            switch (i) {
                case 16908319:
                    mo47233a(new C16315q0(0, this.f40505d.mo47115i().length()));
                    break;
                case 16908320:
                    mo47258i(277);
                    break;
                case 16908321:
                    mo47258i(278);
                    break;
                case 16908322:
                    mo47258i(279);
                    break;
            }
        }
        return z;
    }

    public boolean performEditorAction(int i) {
        int i2;
        boolean z = this.f40509h;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = C16310p.f40516b.mo47281e();
                    break;
                case 3:
                    i2 = C16310p.f40516b.mo47285m();
                    break;
                case 4:
                    i2 = C16310p.f40516b.mo47286o();
                    break;
                case 5:
                    i2 = C16310p.f40516b.mo47282g();
                    break;
                case 6:
                    i2 = C16310p.f40516b.mo47280c();
                    break;
                case 7:
                    i2 = C16310p.f40516b.mo47284k();
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("IME sends unsupported Editor Action: ");
                    sb.append(i);
                    i2 = C16310p.f40516b.mo47279a();
                    break;
            }
        } else {
            i2 = C16310p.f40516b.mo47279a();
        }
        this.f40502a.mo47134a(i2);
        return true;
    }

    public boolean performPrivateCommand(@C12580l String str, @C12580l Bundle bundle) {
        boolean z = this.f40509h;
        if (z) {
            return true;
        }
        return z;
    }

    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public boolean requestCursorUpdates(int i) {
        boolean z = this.f40509h;
        if (z) {
            return false;
        }
        return z;
    }

    public boolean sendKeyEvent(@C12579k KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        boolean z = this.f40509h;
        if (!z) {
            return z;
        }
        this.f40502a.mo47136c(keyEvent);
        return true;
    }

    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f40509h;
        if (z) {
            mo47233a(new C16309o0(i, i2));
        }
        return z;
    }

    public boolean setComposingText(@C12580l CharSequence charSequence, int i) {
        boolean z = this.f40509h;
        if (z) {
            mo47233a(new C16312p0(String.valueOf(charSequence), i));
        }
        return z;
    }

    public boolean setSelection(int i, int i2) {
        boolean z = this.f40509h;
        if (!z) {
            return z;
        }
        mo47233a(new C16315q0(i, i2));
        return true;
    }
}
