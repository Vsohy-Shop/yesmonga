package androidx.compose.p004ui.text.android.selection;

import androidx.compose.p004ui.text.android.C16080i;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.android.selection.b */
public final class C16113b {
    @C12579k

    /* renamed from: e */
    public static final C16114a f40068e = new C16114a((DefaultConstructorMarker) null);

    /* renamed from: f */
    public static final int f40069f = 50;
    @C12579k

    /* renamed from: a */
    public final CharSequence f40070a;

    /* renamed from: b */
    public final int f40071b;

    /* renamed from: c */
    public final int f40072c;
    @C12579k

    /* renamed from: d */
    public final BreakIterator f40073d;

    /* renamed from: androidx.compose.ui.text.android.selection.b$a */
    public static final class C16114a {
        public /* synthetic */ C16114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo46545a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public C16114a() {
        }
    }

    public C16113b(@C12579k CharSequence charSequence, int i, int i2, @C12580l Locale locale) {
        boolean z;
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.f40070a = charSequence;
        boolean z2 = true;
        if (i < 0 || i > charSequence.length()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if ((i2 < 0 || i2 > charSequence.length()) ? false : z2) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
                this.f40073d = wordInstance;
                this.f40071b = Math.max(0, i - 50);
                this.f40072c = Math.min(charSequence.length(), i2 + 50);
                wordInstance.setText(new C16080i(charSequence, i, i2));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    /* renamed from: a */
    public final void mo46530a(int i) {
        int i2 = this.f40071b;
        boolean z = false;
        if (i <= this.f40072c && i2 <= i) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(("Invalid offset: " + i + ". Valid range is [" + this.f40071b + " , " + this.f40072c + C12361b.f30261l).toString());
        }
    }

    /* renamed from: b */
    public final int mo46531b(int i, boolean z) {
        mo46530a(i);
        if (mo46539j(i)) {
            if (!this.f40073d.isBoundary(i) || (mo46537h(i) && z)) {
                return this.f40073d.preceding(i);
            }
            return i;
        } else if (mo46537h(i)) {
            return this.f40073d.preceding(i);
        } else {
            return -1;
        }
    }

    /* renamed from: c */
    public final int mo46532c(int i, boolean z) {
        mo46530a(i);
        if (mo46537h(i)) {
            if (!this.f40073d.isBoundary(i) || (mo46539j(i) && z)) {
                return this.f40073d.following(i);
            }
            return i;
        } else if (mo46539j(i)) {
            return this.f40073d.following(i);
        } else {
            return -1;
        }
    }

    /* renamed from: d */
    public final int mo46533d(int i) {
        return mo46532c(i, true);
    }

    /* renamed from: e */
    public final int mo46534e(int i) {
        return mo46531b(i, true);
    }

    /* renamed from: f */
    public final int mo46535f(int i) {
        mo46530a(i);
        while (i != -1 && !mo46542m(i)) {
            i = mo46544o(i);
        }
        return i;
    }

    /* renamed from: g */
    public final int mo46536g(int i) {
        mo46530a(i);
        while (i != -1 && !mo46541l(i)) {
            i = mo46543n(i);
        }
        return i;
    }

    /* renamed from: h */
    public final boolean mo46537h(int i) {
        boolean z;
        int i2 = this.f40071b + 1;
        if (i > this.f40072c || i2 > i) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !Character.isLetterOrDigit(Character.codePointBefore(this.f40070a, i))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo46538i(int i) {
        boolean z = true;
        int i2 = this.f40071b + 1;
        if (i > this.f40072c || i2 > i) {
            z = false;
        }
        if (!z) {
            return false;
        }
        return f40068e.mo46545a(Character.codePointBefore(this.f40070a, i));
    }

    /* renamed from: j */
    public final boolean mo46539j(int i) {
        boolean z;
        int i2 = this.f40071b;
        if (i >= this.f40072c || i2 > i) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !Character.isLetterOrDigit(Character.codePointAt(this.f40070a, i))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo46540k(int i) {
        boolean z;
        int i2 = this.f40071b;
        if (i >= this.f40072c || i2 > i) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return f40068e.mo46545a(Character.codePointAt(this.f40070a, i));
    }

    /* renamed from: l */
    public final boolean mo46541l(int i) {
        return !mo46540k(i) && mo46538i(i);
    }

    /* renamed from: m */
    public final boolean mo46542m(int i) {
        return mo46540k(i) && !mo46538i(i);
    }

    /* renamed from: n */
    public final int mo46543n(int i) {
        mo46530a(i);
        return this.f40073d.following(i);
    }

    /* renamed from: o */
    public final int mo46544o(int i) {
        mo46530a(i);
        return this.f40073d.preceding(i);
    }
}
