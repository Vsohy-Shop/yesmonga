package com.urbanairship.android.layout.reporting;

import com.urbanairship.android.layout.util.C35915i;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonValue;
import java.util.Set;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class FormData<T> {
    @C12579k

    /* renamed from: b */
    public static final C35858c f88637b = new C35858c((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final String f88638c = "type";
    @C12579k

    /* renamed from: d */
    public static final String f88639d = "value";
    @C12579k

    /* renamed from: e */
    public static final String f88640e = "score_id";
    @C12579k

    /* renamed from: f */
    public static final String f88641f = "children";
    @C12579k

    /* renamed from: g */
    public static final String f88642g = "response_type";
    @C12579k

    /* renamed from: a */
    public final Type f88643a;

    @C11076d0(mo22515d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/urbanairship/android/layout/reporting/FormData$Type;", "", "Lcom/urbanairship/json/e;", "Lcom/urbanairship/json/JsonValue;", "q", "", "value", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "b", "c", "d", "e", "f", "g", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
    public enum Type implements C9333e {
        FORM("form"),
        NPS_FORM("nps"),
        TOGGLE("toggle"),
        MULTIPLE_CHOICE("multiple_choice"),
        SINGLE_CHOICE("single_choice"),
        TEXT("text_input"),
        SCORE("score");
        
        @C12579k
        private final String value;

        /* access modifiers changed from: public */
        Type(String str) {
            this.value = str;
        }

        @C12579k
        /* renamed from: q */
        public JsonValue mo17264q() {
            JsonValue N = JsonValue.m34968N(this.value);
            Intrinsics.checkNotNullExpressionValue(N, "wrap(value)");
            return N;
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$a */
    public static abstract class C35856a extends FormData<Set<? extends FormData<?>>> implements C9333e {
        @C12579k

        /* renamed from: v */
        public final String f88652v;
        @C12579k

        /* renamed from: w */
        public final Set<FormData<?>> f88653w;

        /* renamed from: x */
        public final boolean f88654x;
        @C12580l

        /* renamed from: y */
        public final C35865a f88655y;
        @C12580l

        /* renamed from: z */
        public final JsonValue f88656z;

        public /* synthetic */ C35856a(Type type, String str, Set set, boolean z, C35865a aVar, JsonValue jsonValue, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, str, set, z, aVar, jsonValue);
        }

        @C12580l
        /* renamed from: a */
        public C35865a mo107381a() {
            return this.f88655y;
        }

        @C12580l
        /* renamed from: b */
        public JsonValue mo107382b() {
            return this.f88656z;
        }

        @C12579k
        /* renamed from: d */
        public String mo107384d() {
            return this.f88652v;
        }

        /* renamed from: g */
        public boolean mo107387g() {
            return this.f88654x;
        }

        @C12579k
        /* renamed from: i */
        public final C9333e mo107390i() {
            C9323b.C9325b y = C9323b.m35017y();
            Intrinsics.checkNotNullExpressionValue(y, "newBuilder()");
            for (FormData next : mo107386f()) {
                y.mo18826j(next.mo107384d(), next.mo107383c());
            }
            C9323b a = y.mo18817a();
            Intrinsics.checkNotNullExpressionValue(a, "builder.build()");
            return a;
        }

        @C12580l
        /* renamed from: j */
        public abstract String mo107391j();

        @C12579k
        /* renamed from: k */
        public Set<FormData<?>> mo107386f() {
            return this.f88653w;
        }

        @C12579k
        /* renamed from: q */
        public JsonValue mo17264q() {
            JsonValue q = C35915i.m148078b(C11078d1.m42659a(mo107384d(), mo107383c())).mo17264q();
            Intrinsics.checkNotNullExpressionValue(q, "jsonMapOf(identifier to formData).toJsonValue()");
            return q;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C35856a(com.urbanairship.android.layout.reporting.FormData.Type r10, java.lang.String r11, java.util.Set r12, boolean r13, com.urbanairship.android.layout.reporting.C35865a r14, com.urbanairship.json.JsonValue r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
            /*
                r9 = this;
                r0 = r16 & 8
                if (r0 == 0) goto L_0x0030
                r0 = r12
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r1 = r0 instanceof java.util.Collection
                r2 = 1
                if (r1 == 0) goto L_0x0016
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0016
                goto L_0x002e
            L_0x0016:
                java.util.Iterator r0 = r0.iterator()
            L_0x001a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x002e
                java.lang.Object r1 = r0.next()
                com.urbanairship.android.layout.reporting.FormData r1 = (com.urbanairship.android.layout.reporting.FormData) r1
                boolean r1 = r1.mo107387g()
                if (r1 != 0) goto L_0x001a
                r0 = 0
                r2 = r0
            L_0x002e:
                r5 = r2
                goto L_0x0031
            L_0x0030:
                r5 = r13
            L_0x0031:
                r0 = r16 & 16
                r1 = 0
                if (r0 == 0) goto L_0x0038
                r6 = r1
                goto L_0x0039
            L_0x0038:
                r6 = r14
            L_0x0039:
                r0 = r16 & 32
                if (r0 == 0) goto L_0x003f
                r7 = r1
                goto L_0x0040
            L_0x003f:
                r7 = r15
            L_0x0040:
                r8 = 0
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.reporting.FormData.C35856a.<init>(com.urbanairship.android.layout.reporting.FormData$Type, java.lang.String, java.util.Set, boolean, com.urbanairship.android.layout.reporting.a, com.urbanairship.json.JsonValue, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public C35856a(Type type, String str, Set<? extends FormData<?>> set, boolean z, C35865a aVar, JsonValue jsonValue) {
            super(type, (DefaultConstructorMarker) null);
            this.f88652v = str;
            this.f88653w = set;
            this.f88654x = z;
            this.f88655y = aVar;
            this.f88656z = jsonValue;
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$b */
    public static final class C35857b extends FormData<Set<? extends JsonValue>> {
        @C12579k

        /* renamed from: v */
        public final String f88657v;
        @C12580l

        /* renamed from: w */
        public final Set<JsonValue> f88658w;

        /* renamed from: x */
        public final boolean f88659x;
        @C12580l

        /* renamed from: y */
        public final C35865a f88660y;
        @C12580l

        /* renamed from: z */
        public final JsonValue f88661z;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35857b(String str, Set set, boolean z, C35865a aVar, JsonValue jsonValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, set, z, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : jsonValue);
        }

        /* renamed from: o */
        public static /* synthetic */ C35857b m147841o(C35857b bVar, String str, Set<JsonValue> set, boolean z, C35865a aVar, JsonValue jsonValue, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.mo107384d();
            }
            if ((i & 2) != 0) {
                set = bVar.mo107386f();
            }
            Set<JsonValue> set2 = set;
            if ((i & 4) != 0) {
                z = bVar.mo107387g();
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                aVar = bVar.mo107381a();
            }
            C35865a aVar2 = aVar;
            if ((i & 16) != 0) {
                jsonValue = bVar.mo107382b();
            }
            return bVar.mo107400n(str, set2, z2, aVar2, jsonValue);
        }

        @C12580l
        /* renamed from: a */
        public C35865a mo107381a() {
            return this.f88660y;
        }

        @C12580l
        /* renamed from: b */
        public JsonValue mo107382b() {
            return this.f88661z;
        }

        @C12579k
        /* renamed from: d */
        public String mo107384d() {
            return this.f88657v;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35857b)) {
                return false;
            }
            C35857b bVar = (C35857b) obj;
            return Intrinsics.areEqual((Object) mo107384d(), (Object) bVar.mo107384d()) && Intrinsics.areEqual((Object) mo107386f(), (Object) bVar.mo107386f()) && mo107387g() == bVar.mo107387g() && Intrinsics.areEqual((Object) mo107381a(), (Object) bVar.mo107381a()) && Intrinsics.areEqual((Object) mo107382b(), (Object) bVar.mo107382b());
        }

        /* renamed from: g */
        public boolean mo107387g() {
            return this.f88659x;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((mo107384d().hashCode() * 31) + (mo107386f() == null ? 0 : mo107386f().hashCode())) * 31;
            boolean g = mo107387g();
            if (g) {
                g = true;
            }
            int hashCode2 = (((hashCode + (g ? 1 : 0)) * 31) + (mo107381a() == null ? 0 : mo107381a().hashCode())) * 31;
            if (mo107382b() != null) {
                i = mo107382b().hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        /* renamed from: i */
        public final String mo107395i() {
            return mo107384d();
        }

        @C12580l
        /* renamed from: j */
        public final Set<JsonValue> mo107396j() {
            return mo107386f();
        }

        /* renamed from: k */
        public final boolean mo107397k() {
            return mo107387g();
        }

        @C12580l
        /* renamed from: l */
        public final C35865a mo107398l() {
            return mo107381a();
        }

        @C12580l
        /* renamed from: m */
        public final JsonValue mo107399m() {
            return mo107382b();
        }

        @C12579k
        /* renamed from: n */
        public final C35857b mo107400n(@C12579k String str, @C12580l Set<? extends JsonValue> set, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            return new C35857b(str, set, z, aVar, jsonValue);
        }

        @C12580l
        /* renamed from: p */
        public Set<JsonValue> mo107386f() {
            return this.f88658w;
        }

        @C12579k
        public String toString() {
            return "CheckboxController(identifier=" + mo107384d() + ", value=" + mo107386f() + ", isValid=" + mo107387g() + ", attributeName=" + mo107381a() + ", attributeValue=" + mo107382b() + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35857b(@C12579k String str, @C12580l Set<? extends JsonValue> set, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue) {
            super(Type.MULTIPLE_CHOICE, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            this.f88657v = str;
            this.f88658w = set;
            this.f88659x = z;
            this.f88660y = aVar;
            this.f88661z = jsonValue;
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$c */
    public static final class C35858c {
        public /* synthetic */ C35858c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C35858c() {
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$d */
    public static final class C35859d extends C35856a {
        @C12579k

        /* renamed from: X */
        public final String f88662X;
        @C12580l

        /* renamed from: Y */
        public final String f88663Y;
        @C12579k

        /* renamed from: Z */
        public final Set<FormData<?>> f88664Z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35859d(@C12579k String str, @C12580l String str2, @C12579k Set<? extends FormData<?>> set) {
            super(Type.FORM, str, set, false, (C35865a) null, (JsonValue) null, 56, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(set, "children");
            this.f88662X = str;
            this.f88663Y = str2;
            this.f88664Z = set;
        }

        /* renamed from: p */
        public static /* synthetic */ C35859d m147854p(C35859d dVar, String str, String str2, Set<FormData<?>> set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.mo107384d();
            }
            if ((i & 2) != 0) {
                str2 = dVar.mo107391j();
            }
            if ((i & 4) != 0) {
                set = dVar.f88664Z;
            }
            return dVar.mo107407o(str, str2, set);
        }

        @C12579k
        /* renamed from: c */
        public C9323b mo107383c() {
            return C35915i.m148078b(C11078d1.m42659a("type", mo107385e()), C11078d1.m42659a("children", mo107390i()), C11078d1.m42659a("response_type", mo107391j()));
        }

        @C12579k
        /* renamed from: d */
        public String mo107384d() {
            return this.f88662X;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35859d)) {
                return false;
            }
            C35859d dVar = (C35859d) obj;
            return Intrinsics.areEqual((Object) mo107384d(), (Object) dVar.mo107384d()) && Intrinsics.areEqual((Object) mo107391j(), (Object) dVar.mo107391j()) && Intrinsics.areEqual((Object) this.f88664Z, (Object) dVar.f88664Z);
        }

        public int hashCode() {
            return (((mo107384d().hashCode() * 31) + (mo107391j() == null ? 0 : mo107391j().hashCode())) * 31) + this.f88664Z.hashCode();
        }

        @C12580l
        /* renamed from: j */
        public String mo107391j() {
            return this.f88663Y;
        }

        @C12579k
        /* renamed from: l */
        public final String mo107404l() {
            return mo107384d();
        }

        @C12580l
        /* renamed from: m */
        public final String mo107405m() {
            return mo107391j();
        }

        @C12579k
        /* renamed from: n */
        public final Set<FormData<?>> mo107406n() {
            return this.f88664Z;
        }

        @C12579k
        /* renamed from: o */
        public final C35859d mo107407o(@C12579k String str, @C12580l String str2, @C12579k Set<? extends FormData<?>> set) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(set, "children");
            return new C35859d(str, str2, set);
        }

        @C12579k
        /* renamed from: r */
        public final Set<FormData<?>> mo107408r() {
            return this.f88664Z;
        }

        @C12579k
        public String toString() {
            return "Form(identifier=" + mo107384d() + ", responseType=" + mo107391j() + ", children=" + this.f88664Z + ')';
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$e */
    public static final class C35860e extends C35856a {
        @C12579k

        /* renamed from: E0 */
        public final Set<FormData<?>> f88665E0;
        @C12579k

        /* renamed from: X */
        public final String f88666X;
        @C12579k

        /* renamed from: Y */
        public final String f88667Y;
        @C12580l

        /* renamed from: Z */
        public final String f88668Z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35860e(@C12579k String str, @C12579k String str2, @C12580l String str3, @C12579k Set<? extends FormData<?>> set) {
            super(Type.NPS_FORM, str, set, false, (C35865a) null, (JsonValue) null, 56, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(str2, "scoreId");
            Intrinsics.checkNotNullParameter(set, "children");
            this.f88666X = str;
            this.f88667Y = str2;
            this.f88668Z = str3;
            this.f88665E0 = set;
        }

        /* renamed from: r */
        public static /* synthetic */ C35860e m147863r(C35860e eVar, String str, String str2, String str3, Set<FormData<?>> set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.mo107384d();
            }
            if ((i & 2) != 0) {
                str2 = eVar.f88667Y;
            }
            if ((i & 4) != 0) {
                str3 = eVar.mo107391j();
            }
            if ((i & 8) != 0) {
                set = eVar.f88665E0;
            }
            return eVar.mo107415p(str, str2, str3, set);
        }

        @C12579k
        /* renamed from: c */
        public C9323b mo107383c() {
            return C35915i.m148078b(C11078d1.m42659a("type", mo107385e()), C11078d1.m42659a("children", mo107390i()), C11078d1.m42659a(FormData.f88640e, this.f88667Y), C11078d1.m42659a("response_type", mo107391j()));
        }

        @C12579k
        /* renamed from: d */
        public String mo107384d() {
            return this.f88666X;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35860e)) {
                return false;
            }
            C35860e eVar = (C35860e) obj;
            return Intrinsics.areEqual((Object) mo107384d(), (Object) eVar.mo107384d()) && Intrinsics.areEqual((Object) this.f88667Y, (Object) eVar.f88667Y) && Intrinsics.areEqual((Object) mo107391j(), (Object) eVar.mo107391j()) && Intrinsics.areEqual((Object) this.f88665E0, (Object) eVar.f88665E0);
        }

        public int hashCode() {
            return (((((mo107384d().hashCode() * 31) + this.f88667Y.hashCode()) * 31) + (mo107391j() == null ? 0 : mo107391j().hashCode())) * 31) + this.f88665E0.hashCode();
        }

        @C12580l
        /* renamed from: j */
        public String mo107391j() {
            return this.f88668Z;
        }

        @C12579k
        /* renamed from: l */
        public final String mo107411l() {
            return mo107384d();
        }

        /* renamed from: m */
        public final String mo107412m() {
            return this.f88667Y;
        }

        @C12580l
        /* renamed from: n */
        public final String mo107413n() {
            return mo107391j();
        }

        @C12579k
        /* renamed from: o */
        public final Set<FormData<?>> mo107414o() {
            return this.f88665E0;
        }

        @C12579k
        /* renamed from: p */
        public final C35860e mo107415p(@C12579k String str, @C12579k String str2, @C12580l String str3, @C12579k Set<? extends FormData<?>> set) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(str2, "scoreId");
            Intrinsics.checkNotNullParameter(set, "children");
            return new C35860e(str, str2, str3, set);
        }

        @C12579k
        /* renamed from: s */
        public final Set<FormData<?>> mo107416s() {
            return this.f88665E0;
        }

        @C12579k
        public String toString() {
            return "Nps(identifier=" + mo107384d() + ", scoreId=" + this.f88667Y + ", responseType=" + mo107391j() + ", children=" + this.f88665E0 + ')';
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$f */
    public static final class C35861f extends FormData<JsonValue> {
        @C12579k

        /* renamed from: v */
        public final String f88669v;
        @C12580l

        /* renamed from: w */
        public final JsonValue f88670w;

        /* renamed from: x */
        public final boolean f88671x;
        @C12580l

        /* renamed from: y */
        public final C35865a f88672y;
        @C12580l

        /* renamed from: z */
        public final JsonValue f88673z;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35861f(String str, JsonValue jsonValue, boolean z, C35865a aVar, JsonValue jsonValue2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, jsonValue, z, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : jsonValue2);
        }

        /* renamed from: o */
        public static /* synthetic */ C35861f m147873o(C35861f fVar, String str, JsonValue jsonValue, boolean z, C35865a aVar, JsonValue jsonValue2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fVar.mo107384d();
            }
            if ((i & 2) != 0) {
                jsonValue = fVar.mo107386f();
            }
            JsonValue jsonValue3 = jsonValue;
            if ((i & 4) != 0) {
                z = fVar.mo107387g();
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                aVar = fVar.mo107381a();
            }
            C35865a aVar2 = aVar;
            if ((i & 16) != 0) {
                jsonValue2 = fVar.mo107382b();
            }
            return fVar.mo107424n(str, jsonValue3, z2, aVar2, jsonValue2);
        }

        @C12580l
        /* renamed from: a */
        public C35865a mo107381a() {
            return this.f88672y;
        }

        @C12580l
        /* renamed from: b */
        public JsonValue mo107382b() {
            return this.f88673z;
        }

        @C12579k
        /* renamed from: d */
        public String mo107384d() {
            return this.f88669v;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35861f)) {
                return false;
            }
            C35861f fVar = (C35861f) obj;
            return Intrinsics.areEqual((Object) mo107384d(), (Object) fVar.mo107384d()) && Intrinsics.areEqual((Object) mo107386f(), (Object) fVar.mo107386f()) && mo107387g() == fVar.mo107387g() && Intrinsics.areEqual((Object) mo107381a(), (Object) fVar.mo107381a()) && Intrinsics.areEqual((Object) mo107382b(), (Object) fVar.mo107382b());
        }

        /* renamed from: g */
        public boolean mo107387g() {
            return this.f88671x;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((mo107384d().hashCode() * 31) + (mo107386f() == null ? 0 : mo107386f().hashCode())) * 31;
            boolean g = mo107387g();
            if (g) {
                g = true;
            }
            int hashCode2 = (((hashCode + (g ? 1 : 0)) * 31) + (mo107381a() == null ? 0 : mo107381a().hashCode())) * 31;
            if (mo107382b() != null) {
                i = mo107382b().hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        /* renamed from: i */
        public final String mo107419i() {
            return mo107384d();
        }

        @C12580l
        /* renamed from: j */
        public final JsonValue mo107420j() {
            return mo107386f();
        }

        /* renamed from: k */
        public final boolean mo107421k() {
            return mo107387g();
        }

        @C12580l
        /* renamed from: l */
        public final C35865a mo107422l() {
            return mo107381a();
        }

        @C12580l
        /* renamed from: m */
        public final JsonValue mo107423m() {
            return mo107382b();
        }

        @C12579k
        /* renamed from: n */
        public final C35861f mo107424n(@C12579k String str, @C12580l JsonValue jsonValue, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue2) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            return new C35861f(str, jsonValue, z, aVar, jsonValue2);
        }

        @C12580l
        /* renamed from: p */
        public JsonValue mo107386f() {
            return this.f88670w;
        }

        @C12579k
        public String toString() {
            return "RadioInputController(identifier=" + mo107384d() + ", value=" + mo107386f() + ", isValid=" + mo107387g() + ", attributeName=" + mo107381a() + ", attributeValue=" + mo107382b() + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35861f(@C12579k String str, @C12580l JsonValue jsonValue, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue2) {
            super(Type.SINGLE_CHOICE, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            this.f88669v = str;
            this.f88670w = jsonValue;
            this.f88671x = z;
            this.f88672y = aVar;
            this.f88673z = jsonValue2;
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$g */
    public static final class C35862g extends FormData<Integer> {
        @C12579k

        /* renamed from: v */
        public final String f88674v;
        @C12580l

        /* renamed from: w */
        public final Integer f88675w;

        /* renamed from: x */
        public final boolean f88676x;
        @C12580l

        /* renamed from: y */
        public final C35865a f88677y;
        @C12580l

        /* renamed from: z */
        public final JsonValue f88678z;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35862g(String str, Integer num, boolean z, C35865a aVar, JsonValue jsonValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, num, z, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : jsonValue);
        }

        /* renamed from: o */
        public static /* synthetic */ C35862g m147886o(C35862g gVar, String str, Integer num, boolean z, C35865a aVar, JsonValue jsonValue, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.mo107384d();
            }
            if ((i & 2) != 0) {
                num = gVar.mo107386f();
            }
            Integer num2 = num;
            if ((i & 4) != 0) {
                z = gVar.mo107387g();
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                aVar = gVar.mo107381a();
            }
            C35865a aVar2 = aVar;
            if ((i & 16) != 0) {
                jsonValue = gVar.mo107382b();
            }
            return gVar.mo107433n(str, num2, z2, aVar2, jsonValue);
        }

        @C12580l
        /* renamed from: a */
        public C35865a mo107381a() {
            return this.f88677y;
        }

        @C12580l
        /* renamed from: b */
        public JsonValue mo107382b() {
            return this.f88678z;
        }

        @C12579k
        /* renamed from: d */
        public String mo107384d() {
            return this.f88674v;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35862g)) {
                return false;
            }
            C35862g gVar = (C35862g) obj;
            return Intrinsics.areEqual((Object) mo107384d(), (Object) gVar.mo107384d()) && Intrinsics.areEqual((Object) mo107386f(), (Object) gVar.mo107386f()) && mo107387g() == gVar.mo107387g() && Intrinsics.areEqual((Object) mo107381a(), (Object) gVar.mo107381a()) && Intrinsics.areEqual((Object) mo107382b(), (Object) gVar.mo107382b());
        }

        /* renamed from: g */
        public boolean mo107387g() {
            return this.f88676x;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((mo107384d().hashCode() * 31) + (mo107386f() == null ? 0 : mo107386f().hashCode())) * 31;
            boolean g = mo107387g();
            if (g) {
                g = true;
            }
            int hashCode2 = (((hashCode + (g ? 1 : 0)) * 31) + (mo107381a() == null ? 0 : mo107381a().hashCode())) * 31;
            if (mo107382b() != null) {
                i = mo107382b().hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        /* renamed from: i */
        public final String mo107428i() {
            return mo107384d();
        }

        @C12580l
        /* renamed from: j */
        public final Integer mo107429j() {
            return mo107386f();
        }

        /* renamed from: k */
        public final boolean mo107430k() {
            return mo107387g();
        }

        @C12580l
        /* renamed from: l */
        public final C35865a mo107431l() {
            return mo107381a();
        }

        @C12580l
        /* renamed from: m */
        public final JsonValue mo107432m() {
            return mo107382b();
        }

        @C12579k
        /* renamed from: n */
        public final C35862g mo107433n(@C12579k String str, @C12580l Integer num, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            return new C35862g(str, num, z, aVar, jsonValue);
        }

        @C12580l
        /* renamed from: p */
        public Integer mo107386f() {
            return this.f88675w;
        }

        @C12579k
        public String toString() {
            return "Score(identifier=" + mo107384d() + ", value=" + mo107386f() + ", isValid=" + mo107387g() + ", attributeName=" + mo107381a() + ", attributeValue=" + mo107382b() + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35862g(@C12579k String str, @C12580l Integer num, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue) {
            super(Type.SCORE, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            this.f88674v = str;
            this.f88675w = num;
            this.f88676x = z;
            this.f88677y = aVar;
            this.f88678z = jsonValue;
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$h */
    public static final class C35863h extends FormData<String> {
        @C12579k

        /* renamed from: v */
        public final String f88679v;
        @C12580l

        /* renamed from: w */
        public final String f88680w;

        /* renamed from: x */
        public final boolean f88681x;
        @C12580l

        /* renamed from: y */
        public final C35865a f88682y;
        @C12580l

        /* renamed from: z */
        public final JsonValue f88683z;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35863h(String str, String str2, boolean z, C35865a aVar, JsonValue jsonValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : jsonValue);
        }

        /* renamed from: o */
        public static /* synthetic */ C35863h m147899o(C35863h hVar, String str, String str2, boolean z, C35865a aVar, JsonValue jsonValue, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.mo107384d();
            }
            if ((i & 2) != 0) {
                str2 = hVar.mo107386f();
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                z = hVar.mo107387g();
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                aVar = hVar.mo107381a();
            }
            C35865a aVar2 = aVar;
            if ((i & 16) != 0) {
                jsonValue = hVar.mo107382b();
            }
            return hVar.mo107442n(str, str3, z2, aVar2, jsonValue);
        }

        @C12580l
        /* renamed from: a */
        public C35865a mo107381a() {
            return this.f88682y;
        }

        @C12580l
        /* renamed from: b */
        public JsonValue mo107382b() {
            return this.f88683z;
        }

        @C12579k
        /* renamed from: d */
        public String mo107384d() {
            return this.f88679v;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35863h)) {
                return false;
            }
            C35863h hVar = (C35863h) obj;
            return Intrinsics.areEqual((Object) mo107384d(), (Object) hVar.mo107384d()) && Intrinsics.areEqual((Object) mo107386f(), (Object) hVar.mo107386f()) && mo107387g() == hVar.mo107387g() && Intrinsics.areEqual((Object) mo107381a(), (Object) hVar.mo107381a()) && Intrinsics.areEqual((Object) mo107382b(), (Object) hVar.mo107382b());
        }

        /* renamed from: g */
        public boolean mo107387g() {
            return this.f88681x;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((mo107384d().hashCode() * 31) + (mo107386f() == null ? 0 : mo107386f().hashCode())) * 31;
            boolean g = mo107387g();
            if (g) {
                g = true;
            }
            int hashCode2 = (((hashCode + (g ? 1 : 0)) * 31) + (mo107381a() == null ? 0 : mo107381a().hashCode())) * 31;
            if (mo107382b() != null) {
                i = mo107382b().hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        /* renamed from: i */
        public final String mo107437i() {
            return mo107384d();
        }

        @C12580l
        /* renamed from: j */
        public final String mo107438j() {
            return mo107386f();
        }

        /* renamed from: k */
        public final boolean mo107439k() {
            return mo107387g();
        }

        @C12580l
        /* renamed from: l */
        public final C35865a mo107440l() {
            return mo107381a();
        }

        @C12580l
        /* renamed from: m */
        public final JsonValue mo107441m() {
            return mo107382b();
        }

        @C12579k
        /* renamed from: n */
        public final C35863h mo107442n(@C12579k String str, @C12580l String str2, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            return new C35863h(str, str2, z, aVar, jsonValue);
        }

        @C12580l
        /* renamed from: p */
        public String mo107386f() {
            return this.f88680w;
        }

        @C12579k
        public String toString() {
            return "TextInput(identifier=" + mo107384d() + ", value=" + mo107386f() + ", isValid=" + mo107387g() + ", attributeName=" + mo107381a() + ", attributeValue=" + mo107382b() + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35863h(@C12579k String str, @C12580l String str2, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue) {
            super(Type.TEXT, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            this.f88679v = str;
            this.f88680w = str2;
            this.f88681x = z;
            this.f88682y = aVar;
            this.f88683z = jsonValue;
        }
    }

    /* renamed from: com.urbanairship.android.layout.reporting.FormData$i */
    public static final class C35864i extends FormData<Boolean> {
        @C12579k

        /* renamed from: v */
        public final String f88684v;
        @C12580l

        /* renamed from: w */
        public final Boolean f88685w;

        /* renamed from: x */
        public final boolean f88686x;
        @C12580l

        /* renamed from: y */
        public final C35865a f88687y;
        @C12580l

        /* renamed from: z */
        public final JsonValue f88688z;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35864i(String str, Boolean bool, boolean z, C35865a aVar, JsonValue jsonValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, bool, z, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : jsonValue);
        }

        /* renamed from: o */
        public static /* synthetic */ C35864i m147912o(C35864i iVar, String str, Boolean bool, boolean z, C35865a aVar, JsonValue jsonValue, int i, Object obj) {
            if ((i & 1) != 0) {
                str = iVar.mo107384d();
            }
            if ((i & 2) != 0) {
                bool = iVar.mo107386f();
            }
            Boolean bool2 = bool;
            if ((i & 4) != 0) {
                z = iVar.mo107387g();
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                aVar = iVar.mo107381a();
            }
            C35865a aVar2 = aVar;
            if ((i & 16) != 0) {
                jsonValue = iVar.mo107382b();
            }
            return iVar.mo107451n(str, bool2, z2, aVar2, jsonValue);
        }

        @C12580l
        /* renamed from: a */
        public C35865a mo107381a() {
            return this.f88687y;
        }

        @C12580l
        /* renamed from: b */
        public JsonValue mo107382b() {
            return this.f88688z;
        }

        @C12579k
        /* renamed from: d */
        public String mo107384d() {
            return this.f88684v;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35864i)) {
                return false;
            }
            C35864i iVar = (C35864i) obj;
            return Intrinsics.areEqual((Object) mo107384d(), (Object) iVar.mo107384d()) && Intrinsics.areEqual((Object) mo107386f(), (Object) iVar.mo107386f()) && mo107387g() == iVar.mo107387g() && Intrinsics.areEqual((Object) mo107381a(), (Object) iVar.mo107381a()) && Intrinsics.areEqual((Object) mo107382b(), (Object) iVar.mo107382b());
        }

        /* renamed from: g */
        public boolean mo107387g() {
            return this.f88686x;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((mo107384d().hashCode() * 31) + (mo107386f() == null ? 0 : mo107386f().hashCode())) * 31;
            boolean g = mo107387g();
            if (g) {
                g = true;
            }
            int hashCode2 = (((hashCode + (g ? 1 : 0)) * 31) + (mo107381a() == null ? 0 : mo107381a().hashCode())) * 31;
            if (mo107382b() != null) {
                i = mo107382b().hashCode();
            }
            return hashCode2 + i;
        }

        @C12579k
        /* renamed from: i */
        public final String mo107446i() {
            return mo107384d();
        }

        @C12580l
        /* renamed from: j */
        public final Boolean mo107447j() {
            return mo107386f();
        }

        /* renamed from: k */
        public final boolean mo107448k() {
            return mo107387g();
        }

        @C12580l
        /* renamed from: l */
        public final C35865a mo107449l() {
            return mo107381a();
        }

        @C12580l
        /* renamed from: m */
        public final JsonValue mo107450m() {
            return mo107382b();
        }

        @C12579k
        /* renamed from: n */
        public final C35864i mo107451n(@C12579k String str, @C12580l Boolean bool, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            return new C35864i(str, bool, z, aVar, jsonValue);
        }

        @C12580l
        /* renamed from: p */
        public Boolean mo107386f() {
            return this.f88685w;
        }

        @C12579k
        public String toString() {
            return "Toggle(identifier=" + mo107384d() + ", value=" + mo107386f() + ", isValid=" + mo107387g() + ", attributeName=" + mo107381a() + ", attributeValue=" + mo107382b() + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35864i(@C12579k String str, @C12580l Boolean bool, boolean z, @C12580l C35865a aVar, @C12580l JsonValue jsonValue) {
            super(Type.TOGGLE, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            this.f88684v = str;
            this.f88685w = bool;
            this.f88686x = z;
            this.f88687y = aVar;
            this.f88688z = jsonValue;
        }
    }

    public /* synthetic */ FormData(Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    @C12580l
    /* renamed from: a */
    public abstract C35865a mo107381a();

    @C12580l
    /* renamed from: b */
    public abstract JsonValue mo107382b();

    @C12579k
    /* renamed from: c */
    public C9323b mo107383c() {
        return C35915i.m148078b(C11078d1.m42659a("type", this.f88643a), C11078d1.m42659a("value", JsonValue.m34975U(mo107386f())));
    }

    @C12579k
    /* renamed from: d */
    public abstract String mo107384d();

    @C12579k
    /* renamed from: e */
    public final Type mo107385e() {
        return this.f88643a;
    }

    @C12580l
    /* renamed from: f */
    public abstract T mo107386f();

    /* renamed from: g */
    public abstract boolean mo107387g();

    @C12580l
    /* renamed from: h */
    public final JsonValue mo107388h() {
        JsonValue U = JsonValue.m34975U(mo107386f());
        if (!Intrinsics.areEqual((Object) U, (Object) JsonValue.f25436b)) {
            return U;
        }
        return null;
    }

    @C12579k
    public String toString() {
        return String.valueOf(mo107383c().mo17264q());
    }

    public FormData(Type type) {
        this.f88643a = type;
    }
}
