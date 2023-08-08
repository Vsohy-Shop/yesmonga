package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1886l;
import androidx.core.util.C18001r;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.loader.app.C19530a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.k */
public class C19242k {

    /* renamed from: a */
    public final C19253m<?> f49528a;

    public C19242k(C19253m<?> mVar) {
        this.f49528a = mVar;
    }

    @C0359n0
    /* renamed from: b */
    public static C19242k m90220b(@C0359n0 C19253m<?> mVar) {
        return new C19242k((C19253m) C18001r.m81776m(mVar, "callbacks == null"));
    }

    @C0363p0
    /* renamed from: A */
    public Fragment mo57234A(@C0359n0 String str) {
        return this.f49528a.f49556e.mo56906t0(str);
    }

    @C0359n0
    /* renamed from: B */
    public List<Fragment> mo57235B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f49528a.f49556e.mo56923z0();
    }

    /* renamed from: C */
    public int mo57236C() {
        return this.f49528a.f49556e.mo56920y0();
    }

    @C0359n0
    /* renamed from: D */
    public FragmentManager mo57237D() {
        return this.f49528a.f49556e;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    /* renamed from: E */
    public C19530a mo57238E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    /* renamed from: F */
    public void mo57239F() {
        this.f49528a.f49556e.mo56890n1();
    }

    @C0363p0
    /* renamed from: G */
    public View mo57240G(@C0363p0 View view, @C0359n0 String str, @C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        return this.f49528a.f49556e.mo56813K0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    /* renamed from: H */
    public void mo57241H() {
    }

    @Deprecated
    /* renamed from: I */
    public void mo57242I(@C0363p0 Parcelable parcelable, @C0363p0 C19280y yVar) {
        this.f49528a.f49556e.mo56808I1(parcelable, yVar);
    }

    @Deprecated
    /* renamed from: J */
    public void mo57243J(@C0363p0 Parcelable parcelable, @C0363p0 List<Fragment> list) {
        this.f49528a.f49556e.mo56808I1(parcelable, new C19280y(list, (Map<String, C19280y>) null, (Map<String, C19392a1>) null));
    }

    @Deprecated
    /* renamed from: K */
    public void mo57244K(@SuppressLint({"UnknownNullness"}) C1886l<String, C19530a> lVar) {
    }

    @Deprecated
    /* renamed from: L */
    public void mo57245L(@C0363p0 Parcelable parcelable) {
        C19253m<?> mVar = this.f49528a;
        if (mVar instanceof C19395b1) {
            mVar.f49556e.mo56817L1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    @C0363p0
    @Deprecated
    /* renamed from: M */
    public C1886l<String, C19530a> mo57246M() {
        return null;
    }

    @C0363p0
    @Deprecated
    /* renamed from: N */
    public C19280y mo57247N() {
        return this.f49528a.f49556e.mo56823N1();
    }

    @C0363p0
    @Deprecated
    /* renamed from: O */
    public List<Fragment> mo57248O() {
        C19280y N1 = this.f49528a.f49556e.mo56823N1();
        if (N1 == null || N1.mo57399b() == null) {
            return null;
        }
        return new ArrayList(N1.mo57399b());
    }

    @C0363p0
    @Deprecated
    /* renamed from: P */
    public Parcelable mo57249P() {
        return this.f49528a.f49556e.mo56828P1();
    }

    /* renamed from: a */
    public void mo57250a(@C0363p0 Fragment fragment) {
        C19253m<?> mVar = this.f49528a;
        mVar.f49556e.mo56902s(mVar, mVar, fragment);
    }

    /* renamed from: c */
    public void mo57251c() {
        this.f49528a.f49556e.mo56797F();
    }

    @Deprecated
    /* renamed from: d */
    public void mo57252d(@C0359n0 Configuration configuration) {
        this.f49528a.f49556e.mo56803H(configuration, true);
    }

    /* renamed from: e */
    public boolean mo57253e(@C0359n0 MenuItem menuItem) {
        return this.f49528a.f49556e.mo56806I(menuItem);
    }

    /* renamed from: f */
    public void mo57254f() {
        this.f49528a.f49556e.mo56809J();
    }

    @Deprecated
    /* renamed from: g */
    public boolean mo57255g(@C0359n0 Menu menu, @C0359n0 MenuInflater menuInflater) {
        return this.f49528a.f49556e.mo56812K(menu, menuInflater);
    }

    /* renamed from: h */
    public void mo57256h() {
        this.f49528a.f49556e.mo56815L();
    }

    /* renamed from: i */
    public void mo57257i() {
        this.f49528a.f49556e.mo56818M();
    }

    @Deprecated
    /* renamed from: j */
    public void mo57258j() {
        this.f49528a.f49556e.mo56821N(true);
    }

    @Deprecated
    /* renamed from: k */
    public void mo57259k(boolean z) {
        this.f49528a.f49556e.mo56824O(z, true);
    }

    @Deprecated
    /* renamed from: l */
    public boolean mo57260l(@C0359n0 MenuItem menuItem) {
        return this.f49528a.f49556e.mo56831R(menuItem);
    }

    @Deprecated
    /* renamed from: m */
    public void mo57261m(@C0359n0 Menu menu) {
        this.f49528a.f49556e.mo56834S(menu);
    }

    /* renamed from: n */
    public void mo57262n() {
        this.f49528a.f49556e.mo56840U();
    }

    @Deprecated
    /* renamed from: o */
    public void mo57263o(boolean z) {
        this.f49528a.f49556e.mo56843V(z, true);
    }

    @Deprecated
    /* renamed from: p */
    public boolean mo57264p(@C0359n0 Menu menu) {
        return this.f49528a.f49556e.mo56846W(menu);
    }

    @Deprecated
    /* renamed from: q */
    public void mo57265q() {
    }

    /* renamed from: r */
    public void mo57266r() {
        this.f49528a.f49556e.mo56851Y();
    }

    /* renamed from: s */
    public void mo57267s() {
        this.f49528a.f49556e.mo56854Z();
    }

    /* renamed from: t */
    public void mo57268t() {
        this.f49528a.f49556e.mo56862b0();
    }

    @Deprecated
    /* renamed from: u */
    public void mo57269u() {
    }

    @Deprecated
    /* renamed from: v */
    public void mo57270v() {
    }

    @Deprecated
    /* renamed from: w */
    public void mo57271w() {
    }

    @Deprecated
    /* renamed from: x */
    public void mo57272x(boolean z) {
    }

    @Deprecated
    /* renamed from: y */
    public void mo57273y(@C0359n0 String str, @C0363p0 FileDescriptor fileDescriptor, @C0359n0 PrintWriter printWriter, @C0363p0 String[] strArr) {
    }

    /* renamed from: z */
    public boolean mo57274z() {
        return this.f49528a.f49556e.mo56880j0(true);
    }
}
