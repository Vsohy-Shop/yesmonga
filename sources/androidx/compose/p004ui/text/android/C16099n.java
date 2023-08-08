package androidx.compose.p004ui.text.android;

import android.text.Layout;
import androidx.annotation.C0337f0;
import androidx.compose.runtime.internal.C8567o;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16085k
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,377:1\n1#2:378\n1627#3,6:379\n1627#3,6:385\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:379,6\n322#1:385,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.n */
public final class C16099n {

    /* renamed from: g */
    public static final int f40023g = 8;
    @C12579k

    /* renamed from: a */
    public final Layout f40024a;
    @C12579k

    /* renamed from: b */
    public final List<Integer> f40025b;
    @C12579k

    /* renamed from: c */
    public final List<Bidi> f40026c;
    @C12579k

    /* renamed from: d */
    public final boolean[] f40027d;
    @C12580l

    /* renamed from: e */
    public char[] f40028e;

    /* renamed from: f */
    public final int f40029f;

    /* renamed from: androidx.compose.ui.text.android.n$a */
    public static final class C16100a {

        /* renamed from: a */
        public final int f40030a;

        /* renamed from: b */
        public final int f40031b;

        /* renamed from: c */
        public final boolean f40032c;

        public C16100a(int i, int i2, boolean z) {
            this.f40030a = i;
            this.f40031b = i2;
            this.f40032c = z;
        }

        /* renamed from: e */
        public static /* synthetic */ C16100a m72510e(C16100a aVar, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = aVar.f40030a;
            }
            if ((i3 & 2) != 0) {
                i2 = aVar.f40031b;
            }
            if ((i3 & 4) != 0) {
                z = aVar.f40032c;
            }
            return aVar.mo46495d(i, i2, z);
        }

        /* renamed from: a */
        public final int mo46492a() {
            return this.f40030a;
        }

        /* renamed from: b */
        public final int mo46493b() {
            return this.f40031b;
        }

        /* renamed from: c */
        public final boolean mo46494c() {
            return this.f40032c;
        }

        @C12579k
        /* renamed from: d */
        public final C16100a mo46495d(int i, int i2, boolean z) {
            return new C16100a(i, i2, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16100a)) {
                return false;
            }
            C16100a aVar = (C16100a) obj;
            return this.f40030a == aVar.f40030a && this.f40031b == aVar.f40031b && this.f40032c == aVar.f40032c;
        }

        /* renamed from: f */
        public final int mo46497f() {
            return this.f40031b;
        }

        /* renamed from: g */
        public final int mo46498g() {
            return this.f40030a;
        }

        /* renamed from: h */
        public final boolean mo46499h() {
            return this.f40032c;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f40030a) * 31) + Integer.hashCode(this.f40031b)) * 31;
            boolean z = this.f40032c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            return "BidiRun(start=" + this.f40030a + ", end=" + this.f40031b + ", isRtl=" + this.f40032c + ')';
        }
    }

    public C16099n(@C12579k Layout layout) {
        int i;
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f40024a = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            CharSequence text = this.f40024a.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            int indexOf$default = StringsKt__StringsKt.indexOf$default(text, 10, i2, false, 4, (Object) null);
            if (indexOf$default < 0) {
                i = this.f40024a.getText().length();
            } else {
                i = indexOf$default + 1;
            }
            i2 = i;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.f40024a.getText().length());
        this.f40025b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add((Object) null);
        }
        this.f40026c = arrayList2;
        this.f40027d = new boolean[this.f40025b.size()];
        this.f40029f = this.f40025b.size();
    }

    /* renamed from: h */
    public static /* synthetic */ int m72498h(C16099n nVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return nVar.mo46487g(i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r3.getRunCount() == 1) goto L_0x005f;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.text.Bidi mo46481a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f40027d
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x000f
            java.util.List<java.text.Bidi> r0 = r11.f40026c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        L_0x000f:
            r0 = 0
            if (r12 != 0) goto L_0x0014
            r1 = r0
            goto L_0x0022
        L_0x0014:
            java.util.List<java.lang.Integer> r1 = r11.f40025b
            int r2 = r12 + -1
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x0022:
            java.util.List<java.lang.Integer> r2 = r11.f40025b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f40028e
            if (r3 == 0) goto L_0x0037
            int r4 = r3.length
            if (r4 >= r8) goto L_0x0039
        L_0x0037:
            char[] r3 = new char[r8]
        L_0x0039:
            r10 = r3
            android.text.Layout r3 = r11.f40024a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005f
            boolean r9 = r11.mo46490k(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L_0x0060
        L_0x005f:
            r0 = r1
        L_0x0060:
            java.util.List<java.text.Bidi> r3 = r11.f40026c
            r3.set(r12, r0)
            boolean[] r3 = r11.f40027d
            r3[r12] = r2
            if (r0 == 0) goto L_0x0072
            char[] r12 = r11.f40028e
            if (r10 != r12) goto L_0x0071
            r10 = r1
            goto L_0x0072
        L_0x0071:
            r10 = r12
        L_0x0072:
            r11.f40028e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.android.C16099n.mo46481a(int):java.text.Bidi");
    }

    /* renamed from: b */
    public final float mo46482b(int i, boolean z) {
        if (z) {
            return this.f40024a.getPrimaryHorizontal(i);
        }
        return this.f40024a.getSecondaryHorizontal(i);
    }

    /* renamed from: c */
    public final float mo46483c(int i, boolean z, boolean z2) {
        Bidi bidi;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = i;
        boolean z6 = z2;
        if (!z6) {
            return mo46482b(i, z);
        }
        int a = C16097m.m72497a(this.f40024a, i2, z6);
        int lineStart = this.f40024a.getLineStart(a);
        int lineEnd = this.f40024a.getLineEnd(a);
        if (i2 != lineStart && i2 != lineEnd) {
            return mo46482b(i, z);
        }
        if (i2 == 0 || i2 == this.f40024a.getText().length()) {
            return mo46482b(i, z);
        }
        int g = mo46487g(i2, z6);
        boolean k = mo46490k(g);
        int l = mo46491l(lineEnd);
        int i3 = mo46488i(g);
        int i4 = lineStart - i3;
        int i5 = l - i3;
        Bidi a2 = mo46481a(g);
        if (a2 != null) {
            bidi = a2.createLineBidi(i4, i5);
        } else {
            bidi = null;
        }
        boolean z7 = false;
        if (bidi == null || bidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.f40024a.isRtlCharAt(lineStart);
            if (z || k == isRtlCharAt) {
                if (!k) {
                    k = true;
                } else {
                    k = false;
                }
            }
            if (i2 == lineStart) {
                z7 = k;
            } else if (!k) {
                z7 = true;
            }
            Layout layout = this.f40024a;
            if (z7) {
                return layout.getLineLeft(a);
            }
            return layout.getLineRight(a);
        }
        int runCount = bidi.getRunCount();
        C16100a[] aVarArr = new C16100a[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            int runStart = bidi.getRunStart(i6) + lineStart;
            int runLimit = bidi.getRunLimit(i6) + lineStart;
            if (bidi.getRunLevel(i6) % 2 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            aVarArr[i6] = new C16100a(runStart, runLimit, z5);
        }
        int runCount2 = bidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i8 = -1;
        if (i2 == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    break;
                }
                if (aVarArr[i9].mo46498g() == i2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i8 = i9;
                    break;
                }
                i9++;
            }
            C16100a aVar = aVarArr[i8];
            if (z || k == aVar.mo46499h()) {
                if (!k) {
                    k = true;
                } else {
                    k = false;
                }
            }
            if (i8 == 0 && k) {
                return this.f40024a.getLineLeft(a);
            }
            if (i8 == ArraysKt___ArraysKt.m39523Xe(aVarArr) && !k) {
                return this.f40024a.getLineRight(a);
            }
            if (k) {
                return this.f40024a.getPrimaryHorizontal(aVarArr[i8 - 1].mo46498g());
            }
            return this.f40024a.getPrimaryHorizontal(aVarArr[i8 + 1].mo46498g());
        }
        if (i2 > l) {
            i2 = mo46491l(i);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                break;
            }
            if (aVarArr[i10].mo46497f() == i2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i8 = i10;
                break;
            }
            i10++;
        }
        C16100a aVar2 = aVarArr[i8];
        if (!z && k != aVar2.mo46499h()) {
            k = !k;
        }
        if (i8 == 0 && k) {
            return this.f40024a.getLineLeft(a);
        }
        if (i8 == ArraysKt___ArraysKt.m39523Xe(aVarArr) && !k) {
            return this.f40024a.getLineRight(a);
        }
        if (k) {
            return this.f40024a.getPrimaryHorizontal(aVarArr[i8 - 1].mo46497f());
        }
        return this.f40024a.getPrimaryHorizontal(aVarArr[i8 + 1].mo46497f());
    }

    @C12579k
    /* renamed from: d */
    public final Layout mo46484d() {
        return this.f40024a;
    }

    /* renamed from: e */
    public final int mo46485e() {
        return this.f40029f;
    }

    /* renamed from: f */
    public final int mo46486f(@C0337f0(from = 0) int i) {
        return this.f40025b.get(i).intValue();
    }

    /* renamed from: g */
    public final int mo46487g(@C0337f0(from = 0) int i, boolean z) {
        int i2;
        int x = CollectionsKt__CollectionsKt.m40469x(this.f40025b, Integer.valueOf(i), 0, 0, 6, (Object) null);
        if (x < 0) {
            i2 = -(x + 1);
        } else {
            i2 = x + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.f40025b.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* renamed from: i */
    public final int mo46488i(@C0337f0(from = 0) int i) {
        if (i == 0) {
            return 0;
        }
        return this.f40025b.get(i - 1).intValue();
    }

    /* renamed from: j */
    public final boolean mo46489j(char c) {
        if (c == ' ' || c == 10 || c == 5760) {
            return true;
        }
        return ((8192 <= c && c < 8203) && c != 8199) || c == 8287 || c == 12288;
    }

    /* renamed from: k */
    public final boolean mo46490k(@C0337f0(from = 0) int i) {
        if (this.f40024a.getParagraphDirection(this.f40024a.getLineForOffset(mo46488i(i))) == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final int mo46491l(int i) {
        while (i > 0 && mo46489j(this.f40024a.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }
}
