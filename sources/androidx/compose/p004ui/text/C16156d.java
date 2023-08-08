package androidx.compose.p004ui.text;

import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.internal.C8567o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,1126:1\n1045#2:1127\n33#3,6:1128\n33#3,4:1138\n38#3:1144\n101#3,2:1146\n33#3,6:1148\n103#3:1154\n33#3,4:1158\n38#3:1164\n33#3,4:1169\n38#3:1175\n33#3,4:1180\n38#3:1186\n1#4:1134\n35#5,3:1135\n38#5,2:1142\n40#5:1145\n35#5,3:1155\n38#5,2:1162\n40#5:1165\n35#5,3:1166\n38#5,2:1173\n40#5:1176\n35#5,3:1177\n38#5,2:1184\n40#5:1187\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n86#1:1127\n86#1:1128,6\n159#1:1138,4\n159#1:1144\n167#1:1146,2\n167#1:1148,6\n167#1:1154\n182#1:1158,4\n182#1:1164\n197#1:1169,4\n197#1:1175\n213#1:1180,4\n213#1:1186\n159#1:1135,3\n159#1:1142,2\n159#1:1145\n182#1:1155,3\n182#1:1162,2\n182#1:1165\n197#1:1166,3\n197#1:1173,2\n197#1:1176\n213#1:1177,3\n213#1:1184,2\n213#1:1187\n*E\n"})
/* renamed from: androidx.compose.ui.text.d */
public final class C16156d implements CharSequence {

    /* renamed from: e */
    public static final int f40172e = 0;
    @C12579k

    /* renamed from: a */
    public final String f40173a;
    @C12580l

    /* renamed from: b */
    public final List<C16159b<C16151c0>> f40174b;
    @C12580l

    /* renamed from: c */
    public final List<C16159b<C16451t>> f40175c;
    @C12580l

    /* renamed from: d */
    public final List<C16159b<? extends Object>> f40176d;

    @C8567o(parameters = 0)
    @C11363r0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,6:1133\n33#2,6:1139\n33#2,6:1145\n33#2,6:1151\n33#2,6:1157\n151#2,3:1164\n33#2,4:1167\n154#2,2:1171\n38#2:1173\n156#2:1174\n151#2,3:1175\n33#2,4:1178\n154#2,2:1182\n38#2:1184\n156#2:1185\n151#2,3:1186\n33#2,4:1189\n154#2,2:1193\n38#2:1195\n156#2:1196\n1#3:1163\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n396#1:1127,6\n399#1:1133,6\n403#1:1139,6\n423#1:1145,6\n426#1:1151,6\n430#1:1157,6\n640#1:1164,3\n640#1:1167,4\n640#1:1171,2\n640#1:1173\n640#1:1174\n643#1:1175,3\n643#1:1178,4\n643#1:1182,2\n643#1:1184\n643#1:1185\n646#1:1186,3\n646#1:1189,4\n646#1:1193,2\n646#1:1195\n646#1:1196\n*E\n"})
    /* renamed from: androidx.compose.ui.text.d$a */
    public static final class C16157a implements Appendable {

        /* renamed from: f */
        public static final int f40177f = 8;
        @C12579k

        /* renamed from: a */
        public final StringBuilder f40178a;
        @C12579k

        /* renamed from: b */
        public final List<C16158a<C16151c0>> f40179b;
        @C12579k

        /* renamed from: c */
        public final List<C16158a<C16451t>> f40180c;
        @C12579k

        /* renamed from: d */
        public final List<C16158a<? extends Object>> f40181d;
        @C12579k

        /* renamed from: e */
        public final List<C16158a<? extends Object>> f40182e;

        public C16157a() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final void mo46693a(@C12579k String str, @C12579k String str2, int i, int i2) {
            Intrinsics.checkNotNullParameter(str, "tag");
            Intrinsics.checkNotNullParameter(str2, "annotation");
            this.f40181d.add(new C16158a(str2, i, i2, str));
        }

        /* renamed from: b */
        public final void mo46697b(@C12579k C16451t tVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(tVar, "style");
            this.f40180c.add(new C16158a(tVar, i, i2, (String) null, 8, (DefaultConstructorMarker) null));
        }

        /* renamed from: c */
        public final void mo46698c(@C12579k C16151c0 c0Var, int i, int i2) {
            Intrinsics.checkNotNullParameter(c0Var, "style");
            this.f40179b.add(new C16158a(c0Var, i, i2, (String) null, 8, (DefaultConstructorMarker) null));
        }

        @C16259h
        /* renamed from: d */
        public final void mo46699d(@C12579k C16405r0 r0Var, int i, int i2) {
            Intrinsics.checkNotNullParameter(r0Var, "ttsAnnotation");
            this.f40181d.add(new C16158a(r0Var, i, i2, (String) null, 8, (DefaultConstructorMarker) null));
        }

        @C16259h
        /* renamed from: e */
        public final void mo46700e(@C12579k C16407s0 s0Var, int i, int i2) {
            Intrinsics.checkNotNullParameter(s0Var, "urlAnnotation");
            this.f40181d.add(new C16158a(s0Var, i, i2, (String) null, 8, (DefaultConstructorMarker) null));
        }

        @C12579k
        /* renamed from: f */
        public C16157a mo46704i(char c) {
            this.f40178a.append(c);
            return this;
        }

        @C12579k
        /* renamed from: g */
        public C16157a append(@C12580l CharSequence charSequence) {
            if (charSequence instanceof C16156d) {
                mo46705j((C16156d) charSequence);
            } else {
                this.f40178a.append(charSequence);
            }
            return this;
        }

        @C12579k
        /* renamed from: h */
        public C16157a append(@C12580l CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof C16156d) {
                mo46706k((C16156d) charSequence, i, i2);
            } else {
                this.f40178a.append(charSequence, i, i2);
            }
            return this;
        }

        /* renamed from: j */
        public final void mo46705j(@C12579k C16156d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "text");
            int length = this.f40178a.length();
            this.f40178a.append(dVar.mo46683j());
            List<C16159b<C16151c0>> g = dVar.mo46679g();
            if (g != null) {
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    C16159b bVar = g.get(i);
                    mo46698c((C16151c0) bVar.mo46738h(), bVar.mo46740i() + length, bVar.mo46737g() + length);
                }
            }
            List<C16159b<C16451t>> e = dVar.mo46676e();
            if (e != null) {
                int size2 = e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C16159b bVar2 = e.get(i2);
                    mo46697b((C16451t) bVar2.mo46738h(), bVar2.mo46740i() + length, bVar2.mo46737g() + length);
                }
            }
            List<C16159b<? extends Object>> b = dVar.mo46672b();
            if (b != null) {
                int size3 = b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C16159b bVar3 = b.get(i3);
                    this.f40181d.add(new C16158a(bVar3.mo46738h(), bVar3.mo46740i() + length, bVar3.mo46737g() + length, bVar3.mo46741j()));
                }
            }
        }

        /* renamed from: k */
        public final void mo46706k(@C12579k C16156d dVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(dVar, "text");
            int length = this.f40178a.length();
            this.f40178a.append(dVar.mo46683j(), i, i2);
            List g = AnnotatedStringKt.m72260s(dVar, i, i2);
            if (g != null) {
                int size = g.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C16159b bVar = (C16159b) g.get(i3);
                    mo46698c((C16151c0) bVar.mo46738h(), bVar.mo46740i() + length, bVar.mo46737g() + length);
                }
            }
            List f = AnnotatedStringKt.m72259r(dVar, i, i2);
            if (f != null) {
                int size2 = f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C16159b bVar2 = (C16159b) f.get(i4);
                    mo46697b((C16451t) bVar2.mo46738h(), bVar2.mo46740i() + length, bVar2.mo46737g() + length);
                }
            }
            List e = AnnotatedStringKt.m72258q(dVar, i, i2);
            if (e != null) {
                int size3 = e.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    C16159b bVar3 = (C16159b) e.get(i5);
                    this.f40181d.add(new C16158a(bVar3.mo46738h(), bVar3.mo46740i() + length, bVar3.mo46737g() + length, bVar3.mo46741j()));
                }
            }
        }

        /* renamed from: l */
        public final void mo46707l(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "text");
            this.f40178a.append(str);
        }

        /* renamed from: m */
        public final int mo46708m() {
            return this.f40178a.length();
        }

        /* renamed from: n */
        public final void mo46709n() {
            if (!this.f40182e.isEmpty()) {
                List<C16158a<? extends Object>> list = this.f40182e;
                list.remove(list.size() - 1).mo46728k(this.f40178a.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        /* renamed from: o */
        public final void mo46710o(int i) {
            boolean z;
            if (i < this.f40182e.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (this.f40182e.size() - 1 >= i) {
                    mo46709n();
                }
                return;
            }
            throw new IllegalStateException((i + " should be less than " + this.f40182e.size()).toString());
        }

        /* renamed from: p */
        public final int mo46711p(@C12579k String str, @C12579k String str2) {
            Intrinsics.checkNotNullParameter(str, "tag");
            Intrinsics.checkNotNullParameter(str2, "annotation");
            C16158a aVar = new C16158a(str2, this.f40178a.length(), 0, str, 4, (DefaultConstructorMarker) null);
            this.f40182e.add(aVar);
            this.f40181d.add(aVar);
            return this.f40182e.size() - 1;
        }

        /* renamed from: q */
        public final int mo46712q(@C12579k C16451t tVar) {
            Intrinsics.checkNotNullParameter(tVar, "style");
            C16158a aVar = new C16158a(tVar, this.f40178a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f40182e.add(aVar);
            this.f40180c.add(aVar);
            return this.f40182e.size() - 1;
        }

        /* renamed from: r */
        public final int mo46713r(@C12579k C16151c0 c0Var) {
            Intrinsics.checkNotNullParameter(c0Var, "style");
            C16158a aVar = new C16158a(c0Var, this.f40178a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f40182e.add(aVar);
            this.f40179b.add(aVar);
            return this.f40182e.size() - 1;
        }

        /* renamed from: s */
        public final int mo46714s(@C12579k C16405r0 r0Var) {
            Intrinsics.checkNotNullParameter(r0Var, "ttsAnnotation");
            C16158a aVar = new C16158a(r0Var, this.f40178a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f40182e.add(aVar);
            this.f40181d.add(aVar);
            return this.f40182e.size() - 1;
        }

        @C16259h
        /* renamed from: t */
        public final int mo46715t(@C12579k C16407s0 s0Var) {
            Intrinsics.checkNotNullParameter(s0Var, "urlAnnotation");
            C16158a aVar = new C16158a(s0Var, this.f40178a.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.f40182e.add(aVar);
            this.f40181d.add(aVar);
            return this.f40182e.size() - 1;
        }

        @C12579k
        /* renamed from: u */
        public final C16156d mo46716u() {
            String sb = this.f40178a.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "text.toString()");
            List<C16158a<C16151c0>> list = this.f40179b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).mo46729l(this.f40178a.length()));
            }
            ArrayList arrayList2 = null;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<C16158a<C16451t>> list2 = this.f40180c;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList3.add(list2.get(i2).mo46729l(this.f40178a.length()));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            List<C16158a<? extends Object>> list3 = this.f40181d;
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList4.add(list3.get(i3).mo46729l(this.f40178a.length()));
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
            return new C16156d(sb, arrayList, arrayList3, arrayList2);
        }

        public C16157a(int i) {
            this.f40178a = new StringBuilder(i);
            this.f40179b = new ArrayList();
            this.f40180c = new ArrayList();
            this.f40181d = new ArrayList();
            this.f40182e = new ArrayList();
        }

        @C11363r0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
        /* renamed from: androidx.compose.ui.text.d$a$a */
        public static final class C16158a<T> {

            /* renamed from: a */
            public final T f40183a;

            /* renamed from: b */
            public final int f40184b;

            /* renamed from: c */
            public int f40185c;
            @C12579k

            /* renamed from: d */
            public final String f40186d;

            public C16158a(T t, int i, int i2, @C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "tag");
                this.f40183a = t;
                this.f40184b = i;
                this.f40185c = i2;
                this.f40186d = str;
            }

            /* renamed from: f */
            public static /* synthetic */ C16158a m72764f(C16158a aVar, T t, int i, int i2, String str, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    t = aVar.f40183a;
                }
                if ((i3 & 2) != 0) {
                    i = aVar.f40184b;
                }
                if ((i3 & 4) != 0) {
                    i2 = aVar.f40185c;
                }
                if ((i3 & 8) != 0) {
                    str = aVar.f40186d;
                }
                return aVar.mo46721e(t, i, i2, str);
            }

            /* renamed from: m */
            public static /* synthetic */ C16159b m72765m(C16158a aVar, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return aVar.mo46729l(i);
            }

            /* renamed from: a */
            public final T mo46717a() {
                return this.f40183a;
            }

            /* renamed from: b */
            public final int mo46718b() {
                return this.f40184b;
            }

            /* renamed from: c */
            public final int mo46719c() {
                return this.f40185c;
            }

            @C12579k
            /* renamed from: d */
            public final String mo46720d() {
                return this.f40186d;
            }

            @C12579k
            /* renamed from: e */
            public final C16158a<T> mo46721e(T t, int i, int i2, @C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "tag");
                return new C16158a<>(t, i, i2, str);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C16158a)) {
                    return false;
                }
                C16158a aVar = (C16158a) obj;
                return Intrinsics.areEqual((Object) this.f40183a, (Object) aVar.f40183a) && this.f40184b == aVar.f40184b && this.f40185c == aVar.f40185c && Intrinsics.areEqual((Object) this.f40186d, (Object) aVar.f40186d);
            }

            /* renamed from: g */
            public final int mo46723g() {
                return this.f40185c;
            }

            /* renamed from: h */
            public final T mo46724h() {
                return this.f40183a;
            }

            public int hashCode() {
                T t = this.f40183a;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.f40184b)) * 31) + Integer.hashCode(this.f40185c)) * 31) + this.f40186d.hashCode();
            }

            /* renamed from: i */
            public final int mo46726i() {
                return this.f40184b;
            }

            @C12579k
            /* renamed from: j */
            public final String mo46727j() {
                return this.f40186d;
            }

            /* renamed from: k */
            public final void mo46728k(int i) {
                this.f40185c = i;
            }

            @C12579k
            /* renamed from: l */
            public final C16159b<T> mo46729l(int i) {
                boolean z;
                int i2 = this.f40185c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return new C16159b<>(this.f40183a, this.f40184b, i, this.f40186d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            @C12579k
            public String toString() {
                return "MutableRange(item=" + this.f40183a + ", start=" + this.f40184b + ", end=" + this.f40185c + ", tag=" + this.f40186d + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C16158a(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C16157a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C16157a(@C12579k String str) {
            this(0, 1, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "text");
            mo46707l(str);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C16157a(@C12579k C16156d dVar) {
            this(0, 1, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(dVar, "text");
            mo46705j(dVar);
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,328:1\n86#2:329\n*E\n"})
    /* renamed from: androidx.compose.ui.text.d$c */
    public static final class C16160c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l(Integer.valueOf(((C16159b) t).mo46740i()), Integer.valueOf(((C16159b) t2).mo46740i()));
        }
    }

    public C16156d(@C12579k String str, @C12580l List<C16159b<C16151c0>> list, @C12580l List<C16159b<C16451t>> list2, @C12580l List<? extends C16159b<? extends Object>> list3) {
        List p5;
        Intrinsics.checkNotNullParameter(str, "text");
        this.f40173a = str;
        this.f40174b = list;
        this.f40175c = list2;
        this.f40176d = list3;
        if (list2 != null && (p5 = CollectionsKt___CollectionsKt.m40675p5(list2, new C16160c())) != null) {
            int size = p5.size();
            int i = -1;
            int i2 = 0;
            while (i2 < size) {
                C16159b bVar = (C16159b) p5.get(i2);
                boolean z = true;
                if (bVar.mo46740i() >= i) {
                    if (bVar.mo46737g() > this.f40173a.length() ? false : z) {
                        i = bVar.mo46737g();
                        i2++;
                    } else {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.mo46740i() + ", " + bVar.mo46737g() + ") is out of boundary").toString());
                    }
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
            }
        }
    }

    /* renamed from: a */
    public char mo46671a(int i) {
        return this.f40173a.charAt(i);
    }

    @C12580l
    /* renamed from: b */
    public final List<C16159b<? extends Object>> mo46672b() {
        return this.f40176d;
    }

    /* renamed from: c */
    public int mo46673c() {
        return this.f40173a.length();
    }

    public final /* bridge */ char charAt(int i) {
        return mo46671a(i);
    }

    @C12579k
    /* renamed from: d */
    public final List<C16159b<C16451t>> mo46675d() {
        List<C16159b<C16451t>> list = this.f40175c;
        return list == null ? CollectionsKt__CollectionsKt.m40441E() : list;
    }

    @C12580l
    /* renamed from: e */
    public final List<C16159b<C16451t>> mo46676e() {
        return this.f40175c;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16156d)) {
            return false;
        }
        C16156d dVar = (C16156d) obj;
        if (Intrinsics.areEqual((Object) this.f40173a, (Object) dVar.f40173a) && Intrinsics.areEqual((Object) this.f40174b, (Object) dVar.f40174b) && Intrinsics.areEqual((Object) this.f40175c, (Object) dVar.f40175c) && Intrinsics.areEqual((Object) this.f40176d, (Object) dVar.f40176d)) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: f */
    public final List<C16159b<C16151c0>> mo46678f() {
        List<C16159b<C16151c0>> list = this.f40174b;
        return list == null ? CollectionsKt__CollectionsKt.m40441E() : list;
    }

    @C12580l
    /* renamed from: g */
    public final List<C16159b<C16151c0>> mo46679g() {
        return this.f40174b;
    }

    @C12579k
    /* renamed from: h */
    public final List<C16159b<String>> mo46680h(int i, int i2) {
        List<C16159b<String>> list;
        boolean z;
        List<C16159b<? extends Object>> list2 = this.f40176d;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C16159b<? extends Object> bVar = list2.get(i3);
                C16159b bVar2 = bVar;
                if (!(bVar2.mo46738h() instanceof String) || !AnnotatedStringKt.m72261t(i, i2, bVar2.mo46740i(), bVar2.mo46737g())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list.add(bVar);
                }
            }
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f40173a.hashCode() * 31;
        List<C16159b<C16151c0>> list = this.f40174b;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List<C16159b<C16451t>> list2 = this.f40175c;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List<C16159b<? extends Object>> list3 = this.f40176d;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    @C12579k
    /* renamed from: i */
    public final List<C16159b<String>> mo46682i(@C12579k String str, int i, int i2) {
        List<C16159b<String>> list;
        boolean z;
        Intrinsics.checkNotNullParameter(str, "tag");
        List<C16159b<? extends Object>> list2 = this.f40176d;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C16159b<? extends Object> bVar = list2.get(i3);
                C16159b bVar2 = bVar;
                if (!(bVar2.mo46738h() instanceof String) || !Intrinsics.areEqual((Object) str, (Object) bVar2.mo46741j()) || !AnnotatedStringKt.m72261t(i, i2, bVar2.mo46740i(), bVar2.mo46737g())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list.add(bVar);
                }
            }
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    @C12579k
    /* renamed from: j */
    public final String mo46683j() {
        return this.f40173a;
    }

    @C12579k
    /* renamed from: k */
    public final List<C16159b<C16405r0>> mo46684k(int i, int i2) {
        List<C16159b<C16405r0>> list;
        boolean z;
        List<C16159b<? extends Object>> list2 = this.f40176d;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C16159b<? extends Object> bVar = list2.get(i3);
                C16159b bVar2 = bVar;
                if (!(bVar2.mo46738h() instanceof C16405r0) || !AnnotatedStringKt.m72261t(i, i2, bVar2.mo46740i(), bVar2.mo46737g())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list.add(bVar);
                }
            }
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return list;
    }

    @C16259h
    @C12579k
    /* renamed from: l */
    public final List<C16159b<C16407s0>> mo46685l(int i, int i2) {
        List<C16159b<C16407s0>> list;
        boolean z;
        List<C16159b<? extends Object>> list2 = this.f40176d;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C16159b<? extends Object> bVar = list2.get(i3);
                C16159b bVar2 = bVar;
                if (!(bVar2.mo46738h() instanceof C16407s0) || !AnnotatedStringKt.m72261t(i, i2, bVar2.mo46740i(), bVar2.mo46737g())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list.add(bVar);
                }
            }
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return list;
    }

    public final /* bridge */ int length() {
        return mo46673c();
    }

    /* renamed from: m */
    public final boolean mo46687m(@C12579k String str, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "tag");
        List<C16159b<? extends Object>> list = this.f40176d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C16159b bVar = list.get(i3);
            if (!(bVar.mo46738h() instanceof String) || !Intrinsics.areEqual((Object) str, (Object) bVar.mo46741j()) || !AnnotatedStringKt.m72261t(i, i2, bVar.mo46740i(), bVar.mo46737g())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @C8547h2
    @C12579k
    /* renamed from: n */
    public final C16156d mo46688n(@C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "other");
        C16157a aVar = new C16157a(this);
        aVar.mo46705j(dVar);
        return aVar.mo46716u();
    }

    @C12579k
    /* renamed from: o */
    public C16156d subSequence(int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        } else if (i == 0 && i2 == this.f40173a.length()) {
            return this;
        } else {
            String substring = this.f40173a.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C16156d(substring, AnnotatedStringKt.m72257p(this.f40174b, i, i2), AnnotatedStringKt.m72257p(this.f40175c, i, i2), AnnotatedStringKt.m72257p(this.f40176d, i, i2));
        }
    }

    @C12579k
    /* renamed from: p */
    public final C16156d mo46690p(long j) {
        return subSequence(C16356n0.m73740l(j), C16356n0.m73739k(j));
    }

    @C12579k
    public String toString() {
        return this.f40173a;
    }

    @C8585m0
    @C11363r0({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
    /* renamed from: androidx.compose.ui.text.d$b */
    public static final class C16159b<T> {

        /* renamed from: e */
        public static final int f40187e = 0;

        /* renamed from: a */
        public final T f40188a;

        /* renamed from: b */
        public final int f40189b;

        /* renamed from: c */
        public final int f40190c;
        @C12579k

        /* renamed from: d */
        public final String f40191d;

        public C16159b(T t, int i, int i2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "tag");
            this.f40188a = t;
            this.f40189b = i;
            this.f40190c = i2;
            this.f40191d = str;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* renamed from: f */
        public static /* synthetic */ C16159b m72777f(C16159b bVar, T t, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                t = bVar.f40188a;
            }
            if ((i3 & 2) != 0) {
                i = bVar.f40189b;
            }
            if ((i3 & 4) != 0) {
                i2 = bVar.f40190c;
            }
            if ((i3 & 8) != 0) {
                str = bVar.f40191d;
            }
            return bVar.mo46735e(t, i, i2, str);
        }

        /* renamed from: a */
        public final T mo46731a() {
            return this.f40188a;
        }

        /* renamed from: b */
        public final int mo46732b() {
            return this.f40189b;
        }

        /* renamed from: c */
        public final int mo46733c() {
            return this.f40190c;
        }

        @C12579k
        /* renamed from: d */
        public final String mo46734d() {
            return this.f40191d;
        }

        @C12579k
        /* renamed from: e */
        public final C16159b<T> mo46735e(T t, int i, int i2, @C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "tag");
            return new C16159b<>(t, i, i2, str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16159b)) {
                return false;
            }
            C16159b bVar = (C16159b) obj;
            return Intrinsics.areEqual((Object) this.f40188a, (Object) bVar.f40188a) && this.f40189b == bVar.f40189b && this.f40190c == bVar.f40190c && Intrinsics.areEqual((Object) this.f40191d, (Object) bVar.f40191d);
        }

        /* renamed from: g */
        public final int mo46737g() {
            return this.f40190c;
        }

        /* renamed from: h */
        public final T mo46738h() {
            return this.f40188a;
        }

        public int hashCode() {
            T t = this.f40188a;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.f40189b)) * 31) + Integer.hashCode(this.f40190c)) * 31) + this.f40191d.hashCode();
        }

        /* renamed from: i */
        public final int mo46740i() {
            return this.f40189b;
        }

        @C12579k
        /* renamed from: j */
        public final String mo46741j() {
            return this.f40191d;
        }

        @C12579k
        public String toString() {
            return "Range(item=" + this.f40188a + ", start=" + this.f40189b + ", end=" + this.f40190c + ", tag=" + this.f40191d + ')';
        }

        public C16159b(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16156d(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16156d(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16156d(@org.jetbrains.annotations.C12579k java.lang.String r3, @org.jetbrains.annotations.C12579k java.util.List<androidx.compose.p004ui.text.C16156d.C16159b<androidx.compose.p004ui.text.C16151c0>> r4, @org.jetbrains.annotations.C12579k java.util.List<androidx.compose.p004ui.text.C16156d.C16159b<androidx.compose.p004ui.text.C16451t>> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "spanStyles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "paragraphStyles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0019
            r4 = r1
        L_0x0019:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0024
            r5 = r1
        L_0x0024:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.C16156d.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
