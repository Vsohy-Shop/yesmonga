package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0507a;
import androidx.core.content.res.C17483q;
import androidx.core.view.accessibility.C18065l0;
import androidx.preference.C19966s;
import androidx.preference.C19975v;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Preference implements Comparable<Preference> {

    /* renamed from: g1 */
    public static final int f50842g1 = Integer.MAX_VALUE;

    /* renamed from: h1 */
    public static final String f50843h1 = "Preference";

    /* renamed from: E0 */
    public String f50844E0;

    /* renamed from: F0 */
    public Bundle f50845F0;

    /* renamed from: G0 */
    public boolean f50846G0;

    /* renamed from: H0 */
    public boolean f50847H0;

    /* renamed from: I0 */
    public boolean f50848I0;

    /* renamed from: J0 */
    public boolean f50849J0;

    /* renamed from: K0 */
    public String f50850K0;

    /* renamed from: L0 */
    public Object f50851L0;

    /* renamed from: M0 */
    public boolean f50852M0;

    /* renamed from: N0 */
    public boolean f50853N0;

    /* renamed from: O0 */
    public boolean f50854O0;

    /* renamed from: P0 */
    public boolean f50855P0;

    /* renamed from: Q0 */
    public boolean f50856Q0;

    /* renamed from: R0 */
    public boolean f50857R0;

    /* renamed from: S0 */
    public boolean f50858S0;

    /* renamed from: T0 */
    public boolean f50859T0;

    /* renamed from: U0 */
    public boolean f50860U0;

    /* renamed from: V0 */
    public boolean f50861V0;

    /* renamed from: W0 */
    public int f50862W0;

    /* renamed from: X */
    public Drawable f50863X;

    /* renamed from: X0 */
    public int f50864X0;

    /* renamed from: Y */
    public String f50865Y;

    /* renamed from: Y0 */
    public C19900b f50866Y0;

    /* renamed from: Z */
    public Intent f50867Z;

    /* renamed from: Z0 */
    public List<Preference> f50868Z0;
    @C0359n0

    /* renamed from: a */
    public final Context f50869a;

    /* renamed from: a1 */
    public PreferenceGroup f50870a1;
    @C0363p0

    /* renamed from: b */
    public C19966s f50871b;

    /* renamed from: b1 */
    public boolean f50872b1;
    @C0363p0

    /* renamed from: c */
    public C19928i f50873c;

    /* renamed from: c1 */
    public boolean f50874c1;

    /* renamed from: d */
    public long f50875d;

    /* renamed from: d1 */
    public C19903e f50876d1;

    /* renamed from: e */
    public boolean f50877e;

    /* renamed from: e1 */
    public C19904f f50878e1;

    /* renamed from: f */
    public C19901c f50879f;

    /* renamed from: f1 */
    public final View.OnClickListener f50880f1;

    /* renamed from: g */
    public C19902d f50881g;

    /* renamed from: v */
    public int f50882v;

    /* renamed from: w */
    public int f50883w;

    /* renamed from: x */
    public CharSequence f50884x;

    /* renamed from: y */
    public CharSequence f50885y;

    /* renamed from: z */
    public int f50886z;

    public static class BaseSavedState extends AbsSavedState {
        @C0359n0
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new C19898a();

        /* renamed from: androidx.preference.Preference$BaseSavedState$a */
        public class C19898a implements Parcelable.Creator<BaseSavedState> {
            /* renamed from: a */
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            /* renamed from: b */
            public BaseSavedState[] newArray(int i) {
                return new BaseSavedState[i];
            }
        }

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.preference.Preference$a */
    public class C19899a implements View.OnClickListener {
        public C19899a() {
        }

        public void onClick(View view) {
            Preference.this.mo58739p2(view);
        }
    }

    /* renamed from: androidx.preference.Preference$b */
    public interface C19900b {
        /* renamed from: d */
        void mo58928d(@C0359n0 Preference preference);

        /* renamed from: f */
        void mo58929f(@C0359n0 Preference preference);

        /* renamed from: h */
        void mo58930h(@C0359n0 Preference preference);
    }

    /* renamed from: androidx.preference.Preference$c */
    public interface C19901c {
        /* renamed from: a */
        boolean mo35168a(@C0359n0 Preference preference, Object obj);
    }

    /* renamed from: androidx.preference.Preference$d */
    public interface C19902d {
        /* renamed from: a */
        boolean mo35169a(@C0359n0 Preference preference);
    }

    /* renamed from: androidx.preference.Preference$e */
    public static class C19903e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final Preference f50888a;

        public C19903e(@C0359n0 Preference preference) {
            this.f50888a = preference;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence U0 = this.f50888a.mo58797U0();
            if (this.f50888a.mo58897n1() && !TextUtils.isEmpty(U0)) {
                contextMenu.setHeaderTitle(U0);
                contextMenu.add(0, 0, 0, C19975v.C19984i.copy).setOnMenuItemClickListener(this);
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CharSequence U0 = this.f50888a.mo58797U0();
            ((ClipboardManager) this.f50888a.mo58854Q().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(Preference.f50843h1, U0));
            Toast.makeText(this.f50888a.mo58854Q(), this.f50888a.mo58854Q().getString(C19975v.C19984i.preference_copied, new Object[]{U0}), 0).show();
            return true;
        }
    }

    /* renamed from: androidx.preference.Preference$f */
    public interface C19904f<T extends Preference> {
        @C0363p0
        /* renamed from: a */
        CharSequence mo58785a(@C0359n0 T t);
    }

    public Preference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        this.f50882v = Integer.MAX_VALUE;
        this.f50883w = 0;
        this.f50846G0 = true;
        this.f50847H0 = true;
        this.f50849J0 = true;
        this.f50852M0 = true;
        this.f50853N0 = true;
        this.f50854O0 = true;
        this.f50855P0 = true;
        this.f50856Q0 = true;
        this.f50858S0 = true;
        this.f50861V0 = true;
        int i3 = C19975v.C19983h.preference;
        this.f50862W0 = i3;
        this.f50880f1 = new C19899a();
        this.f50869a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19975v.C19986k.Preference, i, i2);
        this.f50886z = C17483q.m80238n(obtainStyledAttributes, C19975v.C19986k.Preference_icon, C19975v.C19986k.Preference_android_icon, 0);
        this.f50865Y = C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.Preference_key, C19975v.C19986k.Preference_android_key);
        this.f50884x = C17483q.m80240p(obtainStyledAttributes, C19975v.C19986k.Preference_title, C19975v.C19986k.Preference_android_title);
        this.f50885y = C17483q.m80240p(obtainStyledAttributes, C19975v.C19986k.Preference_summary, C19975v.C19986k.Preference_android_summary);
        this.f50882v = C17483q.m80228d(obtainStyledAttributes, C19975v.C19986k.Preference_order, C19975v.C19986k.Preference_android_order, Integer.MAX_VALUE);
        this.f50844E0 = C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.Preference_fragment, C19975v.C19986k.Preference_android_fragment);
        this.f50862W0 = C17483q.m80238n(obtainStyledAttributes, C19975v.C19986k.Preference_layout, C19975v.C19986k.Preference_android_layout, i3);
        this.f50864X0 = C17483q.m80238n(obtainStyledAttributes, C19975v.C19986k.Preference_widgetLayout, C19975v.C19986k.Preference_android_widgetLayout, 0);
        this.f50846G0 = C17483q.m80226b(obtainStyledAttributes, C19975v.C19986k.Preference_enabled, C19975v.C19986k.Preference_android_enabled, true);
        this.f50847H0 = C17483q.m80226b(obtainStyledAttributes, C19975v.C19986k.Preference_selectable, C19975v.C19986k.Preference_android_selectable, true);
        this.f50849J0 = C17483q.m80226b(obtainStyledAttributes, C19975v.C19986k.Preference_persistent, C19975v.C19986k.Preference_android_persistent, true);
        this.f50850K0 = C17483q.m80239o(obtainStyledAttributes, C19975v.C19986k.Preference_dependency, C19975v.C19986k.Preference_android_dependency);
        int i4 = C19975v.C19986k.Preference_allowDividerAbove;
        this.f50855P0 = C17483q.m80226b(obtainStyledAttributes, i4, i4, this.f50847H0);
        int i5 = C19975v.C19986k.Preference_allowDividerBelow;
        this.f50856Q0 = C17483q.m80226b(obtainStyledAttributes, i5, i5, this.f50847H0);
        int i6 = C19975v.C19986k.Preference_defaultValue;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.f50851L0 = mo58774a2(obtainStyledAttributes, i6);
        } else {
            int i7 = C19975v.C19986k.Preference_android_defaultValue;
            if (obtainStyledAttributes.hasValue(i7)) {
                this.f50851L0 = mo58774a2(obtainStyledAttributes, i7);
            }
        }
        this.f50861V0 = C17483q.m80226b(obtainStyledAttributes, C19975v.C19986k.Preference_shouldDisableView, C19975v.C19986k.Preference_android_shouldDisableView, true);
        int i8 = C19975v.C19986k.Preference_singleLineTitle;
        boolean hasValue = obtainStyledAttributes.hasValue(i8);
        this.f50857R0 = hasValue;
        if (hasValue) {
            this.f50858S0 = C17483q.m80226b(obtainStyledAttributes, i8, C19975v.C19986k.Preference_android_singleLineTitle, true);
        }
        this.f50859T0 = C17483q.m80226b(obtainStyledAttributes, C19975v.C19986k.Preference_iconSpaceReserved, C19975v.C19986k.Preference_android_iconSpaceReserved, false);
        int i9 = C19975v.C19986k.Preference_isPreferenceVisible;
        this.f50854O0 = C17483q.m80226b(obtainStyledAttributes, i9, i9, true);
        int i10 = C19975v.C19986k.Preference_enableCopying;
        this.f50860U0 = C17483q.m80226b(obtainStyledAttributes, i10, i10, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A0 */
    public float mo58820A0(float f) {
        if (!mo58881f3()) {
            return f;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            return L0.mo36775b(this.f50865Y, f);
        }
        return this.f50871b.mo59201o().getFloat(this.f50865Y, f);
    }

    /* renamed from: A1 */
    public boolean mo58821A1() {
        return this.f50847H0;
    }

    /* renamed from: A2 */
    public void mo58822A2(@C0359n0 Bundle bundle) {
        mo58918y(bundle);
    }

    /* renamed from: B1 */
    public final boolean mo58823B1() {
        if (!mo58831F1() || mo58848N0() == null) {
            return false;
        }
        if (this == mo58848N0().mo59200n()) {
            return true;
        }
        PreferenceGroup t0 = mo58908t0();
        if (t0 == null) {
            return false;
        }
        return t0.mo58823B1();
    }

    /* renamed from: B2 */
    public void mo58824B2(boolean z) {
        if (this.f50860U0 != z) {
            this.f50860U0 = z;
            mo58762G1();
        }
    }

    /* renamed from: C0 */
    public int mo58825C0(int i) {
        if (!mo58881f3()) {
            return i;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            return L0.mo36776c(this.f50865Y, i);
        }
        return this.f50871b.mo59201o().getInt(this.f50865Y, i);
    }

    /* renamed from: C2 */
    public void mo58826C2(Object obj) {
        this.f50851L0 = obj;
    }

    /* renamed from: D2 */
    public void mo58827D2(@C0363p0 String str) {
        mo58885h3();
        this.f50850K0 = str;
        mo58916w2();
    }

    /* renamed from: E1 */
    public boolean mo58828E1() {
        return this.f50858S0;
    }

    /* renamed from: E2 */
    public void mo58829E2(boolean z) {
        if (this.f50846G0 != z) {
            this.f50846G0 = z;
            mo58835H1(mo58775e3());
            mo58762G1();
        }
    }

    /* renamed from: F0 */
    public long mo58830F0(long j) {
        if (!mo58881f3()) {
            return j;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            return L0.mo36777d(this.f50865Y, j);
        }
        return this.f50871b.mo59201o().getLong(this.f50865Y, j);
    }

    /* renamed from: F1 */
    public final boolean mo58831F1() {
        return this.f50854O0;
    }

    /* renamed from: F2 */
    public final void mo58832F2(@C0359n0 View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                mo58832F2(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* renamed from: G1 */
    public void mo58762G1() {
        C19900b bVar = this.f50866Y0;
        if (bVar != null) {
            bVar.mo58929f(this);
        }
    }

    /* renamed from: G2 */
    public void mo58833G2(@C0363p0 String str) {
        this.f50844E0 = str;
    }

    /* renamed from: H0 */
    public String mo58834H0(String str) {
        if (!mo58881f3()) {
            return str;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            return L0.mo36778e(this.f50865Y, str);
        }
        return this.f50871b.mo59201o().getString(this.f50865Y, str);
    }

    /* renamed from: H1 */
    public void mo58835H1(boolean z) {
        List<Preference> list = this.f50868Z0;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo58865X1(this, z);
            }
        }
    }

    /* renamed from: H2 */
    public void mo58836H2(int i) {
        mo58838I2(C0507a.m2346b(this.f50869a, i));
        this.f50886z = i;
    }

    /* renamed from: I1 */
    public void mo58837I1() {
        C19900b bVar = this.f50866Y0;
        if (bVar != null) {
            bVar.mo58930h(this);
        }
    }

    /* renamed from: I2 */
    public void mo58838I2(@C0363p0 Drawable drawable) {
        if (this.f50863X != drawable) {
            this.f50863X = drawable;
            this.f50886z = 0;
            mo58762G1();
        }
    }

    /* renamed from: J2 */
    public void mo58839J2(boolean z) {
        if (this.f50859T0 != z) {
            this.f50859T0 = z;
            mo58762G1();
        }
    }

    /* renamed from: K0 */
    public Set<String> mo58840K0(Set<String> set) {
        if (!mo58881f3()) {
            return set;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            return L0.mo36779f(this.f50865Y, set);
        }
        return this.f50871b.mo59201o().getStringSet(this.f50865Y, set);
    }

    /* renamed from: K2 */
    public void mo58841K2(@C0363p0 Intent intent) {
        this.f50867Z = intent;
    }

    @C0363p0
    /* renamed from: L0 */
    public C19928i mo58842L0() {
        C19928i iVar = this.f50873c;
        if (iVar != null) {
            return iVar;
        }
        C19966s sVar = this.f50871b;
        if (sVar != null) {
            return sVar.mo59199m();
        }
        return null;
    }

    /* renamed from: L1 */
    public void mo58843L1() {
        mo58916w2();
    }

    /* renamed from: L2 */
    public void mo58844L2(String str) {
        this.f50865Y = str;
        if (this.f50848I0 && !mo58893l1()) {
            mo58919y2();
        }
    }

    @C0363p0
    /* renamed from: M */
    public <T extends Preference> T mo58845M(@C0359n0 String str) {
        C19966s sVar = this.f50871b;
        if (sVar == null) {
            return null;
        }
        return sVar.mo59191b(str);
    }

    /* renamed from: M1 */
    public void mo58846M1(@C0359n0 C19966s sVar) {
        this.f50871b = sVar;
        if (!this.f50877e) {
            this.f50875d = sVar.mo59194h();
        }
        mo58920z();
    }

    /* renamed from: M2 */
    public void mo58847M2(int i) {
        this.f50862W0 = i;
    }

    /* renamed from: N0 */
    public C19966s mo58848N0() {
        return this.f50871b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: N1 */
    public void mo58849N1(@C0359n0 C19966s sVar, long j) {
        this.f50875d = j;
        this.f50877e = true;
        try {
            mo58846M1(sVar);
        } finally {
            this.f50877e = false;
        }
    }

    /* renamed from: N2 */
    public final void mo58850N2(@C0363p0 C19900b bVar) {
        this.f50866Y0 = bVar;
    }

    @C0363p0
    /* renamed from: O0 */
    public SharedPreferences mo58851O0() {
        if (this.f50871b == null || mo58842L0() != null) {
            return null;
        }
        return this.f50871b.mo59201o();
    }

    /* renamed from: O2 */
    public void mo58852O2(@C0363p0 C19901c cVar) {
        this.f50879f = cVar;
    }

    /* renamed from: P2 */
    public void mo58853P2(@C0363p0 C19902d dVar) {
        this.f50881g = dVar;
    }

    @C0359n0
    /* renamed from: Q */
    public Context mo58854Q() {
        return this.f50869a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* renamed from: Q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34405Q1(@androidx.annotation.C0359n0 androidx.preference.C19974u r9) {
        /*
            r8 = this;
            android.view.View r0 = r9.itemView
            android.view.View$OnClickListener r1 = r8.f50880f1
            r0.setOnClickListener(r1)
            int r1 = r8.f50883w
            r0.setId(r1)
            r1 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r1 = r9.mo59214d(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            r3 = 8
            r4 = 0
            if (r1 == 0) goto L_0x0037
            java.lang.CharSequence r5 = r8.mo58797U0()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0034
            r1.setText(r5)
            r1.setVisibility(r2)
            int r1 = r1.getCurrentTextColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0038
        L_0x0034:
            r1.setVisibility(r3)
        L_0x0037:
            r1 = r4
        L_0x0038:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.mo59214d(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0075
            java.lang.CharSequence r6 = r8.mo58890j1()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0072
            r5.setText(r6)
            r5.setVisibility(r2)
            boolean r6 = r8.f50857R0
            if (r6 == 0) goto L_0x005c
            boolean r6 = r8.f50858S0
            r5.setSingleLine(r6)
        L_0x005c:
            boolean r6 = r8.mo58821A1()
            if (r6 != 0) goto L_0x0075
            boolean r6 = r8.mo58903q1()
            if (r6 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            int r1 = r1.intValue()
            r5.setTextColor(r1)
            goto L_0x0075
        L_0x0072:
            r5.setVisibility(r3)
        L_0x0075:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r9.mo59214d(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5 = 4
            if (r1 == 0) goto L_0x00ae
            int r6 = r8.f50886z
            if (r6 != 0) goto L_0x0089
            android.graphics.drawable.Drawable r7 = r8.f50863X
            if (r7 == 0) goto L_0x009c
        L_0x0089:
            android.graphics.drawable.Drawable r7 = r8.f50863X
            if (r7 != 0) goto L_0x0095
            android.content.Context r7 = r8.f50869a
            android.graphics.drawable.Drawable r6 = androidx.appcompat.content.res.C0507a.m2346b(r7, r6)
            r8.f50863X = r6
        L_0x0095:
            android.graphics.drawable.Drawable r6 = r8.f50863X
            if (r6 == 0) goto L_0x009c
            r1.setImageDrawable(r6)
        L_0x009c:
            android.graphics.drawable.Drawable r6 = r8.f50863X
            if (r6 == 0) goto L_0x00a4
            r1.setVisibility(r2)
            goto L_0x00ae
        L_0x00a4:
            boolean r6 = r8.f50859T0
            if (r6 == 0) goto L_0x00aa
            r6 = r5
            goto L_0x00ab
        L_0x00aa:
            r6 = r3
        L_0x00ab:
            r1.setVisibility(r6)
        L_0x00ae:
            int r1 = androidx.preference.C19975v.C19981f.icon_frame
            android.view.View r1 = r9.mo59214d(r1)
            if (r1 != 0) goto L_0x00bd
            r1 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.mo59214d(r1)
        L_0x00bd:
            if (r1 == 0) goto L_0x00cf
            android.graphics.drawable.Drawable r6 = r8.f50863X
            if (r6 == 0) goto L_0x00c7
            r1.setVisibility(r2)
            goto L_0x00cf
        L_0x00c7:
            boolean r2 = r8.f50859T0
            if (r2 == 0) goto L_0x00cc
            r3 = r5
        L_0x00cc:
            r1.setVisibility(r3)
        L_0x00cf:
            boolean r1 = r8.f50861V0
            if (r1 == 0) goto L_0x00db
            boolean r1 = r8.mo58903q1()
            r8.mo58832F2(r0, r1)
            goto L_0x00df
        L_0x00db:
            r1 = 1
            r8.mo58832F2(r0, r1)
        L_0x00df:
            boolean r1 = r8.mo58821A1()
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r2 = r8.f50855P0
            r9.mo59218h(r2)
            boolean r2 = r8.f50856Q0
            r9.mo59219i(r2)
            boolean r9 = r8.mo58897n1()
            if (r9 == 0) goto L_0x0104
            androidx.preference.Preference$e r2 = r8.f50876d1
            if (r2 != 0) goto L_0x0104
            androidx.preference.Preference$e r2 = new androidx.preference.Preference$e
            r2.<init>(r8)
            r8.f50876d1 = r2
        L_0x0104:
            if (r9 == 0) goto L_0x0109
            androidx.preference.Preference$e r2 = r8.f50876d1
            goto L_0x010a
        L_0x0109:
            r2 = r4
        L_0x010a:
            r0.setOnCreateContextMenuListener(r2)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L_0x0117
            if (r1 != 0) goto L_0x0117
            androidx.core.view.C18196h2.m82502I1(r0, r4)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.mo34405Q1(androidx.preference.u):void");
    }

    /* renamed from: Q2 */
    public void mo58855Q2(int i) {
        if (i != this.f50882v) {
            this.f50882v = i;
            mo58837I1();
        }
    }

    /* renamed from: R0 */
    public boolean mo58856R0() {
        return this.f50861V0;
    }

    /* renamed from: R2 */
    public void mo58857R2(boolean z) {
        this.f50849J0 = z;
    }

    /* renamed from: S2 */
    public void mo58858S2(@C0363p0 C19928i iVar) {
        this.f50873c = iVar;
    }

    /* renamed from: T1 */
    public void mo58744T1() {
    }

    /* renamed from: T2 */
    public void mo58859T2(boolean z) {
        if (this.f50847H0 != z) {
            this.f50847H0 = z;
            mo58762G1();
        }
    }

    @C0363p0
    /* renamed from: U0 */
    public CharSequence mo58797U0() {
        if (mo58873c1() != null) {
            return mo58873c1().mo58785a(this);
        }
        return this.f50885y;
    }

    /* renamed from: U2 */
    public void mo58860U2(boolean z) {
        if (this.f50861V0 != z) {
            this.f50861V0 = z;
            mo58762G1();
        }
    }

    /* renamed from: V2 */
    public void mo58861V2(boolean z) {
        this.f50857R0 = true;
        this.f50858S0 = z;
    }

    @C0363p0
    /* renamed from: W */
    public String mo58862W() {
        return this.f50850K0;
    }

    /* renamed from: W2 */
    public void mo58863W2(int i) {
        mo58798X2(this.f50869a.getString(i));
    }

    @C0359n0
    /* renamed from: X */
    public Bundle mo58864X() {
        if (this.f50845F0 == null) {
            this.f50845F0 = new Bundle();
        }
        return this.f50845F0;
    }

    /* renamed from: X1 */
    public void mo58865X1(@C0359n0 Preference preference, boolean z) {
        if (this.f50852M0 == z) {
            this.f50852M0 = !z;
            mo58835H1(mo58775e3());
            mo58762G1();
        }
    }

    /* renamed from: X2 */
    public void mo58798X2(@C0363p0 CharSequence charSequence) {
        if (mo58873c1() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.f50885y, charSequence)) {
            this.f50885y = charSequence;
            mo58762G1();
        }
    }

    /* renamed from: Y1 */
    public void mo58866Y1() {
        mo58885h3();
        this.f50872b1 = true;
    }

    /* renamed from: Y2 */
    public final void mo58867Y2(@C0363p0 C19904f fVar) {
        this.f50878e1 = fVar;
        mo58762G1();
    }

    @C0359n0
    /* renamed from: Z */
    public StringBuilder mo58868Z() {
        StringBuilder sb = new StringBuilder();
        CharSequence j1 = mo58890j1();
        if (!TextUtils.isEmpty(j1)) {
            sb.append(j1);
            sb.append(' ');
        }
        CharSequence U0 = mo58797U0();
        if (!TextUtils.isEmpty(U0)) {
            sb.append(U0);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    /* renamed from: Z2 */
    public void mo58869Z2(int i) {
        mo58870a3(this.f50869a.getString(i));
    }

    @C0363p0
    /* renamed from: a2 */
    public Object mo58774a2(@C0359n0 TypedArray typedArray, int i) {
        return null;
    }

    /* renamed from: a3 */
    public void mo58870a3(@C0363p0 CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f50884x)) {
            this.f50884x = charSequence;
            mo58762G1();
        }
    }

    /* renamed from: b */
    public void mo58871b(@C0363p0 PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.f50870a1 == null) {
            this.f50870a1 = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    /* renamed from: b3 */
    public void mo58872b3(int i) {
        this.f50883w = i;
    }

    @C0363p0
    /* renamed from: c1 */
    public final C19904f mo58873c1() {
        return this.f50878e1;
    }

    @Deprecated
    @C0346i
    /* renamed from: c2 */
    public void mo58874c2(C18065l0 l0Var) {
    }

    /* renamed from: c3 */
    public final void mo58875c3(boolean z) {
        if (this.f50854O0 != z) {
            this.f50854O0 = z;
            C19900b bVar = this.f50866Y0;
            if (bVar != null) {
                bVar.mo58928d(this);
            }
        }
    }

    /* renamed from: d3 */
    public void mo58877d3(int i) {
        this.f50864X0 = i;
    }

    @C0363p0
    /* renamed from: e0 */
    public String mo58878e0() {
        return this.f50844E0;
    }

    /* renamed from: e2 */
    public void mo58879e2(@C0359n0 Preference preference, boolean z) {
        if (this.f50853N0 == z) {
            this.f50853N0 = !z;
            mo58835H1(mo58775e3());
            mo58762G1();
        }
    }

    /* renamed from: e3 */
    public boolean mo58775e3() {
        return !mo58903q1();
    }

    @C0363p0
    /* renamed from: f0 */
    public Drawable mo58880f0() {
        int i;
        if (this.f50863X == null && (i = this.f50886z) != 0) {
            this.f50863X = C0507a.m2346b(this.f50869a, i);
        }
        return this.f50863X;
    }

    /* renamed from: f3 */
    public boolean mo58881f3() {
        return this.f50871b != null && mo58921z1() && mo58893l1();
    }

    /* renamed from: g */
    public boolean mo58882g(Object obj) {
        C19901c cVar = this.f50879f;
        return cVar == null || cVar.mo35168a(this, obj);
    }

    /* renamed from: g3 */
    public final void mo58883g3(@C0359n0 SharedPreferences.Editor editor) {
        if (this.f50871b.mo59188H()) {
            editor.apply();
        }
    }

    /* renamed from: h0 */
    public long mo58884h0() {
        return this.f50875d;
    }

    /* renamed from: h3 */
    public final void mo58885h3() {
        Preference M;
        String str = this.f50850K0;
        if (str != null && (M = mo58845M(str)) != null) {
            M.mo58888i3(this);
        }
    }

    @C0363p0
    /* renamed from: i0 */
    public Intent mo58886i0() {
        return this.f50867Z;
    }

    /* renamed from: i2 */
    public void mo58887i2() {
        mo58885h3();
    }

    /* renamed from: i3 */
    public final void mo58888i3(Preference preference) {
        List<Preference> list = this.f50868Z0;
        if (list != null) {
            list.remove(preference);
        }
    }

    /* renamed from: j0 */
    public String mo58889j0() {
        return this.f50865Y;
    }

    @C0363p0
    /* renamed from: j1 */
    public CharSequence mo58890j1() {
        return this.f50884x;
    }

    /* renamed from: j2 */
    public void mo58776j2(@C0363p0 Parcelable parcelable) {
        this.f50874c1 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: j3 */
    public final boolean mo58891j3() {
        return this.f50872b1;
    }

    /* renamed from: k1 */
    public final int mo58892k1() {
        return this.f50864X0;
    }

    @C0363p0
    /* renamed from: k2 */
    public Parcelable mo58777k2() {
        this.f50874c1 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* renamed from: l1 */
    public boolean mo58893l1() {
        return !TextUtils.isEmpty(this.f50865Y);
    }

    /* renamed from: l2 */
    public void mo58778l2(@C0363p0 Object obj) {
    }

    /* renamed from: m0 */
    public final int mo58894m0() {
        return this.f50862W0;
    }

    @Deprecated
    /* renamed from: m2 */
    public void mo58895m2(boolean z, Object obj) {
        mo58778l2(obj);
    }

    @C0363p0
    /* renamed from: n0 */
    public C19901c mo58896n0() {
        return this.f50879f;
    }

    /* renamed from: n1 */
    public boolean mo58897n1() {
        return this.f50860U0;
    }

    @C0363p0
    /* renamed from: n2 */
    public Bundle mo58898n2() {
        return this.f50845F0;
    }

    @C0363p0
    /* renamed from: o0 */
    public C19902d mo58899o0() {
        return this.f50881g;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: o2 */
    public void mo58900o2() {
        C19966s.C19969c k;
        if (mo58903q1() && mo58821A1()) {
            mo58744T1();
            C19902d dVar = this.f50881g;
            if (dVar == null || !dVar.mo35169a(this)) {
                C19966s N0 = mo58848N0();
                if ((N0 == null || (k = N0.mo59197k()) == null || !k.mo59098x0(this)) && this.f50867Z != null) {
                    mo58854Q().startActivity(this.f50867Z);
                }
            }
        }
    }

    /* renamed from: p0 */
    public int mo58901p0() {
        return this.f50882v;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: p2 */
    public void mo58739p2(@C0359n0 View view) {
        mo58900o2();
    }

    /* renamed from: q */
    public final void mo58902q() {
        this.f50872b1 = false;
    }

    /* renamed from: q1 */
    public boolean mo58903q1() {
        return this.f50846G0 && this.f50852M0 && this.f50853N0;
    }

    /* renamed from: q2 */
    public boolean mo58904q2(boolean z) {
        if (!mo58881f3()) {
            return false;
        }
        if (z == mo58911u0(!z)) {
            return true;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            L0.mo36780g(this.f50865Y, z);
        } else {
            SharedPreferences.Editor g = this.f50871b.mo59193g();
            g.putBoolean(this.f50865Y, z);
            mo58883g3(g);
        }
        return true;
    }

    /* renamed from: r */
    public int compareTo(@C0359n0 Preference preference) {
        int i = this.f50882v;
        int i2 = preference.f50882v;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f50884x;
        CharSequence charSequence2 = preference.f50884x;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f50884x.toString());
    }

    /* renamed from: r2 */
    public boolean mo58906r2(float f) {
        if (!mo58881f3()) {
            return false;
        }
        if (f == mo58820A0(Float.NaN)) {
            return true;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            L0.mo36781h(this.f50865Y, f);
        } else {
            SharedPreferences.Editor g = this.f50871b.mo59193g();
            g.putFloat(this.f50865Y, f);
            mo58883g3(g);
        }
        return true;
    }

    /* renamed from: s2 */
    public boolean mo58907s2(int i) {
        if (!mo58881f3()) {
            return false;
        }
        if (i == mo58825C0(~i)) {
            return true;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            L0.mo36782i(this.f50865Y, i);
        } else {
            SharedPreferences.Editor g = this.f50871b.mo59193g();
            g.putInt(this.f50865Y, i);
            mo58883g3(g);
        }
        return true;
    }

    @C0363p0
    /* renamed from: t0 */
    public PreferenceGroup mo58908t0() {
        return this.f50870a1;
    }

    /* renamed from: t2 */
    public boolean mo58909t2(long j) {
        if (!mo58881f3()) {
            return false;
        }
        if (j == mo58830F0(~j)) {
            return true;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            L0.mo36783j(this.f50865Y, j);
        } else {
            SharedPreferences.Editor g = this.f50871b.mo59193g();
            g.putLong(this.f50865Y, j);
            mo58883g3(g);
        }
        return true;
    }

    @C0359n0
    public String toString() {
        return mo58868Z().toString();
    }

    /* renamed from: u0 */
    public boolean mo58911u0(boolean z) {
        if (!mo58881f3()) {
            return z;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            return L0.mo36774a(this.f50865Y, z);
        }
        return this.f50871b.mo59201o().getBoolean(this.f50865Y, z);
    }

    /* renamed from: u2 */
    public boolean mo58912u2(String str) {
        if (!mo58881f3()) {
            return false;
        }
        if (TextUtils.equals(str, mo58834H0((String) null))) {
            return true;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            L0.mo36784k(this.f50865Y, str);
        } else {
            SharedPreferences.Editor g = this.f50871b.mo59193g();
            g.putString(this.f50865Y, str);
            mo58883g3(g);
        }
        return true;
    }

    /* renamed from: v2 */
    public boolean mo58913v2(Set<String> set) {
        if (!mo58881f3()) {
            return false;
        }
        if (set.equals(mo58840K0((Set<String>) null))) {
            return true;
        }
        C19928i L0 = mo58842L0();
        if (L0 != null) {
            L0.mo36785l(this.f50865Y, set);
        } else {
            SharedPreferences.Editor g = this.f50871b.mo59193g();
            g.putStringSet(this.f50865Y, set);
            mo58883g3(g);
        }
        return true;
    }

    /* renamed from: w */
    public void mo58914w(@C0359n0 Bundle bundle) {
        Parcelable parcelable;
        if (mo58893l1() && (parcelable = bundle.getParcelable(this.f50865Y)) != null) {
            this.f50874c1 = false;
            mo58776j2(parcelable);
            if (!this.f50874c1) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* renamed from: w1 */
    public boolean mo58915w1() {
        return this.f50859T0;
    }

    /* renamed from: w2 */
    public final void mo58916w2() {
        if (!TextUtils.isEmpty(this.f50850K0)) {
            Preference M = mo58845M(this.f50850K0);
            if (M != null) {
                M.mo58917x2(this);
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f50850K0 + "\" not found for preference \"" + this.f50865Y + "\" (title: \"" + this.f50884x + "\"");
        }
    }

    /* renamed from: x2 */
    public final void mo58917x2(Preference preference) {
        if (this.f50868Z0 == null) {
            this.f50868Z0 = new ArrayList();
        }
        this.f50868Z0.add(preference);
        preference.mo58865X1(this, mo58775e3());
    }

    /* renamed from: y */
    public void mo58918y(@C0359n0 Bundle bundle) {
        if (mo58893l1()) {
            this.f50874c1 = false;
            Parcelable k2 = mo58777k2();
            if (!this.f50874c1) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (k2 != null) {
                bundle.putParcelable(this.f50865Y, k2);
            }
        }
    }

    /* renamed from: y2 */
    public void mo58919y2() {
        if (!TextUtils.isEmpty(this.f50865Y)) {
            this.f50848I0 = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    /* renamed from: z */
    public final void mo58920z() {
        if (mo58842L0() != null) {
            mo58895m2(true, this.f50851L0);
        } else if (!mo58881f3() || !mo58851O0().contains(this.f50865Y)) {
            Object obj = this.f50851L0;
            if (obj != null) {
                mo58895m2(false, obj);
            }
        } else {
            mo58895m2(true, (Object) null);
        }
    }

    /* renamed from: z1 */
    public boolean mo58921z1() {
        return this.f50849J0;
    }

    /* renamed from: z2 */
    public void mo58922z2(@C0359n0 Bundle bundle) {
        mo58914w(bundle);
    }

    public Preference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, C17483q.m80225a(context, C19975v.C19976a.preferenceStyle, 16842894));
    }

    public Preference(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }
}
