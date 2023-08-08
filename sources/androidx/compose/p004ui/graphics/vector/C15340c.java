package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.graphics.vector.c */
public final class C15340c {
    @C12579k

    /* renamed from: j */
    public static final C15343b f37827j = new C15343b((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final int f37828k = 0;
    @C12579k

    /* renamed from: a */
    public final String f37829a;

    /* renamed from: b */
    public final float f37830b;

    /* renamed from: c */
    public final float f37831c;

    /* renamed from: d */
    public final float f37832d;

    /* renamed from: e */
    public final float f37833e;
    @C12579k

    /* renamed from: f */
    public final C15378m f37834f;

    /* renamed from: g */
    public final long f37835g;

    /* renamed from: h */
    public final int f37836h;

    /* renamed from: i */
    public final boolean f37837i;

    @C8567o(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.c$a */
    public static final class C15341a {

        /* renamed from: l */
        public static final int f37838l = 8;
        @C12579k

        /* renamed from: a */
        public final String f37839a;

        /* renamed from: b */
        public final float f37840b;

        /* renamed from: c */
        public final float f37841c;

        /* renamed from: d */
        public final float f37842d;

        /* renamed from: e */
        public final float f37843e;

        /* renamed from: f */
        public final long f37844f;

        /* renamed from: g */
        public final int f37845g;

        /* renamed from: h */
        public final boolean f37846h;
        @C12579k

        /* renamed from: i */
        public final ArrayList<C15342a> f37847i;
        @C12579k

        /* renamed from: j */
        public C15342a f37848j;

        /* renamed from: k */
        public boolean f37849k;

        /* renamed from: androidx.compose.ui.graphics.vector.c$a$a */
        public static final class C15342a {
            @C12579k

            /* renamed from: a */
            public String f37850a;

            /* renamed from: b */
            public float f37851b;

            /* renamed from: c */
            public float f37852c;

            /* renamed from: d */
            public float f37853d;

            /* renamed from: e */
            public float f37854e;

            /* renamed from: f */
            public float f37855f;

            /* renamed from: g */
            public float f37856g;

            /* renamed from: h */
            public float f37857h;
            @C12579k

            /* renamed from: i */
            public List<? extends C15349f> f37858i;
            @C12579k

            /* renamed from: j */
            public List<C15381o> f37859j;

            public C15342a() {
                this((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
            }

            @C12579k
            /* renamed from: a */
            public final List<C15381o> mo43188a() {
                return this.f37859j;
            }

            @C12579k
            /* renamed from: b */
            public final List<C15349f> mo43189b() {
                return this.f37858i;
            }

            @C12579k
            /* renamed from: c */
            public final String mo43190c() {
                return this.f37850a;
            }

            /* renamed from: d */
            public final float mo43191d() {
                return this.f37852c;
            }

            /* renamed from: e */
            public final float mo43192e() {
                return this.f37853d;
            }

            /* renamed from: f */
            public final float mo43193f() {
                return this.f37851b;
            }

            /* renamed from: g */
            public final float mo43194g() {
                return this.f37854e;
            }

            /* renamed from: h */
            public final float mo43195h() {
                return this.f37855f;
            }

            /* renamed from: i */
            public final float mo43196i() {
                return this.f37856g;
            }

            /* renamed from: j */
            public final float mo43197j() {
                return this.f37857h;
            }

            /* renamed from: k */
            public final void mo43198k(@C12579k List<C15381o> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.f37859j = list;
            }

            /* renamed from: l */
            public final void mo43199l(@C12579k List<? extends C15349f> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.f37858i = list;
            }

            /* renamed from: m */
            public final void mo43200m(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.f37850a = str;
            }

            /* renamed from: n */
            public final void mo43201n(float f) {
                this.f37852c = f;
            }

            /* renamed from: o */
            public final void mo43202o(float f) {
                this.f37853d = f;
            }

            /* renamed from: p */
            public final void mo43203p(float f) {
                this.f37851b = f;
            }

            /* renamed from: q */
            public final void mo43204q(float f) {
                this.f37854e = f;
            }

            /* renamed from: r */
            public final void mo43205r(float f) {
                this.f37855f = f;
            }

            /* renamed from: s */
            public final void mo43206s(float f) {
                this.f37856g = f;
            }

            /* renamed from: t */
            public final void mo43207t(float f) {
                this.f37857h = f;
            }

            public C15342a(@C12579k String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @C12579k List<? extends C15349f> list, @C12579k List<C15381o> list2) {
                Intrinsics.checkNotNullParameter(str, "name");
                Intrinsics.checkNotNullParameter(list, "clipPathData");
                Intrinsics.checkNotNullParameter(list2, "children");
                this.f37850a = str;
                this.f37851b = f;
                this.f37852c = f2;
                this.f37853d = f3;
                this.f37854e = f4;
                this.f37855f = f5;
                this.f37856g = f6;
                this.f37857h = f7;
                this.f37858i = list;
                this.f37859j = list2;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C15342a(java.lang.String r11, float r12, float r13, float r14, float r15, float r16, float r17, float r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
                /*
                    r10 = this;
                    r0 = r21
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x0009
                    java.lang.String r1 = ""
                    goto L_0x000a
                L_0x0009:
                    r1 = r11
                L_0x000a:
                    r2 = r0 & 2
                    r3 = 0
                    if (r2 == 0) goto L_0x0011
                    r2 = r3
                    goto L_0x0012
                L_0x0011:
                    r2 = r12
                L_0x0012:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0018
                    r4 = r3
                    goto L_0x0019
                L_0x0018:
                    r4 = r13
                L_0x0019:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x001f
                    r5 = r3
                    goto L_0x0020
                L_0x001f:
                    r5 = r14
                L_0x0020:
                    r6 = r0 & 16
                    r7 = 1065353216(0x3f800000, float:1.0)
                    if (r6 == 0) goto L_0x0028
                    r6 = r7
                    goto L_0x0029
                L_0x0028:
                    r6 = r15
                L_0x0029:
                    r8 = r0 & 32
                    if (r8 == 0) goto L_0x002e
                    goto L_0x0030
                L_0x002e:
                    r7 = r16
                L_0x0030:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0036
                    r8 = r3
                    goto L_0x0038
                L_0x0036:
                    r8 = r17
                L_0x0038:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x003d
                    goto L_0x003f
                L_0x003d:
                    r3 = r18
                L_0x003f:
                    r9 = r0 & 256(0x100, float:3.59E-43)
                    if (r9 == 0) goto L_0x0048
                    java.util.List r9 = androidx.compose.p004ui.graphics.vector.C15380n.m67243h()
                    goto L_0x004a
                L_0x0048:
                    r9 = r19
                L_0x004a:
                    r0 = r0 & 512(0x200, float:7.175E-43)
                    if (r0 == 0) goto L_0x0054
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    goto L_0x0056
                L_0x0054:
                    r0 = r20
                L_0x0056:
                    r11 = r10
                    r12 = r1
                    r13 = r2
                    r14 = r4
                    r15 = r5
                    r16 = r6
                    r17 = r7
                    r18 = r8
                    r19 = r3
                    r20 = r9
                    r21 = r0
                    r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.vector.C15340c.C15341a.C15342a.<init>(java.lang.String, float, float, float, float, float, float, float, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        @C11395k(level = DeprecationLevel.HIDDEN, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @C11587t0(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public /* synthetic */ C15341a(String str, float f, float f2, float f3, float f4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i);
        }

        /* renamed from: b */
        public static /* synthetic */ C15341a m66872b(C15341a aVar, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            String str2;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            List list2;
            int i2 = i;
            if ((i2 & 1) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            float f13 = 0.0f;
            if ((i2 & 2) != 0) {
                f8 = 0.0f;
            } else {
                f8 = f;
            }
            if ((i2 & 4) != 0) {
                f9 = 0.0f;
            } else {
                f9 = f2;
            }
            if ((i2 & 8) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f3;
            }
            float f14 = 1.0f;
            if ((i2 & 16) != 0) {
                f11 = 1.0f;
            } else {
                f11 = f4;
            }
            if ((i2 & 32) == 0) {
                f14 = f5;
            }
            if ((i2 & 64) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f6;
            }
            if ((i2 & 128) == 0) {
                f13 = f7;
            }
            if ((i2 & 256) != 0) {
                list2 = C15380n.m67243h();
            } else {
                list2 = list;
            }
            return aVar.mo43181a(str2, f8, f9, f10, f11, f14, f12, f13, list2);
        }

        /* renamed from: d */
        public static /* synthetic */ C15341a m66873d(C15341a aVar, List list, int i, String str, C15421z1 z1Var, float f, C15421z1 z1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, Object obj) {
            int i5;
            String str2;
            C15421z1 z1Var3;
            float f8;
            float f9;
            float f10;
            int i6;
            int i7;
            float f11;
            float f12;
            int i8 = i4;
            if ((i8 & 2) != 0) {
                i5 = C15380n.m67238c();
            } else {
                i5 = i;
            }
            if ((i8 & 4) != 0) {
                str2 = "";
            } else {
                str2 = str;
            }
            C15421z1 z1Var4 = null;
            if ((i8 & 8) != 0) {
                z1Var3 = null;
            } else {
                z1Var3 = z1Var;
            }
            float f13 = 1.0f;
            if ((i8 & 16) != 0) {
                f8 = 1.0f;
            } else {
                f8 = f;
            }
            if ((i8 & 32) == 0) {
                z1Var4 = z1Var2;
            }
            if ((i8 & 64) != 0) {
                f9 = 1.0f;
            } else {
                f9 = f2;
            }
            float f14 = 0.0f;
            if ((i8 & 128) != 0) {
                f10 = 0.0f;
            } else {
                f10 = f3;
            }
            if ((i8 & 256) != 0) {
                i6 = C15380n.m67239d();
            } else {
                i6 = i2;
            }
            if ((i8 & 512) != 0) {
                i7 = C15380n.m67240e();
            } else {
                i7 = i3;
            }
            if ((i8 & 1024) != 0) {
                f11 = 4.0f;
            } else {
                f11 = f4;
            }
            if ((i8 & 2048) != 0) {
                f12 = 0.0f;
            } else {
                f12 = f5;
            }
            if ((i8 & 4096) == 0) {
                f13 = f6;
            }
            if ((i8 & 8192) == 0) {
                f14 = f7;
            }
            return aVar.mo43182c(list, i5, str2, z1Var3, f8, z1Var4, f9, f10, i6, i7, f11, f12, f13, f14);
        }

        @C12579k
        /* renamed from: a */
        public final C15341a mo43181a(@C12579k String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @C12579k List<? extends C15349f> list) {
            String str2 = str;
            Intrinsics.checkNotNullParameter(str2, "name");
            List<? extends C15349f> list2 = list;
            Intrinsics.checkNotNullParameter(list2, "clipPathData");
            mo43186h();
            boolean unused = C15347d.m66978j(this.f37847i, new C15342a(str2, f, f2, f3, f4, f5, f6, f7, list2, (List) null, 512, (DefaultConstructorMarker) null));
            return this;
        }

        @C12579k
        /* renamed from: c */
        public final C15341a mo43182c(@C12579k List<? extends C15349f> list, int i, @C12579k String str, @C12580l C15421z1 z1Var, float f, @C12580l C15421z1 z1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            List<? extends C15349f> list2 = list;
            Intrinsics.checkNotNullParameter(list2, "pathData");
            String str2 = str;
            Intrinsics.checkNotNullParameter(str2, "name");
            mo43186h();
            List<C15381o> a = mo43187i().mo43188a();
            C15382p pVar = r1;
            C15382p pVar2 = new C15382p(str2, list2, i, z1Var, f, z1Var2, f2, f3, i2, i3, f4, f5, f6, f7, (DefaultConstructorMarker) null);
            a.add(pVar);
            return this;
        }

        /* renamed from: e */
        public final C15378m mo43183e(C15342a aVar) {
            return new C15378m(aVar.mo43190c(), aVar.mo43193f(), aVar.mo43191d(), aVar.mo43192e(), aVar.mo43194g(), aVar.mo43195h(), aVar.mo43196i(), aVar.mo43197j(), aVar.mo43189b(), aVar.mo43188a());
        }

        @C12579k
        /* renamed from: f */
        public final C15340c mo43184f() {
            mo43186h();
            while (this.f37847i.size() > 1) {
                mo43185g();
            }
            C15340c cVar = new C15340c(this.f37839a, this.f37840b, this.f37841c, this.f37842d, this.f37843e, mo43183e(this.f37848j), this.f37844f, this.f37845g, this.f37846h, (DefaultConstructorMarker) null);
            this.f37849k = true;
            return cVar;
        }

        @C12579k
        /* renamed from: g */
        public final C15341a mo43185g() {
            mo43186h();
            mo43187i().mo43188a().add(mo43183e((C15342a) C15347d.m66977i(this.f37847i)));
            return this;
        }

        /* renamed from: h */
        public final void mo43186h() {
            if (!(!this.f37849k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        /* renamed from: i */
        public final C15342a mo43187i() {
            return (C15342a) C15347d.m66976h(this.f37847i);
        }

        public /* synthetic */ C15341a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        public C15341a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.f37839a = str;
            this.f37840b = f;
            this.f37841c = f2;
            this.f37842d = f3;
            this.f37843e = f4;
            this.f37844f = j;
            this.f37845g = i;
            this.f37846h = z;
            ArrayList<C15342a> arrayList = new ArrayList<>();
            this.f37847i = arrayList;
            C15342a aVar = new C15342a((String) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (List) null, (List) null, 1023, (DefaultConstructorMarker) null);
            this.f37848j = aVar;
            boolean unused = C15347d.m66978j(arrayList, aVar);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C15341a(java.lang.String r14, float r15, float r16, float r17, float r18, long r19, int r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000a
                java.lang.String r1 = ""
                r3 = r1
                goto L_0x000b
            L_0x000a:
                r3 = r14
            L_0x000b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0017
                androidx.compose.ui.graphics.j2$a r1 = androidx.compose.p004ui.graphics.C15240j2.f37547b
                long r1 = r1.mo42851u()
                r8 = r1
                goto L_0x0019
            L_0x0017:
                r8 = r19
            L_0x0019:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0025
                androidx.compose.ui.graphics.u1$a r1 = androidx.compose.p004ui.graphics.C15325u1.f37708b
                int r1 = r1.mo43042z()
                r10 = r1
                goto L_0x0027
            L_0x0025:
                r10 = r21
            L_0x0027:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x002e
                r0 = 0
                r11 = r0
                goto L_0x0030
            L_0x002e:
                r11 = r22
            L_0x0030:
                r12 = 0
                r2 = r13
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r18
                r2.<init>((java.lang.String) r3, (float) r4, (float) r5, (float) r6, (float) r7, (long) r8, (int) r10, (boolean) r11, (kotlin.jvm.internal.DefaultConstructorMarker) r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.graphics.vector.C15340c.C15341a.<init>(java.lang.String, float, float, float, float, long, int, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C15341a(String str, float f, float f2, float f3, float f4, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? C15240j2.f37547b.mo42851u() : j, (i2 & 64) != 0 ? C15325u1.f37708b.mo43042z() : i, (DefaultConstructorMarker) null);
        }

        public C15341a(String str, float f, float f2, float f3, float f4, long j, int i) {
            this(str, f, f2, f3, f4, j, i, false, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: androidx.compose.ui.graphics.vector.c$b */
    public static final class C15343b {
        public /* synthetic */ C15343b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C15343b() {
        }
    }

    public /* synthetic */ C15340c(String str, float f, float f2, float f3, float f4, C15378m mVar, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, f2, f3, f4, mVar, j, i, z);
    }

    /* renamed from: a */
    public final boolean mo43170a() {
        return this.f37837i;
    }

    /* renamed from: b */
    public final float mo43171b() {
        return this.f37831c;
    }

    /* renamed from: c */
    public final float mo43172c() {
        return this.f37830b;
    }

    @C12579k
    /* renamed from: d */
    public final String mo43173d() {
        return this.f37829a;
    }

    @C12579k
    /* renamed from: e */
    public final C15378m mo43174e() {
        return this.f37834f;
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15340c)) {
            return false;
        }
        C15340c cVar = (C15340c) obj;
        if (!Intrinsics.areEqual((Object) this.f37829a, (Object) cVar.f37829a) || !C16483g.m74440e0(this.f37830b, cVar.f37830b) || !C16483g.m74440e0(this.f37831c, cVar.f37831c)) {
            return false;
        }
        if (this.f37832d == cVar.f37832d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f37833e == cVar.f37833e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && Intrinsics.areEqual((Object) this.f37834f, (Object) cVar.f37834f) && C15240j2.m66082y(this.f37835g, cVar.f37835g) && C15325u1.m66580G(this.f37836h, cVar.f37836h) && this.f37837i == cVar.f37837i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo43176f() {
        return this.f37836h;
    }

    /* renamed from: g */
    public final long mo43177g() {
        return this.f37835g;
    }

    /* renamed from: h */
    public final float mo43178h() {
        return this.f37833e;
    }

    public int hashCode() {
        return (((((((((((((((this.f37829a.hashCode() * 31) + C16483g.m74442h0(this.f37830b)) * 31) + C16483g.m74442h0(this.f37831c)) * 31) + Float.hashCode(this.f37832d)) * 31) + Float.hashCode(this.f37833e)) * 31) + this.f37834f.hashCode()) * 31) + C15240j2.m66056K(this.f37835g)) * 31) + C15325u1.m66581H(this.f37836h)) * 31) + Boolean.hashCode(this.f37837i);
    }

    /* renamed from: i */
    public final float mo43180i() {
        return this.f37832d;
    }

    public C15340c(String str, float f, float f2, float f3, float f4, C15378m mVar, long j, int i, boolean z) {
        this.f37829a = str;
        this.f37830b = f;
        this.f37831c = f2;
        this.f37832d = f3;
        this.f37833e = f4;
        this.f37834f = mVar;
        this.f37835g = j;
        this.f37836h = i;
        this.f37837i = z;
    }
}
