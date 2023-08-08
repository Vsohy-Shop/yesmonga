package com.carrefour.fid.android.shared.paging;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.paging.C36328a;
import com.carrefour.fid.android.core.paging.C36334b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12154u0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\ncom/carrefour/fid/android/shared/paging/Pager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n350#2,7:261\n959#2,7:269\n1549#2:276\n1620#2,3:277\n1549#2:280\n1620#2,3:281\n1789#2,3:284\n766#2:287\n857#2,2:288\n1#3:268\n*S KotlinDebug\n*F\n+ 1 Pager.kt\ncom/carrefour/fid/android/shared/paging/Pager\n*L\n76#1:261,7\n204#1:269,7\n205#1:276\n205#1:277,3\n210#1:280\n210#1:281,3\n211#1:284,3\n218#1:287\n218#1:288,2\n*E\n"})
public final class Pager<Key, Value> {

    /* renamed from: i */
    public static final int f70635i = 8;
    @C12579k

    /* renamed from: a */
    public final C12074o0 f70636a;
    @C12579k

    /* renamed from: b */
    public final C28844a<Key, Value> f70637b;
    @C12579k

    /* renamed from: c */
    public final Key f70638c;

    /* renamed from: d */
    public final int f70639d;
    @C12579k

    /* renamed from: e */
    public final C11940j<C36328a<Value>> f70640e;
    @C12579k

    /* renamed from: f */
    public final C11907e<C36328a<Value>> f70641f;
    @C12579k

    /* renamed from: g */
    public final ArrayList<C28838a<Key, Value>> f70642g;

    /* renamed from: h */
    public final int f70643h;

    /* renamed from: com.carrefour.fid.android.shared.paging.Pager$a */
    public static abstract class C28838a<Key, Value> {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.shared.paging.Pager$a$a */
        public static final class C28839a<Key, Value> extends C28838a<Key, Value> {

            /* renamed from: b */
            public static final int f70644b = 8;
            @C12579k

            /* renamed from: a */
            public final Throwable f70645a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C28839a(@C12579k Throwable th) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(th, "error");
                this.f70645a = th;
            }

            /* renamed from: c */
            public static /* synthetic */ C28839a m119286c(C28839a aVar, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = aVar.f70645a;
                }
                return aVar.mo83917b(th);
            }

            @C12579k
            /* renamed from: a */
            public final Throwable mo83916a() {
                return this.f70645a;
            }

            @C12579k
            /* renamed from: b */
            public final C28839a<Key, Value> mo83917b(@C12579k Throwable th) {
                Intrinsics.checkNotNullParameter(th, "error");
                return new C28839a<>(th);
            }

            @C12579k
            /* renamed from: d */
            public final Throwable mo83918d() {
                return this.f70645a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C28839a) && Intrinsics.areEqual((Object) this.f70645a, (Object) ((C28839a) obj).f70645a);
            }

            public int hashCode() {
                return this.f70645a.hashCode();
            }

            @C12579k
            public String toString() {
                Throwable th = this.f70645a;
                return "Error(error=" + th + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.shared.paging.Pager$a$b */
        public static final class C28840b<Key, Value> extends C28838a<Key, Value> {

            /* renamed from: b */
            public static final int f70646b = 8;
            @C12579k

            /* renamed from: a */
            public final C12154u0<C28838a<Key, Value>> f70647a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C28840b(@C12579k C12154u0<? extends C28838a<Key, Value>> u0Var) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(u0Var, "result");
                this.f70647a = u0Var;
            }

            @C12579k
            /* renamed from: a */
            public final C12154u0<C28838a<Key, Value>> mo83922a() {
                return this.f70647a;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.shared.paging.Pager$a$c */
        public static final class C28841c<Key, Value> extends C28838a<Key, Value> {

            /* renamed from: e */
            public static final int f70648e = 8;
            @C12579k

            /* renamed from: a */
            public final List<Value> f70649a;
            @C12580l

            /* renamed from: b */
            public final Key f70650b;
            @C12580l

            /* renamed from: c */
            public final Integer f70651c;
            @C12580l

            /* renamed from: d */
            public final Integer f70652d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C28841c(@C12579k List<? extends Value> list, @C12580l Key key, @C12580l Integer num, @C12580l Integer num2) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(list, "data");
                this.f70649a = list;
                this.f70650b = key;
                this.f70651c = num;
                this.f70652d = num2;
            }

            /* renamed from: f */
            public static /* synthetic */ C28841c m119291f(C28841c cVar, List<Value> list, Key key, Integer num, Integer num2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = cVar.f70649a;
                }
                if ((i & 2) != 0) {
                    key = cVar.f70650b;
                }
                if ((i & 4) != 0) {
                    num = cVar.f70651c;
                }
                if ((i & 8) != 0) {
                    num2 = cVar.f70652d;
                }
                return cVar.mo83927e(list, key, num, num2);
            }

            @C12579k
            /* renamed from: a */
            public final List<Value> mo83923a() {
                return this.f70649a;
            }

            @C12580l
            /* renamed from: b */
            public final Key mo83924b() {
                return this.f70650b;
            }

            @C12580l
            /* renamed from: c */
            public final Integer mo83925c() {
                return this.f70651c;
            }

            @C12580l
            /* renamed from: d */
            public final Integer mo83926d() {
                return this.f70652d;
            }

            @C12579k
            /* renamed from: e */
            public final C28841c<Key, Value> mo83927e(@C12579k List<? extends Value> list, @C12580l Key key, @C12580l Integer num, @C12580l Integer num2) {
                Intrinsics.checkNotNullParameter(list, "data");
                return new C28841c<>(list, key, num, num2);
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C28841c)) {
                    return false;
                }
                C28841c cVar = (C28841c) obj;
                return Intrinsics.areEqual((Object) this.f70649a, (Object) cVar.f70649a) && Intrinsics.areEqual((Object) this.f70650b, (Object) cVar.f70650b) && Intrinsics.areEqual((Object) this.f70651c, (Object) cVar.f70651c) && Intrinsics.areEqual((Object) this.f70652d, (Object) cVar.f70652d);
            }

            @C12579k
            /* renamed from: g */
            public final List<Value> mo83929g() {
                return this.f70649a;
            }

            @C12580l
            /* renamed from: h */
            public final Key mo83930h() {
                return this.f70650b;
            }

            public int hashCode() {
                int hashCode = this.f70649a.hashCode() * 31;
                Key key = this.f70650b;
                int i = 0;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Integer num = this.f70651c;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f70652d;
                if (num2 != null) {
                    i = num2.hashCode();
                }
                return hashCode3 + i;
            }

            @C12580l
            /* renamed from: i */
            public final Integer mo83932i() {
                return this.f70652d;
            }

            @C12580l
            /* renamed from: j */
            public final Integer mo83933j() {
                return this.f70651c;
            }

            @C12579k
            public String toString() {
                List<Value> list = this.f70649a;
                Key key = this.f70650b;
                Integer num = this.f70651c;
                Integer num2 = this.f70652d;
                return "Page(data=" + list + ", nextKey=" + key + ", totalCount=" + num + ", topResultsCategoryId=" + num2 + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.shared.paging.Pager$a$d */
        public static final class C28842d<Key, Value> extends C28838a<Key, Value> {

            /* renamed from: a */
            public static final int f70653a = 0;

            public C28842d() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C28838a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28838a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.shared.paging.Pager$b */
    public static final class C28843b implements C11908f<C36334b> {

        /* renamed from: a */
        public final /* synthetic */ Pager<Key, Value> f70654a;

        public C28843b(Pager<Key, Value> pager) {
            this.f70654a = pager;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C36334b bVar, @C12579k C11045c<? super C11079d2> cVar) {
            if (bVar instanceof C36334b.C36335a) {
                C36334b.C36335a aVar = (C36334b.C36335a) bVar;
                int a = aVar.mo108404a();
                C28851c.m119329b("ElementRequested: " + a);
                Pager<Key, Value> pager = this.f70654a;
                Object i = Pager.m119272i(pager, pager.mo83910o(aVar), false, cVar, 2, (Object) null);
                if (i == C11063b.m42612h()) {
                    return i;
                }
                return C11079d2.f28267a;
            }
            if (!Intrinsics.areEqual((Object) bVar, (Object) C36334b.C36336b.f89755a)) {
                if (Intrinsics.areEqual((Object) bVar, (Object) C36334b.C36337c.f89756a)) {
                    Pager<Key, Value> pager2 = this.f70654a;
                    Object a2 = pager2.mo83904h(pager2.mo83911p(), true, cVar);
                    if (a2 == C11063b.m42612h()) {
                        return a2;
                    }
                    return C11079d2.f28267a;
                } else if (Intrinsics.areEqual((Object) bVar, (Object) C36334b.C36338d.f89757a)) {
                    return C11079d2.f28267a;
                }
            }
            return C11079d2.f28267a;
        }
    }

    public Pager(@C12579k C12074o0 o0Var, @C12579k C28844a<Key, Value> aVar, @C12579k Key key, int i) {
        Intrinsics.checkNotNullParameter(o0Var, "scope");
        Intrinsics.checkNotNullParameter(aVar, "source");
        Intrinsics.checkNotNullParameter(key, "initialKey");
        this.f70636a = o0Var;
        this.f70637b = aVar;
        this.f70638c = key;
        this.f70639d = i;
        C11940j<C36328a<Value>> a = C11953v.m47628a(C36328a.f89745f.mo108402a());
        this.f70640e = a;
        this.f70641f = a;
        this.f70642g = new ArrayList<>();
        this.f70643h = 10;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m119272i(Pager pager, int i, boolean z, C11045c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return pager.mo83904h(i, z, cVar);
    }

    /* renamed from: g */
    public final <E> void mo83903g(ArrayList<E> arrayList, int i, E e) {
        if (CollectionsKt__CollectionsKt.m40443G(arrayList) < i) {
            arrayList.add(i, e);
        } else {
            arrayList.set(i, e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: com.carrefour.fid.android.shared.paging.Pager$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: com.carrefour.fid.android.shared.paging.Pager$a$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0140 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo83904h(int r13, boolean r14, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.carrefour.fid.android.shared.paging.Pager$fetchPageAtIndex$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.carrefour.fid.android.shared.paging.Pager$fetchPageAtIndex$1 r0 = (com.carrefour.fid.android.shared.paging.Pager$fetchPageAtIndex$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.shared.paging.Pager$fetchPageAtIndex$1 r0 = new com.carrefour.fid.android.shared.paging.Pager$fetchPageAtIndex$1
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0048
            if (r2 != r4) goto L_0x0040
            int r13 = r0.I$1
            boolean r14 = r0.Z$0
            int r2 = r0.I$0
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.shared.paging.Pager$a$c r6 = (com.carrefour.fid.android.shared.paging.Pager.C28838a.C28841c) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.shared.paging.Pager r7 = (com.carrefour.fid.android.shared.paging.Pager) r7
            kotlin.C11661u0.m45747n(r15)
        L_0x003a:
            r11 = r7
            r7 = r13
            r13 = r2
            r2 = r11
            goto L_0x0141
        L_0x0040:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0048:
            int r13 = r0.I$1
            boolean r14 = r0.Z$0
            int r2 = r0.I$0
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.shared.paging.Pager$a$c r6 = (com.carrefour.fid.android.shared.paging.Pager.C28838a.C28841c) r6
            java.lang.Object r7 = r0.L$0
            com.carrefour.fid.android.shared.paging.Pager r7 = (com.carrefour.fid.android.shared.paging.Pager) r7
            kotlin.C11661u0.m45747n(r15)
            goto L_0x011f
        L_0x005b:
            kotlin.C11661u0.m45747n(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "fetchPageAtIndex(): "
            r15.append(r2)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            com.carrefour.fid.android.shared.paging.C28851c.m119329b(r15)
            if (r13 >= 0) goto L_0x0077
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x0077:
            java.util.ArrayList<com.carrefour.fid.android.shared.paging.Pager$a<Key, Value>> r15 = r12.f70642g
            java.lang.Object r15 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r15, r13)
            boolean r15 = r15 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28841c
            if (r15 == 0) goto L_0x0084
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x0084:
            r15 = 0
            r2 = r12
            r6 = r3
        L_0x0087:
            java.util.ArrayList<com.carrefour.fid.android.shared.paging.Pager$a<Key, Value>> r7 = r2.f70642g
            java.lang.Object r7 = kotlin.collections.CollectionsKt___CollectionsKt.m40559R2(r7, r6)
            com.carrefour.fid.android.shared.paging.Pager$a r7 = (com.carrefour.fid.android.shared.paging.Pager.C28838a) r7
            if (r7 != 0) goto L_0x0096
            com.carrefour.fid.android.shared.paging.Pager$a$d r7 = new com.carrefour.fid.android.shared.paging.Pager$a$d
            r7.<init>()
        L_0x0096:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "fetchPageAtIndex() currentIndex: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ", currentPage: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.carrefour.fid.android.shared.paging.C28851c.m119329b(r8)
            if (r14 == 0) goto L_0x00ba
            boolean r8 = r7 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28839a
            if (r8 == 0) goto L_0x00ba
            r8 = r5
            goto L_0x00bb
        L_0x00ba:
            r8 = r3
        L_0x00bb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "shouldRetry: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.carrefour.fid.android.shared.paging.C28851c.m119329b(r9)
            boolean r9 = r7 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28842d
            if (r9 != 0) goto L_0x00fc
            if (r8 == 0) goto L_0x00d6
            goto L_0x00fc
        L_0x00d6:
            boolean r8 = r7 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28839a
            if (r8 == 0) goto L_0x00dd
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x00dd:
            boolean r8 = r7 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28840b
            if (r8 == 0) goto L_0x00e4
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x00e4:
            boolean r8 = r7 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28841c
            if (r8 == 0) goto L_0x0087
            if (r6 != r13) goto L_0x00ed
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x00ed:
            r15 = r7
            com.carrefour.fid.android.shared.paging.Pager$a$c r15 = (com.carrefour.fid.android.shared.paging.Pager.C28838a.C28841c) r15
            java.lang.Object r7 = r15.mo83930h()
            if (r7 == 0) goto L_0x00f9
            int r6 = r6 + 1
            goto L_0x0087
        L_0x00f9:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x00fc:
            if (r15 == 0) goto L_0x0104
            java.lang.Object r7 = r15.mo83930h()
            if (r7 != 0) goto L_0x0106
        L_0x0104:
            Key r7 = r2.f70638c
        L_0x0106:
            r0.L$0 = r2
            r0.L$1 = r15
            r0.I$0 = r13
            r0.Z$0 = r14
            r0.I$1 = r6
            r0.label = r5
            java.lang.Object r7 = r2.mo83905j(r6, r7, r0)
            if (r7 != r1) goto L_0x0119
            return r1
        L_0x0119:
            r11 = r2
            r2 = r13
            r13 = r6
            r6 = r15
            r15 = r7
            r7 = r11
        L_0x011f:
            kotlinx.coroutines.u0 r15 = (kotlinx.coroutines.C12154u0) r15
            com.carrefour.fid.android.shared.paging.Pager$a$b r8 = new com.carrefour.fid.android.shared.paging.Pager$a$b
            r8.<init>(r15)
            java.util.ArrayList<com.carrefour.fid.android.shared.paging.Pager$a<Key, Value>> r9 = r7.f70642g
            r7.mo83903g(r9, r13, r8)
            r7.mo83913r(r8)
            r0.L$0 = r7
            r0.L$1 = r6
            r0.I$0 = r2
            r0.Z$0 = r14
            r0.I$1 = r13
            r0.label = r4
            java.lang.Object r15 = r15.mo24780v(r0)
            if (r15 != r1) goto L_0x003a
            return r1
        L_0x0141:
            com.carrefour.fid.android.shared.paging.Pager$a r15 = (com.carrefour.fid.android.shared.paging.Pager.C28838a) r15
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "fetchPageAtIndex(): result "
            r8.append(r9)
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            com.carrefour.fid.android.shared.paging.C28851c.m119329b(r8)
            boolean r8 = r15 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28839a
            if (r8 == 0) goto L_0x0166
            java.util.ArrayList<com.carrefour.fid.android.shared.paging.Pager$a<Key, Value>> r13 = r2.f70642g
            r2.mo83903g(r13, r7, r15)
            r2.mo83913r(r15)
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x0166:
            boolean r8 = r15 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28841c
            if (r8 == 0) goto L_0x0193
            java.util.ArrayList<com.carrefour.fid.android.shared.paging.Pager$a<Key, Value>> r6 = r2.f70642g
            r2.mo83903g(r6, r7, r15)
            if (r7 != r13) goto L_0x0177
            r2.mo83913r(r15)
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x0177:
            r6 = r15
            com.carrefour.fid.android.shared.paging.Pager$a$c r6 = (com.carrefour.fid.android.shared.paging.Pager.C28838a.C28841c) r6
            java.lang.Object r8 = r6.mo83930h()
            if (r8 == 0) goto L_0x0190
            int r7 = r7 + 1
            java.util.ArrayList<com.carrefour.fid.android.shared.paging.Pager$a<Key, Value>> r8 = r2.f70642g
            com.carrefour.fid.android.shared.paging.Pager$a$d r9 = new com.carrefour.fid.android.shared.paging.Pager$a$d
            r9.<init>()
            r2.mo83903g(r8, r7, r9)
            r2.mo83913r(r15)
            goto L_0x019a
        L_0x0190:
            kotlin.d2 r13 = kotlin.C11079d2.f28267a
            return r13
        L_0x0193:
            boolean r8 = r15 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28840b
            if (r8 == 0) goto L_0x0198
            goto L_0x019a
        L_0x0198:
            boolean r15 = r15 instanceof com.carrefour.fid.android.shared.paging.Pager.C28838a.C28842d
        L_0x019a:
            r15 = r6
            r6 = r7
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.paging.Pager.mo83904h(int, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: j */
    public final Object mo83905j(int i, Key key, C11045c<? super C12154u0<? extends C28838a<Key, Value>>> cVar) {
        C28851c.m119329b("fetchPageAtKey(): pageIndex: " + i + ", key: " + key);
        return C12038j.m48057b(this.f70636a, (CoroutineContext) null, (CoroutineStart) null, new Pager$fetchPageAtKey$deferredResult$1(this, key, (C11045c<? super Pager$fetchPageAtKey$deferredResult$1>) null), 3, (Object) null);
    }

    /* renamed from: k */
    public final List<C28838a.C28841c<Key, Value>> mo83906k() {
        ArrayList<C28838a<Key, Value>> arrayList = this.f70642g;
        ArrayList<C28838a> arrayList2 = new ArrayList<>();
        for (T next : arrayList) {
            if (!(((C28838a) next) instanceof C28838a.C28841c)) {
                break;
            }
            arrayList2.add(next);
        }
        ArrayList arrayList3 = new ArrayList(C10978t.m41495Y(arrayList2, 10));
        for (C28838a aVar : arrayList2) {
            Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type com.carrefour.fid.android.shared.paging.Pager.InternalPage.Page<Key of com.carrefour.fid.android.shared.paging.Pager.getCurrentInternaList$lambda$4, Value of com.carrefour.fid.android.shared.paging.Pager.getCurrentInternaList$lambda$4>");
            arrayList3.add((C28838a.C28841c) aVar);
        }
        return arrayList3;
    }

    /* renamed from: l */
    public final List<Value> mo83907l() {
        Iterable<C28838a.C28841c> k = mo83906k();
        ArrayList<List> arrayList = new ArrayList<>(C10978t.m41495Y(k, 10));
        for (C28838a.C28841c g : k) {
            arrayList.add(g.mo83929g());
        }
        List<Value> E = CollectionsKt__CollectionsKt.m40441E();
        for (List y4 : arrayList) {
            E = CollectionsKt___CollectionsKt.m40718y4(E, y4);
        }
        return E;
    }

    /* renamed from: m */
    public final C36328a.C36330b mo83908m() {
        ArrayList<C28838a<Key, Value>> arrayList = this.f70642g;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C28838a aVar = (C28838a) next;
            if (!(aVar instanceof C28838a.C28840b) && !(aVar instanceof C28838a.C28842d)) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        if (!arrayList2.isEmpty()) {
            return C36328a.C36330b.C36332b.f89752a;
        }
        return C36328a.C36330b.C36333c.f89753a;
    }

    @C12579k
    /* renamed from: n */
    public final C11907e<C36328a<Value>> mo83909n() {
        return this.f70641f;
    }

    /* renamed from: o */
    public final int mo83910o(C36334b.C36335a aVar) {
        return (aVar.mo108404a() + this.f70639d) / this.f70643h;
    }

    /* renamed from: p */
    public final int mo83911p() {
        int i = 0;
        for (C28838a<Key, Value> aVar : this.f70642g) {
            if (aVar instanceof C28838a.C28839a) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: q */
    public final void mo83912q(Throwable th) {
        Integer num;
        C11940j<C36328a<Value>> jVar = this.f70640e;
        List l = mo83907l();
        C36328a.C36330b.C36331a aVar = new C36328a.C36330b.C36331a(th);
        C28838a.C28841c cVar = (C28838a.C28841c) CollectionsKt___CollectionsKt.m40677q3(mo83906k());
        if (cVar != null) {
            num = cVar.mo83933j();
        } else {
            num = null;
        }
        jVar.mo24198a(new C36328a(l, aVar, num, (Integer) null, (Integer) null));
    }

    /* renamed from: r */
    public final void mo83913r(C28838a<Key, Value> aVar) {
        boolean z;
        if (aVar instanceof C28838a.C28839a) {
            mo83912q(((C28838a.C28839a) aVar).mo83918d());
            return;
        }
        if (aVar instanceof C28838a.C28841c) {
            z = true;
        } else {
            z = aVar instanceof C28838a.C28840b;
        }
        if (z) {
            mo83914s();
        } else {
            boolean z2 = aVar instanceof C28838a.C28842d;
        }
    }

    /* renamed from: s */
    public final void mo83914s() {
        Integer num;
        Integer num2;
        C11940j<C36328a<Value>> jVar = this.f70640e;
        List l = mo83907l();
        C36328a.C36330b m = mo83908m();
        C28838a.C28841c cVar = (C28838a.C28841c) CollectionsKt___CollectionsKt.m40677q3(mo83906k());
        if (cVar != null) {
            num = cVar.mo83933j();
        } else {
            num = null;
        }
        C28838a.C28841c cVar2 = (C28838a.C28841c) CollectionsKt___CollectionsKt.m40479B2(mo83906k());
        if (cVar2 != null) {
            num2 = cVar2.mo83932i();
        } else {
            num2 = null;
        }
        jVar.mo24198a(new C36328a(l, m, num, (Integer) null, num2));
    }

    @C12580l
    /* renamed from: t */
    public final Object mo83915t(@C12579k C11911i<C36334b> iVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object collect = C11909g.m47413V1(C11909g.m47448f1(iVar, new Pager$subscribeToViewEvents$2(iVar, (C11045c<? super Pager$subscribeToViewEvents$2>) null)), new Pager$subscribeToViewEvents$3((C11045c<? super Pager$subscribeToViewEvents$3>) null)).collect(new C28843b(this), cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Pager(C12074o0 o0Var, C28844a aVar, Object obj, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(o0Var, aVar, obj, (i2 & 8) != 0 ? 0 : i);
    }
}
