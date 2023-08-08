package com.urbanairship.android.layout.environment;

import com.urbanairship.android.layout.environment.C35599i;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.json.JsonValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C11078d1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10930d1;
import kotlin.collections.C10977s0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.environment.o */
public abstract class C35608o {

    /* renamed from: com.urbanairship.android.layout.environment.o$c */
    public static final class C35611c extends C35608o {
        @C12579k

        /* renamed from: a */
        public final Map<String, JsonValue> f88040a;

        public C35611c() {
            this((Map) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public static /* synthetic */ C35611c m146969c(C35611c cVar, Map<String, JsonValue> map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = cVar.f88040a;
            }
            return cVar.mo106715b(map);
        }

        @C12579k
        /* renamed from: a */
        public final Map<String, JsonValue> mo106714a() {
            return this.f88040a;
        }

        @C12579k
        /* renamed from: b */
        public final C35611c mo106715b(@C12579k Map<String, ? extends JsonValue> map) {
            Intrinsics.checkNotNullParameter(map, "state");
            return new C35611c(map);
        }

        @C12579k
        /* renamed from: d */
        public final Map<String, JsonValue> mo106716d() {
            return this.f88040a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35611c) && Intrinsics.areEqual((Object) this.f88040a, (Object) ((C35611c) obj).f88040a);
        }

        public int hashCode() {
            return this.f88040a.hashCode();
        }

        @C12579k
        public String toString() {
            return "Layout(state=" + this.f88040a + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35611c(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C10977s0.m41492z() : map);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35611c(@C12579k Map<String, ? extends JsonValue> map) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(map, "state");
            this.f88040a = map;
        }
    }

    /* renamed from: com.urbanairship.android.layout.environment.o$e */
    public static final class C35613e extends C35608o {
        @C12579k

        /* renamed from: a */
        public final String f88046a;
        @C12580l

        /* renamed from: b */
        public final JsonValue f88047b;
        @C12580l

        /* renamed from: c */
        public final JsonValue f88048c;

        /* renamed from: d */
        public final boolean f88049d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35613e(String str, JsonValue jsonValue, JsonValue jsonValue2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : jsonValue, (i & 4) != 0 ? null : jsonValue2, (i & 8) != 0 ? true : z);
        }

        /* renamed from: f */
        public static /* synthetic */ C35613e m146990f(C35613e eVar, String str, JsonValue jsonValue, JsonValue jsonValue2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVar.f88046a;
            }
            if ((i & 2) != 0) {
                jsonValue = eVar.f88047b;
            }
            if ((i & 4) != 0) {
                jsonValue2 = eVar.f88048c;
            }
            if ((i & 8) != 0) {
                z = eVar.f88049d;
            }
            return eVar.mo106743e(str, jsonValue, jsonValue2, z);
        }

        @C12579k
        /* renamed from: a */
        public final String mo106739a() {
            return this.f88046a;
        }

        @C12580l
        /* renamed from: b */
        public final JsonValue mo106740b() {
            return this.f88047b;
        }

        @C12580l
        /* renamed from: c */
        public final JsonValue mo106741c() {
            return this.f88048c;
        }

        /* renamed from: d */
        public final boolean mo106742d() {
            return this.f88049d;
        }

        @C12579k
        /* renamed from: e */
        public final C35613e mo106743e(@C12579k String str, @C12580l JsonValue jsonValue, @C12580l JsonValue jsonValue2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            return new C35613e(str, jsonValue, jsonValue2, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35613e)) {
                return false;
            }
            C35613e eVar = (C35613e) obj;
            return Intrinsics.areEqual((Object) this.f88046a, (Object) eVar.f88046a) && Intrinsics.areEqual((Object) this.f88047b, (Object) eVar.f88047b) && Intrinsics.areEqual((Object) this.f88048c, (Object) eVar.f88048c) && this.f88049d == eVar.f88049d;
        }

        @C12580l
        /* renamed from: g */
        public final JsonValue mo106745g() {
            return this.f88048c;
        }

        @C12579k
        /* renamed from: h */
        public final String mo106746h() {
            return this.f88046a;
        }

        public int hashCode() {
            int hashCode = this.f88046a.hashCode() * 31;
            JsonValue jsonValue = this.f88047b;
            int i = 0;
            int hashCode2 = (hashCode + (jsonValue == null ? 0 : jsonValue.hashCode())) * 31;
            JsonValue jsonValue2 = this.f88048c;
            if (jsonValue2 != null) {
                i = jsonValue2.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f88049d;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        @C12580l
        /* renamed from: i */
        public final JsonValue mo106748i() {
            return this.f88047b;
        }

        /* renamed from: j */
        public final boolean mo106749j() {
            return this.f88049d;
        }

        @C12579k
        public String toString() {
            return "Radio(identifier=" + this.f88046a + ", selectedItem=" + this.f88047b + ", attributeValue=" + this.f88048c + ", isEnabled=" + this.f88049d + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35613e(@C12579k String str, @C12580l JsonValue jsonValue, @C12580l JsonValue jsonValue2, boolean z) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            this.f88046a = str;
            this.f88047b = jsonValue;
            this.f88048c = jsonValue2;
            this.f88049d = z;
        }
    }

    public /* synthetic */ C35608o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: com.urbanairship.android.layout.environment.o$a */
    public static final class C35609a extends C35608o {
        @C12579k

        /* renamed from: a */
        public final String f88025a;

        /* renamed from: b */
        public final int f88026b;

        /* renamed from: c */
        public final int f88027c;
        @C12579k

        /* renamed from: d */
        public final Set<JsonValue> f88028d;

        /* renamed from: e */
        public final boolean f88029e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35609a(String str, int i, int i2, Set set, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, (i3 & 8) != 0 ? C10930d1.m40892k() : set, (i3 & 16) != 0 ? true : z);
        }

        /* renamed from: g */
        public static /* synthetic */ C35609a m146928g(C35609a aVar, String str, int i, int i2, Set<JsonValue> set, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = aVar.f88025a;
            }
            if ((i3 & 2) != 0) {
                i = aVar.f88026b;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = aVar.f88027c;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                set = aVar.f88028d;
            }
            Set<JsonValue> set2 = set;
            if ((i3 & 16) != 0) {
                z = aVar.f88029e;
            }
            return aVar.mo106675f(str, i4, i5, set2, z);
        }

        @C12579k
        /* renamed from: a */
        public final String mo106669a() {
            return this.f88025a;
        }

        /* renamed from: b */
        public final int mo106670b() {
            return this.f88026b;
        }

        /* renamed from: c */
        public final int mo106671c() {
            return this.f88027c;
        }

        @C12579k
        /* renamed from: d */
        public final Set<JsonValue> mo106672d() {
            return this.f88028d;
        }

        /* renamed from: e */
        public final boolean mo106673e() {
            return this.f88029e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35609a)) {
                return false;
            }
            C35609a aVar = (C35609a) obj;
            return Intrinsics.areEqual((Object) this.f88025a, (Object) aVar.f88025a) && this.f88026b == aVar.f88026b && this.f88027c == aVar.f88027c && Intrinsics.areEqual((Object) this.f88028d, (Object) aVar.f88028d) && this.f88029e == aVar.f88029e;
        }

        @C12579k
        /* renamed from: f */
        public final C35609a mo106675f(@C12579k String str, int i, int i2, @C12579k Set<? extends JsonValue> set, boolean z) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(set, "selectedItems");
            return new C35609a(str, i, i2, set, z);
        }

        @C12579k
        /* renamed from: h */
        public final String mo106676h() {
            return this.f88025a;
        }

        public int hashCode() {
            int hashCode = ((((((this.f88025a.hashCode() * 31) + Integer.hashCode(this.f88026b)) * 31) + Integer.hashCode(this.f88027c)) * 31) + this.f88028d.hashCode()) * 31;
            boolean z = this.f88029e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        /* renamed from: i */
        public final int mo106678i() {
            return this.f88027c;
        }

        /* renamed from: j */
        public final int mo106679j() {
            return this.f88026b;
        }

        @C12579k
        /* renamed from: k */
        public final Set<JsonValue> mo106680k() {
            return this.f88028d;
        }

        /* renamed from: l */
        public final boolean mo106681l() {
            return this.f88029e;
        }

        @C12579k
        public String toString() {
            return "Checkbox(identifier=" + this.f88025a + ", minSelection=" + this.f88026b + ", maxSelection=" + this.f88027c + ", selectedItems=" + this.f88028d + ", isEnabled=" + this.f88029e + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35609a(@C12579k String str, int i, int i2, @C12579k Set<? extends JsonValue> set, boolean z) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(set, "selectedItems");
            this.f88025a = str;
            this.f88026b = i;
            this.f88027c = i2;
            this.f88028d = set;
            this.f88029e = z;
        }
    }

    /* renamed from: com.urbanairship.android.layout.environment.o$d */
    public static final class C35612d extends C35608o {
        @C12579k

        /* renamed from: a */
        public final String f88041a;

        /* renamed from: b */
        public final int f88042b;

        /* renamed from: c */
        public final int f88043c;

        /* renamed from: d */
        public final boolean f88044d;
        @C12579k

        /* renamed from: e */
        public final List<String> f88045e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C35612d(String str, int i, int i2, boolean z, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
        }

        /* renamed from: g */
        public static /* synthetic */ C35612d m146973g(C35612d dVar, String str, int i, int i2, boolean z, List<String> list, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = dVar.f88041a;
            }
            if ((i3 & 2) != 0) {
                i = dVar.f88042b;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = dVar.f88043c;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                z = dVar.f88044d;
            }
            boolean z2 = z;
            if ((i3 & 16) != 0) {
                list = dVar.f88045e;
            }
            return dVar.mo106726f(str, i4, i5, z2, list);
        }

        @C12579k
        /* renamed from: a */
        public final String mo106720a() {
            return this.f88041a;
        }

        /* renamed from: b */
        public final int mo106721b() {
            return this.f88042b;
        }

        /* renamed from: c */
        public final int mo106722c() {
            return this.f88043c;
        }

        /* renamed from: d */
        public final boolean mo106723d() {
            return this.f88044d;
        }

        @C12579k
        /* renamed from: e */
        public final List<String> mo106724e() {
            return this.f88045e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35612d)) {
                return false;
            }
            C35612d dVar = (C35612d) obj;
            return Intrinsics.areEqual((Object) this.f88041a, (Object) dVar.f88041a) && this.f88042b == dVar.f88042b && this.f88043c == dVar.f88043c && this.f88044d == dVar.f88044d && Intrinsics.areEqual((Object) this.f88045e, (Object) dVar.f88045e);
        }

        @C12579k
        /* renamed from: f */
        public final C35612d mo106726f(@C12579k String str, int i, int i2, boolean z, @C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(list, "pages");
            return new C35612d(str, i, i2, z, list);
        }

        @C12579k
        /* renamed from: h */
        public final C35612d mo106727h(@C12579k List<String> list) {
            Intrinsics.checkNotNullParameter(list, "pageIds");
            boolean z = true;
            if (list.size() > 1) {
                z = false;
            }
            return m146973g(this, (String) null, 0, 0, z, list, 7, (Object) null);
        }

        public int hashCode() {
            int hashCode = ((((this.f88041a.hashCode() * 31) + Integer.hashCode(this.f88042b)) * 31) + Integer.hashCode(this.f88043c)) * 31;
            boolean z = this.f88044d;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f88045e.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final C35612d mo106729i(int i) {
            boolean z;
            int i2 = this.f88042b;
            if (i == i2) {
                return m146973g(this, (String) null, 0, 0, false, (List) null, 31, (Object) null);
            }
            if (this.f88044d || i == this.f88045e.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            return m146973g(this, (String) null, i, i2, z, (List) null, 17, (Object) null);
        }

        /* renamed from: j */
        public final boolean mo106730j() {
            return this.f88044d;
        }

        /* renamed from: k */
        public final boolean mo106731k() {
            return this.f88042b < this.f88045e.size() - 1;
        }

        /* renamed from: l */
        public final boolean mo106732l() {
            return this.f88042b > 0;
        }

        @C12579k
        /* renamed from: m */
        public final String mo106733m() {
            return this.f88041a;
        }

        /* renamed from: n */
        public final int mo106734n() {
            return this.f88043c;
        }

        /* renamed from: o */
        public final int mo106735o() {
            return this.f88042b;
        }

        @C12579k
        /* renamed from: p */
        public final List<String> mo106736p() {
            return this.f88045e;
        }

        @C12579k
        /* renamed from: q */
        public final C35869e mo106737q() {
            String str = this.f88041a;
            int i = this.f88042b;
            List<String> list = this.f88045e;
            return new C35869e(str, i, (i < 0 || i > CollectionsKt__CollectionsKt.m40443G(list)) ? "NULL!" : list.get(i), this.f88045e.size(), this.f88044d);
        }

        @C12579k
        public String toString() {
            return "Pager(identifier=" + this.f88041a + ", pageIndex=" + this.f88042b + ", lastPageIndex=" + this.f88043c + ", completed=" + this.f88044d + ", pages=" + this.f88045e + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35612d(@C12579k String str, int i, int i2, boolean z, @C12579k List<String> list) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(list, "pages");
            this.f88041a = str;
            this.f88042b = i;
            this.f88043c = i2;
            this.f88044d = z;
            this.f88045e = list;
        }
    }

    public C35608o() {
    }

    /* renamed from: com.urbanairship.android.layout.environment.o$b */
    public static final class C35610b extends C35608o {
        @C12579k

        /* renamed from: a */
        public final String f88030a;
        @C12579k

        /* renamed from: b */
        public final C35599i f88031b;
        @C12580l

        /* renamed from: c */
        public final String f88032c;
        @C12579k

        /* renamed from: d */
        public final Map<String, FormData<?>> f88033d;
        @C12579k

        /* renamed from: e */
        public final Map<String, Boolean> f88034e;
        @C12579k

        /* renamed from: f */
        public final Set<String> f88035f;

        /* renamed from: g */
        public final boolean f88036g;

        /* renamed from: h */
        public final boolean f88037h;

        /* renamed from: i */
        public final boolean f88038i;

        /* renamed from: j */
        public final boolean f88039j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C35610b(java.lang.String r14, com.urbanairship.android.layout.environment.C35599i r15, java.lang.String r16, java.util.Map r17, java.util.Map r18, java.util.Set r19, boolean r20, boolean r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
            /*
                r13 = this;
                r0 = r24
                r1 = r0 & 8
                if (r1 == 0) goto L_0x000c
                java.util.Map r1 = kotlin.collections.C10977s0.m41492z()
                r6 = r1
                goto L_0x000e
            L_0x000c:
                r6 = r17
            L_0x000e:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0018
                java.util.Map r1 = kotlin.collections.C10977s0.m41492z()
                r7 = r1
                goto L_0x001a
            L_0x0018:
                r7 = r18
            L_0x001a:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0024
                java.util.Set r1 = kotlin.collections.C10930d1.m40892k()
                r8 = r1
                goto L_0x0026
            L_0x0024:
                r8 = r19
            L_0x0026:
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L_0x002d
                r9 = r2
                goto L_0x002f
            L_0x002d:
                r9 = r20
            L_0x002f:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0035
                r10 = r2
                goto L_0x0037
            L_0x0035:
                r10 = r21
            L_0x0037:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x003e
                r1 = 1
                r11 = r1
                goto L_0x0040
            L_0x003e:
                r11 = r22
            L_0x0040:
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x0046
                r12 = r2
                goto L_0x0048
            L_0x0046:
                r12 = r23
            L_0x0048:
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.environment.C35608o.C35610b.<init>(java.lang.String, com.urbanairship.android.layout.environment.i, java.lang.String, java.util.Map, java.util.Map, java.util.Set, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: m */
        public static /* synthetic */ C35610b m146940m(C35610b bVar, String str, C35599i iVar, String str2, Map map, Map map2, Set set, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            C35610b bVar2 = bVar;
            int i2 = i;
            return bVar.mo106699l((i2 & 1) != 0 ? bVar2.f88030a : str, (i2 & 2) != 0 ? bVar2.f88031b : iVar, (i2 & 4) != 0 ? bVar2.f88032c : str2, (i2 & 8) != 0 ? bVar2.f88033d : map, (i2 & 16) != 0 ? bVar2.f88034e : map2, (i2 & 32) != 0 ? bVar2.f88035f : set, (i2 & 64) != 0 ? bVar2.f88036g : z, (i2 & 128) != 0 ? bVar2.f88037h : z2, (i2 & 256) != 0 ? bVar2.f88038i : z3, (i2 & 512) != 0 ? bVar2.f88039j : z4);
        }

        /* renamed from: A */
        public final boolean mo106683A() {
            boolean z;
            if (!this.f88034e.isEmpty()) {
                Iterable values = this.f88034e.values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: B */
        public final boolean mo106684B() {
            return this.f88036g;
        }

        @C12579k
        /* renamed from: C */
        public final C35867c mo106685C() {
            return new C35867c(this.f88030a, this.f88031b.mo106649a(), this.f88032c, Boolean.valueOf(this.f88037h));
        }

        /* renamed from: a */
        public final Map<C35865a, JsonValue> mo106686a() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : this.f88033d.entrySet()) {
                C35865a a = ((FormData) next.getValue()).mo107381a();
                JsonValue b = ((FormData) next.getValue()).mo107382b();
                if (!(a == null || b == null)) {
                    linkedHashMap.put(a, b);
                }
            }
            return linkedHashMap;
        }

        @C12579k
        /* renamed from: b */
        public final String mo106687b() {
            return this.f88030a;
        }

        /* renamed from: c */
        public final boolean mo106688c() {
            return this.f88039j;
        }

        @C12579k
        /* renamed from: d */
        public final C35599i mo106689d() {
            return this.f88031b;
        }

        @C12580l
        /* renamed from: e */
        public final String mo106690e() {
            return this.f88032c;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35610b)) {
                return false;
            }
            C35610b bVar = (C35610b) obj;
            return Intrinsics.areEqual((Object) this.f88030a, (Object) bVar.f88030a) && Intrinsics.areEqual((Object) this.f88031b, (Object) bVar.f88031b) && Intrinsics.areEqual((Object) this.f88032c, (Object) bVar.f88032c) && Intrinsics.areEqual((Object) this.f88033d, (Object) bVar.f88033d) && Intrinsics.areEqual((Object) this.f88034e, (Object) bVar.f88034e) && Intrinsics.areEqual((Object) this.f88035f, (Object) bVar.f88035f) && this.f88036g == bVar.f88036g && this.f88037h == bVar.f88037h && this.f88038i == bVar.f88038i && this.f88039j == bVar.f88039j;
        }

        @C12579k
        /* renamed from: f */
        public final Map<String, FormData<?>> mo106692f() {
            return this.f88033d;
        }

        @C12579k
        /* renamed from: g */
        public final Map<String, Boolean> mo106693g() {
            return this.f88034e;
        }

        @C12579k
        /* renamed from: h */
        public final Set<String> mo106694h() {
            return this.f88035f;
        }

        public int hashCode() {
            int hashCode = ((this.f88030a.hashCode() * 31) + this.f88031b.hashCode()) * 31;
            String str = this.f88032c;
            int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f88033d.hashCode()) * 31) + this.f88034e.hashCode()) * 31) + this.f88035f.hashCode()) * 31;
            boolean z = this.f88036g;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f88037h;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f88038i;
            if (z4) {
                z4 = true;
            }
            int i3 = (i2 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.f88039j;
            if (!z5) {
                z2 = z5;
            }
            return i3 + (z2 ? 1 : 0);
        }

        /* renamed from: i */
        public final boolean mo106696i() {
            return this.f88036g;
        }

        /* renamed from: j */
        public final boolean mo106697j() {
            return this.f88037h;
        }

        /* renamed from: k */
        public final boolean mo106698k() {
            return this.f88038i;
        }

        @C12579k
        /* renamed from: l */
        public final C35610b mo106699l(@C12579k String str, @C12579k C35599i iVar, @C12580l String str2, @C12579k Map<String, ? extends FormData<?>> map, @C12579k Map<String, Boolean> map2, @C12579k Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(iVar, "formType");
            Map<String, ? extends FormData<?>> map3 = map;
            Intrinsics.checkNotNullParameter(map3, "data");
            Map<String, Boolean> map4 = map2;
            Intrinsics.checkNotNullParameter(map4, "inputValidity");
            Set<String> set2 = set;
            Intrinsics.checkNotNullParameter(set2, "displayedInputs");
            return new C35610b(str, iVar, str2, map3, map4, set2, z, z2, z3, z4);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
            if (r0 == null) goto L_0x0026;
         */
        @org.jetbrains.annotations.C12579k
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.urbanairship.android.layout.environment.C35608o.C35610b mo106700n(@org.jetbrains.annotations.C12579k java.lang.String r15, @org.jetbrains.annotations.C12580l java.lang.Boolean r16) {
            /*
                r14 = this;
                r13 = r14
                r0 = r15
                java.lang.String r1 = "identifier"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                if (r16 == 0) goto L_0x0026
                r16.booleanValue()
                boolean r6 = r16.booleanValue()
                if (r6 == 0) goto L_0x001e
                java.util.Set<java.lang.String> r6 = r13.f88035f
                java.util.Set r0 = kotlin.collections.C10933e1.m40912D(r6, r15)
                goto L_0x0024
            L_0x001e:
                java.util.Set<java.lang.String> r6 = r13.f88035f
                java.util.Set r0 = kotlin.collections.C10933e1.m40917y(r6, r15)
            L_0x0024:
                if (r0 != 0) goto L_0x0028
            L_0x0026:
                java.util.Set<java.lang.String> r0 = r13.f88035f
            L_0x0028:
                r6 = r0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 991(0x3df, float:1.389E-42)
                r12 = 0
                r0 = r14
                com.urbanairship.android.layout.environment.o$b r0 = m146940m(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.environment.C35608o.C35610b.mo106700n(java.lang.String, java.lang.Boolean):com.urbanairship.android.layout.environment.o$b");
        }

        @C12579k
        /* renamed from: o */
        public final C35610b mo106701o(@C12579k FormData<?> formData) {
            Intrinsics.checkNotNullParameter(formData, "value");
            return m146940m(this, (String) null, (C35599i) null, (String) null, C10977s0.m41474o0(this.f88033d, C11078d1.m42659a(formData.mo107384d(), formData)), C10977s0.m41474o0(this.f88034e, C11078d1.m42659a(formData.mo107384d(), Boolean.valueOf(formData.mo107387g()))), (Set) null, false, false, false, false, 999, (Object) null);
        }

        /* renamed from: p */
        public final FormData.C35856a mo106702p() {
            C35599i iVar = this.f88031b;
            if (iVar instanceof C35599i.C35600a) {
                return new FormData.C35859d(this.f88030a, this.f88032c, CollectionsKt___CollectionsKt.m40582V5(this.f88033d.values()));
            }
            if (iVar instanceof C35599i.C35601b) {
                return new FormData.C35860e(this.f88030a, ((C35599i.C35601b) this.f88031b).mo106653e(), this.f88032c, CollectionsKt___CollectionsKt.m40582V5(this.f88033d.values()));
            }
            throw new NoWhenBranchMatchedException();
        }

        @C12579k
        /* renamed from: q */
        public final ReportingEvent.C35620f mo106703q() {
            return new ReportingEvent.C35620f(mo106702p(), mo106685C(), mo106686a());
        }

        @C12579k
        /* renamed from: r */
        public final Map<String, FormData<?>> mo106704r() {
            return this.f88033d;
        }

        @C12579k
        /* renamed from: s */
        public final Set<String> mo106705s() {
            return this.f88035f;
        }

        @C12580l
        /* renamed from: t */
        public final String mo106706t() {
            return this.f88032c;
        }

        @C12579k
        public String toString() {
            return "Form(identifier=" + this.f88030a + ", formType=" + this.f88031b + ", formResponseType=" + this.f88032c + ", data=" + this.f88033d + ", inputValidity=" + this.f88034e + ", displayedInputs=" + this.f88035f + ", isVisible=" + this.f88036g + ", isSubmitted=" + this.f88037h + ", isEnabled=" + this.f88038i + ", isDisplayReported=" + this.f88039j + ')';
        }

        @C12579k
        /* renamed from: u */
        public final C35599i mo106708u() {
            return this.f88031b;
        }

        @C12579k
        /* renamed from: v */
        public final String mo106709v() {
            return this.f88030a;
        }

        @C12579k
        /* renamed from: w */
        public final Map<String, Boolean> mo106710w() {
            return this.f88034e;
        }

        /* renamed from: x */
        public final boolean mo106711x() {
            return this.f88039j;
        }

        /* renamed from: y */
        public final boolean mo106712y() {
            return this.f88038i;
        }

        /* renamed from: z */
        public final boolean mo106713z() {
            return this.f88037h;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35610b(@C12579k String str, @C12579k C35599i iVar, @C12580l String str2, @C12579k Map<String, ? extends FormData<?>> map, @C12579k Map<String, Boolean> map2, @C12579k Set<String> set, boolean z, boolean z2, boolean z3, boolean z4) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "identifier");
            Intrinsics.checkNotNullParameter(iVar, "formType");
            Intrinsics.checkNotNullParameter(map, "data");
            Intrinsics.checkNotNullParameter(map2, "inputValidity");
            Intrinsics.checkNotNullParameter(set, "displayedInputs");
            this.f88030a = str;
            this.f88031b = iVar;
            this.f88032c = str2;
            this.f88033d = map;
            this.f88034e = map2;
            this.f88035f = set;
            this.f88036g = z;
            this.f88037h = z2;
            this.f88038i = z3;
            this.f88039j = z4;
        }
    }
}
