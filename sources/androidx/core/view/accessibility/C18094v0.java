package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.v0 */
public class C18094v0 {

    /* renamed from: a */
    public final AccessibilityRecord f46707a;

    @C0376v0(15)
    /* renamed from: androidx.core.view.accessibility.v0$a */
    public static class C18095a {
        @C0373u
        /* renamed from: a */
        public static int m82197a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @C0373u
        /* renamed from: b */
        public static int m82198b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @C0373u
        /* renamed from: c */
        public static void m82199c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        @C0373u
        /* renamed from: d */
        public static void m82200d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @C0376v0(16)
    /* renamed from: androidx.core.view.accessibility.v0$b */
    public static class C18096b {
        @C0373u
        /* renamed from: a */
        public static void m82201a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public C18094v0(Object obj) {
        this.f46707a = (AccessibilityRecord) obj;
    }

    @Deprecated
    /* renamed from: A */
    public static C18094v0 m82145A(C18094v0 v0Var) {
        return new C18094v0(AccessibilityRecord.obtain(v0Var.f46707a));
    }

    /* renamed from: N */
    public static void m82146N(@C0359n0 AccessibilityRecord accessibilityRecord, int i) {
        C18095a.m82199c(accessibilityRecord, i);
    }

    /* renamed from: P */
    public static void m82147P(@C0359n0 AccessibilityRecord accessibilityRecord, int i) {
        C18095a.m82200d(accessibilityRecord, i);
    }

    /* renamed from: Y */
    public static void m82148Y(@C0359n0 AccessibilityRecord accessibilityRecord, @C0363p0 View view, int i) {
        C18096b.m82201a(accessibilityRecord, view, i);
    }

    /* renamed from: j */
    public static int m82149j(@C0359n0 AccessibilityRecord accessibilityRecord) {
        return C18095a.m82197a(accessibilityRecord);
    }

    /* renamed from: l */
    public static int m82150l(@C0359n0 AccessibilityRecord accessibilityRecord) {
        return C18095a.m82198b(accessibilityRecord);
    }

    @Deprecated
    /* renamed from: z */
    public static C18094v0 m82151z() {
        return new C18094v0(AccessibilityRecord.obtain());
    }

    @Deprecated
    /* renamed from: B */
    public void mo52709B() {
        this.f46707a.recycle();
    }

    @Deprecated
    /* renamed from: C */
    public void mo52710C(int i) {
        this.f46707a.setAddedCount(i);
    }

    @Deprecated
    /* renamed from: D */
    public void mo52711D(CharSequence charSequence) {
        this.f46707a.setBeforeText(charSequence);
    }

    @Deprecated
    /* renamed from: E */
    public void mo52712E(boolean z) {
        this.f46707a.setChecked(z);
    }

    @Deprecated
    /* renamed from: F */
    public void mo52713F(CharSequence charSequence) {
        this.f46707a.setClassName(charSequence);
    }

    @Deprecated
    /* renamed from: G */
    public void mo52714G(CharSequence charSequence) {
        this.f46707a.setContentDescription(charSequence);
    }

    @Deprecated
    /* renamed from: H */
    public void mo52715H(int i) {
        this.f46707a.setCurrentItemIndex(i);
    }

    @Deprecated
    /* renamed from: I */
    public void mo52716I(boolean z) {
        this.f46707a.setEnabled(z);
    }

    @Deprecated
    /* renamed from: J */
    public void mo52717J(int i) {
        this.f46707a.setFromIndex(i);
    }

    @Deprecated
    /* renamed from: K */
    public void mo52718K(boolean z) {
        this.f46707a.setFullScreen(z);
    }

    @Deprecated
    /* renamed from: L */
    public void mo52719L(int i) {
        this.f46707a.setItemCount(i);
    }

    @Deprecated
    /* renamed from: M */
    public void mo52720M(int i) {
        m82146N(this.f46707a, i);
    }

    @Deprecated
    /* renamed from: O */
    public void mo52721O(int i) {
        m82147P(this.f46707a, i);
    }

    @Deprecated
    /* renamed from: Q */
    public void mo52722Q(Parcelable parcelable) {
        this.f46707a.setParcelableData(parcelable);
    }

    @Deprecated
    /* renamed from: R */
    public void mo52723R(boolean z) {
        this.f46707a.setPassword(z);
    }

    @Deprecated
    /* renamed from: S */
    public void mo52724S(int i) {
        this.f46707a.setRemovedCount(i);
    }

    @Deprecated
    /* renamed from: T */
    public void mo52725T(int i) {
        this.f46707a.setScrollX(i);
    }

    @Deprecated
    /* renamed from: U */
    public void mo52726U(int i) {
        this.f46707a.setScrollY(i);
    }

    @Deprecated
    /* renamed from: V */
    public void mo52727V(boolean z) {
        this.f46707a.setScrollable(z);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    /* renamed from: W */
    public void mo52728W(View view) {
        this.f46707a.setSource(view);
    }

    @Deprecated
    /* renamed from: X */
    public void mo52729X(View view, int i) {
        m82148Y(this.f46707a, view, i);
    }

    @Deprecated
    /* renamed from: Z */
    public void mo52730Z(int i) {
        this.f46707a.setToIndex(i);
    }

    @Deprecated
    /* renamed from: a */
    public int mo52731a() {
        return this.f46707a.getAddedCount();
    }

    @Deprecated
    /* renamed from: b */
    public CharSequence mo52732b() {
        return this.f46707a.getBeforeText();
    }

    @Deprecated
    /* renamed from: c */
    public CharSequence mo52733c() {
        return this.f46707a.getClassName();
    }

    @Deprecated
    /* renamed from: d */
    public CharSequence mo52734d() {
        return this.f46707a.getContentDescription();
    }

    @Deprecated
    /* renamed from: e */
    public int mo52735e() {
        return this.f46707a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18094v0)) {
            return false;
        }
        C18094v0 v0Var = (C18094v0) obj;
        AccessibilityRecord accessibilityRecord = this.f46707a;
        if (accessibilityRecord != null) {
            return accessibilityRecord.equals(v0Var.f46707a);
        }
        if (v0Var.f46707a == null) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public int mo52737f() {
        return this.f46707a.getFromIndex();
    }

    @Deprecated
    /* renamed from: g */
    public Object mo52738g() {
        return this.f46707a;
    }

    @Deprecated
    /* renamed from: h */
    public int mo52739h() {
        return this.f46707a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f46707a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo52741i() {
        return m82149j(this.f46707a);
    }

    @Deprecated
    /* renamed from: k */
    public int mo52742k() {
        return m82150l(this.f46707a);
    }

    @Deprecated
    /* renamed from: m */
    public Parcelable mo52743m() {
        return this.f46707a.getParcelableData();
    }

    @Deprecated
    /* renamed from: n */
    public int mo52744n() {
        return this.f46707a.getRemovedCount();
    }

    @Deprecated
    /* renamed from: o */
    public int mo52745o() {
        return this.f46707a.getScrollX();
    }

    @Deprecated
    /* renamed from: p */
    public int mo52746p() {
        return this.f46707a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    /* renamed from: q */
    public C18065l0 mo52747q() {
        return C18065l0.m81937d2(this.f46707a.getSource());
    }

    @Deprecated
    /* renamed from: r */
    public List<CharSequence> mo52748r() {
        return this.f46707a.getText();
    }

    @Deprecated
    /* renamed from: s */
    public int mo52749s() {
        return this.f46707a.getToIndex();
    }

    @Deprecated
    /* renamed from: t */
    public int mo52750t() {
        return this.f46707a.getWindowId();
    }

    @Deprecated
    /* renamed from: u */
    public boolean mo52751u() {
        return this.f46707a.isChecked();
    }

    @Deprecated
    /* renamed from: v */
    public boolean mo52752v() {
        return this.f46707a.isEnabled();
    }

    @Deprecated
    /* renamed from: w */
    public boolean mo52753w() {
        return this.f46707a.isFullScreen();
    }

    @Deprecated
    /* renamed from: x */
    public boolean mo52754x() {
        return this.f46707a.isPassword();
    }

    @Deprecated
    /* renamed from: y */
    public boolean mo52755y() {
        return this.f46707a.isScrollable();
    }
}
