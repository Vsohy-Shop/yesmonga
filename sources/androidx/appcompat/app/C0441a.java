package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0324b1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.view.C0535b;
import androidx.fragment.app.C19234h0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.appcompat.app.a */
public abstract class C0441a {
    @Deprecated

    /* renamed from: a */
    public static final int f1099a = 0;
    @Deprecated

    /* renamed from: b */
    public static final int f1100b = 1;
    @Deprecated

    /* renamed from: c */
    public static final int f1101c = 2;

    /* renamed from: d */
    public static final int f1102d = 1;

    /* renamed from: e */
    public static final int f1103e = 2;

    /* renamed from: f */
    public static final int f1104f = 4;

    /* renamed from: g */
    public static final int f1105g = 8;

    /* renamed from: h */
    public static final int f1106h = 16;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.a$a */
    public @interface C0442a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.app.a$c */
    public @interface C0444c {
    }

    /* renamed from: androidx.appcompat.app.a$d */
    public interface C0445d {
        /* renamed from: a */
        void mo1316a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$e */
    public interface C0446e {
        /* renamed from: a */
        boolean mo1317a(int i, long j);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$f */
    public static abstract class C0447f {

        /* renamed from: a */
        public static final int f1108a = -1;

        /* renamed from: a */
        public abstract CharSequence mo1318a();

        /* renamed from: b */
        public abstract View mo1319b();

        /* renamed from: c */
        public abstract Drawable mo1320c();

        /* renamed from: d */
        public abstract int mo1321d();

        /* renamed from: e */
        public abstract Object mo1322e();

        /* renamed from: f */
        public abstract CharSequence mo1323f();

        /* renamed from: g */
        public abstract void mo1324g();

        /* renamed from: h */
        public abstract C0447f mo1325h(@C0324b1 int i);

        /* renamed from: i */
        public abstract C0447f mo1326i(CharSequence charSequence);

        /* renamed from: j */
        public abstract C0447f mo1327j(int i);

        /* renamed from: k */
        public abstract C0447f mo1328k(View view);

        /* renamed from: l */
        public abstract C0447f mo1329l(@C0375v int i);

        /* renamed from: m */
        public abstract C0447f mo1330m(Drawable drawable);

        /* renamed from: n */
        public abstract C0447f mo1331n(C0448g gVar);

        /* renamed from: o */
        public abstract C0447f mo1332o(Object obj);

        /* renamed from: p */
        public abstract C0447f mo1333p(int i);

        /* renamed from: q */
        public abstract C0447f mo1334q(CharSequence charSequence);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$g */
    public interface C0448g {
        /* renamed from: a */
        void mo1335a(C0447f fVar, C19234h0 h0Var);

        /* renamed from: b */
        void mo1336b(C0447f fVar, C19234h0 h0Var);

        /* renamed from: c */
        void mo1337c(C0447f fVar, C19234h0 h0Var);
    }

    /* renamed from: A */
    public Context mo1240A() {
        return null;
    }

    /* renamed from: A0 */
    public abstract void mo1241A0(CharSequence charSequence);

    @C0363p0
    /* renamed from: B */
    public abstract CharSequence mo1242B();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: B0 */
    public void mo1243B0(CharSequence charSequence) {
    }

    /* renamed from: C */
    public abstract void mo1244C();

    /* renamed from: C0 */
    public abstract void mo1245C0();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: D */
    public boolean mo1246D() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: D0 */
    public C0535b mo1247D0(C0535b.C0536a aVar) {
        return null;
    }

    /* renamed from: E */
    public boolean mo1248E() {
        return false;
    }

    /* renamed from: F */
    public abstract boolean mo1249F();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: G */
    public boolean mo1250G() {
        return false;
    }

    @Deprecated
    /* renamed from: H */
    public abstract C0447f mo1251H();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: I */
    public void mo1252I(Configuration configuration) {
    }

    /* renamed from: J */
    public void mo1253J() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: K */
    public boolean mo1254K(int i, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: L */
    public boolean mo1255L(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: M */
    public boolean mo1256M() {
        return false;
    }

    @Deprecated
    /* renamed from: N */
    public abstract void mo1257N();

    /* renamed from: O */
    public abstract void mo1258O(C0445d dVar);

    @Deprecated
    /* renamed from: P */
    public abstract void mo1259P(C0447f fVar);

    @Deprecated
    /* renamed from: Q */
    public abstract void mo1260Q(int i);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: R */
    public boolean mo1261R() {
        return false;
    }

    @Deprecated
    /* renamed from: S */
    public abstract void mo1262S(C0447f fVar);

    /* renamed from: T */
    public abstract void mo1263T(@C0363p0 Drawable drawable);

    /* renamed from: U */
    public abstract void mo1264U(int i);

    /* renamed from: V */
    public abstract void mo1265V(View view);

    /* renamed from: W */
    public abstract void mo1266W(View view, C0443b bVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: X */
    public void mo1267X(boolean z) {
    }

    /* renamed from: Y */
    public abstract void mo1268Y(boolean z);

    /* renamed from: Z */
    public abstract void mo1269Z(int i);

    /* renamed from: a0 */
    public abstract void mo1270a0(int i, int i2);

    /* renamed from: b0 */
    public abstract void mo1271b0(boolean z);

    /* renamed from: c0 */
    public abstract void mo1272c0(boolean z);

    /* renamed from: d0 */
    public abstract void mo1273d0(boolean z);

    /* renamed from: e0 */
    public abstract void mo1274e0(boolean z);

    /* renamed from: f0 */
    public void mo1275f0(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: g */
    public abstract void mo1276g(C0445d dVar);

    /* renamed from: g0 */
    public void mo1277g0(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    /* renamed from: h */
    public abstract void mo1278h(C0447f fVar);

    /* renamed from: h0 */
    public void mo1279h0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    /* renamed from: i */
    public abstract void mo1280i(C0447f fVar, int i);

    /* renamed from: i0 */
    public void mo1281i0(@C0324b1 int i) {
    }

    @Deprecated
    /* renamed from: j */
    public abstract void mo1282j(C0447f fVar, int i, boolean z);

    /* renamed from: j0 */
    public void mo1283j0(@C0363p0 CharSequence charSequence) {
    }

    @Deprecated
    /* renamed from: k */
    public abstract void mo1284k(C0447f fVar, boolean z);

    /* renamed from: k0 */
    public void mo1285k0(@C0375v int i) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public boolean mo1286l() {
        return false;
    }

    /* renamed from: l0 */
    public void mo1287l0(@C0363p0 Drawable drawable) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public boolean mo1288m() {
        return false;
    }

    /* renamed from: m0 */
    public void mo1289m0(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: n */
    public void mo1290n(boolean z) {
    }

    /* renamed from: n0 */
    public abstract void mo1291n0(@C0375v int i);

    /* renamed from: o */
    public abstract View mo1292o();

    /* renamed from: o0 */
    public abstract void mo1293o0(Drawable drawable);

    /* renamed from: p */
    public abstract int mo1294p();

    @Deprecated
    /* renamed from: p0 */
    public abstract void mo1295p0(SpinnerAdapter spinnerAdapter, C0446e eVar);

    /* renamed from: q */
    public float mo1296q() {
        return 0.0f;
    }

    /* renamed from: q0 */
    public abstract void mo1297q0(@C0375v int i);

    /* renamed from: r */
    public abstract int mo1298r();

    /* renamed from: r0 */
    public abstract void mo1299r0(Drawable drawable);

    /* renamed from: s */
    public int mo1300s() {
        return 0;
    }

    @Deprecated
    /* renamed from: s0 */
    public abstract void mo1301s0(int i);

    @Deprecated
    /* renamed from: t */
    public abstract int mo1302t();

    @Deprecated
    /* renamed from: t0 */
    public abstract void mo1303t0(int i);

    @Deprecated
    /* renamed from: u */
    public abstract int mo1304u();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: u0 */
    public void mo1305u0(boolean z) {
    }

    @Deprecated
    /* renamed from: v */
    public abstract int mo1306v();

    /* renamed from: v0 */
    public void mo1307v0(Drawable drawable) {
    }

    @C0363p0
    @Deprecated
    /* renamed from: w */
    public abstract C0447f mo1308w();

    /* renamed from: w0 */
    public void mo1309w0(Drawable drawable) {
    }

    @C0363p0
    /* renamed from: x */
    public abstract CharSequence mo1310x();

    /* renamed from: x0 */
    public abstract void mo1311x0(int i);

    @Deprecated
    /* renamed from: y */
    public abstract C0447f mo1312y(int i);

    /* renamed from: y0 */
    public abstract void mo1313y0(CharSequence charSequence);

    @Deprecated
    /* renamed from: z */
    public abstract int mo1314z();

    /* renamed from: z0 */
    public abstract void mo1315z0(@C0324b1 int i);

    /* renamed from: androidx.appcompat.app.a$b */
    public static class C0443b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f1107a;

        public C0443b(@C0359n0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1107a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0387a.C0400m.ActionBarLayout);
            this.f1107a = obtainStyledAttributes.getInt(C0387a.C0400m.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0443b(int i, int i2) {
            super(i, i2);
            this.f1107a = 8388627;
        }

        public C0443b(int i, int i2, int i3) {
            super(i, i2);
            this.f1107a = i3;
        }

        public C0443b(int i) {
            this(-2, -1, i);
        }

        public C0443b(C0443b bVar) {
            super(bVar);
            this.f1107a = 0;
            this.f1107a = bVar.f1107a;
        }

        public C0443b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1107a = 0;
        }
    }
}
