package com.urbanairship.android.layout;

import androidx.core.view.C18124b2;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.android.layout.environment.C35599i;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35648b0;
import com.urbanairship.android.layout.info.C35650c0;
import com.urbanairship.android.layout.info.C35658f0;
import com.urbanairship.android.layout.info.C35660g0;
import com.urbanairship.android.layout.info.C35661h;
import com.urbanairship.android.layout.info.C35672m0;
import com.urbanairship.android.layout.info.C35677p;
import com.urbanairship.android.layout.info.C35684s0;
import com.urbanairship.android.layout.info.C35686t0;
import com.urbanairship.android.layout.info.C35689u;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.model.C35804j;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10944i;
import kotlin.collections.C10975r0;
import kotlin.collections.C10976s;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.l */
public final class C35701l implements C35581e {
    @C12579k

    /* renamed from: a */
    public final Map<String, C35705b.C35706a> f88226a = new LinkedHashMap();
    @C12579k

    /* renamed from: b */
    public final Map<String, C35705b.C35706a> f88227b = new LinkedHashMap();
    @C12579k

    /* renamed from: c */
    public final Map<ViewType, Integer> f88228c = new LinkedHashMap();

    /* renamed from: d */
    public String f88229d;

    /* renamed from: com.urbanairship.android.layout.l$a */
    public static final class C35702a {
        @C12579k

        /* renamed from: a */
        public final List<String> f88230a;
        @C12580l

        /* renamed from: b */
        public final String f88231b;
        @C12580l

        /* renamed from: c */
        public final String f88232c;
        @C12580l

        /* renamed from: d */
        public final String f88233d;
        @C12580l

        /* renamed from: e */
        public final String f88234e;

        /* renamed from: com.urbanairship.android.layout.l$a$a */
        public static final class C35703a {
            @C12579k

            /* renamed from: a */
            public final List<String> f88235a;
            @C12580l

            /* renamed from: b */
            public String f88236b;
            @C12580l

            /* renamed from: c */
            public String f88237c;
            @C12580l

            /* renamed from: d */
            public String f88238d;
            @C12580l

            /* renamed from: e */
            public String f88239e;

            /* renamed from: com.urbanairship.android.layout.l$a$a$a */
            public /* synthetic */ class C35704a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ViewType.values().length];
                    iArr[ViewType.FORM_CONTROLLER.ordinal()] = 1;
                    iArr[ViewType.NPS_FORM_CONTROLLER.ordinal()] = 2;
                    iArr[ViewType.PAGER_CONTROLLER.ordinal()] = 3;
                    iArr[ViewType.CHECKBOX_CONTROLLER.ordinal()] = 4;
                    iArr[ViewType.RADIO_INPUT_CONTROLLER.ordinal()] = 5;
                    iArr[ViewType.STATE_CONTROLLER.ordinal()] = 6;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C35703a() {
                this((List) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            }

            /* renamed from: h */
            public static /* synthetic */ C35703a m147239h(C35703a aVar, List<String> list, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f88235a;
                }
                if ((i & 2) != 0) {
                    str = aVar.f88236b;
                }
                String str5 = str;
                if ((i & 4) != 0) {
                    str2 = aVar.f88237c;
                }
                String str6 = str2;
                if ((i & 8) != 0) {
                    str3 = aVar.f88238d;
                }
                String str7 = str3;
                if ((i & 16) != 0) {
                    str4 = aVar.f88239e;
                }
                return aVar.mo106893g(list, str5, str6, str7, str4);
            }

            @C12579k
            /* renamed from: a */
            public final C35702a mo106886a() {
                return new C35702a(CollectionsKt___CollectionsKt.m40557Q5(this.f88235a), this.f88236b, this.f88237c, this.f88238d, this.f88239e);
            }

            @C12579k
            /* renamed from: b */
            public final List<String> mo106887b() {
                return this.f88235a;
            }

            @C12580l
            /* renamed from: c */
            public final String mo106888c() {
                return this.f88236b;
            }

            @C12580l
            /* renamed from: d */
            public final String mo106889d() {
                return this.f88237c;
            }

            @C12580l
            /* renamed from: e */
            public final String mo106890e() {
                return this.f88238d;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C35703a)) {
                    return false;
                }
                C35703a aVar = (C35703a) obj;
                return Intrinsics.areEqual((Object) this.f88235a, (Object) aVar.f88235a) && Intrinsics.areEqual((Object) this.f88236b, (Object) aVar.f88236b) && Intrinsics.areEqual((Object) this.f88237c, (Object) aVar.f88237c) && Intrinsics.areEqual((Object) this.f88238d, (Object) aVar.f88238d) && Intrinsics.areEqual((Object) this.f88239e, (Object) aVar.f88239e);
            }

            @C12580l
            /* renamed from: f */
            public final String mo106892f() {
                return this.f88239e;
            }

            @C12579k
            /* renamed from: g */
            public final C35703a mo106893g(@C12579k List<String> list, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
                Intrinsics.checkNotNullParameter(list, "form");
                return new C35703a(list, str, str2, str3, str4);
            }

            public int hashCode() {
                int hashCode = this.f88235a.hashCode() * 31;
                String str = this.f88236b;
                int i = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f88237c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f88238d;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f88239e;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return hashCode4 + i;
            }

            @C12580l
            /* renamed from: i */
            public final String mo106895i() {
                return this.f88237c;
            }

            @C12579k
            /* renamed from: j */
            public final List<String> mo106896j() {
                return this.f88235a;
            }

            @C12580l
            /* renamed from: k */
            public final String mo106897k() {
                return this.f88239e;
            }

            @C12580l
            /* renamed from: l */
            public final String mo106898l() {
                return this.f88236b;
            }

            @C12580l
            /* renamed from: m */
            public final String mo106899m() {
                return this.f88238d;
            }

            /* renamed from: n */
            public final void mo106900n(@C12580l String str) {
                this.f88237c = str;
            }

            /* renamed from: o */
            public final void mo106901o(@C12580l String str) {
                this.f88239e = str;
            }

            /* renamed from: p */
            public final void mo106902p(@C12580l String str) {
                this.f88236b = str;
            }

            /* renamed from: q */
            public final void mo106903q(@C12580l String str) {
                this.f88238d = str;
            }

            @C12579k
            /* renamed from: r */
            public final C35703a mo106904r(@C12579k ViewType viewType, @C12579k String str) {
                Intrinsics.checkNotNullParameter(viewType, "type");
                Intrinsics.checkNotNullParameter(str, "tag");
                switch (C35704a.$EnumSwitchMapping$0[viewType.ordinal()]) {
                    case 1:
                    case 2:
                        return m147239h(this, CollectionsKt___CollectionsKt.m40718y4(C10976s.m41419k(str), this.f88235a), (String) null, (String) null, (String) null, (String) null, 30, (Object) null);
                    case 3:
                        return m147239h(this, (List) null, str, (String) null, (String) null, (String) null, 29, (Object) null);
                    case 4:
                        return m147239h(this, (List) null, (String) null, str, (String) null, (String) null, 27, (Object) null);
                    case 5:
                        return m147239h(this, (List) null, (String) null, (String) null, str, (String) null, 23, (Object) null);
                    case 6:
                        return m147239h(this, (List) null, (String) null, (String) null, (String) null, str, 15, (Object) null);
                    default:
                        return this;
                }
            }

            @C12579k
            public String toString() {
                return "Builder(form=" + this.f88235a + ", pager=" + this.f88236b + ", checkbox=" + this.f88237c + ", radio=" + this.f88238d + ", layout=" + this.f88239e + ')';
            }

            public C35703a(@C12579k List<String> list, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
                Intrinsics.checkNotNullParameter(list, "form");
                this.f88235a = list;
                this.f88236b = str;
                this.f88237c = str2;
                this.f88238d = str3;
                this.f88239e = str4;
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C35703a(java.util.List r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
                /*
                    r3 = this;
                    r10 = r9 & 1
                    if (r10 == 0) goto L_0x0009
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                L_0x0009:
                    r10 = r9 & 2
                    r0 = 0
                    if (r10 == 0) goto L_0x0010
                    r10 = r0
                    goto L_0x0011
                L_0x0010:
                    r10 = r5
                L_0x0011:
                    r5 = r9 & 4
                    if (r5 == 0) goto L_0x0017
                    r1 = r0
                    goto L_0x0018
                L_0x0017:
                    r1 = r6
                L_0x0018:
                    r5 = r9 & 8
                    if (r5 == 0) goto L_0x001e
                    r2 = r0
                    goto L_0x001f
                L_0x001e:
                    r2 = r7
                L_0x001f:
                    r5 = r9 & 16
                    if (r5 == 0) goto L_0x0024
                    goto L_0x0025
                L_0x0024:
                    r0 = r8
                L_0x0025:
                    r5 = r3
                    r6 = r4
                    r7 = r10
                    r8 = r1
                    r9 = r2
                    r10 = r0
                    r5.<init>(r6, r7, r8, r9, r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.C35701l.C35702a.C35703a.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }
        }

        public C35702a(@C12579k List<String> list, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
            Intrinsics.checkNotNullParameter(list, "form");
            this.f88230a = list;
            this.f88231b = str;
            this.f88232c = str2;
            this.f88233d = str3;
            this.f88234e = str4;
        }

        /* renamed from: h */
        public static /* synthetic */ C35702a m147226h(C35702a aVar, List<String> list, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.f88230a;
            }
            if ((i & 2) != 0) {
                str = aVar.f88231b;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = aVar.f88232c;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = aVar.f88233d;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = aVar.f88234e;
            }
            return aVar.mo106878g(list, str5, str6, str7, str4);
        }

        @C12579k
        /* renamed from: a */
        public final C35603k mo106871a(@C12579k Map<String, C35607n<C35608o>> map) {
            C35607n nVar;
            C35607n nVar2;
            C35607n nVar3;
            C35607n nVar4;
            C35607n nVar5;
            C35607n nVar6;
            C35607n nVar7;
            C35607n nVar8;
            C35607n nVar9;
            C35607n nVar10;
            Intrinsics.checkNotNullParameter(map, "states");
            String str = (String) CollectionsKt___CollectionsKt.m40479B2(this.f88230a);
            String str2 = (String) CollectionsKt___CollectionsKt.m40559R2(this.f88230a, 1);
            C35607n nVar11 = null;
            if (str != null) {
                C35607n<C35608o> nVar12 = map.get(str);
                if (nVar12 instanceof C35607n) {
                    nVar10 = nVar12;
                } else {
                    nVar10 = null;
                }
                nVar = nVar10;
            } else {
                nVar = null;
            }
            if (str2 != null) {
                C35607n<C35608o> nVar13 = map.get(str2);
                if (nVar13 instanceof C35607n) {
                    nVar9 = nVar13;
                } else {
                    nVar9 = null;
                }
                nVar2 = nVar9;
            } else {
                nVar2 = null;
            }
            String str3 = this.f88231b;
            if (str3 != null) {
                C35607n<C35608o> nVar14 = map.get(str3);
                if (nVar14 instanceof C35607n) {
                    nVar8 = nVar14;
                } else {
                    nVar8 = null;
                }
                nVar3 = nVar8;
            } else {
                nVar3 = null;
            }
            String str4 = this.f88232c;
            if (str4 != null) {
                C35607n<C35608o> nVar15 = map.get(str4);
                if (nVar15 instanceof C35607n) {
                    nVar7 = nVar15;
                } else {
                    nVar7 = null;
                }
                nVar4 = nVar7;
            } else {
                nVar4 = null;
            }
            String str5 = this.f88233d;
            if (str5 != null) {
                C35607n<C35608o> nVar16 = map.get(str5);
                if (nVar16 instanceof C35607n) {
                    nVar6 = nVar16;
                } else {
                    nVar6 = null;
                }
                nVar5 = nVar6;
            } else {
                nVar5 = null;
            }
            String str6 = this.f88234e;
            if (str6 != null) {
                C35607n<C35608o> nVar17 = map.get(str6);
                if (nVar17 instanceof C35607n) {
                    nVar11 = nVar17;
                }
            }
            return new C35603k(nVar3, nVar, nVar2, nVar4, nVar5, nVar11);
        }

        @C12579k
        /* renamed from: b */
        public final List<String> mo106872b() {
            return this.f88230a;
        }

        @C12580l
        /* renamed from: c */
        public final String mo106873c() {
            return this.f88231b;
        }

        @C12580l
        /* renamed from: d */
        public final String mo106874d() {
            return this.f88232c;
        }

        @C12580l
        /* renamed from: e */
        public final String mo106875e() {
            return this.f88233d;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35702a)) {
                return false;
            }
            C35702a aVar = (C35702a) obj;
            return Intrinsics.areEqual((Object) this.f88230a, (Object) aVar.f88230a) && Intrinsics.areEqual((Object) this.f88231b, (Object) aVar.f88231b) && Intrinsics.areEqual((Object) this.f88232c, (Object) aVar.f88232c) && Intrinsics.areEqual((Object) this.f88233d, (Object) aVar.f88233d) && Intrinsics.areEqual((Object) this.f88234e, (Object) aVar.f88234e);
        }

        @C12580l
        /* renamed from: f */
        public final String mo106877f() {
            return this.f88234e;
        }

        @C12579k
        /* renamed from: g */
        public final C35702a mo106878g(@C12579k List<String> list, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
            Intrinsics.checkNotNullParameter(list, "form");
            return new C35702a(list, str, str2, str3, str4);
        }

        public int hashCode() {
            int hashCode = this.f88230a.hashCode() * 31;
            String str = this.f88231b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f88232c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f88233d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f88234e;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode4 + i;
        }

        @C12580l
        /* renamed from: i */
        public final String mo106880i() {
            return this.f88232c;
        }

        @C12579k
        /* renamed from: j */
        public final List<String> mo106881j() {
            return this.f88230a;
        }

        @C12580l
        /* renamed from: k */
        public final String mo106882k() {
            return this.f88234e;
        }

        @C12580l
        /* renamed from: l */
        public final String mo106883l() {
            return this.f88231b;
        }

        @C12580l
        /* renamed from: m */
        public final String mo106884m() {
            return this.f88233d;
        }

        @C12579k
        public String toString() {
            return "Controllers(form=" + this.f88230a + ", pager=" + this.f88231b + ", checkbox=" + this.f88232c + ", radio=" + this.f88233d + ", layout=" + this.f88234e + ')';
        }
    }

    /* renamed from: com.urbanairship.android.layout.l$c */
    public static final class C35707c {
        @C12579k

        /* renamed from: a */
        public final String f88251a;
        @C12580l

        /* renamed from: b */
        public final String f88252b;
        @C12579k

        /* renamed from: c */
        public final C35689u f88253c;
        @C12579k

        /* renamed from: d */
        public final C35702a.C35703a f88254d;
        @C12580l

        /* renamed from: e */
        public final String f88255e;

        public C35707c(@C12579k String str, @C12580l String str2, @C12579k C35689u uVar, @C12579k C35702a.C35703a aVar, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "tag");
            Intrinsics.checkNotNullParameter(uVar, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(aVar, "controllers");
            this.f88251a = str;
            this.f88252b = str2;
            this.f88253c = uVar;
            this.f88254d = aVar;
            this.f88255e = str3;
        }

        /* renamed from: g */
        public static /* synthetic */ C35707c m147287g(C35707c cVar, String str, String str2, C35689u uVar, C35702a.C35703a aVar, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f88251a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.f88252b;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                uVar = cVar.f88253c;
            }
            C35689u uVar2 = uVar;
            if ((i & 8) != 0) {
                aVar = cVar.f88254d;
            }
            C35702a.C35703a aVar2 = aVar;
            if ((i & 16) != 0) {
                str3 = cVar.f88255e;
            }
            return cVar.mo106946f(str, str4, uVar2, aVar2, str3);
        }

        @C12579k
        /* renamed from: a */
        public final String mo106940a() {
            return this.f88251a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo106941b() {
            return this.f88252b;
        }

        @C12579k
        /* renamed from: c */
        public final C35689u mo106942c() {
            return this.f88253c;
        }

        @C12579k
        /* renamed from: d */
        public final C35702a.C35703a mo106943d() {
            return this.f88254d;
        }

        @C12580l
        /* renamed from: e */
        public final String mo106944e() {
            return this.f88255e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35707c)) {
                return false;
            }
            C35707c cVar = (C35707c) obj;
            return Intrinsics.areEqual((Object) this.f88251a, (Object) cVar.f88251a) && Intrinsics.areEqual((Object) this.f88252b, (Object) cVar.f88252b) && Intrinsics.areEqual((Object) this.f88253c, (Object) cVar.f88253c) && Intrinsics.areEqual((Object) this.f88254d, (Object) cVar.f88254d) && Intrinsics.areEqual((Object) this.f88255e, (Object) cVar.f88255e);
        }

        @C12579k
        /* renamed from: f */
        public final C35707c mo106946f(@C12579k String str, @C12580l String str2, @C12579k C35689u uVar, @C12579k C35702a.C35703a aVar, @C12580l String str3) {
            Intrinsics.checkNotNullParameter(str, "tag");
            Intrinsics.checkNotNullParameter(uVar, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(aVar, "controllers");
            return new C35707c(str, str2, uVar, aVar, str3);
        }

        @C12579k
        /* renamed from: h */
        public final C35702a.C35703a mo106947h() {
            return this.f88254d;
        }

        public int hashCode() {
            int hashCode = this.f88251a.hashCode() * 31;
            String str = this.f88252b;
            int i = 0;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f88253c.hashCode()) * 31) + this.f88254d.hashCode()) * 31;
            String str2 = this.f88255e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        /* renamed from: i */
        public final C35689u mo106949i() {
            return this.f88253c;
        }

        @C12580l
        /* renamed from: j */
        public final String mo106950j() {
            return this.f88255e;
        }

        @C12580l
        /* renamed from: k */
        public final String mo106951k() {
            return this.f88252b;
        }

        @C12579k
        /* renamed from: l */
        public final String mo106952l() {
            return this.f88251a;
        }

        @C12579k
        public String toString() {
            return "StackEntry(tag=" + this.f88251a + ", parentTag=" + this.f88252b + ", info=" + this.f88253c + ", controllers=" + this.f88254d + ", pagerPageId=" + this.f88255e + ')';
        }
    }

    @C12579k
    /* renamed from: a */
    public BaseModel<?, ?> mo106605a(@C12579k C35686t0 t0Var, @C12579k ModelEnvironment modelEnvironment) throws ModelFactoryException {
        Intrinsics.checkNotNullParameter(t0Var, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(modelEnvironment, C28534f.f69167m0);
        this.f88229d = mo106868d(t0Var);
        mo106870f(t0Var);
        return mo106866b(modelEnvironment);
    }

    /* renamed from: b */
    public final BaseModel<?, ?> mo106866b(ModelEnvironment modelEnvironment) throws ModelFactoryException {
        boolean z;
        Map<String, C35705b.C35706a> map = this.f88226a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C35705b.C35706a) entry.getValue()).mo106920a());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), mo106867c(((C35705b) entry2.getValue()).mo106916j().mo106836d()));
        }
        while (!this.f88227b.isEmpty()) {
            Map<String, C35705b.C35706a> map2 = this.f88227b;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry next : map2.entrySet()) {
                if (((C35705b.C35706a) next.getValue()).mo106930j().isEmpty() || linkedHashMap2.keySet().containsAll(((C35705b.C35706a) next.getValue()).mo106930j())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap4.put(next.getKey(), next.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap4.size());
            for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                arrayList.add(C11078d1.m42659a(entry3.getKey(), ((C35705b.C35706a) entry3.getValue()).mo106920a()));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    String str = (String) pair.mo21846a();
                    C35705b bVar = (C35705b) pair.mo21847b();
                    Iterable<String> h = bVar.mo106913h();
                    ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(h, 10));
                    for (String str2 : h) {
                        Pair pair2 = (Pair) linkedHashMap2.get(str2);
                        if (pair2 != null) {
                            arrayList2.add(pair2);
                        } else {
                            throw new ModelFactoryException("Unable to build model. Child with tag '" + str2 + "' is not built yet!");
                        }
                    }
                    linkedHashMap2.put(str, new Pair(mo106869e(bVar, arrayList2, modelEnvironment.mo106635i(bVar.mo106915i().mo106871a(linkedHashMap3)), new C35804j(bVar.mo106917k())), bVar.mo106916j()));
                    this.f88227b.remove(str);
                }
            }
        }
        String str3 = this.f88229d;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootTag");
            str3 = null;
        }
        Pair pair3 = (Pair) linkedHashMap2.get(str3);
        if (pair3 != null) {
            return (BaseModel) pair3.mo21849e();
        }
        throw new ModelFactoryException("Failed to build models. Root model not found!");
    }

    /* renamed from: c */
    public final C35607n<C35608o> mo106867c(C35686t0 t0Var) {
        C35686t0 t0Var2 = t0Var;
        if (t0Var2 instanceof C35677p) {
            C35677p pVar = (C35677p) t0Var2;
            return new C35607n<>(new C35608o.C35610b(pVar.mo106791a(), C35599i.C35600a.f88010b, pVar.getResponseType(), (Map) null, (Map) null, (Set) null, false, false, false, false, C18124b2.f46739r, (DefaultConstructorMarker) null));
        } else if (t0Var2 instanceof C35648b0) {
            C35648b0 b0Var = (C35648b0) t0Var2;
            return new C35607n<>(new C35608o.C35610b(b0Var.mo106791a(), new C35599i.C35601b(b0Var.mo106790l()), b0Var.getResponseType(), (Map) null, (Map) null, (Set) null, false, false, false, false, C18124b2.f46739r, (DefaultConstructorMarker) null));
        } else if (t0Var2 instanceof C35660g0) {
            return new C35607n<>(new C35608o.C35613e(((C35660g0) t0Var2).mo106791a(), (JsonValue) null, (JsonValue) null, false, 14, (DefaultConstructorMarker) null));
        } else {
            if (t0Var2 instanceof C35661h) {
                C35661h hVar = (C35661h) t0Var2;
                return new C35607n<>(new C35608o.C35609a(hVar.mo106791a(), hVar.mo106807m(), hVar.mo106806l(), (Set) null, false, 24, (DefaultConstructorMarker) null));
            } else if (t0Var2 instanceof C35650c0) {
                return new C35607n<>(new C35608o.C35612d(((C35650c0) t0Var2).mo106791a(), 0, 0, false, (List) null, 30, (DefaultConstructorMarker) null));
            } else {
                if (t0Var2 instanceof C35672m0) {
                    return new C35607n<>(new C35608o.C35611c((Map) null, 1, (DefaultConstructorMarker) null));
                }
                return null;
            }
        }
    }

    /* renamed from: d */
    public final String mo106868d(C35686t0 t0Var) {
        int i = this.f88228c.get(t0Var.getType());
        if (i == null) {
            i = 0;
        }
        Number number = i;
        this.f88228c.put(t0Var.getType(), Integer.valueOf(number.intValue() + 1));
        int intValue = number.intValue();
        StringBuilder sb = new StringBuilder();
        sb.append(t0Var.getType());
        sb.append('_');
        sb.append(intValue);
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r0v87, types: [com.urbanairship.android.layout.model.RadioInputModel] */
    /* JADX WARNING: type inference failed for: r0v88, types: [com.urbanairship.android.layout.model.CheckboxModel] */
    /* JADX WARNING: type inference failed for: r0v89, types: [com.urbanairship.android.layout.model.f] */
    /* JADX WARNING: type inference failed for: r0v90, types: [com.urbanairship.android.layout.model.g] */
    /* JADX WARNING: type inference failed for: r0v91, types: [com.urbanairship.android.layout.model.RadioInputController] */
    /* JADX WARNING: type inference failed for: r0v92, types: [com.urbanairship.android.layout.model.CheckboxController] */
    /* JADX WARNING: type inference failed for: r0v93, types: [com.urbanairship.android.layout.model.k] */
    /* JADX WARNING: type inference failed for: r0v94, types: [com.urbanairship.android.layout.model.e] */
    /* JADX WARNING: type inference failed for: r0v95, types: [com.urbanairship.android.layout.model.PagerModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.urbanairship.android.layout.model.BaseModel<?, ?> mo106869e(com.urbanairship.android.layout.C35701l.C35705b r12, java.util.List<? extends kotlin.Pair<? extends com.urbanairship.android.layout.model.BaseModel<?, ?>, ? extends com.urbanairship.android.layout.info.C35689u>> r13, com.urbanairship.android.layout.environment.ModelEnvironment r14, com.urbanairship.android.layout.model.C35804j r15) throws com.urbanairship.android.layout.ModelFactoryException {
        /*
            r11 = this;
            com.urbanairship.android.layout.info.u r0 = r12.mo106916j()
            com.urbanairship.android.layout.info.t0 r0 = r0.mo106836d()
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35684s0
            java.lang.String r2 = "Unsupported view type: "
            if (r1 == 0) goto L_0x02a7
            r1 = r0
            com.urbanairship.android.layout.info.s0 r1 = (com.urbanairship.android.layout.info.C35684s0) r1
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35665j
            r4 = 0
            r5 = 10
            if (r3 == 0) goto L_0x0064
            com.urbanairship.android.layout.info.j r0 = (com.urbanairship.android.layout.info.C35665j) r0
            r1 = r13
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C10978t.m41495Y(r1, r5)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r1.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.mo21846a()
            com.urbanairship.android.layout.model.BaseModel r5 = (com.urbanairship.android.layout.model.BaseModel) r5
            java.lang.Object r3 = r3.mo21847b()
            com.urbanairship.android.layout.info.u r3 = (com.urbanairship.android.layout.info.C35689u) r3
            boolean r8 = r3 instanceof com.urbanairship.android.layout.info.C35667k
            if (r8 == 0) goto L_0x0049
            com.urbanairship.android.layout.info.k r3 = (com.urbanairship.android.layout.info.C35667k) r3
            goto L_0x004a
        L_0x0049:
            r3 = r4
        L_0x004a:
            if (r3 == 0) goto L_0x0055
            com.urbanairship.android.layout.model.c$a r8 = new com.urbanairship.android.layout.model.c$a
            r8.<init>(r3, r5)
            r2.add(r8)
            goto L_0x002a
        L_0x0055:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "ContainerLayoutItemInfo expected"
            r0.<init>(r1)
            throw r0
        L_0x005d:
            com.urbanairship.android.layout.model.c r1 = new com.urbanairship.android.layout.model.c
            r1.<init>(r0, r2, r14, r15)
            goto L_0x03ee
        L_0x0064:
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35697y
            if (r3 == 0) goto L_0x00b4
            com.urbanairship.android.layout.info.y r0 = (com.urbanairship.android.layout.info.C35697y) r0
            r1 = r13
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C10978t.m41495Y(r1, r5)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x007a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r1.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.mo21846a()
            com.urbanairship.android.layout.model.BaseModel r5 = (com.urbanairship.android.layout.model.BaseModel) r5
            java.lang.Object r3 = r3.mo21847b()
            com.urbanairship.android.layout.info.u r3 = (com.urbanairship.android.layout.info.C35689u) r3
            boolean r8 = r3 instanceof com.urbanairship.android.layout.info.C35698z
            if (r8 == 0) goto L_0x0099
            com.urbanairship.android.layout.info.z r3 = (com.urbanairship.android.layout.info.C35698z) r3
            goto L_0x009a
        L_0x0099:
            r3 = r4
        L_0x009a:
            if (r3 == 0) goto L_0x00a5
            com.urbanairship.android.layout.model.i$a r8 = new com.urbanairship.android.layout.model.i$a
            r8.<init>(r3, r5)
            r2.add(r8)
            goto L_0x007a
        L_0x00a5:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "LinearLayoutItemInfo expected"
            r0.<init>(r1)
            throw r0
        L_0x00ad:
            com.urbanairship.android.layout.model.i r1 = new com.urbanairship.android.layout.model.i
            r1.<init>(r0, r2, r14, r15)
            goto L_0x03ee
        L_0x00b4:
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35656e0
            java.lang.String r8 = "Required pager state was null for PagerController!"
            if (r3 == 0) goto L_0x0125
            r1 = r0
            com.urbanairship.android.layout.info.e0 r1 = (com.urbanairship.android.layout.info.C35656e0) r1
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.C10978t.m41495Y(r0, r5)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x010b
            java.lang.Object r3 = r0.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.mo21846a()
            com.urbanairship.android.layout.model.BaseModel r5 = (com.urbanairship.android.layout.model.BaseModel) r5
            java.lang.Object r3 = r3.mo21847b()
            com.urbanairship.android.layout.info.u r3 = (com.urbanairship.android.layout.info.C35689u) r3
            boolean r9 = r3 instanceof com.urbanairship.android.layout.info.C35658f0
            if (r9 == 0) goto L_0x00ed
            r9 = r3
            com.urbanairship.android.layout.info.f0 r9 = (com.urbanairship.android.layout.info.C35658f0) r9
            goto L_0x00ee
        L_0x00ed:
            r9 = r4
        L_0x00ee:
            if (r9 == 0) goto L_0x0103
            com.urbanairship.android.layout.model.PagerModel$a r9 = new com.urbanairship.android.layout.model.PagerModel$a
            com.urbanairship.android.layout.info.f0 r3 = (com.urbanairship.android.layout.info.C35658f0) r3
            java.lang.String r10 = r3.mo106791a()
            java.util.Map r3 = r3.mo106803b()
            r9.<init>(r5, r10, r3)
            r2.add(r9)
            goto L_0x00cd
        L_0x0103:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "PagerItemInfo expected"
            r0.<init>(r1)
            throw r0
        L_0x010b:
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106661d()
            if (r3 == 0) goto L_0x011f
            com.urbanairship.android.layout.model.PagerModel r8 = new com.urbanairship.android.layout.model.PagerModel
            r0 = r8
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0303
        L_0x011f:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            r0.<init>(r8)
            throw r0
        L_0x0125:
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35670l0
            if (r3 == 0) goto L_0x013e
            com.urbanairship.android.layout.model.m r1 = new com.urbanairship.android.layout.model.m
            com.urbanairship.android.layout.info.l0 r0 = (com.urbanairship.android.layout.info.C35670l0) r0
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r13)
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r2 = r2.mo21849e()
            com.urbanairship.android.layout.model.BaseModel r2 = (com.urbanairship.android.layout.model.BaseModel) r2
            r1.<init>(r0, r2, r14, r15)
            goto L_0x03ee
        L_0x013e:
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35677p
            if (r3 == 0) goto L_0x017e
            com.urbanairship.android.layout.model.e r8 = new com.urbanairship.android.layout.model.e
            r1 = r0
            com.urbanairship.android.layout.info.p r1 = (com.urbanairship.android.layout.info.C35677p) r1
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r13)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.mo21849e()
            r2 = r0
            com.urbanairship.android.layout.model.BaseModel r2 = (com.urbanairship.android.layout.model.BaseModel) r2
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106659b()
            if (r3 == 0) goto L_0x0176
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r4 = r0.mo106662e()
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r5 = r0.mo106661d()
            r0 = r8
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0303
        L_0x0176:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for FormController!"
            r0.<init>(r1)
            throw r0
        L_0x017e:
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35648b0
            if (r3 == 0) goto L_0x01be
            com.urbanairship.android.layout.model.k r8 = new com.urbanairship.android.layout.model.k
            r1 = r0
            com.urbanairship.android.layout.info.b0 r1 = (com.urbanairship.android.layout.info.C35648b0) r1
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r13)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.mo21849e()
            r2 = r0
            com.urbanairship.android.layout.model.BaseModel r2 = (com.urbanairship.android.layout.model.BaseModel) r2
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106659b()
            if (r3 == 0) goto L_0x01b6
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r4 = r0.mo106662e()
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r5 = r0.mo106661d()
            r0 = r8
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0303
        L_0x01b6:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for NpsFormController!"
            r0.<init>(r1)
            throw r0
        L_0x01be:
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35650c0
            if (r3 == 0) goto L_0x01ed
            com.urbanairship.android.layout.model.PagerController r9 = new com.urbanairship.android.layout.model.PagerController
            r1 = r0
            com.urbanairship.android.layout.info.c0 r1 = (com.urbanairship.android.layout.info.C35650c0) r1
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r13)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.mo21849e()
            r2 = r0
            com.urbanairship.android.layout.model.BaseModel r2 = (com.urbanairship.android.layout.model.BaseModel) r2
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106661d()
            if (r3 == 0) goto L_0x01e7
            r0 = r9
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r9
            goto L_0x03ee
        L_0x01e7:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            r0.<init>(r8)
            throw r0
        L_0x01ed:
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35661h
            if (r3 == 0) goto L_0x022f
            com.urbanairship.android.layout.model.CheckboxController r8 = new com.urbanairship.android.layout.model.CheckboxController
            r1 = r0
            com.urbanairship.android.layout.info.h r1 = (com.urbanairship.android.layout.info.C35661h) r1
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r13)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.mo21849e()
            r2 = r0
            com.urbanairship.android.layout.model.BaseModel r2 = (com.urbanairship.android.layout.model.BaseModel) r2
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106659b()
            if (r3 == 0) goto L_0x0227
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r4 = r0.mo106658a()
            if (r4 == 0) goto L_0x021f
            r0 = r8
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x0303
        L_0x021f:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required checkbox state was null for CheckboxController!"
            r0.<init>(r1)
            throw r0
        L_0x0227:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for CheckboxController!"
            r0.<init>(r1)
            throw r0
        L_0x022f:
            boolean r3 = r1 instanceof com.urbanairship.android.layout.info.C35660g0
            if (r3 == 0) goto L_0x0271
            com.urbanairship.android.layout.model.RadioInputController r8 = new com.urbanairship.android.layout.model.RadioInputController
            r1 = r0
            com.urbanairship.android.layout.info.g0 r1 = (com.urbanairship.android.layout.info.C35660g0) r1
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r13)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.mo21849e()
            r2 = r0
            com.urbanairship.android.layout.model.BaseModel r2 = (com.urbanairship.android.layout.model.BaseModel) r2
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106659b()
            if (r3 == 0) goto L_0x0269
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r4 = r0.mo106663f()
            if (r4 == 0) goto L_0x0261
            r0 = r8
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x0303
        L_0x0261:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required radio state was null for RadioInputController!"
            r0.<init>(r1)
            throw r0
        L_0x0269:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for RadioInputController!"
            r0.<init>(r1)
            throw r0
        L_0x0271:
            boolean r1 = r1 instanceof com.urbanairship.android.layout.info.C35672m0
            if (r1 == 0) goto L_0x028a
            com.urbanairship.android.layout.model.n r1 = new com.urbanairship.android.layout.model.n
            com.urbanairship.android.layout.info.m0 r0 = (com.urbanairship.android.layout.info.C35672m0) r0
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.m40706w2(r13)
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r2 = r2.mo21849e()
            com.urbanairship.android.layout.model.BaseModel r2 = (com.urbanairship.android.layout.model.BaseModel) r2
            r1.<init>(r0, r2, r14, r15)
            goto L_0x03ee
        L_0x028a:
            com.urbanairship.android.layout.ModelFactoryException r1 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x02a7:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35673n
            if (r1 == 0) goto L_0x02b4
            com.urbanairship.android.layout.model.d r1 = new com.urbanairship.android.layout.model.d
            com.urbanairship.android.layout.info.n r0 = (com.urbanairship.android.layout.info.C35673n) r0
            r1.<init>(r0, r14, r15)
            goto L_0x03ee
        L_0x02b4:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35695w0
            if (r1 == 0) goto L_0x02c1
            com.urbanairship.android.layout.model.WebViewModel r1 = new com.urbanairship.android.layout.model.WebViewModel
            com.urbanairship.android.layout.info.w0 r0 = (com.urbanairship.android.layout.info.C35695w0) r0
            r1.<init>(r0, r14, r15)
            goto L_0x03ee
        L_0x02c1:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35646a0
            if (r1 == 0) goto L_0x02ce
            com.urbanairship.android.layout.model.MediaModel r1 = new com.urbanairship.android.layout.model.MediaModel
            com.urbanairship.android.layout.info.a0 r0 = (com.urbanairship.android.layout.info.C35646a0) r0
            r1.<init>(r0, r14, r15)
            goto L_0x03ee
        L_0x02ce:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35694w
            if (r1 == 0) goto L_0x02db
            com.urbanairship.android.layout.model.h r1 = new com.urbanairship.android.layout.model.h
            com.urbanairship.android.layout.info.w r0 = (com.urbanairship.android.layout.info.C35694w) r0
            r1.<init>(r0, r14, r15)
            goto L_0x03ee
        L_0x02db:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35692v
            if (r1 == 0) goto L_0x0306
            com.urbanairship.android.layout.model.g r8 = new com.urbanairship.android.layout.model.g
            r1 = r0
            com.urbanairship.android.layout.info.v r1 = (com.urbanairship.android.layout.info.C35692v) r1
            com.urbanairship.android.layout.model.h r2 = new com.urbanairship.android.layout.model.h
            com.urbanairship.android.layout.info.w r0 = r1.mo106838k()
            r2.<init>(r0, r14, r15)
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106659b()
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r4 = r0.mo106661d()
            r0 = r8
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x0303:
            r1 = r8
            goto L_0x03ee
        L_0x0306:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35685t
            if (r1 == 0) goto L_0x0326
            com.urbanairship.android.layout.model.f r8 = new com.urbanairship.android.layout.model.f
            r1 = r0
            com.urbanairship.android.layout.info.t r1 = (com.urbanairship.android.layout.info.C35685t) r1
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r2 = r0.mo106659b()
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106661d()
            r0 = r8
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0303
        L_0x0326:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35652d0
            if (r1 == 0) goto L_0x0333
            com.urbanairship.android.layout.model.PagerIndicatorModel r1 = new com.urbanairship.android.layout.model.PagerIndicatorModel
            com.urbanairship.android.layout.info.d0 r0 = (com.urbanairship.android.layout.info.C35652d0) r0
            r1.<init>(r0, r14, r15)
            goto L_0x03ee
        L_0x0333:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35663i
            if (r1 == 0) goto L_0x0367
            com.urbanairship.android.layout.model.CheckboxModel r8 = new com.urbanairship.android.layout.model.CheckboxModel
            r1 = r0
            com.urbanairship.android.layout.info.i r1 = (com.urbanairship.android.layout.info.C35663i) r1
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r2 = r0.mo106658a()
            if (r2 == 0) goto L_0x035f
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106659b()
            if (r3 == 0) goto L_0x0357
            r0 = r8
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0303
        L_0x0357:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for CheckboxModel!"
            r0.<init>(r1)
            throw r0
        L_0x035f:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required checkbox state was null for CheckboxModel!"
            r0.<init>(r1)
            throw r0
        L_0x0367:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35676o0
            if (r1 == 0) goto L_0x0386
            com.urbanairship.android.layout.model.ToggleModel r1 = new com.urbanairship.android.layout.model.ToggleModel
            com.urbanairship.android.layout.info.o0 r0 = (com.urbanairship.android.layout.info.C35676o0) r0
            com.urbanairship.android.layout.environment.k r2 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r2 = r2.mo106659b()
            if (r2 == 0) goto L_0x037e
            r1.<init>(r0, r2, r14, r15)
            goto L_0x03ee
        L_0x037e:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for ToggleModel!"
            r0.<init>(r1)
            throw r0
        L_0x0386:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35662h0
            if (r1 == 0) goto L_0x03bb
            com.urbanairship.android.layout.model.RadioInputModel r8 = new com.urbanairship.android.layout.model.RadioInputModel
            r1 = r0
            com.urbanairship.android.layout.info.h0 r1 = (com.urbanairship.android.layout.info.C35662h0) r1
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r2 = r0.mo106663f()
            if (r2 == 0) goto L_0x03b3
            com.urbanairship.android.layout.environment.k r0 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r3 = r0.mo106659b()
            if (r3 == 0) goto L_0x03ab
            r0 = r8
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0303
        L_0x03ab:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for RadioInputModel!"
            r0.<init>(r1)
            throw r0
        L_0x03b3:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required radio state was null for RadioInputModel!"
            r0.<init>(r1)
            throw r0
        L_0x03bb:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35674n0
            if (r1 == 0) goto L_0x03d9
            com.urbanairship.android.layout.model.TextInputModel r1 = new com.urbanairship.android.layout.model.TextInputModel
            com.urbanairship.android.layout.info.n0 r0 = (com.urbanairship.android.layout.info.C35674n0) r0
            com.urbanairship.android.layout.environment.k r2 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r2 = r2.mo106659b()
            if (r2 == 0) goto L_0x03d1
            r1.<init>(r0, r2, r14, r15)
            goto L_0x03ee
        L_0x03d1:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for TextInputModel!"
            r0.<init>(r1)
            throw r0
        L_0x03d9:
            boolean r1 = r0 instanceof com.urbanairship.android.layout.info.C35668k0
            if (r1 == 0) goto L_0x03f7
            com.urbanairship.android.layout.model.ScoreModel r1 = new com.urbanairship.android.layout.model.ScoreModel
            com.urbanairship.android.layout.info.k0 r0 = (com.urbanairship.android.layout.info.C35668k0) r0
            com.urbanairship.android.layout.environment.k r2 = r14.mo106632f()
            com.urbanairship.android.layout.environment.n r2 = r2.mo106659b()
            if (r2 == 0) goto L_0x03ef
            r1.<init>(r0, r2, r14, r15)
        L_0x03ee:
            return r1
        L_0x03ef:
            com.urbanairship.android.layout.ModelFactoryException r0 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.String r1 = "Required form state was null for ScoreModel!"
            r0.<init>(r1)
            throw r0
        L_0x03f7:
            com.urbanairship.android.layout.ModelFactoryException r1 = new com.urbanairship.android.layout.ModelFactoryException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.C35701l.mo106869e(com.urbanairship.android.layout.l$b, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):com.urbanairship.android.layout.model.BaseModel");
    }

    /* renamed from: f */
    public final void mo106870f(C35686t0 t0Var) {
        String str;
        boolean z;
        String str2;
        C35658f0 f0Var;
        C35705b.C35706a aVar;
        List<String> j;
        C10944i iVar = new C10944i();
        C35702a.C35703a aVar2 = new C35702a.C35703a((List) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        String str3 = this.f88229d;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootTag");
            str = null;
        } else {
            str = str3;
        }
        iVar.mo22298i(new C35707c(str, (String) null, new C35689u.C35690a(t0Var), aVar2, (String) null));
        while (!iVar.isEmpty()) {
            C35707c cVar = (C35707c) iVar.mo22306o0();
            String a = cVar.mo106940a();
            String b = cVar.mo106941b();
            C35689u c = cVar.mo106942c();
            C35702a.C35703a d = cVar.mo106943d();
            String e = cVar.mo106944e();
            C35705b.C35706a aVar3 = new C35705b.C35706a(a, c, (List) null, (String) null, d, e, 12, (DefaultConstructorMarker) null);
            if (b == null || b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(z || (aVar = this.f88227b.get(b)) == null || (j = aVar.mo106930j()) == null)) {
                j.add(aVar3.mo106935o());
            }
            if (c.mo106837h().mo107324q()) {
                d = d.mo106904r(c.mo106837h(), a);
                this.f88226a.put(a, aVar3);
                aVar3.mo106936p(aVar3.mo106931k().mo106904r(c.mo106837h(), a));
            }
            this.f88227b.put(a, aVar3);
            if (c.mo106836d() instanceof C35684s0) {
                List k = ((C35684s0) c.mo106836d()).mo106789k();
                for (int size = k.size() - 1; -1 < size; size--) {
                    C35689u uVar = (C35689u) k.get(size);
                    String d2 = mo106868d(uVar.mo106836d());
                    if (e == null) {
                        if (uVar instanceof C35658f0) {
                            f0Var = (C35658f0) uVar;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            str2 = f0Var.mo106791a();
                        } else {
                            str2 = null;
                        }
                    } else {
                        str2 = e;
                    }
                    iVar.mo22298i(new C35707c(d2, a, uVar, d, str2));
                }
            }
        }
    }

    /* renamed from: com.urbanairship.android.layout.l$b */
    public static final class C35705b {
        @C12579k

        /* renamed from: a */
        public final String f88240a;
        @C12579k

        /* renamed from: b */
        public final C35689u f88241b;
        @C12579k

        /* renamed from: c */
        public final List<String> f88242c;
        @C12579k

        /* renamed from: d */
        public final C35702a f88243d;
        @C12580l

        /* renamed from: e */
        public final String f88244e;

        public C35705b(@C12579k String str, @C12579k C35689u uVar, @C12579k List<String> list, @C12579k C35702a aVar, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, "tag");
            Intrinsics.checkNotNullParameter(uVar, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(list, "childTags");
            Intrinsics.checkNotNullParameter(aVar, "controllers");
            this.f88240a = str;
            this.f88241b = uVar;
            this.f88242c = list;
            this.f88243d = aVar;
            this.f88244e = str2;
        }

        /* renamed from: g */
        public static /* synthetic */ C35705b m147257g(C35705b bVar, String str, C35689u uVar, List<String> list, C35702a aVar, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f88240a;
            }
            if ((i & 2) != 0) {
                uVar = bVar.f88241b;
            }
            C35689u uVar2 = uVar;
            if ((i & 4) != 0) {
                list = bVar.f88242c;
            }
            List<String> list2 = list;
            if ((i & 8) != 0) {
                aVar = bVar.f88243d;
            }
            C35702a aVar2 = aVar;
            if ((i & 16) != 0) {
                str2 = bVar.f88244e;
            }
            return bVar.mo106912f(str, uVar2, list2, aVar2, str2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo106906a() {
            return this.f88240a;
        }

        @C12579k
        /* renamed from: b */
        public final C35689u mo106907b() {
            return this.f88241b;
        }

        @C12579k
        /* renamed from: c */
        public final List<String> mo106908c() {
            return this.f88242c;
        }

        @C12579k
        /* renamed from: d */
        public final C35702a mo106909d() {
            return this.f88243d;
        }

        @C12580l
        /* renamed from: e */
        public final String mo106910e() {
            return this.f88244e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35705b)) {
                return false;
            }
            C35705b bVar = (C35705b) obj;
            return Intrinsics.areEqual((Object) this.f88240a, (Object) bVar.f88240a) && Intrinsics.areEqual((Object) this.f88241b, (Object) bVar.f88241b) && Intrinsics.areEqual((Object) this.f88242c, (Object) bVar.f88242c) && Intrinsics.areEqual((Object) this.f88243d, (Object) bVar.f88243d) && Intrinsics.areEqual((Object) this.f88244e, (Object) bVar.f88244e);
        }

        @C12579k
        /* renamed from: f */
        public final C35705b mo106912f(@C12579k String str, @C12579k C35689u uVar, @C12579k List<String> list, @C12579k C35702a aVar, @C12580l String str2) {
            Intrinsics.checkNotNullParameter(str, "tag");
            Intrinsics.checkNotNullParameter(uVar, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(list, "childTags");
            Intrinsics.checkNotNullParameter(aVar, "controllers");
            return new C35705b(str, uVar, list, aVar, str2);
        }

        @C12579k
        /* renamed from: h */
        public final List<String> mo106913h() {
            return this.f88242c;
        }

        public int hashCode() {
            int hashCode = ((((((this.f88240a.hashCode() * 31) + this.f88241b.hashCode()) * 31) + this.f88242c.hashCode()) * 31) + this.f88243d.hashCode()) * 31;
            String str = this.f88244e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @C12579k
        /* renamed from: i */
        public final C35702a mo106915i() {
            return this.f88243d;
        }

        @C12579k
        /* renamed from: j */
        public final C35689u mo106916j() {
            return this.f88241b;
        }

        @C12580l
        /* renamed from: k */
        public final String mo106917k() {
            return this.f88244e;
        }

        @C12579k
        /* renamed from: l */
        public final String mo106918l() {
            return this.f88240a;
        }

        @C12579k
        public String toString() {
            return "LayoutNode(tag=" + this.f88240a + ", info=" + this.f88241b + ", childTags=" + this.f88242c + ", controllers=" + this.f88243d + ", pagerPageId=" + this.f88244e + ')';
        }

        /* renamed from: com.urbanairship.android.layout.l$b$a */
        public static final class C35706a {
            @C12579k

            /* renamed from: a */
            public final String f88245a;
            @C12579k

            /* renamed from: b */
            public C35689u f88246b;
            @C12579k

            /* renamed from: c */
            public final List<String> f88247c;
            @C12580l

            /* renamed from: d */
            public String f88248d;
            @C12579k

            /* renamed from: e */
            public C35702a.C35703a f88249e;
            @C12580l

            /* renamed from: f */
            public final String f88250f;

            public C35706a(@C12579k String str, @C12579k C35689u uVar, @C12579k List<String> list, @C12580l String str2, @C12579k C35702a.C35703a aVar, @C12580l String str3) {
                Intrinsics.checkNotNullParameter(str, "tag");
                Intrinsics.checkNotNullParameter(uVar, C28531e0.f69094x);
                Intrinsics.checkNotNullParameter(list, "childTags");
                Intrinsics.checkNotNullParameter(aVar, "controllers");
                this.f88245a = str;
                this.f88246b = uVar;
                this.f88247c = list;
                this.f88248d = str2;
                this.f88249e = aVar;
                this.f88250f = str3;
            }

            /* renamed from: i */
            public static /* synthetic */ C35706a m147269i(C35706a aVar, String str, C35689u uVar, List<String> list, String str2, C35702a.C35703a aVar2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f88245a;
                }
                if ((i & 2) != 0) {
                    uVar = aVar.f88246b;
                }
                C35689u uVar2 = uVar;
                if ((i & 4) != 0) {
                    list = aVar.f88247c;
                }
                List<String> list2 = list;
                if ((i & 8) != 0) {
                    str2 = aVar.f88248d;
                }
                String str4 = str2;
                if ((i & 16) != 0) {
                    aVar2 = aVar.f88249e;
                }
                C35702a.C35703a aVar3 = aVar2;
                if ((i & 32) != 0) {
                    str3 = aVar.f88250f;
                }
                return aVar.mo106928h(str, uVar2, list2, str4, aVar3, str3);
            }

            @C12579k
            /* renamed from: a */
            public final C35705b mo106920a() {
                return new C35705b(this.f88245a, this.f88246b, CollectionsKt___CollectionsKt.m40557Q5(this.f88247c), this.f88249e.mo106886a(), this.f88250f);
            }

            @C12579k
            /* renamed from: b */
            public final String mo106921b() {
                return this.f88245a;
            }

            @C12579k
            /* renamed from: c */
            public final C35689u mo106922c() {
                return this.f88246b;
            }

            @C12579k
            /* renamed from: d */
            public final List<String> mo106923d() {
                return this.f88247c;
            }

            @C12580l
            /* renamed from: e */
            public final String mo106924e() {
                return this.f88248d;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C35706a)) {
                    return false;
                }
                C35706a aVar = (C35706a) obj;
                return Intrinsics.areEqual((Object) this.f88245a, (Object) aVar.f88245a) && Intrinsics.areEqual((Object) this.f88246b, (Object) aVar.f88246b) && Intrinsics.areEqual((Object) this.f88247c, (Object) aVar.f88247c) && Intrinsics.areEqual((Object) this.f88248d, (Object) aVar.f88248d) && Intrinsics.areEqual((Object) this.f88249e, (Object) aVar.f88249e) && Intrinsics.areEqual((Object) this.f88250f, (Object) aVar.f88250f);
            }

            @C12579k
            /* renamed from: f */
            public final C35702a.C35703a mo106926f() {
                return this.f88249e;
            }

            @C12580l
            /* renamed from: g */
            public final String mo106927g() {
                return this.f88250f;
            }

            @C12579k
            /* renamed from: h */
            public final C35706a mo106928h(@C12579k String str, @C12579k C35689u uVar, @C12579k List<String> list, @C12580l String str2, @C12579k C35702a.C35703a aVar, @C12580l String str3) {
                Intrinsics.checkNotNullParameter(str, "tag");
                Intrinsics.checkNotNullParameter(uVar, C28531e0.f69094x);
                Intrinsics.checkNotNullParameter(list, "childTags");
                Intrinsics.checkNotNullParameter(aVar, "controllers");
                return new C35706a(str, uVar, list, str2, aVar, str3);
            }

            public int hashCode() {
                int hashCode = ((((this.f88245a.hashCode() * 31) + this.f88246b.hashCode()) * 31) + this.f88247c.hashCode()) * 31;
                String str = this.f88248d;
                int i = 0;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f88249e.hashCode()) * 31;
                String str2 = this.f88250f;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode2 + i;
            }

            @C12579k
            /* renamed from: j */
            public final List<String> mo106930j() {
                return this.f88247c;
            }

            @C12579k
            /* renamed from: k */
            public final C35702a.C35703a mo106931k() {
                return this.f88249e;
            }

            @C12579k
            /* renamed from: l */
            public final C35689u mo106932l() {
                return this.f88246b;
            }

            @C12580l
            /* renamed from: m */
            public final String mo106933m() {
                return this.f88250f;
            }

            @C12580l
            /* renamed from: n */
            public final String mo106934n() {
                return this.f88248d;
            }

            @C12579k
            /* renamed from: o */
            public final String mo106935o() {
                return this.f88245a;
            }

            /* renamed from: p */
            public final void mo106936p(@C12579k C35702a.C35703a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "<set-?>");
                this.f88249e = aVar;
            }

            /* renamed from: q */
            public final void mo106937q(@C12579k C35689u uVar) {
                Intrinsics.checkNotNullParameter(uVar, "<set-?>");
                this.f88246b = uVar;
            }

            /* renamed from: r */
            public final void mo106938r(@C12580l String str) {
                this.f88248d = str;
            }

            @C12579k
            public String toString() {
                return "Builder(tag=" + this.f88245a + ", info=" + this.f88246b + ", childTags=" + this.f88247c + ", style=" + this.f88248d + ", controllers=" + this.f88249e + ", pagerPageId=" + this.f88250f + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C35706a(String str, C35689u uVar, List list, String str2, C35702a.C35703a aVar, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, uVar, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? new C35702a.C35703a((List) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : aVar, str3);
            }
        }
    }
}
