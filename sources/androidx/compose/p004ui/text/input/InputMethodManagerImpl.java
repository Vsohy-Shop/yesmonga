package androidx.compose.p004ui.text.input;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.analytics.ecommerce.C40383c;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl */
public final class InputMethodManagerImpl implements C16328x {
    @C12579k

    /* renamed from: a */
    public final View f40391a;
    @C12579k

    /* renamed from: b */
    public final C11677z f40392b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new InputMethodManagerImpl$imm$2(this));
    @C12579k

    /* renamed from: c */
    public final C16322u f40393c;

    public InputMethodManagerImpl(@C12579k View view) {
        C16322u uVar;
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        this.f40391a = view;
        if (Build.VERSION.SDK_INT < 30) {
            uVar = new C16318s(view);
        } else {
            uVar = new C16320t(view);
        }
        this.f40393c = uVar;
    }

    /* renamed from: a */
    public void mo47084a(int i, @C12579k ExtractedText extractedText) {
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        mo47089g().updateExtractedText(this.f40391a, i, extractedText);
    }

    /* renamed from: b */
    public void mo47085b() {
        this.f40393c.mo47310b(mo47089g());
    }

    /* renamed from: c */
    public void mo47086c(int i, int i2, int i3, int i4) {
        mo47089g().updateSelection(this.f40391a, i, i2, i3, i4);
    }

    /* renamed from: d */
    public void mo47087d() {
        mo47089g().restartInput(this.f40391a);
    }

    /* renamed from: e */
    public void mo47088e() {
        this.f40393c.mo47309a(mo47089g());
    }

    /* renamed from: g */
    public final InputMethodManager mo47089g() {
        return (InputMethodManager) this.f40392b.getValue();
    }
}
