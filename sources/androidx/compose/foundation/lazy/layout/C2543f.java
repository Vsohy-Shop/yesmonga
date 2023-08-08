package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C2458g;
import androidx.compose.p004ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p004ui.layout.C15535b;
import androidx.compose.p004ui.modifier.C15634j;
import androidx.compose.p004ui.modifier.C15638m;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.lazy.layout.f */
public final class C2543f implements C15634j<C15535b>, C15535b {
    @C12579k

    /* renamed from: f */
    public static final C2545b f6716f = new C2545b((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: g */
    public static final C2544a f6717g = new C2544a();
    @C12579k

    /* renamed from: a */
    public final C2537a f6718a;
    @C12579k

    /* renamed from: b */
    public final C2458g f6719b;

    /* renamed from: c */
    public final boolean f6720c;
    @C12579k

    /* renamed from: d */
    public final LayoutDirection f6721d;
    @C12579k

    /* renamed from: e */
    public final Orientation f6722e;

    /* renamed from: androidx.compose.foundation.lazy.layout.f$a */
    public static final class C2544a implements C15535b.C15536a {

        /* renamed from: a */
        public final boolean f6723a;

        /* renamed from: a */
        public boolean mo8737a() {
            return this.f6723a;
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.f$b */
    public static final class C2545b {
        public /* synthetic */ C2545b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C2545b() {
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.f$c */
    public /* synthetic */ class C2546c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p004ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p004ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C2543f.C2546c.<clinit>():void");
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.layout.f$d */
    public static final class C2547d implements C15535b.C15536a {

        /* renamed from: a */
        public final /* synthetic */ C2543f f6724a;

        /* renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<C2458g.C2459a> f6725b;

        /* renamed from: c */
        public final /* synthetic */ int f6726c;

        public C2547d(C2543f fVar, Ref.ObjectRef<C2458g.C2459a> objectRef, int i) {
            this.f6724a = fVar;
            this.f6725b = objectRef;
            this.f6726c = i;
        }

        /* renamed from: a */
        public boolean mo8737a() {
            return this.f6724a.mo8735l((C2458g.C2459a) this.f6725b.element, this.f6726c);
        }
    }

    public C2543f(@C12579k C2537a aVar, @C12579k C2458g gVar, boolean z, @C12579k LayoutDirection layoutDirection, @C12579k Orientation orientation) {
        Intrinsics.checkNotNullParameter(aVar, "state");
        Intrinsics.checkNotNullParameter(gVar, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f6718a = aVar;
        this.f6719b = gVar;
        this.f6720c = z;
        this.f6721d = layoutDirection;
        this.f6722e = orientation;
    }

    /* renamed from: m */
    public static final boolean m11407m(C2458g.C2459a aVar, C2543f fVar) {
        return aVar.mo8401e() < fVar.f6718a.mo8643a() - 1;
    }

    /* renamed from: n */
    public static final boolean m11408n(C2458g.C2459a aVar) {
        return aVar.mo8403f() > 0;
    }

    @C12580l
    /* renamed from: a */
    public <T> T mo8732a(int i, @C12579k C11300l<? super C15535b.C15536a, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        if (this.f6718a.mo8643a() <= 0 || !this.f6718a.mo8645c()) {
            return lVar.invoke(f6717g);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.f6719b.mo8393a(this.f6718a.mo8646d(), this.f6718a.mo8647e());
        T t = null;
        while (t == null && mo8735l((C2458g.C2459a) objectRef.element, i)) {
            T e = mo8733e((C2458g.C2459a) objectRef.element, i);
            this.f6719b.mo8397e((C2458g.C2459a) objectRef.element);
            objectRef.element = e;
            this.f6718a.mo8644b();
            t = lVar.invoke(new C2547d(this, objectRef, i));
        }
        this.f6719b.mo8397e((C2458g.C2459a) objectRef.element);
        this.f6718a.mo8644b();
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r5.f6720c != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r5.f6720c != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r5.f6720c != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r5.f6720c != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r5.f6720c != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r5.f6720c != false) goto L_0x0022;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.C2458g.C2459a mo8733e(androidx.compose.foundation.lazy.C2458g.C2459a r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.mo8403f()
            int r6 = r6.mo8401e()
            androidx.compose.ui.layout.b$b$a r1 = androidx.compose.p004ui.layout.C15535b.C15537b.f38688b
            int r2 = r1.mo44363c()
            boolean r2 = androidx.compose.p004ui.layout.C15535b.C15537b.m69061j(r7, r2)
            if (r2 == 0) goto L_0x0018
        L_0x0014:
            int r0 = r0 + -1
            goto L_0x008c
        L_0x0018:
            int r2 = r1.mo44362b()
            boolean r2 = androidx.compose.p004ui.layout.C15535b.C15537b.m69061j(r7, r2)
            if (r2 == 0) goto L_0x0026
        L_0x0022:
            int r6 = r6 + 1
            goto L_0x008c
        L_0x0026:
            int r2 = r1.mo44361a()
            boolean r2 = androidx.compose.p004ui.layout.C15535b.C15537b.m69061j(r7, r2)
            if (r2 == 0) goto L_0x0035
            boolean r7 = r5.f6720c
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0035:
            int r2 = r1.mo44364d()
            boolean r2 = androidx.compose.p004ui.layout.C15535b.C15537b.m69061j(r7, r2)
            if (r2 == 0) goto L_0x0044
            boolean r7 = r5.f6720c
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x0044:
            int r2 = r1.mo44365e()
            boolean r2 = androidx.compose.p004ui.layout.C15535b.C15537b.m69061j(r7, r2)
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0069
            androidx.compose.ui.unit.LayoutDirection r7 = r5.f6721d
            int[] r1 = androidx.compose.foundation.lazy.layout.C2543f.C2546c.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L_0x0064
            if (r7 == r3) goto L_0x005f
            goto L_0x008c
        L_0x005f:
            boolean r7 = r5.f6720c
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x0064:
            boolean r7 = r5.f6720c
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0069:
            int r1 = r1.mo44366f()
            boolean r7 = androidx.compose.p004ui.layout.C15535b.C15537b.m69061j(r7, r1)
            if (r7 == 0) goto L_0x0093
            androidx.compose.ui.unit.LayoutDirection r7 = r5.f6721d
            int[] r1 = androidx.compose.foundation.lazy.layout.C2543f.C2546c.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L_0x0087
            if (r7 == r3) goto L_0x0082
            goto L_0x008c
        L_0x0082:
            boolean r7 = r5.f6720c
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0087:
            boolean r7 = r5.f6720c
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x008c:
            androidx.compose.foundation.lazy.g r7 = r5.f6719b
            androidx.compose.foundation.lazy.g$a r6 = r7.mo8393a(r0, r6)
            return r6
        L_0x0093:
            java.lang.Void unused = androidx.compose.foundation.lazy.layout.C2548g.m11417b()
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C2543f.mo8733e(androidx.compose.foundation.lazy.g$a, int):androidx.compose.foundation.lazy.g$a");
    }

    @C12579k
    /* renamed from: g */
    public C15535b getValue() {
        return this;
    }

    @C12579k
    public C15638m<C15535b> getKey() {
        return BeyondBoundsLayoutKt.m68890a();
    }

    /* renamed from: l */
    public final boolean mo8735l(C2458g.C2459a aVar, int i) {
        if (mo8736o(i)) {
            return false;
        }
        C15535b.C15537b.C15538a aVar2 = C15535b.C15537b.f38688b;
        if (C15535b.C15537b.m69061j(i, aVar2.mo44363c())) {
            return m11408n(aVar);
        }
        if (C15535b.C15537b.m69061j(i, aVar2.mo44362b())) {
            return m11407m(aVar, this);
        }
        if (C15535b.C15537b.m69061j(i, aVar2.mo44361a())) {
            if (this.f6720c) {
                return m11407m(aVar, this);
            }
            return m11408n(aVar);
        } else if (C15535b.C15537b.m69061j(i, aVar2.mo44364d())) {
            if (this.f6720c) {
                return m11408n(aVar);
            }
            return m11407m(aVar, this);
        } else if (C15535b.C15537b.m69061j(i, aVar2.mo44365e())) {
            int i2 = C2546c.$EnumSwitchMapping$0[this.f6721d.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else if (this.f6720c) {
                    return m11408n(aVar);
                } else {
                    return m11407m(aVar, this);
                }
            } else if (this.f6720c) {
                return m11407m(aVar, this);
            } else {
                return m11408n(aVar);
            }
        } else if (C15535b.C15537b.m69061j(i, aVar2.mo44366f())) {
            int i3 = C2546c.$EnumSwitchMapping$0[this.f6721d.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                } else if (this.f6720c) {
                    return m11407m(aVar, this);
                } else {
                    return m11408n(aVar);
                }
            } else if (this.f6720c) {
                return m11408n(aVar);
            } else {
                return m11407m(aVar, this);
            }
        } else {
            Void unused = C2548g.m11417b();
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: o */
    public final boolean mo8736o(int i) {
        boolean z;
        boolean z2;
        C15535b.C15537b.C15538a aVar = C15535b.C15537b.f38688b;
        boolean z3 = true;
        if (C15535b.C15537b.m69061j(i, aVar.mo44361a())) {
            z = true;
        } else {
            z = C15535b.C15537b.m69061j(i, aVar.mo44364d());
        }
        if (!z) {
            if (C15535b.C15537b.m69061j(i, aVar.mo44365e())) {
                z2 = true;
            } else {
                z2 = C15535b.C15537b.m69061j(i, aVar.mo44366f());
            }
            if (!z2) {
                if (!C15535b.C15537b.m69061j(i, aVar.mo44363c())) {
                    z3 = C15535b.C15537b.m69061j(i, aVar.mo44362b());
                }
                if (!z3) {
                    Void unused = C2548g.m11417b();
                    throw new KotlinNothingValueException();
                }
            } else if (this.f6722e == Orientation.Vertical) {
                return true;
            }
        } else if (this.f6722e == Orientation.Horizontal) {
            return true;
        }
        return false;
    }
}
