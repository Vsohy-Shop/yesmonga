package androidx.compose.p004ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p004ui.text.android.TextLayout;
import androidx.compose.p004ui.text.android.style.C16117c;
import androidx.compose.p004ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p004ui.text.style.C16415e;
import androidx.compose.p004ui.text.style.C16417f;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;

/* renamed from: androidx.compose.ui.text.b */
public final class C16148b {
    /* renamed from: i */
    public static final CharSequence m72632i(CharSequence charSequence) {
        boolean z;
        Spannable spannable;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannable = (Spannable) charSequence;
        } else {
            spannable = new SpannableString(charSequence);
        }
        SpannableExtensions_androidKt.m73902t(spannable, new C16117c(), spannable.length() - 1, spannable.length() - 1);
        return spannable;
    }

    /* renamed from: j */
    public static final int m72633j(TextLayout textLayout, int i) {
        int q = textLayout.mo46311q();
        for (int i2 = 0; i2 < q; i2++) {
            if (textLayout.mo46310p(i2) > ((float) i)) {
                return i2;
            }
        }
        return textLayout.mo46311q();
    }

    /* renamed from: k */
    public static final boolean m72634k(C16361p0 p0Var, boolean z) {
        boolean z2;
        boolean z3;
        if (!z || C16504t.m74683j(p0Var.mo47474B(), C16506u.m74712m(0)) || C16504t.m74683j(p0Var.mo47474B(), C16504t.f40903b.mo47903b()) || p0Var.mo47483K() == null) {
            return false;
        }
        C16432i K = p0Var.mo47483K();
        C16432i.C16433a aVar = C16432i.f40718b;
        int f = aVar.mo47672f();
        if (K == null) {
            z2 = false;
        } else {
            z2 = C16432i.m74175j(K.mo47665m(), f);
        }
        if (z2) {
            return false;
        }
        C16432i K2 = p0Var.mo47483K();
        int c = aVar.mo47669c();
        if (K2 == null) {
            z3 = false;
        } else {
            z3 = C16432i.m74175j(K2.mo47665m(), c);
        }
        if (!z3) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static final int m72635l(C16432i iVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C16432i.C16433a aVar = C16432i.f40718b;
        int d = aVar.mo47670d();
        if (iVar == null) {
            z = false;
        } else {
            z = C16432i.m74175j(iVar.mo47665m(), d);
        }
        if (z) {
            return 3;
        }
        int e = aVar.mo47671e();
        if (iVar == null) {
            z2 = false;
        } else {
            z2 = C16432i.m74175j(iVar.mo47665m(), e);
        }
        if (z2) {
            return 4;
        }
        int a = aVar.mo47667a();
        if (iVar == null) {
            z3 = false;
        } else {
            z3 = C16432i.m74175j(iVar.mo47665m(), a);
        }
        if (z3) {
            return 2;
        }
        int f = aVar.mo47672f();
        if (iVar == null) {
            z4 = false;
        } else {
            z4 = C16432i.m74175j(iVar.mo47665m(), f);
        }
        if (z4) {
            return 0;
        }
        int b = aVar.mo47668b();
        if (iVar == null) {
            z5 = false;
        } else {
            z5 = C16432i.m74175j(iVar.mo47665m(), b);
        }
        if (z5) {
            return 1;
        }
        return 0;
    }

    /* renamed from: m */
    public static final int m72636m(C16417f.C16419b bVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C16417f.C16419b.C16420a aVar = C16417f.C16419b.f40684b;
        int c = aVar.mo47626c();
        if (bVar == null) {
            z = false;
        } else {
            z = C16417f.C16419b.m74085g(bVar.mo47622j(), c);
        }
        if (z) {
            return 0;
        }
        int b = aVar.mo47625b();
        if (bVar == null) {
            z2 = false;
        } else {
            z2 = C16417f.C16419b.m74085g(bVar.mo47622j(), b);
        }
        if (z2) {
            return 1;
        }
        int a = aVar.mo47624a();
        if (bVar == null) {
            z3 = false;
        } else {
            z3 = C16417f.C16419b.m74085g(bVar.mo47622j(), a);
        }
        if (z3) {
            return 2;
        }
        return 0;
    }

    /* renamed from: n */
    public static final int m72637n(C16415e eVar) {
        boolean z;
        C16415e.C16416a aVar = C16415e.f40675b;
        int a = aVar.mo47611a();
        if (eVar == null) {
            z = false;
        } else {
            z = C16415e.m74054f(eVar.mo47609i(), a);
        }
        if (!z) {
            int b = aVar.mo47612b();
            if (eVar == null) {
                return 0;
            }
            C16415e.m74054f(eVar.mo47609i(), b);
            return 0;
        } else if (Build.VERSION.SDK_INT <= 32) {
            return 1;
        } else {
            return 3;
        }
    }

    /* renamed from: o */
    public static final int m72638o(C16417f.C16421c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C16417f.C16421c.C16422a aVar = C16417f.C16421c.f40689b;
        int a = aVar.mo47631a();
        if (cVar == null) {
            z = false;
        } else {
            z = C16417f.C16421c.m74099h(cVar.mo47629k(), a);
        }
        if (z) {
            return 0;
        }
        int b = aVar.mo47632b();
        if (cVar == null) {
            z2 = false;
        } else {
            z2 = C16417f.C16421c.m74099h(cVar.mo47629k(), b);
        }
        if (z2) {
            return 1;
        }
        int c = aVar.mo47633c();
        if (cVar == null) {
            z3 = false;
        } else {
            z3 = C16417f.C16421c.m74099h(cVar.mo47629k(), c);
        }
        if (z3) {
            return 2;
        }
        int d = aVar.mo47634d();
        if (cVar == null) {
            z4 = false;
        } else {
            z4 = C16417f.C16421c.m74099h(cVar.mo47629k(), d);
        }
        if (z4) {
            return 3;
        }
        return 0;
    }

    /* renamed from: p */
    public static final int m72639p(C16417f.C16423d dVar) {
        boolean z;
        boolean z2;
        C16417f.C16423d.C16424a aVar = C16417f.C16423d.f40695b;
        int a = aVar.mo47639a();
        if (dVar == null) {
            z = false;
        } else {
            z = C16417f.C16423d.m74112f(dVar.mo47637i(), a);
        }
        if (z) {
            return 0;
        }
        int b = aVar.mo47640b();
        if (dVar == null) {
            z2 = false;
        } else {
            z2 = C16417f.C16423d.m74112f(dVar.mo47637i(), b);
        }
        if (z2) {
            return 1;
        }
        return 0;
    }
}
