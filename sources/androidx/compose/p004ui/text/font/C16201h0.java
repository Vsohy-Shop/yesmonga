package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11366s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.text.font.h0 */
public final class C16201h0 {
    @C12579k

    /* renamed from: a */
    public static final C16201h0 f40264a = new C16201h0();

    /* renamed from: b */
    public static final int f40265b = 0;

    @C8585m0
    /* renamed from: androidx.compose.ui.text.font.h0$a */
    public interface C16202a {
        /* renamed from: a */
        boolean mo46911a();

        /* renamed from: b */
        float mo46912b(@C12580l C16479d dVar);

        @C12579k
        /* renamed from: c */
        String mo46913c();
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.text.font.h0$b */
    public static final class C16203b implements C16202a {
        @C12579k

        /* renamed from: a */
        public final String f40266a;

        /* renamed from: b */
        public final float f40267b;

        /* renamed from: c */
        public final boolean f40268c;

        public C16203b(@C12579k String str, float f) {
            Intrinsics.checkNotNullParameter(str, "axisName");
            this.f40266a = str;
            this.f40267b = f;
        }

        /* renamed from: a */
        public boolean mo46911a() {
            return this.f40268c;
        }

        /* renamed from: b */
        public float mo46912b(@C12580l C16479d dVar) {
            return this.f40267b;
        }

        @C12579k
        /* renamed from: c */
        public String mo46913c() {
            return this.f40266a;
        }

        /* renamed from: d */
        public final float mo46914d() {
            return this.f40267b;
        }

        public boolean equals(@C12580l Object obj) {
            boolean z;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16203b)) {
                return false;
            }
            C16203b bVar = (C16203b) obj;
            if (!Intrinsics.areEqual((Object) mo46913c(), (Object) bVar.mo46913c())) {
                return false;
            }
            if (this.f40267b == bVar.f40267b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (mo46913c().hashCode() * 31) + Float.hashCode(this.f40267b);
        }

        @C12579k
        public String toString() {
            return "FontVariation.Setting(axisName='" + mo46913c() + "', value=" + this.f40267b + ')';
        }
    }

    @C8585m0
    /* renamed from: androidx.compose.ui.text.font.h0$c */
    public static final class C16204c implements C16202a {
        @C12579k

        /* renamed from: a */
        public final String f40269a;

        /* renamed from: b */
        public final int f40270b;

        /* renamed from: c */
        public final boolean f40271c;

        public C16204c(@C12579k String str, int i) {
            Intrinsics.checkNotNullParameter(str, "axisName");
            this.f40269a = str;
            this.f40270b = i;
        }

        /* renamed from: a */
        public boolean mo46911a() {
            return this.f40271c;
        }

        /* renamed from: b */
        public float mo46912b(@C12580l C16479d dVar) {
            return (float) this.f40270b;
        }

        @C12579k
        /* renamed from: c */
        public String mo46913c() {
            return this.f40269a;
        }

        /* renamed from: d */
        public final int mo46918d() {
            return this.f40270b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16204c)) {
                return false;
            }
            C16204c cVar = (C16204c) obj;
            if (Intrinsics.areEqual((Object) mo46913c(), (Object) cVar.mo46913c()) && this.f40270b == cVar.f40270b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (mo46913c().hashCode() * 31) + this.f40270b;
        }

        @C12579k
        public String toString() {
            return "FontVariation.Setting(axisName='" + mo46913c() + "', value=" + this.f40270b + ')';
        }
    }

    @C8585m0
    @C11363r0({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
    /* renamed from: androidx.compose.ui.text.font.h0$d */
    public static final class C16205d implements C16202a {
        @C12579k

        /* renamed from: a */
        public final String f40272a;

        /* renamed from: b */
        public final long f40273b;

        /* renamed from: c */
        public final boolean f40274c;

        public /* synthetic */ C16205d(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }

        /* renamed from: a */
        public boolean mo46911a() {
            return this.f40274c;
        }

        /* renamed from: b */
        public float mo46912b(@C12580l C16479d dVar) {
            if (dVar != null) {
                return C16504t.m74687n(this.f40273b) * dVar.mo7419R4();
            }
            throw new IllegalArgumentException("density must not be null".toString());
        }

        @C12579k
        /* renamed from: c */
        public String mo46913c() {
            return this.f40272a;
        }

        /* renamed from: d */
        public final long mo46922d() {
            return this.f40273b;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16205d)) {
                return false;
            }
            C16205d dVar = (C16205d) obj;
            if (Intrinsics.areEqual((Object) mo46913c(), (Object) dVar.mo46913c()) && C16504t.m74683j(this.f40273b, dVar.f40273b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (mo46913c().hashCode() * 31) + C16504t.m74688o(this.f40273b);
        }

        @C12579k
        public String toString() {
            return "FontVariation.Setting(axisName='" + mo46913c() + "', value=" + C16504t.m74694u(this.f40273b) + ')';
        }

        public C16205d(String str, long j) {
            this.f40272a = str;
            this.f40273b = j;
            this.f40274c = true;
        }
    }

    @C8585m0
    @C11363r0({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n10783#2:373\n11008#2,3:374\n11011#2,3:384\n361#3,7:377\n76#4:387\n96#4,5:388\n101#5,2:393\n33#5,6:395\n103#5:401\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:373\n52#1:374,3\n52#1:384,3\n52#1:377,7\n53#1:387\n53#1:388,5\n60#1:393,2\n60#1:395,6\n60#1:401\n*E\n"})
    /* renamed from: androidx.compose.ui.text.font.h0$e */
    public static final class C16206e {

        /* renamed from: c */
        public static final int f40275c = 0;
        @C12579k

        /* renamed from: a */
        public final List<C16202a> f40276a;

        /* renamed from: b */
        public final boolean f40277b;

        public C16206e(@C12579k C16202a... aVarArr) {
            Intrinsics.checkNotNullParameter(aVarArr, "settings");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z = false;
            for (C16202a aVar : aVarArr) {
                String c = aVar.mo46913c();
                Object obj = linkedHashMap.get(c);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(c, obj);
                }
                ((List) obj).add(aVar);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (true) {
                boolean z2 = true;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.size() != 1 ? false : z2) {
                        C10994x.m42360n0(arrayList, list);
                    } else {
                        throw new IllegalArgumentException(('\'' + str + "' must be unique. Actual [ [" + CollectionsKt___CollectionsKt.m40639h3(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 63, (Object) null) + C12361b.f30261l).toString());
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    this.f40276a = arrayList2;
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (((C16202a) arrayList2.get(i)).mo46911a()) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    this.f40277b = z;
                    return;
                }
            }
        }

        /* renamed from: a */
        public final boolean mo46926a() {
            return this.f40277b;
        }

        @C12579k
        /* renamed from: b */
        public final List<C16202a> mo46927b() {
            return this.f40276a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C16206e) && Intrinsics.areEqual((Object) this.f40276a, (Object) ((C16206e) obj).f40276a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f40276a.hashCode();
        }
    }

    @C12579k
    /* renamed from: a */
    public final C16202a mo46903a(@C12579k String str, float f) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "name");
        if (str.length() == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C16203b(str, f);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + str + '\'').toString());
    }

    @C12579k
    /* renamed from: b */
    public final C16206e mo46904b(@C12579k C16209i0 i0Var, int i, @C12579k C16202a... aVarArr) {
        Intrinsics.checkNotNullParameter(i0Var, "weight");
        Intrinsics.checkNotNullParameter(aVarArr, "settings");
        C11366s0 s0Var = new C11366s0(3);
        s0Var.mo22855a(mo46909g(i0Var.mo46939t0()));
        s0Var.mo22855a(mo46906d((float) i));
        s0Var.mo22856b(aVarArr);
        return new C16206e((C16202a[]) s0Var.mo22858d(new C16202a[s0Var.mo22857c()]));
    }

    @C12579k
    /* renamed from: c */
    public final C16202a mo46905c(int i) {
        boolean z = false;
        if (-1000 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return new C16204c("GRAD", i);
        }
        throw new IllegalArgumentException("'GRAD' must be in -1000..1000".toString());
    }

    @C12579k
    /* renamed from: d */
    public final C16202a mo46906d(float f) {
        boolean z = false;
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        }
        if (z) {
            return new C16203b("ital", f);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f).toString());
    }

    @C12579k
    /* renamed from: e */
    public final C16202a mo46907e(long j) {
        if (C16504t.m74690q(j)) {
            return new C16205d("opsz", j, (DefaultConstructorMarker) null);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units".toString());
    }

    @C12579k
    /* renamed from: f */
    public final C16202a mo46908f(float f) {
        boolean z = false;
        if (-90.0f <= f && f <= 90.0f) {
            z = true;
        }
        if (z) {
            return new C16203b("slnt", f);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + f).toString());
    }

    @C12579k
    /* renamed from: g */
    public final C16202a mo46909g(int i) {
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return new C16204c("wght", i);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + i).toString());
    }

    @C12579k
    /* renamed from: h */
    public final C16202a mo46910h(float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C16203b("wdth", f);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + f).toString());
    }
}
