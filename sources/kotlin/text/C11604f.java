package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.text.f */
public final class C11604f implements C11559m<C11466l> {
    @C12579k

    /* renamed from: a */
    public final CharSequence f28877a;

    /* renamed from: b */
    public final int f28878b;

    /* renamed from: c */
    public final int f28879c;
    @C12579k

    /* renamed from: d */
    public final C11304p<CharSequence, Integer, Pair<Integer, Integer>> f28880d;

    /* renamed from: kotlin.text.f$a */
    public static final class C11605a implements Iterator<C11466l>, C11345a {

        /* renamed from: a */
        public int f28881a = -1;

        /* renamed from: b */
        public int f28882b;

        /* renamed from: c */
        public int f28883c;
        @C12580l

        /* renamed from: d */
        public C11466l f28884d;

        /* renamed from: e */
        public int f28885e;

        /* renamed from: f */
        public final /* synthetic */ C11604f f28886f;

        public C11605a(C11604f fVar) {
            this.f28886f = fVar;
            int I = C11479u.m44334I(fVar.f28878b, 0, fVar.f28877a.length());
            this.f28882b = I;
            this.f28883c = I;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < kotlin.text.C11604f.m45215e(r6.f28886f)) goto L_0x0023;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo23374b() {
            /*
                r6 = this;
                int r0 = r6.f28883c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f28881a = r1
                r0 = 0
                r6.f28884d = r0
                goto L_0x009e
            L_0x000c:
                kotlin.text.f r0 = r6.f28886f
                int r0 = r0.f28879c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f28885e
                int r0 = r0 + r3
                r6.f28885e = r0
                kotlin.text.f r4 = r6.f28886f
                int r4 = r4.f28879c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f28883c
                kotlin.text.f r4 = r6.f28886f
                java.lang.CharSequence r4 = r4.f28877a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.f28882b
                kotlin.text.f r4 = r6.f28886f
                java.lang.CharSequence r4 = r4.f28877a
                int r4 = kotlin.text.StringsKt__StringsKt.getLastIndex(r4)
                r0.<init>(r1, r4)
                r6.f28884d = r0
                r6.f28883c = r2
                goto L_0x009c
            L_0x0047:
                kotlin.text.f r0 = r6.f28886f
                kotlin.jvm.functions.p r0 = r0.f28880d
                kotlin.text.f r4 = r6.f28886f
                java.lang.CharSequence r4 = r4.f28877a
                int r5 = r6.f28883c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x0077
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.f28882b
                kotlin.text.f r4 = r6.f28886f
                java.lang.CharSequence r4 = r4.f28877a
                int r4 = kotlin.text.StringsKt__StringsKt.getLastIndex(r4)
                r0.<init>(r1, r4)
                r6.f28884d = r0
                r6.f28883c = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.mo21846a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo21847b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f28882b
                kotlin.ranges.l r4 = kotlin.ranges.C11479u.m44378W1(r4, r2)
                r6.f28884d = r4
                int r2 = r2 + r0
                r6.f28882b = r2
                if (r0 != 0) goto L_0x0099
                r1 = r3
            L_0x0099:
                int r2 = r2 + r1
                r6.f28883c = r2
            L_0x009c:
                r6.f28881a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C11604f.C11605a.mo23374b():void");
        }

        /* renamed from: c */
        public final int mo23375c() {
            return this.f28885e;
        }

        /* renamed from: d */
        public final int mo23376d() {
            return this.f28882b;
        }

        @C12580l
        /* renamed from: e */
        public final C11466l mo23377e() {
            return this.f28884d;
        }

        /* renamed from: f */
        public final int mo23378f() {
            return this.f28883c;
        }

        /* renamed from: h */
        public final int mo23379h() {
            return this.f28881a;
        }

        public boolean hasNext() {
            if (this.f28881a == -1) {
                mo23374b();
            }
            if (this.f28881a == 1) {
                return true;
            }
            return false;
        }

        @C12579k
        /* renamed from: j */
        public C11466l next() {
            if (this.f28881a == -1) {
                mo23374b();
            }
            if (this.f28881a != 0) {
                C11466l lVar = this.f28884d;
                Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f28884d = null;
                this.f28881a = -1;
                return lVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: l */
        public final void mo23382l(int i) {
            this.f28885e = i;
        }

        /* renamed from: m */
        public final void mo23383m(int i) {
            this.f28882b = i;
        }

        /* renamed from: n */
        public final void mo23384n(@C12580l C11466l lVar) {
            this.f28884d = lVar;
        }

        /* renamed from: o */
        public final void mo23386o(int i) {
            this.f28883c = i;
        }

        /* renamed from: p */
        public final void mo23387p(int i) {
            this.f28881a = i;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C11604f(@C12579k CharSequence charSequence, int i, int i2, @C12579k C11304p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        Intrinsics.checkNotNullParameter(charSequence, "input");
        Intrinsics.checkNotNullParameter(pVar, "getNextMatch");
        this.f28877a = charSequence;
        this.f28878b = i;
        this.f28879c = i2;
        this.f28880d = pVar;
    }

    @C12579k
    public Iterator<C11466l> iterator() {
        return new C11605a(this);
    }
}
